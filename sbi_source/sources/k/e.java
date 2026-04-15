package k;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class e extends a0.a {
    @Override // a0.a
    public final void W(f fVar, f fVar2) {
        fVar.f1446b = fVar2;
    }

    @Override // a0.a
    public final void X(f fVar, Thread thread) {
        fVar.f1445a = thread;
    }

    @Override // a0.a
    public final boolean c(g gVar, c cVar) {
        c cVar2 = c.f1439b;
        synchronized (gVar) {
            try {
                if (gVar.f1452b != cVar) {
                    return false;
                }
                gVar.f1452b = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a0.a
    public final boolean d(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f1451a != obj) {
                    return false;
                }
                gVar.f1451a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a0.a
    public final boolean e(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.c != fVar) {
                    return false;
                }
                gVar.c = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
