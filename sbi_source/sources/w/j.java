package w;

import android.content.res.ColorStateList;
import android.content.res.Resources;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static int a(Resources resources, int i2, Resources.Theme theme) {
        return resources.getColor(i2, theme);
    }

    public static ColorStateList b(Resources resources, int i2, Resources.Theme theme) {
        return resources.getColorStateList(i2, theme);
    }
}
