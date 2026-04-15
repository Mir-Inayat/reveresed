package x;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t1.e f2622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i.j f2623b;

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            f2622a = new l();
        } else if (i2 >= 28) {
            f2622a = new k();
        } else if (i2 >= 26) {
            f2622a = new j();
        } else {
            Method method = i.f2631i;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f2622a = new i();
            } else {
                f2622a = new h();
            }
        }
        f2623b = new i.j(16);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface a(android.content.Context r12, w.e r13, android.content.res.Resources r14, int r15, java.lang.String r16, int r17, int r18, w.b r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x.g.a(android.content.Context, w.e, android.content.res.Resources, int, java.lang.String, int, int, w.b, boolean):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i2, String str, int i3, int i4) {
        return resources.getResourcePackageName(i2) + '-' + str + '-' + i3 + '-' + i2 + '-' + i4;
    }
}
