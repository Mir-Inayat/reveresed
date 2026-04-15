package l;

import androidx.emoji2.text.t;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f1515b;
    public final t c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1514a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1516d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f1517e = new int[8];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f1518f = new int[8];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f1519g = new float[8];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1520h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1521i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1522j = false;

    public a(b bVar, t tVar) {
        this.f1515b = bVar;
        this.c = tVar;
    }

    public final void a(g gVar, float f3, boolean z) {
        if (f3 <= -0.001f || f3 >= 0.001f) {
            int i2 = this.f1520h;
            b bVar = this.f1515b;
            if (i2 == -1) {
                this.f1520h = 0;
                this.f1519g[0] = f3;
                this.f1517e[0] = gVar.f1549b;
                this.f1518f[0] = -1;
                gVar.f1557k++;
                gVar.a(bVar);
                this.f1514a++;
                if (this.f1522j) {
                    return;
                }
                int i3 = this.f1521i + 1;
                this.f1521i = i3;
                int[] iArr = this.f1517e;
                if (i3 >= iArr.length) {
                    this.f1522j = true;
                    this.f1521i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i4 = -1;
            for (int i5 = 0; i2 != -1 && i5 < this.f1514a; i5++) {
                int i6 = this.f1517e[i2];
                int i7 = gVar.f1549b;
                if (i6 == i7) {
                    float[] fArr = this.f1519g;
                    float f4 = fArr[i2] + f3;
                    if (f4 > -0.001f && f4 < 0.001f) {
                        f4 = 0.0f;
                    }
                    fArr[i2] = f4;
                    if (f4 == 0.0f) {
                        if (i2 == this.f1520h) {
                            this.f1520h = this.f1518f[i2];
                        } else {
                            int[] iArr2 = this.f1518f;
                            iArr2[i4] = iArr2[i2];
                        }
                        if (z) {
                            gVar.b(bVar);
                        }
                        if (this.f1522j) {
                            this.f1521i = i2;
                        }
                        gVar.f1557k--;
                        this.f1514a--;
                        return;
                    }
                    return;
                }
                if (i6 < i7) {
                    i4 = i2;
                }
                i2 = this.f1518f[i2];
            }
            int length = this.f1521i;
            int i8 = length + 1;
            if (this.f1522j) {
                int[] iArr3 = this.f1517e;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i8;
            }
            int[] iArr4 = this.f1517e;
            if (length >= iArr4.length && this.f1514a < iArr4.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr5 = this.f1517e;
                    if (i9 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i9] == -1) {
                        length = i9;
                        break;
                    }
                    i9++;
                }
            }
            int[] iArr6 = this.f1517e;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i10 = this.f1516d * 2;
                this.f1516d = i10;
                this.f1522j = false;
                this.f1521i = length - 1;
                this.f1519g = Arrays.copyOf(this.f1519g, i10);
                this.f1517e = Arrays.copyOf(this.f1517e, this.f1516d);
                this.f1518f = Arrays.copyOf(this.f1518f, this.f1516d);
            }
            this.f1517e[length] = gVar.f1549b;
            this.f1519g[length] = f3;
            if (i4 != -1) {
                int[] iArr7 = this.f1518f;
                iArr7[length] = iArr7[i4];
                iArr7[i4] = length;
            } else {
                this.f1518f[length] = this.f1520h;
                this.f1520h = length;
            }
            gVar.f1557k++;
            gVar.a(bVar);
            this.f1514a++;
            if (!this.f1522j) {
                this.f1521i++;
            }
            int i11 = this.f1521i;
            int[] iArr8 = this.f1517e;
            if (i11 >= iArr8.length) {
                this.f1522j = true;
                this.f1521i = iArr8.length - 1;
            }
        }
    }

    public final void b() {
        int i2 = this.f1520h;
        for (int i3 = 0; i2 != -1 && i3 < this.f1514a; i3++) {
            g gVar = ((g[]) this.c.f254d)[this.f1517e[i2]];
            if (gVar != null) {
                gVar.b(this.f1515b);
            }
            i2 = this.f1518f[i2];
        }
        this.f1520h = -1;
        this.f1521i = -1;
        this.f1522j = false;
        this.f1514a = 0;
    }

    public final float c(g gVar) {
        int i2 = this.f1520h;
        for (int i3 = 0; i2 != -1 && i3 < this.f1514a; i3++) {
            if (this.f1517e[i2] == gVar.f1549b) {
                return this.f1519g[i2];
            }
            i2 = this.f1518f[i2];
        }
        return 0.0f;
    }

    public final int d() {
        return this.f1514a;
    }

    public final g e(int i2) {
        int i3 = this.f1520h;
        for (int i4 = 0; i3 != -1 && i4 < this.f1514a; i4++) {
            if (i4 == i2) {
                return ((g[]) this.c.f254d)[this.f1517e[i3]];
            }
            i3 = this.f1518f[i3];
        }
        return null;
    }

    public final float f(int i2) {
        int i3 = this.f1520h;
        for (int i4 = 0; i3 != -1 && i4 < this.f1514a; i4++) {
            if (i4 == i2) {
                return this.f1519g[i3];
            }
            i3 = this.f1518f[i3];
        }
        return 0.0f;
    }

    public final void g(g gVar, float f3) {
        if (f3 == 0.0f) {
            h(gVar, true);
            return;
        }
        int i2 = this.f1520h;
        b bVar = this.f1515b;
        if (i2 == -1) {
            this.f1520h = 0;
            this.f1519g[0] = f3;
            this.f1517e[0] = gVar.f1549b;
            this.f1518f[0] = -1;
            gVar.f1557k++;
            gVar.a(bVar);
            this.f1514a++;
            if (this.f1522j) {
                return;
            }
            int i3 = this.f1521i + 1;
            this.f1521i = i3;
            int[] iArr = this.f1517e;
            if (i3 >= iArr.length) {
                this.f1522j = true;
                this.f1521i = iArr.length - 1;
                return;
            }
            return;
        }
        int i4 = -1;
        for (int i5 = 0; i2 != -1 && i5 < this.f1514a; i5++) {
            int i6 = this.f1517e[i2];
            int i7 = gVar.f1549b;
            if (i6 == i7) {
                this.f1519g[i2] = f3;
                return;
            }
            if (i6 < i7) {
                i4 = i2;
            }
            i2 = this.f1518f[i2];
        }
        int length = this.f1521i;
        int i8 = length + 1;
        if (this.f1522j) {
            int[] iArr2 = this.f1517e;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i8;
        }
        int[] iArr3 = this.f1517e;
        if (length >= iArr3.length && this.f1514a < iArr3.length) {
            int i9 = 0;
            while (true) {
                int[] iArr4 = this.f1517e;
                if (i9 >= iArr4.length) {
                    break;
                }
                if (iArr4[i9] == -1) {
                    length = i9;
                    break;
                }
                i9++;
            }
        }
        int[] iArr5 = this.f1517e;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i10 = this.f1516d * 2;
            this.f1516d = i10;
            this.f1522j = false;
            this.f1521i = length - 1;
            this.f1519g = Arrays.copyOf(this.f1519g, i10);
            this.f1517e = Arrays.copyOf(this.f1517e, this.f1516d);
            this.f1518f = Arrays.copyOf(this.f1518f, this.f1516d);
        }
        this.f1517e[length] = gVar.f1549b;
        this.f1519g[length] = f3;
        if (i4 != -1) {
            int[] iArr6 = this.f1518f;
            iArr6[length] = iArr6[i4];
            iArr6[i4] = length;
        } else {
            this.f1518f[length] = this.f1520h;
            this.f1520h = length;
        }
        gVar.f1557k++;
        gVar.a(bVar);
        int i11 = this.f1514a + 1;
        this.f1514a = i11;
        if (!this.f1522j) {
            this.f1521i++;
        }
        int[] iArr7 = this.f1517e;
        if (i11 >= iArr7.length) {
            this.f1522j = true;
        }
        if (this.f1521i >= iArr7.length) {
            this.f1522j = true;
            this.f1521i = iArr7.length - 1;
        }
    }

    public final float h(g gVar, boolean z) {
        int i2 = this.f1520h;
        if (i2 == -1) {
            return 0.0f;
        }
        int i3 = 0;
        int i4 = -1;
        while (i2 != -1 && i3 < this.f1514a) {
            if (this.f1517e[i2] == gVar.f1549b) {
                if (i2 == this.f1520h) {
                    this.f1520h = this.f1518f[i2];
                } else {
                    int[] iArr = this.f1518f;
                    iArr[i4] = iArr[i2];
                }
                if (z) {
                    gVar.b(this.f1515b);
                }
                gVar.f1557k--;
                this.f1514a--;
                this.f1517e[i2] = -1;
                if (this.f1522j) {
                    this.f1521i = i2;
                }
                return this.f1519g[i2];
            }
            i3++;
            i4 = i2;
            i2 = this.f1518f[i2];
        }
        return 0.0f;
    }

    public final String toString() {
        int i2 = this.f1520h;
        String str = "";
        for (int i3 = 0; i2 != -1 && i3 < this.f1514a; i3++) {
            str = ((str + " -> ") + this.f1519g[i2] + " : ") + ((g[]) this.c.f254d)[this.f1517e[i2]];
            i2 = this.f1518f[i2];
        }
        return str;
    }
}
