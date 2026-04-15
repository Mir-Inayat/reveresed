package t0;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2145b;

    public /* synthetic */ g(Context context, int i2) {
        this.f2144a = i2;
        this.f2145b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2144a) {
            case 0:
                (Build.VERSION.SDK_INT >= 28 ? i.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new g(this.f2145b, 1), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new g(this.f2145b, 2));
                break;
            default:
                f.s(this.f2145b, new d(), f.f2135a, false);
                break;
        }
    }

    public /* synthetic */ g(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f2144a = 0;
        this.f2145b = context;
    }
}
