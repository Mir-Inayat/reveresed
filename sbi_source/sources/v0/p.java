package v0;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2404b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2406e;

    public p(int i2) {
        this.f2403a = i2;
        switch (i2) {
            case 1:
                break;
            default:
                this.f2404b = -1;
                this.c = Integer.MIN_VALUE;
                this.f2405d = false;
                this.f2406e = false;
                break;
        }
    }

    public String toString() {
        switch (this.f2403a) {
            case 0:
                return "AnchorInfo{mPosition=" + this.f2404b + ", mCoordinate=" + this.c + ", mLayoutFromEnd=" + this.f2405d + ", mValid=" + this.f2406e + '}';
            default:
                return super.toString();
        }
    }
}
