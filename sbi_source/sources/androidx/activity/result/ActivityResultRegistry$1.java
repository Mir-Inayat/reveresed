package androidx.activity.result;

import androidx.lifecycle.l;
import androidx.lifecycle.p;
import androidx.lifecycle.r;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
class ActivityResultRegistry$1 implements p {
    @Override // androidx.lifecycle.p
    public final void b(r rVar, l lVar) {
        if (l.ON_START.equals(lVar) || l.ON_STOP.equals(lVar) || l.ON_DESTROY.equals(lVar)) {
            throw null;
        }
    }
}
