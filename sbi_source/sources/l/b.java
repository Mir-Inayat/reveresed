package l;

import androidx.emoji2.text.t;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f1525d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f1523a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f1524b = 0.0f;
    public final ArrayList c = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1526e = false;

    public b(t tVar) {
        this.f1525d = new a(this, tVar);
    }

    public final void a(c cVar, int i2) {
        this.f1525d.g(cVar.j(i2), 1.0f);
        this.f1525d.g(cVar.j(i2), -1.0f);
    }

    public final void b(g gVar, g gVar2, g gVar3, int i2) {
        boolean z = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z = true;
            }
            this.f1524b = i2;
        }
        if (z) {
            this.f1525d.g(gVar, 1.0f);
            this.f1525d.g(gVar2, -1.0f);
            this.f1525d.g(gVar3, -1.0f);
        } else {
            this.f1525d.g(gVar, -1.0f);
            this.f1525d.g(gVar2, 1.0f);
            this.f1525d.g(gVar3, 1.0f);
        }
    }

    public final void c(g gVar, g gVar2, g gVar3, int i2) {
        boolean z = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z = true;
            }
            this.f1524b = i2;
        }
        if (z) {
            this.f1525d.g(gVar, 1.0f);
            this.f1525d.g(gVar2, -1.0f);
            this.f1525d.g(gVar3, 1.0f);
        } else {
            this.f1525d.g(gVar, -1.0f);
            this.f1525d.g(gVar2, 1.0f);
            this.f1525d.g(gVar3, -1.0f);
        }
    }

    public g d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.f1523a == null && this.f1524b == 0.0f && this.f1525d.d() == 0;
    }

    public final g f(boolean[] zArr, g gVar) {
        int i2;
        int iD = this.f1525d.d();
        g gVar2 = null;
        float f3 = 0.0f;
        for (int i3 = 0; i3 < iD; i3++) {
            float f4 = this.f1525d.f(i3);
            if (f4 < 0.0f) {
                g gVarE = this.f1525d.e(i3);
                if ((zArr == null || !zArr[gVarE.f1549b]) && gVarE != gVar && (((i2 = gVarE.f1558l) == 3 || i2 == 4) && f4 < f3)) {
                    f3 = f4;
                    gVar2 = gVarE;
                }
            }
        }
        return gVar2;
    }

    public final void g(g gVar) {
        g gVar2 = this.f1523a;
        if (gVar2 != null) {
            this.f1525d.g(gVar2, -1.0f);
            this.f1523a.c = -1;
            this.f1523a = null;
        }
        float fH = this.f1525d.h(gVar, true) * (-1.0f);
        this.f1523a = gVar;
        if (fH == 1.0f) {
            return;
        }
        this.f1524b /= fH;
        a aVar = this.f1525d;
        int i2 = aVar.f1520h;
        for (int i3 = 0; i2 != -1 && i3 < aVar.f1514a; i3++) {
            float[] fArr = aVar.f1519g;
            fArr[i2] = fArr[i2] / fH;
            i2 = aVar.f1518f[i2];
        }
    }

    public final void h(c cVar, g gVar, boolean z) {
        if (gVar.f1552f) {
            float fC = this.f1525d.c(gVar);
            this.f1524b = (gVar.f1551e * fC) + this.f1524b;
            this.f1525d.h(gVar, z);
            if (z) {
                gVar.b(this);
            }
            if (this.f1525d.d() == 0) {
                this.f1526e = true;
                cVar.f1529a = true;
            }
        }
    }

    public void i(c cVar, b bVar, boolean z) {
        a aVar = this.f1525d;
        aVar.getClass();
        float fC = aVar.c(bVar.f1523a);
        aVar.h(bVar.f1523a, z);
        a aVar2 = bVar.f1525d;
        int iD = aVar2.d();
        for (int i2 = 0; i2 < iD; i2++) {
            g gVarE = aVar2.e(i2);
            aVar.a(gVarE, aVar2.c(gVarE) * fC, z);
        }
        this.f1524b = (bVar.f1524b * fC) + this.f1524b;
        if (z) {
            bVar.f1523a.b(this);
        }
        if (this.f1523a == null || this.f1525d.d() != 0) {
            return;
        }
        this.f1526e = true;
        cVar.f1529a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.b.toString():java.lang.String");
    }
}
