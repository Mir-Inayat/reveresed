package androidx.fragment.app;

import android.util.Log;
import androidx.emoji2.text.n;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f301a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f302b = new n(3);
    public ArrayList c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicInteger f303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f304e;

    public k() {
        new t1.g(this, 7);
        this.f303d = new AtomicInteger();
        Collections.synchronizedMap(new HashMap());
        Collections.synchronizedMap(new HashMap());
        Collections.synchronizedMap(new HashMap());
        new t1.g(this, 6);
        new CopyOnWriteArrayList();
        final int i2 = 0;
        new e0.a(this) { // from class: androidx.fragment.app.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f299b;

            {
                this.f299b = this;
            }

            @Override // e0.a
            public final void accept(Object obj) {
                switch (i2) {
                    case 0:
                        this.f299b.a(false);
                        break;
                    default:
                        if (((Integer) obj).intValue() == 80) {
                            this.f299b.c(false);
                        }
                        break;
                }
            }
        };
        final int i3 = 1;
        new e0.a(this) { // from class: androidx.fragment.app.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f299b;

            {
                this.f299b = this;
            }

            @Override // e0.a
            public final void accept(Object obj) {
                switch (i3) {
                    case 0:
                        this.f299b.a(false);
                        break;
                    default:
                        if (((Integer) obj).intValue() == 80) {
                            this.f299b.c(false);
                        }
                        break;
                }
            }
        };
        final int i4 = 0;
        new e0.a(this) { // from class: androidx.fragment.app.h
            @Override // e0.a
            public final void accept(Object obj) {
                switch (i4) {
                    case 0:
                        if (obj != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    default:
                        if (obj != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                }
            }
        };
        final int i5 = 1;
        new e0.a(this) { // from class: androidx.fragment.app.h
            @Override // e0.a
            public final void accept(Object obj) {
                switch (i5) {
                    case 0:
                        if (obj != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    default:
                        if (obj != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                }
            }
        };
        this.f304e = -1;
        new ArrayDeque();
        new b(i5, this);
    }

    public static boolean f(int i2) {
        return Log.isLoggable("FragmentManager", i2);
    }

    public static boolean g(f fVar) {
        return fVar == null || fVar.f292d;
    }

    public final void a(boolean z) {
        for (f fVar : this.f302b.w()) {
            if (fVar != null && z) {
                fVar.c.a(true);
            }
        }
    }

    public final boolean b() {
        if (this.f304e < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (f fVar : this.f302b.w()) {
            if (fVar != null && g(fVar) && fVar.c.b()) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fVar);
                z = true;
            }
        }
        if (this.c != null) {
            for (int i2 = 0; i2 < this.c.size(); i2++) {
                f fVar2 = (f) this.c.get(i2);
                if (arrayList == null || !arrayList.contains(fVar2)) {
                    fVar2.getClass();
                }
            }
        }
        this.c = arrayList;
        return z;
    }

    public final void c(boolean z) {
        for (f fVar : this.f302b.w()) {
            if (fVar != null && z) {
                fVar.c.c(true);
            }
        }
    }

    public final boolean d() {
        if (this.f304e < 1) {
            return false;
        }
        for (f fVar : this.f302b.w()) {
            if (fVar != null && fVar.c.d()) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        boolean z = false;
        if (this.f304e < 1) {
            return false;
        }
        for (f fVar : this.f302b.w()) {
            if (fVar != null && g(fVar) && fVar.c.e()) {
                z = true;
            }
        }
        return z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        sb.append("null");
        sb.append("}}");
        return sb.toString();
    }
}
