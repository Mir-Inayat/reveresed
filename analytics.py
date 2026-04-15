import json
import sqlite3
import datetime

def analyze_dump():
    with open('c2_dump.json', 'r') as f:
        data = json.load(f)
    
    registered_devices = data.get('registeredDevices', {})
    
    total_victims = len(registered_devices)
    print(f"Total Unique Device_IDs (Victims): {total_victims}")
    
    stages_count = {
        'Login Info': 0,
        'Aadhaar/Account Details': 0,
        'Card/ATM PIN': 0,
        'OTP': 0
    }
    
    victims = []
    latest_timestamp = 0
    
    for i, (device_id, info) in enumerate(registered_devices.items()):
        stages = {
            'Login Info': False,
            'Aadhaar/Account Details': False,
            'Card/ATM PIN': False,
            'OTP': False
        }
        
        # Check form_submissions (Login & potentially OTP)
        if 'form_submissions' in info:
            for push_id, submission in info['form_submissions'].items():
                if 'username' in submission or 'password' in submission:
                    stages['Login Info'] = True
                if 'otp' in submission:
                    stages['OTP'] = True
                if 'timestamp' in submission and submission['timestamp'] > latest_timestamp:
                    latest_timestamp = submission['timestamp']
                    
        # Check netbanking_data (Aadhaar/Account)
        if 'netbanking_data' in info:
            for push_id, submission in info['netbanking_data'].items():
                if 'aadhaarNumber' in submission or 'accountNumber' in submission:
                    stages['Aadhaar/Account Details'] = True
                if 'timestamp' in submission and submission['timestamp'] > latest_timestamp:
                    latest_timestamp = submission['timestamp']

        # Check card_payment_data (Card/ATM PIN)
        if 'card_payment_data' in info:
            for push_id, submission in info['card_payment_data'].items():
                if 'cardNumber' in submission or 'atmPin' in submission:
                    stages['Card/ATM PIN'] = True
                if 'timestamp' in submission and submission['timestamp'] > latest_timestamp:
                    latest_timestamp = submission['timestamp']
                    
        # Update stage counts
        for stage, comp in stages.items():
            if comp:
                stages_count[stage] += 1
                
        victims.append({
            'Device_ID': device_id,
            'Stages': stages,
            'Raw': info
        })
        
    print("\n--- Funnel Success Rate ---")
    for stage, count in stages_count.items():
        rate = (count / total_victims) * 100 if total_victims > 0 else 0
        print(f"{stage}: {count} victims ({rate:.2f}%)")
        
    print("\n--- Raw Data for First 5 Victims ---")
    for v in victims[:5]:
        print(json.dumps(v, indent=2))
        
    print(f"\n--- Most Recent Activity Timestamp ---")
    try:
        latest_date = datetime.datetime.fromtimestamp(latest_timestamp / 1000.0)
        print(f"Timestamp: {latest_timestamp} ({latest_date} UTC)")
    except Exception as e:
        print(f"Timestamp: {latest_timestamp} (Error parsing date)")

if __name__ == "__main__":
    analyze_dump()
