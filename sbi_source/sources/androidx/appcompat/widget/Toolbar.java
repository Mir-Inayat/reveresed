package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.emoji2.text.n;
import androidx.emoji2.text.t;
import androidx.fragment.app.b;
import androidx.fragment.app.i;
import b.a;
import com.redhand.laugiytr.R;
import d.d;
import e.j;
import e.k;
import f.c2;
import f.d2;
import f.e2;
import f.g;
import f.g2;
import f.h2;
import f.i2;
import f.j2;
import f.l2;
import f.m0;
import f.m2;
import f.t0;
import f.t2;
import f.v1;
import f.x;
import f.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public ColorStateList A;
    public boolean B;
    public boolean C;
    public final ArrayList D;
    public final ArrayList E;
    public final int[] F;
    public final n G;
    public ArrayList H;
    public final d2 I;
    public m2 J;
    public h2 K;
    public boolean L;
    public OnBackInvokedCallback M;
    public OnBackInvokedDispatcher N;
    public boolean O;
    public final b P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ActionMenuView f99a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m0 f100b;
    public m0 c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x f101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public z f102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Drawable f103f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CharSequence f104g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public x f105h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f106i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Context f107j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f108k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f109l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f110m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f111n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f112o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f113p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f114q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f115r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f116s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public v1 f117t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f118u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f119v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f120w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public CharSequence f121x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public CharSequence f122y;
    public ColorStateList z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static i2 g() {
        i2 i2Var = new i2(-2, -2);
        i2Var.f1043b = 0;
        i2Var.f1042a = 8388627;
        return i2Var;
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i2 = 0; i2 < menu.size(); i2++) {
            arrayList.add(menu.getItem(i2));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new d(getContext());
    }

    public static i2 h(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof i2;
        if (z) {
            i2 i2Var = (i2) layoutParams;
            i2 i2Var2 = new i2(i2Var);
            i2Var2.f1043b = 0;
            i2Var2.f1043b = i2Var.f1043b;
            return i2Var2;
        }
        if (z) {
            i2 i2Var3 = new i2((i2) layoutParams);
            i2Var3.f1043b = 0;
            return i2Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            i2 i2Var4 = new i2(layoutParams);
            i2Var4.f1043b = 0;
            return i2Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        i2 i2Var5 = new i2(marginLayoutParams);
        i2Var5.f1043b = 0;
        ((ViewGroup.MarginLayoutParams) i2Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) i2Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) i2Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) i2Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return i2Var5;
    }

    public static int j(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(ArrayList arrayList, int i2) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                i2 i2Var = (i2) childAt.getLayoutParams();
                if (i2Var.f1043b == 0 && r(childAt)) {
                    int i4 = i2Var.f1042a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i4, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i5 = childCount - 1; i5 >= 0; i5--) {
            View childAt2 = getChildAt(i5);
            i2 i2Var2 = (i2) childAt2.getLayoutParams();
            if (i2Var2.f1043b == 0 && r(childAt2)) {
                int i6 = i2Var2.f1042a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i6, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        i2 i2VarG = layoutParams == null ? g() : !checkLayoutParams(layoutParams) ? h(layoutParams) : (i2) layoutParams;
        i2VarG.f1043b = 1;
        if (!z || this.f106i == null) {
            addView(view, i2VarG);
        } else {
            view.setLayoutParams(i2VarG);
            this.E.add(view);
        }
    }

    public final void c() {
        if (this.f105h == null) {
            x xVar = new x(getContext(), null, R.NP_MANAGER3.NP_MANAGER);
            this.f105h = xVar;
            xVar.setImageDrawable(this.f103f);
            this.f105h.setContentDescription(this.f104g);
            i2 i2VarG = g();
            i2VarG.f1042a = (this.f111n & 112) | 8388611;
            i2VarG.f1043b = 2;
            this.f105h.setLayoutParams(i2VarG);
            this.f105h.setOnClickListener(new e2(this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof i2);
    }

    public final void d() {
        if (this.f117t == null) {
            v1 v1Var = new v1();
            v1Var.f1196a = 0;
            v1Var.f1197b = 0;
            v1Var.c = Integer.MIN_VALUE;
            v1Var.f1198d = Integer.MIN_VALUE;
            v1Var.f1199e = 0;
            v1Var.f1200f = 0;
            v1Var.f1201g = false;
            v1Var.f1202h = false;
            this.f117t = v1Var;
        }
    }

    public final void e() {
        if (this.f99a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f99a = actionMenuView;
            actionMenuView.setPopupTheme(this.f108k);
            this.f99a.setOnMenuItemClickListener(this.I);
            ActionMenuView actionMenuView2 = this.f99a;
            d2 d2Var = new d2(this);
            actionMenuView2.getClass();
            actionMenuView2.f81t = d2Var;
            i2 i2VarG = g();
            i2VarG.f1042a = (this.f111n & 112) | 8388613;
            this.f99a.setLayoutParams(i2VarG);
            b(this.f99a, false);
        }
        ActionMenuView actionMenuView3 = this.f99a;
        if (actionMenuView3.f77p == null) {
            j jVar = (j) actionMenuView3.getMenu();
            if (this.K == null) {
                this.K = new h2(this);
            }
            this.f99a.setExpandedActionViewsExclusive(true);
            jVar.b(this.K, this.f107j);
            s();
        }
    }

    public final void f() {
        if (this.f101d == null) {
            this.f101d = new x(getContext(), null, R.NP_MANAGER3.NP_MANAGER);
            i2 i2VarG = g();
            i2VarG.f1042a = (this.f111n & 112) | 8388611;
            this.f101d.setLayoutParams(i2VarG);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return h(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        x xVar = this.f105h;
        if (xVar != null) {
            return xVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        x xVar = this.f105h;
        if (xVar != null) {
            return xVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        v1 v1Var = this.f117t;
        if (v1Var != null) {
            return v1Var.f1201g ? v1Var.f1196a : v1Var.f1197b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.f119v;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        v1 v1Var = this.f117t;
        if (v1Var != null) {
            return v1Var.f1196a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        v1 v1Var = this.f117t;
        if (v1Var != null) {
            return v1Var.f1197b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        v1 v1Var = this.f117t;
        if (v1Var != null) {
            return v1Var.f1201g ? v1Var.f1197b : v1Var.f1196a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.f118u;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        j jVar;
        ActionMenuView actionMenuView = this.f99a;
        return (actionMenuView == null || (jVar = actionMenuView.f77p) == null || !jVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f119v, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f118u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        z zVar = this.f102e;
        if (zVar != null) {
            return zVar.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        z zVar = this.f102e;
        if (zVar != null) {
            return zVar.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f99a.getMenu();
    }

    public View getNavButtonView() {
        return this.f101d;
    }

    public CharSequence getNavigationContentDescription() {
        x xVar = this.f101d;
        if (xVar != null) {
            return xVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        x xVar = this.f101d;
        if (xVar != null) {
            return xVar.getDrawable();
        }
        return null;
    }

    public f.j getOuterActionMenuPresenter() {
        return null;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f99a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f107j;
    }

    public int getPopupTheme() {
        return this.f108k;
    }

    public CharSequence getSubtitle() {
        return this.f122y;
    }

    public final TextView getSubtitleTextView() {
        return this.c;
    }

    public CharSequence getTitle() {
        return this.f121x;
    }

    public int getTitleMarginBottom() {
        return this.f116s;
    }

    public int getTitleMarginEnd() {
        return this.f114q;
    }

    public int getTitleMarginStart() {
        return this.f113p;
    }

    public int getTitleMarginTop() {
        return this.f115r;
    }

    public final TextView getTitleTextView() {
        return this.f100b;
    }

    public t0 getWrapper() {
        Drawable drawable;
        if (this.J == null) {
            m2 m2Var = new m2();
            m2Var.f1116l = 0;
            m2Var.f1106a = this;
            m2Var.f1112h = getTitle();
            m2Var.f1113i = getSubtitle();
            m2Var.f1111g = m2Var.f1112h != null;
            m2Var.f1110f = getNavigationIcon();
            t tVarV = t.v(getContext(), null, a.f432a, R.NP_MANAGER3.NP_MANAGER);
            TypedArray typedArray = (TypedArray) tVarV.c;
            m2Var.f1117m = tVarV.m(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                m2Var.f1111g = true;
                m2Var.f1112h = text;
                if ((m2Var.f1107b & 8) != 0) {
                    setTitle(text);
                    if (m2Var.f1111g) {
                        f0.m0.k(getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                m2Var.f1113i = text2;
                if ((m2Var.f1107b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable drawableM = tVarV.m(20);
            if (drawableM != null) {
                m2Var.f1109e = drawableM;
                m2Var.c();
            }
            Drawable drawableM2 = tVarV.m(17);
            if (drawableM2 != null) {
                m2Var.f1108d = drawableM2;
                m2Var.c();
            }
            if (m2Var.f1110f == null && (drawable = m2Var.f1117m) != null) {
                m2Var.f1110f = drawable;
                if ((m2Var.f1107b & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            m2Var.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = m2Var.c;
                if (view != null && (m2Var.f1107b & 16) != 0) {
                    removeView(view);
                }
                m2Var.c = viewInflate;
                if (viewInflate != null && (m2Var.f1107b & 16) != 0) {
                    addView(viewInflate);
                }
                m2Var.a(m2Var.f1107b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.f117t.a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f109l = resourceId2;
                m0 m0Var = this.f100b;
                if (m0Var != null) {
                    m0Var.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f110m = resourceId3;
                m0 m0Var2 = this.c;
                if (m0Var2 != null) {
                    m0Var2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            tVarV.x();
            if (R.NP_MANAGER14.NP_MANAGER != m2Var.f1116l) {
                m2Var.f1116l = R.NP_MANAGER14.NP_MANAGER;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i2 = m2Var.f1116l;
                    m2Var.f1114j = i2 != 0 ? getContext().getString(i2) : null;
                    m2Var.b();
                }
            }
            m2Var.f1114j = getNavigationContentDescription();
            setNavigationOnClickListener(new e2(m2Var));
            this.J = m2Var;
        }
        return this.J;
    }

    public final int i(View view, int i2) {
        i2 i2Var = (i2) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int i4 = i2Var.f1042a & 112;
        if (i4 != 16 && i4 != 48 && i4 != 80) {
            i4 = this.f120w & 112;
        }
        if (i4 == 48) {
            return getPaddingTop() - i3;
        }
        if (i4 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) i2Var).bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = ((ViewGroup.MarginLayoutParams) i2Var).topMargin;
        if (iMax < i5) {
            iMax = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i7 = ((ViewGroup.MarginLayoutParams) i2Var).bottomMargin;
            if (i6 < i7) {
                iMax = Math.max(0, iMax - (i7 - i6));
            }
        }
        return paddingTop + iMax;
    }

    public final void l() {
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            getMenu().removeItem(((MenuItem) obj).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.G.f244b).iterator();
        if (it.hasNext()) {
            ((i) it.next()).getClass();
            throw null;
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.H = currentMenuItems2;
    }

    public final boolean m(View view) {
        return view.getParent() == this || this.E.contains(view);
    }

    public final int n(View view, int i2, int i3, int[] iArr) {
        i2 i2Var = (i2) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) i2Var).leftMargin - iArr[0];
        int iMax = Math.max(0, i4) + i2;
        iArr[0] = Math.max(0, -i4);
        int i5 = i(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, i5, iMax + measuredWidth, view.getMeasuredHeight() + i5);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) i2Var).rightMargin + iMax;
    }

    public final int o(View view, int i2, int i3, int[] iArr) {
        i2 i2Var = (i2) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) i2Var).rightMargin - iArr[1];
        int iMax = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int i5 = i(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, i5, iMax, view.getMeasuredHeight() + i5);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) i2Var).leftMargin);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        s();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.P);
        s();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.C = false;
        }
        if (!this.C) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.C = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.C = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x028f A[LOOP:0: B:102:0x028d->B:103:0x028f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02a7 A[LOOP:1: B:105:0x02a5->B:106:0x02a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02c7 A[LOOP:2: B:108:0x02c5->B:109:0x02c7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x031a A[LOOP:3: B:117:0x0318->B:118:0x031a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0218  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 811
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        char c;
        Object[] objArr;
        int iJ;
        int iMax;
        int iCombineMeasuredStates;
        int iJ2;
        int iK;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean z = t2.f1187a;
        int i4 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c = 0;
        } else {
            c = 1;
            objArr = false;
        }
        if (r(this.f101d)) {
            q(this.f101d, i2, 0, i3, this.f112o);
            iJ = j(this.f101d) + this.f101d.getMeasuredWidth();
            iMax = Math.max(0, k(this.f101d) + this.f101d.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f101d.getMeasuredState());
        } else {
            iJ = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (r(this.f105h)) {
            q(this.f105h, i2, 0, i3, this.f112o);
            iJ = j(this.f105h) + this.f105h.getMeasuredWidth();
            iMax = Math.max(iMax, k(this.f105h) + this.f105h.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f105h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iJ);
        int iMax4 = Math.max(0, currentContentInsetStart - iJ);
        Object[] objArr2 = objArr;
        int[] iArr = this.F;
        iArr[objArr2 == true ? 1 : 0] = iMax4;
        if (r(this.f99a)) {
            q(this.f99a, i2, iMax3, i3, this.f112o);
            iJ2 = j(this.f99a) + this.f99a.getMeasuredWidth();
            iMax = Math.max(iMax, k(this.f99a) + this.f99a.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f99a.getMeasuredState());
        } else {
            iJ2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iJ2);
        iArr[c] = Math.max(0, currentContentInsetEnd - iJ2);
        if (r(this.f106i)) {
            iMax5 += p(this.f106i, i2, iMax5, i3, 0, iArr);
            iMax = Math.max(iMax, k(this.f106i) + this.f106i.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f106i.getMeasuredState());
        }
        if (r(this.f102e)) {
            iMax5 += p(this.f102e, i2, iMax5, i3, 0, iArr);
            iMax = Math.max(iMax, k(this.f102e) + this.f102e.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f102e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (((i2) childAt.getLayoutParams()).f1043b == 0 && r(childAt)) {
                iMax5 += p(childAt, i2, iMax5, i3, 0, iArr);
                int iMax6 = Math.max(iMax, k(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i6 = iMax5;
        int i7 = this.f115r + this.f116s;
        int i8 = this.f113p + this.f114q;
        if (r(this.f100b)) {
            p(this.f100b, i2, i6 + i8, i3, i7, iArr);
            int iJ3 = j(this.f100b) + this.f100b.getMeasuredWidth();
            iK = k(this.f100b) + this.f100b.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f100b.getMeasuredState());
            iMax2 = iJ3;
        } else {
            iK = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (r(this.c)) {
            iMax2 = Math.max(iMax2, p(this.c, i2, i6 + i8, i3, i7 + iK, iArr));
            iK += k(this.c) + this.c.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.c.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iK);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i6 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i2, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i3, iCombineMeasuredStates2 << 16);
        if (!this.L) {
            i4 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i9 = 0; i9 < childCount2; i9++) {
            View childAt2 = getChildAt(i9);
            if (r(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i4 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i4);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof l2)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        l2 l2Var = (l2) parcelable;
        super.onRestoreInstanceState(l2Var.f1560a);
        ActionMenuView actionMenuView = this.f99a;
        j jVar = actionMenuView != null ? actionMenuView.f77p : null;
        int i2 = l2Var.c;
        if (i2 != 0 && this.K != null && jVar != null && (menuItemFindItem = jVar.findItem(i2)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (l2Var.f1076d) {
            b bVar = this.P;
            removeCallbacks(bVar);
            post(bVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        d();
        v1 v1Var = this.f117t;
        boolean z = i2 == 1;
        if (z == v1Var.f1201g) {
            return;
        }
        v1Var.f1201g = z;
        if (!v1Var.f1202h) {
            v1Var.f1196a = v1Var.f1199e;
            v1Var.f1197b = v1Var.f1200f;
            return;
        }
        if (z) {
            int i3 = v1Var.f1198d;
            if (i3 == Integer.MIN_VALUE) {
                i3 = v1Var.f1199e;
            }
            v1Var.f1196a = i3;
            int i4 = v1Var.c;
            if (i4 == Integer.MIN_VALUE) {
                i4 = v1Var.f1200f;
            }
            v1Var.f1197b = i4;
            return;
        }
        int i5 = v1Var.c;
        if (i5 == Integer.MIN_VALUE) {
            i5 = v1Var.f1199e;
        }
        v1Var.f1196a = i5;
        int i6 = v1Var.f1198d;
        if (i6 == Integer.MIN_VALUE) {
            i6 = v1Var.f1200f;
        }
        v1Var.f1197b = i6;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        f.j jVar;
        g gVar;
        k kVar;
        l2 l2Var = new l2(super.onSaveInstanceState());
        h2 h2Var = this.K;
        if (h2Var != null && (kVar = h2Var.f1026b) != null) {
            l2Var.c = kVar.f912a;
        }
        ActionMenuView actionMenuView = this.f99a;
        l2Var.f1076d = (actionMenuView == null || (jVar = actionMenuView.f80s) == null || (gVar = jVar.f1060r) == null || !gVar.b()) ? false : true;
        return l2Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.B = false;
        }
        if (!this.B) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.B = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.B = false;
        return true;
    }

    public final int p(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i7) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + iMax + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void q(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean r(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final void s() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = g2.a(this);
            h2 h2Var = this.K;
            boolean z = (h2Var == null || h2Var.f1026b == null || onBackInvokedDispatcherA == null || !isAttachedToWindow() || !this.O) ? false : true;
            if (z && this.N == null) {
                if (this.M == null) {
                    this.M = g2.b(new c2(this, 0));
                }
                g2.c(onBackInvokedDispatcherA, this.M);
                this.N = onBackInvokedDispatcherA;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.N) == null) {
                return;
            }
            g2.d(onBackInvokedDispatcher, this.M);
            this.N = null;
        }
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.O != z) {
            this.O = z;
            s();
        }
    }

    public void setCollapseContentDescription(int i2) {
        setCollapseContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setCollapseIcon(int i2) {
        setCollapseIcon(a0.a.r(getContext(), i2));
    }

    public void setCollapsible(boolean z) {
        this.L = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f119v) {
            this.f119v = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f118u) {
            this.f118u = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i2) {
        setLogo(a0.a.r(getContext(), i2));
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(a0.a.r(getContext(), i2));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        f();
        this.f101d.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f99a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i2) {
        if (this.f108k != i2) {
            this.f108k = i2;
            if (i2 == 0) {
                this.f107j = getContext();
            } else {
                this.f107j = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitleTextColor(int i2) {
        setSubtitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitleMarginBottom(int i2) {
        this.f116s = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.f114q = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.f113p = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.f115r = i2;
        requestLayout();
    }

    public void setTitleTextColor(int i2) {
        setTitleTextColor(ColorStateList.valueOf(i2));
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, R.NP_MANAGER3.NP_MANAGER);
        this.f120w = 8388627;
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.F = new int[2];
        this.G = new n(new c2(this, 1));
        this.H = new ArrayList();
        this.I = new d2(this);
        this.P = new b(4, this);
        Context context2 = getContext();
        int[] iArr = a.f449s;
        t tVarV = t.v(context2, attributeSet, iArr, R.NP_MANAGER3.NP_MANAGER);
        f0.m0.i(this, context, iArr, attributeSet, (TypedArray) tVarV.c, R.NP_MANAGER3.NP_MANAGER);
        TypedArray typedArray = (TypedArray) tVarV.c;
        this.f109l = typedArray.getResourceId(28, 0);
        this.f110m = typedArray.getResourceId(19, 0);
        this.f120w = typedArray.getInteger(0, 8388627);
        this.f111n = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f116s = dimensionPixelOffset;
        this.f115r = dimensionPixelOffset;
        this.f114q = dimensionPixelOffset;
        this.f113p = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f113p = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f114q = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f115r = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f116s = dimensionPixelOffset5;
        }
        this.f112o = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        v1 v1Var = this.f117t;
        v1Var.f1202h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            v1Var.f1199e = dimensionPixelSize;
            v1Var.f1196a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            v1Var.f1200f = dimensionPixelSize2;
            v1Var.f1197b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            v1Var.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f118u = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f119v = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f103f = tVarV.m(4);
        this.f104g = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f107j = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableM = tVarV.m(16);
        if (drawableM != null) {
            setNavigationIcon(drawableM);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableM2 = tVarV.m(11);
        if (drawableM2 != null) {
            setLogo(drawableM2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(tVarV.l(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(tVarV.l(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        tVarV.x();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        i2 i2Var = new i2(context, attributeSet);
        i2Var.f1042a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f433b);
        i2Var.f1042a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        i2Var.f1043b = 0;
        return i2Var;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        x xVar = this.f105h;
        if (xVar != null) {
            xVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f105h.setImageDrawable(drawable);
        } else {
            x xVar = this.f105h;
            if (xVar != null) {
                xVar.setImageDrawable(this.f103f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f102e == null) {
                this.f102e = new z(getContext(), 0);
            }
            if (!m(this.f102e)) {
                b(this.f102e, true);
            }
        } else {
            z zVar = this.f102e;
            if (zVar != null && m(zVar)) {
                removeView(this.f102e);
                this.E.remove(this.f102e);
            }
        }
        z zVar2 = this.f102e;
        if (zVar2 != null) {
            zVar2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f102e == null) {
            this.f102e = new z(getContext(), 0);
        }
        z zVar = this.f102e;
        if (zVar != null) {
            zVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        x xVar = this.f101d;
        if (xVar != null) {
            xVar.setContentDescription(charSequence);
            a0.a.i0(this.f101d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            f();
            if (!m(this.f101d)) {
                b(this.f101d, true);
            }
        } else {
            x xVar = this.f101d;
            if (xVar != null && m(xVar)) {
                removeView(this.f101d);
                this.E.remove(this.f101d);
            }
        }
        x xVar2 = this.f101d;
        if (xVar2 != null) {
            xVar2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            m0 m0Var = this.c;
            if (m0Var != null && m(m0Var)) {
                removeView(this.c);
                this.E.remove(this.c);
            }
        } else {
            if (this.c == null) {
                Context context = getContext();
                m0 m0Var2 = new m0(context, null);
                this.c = m0Var2;
                m0Var2.setSingleLine();
                this.c.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f110m;
                if (i2 != 0) {
                    this.c.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.c.setTextColor(colorStateList);
                }
            }
            if (!m(this.c)) {
                b(this.c, true);
            }
        }
        m0 m0Var3 = this.c;
        if (m0Var3 != null) {
            m0Var3.setText(charSequence);
        }
        this.f122y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.A = colorStateList;
        m0 m0Var = this.c;
        if (m0Var != null) {
            m0Var.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            m0 m0Var = this.f100b;
            if (m0Var != null && m(m0Var)) {
                removeView(this.f100b);
                this.E.remove(this.f100b);
            }
        } else {
            if (this.f100b == null) {
                Context context = getContext();
                m0 m0Var2 = new m0(context, null);
                this.f100b = m0Var2;
                m0Var2.setSingleLine();
                this.f100b.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f109l;
                if (i2 != 0) {
                    this.f100b.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.z;
                if (colorStateList != null) {
                    this.f100b.setTextColor(colorStateList);
                }
            }
            if (!m(this.f100b)) {
                b(this.f100b, true);
            }
        }
        m0 m0Var3 = this.f100b;
        if (m0Var3 != null) {
            m0Var3.setText(charSequence);
        }
        this.f121x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.z = colorStateList;
        m0 m0Var = this.f100b;
        if (m0Var != null) {
            m0Var.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(j2 j2Var) {
    }
}
