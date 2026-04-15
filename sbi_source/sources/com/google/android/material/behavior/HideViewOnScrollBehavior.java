package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
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
public class HideViewOnScrollBehavior<V extends View> extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a0.a f531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AccessibilityManager f532b;
    public f1.a c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f535f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TimeInterpolator f536g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TimeInterpolator f537h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ViewPropertyAnimator f540k;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f533d = new LinkedHashSet();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f538i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f539j = 2;

    public HideViewOnScrollBehavior() {
    }

    @Override // s.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        if (this.f532b == null) {
            this.f532b = (AccessibilityManager) b.b(view.getContext(), AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.f532b;
        if (accessibilityManager != null && this.c == null) {
            f1.a aVar = new f1.a(this, view, 1);
            this.c = aVar;
            accessibilityManager.addTouchExplorationStateChangeListener(aVar);
            view.addOnAttachStateChangeListener(new d(3, this));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i3 = ((s.d) view.getLayoutParams()).c;
        if (i3 == 80 || i3 == 81) {
            r(1);
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(i3, i2);
            r((absoluteGravity == 3 || absoluteGravity == 19) ? 2 : 0);
        }
        this.f538i = this.f531a.x(view, marginLayoutParams);
        this.f534e = a0.a.a0(view.getContext(), R.NP_MANAGER3.NP_MANAGER, 225);
        this.f535f = a0.a.a0(view.getContext(), R.NP_MANAGER3.NP_MANAGER, 175);
        this.f536g = a0.a.b0(view.getContext(), R.NP_MANAGER3.NP_MANAGER, d1.a.f834d);
        this.f537h = a0.a.b0(view.getContext(), R.NP_MANAGER3.NP_MANAGER, d1.a.c);
        return false;
    }

    @Override // s.a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int[] iArr) {
        if (i2 <= 0) {
            if (i2 < 0) {
                s(view);
                return;
            }
            return;
        }
        if (this.f539j == 1) {
            return;
        }
        AccessibilityManager accessibilityManager = this.f532b;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            ViewPropertyAnimator viewPropertyAnimator = this.f540k;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f539j = 1;
            Iterator it = this.f533d.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            this.f540k = this.f531a.C(view, this.f538i).setInterpolator(this.f537h).setDuration(this.f535f).setListener(new f.b(2, this));
        }
    }

    @Override // s.a
    public final boolean o(View view, int i2, int i3) {
        return i2 == 2;
    }

    public final void r(int i2) {
        a0.a aVar = this.f531a;
        if (aVar == null || aVar.A() != i2) {
            if (i2 == 0) {
                this.f531a = new f1.b(2);
                return;
            }
            if (i2 == 1) {
                this.f531a = new f1.b(0);
            } else {
                if (i2 == 2) {
                    this.f531a = new f1.b(1);
                    return;
                }
                throw new IllegalArgumentException("Invalid view edge position value: " + i2 + ". Must be 0, 1 or 2.");
            }
        }
    }

    public final void s(View view) {
        if (this.f539j == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f540k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f539j = 2;
        Iterator it = this.f533d.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.f531a.getClass();
        this.f540k = this.f531a.C(view, 0).setInterpolator(this.f536g).setDuration(this.f534e).setListener(new f.b(2, this));
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
