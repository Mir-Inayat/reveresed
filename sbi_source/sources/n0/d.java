package n0;

import android.view.View;
import t1.z;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class d extends a0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1724a;

    public /* synthetic */ d(int i2) {
        this.f1724a = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a0.a
    public final void j0(z zVar, float f3) {
        switch (this.f1724a) {
            case 0:
                ((View) zVar).setAlpha(f3);
                break;
            case 1:
                ((View) zVar).setScaleX(f3);
                break;
            case 2:
                ((View) zVar).setScaleY(f3);
                break;
            case 3:
                ((View) zVar).setRotation(f3);
                break;
            case 4:
                ((View) zVar).setRotationX(f3);
                break;
            default:
                ((View) zVar).setRotationY(f3);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a0.a
    public final float z(z zVar) {
        switch (this.f1724a) {
            case 0:
                return ((View) zVar).getAlpha();
            case 1:
                return ((View) zVar).getScaleX();
            case 2:
                return ((View) zVar).getScaleY();
            case 3:
                return ((View) zVar).getRotation();
            case 4:
                return ((View) zVar).getRotationX();
            default:
                return ((View) zVar).getRotationY();
        }
    }
}
