package f0;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends f1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Field f1233e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f1234f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Constructor f1235g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f1236h = false;
    public WindowInsets c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x.c f1237d;

    public c1() {
        this.c = i();
    }

    private static WindowInsets i() {
        if (!f1234f) {
            try {
                f1233e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e3);
            }
            f1234f = true;
        }
        Field field = f1233e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e4);
            }
        }
        if (!f1236h) {
            try {
                f1235g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e5);
            }
            f1236h = true;
        }
        Constructor constructor = f1235g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e6) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e6);
            }
        }
        return null;
    }

    @Override // f0.f1
    public n1 b() {
        a();
        n1 n1VarD = n1.d(null, this.c);
        x.c[] cVarArr = this.f1244b;
        l1 l1Var = n1VarD.f1281a;
        l1Var.o(cVarArr);
        l1Var.q(this.f1237d);
        return n1VarD;
    }

    @Override // f0.f1
    public void e(x.c cVar) {
        this.f1237d = cVar;
    }

    @Override // f0.f1
    public void g(x.c cVar) {
        WindowInsets windowInsets = this.c;
        if (windowInsets != null) {
            this.c = windowInsets.replaceSystemWindowInsets(cVar.f2616a, cVar.f2617b, cVar.c, cVar.f2618d);
        }
    }

    public c1(n1 n1Var) {
        super(n1Var);
        this.c = n1Var.c();
    }
}
