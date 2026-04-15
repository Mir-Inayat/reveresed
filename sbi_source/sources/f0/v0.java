package f0;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.redhand.laugiytr.R;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends z0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final PathInterpolator f1296e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r0.a f1297f = new r0.a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final DecelerateInterpolator f1298g = new DecelerateInterpolator();

    public static void e(View view) {
        e eVarJ = j(view);
        if (eVarJ != null) {
            ((View) eVarJ.f1241e).setTranslationY(0.0f);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                e(viewGroup.getChildAt(i2));
            }
        }
    }

    public static void f(View view, WindowInsets windowInsets, boolean z) {
        e eVarJ = j(view);
        if (eVarJ != null) {
            eVarJ.f1239b = windowInsets;
            if (!z) {
                View view2 = (View) eVarJ.f1241e;
                int[] iArr = (int[]) eVarJ.f1242f;
                view2.getLocationOnScreen(iArr);
                z = true;
                eVarJ.c = iArr[1];
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                f(viewGroup.getChildAt(i2), windowInsets, z);
            }
        }
    }

    public static void g(View view, n1 n1Var, List list) {
        e eVarJ = j(view);
        if (eVarJ != null) {
            eVarJ.a(n1Var, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                g(viewGroup.getChildAt(i2), n1Var, list);
            }
        }
    }

    public static void h(View view, androidx.emoji2.text.q qVar) {
        e eVarJ = j(view);
        if (eVarJ != null) {
            View view2 = (View) eVarJ.f1241e;
            int[] iArr = (int[]) eVarJ.f1242f;
            view2.getLocationOnScreen(iArr);
            int i2 = eVarJ.c - iArr[1];
            eVarJ.f1240d = i2;
            view2.setTranslationY(i2);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                h(viewGroup.getChildAt(i3), qVar);
            }
        }
    }

    public static WindowInsets i(View view, WindowInsets windowInsets) {
        return view.getTag(R.NP_MANAGER8.NP_MANAGER) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static e j(View view) {
        Object tag = view.getTag(R.NP_MANAGER8.NP_MANAGER);
        if (tag instanceof u0) {
            return ((u0) tag).f1293a;
        }
        return null;
    }
}
