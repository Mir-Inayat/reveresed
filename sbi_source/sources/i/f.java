package i;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class f extends k implements Map {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f1369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f1370e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f1371f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar) {
        super(0);
        int i2 = kVar.c;
        b(this.c + i2);
        if (this.c != 0) {
            for (int i3 = 0; i3 < i2; i3++) {
                put(kVar.f(i3), kVar.i(i3));
            }
        } else if (i2 > 0) {
            a2.a.n0(0, 0, i2, kVar.f1385a, this.f1385a);
            a2.a.o0(kVar.f1386b, this.f1386b, 0, 0, i2 << 1);
            this.c = i2;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        a aVar = this.f1369d;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(this);
        this.f1369d = aVar2;
        return aVar2;
    }

    public final boolean j(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(Collection collection) {
        int i2 = this.c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i2 != this.c;
    }

    @Override // java.util.Map
    public final Set keySet() {
        c cVar = this.f1370e;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c(this);
        this.f1370e = cVar2;
        return cVar2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        e eVar = this.f1371f;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e(this);
        this.f1371f = eVar2;
        return eVar2;
    }
}
