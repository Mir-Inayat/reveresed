package n;

import androidx.emoji2.text.t;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import o.o;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class f extends e {
    public b[] A0;
    public b[] B0;
    public int C0;
    public boolean D0;
    public boolean E0;
    public WeakReference F0;
    public WeakReference G0;
    public WeakReference H0;
    public WeakReference I0;
    public final HashSet J0;
    public final o.b K0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ArrayList f1668p0 = new ArrayList();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final t f1669q0 = new t(this);

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final o.e f1670r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f1671s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public q.f f1672t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f1673u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final l.c f1674v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f1675w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f1676x0;
    public int y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public int f1677z0;

    public f() {
        o.e eVar = new o.e();
        eVar.f1768b = true;
        eVar.c = true;
        eVar.f1770e = new ArrayList();
        new ArrayList();
        eVar.f1771f = null;
        eVar.f1772g = new o.b();
        eVar.f1773h = new ArrayList();
        eVar.f1767a = this;
        eVar.f1769d = this;
        this.f1670r0 = eVar;
        this.f1672t0 = null;
        this.f1673u0 = false;
        this.f1674v0 = new l.c();
        this.y0 = 0;
        this.f1677z0 = 0;
        this.A0 = new b[4];
        this.B0 = new b[4];
        this.C0 = 257;
        this.D0 = false;
        this.E0 = false;
        this.F0 = null;
        this.G0 = null;
        this.H0 = null;
        this.I0 = null;
        this.J0 = new HashSet();
        this.K0 = new o.b();
    }

    public static void Q(e eVar, q.f fVar, o.b bVar) {
        int i2;
        int i3;
        if (fVar == null) {
            return;
        }
        int i4 = eVar.f1639f0;
        int[] iArr = eVar.f1661s;
        if (i4 == 8 || (eVar instanceof i) || (eVar instanceof a)) {
            bVar.f1759e = 0;
            bVar.f1760f = 0;
            return;
        }
        int[] iArr2 = eVar.f1657o0;
        bVar.f1756a = iArr2[0];
        bVar.f1757b = iArr2[1];
        bVar.c = eVar.n();
        bVar.f1758d = eVar.k();
        bVar.f1763i = false;
        bVar.f1764j = 0;
        boolean z = bVar.f1756a == 3;
        boolean z2 = bVar.f1757b == 3;
        boolean z3 = z && eVar.V > 0.0f;
        boolean z4 = z2 && eVar.V > 0.0f;
        if (z && eVar.q(0) && eVar.f1659q == 0 && !z3) {
            bVar.f1756a = 2;
            if (z2 && eVar.f1660r == 0) {
                bVar.f1756a = 1;
            }
            z = false;
        }
        if (z2 && eVar.q(1) && eVar.f1660r == 0 && !z4) {
            bVar.f1757b = 2;
            if (z && eVar.f1659q == 0) {
                bVar.f1757b = 1;
            }
            z2 = false;
        }
        if (eVar.x()) {
            bVar.f1756a = 1;
            z = false;
        }
        if (eVar.y()) {
            bVar.f1757b = 1;
            z2 = false;
        }
        if (z3) {
            if (iArr[0] == 4) {
                bVar.f1756a = 1;
            } else if (!z2) {
                if (bVar.f1757b == 1) {
                    i3 = bVar.f1758d;
                } else {
                    bVar.f1756a = 2;
                    fVar.b(eVar, bVar);
                    i3 = bVar.f1760f;
                }
                bVar.f1756a = 1;
                bVar.c = (int) (eVar.V * i3);
            }
        }
        if (z4) {
            if (iArr[1] == 4) {
                bVar.f1757b = 1;
            } else if (!z) {
                if (bVar.f1756a == 1) {
                    i2 = bVar.c;
                } else {
                    bVar.f1757b = 2;
                    fVar.b(eVar, bVar);
                    i2 = bVar.f1759e;
                }
                bVar.f1757b = 1;
                if (eVar.W == -1) {
                    bVar.f1758d = (int) (i2 / eVar.V);
                } else {
                    bVar.f1758d = (int) (eVar.V * i2);
                }
            }
        }
        fVar.b(eVar, bVar);
        eVar.J(bVar.f1759e);
        eVar.G(bVar.f1760f);
        eVar.D = bVar.f1762h;
        eVar.D(bVar.f1761g);
        bVar.f1764j = 0;
    }

    @Override // n.e
    public final void C(t tVar) {
        super.C(tVar);
        int size = this.f1668p0.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((e) this.f1668p0.get(i2)).C(tVar);
        }
    }

    @Override // n.e
    public final void K(boolean z, boolean z2) {
        super.K(z, z2);
        int size = this.f1668p0.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((e) this.f1668p0.get(i2)).K(z, z2);
        }
    }

    public final void M(e eVar, int i2) {
        if (i2 == 0) {
            int i3 = this.y0 + 1;
            b[] bVarArr = this.B0;
            if (i3 >= bVarArr.length) {
                this.B0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.B0;
            int i4 = this.y0;
            bVarArr2[i4] = new b(eVar, 0, this.f1673u0);
            this.y0 = i4 + 1;
            return;
        }
        if (i2 == 1) {
            int i5 = this.f1677z0 + 1;
            b[] bVarArr3 = this.A0;
            if (i5 >= bVarArr3.length) {
                this.A0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.A0;
            int i6 = this.f1677z0;
            bVarArr4[i6] = new b(eVar, 1, this.f1673u0);
            this.f1677z0 = i6 + 1;
        }
    }

    public final void N(l.c cVar) {
        f fVar;
        l.c cVar2;
        boolean zR = R(64);
        b(cVar, zR);
        int size = this.f1668p0.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            e eVar = (e) this.f1668p0.get(i2);
            boolean[] zArr = eVar.R;
            zArr[0] = false;
            zArr[1] = false;
            if (eVar instanceof a) {
                z = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                e eVar2 = (e) this.f1668p0.get(i3);
                if (eVar2 instanceof a) {
                    a aVar = (a) eVar2;
                    for (int i4 = 0; i4 < aVar.f1711q0; i4++) {
                        e eVar3 = aVar.f1710p0[i4];
                        if (aVar.f1602s0 || eVar3.c()) {
                            int i5 = aVar.f1601r0;
                            if (i5 == 0 || i5 == 1) {
                                eVar3.R[0] = true;
                            } else if (i5 == 2 || i5 == 3) {
                                eVar3.R[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.J0;
        hashSet.clear();
        for (int i6 = 0; i6 < size; i6++) {
            e eVar4 = (e) this.f1668p0.get(i6);
            eVar4.getClass();
            boolean z2 = eVar4 instanceof h;
            if (z2 || (eVar4 instanceof i)) {
                if (z2) {
                    hashSet.add(eVar4);
                } else {
                    eVar4.b(cVar, zR);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                h hVar = (h) ((e) it.next());
                for (int i7 = 0; i7 < hVar.f1711q0; i7++) {
                    if (hashSet.contains(hVar.f1710p0[i7])) {
                        hVar.b(cVar, zR);
                        hashSet.remove(hVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((e) it2.next()).b(cVar, zR);
                }
                hashSet.clear();
            }
        }
        if (l.c.f1527p) {
            HashSet<e> hashSet2 = new HashSet();
            for (int i8 = 0; i8 < size; i8++) {
                e eVar5 = (e) this.f1668p0.get(i8);
                eVar5.getClass();
                if (!(eVar5 instanceof h) && !(eVar5 instanceof i)) {
                    hashSet2.add(eVar5);
                }
            }
            fVar = this;
            cVar2 = cVar;
            fVar.a(this, cVar2, hashSet2, this.f1657o0[0] == 2 ? 0 : 1, false);
            for (e eVar6 : hashSet2) {
                k.b(this, cVar2, eVar6);
                eVar6.b(cVar2, zR);
            }
        } else {
            fVar = this;
            cVar2 = cVar;
            for (int i9 = 0; i9 < size; i9++) {
                e eVar7 = (e) fVar.f1668p0.get(i9);
                if (eVar7 instanceof f) {
                    int[] iArr = eVar7.f1657o0;
                    int i10 = iArr[0];
                    int i11 = iArr[1];
                    if (i10 == 2) {
                        eVar7.H(1);
                    }
                    if (i11 == 2) {
                        eVar7.I(1);
                    }
                    eVar7.b(cVar2, zR);
                    if (i10 == 2) {
                        eVar7.H(i10);
                    }
                    if (i11 == 2) {
                        eVar7.I(i11);
                    }
                } else {
                    k.b(this, cVar2, eVar7);
                    if (!(eVar7 instanceof h) && !(eVar7 instanceof i)) {
                        eVar7.b(cVar2, zR);
                    }
                }
            }
        }
        if (fVar.y0 > 0) {
            k.a(this, cVar2, null, 0);
        }
        if (fVar.f1677z0 > 0) {
            k.a(this, cVar2, null, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean O(int i2, boolean z) {
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        o.e eVar = this.f1670r0;
        ArrayList arrayList = eVar.f1770e;
        f fVar = eVar.f1767a;
        int iJ = fVar.j(0);
        int[] iArr = fVar.f1657o0;
        int iJ2 = fVar.j(1);
        int iO = fVar.o();
        int iP = fVar.p();
        if (z && (iJ == 2 || iJ2 == 2)) {
            int size = arrayList.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    z3 = z;
                    break;
                }
                Object obj = arrayList.get(i5);
                i5++;
                o oVar = (o) obj;
                if (oVar.f1801f == i2 && !oVar.k()) {
                    z3 = false;
                    break;
                }
            }
            if (i2 == 0) {
                if (z3 && iJ == 2) {
                    fVar.H(1);
                    fVar.J(eVar.d(fVar, 0));
                    fVar.f1634d.f1800e.d(fVar.n());
                }
            } else if (z3 && iJ2 == 2) {
                fVar.I(1);
                fVar.G(eVar.d(fVar, 1));
                fVar.f1636e.f1800e.d(fVar.k());
            }
        }
        if (i2 == 0) {
            i3 = 0;
            int i6 = iArr[0];
            if (i6 == 1 || i6 == 4) {
                int iN = fVar.n() + iO;
                fVar.f1634d.f1804i.d(iN);
                fVar.f1634d.f1800e.d(iN - iO);
                i4 = 1;
            }
            i4 = i3;
        } else {
            i3 = 0;
            int i7 = iArr[1];
            if (i7 == 1 || i7 == 4) {
                int iK = fVar.k() + iP;
                fVar.f1636e.f1804i.d(iK);
                fVar.f1636e.f1800e.d(iK - iP);
                i4 = 1;
            }
            i4 = i3;
        }
        eVar.g();
        int size2 = arrayList.size();
        int i8 = i3;
        while (i8 < size2) {
            Object obj2 = arrayList.get(i8);
            i8++;
            o oVar2 = (o) obj2;
            if (oVar2.f1801f == i2 && (oVar2.f1798b != fVar || oVar2.f1802g)) {
                oVar2.e();
            }
        }
        int size3 = arrayList.size();
        int i9 = i3;
        while (i9 < size3) {
            Object obj3 = arrayList.get(i9);
            i9++;
            o oVar3 = (o) obj3;
            if (oVar3.f1801f == i2 && (i4 != 0 || oVar3.f1798b != fVar)) {
                if (!oVar3.f1803h.f1782j || !oVar3.f1804i.f1782j || (!(oVar3 instanceof o.c) && !oVar3.f1800e.f1782j)) {
                    z2 = i3;
                    break;
                }
            }
        }
        z2 = 1;
        fVar.H(iJ);
        fVar.I(iJ2);
        return z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:339:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0671 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x07bf  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0800  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x081d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:489:0x082a A[LOOP:14: B:488:0x0828->B:489:0x082a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:492:0x085e  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x0892  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x089f  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x08b2  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x08bb  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x08f4  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x08f8  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x08fa  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x090b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0127  */
    /* JADX WARN: Type inference failed for: r0v100 */
    /* JADX WARN: Type inference failed for: r0v101 */
    /* JADX WARN: Type inference failed for: r0v102 */
    /* JADX WARN: Type inference failed for: r0v103 */
    /* JADX WARN: Type inference failed for: r0v104 */
    /* JADX WARN: Type inference failed for: r0v105 */
    /* JADX WARN: Type inference failed for: r0v106 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v97 */
    /* JADX WARN: Type inference failed for: r0v98 */
    /* JADX WARN: Type inference failed for: r0v99 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r24v15 */
    /* JADX WARN: Type inference failed for: r24v16 */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v5 */
    /* JADX WARN: Type inference failed for: r24v6 */
    /* JADX WARN: Type inference failed for: r24v7 */
    /* JADX WARN: Type inference failed for: r24v8 */
    /* JADX WARN: Type inference failed for: r24v9 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r32v0, types: [n.e, n.f] */
    /* JADX WARN: Type inference failed for: r4v55, types: [int] */
    /* JADX WARN: Type inference failed for: r5v57, types: [int] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v74, types: [int] */
    /* JADX WARN: Type inference failed for: r7v22, types: [int] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P() {
        /*
            Method dump skipped, instruction units count: 2329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n.f.P():void");
    }

    public final boolean R(int i2) {
        return (this.C0 & i2) == i2;
    }

    @Override // n.e
    public final void z() {
        this.f1674v0.t();
        this.f1675w0 = 0;
        this.f1676x0 = 0;
        this.f1668p0.clear();
        super.z();
    }
}
