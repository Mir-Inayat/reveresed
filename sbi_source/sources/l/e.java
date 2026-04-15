package l;

import androidx.emoji2.text.q;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class e extends b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g[] f1544f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g[] f1545g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1546h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public q f1547i;

    @Override // l.b
    public final g d(boolean[] zArr) {
        int i2 = -1;
        for (int i3 = 0; i3 < this.f1546h; i3++) {
            g[] gVarArr = this.f1544f;
            g gVar = gVarArr[i3];
            if (!zArr[gVar.f1549b]) {
                q qVar = this.f1547i;
                qVar.f246b = gVar;
                int i4 = 8;
                if (i2 == -1) {
                    while (i4 >= 0) {
                        float f3 = ((g) qVar.f246b).f1554h[i4];
                        if (f3 <= 0.0f) {
                            if (f3 < 0.0f) {
                                i2 = i3;
                                break;
                            }
                            i4--;
                        }
                    }
                } else {
                    g gVar2 = gVarArr[i2];
                    while (true) {
                        if (i4 >= 0) {
                            float f4 = gVar2.f1554h[i4];
                            float f5 = ((g) qVar.f246b).f1554h[i4];
                            if (f5 == f4) {
                                i4--;
                            } else if (f5 < f4) {
                            }
                        }
                    }
                }
            }
        }
        if (i2 == -1) {
            return null;
        }
        return this.f1544f[i2];
    }

    @Override // l.b
    public final boolean e() {
        return this.f1546h == 0;
    }

    @Override // l.b
    public final void i(c cVar, b bVar, boolean z) {
        g gVar = bVar.f1523a;
        if (gVar == null) {
            return;
        }
        float[] fArr = gVar.f1554h;
        a aVar = bVar.f1525d;
        int iD = aVar.d();
        for (int i2 = 0; i2 < iD; i2++) {
            g gVarE = aVar.e(i2);
            float f3 = aVar.f(i2);
            q qVar = this.f1547i;
            qVar.f246b = gVarE;
            if (gVarE.f1548a) {
                boolean z2 = true;
                for (int i3 = 0; i3 < 9; i3++) {
                    float[] fArr2 = ((g) qVar.f246b).f1554h;
                    float f4 = (fArr[i3] * f3) + fArr2[i3];
                    fArr2[i3] = f4;
                    if (Math.abs(f4) < 1.0E-4f) {
                        ((g) qVar.f246b).f1554h[i3] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    ((e) qVar.c).k((g) qVar.f246b);
                }
            } else {
                for (int i4 = 0; i4 < 9; i4++) {
                    float f5 = fArr[i4];
                    if (f5 != 0.0f) {
                        float f6 = f5 * f3;
                        if (Math.abs(f6) < 1.0E-4f) {
                            f6 = 0.0f;
                        }
                        ((g) qVar.f246b).f1554h[i4] = f6;
                    } else {
                        ((g) qVar.f246b).f1554h[i4] = 0.0f;
                    }
                }
                j(gVarE);
            }
            this.f1524b = (bVar.f1524b * f3) + this.f1524b;
        }
        k(gVar);
    }

    public final void j(g gVar) {
        int i2;
        int i3 = this.f1546h + 1;
        g[] gVarArr = this.f1544f;
        if (i3 > gVarArr.length) {
            g[] gVarArr2 = (g[]) Arrays.copyOf(gVarArr, gVarArr.length * 2);
            this.f1544f = gVarArr2;
            this.f1545g = (g[]) Arrays.copyOf(gVarArr2, gVarArr2.length * 2);
        }
        g[] gVarArr3 = this.f1544f;
        int i4 = this.f1546h;
        gVarArr3[i4] = gVar;
        int i5 = i4 + 1;
        this.f1546h = i5;
        if (i5 > 1 && gVarArr3[i4].f1549b > gVar.f1549b) {
            int i6 = 0;
            while (true) {
                i2 = this.f1546h;
                if (i6 >= i2) {
                    break;
                }
                this.f1545g[i6] = this.f1544f[i6];
                i6++;
            }
            Arrays.sort(this.f1545g, 0, i2, new d(0));
            for (int i7 = 0; i7 < this.f1546h; i7++) {
                this.f1544f[i7] = this.f1545g[i7];
            }
        }
        gVar.f1548a = true;
        gVar.a(this);
    }

    public final void k(g gVar) {
        int i2 = 0;
        while (i2 < this.f1546h) {
            if (this.f1544f[i2] == gVar) {
                while (true) {
                    int i3 = this.f1546h;
                    if (i2 >= i3 - 1) {
                        this.f1546h = i3 - 1;
                        gVar.f1548a = false;
                        return;
                    } else {
                        g[] gVarArr = this.f1544f;
                        int i4 = i2 + 1;
                        gVarArr[i2] = gVarArr[i4];
                        i2 = i4;
                    }
                }
            } else {
                i2++;
            }
        }
    }

    @Override // l.b
    public final String toString() {
        q qVar = this.f1547i;
        String str = " goal -> (" + this.f1524b + ") : ";
        for (int i2 = 0; i2 < this.f1546h; i2++) {
            qVar.f246b = this.f1544f[i2];
            str = str + qVar + " ";
        }
        return str;
    }
}
