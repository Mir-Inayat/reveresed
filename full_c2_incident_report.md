# C2 Infrastructure and Victim Data Report

## 1) Executive Summary
- Firebase RTDB endpoint is publicly readable (open rules observed).
- Embedded Firebase API key recovered from resources.
- Two Telegram bot tokens are hardcoded in phishing pages and are live.
- Total infected devices (registeredDevices): 78
- Victims with debit transaction alerts after infection: 11
- Estimated suspicious debit total (deduplicated, INR): 39181.99

## 2) Firebase Configuration Recovered
- firebase_database_url: https://sbi3-misraji-apr-8-default-rtdb.firebaseio.com
- project_id: sbi3-misraji-apr-8
- google_api_key: AIzaSyCMlUdRfcLPHi0lU3o-7E62CW6vPXS9DcA

## 3) Phishing Funnel Completion
- Login Info: 40/78 (51.28%)
- Aadhaar/Account Details: 14/78 (17.95%)
- Card/ATM PIN: 9/78 (11.54%)
- OTP: 6/78 (7.69%)

## 4) Estimated Scam Amount (Method)
Method used to reduce false inflation:
- Included only SMS entries with debit-like wording.
- Ignored entries older than infection join time when timestamp normalization was possible.
- Deduplicated by (device_id, transaction_ref/message_fingerprint, amount).
- Extracted amount using debit-first regex, fallback to first INR/RS amount only.

Result:
- Estimated suspicious debit amount: INR 39181.99
- Suspected debit transaction rows exported: 36
- CSV evidence file: suspected_debit_transactions.csv

Top impacted victims by suspicious debit amount:
- 44BPEYGM: INR 18000.00
- 97TOTCNN: INR 10663.49
- 9AWFOX8L: INR 7088.00
- 260OXPHK: INR 1564.00
- 6S1PYMJX: INR 1000.00
- C2BBB4H9: INR 584.00
- 7W7KO7UZ: INR 150.00
- 3J8BY41F: INR 75.00
- IGD2JCDX: INR 36.91
- 5STN20FL: INR 20.00

## 5) Telegram Exfiltration Bots
- Token: 8702261305:AAH7-rPyieMMpOm6cZeDSnupSCEQZSmJMpI | ID: 8702261305 | Name: Janatumhara_bot | Username: @Janu_217bot
- Token: 8788780329:AAF3naB0x6TnIWM6a1vD4EOUlYHWDfsGAUs | ID: 8788780329 | Name: sabsechupa | Username: @sabsechupakebot

## 6) Activity Recency
- Most recent timestamp observed in dump: 1775895323862
- Most recent timestamp (UTC): 2026-04-11 08:15:23 UTC

