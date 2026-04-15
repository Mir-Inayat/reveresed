package t0;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f2120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f2121b;
    public final byte[] c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f2122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f2123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2124f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c[] f2125g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f2126h;

    public b(AssetManager assetManager, Executor executor, e eVar, String str, File file) {
        this.f2120a = executor;
        this.f2121b = eVar;
        this.f2123e = str;
        this.f2122d = file;
        int i2 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i2 <= 34) {
            switch (i2) {
                case 24:
                case 25:
                    bArr = f.f2141h;
                    break;
                case 26:
                    bArr = f.f2140g;
                    break;
                case 27:
                    bArr = f.f2139f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = f.f2138e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = f.f2137d;
                    break;
            }
        }
        this.c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e3) {
            String message = e3.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.f2121b.g();
            return null;
        }
    }

    public final void b(final int i2, final Serializable serializable) {
        this.f2120a.execute(new Runnable() { // from class: t0.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f2118a.f2121b.i(i2, serializable);
            }
        });
    }
}
