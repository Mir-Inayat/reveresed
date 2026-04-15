package z0;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class d extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2659a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f2660b;

    public d(ViewGroup viewGroup) {
        this.f2660b = viewGroup;
    }

    @Override // z0.n, z0.k
    public final void c(m mVar) {
        t1.e.P(this.f2660b, false);
        this.f2659a = true;
    }

    @Override // z0.k
    public final void d(m mVar) {
        if (!this.f2659a) {
            t1.e.P(this.f2660b, false);
        }
        mVar.x(this);
    }

    @Override // z0.n, z0.k
    public final void e() {
        t1.e.P(this.f2660b, false);
    }

    @Override // z0.n, z0.k
    public final void f() {
        t1.e.P(this.f2660b, true);
    }
}
