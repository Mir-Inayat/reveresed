package f0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import com.redhand.laugiytr.R;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.NP_MANAGER8.NP_MANAGER);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static n1 b(View view, n1 n1Var, Rect rect) {
        WindowInsets windowInsetsC = n1Var.c();
        if (windowInsetsC != null) {
            return n1.d(view, view.computeSystemWindowInsets(windowInsetsC, rect));
        }
        rect.setEmpty();
        return n1Var;
    }

    public static boolean c(View view, float f3, float f4, boolean z) {
        return view.dispatchNestedFling(f3, f4, z);
    }

    public static boolean d(View view, float f3, float f4) {
        return view.dispatchNestedPreFling(f3, f4);
    }

    public static boolean e(View view, int i2, int i3, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i2, i3, iArr, iArr2);
    }

    public static boolean f(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        return view.dispatchNestedScroll(i2, i3, i4, i5, iArr);
    }

    public static ColorStateList g(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode h(View view) {
        return view.getBackgroundTintMode();
    }

    public static float i(View view) {
        return view.getElevation();
    }

    public static n1 j(View view) {
        if (b1.f1232d && view.isAttachedToWindow()) {
            try {
                Object obj = b1.f1230a.get(view.getRootView());
                if (obj != null) {
                    Rect rect = (Rect) b1.f1231b.get(obj);
                    Rect rect2 = (Rect) b1.c.get(obj);
                    if (rect != null && rect2 != null) {
                        int i2 = Build.VERSION.SDK_INT;
                        f1 e1Var = i2 >= 30 ? new e1() : i2 >= 29 ? new d1() : new c1();
                        e1Var.e(x.c.b(rect.left, rect.top, rect.right, rect.bottom));
                        e1Var.g(x.c.b(rect2.left, rect2.top, rect2.right, rect2.bottom));
                        n1 n1VarB = e1Var.b();
                        n1VarB.f1281a.p(n1VarB);
                        n1VarB.f1281a.d(view.getRootView());
                        return n1VarB;
                    }
                }
            } catch (IllegalAccessException e3) {
                Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e3.getMessage(), e3);
            }
        }
        return null;
    }

    public static String k(View view) {
        return view.getTransitionName();
    }

    public static float l(View view) {
        return view.getTranslationZ();
    }

    public static float m(View view) {
        return view.getZ();
    }

    public static boolean n(View view) {
        return view.hasNestedScrollingParent();
    }

    public static boolean o(View view) {
        return view.isImportantForAccessibility();
    }

    public static boolean p(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void q(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void r(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void s(View view, float f3) {
        view.setElevation(f3);
    }

    public static void t(View view, boolean z) {
        view.setNestedScrollingEnabled(z);
    }

    public static void u(View view, q qVar) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.NP_MANAGER8.NP_MANAGER, qVar);
        }
        if (qVar == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.NP_MANAGER8.NP_MANAGER));
        } else {
            view.setOnApplyWindowInsetsListener(new b0(view, qVar));
        }
    }

    public static void v(View view, String str) {
        view.setTransitionName(str);
    }

    public static void w(View view, float f3) {
        view.setTranslationZ(f3);
    }

    public static void x(View view, float f3) {
        view.setZ(f3);
    }

    public static boolean y(View view, int i2) {
        return view.startNestedScroll(i2);
    }

    public static void z(View view) {
        view.stopNestedScroll();
    }
}
