package o;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f1792f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f1793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1794b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f1795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1796e;

    public final void a(ArrayList arrayList) {
        int size = this.f1793a.size();
        if (this.f1796e != -1 && size > 0) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                n nVar = (n) arrayList.get(i2);
                if (this.f1796e == nVar.f1794b) {
                    c(this.c, nVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(l.c cVar, int i2) {
        int iN;
        int iN2;
        ArrayList arrayList = this.f1793a;
        if (arrayList.size() == 0) {
            return 0;
        }
        n.f fVar = (n.f) ((n.e) arrayList.get(0)).S;
        cVar.t();
        fVar.b(cVar, false);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((n.e) arrayList.get(i3)).b(cVar, false);
        }
        if (i2 == 0 && fVar.y0 > 0) {
            n.k.a(fVar, cVar, arrayList, 0);
        }
        if (i2 == 1 && fVar.f1677z0 > 0) {
            n.k.a(fVar, cVar, arrayList, 1);
        }
        try {
            cVar.p();
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        this.f1795d = new ArrayList();
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            n.e eVar = (n.e) arrayList.get(i4);
            t1.g gVar = new t1.g(13);
            new WeakReference(eVar);
            l.c.n(eVar.H);
            l.c.n(eVar.I);
            l.c.n(eVar.J);
            l.c.n(eVar.K);
            l.c.n(eVar.L);
            this.f1795d.add(gVar);
        }
        if (i2 == 0) {
            iN = l.c.n(fVar.H);
            iN2 = l.c.n(fVar.J);
            cVar.t();
        } else {
            iN = l.c.n(fVar.I);
            iN2 = l.c.n(fVar.K);
            cVar.t();
        }
        return iN2 - iN;
    }

    public final void c(int i2, n nVar) {
        int i3 = nVar.f1794b;
        ArrayList arrayList = this.f1793a;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            n.e eVar = (n.e) obj;
            ArrayList arrayList2 = nVar.f1793a;
            if (!arrayList2.contains(eVar)) {
                arrayList2.add(eVar);
            }
            if (i2 == 0) {
                eVar.f1653m0 = i3;
            } else {
                eVar.f1655n0 = i3;
            }
        }
        this.f1796e = i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i2 = this.c;
        sb.append(i2 == 0 ? "Horizontal" : i2 == 1 ? "Vertical" : i2 == 2 ? "Both" : "Unknown");
        sb.append(" [");
        sb.append(this.f1794b);
        sb.append("] <");
        String string = sb.toString();
        ArrayList arrayList = this.f1793a;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            string = string + " " + ((n.e) obj).f1641g0;
        }
        return string + " >";
    }
}
