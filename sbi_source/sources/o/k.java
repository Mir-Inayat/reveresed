package o;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class k extends o {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f1787k = new int[2];

    public static void m(int[] iArr, int i2, int i3, int i4, int i5, float f3, int i6) {
        int i7 = i3 - i2;
        int i8 = i5 - i4;
        if (i6 != -1) {
            if (i6 == 0) {
                iArr[0] = (int) ((i8 * f3) + 0.5f);
                iArr[1] = i8;
                return;
            } else {
                if (i6 != 1) {
                    return;
                }
                iArr[0] = i7;
                iArr[1] = (int) ((i7 * f3) + 0.5f);
                return;
            }
        }
        int i9 = (int) ((i8 * f3) + 0.5f);
        int i10 = (int) ((i7 / f3) + 0.5f);
        if (i9 <= i7) {
            iArr[0] = i9;
            iArr[1] = i8;
        } else if (i10 <= i8) {
            iArr[0] = i7;
            iArr[1] = i10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    @Override // o.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(o.d r24) {
        /*
            Method dump skipped, instruction units count: 901
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.k.a(o.d):void");
    }

    @Override // o.o
    public final void d() {
        n.e eVar;
        n.e eVar2;
        int i2;
        n.e eVar3;
        n.e eVar4;
        int i3;
        n.e eVar5 = this.f1798b;
        boolean z = eVar5.f1629a;
        g gVar = this.f1800e;
        if (z) {
            gVar.d(eVar5.n());
        }
        boolean z2 = gVar.f1782j;
        ArrayList arrayList = gVar.f1783k;
        ArrayList arrayList2 = gVar.f1784l;
        f fVar = this.f1804i;
        f fVar2 = this.f1803h;
        if (!z2) {
            n.e eVar6 = this.f1798b;
            int i4 = eVar6.f1657o0[0];
            this.f1799d = i4;
            if (i4 != 3) {
                if (i4 == 4 && (eVar4 = eVar6.S) != null && ((i3 = eVar4.f1657o0[0]) == 1 || i3 == 4)) {
                    int iN = (eVar4.n() - this.f1798b.H.e()) - this.f1798b.J.e();
                    o.b(fVar2, eVar4.f1634d.f1803h, this.f1798b.H.e());
                    o.b(fVar, eVar4.f1634d.f1804i, -this.f1798b.J.e());
                    gVar.d(iN);
                    return;
                }
                if (i4 == 1) {
                    gVar.d(eVar6.n());
                }
            }
        } else if (this.f1799d == 4 && (eVar2 = (eVar = this.f1798b).S) != null && ((i2 = eVar2.f1657o0[0]) == 1 || i2 == 4)) {
            o.b(fVar2, eVar2.f1634d.f1803h, eVar.H.e());
            o.b(fVar, eVar2.f1634d.f1804i, -this.f1798b.J.e());
            return;
        }
        if (gVar.f1782j) {
            n.e eVar7 = this.f1798b;
            if (eVar7.f1629a) {
                n.d[] dVarArr = eVar7.P;
                n.d dVar = dVarArr[0];
                n.d dVar2 = dVar.f1625f;
                if (dVar2 != null && dVarArr[1].f1625f != null) {
                    if (eVar7.u()) {
                        fVar2.f1778f = this.f1798b.P[0].e();
                        fVar.f1778f = -this.f1798b.P[1].e();
                        return;
                    }
                    f fVarH = o.h(this.f1798b.P[0]);
                    if (fVarH != null) {
                        o.b(fVar2, fVarH, this.f1798b.P[0].e());
                    }
                    f fVarH2 = o.h(this.f1798b.P[1]);
                    if (fVarH2 != null) {
                        o.b(fVar, fVarH2, -this.f1798b.P[1].e());
                    }
                    fVar2.f1775b = true;
                    fVar.f1775b = true;
                    return;
                }
                if (dVar2 != null) {
                    f fVarH3 = o.h(dVar);
                    if (fVarH3 != null) {
                        o.b(fVar2, fVarH3, this.f1798b.P[0].e());
                        o.b(fVar, fVar2, gVar.f1779g);
                        return;
                    }
                    return;
                }
                n.d dVar3 = dVarArr[1];
                if (dVar3.f1625f != null) {
                    f fVarH4 = o.h(dVar3);
                    if (fVarH4 != null) {
                        o.b(fVar, fVarH4, -this.f1798b.P[1].e());
                        o.b(fVar2, fVar, -gVar.f1779g);
                        return;
                    }
                    return;
                }
                if ((eVar7 instanceof n.j) || eVar7.S == null || eVar7.i(7).f1625f != null) {
                    return;
                }
                n.e eVar8 = this.f1798b;
                o.b(fVar2, eVar8.S.f1634d.f1803h, eVar8.o());
                o.b(fVar, fVar2, gVar.f1779g);
                return;
            }
        }
        if (this.f1799d == 3) {
            n.e eVar9 = this.f1798b;
            int i5 = eVar9.f1659q;
            if (i5 == 2) {
                n.e eVar10 = eVar9.S;
                if (eVar10 != null) {
                    g gVar2 = eVar10.f1636e.f1800e;
                    arrayList2.add(gVar2);
                    gVar2.f1783k.add(gVar);
                    gVar.f1775b = true;
                    arrayList.add(fVar2);
                    arrayList.add(fVar);
                }
            } else if (i5 == 3) {
                if (eVar9.f1660r == 3) {
                    fVar2.f1774a = this;
                    fVar.f1774a = this;
                    m mVar = eVar9.f1636e;
                    mVar.f1803h.f1774a = this;
                    mVar.f1804i.f1774a = this;
                    gVar.f1774a = this;
                    if (eVar9.v()) {
                        arrayList2.add(this.f1798b.f1636e.f1800e);
                        this.f1798b.f1636e.f1800e.f1783k.add(gVar);
                        m mVar2 = this.f1798b.f1636e;
                        mVar2.f1800e.f1774a = this;
                        arrayList2.add(mVar2.f1803h);
                        arrayList2.add(this.f1798b.f1636e.f1804i);
                        this.f1798b.f1636e.f1803h.f1783k.add(gVar);
                        this.f1798b.f1636e.f1804i.f1783k.add(gVar);
                    } else if (this.f1798b.u()) {
                        this.f1798b.f1636e.f1800e.f1784l.add(gVar);
                        arrayList.add(this.f1798b.f1636e.f1800e);
                    } else {
                        this.f1798b.f1636e.f1800e.f1784l.add(gVar);
                    }
                } else {
                    g gVar3 = eVar9.f1636e.f1800e;
                    arrayList2.add(gVar3);
                    gVar3.f1783k.add(gVar);
                    this.f1798b.f1636e.f1803h.f1783k.add(gVar);
                    this.f1798b.f1636e.f1804i.f1783k.add(gVar);
                    gVar.f1775b = true;
                    arrayList.add(fVar2);
                    arrayList.add(fVar);
                    fVar2.f1784l.add(gVar);
                    fVar.f1784l.add(gVar);
                }
            }
        }
        n.e eVar11 = this.f1798b;
        n.d[] dVarArr2 = eVar11.P;
        n.d dVar4 = dVarArr2[0];
        n.d dVar5 = dVar4.f1625f;
        if (dVar5 != null && dVarArr2[1].f1625f != null) {
            if (eVar11.u()) {
                fVar2.f1778f = this.f1798b.P[0].e();
                fVar.f1778f = -this.f1798b.P[1].e();
                return;
            }
            f fVarH5 = o.h(this.f1798b.P[0]);
            f fVarH6 = o.h(this.f1798b.P[1]);
            if (fVarH5 != null) {
                fVarH5.b(this);
            }
            if (fVarH6 != null) {
                fVarH6.b(this);
            }
            this.f1805j = 4;
            return;
        }
        if (dVar5 != null) {
            f fVarH7 = o.h(dVar4);
            if (fVarH7 != null) {
                o.b(fVar2, fVarH7, this.f1798b.P[0].e());
                c(fVar, fVar2, 1, gVar);
                return;
            }
            return;
        }
        n.d dVar6 = dVarArr2[1];
        if (dVar6.f1625f != null) {
            f fVarH8 = o.h(dVar6);
            if (fVarH8 != null) {
                o.b(fVar, fVarH8, -this.f1798b.P[1].e());
                c(fVar2, fVar, -1, gVar);
                return;
            }
            return;
        }
        if ((eVar11 instanceof n.j) || (eVar3 = eVar11.S) == null) {
            return;
        }
        o.b(fVar2, eVar3.f1634d.f1803h, eVar11.o());
        c(fVar, fVar2, 1, gVar);
    }

    @Override // o.o
    public final void e() {
        f fVar = this.f1803h;
        if (fVar.f1782j) {
            this.f1798b.X = fVar.f1779g;
        }
    }

    @Override // o.o
    public final void f() {
        this.c = null;
        this.f1803h.c();
        this.f1804i.c();
        this.f1800e.c();
        this.f1802g = false;
    }

    @Override // o.o
    public final boolean k() {
        return this.f1799d != 3 || this.f1798b.f1659q == 0;
    }

    public final void n() {
        this.f1802g = false;
        f fVar = this.f1803h;
        fVar.c();
        fVar.f1782j = false;
        f fVar2 = this.f1804i;
        fVar2.c();
        fVar2.f1782j = false;
        this.f1800e.f1782j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f1798b.f1641g0;
    }
}
