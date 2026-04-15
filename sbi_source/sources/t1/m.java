package t1;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class m extends e {
    @Override // t1.e
    public final void t(y yVar, float f3, float f4) {
        float f5 = f4 * f3;
        yVar.d(f5, 180.0f, 90.0f);
        float f6 = f5 * 2.0f;
        u uVar = new u(0.0f, 0.0f, f6, f6);
        uVar.f2270f = 180.0f;
        uVar.f2271g = 90.0f;
        yVar.f2280f.add(uVar);
        s sVar = new s(uVar);
        yVar.a(180.0f);
        yVar.f2281g.add(sVar);
        yVar.f2278d = 270.0f;
        float f7 = (0.0f + f6) * 0.5f;
        float f8 = (f6 - 0.0f) / 2.0f;
        double d3 = 270.0f;
        yVar.f2277b = (((float) Math.cos(Math.toRadians(d3))) * f8) + f7;
        yVar.c = (f8 * ((float) Math.sin(Math.toRadians(d3)))) + f7;
    }
}
