package com.redhand.laugh;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class InstallResultReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Log.d("InstallResult", "Install result received: " + intent.getAction());
        if ("com.redhand.install.SESSION_API_PACKAGE_INSTALLED".equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("android.content.pm.extra.STATUS", -1);
            String stringExtra = intent.getStringExtra("android.content.pm.extra.STATUS_MESSAGE");
            String stringExtra2 = intent.getStringExtra("installed_package");
            Log.d("InstallResult", "Install status: " + intExtra + ", message: " + stringExtra);
            StringBuilder sb = new StringBuilder("Installed package from callback: ");
            sb.append(stringExtra2);
            Log.d("InstallResult", sb.toString());
            Intent intent2 = new Intent("com.redhand.install.ACTION_INSTALL_COMPLETE");
            intent2.setPackage(context.getPackageName());
            intent2.putExtra("install_status", intExtra);
            intent2.putExtra("installed_package", stringExtra2);
            intent2.putExtra("android.content.pm.extra.STATUS_MESSAGE", stringExtra);
            if (intExtra != -1) {
                if (intExtra == 0) {
                    Log.d("InstallResult", "Install SUCCESS");
                    MainActivity.u(context);
                } else {
                    Log.e("InstallResult", "Install failed/aborted: " + stringExtra);
                }
                context.sendBroadcast(intent2);
                return;
            }
            Intent intent3 = Build.VERSION.SDK_INT >= 33 ? (Intent) intent.getParcelableExtra("android.intent.extra.INTENT", Intent.class) : (Intent) intent.getParcelableExtra("android.intent.extra.INTENT");
            if (intent3 != null) {
                intent3.addFlags(268435456);
                try {
                    context.startActivity(intent3);
                    Log.d("InstallResult", "Install confirmation UI launched from receiver");
                } catch (Exception e3) {
                    Log.e("InstallResult", "Failed to launch confirmation UI", e3);
                }
            } else {
                Log.e("InstallResult", "Pending user action but confirm intent is null");
            }
            context.sendBroadcast(intent2);
        }
    }
}
