package f0;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class j1 extends i1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public x.c f1264n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public x.c f1265o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public x.c f1266p;

    public j1(n1 n1Var, WindowInsets windowInsets) {
        super(n1Var, windowInsets);
        this.f1264n = null;
        this.f1265o = null;
        this.f1266p = null;
    }

    @Override // f0.l1
    public x.c g() {
        if (this.f1265o == null) {
            this.f1265o = x.c.c(this.c.getMandatorySystemGestureInsets());
        }
        return this.f1265o;
    }

    @Override // f0.l1
    public x.c i() {
        if (this.f1264n == null) {
            this.f1264n = x.c.c(this.c.getSystemGestureInsets());
        }
        return this.f1264n;
    }

    @Override // f0.l1
    public x.c k() {
        if (this.f1266p == null) {
            this.f1266p = x.c.c(this.c.getTappableElementInsets());
        }
        return this.f1266p;
    }

    @Override // f0.g1, f0.l1
    public n1 l(int i2, int i3, int i4, int i5) {
        return n1.d(null, this.c.inset(i2, i3, i4, i5));
    }

    @Override // f0.h1, f0.l1
    public void q(x.c cVar) {
    }
}
