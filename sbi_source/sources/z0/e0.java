package z0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends AnimatorListenerAdapter implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f2667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2668b;
    public final ViewGroup c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2670e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2671f = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f2669d = true;

    public e0(View view, int i2) {
        this.f2667a = view;
        this.f2668b = i2;
        this.c = (ViewGroup) view.getParent();
        g(true);
    }

    @Override // z0.k
    public final void d(m mVar) {
        mVar.x(this);
    }

    @Override // z0.k
    public final void e() {
        g(false);
        if (this.f2671f) {
            return;
        }
        w.b(this.f2667a, this.f2668b);
    }

    @Override // z0.k
    public final void f() {
        g(true);
        if (this.f2671f) {
            return;
        }
        w.b(this.f2667a, 0);
    }

    public final void g(boolean z) {
        ViewGroup viewGroup;
        if (!this.f2669d || this.f2670e == z || (viewGroup = this.c) == null) {
            return;
        }
        this.f2670e = z;
        t1.e.P(viewGroup, z);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f2671f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f2671f) {
            w.b(this.f2667a, this.f2668b);
            ViewGroup viewGroup = this.c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            w.b(this.f2667a, 0);
            ViewGroup viewGroup = this.c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        if (!this.f2671f) {
            w.b(this.f2667a, this.f2668b);
            ViewGroup viewGroup = this.c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }

    @Override // z0.k
    public final void a(m mVar) {
    }

    @Override // z0.k
    public final void c(m mVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
