package t1;

import android.util.StateSet;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o f2160b;
    public int[][] c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o[] f2161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a0 f2162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a0 f2163f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a0 f2164g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a0 f2165h;

    public b0(o oVar) {
        b();
        a(StateSet.WILD_CARD, oVar);
    }

    public final void a(int[] iArr, o oVar) {
        int i2 = this.f2159a;
        if (i2 == 0 || iArr.length == 0) {
            this.f2160b = oVar;
        }
        int[][] iArr2 = this.c;
        if (i2 >= iArr2.length) {
            int i3 = i2 + 10;
            int[][] iArr3 = new int[i3][];
            System.arraycopy(iArr2, 0, iArr3, 0, i2);
            this.c = iArr3;
            o[] oVarArr = new o[i3];
            System.arraycopy(this.f2161d, 0, oVarArr, 0, i2);
            this.f2161d = oVarArr;
        }
        int[][] iArr4 = this.c;
        int i4 = this.f2159a;
        iArr4[i4] = iArr;
        this.f2161d[i4] = oVar;
        this.f2159a = i4 + 1;
    }

    public final void b() {
        this.f2160b = new o();
        this.c = new int[10][];
        this.f2161d = new o[10];
    }
}
