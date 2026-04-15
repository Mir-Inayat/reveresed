package v1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.redhand.laugiytr.R;
import o1.k;
import t1.o;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends FrameLayout {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f2456i = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f2457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2458b;
    public final float c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f2459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2460e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2461f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f2462g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f2463h;

    public c(Context context, AttributeSet attributeSet) {
        Drawable drawable;
        super(x1.a.a(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, c1.a.f511u);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setElevation(typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.f2458b = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
            this.f2457a = o.b(context2, attributeSet, 0, 0).a();
        }
        this.c = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(a0.a.o(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(k.f(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f2459d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.f2460e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f2461f = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(f2456i);
        setFocusable(true);
        if (getBackground() == null) {
            int I = a0.a.I(a0.a.n(this, R.NP_MANAGER3.NP_MANAGER), a0.a.n(this, R.NP_MANAGER3.NP_MANAGER), getBackgroundOverlayColorAlpha());
            o oVar = this.f2457a;
            if (oVar != null) {
                int i2 = d.f2464a;
                t1.k kVar = new t1.k(oVar);
                kVar.n(ColorStateList.valueOf(I));
                drawable = kVar;
            } else {
                Resources resources = getResources();
                int i3 = d.f2464a;
                float dimension = resources.getDimension(R.NP_MANAGER6.NP_MANAGER);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                gradientDrawable.setColor(I);
                drawable = gradientDrawable;
            }
            ColorStateList colorStateList = this.f2462g;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
            setBackground(drawable);
        }
    }

    public float getActionTextColorAlpha() {
        return this.f2459d;
    }

    public int getAnimationMode() {
        return this.f2458b;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.c;
    }

    public int getMaxInlineActionWidth() {
        return this.f2461f;
    }

    public int getMaxWidth() {
        return this.f2460e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int i4 = this.f2460e;
        if (i4 <= 0 || getMeasuredWidth() <= i4) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i3);
    }

    public void setAnimationMode(int i2) {
        this.f2458b = i2;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f2462g != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.f2462g);
            drawable.setTintMode(this.f2463h);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f2462g = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintList(colorStateList);
            drawableMutate.setTintMode(this.f2463h);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f2463h = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintMode(mode);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f2456i);
        super.setOnClickListener(onClickListener);
    }

    private void setBaseTransientBottomBar(d dVar) {
    }
}
