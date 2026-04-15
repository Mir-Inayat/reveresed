package androidx.emoji2.text;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b0 f268b;

    public x(int i2) {
        this.f267a = new SparseArray(i2);
    }

    public final void a(b0 b0Var, int i2, int i3) {
        int iA = b0Var.a(i2);
        SparseArray sparseArray = this.f267a;
        x xVar = sparseArray == null ? null : (x) sparseArray.get(iA);
        if (xVar == null) {
            xVar = new x(1);
            sparseArray.put(b0Var.a(i2), xVar);
        }
        if (i3 > i2) {
            xVar.a(b0Var, i2 + 1, i3);
        } else {
            xVar.f268b = b0Var;
        }
    }
}
