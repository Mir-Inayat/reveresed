package f0;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public abstract class r0 {
    public static boolean a(ViewParent viewParent, View view, float f3, float f4, boolean z) {
        return viewParent.onNestedFling(view, f3, f4, z);
    }

    public static boolean b(ViewParent viewParent, View view, float f3, float f4) {
        return viewParent.onNestedPreFling(view, f3, f4);
    }

    public static void c(ViewParent viewParent, View view, int i2, int i3, int[] iArr) {
        viewParent.onNestedPreScroll(view, i2, i3, iArr);
    }

    public static void d(ViewParent viewParent, View view, int i2, int i3, int i4, int i5) {
        viewParent.onNestedScroll(view, i2, i3, i4, i5);
    }

    public static void e(ViewParent viewParent, View view, View view2, int i2) {
        viewParent.onNestedScrollAccepted(view, view2, i2);
    }

    public static boolean f(ViewParent viewParent, View view, View view2, int i2) {
        return viewParent.onStartNestedScroll(view, view2, i2);
    }

    public static void g(ViewParent viewParent, View view) {
        viewParent.onStopNestedScroll(view);
    }
}
