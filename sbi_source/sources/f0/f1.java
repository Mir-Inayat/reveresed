package f0;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public abstract class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n1 f1243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x.c[] f1244b;

    public f1() {
        this(new n1());
    }

    public final void a() {
        x.c[] cVarArr = this.f1244b;
        if (cVarArr != null) {
            x.c cVarF = cVarArr[0];
            x.c cVarF2 = cVarArr[1];
            n1 n1Var = this.f1243a;
            if (cVarF2 == null) {
                cVarF2 = n1Var.f1281a.f(2);
            }
            if (cVarF == null) {
                cVarF = n1Var.f1281a.f(1);
            }
            g(x.c.a(cVarF, cVarF2));
            x.c cVar = this.f1244b[a0.a.E(16)];
            if (cVar != null) {
                f(cVar);
            }
            x.c cVar2 = this.f1244b[a0.a.E(32)];
            if (cVar2 != null) {
                d(cVar2);
            }
            x.c cVar3 = this.f1244b[a0.a.E(64)];
            if (cVar3 != null) {
                h(cVar3);
            }
        }
    }

    public abstract n1 b();

    public void c(int i2, x.c cVar) {
        if (this.f1244b == null) {
            this.f1244b = new x.c[9];
        }
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                this.f1244b[a0.a.E(i3)] = cVar;
            }
        }
    }

    public abstract void e(x.c cVar);

    public abstract void g(x.c cVar);

    public f1(n1 n1Var) {
        this.f1243a = n1Var;
    }

    public void d(x.c cVar) {
    }

    public void f(x.c cVar) {
    }

    public void h(x.c cVar) {
    }
}
