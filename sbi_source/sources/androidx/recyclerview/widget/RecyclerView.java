package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.emoji2.text.q;
import androidx.emoji2.text.t;
import androidx.fragment.app.b;
import b0.a;
import f0.m0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import m0.d;
import t1.g;
import v0.a0;
import v0.c0;
import v0.d0;
import v0.e0;
import v0.f0;
import v0.g0;
import v0.h;
import v0.h0;
import v0.i0;
import v0.j0;
import v0.k;
import v0.k0;
import v0.l0;
import v0.m;
import v0.n0;
import v0.o0;
import v0.q0;
import v0.v;
import v0.v0;
import v0.w;
import v0.x;
import v0.y;
import v0.z;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final int[] f378k0 = {R.attr.nestedScrollingEnabled};

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final Class[] f379l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final d f380m0;
    public y A;
    public EdgeEffect B;
    public EdgeEffect C;
    public EdgeEffect D;
    public EdgeEffect E;
    public z F;
    public int G;
    public int H;
    public VelocityTracker I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public final int O;
    public final int P;
    public final float Q;
    public final float R;
    public boolean S;
    public final n0 T;
    public m U;
    public final o1.m V;
    public final l0 W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f381a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public f0 f382a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k0 f383b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public ArrayList f384b0;
    public final t c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final v f385c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f386d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public q0 f387d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f388e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public f0.m f389e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f390f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final int[] f391f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Rect f392g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final int[] f393g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f394h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final int[] f395h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final RectF f396i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final ArrayList f397i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c0 f398j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final b f399j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f400k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f401l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f402m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public k f403n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f404o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f405p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f406q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f407r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f408s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f409t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f410u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final AccessibilityManager f411v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f412w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f413x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f414y;
    public final int z;

    static {
        Class cls = Integer.TYPE;
        f379l0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f380m0 = new d(1);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.redhand.laugiytr.R.NP_MANAGER3.NP_MANAGER);
    }

    public static void e(o0 o0Var) {
        WeakReference weakReference = o0Var.f2397a;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            o0Var.f2397a = null;
        }
    }

    private f0.m getScrollingChildHelper() {
        if (this.f389e0 == null) {
            this.f389e0 = new f0.m(this);
        }
        return this.f389e0;
    }

    public static o0 s(View view) {
        if (view == null) {
            return null;
        }
        ((d0) view.getLayoutParams()).getClass();
        return null;
    }

    public final void A(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f392g;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof d0) {
            d0 d0Var = (d0) layoutParams;
            if (!d0Var.f2310b) {
                Rect rect2 = d0Var.f2309a;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f398j.V(this, view, this.f392g, !this.f406q, view2 == null);
    }

    public final void B() {
        VelocityTracker velocityTracker = this.I;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        H(0);
        EdgeEffect edgeEffect = this.B;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.B.isFinished();
        }
        EdgeEffect edgeEffect2 = this.C;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.C.isFinished();
        }
        EdgeEffect edgeEffect3 = this.D;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.D.isFinished();
        }
        EdgeEffect edgeEffect4 = this.E;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.E.isFinished();
        }
        if (zIsFinished) {
            Field field = m0.f1276a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean C(int r12, int r13, android.view.MotionEvent r14, int r15) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C(int, int, android.view.MotionEvent, int):boolean");
    }

    public final void D(int i2, int i3, int[] iArr) {
        F();
        w();
        int i4 = a.f452a;
        Trace.beginSection("RV Scroll");
        int scrollState = getScrollState();
        l0 l0Var = this.W;
        if (scrollState == 2) {
            OverScroller overScroller = this.T.c;
            overScroller.getFinalX();
            overScroller.getCurrX();
            l0Var.getClass();
            overScroller.getFinalY();
            overScroller.getCurrY();
        } else {
            l0Var.getClass();
        }
        i0 i0Var = this.f381a;
        int iX = i2 != 0 ? this.f398j.X(i2, i0Var, l0Var) : 0;
        int iY = i3 != 0 ? this.f398j.Y(i3, i0Var, l0Var) : 0;
        Trace.endSection();
        t tVar = this.f386d;
        int iK = tVar.k();
        for (int i5 = 0; i5 < iK; i5++) {
            View viewJ = tVar.j(i5);
            ViewParent parent = viewJ.getParent();
            if (parent != null && parent != this) {
                throw new IllegalArgumentException("View " + viewJ + " is not a direct child of " + this);
            }
            s(viewJ);
        }
        x(true);
        G(false);
        if (iArr != null) {
            iArr[0] = iX;
            iArr[1] = iY;
        }
    }

    public final void E(int i2, int i3, boolean z) {
        c0 c0Var = this.f398j;
        if (c0Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f408s) {
            return;
        }
        int i4 = !c0Var.c() ? 0 : i2;
        int i5 = !this.f398j.d() ? 0 : i3;
        if (i4 == 0 && i5 == 0) {
            return;
        }
        if (z) {
            int i6 = i4 != 0 ? 1 : 0;
            if (i5 != 0) {
                i6 |= 2;
            }
            getScrollingChildHelper().g(i6, 1);
        }
        n0 n0Var = this.T;
        RecyclerView recyclerView = n0Var.f2388g;
        int iAbs = Math.abs(i4);
        int iAbs2 = Math.abs(i5);
        boolean z2 = iAbs > iAbs2;
        int width = z2 ? recyclerView.getWidth() : recyclerView.getHeight();
        if (!z2) {
            iAbs = iAbs2;
        }
        int iMin = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        d dVar = f380m0;
        if (n0Var.f2385d != dVar) {
            n0Var.f2385d = dVar;
            n0Var.c = new OverScroller(recyclerView.getContext(), dVar);
        }
        n0Var.f2384b = 0;
        n0Var.f2383a = 0;
        recyclerView.setScrollState(2);
        n0Var.c.startScroll(0, 0, i4, i5, iMin);
        n0Var.a();
    }

    public final void F() {
        this.f407r++;
    }

    public final void G(boolean z) {
        if (this.f407r < 1) {
            this.f407r = 1;
        }
        this.f407r--;
    }

    public final void H(int i2) {
        getScrollingChildHelper().h(i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i2, int i3) {
        c0 c0Var = this.f398j;
        if (c0Var != null) {
            c0Var.getClass();
        }
        super.addFocusables(arrayList, i2, i3);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof d0) && this.f398j.e((d0) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        c0 c0Var = this.f398j;
        if (c0Var != null && c0Var.c()) {
            return this.f398j.g(this.W);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        c0 c0Var = this.f398j;
        if (c0Var != null && c0Var.c()) {
            return this.f398j.h(this.W);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        c0 c0Var = this.f398j;
        if (c0Var != null && c0Var.c()) {
            return this.f398j.i(this.W);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        c0 c0Var = this.f398j;
        if (c0Var != null && c0Var.d()) {
            return this.f398j.j(this.W);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        c0 c0Var = this.f398j;
        if (c0Var != null && c0Var.d()) {
            return this.f398j.k(this.W);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        c0 c0Var = this.f398j;
        if (c0Var != null && c0Var.d()) {
            return this.f398j.l(this.W);
        }
        return 0;
    }

    public final void d(String str) {
        if (this.f414y > 0) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + p());
        }
        if (this.z > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + p()));
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f3, float f4, boolean z) {
        return getScrollingChildHelper().a(f3, f4, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f3, float f4) {
        return getScrollingChildHelper().b(f3, f4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i2, i3, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().d(i2, i3, i4, i5, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        ArrayList arrayList = this.f401l;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            ((a0) arrayList.get(i2)).b(canvas, this);
        }
        EdgeEffect edgeEffect = this.B;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f390f ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.B;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.C;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f390f) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.C;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.D;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f390f ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.D;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.E;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f390f) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.E;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this.F == null || arrayList.size() <= 0 || !this.F.d()) ? z : true) {
            Field field = m0.f1276a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public final void f(int i2, int i3) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.B;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            zIsFinished = false;
        } else {
            this.B.onRelease();
            zIsFinished = this.B.isFinished();
        }
        EdgeEffect edgeEffect2 = this.D;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.D.onRelease();
            zIsFinished |= this.D.isFinished();
        }
        EdgeEffect edgeEffect3 = this.C;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.C.onRelease();
            zIsFinished |= this.C.isFinished();
        }
        EdgeEffect edgeEffect4 = this.E;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.E.onRelease();
            zIsFinished |= this.E.isFinished();
        }
        if (zIsFinished) {
            Field field = m0.f1276a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c4, code lost:
    
        if (r4 > 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e2, code lost:
    
        if (r7 > 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e5, code lost:
    
        if (r4 < 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00e8, code lost:
    
        if (r7 < 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f0, code lost:
    
        if ((r7 * r1) <= 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00f8, code lost:
    
        if ((r7 * r1) >= 0) goto L84;
     */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r13, int r14) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g() {
        if (!this.f406q || this.f412w) {
            int i2 = a.f452a;
            Trace.beginSection("RV FullInvalidate");
            i();
            Trace.endSection();
            return;
        }
        t tVar = this.c;
        if (tVar.s()) {
            tVar.getClass();
            if (tVar.s()) {
                int i3 = a.f452a;
                Trace.beginSection("RV FullInvalidate");
                i();
                Trace.endSection();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        c0 c0Var = this.f398j;
        if (c0Var != null) {
            return c0Var.m();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + p());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        c0 c0Var = this.f398j;
        if (c0Var != null) {
            return c0Var.n(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + p());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public w getAdapter() {
        return null;
    }

    @Override // android.view.View
    public int getBaseline() {
        c0 c0Var = this.f398j;
        if (c0Var == null) {
            return super.getBaseline();
        }
        c0Var.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i2, int i3) {
        return super.getChildDrawingOrder(i2, i3);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f390f;
    }

    public q0 getCompatAccessibilityDelegate() {
        return this.f387d0;
    }

    public y getEdgeEffectFactory() {
        return this.A;
    }

    public z getItemAnimator() {
        return this.F;
    }

    public int getItemDecorationCount() {
        return this.f401l.size();
    }

    public c0 getLayoutManager() {
        return this.f398j;
    }

    public int getMaxFlingVelocity() {
        return this.P;
    }

    public int getMinFlingVelocity() {
        return this.O;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public e0 getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.S;
    }

    public h0 getRecycledViewPool() {
        return this.f381a.c();
    }

    public int getScrollState() {
        return this.G;
    }

    public final void h(int i2, int i3) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        Field field = m0.f1276a;
        setMeasuredDimension(c0.f(i2, paddingRight, getMinimumWidth()), c0.f(i3, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i() {
        Log.w("RecyclerView", "No adapter attached; skipping layout");
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f404o;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f408s;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f1274d;
    }

    public final boolean j(int i2, int i3, int i4, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i2, i3, i4, iArr, iArr2);
    }

    public final void k(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        getScrollingChildHelper().d(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public final void l() {
        if (this.E != null) {
            return;
        }
        this.A.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.E = edgeEffect;
        if (this.f390f) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void m() {
        if (this.B != null) {
            return;
        }
        this.A.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.B = edgeEffect;
        if (this.f390f) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void n() {
        if (this.D != null) {
            return;
        }
        this.A.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.D = edgeEffect;
        if (this.f390f) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void o() {
        if (this.C != null) {
            return;
        }
        this.A.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.C = edgeEffect;
        if (this.f390f) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f414y = r0
            r1 = 1
            r5.f404o = r1
            boolean r2 = r5.f406q
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            r0 = r1
        L14:
            r5.f406q = r0
            v0.c0 r0 = r5.f398j
            if (r0 == 0) goto L1f
            r0.f2300e = r1
            r0.K(r5)
        L1f:
            java.lang.ThreadLocal r0 = v0.m.f2376e
            java.lang.Object r1 = r0.get()
            v0.m r1 = (v0.m) r1
            r5.U = r1
            if (r1 != 0) goto L67
            v0.m r1 = new v0.m
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f2378a = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f2380d = r2
            r5.U = r1
            java.lang.reflect.Field r1 = f0.m0.f1276a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L59
            if (r1 == 0) goto L59
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L59
            goto L5b
        L59:
            r1 = 1114636288(0x42700000, float:60.0)
        L5b:
            v0.m r2 = r5.U
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.c = r3
            r0.set(r2)
        L67:
            v0.m r0 = r5.U
            java.util.ArrayList r0 = r0.f2378a
            r0.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z zVar = this.F;
        if (zVar != null) {
            zVar.c();
        }
        setScrollState(0);
        n0 n0Var = this.T;
        n0Var.f2388g.removeCallbacks(n0Var);
        n0Var.c.abortAnimation();
        this.f404o = false;
        c0 c0Var = this.f398j;
        if (c0Var != null) {
            c0Var.f2300e = false;
            c0Var.L(this);
        }
        this.f397i0.clear();
        removeCallbacks(this.f399j0);
        this.f388e.getClass();
        while (v0.f2449b.a() != null) {
        }
        m mVar = this.U;
        if (mVar != null) {
            mVar.f2378a.remove(this);
            this.U = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f401l;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((a0) arrayList.get(i2)).getClass();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (!this.f408s) {
            this.f403n = null;
            if (r(motionEvent)) {
                B();
                setScrollState(0);
                return true;
            }
            c0 c0Var = this.f398j;
            if (c0Var != null) {
                boolean zC = c0Var.c();
                boolean zD = this.f398j.d();
                if (this.I == null) {
                    this.I = VelocityTracker.obtain();
                }
                this.I.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.f409t) {
                        this.f409t = false;
                    }
                    this.H = motionEvent.getPointerId(0);
                    int x2 = (int) (motionEvent.getX() + 0.5f);
                    this.L = x2;
                    this.J = x2;
                    int y2 = (int) (motionEvent.getY() + 0.5f);
                    this.M = y2;
                    this.K = y2;
                    if (this.G == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        H(1);
                    }
                    int[] iArr = this.f393g0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i2 = zC;
                    if (zD) {
                        i2 = (zC ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i2, 0);
                } else if (actionMasked == 1) {
                    this.I.clear();
                    H(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.H);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.H + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x3 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y3 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.G != 1) {
                        int i3 = x3 - this.J;
                        int i4 = y3 - this.K;
                        if (!zC || Math.abs(i3) <= this.N) {
                            z = false;
                        } else {
                            this.L = x3;
                            z = true;
                        }
                        if (zD && Math.abs(i4) > this.N) {
                            this.M = y3;
                            z = true;
                        }
                        if (z) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    B();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.H = motionEvent.getPointerId(actionIndex);
                    int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.L = x4;
                    this.J = x4;
                    int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.M = y4;
                    this.K = y4;
                } else if (actionMasked == 6) {
                    y(motionEvent);
                }
                if (this.G == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6 = a.f452a;
        Trace.beginSection("RV OnLayout");
        i();
        Trace.endSection();
        this.f406q = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        c0 c0Var = this.f398j;
        if (c0Var == null) {
            h(i2, i3);
            return;
        }
        if (c0Var.E()) {
            View.MeasureSpec.getMode(i2);
            View.MeasureSpec.getMode(i3);
            this.f398j.f2298b.h(i2, i3);
        } else {
            if (this.f405p) {
                this.f398j.f2298b.h(i2, i3);
                return;
            }
            l0 l0Var = this.W;
            if (l0Var.f2375i) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            l0Var.c = 0;
            F();
            this.f398j.f2298b.h(i2, i3);
            G(false);
            l0Var.f2371e = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (this.f414y > 0) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof k0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        k0 k0Var = (k0) parcelable;
        this.f383b = k0Var;
        super.onRestoreInstanceState(k0Var.f1560a);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        k0 k0Var = new k0(super.onSaveInstanceState());
        k0 k0Var2 = this.f383b;
        if (k0Var2 != null) {
            k0Var.c = k0Var2.c;
            return k0Var;
        }
        c0 c0Var = this.f398j;
        if (c0Var != null) {
            k0Var.c = c0Var.P();
            return k0Var;
        }
        k0Var.c = null;
        return k0Var;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 == i4 && i3 == i5) {
            return;
        }
        this.E = null;
        this.C = null;
        this.D = null;
        this.B = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f5 A[PHI: r1
      0x01f5: PHI (r1v54 int) = (r1v39 int), (r1v58 int) binds: [B:90:0x01de, B:94:0x01f1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r23) {
        /*
            Method dump skipped, instruction units count: 897
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final String p() {
        return " " + super.toString() + ", adapter:" + ((Object) null) + ", layout:" + this.f398j + ", context:" + getContext();
    }

    public final View q(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean r(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            java.util.ArrayList r1 = r11.f402m
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        Lc:
            if (r4 >= r2) goto L64
            java.lang.Object r5 = r1.get(r4)
            v0.k r5 = (v0.k) r5
            int r6 = r5.f2357q
            r7 = 1
            r8 = 2
            if (r6 != r7) goto L59
            float r6 = r12.getX()
            float r9 = r12.getY()
            boolean r6 = r5.d(r6, r9)
            float r9 = r12.getX()
            float r10 = r12.getY()
            boolean r9 = r5.c(r9, r10)
            int r10 = r12.getAction()
            if (r10 != 0) goto L61
            if (r6 != 0) goto L3c
            if (r9 == 0) goto L61
        L3c:
            if (r9 == 0) goto L49
            r5.f2358r = r7
            float r6 = r12.getX()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f2351k = r6
            goto L55
        L49:
            if (r6 == 0) goto L55
            r5.f2358r = r8
            float r6 = r12.getY()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f2350j = r6
        L55:
            r5.f(r8)
            goto L5b
        L59:
            if (r6 != r8) goto L61
        L5b:
            r6 = 3
            if (r0 == r6) goto L61
            r11.f403n = r5
            return r7
        L61:
            int r4 = r4 + 1
            goto Lc
        L64:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.r(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        s(view);
        view.clearAnimation();
        s(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        this.f398j.getClass();
        if (this.f414y <= 0 && view2 != null) {
            A(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f398j.V(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.f402m;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((k) arrayList.get(i2)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f407r != 0 || this.f408s) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void scrollBy(int i2, int i3) {
        c0 c0Var = this.f398j;
        if (c0Var == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f408s) {
            return;
        }
        boolean zC = c0Var.c();
        boolean zD = this.f398j.d();
        if (zC || zD) {
            if (!zC) {
                i2 = 0;
            }
            if (!zD) {
                i3 = 0;
            }
            C(i2, i3, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i2, int i3) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (this.f414y <= 0) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f410u |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(q0 q0Var) {
        this.f387d0 = q0Var;
        m0.j(this, q0Var);
    }

    public void setAdapter(w wVar) {
        setLayoutFrozen(false);
        z zVar = this.F;
        if (zVar != null) {
            zVar.c();
        }
        c0 c0Var = this.f398j;
        i0 i0Var = this.f381a;
        if (c0Var != null) {
            c0Var.R(i0Var);
            this.f398j.S(i0Var);
        }
        i0Var.f2332a.clear();
        i0Var.e();
        t tVar = this.c;
        tVar.y((ArrayList) tVar.c);
        tVar.y((ArrayList) tVar.f254d);
        c0 c0Var2 = this.f398j;
        if (c0Var2 != null) {
            c0Var2.J();
        }
        i0Var.f2332a.clear();
        i0Var.e();
        h0 h0VarC = i0Var.c();
        if (h0VarC.f2331b == 0) {
            SparseArray sparseArray = h0VarC.f2330a;
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                ((g0) sparseArray.valueAt(i2)).f2316a.clear();
            }
        }
        this.W.f2370d = true;
        this.f413x = false | this.f413x;
        this.f412w = true;
        int iQ = this.f386d.q();
        for (int i3 = 0; i3 < iQ; i3++) {
            s(this.f386d.p(i3));
        }
        v();
        i0 i0Var2 = this.f381a;
        ArrayList arrayList = i0Var2.c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
        }
        i0Var2.e();
        requestLayout();
    }

    public void setChildDrawingOrderCallback(x xVar) {
        if (xVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.f390f) {
            this.E = null;
            this.C = null;
            this.D = null;
            this.B = null;
        }
        this.f390f = z;
        super.setClipToPadding(z);
        if (this.f406q) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(y yVar) {
        yVar.getClass();
        this.A = yVar;
        this.E = null;
        this.C = null;
        this.D = null;
        this.B = null;
    }

    public void setHasFixedSize(boolean z) {
        this.f405p = z;
    }

    public void setItemAnimator(z zVar) {
        z zVar2 = this.F;
        if (zVar2 != null) {
            zVar2.c();
            this.F.f2451a = null;
        }
        this.F = zVar;
        if (zVar != null) {
            zVar.f2451a = this.f385c0;
        }
    }

    public void setItemViewCacheSize(int i2) {
        i0 i0Var = this.f381a;
        i0Var.f2334d = i2;
        i0Var.k();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(c0 c0Var) {
        if (c0Var == this.f398j) {
            return;
        }
        setScrollState(0);
        n0 n0Var = this.T;
        n0Var.f2388g.removeCallbacks(n0Var);
        n0Var.c.abortAnimation();
        c0 c0Var2 = this.f398j;
        i0 i0Var = this.f381a;
        if (c0Var2 != null) {
            z zVar = this.F;
            if (zVar != null) {
                zVar.c();
            }
            this.f398j.R(i0Var);
            this.f398j.S(i0Var);
            i0Var.f2332a.clear();
            i0Var.e();
            if (this.f404o) {
                c0 c0Var3 = this.f398j;
                c0Var3.f2300e = false;
                c0Var3.L(this);
            }
            this.f398j.Z(null);
            this.f398j = null;
        } else {
            i0Var.f2332a.clear();
            i0Var.e();
        }
        t tVar = this.f386d;
        RecyclerView recyclerView = ((v) tVar.f253b).f2448a;
        ((v0.b) tVar.c).g();
        ArrayList arrayList = (ArrayList) tVar.f254d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            s((View) arrayList.get(size));
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            s(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f398j = c0Var;
        if (c0Var != null) {
            if (c0Var.f2298b != null) {
                throw new IllegalArgumentException("LayoutManager " + c0Var + " is already attached to a RecyclerView:" + c0Var.f2298b.p());
            }
            c0Var.Z(this);
            if (this.f404o) {
                c0 c0Var4 = this.f398j;
                c0Var4.f2300e = true;
                c0Var4.K(this);
            }
        }
        i0Var.k();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        f0.m scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f1274d) {
            ViewGroup viewGroup = scrollingChildHelper.c;
            Field field = m0.f1276a;
            f0.c0.z(viewGroup);
        }
        scrollingChildHelper.f1274d = z;
    }

    @Deprecated
    public void setOnScrollListener(f0 f0Var) {
        this.f382a0 = f0Var;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.S = z;
    }

    public void setRecycledViewPool(h0 h0Var) {
        i0 i0Var = this.f381a;
        if (i0Var.f2336f != null) {
            r1.f2331b--;
        }
        i0Var.f2336f = h0Var;
        if (h0Var != null) {
            i0Var.f2337g.getAdapter();
        }
    }

    public void setScrollState(int i2) {
        if (i2 == this.G) {
            return;
        }
        this.G = i2;
        if (i2 != 2) {
            n0 n0Var = this.T;
            n0Var.f2388g.removeCallbacks(n0Var);
            n0Var.c.abortAnimation();
        }
        c0 c0Var = this.f398j;
        if (c0Var != null) {
            c0Var.Q(i2);
        }
        f0 f0Var = this.f382a0;
        if (f0Var != null) {
            f0Var.a(i2);
        }
        ArrayList arrayList = this.f384b0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((f0) this.f384b0.get(size)).a(i2);
            }
        }
    }

    public void setScrollingTouchSlop(int i2) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 0) {
            if (i2 == 1) {
                this.N = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i2 + "; using default value");
        }
        this.N = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(v0.m0 m0Var) {
        this.f381a.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().g(i2, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.f408s) {
            d("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.f408s = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f408s = true;
            this.f409t = true;
            setScrollState(0);
            n0 n0Var = this.T;
            n0Var.f2388g.removeCallbacks(n0Var);
            n0Var.c.abortAnimation();
        }
    }

    public final Rect t(View view) {
        d0 d0Var = (d0) view.getLayoutParams();
        boolean z = d0Var.f2310b;
        Rect rect = d0Var.f2309a;
        if (!z) {
            return rect;
        }
        if (this.W.f2371e) {
            throw null;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f401l;
        if (arrayList.size() <= 0) {
            d0Var.f2310b = false;
            return rect;
        }
        this.f392g.set(0, 0, 0, 0);
        ((a0) arrayList.get(0)).getClass();
        ((d0) view.getLayoutParams()).getClass();
        throw null;
    }

    public final boolean u() {
        return !this.f406q || this.f412w || this.c.s();
    }

    public final void v() {
        int iQ = this.f386d.q();
        for (int i2 = 0; i2 < iQ; i2++) {
            ((d0) this.f386d.p(i2).getLayoutParams()).f2310b = true;
        }
        ArrayList arrayList = this.f381a.c;
        if (arrayList.size() <= 0) {
            return;
        }
        ((o0) arrayList.get(0)).getClass();
        throw null;
    }

    public final void w() {
        this.f414y++;
    }

    public final void x(boolean z) {
        AccessibilityManager accessibilityManager;
        int i2 = this.f414y - 1;
        this.f414y = i2;
        if (i2 < 1) {
            this.f414y = 0;
            if (z) {
                int i3 = this.f410u;
                this.f410u = 0;
                if (i3 != 0 && (accessibilityManager = this.f411v) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.f397i0;
                int size = arrayList.size() - 1;
                if (size < 0) {
                    arrayList.clear();
                } else {
                    ((o0) arrayList.get(size)).getClass();
                    throw null;
                }
            }
        }
    }

    public final void y(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.H) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.H = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.L = x2;
            this.J = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.M = y2;
            this.K = y2;
        }
    }

    public final void z(o0 o0Var, g gVar) {
        o0Var.f2398b &= -8193;
        if (this.W.f2372f && o0Var.k() && !o0Var.h() && !o0Var.n()) {
            throw null;
        }
        i.k kVar = (i.k) this.f388e.f246b;
        v0 v0VarA = (v0) kVar.get(o0Var);
        if (v0VarA == null) {
            v0VarA = v0.a();
            kVar.put(o0Var, v0VarA);
        }
        v0VarA.getClass();
        v0VarA.f2450a |= 4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecyclerView(Context context, AttributeSet attributeSet, int i2) throws NoSuchMethodException {
        float fA;
        char c;
        int i3;
        char c3;
        char c4;
        int i4;
        TypedArray typedArray;
        Object[] objArr;
        Constructor constructor;
        super(context, attributeSet, i2);
        new g(25, this);
        this.f381a = new i0(this);
        this.f388e = new q(13);
        this.f392g = new Rect();
        this.f394h = new Rect();
        this.f396i = new RectF();
        this.f400k = new ArrayList();
        this.f401l = new ArrayList();
        this.f402m = new ArrayList();
        this.f407r = 0;
        this.f412w = false;
        this.f413x = false;
        this.f414y = 0;
        this.z = 0;
        this.A = new y();
        h hVar = new h();
        hVar.f2451a = null;
        hVar.f2452b = new ArrayList();
        hVar.c = 120L;
        hVar.f2453d = 120L;
        hVar.f2454e = 250L;
        hVar.f2455f = 250L;
        hVar.f2318g = true;
        hVar.f2319h = new ArrayList();
        hVar.f2320i = new ArrayList();
        hVar.f2321j = new ArrayList();
        hVar.f2322k = new ArrayList();
        hVar.f2323l = new ArrayList();
        hVar.f2324m = new ArrayList();
        hVar.f2325n = new ArrayList();
        hVar.f2326o = new ArrayList();
        hVar.f2327p = new ArrayList();
        hVar.f2328q = new ArrayList();
        hVar.f2329r = new ArrayList();
        this.F = hVar;
        this.G = 0;
        this.H = -1;
        this.Q = Float.MIN_VALUE;
        this.R = Float.MIN_VALUE;
        this.S = true;
        this.T = new n0(this);
        this.V = new o1.m();
        l0 l0Var = new l0();
        l0Var.f2368a = 0;
        l0Var.f2369b = 0;
        l0Var.c = 0;
        l0Var.f2370d = false;
        l0Var.f2371e = false;
        l0Var.f2372f = false;
        l0Var.f2373g = false;
        l0Var.f2374h = false;
        l0Var.f2375i = false;
        this.W = l0Var;
        v vVar = new v(this);
        this.f385c0 = vVar;
        this.f391f0 = new int[2];
        this.f393g0 = new int[2];
        this.f395h0 = new int[2];
        this.f397i0 = new ArrayList();
        this.f399j0 = new b(9, this);
        new g(22, this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.N = viewConfiguration.getScaledTouchSlop();
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 26) {
            Method method = f0.q0.f1284a;
            fA = f0.n0.a(viewConfiguration);
        } else {
            fA = f0.q0.a(viewConfiguration, context);
        }
        this.Q = fA;
        this.R = i5 >= 26 ? f0.n0.b(viewConfiguration) : f0.q0.a(viewConfiguration, context);
        this.O = viewConfiguration.getScaledMinimumFlingVelocity();
        this.P = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.F.f2451a = vVar;
        this.c = new t(new g(23, this));
        this.f386d = new t(new v(this));
        Field field = m0.f1276a;
        if ((i5 >= 26 ? f0.e0.c(this) : 0) == 0 && i5 >= 26) {
            f0.e0.m(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f411v = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new q0(this));
        int[] iArr = u0.a.f2282a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        m0.i(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i2);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f390f = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + p());
            }
            Resources resources = getContext().getResources();
            c4 = 2;
            c3 = 1;
            typedArray = typedArrayObtainStyledAttributes;
            i4 = i2;
            c = 3;
            i3 = 4;
            new k(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.redhand.laugiytr.R.NP_MANAGER6.NP_MANAGER), resources.getDimensionPixelSize(com.redhand.laugiytr.R.NP_MANAGER6.NP_MANAGER), resources.getDimensionPixelOffset(com.redhand.laugiytr.R.NP_MANAGER6.NP_MANAGER));
        } else {
            c = 3;
            i3 = 4;
            c3 = 1;
            c4 = 2;
            i4 = i2;
            typedArray = typedArrayObtainStyledAttributes;
        }
        typedArray.recycle();
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                String str = strTrim;
                try {
                    Class<? extends U> clsAsSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(c0.class);
                    try {
                        Constructor constructor2 = clsAsSubclass.getConstructor(f379l0);
                        Object[] objArr2 = new Object[i3];
                        objArr2[0] = context;
                        objArr2[c3] = attributeSet;
                        objArr2[c4] = Integer.valueOf(i4);
                        objArr2[c] = 0;
                        objArr = objArr2;
                        constructor = constructor2;
                    } catch (NoSuchMethodException e3) {
                        try {
                            objArr = null;
                            constructor = clsAsSubclass.getConstructor(null);
                        } catch (NoSuchMethodException e4) {
                            e4.initCause(e3);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e4);
                        }
                    }
                    constructor.setAccessible(c3);
                    setLayoutManager((c0) constructor.newInstance(objArr));
                } catch (ClassCastException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e5);
                } catch (ClassNotFoundException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e6);
                } catch (IllegalAccessException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e7);
                } catch (InstantiationException e8) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e8);
                } catch (InvocationTargetException e9) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e9);
                }
            }
        }
        int[] iArr2 = f378k0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i4, 0);
        m0.i(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i4);
        boolean z = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        c0 c0Var = this.f398j;
        if (c0Var != null) {
            return c0Var.o(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + p());
    }

    public void setOnFlingListener(e0 e0Var) {
    }

    @Deprecated
    public void setRecyclerListener(j0 j0Var) {
    }
}
