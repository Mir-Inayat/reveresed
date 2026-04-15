package f0;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends j1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final n1 f1269q = n1.d(null, WindowInsets.CONSUMED);

    public k1(n1 n1Var, WindowInsets windowInsets) {
        super(n1Var, windowInsets);
    }

    @Override // f0.g1, f0.l1
    public x.c f(int i2) {
        return x.c.c(this.c.getInsets(m1.a(i2)));
    }

    @Override // f0.g1, f0.l1
    public final void d(View view) {
    }
}
