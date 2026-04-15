package t1;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class u extends w {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final RectF f2266h = new RectF();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f2267b;
    public final float c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f2268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f2269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f2270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f2271g;

    public u(float f3, float f4, float f5, float f6) {
        this.f2267b = f3;
        this.c = f4;
        this.f2268d = f5;
        this.f2269e = f6;
    }

    @Override // t1.w
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f2273a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f3 = this.f2268d;
        float f4 = this.f2269e;
        RectF rectF = f2266h;
        rectF.set(this.f2267b, this.c, f3, f4);
        path.arcTo(rectF, this.f2270f, this.f2271g, false);
        path.transform(matrix);
    }
}
