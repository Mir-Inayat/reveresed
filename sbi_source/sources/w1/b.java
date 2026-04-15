package w1;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f2511b;

    public /* synthetic */ b(q qVar, int i2) {
        this.f2510a = i2;
        this.f2511b = qVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.f2510a) {
            case 0:
                e eVar = (e) this.f2511b;
                eVar.s(eVar.t());
                break;
            default:
                l lVar = (l) this.f2511b;
                lVar.f2537l = z;
                lVar.p();
                if (!z) {
                    lVar.s(false);
                    lVar.f2538m = false;
                }
                break;
        }
    }
}
