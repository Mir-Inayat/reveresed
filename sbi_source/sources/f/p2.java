package f;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.IBinder;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import com.redhand.laugiytr.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class p2 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static p2 f1130k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static p2 f1131l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f1132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f1133b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o2 f1134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o2 f1135e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1136f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1137g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public q2 f1138h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f1139i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1140j;

    /* JADX WARN: Type inference failed for: r0v0, types: [f.o2] */
    /* JADX WARN: Type inference failed for: r0v1, types: [f.o2] */
    public p2(View view, CharSequence charSequence) {
        final int i2 = 0;
        this.f1134d = new Runnable(this) { // from class: f.o2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p2 f1127b;

            {
                this.f1127b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        this.f1127b.c(false);
                        break;
                    default:
                        this.f1127b.a();
                        break;
                }
            }
        };
        final int i3 = 1;
        this.f1135e = new Runnable(this) { // from class: f.o2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p2 f1127b;

            {
                this.f1127b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        this.f1127b.c(false);
                        break;
                    default:
                        this.f1127b.a();
                        break;
                }
            }
        };
        this.f1132a = view;
        this.f1133b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = f0.q0.f1284a;
        this.c = Build.VERSION.SDK_INT >= 28 ? f0.o0.a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f1140j = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(p2 p2Var) {
        p2 p2Var2 = f1130k;
        if (p2Var2 != null) {
            p2Var2.f1132a.removeCallbacks(p2Var2.f1134d);
        }
        f1130k = p2Var;
        if (p2Var != null) {
            p2Var.f1132a.postDelayed(p2Var.f1134d, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        p2 p2Var = f1131l;
        View view = this.f1132a;
        if (p2Var == this) {
            f1131l = null;
            q2 q2Var = this.f1138h;
            if (q2Var != null) {
                View view2 = q2Var.f1149b;
                if (view2.getParent() != null) {
                    ((WindowManager) q2Var.f1148a.getSystemService("window")).removeView(view2);
                }
                this.f1138h = null;
                this.f1140j = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1130k == this) {
            b(null);
        }
        view.removeCallbacks(this.f1135e);
    }

    public final void c(boolean z) {
        int height;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long longPressTimeout;
        long j2;
        long j3;
        View view = this.f1132a;
        if (view.isAttachedToWindow()) {
            b(null);
            p2 p2Var = f1131l;
            if (p2Var != null) {
                p2Var.a();
            }
            f1131l = this;
            this.f1139i = z;
            q2 q2Var = new q2(view.getContext());
            this.f1138h = q2Var;
            int width = this.f1136f;
            int i7 = this.f1137g;
            boolean z2 = this.f1139i;
            View view2 = q2Var.f1149b;
            ViewParent parent = view2.getParent();
            Context context = q2Var.f1148a;
            if (parent != null && view2.getParent() != null) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            q2Var.c.setText(this.f1133b);
            IBinder applicationWindowToken = view.getApplicationWindowToken();
            WindowManager.LayoutParams layoutParams = q2Var.f1150d;
            layoutParams.token = applicationWindowToken;
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.NP_MANAGER6.NP_MANAGER);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.NP_MANAGER6.NP_MANAGER);
                height = i7 + dimensionPixelOffset2;
                i2 = i7 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i2 = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z2 ? R.NP_MANAGER6.NP_MANAGER : R.NP_MANAGER6.NP_MANAGER);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context2 = view.getContext();
                while (true) {
                    if (!(context2 instanceof ContextWrapper)) {
                        break;
                    }
                    if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    }
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                i6 = 1;
            } else {
                Rect rect = q2Var.f1151e;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i3 = width;
                    i4 = i2;
                    i5 = 0;
                    i6 = 1;
                } else {
                    Resources resources = context.getResources();
                    i6 = 1;
                    i3 = width;
                    i4 = i2;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i5 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = q2Var.f1153g;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = q2Var.f1152f;
                view.getLocationOnScreen(iArr2);
                int i8 = iArr2[i5] - iArr[i5];
                iArr2[i5] = i8;
                iArr2[i6] = iArr2[i6] - iArr[i6];
                layoutParams.x = (i8 + i3) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, i5);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i9 = iArr2[i6];
                int i10 = ((i9 + i4) - dimensionPixelOffset3) - measuredHeight;
                int i11 = i9 + height + dimensionPixelOffset3;
                if (z2) {
                    if (i10 >= 0) {
                        layoutParams.y = i10;
                    } else {
                        layoutParams.y = i11;
                    }
                } else if (measuredHeight + i11 <= rect.height()) {
                    layoutParams.y = i11;
                } else {
                    layoutParams.y = i10;
                }
            }
            ((WindowManager) context.getSystemService("window")).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.f1139i) {
                j3 = 2500;
            } else {
                Field field = f0.m0.f1276a;
                if ((view.getWindowSystemUiVisibility() & 1) == i6) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j2 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j2 = 15000;
                }
                j3 = j2 - longPressTimeout;
            }
            o2 o2Var = this.f1135e;
            view.removeCallbacks(o2Var);
            view.postDelayed(o2Var, j3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onHover(android.view.View r4, android.view.MotionEvent r5) {
        /*
            r3 = this;
            f.q2 r4 = r3.f1138h
            r0 = 0
            if (r4 == 0) goto La
            boolean r4 = r3.f1139i
            if (r4 == 0) goto La
            goto L6f
        La:
            android.view.View r4 = r3.f1132a
            android.content.Context r1 = r4.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L25
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 == 0) goto L25
            goto L6f
        L25:
            int r1 = r5.getAction()
            r2 = 7
            if (r1 == r2) goto L38
            r4 = 10
            if (r1 == r4) goto L31
            goto L6f
        L31:
            r4 = 1
            r3.f1140j = r4
            r3.a()
            return r0
        L38:
            boolean r4 = r4.isEnabled()
            if (r4 == 0) goto L6f
            f.q2 r4 = r3.f1138h
            if (r4 != 0) goto L6f
            float r4 = r5.getX()
            int r4 = (int) r4
            float r5 = r5.getY()
            int r5 = (int) r5
            boolean r1 = r3.f1140j
            if (r1 != 0) goto L66
            int r1 = r3.f1136f
            int r1 = r4 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.c
            if (r1 > r2) goto L66
            int r1 = r3.f1137g
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r1 <= r2) goto L6f
        L66:
            r3.f1136f = r4
            r3.f1137g = r5
            r3.f1140j = r0
            b(r3)
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f.p2.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f1136f = view.getWidth() / 2;
        this.f1137g = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
