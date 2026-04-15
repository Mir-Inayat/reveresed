package e;

import android.view.View;
import android.view.ViewTreeObserver;
import f.r1;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f856b;

    public /* synthetic */ c(l lVar, int i2) {
        this.f855a = i2;
        this.f856b = lVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f855a) {
            case 0:
                g gVar = (g) this.f856b;
                ArrayList arrayList = gVar.f869h;
                if (gVar.g() && arrayList.size() > 0) {
                    int i2 = 0;
                    if (!((f) arrayList.get(0)).f862a.f1104u) {
                        View view = gVar.f876o;
                        if (view != null && view.isShown()) {
                            int size = arrayList.size();
                            while (i2 < size) {
                                Object obj = arrayList.get(i2);
                                i2++;
                                ((f) obj).f862a.c();
                            }
                        } else {
                            gVar.dismiss();
                        }
                    }
                    break;
                }
                break;
            default:
                s sVar = (s) this.f856b;
                r1 r1Var = sVar.f953h;
                if (sVar.g() && !r1Var.f1104u) {
                    View view2 = sVar.f958m;
                    if (view2 != null && view2.isShown()) {
                        r1Var.c();
                    } else {
                        sVar.dismiss();
                    }
                    break;
                }
                break;
        }
    }
}
