package o0;

import java.nio.ByteBuffer;
import t1.g;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer f1807b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1808d;

    public c() {
        if (g.f2184b == null) {
            g.f2184b = new g(14);
        }
    }

    public final int a(int i2) {
        if (i2 < this.f1808d) {
            return this.f1807b.getShort(this.c + i2);
        }
        return 0;
    }
}
