package k0;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import f.a1;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class g implements View.OnTouchListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f1461r = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f1462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f1463b;
    public final a1 c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.fragment.app.b f1464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f1465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f1466f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f1467g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f1468h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f1469i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f1470j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float[] f1471k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1472l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f1473m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f1474n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1475o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f1476p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a1 f1477q;

    public g(a1 a1Var) {
        a aVar = new a();
        aVar.f1456e = Long.MIN_VALUE;
        aVar.f1458g = -1L;
        aVar.f1457f = 0L;
        this.f1462a = aVar;
        this.f1463b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f1465e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f1466f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f1469i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f1470j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f1471k = fArr5;
        this.c = a1Var;
        float f3 = Resources.getSystem().getDisplayMetrics().density;
        float f4 = ((int) ((1575.0f * f3) + 0.5f)) / 1000.0f;
        fArr5[0] = f4;
        fArr5[1] = f4;
        float f5 = ((int) ((f3 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f5;
        fArr4[1] = f5;
        this.f1467g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f1468h = f1461r;
        aVar.f1453a = 500;
        aVar.f1454b = 500;
        this.f1477q = a1Var;
    }

    public static float b(float f3, float f4, float f5) {
        return f3 > f5 ? f5 : f3 < f4 ? f4 : f3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f1465e
            r0 = r0[r4]
            float[] r1 = r3.f1466f
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.c(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f1463b
            if (r6 >= 0) goto L25
            float r5 = -r5
            float r5 = r0.getInterpolation(r5)
            float r5 = -r5
            goto L2d
        L25:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L36
            float r5 = r0.getInterpolation(r5)
        L2d:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = b(r5, r6, r0)
            goto L37
        L36:
            r5 = r2
        L37:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.f1469i
            r0 = r0[r4]
            float[] r1 = r3.f1470j
            r1 = r1[r4]
            float[] r2 = r3.f1471k
            r4 = r2[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L51
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            return r4
        L51:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.g.a(int, float, float, float):float");
    }

    public final float c(float f3, float f4) {
        if (f4 != 0.0f) {
            int i2 = this.f1467g;
            if (i2 == 0 || i2 == 1) {
                if (f3 < f4) {
                    if (f3 >= 0.0f) {
                        return 1.0f - (f3 / f4);
                    }
                    if (this.f1475o && i2 == 1) {
                        return 1.0f;
                    }
                }
            } else if (i2 == 2 && f3 < 0.0f) {
                return f3 / (-f4);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i2 = 0;
        if (this.f1473m) {
            this.f1475o = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        a aVar = this.f1462a;
        int i3 = (int) (jCurrentAnimationTimeMillis - aVar.f1456e);
        int i4 = aVar.f1454b;
        if (i3 > i4) {
            i2 = i4;
        } else if (i3 >= 0) {
            i2 = i3;
        }
        aVar.f1460i = i2;
        aVar.f1459h = aVar.a(jCurrentAnimationTimeMillis);
        aVar.f1458g = jCurrentAnimationTimeMillis;
    }

    public final boolean e() {
        a1 a1Var;
        int count;
        a aVar = this.f1462a;
        float f3 = aVar.f1455d;
        int iAbs = (int) (f3 / Math.abs(f3));
        Math.abs(aVar.c);
        if (iAbs != 0 && (count = (a1Var = this.f1477q).getCount()) != 0) {
            int childCount = a1Var.getChildCount();
            int firstVisiblePosition = a1Var.getFirstVisiblePosition();
            int i2 = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && a1Var.getChildAt(0).getTop() >= 0)) : !(i2 >= count && a1Var.getChildAt(childCount - 1).getBottom() <= a1Var.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.f1476p
            r1 = 0
            if (r0 != 0) goto L7
            goto L7d
        L7:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            r3 = 2
            if (r0 == r3) goto L1f
            r8 = 3
            if (r0 == r8) goto L17
            goto L7d
        L17:
            r7.d()
            return r1
        L1b:
            r7.f1474n = r2
            r7.f1472l = r1
        L1f:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            f.a1 r4 = r7.c
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r1, r0, r3, r5)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r2, r9, r8, r3)
            k0.a r9 = r7.f1462a
            r9.c = r0
            r9.f1455d = r8
            boolean r8 = r7.f1475o
            if (r8 != 0) goto L7d
            boolean r8 = r7.e()
            if (r8 == 0) goto L7d
            androidx.fragment.app.b r8 = r7.f1464d
            if (r8 != 0) goto L61
            androidx.fragment.app.b r8 = new androidx.fragment.app.b
            r9 = 6
            r8.<init>(r9, r7)
            r7.f1464d = r8
        L61:
            r7.f1475o = r2
            r7.f1473m = r2
            boolean r8 = r7.f1472l
            if (r8 != 0) goto L76
            int r8 = r7.f1468h
            if (r8 <= 0) goto L76
            androidx.fragment.app.b r9 = r7.f1464d
            long r5 = (long) r8
            java.lang.reflect.Field r8 = f0.m0.f1276a
            r4.postOnAnimationDelayed(r9, r5)
            goto L7b
        L76:
            androidx.fragment.app.b r8 = r7.f1464d
            r8.run()
        L7b:
            r7.f1472l = r2
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.g.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
