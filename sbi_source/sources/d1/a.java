package d1;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f832a = new LinearInterpolator();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r0.a f833b = new r0.a(r0.a.f2078d);
    public static final r0.a c = new r0.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r0.a f834d = new r0.a(r0.a.f2079e);

    static {
        new DecelerateInterpolator();
    }

    public static float a(float f3, float f4, float f5) {
        return ((f4 - f3) * f5) + f3;
    }

    public static float b(float f3, float f4, float f5, float f6, float f7) {
        return f7 <= f5 ? f3 : f7 >= f6 ? f4 : a(f3, f4, (f7 - f5) / (f6 - f5));
    }

    public static int c(int i2, int i3, float f3) {
        return Math.round(f3 * (i3 - i2)) + i2;
    }
}
