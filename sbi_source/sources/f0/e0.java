package f0;

import android.view.View;
import android.view.autofill.AutofillId;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public abstract class e0 {
    public static void a(View view, Collection<View> collection, int i2) {
        view.addKeyboardNavigationClusters(collection, i2);
    }

    public static AutofillId b(View view) {
        return view.getAutofillId();
    }

    public static int c(View view) {
        return view.getImportantForAutofill();
    }

    public static int d(View view) {
        return view.getNextClusterForwardId();
    }

    public static boolean e(View view) {
        return view.hasExplicitFocusable();
    }

    public static boolean f(View view) {
        return view.isFocusedByDefault();
    }

    public static boolean g(View view) {
        return view.isImportantForAutofill();
    }

    public static boolean h(View view) {
        return view.isKeyboardNavigationCluster();
    }

    public static View i(View view, View view2, int i2) {
        return view.keyboardNavigationClusterSearch(view2, i2);
    }

    public static boolean j(View view) {
        return view.restoreDefaultFocus();
    }

    public static void k(View view, String... strArr) {
        view.setAutofillHints(strArr);
    }

    public static void l(View view, boolean z) {
        view.setFocusedByDefault(z);
    }

    public static void m(View view, int i2) {
        view.setImportantForAutofill(i2);
    }

    public static void n(View view, boolean z) {
        view.setKeyboardNavigationCluster(z);
    }

    public static void o(View view, int i2) {
        view.setNextClusterForwardId(i2);
    }

    public static void p(View view, CharSequence charSequence) {
        view.setTooltipText(charSequence);
    }
}
