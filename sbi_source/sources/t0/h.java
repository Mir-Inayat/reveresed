package t0;

import android.view.Choreographer;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static void a(Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new n0.b(runnable, 1));
    }
}
