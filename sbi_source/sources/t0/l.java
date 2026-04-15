package t0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k.h f2149a = new k.h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f2150b = new Object();
    public static t1.g c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? j.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static t1.g b() {
        t1.g gVar = new t1.g(20);
        c = gVar;
        k.h hVar = f2149a;
        hVar.getClass();
        if (k.g.f1449f.d(hVar, null, gVar)) {
            k.g.b(hVar);
        }
        return c;
    }

    public static void c(Context context, boolean z) {
        k kVarA;
        int i2;
        if (z || c == null) {
            synchronized (f2150b) {
                if (!z) {
                    try {
                        if (c != null) {
                            return;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 28 && i3 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    int i4 = 0;
                    boolean z2 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z3 = file2.exists() && length2 > 0;
                    try {
                        long jA = a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                kVarA = k.a(file3);
                            } catch (IOException unused) {
                                b();
                                return;
                            }
                        } else {
                            kVarA = null;
                        }
                        if (kVarA != null && kVarA.c == jA && (i2 = kVarA.f2147b) != 2) {
                            i4 = i2;
                        } else if (z2) {
                            i4 = 1;
                        } else if (z3) {
                            i4 = 2;
                        }
                        if (z && z3 && i4 != 1) {
                            i4 = 2;
                        }
                        if (kVarA != null && kVarA.f2147b == 2 && i4 == 1 && length < kVarA.f2148d) {
                            i4 = 3;
                        }
                        k kVar = new k(1, i4, jA, length2);
                        if (kVarA == null || !kVarA.equals(kVar)) {
                            try {
                                kVar.b(file3);
                            } catch (IOException unused2) {
                            }
                        }
                        b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        b();
                        return;
                    }
                }
                b();
            }
        }
    }
}
