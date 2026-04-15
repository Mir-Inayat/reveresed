package n;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class i extends e {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public float f1704p0 = -1.0f;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f1705q0 = -1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f1706r0 = -1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public d f1707s0 = this.I;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f1708t0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f1709u0;

    public i() {
        this.Q.clear();
        this.Q.add(this.f1707s0);
        int length = this.P.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.P[i2] = this.f1707s0;
        }
    }

    @Override // n.e
    public final void L(l.c cVar, boolean z) {
        if (this.S == null) {
            return;
        }
        d dVar = this.f1707s0;
        cVar.getClass();
        int iN = l.c.n(dVar);
        if (this.f1708t0 == 1) {
            this.X = iN;
            this.Y = 0;
            G(this.S.k());
            J(0);
            return;
        }
        this.X = 0;
        this.Y = iN;
        J(this.S.n());
        G(0);
    }

    public final void M(int i2) {
        this.f1707s0.l(i2);
        this.f1709u0 = true;
    }

    public final void N(int i2) {
        if (this.f1708t0 == i2) {
            return;
        }
        this.f1708t0 = i2;
        ArrayList arrayList = this.Q;
        arrayList.clear();
        if (this.f1708t0 == 1) {
            this.f1707s0 = this.H;
        } else {
            this.f1707s0 = this.I;
        }
        arrayList.add(this.f1707s0);
        d[] dVarArr = this.P;
        int length = dVarArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            dVarArr[i3] = this.f1707s0;
        }
    }

    @Override // n.e
    public final void b(l.c cVar, boolean z) {
        f fVar = (f) this.S;
        if (fVar == null) {
            return;
        }
        Object objI = fVar.i(2);
        Object objI2 = fVar.i(4);
        e eVar = this.S;
        boolean z2 = eVar != null && eVar.f1657o0[0] == 2;
        if (this.f1708t0 == 0) {
            objI = fVar.i(3);
            objI2 = fVar.i(5);
            e eVar2 = this.S;
            z2 = eVar2 != null && eVar2.f1657o0[1] == 2;
        }
        if (this.f1709u0) {
            d dVar = this.f1707s0;
            if (dVar.c) {
                l.g gVarK = cVar.k(dVar);
                cVar.d(gVarK, this.f1707s0.d());
                if (this.f1705q0 != -1) {
                    if (z2) {
                        cVar.f(cVar.k(objI2), gVarK, 0, 5);
                    }
                } else if (this.f1706r0 != -1 && z2) {
                    l.g gVarK2 = cVar.k(objI2);
                    cVar.f(gVarK, cVar.k(objI), 0, 5);
                    cVar.f(gVarK2, gVarK, 0, 5);
                }
                this.f1709u0 = false;
                return;
            }
        }
        if (this.f1705q0 != -1) {
            l.g gVarK3 = cVar.k(this.f1707s0);
            cVar.e(gVarK3, cVar.k(objI), this.f1705q0, 8);
            if (z2) {
                cVar.f(cVar.k(objI2), gVarK3, 0, 5);
                return;
            }
            return;
        }
        if (this.f1706r0 != -1) {
            l.g gVarK4 = cVar.k(this.f1707s0);
            l.g gVarK5 = cVar.k(objI2);
            cVar.e(gVarK4, gVarK5, -this.f1706r0, 8);
            if (z2) {
                cVar.f(gVarK4, cVar.k(objI), 0, 5);
                cVar.f(gVarK5, gVarK4, 0, 5);
                return;
            }
            return;
        }
        if (this.f1704p0 != -1.0f) {
            l.g gVarK6 = cVar.k(this.f1707s0);
            l.g gVarK7 = cVar.k(objI2);
            float f3 = this.f1704p0;
            l.b bVarL = cVar.l();
            bVarL.f1525d.g(gVarK6, -1.0f);
            bVarL.f1525d.g(gVarK7, f3);
            cVar.c(bVarL);
        }
    }

    @Override // n.e
    public final boolean c() {
        return true;
    }

    @Override // n.e
    public final d i(int i2) {
        int iA = l.f.a(i2);
        if (iA != 1) {
            if (iA != 2) {
                if (iA != 3) {
                    if (iA != 4) {
                        return null;
                    }
                }
            }
            if (this.f1708t0 == 0) {
                return this.f1707s0;
            }
            return null;
        }
        if (this.f1708t0 == 1) {
            return this.f1707s0;
        }
        return null;
    }

    @Override // n.e
    public final boolean x() {
        return this.f1709u0;
    }

    @Override // n.e
    public final boolean y() {
        return this.f1709u0;
    }
}
