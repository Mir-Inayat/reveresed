package o;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class i extends o {
    @Override // o.d
    public final void a(d dVar) {
        f fVar = this.f1803h;
        if (fVar.c && !fVar.f1782j) {
            fVar.d((int) ((((f) fVar.f1784l.get(0)).f1779g * ((n.i) this.f1798b).f1704p0) + 0.5f));
        }
    }

    @Override // o.o
    public final void d() {
        n.e eVar = this.f1798b;
        n.i iVar = (n.i) eVar;
        int i2 = iVar.f1705q0;
        int i3 = iVar.f1706r0;
        int i4 = iVar.f1708t0;
        f fVar = this.f1803h;
        if (i4 == 1) {
            if (i2 != -1) {
                fVar.f1784l.add(eVar.S.f1634d.f1803h);
                this.f1798b.S.f1634d.f1803h.f1783k.add(fVar);
                fVar.f1778f = i2;
            } else if (i3 != -1) {
                fVar.f1784l.add(eVar.S.f1634d.f1804i);
                this.f1798b.S.f1634d.f1804i.f1783k.add(fVar);
                fVar.f1778f = -i3;
            } else {
                fVar.f1775b = true;
                fVar.f1784l.add(eVar.S.f1634d.f1804i);
                this.f1798b.S.f1634d.f1804i.f1783k.add(fVar);
            }
            m(this.f1798b.f1634d.f1803h);
            m(this.f1798b.f1634d.f1804i);
            return;
        }
        if (i2 != -1) {
            fVar.f1784l.add(eVar.S.f1636e.f1803h);
            this.f1798b.S.f1636e.f1803h.f1783k.add(fVar);
            fVar.f1778f = i2;
        } else if (i3 != -1) {
            fVar.f1784l.add(eVar.S.f1636e.f1804i);
            this.f1798b.S.f1636e.f1804i.f1783k.add(fVar);
            fVar.f1778f = -i3;
        } else {
            fVar.f1775b = true;
            fVar.f1784l.add(eVar.S.f1636e.f1804i);
            this.f1798b.S.f1636e.f1804i.f1783k.add(fVar);
        }
        m(this.f1798b.f1636e.f1803h);
        m(this.f1798b.f1636e.f1804i);
    }

    @Override // o.o
    public final void e() {
        n.e eVar = this.f1798b;
        int i2 = ((n.i) eVar).f1708t0;
        f fVar = this.f1803h;
        if (i2 == 1) {
            eVar.X = fVar.f1779g;
        } else {
            eVar.Y = fVar.f1779g;
        }
    }

    @Override // o.o
    public final void f() {
        this.f1803h.c();
    }

    @Override // o.o
    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.f1803h;
        fVar2.f1783k.add(fVar);
        fVar.f1784l.add(fVar2);
    }
}
