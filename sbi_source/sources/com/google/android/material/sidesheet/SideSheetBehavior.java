package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.redhand.laugiytr.R;
import f0.c0;
import f0.m0;
import g0.s;
import h1.b;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedHashSet;
import s.a;
import s.d;
import t1.e;
import t1.k;
import t1.n;
import t1.o;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f651b;
    public final ColorStateList c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.fragment.app.a f653e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f654f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f655g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f656h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public m0.e f657i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f658j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f659k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f660l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f661m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f662n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f663o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public WeakReference f664p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public WeakReference f665q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f666r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public VelocityTracker f667s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f668t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final LinkedHashSet f669u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final b f670v;

    public SideSheetBehavior() {
        this.f653e = new androidx.fragment.app.a(this);
        this.f655g = true;
        this.f656h = 5;
        this.f659k = 0.1f;
        this.f666r = -1;
        this.f669u = new LinkedHashSet();
        this.f670v = new b(this, 1);
    }

    @Override // s.a
    public final void c(d dVar) {
        this.f664p = null;
        this.f657i = null;
    }

    @Override // s.a
    public final void e() {
        this.f664p = null;
        this.f657i = null;
    }

    @Override // s.a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        m0.e eVar;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && m0.b(view) == null) || !this.f655g) {
            this.f658j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f667s) != null) {
            velocityTracker.recycle();
            this.f667s = null;
        }
        if (this.f667s == null) {
            this.f667s = VelocityTracker.obtain();
        }
        this.f667s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f668t = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f658j) {
            this.f658j = false;
            return false;
        }
        return (this.f658j || (eVar = this.f657i) == null || !eVar.p(motionEvent)) ? false : true;
    }

    @Override // s.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        View view2;
        View view3;
        int i3;
        View viewFindViewById;
        int i4 = 1;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.f664p;
        k kVar = this.f651b;
        int iY = 0;
        if (weakReference == null) {
            this.f664p = new WeakReference(view);
            new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
            Context context = view.getContext();
            a0.a.a0(context, R.NP_MANAGER3.NP_MANAGER, 300);
            a0.a.a0(context, R.NP_MANAGER3.NP_MANAGER, 150);
            a0.a.a0(context, R.NP_MANAGER3.NP_MANAGER, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.NP_MANAGER6.NP_MANAGER);
            resources.getDimension(R.NP_MANAGER6.NP_MANAGER);
            resources.getDimension(R.NP_MANAGER6.NP_MANAGER);
            if (kVar != null) {
                view.setBackground(kVar);
                float elevation = this.f654f;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                kVar.m(elevation);
            } else {
                ColorStateList colorStateList = this.c;
                if (colorStateList != null) {
                    Field field = m0.f1276a;
                    c0.q(view, colorStateList);
                }
            }
            int i5 = this.f656h == 5 ? 4 : 0;
            if (view.getVisibility() != i5) {
                view.setVisibility(i5);
            }
            u();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (m0.b(view) == null) {
                m0.k(view, view.getResources().getString(R.NP_MANAGER14.NP_MANAGER));
            }
        }
        int i6 = Gravity.getAbsoluteGravity(((d) view.getLayoutParams()).c, i2) == 3 ? 1 : 0;
        e eVar = this.f650a;
        if (eVar == null || eVar.A() != i6) {
            d dVar = null;
            o oVar = this.f652d;
            if (i6 == 0) {
                this.f650a = new u1.a(this, i4);
                if (oVar != null) {
                    WeakReference weakReference2 = this.f664p;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof d)) {
                        dVar = (d) view3.getLayoutParams();
                    }
                    if (dVar == null || ((ViewGroup.MarginLayoutParams) dVar).rightMargin <= 0) {
                        n nVarF = oVar.f();
                        nVarF.f2233f = new t1.a(0.0f);
                        nVarF.f2234g = new t1.a(0.0f);
                        o oVarA = nVarF.a();
                        if (kVar != null) {
                            kVar.setShapeAppearanceModel(oVarA);
                        }
                    }
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalArgumentException("Invalid sheet edge position value: " + i6 + ". Must be 0 or 1.");
                }
                this.f650a = new u1.a(this, iY);
                if (oVar != null) {
                    WeakReference weakReference3 = this.f664p;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof d)) {
                        dVar = (d) view2.getLayoutParams();
                    }
                    if (dVar == null || ((ViewGroup.MarginLayoutParams) dVar).leftMargin <= 0) {
                        n nVarF2 = oVar.f();
                        nVarF2.f2232e = new t1.a(0.0f);
                        nVarF2.f2235h = new t1.a(0.0f);
                        o oVarA2 = nVarF2.a();
                        if (kVar != null) {
                            kVar.setShapeAppearanceModel(oVarA2);
                        }
                    }
                }
            }
        }
        if (this.f657i == null) {
            this.f657i = new m0.e(coordinatorLayout.getContext(), coordinatorLayout, this.f670v);
        }
        int iY2 = this.f650a.y(view);
        coordinatorLayout.q(view, i2);
        this.f661m = coordinatorLayout.getWidth();
        this.f662n = this.f650a.z(coordinatorLayout);
        this.f660l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f663o = marginLayoutParams != null ? this.f650a.b(marginLayoutParams) : 0;
        int i7 = this.f656h;
        if (i7 == 1 || i7 == 2) {
            iY = iY2 - this.f650a.y(view);
        } else if (i7 != 3) {
            if (i7 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.f656h);
            }
            iY = this.f650a.v();
        }
        Field field2 = m0.f1276a;
        view.offsetLeftAndRight(iY);
        if (this.f665q == null && (i3 = this.f666r) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i3)) != null) {
            this.f665q = new WeakReference(viewFindViewById);
        }
        Iterator it = this.f669u.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // s.a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i2, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // s.a
    public final void m(View view, Parcelable parcelable) {
        int i2 = ((u1.d) parcelable).c;
        if (i2 == 1 || i2 == 2) {
            i2 = 5;
        }
        this.f656h = i2;
    }

    @Override // s.a
    public final Parcelable n(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new u1.d(this);
    }

    @Override // s.a
    public final boolean q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f656h == 1 && actionMasked == 0) {
            return true;
        }
        if (s()) {
            this.f657i.j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f667s) != null) {
            velocityTracker.recycle();
            this.f667s = null;
        }
        if (this.f667s == null) {
            this.f667s = VelocityTracker.obtain();
        }
        this.f667s.addMovement(motionEvent);
        if (s() && actionMasked == 2 && !this.f658j && s()) {
            float fAbs = Math.abs(this.f668t - motionEvent.getX());
            m0.e eVar = this.f657i;
            if (fAbs > eVar.f1582b) {
                eVar.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f658j;
    }

    public final void r(int i2) {
        View view;
        if (this.f656h == i2) {
            return;
        }
        this.f656h = i2;
        WeakReference weakReference = this.f664p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i3 = this.f656h == 5 ? 4 : 0;
        if (view.getVisibility() != i3) {
            view.setVisibility(i3);
        }
        Iterator it = this.f669u.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        u();
    }

    public final boolean s() {
        if (this.f657i != null) {
            return this.f655g || this.f656h == 1;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        if (r1.o(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        r(2);
        r2.f653e.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            r0 = 3
            if (r4 == r0) goto L21
            r0 = 5
            if (r4 != r0) goto Ld
            t1.e r0 = r2.f650a
            int r0 = r0.v()
            goto L27
        Ld:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Invalid state to get outer edge offset: "
            r5.<init>(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.<init>(r4)
            throw r3
        L21:
            t1.e r0 = r2.f650a
            int r0 = r0.u()
        L27:
            m0.e r1 = r2.f657i
            if (r1 == 0) goto L5f
            if (r5 == 0) goto L38
            int r3 = r3.getTop()
            boolean r3 = r1.o(r0, r3)
            if (r3 == 0) goto L5f
            goto L55
        L38:
            int r5 = r3.getTop()
            r1.f1597r = r3
            r3 = -1
            r1.c = r3
            r3 = 0
            boolean r3 = r1.h(r0, r5, r3, r3)
            if (r3 != 0) goto L53
            int r5 = r1.f1581a
            if (r5 != 0) goto L53
            android.view.View r5 = r1.f1597r
            if (r5 == 0) goto L53
            r5 = 0
            r1.f1597r = r5
        L53:
            if (r3 == 0) goto L5f
        L55:
            r3 = 2
            r2.r(r3)
            androidx.fragment.app.a r3 = r2.f653e
            r3.a(r4)
            return
        L5f:
            r2.r(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.t(android.view.View, int, boolean):void");
    }

    public final void u() {
        View view;
        WeakReference weakReference = this.f664p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        m0.g(view, 262144);
        m0.e(view, 0);
        m0.g(view, 1048576);
        m0.e(view, 0);
        final int i2 = 5;
        if (this.f656h != 5) {
            m0.h(view, g0.d.f1329j, new s() { // from class: u1.b
                @Override // g0.s
                public final boolean d(View view2) {
                    int i3 = i2;
                    if (i3 == 1 || i3 == 2) {
                        StringBuilder sb = new StringBuilder("STATE_");
                        sb.append(i3 == 1 ? "DRAGGING" : "SETTLING");
                        sb.append(" should not be set externally.");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    SideSheetBehavior sideSheetBehavior = this.f2285a;
                    WeakReference weakReference2 = sideSheetBehavior.f664p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.r(i3);
                        return true;
                    }
                    View view3 = (View) sideSheetBehavior.f664p.get();
                    c cVar = new c(sideSheetBehavior, i3, 0);
                    ViewParent parent = view3.getParent();
                    if (parent != null && parent.isLayoutRequested() && view3.isAttachedToWindow()) {
                        view3.post(cVar);
                        return true;
                    }
                    cVar.run();
                    return true;
                }
            });
        }
        final int i3 = 3;
        if (this.f656h != 3) {
            m0.h(view, g0.d.f1327h, new s() { // from class: u1.b
                @Override // g0.s
                public final boolean d(View view2) {
                    int i32 = i3;
                    if (i32 == 1 || i32 == 2) {
                        StringBuilder sb = new StringBuilder("STATE_");
                        sb.append(i32 == 1 ? "DRAGGING" : "SETTLING");
                        sb.append(" should not be set externally.");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    SideSheetBehavior sideSheetBehavior = this.f2285a;
                    WeakReference weakReference2 = sideSheetBehavior.f664p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.r(i32);
                        return true;
                    }
                    View view3 = (View) sideSheetBehavior.f664p.get();
                    c cVar = new c(sideSheetBehavior, i32, 0);
                    ViewParent parent = view3.getParent();
                    if (parent != null && parent.isLayoutRequested() && view3.isAttachedToWindow()) {
                        view3.post(cVar);
                        return true;
                    }
                    cVar.run();
                    return true;
                }
            });
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f653e = new androidx.fragment.app.a(this);
        this.f655g = true;
        this.f656h = 5;
        this.f659k = 0.1f;
        this.f666r = -1;
        this.f669u = new LinkedHashSet();
        this.f670v = new b(this, 1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c1.a.f510t);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.c = a0.a.o(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f652d = o.b(context, attributeSet, 0, R.NP_MANAGER15.NP_MANAGER).a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.f666r = resourceId;
            WeakReference weakReference = this.f665q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f665q = null;
            WeakReference weakReference2 = this.f664p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1 && view.isLaidOut()) {
                    view.requestLayout();
                }
            }
        }
        o oVar = this.f652d;
        if (oVar != null) {
            k kVar = new k(oVar);
            this.f651b = kVar;
            kVar.k(context);
            ColorStateList colorStateList = this.c;
            if (colorStateList != null) {
                this.f651b.n(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f651b.setTint(typedValue.data);
            }
        }
        this.f654f = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.f655g = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
