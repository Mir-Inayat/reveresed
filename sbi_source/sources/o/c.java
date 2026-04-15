package o;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class c extends o {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f1765k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1766l;

    public c(n.e eVar, int i2) {
        n.e eVar2;
        super(eVar);
        ArrayList arrayList = new ArrayList();
        this.f1765k = arrayList;
        this.f1801f = i2;
        n.e eVar3 = this.f1798b;
        n.e eVarM = eVar3.m(i2);
        while (true) {
            eVar2 = eVar3;
            eVar3 = eVarM;
            if (eVar3 == null) {
                break;
            } else {
                eVarM = eVar3.m(this.f1801f);
            }
        }
        this.f1798b = eVar2;
        int i3 = this.f1801f;
        arrayList.add(i3 == 0 ? eVar2.f1634d : i3 == 1 ? eVar2.f1636e : null);
        n.e eVarL = eVar2.l(this.f1801f);
        while (eVarL != null) {
            int i4 = this.f1801f;
            arrayList.add(i4 == 0 ? eVarL.f1634d : i4 == 1 ? eVarL.f1636e : null);
            eVarL = eVarL.l(this.f1801f);
        }
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            o oVar = (o) obj;
            int i6 = this.f1801f;
            if (i6 == 0) {
                oVar.f1798b.f1631b = this;
            } else if (i6 == 1) {
                oVar.f1798b.c = this;
            }
        }
        if (this.f1801f == 0 && ((n.f) this.f1798b.S).f1673u0 && arrayList.size() > 1) {
            this.f1798b = ((o) arrayList.get(arrayList.size() - 1)).f1798b;
        }
        this.f1766l = this.f1801f == 0 ? this.f1798b.f1643h0 : this.f1798b.f1645i0;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    @Override // o.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(o.d r28) {
        /*
            Method dump skipped, instruction units count: 945
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.c.a(o.d):void");
    }

    @Override // o.o
    public final void d() {
        ArrayList arrayList = this.f1765k;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((o) obj).d();
        }
        int size2 = arrayList.size();
        if (size2 < 1) {
            return;
        }
        n.e eVar = ((o) arrayList.get(0)).f1798b;
        n.e eVar2 = ((o) arrayList.get(size2 - 1)).f1798b;
        int i3 = this.f1801f;
        f fVar = this.f1804i;
        f fVar2 = this.f1803h;
        if (i3 == 0) {
            n.d dVar = eVar.H;
            n.d dVar2 = eVar2.J;
            f fVarI = o.i(dVar, 0);
            int iE = dVar.e();
            n.e eVarM = m();
            if (eVarM != null) {
                iE = eVarM.H.e();
            }
            if (fVarI != null) {
                o.b(fVar2, fVarI, iE);
            }
            f fVarI2 = o.i(dVar2, 0);
            int iE2 = dVar2.e();
            n.e eVarN = n();
            if (eVarN != null) {
                iE2 = eVarN.J.e();
            }
            if (fVarI2 != null) {
                o.b(fVar, fVarI2, -iE2);
            }
        } else {
            n.d dVar3 = eVar.I;
            n.d dVar4 = eVar2.K;
            f fVarI3 = o.i(dVar3, 1);
            int iE3 = dVar3.e();
            n.e eVarM2 = m();
            if (eVarM2 != null) {
                iE3 = eVarM2.I.e();
            }
            if (fVarI3 != null) {
                o.b(fVar2, fVarI3, iE3);
            }
            f fVarI4 = o.i(dVar4, 1);
            int iE4 = dVar4.e();
            n.e eVarN2 = n();
            if (eVarN2 != null) {
                iE4 = eVarN2.K.e();
            }
            if (fVarI4 != null) {
                o.b(fVar, fVarI4, -iE4);
            }
        }
        fVar2.f1774a = this;
        fVar.f1774a = this;
    }

    @Override // o.o
    public final void e() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f1765k;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((o) arrayList.get(i2)).e();
            i2++;
        }
    }

    @Override // o.o
    public final void f() {
        this.c = null;
        ArrayList arrayList = this.f1765k;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((o) obj).f();
        }
    }

    @Override // o.o
    public final long j() {
        ArrayList arrayList = this.f1765k;
        int size = arrayList.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            o oVar = (o) arrayList.get(i2);
            j2 = ((long) oVar.f1804i.f1778f) + oVar.j() + j2 + ((long) oVar.f1803h.f1778f);
        }
        return j2;
    }

    @Override // o.o
    public final boolean k() {
        ArrayList arrayList = this.f1765k;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!((o) arrayList.get(i2)).k()) {
                return false;
            }
        }
        return true;
    }

    public final n.e m() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f1765k;
            if (i2 >= arrayList.size()) {
                return null;
            }
            n.e eVar = ((o) arrayList.get(i2)).f1798b;
            if (eVar.f1639f0 != 8) {
                return eVar;
            }
            i2++;
        }
    }

    public final n.e n() {
        ArrayList arrayList = this.f1765k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            n.e eVar = ((o) arrayList.get(size)).f1798b;
            if (eVar.f1639f0 != 8) {
                return eVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f1801f == 0 ? "horizontal : " : "vertical : ");
        ArrayList arrayList = this.f1765k;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            sb.append("<");
            sb.append((o) obj);
            sb.append("> ");
        }
        return sb.toString();
    }
}
