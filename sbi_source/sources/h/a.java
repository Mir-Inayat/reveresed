package h;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class a extends f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f1340e = new HashMap();

    @Override // h.f
    public final c a(Object obj) {
        return (c) this.f1340e.get(obj);
    }

    @Override // h.f
    public final Object b(Object obj) {
        Object objB = super.b(obj);
        this.f1340e.remove(obj);
        return objB;
    }
}
