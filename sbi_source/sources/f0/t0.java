package f0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1291a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1292b;
    public final /* synthetic */ Object c;

    public t0(a1 a1Var, View view) {
        this.f1292b = a1Var;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f1291a) {
            case 0:
                ((a1) this.f1292b).f1225a.d(1.0f);
                v0.e((View) this.c);
                break;
            default:
                ((i.f) this.f1292b).remove(animator);
                ((z0.m) this.c).f2707n.remove(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f1291a) {
            case 1:
                ((z0.m) this.c).f2707n.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public t0(z0.m mVar, i.f fVar) {
        this.c = mVar;
        this.f1292b = fVar;
    }
}
