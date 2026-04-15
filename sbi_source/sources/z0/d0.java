package z0;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends c0 {
    @Override // t1.e
    public final float C(View view) {
        return view.getTransitionAlpha();
    }

    @Override // t1.e
    public final void M(View view, float f3) {
        view.setTransitionAlpha(f3);
    }

    @Override // z0.c0, t1.e
    public final void N(View view, int i2) {
        view.setTransitionVisibility(i2);
    }

    @Override // z0.c0
    public final void R(View view, int i2, int i3, int i4, int i5) {
        view.setLeftTopRightBottom(i2, i3, i4, i5);
    }

    @Override // z0.c0
    public final void S(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // z0.c0
    public final void T(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
