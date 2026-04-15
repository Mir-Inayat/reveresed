package o;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n.f f1767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1768b;
    public boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n.f f1769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f1770e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q.f f1771f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f1772g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f1773h;

    public final void a(f fVar, int i2, ArrayList arrayList, l lVar) {
        o oVar = fVar.f1776d;
        l lVar2 = oVar.c;
        f fVar2 = oVar.f1804i;
        f fVar3 = oVar.f1803h;
        if (lVar2 == null) {
            n.f fVar4 = this.f1767a;
            if (oVar == fVar4.f1634d || oVar == fVar4.f1636e) {
                return;
            }
            if (lVar == null) {
                lVar = new l();
                lVar.f1788a = null;
                lVar.f1789b = new ArrayList();
                lVar.f1788a = oVar;
                arrayList.add(lVar);
            }
            oVar.c = lVar;
            lVar.f1789b.add(oVar);
            ArrayList arrayList2 = fVar3.f1783k;
            int size = arrayList2.size();
            int i3 = 0;
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList2.get(i4);
                i4++;
                d dVar = (d) obj;
                if (dVar instanceof f) {
                    a((f) dVar, i2, arrayList, lVar);
                }
            }
            ArrayList arrayList3 = fVar2.f1783k;
            int size2 = arrayList3.size();
            int i5 = 0;
            while (i5 < size2) {
                Object obj2 = arrayList3.get(i5);
                i5++;
                d dVar2 = (d) obj2;
                if (dVar2 instanceof f) {
                    a((f) dVar2, i2, arrayList, lVar);
                }
            }
            if (i2 == 1 && (oVar instanceof m)) {
                ArrayList arrayList4 = ((m) oVar).f1790k.f1783k;
                int size3 = arrayList4.size();
                int i6 = 0;
                while (i6 < size3) {
                    Object obj3 = arrayList4.get(i6);
                    i6++;
                    d dVar3 = (d) obj3;
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i2, arrayList, lVar);
                    }
                }
            }
            ArrayList arrayList5 = fVar3.f1784l;
            int size4 = arrayList5.size();
            int i7 = 0;
            while (i7 < size4) {
                Object obj4 = arrayList5.get(i7);
                i7++;
                a((f) obj4, i2, arrayList, lVar);
            }
            ArrayList arrayList6 = fVar2.f1784l;
            int size5 = arrayList6.size();
            int i8 = 0;
            while (i8 < size5) {
                Object obj5 = arrayList6.get(i8);
                i8++;
                a((f) obj5, i2, arrayList, lVar);
            }
            if (i2 == 1 && (oVar instanceof m)) {
                ArrayList arrayList7 = ((m) oVar).f1790k.f1784l;
                int size6 = arrayList7.size();
                while (i3 < size6) {
                    Object obj6 = arrayList7.get(i3);
                    i3++;
                    a((f) obj6, i2, arrayList, lVar);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00c9, code lost:
    
        if (r6 == 2) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(n.f r25) {
        /*
            Method dump skipped, instruction units count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.e.b(n.f):void");
    }

    public final void c() {
        n.f fVar = this.f1767a;
        ArrayList arrayList = this.f1773h;
        ArrayList arrayList2 = this.f1770e;
        arrayList2.clear();
        n.f fVar2 = this.f1769d;
        fVar2.f1634d.f();
        fVar2.f1636e.f();
        arrayList2.add(fVar2.f1634d);
        arrayList2.add(fVar2.f1636e);
        ArrayList arrayList3 = fVar2.f1668p0;
        int size = arrayList3.size();
        HashSet hashSet = null;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList3.get(i2);
            i2++;
            n.e eVar = (n.e) obj;
            if (eVar instanceof n.i) {
                i iVar = new i(eVar);
                eVar.f1634d.f();
                eVar.f1636e.f();
                iVar.f1801f = ((n.i) eVar).f1708t0;
                arrayList2.add(iVar);
            } else {
                if (eVar.u()) {
                    if (eVar.f1631b == null) {
                        eVar.f1631b = new c(eVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f1631b);
                } else {
                    arrayList2.add(eVar.f1634d);
                }
                if (eVar.v()) {
                    if (eVar.c == null) {
                        eVar.c = new c(eVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.c);
                } else {
                    arrayList2.add(eVar.f1636e);
                }
                if (eVar instanceof n.j) {
                    arrayList2.add(new j(eVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        int size2 = arrayList2.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList2.get(i3);
            i3++;
            ((o) obj2).f();
        }
        int size3 = arrayList2.size();
        int i4 = 0;
        while (i4 < size3) {
            Object obj3 = arrayList2.get(i4);
            i4++;
            o oVar = (o) obj3;
            if (oVar.f1798b != fVar2) {
                oVar.d();
            }
        }
        arrayList.clear();
        e(fVar.f1634d, 0, arrayList);
        e(fVar.f1636e, 1, arrayList);
        this.f1768b = false;
    }

    public final int d(n.f fVar, int i2) {
        ArrayList arrayList;
        int i3;
        long jMax;
        float f3;
        n.f fVar2 = fVar;
        ArrayList arrayList2 = this.f1773h;
        int size = arrayList2.size();
        long j2 = 0;
        int i4 = 0;
        long jMax2 = 0;
        while (i4 < size) {
            o oVar = ((l) arrayList2.get(i4)).f1788a;
            if (!(oVar instanceof c) ? !(i2 != 0 ? (oVar instanceof m) : (oVar instanceof k)) : ((c) oVar).f1801f != i2) {
                f fVar3 = (i2 == 0 ? fVar2.f1634d : fVar2.f1636e).f1803h;
                f fVar4 = (i2 == 0 ? fVar2.f1634d : fVar2.f1636e).f1804i;
                f fVar5 = oVar.f1803h;
                f fVar6 = oVar.f1804i;
                boolean zContains = fVar5.f1784l.contains(fVar3);
                boolean zContains2 = fVar6.f1784l.contains(fVar4);
                long j3 = oVar.j();
                if (zContains && zContains2) {
                    long jB = l.b(fVar5, j2);
                    long jA = l.a(fVar6, j2);
                    long j4 = jB - j3;
                    int i5 = fVar6.f1778f;
                    arrayList = arrayList2;
                    i3 = size;
                    if (j4 >= (-i5)) {
                        j4 += (long) i5;
                    }
                    long j5 = fVar5.f1778f;
                    long j6 = ((-jA) - j3) - j5;
                    if (j6 >= j5) {
                        j6 -= j5;
                    }
                    n.e eVar = oVar.f1798b;
                    if (i2 == 0) {
                        f3 = eVar.f1633c0;
                    } else if (i2 == 1) {
                        f3 = eVar.f1635d0;
                    } else {
                        eVar.getClass();
                        f3 = -1.0f;
                    }
                    float f4 = f3 > 0.0f ? (long) ((j4 / (1.0f - f3)) + (j6 / f3)) : 0L;
                    jMax = (((long) fVar5.f1778f) + ((((long) ((f4 * f3) + 0.5f)) + j3) + ((long) (((1.0f - f3) * f4) + 0.5f)))) - ((long) fVar6.f1778f);
                } else {
                    arrayList = arrayList2;
                    i3 = size;
                    jMax = zContains ? Math.max(l.b(fVar5, fVar5.f1778f), ((long) fVar5.f1778f) + j3) : zContains2 ? Math.max(-l.a(fVar6, fVar6.f1778f), ((long) (-fVar6.f1778f)) + j3) : (oVar.j() + ((long) fVar5.f1778f)) - ((long) fVar6.f1778f);
                }
            } else {
                arrayList = arrayList2;
                i3 = size;
                jMax = j2;
            }
            jMax2 = Math.max(jMax2, jMax);
            i4++;
            fVar2 = fVar;
            arrayList2 = arrayList;
            size = i3;
            j2 = 0;
        }
        return (int) jMax2;
    }

    public final void e(o oVar, int i2, ArrayList arrayList) {
        f fVar = oVar.f1803h;
        f fVar2 = oVar.f1804i;
        ArrayList arrayList2 = fVar.f1783k;
        int size = arrayList2.size();
        int i3 = 0;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList2.get(i4);
            i4++;
            d dVar = (d) obj;
            if (dVar instanceof f) {
                a((f) dVar, i2, arrayList, null);
            } else if (dVar instanceof o) {
                a(((o) dVar).f1803h, i2, arrayList, null);
            }
        }
        ArrayList arrayList3 = fVar2.f1783k;
        int size2 = arrayList3.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList3.get(i5);
            i5++;
            d dVar2 = (d) obj2;
            if (dVar2 instanceof f) {
                a((f) dVar2, i2, arrayList, null);
            } else if (dVar2 instanceof o) {
                a(((o) dVar2).f1804i, i2, arrayList, null);
            }
        }
        if (i2 == 1) {
            ArrayList arrayList4 = ((m) oVar).f1790k.f1783k;
            int size3 = arrayList4.size();
            while (i3 < size3) {
                Object obj3 = arrayList4.get(i3);
                i3++;
                d dVar3 = (d) obj3;
                if (dVar3 instanceof f) {
                    a((f) dVar3, i2, arrayList, null);
                }
            }
        }
    }

    public final void f(int i2, int i3, int i4, int i5, n.e eVar) {
        b bVar = this.f1772g;
        bVar.f1756a = i2;
        bVar.f1757b = i4;
        bVar.c = i3;
        bVar.f1758d = i5;
        this.f1771f.b(eVar, bVar);
        eVar.J(bVar.f1759e);
        eVar.G(bVar.f1760f);
        eVar.D = bVar.f1762h;
        eVar.D(bVar.f1761g);
    }

    public final void g() {
        a aVar;
        e eVar = this;
        ArrayList arrayList = eVar.f1767a.f1668p0;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            n.e eVar2 = (n.e) arrayList.get(i2);
            if (!eVar2.f1629a) {
                int[] iArr = eVar2.f1657o0;
                int i4 = iArr[0];
                int i5 = iArr[1];
                int i6 = eVar2.f1659q;
                int i7 = eVar2.f1660r;
                boolean z = i4 == 2 || (i4 == 3 && i6 == 1);
                boolean z2 = i5 == 2 || (i5 == 3 && i7 == 1);
                g gVar = eVar2.f1634d.f1800e;
                boolean z3 = gVar.f1782j;
                g gVar2 = eVar2.f1636e.f1800e;
                boolean z4 = gVar2.f1782j;
                boolean z5 = z;
                if (z3 && z4) {
                    eVar.f(1, gVar.f1779g, 1, gVar2.f1779g, eVar2);
                    eVar2.f1629a = true;
                } else if (z3 && z2) {
                    f(1, gVar.f1779g, 2, gVar2.f1779g, eVar2);
                    if (i5 == 3) {
                        eVar2.f1636e.f1800e.f1785m = eVar2.k();
                    } else {
                        eVar2.f1636e.f1800e.d(eVar2.k());
                        eVar2.f1629a = true;
                    }
                } else if (z4 && z5) {
                    f(2, gVar.f1779g, 1, gVar2.f1779g, eVar2);
                    if (i4 == 3) {
                        eVar2.f1634d.f1800e.f1785m = eVar2.n();
                    } else {
                        eVar2.f1634d.f1800e.d(eVar2.n());
                        eVar2.f1629a = true;
                    }
                }
                if (eVar2.f1629a && (aVar = eVar2.f1636e.f1791l) != null) {
                    aVar.d(eVar2.Z);
                }
                eVar = this;
            }
            i2 = i3;
        }
    }
}
