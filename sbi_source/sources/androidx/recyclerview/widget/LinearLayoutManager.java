package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import f0.m0;
import java.lang.reflect.Field;
import t1.e;
import v0.c0;
import v0.d0;
import v0.i0;
import v0.l0;
import v0.p;
import v0.q;
import v0.r;
import v0.s;
import v0.u;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends c0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f367k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public r f368l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public u f369m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f370n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f371o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f372p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f373q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final s f374r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p f375s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final q f376t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int[] f377u;

    public LinearLayoutManager() {
        this.f367k = 1;
        this.f370n = false;
        this.f371o = false;
        this.f372p = false;
        this.f373q = true;
        this.f374r = null;
        this.f375s = new p(0);
        this.f376t = new q();
        this.f377u = new int[2];
        q0(1);
        b(null);
        if (this.f370n) {
            this.f370n = false;
            W();
        }
    }

    @Override // v0.c0
    public final boolean E() {
        return true;
    }

    @Override // v0.c0
    public final void M(AccessibilityEvent accessibilityEvent) {
        super.M(accessibilityEvent);
        if (q() > 0) {
            View viewI0 = i0(0, q(), false);
            accessibilityEvent.setFromIndex(viewI0 == null ? -1 : c0.A(viewI0));
            View viewI02 = i0(q() - 1, -1, false);
            accessibilityEvent.setToIndex(viewI02 != null ? c0.A(viewI02) : -1);
        }
    }

    @Override // v0.c0
    public final Parcelable P() {
        s sVar = this.f374r;
        if (sVar != null) {
            s sVar2 = new s();
            sVar2.f2425a = sVar.f2425a;
            sVar2.f2426b = sVar.f2426b;
            sVar2.c = sVar.c;
            return sVar2;
        }
        s sVar3 = new s();
        if (q() <= 0) {
            sVar3.f2425a = -1;
            return sVar3;
        }
        f0();
        boolean z = false ^ this.f371o;
        sVar3.c = z;
        if (z) {
            View viewJ0 = j0();
            sVar3.f2426b = this.f369m.g() - this.f369m.b(viewJ0);
            sVar3.f2425a = c0.A(viewJ0);
            return sVar3;
        }
        View viewK0 = k0();
        sVar3.f2425a = c0.A(viewK0);
        sVar3.f2426b = this.f369m.e(viewK0) - this.f369m.i();
        return sVar3;
    }

    @Override // v0.c0
    public int X(int i2, i0 i0Var, l0 l0Var) {
        if (this.f367k == 1) {
            return 0;
        }
        return p0(i2, i0Var, l0Var);
    }

    @Override // v0.c0
    public int Y(int i2, i0 i0Var, l0 l0Var) {
        if (this.f367k == 0) {
            return 0;
        }
        return p0(i2, i0Var, l0Var);
    }

    @Override // v0.c0
    public final void b(String str) {
        if (this.f374r == null) {
            super.b(str);
        }
    }

    @Override // v0.c0
    public final boolean c() {
        return this.f367k == 0;
    }

    public final int c0(l0 l0Var) {
        if (q() == 0) {
            return 0;
        }
        f0();
        u uVar = this.f369m;
        boolean z = !this.f373q;
        return e.e(l0Var, uVar, h0(z), g0(z), this, this.f373q);
    }

    @Override // v0.c0
    public final boolean d() {
        return this.f367k == 1;
    }

    public final int d0(l0 l0Var) {
        if (q() == 0) {
            return 0;
        }
        f0();
        u uVar = this.f369m;
        boolean z = !this.f373q;
        return e.f(l0Var, uVar, h0(z), g0(z), this, this.f373q, this.f371o);
    }

    public final int e0(l0 l0Var) {
        if (q() == 0) {
            return 0;
        }
        f0();
        u uVar = this.f369m;
        boolean z = !this.f373q;
        return e.g(l0Var, uVar, h0(z), g0(z), this, this.f373q);
    }

    public final void f0() {
        if (this.f368l == null) {
            r rVar = new r();
            rVar.f2414a = true;
            rVar.f2420h = 0;
            rVar.f2421i = 0;
            rVar.f2422j = null;
            this.f368l = rVar;
        }
    }

    @Override // v0.c0
    public final int g(l0 l0Var) {
        return c0(l0Var);
    }

    public final View g0(boolean z) {
        return this.f371o ? i0(0, q(), z) : i0(q() - 1, -1, z);
    }

    @Override // v0.c0
    public int h(l0 l0Var) {
        return d0(l0Var);
    }

    public final View h0(boolean z) {
        return this.f371o ? i0(q() - 1, -1, z) : i0(0, q(), z);
    }

    @Override // v0.c0
    public int i(l0 l0Var) {
        return e0(l0Var);
    }

    public final View i0(int i2, int i3, boolean z) {
        f0();
        int i4 = z ? 24579 : 320;
        return this.f367k == 0 ? this.c.d(i2, i3, i4, 320) : this.f2299d.d(i2, i3, i4, 320);
    }

    @Override // v0.c0
    public final int j(l0 l0Var) {
        return c0(l0Var);
    }

    public final View j0() {
        return p(this.f371o ? 0 : q() - 1);
    }

    @Override // v0.c0
    public int k(l0 l0Var) {
        return d0(l0Var);
    }

    public final View k0() {
        return p(this.f371o ? q() - 1 : 0);
    }

    @Override // v0.c0
    public int l(l0 l0Var) {
        return e0(l0Var);
    }

    public final boolean l0() {
        RecyclerView recyclerView = this.f2298b;
        Field field = m0.f1276a;
        return recyclerView.getLayoutDirection() == 1;
    }

    @Override // v0.c0
    public d0 m() {
        return new d0(-2, -2);
    }

    public void m0(i0 i0Var, l0 l0Var, r rVar, q qVar) {
        int i2;
        int iD;
        int i3;
        int iX;
        int i4;
        View viewB = rVar.b(i0Var);
        if (viewB == null) {
            qVar.f2410b = true;
            return;
        }
        d0 d0Var = (d0) viewB.getLayoutParams();
        if (rVar.f2422j == null) {
            if (this.f371o == (rVar.f2418f == -1)) {
                a(viewB, -1, false);
            } else {
                a(viewB, 0, false);
            }
        } else {
            if (this.f371o == (rVar.f2418f == -1)) {
                a(viewB, -1, true);
            } else {
                a(viewB, 0, true);
            }
        }
        d0 d0Var2 = (d0) viewB.getLayoutParams();
        Rect rectT = this.f2298b.t(viewB);
        int i5 = rectT.left + rectT.right;
        int i6 = rectT.top + rectT.bottom;
        int iR = c0.r(c(), this.f2304i, this.f2302g, y() + x() + ((ViewGroup.MarginLayoutParams) d0Var2).leftMargin + ((ViewGroup.MarginLayoutParams) d0Var2).rightMargin + i5, ((ViewGroup.MarginLayoutParams) d0Var2).width);
        int iR2 = c0.r(d(), this.f2305j, this.f2303h, w() + z() + ((ViewGroup.MarginLayoutParams) d0Var2).topMargin + ((ViewGroup.MarginLayoutParams) d0Var2).bottomMargin + i6, ((ViewGroup.MarginLayoutParams) d0Var2).height);
        if (a0(viewB, iR, iR2, d0Var2)) {
            viewB.measure(iR, iR2);
        }
        qVar.f2409a = this.f369m.c(viewB);
        if (this.f367k == 1) {
            if (l0()) {
                iD = this.f2304i - y();
                iX = iD - this.f369m.d(viewB);
            } else {
                iX = x();
                iD = this.f369m.d(viewB) + iX;
            }
            if (rVar.f2418f == -1) {
                i4 = rVar.f2415b;
                i2 = i4 - qVar.f2409a;
            } else {
                int i7 = rVar.f2415b;
                i3 = qVar.f2409a + i7;
                i2 = i7;
                i4 = i3;
            }
        } else {
            int iZ = z();
            int iD2 = this.f369m.d(viewB) + iZ;
            if (rVar.f2418f == -1) {
                int i8 = rVar.f2415b;
                int i9 = i8 - qVar.f2409a;
                i2 = iZ;
                iD = i8;
                i4 = iD2;
                iX = i9;
            } else {
                int i10 = rVar.f2415b;
                int i11 = qVar.f2409a + i10;
                i2 = iZ;
                iD = i11;
                i3 = iD2;
                iX = i10;
                i4 = i3;
            }
        }
        c0.G(viewB, iX, i2, iD, i4);
        d0Var.getClass();
        throw null;
    }

    public final void n0(i0 i0Var, r rVar) {
        if (!rVar.f2414a || rVar.f2423k) {
            return;
        }
        int i2 = rVar.f2419g;
        int i3 = rVar.f2421i;
        if (rVar.f2418f == -1) {
            int iQ = q();
            if (i2 < 0) {
                return;
            }
            int iF = (this.f369m.f() - i2) + i3;
            if (this.f371o) {
                for (int i4 = 0; i4 < iQ; i4++) {
                    View viewP = p(i4);
                    if (this.f369m.e(viewP) < iF || this.f369m.l(viewP) < iF) {
                        o0(i0Var, 0, i4);
                        return;
                    }
                }
                return;
            }
            int i5 = iQ - 1;
            for (int i6 = i5; i6 >= 0; i6--) {
                View viewP2 = p(i6);
                if (this.f369m.e(viewP2) < iF || this.f369m.l(viewP2) < iF) {
                    o0(i0Var, i5, i6);
                    return;
                }
            }
            return;
        }
        if (i2 < 0) {
            return;
        }
        int i7 = i2 - i3;
        int iQ2 = q();
        if (!this.f371o) {
            for (int i8 = 0; i8 < iQ2; i8++) {
                View viewP3 = p(i8);
                if (this.f369m.b(viewP3) > i7 || this.f369m.k(viewP3) > i7) {
                    o0(i0Var, 0, i8);
                    return;
                }
            }
            return;
        }
        int i9 = iQ2 - 1;
        for (int i10 = i9; i10 >= 0; i10--) {
            View viewP4 = p(i10);
            if (this.f369m.b(viewP4) > i7 || this.f369m.k(viewP4) > i7) {
                o0(i0Var, i9, i10);
                return;
            }
        }
    }

    public final void o0(i0 i0Var, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        if (i3 <= i2) {
            while (i2 > i3) {
                View viewP = p(i2);
                U(i2);
                i0Var.g(viewP);
                i2--;
            }
            return;
        }
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            View viewP2 = p(i4);
            U(i4);
            i0Var.g(viewP2);
        }
    }

    public final int p0(int i2, i0 i0Var, l0 l0Var) {
        int i3;
        int i4;
        int iY;
        if (q() != 0 && i2 != 0) {
            f0();
            this.f368l.f2414a = true;
            int i5 = i2 <= 0 ? -1 : 1;
            int iAbs = Math.abs(i2);
            this.f368l.f2423k = this.f369m.h() == 0 && this.f369m.f() == 0;
            this.f368l.f2418f = i5;
            int[] iArr = this.f377u;
            iArr[0] = 0;
            iArr[1] = 0;
            l0Var.getClass();
            int i6 = this.f368l.f2418f;
            iArr[0] = 0;
            iArr[1] = 0;
            int iMax = Math.max(0, iArr[0]);
            int iMax2 = Math.max(0, iArr[1]);
            boolean z = i5 == 1;
            r rVar = this.f368l;
            int i7 = z ? iMax2 : iMax;
            rVar.f2420h = i7;
            if (!z) {
                iMax = iMax2;
            }
            rVar.f2421i = iMax;
            if (z) {
                u uVar = this.f369m;
                switch (uVar.c) {
                    case 0:
                        iY = uVar.f2442a.y();
                        break;
                    default:
                        iY = uVar.f2442a.w();
                        break;
                }
                rVar.f2420h = iY + i7;
                View viewJ0 = j0();
                r rVar2 = this.f368l;
                rVar2.f2417e = this.f371o ? -1 : 1;
                int iA = c0.A(viewJ0);
                r rVar3 = this.f368l;
                rVar2.f2416d = iA + rVar3.f2417e;
                rVar3.f2415b = this.f369m.b(viewJ0);
                i3 = this.f369m.b(viewJ0) - this.f369m.g();
            } else {
                View viewK0 = k0();
                r rVar4 = this.f368l;
                rVar4.f2420h = this.f369m.i() + rVar4.f2420h;
                r rVar5 = this.f368l;
                rVar5.f2417e = this.f371o ? 1 : -1;
                int iA2 = c0.A(viewK0);
                r rVar6 = this.f368l;
                rVar5.f2416d = iA2 + rVar6.f2417e;
                rVar6.f2415b = this.f369m.e(viewK0);
                i3 = (-this.f369m.e(viewK0)) + this.f369m.i();
            }
            r rVar7 = this.f368l;
            rVar7.c = iAbs;
            rVar7.c = iAbs - i3;
            rVar7.f2419g = i3;
            r rVar8 = this.f368l;
            int i8 = rVar8.f2419g;
            int i9 = rVar8.c;
            int i10 = rVar8.f2419g;
            if (i10 != Integer.MIN_VALUE) {
                if (i9 < 0) {
                    rVar8.f2419g = i10 + i9;
                }
                n0(i0Var, rVar8);
            }
            int i11 = rVar8.c + rVar8.f2420h;
            while (true) {
                if ((rVar8.f2423k || i11 > 0) && (i4 = rVar8.f2416d) >= 0 && i4 < l0Var.a()) {
                    q qVar = this.f376t;
                    qVar.f2409a = 0;
                    qVar.f2410b = false;
                    qVar.c = false;
                    qVar.f2411d = false;
                    m0(i0Var, l0Var, rVar8, qVar);
                    if (!qVar.f2410b) {
                        int i12 = rVar8.f2415b;
                        int i13 = qVar.f2409a;
                        rVar8.f2415b = (rVar8.f2418f * i13) + i12;
                        if (!qVar.c || rVar8.f2422j != null || !l0Var.f2371e) {
                            rVar8.c -= i13;
                            i11 -= i13;
                        }
                        int i14 = rVar8.f2419g;
                        if (i14 != Integer.MIN_VALUE) {
                            int i15 = i14 + i13;
                            rVar8.f2419g = i15;
                            int i16 = rVar8.c;
                            if (i16 < 0) {
                                rVar8.f2419g = i15 + i16;
                            }
                            n0(i0Var, rVar8);
                        }
                    }
                }
            }
            int i17 = (i9 - rVar8.c) + i8;
            if (i17 >= 0) {
                if (iAbs > i17) {
                    i2 = i5 * i17;
                }
                this.f369m.m(-i2);
                this.f368l.getClass();
                return i2;
            }
        }
        return 0;
    }

    public final void q0(int i2) {
        if (i2 != 0 && i2 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i2);
        }
        b(null);
        if (i2 != this.f367k || this.f369m == null) {
            this.f369m = u.a(this, i2);
            this.f375s.getClass();
            this.f367k = i2;
            W();
        }
    }

    public void r0(boolean z) {
        b(null);
        if (this.f372p == z) {
            return;
        }
        this.f372p = z;
        W();
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f367k = 1;
        this.f370n = false;
        this.f371o = false;
        this.f372p = false;
        this.f373q = true;
        this.f374r = null;
        this.f375s = new p(0);
        this.f376t = new q();
        this.f377u = new int[2];
        p pVarB = c0.B(context, attributeSet, i2, i3);
        q0(pVarB.f2404b);
        boolean z = pVarB.f2405d;
        b(null);
        if (z != this.f370n) {
            this.f370n = z;
            W();
        }
        r0(pVarB.f2406e);
    }

    @Override // v0.c0
    public final void L(RecyclerView recyclerView) {
    }
}
