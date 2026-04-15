package f;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class c1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e.a f993b;

    public /* synthetic */ c1(e.a aVar, int i2) {
        this.f992a = i2;
        this.f993b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f992a) {
            case 0:
                ViewParent parent = this.f993b.f847d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                e.a aVar = this.f993b;
                aVar.a();
                View view = aVar.f847d;
                if (view.isEnabled() && !view.isLongClickable() && aVar.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    aVar.f850g = true;
                    break;
                }
                break;
        }
    }
}
