package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.emoji2.text.q;
import c0.i;
import com.redhand.laugiytr.R;
import d0.g;
import f.e0;
import f0.c0;
import f0.m0;
import f0.u0;
import f0.v0;
import f0.x0;
import g0.d;
import h1.b;
import h1.c;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import m0.e;
import o1.l;
import o1.m;
import s.a;
import t1.k;
import t1.o;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends a {
    public final androidx.fragment.app.a A;
    public final ValueAnimator B;
    public final int C;
    public int D;
    public int E;
    public final float F;
    public int G;
    public final float H;
    public boolean I;
    public boolean J;
    public final boolean K;
    public final boolean L;
    public boolean M;
    public int N;
    public e O;
    public boolean P;
    public int Q;
    public boolean R;
    public final float S;
    public int T;
    public int U;
    public int V;
    public WeakReference W;
    public WeakReference X;
    public final ArrayList Y;
    public VelocityTracker Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f547a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f548a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f549b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f550b0;
    public final float c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f551c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f552d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public HashMap f553d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f554e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final SparseIntArray f555e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f556f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final b f557f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f558g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f559h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k f560i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ColorStateList f561j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f562k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f563l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f564m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f565n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f566o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f567p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f568q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f569r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f570s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f571t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f572u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f573v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f574w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f575x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final o f576y;
    public boolean z;

    public BottomSheetBehavior() {
        this.f547a = 0;
        this.f549b = true;
        this.f562k = -1;
        this.f563l = -1;
        this.A = new androidx.fragment.app.a(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = true;
        this.N = 4;
        this.S = 0.1f;
        this.Y = new ArrayList();
        this.f550b0 = -1;
        this.f555e0 = new SparseIntArray();
        this.f557f0 = new b(this, 0);
    }

    public static View v(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View viewV = v(viewGroup.getChildAt(i2));
            if (viewV != null) {
                return viewV;
            }
        }
        return null;
    }

    public static int w(int i2, int i3, int i4, int i5) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, i3, i5);
        if (i4 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i4), 1073741824);
        }
        if (size != 0) {
            i4 = Math.min(size, i4);
        }
        return View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
    }

    public final void A(int i2) {
        if (i2 == -1) {
            if (this.f556f) {
                return;
            } else {
                this.f556f = true;
            }
        } else {
            if (!this.f556f && this.f554e == i2) {
                return;
            }
            this.f556f = false;
            this.f554e = Math.max(0, i2);
        }
        I();
    }

    public final void B(int i2) {
        if (i2 == 1 || i2 == 2) {
            StringBuilder sb = new StringBuilder("STATE_");
            sb.append(i2 == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        if (!this.I && i2 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i2);
            return;
        }
        int i3 = (i2 == 6 && this.f549b && y(i2) <= this.D) ? 3 : i2;
        WeakReference weakReference = this.W;
        if (weakReference == null || weakReference.get() == null) {
            C(i2);
            return;
        }
        View view = (View) this.W.get();
        e0 e0Var = new e0(this, view, i3);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(e0Var);
        } else {
            e0Var.run();
        }
    }

    public final void C(int i2) {
        if (this.N == i2) {
            return;
        }
        this.N = i2;
        if (i2 != 4 && i2 != 3 && i2 != 6) {
            boolean z = this.I;
        }
        WeakReference weakReference = this.W;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i2 == 3) {
            H(true);
        } else if (i2 == 6 || i2 == 5 || i2 == 4) {
            H(false);
        }
        G(i2, true);
        ArrayList arrayList = this.Y;
        if (arrayList.size() <= 0) {
            F();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final boolean D(View view, float f3) {
        if (this.J) {
            return true;
        }
        if (view.getTop() < this.G) {
            return false;
        }
        return Math.abs(((f3 * this.S) + ((float) view.getTop())) - ((float) this.G)) / ((float) t()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        C(2);
        G(r4, true);
        r2.A.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r1.o(r3.getLeft(), r0) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            int r0 = r2.y(r4)
            m0.e r1 = r2.O
            if (r1 == 0) goto L40
            if (r5 == 0) goto L15
            int r3 = r3.getLeft()
            boolean r3 = r1.o(r3, r0)
            if (r3 == 0) goto L40
            goto L32
        L15:
            int r5 = r3.getLeft()
            r1.f1597r = r3
            r3 = -1
            r1.c = r3
            r3 = 0
            boolean r3 = r1.h(r5, r0, r3, r3)
            if (r3 != 0) goto L30
            int r5 = r1.f1581a
            if (r5 != 0) goto L30
            android.view.View r5 = r1.f1597r
            if (r5 == 0) goto L30
            r5 = 0
            r1.f1597r = r5
        L30:
            if (r3 == 0) goto L40
        L32:
            r3 = 2
            r2.C(r3)
            r3 = 1
            r2.G(r4, r3)
            androidx.fragment.app.a r3 = r2.A
            r3.a(r4)
            return
        L40:
            r2.C(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.E(android.view.View, int, boolean):void");
    }

    public final void F() {
        View view;
        int iA;
        WeakReference weakReference = this.W;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        m0.g(view, 524288);
        m0.e(view, 0);
        m0.g(view, 262144);
        m0.e(view, 0);
        m0.g(view, 1048576);
        m0.e(view, 0);
        SparseIntArray sparseIntArray = this.f555e0;
        int i2 = sparseIntArray.get(0, -1);
        if (i2 != -1) {
            m0.g(view, i2);
            m0.e(view, 0);
            sparseIntArray.delete(0);
        }
        if (!this.f549b && this.N != 6) {
            String string = view.getResources().getString(R.NP_MANAGER14.NP_MANAGER);
            i iVar = new i(this, 6);
            ArrayList arrayListC = m0.c(view);
            int i3 = 0;
            while (true) {
                if (i3 >= arrayListC.size()) {
                    int i4 = 0;
                    int i5 = -1;
                    while (true) {
                        int[] iArr = m0.c;
                        if (i4 >= 32 || i5 != -1) {
                            break;
                        }
                        int i6 = iArr[i4];
                        boolean z = true;
                        for (int i7 = 0; i7 < arrayListC.size(); i7++) {
                            z &= ((d) arrayListC.get(i7)).a() != i6;
                        }
                        if (z) {
                            i5 = i6;
                        }
                        i4++;
                    }
                    iA = i5;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((d) arrayListC.get(i3)).f1332a).getLabel())) {
                        iA = ((d) arrayListC.get(i3)).a();
                        break;
                    }
                    i3++;
                }
            }
            if (iA != -1) {
                d dVar = new d(null, iA, string, iVar, null);
                View.AccessibilityDelegate accessibilityDelegateA = m0.a(view);
                f0.b bVar = accessibilityDelegateA == null ? null : accessibilityDelegateA instanceof f0.a ? ((f0.a) accessibilityDelegateA).f1224a : new f0.b(accessibilityDelegateA);
                if (bVar == null) {
                    bVar = new f0.b();
                }
                m0.j(view, bVar);
                m0.g(view, dVar.a());
                m0.c(view).add(dVar);
                m0.e(view, 0);
            }
            sparseIntArray.put(0, iA);
        }
        if (this.I && this.N != 5) {
            m0.h(view, d.f1329j, new i(this, 5));
        }
        int i8 = this.N;
        if (i8 == 3) {
            m0.h(view, d.f1328i, new i(this, this.f549b ? 4 : 6));
            return;
        }
        if (i8 == 4) {
            m0.h(view, d.f1327h, new i(this, this.f549b ? 3 : 6));
        } else {
            if (i8 != 6) {
                return;
            }
            m0.h(view, d.f1328i, new i(this, 4));
            m0.h(view, d.f1327h, new i(this, 3));
        }
    }

    public final void G(int i2, boolean z) {
        k kVar;
        if (i2 == 2) {
            return;
        }
        boolean z2 = this.N == 3 && (this.f575x || z());
        if (this.z == z2 || (kVar = this.f560i) == null) {
            return;
        }
        this.z = z2;
        ValueAnimator valueAnimator = this.B;
        if (z && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(kVar.f2205b.f2195j, z2 ? s() : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float fS = this.z ? s() : 1.0f;
        t1.i iVar = kVar.f2205b;
        if (iVar.f2195j != fS) {
            iVar.f2195j = fS;
            kVar.f2208f = true;
            kVar.f2209g = true;
            kVar.invalidateSelf();
        }
    }

    public final void H(boolean z) {
        WeakReference weakReference = this.W;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.f553d0 != null) {
                    return;
                } else {
                    this.f553d0 = new HashMap(childCount);
                }
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                if (childAt != this.W.get() && z) {
                    this.f553d0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.f553d0 = null;
        }
    }

    public final void I() {
        View view;
        if (this.W != null) {
            r();
            if (this.N != 4 || (view = (View) this.W.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // s.a
    public final void c(s.d dVar) {
        this.W = null;
        this.O = null;
    }

    @Override // s.a
    public final void e() {
        this.W = null;
        this.O = null;
    }

    @Override // s.a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i2;
        e eVar;
        if (!view.isShown() || !this.K) {
            this.P = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f548a0 = -1;
            this.f550b0 = -1;
            VelocityTracker velocityTracker = this.Z;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.Z = null;
            }
        }
        if (this.Z == null) {
            this.Z = VelocityTracker.obtain();
        }
        this.Z.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            this.f550b0 = y2;
            if (this.N != 2) {
                WeakReference weakReference = this.X;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.o(view2, x2, y2)) {
                    this.f548a0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f551c0 = true;
                }
            }
            this.P = this.f548a0 == -1 && !coordinatorLayout.o(view, x2, this.f550b0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f551c0 = false;
            this.f548a0 = -1;
            if (this.P) {
                this.P = false;
                return false;
            }
        }
        if (this.P || (eVar = this.O) == null || !eVar.p(motionEvent)) {
            WeakReference weakReference2 = this.X;
            View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
            if (actionMasked != 2 || view3 == null || this.P || this.N == 1 || coordinatorLayout.o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.O == null || (i2 = this.f550b0) == -1 || Math.abs(i2 - motionEvent.getY()) <= this.O.f1582b) {
                return false;
            }
        }
        return true;
    }

    @Override // s.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.W == null) {
            this.f558g = coordinatorLayout.getResources().getDimensionPixelSize(R.NP_MANAGER6.NP_MANAGER);
            int i3 = Build.VERSION.SDK_INT;
            boolean z = (i3 < 29 || this.f565n || this.f556f) ? false : true;
            if (this.f566o || this.f567p || this.f568q || this.f570s || this.f571t || this.f572u || z) {
                g gVar = new g(this, z);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                m mVar = new m();
                mVar.f1871a = paddingStart;
                mVar.f1872b = paddingEnd;
                mVar.c = paddingBottom;
                q qVar = new q(gVar, mVar, 8);
                Field field = m0.f1276a;
                c0.u(view, qVar);
                if (view.isAttachedToWindow()) {
                    view.requestApplyInsets();
                } else {
                    view.addOnAttachStateChangeListener(new l());
                }
            }
            f0.e eVar = new f0.e(view);
            Field field2 = m0.f1276a;
            if (i3 >= 30) {
                view.setWindowInsetsAnimationCallback(new x0(eVar));
            } else {
                PathInterpolator pathInterpolator = v0.f1296e;
                Object tag = view.getTag(R.NP_MANAGER8.NP_MANAGER);
                View.OnApplyWindowInsetsListener u0Var = new u0(view, eVar);
                view.setTag(R.NP_MANAGER8.NP_MANAGER, u0Var);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(u0Var);
                }
            }
            this.W = new WeakReference(view);
            new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
            Context context = view.getContext();
            a0.a.a0(context, R.NP_MANAGER3.NP_MANAGER, 300);
            a0.a.a0(context, R.NP_MANAGER3.NP_MANAGER, 150);
            a0.a.a0(context, R.NP_MANAGER3.NP_MANAGER, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.NP_MANAGER6.NP_MANAGER);
            resources.getDimension(R.NP_MANAGER6.NP_MANAGER);
            k kVar = this.f560i;
            if (kVar != null) {
                view.setBackground(kVar);
                float elevation = this.H;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                kVar.m(elevation);
            } else {
                ColorStateList colorStateList = this.f561j;
                if (colorStateList != null) {
                    c0.q(view, colorStateList);
                }
            }
            F();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.O == null) {
            this.O = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f557f0);
        }
        int top = view.getTop();
        coordinatorLayout.q(view, i2);
        this.U = coordinatorLayout.getWidth();
        this.V = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.T = height;
        int iMin = this.V;
        int i4 = iMin - height;
        int i5 = this.f574w;
        if (i4 < i5) {
            boolean z2 = this.f569r;
            int i6 = this.f563l;
            if (z2) {
                if (i6 != -1) {
                    iMin = Math.min(iMin, i6);
                }
                this.T = iMin;
            } else {
                int iMin2 = iMin - i5;
                if (i6 != -1) {
                    iMin2 = Math.min(iMin2, i6);
                }
                this.T = iMin2;
            }
        }
        this.D = Math.max(0, this.V - this.T);
        this.E = (int) ((1.0f - this.F) * this.V);
        r();
        int i7 = this.N;
        if (i7 == 3) {
            int iX = x();
            Field field3 = m0.f1276a;
            view.offsetTopAndBottom(iX);
        } else if (i7 == 6) {
            int i8 = this.E;
            Field field4 = m0.f1276a;
            view.offsetTopAndBottom(i8);
        } else if (this.I && i7 == 5) {
            int i9 = this.V;
            Field field5 = m0.f1276a;
            view.offsetTopAndBottom(i9);
        } else if (i7 == 4) {
            int i10 = this.G;
            Field field6 = m0.f1276a;
            view.offsetTopAndBottom(i10);
        } else if (i7 == 1 || i7 == 2) {
            int top2 = top - view.getTop();
            Field field7 = m0.f1276a;
            view.offsetTopAndBottom(top2);
        }
        G(this.N, false);
        this.X = new WeakReference(v(view));
        ArrayList arrayList = this.Y;
        if (arrayList.size() <= 0) {
            return true;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // s.a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(w(i2, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, this.f562k, marginLayoutParams.width), w(i4, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f563l, marginLayoutParams.height));
        return true;
    }

    @Override // s.a
    public final boolean i(View view) {
        WeakReference weakReference = this.X;
        return (weakReference == null || view != weakReference.get() || this.N == 3 || this.M) ? false : true;
    }

    @Override // s.a
    public final void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int[] iArr, int i4) {
        if (i4 == 1) {
            return;
        }
        WeakReference weakReference = this.X;
        View view3 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != view3) {
            return;
        }
        int top = view.getTop();
        int i5 = top - i3;
        boolean z = this.K;
        boolean z2 = this.L;
        if (i3 > 0) {
            if (!this.R && !z2 && view2 == view3 && view2.canScrollVertically(1)) {
                this.M = true;
                return;
            }
            if (i5 < x()) {
                int iX = top - x();
                iArr[1] = iX;
                Field field = m0.f1276a;
                view.offsetTopAndBottom(-iX);
                C(3);
            } else {
                if (!z) {
                    return;
                }
                iArr[1] = i3;
                Field field2 = m0.f1276a;
                view.offsetTopAndBottom(-i3);
                C(1);
            }
        } else if (i3 < 0) {
            boolean zCanScrollVertically = view2.canScrollVertically(-1);
            if (!this.R && !z2 && view2 == view3 && zCanScrollVertically) {
                this.M = true;
                return;
            }
            if (!zCanScrollVertically) {
                int i6 = this.G;
                if (i5 > i6 && !this.I) {
                    int i7 = top - i6;
                    iArr[1] = i7;
                    Field field3 = m0.f1276a;
                    view.offsetTopAndBottom(-i7);
                    C(4);
                } else {
                    if (!z) {
                        return;
                    }
                    iArr[1] = i3;
                    Field field4 = m0.f1276a;
                    view.offsetTopAndBottom(-i3);
                    C(1);
                }
            }
        }
        u(view.getTop());
        this.Q = i3;
        this.R = true;
        this.M = false;
    }

    @Override // s.a
    public final void m(View view, Parcelable parcelable) {
        c cVar = (c) parcelable;
        int i2 = this.f547a;
        if (i2 != 0) {
            if (i2 == -1 || (i2 & 1) == 1) {
                this.f554e = cVar.f1355d;
            }
            if (i2 == -1 || (i2 & 2) == 2) {
                this.f549b = cVar.f1356e;
            }
            if (i2 == -1 || (i2 & 4) == 4) {
                this.I = cVar.f1357f;
            }
            if (i2 == -1 || (i2 & 8) == 8) {
                this.J = cVar.f1358g;
            }
        }
        int i3 = cVar.c;
        if (i3 == 1 || i3 == 2) {
            this.N = 4;
        } else {
            this.N = i3;
        }
    }

    @Override // s.a
    public final Parcelable n(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new c(this);
    }

    @Override // s.a
    public final boolean o(View view, int i2, int i3) {
        this.Q = 0;
        this.R = false;
        return (i2 & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    @Override // s.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(android.view.View r4, android.view.View r5, int r6) {
        /*
            r3 = this;
            int r6 = r4.getTop()
            int r0 = r3.x()
            r1 = 3
            if (r6 != r0) goto Lf
            r3.C(r1)
            return
        Lf:
            java.lang.ref.WeakReference r6 = r3.X
            if (r6 == 0) goto Lb5
            java.lang.Object r6 = r6.get()
            if (r5 != r6) goto Lb5
            boolean r5 = r3.R
            if (r5 != 0) goto L1f
            goto Lb5
        L1f:
            int r5 = r3.Q
            r6 = 6
            if (r5 <= 0) goto L34
            boolean r5 = r3.f549b
            if (r5 == 0) goto L2a
            goto Laf
        L2a:
            int r5 = r4.getTop()
            int r0 = r3.E
            if (r5 <= r0) goto Laf
            goto Lae
        L34:
            boolean r5 = r3.I
            if (r5 == 0) goto L55
            android.view.VelocityTracker r5 = r3.Z
            if (r5 != 0) goto L3e
            r5 = 0
            goto L4d
        L3e:
            r0 = 1000(0x3e8, float:1.401E-42)
            float r2 = r3.c
            r5.computeCurrentVelocity(r0, r2)
            android.view.VelocityTracker r5 = r3.Z
            int r0 = r3.f548a0
            float r5 = r5.getYVelocity(r0)
        L4d:
            boolean r5 = r3.D(r4, r5)
            if (r5 == 0) goto L55
            r1 = 5
            goto Laf
        L55:
            int r5 = r3.Q
            r0 = 4
            if (r5 != 0) goto L93
            int r5 = r4.getTop()
            boolean r2 = r3.f549b
            if (r2 == 0) goto L74
            int r6 = r3.D
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r2 = r3.G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r6 >= r5) goto L97
            goto Laf
        L74:
            int r2 = r3.E
            if (r5 >= r2) goto L83
            int r0 = r3.G
            int r0 = r5 - r0
            int r0 = java.lang.Math.abs(r0)
            if (r5 >= r0) goto Lae
            goto Laf
        L83:
            int r1 = r5 - r2
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L97
            goto Lae
        L93:
            boolean r5 = r3.f549b
            if (r5 == 0) goto L99
        L97:
            r1 = r0
            goto Laf
        L99:
            int r5 = r4.getTop()
            int r1 = r3.E
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L97
        Lae:
            r1 = r6
        Laf:
            r5 = 0
            r3.E(r4, r1, r5)
            r3.R = r5
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.p(android.view.View, android.view.View, int):void");
    }

    @Override // s.a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i2 = this.N;
        if (i2 == 1 && actionMasked == 0) {
            return true;
        }
        e eVar = this.O;
        if (eVar != null && (this.K || i2 == 1)) {
            eVar.j(motionEvent);
        }
        if (actionMasked == 0) {
            this.f548a0 = -1;
            this.f550b0 = -1;
            VelocityTracker velocityTracker = this.Z;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.Z = null;
            }
        }
        if (this.Z == null) {
            this.Z = VelocityTracker.obtain();
        }
        this.Z.addMovement(motionEvent);
        if (this.O != null && ((this.K || this.N == 1) && actionMasked == 2 && !this.P)) {
            float fAbs = Math.abs(this.f550b0 - motionEvent.getY());
            e eVar2 = this.O;
            if (fAbs > eVar2.f1582b) {
                eVar2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.P;
    }

    public final void r() {
        int iT = t();
        if (this.f549b) {
            this.G = Math.max(this.V - iT, this.D);
        } else {
            this.G = this.V - iT;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float s() {
        /*
            r5 = this;
            t1.k r0 = r5.f560i
            r1 = 0
            if (r0 == 0) goto L89
            java.lang.ref.WeakReference r0 = r5.W
            if (r0 == 0) goto L89
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L89
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L89
            java.lang.ref.WeakReference r0 = r5.W
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            boolean r2 = r5.z()
            if (r2 == 0) goto L89
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            if (r0 == 0) goto L89
            t1.k r2 = r5.f560i
            float[] r3 = r2.B
            if (r3 == 0) goto L33
            r2 = 3
            r2 = r3[r2]
            goto L41
        L33:
            t1.i r3 = r2.f2205b
            t1.o r3 = r3.f2187a
            t1.d r3 = r3.f2243e
            android.graphics.RectF r2 = r2.g()
            float r2 = r3.a(r2)
        L41:
            android.view.RoundedCorner r3 = f0.c.h(r0)
            if (r3 == 0) goto L56
            int r3 = f0.c.c(r3)
            float r3 = (float) r3
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 <= 0) goto L56
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L56
            float r3 = r3 / r2
            goto L57
        L56:
            r3 = r1
        L57:
            t1.k r2 = r5.f560i
            float[] r4 = r2.B
            if (r4 == 0) goto L61
            r2 = 0
            r2 = r4[r2]
            goto L6f
        L61:
            t1.i r4 = r2.f2205b
            t1.o r4 = r4.f2187a
            t1.d r4 = r4.f2244f
            android.graphics.RectF r2 = r2.g()
            float r2 = r4.a(r2)
        L6f:
            android.view.RoundedCorner r0 = f0.c.m(r0)
            if (r0 == 0) goto L84
            int r0 = f0.c.c(r0)
            float r0 = (float) r0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L84
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L84
            float r1 = r0 / r2
        L84:
            float r0 = java.lang.Math.max(r3, r1)
            return r0
        L89:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.s():float");
    }

    public final int t() {
        int i2;
        return this.f556f ? Math.min(Math.max(this.f558g, this.V - ((this.U * 9) / 16)), this.T) + this.f573v : (this.f565n || this.f566o || (i2 = this.f564m) <= 0) ? this.f554e + this.f573v : Math.max(this.f554e, i2 + this.f559h);
    }

    public final void u(int i2) {
        if (((View) this.W.get()) != null) {
            ArrayList arrayList = this.Y;
            if (arrayList.isEmpty()) {
                return;
            }
            int i3 = this.G;
            if (i2 <= i3 && i3 != x()) {
                x();
            }
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final int x() {
        if (this.f549b) {
            return this.D;
        }
        return Math.max(this.C, this.f569r ? 0 : this.f574w);
    }

    public final int y(int i2) {
        if (i2 == 3) {
            return x();
        }
        if (i2 == 4) {
            return this.G;
        }
        if (i2 == 5) {
            return this.V;
        }
        if (i2 == 6) {
            return this.E;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i2);
    }

    public final boolean z() {
        WeakReference weakReference = this.W;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.W.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i2;
        int i3 = 0;
        this.f547a = 0;
        this.f549b = true;
        this.f562k = -1;
        this.f563l = -1;
        this.A = new androidx.fragment.app.a(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = true;
        this.N = 4;
        this.S = 0.1f;
        this.Y = new ArrayList();
        this.f550b0 = -1;
        this.f555e0 = new SparseIntArray();
        this.f557f0 = new b(this, i3);
        this.f559h = context.getResources().getDimensionPixelSize(R.NP_MANAGER6.NP_MANAGER);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c1.a.f492a);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f561j = a0.a.o(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(22)) {
            this.f576y = o.b(context, attributeSet, R.NP_MANAGER3.NP_MANAGER, R.NP_MANAGER15.NP_MANAGER).a();
        }
        o oVar = this.f576y;
        if (oVar != null) {
            k kVar = new k(oVar);
            this.f560i = kVar;
            kVar.k(context);
            ColorStateList colorStateList = this.f561j;
            if (colorStateList != null) {
                this.f560i.n(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f560i.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(s(), 1.0f);
        this.B = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.B.addUpdateListener(new h1.a(i3, this));
        this.H = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f562k = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.f563l = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(10);
        if (typedValuePeekValue != null && (i2 = typedValuePeekValue.data) == -1) {
            A(i2);
        } else {
            A(typedArrayObtainStyledAttributes.getDimensionPixelSize(10, -1));
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(9, false);
        if (this.I != z) {
            this.I = z;
            if (!z && this.N == 5) {
                B(4);
            }
            F();
        }
        this.f565n = typedArrayObtainStyledAttributes.getBoolean(14, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(7, true);
        if (this.f549b != z2) {
            this.f549b = z2;
            if (this.W != null) {
                r();
            }
            C((this.f549b && this.N == 6) ? 3 : this.N);
            G(this.N, true);
            F();
        }
        this.J = typedArrayObtainStyledAttributes.getBoolean(13, false);
        this.K = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.L = typedArrayObtainStyledAttributes.getBoolean(5, true);
        this.f547a = typedArrayObtainStyledAttributes.getInt(11, 0);
        float f3 = typedArrayObtainStyledAttributes.getFloat(8, 0.5f);
        if (f3 > 0.0f && f3 < 1.0f) {
            this.F = f3;
            if (this.W != null) {
                this.E = (int) ((1.0f - f3) * this.V);
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(6);
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                int i4 = typedValuePeekValue2.data;
                if (i4 >= 0) {
                    this.C = i4;
                    G(this.N, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(6, 0);
                if (dimensionPixelOffset >= 0) {
                    this.C = dimensionPixelOffset;
                    G(this.N, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f552d = typedArrayObtainStyledAttributes.getInt(12, 500);
            this.f566o = typedArrayObtainStyledAttributes.getBoolean(18, false);
            this.f567p = typedArrayObtainStyledAttributes.getBoolean(19, false);
            this.f568q = typedArrayObtainStyledAttributes.getBoolean(20, false);
            this.f569r = typedArrayObtainStyledAttributes.getBoolean(21, true);
            this.f570s = typedArrayObtainStyledAttributes.getBoolean(15, false);
            this.f571t = typedArrayObtainStyledAttributes.getBoolean(16, false);
            this.f572u = typedArrayObtainStyledAttributes.getBoolean(17, false);
            this.f575x = typedArrayObtainStyledAttributes.getBoolean(24, true);
            typedArrayObtainStyledAttributes.recycle();
            this.c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // s.a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int[] iArr) {
    }
}
