package w1;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class g extends t1.i {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final RectF f2526r;

    public g(t1.o oVar, RectF rectF) {
        super(oVar);
        this.f2526r = rectF;
    }

    @Override // t1.i, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        h hVar = new h(this);
        hVar.G = this;
        hVar.invalidateSelf();
        return hVar;
    }

    public g(g gVar) {
        super(gVar);
        this.f2526r = gVar.f2526r;
    }
}
