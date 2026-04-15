package f;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f1178b = PorterDuff.Mode.SRC_IN;
    public static t c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t1 f1179a;

    public static synchronized PorterDuffColorFilter b(int i2, PorterDuff.Mode mode) {
        return t1.e(i2, mode);
    }

    public static synchronized void c() {
        if (c == null) {
            t tVar = new t();
            c = tVar;
            tVar.f1179a = t1.b();
            t1 t1Var = c.f1179a;
            s sVar = new s();
            synchronized (t1Var) {
                t1Var.f1186e = sVar;
            }
        }
    }

    public static void d(Drawable drawable, a2 a2Var, int[] iArr) {
        PorterDuff.Mode mode = t1.f1180f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = a2Var.f987d;
        if (!z && !a2Var.c) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterE = null;
        ColorStateList colorStateList = z ? a2Var.f985a : null;
        PorterDuff.Mode mode2 = a2Var.c ? a2Var.f986b : t1.f1180f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilterE = t1.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilterE);
    }

    public final synchronized Drawable a(Context context, int i2) {
        return this.f1179a.c(context, i2);
    }
}
