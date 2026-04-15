package w1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class d extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f2515b;

    public /* synthetic */ d(e eVar, int i2) {
        this.f2514a = i2;
        this.f2515b = eVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f2514a) {
            case 1:
                this.f2515b.f2571b.h(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f2514a) {
            case 0:
                this.f2515b.f2571b.h(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
