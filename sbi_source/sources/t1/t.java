package t1;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class t extends x {
    public final v c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f2264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f2265e;

    public t(v vVar, float f3, float f4) {
        this.c = vVar;
        this.f2264d = f3;
        this.f2265e = f4;
    }

    @Override // t1.x
    public final void a(Matrix matrix, s1.a aVar, int i2, Canvas canvas) {
        v vVar = this.c;
        float f3 = vVar.c;
        float f4 = this.f2265e;
        float f5 = vVar.f2272b;
        float f6 = this.f2264d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f3 - f4, f5 - f6), 0.0f);
        Matrix matrix2 = this.f2275a;
        matrix2.set(matrix);
        matrix2.preTranslate(f6, f4);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i2;
        rectF.offset(0.0f, -i2);
        int i3 = aVar.f2113f;
        int[] iArr = s1.a.f2105i;
        iArr[0] = i3;
        iArr[1] = aVar.f2112e;
        iArr[2] = aVar.f2111d;
        Paint paint = aVar.c;
        float f7 = rectF.left;
        paint.setShader(new LinearGradient(f7, rectF.top, f7, rectF.bottom, iArr, s1.a.f2106j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        v vVar = this.c;
        return (float) Math.toDegrees(Math.atan((vVar.c - this.f2265e) / (vVar.f2272b - this.f2264d)));
    }
}
