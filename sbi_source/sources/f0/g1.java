package f0;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public abstract class g1 extends l1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f1246h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Method f1247i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Class f1248j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static Field f1249k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static Field f1250l;
    public final WindowInsets c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x.c[] f1251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public x.c f1252e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public n1 f1253f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public x.c f1254g;

    public g1(n1 n1Var, WindowInsets windowInsets) {
        super(n1Var);
        this.f1252e = null;
        this.c = windowInsets;
    }

    @SuppressLint({"WrongConstant"})
    private x.c r(int i2, boolean z) {
        x.c cVarA = x.c.f2615e;
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                cVarA = x.c.a(cVarA, s(i3, z));
            }
        }
        return cVarA;
    }

    private x.c t() {
        n1 n1Var = this.f1253f;
        return n1Var != null ? n1Var.f1281a.h() : x.c.f2615e;
    }

    private x.c u(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f1246h) {
            v();
        }
        Method method = f1247i;
        if (method != null && f1248j != null && f1249k != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f1249k.get(f1250l.get(objInvoke));
                if (rect != null) {
                    return x.c.b(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e3) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e3.getMessage(), e3);
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    private static void v() {
        try {
            f1247i = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f1248j = cls;
            f1249k = cls.getDeclaredField("mVisibleInsets");
            f1250l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f1249k.setAccessible(true);
            f1250l.setAccessible(true);
        } catch (ReflectiveOperationException e3) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e3.getMessage(), e3);
        }
        f1246h = true;
    }

    @Override // f0.l1
    public void d(View view) {
        x.c cVarU = u(view);
        if (cVarU == null) {
            cVarU = x.c.f2615e;
        }
        w(cVarU);
    }

    @Override // f0.l1
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f1254g, ((g1) obj).f1254g);
        }
        return false;
    }

    @Override // f0.l1
    public x.c f(int i2) {
        return r(i2, false);
    }

    @Override // f0.l1
    public final x.c j() {
        if (this.f1252e == null) {
            WindowInsets windowInsets = this.c;
            this.f1252e = x.c.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f1252e;
    }

    @Override // f0.l1
    public n1 l(int i2, int i3, int i4, int i5) {
        n1 n1VarD = n1.d(null, this.c);
        int i6 = Build.VERSION.SDK_INT;
        f1 e1Var = i6 >= 30 ? new e1(n1VarD) : i6 >= 29 ? new d1(n1VarD) : new c1(n1VarD);
        e1Var.g(n1.b(j(), i2, i3, i4, i5));
        e1Var.e(n1.b(h(), i2, i3, i4, i5));
        return e1Var.b();
    }

    @Override // f0.l1
    public boolean n() {
        return this.c.isRound();
    }

    @Override // f0.l1
    public void o(x.c[] cVarArr) {
        this.f1251d = cVarArr;
    }

    @Override // f0.l1
    public void p(n1 n1Var) {
        this.f1253f = n1Var;
    }

    public x.c s(int i2, boolean z) {
        x.c cVarH;
        int i3;
        if (i2 == 1) {
            return z ? x.c.b(0, Math.max(t().f2617b, j().f2617b), 0, 0) : x.c.b(0, j().f2617b, 0, 0);
        }
        if (i2 == 2) {
            if (z) {
                x.c cVarT = t();
                x.c cVarH2 = h();
                return x.c.b(Math.max(cVarT.f2616a, cVarH2.f2616a), 0, Math.max(cVarT.c, cVarH2.c), Math.max(cVarT.f2618d, cVarH2.f2618d));
            }
            x.c cVarJ = j();
            n1 n1Var = this.f1253f;
            cVarH = n1Var != null ? n1Var.f1281a.h() : null;
            int iMin = cVarJ.f2618d;
            if (cVarH != null) {
                iMin = Math.min(iMin, cVarH.f2618d);
            }
            return x.c.b(cVarJ.f2616a, 0, cVarJ.c, iMin);
        }
        x.c cVar = x.c.f2615e;
        if (i2 == 8) {
            x.c[] cVarArr = this.f1251d;
            cVarH = cVarArr != null ? cVarArr[a0.a.E(8)] : null;
            if (cVarH != null) {
                return cVarH;
            }
            x.c cVarJ2 = j();
            x.c cVarT2 = t();
            int i4 = cVarJ2.f2618d;
            if (i4 > cVarT2.f2618d) {
                return x.c.b(0, 0, 0, i4);
            }
            x.c cVar2 = this.f1254g;
            return (cVar2 == null || cVar2.equals(cVar) || (i3 = this.f1254g.f2618d) <= cVarT2.f2618d) ? cVar : x.c.b(0, 0, 0, i3);
        }
        if (i2 == 16) {
            return i();
        }
        if (i2 == 32) {
            return g();
        }
        if (i2 == 64) {
            return k();
        }
        if (i2 != 128) {
            return cVar;
        }
        n1 n1Var2 = this.f1253f;
        k kVarE = n1Var2 != null ? n1Var2.f1281a.e() : e();
        if (kVarE == null) {
            return cVar;
        }
        int i5 = Build.VERSION.SDK_INT;
        return x.c.b(i5 >= 28 ? j.d(kVarE.f1267a) : 0, i5 >= 28 ? j.f(kVarE.f1267a) : 0, i5 >= 28 ? j.e(kVarE.f1267a) : 0, i5 >= 28 ? j.c(kVarE.f1267a) : 0);
    }

    public void w(x.c cVar) {
        this.f1254g = cVar;
    }
}
