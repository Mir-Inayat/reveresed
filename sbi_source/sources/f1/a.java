package f1;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1315b;
    public final /* synthetic */ s.a c;

    public /* synthetic */ a(s.a aVar, View view, int i2) {
        this.f1314a = i2;
        this.c = aVar;
        this.f1315b = view;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        switch (this.f1314a) {
            case 0:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.c;
                if (z && hideBottomViewOnScrollBehavior.f529j == 1) {
                    hideBottomViewOnScrollBehavior.r(this.f1315b);
                    break;
                }
                break;
            default:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.c;
                if (z && hideViewOnScrollBehavior.f539j == 1) {
                    hideViewOnScrollBehavior.s(this.f1315b);
                    break;
                }
                break;
        }
    }
}
