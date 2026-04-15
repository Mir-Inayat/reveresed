package f0;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements w1.x, z0.l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1255f;

    public /* synthetic */ h(int i2) {
        this.f1255f = i2;
    }

    @Override // z0.l
    public void a(z0.k kVar, z0.m mVar) {
        switch (this.f1255f) {
            case 3:
                kVar.b(mVar);
                break;
            case 4:
                kVar.d(mVar);
                break;
            case 5:
                kVar.c(mVar);
                break;
            case 6:
                kVar.e();
                break;
            default:
                kVar.f();
                break;
        }
    }
}
