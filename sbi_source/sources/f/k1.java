package f;

import android.widget.AbsListView;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class k1 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m1 f1067a;

    public k1(m1 m1Var) {
        this.f1067a = m1Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i2) {
        m1 m1Var = this.f1067a;
        i1 i1Var = m1Var.f1097n;
        a0 a0Var = m1Var.f1105v;
        if (i2 != 1 || a0Var.getInputMethodMode() == 2 || a0Var.getContentView() == null) {
            return;
        }
        m1Var.f1101r.removeCallbacks(i1Var);
        i1Var.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i2, int i3, int i4) {
    }
}
