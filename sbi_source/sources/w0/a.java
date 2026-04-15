package w0;

import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f2502a = new LinkedHashSet();

    public a(e eVar) {
        Object obj;
        h.f fVar = eVar.f2504a;
        h.c cVarA = fVar.a("androidx.savedstate.Restarter");
        if (cVarA != null) {
            obj = cVarA.f1344b;
        } else {
            h.c cVar = new h.c("androidx.savedstate.Restarter", this);
            fVar.f1350d++;
            h.c cVar2 = fVar.f1349b;
            if (cVar2 == null) {
                fVar.f1348a = cVar;
                fVar.f1349b = cVar;
            } else {
                cVar2.c = cVar;
                cVar.f1345d = cVar2;
                fVar.f1349b = cVar;
            }
            obj = null;
        }
        if (((d) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }
}
