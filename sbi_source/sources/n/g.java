package n;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1678a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f1680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f1681e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f1682f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d f1683g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1684h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1685i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1686j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1687k;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1693q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f1694r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f1679b = null;
    public int c = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1688l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1689m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1690n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1691o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1692p = 0;

    public g(h hVar, int i2, d dVar, d dVar2, d dVar3, d dVar4, int i3) {
        this.f1694r = hVar;
        this.f1678a = i2;
        this.f1680d = dVar;
        this.f1681e = dVar2;
        this.f1682f = dVar3;
        this.f1683g = dVar4;
        this.f1684h = hVar.f1700v0;
        this.f1685i = hVar.f1696r0;
        this.f1686j = hVar.f1701w0;
        this.f1687k = hVar.f1697s0;
        this.f1693q = i3;
    }

    public final void a(e eVar) {
        int i2 = this.f1678a;
        h hVar = this.f1694r;
        if (i2 == 0) {
            int iP = hVar.P(eVar, this.f1693q);
            if (eVar.f1657o0[0] == 3) {
                this.f1692p++;
                iP = 0;
            }
            this.f1688l = iP + (eVar.f1639f0 != 8 ? hVar.O0 : 0) + this.f1688l;
            int iO = hVar.O(eVar, this.f1693q);
            if (this.f1679b == null || this.c < iO) {
                this.f1679b = eVar;
                this.c = iO;
                this.f1689m = iO;
            }
        } else {
            int iP2 = hVar.P(eVar, this.f1693q);
            int iO2 = hVar.O(eVar, this.f1693q);
            if (eVar.f1657o0[1] == 3) {
                this.f1692p++;
                iO2 = 0;
            }
            this.f1689m = iO2 + (eVar.f1639f0 != 8 ? hVar.P0 : 0) + this.f1689m;
            if (this.f1679b == null || this.c < iP2) {
                this.f1679b = eVar;
                this.c = iP2;
                this.f1688l = iP2;
            }
        }
        this.f1691o++;
    }

    public final void b(int i2, boolean z, boolean z2) {
        h hVar;
        int i3;
        e eVar;
        char c;
        int i4;
        int i5;
        int i6;
        int i7 = this.f1691o;
        int i8 = 0;
        while (true) {
            hVar = this.f1694r;
            if (i8 >= i7 || (i6 = this.f1690n + i8) >= hVar.f1695a1) {
                break;
            }
            e eVar2 = hVar.Z0[i6];
            if (eVar2 != null) {
                eVar2.A();
            }
            i8++;
        }
        if (i7 == 0 || this.f1679b == null) {
            return;
        }
        boolean z3 = z2 && i2 == 0;
        int i9 = -1;
        int i10 = -1;
        for (int i11 = 0; i11 < i7; i11++) {
            int i12 = this.f1690n + (z ? (i7 - 1) - i11 : i11);
            if (i12 >= hVar.f1695a1) {
                break;
            }
            if (hVar.Z0[i12].f1639f0 == 0) {
                if (i9 == -1) {
                    i9 = i11;
                }
                i10 = i11;
            }
        }
        if (this.f1678a != 0) {
            e eVar3 = this.f1679b;
            eVar3.f1643h0 = hVar.C0;
            d dVar = eVar3.H;
            d dVar2 = eVar3.J;
            int i13 = this.f1684h;
            if (i2 > 0) {
                i13 += hVar.O0;
            }
            if (z) {
                dVar2.a(this.f1682f, i13);
                if (z2) {
                    dVar.a(this.f1680d, this.f1686j);
                }
                if (i2 > 0) {
                    this.f1682f.f1623d.H.a(dVar2, 0);
                }
            } else {
                dVar.a(this.f1680d, i13);
                if (z2) {
                    dVar2.a(this.f1682f, this.f1686j);
                }
                if (i2 > 0) {
                    this.f1680d.f1623d.J.a(dVar, 0);
                }
            }
            e eVar4 = null;
            int i14 = 0;
            while (i14 < i7) {
                int i15 = this.f1690n + i14;
                if (i15 >= hVar.f1695a1) {
                    return;
                }
                e eVar5 = hVar.Z0[i15];
                if (i14 == 0) {
                    eVar5.f(eVar5.I, this.f1681e, this.f1685i);
                    int i16 = hVar.D0;
                    float f3 = hVar.J0;
                    if (this.f1690n == 0) {
                        int i17 = hVar.F0;
                        i3 = -1;
                        if (i17 != -1) {
                            f3 = hVar.L0;
                        }
                        i16 = i17;
                        eVar5.f1645i0 = i16;
                        eVar5.f1635d0 = f3;
                    } else {
                        i3 = -1;
                    }
                    if (z2 && (i17 = hVar.H0) != i3) {
                        f3 = hVar.N0;
                        i16 = i17;
                    }
                    eVar5.f1645i0 = i16;
                    eVar5.f1635d0 = f3;
                }
                if (i14 == i7 - 1) {
                    eVar5.f(eVar5.K, this.f1683g, this.f1687k);
                }
                if (eVar4 != null) {
                    d dVar3 = eVar4.K;
                    d dVar4 = eVar5.I;
                    dVar4.a(dVar3, hVar.P0);
                    if (i14 == i9) {
                        int i18 = this.f1685i;
                        if (dVar4.h()) {
                            dVar4.f1627h = i18;
                        }
                    }
                    dVar3.a(dVar4, 0);
                    if (i14 == i10 + 1) {
                        int i19 = this.f1687k;
                        if (dVar3.h()) {
                            dVar3.f1627h = i19;
                        }
                    }
                }
                if (eVar5 != eVar3) {
                    if (z) {
                        int i20 = hVar.Q0;
                        if (i20 == 0) {
                            eVar5.J.a(dVar2, 0);
                        } else if (i20 == 1) {
                            eVar5.H.a(dVar, 0);
                        } else if (i20 == 2) {
                            eVar5.H.a(dVar, 0);
                            eVar5.J.a(dVar2, 0);
                        }
                    } else {
                        int i21 = hVar.Q0;
                        if (i21 == 0) {
                            eVar5.H.a(dVar, 0);
                        } else if (i21 == 1) {
                            eVar5.J.a(dVar2, 0);
                        } else if (i21 == 2) {
                            if (z3) {
                                eVar5.H.a(this.f1680d, this.f1684h);
                                eVar5.J.a(this.f1682f, this.f1686j);
                            } else {
                                eVar5.H.a(dVar, 0);
                                eVar5.J.a(dVar2, 0);
                            }
                        }
                    }
                }
                i14++;
                eVar4 = eVar5;
            }
            return;
        }
        e eVar6 = this.f1679b;
        eVar6.f1645i0 = hVar.D0;
        d dVar5 = eVar6.K;
        d dVar6 = eVar6.I;
        int i22 = this.f1685i;
        if (i2 > 0) {
            i22 += hVar.P0;
        }
        dVar6.a(this.f1681e, i22);
        if (z2) {
            dVar5.a(this.f1683g, this.f1687k);
        }
        if (i2 > 0) {
            this.f1681e.f1623d.K.a(dVar6, 0);
        }
        if (hVar.R0 != 3 || eVar6.D) {
            eVar = eVar6;
        } else {
            for (int i23 = 0; i23 < i7; i23++) {
                int i24 = this.f1690n + (z ? (i7 - 1) - i23 : i23);
                if (i24 >= hVar.f1695a1) {
                    break;
                }
                eVar = hVar.Z0[i24];
                if (eVar.D) {
                    break;
                }
            }
            eVar = eVar6;
        }
        int i25 = 0;
        e eVar7 = null;
        while (i25 < i7) {
            int i26 = z ? (i7 - 1) - i25 : i25;
            int i27 = this.f1690n + i26;
            if (i27 >= hVar.f1695a1) {
                return;
            }
            e eVar8 = hVar.Z0[i27];
            if (i25 == 0) {
                eVar8.f(eVar8.H, this.f1680d, this.f1684h);
            }
            if (i26 == 0) {
                int i28 = hVar.C0;
                float f4 = z ? 1.0f - hVar.I0 : hVar.I0;
                if (this.f1690n == 0) {
                    int i29 = hVar.E0;
                    i4 = i28;
                    if (i29 != -1) {
                        f4 = z ? 1.0f - hVar.K0 : hVar.K0;
                        i5 = i29;
                    }
                    eVar8.f1643h0 = i5;
                    eVar8.f1633c0 = f4;
                } else {
                    i4 = i28;
                }
                if (!z2 || (i5 = hVar.G0) == -1) {
                    i5 = i4;
                } else {
                    f4 = z ? 1.0f - hVar.M0 : hVar.M0;
                }
                eVar8.f1643h0 = i5;
                eVar8.f1633c0 = f4;
            }
            if (i25 == i7 - 1) {
                eVar8.f(eVar8.J, this.f1682f, this.f1686j);
            }
            if (eVar7 != null) {
                d dVar7 = eVar7.J;
                d dVar8 = eVar8.H;
                dVar8.a(dVar7, hVar.O0);
                if (i25 == i9) {
                    int i30 = this.f1684h;
                    if (dVar8.h()) {
                        dVar8.f1627h = i30;
                    }
                }
                dVar7.a(dVar8, 0);
                if (i25 == i10 + 1) {
                    int i31 = this.f1686j;
                    if (dVar7.h()) {
                        dVar7.f1627h = i31;
                    }
                }
            }
            if (eVar8 != eVar6) {
                int i32 = hVar.R0;
                c = 3;
                if (i32 == 3 && eVar.D && eVar8 != eVar && eVar8.D) {
                    eVar8.L.a(eVar.L, 0);
                } else if (i32 == 0) {
                    eVar8.I.a(dVar6, 0);
                } else if (i32 == 1) {
                    eVar8.K.a(dVar5, 0);
                } else if (z3) {
                    eVar8.I.a(this.f1681e, this.f1685i);
                    eVar8.K.a(this.f1683g, this.f1687k);
                } else {
                    eVar8.I.a(dVar6, 0);
                    eVar8.K.a(dVar5, 0);
                }
            } else {
                c = 3;
            }
            i25++;
            eVar7 = eVar8;
        }
    }

    public final int c() {
        return this.f1678a == 1 ? this.f1689m - this.f1694r.P0 : this.f1689m;
    }

    public final int d() {
        return this.f1678a == 0 ? this.f1688l - this.f1694r.O0 : this.f1688l;
    }

    public final void e(int i2) {
        h hVar;
        int i3;
        int i4 = this.f1692p;
        if (i4 == 0) {
            return;
        }
        int i5 = this.f1691o;
        int i6 = i2 / i4;
        int i7 = 0;
        while (true) {
            hVar = this.f1694r;
            if (i7 >= i5 || (i3 = this.f1690n + i7) >= hVar.f1695a1) {
                break;
            }
            e eVar = hVar.Z0[i3];
            if (this.f1678a == 0) {
                if (eVar != null) {
                    int[] iArr = eVar.f1657o0;
                    if (iArr[0] == 3 && eVar.f1659q == 0) {
                        hVar.Q(1, i6, iArr[1], eVar.k(), eVar);
                    }
                }
            } else if (eVar != null) {
                int[] iArr2 = eVar.f1657o0;
                if (iArr2[1] == 3 && eVar.f1660r == 0) {
                    int i8 = i6;
                    hVar.Q(iArr2[0], eVar.n(), 1, i8, eVar);
                    i6 = i8;
                }
            }
            i7++;
        }
        this.f1688l = 0;
        this.f1689m = 0;
        this.f1679b = null;
        this.c = 0;
        int i9 = this.f1691o;
        for (int i10 = 0; i10 < i9; i10++) {
            int i11 = this.f1690n + i10;
            if (i11 >= hVar.f1695a1) {
                return;
            }
            e eVar2 = hVar.Z0[i11];
            if (this.f1678a == 0) {
                int iN = eVar2.n();
                int i12 = hVar.O0;
                if (eVar2.f1639f0 == 8) {
                    i12 = 0;
                }
                this.f1688l = iN + i12 + this.f1688l;
                int iO = hVar.O(eVar2, this.f1693q);
                if (this.f1679b == null || this.c < iO) {
                    this.f1679b = eVar2;
                    this.c = iO;
                    this.f1689m = iO;
                }
            } else {
                int iP = hVar.P(eVar2, this.f1693q);
                int iO2 = hVar.O(eVar2, this.f1693q);
                int i13 = hVar.P0;
                if (eVar2.f1639f0 == 8) {
                    i13 = 0;
                }
                this.f1689m = iO2 + i13 + this.f1689m;
                if (this.f1679b == null || this.c < iP) {
                    this.f1679b = eVar2;
                    this.c = iP;
                    this.f1688l = iP;
                }
            }
        }
    }

    public final void f(int i2, d dVar, d dVar2, d dVar3, d dVar4, int i3, int i4, int i5, int i6, int i7) {
        this.f1678a = i2;
        this.f1680d = dVar;
        this.f1681e = dVar2;
        this.f1682f = dVar3;
        this.f1683g = dVar4;
        this.f1684h = i3;
        this.f1685i = i4;
        this.f1686j = i5;
        this.f1687k = i6;
        this.f1693q = i7;
    }
}
