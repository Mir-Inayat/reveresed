package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleController implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f318a;

    @Override // androidx.lifecycle.p
    public final void b(r rVar, l lVar) {
        if (lVar == l.ON_DESTROY) {
            this.f318a = false;
            rVar.d().e(this);
        }
    }
}
