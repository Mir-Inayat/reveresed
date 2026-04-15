package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements x0.b {
    @Override // x0.b
    public final List a() {
        return a2.c.f1a;
    }

    @Override // x0.b
    public final Object b(Context context) {
        d2.c.e(context, "context");
        x0.a aVarC = x0.a.c(context);
        d2.c.d(aVarC, "getInstance(context)");
        if (!aVarC.f2643b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!o.f340a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            d2.c.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new n());
        }
        z zVar = z.f355i;
        zVar.getClass();
        zVar.f359e = new Handler();
        zVar.f360f.d(l.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        d2.c.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new y(zVar));
        return zVar;
    }
}
