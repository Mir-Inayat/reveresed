package v0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f2442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f2443b = new Rect();
    public final /* synthetic */ int c;

    public u(c0 c0Var, int i2) {
        this.c = i2;
        this.f2442a = c0Var;
    }

    public static u a(c0 c0Var, int i2) {
        if (i2 == 0) {
            return new u(c0Var, 0);
        }
        if (i2 == 1) {
            return new u(c0Var, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public final int b(View view) {
        int right;
        int i2;
        switch (this.c) {
            case 0:
                d0 d0Var = (d0) view.getLayoutParams();
                this.f2442a.getClass();
                right = view.getRight() + ((d0) view.getLayoutParams()).f2309a.right;
                i2 = ((ViewGroup.MarginLayoutParams) d0Var).rightMargin;
                break;
            default:
                d0 d0Var2 = (d0) view.getLayoutParams();
                this.f2442a.getClass();
                right = view.getBottom() + ((d0) view.getLayoutParams()).f2309a.bottom;
                i2 = ((ViewGroup.MarginLayoutParams) d0Var2).bottomMargin;
                break;
        }
        return right + i2;
    }

    public final int c(View view) {
        int iV;
        int i2;
        switch (this.c) {
            case 0:
                d0 d0Var = (d0) view.getLayoutParams();
                this.f2442a.getClass();
                iV = c0.v(view) + ((ViewGroup.MarginLayoutParams) d0Var).leftMargin;
                i2 = ((ViewGroup.MarginLayoutParams) d0Var).rightMargin;
                break;
            default:
                d0 d0Var2 = (d0) view.getLayoutParams();
                this.f2442a.getClass();
                iV = c0.u(view) + ((ViewGroup.MarginLayoutParams) d0Var2).topMargin;
                i2 = ((ViewGroup.MarginLayoutParams) d0Var2).bottomMargin;
                break;
        }
        return iV + i2;
    }

    public final int d(View view) {
        int iU;
        int i2;
        switch (this.c) {
            case 0:
                d0 d0Var = (d0) view.getLayoutParams();
                this.f2442a.getClass();
                iU = c0.u(view) + ((ViewGroup.MarginLayoutParams) d0Var).topMargin;
                i2 = ((ViewGroup.MarginLayoutParams) d0Var).bottomMargin;
                break;
            default:
                d0 d0Var2 = (d0) view.getLayoutParams();
                this.f2442a.getClass();
                iU = c0.v(view) + ((ViewGroup.MarginLayoutParams) d0Var2).leftMargin;
                i2 = ((ViewGroup.MarginLayoutParams) d0Var2).rightMargin;
                break;
        }
        return iU + i2;
    }

    public final int e(View view) {
        int left;
        int i2;
        switch (this.c) {
            case 0:
                d0 d0Var = (d0) view.getLayoutParams();
                this.f2442a.getClass();
                left = view.getLeft() - ((d0) view.getLayoutParams()).f2309a.left;
                i2 = ((ViewGroup.MarginLayoutParams) d0Var).leftMargin;
                break;
            default:
                d0 d0Var2 = (d0) view.getLayoutParams();
                this.f2442a.getClass();
                left = view.getTop() - ((d0) view.getLayoutParams()).f2309a.top;
                i2 = ((ViewGroup.MarginLayoutParams) d0Var2).topMargin;
                break;
        }
        return left - i2;
    }

    public final int f() {
        switch (this.c) {
            case 0:
                return this.f2442a.f2304i;
            default:
                return this.f2442a.f2305j;
        }
    }

    public final int g() {
        int i2;
        int iY;
        switch (this.c) {
            case 0:
                c0 c0Var = this.f2442a;
                i2 = c0Var.f2304i;
                iY = c0Var.y();
                break;
            default:
                c0 c0Var2 = this.f2442a;
                i2 = c0Var2.f2305j;
                iY = c0Var2.w();
                break;
        }
        return i2 - iY;
    }

    public final int h() {
        switch (this.c) {
            case 0:
                return this.f2442a.f2302g;
            default:
                return this.f2442a.f2303h;
        }
    }

    public final int i() {
        switch (this.c) {
            case 0:
                return this.f2442a.x();
            default:
                return this.f2442a.z();
        }
    }

    public final int j() {
        int iX;
        int iY;
        switch (this.c) {
            case 0:
                c0 c0Var = this.f2442a;
                iX = c0Var.f2304i - c0Var.x();
                iY = c0Var.y();
                break;
            default:
                c0 c0Var2 = this.f2442a;
                iX = c0Var2.f2305j - c0Var2.z();
                iY = c0Var2.w();
                break;
        }
        return iX - iY;
    }

    public final int k(View view) {
        switch (this.c) {
            case 0:
                c0 c0Var = this.f2442a;
                Rect rect = this.f2443b;
                c0Var.D(view, rect);
                return rect.right;
            default:
                c0 c0Var2 = this.f2442a;
                Rect rect2 = this.f2443b;
                c0Var2.D(view, rect2);
                return rect2.bottom;
        }
    }

    public final int l(View view) {
        switch (this.c) {
            case 0:
                c0 c0Var = this.f2442a;
                Rect rect = this.f2443b;
                c0Var.D(view, rect);
                return rect.left;
            default:
                c0 c0Var2 = this.f2442a;
                Rect rect2 = this.f2443b;
                c0Var2.D(view, rect2);
                return rect2.top;
        }
    }

    public final void m(int i2) {
        switch (this.c) {
            case 0:
                this.f2442a.H(i2);
                break;
            default:
                this.f2442a.I(i2);
                break;
        }
    }
}
