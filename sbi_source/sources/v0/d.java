package v0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class d extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f2307b;
    public final /* synthetic */ ViewPropertyAnimator c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f2308d;

    public /* synthetic */ d(h hVar, Object obj, ViewPropertyAnimator viewPropertyAnimator, View view, int i2) {
        this.f2306a = i2;
        this.f2308d = hVar;
        this.c = viewPropertyAnimator;
        this.f2307b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f2306a) {
            case 1:
                this.f2307b.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2306a) {
            case 0:
                this.c.setListener(null);
                this.f2307b.setAlpha(1.0f);
                h hVar = this.f2308d;
                hVar.a(null);
                hVar.f2328q.remove((Object) null);
                hVar.f();
                break;
            case 1:
                this.c.setListener(null);
                h hVar2 = this.f2308d;
                hVar2.a(null);
                hVar2.f2326o.remove((Object) null);
                hVar2.f();
                break;
            case 2:
                this.c.setListener(null);
                View view = this.f2307b;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                h hVar3 = this.f2308d;
                hVar3.a(null);
                hVar3.f2329r.remove((Object) null);
                hVar3.f();
                break;
            default:
                this.c.setListener(null);
                View view2 = this.f2307b;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                h hVar4 = this.f2308d;
                hVar4.a(null);
                hVar4.f2329r.remove((Object) null);
                hVar4.f();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f2306a) {
            case 0:
                this.f2308d.getClass();
                break;
            case 1:
                this.f2308d.getClass();
                break;
            case 2:
                this.f2308d.getClass();
                break;
            default:
                this.f2308d.getClass();
                break;
        }
    }

    public d(h hVar, o0 o0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2306a = 1;
        this.f2308d = hVar;
        this.f2307b = view;
        this.c = viewPropertyAnimator;
    }
}
