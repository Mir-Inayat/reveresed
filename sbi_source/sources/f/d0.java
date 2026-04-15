package f;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends w.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f997f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ WeakReference f998g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0 f999h;

    public d0(i0 i0Var, int i2, int i3, WeakReference weakReference) {
        this.f999h = i0Var;
        this.f996e = i2;
        this.f997f = i3;
        this.f998g = weakReference;
    }

    @Override // w.b
    public final void e(Typeface typeface) {
        int i2;
        if (Build.VERSION.SDK_INT >= 28 && (i2 = this.f996e) != -1) {
            typeface = h0.a(typeface, i2, (this.f997f & 2) != 0);
        }
        i0 i0Var = this.f999h;
        if (i0Var.f1039m) {
            i0Var.f1038l = typeface;
            TextView textView = (TextView) this.f998g.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new e0(textView, typeface, i0Var.f1036j));
                } else {
                    textView.setTypeface(typeface, i0Var.f1036j);
                }
            }
        }
    }

    @Override // w.b
    public final void d(int i2) {
    }
}
