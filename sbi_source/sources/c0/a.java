package c0;

import android.graphics.Typeface;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.emoji2.text.n;
import com.google.android.material.behavior.SwipeDismissBehavior;
import f.d2;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f465b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(Object obj, Object obj2, int i2) {
        this.f464a = i2;
        this.f465b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n nVar;
        d2 d2Var;
        f.g gVar;
        switch (this.f464a) {
            case 0:
                n nVar2 = (n) this.f465b;
                Typeface typeface = (Typeface) this.c;
                w.b bVar = (w.b) nVar2.f244b;
                if (bVar != null) {
                    bVar.e(typeface);
                    return;
                }
                return;
            case 1:
                ((f) this.f465b).accept(this.c);
                return;
            case 2:
                f.g gVar2 = (f.g) this.f465b;
                f.j jVar = (f.j) this.c;
                e.j jVar2 = jVar.c;
                if (jVar2 != null && (nVar = jVar2.f896e) != null && (d2Var = ((ActionMenuView) nVar.f244b).f81t) != null) {
                    Toolbar toolbar = d2Var.f1000a;
                    f.j jVar3 = toolbar.f99a.f80s;
                    if (jVar3 == null || (gVar = jVar3.f1060r) == null || !gVar.b()) {
                        Iterator it = ((CopyOnWriteArrayList) toolbar.G.f244b).iterator();
                        if (it.hasNext()) {
                            ((androidx.fragment.app.i) it.next()).getClass();
                            throw null;
                        }
                    }
                }
                ActionMenuView actionMenuView = jVar.f1049g;
                if (actionMenuView != null && actionMenuView.getWindowToken() != null) {
                    if (gVar2.b()) {
                        jVar.f1060r = gVar2;
                    } else if (gVar2.f941e != null) {
                        gVar2.d(0, 0, false, false);
                        jVar.f1060r = gVar2;
                    }
                }
                jVar.f1062t = null;
                return;
            default:
                m0.e eVar = ((SwipeDismissBehavior) this.c).f541a;
                if (eVar == null || !eVar.f()) {
                    return;
                }
                ((View) this.f465b).postOnAnimation(this);
                return;
        }
    }

    public a(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.f464a = 3;
        this.c = swipeDismissBehavior;
        this.f465b = view;
    }

    public a(f.j jVar, f.g gVar) {
        this.f464a = 2;
        this.c = jVar;
        this.f465b = gVar;
    }
}
