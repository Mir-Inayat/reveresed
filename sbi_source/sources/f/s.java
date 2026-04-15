package f;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.redhand.laugiytr.R;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f1173a = {R.NP_MANAGER7.NP_MANAGER, R.NP_MANAGER7.NP_MANAGER, R.NP_MANAGER7.NP_MANAGER};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f1174b = {R.NP_MANAGER7.NP_MANAGER, R.NP_MANAGER7.NP_MANAGER, R.NP_MANAGER7.NP_MANAGER, R.NP_MANAGER7.NP_MANAGER, R.NP_MANAGER7.NP_MANAGER, R.NP_MANAGER7.NP_MANAGER, R.NP_MANAGER7.NP_MANAGER};
    public final int[] c = {R.NP_MANAGER7.NP_MANAGER, R.NP_MANAGER7.NP_MANAGER, R.NP_MANAGER7.NP_MANAGER, R.NP_MANAGER7.NP_MANAGER, R.NP_MANAGER7.NP_MANAGER, R.NP_MANAGER7.NP_MANAGER, R.NP_MANAGER7.NP_MANAGER};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f1175d = {R.NP_MANAGER7.NP_MANAGER, R.NP_MANAGER7.NP_MANAGER, R.NP_MANAGER7.NP_MANAGER};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f1176e = {R.NP_MANAGER7.NP_MANAGER, R.NP_MANAGER7.NP_MANAGER};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f1177f = {R.NP_MANAGER7.NP_MANAGER, R.NP_MANAGER7.NP_MANAGER, R.NP_MANAGER7.NP_MANAGER, R.NP_MANAGER7.NP_MANAGER};

    public static boolean a(int[] iArr, int i2) {
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList b(Context context, int i2) {
        int iC = y1.c(context, R.NP_MANAGER3.NP_MANAGER);
        int iB = y1.b(context, R.NP_MANAGER3.NP_MANAGER);
        int[] iArr = y1.f1215b;
        int[] iArr2 = y1.f1216d;
        int iB2 = x.a.b(iC, i2);
        return new ColorStateList(new int[][]{iArr, iArr2, y1.c, y1.f1218f}, new int[]{iB, iB2, x.a.b(iC, i2), i2});
    }

    public static LayerDrawable c(t1 t1Var, Context context, int i2) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i2);
        Drawable drawableC = t1Var.c(context, R.NP_MANAGER7.NP_MANAGER);
        Drawable drawableC2 = t1Var.c(context, R.NP_MANAGER7.NP_MANAGER);
        if ((drawableC instanceof BitmapDrawable) && drawableC.getIntrinsicWidth() == dimensionPixelSize && drawableC.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableC;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableC.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableC2 instanceof BitmapDrawable) && drawableC2.getIntrinsicWidth() == dimensionPixelSize && drawableC2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableC2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableC2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static void e(Drawable drawable, int i2, PorterDuff.Mode mode) {
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = t.f1178b;
        }
        drawableMutate.setColorFilter(t.b(i2, mode));
    }

    public final ColorStateList d(Context context, int i2) {
        if (i2 == R.NP_MANAGER7.NP_MANAGER) {
            return t1.e.s(context, R.NP_MANAGER5.NP_MANAGER);
        }
        if (i2 == R.NP_MANAGER7.NP_MANAGER) {
            return t1.e.s(context, R.NP_MANAGER5.NP_MANAGER);
        }
        if (i2 != R.NP_MANAGER7.NP_MANAGER) {
            if (i2 == R.NP_MANAGER7.NP_MANAGER) {
                return b(context, y1.c(context, R.NP_MANAGER3.NP_MANAGER));
            }
            if (i2 == R.NP_MANAGER7.NP_MANAGER) {
                return b(context, 0);
            }
            if (i2 == R.NP_MANAGER7.NP_MANAGER) {
                return b(context, y1.c(context, R.NP_MANAGER3.NP_MANAGER));
            }
            if (i2 == R.NP_MANAGER7.NP_MANAGER || i2 == R.NP_MANAGER7.NP_MANAGER) {
                return t1.e.s(context, R.NP_MANAGER5.NP_MANAGER);
            }
            if (a(this.f1174b, i2)) {
                return y1.d(context, R.NP_MANAGER3.NP_MANAGER);
            }
            if (a(this.f1176e, i2)) {
                return t1.e.s(context, R.NP_MANAGER5.NP_MANAGER);
            }
            if (a(this.f1177f, i2)) {
                return t1.e.s(context, R.NP_MANAGER5.NP_MANAGER);
            }
            if (i2 == R.NP_MANAGER7.NP_MANAGER) {
                return t1.e.s(context, R.NP_MANAGER5.NP_MANAGER);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = y1.d(context, R.NP_MANAGER3.NP_MANAGER);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = y1.f1215b;
            iArr2[0] = y1.b(context, R.NP_MANAGER3.NP_MANAGER);
            iArr[1] = y1.f1217e;
            iArr2[1] = y1.c(context, R.NP_MANAGER3.NP_MANAGER);
            iArr[2] = y1.f1218f;
            iArr2[2] = y1.c(context, R.NP_MANAGER3.NP_MANAGER);
        } else {
            int[] iArr3 = y1.f1215b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = y1.f1217e;
            iArr2[1] = y1.c(context, R.NP_MANAGER3.NP_MANAGER);
            iArr[2] = y1.f1218f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }
}
