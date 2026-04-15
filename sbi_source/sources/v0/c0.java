package v0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.emoji2.text.t f2297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f2298b;
    public final androidx.emoji2.text.q c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.emoji2.text.q f2299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f2301f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2302g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2303h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2304i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2305j;

    public c0() {
        b0 b0Var = new b0(this, 0);
        b0 b0Var2 = new b0(this, 1);
        this.c = new androidx.emoji2.text.q(b0Var);
        this.f2299d = new androidx.emoji2.text.q(b0Var2);
        this.f2300e = false;
        this.f2301f = true;
    }

    public static int A(View view) {
        ((d0) view.getLayoutParams()).getClass();
        throw null;
    }

    public static p B(Context context, AttributeSet attributeSet, int i2, int i3) {
        p pVar = new p(1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u0.a.f2282a, i2, i3);
        pVar.f2404b = typedArrayObtainStyledAttributes.getInt(0, 1);
        pVar.c = typedArrayObtainStyledAttributes.getInt(10, 1);
        pVar.f2405d = typedArrayObtainStyledAttributes.getBoolean(9, false);
        pVar.f2406e = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return pVar;
    }

    public static boolean F(int i2, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (i4 > 0 && i2 != i4) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i2;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i2;
        }
        return true;
    }

    public static void G(View view, int i2, int i3, int i4, int i5) {
        d0 d0Var = (d0) view.getLayoutParams();
        Rect rect = d0Var.f2309a;
        view.layout(i2 + rect.left + ((ViewGroup.MarginLayoutParams) d0Var).leftMargin, i3 + rect.top + ((ViewGroup.MarginLayoutParams) d0Var).topMargin, (i4 - rect.right) - ((ViewGroup.MarginLayoutParams) d0Var).rightMargin, (i5 - rect.bottom) - ((ViewGroup.MarginLayoutParams) d0Var).bottomMargin);
    }

    public static int f(int i2, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i3, i4) : size : Math.min(size, Math.max(i3, i4));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int r(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            int r5 = r5 - r7
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L1d
            if (r8 < 0) goto L12
        L10:
            r6 = r3
            goto L30
        L12:
            if (r8 != r1) goto L1a
            if (r6 == r2) goto L22
            if (r6 == 0) goto L1a
            if (r6 == r3) goto L22
        L1a:
            r6 = r7
            r8 = r6
            goto L30
        L1d:
            if (r8 < 0) goto L20
            goto L10
        L20:
            if (r8 != r1) goto L24
        L22:
            r8 = r5
            goto L30
        L24:
            if (r8 != r0) goto L1a
            if (r6 == r2) goto L2e
            if (r6 != r3) goto L2b
            goto L2e
        L2b:
            r8 = r5
            r6 = r7
            goto L30
        L2e:
            r8 = r5
            r6 = r2
        L30:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.c0.r(boolean, int, int, int, int):int");
    }

    public static int u(View view) {
        Rect rect = ((d0) view.getLayoutParams()).f2309a;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public static int v(View view) {
        Rect rect = ((d0) view.getLayoutParams()).f2309a;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public int C(i0 i0Var, l0 l0Var) {
        return -1;
    }

    public final void D(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((d0) view.getLayoutParams()).f2309a;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f2298b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f2298b.f396i;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean E();

    public void H(int i2) {
        RecyclerView recyclerView = this.f2298b;
        if (recyclerView != null) {
            int iK = recyclerView.f386d.k();
            for (int i3 = 0; i3 < iK; i3++) {
                recyclerView.f386d.j(i3).offsetLeftAndRight(i2);
            }
        }
    }

    public void I(int i2) {
        RecyclerView recyclerView = this.f2298b;
        if (recyclerView != null) {
            int iK = recyclerView.f386d.k();
            for (int i3 = 0; i3 < iK; i3++) {
                recyclerView.f386d.j(i3).offsetTopAndBottom(i2);
            }
        }
    }

    public abstract void L(RecyclerView recyclerView);

    public void M(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f2298b;
        i0 i0Var = recyclerView.f381a;
        if (accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.f2298b.canScrollVertically(-1) && !this.f2298b.canScrollHorizontally(-1) && !this.f2298b.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        this.f2298b.getClass();
    }

    public final void N(View view, g0.i iVar) {
        RecyclerView.s(view);
    }

    public Parcelable P() {
        return null;
    }

    public final void R(i0 i0Var) {
        for (int iQ = q() - 1; iQ >= 0; iQ--) {
            if (!RecyclerView.s(p(iQ)).n()) {
                View viewP = p(iQ);
                U(iQ);
                i0Var.g(viewP);
            }
        }
    }

    public final void S(i0 i0Var) {
        ArrayList arrayList = i0Var.f2332a;
        int size = arrayList.size();
        for (int i2 = size - 1; i2 >= 0; i2--) {
            ((o0) arrayList.get(i2)).getClass();
            o0 o0VarS = RecyclerView.s(null);
            if (!o0VarS.n()) {
                o0VarS.m(false);
                if (o0VarS.j()) {
                    this.f2298b.removeDetachedView(null, false);
                }
                z zVar = this.f2298b.F;
                if (zVar != null) {
                    zVar.b(o0VarS);
                }
                o0VarS.m(true);
                o0 o0VarS2 = RecyclerView.s(null);
                o0VarS2.c = null;
                o0VarS2.f2399d = false;
                o0VarS2.f2398b &= -33;
                i0Var.h(o0VarS2);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = i0Var.f2333b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f2298b.invalidate();
        }
    }

    public final void T(View view, i0 i0Var) {
        androidx.emoji2.text.t tVar = this.f2297a;
        v vVar = (v) tVar.f253b;
        int iIndexOfChild = vVar.f2448a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            if (((b) tVar.c).f(iIndexOfChild)) {
                tVar.A(view);
            }
            vVar.a(iIndexOfChild);
        }
        i0Var.g(view);
    }

    public final void U(int i2) {
        if (p(i2) != null) {
            androidx.emoji2.text.t tVar = this.f2297a;
            int iO = tVar.o(i2);
            v vVar = (v) tVar.f253b;
            View childAt = vVar.f2448a.getChildAt(iO);
            if (childAt == null) {
                return;
            }
            if (((b) tVar.c).f(iO)) {
                tVar.A(childAt);
            }
            vVar.a(iO);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean V(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.x()
            int r1 = r8.z()
            int r2 = r8.f2304i
            int r3 = r8.y()
            int r2 = r2 - r3
            int r3 = r8.f2305j
            int r4 = r8.w()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            androidx.recyclerview.widget.RecyclerView r3 = r8.f2298b
            java.lang.reflect.Field r7 = f0.m0.f1276a
            int r3 = r3.getLayoutDirection()
            r7 = 1
            if (r3 != r7) goto L60
            if (r2 == 0) goto L5b
            goto L68
        L5b:
            int r2 = java.lang.Math.max(r6, r10)
            goto L68
        L60:
            if (r6 == 0) goto L63
            goto L67
        L63:
            int r6 = java.lang.Math.min(r4, r2)
        L67:
            r2 = r6
        L68:
            if (r1 == 0) goto L6b
            goto L6f
        L6b:
            int r1 = java.lang.Math.min(r5, r11)
        L6f:
            int[] r10 = new int[]{r2, r1}
            r11 = r10[r0]
            r10 = r10[r7]
            if (r13 == 0) goto Lb2
            android.view.View r13 = r9.getFocusedChild()
            if (r13 != 0) goto L80
            goto Lb7
        L80:
            int r1 = r8.x()
            int r2 = r8.z()
            int r3 = r8.f2304i
            int r4 = r8.y()
            int r3 = r3 - r4
            int r4 = r8.f2305j
            int r5 = r8.w()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.f2298b
            android.graphics.Rect r5 = r5.f392g
            r8.t(r13, r5)
            int r13 = r5.left
            int r13 = r13 - r11
            if (r13 >= r3) goto Lb7
            int r13 = r5.right
            int r13 = r13 - r11
            if (r13 <= r1) goto Lb7
            int r13 = r5.top
            int r13 = r13 - r10
            if (r13 >= r4) goto Lb7
            int r13 = r5.bottom
            int r13 = r13 - r10
            if (r13 > r2) goto Lb2
            goto Lb7
        Lb2:
            if (r11 != 0) goto Lb8
            if (r10 == 0) goto Lb7
            goto Lb8
        Lb7:
            return r0
        Lb8:
            if (r12 == 0) goto Lbe
            r9.scrollBy(r11, r10)
            return r7
        Lbe:
            r9.E(r11, r10, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.c0.V(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public final void W() {
        RecyclerView recyclerView = this.f2298b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int X(int i2, i0 i0Var, l0 l0Var);

    public abstract int Y(int i2, i0 i0Var, l0 l0Var);

    public final void Z(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f2298b = null;
            this.f2297a = null;
            this.f2304i = 0;
            this.f2305j = 0;
        } else {
            this.f2298b = recyclerView;
            this.f2297a = recyclerView.f386d;
            this.f2304i = recyclerView.getWidth();
            this.f2305j = recyclerView.getHeight();
        }
        this.f2302g = 1073741824;
        this.f2303h = 1073741824;
    }

    public final void a(View view, int i2, boolean z) {
        o0 o0VarS = RecyclerView.s(view);
        if (z || o0VarS.h()) {
            i.k kVar = (i.k) this.f2298b.f388e.f246b;
            v0 v0VarA = (v0) kVar.get(o0VarS);
            if (v0VarA == null) {
                v0VarA = v0.a();
                kVar.put(o0VarS, v0VarA);
            }
            v0VarA.f2450a |= 1;
        } else {
            this.f2298b.f388e.k(o0VarS);
        }
        d0 d0Var = (d0) view.getLayoutParams();
        if (o0VarS.o() || o0VarS.i()) {
            if (o0VarS.i()) {
                o0VarS.c.j(o0VarS);
            } else {
                o0VarS.f2398b &= -33;
            }
            this.f2297a.f(view, i2, view.getLayoutParams(), false);
        } else if (view.getParent() == this.f2298b) {
            androidx.emoji2.text.t tVar = this.f2297a;
            b bVar = (b) tVar.c;
            int iIndexOfChild = ((v) tVar.f253b).f2448a.indexOfChild(view);
            int iB = (iIndexOfChild == -1 || bVar.d(iIndexOfChild)) ? -1 : iIndexOfChild - bVar.b(iIndexOfChild);
            if (i2 == -1) {
                i2 = this.f2297a.k();
            }
            if (iB == -1) {
                throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f2298b.indexOfChild(view) + this.f2298b.p());
            }
            if (iB != i2) {
                c0 c0Var = this.f2298b.f398j;
                View viewP = c0Var.p(iB);
                if (viewP == null) {
                    throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iB + c0Var.f2298b.toString());
                }
                c0Var.p(iB);
                c0Var.f2297a.h(iB);
                d0 d0Var2 = (d0) viewP.getLayoutParams();
                o0 o0VarS2 = RecyclerView.s(viewP);
                if (o0VarS2.h()) {
                    i.k kVar2 = (i.k) c0Var.f2298b.f388e.f246b;
                    v0 v0VarA2 = (v0) kVar2.get(o0VarS2);
                    if (v0VarA2 == null) {
                        v0VarA2 = v0.a();
                        kVar2.put(o0VarS2, v0VarA2);
                    }
                    v0VarA2.f2450a = 1 | v0VarA2.f2450a;
                } else {
                    c0Var.f2298b.f388e.k(o0VarS2);
                }
                c0Var.f2297a.f(viewP, i2, d0Var2, o0VarS2.h());
            }
        } else {
            androidx.emoji2.text.t tVar2 = this.f2297a;
            RecyclerView recyclerView = ((v) tVar2.f253b).f2448a;
            int childCount = i2 < 0 ? recyclerView.getChildCount() : tVar2.o(i2);
            ((b) tVar2.c).e(childCount, false);
            recyclerView.addView(view, childCount);
            RecyclerView.s(view);
            d0Var.f2310b = true;
        }
        if (d0Var.c) {
            throw null;
        }
    }

    public final boolean a0(View view, int i2, int i3, d0 d0Var) {
        return (!view.isLayoutRequested() && this.f2301f && F(view.getWidth(), i2, ((ViewGroup.MarginLayoutParams) d0Var).width) && F(view.getHeight(), i3, ((ViewGroup.MarginLayoutParams) d0Var).height)) ? false : true;
    }

    public void b(String str) {
        RecyclerView recyclerView = this.f2298b;
        if (recyclerView != null) {
            recyclerView.d(str);
        }
    }

    public final boolean b0(View view, int i2, int i3, d0 d0Var) {
        return (this.f2301f && F(view.getMeasuredWidth(), i2, ((ViewGroup.MarginLayoutParams) d0Var).width) && F(view.getMeasuredHeight(), i3, ((ViewGroup.MarginLayoutParams) d0Var).height)) ? false : true;
    }

    public abstract boolean c();

    public abstract boolean d();

    public boolean e(d0 d0Var) {
        return d0Var != null;
    }

    public abstract int g(l0 l0Var);

    public abstract int h(l0 l0Var);

    public abstract int i(l0 l0Var);

    public abstract int j(l0 l0Var);

    public abstract int k(l0 l0Var);

    public abstract int l(l0 l0Var);

    public abstract d0 m();

    public d0 n(Context context, AttributeSet attributeSet) {
        return new d0(context, attributeSet);
    }

    public d0 o(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d0 ? new d0((d0) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new d0((ViewGroup.MarginLayoutParams) layoutParams) : new d0(layoutParams);
    }

    public final View p(int i2) {
        androidx.emoji2.text.t tVar = this.f2297a;
        if (tVar != null) {
            return tVar.j(i2);
        }
        return null;
    }

    public final int q() {
        androidx.emoji2.text.t tVar = this.f2297a;
        if (tVar != null) {
            return tVar.k();
        }
        return 0;
    }

    public int s(i0 i0Var, l0 l0Var) {
        return -1;
    }

    public void t(View view, Rect rect) {
        int[] iArr = RecyclerView.f378k0;
        d0 d0Var = (d0) view.getLayoutParams();
        Rect rect2 = d0Var.f2309a;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) d0Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) d0Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) d0Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) d0Var).bottomMargin);
    }

    public final int w() {
        RecyclerView recyclerView = this.f2298b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int x() {
        RecyclerView recyclerView = this.f2298b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int y() {
        RecyclerView recyclerView = this.f2298b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int z() {
        RecyclerView recyclerView = this.f2298b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public void K(RecyclerView recyclerView) {
    }

    public void Q(int i2) {
    }

    public void J() {
    }

    public void O(i0 i0Var, l0 l0Var, View view, g0.i iVar) {
    }
}
