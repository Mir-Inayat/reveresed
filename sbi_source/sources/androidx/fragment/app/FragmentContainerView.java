package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.redhand.laugiytr.R;
import f0.a0;
import f0.m0;
import f0.n1;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f275b;
    public View.OnApplyWindowInsetsListener c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f276d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet, 0);
        d2.c.e(context, "context");
        this.f274a = new ArrayList();
        this.f275b = new ArrayList();
        this.f276d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q0.a.f2053a, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    public final void a(View view) {
        if (this.f275b.contains(view)) {
            this.f274a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        d2.c.e(view, "child");
        Object tag = view.getTag(R.NP_MANAGER8.NP_MANAGER);
        if ((tag instanceof f ? (f) tag : null) != null) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        n1 n1VarD;
        d2.c.e(windowInsets, "insets");
        n1 n1VarD2 = n1.d(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.c;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            d2.c.d(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            n1VarD = n1.d(null, windowInsetsOnApplyWindowInsets);
        } else {
            Field field = m0.f1276a;
            WindowInsets windowInsetsC = n1VarD2.c();
            if (windowInsetsC != null) {
                WindowInsets windowInsetsB = a0.b(this, windowInsetsC);
                if (!windowInsetsB.equals(windowInsetsC)) {
                    n1VarD2 = n1.d(this, windowInsetsB);
                }
            }
            n1VarD = n1VarD2;
        }
        if (!n1VarD.f1281a.m()) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                Field field2 = m0.f1276a;
                WindowInsets windowInsetsC2 = n1VarD.c();
                if (windowInsetsC2 != null) {
                    WindowInsets windowInsetsA = a0.a(childAt, windowInsetsC2);
                    if (!windowInsetsA.equals(windowInsetsC2)) {
                        n1.d(childAt, windowInsetsA);
                    }
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        d2.c.e(canvas, "canvas");
        if (this.f276d) {
            ArrayList arrayList = this.f274a;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                super.drawChild(canvas, (View) obj, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        d2.c.e(canvas, "canvas");
        d2.c.e(view, "child");
        if (this.f276d) {
            ArrayList arrayList = this.f274a;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        d2.c.e(view, "view");
        this.f275b.remove(view);
        if (this.f274a.remove(view)) {
            this.f276d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends f> F getFragment() {
        f fVar;
        View view = this;
        while (true) {
            fVar = null;
            if (view == null) {
                break;
            }
            Object tag = view.getTag(R.NP_MANAGER8.NP_MANAGER);
            f fVar2 = tag instanceof f ? (f) tag : null;
            if (fVar2 != null) {
                fVar = fVar2;
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (fVar != null) {
            throw new IllegalStateException("The Fragment " + fVar + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
        }
        throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        d2.c.e(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                d2.c.d(childAt, "view");
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        d2.c.e(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i2) {
        View childAt = getChildAt(i2);
        d2.c.d(childAt, "view");
        a(childAt);
        super.removeViewAt(i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        d2.c.e(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i2, int i3) {
        int i4 = i2 + i3;
        for (int i5 = i2; i5 < i4; i5++) {
            View childAt = getChildAt(i5);
            d2.c.d(childAt, "view");
            a(childAt);
        }
        super.removeViews(i2, i3);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i2, int i3) {
        int i4 = i2 + i3;
        for (int i5 = i2; i5 < i4; i5++) {
            View childAt = getChildAt(i5);
            d2.c.d(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i2, i3);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.f276d = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        d2.c.e(onApplyWindowInsetsListener, "listener");
        this.c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        d2.c.e(view, "view");
        if (view.getParent() == this) {
            this.f275b.add(view);
        }
        super.startViewTransition(view);
    }
}
