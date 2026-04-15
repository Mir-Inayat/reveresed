package t1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class s extends x {
    public final u c;

    public s(u uVar) {
        this.c = uVar;
    }

    @Override // t1.x
    public final void a(Matrix matrix, s1.a aVar, int i2, Canvas canvas) {
        float f3;
        u uVar = this.c;
        float f4 = uVar.f2270f;
        float f5 = uVar.f2271g;
        RectF rectF = new RectF(uVar.f2267b, uVar.c, uVar.f2268d, uVar.f2269e);
        Paint paint = aVar.f2110b;
        boolean z = f5 < 0.0f;
        Path path = aVar.f2114g;
        int[] iArr = s1.a.f2107k;
        if (z) {
            iArr[0] = 0;
            iArr[1] = aVar.f2113f;
            iArr[2] = aVar.f2112e;
            iArr[3] = aVar.f2111d;
            f3 = 0.0f;
        } else {
            path.rewind();
            f3 = 0.0f;
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f4, f5);
            path.close();
            float f6 = -i2;
            rectF.inset(f6, f6);
            iArr[0] = 0;
            iArr[1] = aVar.f2111d;
            iArr[2] = aVar.f2112e;
            iArr[3] = aVar.f2113f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= f3) {
            return;
        }
        float f7 = 1.0f - (i2 / fWidth);
        float[] fArr = s1.a.f2108l;
        fArr[1] = f7;
        fArr[2] = ((1.0f - f7) / 2.0f) + f7;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, aVar.f2115h);
        }
        canvas.drawArc(rectF, f4, f5, true, paint);
        canvas.restore();
    }
}
