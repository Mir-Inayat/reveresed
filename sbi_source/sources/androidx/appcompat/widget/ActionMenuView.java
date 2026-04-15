package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.emoji2.text.n;
import e.i;
import e.j;
import e.k;
import f.d1;
import f.d2;
import f.e1;
import f.l;
import f.m;
import f.t2;
import t1.g;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends e1 implements i {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public j f77p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Context f78q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f79r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public f.j f80s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public d2 f81t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f82u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f83v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f84w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f85x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public m f86y;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f3 = context.getResources().getDisplayMetrics().density;
        this.f84w = (int) (56.0f * f3);
        this.f85x = (int) (f3 * 4.0f);
        this.f78q = context;
        this.f79r = 0;
    }

    public static l i() {
        l lVar = new l(-2, -2);
        lVar.f1069a = false;
        ((LinearLayout.LayoutParams) lVar).gravity = 16;
        return lVar;
    }

    public static l j(ViewGroup.LayoutParams layoutParams) {
        l lVar;
        if (layoutParams == null) {
            return i();
        }
        if (layoutParams instanceof l) {
            l lVar2 = (l) layoutParams;
            lVar = new l(lVar2);
            lVar.f1069a = lVar2.f1069a;
        } else {
            lVar = new l(layoutParams);
        }
        if (((LinearLayout.LayoutParams) lVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) lVar).gravity = 16;
        }
        return lVar;
    }

    @Override // e.i
    public final boolean a(k kVar) {
        return this.f77p.p(kVar, null, 0);
    }

    @Override // f.e1, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof l;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // f.e1
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ d1 generateDefaultLayoutParams() {
        return i();
    }

    @Override // f.e1
    /* JADX INFO: renamed from: f */
    public final d1 generateLayoutParams(AttributeSet attributeSet) {
        return new l(getContext(), attributeSet);
    }

    @Override // f.e1
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ d1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    @Override // f.e1, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return i();
    }

    @Override // f.e1, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    public Menu getMenu() {
        if (this.f77p == null) {
            Context context = getContext();
            j jVar = new j(context);
            this.f77p = jVar;
            jVar.f896e = new n(7, this);
            f.j jVar2 = new f.j(context);
            this.f80s = jVar2;
            jVar2.f1053k = true;
            jVar2.f1054l = true;
            jVar2.f1047e = new g(9);
            this.f77p.b(jVar2, this.f78q);
            f.j jVar3 = this.f80s;
            jVar3.f1049g = this;
            this.f77p = jVar3.c;
        }
        return this.f77p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        f.j jVar = this.f80s;
        f.i iVar = jVar.f1050h;
        if (iVar != null) {
            return iVar.getDrawable();
        }
        if (jVar.f1052j) {
            return jVar.f1051i;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f79r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean k(int i2) {
        boolean zA = false;
        if (i2 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i2 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i2);
        if (i2 < getChildCount() && (childAt instanceof f.k)) {
            zA = ((f.k) childAt).a();
        }
        return (i2 <= 0 || !(childAt2 instanceof f.k)) ? zA : ((f.k) childAt2).c() | zA;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        f.j jVar = this.f80s;
        if (jVar != null) {
            jVar.e();
            f.g gVar = this.f80s.f1060r;
            if (gVar == null || !gVar.b()) {
                return;
            }
            this.f80s.g();
            this.f80s.h();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f.j jVar = this.f80s;
        if (jVar != null) {
            jVar.g();
            f.g gVar = jVar.f1061s;
            if (gVar == null || !gVar.b()) {
                return;
            }
            gVar.f945i.dismiss();
        }
    }

    @Override // f.e1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int width;
        int paddingLeft;
        if (!this.f82u) {
            super.onLayout(z, i2, i3, i4, i5);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i5 - i3) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i4 - i2;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean z2 = t2.f1187a;
        boolean z3 = getLayoutDirection() == 1;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                l lVar = (l) childAt.getLayoutParams();
                if (lVar.f1069a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (k(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z3) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) lVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) lVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) lVar).leftMargin) + ((LinearLayout.LayoutParams) lVar).rightMargin;
                    k(i10);
                    i9++;
                }
            }
        }
        if (childCount == 1 && i8 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i12 = (i7 / 2) - (measuredWidth2 / 2);
            int i13 = i6 - (measuredHeight2 / 2);
            childAt2.layout(i12, i13, measuredWidth2 + i12, measuredHeight2 + i13);
            return;
        }
        int i14 = i9 - (i8 ^ 1);
        int iMax = Math.max(0, i14 > 0 ? paddingRight / i14 : 0);
        if (z3) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                l lVar2 = (l) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !lVar2.f1069a) {
                    int i16 = width2 - ((LinearLayout.LayoutParams) lVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((LinearLayout.LayoutParams) lVar2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            l lVar3 = (l) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !lVar3.f1069a) {
                int i19 = paddingLeft2 + ((LinearLayout.LayoutParams) lVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) lVar3).rightMargin + iMax + i19;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // f.e1, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        ?? r11;
        int i6;
        int i7;
        j jVar;
        boolean z = this.f82u;
        boolean z2 = View.MeasureSpec.getMode(i2) == 1073741824;
        this.f82u = z2;
        if (z != z2) {
            this.f83v = 0;
        }
        int size = View.MeasureSpec.getSize(i2);
        if (this.f82u && (jVar = this.f77p) != null && size != this.f83v) {
            this.f83v = size;
            jVar.o(true);
        }
        int childCount = getChildCount();
        if (!this.f82u || childCount <= 0) {
            for (int i8 = 0; i8 < childCount; i8++) {
                l lVar = (l) getChildAt(i8).getLayoutParams();
                ((LinearLayout.LayoutParams) lVar).rightMargin = 0;
                ((LinearLayout.LayoutParams) lVar).leftMargin = 0;
            }
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i2);
        int size3 = View.MeasureSpec.getSize(i3);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, paddingBottom, -2);
        int i9 = size2 - paddingRight;
        int i10 = this.f84w;
        int i11 = i9 / i10;
        int i12 = i9 % i10;
        if (i11 == 0) {
            setMeasuredDimension(i9, 0);
            return;
        }
        int i13 = (i12 / i11) + i10;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i14 = 0;
        int iMax2 = 0;
        int i15 = 0;
        boolean z3 = false;
        int i16 = 0;
        long j2 = 0;
        while (true) {
            i4 = this.f85x;
            if (i15 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i15);
            int i17 = size3;
            int i18 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i6 = i13;
            } else {
                boolean z4 = childAt instanceof ActionMenuItemView;
                i14++;
                if (z4) {
                    childAt.setPadding(i4, 0, i4, 0);
                }
                l lVar2 = (l) childAt.getLayoutParams();
                lVar2.f1073f = false;
                lVar2.c = 0;
                lVar2.f1070b = 0;
                lVar2.f1071d = false;
                ((LinearLayout.LayoutParams) lVar2).leftMargin = 0;
                ((LinearLayout.LayoutParams) lVar2).rightMargin = 0;
                lVar2.f1072e = z4 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i19 = lVar2.f1069a ? 1 : i11;
                l lVar3 = (l) childAt.getLayoutParams();
                int i20 = i11;
                i6 = i13;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i18, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z4 ? (ActionMenuItemView) childAt : null;
                boolean z5 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z6 = z5;
                if (i19 <= 0 || (z5 && i19 < 2)) {
                    i7 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i6 * i19, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i7 = measuredWidth / i6;
                    if (measuredWidth % i6 != 0) {
                        i7++;
                    }
                    if (z6 && i7 < 2) {
                        i7 = 2;
                    }
                }
                lVar3.f1071d = !lVar3.f1069a && z6;
                lVar3.f1070b = i7;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i7 * i6, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i7);
                if (lVar2.f1071d) {
                    i16++;
                }
                if (lVar2.f1069a) {
                    z3 = true;
                }
                i11 = i20 - i7;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i7 == 1) {
                    j2 |= (long) (1 << i15);
                }
            }
            i15++;
            size3 = i17;
            paddingBottom = i18;
            i13 = i6;
        }
        int i21 = size3;
        int i22 = i11;
        int i23 = i13;
        boolean z7 = z3 && i14 == 2;
        int i24 = i22;
        boolean z8 = false;
        while (i16 > 0 && i24 > 0) {
            int i25 = Integer.MAX_VALUE;
            long j3 = 0;
            int i26 = 0;
            int i27 = 0;
            while (i27 < childCount2) {
                int i28 = iMax;
                l lVar4 = (l) getChildAt(i27).getLayoutParams();
                boolean z9 = z7;
                if (lVar4.f1071d) {
                    int i29 = lVar4.f1070b;
                    if (i29 < i25) {
                        j3 = 1 << i27;
                        i25 = i29;
                        i26 = 1;
                    } else if (i29 == i25) {
                        j3 |= 1 << i27;
                        i26++;
                    }
                }
                i27++;
                z7 = z9;
                iMax = i28;
            }
            i5 = iMax;
            boolean z10 = z7;
            j2 |= j3;
            if (i26 > i24) {
                break;
            }
            int i30 = i25 + 1;
            int i31 = 0;
            while (i31 < childCount2) {
                View childAt2 = getChildAt(i31);
                l lVar5 = (l) childAt2.getLayoutParams();
                boolean z11 = z3;
                long j4 = 1 << i31;
                if ((j3 & j4) != 0) {
                    if (z10 && lVar5.f1072e) {
                        r11 = 1;
                        r11 = 1;
                        if (i24 == 1) {
                            childAt2.setPadding(i4 + i23, 0, i4, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    lVar5.f1070b += r11;
                    lVar5.f1073f = r11;
                    i24--;
                } else if (lVar5.f1070b == i30) {
                    j2 |= j4;
                }
                i31++;
                z3 = z11;
            }
            z7 = z10;
            iMax = i5;
            z8 = true;
        }
        i5 = iMax;
        boolean z12 = !z3 && i14 == 1;
        if (i24 > 0 && j2 != 0 && (i24 < i14 - 1 || z12 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j2);
            if (!z12) {
                if ((j2 & 1) != 0 && !((l) getChildAt(0).getLayoutParams()).f1072e) {
                    fBitCount -= 0.5f;
                }
                int i32 = childCount2 - 1;
                if ((j2 & ((long) (1 << i32))) != 0 && !((l) getChildAt(i32).getLayoutParams()).f1072e) {
                    fBitCount -= 0.5f;
                }
            }
            int i33 = fBitCount > 0.0f ? (int) ((i24 * i23) / fBitCount) : 0;
            boolean z13 = z8;
            for (int i34 = 0; i34 < childCount2; i34++) {
                if ((j2 & ((long) (1 << i34))) != 0) {
                    View childAt3 = getChildAt(i34);
                    l lVar6 = (l) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        lVar6.c = i33;
                        lVar6.f1073f = true;
                        if (i34 == 0 && !lVar6.f1072e) {
                            ((LinearLayout.LayoutParams) lVar6).leftMargin = (-i33) / 2;
                        }
                        z13 = true;
                    } else if (lVar6.f1069a) {
                        lVar6.c = i33;
                        lVar6.f1073f = true;
                        ((LinearLayout.LayoutParams) lVar6).rightMargin = (-i33) / 2;
                        z13 = true;
                    } else {
                        if (i34 != 0) {
                            ((LinearLayout.LayoutParams) lVar6).leftMargin = i33 / 2;
                        }
                        if (i34 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) lVar6).rightMargin = i33 / 2;
                        }
                    }
                }
            }
            z8 = z13;
        }
        if (z8) {
            for (int i35 = 0; i35 < childCount2; i35++) {
                View childAt4 = getChildAt(i35);
                l lVar7 = (l) childAt4.getLayoutParams();
                if (lVar7.f1073f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((lVar7.f1070b * i23) + lVar7.c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i9, mode != 1073741824 ? i5 : i21);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f80s.f1058p = z;
    }

    public void setOnMenuItemClickListener(m mVar) {
        this.f86y = mVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        f.j jVar = this.f80s;
        f.i iVar = jVar.f1050h;
        if (iVar != null) {
            iVar.setImageDrawable(drawable);
        } else {
            jVar.f1052j = true;
            jVar.f1051i = drawable;
        }
    }

    public void setPopupTheme(int i2) {
        if (this.f79r != i2) {
            this.f79r = i2;
            if (i2 == 0) {
                this.f78q = getContext();
            } else {
                this.f78q = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setPresenter(f.j jVar) {
        this.f80s = jVar;
        jVar.f1049g = this;
        this.f77p = jVar.c;
    }

    @Override // f.e1, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new l(getContext(), attributeSet);
    }

    public void setOverflowReserved(boolean z) {
    }
}
