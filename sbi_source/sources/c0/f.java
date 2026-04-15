package c0;

import androidx.emoji2.text.q;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class f implements e0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f476b;

    public /* synthetic */ f(int i2, Object obj) {
        this.f475a = i2;
        this.f476b = obj;
    }

    @Override // e0.a
    public final void accept(Object obj) {
        switch (this.f475a) {
            case 0:
                g gVar = (g) obj;
                if (gVar == null) {
                    gVar = new g(-3);
                }
                ((q) this.f476b).i(gVar);
                return;
            default:
                g gVar2 = (g) obj;
                synchronized (h.c) {
                    try {
                        i.k kVar = h.f481d;
                        ArrayList arrayList = (ArrayList) kVar.get((String) this.f476b);
                        if (arrayList == null) {
                            return;
                        }
                        kVar.remove((String) this.f476b);
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            ((e0.a) arrayList.get(i2)).accept(gVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
