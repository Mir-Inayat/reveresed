package q1;

import android.graphics.Typeface;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class b extends w.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a0.a f2056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f2057f;

    public b(d dVar, a0.a aVar) {
        this.f2057f = dVar;
        this.f2056e = aVar;
    }

    @Override // w.b
    public final void d(int i2) {
        this.f2057f.f2073n = true;
        this.f2056e.O(i2);
    }

    @Override // w.b
    public final void e(Typeface typeface) {
        d dVar = this.f2057f;
        dVar.f2075p = Typeface.create(typeface, dVar.f2063d);
        dVar.f2073n = true;
        this.f2056e.P(dVar.f2075p, false);
    }
}
