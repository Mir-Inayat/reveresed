package h;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f1346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1347b = true;
    public final /* synthetic */ f c;

    public d(f fVar) {
        this.c = fVar;
    }

    @Override // h.e
    public final void a(c cVar) {
        c cVar2 = this.f1346a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f1345d;
            this.f1346a = cVar3;
            this.f1347b = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f1347b) {
            return this.c.f1348a != null;
        }
        c cVar = this.f1346a;
        return (cVar == null || cVar.c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f1347b) {
            this.f1347b = false;
            this.f1346a = this.c.f1348a;
        } else {
            c cVar = this.f1346a;
            this.f1346a = cVar != null ? cVar.c : null;
        }
        return this.f1346a;
    }
}
