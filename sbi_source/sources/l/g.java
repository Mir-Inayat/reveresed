package l;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1548a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f1551e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1558l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1549b = -1;
    public int c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1550d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1552f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f1553g = new float[9];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f1554h = new float[9];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b[] f1555i = new b[16];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1556j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1557k = 0;

    public g(int i2) {
        this.f1558l = i2;
    }

    public final void a(b bVar) {
        int i2 = 0;
        while (true) {
            int i3 = this.f1556j;
            if (i2 >= i3) {
                b[] bVarArr = this.f1555i;
                if (i3 >= bVarArr.length) {
                    this.f1555i = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f1555i;
                int i4 = this.f1556j;
                bVarArr2[i4] = bVar;
                this.f1556j = i4 + 1;
                return;
            }
            if (this.f1555i[i2] == bVar) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final void b(b bVar) {
        int i2 = this.f1556j;
        int i3 = 0;
        while (i3 < i2) {
            if (this.f1555i[i3] == bVar) {
                while (i3 < i2 - 1) {
                    b[] bVarArr = this.f1555i;
                    int i4 = i3 + 1;
                    bVarArr[i3] = bVarArr[i4];
                    i3 = i4;
                }
                this.f1556j--;
                return;
            }
            i3++;
        }
    }

    public final void c() {
        this.f1558l = 5;
        this.f1550d = 0;
        this.f1549b = -1;
        this.c = -1;
        this.f1551e = 0.0f;
        this.f1552f = false;
        int i2 = this.f1556j;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f1555i[i3] = null;
        }
        this.f1556j = 0;
        this.f1557k = 0;
        this.f1548a = false;
        Arrays.fill(this.f1554h, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f1549b - ((g) obj).f1549b;
    }

    public final void d(c cVar, float f3) {
        this.f1551e = f3;
        this.f1552f = true;
        int i2 = this.f1556j;
        this.c = -1;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f1555i[i3].h(cVar, this, false);
        }
        this.f1556j = 0;
    }

    public final void e(c cVar, b bVar) {
        int i2 = this.f1556j;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f1555i[i3].i(cVar, bVar, false);
        }
        this.f1556j = 0;
    }

    public final String toString() {
        return "" + this.f1549b;
    }
}
