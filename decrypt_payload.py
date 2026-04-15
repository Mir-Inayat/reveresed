#!/usr/bin/env python3
from __future__ import annotations

import argparse
from pathlib import Path


def derive_key() -> bytes:
    base = "com.android.mrobot"
    key = bytearray(32)
    for i in range(32):
        key[i] = ((ord(base[i % len(base)]) ^ ord("Z") ^ (i * 7)) & 0xFF)
    return bytes(key)


def xor_with_key(data: bytes, key: bytes) -> bytes:
    return bytes(data[i] ^ key[i % len(key)] for i in range(len(data)))


def fallback_xor(data: bytes) -> bytes:
    base = "com.android.mrobot"
    return bytes(ord(base[i % len(base)]) ^ data[i] for i in range(len(data)))


def looks_like_zip(data: bytes) -> bool:
    if len(data) <= 4 or data[0] != 0x50 or data[1] != 0x4B:
        return False
    start = max(0, len(data) - 65536)
    for idx in range(len(data) - 22, start - 1, -1):
        probe = idx + 3
        if probe < len(data) and data[idx] == 0x50 and data[idx + 1] == 0x4B and data[idx + 2] == 0x05 and data[probe] == 0x06:
            return True
    return False


def decrypt_asset(asset_path: Path) -> bytes:
    raw = asset_path.read_bytes()
    candidate = xor_with_key(raw, derive_key())
    if looks_like_zip(candidate):
        return candidate

    candidate = fallback_xor(raw)
    if looks_like_zip(candidate):
        return candidate

    if looks_like_zip(raw):
        return raw

    raise RuntimeError("Unable to decrypt asset into a valid APK/ZIP")


def main() -> None:
    parser = argparse.ArgumentParser(description="Decrypt ṩỹṧ꙱ṫḗṃ.tmp into update.apk")
    parser.add_argument("asset", type=Path, help="Path to ṩỹṧ꙱ṫḗṃ.tmp")
    parser.add_argument("-o", "--output", type=Path, default=Path("update.apk"), help="Output APK path")
    args = parser.parse_args()

    apk_bytes = decrypt_asset(args.asset)
    args.output.write_bytes(apk_bytes)
    print(f"Wrote {args.output} ({len(apk_bytes)} bytes)")


if __name__ == "__main__":
    main()