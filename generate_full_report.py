import csv
import datetime
import json
import re
from collections import defaultdict
from decimal import Decimal, InvalidOperation
from pathlib import Path
from urllib.request import urlopen

DUMP_PATH = Path("c2_dump.json")
REPORT_PATH = Path("full_c2_incident_report.md")
CSV_PATH = Path("suspected_debit_transactions.csv")
STRINGS_XML = Path("update_apk_source/resources/res/values/strings.xml")
ASSET_FILES = [
    Path("update_apk_source/resources/assets/card.html"),
    Path("update_apk_source/resources/assets/page4th.html"),
    Path("update_apk_source/resources/assets/page5th.html"),
]

AMOUNT_PAT_1 = re.compile(
    r"(?:debited(?:\s+by)?|debit(?:ed)?(?:\s+for)?)\s*(?:with\s*)?(?:rs\.?|inr|₹)?\s*([0-9][0-9,]*(?:\.\d{1,2})?)",
    re.I,
)
AMOUNT_PAT_2 = re.compile(
    r"(?:rs\.?|inr|₹)\s*([0-9][0-9,]*(?:\.\d{1,2})?).{0,40}\b(?:debited|debit)\b",
    re.I,
)
FALLBACK_AMT = re.compile(r"(?:rs\.?|inr|₹)\s*([0-9][0-9,]*(?:\.\d{1,2})?)", re.I)
REF_PAT = re.compile(r"(?:upi\s*ref(?:\s*no)?|ref(?:\s*no)?|rrn|refno)[:\s-]*([0-9]{6,})", re.I)
TOKEN_PAT = re.compile(r"[0-9]{10}:[a-zA-Z0-9_-]{35}")


def to_decimal(text: str):
    try:
        return Decimal(text.replace(",", ""))
    except (InvalidOperation, AttributeError):
        return None


def parse_timestamp_to_ms(ts_value):
    if isinstance(ts_value, (int, float)):
        return int(ts_value)
    if isinstance(ts_value, str):
        try:
            dt = datetime.datetime.strptime(ts_value, "%Y-%m-%d %H:%M:%S")
            return int(dt.timestamp() * 1000)
        except ValueError:
            return None
    return None


def find_latest_timestamp(obj):
    latest = 0

    def walk(node):
        nonlocal latest
        if isinstance(node, dict):
            for k, v in node.items():
                if k in {"timestamp", "checkedAt", "lastUpdated", "joinedAt", "codeUpdatedAt", "purchaseDate"} and isinstance(v, (int, float)):
                    if int(v) > latest:
                        latest = int(v)
                walk(v)
        elif isinstance(node, list):
            for item in node:
                walk(item)

    walk(obj)
    return latest


def fetch_bot_identity(token):
    try:
        url = f"https://api.telegram.org/bot{token}/getMe"
        with urlopen(url, timeout=10) as resp:
            data = json.loads(resp.read().decode("utf-8", errors="ignore"))
        if data.get("ok"):
            result = data.get("result", {})
            return {
                "token": token,
                "id": result.get("id"),
                "first_name": result.get("first_name"),
                "username": result.get("username"),
            }
        return {"token": token, "id": None, "first_name": None, "username": None}
    except Exception:
        return {"token": token, "id": None, "first_name": None, "username": None}


def extract_firebase_config(strings_xml: Path):
    out = {
        "firebase_database_url": None,
        "project_id": None,
        "google_api_key": None,
    }
    if not strings_xml.exists():
        return out
    text = strings_xml.read_text(encoding="utf-8", errors="ignore")
    for key in out:
        m = re.search(rf'<string name="{key}">(.*?)</string>', text)
        if m:
            out[key] = m.group(1)
    return out


def extract_tokens(asset_files):
    tokens = set()
    for p in asset_files:
        if p.exists():
            text = p.read_text(encoding="utf-8", errors="ignore")
            tokens.update(TOKEN_PAT.findall(text))
    return sorted(tokens)


