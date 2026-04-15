package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import b.a;
import com.redhand.laugiytr.R;
import f.t2;
import f0.m0;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f42a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f43b;
    public boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f44d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f45e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f46f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LinearLayout f47g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f48h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f49i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f50j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f51k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f52l;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.NP_MANAGER3.NP_MANAGER);
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.NP_MANAGER3.NP_MANAGER, typedValue, true) && typedValue.resourceId != 0) {
            new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f434d, R.NP_MANAGER3.NP_MANAGER, 0);
        setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : a0.a.r(context, resourceId));
        this.f50j = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f51k = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f42a = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, R.NP_MANAGER11.NP_MANAGER);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static int b(View view, int i2, int i3, int i4, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = ((i4 - measuredHeight) / 2) + i3;
        if (z) {
            view.layout(i2 - measuredWidth, i5, i2, measuredHeight + i5);
        } else {
            view.layout(i2, i5, i2 + measuredWidth, measuredHeight + i5);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public final void a() {
        if (this.f47g == null) {
            LayoutInflater.from(getContext()).inflate(R.NP_MANAGER11.NP_MANAGER, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f47g = linearLayout;
            this.f48h = (TextView) linearLayout.findViewById(R.NP_MANAGER8.NP_MANAGER);
            this.f49i = (TextView) this.f47g.findViewById(R.NP_MANAGER8.NP_MANAGER);
            int i2 = this.f50j;
            if (i2 != 0) {
                this.f48h.setTextAppearance(getContext(), i2);
            }
            int i3 = this.f51k;
            if (i3 != 0) {
                this.f49i.setTextAppearance(getContext(), i3);
            }
        }
        this.f48h.setText(this.f44d);
        this.f49i.setText(this.f45e);
        boolean zIsEmpty = TextUtils.isEmpty(this.f44d);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f45e);
        this.f49i.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f47g.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f47g.getParent() == null) {
            addView(this.f47g);
        }
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i2) {
        if (i2 != getVisibility()) {
            super.setVisibility(i2);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f42a;
    }

    public CharSequence getSubtitle() {
        return this.f45e;
    }

    public CharSequence getTitle() {
        return this.f44d;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, a.f432a, R.NP_MANAGER3.NP_MANAGER, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.c = false;
        }
        if (!this.c) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.c = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.c = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        boolean z2 = t2.f1187a;
        boolean z3 = getLayoutDirection() == 1;
        int paddingRight = z3 ? (i4 - i2) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
        LinearLayout linearLayout = this.f47g;
        if (linearLayout != null && this.f46f == null && linearLayout.getVisibility() != 8) {
            paddingRight += b(this.f47g, paddingRight, paddingTop, paddingTop2, z3);
        }
        View view = this.f46f;
        if (view != null) {
            b(view, paddingRight, paddingTop, paddingTop2, z3);
        }
        if (z3) {
            getPaddingLeft();
        } else {
            getPaddingRight();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i3) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i2);
        int size2 = this.f42a;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i3);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        LinearLayout linearLayout = this.f47g;
        if (linearLayout != null && this.f46f == null) {
            if (this.f52l) {
                this.f47g.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f47g.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.f47g.setVisibility(z ? 0 : 8);
            } else {
                linearLayout.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), iMakeMeasureSpec);
                paddingLeft = Math.max(0, paddingLeft - linearLayout.getMeasuredWidth());
            }
        }
        View view = this.f46f;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i4 = layoutParams.width;
            int i5 = i4 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i4 >= 0) {
                paddingLeft = Math.min(i4, paddingLeft);
            }
            int i6 = layoutParams.height;
            int i7 = i6 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i6 >= 0) {
                iMin = Math.min(i6, iMin);
            }
            this.f46f.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i5), View.MeasureSpec.makeMeasureSpec(iMin, i7));
        }
        if (this.f42a > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            int measuredHeight = getChildAt(i9).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i8) {
                i8 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i8);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f43b = false;
        }
        if (!this.f43b) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f43b = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f43b = false;
        return true;
    }

    public void setContentHeight(int i2) {
        this.f42a = i2;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f46f;
        if (view2 != null) {
            removeView(view2);
        }
        this.f46f = view;
        if (view != null && (linearLayout = this.f47g) != null) {
            removeView(linearLayout);
            this.f47g = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f45e = charSequence;
        a();
    }

    public void setTitle(CharSequence charSequence) {
        this.f44d = charSequence;
        a();
        m0.k(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f52l) {
            requestLayout();
        }
        this.f52l = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
