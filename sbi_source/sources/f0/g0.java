package f0;

import android.view.View;
import com.redhand.laugiytr.R;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public abstract class g0 {
    public static void a(View view, l0 l0Var) {
        i.k kVar = (i.k) view.getTag(R.NP_MANAGER8.NP_MANAGER);
        if (kVar == null) {
            kVar = new i.k(0);
            view.setTag(R.NP_MANAGER8.NP_MANAGER, kVar);
        }
        Objects.requireNonNull(l0Var);
        View.OnUnhandledKeyEventListener f0Var = new f0();
        kVar.put(l0Var, f0Var);
        view.addOnUnhandledKeyEventListener(f0Var);
    }

    public static CharSequence b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean c(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean d(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void e(View view, l0 l0Var) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        i.k kVar = (i.k) view.getTag(R.NP_MANAGER8.NP_MANAGER);
        if (kVar == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) kVar.get(l0Var)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    public static <T> T f(View view, int i2) {
        return (T) view.requireViewById(i2);
    }

    public static void g(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(View view, h0.a aVar) {
        view.setAutofillId(null);
    }

    public static void j(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }
}
