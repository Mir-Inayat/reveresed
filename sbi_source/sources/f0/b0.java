package f0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n1 f1228a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1229b;
    public final /* synthetic */ q c;

    public b0(View view, q qVar) {
        this.f1229b = view;
        this.c = qVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        n1 n1VarD = n1.d(view, windowInsets);
        int i2 = Build.VERSION.SDK_INT;
        q qVar = this.c;
        if (i2 < 30) {
            c0.a(windowInsets, this.f1229b);
            if (n1VarD.equals(this.f1228a)) {
                return qVar.e(view, n1VarD).c();
            }
        }
        this.f1228a = n1VarD;
        n1 n1VarE = qVar.e(view, n1VarD);
        if (i2 >= 30) {
            return n1VarE.c();
        }
        Field field = m0.f1276a;
        a0.c(view);
        return n1VarE.c();
    }
}
