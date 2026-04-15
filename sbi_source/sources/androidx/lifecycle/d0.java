package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class d0 extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f325b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.emoji2.text.n f326a;

    /* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final c0 Companion = new c0();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            d2.c.e(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            d2.c.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            d2.c.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            d2.c.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            d2.c.e(activity, "activity");
            int i2 = d0.f325b;
            a0.a(activity, l.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            d2.c.e(activity, "activity");
            int i2 = d0.f325b;
            a0.a(activity, l.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            d2.c.e(activity, "activity");
            int i2 = d0.f325b;
            a0.a(activity, l.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            d2.c.e(activity, "activity");
            int i2 = d0.f325b;
            a0.a(activity, l.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            d2.c.e(activity, "activity");
            int i2 = d0.f325b;
            a0.a(activity, l.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            d2.c.e(activity, "activity");
            int i2 = d0.f325b;
            a0.a(activity, l.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            d2.c.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            d2.c.e(activity, "activity");
            d2.c.e(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            d2.c.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            d2.c.e(activity, "activity");
        }
    }

    public final void a(l lVar) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            d2.c.d(activity, "activity");
            a0.a(activity, lVar);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(l.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(l.ON_DESTROY);
        this.f326a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(l.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        androidx.emoji2.text.n nVar = this.f326a;
        if (nVar != null) {
            ((z) nVar.f244b).a();
        }
        a(l.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        androidx.emoji2.text.n nVar = this.f326a;
        if (nVar != null) {
            z zVar = (z) nVar.f244b;
            int i2 = zVar.f356a + 1;
            zVar.f356a = i2;
            if (i2 == 1 && zVar.f358d) {
                zVar.f360f.d(l.ON_START);
                zVar.f358d = false;
            }
        }
        a(l.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(l.ON_STOP);
    }
}
