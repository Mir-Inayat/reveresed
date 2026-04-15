package u1;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2288b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c(Object obj, int i2, int i3) {
        this.f2287a = i3;
        this.c = obj;
        this.f2288b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2287a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.c;
                View view = (View) sideSheetBehavior.f664p.get();
                if (view != null) {
                    sideSheetBehavior.t(view, this.f2288b, false);
                }
                break;
            default:
                ((w.b) this.c).d(this.f2288b);
                break;
        }
    }
}
