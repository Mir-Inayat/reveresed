package c0;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import g0.s;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class i implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f483b;

    public i(int i2, j[] jVarArr) {
        this.f482a = i2;
        this.f483b = jVarArr;
    }

    @Override // g0.s
    public boolean d(View view) {
        ((BottomSheetBehavior) this.f483b).B(this.f482a);
        return true;
    }

    public i(BottomSheetBehavior bottomSheetBehavior, int i2) {
        this.f483b = bottomSheetBehavior;
        this.f482a = i2;
    }
}
