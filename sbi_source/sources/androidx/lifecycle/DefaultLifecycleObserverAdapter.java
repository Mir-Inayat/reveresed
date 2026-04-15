package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f314b;

    public DefaultLifecycleObserverAdapter(d dVar, p pVar) {
        this.f313a = dVar;
        this.f314b = pVar;
    }

    @Override // androidx.lifecycle.p
    public final void b(r rVar, l lVar) {
        int i2 = e.f327a[lVar.ordinal()];
        if (i2 == 3) {
            this.f313a.a();
        } else if (i2 == 7) {
            throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        p pVar = this.f314b;
        if (pVar != null) {
            pVar.b(rVar, lVar);
        }
    }
}
