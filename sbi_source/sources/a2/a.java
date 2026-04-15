package a2;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends a0.a {
    public static void n0(int i2, int i3, int i4, int[] iArr, int[] iArr2) {
        d2.c.e(iArr, "<this>");
        d2.c.e(iArr2, "destination");
        System.arraycopy(iArr, i3, iArr2, i2, i4 - i3);
    }

    public static void o0(Object[] objArr, Object[] objArr2, int i2, int i3, int i4) {
        d2.c.e(objArr, "<this>");
        d2.c.e(objArr2, "destination");
        System.arraycopy(objArr, i3, objArr2, i2, i4 - i3);
    }

    public static /* synthetic */ void p0(Object[] objArr, Object[] objArr2, int i2, int i3, int i4) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        o0(objArr, objArr2, 0, i2, i3);
    }
}
