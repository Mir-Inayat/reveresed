package androidx.emoji2.text;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f229a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f230b;
    public final Object c;

    public j(n nVar, int i2) {
        this.c = nVar;
        this.f230b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f229a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.c;
                int size = arrayList.size();
                int i2 = 0;
                if (this.f230b == 1) {
                    while (i2 < size) {
                        ((i) arrayList.get(i2)).a();
                        i2++;
                    }
                } else {
                    while (i2 < size) {
                        ((i) arrayList.get(i2)).getClass();
                        i2++;
                    }
                }
                break;
            default:
                w.b bVar = (w.b) ((n) this.c).f244b;
                if (bVar != null) {
                    bVar.d(this.f230b);
                }
                break;
        }
    }

    public j(List list, int i2, Throwable th) {
        a0.a.h(list, "initCallbacks cannot be null");
        this.c = new ArrayList(list);
        this.f230b = i2;
    }
}
