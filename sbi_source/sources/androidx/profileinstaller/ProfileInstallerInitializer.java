package androidx.profileinstaller;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import t0.g;
import t0.h;
import x0.b;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // x0.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // x0.b
    public final Object b(Context context) {
        h.a(new g(this, context.getApplicationContext()));
        return new t1.g(19);
    }
}
