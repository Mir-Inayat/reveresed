package u1;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import t1.e;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class a extends e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2283g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SideSheetBehavior f2284h;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i2) {
        this.f2283g = i2;
        this.f2284h = sideSheetBehavior;
    }

    @Override // t1.e
    public final int A() {
        switch (this.f2283g) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // t1.e
    public final boolean D(float f3) {
        switch (this.f2283g) {
            case 0:
                if (f3 > 0.0f) {
                }
                break;
            default:
                if (f3 < 0.0f) {
                }
                break;
        }
        return false;
    }

    @Override // t1.e
    public final boolean E(View view) {
        switch (this.f2283g) {
            case 0:
                if (view.getRight() < (u() - v()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (u() + this.f2284h.f661m) / 2) {
                }
                break;
        }
        return false;
    }

    @Override // t1.e
    public final boolean F(float f3, float f4) {
        switch (this.f2283g) {
            case 0:
                if (Math.abs(f3) <= Math.abs(f4) || Math.abs(f3) <= 500) {
                }
                break;
            default:
                if (Math.abs(f3) <= Math.abs(f4) || Math.abs(f3) <= 500) {
                }
                break;
        }
        return false;
    }

    @Override // t1.e
    public final boolean O(View view, float f3) {
        switch (this.f2283g) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.f2284h;
                float fAbs = Math.abs((f3 * sideSheetBehavior.f659k) + left);
                sideSheetBehavior.getClass();
                if (fAbs > 0.5f) {
                }
                break;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.f2284h;
                float fAbs2 = Math.abs((f3 * sideSheetBehavior2.f659k) + right);
                sideSheetBehavior2.getClass();
                if (fAbs2 > 0.5f) {
                }
                break;
        }
        return false;
    }

    @Override // t1.e
    public final void Q(ViewGroup.MarginLayoutParams marginLayoutParams, int i2, int i3) {
        switch (this.f2283g) {
            case 0:
                if (i2 <= this.f2284h.f661m) {
                    marginLayoutParams.leftMargin = i3;
                }
                break;
            default:
                int i4 = this.f2284h.f661m;
                if (i2 <= i4) {
                    marginLayoutParams.rightMargin = i4 - i2;
                }
                break;
        }
    }

    @Override // t1.e
    public final int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f2283g) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // t1.e
    public final float c(int i2) {
        switch (this.f2283g) {
            case 0:
                float fV = v();
                return (i2 - fV) / (u() - fV);
            default:
                float f3 = this.f2284h.f661m;
                return (f3 - i2) / (f3 - u());
        }
    }

    @Override // t1.e
    public final int u() {
        switch (this.f2283g) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f2284h;
                return Math.max(0, sideSheetBehavior.f662n + sideSheetBehavior.f663o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f2284h;
                return Math.max(0, (sideSheetBehavior2.f661m - sideSheetBehavior2.f660l) - sideSheetBehavior2.f663o);
        }
    }

    @Override // t1.e
    public final int v() {
        switch (this.f2283g) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f2284h;
                return (-sideSheetBehavior.f660l) - sideSheetBehavior.f663o;
            default:
                return this.f2284h.f661m;
        }
    }

    @Override // t1.e
    public final int w() {
        switch (this.f2283g) {
            case 0:
                return this.f2284h.f663o;
            default:
                return this.f2284h.f661m;
        }
    }

    @Override // t1.e
    public final int x() {
        switch (this.f2283g) {
            case 0:
                return -this.f2284h.f660l;
            default:
                return u();
        }
    }

    @Override // t1.e
    public final int y(View view) {
        switch (this.f2283g) {
            case 0:
                return view.getRight() + this.f2284h.f663o;
            default:
                return view.getLeft() - this.f2284h.f663o;
        }
    }

    @Override // t1.e
    public final int z(CoordinatorLayout coordinatorLayout) {
        switch (this.f2283g) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }
}
