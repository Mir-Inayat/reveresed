package androidx.fragment.app;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.view.ContextMenu;
import android.view.View;
import androidx.emoji2.text.n;
import androidx.emoji2.text.q;
import androidx.lifecycle.SavedStateHandleAttacher;
import androidx.lifecycle.e0;
import androidx.lifecycle.g0;
import androidx.lifecycle.j0;
import androidx.lifecycle.l;
import androidx.lifecycle.p;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import androidx.lifecycle.v;
import androidx.savedstate.Recreator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public abstract class f implements ComponentCallbacks, View.OnCreateContextMenuListener, r, j0, androidx.lifecycle.h, w0.f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f289j = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f290a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f291b = UUID.randomUUID().toString();
    public final k c = new k();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f292d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.m f293e = androidx.lifecycle.m.f338e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t f294f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q f295g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f296h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n f297i;

    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.r, java.lang.Object, w0.f] */
    public f() {
        Object obj;
        w0.d dVar;
        new v();
        new AtomicInteger();
        this.f296h = new ArrayList();
        this.f297i = new n(2, this);
        this.f294f = new t(this);
        this.f295g = new q(this);
        ArrayList arrayList = this.f296h;
        n nVar = this.f297i;
        if (arrayList.contains(nVar)) {
            return;
        }
        if (this.f290a < 0) {
            arrayList.add(nVar);
            return;
        }
        f fVar = (f) nVar.f244b;
        q qVar = fVar.f295g;
        ?? r2 = qVar.f246b;
        t tVarD = r2.d();
        if (tVarD.c != androidx.lifecycle.m.f336b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        tVarD.a(new Recreator(r2));
        final w0.e eVar = (w0.e) qVar.c;
        eVar.getClass();
        if (eVar.f2505b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        tVarD.a(new p() { // from class: w0.b
            @Override // androidx.lifecycle.p
            public final void b(r rVar, l lVar) {
                e eVar2 = eVar;
                d2.c.e(eVar2, "this$0");
                if (lVar == l.ON_START) {
                    eVar2.f2507e = true;
                } else if (lVar == l.ON_STOP) {
                    eVar2.f2507e = false;
                }
            }
        });
        eVar.f2505b = true;
        androidx.lifecycle.m mVar = fVar.d().c;
        if (mVar != androidx.lifecycle.m.f336b && mVar != androidx.lifecycle.m.c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        w0.e eVarB = fVar.b();
        eVarB.getClass();
        Iterator it = eVarB.f2504a.iterator();
        while (true) {
            h.b bVar = (h.b) it;
            obj = null;
            if (!bVar.hasNext()) {
                dVar = null;
                break;
            }
            Map.Entry entry = (Map.Entry) bVar.next();
            d2.c.d(entry, "components");
            String str = (String) entry.getKey();
            dVar = (w0.d) entry.getValue();
            if (d2.c.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                break;
            }
        }
        if (dVar == null) {
            g0 g0Var = new g0(fVar.b(), fVar);
            h.f fVar2 = fVar.b().f2504a;
            h.c cVarA = fVar2.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
            if (cVarA != null) {
                obj = cVarA.f1344b;
            } else {
                h.c cVar = new h.c("androidx.lifecycle.internal.SavedStateHandlesProvider", g0Var);
                fVar2.f1350d++;
                h.c cVar2 = fVar2.f1349b;
                if (cVar2 == null) {
                    fVar2.f1348a = cVar;
                    fVar2.f1349b = cVar;
                } else {
                    cVar2.c = cVar;
                    cVar.f1345d = cVar2;
                    fVar2.f1349b = cVar;
                }
            }
            if (((w0.d) obj) != null) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            fVar.d().a(new SavedStateHandleAttacher(g0Var));
        }
    }

    @Override // androidx.lifecycle.h
    public final s0.b a() {
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Override // w0.f
    public final w0.e b() {
        return (w0.e) this.f295g.c;
    }

    @Override // androidx.lifecycle.j0
    public final e0 c() {
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @Override // androidx.lifecycle.r
    public final t d() {
        return this.f294f;
    }

    public final k e() {
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f291b);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }
}
