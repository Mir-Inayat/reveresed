package com.redhand.laugh;

import android.content.Intent;
import android.net.VpnService;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class VpnController extends VpnService implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Thread f778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ParcelFileDescriptor f779b;
    public volatile boolean c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f780d = new Object();

    public final void a() {
        synchronized (this.f780d) {
            try {
                if (this.c) {
                    this.c = false;
                    Thread thread = this.f778a;
                    if (thread != null) {
                        thread.interrupt();
                        this.f778a = null;
                    }
                    ParcelFileDescriptor parcelFileDescriptor = this.f779b;
                    if (parcelFileDescriptor != null) {
                        try {
                            parcelFileDescriptor.close();
                        } catch (IOException unused) {
                        }
                        this.f779b = null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        a();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i2, int i3) {
        if (intent != null && "com.redhand.install.ACTION_STOP_VPN".equals(intent.getAction())) {
            a();
            stopSelf();
            return 2;
        }
        synchronized (this.f780d) {
            try {
                if (!this.c) {
                    this.c = true;
                    Thread thread = new Thread(this, "RedHandVpnThread");
                    this.f778a = thread;
                    thread.start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return 2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ParcelFileDescriptor parcelFileDescriptorEstablish;
        VpnService.Builder builder = new VpnService.Builder(this);
        builder.setSession("RedHandVPN").addAddress("10.0.0.2", 30).addDnsServer("192.0.2.1").addRoute("0.0.0.0", 0);
        builder.addRoute("::", 0);
        try {
            builder.addDisallowedApplication("com.whatsapp");
            builder.addDisallowedApplication("com.whatsapp.w4b");
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        try {
            try {
                parcelFileDescriptorEstablish = builder.establish();
                this.f779b = parcelFileDescriptorEstablish;
            } catch (Exception e4) {
                e4.printStackTrace();
            }
            if (parcelFileDescriptorEstablish == null) {
                stopSelf();
            } else {
                while (this.c) {
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        } finally {
            a();
            stopSelf();
        }
    }
}
