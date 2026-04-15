package z0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.redhand.laugiytr.R;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class g extends AnimatorListenerAdapter implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f2676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2677b = false;

    public g(View view) {
        this.f2676a = view;
    }

    @Override // z0.k
    public final void e() {
        View view = this.f2676a;
        view.setTag(R.NP_MANAGER8.NP_MANAGER, Float.valueOf(view.getVisibility() == 0 ? w.f2727a.C(view) : 0.0f));
    }

    @Override // z0.k
    public final void f() {
        this.f2676a.setTag(R.NP_MANAGER8.NP_MANAGER, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        w.f2727a.M(this.f2676a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f2676a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f2677b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        boolean z2 = this.f2677b;
        View view = this.f2676a;
        if (z2) {
            view.setLayerType(0, null);
        }
        if (z) {
            return;
        }
        c0 c0Var = w.f2727a;
        c0Var.M(view, 1.0f);
        c0Var.getClass();
    }

    @Override // z0.k
    public final void a(m mVar) {
    }

    @Override // z0.k
    public final void b(m mVar) {
    }

    @Override // z0.k
    public final void c(m mVar) {
    }

    @Override // z0.k
    public final void d(m mVar) {
    }
}
