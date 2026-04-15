package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.emoji2.text.y;
import com.redhand.laugiytr.R;
import e0.c;
import f0.a0;
import f0.c0;
import f0.m0;
import f0.n;
import f0.n1;
import f0.o;
import f0.p;
import i.k;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l.d;
import r.a;
import s.b;
import s.e;
import s.f;
import s.g;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements n, o {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f144t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Class[] f145u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final ThreadLocal f146v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final d f147w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final c f148x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f150b;
    public final ArrayList c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f153f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f154g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f155h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f156i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f157j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f158k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public e f159l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f160m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public n1 f161n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f162o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Drawable f163p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f164q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public androidx.emoji2.text.n f165r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p f166s;

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f144t = r02 != null ? r02.getName() : null;
        f147w = new d(2);
        f145u = new Class[]{Context.class, AttributeSet.class};
        f146v = new ThreadLocal();
        f148x = new c();
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.NP_MANAGER3.NP_MANAGER);
        this.f149a = new ArrayList();
        this.f150b = new y(1);
        this.c = new ArrayList();
        this.f151d = new ArrayList();
        this.f152e = new int[2];
        this.f153f = new int[2];
        this.f166s = new p();
        int[] iArr = a.f2076a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.NP_MANAGER3.NP_MANAGER, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, R.NP_MANAGER3.NP_MANAGER, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f156i = intArray;
            float f3 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.f156i[i2] = (int) (r1[i2] * f3);
            }
        }
        this.f163p = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        w();
        super.setOnHierarchyChangeListener(new s.c(this));
        Field field = m0.f1276a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) f148x.a();
        return rect == null ? new Rect() : rect;
    }

    public static void l(int i2, Rect rect, Rect rect2, s.d dVar, int i3, int i4) {
        int i5 = dVar.c;
        if (i5 == 0) {
            i5 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i2);
        int i6 = dVar.f2087d;
        if ((i6 & 7) == 0) {
            i6 |= 8388611;
        }
        if ((i6 & 112) == 0) {
            i6 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i6, i2);
        int i7 = absoluteGravity & 7;
        int i8 = absoluteGravity & 112;
        int i9 = absoluteGravity2 & 7;
        int i10 = absoluteGravity2 & 112;
        int iWidth = i9 != 1 ? i9 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i10 != 16 ? i10 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i7 == 1) {
            iWidth -= i3 / 2;
        } else if (i7 != 5) {
            iWidth -= i3;
        }
        if (i8 == 16) {
            iHeight -= i4 / 2;
        } else if (i8 != 80) {
            iHeight -= i4;
        }
        rect2.set(iWidth, iHeight, i3 + iWidth, i4 + iHeight);
    }

    public static s.d n(View view) {
        s.d dVar = (s.d) view.getLayoutParams();
        if (!dVar.f2086b) {
            b bVar = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                bVar = (b) superclass.getAnnotation(b.class);
                if (bVar != null) {
                    break;
                }
            }
            if (bVar != null) {
                try {
                    s.a aVar = (s.a) bVar.value().getDeclaredConstructor(null).newInstance(null);
                    s.a aVar2 = dVar.f2085a;
                    if (aVar2 != aVar) {
                        if (aVar2 != null) {
                            aVar2.e();
                        }
                        dVar.f2085a = aVar;
                        dVar.f2086b = true;
                        if (aVar != null) {
                            aVar.c(dVar);
                        }
                    }
                } catch (Exception e3) {
                    Log.e("CoordinatorLayout", "Default behavior class " + bVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e3);
                }
            }
            dVar.f2086b = true;
        }
        return dVar;
    }

    public static void u(View view, int i2) {
        s.d dVar = (s.d) view.getLayoutParams();
        int i3 = dVar.f2092i;
        if (i3 != i2) {
            Field field = m0.f1276a;
            view.offsetLeftAndRight(i2 - i3);
            dVar.f2092i = i2;
        }
    }

    public static void v(View view, int i2) {
        s.d dVar = (s.d) view.getLayoutParams();
        int i3 = dVar.f2093j;
        if (i3 != i2) {
            Field field = m0.f1276a;
            view.offsetTopAndBottom(i2 - i3);
            dVar.f2093j = i2;
        }
    }

    @Override // f0.n
    public final void a(View view, View view2, int i2, int i3) {
        p pVar = this.f166s;
        if (i3 == 1) {
            pVar.f1283b = i2;
        } else {
            pVar.f1282a = i2;
        }
        this.f158k = view2;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            ((s.d) getChildAt(i4).getLayoutParams()).getClass();
        }
    }

    @Override // f0.n
    public final void b(View view, int i2) {
        p pVar = this.f166s;
        if (i2 == 1) {
            pVar.f1283b = 0;
        } else {
            pVar.f1282a = 0;
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            s.d dVar = (s.d) childAt.getLayoutParams();
            if (dVar.a(i2)) {
                s.a aVar = dVar.f2085a;
                if (aVar != null) {
                    aVar.p(childAt, view, i2);
                }
                if (i2 == 0) {
                    dVar.f2096m = false;
                } else if (i2 == 1) {
                    dVar.f2097n = false;
                }
            }
        }
        this.f158k = null;
    }

    @Override // f0.n
    public final void c(View view, int i2, int i3, int[] iArr, int i4) {
        s.a aVar;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                s.d dVar = (s.d) childAt.getLayoutParams();
                if (dVar.a(i4) && (aVar = dVar.f2085a) != null) {
                    int[] iArr2 = this.f152e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    aVar.j(this, childAt, view, i2, i3, iArr2, i4);
                    iMax = i2 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i3 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof s.d) && super.checkLayoutParams(layoutParams);
    }

    @Override // f0.o
    public final void d(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        s.a aVar;
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        boolean z = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                s.d dVar = (s.d) childAt.getLayoutParams();
                if (dVar.a(i6) && (aVar = dVar.f2085a) != null) {
                    int[] iArr2 = this.f152e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    aVar.k(this, childAt, i3, i4, i5, iArr2);
                    iMax = i4 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i5 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        s.a aVar = ((s.d) view.getLayoutParams()).f2085a;
        if (aVar != null) {
            aVar.getClass();
        }
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f163p;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // f0.n
    public final void e(View view, int i2, int i3, int i4, int i5, int i6) {
        d(view, i2, i3, i4, i5, 0, this.f153f);
    }

    @Override // f0.n
    public final boolean f(View view, View view2, int i2, int i3) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                s.d dVar = (s.d) childAt.getLayoutParams();
                s.a aVar = dVar.f2085a;
                if (aVar != null) {
                    boolean zO = aVar.o(childAt, i2, i3);
                    z |= zO;
                    if (i3 == 0) {
                        dVar.f2096m = zO;
                    } else if (i3 == 1) {
                        dVar.f2097n = zO;
                    }
                } else if (i3 == 0) {
                    dVar.f2096m = false;
                } else if (i3 == 1) {
                    dVar.f2097n = false;
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new s.d();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new s.d(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        s();
        return Collections.unmodifiableList(this.f149a);
    }

    public final n1 getLastWindowInsets() {
        return this.f161n;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        p pVar = this.f166s;
        return pVar.f1283b | pVar.f1282a;
    }

    public Drawable getStatusBarBackground() {
        return this.f163p;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(s.d dVar, Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - ((ViewGroup.MarginLayoutParams) dVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin));
        rect.set(iMax, iMax2, i2 + iMax, i3 + iMax2);
    }

    public final void i(View view, Rect rect, boolean z) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            k(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final ArrayList j(View view) {
        k kVar = (k) this.f150b.f270b;
        int i2 = kVar.c;
        ArrayList arrayList = null;
        for (int i3 = 0; i3 < i2; i3++) {
            ArrayList arrayList2 = (ArrayList) kVar.i(i3);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(kVar.f(i3));
            }
        }
        ArrayList arrayList3 = this.f151d;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void k(View view, Rect rect) {
        ThreadLocal threadLocal = g.f2100a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = g.f2100a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        g.a(this, view, matrix);
        ThreadLocal threadLocal3 = g.f2101b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int m(int i2) {
        int[] iArr = this.f156i;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i2);
            return 0;
        }
        if (i2 >= 0 && i2 < iArr.length) {
            return iArr[i2];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i2 + " out of range for " + this);
        return 0;
    }

    public final boolean o(View view, int i2, int i3) {
        c cVar = f148x;
        Rect rectG = g();
        k(view, rectG);
        try {
            return rectG.contains(i2, i3);
        } finally {
            rectG.setEmpty();
            cVar.c(rectG);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t(false);
        if (this.f160m) {
            if (this.f159l == null) {
                this.f159l = new e(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f159l);
        }
        if (this.f161n == null) {
            Field field = m0.f1276a;
            if (getFitsSystemWindows()) {
                a0.c(this);
            }
        }
        this.f155h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t(false);
        if (this.f160m && this.f159l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f159l);
        }
        View view = this.f158k;
        if (view != null) {
            b(view, 0);
        }
        this.f155h = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f162o || this.f163p == null) {
            return;
        }
        n1 n1Var = this.f161n;
        int iA = n1Var != null ? n1Var.a() : 0;
        if (iA > 0) {
            this.f163p.setBounds(0, 0, getWidth(), iA);
            this.f163p.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            t(true);
        }
        boolean zR = r(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zR;
        }
        t(true);
        return zR;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        s.a aVar;
        Field field = m0.f1276a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f149a;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) arrayList.get(i6);
            if (view.getVisibility() != 8 && ((aVar = ((s.d) view.getLayoutParams()).f2085a) == null || !aVar.g(this, view, layoutDirection))) {
                q(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0197  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f3, float f4, boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                s.d dVar = (s.d) childAt.getLayoutParams();
                if (dVar.a(0)) {
                    s.a aVar = dVar.f2085a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f3, float f4) {
        s.a aVar;
        int childCount = getChildCount();
        boolean zI = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                s.d dVar = (s.d) childAt.getLayoutParams();
                if (dVar.a(0) && (aVar = dVar.f2085a) != null) {
                    zI |= aVar.i(view);
                }
            }
        }
        return zI;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        c(view, i2, i3, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        e(view, i2, i3, i4, i5, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        a(view, view2, i2, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.f1560a);
        SparseArray sparseArray = fVar.c;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            s.a aVar = n(childAt).f2085a;
            if (id != -1 && aVar != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                aVar.m(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableN;
        f fVar = new f(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            s.a aVar = ((s.d) childAt.getLayoutParams()).f2085a;
            if (id != -1 && aVar != null && (parcelableN = aVar.n(childAt)) != null) {
                sparseArray.append(id, parcelableN);
            }
        }
        fVar.c = sparseArray;
        return fVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        return f(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015 A[PHI: r3
      0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r1.getActionMasked()
            android.view.View r3 = r0.f157j
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.r(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = r5
            goto L2a
        L17:
            r3 = r5
        L18:
            android.view.View r6 = r0.f157j
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            s.d r6 = (s.d) r6
            s.a r6 = r6.f2085a
            if (r6 == 0) goto L15
            android.view.View r7 = r0.f157j
            boolean r6 = r6.q(r7, r1)
        L2a:
            android.view.View r7 = r0.f157j
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r9 = android.os.SystemClock.uptimeMillis()
            r15 = 0
            r16 = 0
            r13 = 3
            r14 = 0
            r11 = r9
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L53
            goto L54
        L53:
            return r6
        L54:
            r0.t(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(int r23) {
        /*
            Method dump skipped, instruction units count: 721
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.p(int):void");
    }

    public final void q(View view, int i2) {
        Rect rectG;
        Rect rectG2;
        s.d dVar = (s.d) view.getLayoutParams();
        View view2 = dVar.f2094k;
        if (view2 == null && dVar.f2089f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        c cVar = f148x;
        if (view2 != null) {
            rectG = g();
            rectG2 = g();
            try {
                k(view2, rectG);
                s.d dVar2 = (s.d) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                l(i2, rectG, rectG2, dVar2, measuredWidth, measuredHeight);
                h(dVar2, rectG2, measuredWidth, measuredHeight);
                view.layout(rectG2.left, rectG2.top, rectG2.right, rectG2.bottom);
                return;
            } finally {
                rectG.setEmpty();
                cVar.c(rectG);
                rectG2.setEmpty();
                cVar.c(rectG2);
            }
        }
        int i3 = dVar.f2088e;
        if (i3 < 0) {
            s.d dVar3 = (s.d) view.getLayoutParams();
            rectG = g();
            rectG.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) dVar3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) dVar3).bottomMargin);
            if (this.f161n != null) {
                Field field = m0.f1276a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectG.left = this.f161n.f1281a.j().f2616a + rectG.left;
                    rectG.top = this.f161n.a() + rectG.top;
                    rectG.right -= this.f161n.f1281a.j().c;
                    rectG.bottom -= this.f161n.f1281a.j().f2618d;
                }
            }
            rectG2 = g();
            int i4 = dVar3.c;
            if ((i4 & 7) == 0) {
                i4 |= 8388611;
            }
            if ((i4 & 112) == 0) {
                i4 |= 48;
            }
            Gravity.apply(i4, view.getMeasuredWidth(), view.getMeasuredHeight(), rectG, rectG2, i2);
            view.layout(rectG2.left, rectG2.top, rectG2.right, rectG2.bottom);
            return;
        }
        s.d dVar4 = (s.d) view.getLayoutParams();
        int i5 = dVar4.c;
        if (i5 == 0) {
            i5 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i2);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i2 == 1) {
            i3 = width - i3;
        }
        int iM = m(i3) - measuredWidth2;
        if (i6 == 1) {
            iM += measuredWidth2 / 2;
        } else if (i6 == 5) {
            iM += measuredWidth2;
        }
        int i8 = i7 != 16 ? i7 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar4).leftMargin, Math.min(iM, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) dVar4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar4).topMargin, Math.min(i8, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) dVar4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    public final boolean r(MotionEvent motionEvent, int i2) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.c;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i3) : i3));
        }
        d dVar = f147w;
        if (dVar != null) {
            Collections.sort(arrayList, dVar);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zF = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) arrayList.get(i4);
            s.a aVar = ((s.d) view.getLayoutParams()).f2085a;
            if (zF && actionMasked != 0) {
                if (aVar != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i2 == 0) {
                        aVar.f(this, view, motionEventObtain);
                    } else if (i2 == 1) {
                        aVar.q(view, motionEventObtain);
                    }
                }
            } else if (!zF && aVar != null) {
                if (i2 == 0) {
                    zF = aVar.f(this, view, motionEvent);
                } else if (i2 == 1) {
                    zF = aVar.q(view, motionEvent);
                }
                if (zF) {
                    this.f157j = view;
                }
            }
        }
        arrayList.clear();
        return zF;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        s.a aVar = ((s.d) view.getLayoutParams()).f2085a;
        if (aVar != null) {
            aVar.l(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.f154g) {
            return;
        }
        t(false);
        this.f154g = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s() {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.s():void");
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        w();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f164q = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f163p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f163p = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f163p.setState(getDrawableState());
                }
                Drawable drawable3 = this.f163p;
                Field field = m0.f1276a;
                y.b.b(drawable3, getLayoutDirection());
                this.f163p.setVisible(getVisibility() == 0, false);
                this.f163p.setCallback(this);
            }
            Field field2 = m0.f1276a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i2) {
        setStatusBarBackground(new ColorDrawable(i2));
    }

    public void setStatusBarBackgroundResource(int i2) {
        setStatusBarBackground(i2 != 0 ? v.a.b(getContext(), i2) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.f163p;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.f163p.setVisible(z, false);
    }

    public final void t(boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            s.a aVar = ((s.d) childAt.getLayoutParams()).f2085a;
            if (aVar != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    aVar.f(this, childAt, motionEventObtain);
                } else {
                    aVar.q(childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            ((s.d) getChildAt(i3).getLayoutParams()).getClass();
        }
        this.f157j = null;
        this.f154g = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f163p;
    }

    public final void w() {
        Field field = m0.f1276a;
        if (!getFitsSystemWindows()) {
            c0.u(this, null);
            return;
        }
        if (this.f165r == null) {
            this.f165r = new androidx.emoji2.text.n(22, this);
        }
        c0.u(this, this.f165r);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof s.d ? new s.d((s.d) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new s.d((ViewGroup.MarginLayoutParams) layoutParams) : new s.d(layoutParams);
    }
}
