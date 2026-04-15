package f0;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class l1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n1 f1270b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n1 f1271a;

    static {
        int i2 = Build.VERSION.SDK_INT;
        f1270b = (i2 >= 30 ? new e1() : i2 >= 29 ? new d1() : new c1()).b().f1281a.a().f1281a.b().f1281a.c();
    }

    public l1(n1 n1Var) {
        this.f1271a = n1Var;
    }

    public n1 a() {
        return this.f1271a;
    }

    public n1 b() {
        return this.f1271a;
    }

    public n1 c() {
        return this.f1271a;
    }

    public k e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return n() == l1Var.n() && m() == l1Var.m() && Objects.equals(j(), l1Var.j()) && Objects.equals(h(), l1Var.h()) && Objects.equals(e(), l1Var.e());
    }

    public x.c f(int i2) {
        return x.c.f2615e;
    }

    public x.c g() {
        return j();
    }

    public x.c h() {
        return x.c.f2615e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
    }

    public x.c i() {
        return j();
    }

    public x.c j() {
        return x.c.f2615e;
    }

    public x.c k() {
        return j();
    }

    public n1 l(int i2, int i3, int i4, int i5) {
        return f1270b;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public void d(View view) {
    }

    public void o(x.c[] cVarArr) {
    }

    public void p(n1 n1Var) {
    }

    public void q(x.c cVar) {
    }
}
