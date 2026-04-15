package f0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class u0 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f1293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n1 f1294b;

    public u0(View view, e eVar) {
        n1 n1VarB;
        this.f1293a = eVar;
        Field field = m0.f1276a;
        n1 n1VarA = d0.a(view);
        if (n1VarA != null) {
            int i2 = Build.VERSION.SDK_INT;
            n1VarB = (i2 >= 30 ? new e1(n1VarA) : i2 >= 29 ? new d1(n1VarA) : new c1(n1VarA)).b();
        } else {
            n1VarB = null;
        }
        this.f1294b = n1VarB;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        if (!view.isLaidOut()) {
            this.f1294b = n1.d(view, windowInsets);
            return v0.i(view, windowInsets);
        }
        n1 n1VarD = n1.d(view, windowInsets);
        l1 l1Var = n1VarD.f1281a;
        if (this.f1294b == null) {
            Field field = m0.f1276a;
            this.f1294b = d0.a(view);
        }
        if (this.f1294b == null) {
            this.f1294b = n1VarD;
            return v0.i(view, windowInsets);
        }
        e eVarJ = v0.j(view);
        if (eVarJ != null && Objects.equals((WindowInsets) eVarJ.f1239b, windowInsets)) {
            return v0.i(view, windowInsets);
        }
        n1 n1Var = this.f1294b;
        int i2 = 0;
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if (!l1Var.f(i3).equals(n1Var.f1281a.f(i3))) {
                i2 |= i3;
            }
        }
        if (i2 == 0) {
            return v0.i(view, windowInsets);
        }
        n1 n1Var2 = this.f1294b;
        a1 a1Var = new a1(i2, (i2 & 8) != 0 ? l1Var.f(8).f2618d > n1Var2.f1281a.f(8).f2618d ? v0.f1296e : v0.f1297f : v0.f1298g, 160L);
        a1Var.f1225a.d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(a1Var.f1225a.a());
        x.c cVarF = l1Var.f(i2);
        x.c cVarF2 = n1Var2.f1281a.f(i2);
        int iMin = Math.min(cVarF.f2616a, cVarF2.f2616a);
        int i4 = cVarF.f2617b;
        int i5 = cVarF2.f2617b;
        int iMin2 = Math.min(i4, i5);
        int i6 = cVarF.c;
        int i7 = cVarF2.c;
        int iMin3 = Math.min(i6, i7);
        int i8 = cVarF.f2618d;
        int i9 = i2;
        int i10 = cVarF2.f2618d;
        androidx.emoji2.text.q qVar = new androidx.emoji2.text.q(x.c.b(iMin, iMin2, iMin3, Math.min(i8, i10)), x.c.b(Math.max(cVarF.f2616a, cVarF2.f2616a), Math.max(i4, i5), Math.max(i6, i7), Math.max(i8, i10)), 4);
        v0.f(view, windowInsets, false);
        duration.addUpdateListener(new s0(a1Var, n1VarD, n1Var2, i9, view));
        duration.addListener(new t0(a1Var, view));
        c0.m mVar = new c0.m(view, a1Var, qVar, duration);
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        t tVar = new t(view, mVar);
        view.getViewTreeObserver().addOnPreDrawListener(tVar);
        view.addOnAttachStateChangeListener(tVar);
        this.f1294b = n1VarD;
        return v0.i(view, windowInsets);
    }
}
