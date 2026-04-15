package h;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class b extends e implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f1341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f1342b;
    public final /* synthetic */ int c;

    public b(c cVar, c cVar2, int i2) {
        this.c = i2;
        this.f1341a = cVar2;
        this.f1342b = cVar;
    }

    @Override // h.e
    public final void a(c cVar) {
        c cVar2;
        c cVarB = null;
        if (this.f1341a == cVar && cVar == this.f1342b) {
            this.f1342b = null;
            this.f1341a = null;
        }
        c cVar3 = this.f1341a;
        if (cVar3 == cVar) {
            switch (this.c) {
                case 0:
                    cVar2 = cVar3.f1345d;
                    break;
                default:
                    cVar2 = cVar3.c;
                    break;
            }
            this.f1341a = cVar2;
        }
        c cVar4 = this.f1342b;
        if (cVar4 == cVar) {
            c cVar5 = this.f1341a;
            if (cVar4 != cVar5 && cVar5 != null) {
                cVarB = b(cVar4);
            }
            this.f1342b = cVarB;
        }
    }

    public final c b(c cVar) {
        switch (this.c) {
            case 0:
                return cVar.c;
            default:
                return cVar.f1345d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1342b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.f1342b;
        c cVar2 = this.f1341a;
        this.f1342b = (cVar == cVar2 || cVar2 == null) ? null : b(cVar);
        return cVar;
    }
}
