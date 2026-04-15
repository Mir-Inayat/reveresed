package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
class ReflectiveGenericLifecycleObserver implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f316b;

    public ReflectiveGenericLifecycleObserver(q qVar) {
        this.f315a = qVar;
        c cVar = c.c;
        Class<?> cls = qVar.getClass();
        a aVar = (a) cVar.f323a.get(cls);
        this.f316b = aVar == null ? cVar.a(cls, null) : aVar;
    }

    @Override // androidx.lifecycle.p
    public final void b(r rVar, l lVar) {
        HashMap map = this.f316b.f319a;
        List list = (List) map.get(lVar);
        q qVar = this.f315a;
        a.a(list, rVar, lVar, qVar);
        a.a((List) map.get(l.ON_ANY), rVar, lVar, qVar);
    }
}
