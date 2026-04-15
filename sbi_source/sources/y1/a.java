package y1;

import android.content.Context;
import android.os.Handler;
import androidx.emoji2.text.n;
import androidx.emoji2.text.v;
import androidx.emoji2.text.w;
import com.redhand.laugh.MainActivity;
import java.util.concurrent.ThreadPoolExecutor;
import w.m;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2647b;
    public final /* synthetic */ Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2648d;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i2) {
        this.f2646a = i2;
        this.f2647b = obj;
        this.c = obj2;
        this.f2648d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2646a) {
            case 0:
                Context context = (Context) this.f2647b;
                String str = (String) this.c;
                Handler handler = (Handler) this.f2648d;
                if (MainActivity.v(context, str)) {
                    return;
                }
                handler.postDelayed(new a(context, str, handler, 1), 700L);
                return;
            case 1:
                Context context2 = (Context) this.f2647b;
                String str2 = (String) this.c;
                Handler handler2 = (Handler) this.f2648d;
                if (MainActivity.v(context2, str2)) {
                    return;
                }
                handler2.postDelayed(new m(context2, str2, 3), 1200L);
                return;
            case 2:
                Context context3 = (Context) this.f2647b;
                String str3 = (String) this.c;
                Handler handler3 = (Handler) this.f2648d;
                if (MainActivity.v(context3, str3)) {
                    return;
                }
                handler3.postDelayed(new a(context3, str3, handler3, 0), 350L);
                return;
            default:
                n nVar = (n) this.f2647b;
                a0.a aVar = (a0.a) this.c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f2648d;
                try {
                    w wVarL = a0.a.l((Context) nVar.f244b);
                    if (wVarL == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    v vVar = (v) wVarL.f265a;
                    synchronized (vVar.f259d) {
                        vVar.f261f = threadPoolExecutor;
                        break;
                    }
                    wVarL.f265a.k(new androidx.emoji2.text.m(aVar, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    aVar.N(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
        }
    }
}
