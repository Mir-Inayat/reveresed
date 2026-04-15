package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.redhand.laugiytr.R;
import t1.k;
import v.b;
import x1.a;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class MaterialDivider extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f635b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f637e;

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.NP_MANAGER3.NP_MANAGER, R.NP_MANAGER15.NP_MANAGER), attributeSet, R.NP_MANAGER3.NP_MANAGER);
        Context context2 = getContext();
        this.f634a = new k();
        TypedArray typedArrayE = o1.k.e(context2, attributeSet, c1.a.f502l, R.NP_MANAGER3.NP_MANAGER, R.NP_MANAGER15.NP_MANAGER, new int[0]);
        this.f635b = typedArrayE.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.NP_MANAGER6.NP_MANAGER));
        this.f636d = typedArrayE.getDimensionPixelOffset(2, 0);
        this.f637e = typedArrayE.getDimensionPixelOffset(1, 0);
        setDividerColor(a0.a.o(context2, typedArrayE, 0).getDefaultColor());
        typedArrayE.recycle();
    }

    public int getDividerColor() {
        return this.c;
    }

    public int getDividerInsetEnd() {
        return this.f637e;
    }

    public int getDividerInsetStart() {
        return this.f636d;
    }

    public int getDividerThickness() {
        return this.f635b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        int i2;
        super.onDraw(canvas);
        boolean z = getLayoutDirection() == 1;
        int i3 = z ? this.f637e : this.f636d;
        if (z) {
            width = getWidth();
            i2 = this.f636d;
        } else {
            width = getWidth();
            i2 = this.f637e;
        }
        int i4 = width - i2;
        int bottom = getBottom() - getTop();
        k kVar = this.f634a;
        kVar.setBounds(i3, 0, i4, bottom);
        kVar.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i3);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i4 = this.f635b;
            if (i4 > 0 && measuredHeight != i4) {
                measuredHeight = i4;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i2) {
        if (this.c != i2) {
            this.c = i2;
            this.f634a.n(ColorStateList.valueOf(i2));
            invalidate();
        }
    }

    public void setDividerColorResource(int i2) {
        setDividerColor(b.a(getContext(), i2));
    }

    public void setDividerInsetEnd(int i2) {
        this.f637e = i2;
    }

    public void setDividerInsetEndResource(int i2) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i2));
    }

    public void setDividerInsetStart(int i2) {
        this.f636d = i2;
    }

    public void setDividerInsetStartResource(int i2) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i2));
    }

    public void setDividerThickness(int i2) {
        if (this.f635b != i2) {
            this.f635b = i2;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i2) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i2));
    }
}
