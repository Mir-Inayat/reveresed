package androidx.lifecycle;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleAttacher implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f317a;

    public SavedStateHandleAttacher(g0 g0Var) {
        this.f317a = g0Var;
    }

    @Override // androidx.lifecycle.p
    public final void b(r rVar, l lVar) {
        if (lVar != l.ON_CREATE) {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + lVar).toString());
        }
        rVar.d().e(this);
        g0 g0Var = this.f317a;
        if (g0Var.f330b) {
            return;
        }
        Bundle bundleA = g0Var.f329a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = g0Var.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleA != null) {
            bundle.putAll(bundleA);
        }
        g0Var.c = bundle;
        g0Var.f330b = true;
    }
}
