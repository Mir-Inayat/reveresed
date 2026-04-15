package t1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.util.StateSet;
import java.util.BitSet;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class k extends Drawable implements z {
    public static final Paint E;
    public static final j[] F;
    public final n0.e[] A;
    public float[] B;
    public float[] C;
    public i1.a D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f2204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f2205b;
    public final x[] c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x[] f2206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BitSet f2207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2208f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2209g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Matrix f2210h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Path f2211i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Path f2212j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final RectF f2213k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RectF f2214l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Region f2215m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Region f2216n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Paint f2217o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Paint f2218p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final s1.a f2219q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final h f2220r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final q f2221s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public PorterDuffColorFilter f2222t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public PorterDuffColorFilter f2223u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final RectF f2224v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f2225w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f2226x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public o f2227y;
    public n0.f z;

    static {
        Paint paint = new Paint(1);
        E = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        F = new j[4];
        int i2 = 0;
        while (true) {
            j[] jVarArr = F;
            if (i2 >= jVarArr.length) {
                return;
            }
            jVarArr[i2] = new j(i2);
            i2++;
        }
    }

    public k() {
        this(new o());
    }

    public static float b(RectF rectF, o oVar, float[] fArr) {
        if (fArr == null) {
            if (oVar.e(rectF)) {
                return oVar.f2243e.a(rectF);
            }
            return -1.0f;
        }
        if (fArr.length > 1) {
            float f3 = fArr[0];
            for (int i2 = 1; i2 < fArr.length; i2++) {
                if (fArr[i2] != f3) {
                    return -1.0f;
                }
            }
        }
        if (oVar.d()) {
            return fArr[0];
        }
        return -1.0f;
    }

    public final void a(RectF rectF, Path path) {
        i iVar = this.f2205b;
        this.f2221s.a(iVar.f2187a, this.B, iVar.f2195j, rectF, this.f2220r, path);
        if (this.f2205b.f2194i != 1.0f) {
            Matrix matrix = this.f2210h;
            matrix.reset();
            float f3 = this.f2205b.f2194i;
            matrix.setScale(f3, f3, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f2224v, true);
    }

    public final int c(int i2) {
        int i3;
        i iVar = this.f2205b;
        float f3 = iVar.f2199n + 0.0f + iVar.f2198m;
        n1.a aVar = iVar.c;
        if (aVar == null || !aVar.f1752a || x.a.d(i2, 255) != aVar.f1754d) {
            return i2;
        }
        float fMin = (aVar.f1755e <= 0.0f || f3 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f3 / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i2);
        int I = a0.a.I(x.a.d(i2, 255), aVar.f1753b, fMin);
        if (fMin > 0.0f && (i3 = aVar.c) != 0) {
            I = x.a.b(x.a.d(i3, n1.a.f1751f), I);
        }
        return x.a.d(I, iAlpha);
    }

    public final void d(Canvas canvas) {
        if (this.f2207e.cardinality() > 0) {
            Log.w("k", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i2 = this.f2205b.f2201p;
        Path path = this.f2211i;
        s1.a aVar = this.f2219q;
        if (i2 != 0) {
            canvas.drawPath(path, aVar.f2109a);
        }
        for (int i3 = 0; i3 < 4; i3++) {
            x xVar = this.c[i3];
            int i4 = this.f2205b.f2200o;
            Matrix matrix = x.f2274b;
            xVar.a(matrix, aVar, i4, canvas);
            this.f2206d[i3].a(matrix, aVar, this.f2205b.f2200o, canvas);
        }
        if (this.f2225w) {
            double d3 = 0;
            int iSin = (int) (Math.sin(Math.toRadians(d3)) * ((double) this.f2205b.f2201p));
            int iCos = (int) (Math.cos(Math.toRadians(d3)) * ((double) this.f2205b.f2201p));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, E);
            canvas.translate(iSin, iCos);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0097 A[EDGE_INSN: B:64:0x0097->B:30:0x0097 BREAK  A[LOOP:1: B:21:0x007e->B:26:0x0088]] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r20) {
        /*
            Method dump skipped, instruction units count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.k.draw(android.graphics.Canvas):void");
    }

    public final void e(Canvas canvas, Paint paint, Path path, o oVar, float[] fArr, RectF rectF) {
        float fB = b(rectF, oVar, fArr);
        if (fB < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f3 = fB * this.f2205b.f2195j;
            canvas.drawRoundRect(rectF, f3, f3, paint);
        }
    }

    public void f(Canvas canvas) {
        o oVar = this.f2227y;
        float[] fArr = this.C;
        RectF rectFG = g();
        RectF rectF = this.f2214l;
        rectF.set(rectFG);
        float fI = i();
        rectF.inset(fI, fI);
        e(canvas, this.f2218p, this.f2212j, oVar, fArr, rectF);
    }

    public final RectF g() {
        Rect bounds = getBounds();
        RectF rectF = this.f2213k;
        rectF.set(bounds);
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f2205b.f2197l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f2205b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f2205b.getClass();
        RectF rectFG = g();
        if (rectFG.isEmpty()) {
            return;
        }
        float fB = b(rectFG, this.f2205b.f2187a, this.B);
        if (fB >= 0.0f) {
            outline.setRoundRect(getBounds(), fB * this.f2205b.f2195j);
            return;
        }
        boolean z = this.f2208f;
        Path path = this.f2211i;
        if (z) {
            a(rectFG, path);
            this.f2208f = false;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            m1.b.a(outline, path);
            return;
        }
        if (i2 >= 29) {
            try {
                m1.a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            m1.a.a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f2205b.f2193h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f2215m;
        region.set(bounds);
        RectF rectFG = g();
        Path path = this.f2211i;
        a(rectFG, path);
        Region region2 = this.f2216n;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final float h() {
        float[] fArr = this.B;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF rectFG = g();
        o oVar = this.f2205b.f2187a;
        q qVar = this.f2221s;
        qVar.getClass();
        float fA = oVar.f2243e.a(rectFG);
        o oVar2 = this.f2205b.f2187a;
        qVar.getClass();
        float fA2 = oVar2.f2246h.a(rectFG) + fA;
        o oVar3 = this.f2205b.f2187a;
        qVar.getClass();
        float fA3 = fA2 - oVar3.f2245g.a(rectFG);
        o oVar4 = this.f2205b.f2187a;
        qVar.getClass();
        return (fA3 - oVar4.f2244f.a(rectFG)) / 2.0f;
    }

    public final float i() {
        if (j()) {
            return this.f2218p.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f2208f = true;
        this.f2209g = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f2205b.f2191f;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.f2205b.getClass();
        ColorStateList colorStateList2 = this.f2205b.f2190e;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f2205b.f2189d;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        c0 c0Var = this.f2205b.f2188b;
        return c0Var != null && c0Var.d();
    }

    public final boolean j() {
        Paint.Style style = this.f2205b.f2202q;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f2218p.getStrokeWidth() > 0.0f;
    }

    public final void k(Context context) {
        this.f2205b.c = new n1.a(context);
        s();
    }

    public final void l(n0.f fVar) {
        if (this.z == fVar) {
            return;
        }
        this.z = fVar;
        int i2 = 0;
        while (true) {
            n0.e[] eVarArr = this.A;
            if (i2 >= eVarArr.length) {
                q(getState(), true);
                invalidateSelf();
                return;
            }
            if (eVarArr[i2] == null) {
                eVarArr[i2] = new n0.e(this, F[i2]);
            }
            n0.e eVar = eVarArr[i2];
            n0.f fVar2 = new n0.f();
            float f3 = (float) fVar.f1743b;
            if (f3 < 0.0f) {
                throw new IllegalArgumentException("Damping ratio must be non-negative");
            }
            fVar2.f1743b = f3;
            fVar2.c = false;
            double d3 = fVar.f1742a;
            float f4 = (float) (d3 * d3);
            if (f4 <= 0.0f) {
                throw new IllegalArgumentException("Spring stiffness constant must be positive.");
            }
            fVar2.f1742a = Math.sqrt(f4);
            fVar2.c = false;
            eVar.f1739j = fVar2;
            i2++;
        }
    }

    public final void m(float f3) {
        i iVar = this.f2205b;
        if (iVar.f2199n != f3) {
            iVar.f2199n = f3;
            s();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f2205b = new i(this.f2205b);
        return this;
    }

    public final void n(ColorStateList colorStateList) {
        i iVar = this.f2205b;
        if (iVar.f2189d != colorStateList) {
            iVar.f2189d = colorStateList;
            onStateChange(getState());
        }
    }

    public final void o(c0 c0Var) {
        i iVar = this.f2205b;
        if (iVar.f2188b != c0Var) {
            iVar.f2188b = c0Var;
            q(getState(), true);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f2208f = true;
        this.f2209g = true;
        super.onBoundsChange(rect);
        if (this.f2205b.f2188b != null && !rect.isEmpty()) {
            q(getState(), this.f2226x);
        }
        this.f2226x = rect.isEmpty();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.f2205b.f2188b != null) {
            q(iArr, false);
        }
        boolean z = p(iArr) || r();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public final boolean p(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f2205b.f2189d == null || color2 == (colorForState2 = this.f2205b.f2189d.getColorForState(iArr, (color2 = (paint2 = this.f2217o).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.f2205b.f2190e == null || color == (colorForState = this.f2205b.f2190e.getColorForState(iArr, (color = (paint = this.f2218p).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final void q(int[] iArr, boolean z) {
        o oVarA;
        int i2;
        RectF rectFG = g();
        if (this.f2205b.f2188b == null || rectFG.isEmpty()) {
            return;
        }
        boolean z2 = z | (this.z == null);
        if (this.B == null) {
            this.B = new float[4];
        }
        c0 c0Var = this.f2205b.f2188b;
        o[] oVarArr = c0Var.f2169d;
        int i3 = c0Var.f2167a;
        int[][] iArr2 = c0Var.c;
        a0 a0Var = c0Var.f2173h;
        a0 a0Var2 = c0Var.f2172g;
        a0 a0Var3 = c0Var.f2171f;
        a0 a0Var4 = c0Var.f2170e;
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                i4 = -1;
                break;
            } else if (StateSet.stateSetMatches(iArr2[i4], iArr)) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int i5 = 0;
            while (true) {
                if (i5 >= i3) {
                    i2 = -1;
                    break;
                } else {
                    if (StateSet.stateSetMatches(iArr2[i5], iArr3)) {
                        i2 = i5;
                        break;
                    }
                    i5++;
                }
            }
            i4 = i2;
        }
        if (a0Var4 == null && a0Var3 == null && a0Var2 == null && a0Var == null) {
            oVarA = oVarArr[i4];
        } else {
            n nVarF = oVarArr[i4].f();
            if (a0Var4 != null) {
                nVarF.f2232e = a0Var4.c(iArr);
            }
            if (a0Var3 != null) {
                nVarF.f2233f = a0Var3.c(iArr);
            }
            if (a0Var2 != null) {
                nVarF.f2235h = a0Var2.c(iArr);
            }
            if (a0Var != null) {
                nVarF.f2234g = a0Var.c(iArr);
            }
            oVarA = nVarF.a();
        }
        int i6 = 0;
        while (i6 < 4) {
            this.f2221s.getClass();
            float fA = (i6 != 1 ? i6 != 2 ? i6 != 3 ? oVarA.f2244f : oVarA.f2243e : oVarA.f2246h : oVarA.f2245g).a(rectFG);
            if (z2) {
                this.B[i6] = fA;
            }
            n0.e[] eVarArr = this.A;
            n0.e eVar = eVarArr[i6];
            if (eVar != null) {
                eVar.a(fA);
                if (z2) {
                    eVarArr[i6].d();
                }
            }
            i6++;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    public final boolean r() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f2222t;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f2223u;
        i iVar = this.f2205b;
        ColorStateList colorStateList = iVar.f2191f;
        PorterDuff.Mode mode = iVar.f2192g;
        if (colorStateList == null || mode == null) {
            int color = this.f2217o.getColor();
            int iC = c(color);
            porterDuffColorFilter = iC != color ? new PorterDuffColorFilter(iC, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(c(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f2222t = porterDuffColorFilter;
        this.f2205b.getClass();
        this.f2223u = null;
        this.f2205b.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f2222t) && Objects.equals(porterDuffColorFilter3, this.f2223u)) ? false : true;
    }

    public final void s() {
        i iVar = this.f2205b;
        float f3 = iVar.f2199n + 0.0f;
        iVar.f2200o = (int) Math.ceil(0.75f * f3);
        this.f2205b.f2201p = (int) Math.ceil(f3 * 0.25f);
        r();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        i iVar = this.f2205b;
        if (iVar.f2197l != i2) {
            iVar.f2197l = i2;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f2205b.getClass();
        super.invalidateSelf();
    }

    @Override // t1.z
    public final void setShapeAppearanceModel(o oVar) {
        i iVar = this.f2205b;
        iVar.f2187a = oVar;
        iVar.f2188b = null;
        this.B = null;
        this.C = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f2205b.f2191f = colorStateList;
        r();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        i iVar = this.f2205b;
        if (iVar.f2192g != mode) {
            iVar.f2192g = mode;
            r();
            super.invalidateSelf();
        }
    }

    public k(o oVar) {
        this(new i(oVar));
    }

    public k(i iVar) {
        q qVar;
        this.f2204a = new h(this);
        this.c = new x[4];
        this.f2206d = new x[4];
        this.f2207e = new BitSet(8);
        this.f2210h = new Matrix();
        this.f2211i = new Path();
        this.f2212j = new Path();
        this.f2213k = new RectF();
        this.f2214l = new RectF();
        this.f2215m = new Region();
        this.f2216n = new Region();
        Paint paint = new Paint(1);
        this.f2217o = paint;
        Paint paint2 = new Paint(1);
        this.f2218p = paint2;
        this.f2219q = new s1.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            qVar = p.f2251a;
        } else {
            qVar = new q();
        }
        this.f2221s = qVar;
        this.f2224v = new RectF();
        this.f2225w = true;
        this.f2226x = true;
        this.A = new n0.e[4];
        this.f2205b = iVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        r();
        p(getState());
        this.f2220r = new h(this);
    }
}
