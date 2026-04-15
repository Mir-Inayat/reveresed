package h;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1344b;
    public c c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f1345d;

    public c(Object obj, Object obj2) {
        this.f1343a = obj;
        this.f1344b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f1343a.equals(cVar.f1343a) && this.f1344b.equals(cVar.f1344b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f1343a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f1344b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f1343a.hashCode() ^ this.f1344b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f1343a + "=" + this.f1344b;
    }
}
