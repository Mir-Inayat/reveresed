package v0;

import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2415b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2417e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2418f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2419g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2420h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2421i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List f2422j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f2423k;

    public final void a(View view) {
        if (this.f2422j.size() <= 0) {
            this.f2416d = -1;
        } else {
            ((o0) this.f2422j.get(0)).getClass();
            throw null;
        }
    }

    public final View b(i0 i0Var) {
        List list = this.f2422j;
        if (list == null) {
            View viewD = i0Var.d(this.f2416d);
            this.f2416d += this.f2417e;
            return viewD;
        }
        if (list.size() <= 0) {
            return null;
        }
        ((o0) this.f2422j.get(0)).getClass();
        throw null;
    }
}
