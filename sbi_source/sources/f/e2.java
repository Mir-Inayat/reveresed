package f;

import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class e2 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1018a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1019b;

    public e2(m2 m2Var) {
        this.f1019b = m2Var;
        m2Var.f1106a.getContext();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1018a) {
            case 0:
                h2 h2Var = ((Toolbar) this.f1019b).K;
                e.k kVar = h2Var == null ? null : h2Var.f1026b;
                if (kVar != null) {
                    kVar.collapseActionView();
                }
                break;
            default:
                m2 m2Var = (m2) this.f1019b;
                if (m2Var.f1115k != null) {
                    m2Var.getClass();
                }
                break;
        }
    }

    public e2(Toolbar toolbar) {
        this.f1019b = toolbar;
    }
}
