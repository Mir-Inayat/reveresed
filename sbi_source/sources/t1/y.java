package t1;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f2276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f2277b;
    public float c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f2278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f2279e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f2280f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f2281g = new ArrayList();

    public y() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f3) {
        float f4 = this.f2278d;
        if (f4 == f3) {
            return;
        }
        float f5 = ((f3 - f4) + 360.0f) % 360.0f;
        if (f5 > 180.0f) {
            return;
        }
        float f6 = this.f2277b;
        float f7 = this.c;
        u uVar = new u(f6, f7, f6, f7);
        uVar.f2270f = this.f2278d;
        uVar.f2271g = f5;
        this.f2281g.add(new s(uVar));
        this.f2278d = f3;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f2280f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((w) arrayList.get(i2)).a(matrix, path);
        }
    }

    public final void c(float f3, float f4) {
        v vVar = new v();
        vVar.f2272b = f3;
        vVar.c = f4;
        this.f2280f.add(vVar);
        t tVar = new t(vVar, this.f2277b, this.c);
        float fB = tVar.b() + 270.0f;
        float fB2 = tVar.b() + 270.0f;
        a(fB);
        this.f2281g.add(tVar);
        this.f2278d = fB2;
        this.f2277b = f3;
        this.c = f4;
    }

    public final void d(float f3, float f4, float f5) {
        this.f2276a = f3;
        this.f2277b = 0.0f;
        this.c = f3;
        this.f2278d = f4;
        this.f2279e = (f4 + f5) % 360.0f;
        this.f2280f.clear();
        this.f2281g.clear();
    }
}