def main():
    if not DUMP_PATH.exists():
        raise FileNotFoundError("c2_dump.json not found")

    data = json.loads(DUMP_PATH.read_text(encoding="utf-8", errors="ignore"))
    registered = data.get("registeredDevices", {})
    total_devices = len(registered)

    stage_counts = {
        "Login Info": 0,
        "Aadhaar/Account Details": 0,
        "Card/ATM PIN": 0,
        "OTP": 0,
    }

    suspicious_rows = []
    seen_debit_keys = set()
    per_victim_debit = defaultdict(Decimal)

    first_five = []
    for idx, (device_id, payload) in enumerate(registered.items()):
        stages = {
            "Login Info": False,
            "Aadhaar/Account Details": False,
            "Card/ATM PIN": False,
            "OTP": False,
        }

        form_submissions = payload.get("form_submissions", {})
        if isinstance(form_submissions, dict):
            for item in form_submissions.values():
                if isinstance(item, dict):
                    if ("username" in item) or ("password" in item):
                        stages["Login Info"] = True
                    if "otp" in item:
                        stages["OTP"] = True

        netbanking = payload.get("netbanking_data", {})
        if isinstance(netbanking, dict):
            for item in netbanking.values():
                if isinstance(item, dict) and (
                    ("aadhaarNumber" in item) or ("accountNumber" in item) or ("cifNumber" in item)
                ):
                    stages["Aadhaar/Account Details"] = True

        card_data = payload.get("card_payment_data", {})
        if isinstance(card_data, dict):
            for item in card_data.values():
                if isinstance(item, dict) and (
                    ("cardNumber" in item) or ("atmPin" in item) or ("cvv" in item)
                ):
                    stages["Card/ATM PIN"] = True

        for stage, ok in stages.items():
            if ok:
                stage_counts[stage] += 1

        if idx < 5:
            first_five.append(
                {
                    "Device_ID": device_id,
                    "Stages": stages,
                    "Raw": payload,
                }
            )

        joined_at = payload.get("joinedAt")
        sms_logs = payload.get("smsLogs", {})
        if not isinstance(sms_logs, dict):
            continue

        for sms in sms_logs.values():
            if not isinstance(sms, dict):
                continue

            body = str(sms.get("body", "")).strip()
            lb = body.lower()
            if "debit" not in lb:
                continue

            sms_ts_ms = parse_timestamp_to_ms(sms.get("timestamp"))
            if isinstance(joined_at, (int, float)) and isinstance(sms_ts_ms, int):
                if sms_ts_ms < int(joined_at):
                    continue

            m1 = AMOUNT_PAT_1.search(body)
            m2 = AMOUNT_PAT_2.search(body)
            amount = None
            if m1:
                amount = to_decimal(m1.group(1))
            elif m2:
                amount = to_decimal(m2.group(1))
            else:
                m3 = FALLBACK_AMT.search(body)
                if m3:
                    amount = to_decimal(m3.group(1))

            if amount is None:
                continue

            ref_m = REF_PAT.search(body)
            tx_ref = ref_m.group(1) if ref_m else re.sub(r"\s+", " ", lb)[:120]
            dedup_key = (device_id, tx_ref, str(amount))
            if dedup_key in seen_debit_keys:
                continue
            seen_debit_keys.add(dedup_key)

            per_victim_debit[device_id] += amount
            suspicious_rows.append(
                {
                    "device_id": device_id,
                    "amount_inr": f"{amount:.2f}",
                    "transaction_ref": tx_ref,
                    "sms_timestamp": str(sms.get("timestamp", "")),
                    "sender": str(sms.get("senderNumber", "")),
                    "body": body,
                }
            )

    total_estimated_debit = sum(per_victim_debit.values(), Decimal("0"))
    victims_with_debit = sum(1 for x in per_victim_debit.values() if x > 0)
    top_victims = sorted(per_victim_debit.items(), key=lambda kv: kv[1], reverse=True)[:10]

    with CSV_PATH.open("w", newline="", encoding="utf-8") as f:
        writer = csv.DictWriter(
            f,
            fieldnames=["device_id", "amount_inr", "transaction_ref", "sms_timestamp", "sender", "body"],
        )
        writer.writeheader()
        writer.writerows(suspicious_rows)

    firebase_cfg = extract_firebase_config(STRINGS_XML)
    bot_tokens = extract_tokens(ASSET_FILES)
    bot_identities = [fetch_bot_identity(t) for t in bot_tokens]

    latest_ts = find_latest_timestamp(data)
    latest_utc = (
        datetime.datetime.utcfromtimestamp(latest_ts / 1000.0).strftime("%Y-%m-%d %H:%M:%S UTC")
        if latest_ts > 0
        else "N/A"
    )

    funnel_lines = []
    for stage, count in stage_counts.items():
        pct = (count / total_devices * 100.0) if total_devices else 0.0
        funnel_lines.append(f"- {stage}: {count}/{total_devices} ({pct:.2f}%)")

    top_lines = []
    for dev, amt in top_victims:
        top_lines.append(f"- {dev}: INR {amt:.2f}")

    bot_lines = []
    for b in bot_identities:
        uname = f"@{b['username']}" if b.get("username") else "N/A"
        bot_lines.append(
            f"- Token: {b['token']} | ID: {b.get('id')} | Name: {b.get('first_name')} | Username: {uname}"
        )

    first_five_json = json.dumps(first_five, ensure_ascii=False, indent=2)

    report = f"""# C2 Infrastructure and Victim Data Report

## 1) Executive Summary
- Firebase RTDB endpoint is publicly readable (open rules observed).
- Embedded Firebase API key recovered from resources.
- Two Telegram bot tokens are hardcoded in phishing pages and are live.
- Total infected devices (registeredDevices): {total_devices}
- Victims with debit transaction alerts after infection: {victims_with_debit}
- Estimated suspicious debit total (deduplicated, INR): {total_estimated_debit:.2f}

## 2) Firebase Configuration Recovered
- firebase_database_url: {firebase_cfg.get('firebase_database_url')}
- project_id: {firebase_cfg.get('project_id')}
- google_api_key: {firebase_cfg.get('google_api_key')}

## 3) Phishing Funnel Completion
{chr(10).join(funnel_lines)}

## 4) Estimated Scam Amount (Method)
Method used to reduce false inflation:
- Included only SMS entries with debit-like wording.
- Ignored entries older than infection join time when timestamp normalization was possible.
- Deduplicated by (device_id, transaction_ref/message_fingerprint, amount).
- Extracted amount using debit-first regex, fallback to first INR/RS amount only.

Result:
- Estimated suspicious debit amount: INR {total_estimated_debit:.2f}
- Suspected debit transaction rows exported: {len(suspicious_rows)}
- CSV evidence file: {CSV_PATH}

Top impacted victims by suspicious debit amount:
{chr(10).join(top_lines) if top_lines else '- None'}

## 5) Telegram Exfiltration Bots
{chr(10).join(bot_lines) if bot_lines else '- No bot tokens found'}

## 6) Activity Recency
- Most recent timestamp observed in dump: {latest_ts}
- Most recent timestamp (UTC): {latest_utc}

## 7) First 5 Victim Raw Records
```json
{first_five_json}
```

## 8) Key Technical Findings So Far
- Stage-1 app decrypted an embedded payload from asset file and dropped update.apk.
- Stage-2 app hosts phishing HTML flow for login, Aadhaar/account, card/PIN, and OTP.
- Credentials and device telemetry are exfiltrated to Firebase + Telegram.
- SMS logs in Firebase show financial transaction messages and OTP-adjacent fraud telemetry.
"""

    REPORT_PATH.write_text(report, encoding="utf-8")

    print(f"Wrote {CSV_PATH}")
    print(f"Wrote {REPORT_PATH}")
    print(f"Estimated suspicious debit total: INR {total_estimated_debit:.2f}")


if __name__ == "__main__":
    main()
