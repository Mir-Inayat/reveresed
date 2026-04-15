package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h.a f344b;
    public m c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakReference f345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f347f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f348g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f349h;

    public t(r rVar) {
        new AtomicReference();
        this.f343a = true;
        this.f344b = new h.a();
        this.c = m.f336b;
        this.f349h = new ArrayList();
        this.f345d = new WeakReference(rVar);
    }

    public final void a(q qVar) {
        p reflectiveGenericLifecycleObserver;
        Object obj;
        r rVar;
        c("addObserver");
        m mVar = this.c;
        m mVar2 = m.f335a;
        if (mVar != mVar2) {
            mVar2 = m.f336b;
        }
        s sVar = new s();
        HashMap map = u.f350a;
        boolean z = qVar instanceof p;
        boolean z2 = qVar instanceof d;
        if (z && z2) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((d) qVar, (p) qVar);
        } else if (z2) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((d) qVar, null);
        } else if (z) {
            reflectiveGenericLifecycleObserver = (p) qVar;
        } else {
            Class<?> cls = qVar.getClass();
            if (u.c(cls) == 2) {
                Object obj2 = u.f351b.get(cls);
                d2.c.b(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    u.a((Constructor) list.get(0), qVar);
                    throw null;
                }
                int size = list.size();
                g[] gVarArr = new g[size];
                if (size > 0) {
                    u.a((Constructor) list.get(0), qVar);
                    throw null;
                }
                reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(gVarArr);
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(qVar);
            }
        }
        sVar.f342b = reflectiveGenericLifecycleObserver;
        sVar.f341a = mVar2;
        h.a aVar = this.f344b;
        h.c cVarA = aVar.a(qVar);
        if (cVarA != null) {
            obj = cVarA.f1344b;
        } else {
            HashMap map2 = aVar.f1340e;
            h.c cVar = new h.c(qVar, sVar);
            aVar.f1350d++;
            h.c cVar2 = aVar.f1349b;
            if (cVar2 == null) {
                aVar.f1348a = cVar;
                aVar.f1349b = cVar;
            } else {
                cVar2.c = cVar;
                cVar.f1345d = cVar2;
                aVar.f1349b = cVar;
            }
            map2.put(qVar, cVar);
            obj = null;
        }
        if (((s) obj) == null && (rVar = (r) this.f345d.get()) != null) {
            boolean z3 = this.f346e != 0 || this.f347f;
            m mVarB = b(qVar);
            this.f346e++;
            while (sVar.f341a.compareTo(mVarB) < 0 && this.f344b.f1340e.containsKey(qVar)) {
                m mVar3 = sVar.f341a;
                ArrayList arrayList = this.f349h;
                arrayList.add(mVar3);
                j jVar = l.Companion;
                m mVar4 = sVar.f341a;
                jVar.getClass();
                d2.c.e(mVar4, "state");
                int iOrdinal = mVar4.ordinal();
                l lVar = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? null : l.ON_RESUME : l.ON_START : l.ON_CREATE;
                if (lVar == null) {
                    throw new IllegalStateException("no event up from " + sVar.f341a);
                }
                sVar.a(rVar, lVar);
                arrayList.remove(arrayList.size() - 1);
                mVarB = b(qVar);
            }
            if (!z3) {
                f();
            }
            this.f346e--;
        }
    }

    public final m b(q qVar) {
        HashMap map = this.f344b.f1340e;
        h.c cVar = map.containsKey(qVar) ? ((h.c) map.get(qVar)).f1345d : null;
        m mVar = cVar != null ? ((s) cVar.f1344b).f341a : null;
        ArrayList arrayList = this.f349h;
        m mVar2 = arrayList.isEmpty() ? null : (m) arrayList.get(arrayList.size() - 1);
        m mVar3 = this.c;
        d2.c.e(mVar3, "state1");
        if (mVar == null || mVar.compareTo(mVar3) >= 0) {
            mVar = mVar3;
        }
        return (mVar2 == null || mVar2.compareTo(mVar) >= 0) ? mVar : mVar2;
    }

    public final void c(String str) {
        g.a aVar;
        if (this.f343a) {
            if (g.a.f1319b != null) {
                aVar = g.a.f1319b;
            } else {
                synchronized (g.a.class) {
                    try {
                        if (g.a.f1319b == null) {
                            g.a.f1319b = new g.a(0);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                aVar = g.a.f1319b;
            }
            ((g.a) aVar.f1320a).getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    public final void d(l lVar) {
        d2.c.e(lVar, "event");
        c("handleLifecycleEvent");
        m mVarA = lVar.a();
        m mVar = this.c;
        if (mVar == mVarA) {
            return;
        }
        m mVar2 = m.f336b;
        m mVar3 = m.f335a;
        if (mVar == mVar2 && mVarA == mVar3) {
            throw new IllegalStateException(("no event down from " + this.c + " in component " + this.f345d.get()).toString());
        }
        this.c = mVarA;
        if (this.f347f || this.f346e != 0) {
            this.f348g = true;
            return;
        }
        this.f347f = true;
        f();
        this.f347f = false;
        if (this.c == mVar3) {
            this.f344b = new h.a();
        }
    }

    public final void e(q qVar) {
        c("removeObserver");
        this.f344b.b(qVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r12.f348g = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.t.f():void");
    }
}
