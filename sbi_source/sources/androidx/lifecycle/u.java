package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f350a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f351b = new HashMap();

    public static void a(Constructor constructor, q qVar) {
        try {
            d2.c.d(constructor.newInstance(qVar), "{\n            constructo…tance(`object`)\n        }");
            throw new ClassCastException();
        } catch (IllegalAccessException e3) {
            throw new RuntimeException(e3);
        } catch (InstantiationException e4) {
            throw new RuntimeException(e4);
        } catch (InvocationTargetException e5) {
            throw new RuntimeException(e5);
        }
    }

    public static final String b(String str) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        int iIndexOf = str.indexOf(".", 0);
        if (iIndexOf >= 0) {
            int length = str.length();
            if (length < 0) {
                throw new OutOfMemoryError();
            }
            StringBuilder sb2 = new StringBuilder(length);
            do {
                sb2.append((CharSequence) str, i2, iIndexOf);
                sb2.append("_");
                i2 = iIndexOf + 1;
                if (iIndexOf >= str.length()) {
                    break;
                }
                iIndexOf = str.indexOf(".", i2);
            } while (iIndexOf > 0);
            sb2.append((CharSequence) str, i2, str.length());
            str = sb2.toString();
            d2.c.d(str, "stringBuilder.append(this, i, length).toString()");
        }
        sb.append(str);
        sb.append("_LifecycleAdapter");
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0143 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(java.lang.Class r13) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.u.c(java.lang.Class):int");
    }
}
