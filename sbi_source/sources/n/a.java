package n;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class a extends j {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f1601r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f1602s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f1603t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f1604u0;

    public final boolean O() {
        int i2;
        int i3;
        int i4;
        boolean z = true;
        int i5 = 0;
        while (true) {
            i2 = this.f1711q0;
            if (i5 >= i2) {
                break;
            }
            e eVar = this.f1710p0[i5];
            if ((this.f1602s0 || eVar.c()) && ((((i3 = this.f1601r0) == 0 || i3 == 1) && !eVar.x()) || (((i4 = this.f1601r0) == 2 || i4 == 3) && !eVar.y()))) {
                z = false;
            }
            i5++;
        }
        if (!z || i2 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.f1711q0; i6++) {
            e eVar2 = this.f1710p0[i6];
            if (this.f1602s0 || eVar2.c()) {
                if (!z2) {
                    int i7 = this.f1601r0;
                    if (i7 == 0) {
                        iMax = eVar2.i(2).d();
                    } else if (i7 == 1) {
                        iMax = eVar2.i(4).d();
                    } else if (i7 == 2) {
                        iMax = eVar2.i(3).d();
                    } else if (i7 == 3) {
                        iMax = eVar2.i(5).d();
                    }
                    z2 = true;
                }
                int i8 = this.f1601r0;
                if (i8 == 0) {
                    iMax = Math.min(iMax, eVar2.i(2).d());
                } else if (i8 == 1) {
                    iMax = Math.max(iMax, eVar2.i(4).d());
                } else if (i8 == 2) {
                    iMax = Math.min(iMax, eVar2.i(3).d());
                } else if (i8 == 3) {
                    iMax = Math.max(iMax, eVar2.i(5).d());
                }
            }
        }
        int i9 = iMax + this.f1603t0;
        int i10 = this.f1601r0;
        if (i10 == 0 || i10 == 1) {
            E(i9, i9);
        } else {
            F(i9, i9);
        }
        this.f1604u0 = true;
        return true;
    }

    public final int P() {
        int i2 = this.f1601r0;
        if (i2 == 0 || i2 == 1) {
            return 0;
        }
        return (i2 == 2 || i2 == 3) ? 1 : -1;
    }

    @Override // n.e
    public final void b(l.c cVar, boolean z) {
        boolean z2;
        int i2;
        int i3;
        d[] dVarArr = this.P;
        d dVar = this.H;
        dVarArr[0] = dVar;
        int i4 = 2;
        d dVar2 = this.I;
        dVarArr[2] = dVar2;
        d dVar3 = this.J;
        dVarArr[1] = dVar3;
        d dVar4 = this.K;
        dVarArr[3] = dVar4;
        for (d dVar5 : dVarArr) {
            dVar5.f1628i = cVar.k(dVar5);
        }
        int i5 = this.f1601r0;
        if (i5 < 0 || i5 >= 4) {
            return;
        }
        d dVar6 = dVarArr[i5];
        if (!this.f1604u0) {
            O();
        }
        if (this.f1604u0) {
            this.f1604u0 = false;
            int i6 = this.f1601r0;
            if (i6 == 0 || i6 == 1) {
                cVar.d(dVar.f1628i, this.X);
                cVar.d(dVar3.f1628i, this.X);
                return;
            } else {
                if (i6 == 2 || i6 == 3) {
                    cVar.d(dVar2.f1628i, this.Y);
                    cVar.d(dVar4.f1628i, this.Y);
                    return;
                }
                return;
            }
        }
        for (int i7 = 0; i7 < this.f1711q0; i7++) {
            e eVar = this.f1710p0[i7];
            if ((this.f1602s0 || eVar.c()) && ((((i3 = this.f1601r0) == 0 || i3 == 1) && eVar.f1657o0[0] == 3 && eVar.H.f1625f != null && eVar.J.f1625f != null) || ((i3 == 2 || i3 == 3) && eVar.f1657o0[1] == 3 && eVar.I.f1625f != null && eVar.K.f1625f != null))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = dVar.g() || dVar3.g();
        boolean z4 = dVar2.g() || dVar4.g();
        int i8 = !(!z2 && (((i2 = this.f1601r0) == 0 && z3) || ((i2 == 2 && z4) || ((i2 == 1 && z3) || (i2 == 3 && z4))))) ? 4 : 5;
        int i9 = 0;
        while (i9 < this.f1711q0) {
            e eVar2 = this.f1710p0[i9];
            if (this.f1602s0 || eVar2.c()) {
                l.g gVarK = cVar.k(eVar2.P[this.f1601r0]);
                d[] dVarArr2 = eVar2.P;
                int i10 = this.f1601r0;
                d dVar7 = dVarArr2[i10];
                dVar7.f1628i = gVarK;
                d dVar8 = dVar7.f1625f;
                int i11 = (dVar8 == null || dVar8.f1623d != this) ? 0 : dVar7.f1626g;
                if (i10 == 0 || i10 == i4) {
                    l.g gVar = dVar6.f1628i;
                    int i12 = this.f1603t0 - i11;
                    l.b bVarL = cVar.l();
                    l.g gVarM = cVar.m();
                    gVarM.f1550d = 0;
                    bVarL.c(gVar, gVarK, gVarM, i12);
                    cVar.c(bVarL);
                } else {
                    l.g gVar2 = dVar6.f1628i;
                    int i13 = this.f1603t0 + i11;
                    l.b bVarL2 = cVar.l();
                    l.g gVarM2 = cVar.m();
                    gVarM2.f1550d = 0;
                    bVarL2.b(gVar2, gVarK, gVarM2, i13);
                    cVar.c(bVarL2);
                }
                cVar.e(dVar6.f1628i, gVarK, this.f1603t0 + i11, i8);
            }
            i9++;
            i4 = 2;
        }
        int i14 = this.f1601r0;
        if (i14 == 0) {
            cVar.e(dVar3.f1628i, dVar.f1628i, 0, 8);
            cVar.e(dVar.f1628i, this.S.J.f1628i, 0, 4);
            cVar.e(dVar.f1628i, this.S.H.f1628i, 0, 0);
            return;
        }
        if (i14 == 1) {
            cVar.e(dVar.f1628i, dVar3.f1628i, 0, 8);
            cVar.e(dVar.f1628i, this.S.H.f1628i, 0, 4);
            cVar.e(dVar.f1628i, this.S.J.f1628i, 0, 0);
        } else if (i14 == 2) {
            cVar.e(dVar4.f1628i, dVar2.f1628i, 0, 8);
            cVar.e(dVar2.f1628i, this.S.K.f1628i, 0, 4);
            cVar.e(dVar2.f1628i, this.S.I.f1628i, 0, 0);
        } else if (i14 == 3) {
            cVar.e(dVar2.f1628i, dVar4.f1628i, 0, 8);
            cVar.e(dVar2.f1628i, this.S.I.f1628i, 0, 4);
            cVar.e(dVar2.f1628i, this.S.K.f1628i, 0, 0);
        }
    }

    @Override // n.e
    public final boolean c() {
        return true;
    }

    @Override // n.e
    public final String toString() {
        String str = "[Barrier] " + this.f1641g0 + " {";
        for (int i2 = 0; i2 < this.f1711q0; i2++) {
            e eVar = this.f1710p0[i2];
            if (i2 > 0) {
                str = str + ", ";
            }
            str = str + eVar.f1641g0;
        }
        return str + "}";
    }

    @Override // n.e
    public final boolean x() {
        return this.f1604u0;
    }

    @Override // n.e
    public final boolean y() {
        return this.f1604u0;
    }
}
