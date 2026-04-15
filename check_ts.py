import json
import datetime

with open('c2_dump.json', 'r') as f:
    data = json.load(f)

latest_ts = 0

def extract_timestamps(obj):
    global latest_ts
    if isinstance(obj, dict):
        for k, v in obj.items():
            if k == 'timestamp' and isinstance(v, (int, float)):
                if v > latest_ts:
                    latest_ts = v
            elif k == 'checkedAt' and isinstance(v, (int, float)):
                if v > latest_ts:
                    latest_ts = v
            elif k == 'lastUpdated' and isinstance(v, (int, float)):
                if v > latest_ts:
                    latest_ts = v
            elif k == 'joinedAt' and isinstance(v, (int, float)):
                if v > latest_ts:
                    latest_ts = v
            else:
                extract_timestamps(v)
    elif isinstance(obj, list):
        for item in obj:
            extract_timestamps(item)

extract_timestamps(data)
if latest_ts > 10000000000: # assuming it's in ms
    print(f"Latest timestamp (ms): {latest_ts} - {datetime.datetime.fromtimestamp(latest_ts/1000.0)}")
else:
    print(f"Latest timestamp (s): {latest_ts} - {datetime.datetime.fromtimestamp(latest_ts)}")

