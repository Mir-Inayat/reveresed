package v0;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class h extends z {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2318g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f2319h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f2320i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList f2321j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f2322k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList f2323l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f2324m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f2325n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f2326o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f2327p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f2328q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList f2329r;

    public static void e(ArrayList arrayList) {
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        ((o0) arrayList.get(size)).getClass();
        throw null;
    }

    @Override // v0.z
    public final void b(o0 o0Var) {
        o0Var.getClass();
        throw null;
    }

    @Override // v0.z
    public final void c() {
        ArrayList arrayList = this.f2325n;
        ArrayList arrayList2 = this.f2323l;
        ArrayList arrayList3 = this.f2324m;
        ArrayList arrayList4 = this.f2322k;
        ArrayList arrayList5 = this.f2320i;
        ArrayList arrayList6 = this.f2319h;
        ArrayList arrayList7 = this.f2321j;
        int size = arrayList7.size() - 1;
        if (size >= 0) {
            ((g) arrayList7.get(size)).getClass();
            throw null;
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            a((o0) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size() - 1;
        if (size3 >= 0) {
            ((o0) arrayList5.get(size3)).getClass();
            throw null;
        }
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            ((f) arrayList4.get(size4)).getClass();
        }
        arrayList4.clear();
        if (d()) {
            for (int size5 = arrayList3.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList3.get(size5);
                int size6 = arrayList8.size() - 1;
                if (size6 >= 0) {
                    ((g) arrayList8.get(size6)).getClass();
                    throw null;
                }
            }
            for (int size7 = arrayList2.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList2.get(size7);
                int size8 = arrayList9.size() - 1;
                if (size8 >= 0) {
                    ((o0) arrayList9.get(size8)).getClass();
                    throw null;
                }
            }
            for (int size9 = arrayList.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    ((f) arrayList10.get(size10)).getClass();
                    if (arrayList10.isEmpty()) {
                        arrayList.remove(arrayList10);
                    }
                }
            }
            e(this.f2328q);
            e(this.f2327p);
            e(this.f2326o);
            e(this.f2329r);
            ArrayList arrayList11 = this.f2452b;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override // v0.z
    public final boolean d() {
        return (this.f2320i.isEmpty() && this.f2322k.isEmpty() && this.f2321j.isEmpty() && this.f2319h.isEmpty() && this.f2327p.isEmpty() && this.f2328q.isEmpty() && this.f2326o.isEmpty() && this.f2329r.isEmpty() && this.f2324m.isEmpty() && this.f2323l.isEmpty() && this.f2325n.isEmpty()) ? false : true;
    }

    public final void f() {
        if (d()) {
            return;
        }
        ArrayList arrayList = this.f2452b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final void g(ArrayList arrayList, o0 o0Var) {
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        ((f) arrayList.get(size)).getClass();
        o0Var.getClass();
        throw null;
    }
}
