package v0;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f2332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f2333b;
    public final ArrayList c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2335e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h0 f2336f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2337g;

    public i0(RecyclerView recyclerView) {
        this.f2337g = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f2332a = arrayList;
        this.f2333b = null;
        this.c = new ArrayList();
        Collections.unmodifiableList(arrayList);
        this.f2334d = 2;
        this.f2335e = 2;
    }

    public final void a(o0 o0Var, boolean z) {
        RecyclerView.e(o0Var);
        o0Var.getClass();
        RecyclerView recyclerView = this.f2337g;
        q0 q0Var = recyclerView.f387d0;
        if (q0Var != null) {
            p0 p0Var = q0Var.f2413e;
            f0.m0.j(null, p0Var != null ? (f0.b) p0Var.f2408e.remove(null) : null);
        }
        if (z) {
            ArrayList arrayList = recyclerView.f400k;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
            if (recyclerView.W != null) {
                androidx.emoji2.text.q qVar = recyclerView.f388e;
                i.h hVar = (i.h) qVar.c;
                int iE = hVar.e() - 1;
                while (true) {
                    if (iE < 0) {
                        break;
                    }
                    if (o0Var == hVar.f(iE)) {
                        Object[] objArr = hVar.c;
                        Object obj = objArr[iE];
                        Object obj2 = i.i.f1377a;
                        if (obj != obj2) {
                            objArr[iE] = obj2;
                            hVar.f1374a = true;
                        }
                    } else {
                        iE--;
                    }
                }
                v0 v0Var = (v0) ((i.k) qVar.f246b).remove(o0Var);
                if (v0Var != null) {
                    v0Var.f2450a = 0;
                    v0.f2449b.c(v0Var);
                }
            }
        }
        o0Var.f2402g = null;
        h0 h0VarC = c();
        h0VarC.getClass();
        ArrayList arrayList2 = h0VarC.a(0).f2316a;
        if (((g0) h0VarC.f2330a.get(0)).f2317b <= arrayList2.size()) {
            return;
        }
        o0Var.l();
        arrayList2.add(o0Var);
    }

    public final int b(int i2) {
        RecyclerView recyclerView = this.f2337g;
        if (i2 >= 0 && i2 < recyclerView.W.a()) {
            return !recyclerView.W.f2371e ? i2 : recyclerView.c.i(i2, 0);
        }
        throw new IndexOutOfBoundsException("invalid position " + i2 + ". State item count is " + recyclerView.W.a() + recyclerView.p());
    }

    public final h0 c() {
        if (this.f2336f == null) {
            h0 h0Var = new h0();
            h0Var.f2330a = new SparseArray();
            h0Var.f2331b = 0;
            this.f2336f = h0Var;
        }
        return this.f2336f;
    }

    public final View d(int i2) {
        i(i2, Long.MAX_VALUE).getClass();
        return null;
    }

    public final void e() {
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.f378k0;
        o1.m mVar = this.f2337g.V;
        mVar.getClass();
        mVar.c = 0;
    }

    public final void f(int i2) {
        ArrayList arrayList = this.c;
        a((o0) arrayList.get(i2), true);
        arrayList.remove(i2);
    }

    public final void g(View view) {
        o0 o0VarS = RecyclerView.s(view);
        boolean zJ = o0VarS.j();
        RecyclerView recyclerView = this.f2337g;
        if (zJ) {
            recyclerView.removeDetachedView(view, false);
        }
        if (o0VarS.i()) {
            o0VarS.c.j(o0VarS);
        } else if (o0VarS.o()) {
            o0VarS.f2398b &= -33;
        }
        h(o0VarS);
        if (recyclerView.F == null || o0VarS.g()) {
            return;
        }
        recyclerView.F.b(o0VarS);
    }

    public final void h(o0 o0Var) {
        if (!o0Var.i()) {
            throw null;
        }
        StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
        sb.append(o0Var.i());
        sb.append(" isAttached:");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final v0.o0 i(int r9, long r10) {
        /*
            Method dump skipped, instruction units count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.i0.i(int, long):v0.o0");
    }

    public final void j(o0 o0Var) {
        if (o0Var.f2399d) {
            this.f2333b.remove(o0Var);
        } else {
            this.f2332a.remove(o0Var);
        }
        o0Var.c = null;
        o0Var.f2399d = false;
        o0Var.f2398b &= -33;
    }

    public final void k() {
        this.f2335e = this.f2334d + 0;
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f2335e; size--) {
            f(size);
        }
    }
}
