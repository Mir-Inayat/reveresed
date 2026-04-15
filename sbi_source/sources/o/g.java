package o;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class g extends f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1785m;

    public g(o oVar) {
        super(oVar);
        if (oVar instanceof k) {
            this.f1777e = 2;
        } else {
            this.f1777e = 3;
        }
    }

    @Override // o.f
    public final void d(int i2) {
        if (this.f1782j) {
            return;
        }
        this.f1782j = true;
        this.f1779g = i2;
        ArrayList arrayList = this.f1783k;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            d dVar = (d) obj;
            dVar.a(dVar);
        }
    }
}
