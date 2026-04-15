package f0;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public abstract class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f1312b;
    public final Interpolator c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f1313d;

    public z0(int i2, Interpolator interpolator, long j2) {
        this.f1311a = i2;
        this.c = interpolator;
        this.f1313d = j2;
    }

    public long a() {
        return this.f1313d;
    }

    public float b() {
        Interpolator interpolator = this.c;
        return interpolator != null ? interpolator.getInterpolation(this.f1312b) : this.f1312b;
    }

    public int c() {
        return this.f1311a;
    }

    public void d(float f3) {
        this.f1312b = f3;
    }
}
