package t1;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y[] f2252a = new y[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix[] f2253b = new Matrix[4];
    public final Matrix[] c = new Matrix[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PointF f2254d = new PointF();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Path f2255e = new Path();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Path f2256f = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y f2257g = new y();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f2258h = new float[2];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f2259i = new float[2];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Path f2260j = new Path();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Path f2261k = new Path();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f2262l = true;

    public q() {
        for (int i2 = 0; i2 < 4; i2++) {
            this.f2252a[i2] = new y();
            this.f2253b[i2] = new Matrix();
            this.c[i2] = new Matrix();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(o oVar, float[] fArr, float f3, RectF rectF, h hVar, Path path) {
        Matrix[] matrixArr;
        float[] fArr2;
        int i2;
        y[] yVarArr;
        Matrix[] matrixArr2;
        char c;
        float f4;
        char c3;
        int i3;
        path.rewind();
        Path path2 = this.f2255e;
        path2.rewind();
        Path path3 = this.f2256f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i4 = 0;
        while (true) {
            matrixArr = this.c;
            fArr2 = this.f2258h;
            yVarArr = this.f2252a;
            matrixArr2 = this.f2253b;
            c = 0;
            if (i4 >= 4) {
                break;
            }
            d cVar = fArr == null ? i4 != 1 ? i4 != 2 ? i4 != 3 ? oVar.f2244f : oVar.f2243e : oVar.f2246h : oVar.f2245g : new c(fArr[i4]);
            e eVar = i4 != 1 ? i4 != 2 ? i4 != 3 ? oVar.f2241b : oVar.f2240a : oVar.f2242d : oVar.c;
            y yVar = yVarArr[i4];
            eVar.getClass();
            eVar.t(yVar, f3, cVar.a(rectF));
            int i5 = i4 + 1;
            float f5 = (i5 % 4) * 90;
            matrixArr2[i4].reset();
            PointF pointF = this.f2254d;
            if (i4 == 1) {
                i3 = i4;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i4 == 2) {
                i3 = i4;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i4 != 3) {
                i3 = i4;
                pointF.set(rectF.right, rectF.top);
            } else {
                i3 = i4;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i3].setTranslate(pointF.x, pointF.y);
            matrixArr2[i3].preRotate(f5);
            y yVar2 = yVarArr[i3];
            fArr2[0] = yVar2.f2277b;
            fArr2[1] = yVar2.c;
            matrixArr2[i3].mapPoints(fArr2);
            matrixArr[i3].reset();
            matrixArr[i3].setTranslate(fArr2[0], fArr2[1]);
            matrixArr[i3].preRotate(f5);
            i4 = i5;
        }
        int i6 = 0;
        for (i2 = 4; i6 < i2; i2 = 4) {
            y yVar3 = yVarArr[i6];
            yVar3.getClass();
            fArr2[c] = 0.0f;
            fArr2[1] = yVar3.f2276a;
            matrixArr2[i6].mapPoints(fArr2);
            if (i6 == 0) {
                path.moveTo(fArr2[c], fArr2[1]);
            } else {
                path.lineTo(fArr2[c], fArr2[1]);
            }
            yVarArr[i6].b(matrixArr2[i6], path);
            if (hVar != null) {
                y yVar4 = yVarArr[i6];
                Matrix matrix = matrixArr2[i6];
                k kVar = hVar.f2186a;
                f4 = 0.0f;
                BitSet bitSet = kVar.f2207e;
                yVar4.getClass();
                bitSet.set(i6, (boolean) c);
                x[] xVarArr = kVar.c;
                yVar4.a(yVar4.f2279e);
                xVarArr[i6] = new r(new ArrayList(yVar4.f2281g), new Matrix(matrix));
            } else {
                f4 = 0.0f;
            }
            int i7 = i6 + 1;
            int i8 = i7 % 4;
            y yVar5 = yVarArr[i6];
            fArr2[0] = yVar5.f2277b;
            fArr2[1] = yVar5.c;
            matrixArr2[i6].mapPoints(fArr2);
            y yVar6 = yVarArr[i8];
            yVar6.getClass();
            float[] fArr3 = this.f2259i;
            fArr3[0] = f4;
            fArr3[1] = yVar6.f2276a;
            matrixArr2[i8].mapPoints(fArr3);
            Matrix[] matrixArr3 = matrixArr;
            y[] yVarArr2 = yVarArr;
            float fMax = Math.max(((float) Math.hypot(fArr2[0] - fArr3[0], fArr2[1] - fArr3[1])) - 0.001f, f4);
            y yVar7 = yVarArr2[i6];
            fArr2[0] = yVar7.f2277b;
            fArr2[1] = yVar7.c;
            matrixArr2[i6].mapPoints(fArr2);
            if (i6 == 1 || i6 == 3) {
                Math.abs(rectF.centerX() - fArr2[0]);
            } else {
                Math.abs(rectF.centerY() - fArr2[1]);
            }
            y yVar8 = this.f2257g;
            yVar8.d(0.0f, 270.0f, 0.0f);
            (i6 != 1 ? i6 != 2 ? i6 != 3 ? oVar.f2248j : oVar.f2247i : oVar.f2250l : oVar.f2249k).getClass();
            yVar8.c(fMax, 0.0f);
            Path path4 = this.f2260j;
            path4.reset();
            yVar8.b(matrixArr3[i6], path4);
            if (this.f2262l && (b(path4, i6) || b(path4, i8))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr2[0] = 0.0f;
                fArr2[1] = yVar8.f2276a;
                matrixArr3[i6].mapPoints(fArr2);
                path2.moveTo(fArr2[0], fArr2[1]);
                yVar8.b(matrixArr3[i6], path2);
            } else {
                yVar8.b(matrixArr3[i6], path);
            }
            if (hVar != null) {
                Matrix matrix2 = matrixArr3[i6];
                k kVar2 = hVar.f2186a;
                c3 = 0;
                kVar2.f2207e.set(i6 + 4, false);
                x[] xVarArr2 = kVar2.f2206d;
                yVar8.a(yVar8.f2279e);
                xVarArr2[i6] = new r(new ArrayList(yVar8.f2281g), new Matrix(matrix2));
            } else {
                c3 = 0;
            }
            matrixArr = matrixArr3;
            i6 = i7;
            c = c3;
            yVarArr = yVarArr2;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    public final boolean b(Path path, int i2) {
        Path path2 = this.f2261k;
        path2.reset();
        this.f2252a[i2].b(this.f2253b[i2], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }
}
