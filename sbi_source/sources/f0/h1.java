package f0;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class h1 extends g1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public x.c f1256m;

    public h1(n1 n1Var, WindowInsets windowInsets) {
        super(n1Var, windowInsets);
        this.f1256m = null;
    }

    @Override // f0.l1
    public n1 b() {
        return n1.d(null, this.c.consumeStableInsets());
    }

    @Override // f0.l1
    public n1 c() {
        return n1.d(null, this.c.consumeSystemWindowInsets());
    }

    @Override // f0.l1
    public final x.c h() {
        if (this.f1256m == null) {
            WindowInsets windowInsets = this.c;
            this.f1256m = x.c.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f1256m;
    }

    @Override // f0.l1
    public boolean m() {
        return this.c.isConsumed();
    }

    @Override // f0.l1
    public void q(x.c cVar) {
        this.f1256m = cVar;
    }
}
