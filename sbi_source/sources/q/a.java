package q;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1891h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1892i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public n.a f1893j;

    public boolean getAllowsGoneWidget() {
        return this.f1893j.f1602s0;
    }

    public int getMargin() {
        return this.f1893j.f1603t0;
    }

    public int getType() {
        return this.f1891h;
    }

    @Override // q.c
    public final void h(n.e eVar, boolean z) {
        int i2 = this.f1891h;
        this.f1892i = i2;
        if (z) {
            if (i2 == 5) {
                this.f1892i = 1;
            } else if (i2 == 6) {
                this.f1892i = 0;
            }
        } else if (i2 == 5) {
            this.f1892i = 0;
        } else if (i2 == 6) {
            this.f1892i = 1;
        }
        if (eVar instanceof n.a) {
            ((n.a) eVar).f1601r0 = this.f1892i;
        }
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f1893j.f1602s0 = z;
    }

    public void setDpMargin(int i2) {
        this.f1893j.f1603t0 = (int) ((i2 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i2) {
        this.f1893j.f1603t0 = i2;
    }

    public void setType(int i2) {
        this.f1891h = i2;
    }
}
