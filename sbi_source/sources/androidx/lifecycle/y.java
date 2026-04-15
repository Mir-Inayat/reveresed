package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class y extends f {
    final /* synthetic */ z this$0;

    /* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
    public static final class a extends f {
        final /* synthetic */ z this$0;

        public a(z zVar) {
            this.this$0 = zVar;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            d2.c.e(activity, "activity");
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            d2.c.e(activity, "activity");
            z zVar = this.this$0;
            int i2 = zVar.f356a + 1;
            zVar.f356a = i2;
            if (i2 == 1 && zVar.f358d) {
                zVar.f360f.d(l.ON_START);
                zVar.f358d = false;
            }
        }
    }

    public y(z zVar) {
        this.this$0 = zVar;
    }

    @Override // androidx.lifecycle.f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        d2.c.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i2 = d0.f325b;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            d2.c.c(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((d0) fragmentFindFragmentByTag).f326a = this.this$0.f362h;
        }
    }

    @Override // androidx.lifecycle.f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        d2.c.e(activity, "activity");
        z zVar = this.this$0;
        int i2 = zVar.f357b - 1;
        zVar.f357b = i2;
        if (i2 == 0) {
            Handler handler = zVar.f359e;
            d2.c.b(handler);
            handler.postDelayed(zVar.f361g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        d2.c.e(activity, "activity");
        x.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        d2.c.e(activity, "activity");
        z zVar = this.this$0;
        int i2 = zVar.f356a - 1;
        zVar.f356a = i2;
        if (i2 == 0 && zVar.c) {
            zVar.f360f.d(l.ON_STOP);
            zVar.f358d = true;
        }
    }
}
