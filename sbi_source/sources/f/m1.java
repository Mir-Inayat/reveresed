package f;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public abstract class m1 implements e.r {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Method f1083w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Method f1084x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ListAdapter f1086b;
    public q1 c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1088e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1089f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1090g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1091h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f1092i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public j1 f1094k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f1095l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public e.l f1096m;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Handler f1101r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Rect f1103t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f1104u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final a0 f1105v;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1087d = -2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1093j = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i1 f1097n = new i1(this, 1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l1 f1098o = new l1(this);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k1 f1099p = new k1(this);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i1 f1100q = new i1(this, 0);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Rect f1102s = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f1083w = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f1084x = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public m1(Context context, int i2) {
        int resourceId;
        this.f1085a = context;
        this.f1101r = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, b.a.f442l, i2, 0);
        this.f1088e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f1089f = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1090g = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        a0 a0Var = new a0(context, null, i2, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(null, b.a.f446p, i2, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            k0.k.c(a0Var, typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        a0Var.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : a0.a.r(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.f1105v = a0Var;
        a0Var.setInputMethodMode(1);
    }

    public final void a(ListAdapter listAdapter) {
        j1 j1Var = this.f1094k;
        if (j1Var == null) {
            this.f1094k = new j1(this);
        } else {
            ListAdapter listAdapter2 = this.f1086b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(j1Var);
            }
        }
        this.f1086b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1094k);
        }
        q1 q1Var = this.c;
        if (q1Var != null) {
            q1Var.setAdapter(this.f1086b);
        }
    }

    @Override // e.r
    public final void c() {
        int i2;
        q1 q1Var;
        q1 q1Var2 = this.c;
        Context context = this.f1085a;
        a0 a0Var = this.f1105v;
        if (q1Var2 == null) {
            q1 q1Var3 = new q1(context, !this.f1104u);
            q1Var3.setHoverListener((r1) this);
            this.c = q1Var3;
            q1Var3.setAdapter(this.f1086b);
            this.c.setOnItemClickListener(this.f1096m);
            this.c.setFocusable(true);
            this.c.setFocusableInTouchMode(true);
            this.c.setOnItemSelectedListener(new f1(this));
            this.c.setOnScrollListener(this.f1099p);
            a0Var.setContentView(this.c);
        }
        Drawable background = a0Var.getBackground();
        Rect rect = this.f1102s;
        if (background != null) {
            background.getPadding(rect);
            int i3 = rect.top;
            i2 = rect.bottom + i3;
            if (!this.f1090g) {
                this.f1089f = -i3;
            }
        } else {
            rect.setEmpty();
            i2 = 0;
        }
        int iA = g1.a(a0Var, this.f1095l, this.f1089f, a0Var.getInputMethodMode() == 2);
        int i4 = this.f1087d;
        int iA2 = this.c.a(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), iA);
        int paddingBottom = iA2 + (iA2 > 0 ? this.c.getPaddingBottom() + this.c.getPaddingTop() + i2 : 0);
        a0Var.getInputMethodMode();
        k0.k.d(a0Var, 1002);
        if (a0Var.isShowing()) {
            if (this.f1095l.isAttachedToWindow()) {
                int width = this.f1087d;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f1095l.getWidth();
                }
                a0Var.setOutsideTouchable(true);
                a0Var.update(this.f1095l, this.f1088e, this.f1089f, width < 0 ? -1 : width, paddingBottom < 0 ? -1 : paddingBottom);
                return;
            }
            return;
        }
        int width2 = this.f1087d;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f1095l.getWidth();
        }
        a0Var.setWidth(width2);
        a0Var.setHeight(paddingBottom);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f1083w;
            if (method != null) {
                try {
                    method.invoke(a0Var, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            h1.b(a0Var, true);
        }
        a0Var.setOutsideTouchable(true);
        a0Var.setTouchInterceptor(this.f1098o);
        if (this.f1092i) {
            k0.k.c(a0Var, this.f1091h);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f1084x;
            if (method2 != null) {
                try {
                    method2.invoke(a0Var, this.f1103t);
                } catch (Exception e3) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e3);
                }
            }
        } else {
            h1.a(a0Var, this.f1103t);
        }
        a0Var.showAsDropDown(this.f1095l, this.f1088e, this.f1089f, this.f1093j);
        this.c.setSelection(-1);
        if ((!this.f1104u || this.c.isInTouchMode()) && (q1Var = this.c) != null) {
            q1Var.setListSelectionHidden(true);
            q1Var.requestLayout();
        }
        if (this.f1104u) {
            return;
        }
        this.f1101r.post(this.f1100q);
    }

    @Override // e.r
    public final void dismiss() {
        a0 a0Var = this.f1105v;
        a0Var.dismiss();
        a0Var.setContentView(null);
        this.c = null;
        this.f1101r.removeCallbacks(this.f1097n);
    }

    @Override // e.r
    public final boolean g() {
        return this.f1105v.isShowing();
    }

    @Override // e.r
    public final ListView h() {
        return this.c;
    }
}
