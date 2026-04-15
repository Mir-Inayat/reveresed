package g;

import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class a extends a0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile a f1319b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1320a;

    public a(int i2) {
        switch (i2) {
            case 1:
                this.f1320a = new Object();
                Executors.newFixedThreadPool(4, new b());
                break;
            default:
                this.f1320a = new a(1);
                break;
        }
    }
}
