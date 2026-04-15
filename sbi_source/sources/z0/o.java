package z0;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class o extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i.f f2716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f2717b;

    public o(p pVar, i.f fVar) {
        this.f2717b = pVar;
        this.f2716a = fVar;
    }

    @Override // z0.k
    public final void d(m mVar) {
        ((ArrayList) this.f2716a.get(this.f2717b.f2719b)).remove(mVar);
        mVar.x(this);
    }
}
