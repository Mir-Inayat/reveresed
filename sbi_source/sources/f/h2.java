package f;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class h2 implements e.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e.j f1025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e.k f1026b;
    public final /* synthetic */ Toolbar c;

    public h2(Toolbar toolbar) {
        this.c = toolbar;
    }

    @Override // e.p
    public final boolean b(e.k kVar) {
        Toolbar toolbar = this.c;
        toolbar.removeView(toolbar.f106i);
        toolbar.removeView(toolbar.f105h);
        toolbar.f106i = null;
        ArrayList arrayList = toolbar.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f1026b = null;
        toolbar.requestLayout();
        kVar.B = false;
        kVar.f924n.o(false);
        toolbar.s();
        return true;
    }

    @Override // e.p
    public final boolean d() {
        return false;
    }

    @Override // e.p
    public final void e() {
        if (this.f1026b != null) {
            e.j jVar = this.f1025a;
            if (jVar != null) {
                int size = jVar.f897f.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (this.f1025a.getItem(i2) == this.f1026b) {
                        return;
                    }
                }
            }
            b(this.f1026b);
        }
    }

    @Override // e.p
    public final void i(Context context, e.j jVar) {
        e.k kVar;
        e.j jVar2 = this.f1025a;
        if (jVar2 != null && (kVar = this.f1026b) != null) {
            jVar2.d(kVar);
        }
        this.f1025a = jVar;
    }

    @Override // e.p
    public final boolean j(e.t tVar) {
        return false;
    }

    @Override // e.p
    public final boolean k(e.k kVar) {
        Toolbar toolbar = this.c;
        toolbar.c();
        ViewParent parent = toolbar.f105h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f105h);
            }
            toolbar.addView(toolbar.f105h);
        }
        View view = kVar.z;
        if (view == null) {
            view = null;
        }
        toolbar.f106i = view;
        this.f1026b = kVar;
        ViewParent parent2 = view.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f106i);
            }
            i2 i2VarG = Toolbar.g();
            i2VarG.f1042a = (toolbar.f111n & 112) | 8388611;
            i2VarG.f1043b = 2;
            toolbar.f106i.setLayoutParams(i2VarG);
            toolbar.addView(toolbar.f106i);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((i2) childAt.getLayoutParams()).f1043b != 2 && childAt != toolbar.f99a) {
                toolbar.removeViewAt(childCount);
                toolbar.E.add(childAt);
            }
        }
        toolbar.requestLayout();
        kVar.B = true;
        kVar.f924n.o(false);
        toolbar.s();
        return true;
    }

    @Override // e.p
    public final void a(e.j jVar, boolean z) {
    }
}
