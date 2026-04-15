package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class m extends a0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0.a f241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f242b;

    public m(a0.a aVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f241a = aVar;
        this.f242b = threadPoolExecutor;
    }

    @Override // a0.a
    public final void N(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f242b;
        try {
            this.f241a.N(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // a0.a
    public final void Q(y yVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f242b;
        try {
            this.f241a.Q(yVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
