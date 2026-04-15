package t1;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class v extends w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f2272b;
    public float c;

    @Override // t1.w
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f2273a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f2272b, this.c);
        path.transform(matrix);
    }
}
