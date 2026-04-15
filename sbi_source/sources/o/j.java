package o;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class j extends o {
    @Override // o.d
    public final void a(d dVar) {
        n.a aVar = (n.a) this.f1798b;
        int i2 = aVar.f1601r0;
        f fVar = this.f1803h;
        ArrayList arrayList = fVar.f1784l;
        int size = arrayList.size();
        int i3 = 0;
        int i4 = -1;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            int i6 = ((f) obj).f1779g;
            if (i4 == -1 || i6 < i4) {
                i4 = i6;
            }
            if (i3 < i6) {
                i3 = i6;
            }
        }
        if (i2 == 0 || i2 == 2) {
            fVar.d(i4 + aVar.f1603t0);
        } else {
            fVar.d(i3 + aVar.f1603t0);
        }
    }

    @Override // o.o
    public final void d() {
        n.e eVar = this.f1798b;
        if (eVar instanceof n.a) {
            f fVar = this.f1803h;
            fVar.f1775b = true;
            ArrayList arrayList = fVar.f1784l;
            n.a aVar = (n.a) eVar;
            int i2 = aVar.f1601r0;
            boolean z = aVar.f1602s0;
            int i3 = 0;
            if (i2 == 0) {
                fVar.f1777e = 4;
                while (i3 < aVar.f1711q0) {
                    n.e eVar2 = aVar.f1710p0[i3];
                    if (z || eVar2.f1639f0 != 8) {
                        f fVar2 = eVar2.f1634d.f1803h;
                        fVar2.f1783k.add(fVar);
                        arrayList.add(fVar2);
                    }
                    i3++;
                }
                m(this.f1798b.f1634d.f1803h);
                m(this.f1798b.f1634d.f1804i);
                return;
            }
            if (i2 == 1) {
                fVar.f1777e = 5;
                while (i3 < aVar.f1711q0) {
                    n.e eVar3 = aVar.f1710p0[i3];
                    if (z || eVar3.f1639f0 != 8) {
                        f fVar3 = eVar3.f1634d.f1804i;
                        fVar3.f1783k.add(fVar);
                        arrayList.add(fVar3);
                    }
                    i3++;
                }
                m(this.f1798b.f1634d.f1803h);
                m(this.f1798b.f1634d.f1804i);
                return;
            }
            if (i2 == 2) {
                fVar.f1777e = 6;
                while (i3 < aVar.f1711q0) {
                    n.e eVar4 = aVar.f1710p0[i3];
                    if (z || eVar4.f1639f0 != 8) {
                        f fVar4 = eVar4.f1636e.f1803h;
                        fVar4.f1783k.add(fVar);
                        arrayList.add(fVar4);
                    }
                    i3++;
                }
                m(this.f1798b.f1636e.f1803h);
                m(this.f1798b.f1636e.f1804i);
                return;
            }
            if (i2 != 3) {
                return;
            }
            fVar.f1777e = 7;
            while (i3 < aVar.f1711q0) {
                n.e eVar5 = aVar.f1710p0[i3];
                if (z || eVar5.f1639f0 != 8) {
                    f fVar5 = eVar5.f1636e.f1804i;
                    fVar5.f1783k.add(fVar);
                    arrayList.add(fVar5);
                }
                i3++;
            }
            m(this.f1798b.f1636e.f1803h);
            m(this.f1798b.f1636e.f1804i);
        }
    }

    @Override // o.o
    public final void e() {
        n.e eVar = this.f1798b;
        if (eVar instanceof n.a) {
            int i2 = ((n.a) eVar).f1601r0;
            f fVar = this.f1803h;
            if (i2 == 0 || i2 == 1) {
                eVar.X = fVar.f1779g;
            } else {
                eVar.Y = fVar.f1779g;
            }
        }
    }

    @Override // o.o
    public final void f() {
        this.c = null;
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
