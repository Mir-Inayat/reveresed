package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.redhand.laugiytr.R;
import f.a;
import f.w1;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f34a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f35b;
    public View c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f36d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f37e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f38f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f39g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f40h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f41i;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new a(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.a.f432a);
        boolean z = false;
        this.f36d = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f37e = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f41i = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.NP_MANAGER8.NP_MANAGER) {
            this.f39g = true;
            this.f38f = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f39g ? !(this.f36d != null || this.f37e != null) : this.f38f == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f36d;
        if (drawable != null && drawable.isStateful()) {
            this.f36d.setState(getDrawableState());
        }
        Drawable drawable2 = this.f37e;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f37e.setState(getDrawableState());
        }
        Drawable drawable3 = this.f38f;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f38f.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f36d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f37e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f38f;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f35b = findViewById(R.NP_MANAGER8.NP_MANAGER);
        this.c = findViewById(R.NP_MANAGER8.NP_MANAGER);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f34a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        boolean z2 = true;
        if (this.f39g) {
            Drawable drawable = this.f38f;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f36d == null) {
                z2 = false;
            } else if (this.f35b.getVisibility() == 0) {
                this.f36d.setBounds(this.f35b.getLeft(), this.f35b.getTop(), this.f35b.getRight(), this.f35b.getBottom());
            } else {
                View view = this.c;
                if (view == null || view.getVisibility() != 0) {
                    this.f36d.setBounds(0, 0, 0, 0);
                } else {
                    this.f36d.setBounds(this.c.getLeft(), this.c.getTop(), this.c.getRight(), this.c.getBottom());
                }
            }
            this.f40h = false;
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        if (this.f35b == null && View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE && (i4 = this.f41i) >= 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(i4, View.MeasureSpec.getSize(i3)), Integer.MIN_VALUE);
        }
        super.onMeasure(i2, i3);
        if (this.f35b == null) {
            return;
        }
        View.MeasureSpec.getMode(i3);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f36d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f36d);
        }
        this.f36d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f35b;
            if (view != null) {
                this.f36d.setBounds(view.getLeft(), this.f35b.getTop(), this.f35b.getRight(), this.f35b.getBottom());
            }
        }
        boolean z = false;
        if (!this.f39g ? !(this.f36d != null || this.f37e != null) : this.f38f == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f38f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f38f);
        }
        this.f38f = drawable;
        boolean z = this.f39g;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z && (drawable2 = this.f38f) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z ? !(this.f36d != null || this.f37e != null) : this.f38f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f37e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f37e);
        }
        this.f37e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f40h && this.f37e != null) {
                throw null;
            }
        }
        boolean z = false;
        if (!this.f39g ? !(this.f36d != null || this.f37e != null) : this.f38f == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z) {
        this.f34a = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.f36d;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f37e;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f38f;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f36d;
        boolean z = this.f39g;
        if (drawable == drawable2 && !z) {
            return true;
        }
        if (drawable == this.f37e && this.f40h) {
            return true;
        }
        return (drawable == this.f38f && z) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }

    public void setTabContainer(w1 w1Var) {
    }
}
