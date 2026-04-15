package f;

import androidx.appcompat.widget.Toolbar;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f995b;

    public /* synthetic */ c2(Toolbar toolbar, int i2) {
        this.f994a = i2;
        this.f995b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f994a) {
            case 0:
                h2 h2Var = this.f995b.K;
                e.k kVar = h2Var == null ? null : h2Var.f1026b;
                if (kVar != null) {
                    kVar.collapseActionView();
                }
                break;
            default:
                this.f995b.l();
                break;
        }
    }
}
