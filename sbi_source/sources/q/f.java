package q;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f1946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1947b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1948d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1949e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1950f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1951g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ConstraintLayout f1952h;

    public f(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f1952h = constraintLayout;
        this.f1946a = constraintLayout2;
    }

    public static boolean a(int i2, int i3, int i4) {
        if (i2 == i3) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i2);
        View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i4 == size;
        }
        return false;
    }

    public final void b(n.e eVar, o.b bVar) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int iMax;
        boolean z;
        int measuredWidth;
        int baseline;
        int i2;
        if (eVar == null) {
            return;
        }
        n.d dVar = eVar.J;
        n.d dVar2 = eVar.H;
        if (eVar.f1639f0 == 8) {
            bVar.f1759e = 0;
            bVar.f1760f = 0;
            bVar.f1761g = 0;
            return;
        }
        if (eVar.S == null) {
            return;
        }
        int i3 = bVar.f1756a;
        int i4 = bVar.f1757b;
        int i5 = bVar.c;
        int i6 = bVar.f1758d;
        int i7 = this.f1947b + this.c;
        int i8 = this.f1948d;
        View view = eVar.f1637e0;
        int iA = l.f.a(i3);
        if (iA == 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        } else if (iA == 1) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f1950f, i8, -2);
        } else if (iA == 2) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f1950f, i8, -2);
            boolean z2 = eVar.f1659q == 1;
            int i9 = bVar.f1764j;
            if (i9 == 1 || i9 == 2) {
                boolean z3 = view.getMeasuredHeight() == eVar.k();
                if (bVar.f1764j == 2 || !z2 || ((z2 && z3) || eVar.x())) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(eVar.n(), 1073741824);
                }
            }
        } else if (iA != 3) {
            iMakeMeasureSpec = 0;
        } else {
            int i10 = this.f1950f;
            int i11 = dVar2 != null ? dVar2.f1626g : 0;
            if (dVar != null) {
                i11 += dVar.f1626g;
            }
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i8 + i11, -1);
        }
        int iA2 = l.f.a(i4);
        if (iA2 == 0) {
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        } else if (iA2 == 1) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f1951g, i7, -2);
        } else if (iA2 == 2) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f1951g, i7, -2);
            boolean z4 = eVar.f1660r == 1;
            int i12 = bVar.f1764j;
            if (i12 == 1 || i12 == 2) {
                boolean z5 = view.getMeasuredWidth() == eVar.n();
                if (bVar.f1764j == 2 || !z4 || ((z4 && z5) || eVar.y())) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(eVar.k(), 1073741824);
                }
            }
        } else if (iA2 != 3) {
            iMakeMeasureSpec2 = 0;
        } else {
            int i13 = this.f1951g;
            int i14 = dVar2 != null ? eVar.I.f1626g : 0;
            if (dVar != null) {
                i14 += eVar.K.f1626g;
            }
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i13, i7 + i14, -1);
        }
        n.f fVar = (n.f) eVar.S;
        ConstraintLayout constraintLayout = this.f1952h;
        if (fVar != null && n.k.c(constraintLayout.f135i, 256) && view.getMeasuredWidth() == eVar.n() && view.getMeasuredWidth() < fVar.n() && view.getMeasuredHeight() == eVar.k() && view.getMeasuredHeight() < fVar.k() && view.getBaseline() == eVar.Z && !eVar.w() && a(eVar.F, iMakeMeasureSpec, eVar.n()) && a(eVar.G, iMakeMeasureSpec2, eVar.k())) {
            bVar.f1759e = eVar.n();
            bVar.f1760f = eVar.k();
            bVar.f1761g = eVar.Z;
            return;
        }
        boolean z6 = i3 == 3;
        boolean z7 = i4 == 3;
        boolean z8 = i4 == 4 || i4 == 1;
        boolean z9 = i3 == 4 || i3 == 1;
        boolean z10 = z6 && eVar.V > 0.0f;
        boolean z11 = z7 && eVar.V > 0.0f;
        if (view == null) {
            return;
        }
        e eVar2 = (e) view.getLayoutParams();
        int i15 = bVar.f1764j;
        if (i15 != 1 && i15 != 2 && z6 && eVar.f1659q == 0 && z7 && eVar.f1660r == 0) {
            z = false;
            measuredWidth = 0;
            baseline = 0;
            i2 = -1;
            iMax = 0;
        } else {
            if ((view instanceof t) && (eVar instanceof n.h)) {
                ((t) view).j((n.h) eVar, iMakeMeasureSpec, iMakeMeasureSpec2);
            } else {
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            }
            eVar.F = iMakeMeasureSpec;
            eVar.G = iMakeMeasureSpec2;
            eVar.f1640g = false;
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i16 = eVar.f1662t;
            int iMax2 = i16 > 0 ? Math.max(i16, measuredWidth2) : measuredWidth2;
            int i17 = eVar.f1663u;
            if (i17 > 0) {
                iMax2 = Math.min(i17, iMax2);
            }
            int i18 = eVar.f1665w;
            iMax = i18 > 0 ? Math.max(i18, measuredHeight) : measuredHeight;
            int i19 = iMakeMeasureSpec2;
            int i20 = eVar.f1666x;
            if (i20 > 0) {
                iMax = Math.min(i20, iMax);
            }
            if (!n.k.c(constraintLayout.f135i, 1)) {
                if (z10 && z8) {
                    iMax2 = (int) ((iMax * eVar.V) + 0.5f);
                } else if (z11 && z9) {
                    iMax = (int) ((iMax2 / eVar.V) + 0.5f);
                }
            }
            if (measuredWidth2 == iMax2 && measuredHeight == iMax) {
                baseline = baseline2;
                measuredWidth = iMax2;
                z = false;
            } else {
                if (measuredWidth2 != iMax2) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                }
                int iMakeMeasureSpec3 = measuredHeight != iMax ? View.MeasureSpec.makeMeasureSpec(iMax, 1073741824) : i19;
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                eVar.F = iMakeMeasureSpec;
                eVar.G = iMakeMeasureSpec3;
                z = false;
                eVar.f1640g = false;
                measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMax = measuredHeight2;
            }
            i2 = -1;
        }
        boolean z12 = baseline != i2 ? true : z;
        bVar.f1763i = (measuredWidth == bVar.c && iMax == bVar.f1758d) ? z : true;
        boolean z13 = eVar2.f1910b0 ? true : z12;
        if (z13 && baseline != -1 && eVar.Z != baseline) {
            bVar.f1763i = true;
        }
        bVar.f1759e = measuredWidth;
        bVar.f1760f = iMax;
        bVar.f1762h = z13;
        bVar.f1761g = baseline;
    }
}
