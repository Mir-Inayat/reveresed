package androidx.lifecycle;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class z implements r {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final z f355i = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f357b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler f359e;
    public boolean c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f358d = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f360f = new t(this);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final androidx.emoji2.text.u f361g = new androidx.emoji2.text.u(1, this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final androidx.emoji2.text.n f362h = new androidx.emoji2.text.n(4, this);

    public final void a() {
        int i2 = this.f357b + 1;
        this.f357b = i2;
        if (i2 == 1) {
            if (this.c) {
                this.f360f.d(l.ON_RESUME);
                this.c = false;
            } else {
                Handler handler = this.f359e;
                d2.c.b(handler);
                handler.removeCallbacks(this.f361g);
            }
        }
    }

    @Override // androidx.lifecycle.r
    public final t d() {
        return this.f360f;
    }
}
