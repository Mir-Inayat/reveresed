package z1;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2730b;

    public a(Object obj, Object obj2) {
        this.f2729a = obj;
        this.f2730b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return d2.c.a(this.f2729a, aVar.f2729a) && d2.c.a(this.f2730b, aVar.f2730b);
    }

    public final int hashCode() {
        Object obj = this.f2729a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f2730b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f2729a + ", " + this.f2730b + ')';
    }
}
