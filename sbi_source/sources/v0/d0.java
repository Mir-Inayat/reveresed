package v0;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class d0 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f2309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2310b;
    public boolean c;

    public d0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2309a = new Rect();
        this.f2310b = true;
        this.c = false;
    }

    public d0(int i2, int i3) {
        super(i2, i3);
        this.f2309a = new Rect();
        this.f2310b = true;
        this.c = false;
    }

    public d0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f2309a = new Rect();
        this.f2310b = true;
        this.c = false;
    }

    public d0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f2309a = new Rect();
        this.f2310b = true;
        this.c = false;
    }

    public d0(d0 d0Var) {
        super((ViewGroup.LayoutParams) d0Var);
        this.f2309a = new Rect();
        this.f2310b = true;
        this.c = false;
    }
}
