package v0;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SparseArray f2330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2331b;

    public final g0 a(int i2) {
        SparseArray sparseArray = this.f2330a;
        g0 g0Var = (g0) sparseArray.get(i2);
        if (g0Var != null) {
            return g0Var;
        }
        g0 g0Var2 = new g0();
        sparseArray.put(i2, g0Var2);
        return g0Var2;
    }
}
