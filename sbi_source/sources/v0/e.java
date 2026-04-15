package v0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class e extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2311a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2312b;
    public final /* synthetic */ int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f2313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2314e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2315f;

    public e(w1.s sVar, int i2, TextView textView, int i3, TextView textView2) {
        this.f2315f = sVar;
        this.f2312b = i2;
        this.f2313d = textView;
        this.c = i3;
        this.f2314e = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f2311a) {
            case 0:
                int i2 = this.f2312b;
                View view = this.f2313d;
                if (i2 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (this.c != 0) {
                    view.setTranslationY(0.0f);
                }
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        f.m0 m0Var;
        switch (this.f2311a) {
            case 0:
                ((ViewPropertyAnimator) this.f2314e).setListener(null);
                h hVar = (h) this.f2315f;
                hVar.a(null);
                hVar.f2327p.remove((Object) null);
                hVar.f();
                break;
            default:
                TextView textView = (TextView) this.f2314e;
                w1.s sVar = (w1.s) this.f2315f;
                sVar.f2586n = this.f2312b;
                sVar.f2584l = null;
                TextView textView2 = (TextView) this.f2313d;
                if (textView2 != null) {
                    textView2.setVisibility(4);
                    if (this.c == 1 && (m0Var = sVar.f2590r) != null) {
                        m0Var.setText((CharSequence) null);
                    }
                }
                if (textView != null) {
                    textView.setTranslationY(0.0f);
                    textView.setAlpha(1.0f);
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f2311a) {
            case 0:
                ((h) this.f2315f).getClass();
                break;
            default:
                TextView textView = (TextView) this.f2314e;
                if (textView != null) {
                    textView.setVisibility(0);
                    textView.setAlpha(0.0f);
                }
                break;
        }
    }

    public e(h hVar, o0 o0Var, int i2, View view, int i3, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2315f = hVar;
        this.f2312b = i2;
        this.f2313d = view;
        this.c = i3;
        this.f2314e = viewPropertyAnimator;
    }
}
