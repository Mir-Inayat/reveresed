package n;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class h extends j {
    public o.b A0;
    public q.f B0;
    public int C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public float I0;
    public float J0;
    public float K0;
    public float L0;
    public float M0;
    public float N0;
    public int O0;
    public int P0;
    public int Q0;
    public int R0;
    public int S0;
    public int T0;
    public int U0;
    public ArrayList V0;
    public e[] W0;
    public e[] X0;
    public int[] Y0;
    public e[] Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public int f1695a1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f1696r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f1697s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f1698t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f1699u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f1700v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f1701w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f1702x0;
    public int y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public int f1703z0;

    @Override // n.j
    public final void N() {
        for (int i2 = 0; i2 < this.f1711q0; i2++) {
            e eVar = this.f1710p0[i2];
            if (eVar != null) {
                eVar.E = true;
            }
        }
    }

    public final int O(e eVar, int i2) {
        e eVar2;
        if (eVar != null) {
            int[] iArr = eVar.f1657o0;
            if (iArr[1] == 3) {
                int i3 = eVar.f1660r;
                if (i3 != 0) {
                    if (i3 == 2) {
                        int i4 = (int) (eVar.f1667y * i2);
                        if (i4 != eVar.k()) {
                            eVar.f1640g = true;
                            Q(iArr[0], eVar.n(), 1, i4, eVar);
                        }
                        return i4;
                    }
                    eVar2 = eVar;
                    if (i3 == 1) {
                        return eVar2.k();
                    }
                    if (i3 == 3) {
                        return (int) ((eVar2.n() * eVar2.V) + 0.5f);
                    }
                }
            } else {
                eVar2 = eVar;
            }
            return eVar2.k();
        }
        return 0;
    }

    public final int P(e eVar, int i2) {
        e eVar2;
        if (eVar != null) {
            int[] iArr = eVar.f1657o0;
            if (iArr[0] == 3) {
                int i3 = eVar.f1659q;
                if (i3 != 0) {
                    if (i3 == 2) {
                        int i4 = (int) (eVar.f1664v * i2);
                        if (i4 != eVar.n()) {
                            eVar.f1640g = true;
                            Q(1, i4, iArr[1], eVar.k(), eVar);
                        }
                        return i4;
                    }
                    eVar2 = eVar;
                    if (i3 == 1) {
                        return eVar2.n();
                    }
                    if (i3 == 3) {
                        return (int) ((eVar2.k() * eVar2.V) + 0.5f);
                    }
                }
            } else {
                eVar2 = eVar;
            }
            return eVar2.n();
        }
        return 0;
    }

    public final void Q(int i2, int i3, int i4, int i5, e eVar) {
        q.f fVar;
        e eVar2;
        o.b bVar = this.A0;
        while (true) {
            fVar = this.B0;
            if (fVar != null || (eVar2 = this.S) == null) {
                break;
            } else {
                this.B0 = ((f) eVar2).f1672t0;
            }
        }
        bVar.f1756a = i2;
        bVar.f1757b = i4;
        bVar.c = i3;
        bVar.f1758d = i5;
        fVar.b(eVar, bVar);
        eVar.J(bVar.f1759e);
        eVar.G(bVar.f1760f);
        eVar.D = bVar.f1762h;
        eVar.D(bVar.f1761g);
    }

    @Override // n.e
    public final void b(l.c cVar, boolean z) {
        e eVar;
        float f3;
        int i2;
        ArrayList arrayList = this.V0;
        super.b(cVar, z);
        e eVar2 = this.S;
        boolean z2 = eVar2 != null && ((f) eVar2).f1673u0;
        int i3 = this.S0;
        if (i3 != 0) {
            if (i3 == 1) {
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    ((g) arrayList.get(i4)).b(i4, z2, i4 == size + (-1));
                    i4++;
                }
            } else if (i3 == 2 && this.Y0 != null && this.X0 != null && this.W0 != null) {
                for (int i5 = 0; i5 < this.f1695a1; i5++) {
                    this.Z0[i5].A();
                }
                int[] iArr = this.Y0;
                int i6 = iArr[0];
                int i7 = iArr[1];
                float f4 = this.I0;
                e eVar3 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z2) {
                        i2 = (i6 - i8) - 1;
                        f3 = 1.0f - this.I0;
                    } else {
                        f3 = f4;
                        i2 = i8;
                    }
                    e eVar4 = this.X0[i2];
                    if (eVar4 != null) {
                        d dVar = eVar4.H;
                        if (eVar4.f1639f0 != 8) {
                            if (i8 == 0) {
                                eVar4.f(dVar, this.H, this.f1700v0);
                                eVar4.f1643h0 = this.C0;
                                eVar4.f1633c0 = f3;
                            }
                            if (i8 == i6 - 1) {
                                eVar4.f(eVar4.J, this.J, this.f1701w0);
                            }
                            if (i8 > 0 && eVar3 != null) {
                                d dVar2 = eVar3.J;
                                eVar4.f(dVar, dVar2, this.O0);
                                eVar3.f(dVar2, dVar, 0);
                            }
                            eVar3 = eVar4;
                        }
                    }
                    i8++;
                    f4 = f3;
                }
                for (int i9 = 0; i9 < i7; i9++) {
                    e eVar5 = this.W0[i9];
                    if (eVar5 != null) {
                        d dVar3 = eVar5.I;
                        if (eVar5.f1639f0 != 8) {
                            if (i9 == 0) {
                                eVar5.f(dVar3, this.I, this.f1696r0);
                                eVar5.f1645i0 = this.D0;
                                eVar5.f1635d0 = this.J0;
                            }
                            if (i9 == i7 - 1) {
                                eVar5.f(eVar5.K, this.K, this.f1697s0);
                            }
                            if (i9 > 0 && eVar3 != null) {
                                d dVar4 = eVar3.K;
                                eVar5.f(dVar3, dVar4, this.P0);
                                eVar3.f(dVar4, dVar3, 0);
                            }
                            eVar3 = eVar5;
                        }
                    }
                }
                for (int i10 = 0; i10 < i6; i10++) {
                    for (int i11 = 0; i11 < i7; i11++) {
                        int i12 = (i11 * i6) + i10;
                        if (this.U0 == 1) {
                            i12 = (i10 * i7) + i11;
                        }
                        e[] eVarArr = this.Z0;
                        if (i12 < eVarArr.length && (eVar = eVarArr[i12]) != null && eVar.f1639f0 != 8) {
                            e eVar6 = this.X0[i10];
                            e eVar7 = this.W0[i11];
                            if (eVar != eVar6) {
                                eVar.f(eVar.H, eVar6.H, 0);
                                eVar.f(eVar.J, eVar6.J, 0);
                            }
                            if (eVar != eVar7) {
                                eVar.f(eVar.I, eVar7.I, 0);
                                eVar.f(eVar.K, eVar7.K, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((g) arrayList.get(0)).b(0, z2, true);
        }
        this.f1702x0 = false;
    }
}
