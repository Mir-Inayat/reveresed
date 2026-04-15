package l;

import androidx.emoji2.text.q;
import androidx.emoji2.text.t;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static boolean f1527p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f1528q = 1000;
    public final e c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b[] f1533f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t f1539l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b f1542o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1529a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1530b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1531d = 32;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1532e = 32;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1534g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean[] f1535h = new boolean[32];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1536i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1537j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1538k = 32;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public g[] f1540m = new g[f1528q];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1541n = 0;

    public c() {
        this.f1533f = null;
        this.f1533f = new b[32];
        s();
        t tVar = new t();
        tVar.f253b = new e0.b();
        tVar.c = new e0.b();
        tVar.f254d = new g[32];
        this.f1539l = tVar;
        e eVar = new e(tVar);
        eVar.f1544f = new g[128];
        eVar.f1545g = new g[128];
        eVar.f1546h = 0;
        eVar.f1547i = new q(5, eVar);
        this.c = eVar;
        this.f1542o = new b(tVar);
    }

    public static int n(Object obj) {
        g gVar = ((n.d) obj).f1628i;
        if (gVar != null) {
            return (int) (gVar.f1551e + 0.5f);
        }
        return 0;
    }

    public final g a(int i2) {
        e0.b bVar = (e0.b) this.f1539l.c;
        int i3 = bVar.f969b;
        Object obj = null;
        if (i3 > 0) {
            int i4 = i3 - 1;
            Object[] objArr = bVar.f968a;
            Object obj2 = objArr[i4];
            objArr[i4] = null;
            bVar.f969b = i4;
            obj = obj2;
        }
        g gVar = (g) obj;
        if (gVar == null) {
            gVar = new g(i2);
            gVar.f1558l = i2;
        } else {
            gVar.c();
            gVar.f1558l = i2;
        }
        int i5 = this.f1541n;
        int i6 = f1528q;
        if (i5 >= i6) {
            int i7 = i6 * 2;
            f1528q = i7;
            this.f1540m = (g[]) Arrays.copyOf(this.f1540m, i7);
        }
        g[] gVarArr = this.f1540m;
        int i8 = this.f1541n;
        this.f1541n = i8 + 1;
        gVarArr[i8] = gVar;
        return gVar;
    }

    public final void b(g gVar, g gVar2, int i2, float f3, g gVar3, g gVar4, int i3, int i4) {
        b bVarL = l();
        if (gVar2 == gVar3) {
            bVarL.f1525d.g(gVar, 1.0f);
            bVarL.f1525d.g(gVar4, 1.0f);
            bVarL.f1525d.g(gVar2, -2.0f);
        } else if (f3 == 0.5f) {
            bVarL.f1525d.g(gVar, 1.0f);
            bVarL.f1525d.g(gVar2, -1.0f);
            bVarL.f1525d.g(gVar3, -1.0f);
            bVarL.f1525d.g(gVar4, 1.0f);
            if (i2 > 0 || i3 > 0) {
                bVarL.f1524b = (-i2) + i3;
            }
        } else if (f3 <= 0.0f) {
            bVarL.f1525d.g(gVar, -1.0f);
            bVarL.f1525d.g(gVar2, 1.0f);
            bVarL.f1524b = i2;
        } else if (f3 >= 1.0f) {
            bVarL.f1525d.g(gVar4, -1.0f);
            bVarL.f1525d.g(gVar3, 1.0f);
            bVarL.f1524b = -i3;
        } else {
            float f4 = 1.0f - f3;
            bVarL.f1525d.g(gVar, f4 * 1.0f);
            bVarL.f1525d.g(gVar2, f4 * (-1.0f));
            bVarL.f1525d.g(gVar3, (-1.0f) * f3);
            bVarL.f1525d.g(gVar4, 1.0f * f3);
            if (i2 > 0 || i3 > 0) {
                bVarL.f1524b = (i3 * f3) + ((-i2) * f4);
            }
        }
        if (i4 != 8) {
            bVarL.a(this, i4);
        }
        c(bVarL);
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(l.b r18) {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.c.c(l.b):void");
    }

    public final void d(g gVar, int i2) {
        int i3 = gVar.c;
        if (i3 == -1) {
            gVar.d(this, i2);
            for (int i4 = 0; i4 < this.f1530b + 1; i4++) {
                g gVar2 = ((g[]) this.f1539l.f254d)[i4];
            }
            return;
        }
        if (i3 == -1) {
            b bVarL = l();
            bVarL.f1523a = gVar;
            float f3 = i2;
            gVar.f1551e = f3;
            bVarL.f1524b = f3;
            bVarL.f1526e = true;
            c(bVarL);
            return;
        }
        b bVar = this.f1533f[i3];
        if (bVar.f1526e) {
            bVar.f1524b = i2;
            return;
        }
        if (bVar.f1525d.d() == 0) {
            bVar.f1526e = true;
            bVar.f1524b = i2;
            return;
        }
        b bVarL2 = l();
        if (i2 < 0) {
            bVarL2.f1524b = i2 * (-1);
            bVarL2.f1525d.g(gVar, 1.0f);
        } else {
            bVarL2.f1524b = i2;
            bVarL2.f1525d.g(gVar, -1.0f);
        }
        c(bVarL2);
    }

    public final void e(g gVar, g gVar2, int i2, int i3) {
        if (i3 == 8 && gVar2.f1552f && gVar.c == -1) {
            gVar.d(this, gVar2.f1551e + i2);
            return;
        }
        b bVarL = l();
        boolean z = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z = true;
            }
            bVarL.f1524b = i2;
        }
        if (z) {
            bVarL.f1525d.g(gVar, 1.0f);
            bVarL.f1525d.g(gVar2, -1.0f);
        } else {
            bVarL.f1525d.g(gVar, -1.0f);
            bVarL.f1525d.g(gVar2, 1.0f);
        }
        if (i3 != 8) {
            bVarL.a(this, i3);
        }
        c(bVarL);
    }

    public final void f(g gVar, g gVar2, int i2, int i3) {
        b bVarL = l();
        g gVarM = m();
        gVarM.f1550d = 0;
        bVarL.b(gVar, gVar2, gVarM, i2);
        if (i3 != 8) {
            bVarL.f1525d.g(j(i3), (int) (bVarL.f1525d.c(gVarM) * (-1.0f)));
        }
        c(bVarL);
    }

    public final void g(g gVar, g gVar2, int i2, int i3) {
        b bVarL = l();
        g gVarM = m();
        gVarM.f1550d = 0;
        bVarL.c(gVar, gVar2, gVarM, i2);
        if (i3 != 8) {
            bVarL.f1525d.g(j(i3), (int) (bVarL.f1525d.c(gVarM) * (-1.0f)));
        }
        c(bVarL);
    }

    public final void h(b bVar) {
        int i2;
        if (bVar.f1526e) {
            bVar.f1523a.d(this, bVar.f1524b);
        } else {
            b[] bVarArr = this.f1533f;
            int i3 = this.f1537j;
            bVarArr[i3] = bVar;
            g gVar = bVar.f1523a;
            gVar.c = i3;
            this.f1537j = i3 + 1;
            gVar.e(this, bVar);
        }
        if (this.f1529a) {
            int i4 = 0;
            while (i4 < this.f1537j) {
                if (this.f1533f[i4] == null) {
                    System.out.println("WTF");
                }
                b bVar2 = this.f1533f[i4];
                if (bVar2 != null && bVar2.f1526e) {
                    bVar2.f1523a.d(this, bVar2.f1524b);
                    ((e0.b) this.f1539l.f253b).b(bVar2);
                    this.f1533f[i4] = null;
                    int i5 = i4 + 1;
                    int i6 = i5;
                    while (true) {
                        i2 = this.f1537j;
                        if (i5 >= i2) {
                            break;
                        }
                        b[] bVarArr2 = this.f1533f;
                        int i7 = i5 - 1;
                        b bVar3 = bVarArr2[i5];
                        bVarArr2[i7] = bVar3;
                        g gVar2 = bVar3.f1523a;
                        if (gVar2.c == i5) {
                            gVar2.c = i7;
                        }
                        i6 = i5;
                        i5++;
                    }
                    if (i6 < i2) {
                        this.f1533f[i6] = null;
                    }
                    this.f1537j = i2 - 1;
                    i4--;
                }
                i4++;
            }
            this.f1529a = false;
        }
    }

    public final void i() {
        for (int i2 = 0; i2 < this.f1537j; i2++) {
            b bVar = this.f1533f[i2];
            bVar.f1523a.f1551e = bVar.f1524b;
        }
    }

    public final g j(int i2) {
        if (this.f1536i + 1 >= this.f1532e) {
            o();
        }
        g gVarA = a(4);
        float[] fArr = gVarA.f1554h;
        int i3 = this.f1530b + 1;
        this.f1530b = i3;
        this.f1536i++;
        gVarA.f1549b = i3;
        gVarA.f1550d = i2;
        ((g[]) this.f1539l.f254d)[i3] = gVarA;
        e eVar = this.c;
        eVar.f1547i.f246b = gVarA;
        Arrays.fill(fArr, 0.0f);
        fArr[gVarA.f1550d] = 1.0f;
        eVar.j(gVarA);
        return gVarA;
    }

    public final g k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f1536i + 1 >= this.f1532e) {
            o();
        }
        if (!(obj instanceof n.d)) {
            return null;
        }
        n.d dVar = (n.d) obj;
        g gVar = dVar.f1628i;
        if (gVar == null) {
            dVar.k();
            gVar = dVar.f1628i;
        }
        int i2 = gVar.f1549b;
        t tVar = this.f1539l;
        if (i2 != -1 && i2 <= this.f1530b && ((g[]) tVar.f254d)[i2] != null) {
            return gVar;
        }
        if (i2 != -1) {
            gVar.c();
        }
        int i3 = this.f1530b + 1;
        this.f1530b = i3;
        this.f1536i++;
        gVar.f1549b = i3;
        gVar.f1558l = 1;
        ((g[]) tVar.f254d)[i3] = gVar;
        return gVar;
    }

    public final b l() {
        Object obj;
        t tVar = this.f1539l;
        e0.b bVar = (e0.b) tVar.f253b;
        int i2 = bVar.f969b;
        if (i2 > 0) {
            int i3 = i2 - 1;
            Object[] objArr = bVar.f968a;
            obj = objArr[i3];
            objArr[i3] = null;
            bVar.f969b = i3;
        } else {
            obj = null;
        }
        b bVar2 = (b) obj;
        if (bVar2 == null) {
            return new b(tVar);
        }
        bVar2.f1523a = null;
        bVar2.f1525d.b();
        bVar2.f1524b = 0.0f;
        bVar2.f1526e = false;
        return bVar2;
    }

    public final g m() {
        if (this.f1536i + 1 >= this.f1532e) {
            o();
        }
        g gVarA = a(3);
        int i2 = this.f1530b + 1;
        this.f1530b = i2;
        this.f1536i++;
        gVarA.f1549b = i2;
        ((g[]) this.f1539l.f254d)[i2] = gVarA;
        return gVarA;
    }

    public final void o() {
        int i2 = this.f1531d * 2;
        this.f1531d = i2;
        this.f1533f = (b[]) Arrays.copyOf(this.f1533f, i2);
        t tVar = this.f1539l;
        tVar.f254d = (g[]) Arrays.copyOf((g[]) tVar.f254d, this.f1531d);
        int i3 = this.f1531d;
        this.f1535h = new boolean[i3];
        this.f1532e = i3;
        this.f1538k = i3;
    }

    public final void p() {
        e eVar = this.c;
        if (eVar.e()) {
            i();
            return;
        }
        if (!this.f1534g) {
            q(eVar);
            return;
        }
        for (int i2 = 0; i2 < this.f1537j; i2++) {
            if (!this.f1533f[i2].f1526e) {
                q(eVar);
                return;
            }
        }
        i();
    }

    public final void q(e eVar) {
        int i2 = 0;
        while (true) {
            if (i2 >= this.f1537j) {
                break;
            }
            b bVar = this.f1533f[i2];
            int i3 = 1;
            if (bVar.f1523a.f1558l != 1) {
                float f3 = 0.0f;
                if (bVar.f1524b < 0.0f) {
                    boolean z = false;
                    int i4 = 0;
                    while (!z) {
                        i4 += i3;
                        float f4 = Float.MAX_VALUE;
                        int i5 = -1;
                        int i6 = -1;
                        int i7 = 0;
                        int i8 = 0;
                        while (i7 < this.f1537j) {
                            b bVar2 = this.f1533f[i7];
                            if (bVar2.f1523a.f1558l != i3 && !bVar2.f1526e && bVar2.f1524b < f3) {
                                int iD = bVar2.f1525d.d();
                                int i9 = 0;
                                while (i9 < iD) {
                                    g gVarE = bVar2.f1525d.e(i9);
                                    float fC = bVar2.f1525d.c(gVarE);
                                    if (fC > f3) {
                                        for (int i10 = 0; i10 < 9; i10++) {
                                            float f5 = gVarE.f1553g[i10] / fC;
                                            if ((f5 < f4 && i10 == i8) || i10 > i8) {
                                                i8 = i10;
                                                i6 = gVarE.f1549b;
                                                i5 = i7;
                                                f4 = f5;
                                            }
                                        }
                                    }
                                    i9++;
                                    f3 = 0.0f;
                                }
                            }
                            i7++;
                            f3 = 0.0f;
                            i3 = 1;
                        }
                        if (i5 != -1) {
                            b bVar3 = this.f1533f[i5];
                            bVar3.f1523a.c = -1;
                            bVar3.g(((g[]) this.f1539l.f254d)[i6]);
                            g gVar = bVar3.f1523a;
                            gVar.c = i5;
                            gVar.e(this, bVar3);
                        } else {
                            z = true;
                        }
                        if (i4 > this.f1536i / 2) {
                            z = true;
                        }
                        f3 = 0.0f;
                        i3 = 1;
                    }
                }
            }
            i2++;
        }
        r(eVar);
        i();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0092 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(l.b r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = 0
            r3 = r2
        L6:
            int r4 = r0.f1536i
            if (r3 >= r4) goto L11
            boolean[] r4 = r0.f1535h
            r4[r3] = r2
            int r3 = r3 + 1
            goto L6
        L11:
            r3 = r2
            r4 = r3
        L13:
            if (r3 != 0) goto Lb0
            r5 = 1
            int r4 = r4 + r5
            int r6 = r0.f1536i
            int r6 = r6 * 2
            if (r4 < r6) goto L1f
            goto Lb0
        L1f:
            l.g r6 = r1.f1523a
            if (r6 == 0) goto L29
            boolean[] r7 = r0.f1535h
            int r6 = r6.f1549b
            r7[r6] = r5
        L29:
            boolean[] r6 = r0.f1535h
            l.g r6 = r1.d(r6)
            if (r6 == 0) goto L3d
            boolean[] r7 = r0.f1535h
            int r8 = r6.f1549b
            boolean r9 = r7[r8]
            if (r9 == 0) goto L3b
            goto Lb0
        L3b:
            r7[r8] = r5
        L3d:
            if (r6 == 0) goto Lac
            r7 = -1
            r8 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r9 = r2
            r10 = r7
        L45:
            int r11 = r0.f1537j
            if (r9 >= r11) goto L97
            l.b[] r11 = r0.f1533f
            r11 = r11[r9]
            l.g r12 = r11.f1523a
            int r12 = r12.f1558l
            if (r12 != r5) goto L54
            goto L92
        L54:
            boolean r12 = r11.f1526e
            if (r12 == 0) goto L59
            goto L92
        L59:
            l.a r12 = r11.f1525d
            int r13 = r12.f1520h
            r15 = -1
            if (r13 != r15) goto L61
            goto L7a
        L61:
            r2 = 0
        L62:
            if (r13 == r15) goto L7a
            int r5 = r12.f1514a
            if (r2 >= r5) goto L7a
            int[] r5 = r12.f1517e
            r5 = r5[r13]
            int r14 = r6.f1549b
            if (r5 != r14) goto L72
            r14 = 1
            goto L7b
        L72:
            int[] r5 = r12.f1518f
            r13 = r5[r13]
            int r2 = r2 + 1
            r5 = 1
            goto L62
        L7a:
            r14 = 0
        L7b:
            if (r14 == 0) goto L92
            l.a r2 = r11.f1525d
            float r2 = r2.c(r6)
            r5 = 0
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 >= 0) goto L92
            float r5 = r11.f1524b
            float r5 = -r5
            float r5 = r5 / r2
            int r2 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r2 >= 0) goto L92
            r8 = r5
            r10 = r9
        L92:
            int r9 = r9 + 1
            r2 = 0
            r5 = 1
            goto L45
        L97:
            if (r10 <= r7) goto Lad
            l.b[] r2 = r0.f1533f
            r2 = r2[r10]
            l.g r5 = r2.f1523a
            r5.c = r7
            r2.g(r6)
            l.g r5 = r2.f1523a
            r5.c = r10
            r5.e(r0, r2)
            goto Lad
        Lac:
            r3 = 1
        Lad:
            r2 = 0
            goto L13
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.c.r(l.b):void");
    }

    public final void s() {
        for (int i2 = 0; i2 < this.f1537j; i2++) {
            b bVar = this.f1533f[i2];
            if (bVar != null) {
                ((e0.b) this.f1539l.f253b).b(bVar);
            }
            this.f1533f[i2] = null;
        }
    }

    public final void t() {
        t tVar;
        int i2 = 0;
        while (true) {
            tVar = this.f1539l;
            g[] gVarArr = (g[]) tVar.f254d;
            if (i2 >= gVarArr.length) {
                break;
            }
            g gVar = gVarArr[i2];
            if (gVar != null) {
                gVar.c();
            }
            i2++;
        }
        e0.b bVar = (e0.b) tVar.c;
        g[] gVarArr2 = this.f1540m;
        int length = this.f1541n;
        bVar.getClass();
        if (length > gVarArr2.length) {
            length = gVarArr2.length;
        }
        for (int i3 = 0; i3 < length; i3++) {
            g gVar2 = gVarArr2[i3];
            int i4 = bVar.f969b;
            Object[] objArr = bVar.f968a;
            if (i4 < objArr.length) {
                objArr[i4] = gVar2;
                bVar.f969b = i4 + 1;
            }
        }
        this.f1541n = 0;
        Arrays.fill((g[]) tVar.f254d, (Object) null);
        this.f1530b = 0;
        e eVar = this.c;
        eVar.f1546h = 0;
        eVar.f1524b = 0.0f;
        this.f1536i = 1;
        for (int i5 = 0; i5 < this.f1537j; i5++) {
            b bVar2 = this.f1533f[i5];
        }
        s();
        this.f1537j = 0;
        this.f1542o = new b(tVar);
    }
}
