package f;

import android.content.Context;
import android.view.View;
import com.redhand.laugiytr.R;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class g extends e.n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1022l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j f1023m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, Context context, e.j jVar2, View view) {
        super(context, jVar2, view, true, R.NP_MANAGER3.NP_MANAGER, 0);
        this.f1023m = jVar;
        this.f942f = 8388613;
        androidx.emoji2.text.n nVar = jVar.f1064v;
        this.f944h = nVar;
        e.l lVar = this.f945i;
        if (lVar != null) {
            lVar.f(nVar);
        }
    }

    @Override // e.n
    public final void c() {
        switch (this.f1022l) {
            case 0:
                j jVar = this.f1023m;
                jVar.f1061s = null;
                jVar.getClass();
                super.c();
                break;
            default:
                j jVar2 = this.f1023m;
                e.j jVar3 = jVar2.c;
                if (jVar3 != null) {
                    jVar3.c(true);
                }
                jVar2.f1060r = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, Context context, e.t tVar, View view) {
        super(context, tVar, view, false, R.NP_MANAGER3.NP_MANAGER, 0);
        this.f1023m = jVar;
        if ((tVar.f967w.f934x & 32) != 32) {
            View view2 = jVar.f1050h;
            this.f941e = view2 == null ? jVar.f1049g : view2;
        }
        androidx.emoji2.text.n nVar = jVar.f1064v;
        this.f944h = nVar;
        e.l lVar = this.f945i;
        if (lVar != null) {
            lVar.f(nVar);
        }
    }
}
