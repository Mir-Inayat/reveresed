package z0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.redhand.laugiytr.R;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends AnimatorListenerAdapter implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f2672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f2673b;
    public final View c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2674d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f2675e;

    public f0(h hVar, ViewGroup viewGroup, View view, View view2) {
        this.f2675e = hVar;
        this.f2672a = viewGroup;
        this.f2673b = view;
        this.c = view2;
    }

    @Override // z0.k
    public final void c(m mVar) {
        if (this.f2674d) {
            g();
        }
    }

    @Override // z0.k
    public final void d(m mVar) {
        mVar.x(this);
    }

    public final void g() {
        this.c.setTag(R.NP_MANAGER8.NP_MANAGER, null);
        this.f2672a.getOverlay().remove(this.f2673b);
        this.f2674d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f2672a.getOverlay().remove(this.f2673b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f2673b;
        if (view.getParent() == null) {
            this.f2672a.getOverlay().add(view);
        } else {
            this.f2675e.c();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            View view = this.c;
            View view2 = this.f2673b;
            view.setTag(R.NP_MANAGER8.NP_MANAGER, view2);
            this.f2672a.getOverlay().add(view2);
            this.f2674d = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        g();
    }

    @Override // z0.k
    public final void a(m mVar) {
    }

    @Override // z0.k
    public final void e() {
    }

    @Override // z0.k
    public final void f() {
    }
}
