package f;

import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class r1 extends m1 implements n1 {
    public static final Method z;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public androidx.emoji2.text.n f1171y;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                z = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // f.n1
    public final void p(e.j jVar, MenuItem menuItem) {
        androidx.emoji2.text.n nVar = this.f1171y;
        if (nVar != null) {
            nVar.p(jVar, menuItem);
        }
    }

    @Override // f.n1
    public final void q(e.j jVar, e.k kVar) {
        androidx.emoji2.text.n nVar = this.f1171y;
        if (nVar != null) {
            nVar.q(jVar, kVar);
        }
    }
}
