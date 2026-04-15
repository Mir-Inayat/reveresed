package d2;

import androidx.lifecycle.f0;
import c2.f;
import c2.g;
import c2.h;
import c2.i;
import c2.j;
import c2.k;
import c2.l;
import c2.m;
import c2.n;
import c2.o;
import c2.p;
import c2.q;
import c2.r;
import c2.s;
import c2.t;
import c2.u;
import c2.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class b implements e2.a, a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f841b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f842a;

    static {
        Map mapSingletonMap;
        List listAsList = Arrays.asList(f0.class, k.class, o.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, c2.a.class, c2.b.class, c2.c.class, c2.d.class, c2.e.class, f.class, g.class, h.class, i.class, j.class, l.class, m.class, n.class);
        c.d(listAsList, "asList(this)");
        ArrayList arrayList = new ArrayList(listAsList.size());
        int i2 = 0;
        for (Object obj : listAsList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new z1.a((Class) obj, Integer.valueOf(i2)));
            i2 = i3;
        }
        int size = arrayList.size();
        int i4 = Integer.MAX_VALUE;
        if (size == 0) {
            mapSingletonMap = a2.d.f2a;
        } else if (size != 1) {
            int size2 = arrayList.size();
            if (size2 >= 0) {
                size2 = size2 < 3 ? size2 + 1 : size2 < 1073741824 ? (int) ((size2 / 0.75f) + 1.0f) : Integer.MAX_VALUE;
            }
            mapSingletonMap = new LinkedHashMap(size2);
            int size3 = arrayList.size();
            int i5 = 0;
            while (i5 < size3) {
                Object obj2 = arrayList.get(i5);
                i5++;
                z1.a aVar = (z1.a) obj2;
                mapSingletonMap.put(aVar.f2729a, aVar.f2730b);
            }
        } else {
            z1.a aVar2 = (z1.a) arrayList.get(0);
            c.e(aVar2, "pair");
            mapSingletonMap = Collections.singletonMap(aVar2.f2729a, aVar2.f2730b);
            c.d(mapSingletonMap, "singletonMap(pair.first, pair.second)");
        }
        f841b = mapSingletonMap;
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        c.d(collectionValues, "primitiveFqNames.values");
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            c.d(str, "kotlinName");
            sb.append(f2.g.n0(str));
            sb.append("CompanionObject");
            map3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f841b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            map3.put(cls.getName(), "kotlin.Function" + iIntValue);
        }
        int size4 = map3.size();
        if (size4 < 0) {
            i4 = size4;
        } else if (size4 < 3) {
            i4 = size4 + 1;
        } else if (size4 < 1073741824) {
            i4 = (int) ((size4 / 0.75f) + 1.0f);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(i4);
        for (Map.Entry entry2 : map3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), f2.g.n0((String) entry2.getValue()));
        }
    }

    public b(Class cls) {
        this.f842a = cls;
    }

    @Override // d2.a
    public final Class a() {
        return this.f842a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && a0.a.v(this).equals(a0.a.v((e2.a) obj));
    }

    public final int hashCode() {
        return a0.a.v(this).hashCode();
    }

    public final String toString() {
        return this.f842a.toString() + " (Kotlin reflection is not available)";
    }
}
