package o;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class m extends o {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f f1790k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f1791l;

    @Override // o.d
    public final void a(d dVar) {
        float f3;
        float f4;
        float f5;
        int i2;
        if (l.f.a(this.f1805j) == 3) {
            n.e eVar = this.f1798b;
            l(eVar.I, eVar.K, 1);
            return;
        }
        g gVar = this.f1800e;
        if (gVar.c && !gVar.f1782j && this.f1799d == 3) {
            n.e eVar2 = this.f1798b;
            int i3 = eVar2.f1660r;
            if (i3 == 2) {
                n.e eVar3 = eVar2.S;
                if (eVar3 != null) {
                    if (eVar3.f1636e.f1800e.f1782j) {
                        gVar.d((int) ((r5.f1779g * eVar2.f1667y) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                g gVar2 = eVar2.f1634d.f1800e;
                if (gVar2.f1782j) {
                    int i4 = eVar2.W;
                    if (i4 == -1) {
                        f3 = gVar2.f1779g;
                        f4 = eVar2.V;
                    } else if (i4 == 0) {
                        f5 = gVar2.f1779g * eVar2.V;
                        i2 = (int) (f5 + 0.5f);
                        gVar.d(i2);
                    } else if (i4 != 1) {
                        i2 = 0;
                        gVar.d(i2);
                    } else {
                        f3 = gVar2.f1779g;
                        f4 = eVar2.V;
                    }
                    f5 = f3 / f4;
                    i2 = (int) (f5 + 0.5f);
                    gVar.d(i2);
                }
            }
        }
        f fVar = this.f1803h;
        boolean z = fVar.c;
        ArrayList arrayList = fVar.f1784l;
        if (z) {
            f fVar2 = this.f1804i;
            boolean z2 = fVar2.c;
            ArrayList arrayList2 = fVar2.f1784l;
            if (z2) {
                if (fVar.f1782j && fVar2.f1782j && gVar.f1782j) {
                    return;
                }
                if (!gVar.f1782j && this.f1799d == 3) {
                    n.e eVar4 = this.f1798b;
                    if (eVar4.f1659q == 0 && !eVar4.v()) {
                        f fVar3 = (f) arrayList.get(0);
                        f fVar4 = (f) arrayList2.get(0);
                        int i5 = fVar3.f1779g + fVar.f1778f;
                        int i6 = fVar4.f1779g + fVar2.f1778f;
                        fVar.d(i5);
                        fVar2.d(i6);
                        gVar.d(i6 - i5);
                        return;
                    }
                }
                if (!gVar.f1782j && this.f1799d == 3 && this.f1797a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    f fVar5 = (f) arrayList.get(0);
                    int i7 = (((f) arrayList2.get(0)).f1779g + fVar2.f1778f) - (fVar5.f1779g + fVar.f1778f);
                    int i8 = gVar.f1785m;
                    if (i7 < i8) {
                        gVar.d(i7);
                    } else {
                        gVar.d(i8);
                    }
                }
                if (gVar.f1782j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    f fVar6 = (f) arrayList.get(0);
                    f fVar7 = (f) arrayList2.get(0);
                    int i9 = fVar6.f1779g;
                    int i10 = fVar.f1778f + i9;
                    int i11 = fVar7.f1779g;
                    int i12 = fVar2.f1778f + i11;
                    float f6 = this.f1798b.f1635d0;
                    if (fVar6 == fVar7) {
                        f6 = 0.5f;
                    } else {
                        i9 = i10;
                        i11 = i12;
                    }
                    fVar.d((int) ((((i11 - i9) - gVar.f1779g) * f6) + i9 + 0.5f));
                    fVar2.d(fVar.f1779g + gVar.f1779g);
                }
            }
        }
    }

    @Override // o.o
    public final void d() {
        n.e eVar;
        n.e eVar2;
        n.e eVar3;
        n.e eVar4;
        f fVar = this.f1790k;
        n.e eVar5 = this.f1798b;
        boolean z = eVar5.f1629a;
        g gVar = this.f1800e;
        if (z) {
            gVar.d(eVar5.k());
        }
        boolean z2 = gVar.f1782j;
        ArrayList arrayList = gVar.f1783k;
        ArrayList arrayList2 = gVar.f1784l;
        f fVar2 = this.f1804i;
        f fVar3 = this.f1803h;
        if (!z2) {
            n.e eVar6 = this.f1798b;
            this.f1799d = eVar6.f1657o0[1];
            if (eVar6.D) {
                this.f1791l = new a(this);
            }
            int i2 = this.f1799d;
            if (i2 != 3) {
                if (i2 == 4 && (eVar4 = this.f1798b.S) != null && eVar4.f1657o0[1] == 1) {
                    int iK = (eVar4.k() - this.f1798b.I.e()) - this.f1798b.K.e();
                    o.b(fVar3, eVar4.f1636e.f1803h, this.f1798b.I.e());
                    o.b(fVar2, eVar4.f1636e.f1804i, -this.f1798b.K.e());
                    gVar.d(iK);
                    return;
                }
                if (i2 == 1) {
                    gVar.d(this.f1798b.k());
                }
            }
        } else if (this.f1799d == 4 && (eVar2 = (eVar = this.f1798b).S) != null && eVar2.f1657o0[1] == 1) {
            o.b(fVar3, eVar2.f1636e.f1803h, eVar.I.e());
            o.b(fVar2, eVar2.f1636e.f1804i, -this.f1798b.K.e());
            return;
        }
        boolean z3 = gVar.f1782j;
        if (z3) {
            n.e eVar7 = this.f1798b;
            if (eVar7.f1629a) {
                n.d[] dVarArr = eVar7.P;
                n.d dVar = dVarArr[2];
                n.d dVar2 = dVar.f1625f;
                if (dVar2 != null && dVarArr[3].f1625f != null) {
                    if (eVar7.v()) {
                        fVar3.f1778f = this.f1798b.P[2].e();
                        fVar2.f1778f = -this.f1798b.P[3].e();
                    } else {
                        f fVarH = o.h(this.f1798b.P[2]);
                        if (fVarH != null) {
                            o.b(fVar3, fVarH, this.f1798b.P[2].e());
                        }
                        f fVarH2 = o.h(this.f1798b.P[3]);
                        if (fVarH2 != null) {
                            o.b(fVar2, fVarH2, -this.f1798b.P[3].e());
                        }
                        fVar3.f1775b = true;
                        fVar2.f1775b = true;
                    }
                    n.e eVar8 = this.f1798b;
                    if (eVar8.D) {
                        o.b(fVar, fVar3, eVar8.Z);
                        return;
                    }
                    return;
                }
                if (dVar2 != null) {
                    f fVarH3 = o.h(dVar);
                    if (fVarH3 != null) {
                        o.b(fVar3, fVarH3, this.f1798b.P[2].e());
                        o.b(fVar2, fVar3, gVar.f1779g);
                        n.e eVar9 = this.f1798b;
                        if (eVar9.D) {
                            o.b(fVar, fVar3, eVar9.Z);
                            return;
                        }
                        return;
                    }
                    return;
                }
                n.d dVar3 = dVarArr[3];
                if (dVar3.f1625f != null) {
                    f fVarH4 = o.h(dVar3);
                    if (fVarH4 != null) {
                        o.b(fVar2, fVarH4, -this.f1798b.P[3].e());
                        o.b(fVar3, fVar2, -gVar.f1779g);
                    }
                    n.e eVar10 = this.f1798b;
                    if (eVar10.D) {
                        o.b(fVar, fVar3, eVar10.Z);
                        return;
                    }
                    return;
                }
                n.d dVar4 = dVarArr[4];
                if (dVar4.f1625f != null) {
                    f fVarH5 = o.h(dVar4);
                    if (fVarH5 != null) {
                        o.b(fVar, fVarH5, 0);
                        o.b(fVar3, fVar, -this.f1798b.Z);
                        o.b(fVar2, fVar3, gVar.f1779g);
                        return;
                    }
                    return;
                }
                if ((eVar7 instanceof n.j) || eVar7.S == null || eVar7.i(7).f1625f != null) {
                    return;
                }
                n.e eVar11 = this.f1798b;
                o.b(fVar3, eVar11.S.f1636e.f1803h, eVar11.p());
                o.b(fVar2, fVar3, gVar.f1779g);
                n.e eVar12 = this.f1798b;
                if (eVar12.D) {
                    o.b(fVar, fVar3, eVar12.Z);
                    return;
                }
                return;
            }
        }
        if (z3 || this.f1799d != 3) {
            gVar.b(this);
        } else {
            n.e eVar13 = this.f1798b;
            int i3 = eVar13.f1660r;
            if (i3 == 2) {
                n.e eVar14 = eVar13.S;
                if (eVar14 != null) {
                    g gVar2 = eVar14.f1636e.f1800e;
                    arrayList2.add(gVar2);
                    gVar2.f1783k.add(gVar);
                    gVar.f1775b = true;
                    arrayList.add(fVar3);
                    arrayList.add(fVar2);
                }
            } else if (i3 == 3 && !eVar13.v()) {
                n.e eVar15 = this.f1798b;
                if (eVar15.f1659q != 3) {
                    g gVar3 = eVar15.f1634d.f1800e;
                    arrayList2.add(gVar3);
                    gVar3.f1783k.add(gVar);
                    gVar.f1775b = true;
                    arrayList.add(fVar3);
                    arrayList.add(fVar2);
                }
            }
        }
        n.e eVar16 = this.f1798b;
        n.d[] dVarArr2 = eVar16.P;
        n.d dVar5 = dVarArr2[2];
        n.d dVar6 = dVar5.f1625f;
        if (dVar6 != null && dVarArr2[3].f1625f != null) {
            if (eVar16.v()) {
                fVar3.f1778f = this.f1798b.P[2].e();
                fVar2.f1778f = -this.f1798b.P[3].e();
            } else {
                f fVarH6 = o.h(this.f1798b.P[2]);
                f fVarH7 = o.h(this.f1798b.P[3]);
                if (fVarH6 != null) {
                    fVarH6.b(this);
                }
                if (fVarH7 != null) {
                    fVarH7.b(this);
                }
                this.f1805j = 4;
            }
            if (this.f1798b.D) {
                c(fVar, fVar3, 1, this.f1791l);
            }
        } else if (dVar6 != null) {
            f fVarH8 = o.h(dVar5);
            if (fVarH8 != null) {
                o.b(fVar3, fVarH8, this.f1798b.P[2].e());
                c(fVar2, fVar3, 1, gVar);
                if (this.f1798b.D) {
                    c(fVar, fVar3, 1, this.f1791l);
                }
                if (this.f1799d == 3) {
                    n.e eVar17 = this.f1798b;
                    if (eVar17.V > 0.0f) {
                        k kVar = eVar17.f1634d;
                        if (kVar.f1799d == 3) {
                            kVar.f1800e.f1783k.add(gVar);
                            arrayList2.add(this.f1798b.f1634d.f1800e);
                            gVar.f1774a = this;
                        }
                    }
                }
            }
        } else {
            n.d dVar7 = dVarArr2[3];
            if (dVar7.f1625f != null) {
                f fVarH9 = o.h(dVar7);
                if (fVarH9 != null) {
                    o.b(fVar2, fVarH9, -this.f1798b.P[3].e());
                    c(fVar3, fVar2, -1, gVar);
                    if (this.f1798b.D) {
                        c(fVar, fVar3, 1, this.f1791l);
                    }
                }
            } else {
                n.d dVar8 = dVarArr2[4];
                if (dVar8.f1625f != null) {
                    f fVarH10 = o.h(dVar8);
                    if (fVarH10 != null) {
                        o.b(fVar, fVarH10, 0);
                        c(fVar3, fVar, -1, this.f1791l);
                        c(fVar2, fVar3, 1, gVar);
                    }
                } else if (!(eVar16 instanceof n.j) && (eVar3 = eVar16.S) != null) {
                    o.b(fVar3, eVar3.f1636e.f1803h, eVar16.p());
                    c(fVar2, fVar3, 1, gVar);
                    if (this.f1798b.D) {
                        c(fVar, fVar3, 1, this.f1791l);
                    }
                    if (this.f1799d == 3) {
                        n.e eVar18 = this.f1798b;
                        if (eVar18.V > 0.0f) {
                            k kVar2 = eVar18.f1634d;
                            if (kVar2.f1799d == 3) {
                                kVar2.f1800e.f1783k.add(gVar);
                                arrayList2.add(this.f1798b.f1634d.f1800e);
                                gVar.f1774a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            gVar.c = true;
        }
    }

    @Override // o.o
    public final void e() {
        f fVar = this.f1803h;
        if (fVar.f1782j) {
            this.f1798b.Y = fVar.f1779g;
        }
    }

    @Override // o.o
    public final void f() {
        this.c = null;
        this.f1803h.c();
        this.f1804i.c();
        this.f1790k.c();
        this.f1800e.c();
        this.f1802g = false;
    }

    @Override // o.o
    public final boolean k() {
        return this.f1799d != 3 || this.f1798b.f1660r == 0;
    }

    public final void m() {
        this.f1802g = false;
        f fVar = this.f1803h;
        fVar.c();
        fVar.f1782j = false;
        f fVar2 = this.f1804i;
        fVar2.c();
        fVar2.f1782j = false;
        f fVar3 = this.f1790k;
        fVar3.c();
        fVar3.f1782j = false;
        this.f1800e.f1782j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f1798b.f1641g0;
    }
}
