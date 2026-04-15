package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.redhand.laugiytr.R;
import e.d;
import java.util.Iterator;
import java.util.LinkedHashSet;
import s.a;
import v.b;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class HideBottomViewOnScrollBehavior<V extends View> extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f522b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TimeInterpolator f523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TimeInterpolator f524e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AccessibilityManager f526g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f1.a f527h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ViewPropertyAnimator f530k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f521a = new LinkedHashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f525f = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f528i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f529j = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // s.a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        this.f525f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f522b = a0.a.a0(view.getContext(), R.NP_MANAGER3.NP_MANAGER, 225);
        this.c = a0.a.a0(view.getContext(), R.NP_MANAGER3.NP_MANAGER, 175);
        this.f523d = a0.a.b0(view.getContext(), R.NP_MANAGER3.NP_MANAGER, d1.a.f834d);
        this.f524e = a0.a.b0(view.getContext(), R.NP_MANAGER3.NP_MANAGER, d1.a.c);
        if (this.f526g == null) {
            this.f526g = (AccessibilityManager) b.b(view.getContext(), AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.f526g;
        if (accessibilityManager == null || this.f527h != null) {
            return false;
        }
        f1.a aVar = new f1.a(this, view, 0);
        this.f527h = aVar;
        accessibilityManager.addTouchExplorationStateChangeListener(aVar);
        view.addOnAttachStateChangeListener(new d(2, this));
        return false;
    }

    @Override // s.a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i2 <= 0) {
            if (i2 < 0) {
                r(view);
                return;
            }
            return;
        }
        if (this.f529j == 1) {
            return;
        }
        if (this.f528i && (accessibilityManager = this.f526g) != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f530k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f529j = 1;
        Iterator it = this.f521a.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.f530k = view.animate().translationY(this.f525f).setInterpolator(this.f524e).setDuration(this.c).setListener(new f.b(1, this));
    }

    @Override // s.a
    public boolean o(View view, int i2, int i3) {
        return i2 == 2;
    }

    public final void r(View view) {
        if (this.f529j == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f530k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f529j = 2;
        Iterator it = this.f521a.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.f530k = view.animate().translationY(0).setInterpolator(this.f523d).setDuration(this.f522b).setListener(new f.b(1, this));
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
