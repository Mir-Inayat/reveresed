package f;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f1210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a2 f1211b;
    public int c = 0;

    public y(ImageView imageView) {
        this.f1210a = imageView;
    }

    public final void a() {
        a2 a2Var;
        ImageView imageView = this.f1210a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            u0.a(drawable);
        }
        if (drawable == null || (a2Var = this.f1211b) == null) {
            return;
        }
        t.d(drawable, a2Var, imageView.getDrawableState());
    }

    public final void b(AttributeSet attributeSet, int i2) {
        int resourceId;
        ImageView imageView = this.f1210a;
        Context context = imageView.getContext();
        int[] iArr = b.a.f435e;
        androidx.emoji2.text.t tVarV = androidx.emoji2.text.t.v(context, attributeSet, iArr, i2);
        TypedArray typedArray = (TypedArray) tVarV.c;
        f0.m0.i(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) tVarV.c, i2);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = a0.a.r(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                u0.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                k0.f.c(imageView, tVarV.l(2));
            }
            if (typedArray.hasValue(3)) {
                k0.f.d(imageView, u0.b(typedArray.getInt(3, -1), null));
            }
            tVarV.x();
        } catch (Throwable th) {
            tVarV.x();
            throw th;
        }
    }
}
