package x0;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import com.redhand.laugiytr.R;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import t1.e;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile a f2640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f2641e = new Object();
    public final Context c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f2643b = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f2642a = new HashMap();

    public a(Context context) {
        this.c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f2640d == null) {
            synchronized (f2641e) {
                try {
                    if (f2640d == null) {
                        f2640d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f2640d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.c.getString(R.NP_MANAGER14.NP_MANAGER);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f2643b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e3) {
                throw new c(e3);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        boolean zBooleanValue;
        Object objB;
        HashMap map = this.f2642a;
        if (e.f2177b == null) {
            zBooleanValue = Trace.isEnabled();
        } else {
            try {
                if (e.f2177b == null) {
                    e.f2176a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                    e.f2177b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                }
                zBooleanValue = ((Boolean) e.f2177b.invoke(null, Long.valueOf(e.f2176a))).booleanValue();
            } catch (Exception e3) {
                if (e3 instanceof InvocationTargetException) {
                    Throwable cause = e3.getCause();
                    if (cause instanceof RuntimeException) {
                        throw ((RuntimeException) cause);
                    }
                    throw new RuntimeException(cause);
                }
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e3);
                zBooleanValue = false;
            }
        }
        if (zBooleanValue) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objB = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listA = bVar.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!map.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                objB = bVar.b(this.c);
                hashSet.remove(cls);
                map.put(cls, objB);
            } catch (Throwable th2) {
                throw new c(th2);
            }
        }
        Trace.endSection();
        return objB;
    }
}
