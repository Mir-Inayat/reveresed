package f;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1197b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1200f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1201g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1202h;

    public final void a(int i2, int i3) {
        this.c = i2;
        this.f1198d = i3;
        this.f1202h = true;
        if (this.f1201g) {
            if (i3 != Integer.MIN_VALUE) {
                this.f1196a = i3;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.f1197b = i2;
                return;
            }
            return;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1196a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f1197b = i3;
        }
    }
}
