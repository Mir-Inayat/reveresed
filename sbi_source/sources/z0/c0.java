package z0;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class c0 extends t1.e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f2655g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f2656h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f2657i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static boolean f2658j = true;

    @Override // t1.e
    public void N(View view, int i2) {
        if (Build.VERSION.SDK_INT == 28) {
            super.N(view, i2);
        } else if (f2658j) {
            try {
                b0.a(view, i2);
            } catch (NoSuchMethodError unused) {
                f2658j = false;
            }
        }
    }

    public void R(View view, int i2, int i3, int i4, int i5) {
        if (f2657i) {
            try {
                a0.a(view, i2, i3, i4, i5);
            } catch (NoSuchMethodError unused) {
                f2657i = false;
            }
        }
    }

    public void S(View view, Matrix matrix) {
        if (f2655g) {
            try {
                z.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f2655g = false;
            }
        }
    }

    public void T(View view, Matrix matrix) {
        if (f2656h) {
            try {
                z.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f2656h = false;
            }
        }
    }
}
