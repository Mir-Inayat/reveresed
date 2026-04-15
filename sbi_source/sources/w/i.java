package w;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static Drawable a(Resources resources, int i2, Resources.Theme theme) {
        return resources.getDrawable(i2, theme);
    }

    public static Drawable b(Resources resources, int i2, int i3, Resources.Theme theme) {
        return resources.getDrawableForDensity(i2, i3, theme);
    }
}
