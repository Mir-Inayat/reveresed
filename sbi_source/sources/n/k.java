package n;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean[] f1712a = new boolean[3];

    /* JADX WARN: Removed duplicated region for block: B:188:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x06d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:433:0x06f2 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(n.f r40, l.c r41, java.util.ArrayList r42, int r43) {
        /*
            Method dump skipped, instruction units count: 1791
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n.k.a(n.f, l.c, java.util.ArrayList, int):void");
    }

    public static void b(f fVar, l.c cVar, e eVar) {
        eVar.f1654n = -1;
        d dVar = eVar.L;
        int[] iArr = eVar.f1657o0;
        d dVar2 = eVar.K;
        d dVar3 = eVar.I;
        d dVar4 = eVar.J;
        d dVar5 = eVar.H;
        eVar.f1656o = -1;
        int[] iArr2 = fVar.f1657o0;
        if (iArr2[0] != 2 && iArr[0] == 4) {
            int i2 = dVar5.f1626g;
            int iN = fVar.n() - dVar4.f1626g;
            dVar5.f1628i = cVar.k(dVar5);
            dVar4.f1628i = cVar.k(dVar4);
            cVar.d(dVar5.f1628i, i2);
            cVar.d(dVar4.f1628i, iN);
            eVar.f1654n = 2;
            eVar.X = i2;
            int i3 = iN - i2;
            eVar.T = i3;
            int i4 = eVar.f1630a0;
            if (i3 < i4) {
                eVar.T = i4;
            }
        }
        if (iArr2[1] == 2 || iArr[1] != 4) {
            return;
        }
        int i5 = dVar3.f1626g;
        int iK = fVar.k() - dVar2.f1626g;
        dVar3.f1628i = cVar.k(dVar3);
        dVar2.f1628i = cVar.k(dVar2);
        cVar.d(dVar3.f1628i, i5);
        cVar.d(dVar2.f1628i, iK);
        if (eVar.Z > 0 || eVar.f1639f0 == 8) {
            l.g gVarK = cVar.k(dVar);
            dVar.f1628i = gVarK;
            cVar.d(gVarK, eVar.Z + i5);
        }
        eVar.f1656o = 2;
        eVar.Y = i5;
        int i6 = iK - i5;
        eVar.U = i6;
        int i7 = eVar.f1632b0;
        if (i6 < i7) {
            eVar.U = i7;
        }
    }

    public static final boolean c(int i2, int i3) {
        return (i2 & i3) == i3;
    }
}
