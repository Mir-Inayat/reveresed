package e;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f860b;
    public final /* synthetic */ j c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.emoji2.text.n f861d;

    public e(androidx.emoji2.text.n nVar, f fVar, k kVar, j jVar) {
        this.f861d = nVar;
        this.f859a = fVar;
        this.f860b = kVar;
        this.c = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g gVar = (g) this.f861d.f244b;
        f fVar = this.f859a;
        if (fVar != null) {
            gVar.z = true;
            fVar.f863b.c(false);
            gVar.z = false;
        }
        k kVar = this.f860b;
        if (kVar.isEnabled() && kVar.hasSubMenu()) {
            this.c.p(kVar, null, 4);
        }
    }
}
