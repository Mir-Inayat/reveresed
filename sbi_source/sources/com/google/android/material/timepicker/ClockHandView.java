package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.redhand.laugiytr.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
class ClockHandView extends View {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f731n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ValueAnimator f732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f733b;
    public final ArrayList c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f736f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RectF f737g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f738h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f739i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f740j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public double f741k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f742l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f743m;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.NP_MANAGER3.NP_MANAGER);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f732a = valueAnimator;
        this.c = new ArrayList();
        Paint paint = new Paint();
        this.f736f = paint;
        this.f737g = new RectF();
        this.f743m = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c1.a.f495e, R.NP_MANAGER3.NP_MANAGER, R.NP_MANAGER15.NP_MANAGER);
        a0.a.a0(context, R.NP_MANAGER3.NP_MANAGER, 200);
        a0.a.b0(context, R.NP_MANAGER3.NP_MANAGER, d1.a.f833b);
        this.f742l = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f734d = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f738h = getResources().getDimensionPixelSize(R.NP_MANAGER6.NP_MANAGER);
        this.f735e = r5.getDimensionPixelSize(R.NP_MANAGER6.NP_MANAGER);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i2 = ClockHandView.f731n;
                this.f749a.c(((Float) valueAnimator2.getAnimatedValue()).floatValue());
            }
        });
        valueAnimator.addListener(new e());
    }

    public final int a(int i2) {
        return i2 == 2 ? Math.round(this.f742l * 0.66f) : this.f742l;
    }

    public final void b(float f3) {
        this.f732a.cancel();
        c(f3);
    }

    public final void c(float f3) {
        float f4 = f3 % 360.0f;
        this.f739i = f4;
        this.f741k = Math.toRadians(f4 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fA = a(this.f743m);
        float fCos = (((float) Math.cos(this.f741k)) * fA) + width;
        float fSin = (fA * ((float) Math.sin(this.f741k))) + height;
        float f5 = this.f734d;
        this.f737g.set(fCos - f5, fSin - f5, fCos + f5, fSin + f5);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ClockFaceView clockFaceView = (ClockFaceView) ((f) obj);
            if (Math.abs(clockFaceView.I - f4) > 0.001f) {
                clockFaceView.I = f4;
                clockFaceView.n();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f3 = width;
        float fA = a(this.f743m);
        float fCos = (((float) Math.cos(this.f741k)) * fA) + f3;
        float f4 = height;
        float fSin = (fA * ((float) Math.sin(this.f741k))) + f4;
        Paint paint = this.f736f;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f734d, paint);
        double dSin = Math.sin(this.f741k);
        paint.setStrokeWidth(this.f738h);
        canvas.drawLine(f3, f4, width + ((int) (Math.cos(this.f741k) * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(f3, f4, this.f735e, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (this.f732a.isRunning()) {
            return;
        }
        b(this.f739i);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        boolean z3 = false;
        if (actionMasked == 0) {
            this.f740j = false;
            z = true;
            z2 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z2 = this.f740j;
            if (this.f733b) {
                this.f743m = ((float) Math.hypot((double) (x2 - ((float) (getWidth() / 2))), (double) (y2 - ((float) (getHeight() / 2))))) <= ((float) a(2)) + TypedValue.applyDimension(1, (float) 12, getContext().getResources().getDisplayMetrics()) ? 2 : 1;
            }
            z = false;
        } else {
            z2 = false;
            z = false;
        }
        boolean z4 = this.f740j;
        int degrees = (int) Math.toDegrees(Math.atan2(y2 - (getHeight() / 2), x2 - (getWidth() / 2)));
        int i2 = degrees + 90;
        if (i2 < 0) {
            i2 = degrees + 450;
        }
        float f3 = i2;
        boolean z5 = this.f739i != f3;
        if (z && z5) {
            z3 = true;
        } else if (z5 || z2) {
            b(f3);
            z3 = true;
        }
        this.f740j = z4 | z3;
        return true;
    }
}
