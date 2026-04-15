package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import b.a;
import com.redhand.laugiytr.R;
import f0.m0;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f88a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f89b;
    public int c;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = -1;
        int[] iArr = a.f439i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        m0.i(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        this.f88a = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f88a);
        }
    }

    private void setStacked(boolean z) {
        if (this.f89b != z) {
            if (!z || this.f88a) {
                this.f89b = z;
                setOrientation(z ? 1 : 0);
                setGravity(z ? 8388613 : 80);
                View viewFindViewById = findViewById(R.NP_MANAGER8.NP_MANAGER);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        int iMakeMeasureSpec;
        boolean z;
        int i4;
        int size = View.MeasureSpec.getSize(i2);
        int paddingBottom = 0;
        if (this.f88a) {
            if (size > this.c && this.f89b) {
                setStacked(false);
            }
            this.c = size;
        }
        if (this.f89b || View.MeasureSpec.getMode(i2) != 1073741824) {
            iMakeMeasureSpec = i2;
            z = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(iMakeMeasureSpec, i3);
        if (this.f88a && !this.f89b && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z = true;
        }
        if (z) {
            super.onMeasure(i2, i3);
        }
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            i4 = -1;
            if (i5 >= childCount) {
                i5 = -1;
                break;
            } else if (getChildAt(i5).getVisibility() == 0) {
                break;
            } else {
                i5++;
            }
        }
        if (i5 >= 0) {
            View childAt = getChildAt(i5);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f89b) {
                int i6 = i5 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i6 >= childCount2) {
                        break;
                    }
                    if (getChildAt(i6).getVisibility() == 0) {
                        i4 = i6;
                        break;
                    }
                    i6++;
                }
                paddingBottom = i4 >= 0 ? getChildAt(i4).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                paddingBottom = getPaddingBottom() + measuredHeight;
            }
        }
        Field field = m0.f1276a;
        if (getMinimumHeight() != paddingBottom) {
            setMinimumHeight(paddingBottom);
            if (i3 == 0) {
                super.onMeasure(i2, i3);
            }
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.f88a != z) {
            this.f88a = z;
            if (!z && this.f89b) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
