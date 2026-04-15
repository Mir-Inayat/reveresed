package z0;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f2727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f2728b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f2727a = new d0();
        } else {
            f2727a = new c0();
        }
        f2728b = new b(Float.class, "translationAlpha", 5);
        new b(Rect.class, "clipBounds", 6);
    }

    public static void a(View view, int i2, int i3, int i4, int i5) {
        f2727a.R(view, i2, i3, i4, i5);
    }

    public static void b(View view, int i2) {
        f2727a.N(view, i2);
    }
}
