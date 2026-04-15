package f;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1001a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1002b;
    public final /* synthetic */ View c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1003d;

    public e0(TextView textView, Typeface typeface, int i2) {
        this.c = textView;
        this.f1003d = typeface;
        this.f1002b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1001a) {
            case 0:
                ((TextView) this.c).setTypeface((Typeface) this.f1003d, this.f1002b);
                break;
            default:
                ((BottomSheetBehavior) this.f1003d).E(this.c, this.f1002b, false);
                break;
        }
    }

    public e0(BottomSheetBehavior bottomSheetBehavior, View view, int i2) {
        this.f1003d = bottomSheetBehavior;
        this.c = view;
        this.f1002b = i2;
    }
}
