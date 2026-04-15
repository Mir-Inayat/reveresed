package z1;

import androidx.lifecycle.f0;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f0 f2731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f2732b = c.f2733a;
    public final Object c = this;

    public b(f0 f0Var) {
        this.f2731a = f0Var;
    }

    public final Object a() {
        Object objA;
        Object obj = this.f2732b;
        c cVar = c.f2733a;
        if (obj != cVar) {
            return obj;
        }
        synchronized (this.c) {
            objA = this.f2732b;
            if (objA == cVar) {
                f0 f0Var = this.f2731a;
                d2.c.b(f0Var);
                objA = f0Var.a();
                this.f2732b = objA;
                this.f2731a = null;
            }
        }
        return objA;
    }

    public final String toString() {
        return this.f2732b != c.f2733a ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
