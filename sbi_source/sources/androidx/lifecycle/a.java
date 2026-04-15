package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f319a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f320b;

    public a(HashMap map) {
        this.f320b = map;
        for (Map.Entry entry : map.entrySet()) {
            l lVar = (l) entry.getValue();
            List arrayList = (List) this.f319a.get(lVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f319a.put(lVar, arrayList);
            }
            arrayList.add((b) entry.getKey());
        }
    }

    public static void a(List list, r rVar, l lVar, q qVar) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                b bVar = (b) list.get(size);
                Method method = bVar.f322b;
                try {
                    int i2 = bVar.f321a;
                    if (i2 == 0) {
                        method.invoke(qVar, null);
                    } else if (i2 == 1) {
                        method.invoke(qVar, rVar);
                    } else if (i2 == 2) {
                        method.invoke(qVar, rVar, lVar);
                    }
                } catch (IllegalAccessException e3) {
                    throw new RuntimeException(e3);
                } catch (InvocationTargetException e4) {
                    throw new RuntimeException("Failed to call observer method", e4.getCause());
                }
            }
        }
    }
}
