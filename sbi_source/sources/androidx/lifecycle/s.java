package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p f342b;

    public final void a(r rVar, l lVar) {
        m mVarA = lVar.a();
        m mVar = this.f341a;
        d2.c.e(mVar, "state1");
        if (mVarA.compareTo(mVar) < 0) {
            mVar = mVarA;
        }
        this.f341a = mVar;
        this.f342b.b(rVar, lVar);
        this.f341a = mVarA;
    }
}
