package w1;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class h extends t1.k {
    public static final /* synthetic */ int H = 0;
    public g G;

    @Override // t1.k
    public final void f(Canvas canvas) {
        if (this.G.f2526r.isEmpty()) {
            super.f(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.G.f2526r);
        } else {
            canvas.clipRect(this.G.f2526r, Region.Op.DIFFERENCE);
        }
        super.f(canvas);
        canvas.restore();
    }

    @Override // t1.k, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.G = new g(this.G);
        return this;
    }

    public final void t(float f3, float f4, float f5, float f6) {
        RectF rectF = this.G.f2526r;
        if (f3 == rectF.left && f4 == rectF.top && f5 == rectF.right && f6 == rectF.bottom) {
            return;
        }
        rectF.set(f3, f4, f5, f6);
        invalidateSelf();
    }
}
