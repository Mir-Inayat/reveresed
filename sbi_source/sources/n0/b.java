package n0;

import android.view.Choreographer;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f1715b;

    public /* synthetic */ b(Runnable runnable, int i2) {
        this.f1714a = i2;
        this.f1715b = runnable;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j2) {
        switch (this.f1714a) {
            case 0:
                this.f1715b.run();
                break;
            default:
                this.f1715b.run();
                break;
        }
    }
}
