package f;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class i1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m1 f1041b;

    public /* synthetic */ i1(m1 m1Var, int i2) {
        this.f1040a = i2;
        this.f1041b = m1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1040a) {
            case 0:
                q1 q1Var = this.f1041b.c;
                if (q1Var != null) {
                    q1Var.setListSelectionHidden(true);
                    q1Var.requestLayout();
                }
                break;
            default:
                m1 m1Var = this.f1041b;
                q1 q1Var2 = m1Var.c;
                if (q1Var2 != null && q1Var2.isAttachedToWindow() && m1Var.c.getCount() > m1Var.c.getChildCount() && m1Var.c.getChildCount() <= Integer.MAX_VALUE) {
                    m1Var.f1105v.setInputMethodMode(2);
                    m1Var.c();
                    break;
                }
                break;
        }
    }
}
