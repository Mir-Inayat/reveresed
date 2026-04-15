package i;

import android.view.View;
import androidx.emoji2.text.n;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import v0.r0;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1380b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f1383f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f1384g;

    public j(int i2) {
        this.f1379a = 0;
        this.f1380b = i2;
        if (i2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f1383f = new n(15);
        this.f1384g = new t1.g(10);
    }

    public void a() {
        View view = (View) ((ArrayList) this.f1383f).get(r0.size() - 1);
        r0 r0Var = (r0) view.getLayoutParams();
        this.c = ((StaggeredGridLayoutManager) this.f1384g).f417m.b(view);
        r0Var.getClass();
    }

    public void b() {
        ((ArrayList) this.f1383f).clear();
        this.f1380b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.f1381d = 0;
    }

    public Object c(Object obj) {
        d2.c.e(obj, "key");
        synchronized (((t1.g) this.f1384g)) {
            n nVar = (n) this.f1383f;
            nVar.getClass();
            Object obj2 = ((LinkedHashMap) nVar.f244b).get(obj);
            if (obj2 != null) {
                this.f1381d++;
                return obj2;
            }
            this.f1382e++;
            return null;
        }
    }

    public int d(int i2) {
        int i3 = this.c;
        if (i3 != Integer.MIN_VALUE) {
            return i3;
        }
        if (((ArrayList) this.f1383f).size() == 0) {
            return i2;
        }
        a();
        return this.c;
    }

    public int e(int i2) {
        ArrayList arrayList = (ArrayList) this.f1383f;
        int i3 = this.f1380b;
        if (i3 != Integer.MIN_VALUE) {
            return i3;
        }
        if (arrayList.size() == 0) {
            return i2;
        }
        View view = (View) arrayList.get(0);
        r0 r0Var = (r0) view.getLayoutParams();
        this.f1380b = ((StaggeredGridLayoutManager) this.f1384g).f417m.e(view);
        r0Var.getClass();
        return this.f1380b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c4, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cc, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(java.lang.Object r6, java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.j.f(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public String toString() {
        String str;
        switch (this.f1379a) {
            case 0:
                synchronized (((t1.g) this.f1384g)) {
                    try {
                        int i2 = this.f1381d;
                        int i3 = this.f1382e + i2;
                        str = "LruCache[maxSize=" + this.f1380b + ",hits=" + this.f1381d + ",misses=" + this.f1382e + ",hitRate=" + (i3 != 0 ? (i2 * 100) / i3 : 0) + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public j(StaggeredGridLayoutManager staggeredGridLayoutManager, int i2) {
        this.f1379a = 1;
        this.f1384g = staggeredGridLayoutManager;
        this.f1383f = new ArrayList();
        this.f1380b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.f1381d = 0;
        this.f1382e = i2;
    }
}
