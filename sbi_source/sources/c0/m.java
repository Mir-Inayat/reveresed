package c0;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.view.View;
import androidx.emoji2.text.q;
import f0.a1;
import f0.v0;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f489a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f490b;
    public Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f491d;

    public /* synthetic */ m() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        switch (this.f489a) {
            case 0:
                try {
                    objCall = ((e) this.f490b).call();
                } catch (Exception unused) {
                    objCall = null;
                }
                ((Handler) this.f491d).post(new a((f) this.c, objCall, 1));
                break;
            default:
                v0.h((View) this.f490b, (q) this.c);
                ((ValueAnimator) this.f491d).start();
                break;
        }
    }

    public m(View view, a1 a1Var, q qVar, ValueAnimator valueAnimator) {
        this.f490b = view;
        this.c = qVar;
        this.f491d = valueAnimator;
    }
}
