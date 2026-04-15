package k0;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1454b;
    public float c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f1455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f1456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f1457f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f1458g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f1459h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1460i;

    public final float a(long j2) {
        if (j2 < this.f1456e) {
            return 0.0f;
        }
        long j3 = this.f1458g;
        if (j3 < 0 || j2 < j3) {
            return g.b((j2 - r0) / this.f1453a, 0.0f, 1.0f) * 0.5f;
        }
        float f3 = this.f1459h;
        return (g.b((j2 - j3) / this.f1460i, 0.0f, 1.0f) * f3) + (1.0f - f3);
    }
}
