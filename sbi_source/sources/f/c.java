package f;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f991b;

    public /* synthetic */ c(ActionBarOverlayLayout actionBarOverlayLayout, int i2) {
        this.f990a = i2;
        this.f991b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f990a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f991b;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f71t = actionBarOverlayLayout.c.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f72u);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f991b;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f71t = actionBarOverlayLayout2.c.animate().translationY(-actionBarOverlayLayout2.c.getHeight()).setListener(actionBarOverlayLayout2.f72u);
                break;
        }
    }
}
