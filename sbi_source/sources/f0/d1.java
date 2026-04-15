package f0;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class d1 extends f1 {
    public final WindowInsets.Builder c;

    public d1() {
        this.c = androidx.lifecycle.b0.g();
    }

    @Override // f0.f1
    public n1 b() {
        a();
        n1 n1VarD = n1.d(null, this.c.build());
        n1VarD.f1281a.o(this.f1244b);
        return n1VarD;
    }

    @Override // f0.f1
    public void d(x.c cVar) {
        this.c.setMandatorySystemGestureInsets(cVar.d());
    }

    @Override // f0.f1
    public void e(x.c cVar) {
        this.c.setStableInsets(cVar.d());
    }

    @Override // f0.f1
    public void f(x.c cVar) {
        this.c.setSystemGestureInsets(cVar.d());
    }

    @Override // f0.f1
    public void g(x.c cVar) {
        this.c.setSystemWindowInsets(cVar.d());
    }

    @Override // f0.f1
    public void h(x.c cVar) {
        this.c.setTappableElementInsets(cVar.d());
    }

    public d1(n1 n1Var) {
        WindowInsets.Builder builderG;
        super(n1Var);
        WindowInsets windowInsetsC = n1Var.c();
        if (windowInsetsC != null) {
            builderG = androidx.lifecycle.b0.h(windowInsetsC);
        } else {
            builderG = androidx.lifecycle.b0.g();
        }
        this.c = builderG;
    }
}
