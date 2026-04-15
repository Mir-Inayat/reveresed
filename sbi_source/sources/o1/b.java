package o1;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public CharSequence B;
    public CharSequence C;
    public boolean D;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public int K;
    public int L;
    public int[] M;
    public boolean N;
    public final TextPaint O;
    public final TextPaint P;
    public TimeInterpolator Q;
    public TimeInterpolator R;
    public float S;
    public float T;
    public float U;
    public ColorStateList V;
    public float W;
    public float X;
    public float Y;
    public StaticLayout Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextInputLayout f1809a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public float f1810a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f1811b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public float f1812b0;
    public final Rect c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public float f1813c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f1814d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public CharSequence f1815d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RectF f1816e;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f1826j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f1828k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f1829k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1830l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f1831m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f1832n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f1833o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f1834p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f1835q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f1836r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Typeface f1837s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Typeface f1838t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Typeface f1839u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Typeface f1840v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Typeface f1841w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Typeface f1842x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Typeface f1843y;
    public q1.a z;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1818f = 16;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1820g = 16;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f1822h = 15.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f1824i = 15.0f;
    public final TextUtils.TruncateAt A = TextUtils.TruncateAt.END;
    public final boolean E = true;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f1817e0 = 1;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f1819f0 = 1;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final float f1821g0 = 1.0f;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final int f1823h0 = 1;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f1825i0 = -1;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f1827j0 = -1;

    public b(TextInputLayout textInputLayout) {
        this.f1809a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.O = textPaint;
        this.P = new TextPaint(textPaint);
        this.f1814d = new Rect();
        this.c = new Rect();
        this.f1816e = new RectF();
        i(textInputLayout.getContext().getResources().getConfiguration());
    }

    public static int a(int i2, int i3, float f3) {
        float f4 = 1.0f - f3;
        return Color.argb(Math.round((Color.alpha(i3) * f3) + (Color.alpha(i2) * f4)), Math.round((Color.red(i3) * f3) + (Color.red(i2) * f4)), Math.round((Color.green(i3) * f3) + (Color.green(i2) * f4)), Math.round((Color.blue(i3) * f3) + (Color.blue(i2) * f4)));
    }

    public static float h(float f3, float f4, float f5, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f5 = timeInterpolator.getInterpolation(f5);
        }
        return d1.a.a(f3, f4, f5);
    }

    public final void b() {
        float f3 = this.f1811b;
        float f4 = this.c.left;
        Rect rect = this.f1814d;
        float fH = h(f4, rect.left, f3, this.Q);
        RectF rectF = this.f1816e;
        rectF.left = fH;
        rectF.top = h(this.f1831m, this.f1832n, f3, this.Q);
        rectF.right = h(r1.right, rect.right, f3, this.Q);
        rectF.bottom = h(r1.bottom, rect.bottom, f3, this.Q);
        this.f1835q = h(this.f1833o, this.f1834p, f3, this.Q);
        this.f1836r = h(this.f1831m, this.f1832n, f3, this.Q);
        d(f3, false);
        TextInputLayout textInputLayout = this.f1809a;
        textInputLayout.postInvalidateOnAnimation();
        r0.a aVar = d1.a.f833b;
        this.f1812b0 = 1.0f - h(0.0f, 1.0f, 1.0f - f3, aVar);
        textInputLayout.postInvalidateOnAnimation();
        this.f1813c0 = h(1.0f, 0.0f, f3, aVar);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f1828k;
        ColorStateList colorStateList2 = this.f1826j;
        TextPaint textPaint = this.O;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(g(colorStateList2), g(this.f1828k), f3));
        } else {
            textPaint.setColor(g(colorStateList));
        }
        float f5 = this.W;
        float f6 = this.X;
        if (f5 != f6) {
            textPaint.setLetterSpacing(h(f6, f5, f3, aVar));
        } else {
            textPaint.setLetterSpacing(f5);
        }
        this.H = d1.a.a(0.0f, this.S, f3);
        this.I = d1.a.a(0.0f, this.T, f3);
        this.J = d1.a.a(0.0f, this.U, f3);
        int iA = a(0, g(this.V), f3);
        this.K = iA;
        textPaint.setShadowLayer(this.H, this.I, this.J, iA);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final boolean c(CharSequence charSequence) {
        boolean z = this.f1809a.getLayoutDirection() == 1;
        if (this.E) {
            return (z ? d0.h.f831d : d0.h.c).b(charSequence.length(), charSequence);
        }
        return z;
    }

    public final void d(float f3, boolean z) {
        float f4;
        Typeface typeface;
        float f5;
        if (this.B == null) {
            return;
        }
        float fWidth = this.f1814d.width();
        float fWidth2 = this.c.width();
        if (Math.abs(f3 - 1.0f) < 1.0E-5f) {
            f4 = o() ? this.f1824i : this.f1822h;
            f5 = o() ? this.W : this.X;
            this.F = o() ? 1.0f : h(this.f1822h, this.f1824i, f3, this.R) / this.f1822h;
            if (!o()) {
                fWidth = fWidth2;
            }
            typeface = this.f1837s;
            fWidth2 = fWidth;
        } else {
            f4 = this.f1822h;
            float f6 = this.X;
            typeface = this.f1840v;
            if (Math.abs(f3 - 0.0f) < 1.0E-5f) {
                this.F = 1.0f;
            } else {
                this.F = h(this.f1822h, this.f1824i, f3, this.R) / this.f1822h;
            }
            float f7 = this.f1824i / this.f1822h;
            float f8 = fWidth2 * f7;
            if (!z && f8 > fWidth && o()) {
                fWidth2 = Math.min(fWidth / f7, fWidth2);
            }
            f5 = f6;
        }
        int i2 = f3 < 0.5f ? this.f1817e0 : this.f1819f0;
        TextPaint textPaint = this.O;
        if (fWidth2 > 0.0f) {
            boolean z2 = this.G != f4;
            boolean z3 = this.Y != f5;
            boolean z4 = this.f1843y != typeface;
            StaticLayout staticLayout = this.Z;
            boolean z5 = z2 || z3 || (staticLayout != null && (fWidth2 > ((float) staticLayout.getWidth()) ? 1 : (fWidth2 == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z4 || (this.L != i2) || this.N;
            this.G = f4;
            this.Y = f5;
            this.f1843y = typeface;
            this.N = false;
            this.L = i2;
            textPaint.setLinearText(this.F != 1.0f);
            z = z5;
        }
        if (this.C == null || z) {
            textPaint.setTextSize(this.G);
            textPaint.setTypeface(this.f1843y);
            textPaint.setLetterSpacing(this.Y);
            boolean zC = c(this.B);
            this.D = zC;
            StaticLayout staticLayoutE = e(((this.f1817e0 > 1 || this.f1819f0 > 1) && !zC) ? i2 : 1, textPaint, this.B, fWidth2 * (o() ? 1.0f : this.F), this.D);
            this.Z = staticLayoutE;
            this.C = staticLayoutE.getText();
        }
    }

    public final StaticLayout e(int i2, TextPaint textPaint, CharSequence charSequence, float f3, boolean z) {
        Layout.Alignment alignment;
        if (i2 == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(this.f1818f, this.D ? 1 : 0) & 7;
            alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.D ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.D ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
        }
        g gVar = new g(charSequence, textPaint, (int) f3);
        gVar.f1862l = this.A;
        gVar.f1861k = z;
        gVar.f1855e = alignment;
        gVar.f1860j = false;
        gVar.f1856f = i2;
        float f4 = this.f1821g0;
        gVar.f1857g = 0.0f;
        gVar.f1858h = f4;
        gVar.f1859i = this.f1823h0;
        gVar.f1863m = null;
        StaticLayout staticLayoutA = gVar.a();
        staticLayoutA.getClass();
        return staticLayoutA;
    }

    public final float f() {
        int i2 = this.f1825i0;
        if (i2 != -1) {
            return i2;
        }
        float f3 = this.f1824i;
        TextPaint textPaint = this.P;
        textPaint.setTextSize(f3);
        textPaint.setTypeface(this.f1837s);
        textPaint.setLetterSpacing(this.W);
        return -textPaint.ascent();
    }

    public final int g(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.M;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void i(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f1839u;
            if (typeface != null) {
                this.f1838t = a0.a.K(configuration, typeface);
            }
            Typeface typeface2 = this.f1842x;
            if (typeface2 != null) {
                this.f1841w = a0.a.K(configuration, typeface2);
            }
            Typeface typeface3 = this.f1838t;
            if (typeface3 == null) {
                typeface3 = this.f1839u;
            }
            this.f1837s = typeface3;
            Typeface typeface4 = this.f1841w;
            if (typeface4 == null) {
                typeface4 = this.f1842x;
            }
            this.f1840v = typeface4;
            j(true);
        }
    }

    public final void j(boolean z) {
        float fMeasureText;
        TextInputLayout textInputLayout = this.f1809a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z) {
            return;
        }
        d(1.0f, z);
        CharSequence charSequence = this.C;
        TextPaint textPaint = this.O;
        if (charSequence != null && this.Z != null) {
            this.f1815d0 = o() ? TextUtils.ellipsize(this.C, textPaint, this.Z.getWidth(), this.A) : this.C;
        }
        CharSequence charSequence2 = this.f1815d0;
        if (charSequence2 != null) {
            this.f1810a0 = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f1810a0 = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f1820g, this.D ? 1 : 0);
        int i2 = absoluteGravity & 112;
        Rect rect = this.f1814d;
        if (i2 == 48) {
            this.f1832n = rect.top;
        } else if (i2 != 80) {
            this.f1832n = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f1832n = textPaint.ascent() + rect.bottom;
        }
        int i3 = absoluteGravity & 8388615;
        if (i3 == 1) {
            this.f1834p = rect.centerX() - (this.f1810a0 / 2.0f);
        } else if (i3 != 5) {
            this.f1834p = rect.left;
        } else {
            this.f1834p = rect.right - this.f1810a0;
        }
        if (this.f1810a0 <= rect.width()) {
            float f3 = this.f1834p;
            float fMax = Math.max(0.0f, rect.left - f3) + f3;
            this.f1834p = fMax;
            this.f1834p = Math.min(0.0f, rect.right - (this.f1810a0 + fMax)) + fMax;
        }
        float f4 = this.f1824i;
        TextPaint textPaint2 = this.P;
        textPaint2.setTextSize(f4);
        textPaint2.setTypeface(this.f1837s);
        textPaint2.setLetterSpacing(this.W);
        if (textPaint2.descent() + (-textPaint2.ascent()) <= rect.height()) {
            float f5 = this.f1832n;
            float fMax2 = Math.max(0.0f, rect.top - f5) + f5;
            this.f1832n = fMax2;
            this.f1832n = Math.min(0.0f, rect.bottom - (f() + fMax2)) + fMax2;
        }
        d(0.0f, z);
        float height = this.Z != null ? r15.getHeight() : 0.0f;
        StaticLayout staticLayout = this.Z;
        if (staticLayout == null || this.f1817e0 <= 1) {
            CharSequence charSequence3 = this.C;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout.getWidth();
        }
        StaticLayout staticLayout2 = this.Z;
        this.f1830l = staticLayout2 != null ? staticLayout2.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f1818f, this.D ? 1 : 0);
        int i4 = absoluteGravity2 & 112;
        Rect rect2 = this.c;
        if (i4 == 48) {
            this.f1831m = rect2.top;
        } else if (i4 != 80) {
            this.f1831m = rect2.centerY() - (height / 2.0f);
        } else {
            this.f1831m = (rect2.bottom - height) + (this.f1829k0 ? textPaint.descent() : 0.0f);
        }
        int i5 = absoluteGravity2 & 8388615;
        if (i5 == 1) {
            this.f1833o = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i5 != 5) {
            this.f1833o = rect2.left;
        } else {
            this.f1833o = rect2.right - fMeasureText;
        }
        d(this.f1811b, false);
        textInputLayout.postInvalidateOnAnimation();
        b();
    }

    public final void k(ColorStateList colorStateList) {
        if (this.f1828k == colorStateList && this.f1826j == colorStateList) {
            return;
        }
        this.f1828k = colorStateList;
        this.f1826j = colorStateList;
        j(false);
    }

    public final boolean l(Typeface typeface) {
        q1.a aVar = this.z;
        if (aVar != null) {
            aVar.c = true;
        }
        if (this.f1839u == typeface) {
            return false;
        }
        this.f1839u = typeface;
        Typeface typefaceK = a0.a.K(this.f1809a.getContext().getResources().getConfiguration(), typeface);
        this.f1838t = typefaceK;
        if (typefaceK == null) {
            typefaceK = this.f1839u;
        }
        this.f1837s = typefaceK;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0005 A[PHI: r0
      0x0005: PHI (r0v4 float) = (r0v0 float), (r0v1 float) binds: [B:3:0x0003, B:6:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(float r3) {
        /*
            r2 = this;
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto L7
        L5:
            r3 = r0
            goto Le
        L7:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto Le
            goto L5
        Le:
            float r0 = r2.f1811b
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L19
            r2.f1811b = r3
            r2.b()
        L19:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.b.m(float):void");
    }

    public final void n(Typeface typeface) {
        boolean z;
        boolean zL = l(typeface);
        if (this.f1842x != typeface) {
            this.f1842x = typeface;
            Typeface typefaceK = a0.a.K(this.f1809a.getContext().getResources().getConfiguration(), typeface);
            this.f1841w = typefaceK;
            if (typefaceK == null) {
                typefaceK = this.f1842x;
            }
            this.f1840v = typefaceK;
            z = true;
        } else {
            z = false;
        }
        if (zL || z) {
            j(false);
        }
    }

    public final boolean o() {
        return this.f1819f0 == 1;
    }
}
