package androidx.emoji2.text;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f247a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f248b;
    public x c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x f249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f251f;

    public s(x xVar) {
        this.f248b = xVar;
        this.c = xVar;
    }

    public final void a() {
        this.f247a = 1;
        this.c = this.f248b;
        this.f251f = 0;
    }

    public final boolean b() {
        o0.a aVarB = this.c.f268b.b();
        int iA = aVarB.a(6);
        return !(iA == 0 || aVarB.f1807b.get(iA + aVarB.f1806a) == 0) || this.f250e == 65039;
    }
}
