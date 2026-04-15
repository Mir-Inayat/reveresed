package f0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class n1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n1 f1280b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1 f1281a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f1280b = k1.f1269q;
        } else {
            f1280b = l1.f1270b;
        }
    }

    public n1(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.f1281a = new k1(this, windowInsets);
            return;
        }
        if (i2 >= 29) {
            this.f1281a = new j1(this, windowInsets);
        } else if (i2 >= 28) {
            this.f1281a = new i1(this, windowInsets);
        } else {
            this.f1281a = new h1(this, windowInsets);
        }
    }

    public static x.c b(x.c cVar, int i2, int i3, int i4, int i5) {
        int iMax = Math.max(0, cVar.f2616a - i2);
        int iMax2 = Math.max(0, cVar.f2617b - i3);
        int iMax3 = Math.max(0, cVar.c - i4);
        int iMax4 = Math.max(0, cVar.f2618d - i5);
        return (iMax == i2 && iMax2 == i3 && iMax3 == i4 && iMax4 == i5) ? cVar : x.c.b(iMax, iMax2, iMax3, iMax4);
    }

    public static n1 d(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        n1 n1Var = new n1(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            Field field = m0.f1276a;
            n1 n1VarA = d0.a(view);
            l1 l1Var = n1Var.f1281a;
            l1Var.p(n1VarA);
            l1Var.d(view.getRootView());
        }
        return n1Var;
    }

    public final int a() {
        return this.f1281a.j().f2617b;
    }

    public final WindowInsets c() {
        l1 l1Var = this.f1281a;
        if (l1Var instanceof g1) {
            return ((g1) l1Var).c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n1) {
            return Objects.equals(this.f1281a, ((n1) obj).f1281a);
        }
        return false;
    }

    public final int hashCode() {
        l1 l1Var = this.f1281a;
        if (l1Var == null) {
            return 0;
        }
        return l1Var.hashCode();
    }

    public n1() {
        this.f1281a = new l1(this);
    }
}
