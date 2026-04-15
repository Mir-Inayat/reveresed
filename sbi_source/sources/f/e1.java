package f;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public abstract class e1 extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1005b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1007e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1008f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f1009g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1010h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f1011i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f1012j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Drawable f1013k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1014l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1015m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1016n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1017o;

    public e1(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, 0);
        this.f1004a = true;
        this.f1005b = -1;
        this.c = 0;
        this.f1007e = 8388659;
        int[] iArr = b.a.f441k;
        androidx.emoji2.text.t tVarV = androidx.emoji2.text.t.v(context, attributeSet, iArr, 0);
        f0.m0.i(this, context, iArr, attributeSet, (TypedArray) tVarV.c, 0);
        TypedArray typedArray = (TypedArray) tVarV.c;
        int i3 = typedArray.getInt(1, -1);
        if (i3 >= 0) {
            setOrientation(i3);
        }
        int i4 = typedArray.getInt(0, -1);
        if (i4 >= 0) {
            setGravity(i4);
        }
        boolean z = typedArray.getBoolean(2, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.f1009g = typedArray.getFloat(4, -1.0f);
        this.f1005b = typedArray.getInt(3, -1);
        this.f1010h = typedArray.getBoolean(7, false);
        setDividerDrawable(tVarV.m(5));
        this.f1016n = typedArray.getInt(8, 0);
        this.f1017o = typedArray.getDimensionPixelSize(6, 0);
        tVarV.x();
    }

    public final void c(Canvas canvas, int i2) {
        this.f1013k.setBounds(getPaddingLeft() + this.f1017o, i2, (getWidth() - getPaddingRight()) - this.f1017o, this.f1015m + i2);
        this.f1013k.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d1;
    }

    public final void d(Canvas canvas, int i2) {
        this.f1013k.setBounds(i2, getPaddingTop() + this.f1017o, this.f1014l + i2, (getHeight() - getPaddingBottom()) - this.f1017o);
        this.f1013k.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public d1 generateDefaultLayoutParams() {
        int i2 = this.f1006d;
        if (i2 == 0) {
            return new d1(-2, -2);
        }
        if (i2 == 1) {
            return new d1(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public d1 generateLayoutParams(AttributeSet attributeSet) {
        return new d1(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public d1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d1 ? new d1((d1) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new d1((ViewGroup.MarginLayoutParams) layoutParams) : new d1(layoutParams);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i2;
        if (this.f1005b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i3 = this.f1005b;
        if (childCount <= i3) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i3);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f1005b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.c;
        if (this.f1006d == 1 && (i2 = this.f1007e & 112) != 48) {
            if (i2 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1008f) / 2;
            } else if (i2 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1008f;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((d1) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1005b;
    }

    public Drawable getDividerDrawable() {
        return this.f1013k;
    }

    public int getDividerPadding() {
        return this.f1017o;
    }

    public int getDividerWidth() {
        return this.f1014l;
    }

    public int getGravity() {
        return this.f1007e;
    }

    public int getOrientation() {
        return this.f1006d;
    }

    public int getShowDividers() {
        return this.f1016n;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f1009g;
    }

    public final boolean h(int i2) {
        if (i2 == 0) {
            return (this.f1016n & 1) != 0;
        }
        if (i2 == getChildCount()) {
            return (this.f1016n & 4) != 0;
        }
        if ((this.f1016n & 2) != 0) {
            for (int i3 = i2 - 1; i3 >= 0; i3--) {
                if (getChildAt(i3).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i2;
        if (this.f1013k == null) {
            return;
        }
        int i3 = 0;
        if (this.f1006d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i3 < virtualChildCount) {
                View childAt = getChildAt(i3);
                if (childAt != null && childAt.getVisibility() != 8 && h(i3)) {
                    c(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((d1) childAt.getLayoutParams())).topMargin) - this.f1015m);
                }
                i3++;
            }
            if (h(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                c(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f1015m : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((d1) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z = t2.f1187a;
        boolean z2 = getLayoutDirection() == 1;
        while (i3 < virtualChildCount2) {
            View childAt3 = getChildAt(i3);
            if (childAt3 != null && childAt3.getVisibility() != 8 && h(i3)) {
                d1 d1Var = (d1) childAt3.getLayoutParams();
                d(canvas, z2 ? childAt3.getRight() + ((LinearLayout.LayoutParams) d1Var).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) d1Var).leftMargin) - this.f1014l);
            }
            i3++;
        }
        if (h(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                d1 d1Var2 = (d1) childAt4.getLayoutParams();
                if (z2) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) d1Var2).leftMargin;
                    i2 = this.f1014l;
                    right = left - i2;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) d1Var2).rightMargin;
                }
            } else if (z2) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i2 = this.f1014l;
                right = left - i2;
            }
            d(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a9  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instruction units count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f.e1.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0148  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r39, int r40) {
        /*
            Method dump skipped, instruction units count: 2150
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f.e1.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z) {
        this.f1004a = z;
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 >= 0 && i2 < getChildCount()) {
            this.f1005b = i2;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f1013k) {
            return;
        }
        this.f1013k = drawable;
        if (drawable != null) {
            this.f1014l = drawable.getIntrinsicWidth();
            this.f1015m = drawable.getIntrinsicHeight();
        } else {
            this.f1014l = 0;
            this.f1015m = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i2) {
        this.f1017o = i2;
    }

    public void setGravity(int i2) {
        if (this.f1007e != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f1007e = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i2) {
        int i3 = i2 & 8388615;
        int i4 = this.f1007e;
        if ((8388615 & i4) != i3) {
            this.f1007e = i3 | ((-8388616) & i4);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f1010h = z;
    }

    public void setOrientation(int i2) {
        if (this.f1006d != i2) {
            this.f1006d = i2;
            requestLayout();
        }
    }

    public void setShowDividers(int i2) {
        if (i2 != this.f1016n) {
            requestLayout();
        }
        this.f1016n = i2;
    }

    public void setVerticalGravity(int i2) {
        int i3 = i2 & 112;
        int i4 = this.f1007e;
        if ((i4 & 112) != i3) {
            this.f1007e = i3 | (i4 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f3) {
        this.f1009g = Math.max(0.0f, f3);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
