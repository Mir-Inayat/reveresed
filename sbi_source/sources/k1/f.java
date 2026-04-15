package k1;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import o1.h;
import o1.i;
import t1.k;
import t1.n;
import t1.o;
import t1.q;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class f extends k implements Drawable.Callback, h {
    public static final int[] O0 = {R.attr.state_enabled};
    public static final ShapeDrawable P0 = new ShapeDrawable(new OvalShape());
    public boolean A0;
    public int B0;
    public int C0;
    public ColorFilter D0;
    public PorterDuffColorFilter E0;
    public ColorStateList F0;
    public ColorStateList G;
    public PorterDuff.Mode G0;
    public ColorStateList H;
    public int[] H0;
    public float I;
    public ColorStateList I0;
    public float J;
    public WeakReference J0;
    public ColorStateList K;
    public TextUtils.TruncateAt K0;
    public float L;
    public boolean L0;
    public ColorStateList M;
    public int M0;
    public CharSequence N;
    public boolean N0;
    public boolean O;
    public Drawable P;
    public ColorStateList Q;
    public float R;
    public boolean S;
    public boolean T;
    public Drawable U;
    public RippleDrawable V;
    public ColorStateList W;
    public float X;
    public SpannableStringBuilder Y;
    public boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f1489a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public Drawable f1490b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public ColorStateList f1491c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public d1.b f1492d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public d1.b f1493e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public float f1494f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public float f1495g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public float f1496h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public float f1497i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public float f1498j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public float f1499k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public float f1500l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public float f1501m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final Context f1502n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final Paint f1503o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Paint.FontMetrics f1504p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final RectF f1505q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final PointF f1506r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Path f1507s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final i f1508t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f1509u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f1510v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f1511w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f1512x0;
    public int y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public int f1513z0;

    public f(Context context, AttributeSet attributeSet) {
        super(o.b(context, attributeSet, com.redhand.laugiytr.R.NP_MANAGER3.NP_MANAGER, com.redhand.laugiytr.R.NP_MANAGER15.NP_MANAGER).a());
        this.J = -1.0f;
        this.f1503o0 = new Paint(1);
        this.f1504p0 = new Paint.FontMetrics();
        this.f1505q0 = new RectF();
        this.f1506r0 = new PointF();
        this.f1507s0 = new Path();
        this.C0 = 255;
        this.G0 = PorterDuff.Mode.SRC_IN;
        this.J0 = new WeakReference(null);
        k(context);
        this.f1502n0 = context;
        i iVar = new i(this);
        this.f1508t0 = iVar;
        this.N = "";
        iVar.f1864a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = O0;
        setState(iArr);
        R(iArr);
        this.L0 = true;
        P0.setTint(-1);
    }

    public static void b0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean y(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean z(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A() {
        e eVar = (e) this.J0.get();
        if (eVar != null) {
            Chip chip = (Chip) eVar;
            chip.b(chip.f623p);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean B(int[] r10, int[] r11) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.f.B(int[], int[]):boolean");
    }

    public final void C(boolean z) {
        if (this.Z != z) {
            this.Z = z;
            float fV = v();
            if (!z && this.A0) {
                this.A0 = false;
            }
            float fV2 = v();
            invalidateSelf();
            if (fV != fV2) {
                A();
            }
        }
    }

    public final void D(Drawable drawable) {
        if (this.f1490b0 != drawable) {
            float fV = v();
            this.f1490b0 = drawable;
            float fV2 = v();
            b0(this.f1490b0);
            t(this.f1490b0);
            invalidateSelf();
            if (fV != fV2) {
                A();
            }
        }
    }

    public final void E(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f1491c0 != colorStateList) {
            this.f1491c0 = colorStateList;
            if (this.f1489a0 && (drawable = this.f1490b0) != null && this.Z) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void F(boolean z) {
        if (this.f1489a0 != z) {
            boolean zY = Y();
            this.f1489a0 = z;
            boolean zY2 = Y();
            if (zY != zY2) {
                if (zY2) {
                    t(this.f1490b0);
                } else {
                    b0(this.f1490b0);
                }
                invalidateSelf();
                A();
            }
        }
    }

    public final void G(float f3) {
        if (this.J != f3) {
            this.J = f3;
            n nVarF = this.f2205b.f2187a.f();
            nVarF.f2232e = new t1.a(f3);
            nVarF.f2233f = new t1.a(f3);
            nVarF.f2234g = new t1.a(f3);
            nVarF.f2235h = new t1.a(f3);
            setShapeAppearanceModel(nVarF.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final void H(Drawable drawable) {
        ?? r02;
        Object obj = this.P;
        if (obj != null) {
            boolean z = obj instanceof y.d;
            r02 = obj;
            if (z) {
                r02 = 0;
            }
        } else {
            r02 = 0;
        }
        if (r02 != drawable) {
            float fV = v();
            this.P = drawable != null ? drawable.mutate() : null;
            float fV2 = v();
            b0(r02);
            if (Z()) {
                t(this.P);
            }
            invalidateSelf();
            if (fV != fV2) {
                A();
            }
        }
    }

    public final void I(float f3) {
        if (this.R != f3) {
            float fV = v();
            this.R = f3;
            float fV2 = v();
            invalidateSelf();
            if (fV != fV2) {
                A();
            }
        }
    }

    public final void J(ColorStateList colorStateList) {
        this.S = true;
        if (this.Q != colorStateList) {
            this.Q = colorStateList;
            if (Z()) {
                this.P.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void K(boolean z) {
        if (this.O != z) {
            boolean Z = Z();
            this.O = z;
            boolean Z2 = Z();
            if (Z != Z2) {
                if (Z2) {
                    t(this.P);
                } else {
                    b0(this.P);
                }
                invalidateSelf();
                A();
            }
        }
    }

    public final void L(ColorStateList colorStateList) {
        if (this.K != colorStateList) {
            this.K = colorStateList;
            if (this.N0) {
                t1.i iVar = this.f2205b;
                if (iVar.f2190e != colorStateList) {
                    iVar.f2190e = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void M(float f3) {
        if (this.L != f3) {
            this.L = f3;
            this.f1503o0.setStrokeWidth(f3);
            if (this.N0) {
                this.f2205b.f2196k = f3;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final void N(Drawable drawable) {
        ?? r02;
        Object obj = this.U;
        if (obj != null) {
            boolean z = obj instanceof y.d;
            r02 = obj;
            if (z) {
                r02 = 0;
            }
        } else {
            r02 = 0;
        }
        if (r02 != drawable) {
            float fW = w();
            this.U = drawable != null ? drawable.mutate() : null;
            this.V = new RippleDrawable(r1.a.a(this.M), this.U, P0);
            float fW2 = w();
            b0(r02);
            if (a0()) {
                t(this.U);
            }
            invalidateSelf();
            if (fW != fW2) {
                A();
            }
        }
    }

    public final void O(float f3) {
        if (this.f1500l0 != f3) {
            this.f1500l0 = f3;
            invalidateSelf();
            if (a0()) {
                A();
            }
        }
    }

    public final void P(float f3) {
        if (this.X != f3) {
            this.X = f3;
            invalidateSelf();
            if (a0()) {
                A();
            }
        }
    }

    public final void Q(float f3) {
        if (this.f1499k0 != f3) {
            this.f1499k0 = f3;
            invalidateSelf();
            if (a0()) {
                A();
            }
        }
    }

    public final boolean R(int[] iArr) {
        if (Arrays.equals(this.H0, iArr)) {
            return false;
        }
        this.H0 = iArr;
        if (a0()) {
            return B(getState(), iArr);
        }
        return false;
    }

    public final void S(ColorStateList colorStateList) {
        if (this.W != colorStateList) {
            this.W = colorStateList;
            if (a0()) {
                this.U.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void T(boolean z) {
        if (this.T != z) {
            boolean zA0 = a0();
            this.T = z;
            boolean zA02 = a0();
            if (zA0 != zA02) {
                if (zA02) {
                    t(this.U);
                } else {
                    b0(this.U);
                }
                invalidateSelf();
                A();
            }
        }
    }

    public final void U(float f3) {
        if (this.f1496h0 != f3) {
            float fV = v();
            this.f1496h0 = f3;
            float fV2 = v();
            invalidateSelf();
            if (fV != fV2) {
                A();
            }
        }
    }

    public final void V(float f3) {
        if (this.f1495g0 != f3) {
            float fV = v();
            this.f1495g0 = f3;
            float fV2 = v();
            invalidateSelf();
            if (fV != fV2) {
                A();
            }
        }
    }

    public final void W(ColorStateList colorStateList) {
        if (this.M != colorStateList) {
            this.M = colorStateList;
            this.I0 = null;
            onStateChange(getState());
        }
    }

    public final void X(q1.d dVar) {
        i iVar = this.f1508t0;
        b bVar = iVar.f1865b;
        TextPaint textPaint = iVar.f1864a;
        if (iVar.f1868f != dVar) {
            iVar.f1868f = dVar;
            if (dVar != null) {
                Context context = this.f1502n0;
                dVar.e(context, textPaint, bVar);
                h hVar = (h) iVar.f1867e.get();
                if (hVar != null) {
                    textPaint.drawableState = hVar.getState();
                }
                dVar.d(context, textPaint, bVar);
                iVar.f1866d = true;
            }
            h hVar2 = (h) iVar.f1867e.get();
            if (hVar2 != null) {
                f fVar = (f) hVar2;
                fVar.A();
                fVar.invalidateSelf();
                fVar.onStateChange(hVar2.getState());
            }
        }
    }

    public final boolean Y() {
        return this.f1489a0 && this.f1490b0 != null && this.A0;
    }

    public final boolean Z() {
        return this.O && this.P != null;
    }

    public final boolean a0() {
        return this.T && this.U != null;
    }

    @Override // t1.k, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i2;
        Canvas canvas2;
        int iSaveLayerAlpha;
        float f3;
        int i3;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i2 = this.C0) == 0) {
            return;
        }
        if (i2 < 255) {
            canvas2 = canvas;
            iSaveLayerAlpha = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i2);
        } else {
            canvas2 = canvas;
            iSaveLayerAlpha = 0;
        }
        boolean z = this.N0;
        Paint paint = this.f1503o0;
        RectF rectF = this.f1505q0;
        if (!z) {
            paint.setColor(this.f1509u0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, x(), x(), paint);
        }
        if (!this.N0) {
            paint.setColor(this.f1510v0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.D0;
            if (colorFilter == null) {
                colorFilter = this.E0;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, x(), x(), paint);
        }
        if (this.N0) {
            super.draw(canvas);
        }
        if (this.L > 0.0f && !this.N0) {
            paint.setColor(this.f1512x0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.N0) {
                ColorFilter colorFilter2 = this.D0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.E0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f4 = bounds.left;
            float f5 = this.L / 2.0f;
            rectF.set(f4 + f5, bounds.top + f5, bounds.right - f5, bounds.bottom - f5);
            float f6 = this.J - (this.L / 2.0f);
            canvas2.drawRoundRect(rectF, f6, f6, paint);
        }
        paint.setColor(this.y0);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.N0) {
            RectF rectF2 = new RectF(bounds);
            t1.i iVar = this.f2205b;
            o oVar = iVar.f2187a;
            float[] fArr = this.B;
            float f7 = iVar.f2195j;
            t1.h hVar = this.f2220r;
            q qVar = this.f2221s;
            f3 = 2.0f;
            Path path = this.f1507s0;
            qVar.a(oVar, fArr, f7, rectF2, hVar, path);
            e(canvas2, paint, path, this.f2205b.f2187a, this.B, g());
        } else {
            canvas2.drawRoundRect(rectF, x(), x(), paint);
            f3 = 2.0f;
        }
        if (Z()) {
            u(bounds, rectF);
            float f8 = rectF.left;
            float f9 = rectF.top;
            canvas2.translate(f8, f9);
            this.P.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.P.draw(canvas2);
            canvas2.translate(-f8, -f9);
        }
        if (Y()) {
            u(bounds, rectF);
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas2.translate(f10, f11);
            this.f1490b0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f1490b0.draw(canvas2);
            canvas2.translate(-f10, -f11);
        }
        if (this.L0 && this.N != null) {
            PointF pointF = this.f1506r0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.N;
            i iVar2 = this.f1508t0;
            if (charSequence != null) {
                float fV = v() + this.f1494f0 + this.f1497i0;
                if (y.b.a(this) == 0) {
                    pointF.x = bounds.left + fV;
                } else {
                    pointF.x = bounds.right - fV;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = iVar2.f1864a;
                Paint.FontMetrics fontMetrics = this.f1504p0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / f3);
            }
            rectF.setEmpty();
            if (this.N != null) {
                float fV2 = v() + this.f1494f0 + this.f1497i0;
                float fW = w() + this.f1501m0 + this.f1498j0;
                if (y.b.a(this) == 0) {
                    rectF.left = bounds.left + fV2;
                    rectF.right = bounds.right - fW;
                } else {
                    rectF.left = bounds.left + fW;
                    rectF.right = bounds.right - fV2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            q1.d dVar = iVar2.f1868f;
            TextPaint textPaint2 = iVar2.f1864a;
            if (dVar != null) {
                textPaint2.drawableState = getState();
                iVar2.f1868f.d(this.f1502n0, textPaint2, iVar2.f1865b);
            }
            textPaint2.setTextAlign(align);
            boolean z2 = Math.round(iVar2.a(this.N.toString())) > Math.round(rectF.width());
            if (z2) {
                int iSave = canvas2.save();
                canvas2.clipRect(rectF);
                i3 = iSave;
            } else {
                i3 = 0;
            }
            CharSequence charSequenceEllipsize = this.N;
            if (z2 && this.K0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF.width(), this.K0);
            }
            canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z2) {
                canvas2.restoreToCount(i3);
            }
        }
        if (a0()) {
            rectF.setEmpty();
            if (a0()) {
                float f12 = this.f1501m0 + this.f1500l0;
                if (y.b.a(this) == 0) {
                    float f13 = bounds.right - f12;
                    rectF.right = f13;
                    rectF.left = f13 - this.X;
                } else {
                    float f14 = bounds.left + f12;
                    rectF.left = f14;
                    rectF.right = f14 + this.X;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f15 = this.X;
                float f16 = fExactCenterY - (f15 / f3);
                rectF.top = f16;
                rectF.bottom = f16 + f15;
            }
            float f17 = rectF.left;
            float f18 = rectF.top;
            canvas2.translate(f17, f18);
            this.U.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.V.setBounds(this.U.getBounds());
            this.V.jumpToCurrentState();
            this.V.draw(canvas2);
            canvas2.translate(-f17, -f18);
        }
        if (this.C0 < 255) {
            canvas2.restoreToCount(iSaveLayerAlpha);
        }
    }

    @Override // t1.k, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.C0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.D0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.I;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(w() + this.f1508t0.a(this.N.toString()) + v() + this.f1494f0 + this.f1497i0 + this.f1498j0 + this.f1501m0), this.M0);
    }

    @Override // t1.k, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // t1.k, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.N0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.I, this.J);
        } else {
            outline.setRoundRect(bounds, this.J);
            outline2 = outline;
        }
        outline2.setAlpha(this.C0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // t1.k, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (y(this.G) || y(this.H) || y(this.K)) {
            return true;
        }
        q1.d dVar = this.f1508t0.f1868f;
        if (dVar == null || (colorStateList = dVar.f2070k) == null || !colorStateList.isStateful()) {
            return (this.f1489a0 && this.f1490b0 != null && this.Z) || z(this.P) || z(this.f1490b0) || y(this.F0);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i2) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i2);
        if (Z()) {
            zOnLayoutDirectionChanged |= y.b.b(this.P, i2);
        }
        if (Y()) {
            zOnLayoutDirectionChanged |= y.b.b(this.f1490b0, i2);
        }
        if (a0()) {
            zOnLayoutDirectionChanged |= y.b.b(this.U, i2);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i2) {
        boolean zOnLevelChange = super.onLevelChange(i2);
        if (Z()) {
            zOnLevelChange |= this.P.setLevel(i2);
        }
        if (Y()) {
            zOnLevelChange |= this.f1490b0.setLevel(i2);
        }
        if (a0()) {
            zOnLevelChange |= this.U.setLevel(i2);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // t1.k, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.N0) {
            super.onStateChange(iArr);
        }
        return B(iArr, this.H0);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    @Override // t1.k, android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        if (this.C0 != i2) {
            this.C0 = i2;
            invalidateSelf();
        }
    }

    @Override // t1.k, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.D0 != colorFilter) {
            this.D0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // t1.k, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.F0 != colorStateList) {
            this.F0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // t1.k, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.G0 != mode) {
            this.G0 = mode;
            ColorStateList colorStateList = this.F0;
            this.E0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (Z()) {
            visible |= this.P.setVisible(z, z2);
        }
        if (Y()) {
            visible |= this.f1490b0.setVisible(z, z2);
        }
        if (a0()) {
            visible |= this.U.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void t(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        y.b.b(drawable, y.b.a(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.U) {
            if (drawable.isStateful()) {
                drawable.setState(this.H0);
            }
            drawable.setTintList(this.W);
            return;
        }
        Drawable drawable2 = this.P;
        if (drawable == drawable2 && this.S) {
            drawable2.setTintList(this.Q);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void u(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (Z() || Y()) {
            float f3 = this.f1494f0 + this.f1495g0;
            Drawable drawable = this.A0 ? this.f1490b0 : this.P;
            float intrinsicWidth = this.R;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (y.b.a(this) == 0) {
                float f4 = rect.left + f3;
                rectF.left = f4;
                rectF.right = f4 + intrinsicWidth;
            } else {
                float f5 = rect.right - f3;
                rectF.right = f5;
                rectF.left = f5 - intrinsicWidth;
            }
            Drawable drawable2 = this.A0 ? this.f1490b0 : this.P;
            float fCeil = this.R;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f1502n0.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final float v() {
        if (!Z() && !Y()) {
            return 0.0f;
        }
        float f3 = this.f1495g0;
        Drawable drawable = this.A0 ? this.f1490b0 : this.P;
        float intrinsicWidth = this.R;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f3 + this.f1496h0;
    }

    public final float w() {
        if (a0()) {
            return this.f1499k0 + this.X + this.f1500l0;
        }
        return 0.0f;
    }

    public final float x() {
        if (!this.N0) {
            return this.J;
        }
        float[] fArr = this.B;
        return fArr != null ? fArr[3] : this.f2205b.f2187a.f2243e.a(g());
    }
}
