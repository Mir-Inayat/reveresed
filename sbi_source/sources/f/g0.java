package f;

import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public abstract class g0 {
    public static int a(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    public static void b(TextView textView, int i2, int i3, int i4, int i5) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
    }

    public static void c(TextView textView, int[] iArr, int i2) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
    }

    public static boolean d(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }
}
