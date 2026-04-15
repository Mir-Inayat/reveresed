package androidx.activity;

import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.l;
import androidx.lifecycle.p;
import androidx.lifecycle.r;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
final class ImmLeaksCleaner implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f4a;

    @Override // androidx.lifecycle.p
    public final void b(r rVar, l lVar) {
        if (lVar != l.ON_DESTROY) {
            return;
        }
        if (f4a == 0) {
            try {
                f4a = 2;
                InputMethodManager.class.getDeclaredField("mServedView").setAccessible(true);
                InputMethodManager.class.getDeclaredField("mNextServedView").setAccessible(true);
                InputMethodManager.class.getDeclaredField("mH").setAccessible(true);
                f4a = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f4a == 1) {
            throw null;
        }
    }
}
