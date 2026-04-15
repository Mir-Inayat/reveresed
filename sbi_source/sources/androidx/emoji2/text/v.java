package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class v implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0.d f258b;
    public final t1.g c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f259d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler f260e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ThreadPoolExecutor f261f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f262g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a0.a f263h;

    public v(Context context, c0.d dVar) {
        a0.a.h(context, "Context cannot be null");
        this.f257a = context.getApplicationContext();
        this.f258b = dVar;
        this.c = w.f264d;
    }

    public final void a() {
        synchronized (this.f259d) {
            try {
                this.f263h = null;
                Handler handler = this.f260e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f260e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f262g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f261f = null;
                this.f262g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final c0.j b() {
        try {
            t1.g gVar = this.c;
            Context context = this.f257a;
            c0.d dVar = this.f258b;
            gVar.getClass();
            c0.i iVarA = c0.c.a(context, dVar);
            int i2 = iVarA.f482a;
            if (i2 != 0) {
                throw new RuntimeException("fetchFonts failed (" + i2 + ")");
            }
            c0.j[] jVarArr = (c0.j[]) iVarA.f483b;
            if (jVarArr == null || jVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return jVarArr[0];
        } catch (PackageManager.NameNotFoundException e3) {
            throw new RuntimeException("provider not found", e3);
        }
    }

    @Override // androidx.emoji2.text.k
    public final void k(a0.a aVar) {
        synchronized (this.f259d) {
            this.f263h = aVar;
        }
        synchronized (this.f259d) {
            try {
                if (this.f263h == null) {
                    return;
                }
                if (this.f261f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f262g = threadPoolExecutor;
                    this.f261f = threadPoolExecutor;
                }
                this.f261f.execute(new u(0, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
