package o;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f1786a = new b();

    public static boolean a(n.e eVar) {
        int[] iArr = eVar.f1657o0;
        int i2 = iArr[0];
        int i3 = iArr[1];
        n.e eVar2 = eVar.S;
        n.f fVar = eVar2 != null ? (n.f) eVar2 : null;
        if (fVar != null) {
            int i4 = fVar.f1657o0[0];
        }
        if (fVar != null) {
            int i5 = fVar.f1657o0[1];
        }
        boolean z = i2 == 1 || eVar.x() || i2 == 2 || (i2 == 3 && eVar.f1659q == 0 && eVar.V == 0.0f && eVar.q(0)) || (i2 == 3 && eVar.f1659q == 1 && eVar.r(0, eVar.n()));
        boolean z2 = i3 == 1 || eVar.y() || i3 == 2 || (i3 == 3 && eVar.f1660r == 0 && eVar.V == 0.0f && eVar.q(1)) || (i2 == 3 && eVar.f1660r == 1 && eVar.r(1, eVar.k()));
        return (eVar.V > 0.0f && (z || z2)) || (z && z2);
    }

    public static n b(n.e eVar, int i2, ArrayList arrayList, n nVar) {
        int i3;
        int i4 = i2 == 0 ? eVar.f1653m0 : eVar.f1655n0;
        if (i4 != -1 && (nVar == null || i4 != nVar.f1794b)) {
            int i5 = 0;
            while (true) {
                if (i5 >= arrayList.size()) {
                    break;
                }
                n nVar2 = (n) arrayList.get(i5);
                if (nVar2.f1794b == i4) {
                    if (nVar != null) {
                        nVar.c(i2, nVar2);
                        arrayList.remove(nVar);
                    }
                    nVar = nVar2;
                } else {
                    i5++;
                }
            }
        } else if (i4 != -1) {
            return nVar;
        }
        if (nVar == null) {
            if (eVar instanceof n.j) {
                n.j jVar = (n.j) eVar;
                int i6 = 0;
                while (true) {
                    if (i6 >= jVar.f1711q0) {
                        i3 = -1;
                        break;
                    }
                    n.e eVar2 = jVar.f1710p0[i6];
                    if ((i2 == 0 && (i3 = eVar2.f1653m0) != -1) || (i2 == 1 && (i3 = eVar2.f1655n0) != -1)) {
                        break;
                    }
                    i6++;
                }
                if (i3 != -1) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= arrayList.size()) {
                            break;
                        }
                        n nVar3 = (n) arrayList.get(i7);
                        if (nVar3.f1794b == i3) {
                            nVar = nVar3;
                            break;
                        }
                        i7++;
                    }
                }
            }
            if (nVar == null) {
                nVar = new n();
                nVar.f1793a = new ArrayList();
                nVar.f1795d = null;
                nVar.f1796e = -1;
                int i8 = n.f1792f;
                n.f1792f = i8 + 1;
                nVar.f1794b = i8;
                nVar.c = i2;
            }
            arrayList.add(nVar);
        }
        int i9 = nVar.f1794b;
        ArrayList arrayList2 = nVar.f1793a;
        if (arrayList2.contains(eVar)) {
            return nVar;
        }
        arrayList2.add(eVar);
        if (eVar instanceof n.i) {
            n.i iVar = (n.i) eVar;
            iVar.f1707s0.c(iVar.f1708t0 == 0 ? 1 : 0, arrayList, nVar);
        }
        if (i2 == 0) {
            eVar.f1653m0 = i9;
            eVar.H.c(i2, arrayList, nVar);
            eVar.J.c(i2, arrayList, nVar);
        } else {
            eVar.f1655n0 = i9;
            eVar.I.c(i2, arrayList, nVar);
            eVar.L.c(i2, arrayList, nVar);
            eVar.K.c(i2, arrayList, nVar);
        }
        eVar.O.c(i2, arrayList, nVar);
        return nVar;
    }

    public static void c(int i2, n.e eVar, q.f fVar, boolean z) {
        n.d dVar;
        n.d dVar2;
        char c;
        n.d dVar3;
        n.d dVar4;
        n.d dVar5;
        if (eVar.f1650l) {
            return;
        }
        if (!(eVar instanceof n.f) && eVar.w() && a(eVar)) {
            n.f.Q(eVar, fVar, new b());
        }
        n.d dVarI = eVar.i(2);
        n.d dVarI2 = eVar.i(4);
        int iD = dVarI.d();
        int iD2 = dVarI2.d();
        HashSet<n.d> hashSet = dVarI.f1621a;
        if (hashSet != null && dVarI.c) {
            for (n.d dVar6 : hashSet) {
                n.e eVar2 = dVar6.f1623d;
                int i3 = i2 + 1;
                boolean zA = a(eVar2);
                n.d dVar7 = eVar2.H;
                n.d dVar8 = eVar2.J;
                if (eVar2.w() && zA) {
                    c = 0;
                    n.f.Q(eVar2, fVar, new b());
                } else {
                    c = 0;
                }
                int i4 = eVar2.f1657o0[c];
                if (i4 != 3 || zA) {
                    if (!eVar2.w()) {
                        if (dVar6 == dVar7 && dVar8.f1625f == null) {
                            int iE = dVar7.e() + iD;
                            eVar2.E(iE, eVar2.n() + iE);
                            c(i3, eVar2, fVar, z);
                        } else if (dVar6 == dVar8 && dVar7.f1625f == null) {
                            int iE2 = iD - dVar8.e();
                            eVar2.E(iE2 - eVar2.n(), iE2);
                            c(i3, eVar2, fVar, z);
                        } else if (dVar6 == dVar7 && (dVar3 = dVar8.f1625f) != null && dVar3.c && !eVar2.u()) {
                            d(i3, eVar2, fVar, z);
                        }
                    }
                } else if (i4 == 3 && eVar2.f1663u >= 0 && eVar2.f1662t >= 0 && (eVar2.f1639f0 == 8 || (eVar2.f1659q == 0 && eVar2.V == 0.0f))) {
                    if (!eVar2.u() && !eVar2.E && ((dVar6 == dVar7 && (dVar5 = dVar8.f1625f) != null && dVar5.c) || (dVar6 == dVar8 && (dVar4 = dVar7.f1625f) != null && dVar4.c))) {
                        if (!eVar2.u()) {
                            e(i3, eVar, fVar, eVar2, z);
                        }
                    }
                }
            }
        }
        if (eVar instanceof n.i) {
            return;
        }
        HashSet<n.d> hashSet2 = dVarI2.f1621a;
        if (hashSet2 != null && dVarI2.c) {
            for (n.d dVar9 : hashSet2) {
                n.e eVar3 = dVar9.f1623d;
                int i5 = i2 + 1;
                boolean zA2 = a(eVar3);
                n.d dVar10 = eVar3.H;
                n.d dVar11 = eVar3.J;
                if (eVar3.w() && zA2) {
                    n.f.Q(eVar3, fVar, new b());
                }
                boolean z2 = (dVar9 == dVar10 && (dVar2 = dVar11.f1625f) != null && dVar2.c) || (dVar9 == dVar11 && (dVar = dVar10.f1625f) != null && dVar.c);
                int i6 = eVar3.f1657o0[0];
                if (i6 != 3 || zA2) {
                    if (!eVar3.w()) {
                        if (dVar9 == dVar10 && dVar11.f1625f == null) {
                            int iE3 = dVar10.e() + iD2;
                            eVar3.E(iE3, eVar3.n() + iE3);
                            c(i5, eVar3, fVar, z);
                        } else if (dVar9 == dVar11 && dVar10.f1625f == null) {
                            int iE4 = iD2 - dVar11.e();
                            eVar3.E(iE4 - eVar3.n(), iE4);
                            c(i5, eVar3, fVar, z);
                        } else if (z2 && !eVar3.u()) {
                            d(i5, eVar3, fVar, z);
                        }
                    }
                } else if (i6 == 3 && eVar3.f1663u >= 0 && eVar3.f1662t >= 0 && (eVar3.f1639f0 == 8 || (eVar3.f1659q == 0 && eVar3.V == 0.0f))) {
                    if (!eVar3.u() && !eVar3.E && z2 && !eVar3.u()) {
                        e(i5, eVar, fVar, eVar3, z);
                    }
                }
            }
        }
        eVar.f1650l = true;
    }

    public static void d(int i2, n.e eVar, q.f fVar, boolean z) {
        float f3 = eVar.f1633c0;
        n.d dVar = eVar.H;
        int iD = dVar.f1625f.d();
        n.d dVar2 = eVar.J;
        int iD2 = dVar2.f1625f.d();
        int iE = dVar.e() + iD;
        int iE2 = iD2 - dVar2.e();
        if (iD == iD2) {
            f3 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iN = eVar.n();
        int i3 = (iD2 - iD) - iN;
        if (iD > iD2) {
            i3 = (iD - iD2) - iN;
        }
        int i4 = ((int) (i3 > 0 ? (f3 * i3) + 0.5f : f3 * i3)) + iD;
        int i5 = i4 + iN;
        if (iD > iD2) {
            i5 = i4 - iN;
        }
        eVar.E(i4, i5);
        c(i2 + 1, eVar, fVar, z);
    }

    public static void e(int i2, n.e eVar, q.f fVar, n.e eVar2, boolean z) {
        float f3 = eVar2.f1633c0;
        n.d dVar = eVar2.H;
        int iE = dVar.e() + dVar.f1625f.d();
        n.d dVar2 = eVar2.J;
        int iD = dVar2.f1625f.d() - dVar2.e();
        if (iD >= iE) {
            int iN = eVar2.n();
            if (eVar2.f1639f0 != 8) {
                int i3 = eVar2.f1659q;
                if (i3 == 2) {
                    iN = (int) (eVar2.f1633c0 * 0.5f * (eVar instanceof n.f ? eVar.n() : eVar.S.n()));
                } else if (i3 == 0) {
                    iN = iD - iE;
                }
                iN = Math.max(eVar2.f1662t, iN);
                int i4 = eVar2.f1663u;
                if (i4 > 0) {
                    iN = Math.min(i4, iN);
                }
            }
            int i5 = iE + ((int) ((f3 * ((iD - iE) - iN)) + 0.5f));
            eVar2.E(i5, iN + i5);
            c(i2 + 1, eVar2, fVar, z);
        }
    }

    public static void f(int i2, n.e eVar, q.f fVar) {
        float f3 = eVar.f1635d0;
        n.d dVar = eVar.I;
        int iD = dVar.f1625f.d();
        n.d dVar2 = eVar.K;
        int iD2 = dVar2.f1625f.d();
        int iE = dVar.e() + iD;
        int iE2 = iD2 - dVar2.e();
        if (iD == iD2) {
            f3 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iK = eVar.k();
        int i3 = (iD2 - iD) - iK;
        if (iD > iD2) {
            i3 = (iD - iD2) - iK;
        }
        int i4 = (int) (i3 > 0 ? (f3 * i3) + 0.5f : f3 * i3);
        int i5 = iD + i4;
        int i6 = i5 + iK;
        if (iD > iD2) {
            i5 = iD - i4;
            i6 = i5 - iK;
        }
        eVar.F(i5, i6);
        i(i2 + 1, eVar, fVar);
    }

    public static void g(int i2, n.e eVar, q.f fVar, n.e eVar2) {
        float f3 = eVar2.f1635d0;
        n.d dVar = eVar2.I;
        int iE = dVar.e() + dVar.f1625f.d();
        n.d dVar2 = eVar2.K;
        int iD = dVar2.f1625f.d() - dVar2.e();
        if (iD >= iE) {
            int iK = eVar2.k();
            if (eVar2.f1639f0 != 8) {
                int i3 = eVar2.f1660r;
                if (i3 == 2) {
                    iK = (int) (f3 * 0.5f * (eVar instanceof n.f ? eVar.k() : eVar.S.k()));
                } else if (i3 == 0) {
                    iK = iD - iE;
                }
                iK = Math.max(eVar2.f1665w, iK);
                int i4 = eVar2.f1666x;
                if (i4 > 0) {
                    iK = Math.min(i4, iK);
                }
            }
            int i5 = iE + ((int) ((f3 * ((iD - iE) - iK)) + 0.5f));
            eVar2.F(i5, iK + i5);
            i(i2 + 1, eVar2, fVar);
        }
    }

    public static boolean h(int i2, int i3, int i4, int i5) {
        return (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2)) || (i5 == 1 || i5 == 2 || (i5 == 4 && i3 != 2));
    }

    public static void i(int i2, n.e eVar, q.f fVar) {
        n.d dVar;
        n.d dVar2;
        float f3;
        n.d dVar3;
        n.d dVar4;
        n.d dVar5;
        if (eVar.f1652m) {
            return;
        }
        if (!(eVar instanceof n.f) && eVar.w() && a(eVar)) {
            n.f.Q(eVar, fVar, new b());
        }
        n.d dVarI = eVar.i(3);
        n.d dVarI2 = eVar.i(5);
        int iD = dVarI.d();
        int iD2 = dVarI2.d();
        HashSet<n.d> hashSet = dVarI.f1621a;
        if (hashSet != null && dVarI.c) {
            for (n.d dVar6 : hashSet) {
                n.e eVar2 = dVar6.f1623d;
                int i3 = i2 + 1;
                boolean zA = a(eVar2);
                n.d dVar7 = eVar2.I;
                n.d dVar8 = eVar2.K;
                if (eVar2.w() && zA) {
                    f3 = 0.0f;
                    n.f.Q(eVar2, fVar, new b());
                } else {
                    f3 = 0.0f;
                }
                int i4 = eVar2.f1657o0[1];
                if (i4 != 3 || zA) {
                    if (!eVar2.w()) {
                        if (dVar6 == dVar7 && dVar8.f1625f == null) {
                            int iE = dVar7.e() + iD;
                            eVar2.F(iE, eVar2.k() + iE);
                            i(i3, eVar2, fVar);
                        } else if (dVar6 == dVar8 && dVar8.f1625f == null) {
                            int iE2 = iD - dVar8.e();
                            eVar2.F(iE2 - eVar2.k(), iE2);
                            i(i3, eVar2, fVar);
                        } else if (dVar6 == dVar7 && (dVar3 = dVar8.f1625f) != null && dVar3.c) {
                            f(i3, eVar2, fVar);
                        }
                    }
                } else if (i4 == 3 && eVar2.f1666x >= 0 && eVar2.f1665w >= 0 && (eVar2.f1639f0 == 8 || (eVar2.f1660r == 0 && eVar2.V == f3))) {
                    if (!eVar2.v() && !eVar2.E && ((dVar6 == dVar7 && (dVar5 = dVar8.f1625f) != null && dVar5.c) || (dVar6 == dVar8 && (dVar4 = dVar7.f1625f) != null && dVar4.c))) {
                        if (!eVar2.v()) {
                            g(i3, eVar, fVar, eVar2);
                        }
                    }
                }
            }
        }
        if (eVar instanceof n.i) {
            return;
        }
        HashSet<n.d> hashSet2 = dVarI2.f1621a;
        if (hashSet2 != null && dVarI2.c) {
            for (n.d dVar9 : hashSet2) {
                n.e eVar3 = dVar9.f1623d;
                int i5 = i2 + 1;
                boolean zA2 = a(eVar3);
                n.d dVar10 = eVar3.I;
                n.d dVar11 = eVar3.K;
                if (eVar3.w() && zA2) {
                    n.f.Q(eVar3, fVar, new b());
                }
                boolean z = (dVar9 == dVar10 && (dVar2 = dVar11.f1625f) != null && dVar2.c) || (dVar9 == dVar11 && (dVar = dVar10.f1625f) != null && dVar.c);
                int i6 = eVar3.f1657o0[1];
                if (i6 != 3 || zA2) {
                    if (!eVar3.w()) {
                        if (dVar9 == dVar10 && dVar11.f1625f == null) {
                            int iE3 = dVar10.e() + iD2;
                            eVar3.F(iE3, eVar3.k() + iE3);
                            i(i5, eVar3, fVar);
                        } else if (dVar9 == dVar11 && dVar10.f1625f == null) {
                            int iE4 = iD2 - dVar11.e();
                            eVar3.F(iE4 - eVar3.k(), iE4);
                            i(i5, eVar3, fVar);
                        } else if (z && !eVar3.v()) {
                            f(i5, eVar3, fVar);
                        }
                    }
                } else if (i6 == 3 && eVar3.f1666x >= 0 && eVar3.f1665w >= 0 && (eVar3.f1639f0 == 8 || (eVar3.f1660r == 0 && eVar3.V == 0.0f))) {
                    if (!eVar3.v() && !eVar3.E && z && !eVar3.v()) {
                        g(i5, eVar, fVar, eVar3);
                    }
                }
            }
        }
        n.d dVarI3 = eVar.i(6);
        if (dVarI3.f1621a != null && dVarI3.c) {
            int iD3 = dVarI3.d();
            for (n.d dVar12 : dVarI3.f1621a) {
                n.e eVar4 = dVar12.f1623d;
                int i7 = i2 + 1;
                boolean zA3 = a(eVar4);
                n.d dVar13 = eVar4.L;
                if (eVar4.w() && zA3) {
                    n.f.Q(eVar4, fVar, new b());
                }
                if (eVar4.f1657o0[1] != 3 || zA3) {
                    if (!eVar4.w() && dVar12 == dVar13) {
                        int iE5 = dVar12.e() + iD3;
                        if (eVar4.D) {
                            int i8 = iE5 - eVar4.Z;
                            int i9 = eVar4.U + i8;
                            eVar4.Y = i8;
                            eVar4.I.l(i8);
                            eVar4.K.l(i9);
                            dVar13.l(iE5);
                            eVar4.f1648k = true;
                        }
                        i(i7, eVar4, fVar);
                    }
                }
            }
        }
        eVar.f1652m = true;
    }
}
