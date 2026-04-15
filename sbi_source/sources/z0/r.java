package z0;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class r extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2722a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m f2723b;

    public /* synthetic */ r() {
    }

    @Override // z0.n, z0.k
    public void a(m mVar) {
        switch (this.f2722a) {
            case 1:
                a aVar = (a) this.f2723b;
                if (!aVar.D) {
                    aVar.G();
                    aVar.D = true;
                }
                break;
        }
    }

    @Override // z0.k
    public final void d(m mVar) {
        switch (this.f2722a) {
            case 0:
                this.f2723b.z();
                mVar.x(this);
                break;
            default:
                a aVar = (a) this.f2723b;
                int i2 = aVar.C - 1;
                aVar.C = i2;
                if (i2 == 0) {
                    aVar.D = false;
                    aVar.m();
                }
                mVar.x(this);
                break;
        }
    }

    public r(m mVar) {
        this.f2723b = mVar;
    }
}
