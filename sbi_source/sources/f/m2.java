package f;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class m2 implements t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Toolbar f1106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1107b;
    public View c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f1108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f1109e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f1110f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1111g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f1112h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f1113i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f1114j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Window.Callback f1115k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1116l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Drawable f1117m;

    public final void a(int i2) {
        View view;
        Toolbar toolbar = this.f1106a;
        int i3 = this.f1107b ^ i2;
        this.f1107b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    b();
                }
                if ((this.f1107b & 4) != 0) {
                    Drawable drawable = this.f1110f;
                    if (drawable == null) {
                        drawable = this.f1117m;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i3 & 3) != 0) {
                c();
            }
            if ((i3 & 8) != 0) {
                if ((i2 & 8) != 0) {
                    toolbar.setTitle(this.f1112h);
                    toolbar.setSubtitle(this.f1113i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i3 & 16) == 0 || (view = this.c) == null) {
                return;
            }
            if ((i2 & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f1106a;
        if ((this.f1107b & 4) != 0) {
            if (TextUtils.isEmpty(this.f1114j)) {
                toolbar.setNavigationContentDescription(this.f1116l);
            } else {
                toolbar.setNavigationContentDescription(this.f1114j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i2 = this.f1107b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) == 0 || (drawable = this.f1109e) == null) {
            drawable = this.f1108d;
        }
        this.f1106a.setLogo(drawable);
    }
}
