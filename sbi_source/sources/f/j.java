package f;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.redhand.laugiytr.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class j implements e.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f1045b;
    public e.j c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LayoutInflater f1046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e.o f1047e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ActionMenuView f1049g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i f1050h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Drawable f1051i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1052j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f1053k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1054l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1055m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1056n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1057o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f1058p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public g f1060r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public g f1061s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public c0.a f1062t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public h f1063u;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1048f = R.NP_MANAGER11.NP_MANAGER;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final SparseBooleanArray f1059q = new SparseBooleanArray();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final androidx.emoji2.text.n f1064v = new androidx.emoji2.text.n(6, this);

    public j(Context context) {
        this.f1044a = context;
        this.f1046d = LayoutInflater.from(context);
    }

    @Override // e.p
    public final void a(e.j jVar, boolean z) {
        g();
        g gVar = this.f1061s;
        if (gVar != null && gVar.b()) {
            gVar.f945i.dismiss();
        }
        e.o oVar = this.f1047e;
        if (oVar != null) {
            oVar.a(jVar, z);
        }
    }

    @Override // e.p
    public final boolean b(e.k kVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View c(e.k kVar, View view, ActionMenuView actionMenuView) {
        View view2 = kVar.z;
        View view3 = view2 != null ? view2 : null;
        if (view3 == null || ((kVar.f935y & 8) != 0 && view2 != null)) {
            e.q qVar = view instanceof e.q ? (e.q) view : (e.q) this.f1046d.inflate(this.f1048f, (ViewGroup) actionMenuView, false);
            qVar.b(kVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) qVar;
            actionMenuItemView.setItemInvoker(this.f1049g);
            if (this.f1063u == null) {
                this.f1063u = new h(this);
            }
            actionMenuItemView.setPopupCallback(this.f1063u);
            view3 = (View) qVar;
        }
        view3.setVisibility(kVar.B ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        actionMenuView.getClass();
        if (!(layoutParams instanceof l)) {
            view3.setLayoutParams(ActionMenuView.j(layoutParams));
        }
        return view3;
    }

    @Override // e.p
    public final boolean d() {
        int size;
        ArrayList arrayListK;
        int i2;
        boolean z;
        j jVar = this;
        e.j jVar2 = jVar.c;
        if (jVar2 != null) {
            arrayListK = jVar2.k();
            size = arrayListK.size();
        } else {
            size = 0;
            arrayListK = null;
        }
        int i3 = jVar.f1057o;
        int i4 = jVar.f1056n;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ActionMenuView actionMenuView = jVar.f1049g;
        int i5 = 0;
        boolean z2 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z = true;
            if (i5 >= size) {
                break;
            }
            e.k kVar = (e.k) arrayListK.get(i5);
            int i8 = kVar.f935y;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z2 = true;
            }
            if (jVar.f1058p && kVar.B) {
                i3 = 0;
            }
            i5++;
        }
        if (jVar.f1053k && (z2 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = jVar.f1059q;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            e.k kVar2 = (e.k) arrayListK.get(i10);
            int i12 = kVar2.f935y;
            boolean z3 = (i12 & 2) == i2 ? z : false;
            int i13 = kVar2.f913b;
            if (z3) {
                View viewC = jVar.c(kVar2, null, actionMenuView);
                viewC.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewC.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z);
                }
                kVar2.d(z);
            } else if ((i12 & 1) == z) {
                boolean z4 = sparseBooleanArray.get(i13);
                boolean z5 = ((i9 > 0 || z4) && i4 > 0) ? z : false;
                if (z5) {
                    View viewC2 = jVar.c(kVar2, null, actionMenuView);
                    viewC2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewC2.getMeasuredWidth();
                    i4 -= measuredWidth2;
                    if (i11 == 0) {
                        i11 = measuredWidth2;
                    }
                    z5 &= i4 + i11 > 0;
                }
                if (z5 && i13 != 0) {
                    sparseBooleanArray.put(i13, true);
                } else if (z4) {
                    sparseBooleanArray.put(i13, false);
                    for (int i14 = 0; i14 < i10; i14++) {
                        e.k kVar3 = (e.k) arrayListK.get(i14);
                        if (kVar3.f913b == i13) {
                            if ((kVar3.f934x & 32) == 32) {
                                i9++;
                            }
                            kVar3.d(false);
                        }
                    }
                }
                if (z5) {
                    i9--;
                }
                kVar2.d(z5);
            } else {
                kVar2.d(false);
                i10++;
                i2 = 2;
                jVar = this;
                z = true;
            }
            i10++;
            i2 = 2;
            jVar = this;
            z = true;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e.p
    public final void e() {
        int i2;
        ActionMenuView actionMenuView = this.f1049g;
        ArrayList arrayList = null;
        boolean z = false;
        if (actionMenuView != null) {
            e.j jVar = this.c;
            if (jVar != null) {
                jVar.i();
                ArrayList arrayListK = this.c.k();
                int size = arrayListK.size();
                i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    e.k kVar = (e.k) arrayListK.get(i3);
                    if ((kVar.f934x & 32) == 32) {
                        View childAt = actionMenuView.getChildAt(i2);
                        e.k itemData = childAt instanceof e.q ? ((e.q) childAt).getItemData() : null;
                        View viewC = c(kVar, childAt, actionMenuView);
                        if (kVar != itemData) {
                            viewC.setPressed(false);
                            viewC.jumpDrawablesToCurrentState();
                        }
                        if (viewC != childAt) {
                            ViewGroup viewGroup = (ViewGroup) viewC.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(viewC);
                            }
                            this.f1049g.addView(viewC, i2);
                        }
                        i2++;
                    }
                }
            } else {
                i2 = 0;
            }
            while (i2 < actionMenuView.getChildCount()) {
                if (actionMenuView.getChildAt(i2) == this.f1050h) {
                    i2++;
                } else {
                    actionMenuView.removeViewAt(i2);
                }
            }
        }
        this.f1049g.requestLayout();
        e.j jVar2 = this.c;
        if (jVar2 != null) {
            jVar2.i();
            ArrayList arrayList2 = jVar2.f900i;
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                ((e.k) arrayList2.get(i4)).getClass();
            }
        }
        e.j jVar3 = this.c;
        if (jVar3 != null) {
            jVar3.i();
            arrayList = jVar3.f901j;
        }
        if (this.f1053k && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((e.k) arrayList.get(0)).B;
            } else if (size3 > 0) {
                z = true;
            }
        }
        if (z) {
            if (this.f1050h == null) {
                this.f1050h = new i(this, this.f1044a);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.f1050h.getParent();
            if (viewGroup2 != this.f1049g) {
                if (viewGroup2 != null) {
                    viewGroup2.removeView(this.f1050h);
                }
                ActionMenuView actionMenuView2 = this.f1049g;
                i iVar = this.f1050h;
                actionMenuView2.getClass();
                l lVarI = ActionMenuView.i();
                lVarI.f1069a = true;
                actionMenuView2.addView(iVar, lVarI);
            }
        } else {
            i iVar2 = this.f1050h;
            if (iVar2 != null) {
                ViewParent parent = iVar2.getParent();
                ActionMenuView actionMenuView3 = this.f1049g;
                if (parent == actionMenuView3) {
                    actionMenuView3.removeView(this.f1050h);
                }
            }
        }
        this.f1049g.setOverflowReserved(this.f1053k);
    }

    @Override // e.p
    public final void f(e.o oVar) {
        throw null;
    }

    public final boolean g() {
        ActionMenuView actionMenuView;
        c0.a aVar = this.f1062t;
        if (aVar != null && (actionMenuView = this.f1049g) != null) {
            actionMenuView.removeCallbacks(aVar);
            this.f1062t = null;
            return true;
        }
        g gVar = this.f1060r;
        if (gVar == null) {
            return false;
        }
        if (gVar.b()) {
            gVar.f945i.dismiss();
        }
        return true;
    }

    public final boolean h() {
        e.j jVar;
        if (!this.f1053k) {
            return false;
        }
        g gVar = this.f1060r;
        if ((gVar != null && gVar.b()) || (jVar = this.c) == null || this.f1049g == null || this.f1062t != null) {
            return false;
        }
        jVar.i();
        if (jVar.f901j.isEmpty()) {
            return false;
        }
        c0.a aVar = new c0.a(this, new g(this, this.f1045b, this.c, this.f1050h));
        this.f1062t = aVar;
        this.f1049g.post(aVar);
        return true;
    }

    @Override // e.p
    public final void i(Context context, e.j jVar) {
        this.f1045b = context;
        LayoutInflater.from(context);
        this.c = jVar;
        Resources resources = context.getResources();
        if (!this.f1054l) {
            this.f1053k = true;
        }
        int i2 = 2;
        this.f1055m = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i3 = configuration.screenWidthDp;
        int i4 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i3 > 600 || ((i3 > 960 && i4 > 720) || (i3 > 720 && i4 > 960))) {
            i2 = 5;
        } else if (i3 >= 500 || ((i3 > 640 && i4 > 480) || (i3 > 480 && i4 > 640))) {
            i2 = 4;
        } else if (i3 >= 360) {
            i2 = 3;
        }
        this.f1057o = i2;
        int measuredWidth = this.f1055m;
        if (this.f1053k) {
            if (this.f1050h == null) {
                i iVar = new i(this, this.f1044a);
                this.f1050h = iVar;
                if (this.f1052j) {
                    iVar.setImageDrawable(this.f1051i);
                    this.f1051i = null;
                    this.f1052j = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1050h.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f1050h.getMeasuredWidth();
        } else {
            this.f1050h = null;
        }
        this.f1056n = measuredWidth;
        float f3 = resources.getDisplayMetrics().density;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e.p
    public final boolean j(e.t tVar) {
        boolean z;
        if (tVar.hasVisibleItems()) {
            e.t tVar2 = tVar;
            while (true) {
                e.j jVar = tVar2.f966v;
                if (jVar == this.c) {
                    break;
                }
                tVar2 = (e.t) jVar;
            }
            e.k kVar = tVar2.f967w;
            ActionMenuView actionMenuView = this.f1049g;
            View view = null;
            view = null;
            if (actionMenuView != null) {
                int childCount = actionMenuView.getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        break;
                    }
                    View childAt = actionMenuView.getChildAt(i2);
                    if ((childAt instanceof e.q) && ((e.q) childAt).getItemData() == kVar) {
                        view = childAt;
                        break;
                    }
                    i2++;
                }
            }
            if (view != null) {
                tVar.f967w.getClass();
                int size = tVar.f897f.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = tVar.getItem(i3);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i3++;
                }
                g gVar = new g(this, this.f1045b, tVar, view);
                this.f1061s = gVar;
                gVar.f943g = z;
                e.l lVar = gVar.f945i;
                if (lVar != null) {
                    lVar.o(z);
                }
                g gVar2 = this.f1061s;
                if (!gVar2.b()) {
                    if (gVar2.f941e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    gVar2.d(0, 0, false, false);
                }
                e.o oVar = this.f1047e;
                if (oVar != null) {
                    oVar.r(tVar);
                }
                return true;
            }
        }
        return false;
    }

    @Override // e.p
    public final boolean k(e.k kVar) {
        return false;
    }
}
