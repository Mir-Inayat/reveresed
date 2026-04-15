package v0;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v f2451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f2452b;
    public long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f2453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f2454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f2455f;

    public final void a(o0 o0Var) {
        v vVar = this.f2451a;
        if (vVar != null) {
            RecyclerView recyclerView = vVar.f2448a;
            boolean z = true;
            o0Var.m(true);
            if ((o0Var.f2398b & 16) != 0) {
                return;
            }
            i0 i0Var = recyclerView.f381a;
            recyclerView.F();
            androidx.emoji2.text.t tVar = recyclerView.f386d;
            b bVar = (b) tVar.c;
            v vVar2 = (v) tVar.f253b;
            int iIndexOfChild = vVar2.f2448a.indexOfChild(null);
            if (iIndexOfChild == -1) {
                tVar.A(null);
            } else if (bVar.d(iIndexOfChild)) {
                bVar.f(iIndexOfChild);
                tVar.A(null);
                vVar2.a(iIndexOfChild);
            } else {
                z = false;
            }
            if (z) {
                o0 o0VarS = RecyclerView.s(null);
                i0Var.j(o0VarS);
                i0Var.h(o0VarS);
            }
            recyclerView.G(!z);
            if (z || !o0Var.j()) {
                return;
            }
            recyclerView.removeDetachedView(null, false);
        }
    }

    public abstract void b(o0 o0Var);

    public abstract void c();

    public abstract boolean d();
}