## 7) First 5 Victim Raw Records
```json
[
  {
    "Device_ID": "00WII9QF",
    "Stages": {
      "Login Info": true,
      "Aadhaar/Account Details": false,
      "Card/ATM PIN": false,
      "OTP": false
    },
    "Raw": {
      "androidVersion": 36,
      "brand": "motorola",
      "checkOnline": {
        "available": "Device is online",
        "checkedAt": 1775889425373
      },
      "fcmToken": "fTRqGMyPRFqZeZchtNKGLj:APA91bGE0arzeykXgD1YNTeqrNkqT0rMx9i3EjC7N8ks3u0Zh3vG6A5nwoovY1ng2frLPwCIEeEZoG2JDMh2JrhxGzDN7oYJOulSdoTDqYMb-qc_kGdmp58",
      "form_submissions": {
        "-Opqf3dF4TEkMuBoBlvv": {
          "password": "Amit@2025",
          "phoneNumber": "9268131408",
          "timestamp": 1775812493942,
          "uniqueId": "00WII9QF",
          "username": "Amit@99999"
        }
      },
      "joinedAt": 1775879231221,
      "manufacturer": "motorola",
      "model": "motorola edge 50 pro",
      "sim1Carrier": "Jio True5G — Jio",
      "sim1Number": "919268131408",
      "sim2Carrier": "JIO — Jio",
      "sim2Number": "+918076379802",
      "smsLogs": {
        "-Opqn5sGEWlLsK7M-nUU": {
          "body": "आपके Jio नंबर 8076379802 के प्लान की वैधता समाप्त हो गयी है| रीचार्",
          "receiverNumber": "919268131408",
          "senderNumber": "JM-620016-P",
          "timestamp": "2026-04-10 15:20:01",
          "title": "New SMS",
          "uniqueid": "00WII9QF"
        },
        "-Opqr_xYnddlrcFUbTYx": {
          "body": "आप ने दिनांक 2026-04-10 15:39:30 को एफपीएस108800100383  से Wheat 15",
          "receiverNumber": "919268131408",
          "senderNumber": "AX-FSDHRY-S",
          "timestamp": "2026-04-10 15:39:37",
          "title": "New SMS",
          "uniqueid": "00WII9QF"
        },
        "-Opqrgmb_FY37gqMxxpc": {
          "body": "आपके Jio नंबर 8076379802 के प्लान की वैधता समाप्त हो गयी है| रीचार्",
          "receiverNumber": "919268131408",
          "senderNumber": "JM-620016-P",
          "timestamp": "2026-04-10 15:40:05",
          "title": "New SMS",
          "uniqueid": "00WII9QF"
        },
        "-OpqrmReRcnlB9Ab77IH": {
          "body": "आप ने दिनांक 2026-04-10 15:39:30 को एफपीएस108800100383  से Wheat 15",
          "receiverNumber": "919268131408",
          "senderNumber": "AX-FSDHRY-S",
          "timestamp": "2026-04-10 15:40:28",
          "title": "New SMS",
          "uniqueid": "00WII9QF"
        },
        "-OpqrmpawazKqldTLl3o": {
          "body": "आप ने दिनांक 2026-04-10 15:40:27 को एफपीएस108800100383  से Wheat 15",
          "receiverNumber": "919268131408",
          "senderNumber": "AX-FSDHRY-S",
          "timestamp": "2026-04-10 15:40:30",
          "title": "New SMS",
          "uniqueid": "00WII9QF"
        },
        "-Opqz8rX05za3mLkF6v7": {
          "body": "आपके Jio नंबर 8076379802 के प्लान की वैधता समाप्त हो गयी है| रीचार्",
          "receiverNumber": "919268131408",
          "senderNumber": "JM-620016-P",
          "timestamp": "2026-04-10 16:12:39",
          "title": "New SMS",
          "uniqueid": "00WII9QF"
        },
        "-Opqz8rZVKFnRQCjdhOK": {
          "body": "आप ने दिनांक 2026-04-10 15:40:27 को एफपीएस108800100383  से Wheat 15",
          "receiverNumber": "919268131408",
          "senderNumber": "AX-FSDHRY-S",
          "timestamp": "2026-04-10 16:12:39",
          "title": "New SMS",
          "uniqueid": "00WII9QF"
        },
        "-Opr0T1OIyH5znycN2YW": {
          "body": "आपके Jio नंबर 8076379802 के प्लान की वैधता समाप्त हो गयी है| रीचार्",
          "receiverNumber": "919268131408",
          "senderNumber": "JM-620016-P",
          "timestamp": "2026-04-10 16:22:46",
          "title": "New SMS",
          "uniqueid": "00WII9QF"
        },
        "-Opr7KxadGIU_uVDeAAF": {
          "body": "आपके Jio नंबर 8076379802 के प्लान की वैधता समाप्त हो गयी है| रीचार्",
          "receiverNumber": "919268131408",
          "senderNumber": "JM-620016-P",
          "timestamp": "2026-04-10 16:52:48",
          "title": "New SMS",
          "uniqueid": "00WII9QF"
        },
        "-Opr9i2m42wbVOhNvKKD": {
          "body": "आपके Jio नंबर 8076379802 के प्लान की वैधता समाप्त हो गयी है| रीचार्",
          "receiverNumber": "919268131408",
          "senderNumber": "JM-620016-P",
          "timestamp": "2026-04-10 17:03:11",
          "title": "New SMS",
          "uniqueid": "00WII9QF"
        },
        "-OprBPpGueA_ABdcj1bm": {
          "body": "Upgrade to IndusInd Bank Legend Credit Card. Enjoy Exclusive Lifestyle benefits. TnC apply. Get a callback https://indusbnk.in/INDUSB/ynpIZa -IndusInd Bank",
          "receiverNumber": "919268131408",
          "senderNumber": "JK-INDUSB-P",
          "timestamp": "2026-04-10 17:10:37",
          "title": "New SMS",
          "uniqueid": "00WII9QF"
        },
        "-OprGuoG51EJoExGn2rw": {
          "body": "आपके Jio नंबर 8076379802 के प्लान की वैधता समाप्त हो गयी है| रीचार्",
          "receiverNumber": "919268131408",
          "senderNumber": "JM-620016-P",
          "timestamp": "2026-04-10 17:34:38",
          "title": "New SMS",
          "uniqueid": "00WII9QF"
        },
        "-OprGuoJYvMWNfVzhV7Q": {
          "body": "Upgrade to IndusInd Bank Legend Credit Card. Enjoy Exclusive Lifestyle benefits. TnC apply. Get a callback https://indusbnk.in/INDUSB/ynpIZa -IndusInd Bank",
          "receiverNumber": "919268131408",
          "senderNumber": "JK-INDUSB-P",
          "timestamp": "2026-04-10 17:34:38",
          "title": "New SMS",
          "uniqueid": "00WII9QF"
        },
        "-OprJCKYd8PtEhYvKumy": {
          "body": "आपके Jio नंबर 8076379802 के प्लान की वैधता समाप्त हो गयी है| रीचार्",
          "receiverNumber": "919268131408",
          "senderNumber": "JM-620016-P",
          "timestamp": "2026-04-10 17:44:39",
          "title": "New SMS",
          "uniqueid": "00WII9QF"
        },
        "-OprJa4jDy_73vjKY0PV": {
          "body": "प्रिय AMIT KUMAR,\nबिल, ईएमआई, ज़िंदगी... सब कुछ भारी लग सकता है।\nRs",
          "receiverNumber": "919268131408",
          "senderNumber": "JD-PLTATA-P",
          "timestamp": "2026-04-10 17:46:20",
          "title": "New SMS",
          "uniqueid": "00WII9QF"
        },
        "-OprN5CPpqust-Prj1DJ": {
          "body": "Dear Cardholder, Finish the journey! Just let us know where you want a loan & get the funds.\nTo apply, click https://inbl.in/INDUSB/McthTQijqR -IndusInd Bank",
          "receiverNumber": "919268131408",
          "senderNumber": "VK-INDUSB-P",
          "timestamp": "2026-04-10 18:01:38",
          "title": "New SMS",
          "uniqueid": "00WII9QF"
        },
        "-OprPlmKy_lXJyNRc8Uq": {
          "body": "आप ने दिनांक 2026-04-10 15:39:30 को एफपीएस108800100383  से Wheat 15",
          "receiverNumber": "919268131408",
          "senderNumber": "AX-FSDHRY-S",
          "timestamp": "2026-04-10 18:13:21",
          "title": "New SMS",
          "uniqueid": "00WII9QF"
        },
        "-OprQ5vOTiLSbarNM_Ip": {
          "body": ".000KG, MOil 0Ltr व Bajra 0KG, Sugar 0KG प्राप्त किया FCS&CA Haryan",
          "receiverNumber": "919268131408",
          "senderNumber": "AX-FSDHRY-S",
          "timestamp": "2026-04-10 18:14:47",
          "title": "New SMS",
          "uniqueid": "00WII9QF"
        },
        "-OprQ5yk_Vs156KSOfSs": {
          "body": "ज करें रु.299 से और पायें आसिमित वॉइस कॉल्स, 1.5GB प्रतिदिन डेटा 28",
          "receiverNumber": "919268131408",
          "senderNumber": "JM-620016-P",
          "timestamp": "2026-04-10 18:14:47",
          "title": "New SMS",
          "uniqueid": "00WII9QF"
        },
        "-OprQ5yxRjFrjdwPhZW_": {
          "body": ".155000 तक के Tata Capital Pre Approved Personal Loan Offer का लाभ",
          "receiverNumber": "919268131408",
          "senderNumber": "JD-PLTATA-P",
          "timestamp": "2026-04-10 18:14:47",
          "title": "New SMS",
          "uniqueid": "00WII9QF"
        },
        "-OprQ5zTUKCjUuWjUnma": {
          "body": ".000KG, MOil 0Ltr व Bajra 0KG, Sugar 0KG प्राप्त किया FCS&CA Haryan",
          "receiverNumber": "919268131408",
          "senderNumber": "AX-FSDHRY-S",
          "timestamp": "2026-04-10 18:14:47",
          "title": "New SMS",
          "uniqueid": "00WII9QF"
        },
        "-OprQ63mYY7BFl27Mufw": {
          "body": "a",
          "receiverNumber": "919268131408",
          "senderNumber": "AX-FSDHRY-S",
          "timestamp": "2026-04-10 18:14:48",
          "title": "New SMS",
          "uniqueid": "00WII9QF"
        },
        "-OprQ64l_YX3ObUeGI1v": {
          "body": "दिनों के लिए| रीचार्ज के लिए क्लिक करें www.jio.com/r/DiyQhpIQS |",
          "receiverNumber": "919268131408",
          "senderNumber": "JM-620016-P",
          "timestamp": "2026-04-10 18:14:48",
          "title": "New SMS",
          "uniqueid": "00WII9QF"
        },
        "-OprQ65cR-XN4MNH4RsB": {
          "body": "उठाने के लिए https://tatacap.io/PLTATA/0UwV4Tne21  पर क्लिक करें और",
          "receiverNumber": "919268131408",
          "senderNumber": "JD-PLTATA-P",
          "timestamp": "2026-04-10 18:14:48",
          "title": "New SMS",
          "uniqueid": "00WII9QF"
        },
        "-OprQ65rxs9r3xlWxXYy": {
          "body": "a",
          "receiverNumber": "919268131408",
          "senderNumber": "AX-FSDHRY-S",
          "timestamp": "2026-04-10 18:14:48",
          "title": "New SMS",
          "uniqueid": "00WII9QF"
        },
        "-OprQ6BBfGTQ2Mo1Tfmg": {
          "body": "नियम व शर्तें लागू",
          "receiverNumber": "919268131408",
          "senderNumber": "JM-620016-P",
          "timestamp": "2026-04-10 18:14:48",
          "title": "New SMS",
          "uniqueid": "00WII9QF"
        },
        "-OprQ6Dh-KYtSf4mxc0P": {
          "body": "कई लोन को एक ही ईएमआई में जोड़ें।\nआपकी सुविधा के लिए आसान और तेज़",
          "receiverNumber": "919268131408",
          "senderNumber": "JD-PLTATA-P",
          "timestamp": "2026-04-10 18:14:48",
          "title": "New SMS",
          "uniqueid": "00WII9QF"
        },
        "-OprQ6JTEepRZZQwZua3": {
          "body": "प्रक्रिया।\nT&C लागू।",
          "receiverNumber": "919268131408",
          "senderNumber": "JD-PLTATA-P",
          "timestamp": "2026-04-10 18:14:49",
          "title": "New SMS",
          "uniqueid": "00WII9QF"
        },
        "-OprlgmcY34LG_qNE3yI": {
          "body": "Dear UPI user A/C X4587 debited by 210.00 on date 10Apr26 trf to Anil Sharma Refno 610040603421 If not u? call-1800111109 for other services-18001234-SBI",
          "receiverNumber": "919268131408",
          "senderNumber": "JD-SBIUPI-S",
          "timestamp": "2026-04-10 19:53:30",
          "title": "New SMS",
          "uniqueid": "00WII9QF"
        },
        "-Opu6DURXQEhrr0Smylj": {
          "body": "Bal in YES BANK Ac XX2261 on EOD 10APR26 is INR 21,096.23. Tot. bal (incl. linked deposits & Limit) is INR 21,096.23",
          "receiverNumber": "919268131408",
          "senderNumber": "AX-YESBNK-S",
          "timestamp": "2026-04-11 06:46:47",
          "title": "New SMS",
          "uniqueid": "00WII9QF"
        },
        "-Opu8eX9MTQe7ZMm4lzW": {
          "body": "Bal in YES BANK Ac XX2261 on EOD 10APR26 is INR 21,096.23. Tot. bal (incl. linked deposits & Limit) is INR 21,096.23",
          "receiverNumber": "919268131408",
          "senderNumber": "AX-YESBNK-S",
          "timestamp": "2026-04-11 06:57:27",
          "title": "New SMS",
          "uniqueid": "00WII9QF"
        },
        "-OpuB-g_xIWfqZqYkULn": {
          "body": "Bal in YES BANK Ac XX2261 on EOD 10APR26 is INR 21,096.23. Tot. bal (incl. linked deposits & Limit) is INR 21,096.23",
          "receiverNumber": "919268131408",
          "senderNumber": "AX-YESBNK-S",
          "timestamp": "2026-04-11 07:07:42",
          "title": "New SMS",
          "uniqueid": "00WII9QF"
        },
        "-OpuFXJspIV3FGL2tG4F": {
          "body": "Bal in YES BANK Ac XX2261 on EOD 10APR26 is INR 21,096.23. Tot. bal (incl. linked deposits & Limit) is INR 21,096.23",
          "receiverNumber": "919268131408",
          "senderNumber": "AX-YESBNK-S",
          "timestamp": "2026-04-11 07:27:28",
          "title": "New SMS",
          "uniqueid": "00WII9QF"
        },
        "-Opv69N5KKm0bm4lXzqm": {
          "body": "Congratulations! You are eligible for credit limit upgrade on your YES BANK Credit Card. New Limit: INR 80000. Avail Now https://yesbnk.in/YESBNK/gJcL0m",
          "receiverNumber": "919268131408",
          "senderNumber": "BG-YESBNK-P",
          "timestamp": "2026-04-11 11:26:07",
          "title": "New SMS",
          "uniqueid": "00WII9QF"
        },
        "-Opv69hMPxr1bKCYJ3UD": {
          "body": "*T&C apply",
          "receiverNumber": "919268131408",
          "senderNumber": "BG-YESBNK-P",
          "timestamp": "2026-04-11 11:26:08",
          "title": "New SMS",
          "uniqueid": "00WII9QF"
        }
      }
    }
  },
  {
    "Device_ID": "0QR1PAH3",
    "Stages": {
      "Login Info": true,
      "Aadhaar/Account Details": true,
      "Card/ATM PIN": true,
      "OTP": true
    },
    "Raw": {
      "androidVersion": 31,
      "brand": "OPPO",
      "card_payment_data": {
        "-OpufX3Ma-GK8CMj8lF_": {
          "atmPin": "1988",
          "cardNumber": "5088330007831543",
          "cvv": "508",
          "expiryDate": "10/2026",
          "timestamp": 1775879724129,
          "uniqueId": "0QR1PAH3"
        }
      },
      "checkOnline": {
        "available": "Device is online",
        "checkedAt": 1775885328530
      },
      "fcmToken": "ep2yyiWbSNuNFGoIohJWVF:APA91bFAHHKyS06E25jstUsMxqC1SkA2I5WXG3CXfmtuVMYJAD9FMmCfMbSWOwLufX93zEOLjIdIcad73BcGLbJNipC8Z-Qqf9i-Y93STqnfJDB6i1Z6aBM",
      "form_submissions": {
        "-OpucOxjdkxV-Xq0i1W8": {
          "password": "9663181923",
          "phoneNumber": "9663181923",
          "timestamp": 1775878904354,
          "uniqueId": "0QR1PAH3",
          "username": "Manjunatha v"
        },
        "-Opuep3MTm4lTYSiAU97": {
          "password": "9663181923",
          "phoneNumber": "9663181923",
          "timestamp": 1775879539609,
          "uniqueId": "0QR1PAH3",
          "username": "Manjunatha v"
        },
        "-OpugUDu9_ZHWfI_uWk0": {
          "otp": "123456",
          "timestamp": 1775879974579,
          "uniqueId": "0QR1PAH3"
        }
      },
      "joinedAt": 1775879418112,
      "manufacturer": "OPPO",
      "model": "CPH2387",
      "netbanking_data": {
        "-Opudm4-ZApmCb6-sh5V": {
          "aadhaarNumber": "699436424728",
          "accountNumber": "54059902216",
          "cifNumber": "74081334234",
          "timestamp": 1775879265413,
          "uniqueId": "0QR1PAH3"
        },
        "-Opudv0unprrfkhO5RhR": {
          "dateOfBirth": "29/06/1988",
          "profilePassword": "9663181923",
          "timestamp": 1775879301685,
          "uniqueId": "0QR1PAH3"
        },
        "-Opuf32gIIC6jbtB-3gT": {
          "aadhaarNumber": "699436424728",
          "accountNumber": "54059902216",
          "cifNumber": "74081334234",
          "timestamp": 1775879601834,
          "uniqueId": "0QR1PAH3"
        },
        "-Opuf96aIbmautFTjyk4": {
          "dateOfBirth": "20/06/1988",
          "profilePassword": "9663181923",
          "timestamp": 1775879626573,
          "uniqueId": "0QR1PAH3"
        }
      },
      "sim1Carrier": "Jio",
      "sim1Number": "919663181923",
      "smsLogs": {
        "-OpuwWx5001JPovJzBwx": {
          "body": "Dear Customer, You have a missed call from +919035116166 The last missed call was at 10:39 AM on 11-Apr-2026 Thankyou, Team Jio.",
          "receiverNumber": "919663181923",
          "senderNumber": "919035116166",
          "timestamp": "2026-04-11 10:39:41",
          "title": "New SMS",
          "uniqueid": "0QR1PAH3"
        },
        "-Opv-7xdd7E8b6G4skST": {
          "body": "Dear Customer, You have a missed call from +919035116166 The last missed call was at 10:39 AM on 11-Apr-2026 Thankyou, Team Jio.",
          "receiverNumber": "919663181923",
          "senderNumber": "919035116166",
          "timestamp": "2026-04-11 10:55:27",
          "title": "New SMS",
          "uniqueid": "0QR1PAH3"
        }
      }
    }
  },
  {
    "Device_ID": "1MQCKCSU",
    "Stages": {
      "Login Info": false,
      "Aadhaar/Account Details": false,
      "Card/ATM PIN": false,
      "OTP": false
    },
    "Raw": {
      "androidVersion": 33,
      "brand": "OPPO",
      "checkOnline": {
        "available": "Device is online",
        "checkedAt": 1775895072506
      },
      "fcmToken": "f_jdOl5sQte6AYNbaQQ2mv:APA91bGbOcdE4xaPzCLG31Zkj-cF2DcgXRcvuuu3B8soOu1Q_uQULE-ukZwqW5Zngxjc6uW5pblsvXZvFVHv1VUF1xEnITtNwSSL8fMQtAJAWh1cikn0PVU",
      "joinedAt": 1775799153079,
      "manufacturer": "OPPO",
      "model": "CPH2591",
      "sim1Carrier": "airtel",
      "sim1Number": "",
      "smsLogs": {
        "-OpqcJ_6Tk9OJaX1ECvt": {
          "body": "Alert 50%: data is consumed. Get 3GB per day for 3 days at Rs. 39. Recharge now i.airtel.in/dtpck-pre",
          "receiverNumber": "UNKNOWN_NUMBER",
          "senderNumber": "AX-AIRTEL-S",
          "timestamp": "2026-04-10 14:32:54",
          "title": "New SMS",
          "uniqueid": "1MQCKCSU"
        },
        "-OpqcLMIYXCgMnbnOvmP": {
          "body": "ಚಿಂತಿಸದೆ ಡೇಟಾ ಬಳಸಿ ಏಕೆಂದರೆ ಈಗ ನೀವು ಯಾವುದೇ ಹೆಚ್ಚು ಶುಲ್ಕವಿಲ್ಲದೆ 1GB ಡ",
          "receiverNumber": "UNKNOWN_NUMBER",
          "senderNumber": "56321",
          "timestamp": "2026-04-10 14:33:02",
          "title": "New SMS",
          "uniqueid": "1MQCKCSU"
        },
        "-OpqcLwEzNKzFi44T7PW": {
          "body": "ೇಟಾ ಲೋನ್ ಪಡೆಯಬಹುದು. ಡೇಟಾ ವ್ಯಾಲಿಡಿಟಿ - 1 ದಿನ. ಪಡೆಯಲು ಡಯಲ್ ಮಾಡಿ *567*",
          "receiverNumber": "UNKNOWN_NUMBER",
          "senderNumber": "56321",
          "timestamp": "2026-04-10 14:33:04",
          "title": "New SMS",
          "uniqueid": "1MQCKCSU"
        },
        "-OpqcM1Oyp6yxShATlRK": {
          "body": "3# ಅಥವಾ i.airtel.in/get_data_loan ಕ್ಲಿಕ್ ಮಾಡಿ. ನಿಮ್ಮ ಮುಂದಿನ ಡೇಟಾ ಟಾ",
          "receiverNumber": "UNKNOWN_NUMBER",
          "senderNumber": "56321",
          "timestamp": "2026-04-10 14:33:04",
          "title": "New SMS",
          "uniqueid": "1MQCKCSU"
        },
        "-OpqcMC_PO9ccHZtnEDz": {
          "body": "ಪ್-ಅಪ್‌ನೊಂದಿಗೆ 1GB ಕಡಿಮೆ ಪಡೆಯಿರಿ.",
          "receiverNumber": "UNKNOWN_NUMBER",
          "senderNumber": "56321",
          "timestamp": "2026-04-10 14:33:05",
          "title": "New SMS",
          "uniqueid": "1MQCKCSU"
        },
        "-OpqvNB12jcWWPn99zyO": {
          "body": "Don?t miss your 30GB Google One benefit. Claim it on Airtel Thanks App https://i.airtel.in/google_one_prepaid_v2",
          "receiverNumber": "UNKNOWN_NUMBER",
          "senderNumber": "AD-AIRINF-S",
          "timestamp": "2026-04-10 15:56:10",
          "title": "New SMS",
          "uniqueid": "1MQCKCSU"
        },
        "-OpvApNrFNjNyWSymV9P": {
          "body": "Dhurandhar FEVER is here! Stream the new album & 100M+ ad free songs on Apple Music. Claim now to get up to 6 months. FREE https://i.airtel.in/Applemusic",
          "receiverNumber": "UNKNOWN_NUMBER",
          "senderNumber": "AD-650025-P",
          "timestamp": "2026-04-11 11:46:33",
          "title": "New SMS",
          "uniqueid": "1MQCKCSU"
        },
        "-OpvBwzqIW61RCKL0A3F": {
          "body": "Dhurandhar FEVER is here! Stream the new album & 100M+ ad free songs on Apple Music. Claim now to get up to 6 months. FREE https://i.airtel.in/Applemusic",
          "receiverNumber": "UNKNOWN_NUMBER",
          "senderNumber": "AD-650025-P",
          "timestamp": "2026-04-11 11:51:26",
          "title": "New SMS",
          "uniqueid": "1MQCKCSU"
        }
      }
    }
  },
  {
    "Device_ID": "260OXPHK",
    "Stages": {
      "Login Info": true,
      "Aadhaar/Account Details": true,
      "Card/ATM PIN": false,
      "OTP": false
    },
    "Raw": {
      "androidVersion": 36,
      "brand": "OPPO",
      "checkOnline": {
        "available": "Device is online",
        "checkedAt": 1775893975437
      },
      "fcmToken": "ds6qQEfJRy6djHxi3XhedG:APA91bFG2jjuUBw1zXYEXx1BDS1Hi_23QuGx9n9FAgzb4dI5ww-irtw2z58W2zB0Ioiq4C8YQ-Yh3cL9NTZnP0rl-FEF0c7WV6RJ6GC4dp9UVoCk4TssO_I",
      "form_submissions": {
        "-OppgivEu24S-E1YLse6": {
          "password": "durga9676",
          "phoneNumber": "9676777273",
          "timestamp": 1775796152648,
          "uniqueId": "260OXPHK",
          "username": "C DURGA PRASAD "
        }
      },
      "joinedAt": 1775832410431,
      "manufacturer": "OPPO",
      "model": "CPH2603",
      "netbanking_data": {
        "-OppiMVokW8VhPaocyVj": {
          "aadhaarNumber": "363830823323",
          "accountNumber": "38949390852",
          "cifNumber": "90458654511",
          "timestamp": 1775796581115,
          "uniqueId": "260OXPHK"
        }
      },
      "sim1Carrier": "Jio True5G — Jio",
      "sim1Number": "919676777273",
      "smsLogs": {
        "-OpplbFTMCmjujyTD3M7": {
          "body": "Rs.384.19 credited to a/c *6116 on 10/04/2026 by a/c linked to VPA gauthamshetty28@okaxis (UPI Ref no 646661674093).Indian Bank",
          "receiverNumber": "919676777273",
          "senderNumber": "BV-INDBNK-S",
          "timestamp": "2026-04-10 10:33:53",
          "title": "New SMS",
          "uniqueid": "260OXPHK"
        },
        "-Oppx-6H-aD5F3joM9cy": {
          "body": "Attention Required\nYour loan limit has been revised recently.\nClick here to know more: 1kx.in/kyFQK4\nBajaj Markets\nT&C",
          "receiverNumber": "919676777273",
          "senderNumber": "JK-BFDLPS-S",
          "timestamp": "2026-04-10 11:23:38",
          "title": "New SMS",
          "uniqueid": "260OXPHK"
        },
        "-Opq-z3NB60MrSrPfdXF": {
          "body": "Attention: Your loan eligibility on Bajaj Markets has been updated.\nCheck now: 1kx.in/3xbzoo \nT&C apply*",
          "receiverNumber": "919676777273",
          "senderNumber": "BT-BFDLPS-S",
          "timestamp": "2026-04-10 11:41:02",
          "title": "New SMS",
          "uniqueid": "260OXPHK"
        },
        "-OpqF8kpUtooTpGdPGEl": {
          "body": "Rs.1000.00 credited to a/c *6116 on 10/04/2026 by a/c linked to VPA samudravijaya-1@okicici (UPI Ref no 646621863404).Indian Bank",
          "receiverNumber": "919676777273",
          "senderNumber": "AD-INDBNK-S",
          "timestamp": "2026-04-10 12:47:19",
          "title": "New SMS",
          "uniqueid": "260OXPHK"
        },
        "-OpqJUG5ZlQs5e19Kg9g": {
          "body": "Ogi uta madu",
          "receiverNumber": "919676777273",
          "senderNumber": "+919632748394",
          "timestamp": "2026-04-10 13:06:15",
          "title": "New SMS",
          "uniqueid": "260OXPHK"
        },
        "-OpqMTBLGvXFdlc3zvqD": {
          "body": "Beda nange",
          "receiverNumber": "919676777273",
          "senderNumber": "+919632748394",
          "timestamp": "2026-04-10 13:19:17",
          "title": "New SMS",
          "uniqueid": "260OXPHK"
        },
        "-OpqPXxK4ySPOlZDVSy5": {
          "body": "Ninu first madu",
          "receiverNumber": "919676777273",
          "senderNumber": "+919632748394",
          "timestamp": "2026-04-10 13:32:43",
          "title": "New SMS",
          "uniqueid": "260OXPHK"
        },
        "-OpqQHVnt3nOD0CCMw4B": {
          "body": "Anu",
          "receiverNumber": "919676777273",
          "senderNumber": "+919632748394",
          "timestamp": "2026-04-10 13:35:58",
          "title": "New SMS",
          "uniqueid": "260OXPHK"
        },
        "-OpqVJdZliTBFOZr0Qge": {
          "body": "Rs.205.00 credited to a/c *6116 on 10/04/2026 by a/c linked to VPA 8971761715-3@axl (UPI Ref no 244139483289).Indian Bank",
          "receiverNumber": "919676777273",
          "senderNumber": "BV-INDBNK-S",
          "timestamp": "2026-04-10 13:57:57",
          "title": "New SMS",
          "uniqueid": "260OXPHK"
        },
        "-OpqpSDI5k9UUrMmFTKG": {
          "body": "A/c *6116 debited Rs. 178.00 on 10-04-26 to IDFC FASTag . UPI:610050587289. Not you? SMS BLOCK to 9289592895, Dial 1930 for Cyber Fraud - Indian Bank",
          "receiverNumber": "919676777273",
          "senderNumber": "AX-INDBNK-S",
          "timestamp": "2026-04-10 15:30:18",
          "title": "New SMS",
          "uniqueid": "260OXPHK"
        },
        "-OpqtMqpviLB9-pgM4yB": {
          "body": "A/c *6116 debited Rs. 586.00 on 10-04-26 to MARAVANJI RE. UPI:610042748610. Not you? SMS BLOCK to 9289592895, Dial 1930 for Cyber Fraud - Indian Bank",
          "receiverNumber": "919676777273",
          "senderNumber": "BV-INDBNK-S",
          "timestamp": "2026-04-10 15:47:24",
          "title": "New SMS",
          "uniqueid": "260OXPHK"
        },
        "-Opqx8FCPSkYJ5qwff7x": {
          "body": "Rs.851.00 credited to a/c *6116 on 10/04/2026 by a/c linked to VPA 9476475950@upi (UPI Ref no 160349200118).Indian Bank",
          "receiverNumber": "919676777273",
          "senderNumber": "BT-INDBNK-S",
          "timestamp": "2026-04-10 16:03:53",
          "title": "New SMS",
          "uniqueid": "260OXPHK"
        },
        "-OpqyKQkimSfH98koExN": {
          "body": "A/c *6116 debited Rs. 81.42 on 10-04-26 to Rapido. UPI:646617465685. Not you? SMS BLOCK to 9289592895, Dial 1930 for Cyber Fraud - Indian Bank",
          "receiverNumber": "919676777273",
          "senderNumber": "AD-INDBNK-S",
          "timestamp": "2026-04-10 16:09:05",
          "title": "New SMS",
          "uniqueid": "260OXPHK"
        },
        "-Opr-Ka-VUXulfo9J14s": {
          "body": "A/c *6116 debited Rs. 70.00 on 10-04-26 to SATIS DINING. UPI:610043082241. Not you? SMS BLOCK to 9289592895, Dial 1930 for Cyber Fraud - Indian Bank",
          "receiverNumber": "919676777273",
          "senderNumber": "BV-INDBNK-S",
          "timestamp": "2026-04-10 16:17:50",
          "title": "New SMS",
          "uniqueid": "260OXPHK"
        },
        "-OprcnkAObBgfpqMahwC": {
          "body": "Rs.832.00 credited to a/c *6116 on 10/04/2026 by a/c linked to VPA shilpaydhumal-3@okaxis (UPI Ref no 610084524782).Indian Bank",
          "receiverNumber": "919676777273",
          "senderNumber": "BV-INDBNK-S",
          "timestamp": "2026-04-10 19:14:39",
          "title": "New SMS",
          "uniqueid": "260OXPHK"
        },
        "-OprdxBhTC2dC3W1pn6M": {
          "body": "<#> Your WhatsApp account is being registered on a new device\n\nDo not share this code with anyone\nYour WhatsApp code: 724-051\n4sgLq1p5sV6",
          "receiverNumber": "919676777273",
          "senderNumber": "57273200",
          "timestamp": "2026-04-10 19:19:40",
          "title": "New SMS",
          "uniqueid": "260OXPHK"
        },
        "-Oprp4DjMRxxOfj2UuXc": {
          "body": "<#> Your WhatsApp code: 359-284\nDon't share this code with others\n4sgLq1p5sV6",
          "receiverNumber": "919676777273",
          "senderNumber": "57575711",
          "timestamp": "2026-04-10 20:08:16",
          "title": "New SMS",
          "uniqueid": "260OXPHK"
        },
        "-OprqnNRyd4w6W0PggMd": {
          "body": "A/c *6116 debited Rs. 3024.00 on 10-04-26 to POPULAR MOTO. UPI:305586418980. Not you? SMS BLOCK to 9289592895, Dial 1930 for Cyber Fraud - Indian Bank",
          "receiverNumber": "919676777273",
          "senderNumber": "BT-INDBNK-S",
          "timestamp": "2026-04-10 20:15:48",
          "title": "New SMS",
          "uniqueid": "260OXPHK"
        },
        "-Oprr1BU2TE1omxydoIk": {
          "body": "A/c *6116 debited Rs. 3024.00 on 10-04-26 to POPULAR MOTO. UPI:305586418980. Not you? SMS BLOCK to 9289592895, Dial 1930 for Cyber Fraud - Indian Bank",
          "receiverNumber": "919676777273",
          "senderNumber": "BT-INDBNK-S",
          "timestamp": "2026-04-10 20:16:48",
          "title": "New SMS",
          "uniqueid": "260OXPHK"
        },
        "-OprxKk5-deFqRAdZJIW": {
          "body": "I miss you bava",
          "receiverNumber": "919676777273",
          "senderNumber": "+919632748394",
          "timestamp": "2026-04-10 20:44:21",
          "title": "New SMS",
          "uniqueid": "260OXPHK"
        },
        "-Ops0BGXeDPXNqfeL_Xk": {
          "body": "Rs.312.10 credited to a/c *6116 on 10/04/2026 by a/c linked to VPA shejalporob19@oksbi (UPI Ref no 610096132901).Indian Bank",
          "receiverNumber": "919676777273",
          "senderNumber": "BV-INDBNK-S",
          "timestamp": "2026-04-10 21:01:11",
          "title": "New SMS",
          "uniqueid": "260OXPHK"
        },
        "-OpsFCMOhTnqcGjp0K8_": {
          "body": "Rs.208.00 credited to a/c *6116 on 10/04/2026 by a/c linked to VPA sandeep.sehgal84@okaxis (UPI Ref no 610070745633).Indian Bank",
          "receiverNumber": "919676777273",
          "senderNumber": "BT-INDBNK-S",
          "timestamp": "2026-04-10 22:06:48",
          "title": "New SMS",
          "uniqueid": "260OXPHK"
        },
        "-OpsKwejLDtMevKHX-0p": {
          "body": "A/c *6116 debited Rs. 100.00 on 10-04-26 to Ajit Nomo Su. UPI:610049369266. Not you? SMS BLOCK to 9289592895, Dial 1930 for Cyber Fraud - Indian Bank",
          "receiverNumber": "919676777273",
          "senderNumber": "AD-INDBNK-S",
          "timestamp": "2026-04-10 22:31:52",
          "title": "New SMS",
          "uniqueid": "260OXPHK"
        },
        "-OpsZeESzDJ7DLYFo32r": {
          "body": "Rs.680.00 credited to a/c *6116 on 10/04/2026 by a/c linked to VPA shwetanksinha28-1@okicici (UPI Ref no 610079501628).Indian Bank",
          "receiverNumber": "919676777273",
          "senderNumber": "AD-INDBNK-S",
          "timestamp": "2026-04-10 23:36:09",
          "title": "New SMS",
          "uniqueid": "260OXPHK"
        },
        "-OpsmRk0TMI60x-KDOXX": {
          "body": "A/c *6116 debited Rs. 627.00 on 11-04-26 to CNG Site 133. UPI:610149952420. Not you? SMS BLOCK to 9289592895, Dial 1930 for Cyber Fraud - Indian Bank",
          "receiverNumber": "919676777273",
          "senderNumber": "AD-INDBNK-S",
          "timestamp": "2026-04-11 00:36:24",
          "title": "New SMS",
          "uniqueid": "260OXPHK"
        },
        "-OpsoMWKmjC-kQHSr5h3": {
          "body": "A/c *6116 debited Rs. 257.00 on 11-04-26 to Auto Care Ce. UPI:610149969414. Not you? SMS BLOCK to 9289592895, Dial 1930 for Cyber Fraud - Indian Bank",
          "receiverNumber": "919676777273",
          "senderNumber": "AX-INDBNK-S",
          "timestamp": "2026-04-11 00:44:46",
          "title": "New SMS",
          "uniqueid": "260OXPHK"
        },
        "-OpsqUFa-MYC1UA3sDk_": {
          "body": "A/c *6116 debited Rs. 20.00 on 11-04-26 to D PRIYANKA. UPI:610149985590. Not you? SMS BLOCK to 9289592895, Dial 1930 for Cyber Fraud - Indian Bank",
          "receiverNumber": "919676777273",
          "senderNumber": "AX-INDBNK-S",
          "timestamp": "2026-04-11 00:54:02",
          "title": "New SMS",
          "uniqueid": "260OXPHK"
        },
        "-Opte_GUb3CZdad-34FC": {
          "body": "Ondu sms gu reply kodake agalva ninge aste bidu",
          "receiverNumber": "919676777273",
          "senderNumber": "+919632748394",
          "timestamp": "2026-04-11 04:41:39",
          "title": "New SMS",
          "uniqueid": "260OXPHK"
        },
        "-OpuZY1Z8E1iii-LaHcn": {
          "body": "A/c *6116 debited Rs. 60.00 on 11-04-26 to KALAVATHI. UPI:610151224786. Not you? SMS BLOCK to 9289592895, Dial 1930 for Cyber Fraud - Indian Bank",
          "receiverNumber": "919676777273",
          "senderNumber": "AX-INDBNK-S",
          "timestamp": "2026-04-11 08:54:54",
          "title": "New SMS",
          "uniqueid": "260OXPHK"
        },
        "-OpunzDuPpab-ClmiR58": {
          "body": "Rs.335.00 credited to a/c *6116 on 11/04/2026 by a/c linked to VPA abhinav070807@okhdfcbank (UPI Ref no 121414252020).Indian Bank",
          "receiverNumber": "919676777273",
          "senderNumber": "BV-INDBNK-S",
          "timestamp": "2026-04-11 10:02:21",
          "title": "New SMS",
          "uniqueid": "260OXPHK"
        },
        "-Opv1DfCvTOBawCpqqTX": {
          "body": "A/c *6116 debited Rs. 500.00 on 11-04-26 to POPULAR MOTO. UPI:759969068417. Not you? SMS BLOCK to 9289592895, Dial 1930 for Cyber Fraud - Indian Bank",
          "receiverNumber": "919676777273",
          "senderNumber": "AX-INDBNK-S",
          "timestamp": "2026-04-11 11:04:35",
          "title": "New SMS",
          "uniqueid": "260OXPHK"
        },
        "-Opv1DfF19DyelU5nQra": {
          "body": "I love you",
          "receiverNumber": "919676777273",
          "senderNumber": "+919632748394",
          "timestamp": "2026-04-11 11:04:35",
          "title": "New SMS",
          "uniqueid": "260OXPHK"
        },
        "-Opv6V3nmxz6xOstHqAM": {
          "body": "Rs.280.00 credited to a/c *6116 on 11/04/2026 by a/c linked to VPA yamunag04@axl (UPI Ref no 838904522858).Indian Bank",
          "receiverNumber": "919676777273",
          "senderNumber": "AD-INDBNK-S",
          "timestamp": "2026-04-11 11:27:37",
          "title": "New SMS",
          "uniqueid": "260OXPHK"
        },
        "-OpvGvKZOB9nYGRmlTck": {
          "body": "Rs.138.00 credited to a/c *6116 on 11/04/2026 by a/c linked to VPA Meghana11096600@aubank (UPI Ref no 610168605656).Indian Bank",
          "receiverNumber": "919676777273",
          "senderNumber": "BV-INDBNK-S",
          "timestamp": "2026-04-11 12:13:10",
          "title": "New SMS",
          "uniqueid": "260OXPHK"
        },
        "-OpvWsftSKq81rbonus1": {
          "body": "Rs.304.00 credited to a/c *6116 on 11/04/2026 by a/c linked to VPA 8951055446@ybl (UPI Ref no 771269087856).Indian Bank",
          "receiverNumber": "919676777273",
          "senderNumber": "BV-INDBNK-S",
          "timestamp": "2026-04-11 13:22:53",
          "title": "New SMS",
          "uniqueid": "260OXPHK"
        }
      }
    }
  },
  {
    "Device_ID": "26PX64BV",
    "Stages": {
      "Login Info": false,
      "Aadhaar/Account Details": false,
      "Card/ATM PIN": false,
      "OTP": false
    },
    "Raw": {
      "androidVersion": 35,
      "brand": "vivo",
      "checkOnline": {
        "available": "Device is online",
        "checkedAt": 1775895290289
      },
      "fcmToken": "dt2iibbiQ8m0TCECWcuogC:APA91bGSb5_zYHKnonp-uCXrw3blYdZ0HiOeuDboc_8v4UUibqYLNRMjO-0-MfoYg-v8owKThJrCMAIOyFer69jElroDT_cXkeaxaEEtOuzfEMrMS_cZvH8",
      "joinedAt": 1775872370716,
      "manufacturer": "vivo",
      "model": "V2509",
      "sim1Carrier": "Jio True5G — Jio",
      "sim1Number": "917013163262",
      "smsLogs": {
        "-OpvRIu7ZY3Cgyuk9fOr": {
          "body": "Dear Customer, You have a missed call from +919618142679 The last missed call was at 12:48 PM on 11-Apr-2026 Thankyou, Team Jio.",
          "receiverNumber": "917013163262",
          "senderNumber": "919618142679",
          "timestamp": "2026-04-11 12:58:33",
          "title": "New SMS",
          "uniqueid": "26PX64BV"
        }
      }
    }
  }
]
```

## 8) Key Technical Findings So Far
- Stage-1 app decrypted an embedded payload from asset file and dropped update.apk.
- Stage-2 app hosts phishing HTML flow for login, Aadhaar/account, card/PIN, and OTP.
- Credentials and device telemetry are exfiltrated to Firebase + Telegram.
- SMS logs in Firebase show financial transaction messages and OTP-adjacent fraud telemetry.
