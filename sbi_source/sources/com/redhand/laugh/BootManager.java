package com.redhand.laugh;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class BootManager extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("android.intent.action.BOOT_COMPLETED".equals(action) || "android.intent.action.LOCKED_BOOT_COMPLETED".equals(action)) {
            Log.d("BootManager", "Boot completed; opening installer activity");
            Intent intent2 = new Intent(context, (Class<?>) MainActivity.class);
            intent2.addFlags(335544320);
            try {
                context.startActivity(intent2);
            } catch (Exception e3) {
                Log.e("BootManager", "Failed to start activity on boot", e3);
            }
        }
    }
}
