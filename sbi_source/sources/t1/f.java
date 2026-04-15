package t1;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class f extends e {
    @Override // t1.e
    public final void t(y yVar, float f3, float f4) {
        float f5 = f4 * f3;
        yVar.d(f5, 180.0f, 90.0f);
        double d3 = f5;
        yVar.c((float) (Math.sin(Math.toRadians(90.0f)) * d3), (float) (Math.sin(Math.toRadians(0.0f)) * d3));
    }
}
