package f0;

import android.view.VelocityTracker;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public abstract class u {
    public static float a(VelocityTracker velocityTracker, int i2) {
        return velocityTracker.getAxisVelocity(i2);
    }

    public static float b(VelocityTracker velocityTracker, int i2, int i3) {
        return velocityTracker.getAxisVelocity(i2, i3);
    }

    public static boolean c(VelocityTracker velocityTracker, int i2) {
        return velocityTracker.isAxisSupported(i2);
    }
}
