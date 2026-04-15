package o;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public abstract class o implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n.e f1798b;
    public l c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f1800e = new g(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1801f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1802g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f1803h = new f(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f f1804i = new f(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1805j = 1;

    public o(n.e eVar) {
        this.f1798b = eVar;
    }

    public static void b(f fVar, f fVar2, int i2) {
        fVar.f1784l.add(fVar2);
        fVar.f1778f = i2;
        fVar2.f1783k.add(fVar);
    }

    public static f h(n.d dVar) {
        n.d dVar2 = dVar.f1625f;
        if (dVar2 == null) {
            return null;
        }
        n.e eVar = dVar2.f1623d;
        int iA = l.f.a(dVar2.f1624e);
        if (iA == 1) {
            return eVar.f1634d.f1803h;
        }
        if (iA == 2) {
            return eVar.f1636e.f1803h;
        }
        if (iA == 3) {
            return eVar.f1634d.f1804i;
        }
        if (iA == 4) {
            return eVar.f1636e.f1804i;
        }
        if (iA != 5) {
            return null;
        }
        return eVar.f1636e.f1790k;
    }

    public static f i(n.d dVar, int i2) {
        n.d dVar2 = dVar.f1625f;
        if (dVar2 == null) {
            return null;
        }
        n.e eVar = dVar2.f1623d;
        o oVar = i2 == 0 ? eVar.f1634d : eVar.f1636e;
        int iA = l.f.a(dVar2.f1624e);
        if (iA == 1 || iA == 2) {
            return oVar.f1803h;
        }
        if (iA == 3 || iA == 4) {
            return oVar.f1804i;
        }
        return null;
    }

    public final void c(f fVar, f fVar2, int i2, g gVar) {
        fVar.f1784l.add(fVar2);
        fVar.f1784l.add(this.f1800e);
        fVar.f1780h = i2;
        fVar.f1781i = gVar;
        fVar2.f1783k.add(fVar);
        gVar.f1783k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i2, int i3) {
        if (i3 == 0) {
            n.e eVar = this.f1798b;
            int i4 = eVar.f1663u;
            int iMax = Math.max(eVar.f1662t, i2);
            if (i4 > 0) {
                iMax = Math.min(i4, i2);
            }
            if (iMax != i2) {
                return iMax;
            }
        } else {
            n.e eVar2 = this.f1798b;
            int i5 = eVar2.f1666x;
            int iMax2 = Math.max(eVar2.f1665w, i2);
            if (i5 > 0) {
                iMax2 = Math.min(i5, i2);
            }
            if (iMax2 != i2) {
                return iMax2;
            }
        }
        return i2;
    }

    public long j() {
        if (this.f1800e.f1782j) {
            return r0.f1779g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(n.d r12, n.d r13, int r14) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.o.l(n.d, n.d, int):void");
    }
}
