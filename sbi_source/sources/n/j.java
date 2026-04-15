package n;

import java.util.ArrayList;
import o.n;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public abstract class j extends e {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public e[] f1710p0 = new e[4];

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f1711q0 = 0;

    public final void M(int i2, ArrayList arrayList, n nVar) {
        for (int i3 = 0; i3 < this.f1711q0; i3++) {
            e eVar = this.f1710p0[i3];
            ArrayList arrayList2 = nVar.f1793a;
            if (!arrayList2.contains(eVar)) {
                arrayList2.add(eVar);
            }
        }
        for (int i4 = 0; i4 < this.f1711q0; i4++) {
            o.h.b(this.f1710p0[i4], i2, arrayList, nVar);
        }
    }

    public void N() {
    }
}
