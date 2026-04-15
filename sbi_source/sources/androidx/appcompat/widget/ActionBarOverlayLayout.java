package androidx.appcompat.widget;

import a0.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.redhand.laugiytr.R;
import f.b;
import f.c;
import f.d;
import f.e;
import f.f;
import f.m2;
import f.t0;
import f0.a0;
import f0.c0;
import f0.c1;
import f0.d1;
import f0.e1;
import f0.f1;
import f0.l1;
import f0.m0;
import f0.n;
import f0.n1;
import f0.o;
import f0.p;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements n, o {
    public static final n1 A;
    public static final Rect B;
    public static final int[] z = {R.NP_MANAGER3.NP_MANAGER, android.R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f53a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ContentFrameLayout f54b;
    public ActionBarContainer c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t0 f55d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f56e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f57f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f58g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f59h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f60i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f61j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Rect f62k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Rect f63l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Rect f64m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Rect f65n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public n1 f66o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public n1 f67p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public n1 f68q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public n1 f69r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public OverScroller f70s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ViewPropertyAnimator f71t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final b f72u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final c f73v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c f74w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p f75x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final f f76y;

    static {
        int i2 = Build.VERSION.SDK_INT;
        f1 e1Var = i2 >= 30 ? new e1() : i2 >= 29 ? new d1() : new c1();
        e1Var.g(x.c.b(0, 1, 0, 1));
        A = e1Var.b();
        B = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f62k = new Rect();
        this.f63l = new Rect();
        this.f64m = new Rect();
        this.f65n = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        n1 n1Var = n1.f1280b;
        this.f66o = n1Var;
        this.f67p = n1Var;
        this.f68q = n1Var;
        this.f69r = n1Var;
        this.f72u = new b(0, this);
        this.f73v = new c(this, 0);
        this.f74w = new c(this, 1);
        i(context);
        this.f75x = new p();
        f fVar = new f(context);
        fVar.setWillNotDraw(true);
        this.f76y = fVar;
        addView(fVar);
    }

    public static boolean g(View view, Rect rect, boolean z2) {
        boolean z3;
        e eVar = (e) view.getLayoutParams();
        int i2 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
        int i3 = rect.left;
        if (i2 != i3) {
            ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i3;
            z3 = true;
        } else {
            z3 = false;
        }
        int i4 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        int i5 = rect.top;
        if (i4 != i5) {
            ((ViewGroup.MarginLayoutParams) eVar).topMargin = i5;
            z3 = true;
        }
        int i6 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
        int i7 = rect.right;
        if (i6 != i7) {
            ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i7;
            z3 = true;
        }
        if (z2) {
            int i8 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            int i9 = rect.bottom;
            if (i8 != i9) {
                ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i9;
                return true;
            }
        }
        return z3;
    }

    @Override // f0.n
    public final void a(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    @Override // f0.n
    public final void b(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // f0.o
    public final void d(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        e(view, i2, i3, i4, i5, i6);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f56e != null) {
            if (this.c.getVisibility() == 0) {
                translationY = (int) (this.c.getTranslationY() + this.c.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f56e.setBounds(0, translationY, getWidth(), this.f56e.getIntrinsicHeight() + translationY);
            this.f56e.draw(canvas);
        }
    }

    @Override // f0.n
    public final void e(View view, int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            onNestedScroll(view, i2, i3, i4, i5);
        }
    }

    @Override // f0.n
    public final boolean f(View view, View view2, int i2, int i3) {
        return i3 == 0 && onStartNestedScroll(view, view2, i2);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.c;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        p pVar = this.f75x;
        return pVar.f1283b | pVar.f1282a;
    }

    public CharSequence getTitle() {
        j();
        return ((m2) this.f55d).f1106a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f73v);
        removeCallbacks(this.f74w);
        ViewPropertyAnimator viewPropertyAnimator = this.f71t;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(z);
        this.f53a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f56e = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f70s = new OverScroller(context);
    }

    public final void j() {
        t0 wrapper;
        if (this.f54b == null) {
            this.f54b = (ContentFrameLayout) findViewById(R.NP_MANAGER8.NP_MANAGER);
            this.c = (ActionBarContainer) findViewById(R.NP_MANAGER8.NP_MANAGER);
            KeyEvent.Callback callbackFindViewById = findViewById(R.NP_MANAGER8.NP_MANAGER);
            if (callbackFindViewById instanceof t0) {
                wrapper = (t0) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f55d = wrapper;
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        j();
        n1 n1VarD = n1.d(this, windowInsets);
        l1 l1Var = n1VarD.f1281a;
        boolean zG = g(this.c, new Rect(l1Var.j().f2616a, n1VarD.a(), l1Var.j().c, l1Var.j().f2618d), false);
        Field field = m0.f1276a;
        Rect rect = this.f62k;
        c0.b(this, n1VarD, rect);
        n1 n1VarL = l1Var.l(rect.left, rect.top, rect.right, rect.bottom);
        this.f66o = n1VarL;
        boolean z2 = true;
        if (!this.f67p.equals(n1VarL)) {
            this.f67p = this.f66o;
            zG = true;
        }
        Rect rect2 = this.f63l;
        if (rect2.equals(rect)) {
            z2 = zG;
        } else {
            rect2.set(rect);
        }
        if (z2) {
            requestLayout();
        }
        return l1Var.a().f1281a.c().f1281a.b().c();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        Field field = m0.f1276a;
        a0.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i8 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f3, float f4, boolean z2) {
        if (!this.f59h || !z2) {
            return false;
        }
        this.f70s.fling(0, 0, 0, (int) f4, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f70s.getFinalY() > this.c.getHeight()) {
            h();
            this.f74w.run();
        } else {
            h();
            this.f73v.run();
        }
        this.f60i = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f3, float f4) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        int i6 = this.f61j + i3;
        this.f61j = i6;
        setActionBarHideOffset(i6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        this.f75x.f1282a = i2;
        this.f61j = getActionBarHideOffset();
        h();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.c.getVisibility() != 0) {
            return false;
        }
        return this.f59h;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f59h || this.f60i) {
            return;
        }
        if (this.f61j <= this.c.getHeight()) {
            h();
            postDelayed(this.f73v, 600L);
        } else {
            h();
            postDelayed(this.f74w, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i2) {
        super.onWindowSystemUiVisibilityChanged(i2);
        j();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
    }

    public void setActionBarHideOffset(int i2) {
        h();
        this.c.setTranslationY(-Math.max(0, Math.min(i2, this.c.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        if (getWindowToken() != null) {
            throw null;
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.f58g = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.f59h) {
            this.f59h = z2;
            if (z2) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i2) {
        j();
        m2 m2Var = (m2) this.f55d;
        m2Var.f1108d = i2 != 0 ? a.r(m2Var.f1106a.getContext(), i2) : null;
        m2Var.c();
    }

    public void setLogo(int i2) {
        j();
        m2 m2Var = (m2) this.f55d;
        m2Var.f1109e = i2 != 0 ? a.r(m2Var.f1106a.getContext(), i2) : null;
        m2Var.c();
    }

    public void setOverlayMode(boolean z2) {
        this.f57f = z2;
    }

    public void setWindowCallback(Window.Callback callback) {
        j();
        ((m2) this.f55d).f1115k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        j();
        m2 m2Var = (m2) this.f55d;
        if (m2Var.f1111g) {
            return;
        }
        Toolbar toolbar = m2Var.f1106a;
        m2Var.f1112h = charSequence;
        if ((m2Var.f1107b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (m2Var.f1111g) {
                m0.k(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        j();
        m2 m2Var = (m2) this.f55d;
        m2Var.f1108d = drawable;
        m2Var.c();
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i2) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    @Override // f0.n
    public final void c(View view, int i2, int i3, int[] iArr, int i4) {
    }
}
