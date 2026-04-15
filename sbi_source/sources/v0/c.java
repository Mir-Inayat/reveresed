package v0;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2296b;
    public final /* synthetic */ h c;

    public /* synthetic */ c(h hVar, ArrayList arrayList, int i2) {
        this.f2295a = i2;
        this.c = hVar;
        this.f2296b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2295a) {
            case 0:
                ArrayList arrayList = this.f2296b;
                int size = arrayList.size();
                h hVar = this.c;
                if (size <= 0) {
                    arrayList.clear();
                    hVar.f2324m.remove(arrayList);
                    return;
                } else {
                    ((g) arrayList.get(0)).getClass();
                    hVar.getClass();
                    throw null;
                }
            case 1:
                ArrayList arrayList2 = this.f2296b;
                int size2 = arrayList2.size();
                int i2 = 0;
                while (true) {
                    h hVar2 = this.c;
                    if (i2 >= size2) {
                        arrayList2.clear();
                        hVar2.f2325n.remove(arrayList2);
                        return;
                    } else {
                        Object obj = arrayList2.get(i2);
                        i2++;
                        ArrayList arrayList3 = hVar2.f2329r;
                        ((f) obj).getClass();
                    }
                }
                break;
            default:
                ArrayList arrayList4 = this.f2296b;
                int size3 = arrayList4.size();
                h hVar3 = this.c;
                if (size3 <= 0) {
                    arrayList4.clear();
                    hVar3.f2323l.remove(arrayList4);
                    return;
                } else {
                    o0 o0Var = (o0) arrayList4.get(0);
                    hVar3.getClass();
                    o0Var.getClass();
                    throw null;
                }
        }
    }
}
