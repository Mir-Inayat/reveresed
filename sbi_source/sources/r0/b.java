package r0;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f2080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f2081b;

    public b(float[] fArr) {
        this.f2080a = fArr;
        this.f2081b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f3) {
        if (f3 >= 1.0f) {
            return 1.0f;
        }
        if (f3 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f2080a;
        int iMin = Math.min((int) ((fArr.length - 1) * f3), fArr.length - 2);
        float f4 = this.f2081b;
        float f5 = (f3 - (iMin * f4)) / f4;
        float f6 = fArr[iMin];
        return ((fArr[iMin + 1] - f6) * f5) + f6;
    }
}
