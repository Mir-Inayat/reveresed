package androidx.activity;

import android.os.Build;
import androidx.lifecycle.l;
import androidx.lifecycle.p;
import androidx.lifecycle.r;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
class ComponentActivity$6 implements p {
    @Override // androidx.lifecycle.p
    public final void b(r rVar, l lVar) {
        if (lVar != l.ON_CREATE || Build.VERSION.SDK_INT < 33) {
            return;
        }
        int i2 = a.f5a;
        throw null;
    }
}
