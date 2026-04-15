package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements x0.b {
    @Override // x0.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // x0.b
    public final Object b(Context context) {
        Object objB;
        w wVar = new w(new n(context));
        wVar.f266b = 1;
        if (l.f232k == null) {
            synchronized (l.f231j) {
                try {
                    if (l.f232k == null) {
                        l.f232k = new l(wVar);
                    }
                } finally {
                }
            }
        }
        x0.a aVarC = x0.a.c(context);
        aVarC.getClass();
        synchronized (x0.a.f2641e) {
            try {
                objB = aVarC.f2642a.get(ProcessLifecycleInitializer.class);
                if (objB == null) {
                    objB = aVarC.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        final androidx.lifecycle.t tVarD = ((androidx.lifecycle.r) objB).d();
        tVarD.a(new androidx.lifecycle.d(this) { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.d
            public final void a() {
                (Build.VERSION.SDK_INT >= 28 ? c.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new o(), 500L);
                tVarD.e(this);
            }
        });
        return Boolean.TRUE;
    }
}
