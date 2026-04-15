package i;

import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f1377a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f1378b = new Object();

    public static final int a(g gVar, Object obj, int i2) {
        int i3 = gVar.c;
        if (i3 == 0) {
            return -1;
        }
        try {
            int iA = j.a.a(i3, i2, gVar.f1372a);
            if (iA < 0 || d2.c.a(obj, gVar.f1373b[iA])) {
                return iA;
            }
            int i4 = iA + 1;
            while (i4 < i3 && gVar.f1372a[i4] == i2) {
                if (d2.c.a(obj, gVar.f1373b[i4])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = iA - 1; i5 >= 0 && gVar.f1372a[i5] == i2; i5--) {
                if (d2.c.a(obj, gVar.f1373b[i5])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
