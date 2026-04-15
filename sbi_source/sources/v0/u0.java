package v0;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2445b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2447e;

    public final boolean a() {
        int i2 = this.f2444a;
        int i3 = 2;
        if ((i2 & 7) != 0) {
            int i4 = this.f2446d;
            int i5 = this.f2445b;
            if (((i4 > i5 ? 1 : i4 == i5 ? 2 : 4) & i2) == 0) {
                return false;
            }
        }
        if ((i2 & 112) != 0) {
            int i6 = this.f2446d;
            int i7 = this.c;
            if ((((i6 > i7 ? 1 : i6 == i7 ? 2 : 4) << 4) & i2) == 0) {
                return false;
            }
        }
        if ((i2 & 1792) != 0) {
            int i8 = this.f2447e;
            int i9 = this.f2445b;
            if ((((i8 > i9 ? 1 : i8 == i9 ? 2 : 4) << 8) & i2) == 0) {
                return false;
            }
        }
        if ((i2 & 28672) != 0) {
            int i10 = this.f2447e;
            int i11 = this.c;
            if (i10 > i11) {
                i3 = 1;
            } else if (i10 != i11) {
                i3 = 4;
            }
            if ((i2 & (i3 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
