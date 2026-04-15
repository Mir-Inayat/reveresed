package v0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class j extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2338a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f2339b;

    public j(k kVar) {
        this.f2339b = kVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f2338a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f2338a) {
            this.f2338a = false;
            return;
        }
        k kVar = this.f2339b;
        if (((Float) kVar.f2361u.getAnimatedValue()).floatValue() == 0.0f) {
            kVar.f2362v = 0;
            kVar.f(0);
        } else {
            kVar.f2362v = 2;
            kVar.f2354n.invalidate();
        }
    }
}
