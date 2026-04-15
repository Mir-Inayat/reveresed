package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.emoji2.text.q;
import androidx.fragment.app.b;
import i.j;
import java.util.ArrayList;
import java.util.BitSet;
import t1.e;
import t1.g;
import v0.c0;
import v0.d0;
import v0.i0;
import v0.l0;
import v0.o;
import v0.p;
import v0.r0;
import v0.t0;
import v0.u;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends c0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f415k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j[] f416l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final u f417m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final u f418n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f419o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o f420p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f421q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f422r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final BitSet f423s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final q f424t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f425u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f426v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Rect f427w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f428x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final b f429y;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f415k = -1;
        this.f421q = false;
        q qVar = new q(11, false);
        this.f424t = qVar;
        this.f425u = 2;
        this.f427w = new Rect();
        new g(this);
        this.f428x = true;
        this.f429y = new b(10, this);
        p pVarB = c0.B(context, attributeSet, i2, i3);
        int i4 = pVarB.f2404b;
        if (i4 != 0 && i4 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        b(null);
        if (i4 != this.f419o) {
            this.f419o = i4;
            u uVar = this.f417m;
            this.f417m = this.f418n;
            this.f418n = uVar;
            W();
        }
        int i5 = pVarB.c;
        b(null);
        if (i5 != this.f415k) {
            qVar.a();
            W();
            this.f415k = i5;
            this.f423s = new BitSet(this.f415k);
            this.f416l = new j[this.f415k];
            for (int i6 = 0; i6 < this.f415k; i6++) {
                this.f416l[i6] = new j(this, i6);
            }
            W();
        }
        boolean z = pVarB.f2405d;
        b(null);
        this.f421q = z;
        W();
        o oVar = new o();
        oVar.f2389a = true;
        oVar.f2393f = 0;
        oVar.f2394g = 0;
        this.f420p = oVar;
        this.f417m = u.a(this, this.f419o);
        this.f418n = u.a(this, 1 - this.f419o);
    }

    public static int n0(int i2, int i3, int i4) {
        int mode;
        return (!(i3 == 0 && i4 == 0) && ((mode = View.MeasureSpec.getMode(i2)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - i3) - i4), mode) : i2;
    }

    @Override // v0.c0
    public final boolean E() {
        return this.f425u != 0;
    }

    @Override // v0.c0
    public final void H(int i2) {
        super.H(i2);
        for (int i3 = 0; i3 < this.f415k; i3++) {
            j jVar = this.f416l[i3];
            int i4 = jVar.f1380b;
            if (i4 != Integer.MIN_VALUE) {
                jVar.f1380b = i4 + i2;
            }
            int i5 = jVar.c;
            if (i5 != Integer.MIN_VALUE) {
                jVar.c = i5 + i2;
            }
        }
    }

    @Override // v0.c0
    public final void I(int i2) {
        super.I(i2);
        for (int i3 = 0; i3 < this.f415k; i3++) {
            j jVar = this.f416l[i3];
            int i4 = jVar.f1380b;
            if (i4 != Integer.MIN_VALUE) {
                jVar.f1380b = i4 + i2;
            }
            int i5 = jVar.c;
            if (i5 != Integer.MIN_VALUE) {
                jVar.c = i5 + i2;
            }
        }
    }

    @Override // v0.c0
    public final void J() {
        this.f424t.a();
        for (int i2 = 0; i2 < this.f415k; i2++) {
            this.f416l[i2].b();
        }
    }

    @Override // v0.c0
    public final void L(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f2298b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f429y);
        }
        for (int i2 = 0; i2 < this.f415k; i2++) {
            this.f416l[i2].b();
        }
        recyclerView.requestLayout();
    }

    @Override // v0.c0
    public final void M(AccessibilityEvent accessibilityEvent) {
        super.M(accessibilityEvent);
        if (q() > 0) {
            View viewF0 = f0(false);
            View viewE0 = e0(false);
            if (viewF0 == null || viewE0 == null) {
                return;
            }
            int iA = c0.A(viewF0);
            int iA2 = c0.A(viewE0);
            if (iA < iA2) {
                accessibilityEvent.setFromIndex(iA);
                accessibilityEvent.setToIndex(iA2);
            } else {
                accessibilityEvent.setFromIndex(iA2);
                accessibilityEvent.setToIndex(iA);
            }
        }
    }

    @Override // v0.c0
    public final Parcelable P() {
        int iE;
        int i2;
        int[] iArr;
        t0 t0Var = new t0();
        t0Var.f2439h = this.f421q;
        t0Var.f2440i = this.f426v;
        t0Var.f2441j = false;
        q qVar = this.f424t;
        if (qVar == null || (iArr = (int[]) qVar.f246b) == null) {
            t0Var.f2436e = 0;
        } else {
            t0Var.f2437f = iArr;
            t0Var.f2436e = iArr.length;
            t0Var.f2438g = (ArrayList) qVar.c;
        }
        if (q() <= 0) {
            t0Var.f2433a = -1;
            t0Var.f2434b = -1;
            t0Var.c = 0;
            return t0Var;
        }
        t0Var.f2433a = this.f426v ? h0() : g0();
        View viewE0 = this.f422r ? e0(true) : f0(true);
        t0Var.f2434b = viewE0 != null ? c0.A(viewE0) : -1;
        int i3 = this.f415k;
        t0Var.c = i3;
        t0Var.f2435d = new int[i3];
        for (int i4 = 0; i4 < this.f415k; i4++) {
            if (this.f426v) {
                iE = this.f416l[i4].d(Integer.MIN_VALUE);
                if (iE != Integer.MIN_VALUE) {
                    i2 = this.f417m.g();
                    iE -= i2;
                }
            } else {
                iE = this.f416l[i4].e(Integer.MIN_VALUE);
                if (iE != Integer.MIN_VALUE) {
                    i2 = this.f417m.i();
                    iE -= i2;
                }
            }
            t0Var.f2435d[i4] = iE;
        }
        return t0Var;
    }

    @Override // v0.c0
    public final void Q(int i2) {
        if (i2 == 0) {
            c0();
        }
    }

    @Override // v0.c0
    public final int X(int i2, i0 i0Var, l0 l0Var) {
        return m0(i2, i0Var, l0Var);
    }

    @Override // v0.c0
    public final int Y(int i2, i0 i0Var, l0 l0Var) {
        return m0(i2, i0Var, l0Var);
    }

    @Override // v0.c0
    public final void b(String str) {
        super.b(str);
    }

    @Override // v0.c0
    public final boolean c() {
        return this.f419o == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0113  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c0() {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.c0():boolean");
    }

    @Override // v0.c0
    public final boolean d() {
        return this.f419o == 1;
    }

    public final int d0(l0 l0Var) {
        if (q() == 0) {
            return 0;
        }
        boolean z = !this.f428x;
        return e.f(l0Var, this.f417m, f0(z), e0(z), this, this.f428x, this.f422r);
    }

    @Override // v0.c0
    public final boolean e(d0 d0Var) {
        return d0Var instanceof r0;
    }

    public final View e0(boolean z) {
        int i2 = this.f417m.i();
        int iG = this.f417m.g();
        View view = null;
        for (int iQ = q() - 1; iQ >= 0; iQ--) {
            View viewP = p(iQ);
            int iE = this.f417m.e(viewP);
            int iB = this.f417m.b(viewP);
            if (iB > i2 && iE < iG) {
                if (iB <= iG || !z) {
                    return viewP;
                }
                if (view == null) {
                    view = viewP;
                }
            }
        }
        return view;
    }

    public final View f0(boolean z) {
        int i2 = this.f417m.i();
        int iG = this.f417m.g();
        int iQ = q();
        View view = null;
        for (int i3 = 0; i3 < iQ; i3++) {
            View viewP = p(i3);
            int iE = this.f417m.e(viewP);
            if (this.f417m.b(viewP) > i2 && iE < iG) {
                if (iE >= i2 || !z) {
                    return viewP;
                }
                if (view == null) {
                    view = viewP;
                }
            }
        }
        return view;
    }

    @Override // v0.c0
    public final int g(l0 l0Var) {
        if (q() == 0) {
            return 0;
        }
        boolean z = !this.f428x;
        return e.e(l0Var, this.f417m, f0(z), e0(z), this, this.f428x);
    }

    public final int g0() {
        if (q() == 0) {
            return 0;
        }
        return c0.A(p(0));
    }

    @Override // v0.c0
    public final int h(l0 l0Var) {
        return d0(l0Var);
    }

    public final int h0() {
        int iQ = q();
        if (iQ == 0) {
            return 0;
        }
        return c0.A(p(iQ - 1));
    }

    @Override // v0.c0
    public final int i(l0 l0Var) {
        if (q() == 0) {
            return 0;
        }
        boolean z = !this.f428x;
        return e.g(l0Var, this.f417m, f0(z), e0(z), this, this.f428x);
    }

    public final void i0(View view, int i2, int i3) {
        RecyclerView recyclerView = this.f2298b;
        Rect rect = this.f427w;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.t(view));
        }
        r0 r0Var = (r0) view.getLayoutParams();
        int iN0 = n0(i2, ((ViewGroup.MarginLayoutParams) r0Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) r0Var).rightMargin + rect.right);
        int iN02 = n0(i3, ((ViewGroup.MarginLayoutParams) r0Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) r0Var).bottomMargin + rect.bottom);
        if (a0(view, iN0, iN02, r0Var)) {
            view.measure(iN0, iN02);
        }
    }

    @Override // v0.c0
    public final int j(l0 l0Var) {
        if (q() == 0) {
            return 0;
        }
        boolean z = !this.f428x;
        return e.e(l0Var, this.f417m, f0(z), e0(z), this, this.f428x);
    }

    public final void j0(i0 i0Var, o oVar) {
        if (!oVar.f2389a || oVar.f2396i) {
            return;
        }
        if (oVar.f2390b == 0) {
            if (oVar.f2392e == -1) {
                k0(i0Var, oVar.f2394g);
                return;
            } else {
                l0(i0Var, oVar.f2393f);
                return;
            }
        }
        int i2 = 1;
        if (oVar.f2392e == -1) {
            int i3 = oVar.f2393f;
            int iE = this.f416l[0].e(i3);
            while (i2 < this.f415k) {
                int iE2 = this.f416l[i2].e(i3);
                if (iE2 > iE) {
                    iE = iE2;
                }
                i2++;
            }
            int i4 = i3 - iE;
            k0(i0Var, i4 < 0 ? oVar.f2394g : oVar.f2394g - Math.min(i4, oVar.f2390b));
            return;
        }
        int i5 = oVar.f2394g;
        int iD = this.f416l[0].d(i5);
        while (i2 < this.f415k) {
            int iD2 = this.f416l[i2].d(i5);
            if (iD2 < iD) {
                iD = iD2;
            }
            i2++;
        }
        int i6 = iD - oVar.f2394g;
        l0(i0Var, i6 < 0 ? oVar.f2393f : Math.min(i6, oVar.f2390b) + oVar.f2393f);
    }

    @Override // v0.c0
    public final int k(l0 l0Var) {
        return d0(l0Var);
    }

    public final void k0(i0 i0Var, int i2) {
        int iQ = q() - 1;
        if (iQ >= 0) {
            View viewP = p(iQ);
            if (this.f417m.e(viewP) < i2 || this.f417m.l(viewP) < i2) {
                return;
            }
            r0 r0Var = (r0) viewP.getLayoutParams();
            r0Var.getClass();
            if (((ArrayList) r0Var.f2424d.f1383f).size() == 1) {
                return;
            }
            ArrayList arrayList = (ArrayList) r0Var.f2424d.f1383f;
            ((r0) ((View) arrayList.remove(arrayList.size() - 1)).getLayoutParams()).f2424d = null;
            throw null;
        }
    }

    @Override // v0.c0
    public final int l(l0 l0Var) {
        if (q() == 0) {
            return 0;
        }
        boolean z = !this.f428x;
        return e.g(l0Var, this.f417m, f0(z), e0(z), this, this.f428x);
    }

    public final void l0(i0 i0Var, int i2) {
        if (q() > 0) {
            View viewP = p(0);
            if (this.f417m.b(viewP) > i2 || this.f417m.k(viewP) > i2) {
                return;
            }
            r0 r0Var = (r0) viewP.getLayoutParams();
            r0Var.getClass();
            if (((ArrayList) r0Var.f2424d.f1383f).size() == 1) {
                return;
            }
            j jVar = r0Var.f2424d;
            ArrayList arrayList = (ArrayList) jVar.f1383f;
            ((r0) ((View) arrayList.remove(0)).getLayoutParams()).f2424d = null;
            if (arrayList.size() == 0) {
                jVar.c = Integer.MIN_VALUE;
            }
            throw null;
        }
    }

    @Override // v0.c0
    public final d0 m() {
        return this.f419o == 0 ? new r0(-2, -1) : new r0(-1, -2);
    }

    public final int m0(int i2, i0 i0Var, l0 l0Var) {
        int iG0;
        int i3;
        int iG;
        if (q() == 0 || i2 == 0) {
            return 0;
        }
        if (i2 > 0) {
            iG0 = h0();
            i3 = 1;
        } else {
            iG0 = g0();
            i3 = -1;
        }
        o oVar = this.f420p;
        oVar.f2389a = true;
        o oVar2 = this.f420p;
        boolean z = false;
        oVar2.f2390b = 0;
        oVar2.c = iG0;
        RecyclerView recyclerView = this.f2298b;
        if (recyclerView == null || !recyclerView.f390f) {
            oVar2.f2394g = this.f417m.f();
            oVar2.f2393f = 0;
        } else {
            oVar2.f2393f = this.f417m.i();
            oVar2.f2394g = this.f417m.g();
        }
        oVar2.f2395h = false;
        oVar2.f2389a = true;
        if (this.f417m.h() == 0 && this.f417m.f() == 0) {
            z = true;
        }
        oVar2.f2396i = z;
        o oVar3 = this.f420p;
        oVar3.f2392e = i3;
        oVar3.f2391d = this.f422r != (i3 == -1) ? -1 : 1;
        oVar.c = iG0 + oVar.f2391d;
        oVar.f2390b = Math.abs(i2);
        this.f423s.set(0, this.f415k, true);
        o oVar4 = this.f420p;
        boolean z2 = oVar4.f2396i;
        o oVar5 = this.f420p;
        int i4 = z2 ? oVar5.f2392e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : oVar5.f2392e == 1 ? oVar5.f2394g + oVar5.f2390b : oVar5.f2393f - oVar5.f2390b;
        int i5 = oVar5.f2392e;
        for (int i6 = 0; i6 < this.f415k; i6++) {
            if (!((ArrayList) this.f416l[i6].f1383f).isEmpty()) {
                j jVar = this.f416l[i6];
                int i7 = jVar.f1381d;
                int i8 = jVar.f1382e;
                if (i5 == -1) {
                    int i9 = jVar.f1380b;
                    if (i9 == Integer.MIN_VALUE) {
                        View view = (View) ((ArrayList) jVar.f1383f).get(0);
                        r0 r0Var = (r0) view.getLayoutParams();
                        jVar.f1380b = ((StaggeredGridLayoutManager) jVar.f1384g).f417m.e(view);
                        r0Var.getClass();
                        i9 = jVar.f1380b;
                    }
                    if (i9 + i7 <= i4) {
                        this.f423s.set(i8, false);
                    }
                } else {
                    int i10 = jVar.c;
                    if (i10 == Integer.MIN_VALUE) {
                        jVar.a();
                        i10 = jVar.c;
                    }
                    if (i10 - i7 >= i4) {
                        this.f423s.set(i8, false);
                    }
                }
            }
        }
        if (this.f422r) {
            this.f417m.g();
        } else {
            this.f417m.i();
        }
        int i11 = oVar5.c;
        if (i11 >= 0 && i11 < l0Var.a() && (oVar4.f2396i || !this.f423s.isEmpty())) {
            View viewD = i0Var.d(oVar5.c);
            oVar5.c += oVar5.f2391d;
            ((r0) viewD.getLayoutParams()).getClass();
            throw null;
        }
        j0(i0Var, oVar4);
        if (oVar4.f2392e == -1) {
            int i12 = this.f417m.i();
            int iE = this.f416l[0].e(i12);
            for (int i13 = 1; i13 < this.f415k; i13++) {
                int iE2 = this.f416l[i13].e(i12);
                if (iE2 < iE) {
                    iE = iE2;
                }
            }
            iG = this.f417m.i() - iE;
        } else {
            int iG2 = this.f417m.g();
            int iD = this.f416l[0].d(iG2);
            for (int i14 = 1; i14 < this.f415k; i14++) {
                int iD2 = this.f416l[i14].d(iG2);
                if (iD2 > iD) {
                    iD = iD2;
                }
            }
            iG = iD - this.f417m.g();
        }
        int iMin = iG > 0 ? Math.min(oVar5.f2390b, iG) : 0;
        int i15 = oVar5.f2390b < iMin ? i2 : i2 < 0 ? -iMin : iMin;
        this.f417m.m(-i15);
        this.f426v = this.f422r;
        oVar5.f2390b = 0;
        j0(i0Var, oVar5);
        return i15;
    }

    @Override // v0.c0
    public final d0 n(Context context, AttributeSet attributeSet) {
        return new r0(context, attributeSet);
    }

    @Override // v0.c0
    public final d0 o(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new r0((ViewGroup.MarginLayoutParams) layoutParams) : new r0(layoutParams);
    }
}
