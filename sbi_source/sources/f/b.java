package f;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class b extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f989b;

    public /* synthetic */ b(int i2, Object obj) {
        this.f988a = i2;
        this.f989b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f988a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f989b;
                actionBarOverlayLayout.f71t = null;
                actionBarOverlayLayout.f60i = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f988a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f989b;
                actionBarOverlayLayout.f71t = null;
                actionBarOverlayLayout.f60i = false;
                break;
            case 1:
                ((HideBottomViewOnScrollBehavior) this.f989b).f530k = null;
                break;
            case 2:
                ((HideViewOnScrollBehavior) this.f989b).f540k = null;
                break;
            case 3:
                w1.l lVar = (w1.l) this.f989b;
                lVar.p();
                lVar.f2543r.start();
                break;
            default:
                ((z0.m) this.f989b).m();
                animator.removeListener(this);
                break;
        }
    }
}
