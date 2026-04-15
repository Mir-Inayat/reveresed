package f;

import android.database.DataSetObserver;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class j1 extends DataSetObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m1 f1065a;

    public j1(m1 m1Var) {
        this.f1065a = m1Var;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        m1 m1Var = this.f1065a;
        if (m1Var.f1105v.isShowing()) {
            m1Var.c();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f1065a.dismiss();
    }
}
