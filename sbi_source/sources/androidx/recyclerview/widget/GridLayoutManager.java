package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.emoji2.text.n;
import g0.i;
import v0.c0;
import v0.d0;
import v0.i0;
import v0.l0;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public final n A;
    public final Rect B;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f363v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int[] f364w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public View[] f365x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final SparseIntArray f366y;
    public final SparseIntArray z;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.f363v = -1;
        this.f366y = new SparseIntArray();
        this.z = new SparseIntArray();
        n nVar = new n(25);
        this.A = nVar;
        this.B = new Rect();
        int i4 = c0.B(context, attributeSet, i2, i3).c;
        if (i4 == this.f363v) {
            return;
        }
        if (i4 < 1) {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i4);
        }
        this.f363v = i4;
        ((SparseIntArray) nVar.f244b).clear();
        W();
    }

    @Override // v0.c0
    public final int C(i0 i0Var, l0 l0Var) {
        if (this.f367k == 0) {
            return this.f363v;
        }
        if (l0Var.a() < 1) {
            return 0;
        }
        return v0(l0Var.a() - 1, i0Var, l0Var) + 1;
    }

    @Override // v0.c0
    public final void O(i0 i0Var, l0 l0Var, View view, i iVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = iVar.f1336a;
        if (view.getLayoutParams() instanceof v0.n) {
            throw null;
        }
        N(view, iVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, v0.c0
    public final int X(int i2, i0 i0Var, l0 l0Var) {
        y0();
        t0();
        return super.X(i2, i0Var, l0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, v0.c0
    public final int Y(int i2, i0 i0Var, l0 l0Var) {
        y0();
        t0();
        return super.Y(i2, i0Var, l0Var);
    }

    @Override // v0.c0
    public final boolean e(d0 d0Var) {
        return d0Var instanceof v0.n;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, v0.c0
    public final int h(l0 l0Var) {
        return d0(l0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, v0.c0
    public final int i(l0 l0Var) {
        return e0(l0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, v0.c0
    public final int k(l0 l0Var) {
        return d0(l0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, v0.c0
    public final int l(l0 l0Var) {
        return e0(l0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, v0.c0
    public final d0 m() {
        return this.f367k == 0 ? new v0.n(-2, -1) : new v0.n(-1, -2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e4  */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v37 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m0(v0.i0 r19, v0.l0 r20, v0.r r21, v0.q r22) {
        /*
            Method dump skipped, instruction units count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.m0(v0.i0, v0.l0, v0.r, v0.q):void");
    }

    @Override // v0.c0
    public final d0 n(Context context, AttributeSet attributeSet) {
        v0.n nVar = new v0.n(context, attributeSet);
        nVar.f2381d = -1;
        nVar.f2382e = 0;
        return nVar;
    }

    @Override // v0.c0
    public final d0 o(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            v0.n nVar = new v0.n((ViewGroup.MarginLayoutParams) layoutParams);
            nVar.f2381d = -1;
            nVar.f2382e = 0;
            return nVar;
        }
        v0.n nVar2 = new v0.n(layoutParams);
        nVar2.f2381d = -1;
        nVar2.f2382e = 0;
        return nVar2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void r0(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.r0(false);
    }

    @Override // v0.c0
    public final int s(i0 i0Var, l0 l0Var) {
        if (this.f367k == 1) {
            return this.f363v;
        }
        if (l0Var.a() < 1) {
            return 0;
        }
        return v0(l0Var.a() - 1, i0Var, l0Var) + 1;
    }

    public final void s0(int i2) {
        int i3;
        int[] iArr = this.f364w;
        int i4 = this.f363v;
        if (iArr == null || iArr.length != i4 + 1 || iArr[iArr.length - 1] != i2) {
            iArr = new int[i4 + 1];
        }
        int i5 = 0;
        iArr[0] = 0;
        int i6 = i2 / i4;
        int i7 = i2 % i4;
        int i8 = 0;
        for (int i9 = 1; i9 <= i4; i9++) {
            i5 += i7;
            if (i5 <= 0 || i4 - i5 >= i7) {
                i3 = i6;
            } else {
                i3 = i6 + 1;
                i5 -= i4;
            }
            i8 += i3;
            iArr[i9] = i8;
        }
        this.f364w = iArr;
    }

    public final void t0() {
        View[] viewArr = this.f365x;
        if (viewArr == null || viewArr.length != this.f363v) {
            this.f365x = new View[this.f363v];
        }
    }

    public final int u0(int i2, int i3) {
        if (this.f367k != 1 || !l0()) {
            int[] iArr = this.f364w;
            return iArr[i3 + i2] - iArr[i2];
        }
        int[] iArr2 = this.f364w;
        int i4 = this.f363v;
        return iArr2[i4 - i2] - iArr2[(i4 - i2) - i3];
    }

    public final int v0(int i2, i0 i0Var, l0 l0Var) {
        boolean z = l0Var.f2371e;
        n nVar = this.A;
        if (!z) {
            nVar.getClass();
            return n.x(i2, this.f363v);
        }
        int iB = i0Var.b(i2);
        if (iB != -1) {
            nVar.getClass();
            return n.x(iB, this.f363v);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i2);
        return 0;
    }

    public final int w0(int i2, i0 i0Var, l0 l0Var) {
        boolean z = l0Var.f2371e;
        n nVar = this.A;
        if (!z) {
            nVar.getClass();
            return 1;
        }
        int i3 = this.f366y.get(i2, -1);
        if (i3 != -1) {
            return i3;
        }
        if (i0Var.b(i2) != -1) {
            nVar.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i2);
        return 1;
    }

    public final void x0(View view, int i2, boolean z) {
        int iR;
        int iR2;
        v0.n nVar = (v0.n) view.getLayoutParams();
        Rect rect = nVar.f2309a;
        int i3 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) nVar).topMargin + ((ViewGroup.MarginLayoutParams) nVar).bottomMargin;
        int i4 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) nVar).leftMargin + ((ViewGroup.MarginLayoutParams) nVar).rightMargin;
        int iU0 = u0(nVar.f2381d, nVar.f2382e);
        if (this.f367k == 1) {
            iR2 = c0.r(false, iU0, i2, i4, ((ViewGroup.MarginLayoutParams) nVar).width);
            iR = c0.r(true, this.f369m.j(), this.f2303h, i3, ((ViewGroup.MarginLayoutParams) nVar).height);
        } else {
            int iR3 = c0.r(false, iU0, i2, i3, ((ViewGroup.MarginLayoutParams) nVar).height);
            int iR4 = c0.r(true, this.f369m.j(), this.f2302g, i4, ((ViewGroup.MarginLayoutParams) nVar).width);
            iR = iR3;
            iR2 = iR4;
        }
        d0 d0Var = (d0) view.getLayoutParams();
        if (z ? b0(view, iR2, iR, d0Var) : a0(view, iR2, iR, d0Var)) {
            view.measure(iR2, iR);
        }
    }

    public final void y0() {
        int iW;
        int iZ;
        if (this.f367k == 1) {
            iW = this.f2304i - y();
            iZ = x();
        } else {
            iW = this.f2305j - w();
            iZ = z();
        }
        s0(iW - iZ);
    }
}
