package e;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class d implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f858b;

    public /* synthetic */ d(int i2, Object obj) {
        this.f857a = i2;
        this.f858b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f857a) {
            case 0:
            case 1:
            case 2:
            case 3:
                break;
            default:
                w1.p pVar = (w1.p) this.f858b;
                AccessibilityManager accessibilityManager = pVar.f2567t;
                if (pVar.f2568u != null && accessibilityManager != null && pVar.isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(pVar.f2568u);
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        AccessibilityManager accessibilityManager2;
        AccessibilityManager accessibilityManager3;
        switch (this.f857a) {
            case 0:
                g gVar = (g) this.f858b;
                ViewTreeObserver viewTreeObserver = gVar.f885x;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        gVar.f885x = view.getViewTreeObserver();
                    }
                    gVar.f885x.removeGlobalOnLayoutListener(gVar.f870i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 1:
                s sVar = (s) this.f858b;
                ViewTreeObserver viewTreeObserver2 = sVar.f960o;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        sVar.f960o = view.getViewTreeObserver();
                    }
                    sVar.f960o.removeGlobalOnLayoutListener(sVar.f954i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 2:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.f858b;
                f1.a aVar = hideBottomViewOnScrollBehavior.f527h;
                if (aVar != null && (accessibilityManager = hideBottomViewOnScrollBehavior.f526g) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(aVar);
                    hideBottomViewOnScrollBehavior.f527h = null;
                    break;
                }
                break;
            case 3:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.f858b;
                f1.a aVar2 = hideViewOnScrollBehavior.c;
                if (aVar2 != null && (accessibilityManager2 = hideViewOnScrollBehavior.f532b) != null) {
                    accessibilityManager2.removeTouchExplorationStateChangeListener(aVar2);
                    hideViewOnScrollBehavior.c = null;
                    break;
                }
                break;
            default:
                w1.p pVar = (w1.p) this.f858b;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = pVar.f2568u;
                if (touchExplorationStateChangeListener != null && (accessibilityManager3 = pVar.f2567t) != null) {
                    accessibilityManager3.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                    break;
                }
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }
}
