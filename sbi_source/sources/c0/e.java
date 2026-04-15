package c0;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f472b;
    public final /* synthetic */ Context c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f474e;

    public /* synthetic */ e(String str, Context context, d dVar, int i2, int i3) {
        this.f471a = i3;
        this.f472b = str;
        this.c = context;
        this.f473d = dVar;
        this.f474e = i2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f471a) {
            case 0:
                return h.a(this.f472b, this.c, this.f473d, this.f474e);
            default:
                try {
                    return h.a(this.f472b, this.c, this.f473d, this.f474e);
                } catch (Throwable unused) {
                    return new g(-3);
                }
        }
    }
}
