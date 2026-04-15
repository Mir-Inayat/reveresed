package e;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.redhand.laugiytr.R;
import f.a0;
import f.o1;
import f.r1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class g extends l implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f864b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f866e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f867f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f875n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f876o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f877p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f878q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f879r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f880s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f881t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f883v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public o f884w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ViewTreeObserver f885x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public PopupWindow.OnDismissListener f886y;
    public boolean z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f868g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f869h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c f870i = new c(this, 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d f871j = new d(0, this);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final androidx.emoji2.text.n f872k = new androidx.emoji2.text.n(5, this);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f873l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f874m = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f882u = false;

    public g(Context context, View view, int i2, boolean z) {
        this.f864b = context;
        this.f875n = view;
        this.f865d = i2;
        this.f866e = z;
        this.f877p = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.NP_MANAGER6.NP_MANAGER));
        this.f867f = new Handler();
    }

    @Override // e.p
    public final void a(j jVar, boolean z) {
        ArrayList arrayList = this.f869h;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (jVar == ((f) arrayList.get(i2)).f863b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0) {
            return;
        }
        int i3 = i2 + 1;
        if (i3 < arrayList.size()) {
            ((f) arrayList.get(i3)).f863b.c(false);
        }
        f fVar = (f) arrayList.remove(i2);
        j jVar2 = fVar.f863b;
        r1 r1Var = fVar.f862a;
        a0 a0Var = r1Var.f1105v;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = jVar2.f909r;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            p pVar = (p) weakReference.get();
            if (pVar == null || pVar == this) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        if (this.z) {
            o1.b(a0Var, null);
            a0Var.setAnimationStyle(0);
        }
        r1Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f877p = ((f) arrayList.get(size2 - 1)).c;
        } else {
            this.f877p = this.f875n.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((f) arrayList.get(0)).f863b.c(false);
                return;
            }
            return;
        }
        dismiss();
        o oVar = this.f884w;
        if (oVar != null) {
            oVar.a(jVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f885x;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f885x.removeGlobalOnLayoutListener(this.f870i);
            }
            this.f885x = null;
        }
        this.f876o.removeOnAttachStateChangeListener(this.f871j);
        this.f886y.onDismiss();
    }

    @Override // e.r
    public final void c() {
        if (g()) {
            return;
        }
        ArrayList arrayList = this.f868g;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            u((j) obj);
        }
        arrayList.clear();
        View view = this.f875n;
        this.f876o = view;
        if (view != null) {
            boolean z = this.f885x == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f885x = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f870i);
            }
            this.f876o.addOnAttachStateChangeListener(this.f871j);
        }
    }

    @Override // e.p
    public final boolean d() {
        return false;
    }

    @Override // e.r
    public final void dismiss() {
        ArrayList arrayList = this.f869h;
        int size = arrayList.size();
        if (size > 0) {
            f[] fVarArr = (f[]) arrayList.toArray(new f[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                f fVar = fVarArr[i2];
                if (fVar.f862a.f1105v.isShowing()) {
                    fVar.f862a.dismiss();
                }
            }
        }
    }

    @Override // e.p
    public final void e() {
        ArrayList arrayList = this.f869h;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ListAdapter adapter = ((f) obj).f862a.c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((h) adapter).notifyDataSetChanged();
        }
    }

    @Override // e.p
    public final void f(o oVar) {
        this.f884w = oVar;
    }

    @Override // e.r
    public final boolean g() {
        ArrayList arrayList = this.f869h;
        return arrayList.size() > 0 && ((f) arrayList.get(0)).f862a.f1105v.isShowing();
    }

    @Override // e.r
    public final ListView h() {
        ArrayList arrayList = this.f869h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((f) arrayList.get(arrayList.size() - 1)).f862a.c;
    }

    @Override // e.p
    public final boolean j(t tVar) {
        ArrayList arrayList = this.f869h;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            f fVar = (f) obj;
            if (tVar == fVar.f863b) {
                fVar.f862a.c.requestFocus();
                return true;
            }
        }
        if (!tVar.hasVisibleItems()) {
            return false;
        }
        l(tVar);
        o oVar = this.f884w;
        if (oVar != null) {
            oVar.r(tVar);
        }
        return true;
    }

    @Override // e.l
    public final void l(j jVar) {
        jVar.b(this, this.f864b);
        if (g()) {
            u(jVar);
        } else {
            this.f868g.add(jVar);
        }
    }

    @Override // e.l
    public final void n(View view) {
        if (this.f875n != view) {
            this.f875n = view;
            this.f874m = Gravity.getAbsoluteGravity(this.f873l, view.getLayoutDirection());
        }
    }

    @Override // e.l
    public final void o(boolean z) {
        this.f882u = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        f fVar;
        ArrayList arrayList = this.f869h;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                fVar = null;
                break;
            }
            fVar = (f) arrayList.get(i2);
            if (!fVar.f862a.f1105v.isShowing()) {
                break;
            } else {
                i2++;
            }
        }
        if (fVar != null) {
            fVar.f863b.c(false);
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
        if (this.f873l != i2) {
            this.f873l = i2;
            this.f874m = Gravity.getAbsoluteGravity(i2, this.f875n.getLayoutDirection());
        }
    }

    @Override // e.l
    public final void q(int i2) {
        this.f878q = true;
        this.f880s = i2;
    }

    @Override // e.l
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f886y = onDismissListener;
    }

    @Override // e.l
    public final void s(boolean z) {
        this.f883v = z;
    }

    @Override // e.l
    public final void t(int i2) {
        this.f879r = true;
        this.f881t = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(e.j r18) {
        /*
            Method dump skipped, instruction units count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.g.u(e.j):void");
    }
}
