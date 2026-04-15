package androidx.lifecycle;

import android.app.Activity;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, l lVar) {
        t tVarD;
        d2.c.e(lVar, "event");
        if (!(activity instanceof r) || (tVarD = ((r) activity).d()) == null) {
            return;
        }
        tVarD.d(lVar);
    }
}
