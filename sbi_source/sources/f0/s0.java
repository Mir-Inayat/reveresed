package f0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a1 f1285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n1 f1286b;
    public final /* synthetic */ n1 c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f1288e;

    public s0(a1 a1Var, n1 n1Var, n1 n1Var2, int i2, View view) {
        this.f1285a = a1Var;
        this.f1286b = n1Var;
        this.c = n1Var2;
        this.f1287d = i2;
        this.f1288e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        a1 a1Var = this.f1285a;
        z0 z0Var = a1Var.f1225a;
        z0Var.d(animatedFraction);
        n1 n1Var = this.f1286b;
        l1 l1Var = n1Var.f1281a;
        float fB = z0Var.b();
        PathInterpolator pathInterpolator = v0.f1296e;
        int i2 = Build.VERSION.SDK_INT;
        f1 e1Var = i2 >= 30 ? new e1(n1Var) : i2 >= 29 ? new d1(n1Var) : new c1(n1Var);
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((this.f1287d & i3) == 0) {
                e1Var.c(i3, l1Var.f(i3));
            } else {
                x.c cVarF = l1Var.f(i3);
                x.c cVarF2 = this.c.f1281a.f(i3);
                float f3 = 1.0f - fB;
                e1Var.c(i3, n1.b(cVarF, (int) (((double) ((cVarF.f2616a - cVarF2.f2616a) * f3)) + 0.5d), (int) (((double) ((cVarF.f2617b - cVarF2.f2617b) * f3)) + 0.5d), (int) (((double) ((cVarF.c - cVarF2.c) * f3)) + 0.5d), (int) (((double) ((cVarF.f2618d - cVarF2.f2618d) * f3)) + 0.5d)));
            }
        }
        v0.g(this.f1288e, e1Var.b(), Collections.singletonList(a1Var));
    }
}
