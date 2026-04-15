package androidx.lifecycle;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f322b;

    public b(int i2, Method method) {
        this.f321a = i2;
        this.f322b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f321a == bVar.f321a && this.f322b.getName().equals(bVar.f322b.getName());
    }

    public final int hashCode() {
        return this.f322b.getName().hashCode() + (this.f321a * 31);
    }
}
