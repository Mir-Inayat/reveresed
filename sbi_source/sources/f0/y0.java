package f0;

import android.view.WindowInsetsAnimation;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends z0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WindowInsetsAnimation f1309e;

    public y0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f1309e = windowInsetsAnimation;
    }

    @Override // f0.z0
    public final long a() {
        return this.f1309e.getDurationMillis();
    }

    @Override // f0.z0
    public final float b() {
        return this.f1309e.getInterpolatedFraction();
    }

    @Override // f0.z0
    public final int c() {
        return this.f1309e.getTypeMask();
    }

    @Override // f0.z0
    public final void d(float f3) {
        this.f1309e.setFraction(f3);
    }
}
