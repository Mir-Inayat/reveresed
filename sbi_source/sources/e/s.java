package e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.redhand.laugiytr.R;
import f.a0;
import f.q1;
import f.r1;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class s extends l implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f948b;
    public final j c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f951f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f952g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r1 f953h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PopupWindow.OnDismissListener f956k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f957l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f958m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public o f959n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ViewTreeObserver f960o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f961p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f962q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f963r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f965t;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c f954i = new c(this, 1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d f955j = new d(1, this);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f964s = 0;

    public s(Context context, j jVar, View view, int i2, boolean z) {
        this.f948b = context;
        this.c = jVar;
        this.f950e = z;
        this.f949d = new h(jVar, LayoutInflater.from(context), z, R.NP_MANAGER11.NP_MANAGER);
        this.f952g = i2;
        Resources resources = context.getResources();
        this.f951f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.NP_MANAGER6.NP_MANAGER));
        this.f957l = view;
        this.f953h = new r1(context, i2);
        jVar.b(this, context);
    }

    @Override // e.p
    public final void a(j jVar, boolean z) {
        if (jVar != this.c) {
            return;
        }
        dismiss();
        o oVar = this.f959n;
        if (oVar != null) {
            oVar.a(jVar, z);
        }
    }

    @Override // e.r
    public final void c() {
        View view;
        if (g()) {
            return;
        }
        if (this.f961p || (view = this.f957l) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f958m = view;
        r1 r1Var = this.f953h;
        a0 a0Var = r1Var.f1105v;
        a0 a0Var2 = r1Var.f1105v;
        a0Var.setOnDismissListener(this);
        r1Var.f1096m = this;
        r1Var.f1104u = true;
        a0Var2.setFocusable(true);
        View view2 = this.f958m;
        boolean z = this.f960o == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f960o = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f954i);
        }
        view2.addOnAttachStateChangeListener(this.f955j);
        r1Var.f1095l = view2;
        r1Var.f1093j = this.f964s;
        boolean z2 = this.f962q;
        Context context = this.f948b;
        h hVar = this.f949d;
        if (!z2) {
            this.f963r = l.m(hVar, context, this.f951f);
            this.f962q = true;
        }
        int i2 = this.f963r;
        Rect rect = r1Var.f1102s;
        Drawable background = a0Var2.getBackground();
        if (background != null) {
            background.getPadding(rect);
            r1Var.f1087d = rect.left + rect.right + i2;
        } else {
            r1Var.f1087d = i2;
        }
        a0Var2.setInputMethodMode(2);
        Rect rect2 = this.f936a;
        r1Var.f1103t = rect2 != null ? new Rect(rect2) : null;
        r1Var.c();
        q1 q1Var = r1Var.c;
        q1Var.setOnKeyListener(this);
        if (this.f965t) {
            j jVar = this.c;
            if (jVar.f903l != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.NP_MANAGER11.NP_MANAGER, (ViewGroup) q1Var, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(jVar.f903l);
                }
                frameLayout.setEnabled(false);
                q1Var.addHeaderView(frameLayout, null, false);
            }
        }
        r1Var.a(hVar);
        r1Var.c();
    }

    @Override // e.p
    public final boolean d() {
        return false;
    }

    @Override // e.r
    public final void dismiss() {
        if (g()) {
            this.f953h.dismiss();
        }
    }

    @Override // e.p
    public final void e() {
        this.f962q = false;
        h hVar = this.f949d;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    @Override // e.p
    public final void f(o oVar) {
        this.f959n = oVar;
    }

    @Override // e.r
    public final boolean g() {
        return !this.f961p && this.f953h.f1105v.isShowing();
    }

    @Override // e.r
    public final ListView h() {
        return this.f953h.c;
    }

    @Override // e.p
    public final boolean j(t tVar) {
        boolean z;
        if (tVar.hasVisibleItems()) {
            n nVar = new n(this.f948b, tVar, this.f958m, this.f950e, this.f952g, 0);
            o oVar = this.f959n;
            nVar.f944h = oVar;
            l lVar = nVar.f945i;
            if (lVar != null) {
                lVar.f(oVar);
            }
            int size = tVar.f897f.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    z = false;
                    break;
                }
                MenuItem item = tVar.getItem(i2);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i2++;
            }
            nVar.f943g = z;
            l lVar2 = nVar.f945i;
            if (lVar2 != null) {
                lVar2.o(z);
            }
            nVar.f946j = this.f956k;
            this.f956k = null;
            this.c.c(false);
            r1 r1Var = this.f953h;
            int width = r1Var.f1088e;
            int i3 = !r1Var.f1090g ? 0 : r1Var.f1089f;
            if ((Gravity.getAbsoluteGravity(this.f964s, this.f957l.getLayoutDirection()) & 7) == 5) {
                width += this.f957l.getWidth();
            }
            if (!nVar.b()) {
                if (nVar.f941e != null) {
                    nVar.d(width, i3, true, true);
                }
            }
            o oVar2 = this.f959n;
            if (oVar2 != null) {
                oVar2.r(tVar);
            }
            return true;
        }
        return false;
    }

    @Override // e.l
    public final void n(View view) {
        this.f957l = view;
    }

    @Override // e.l
    public final void o(boolean z) {
        this.f949d.c = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f961p = true;
        this.c.c(true);
        ViewTreeObserver viewTreeObserver = this.f960o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f960o = this.f958m.getViewTreeObserver();
            }
            this.f960o.removeGlobalOnLayoutListener(this.f954i);
            this.f960o = null;
        }
        this.f958m.removeOnAttachStateChangeListener(this.f955j);
        PopupWindow.OnDismissListener onDismissListener = this.f956k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // e.l
    public final void p(int i2) {
        this.f964s = i2;
    }

    @Override // e.l
    public final void q(int i2) {
        this.f953h.f1088e = i2;
    }

    @Override // e.l
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f956k = onDismissListener;
    }

    @Override // e.l
    public final void s(boolean z) {
        this.f965t = z;
    }

    @Override // e.l
    public final void t(int i2) {
        r1 r1Var = this.f953h;
        r1Var.f1089f = i2;
        r1Var.f1090g = true;
    }

    @Override // e.l
    public final void l(j jVar) {
    }
}
