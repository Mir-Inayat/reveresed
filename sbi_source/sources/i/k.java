package i;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f1385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f1386b;
    public int c;

    public k(int i2) {
        this.f1385a = i2 == 0 ? j.a.f1424a : new int[i2];
        this.f1386b = i2 == 0 ? j.a.f1425b : new Object[i2 << 1];
    }

    public final int a(Object obj) {
        int i2 = this.c * 2;
        Object[] objArr = this.f1386b;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (obj.equals(objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i2) {
        int i3 = this.c;
        int[] iArr = this.f1385a;
        if (iArr.length < i2) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i2);
            d2.c.d(iArrCopyOf, "copyOf(this, newSize)");
            this.f1385a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f1386b, i2 * 2);
            d2.c.d(objArrCopyOf, "copyOf(this, newSize)");
            this.f1386b = objArrCopyOf;
        }
        if (this.c != i3) {
            throw new ConcurrentModificationException();
        }
    }

    public final int c(int i2, Object obj) {
        int i3 = this.c;
        if (i3 == 0) {
            return -1;
        }
        int iA = j.a.a(i3, i2, this.f1385a);
        if (iA < 0 || d2.c.a(obj, this.f1386b[iA << 1])) {
            return iA;
        }
        int i4 = iA + 1;
        while (i4 < i3 && this.f1385a[i4] == i2) {
            if (d2.c.a(obj, this.f1386b[i4 << 1])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = iA - 1; i5 >= 0 && this.f1385a[i5] == i2; i5--) {
            if (d2.c.a(obj, this.f1386b[i5 << 1])) {
                return i5;
            }
        }
        return ~i4;
    }

    public final void clear() {
        if (this.c > 0) {
            this.f1385a = j.a.f1424a;
            this.f1386b = j.a.f1425b;
            this.c = 0;
        }
        if (this.c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d(Object obj) {
        return obj == null ? e() : c(obj.hashCode(), obj);
    }

    public final int e() {
        int i2 = this.c;
        if (i2 == 0) {
            return -1;
        }
        int iA = j.a.a(i2, 0, this.f1385a);
        if (iA < 0 || this.f1386b[iA << 1] == null) {
            return iA;
        }
        int i3 = iA + 1;
        while (i3 < i2 && this.f1385a[i3] == 0) {
            if (this.f1386b[i3 << 1] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iA - 1; i4 >= 0 && this.f1385a[i4] == 0; i4--) {
            if (this.f1386b[i4 << 1] == null) {
                return i4;
            }
        }
        return ~i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof k) {
                int i2 = this.c;
                if (i2 != ((k) obj).c) {
                    return false;
                }
                k kVar = (k) obj;
                for (int i3 = 0; i3 < i2; i3++) {
                    Object objF = f(i3);
                    Object objI = i(i3);
                    Object obj2 = kVar.get(objF);
                    if (objI == null) {
                        if (obj2 != null || !kVar.containsKey(objF)) {
                            return false;
                        }
                    } else if (!objI.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.c != ((Map) obj).size()) {
                return false;
            }
            int i4 = this.c;
            for (int i5 = 0; i5 < i4; i5++) {
                Object objF2 = f(i5);
                Object objI2 = i(i5);
                Object obj3 = ((Map) obj).get(objF2);
                if (objI2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objF2)) {
                        return false;
                    }
                } else if (!objI2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i2) {
        if (i2 >= 0 && i2 < this.c) {
            return this.f1386b[i2 << 1];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i2).toString());
    }

    public final Object g(int i2) {
        int i3;
        if (i2 < 0 || i2 >= (i3 = this.c)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i2).toString());
        }
        Object[] objArr = this.f1386b;
        int i4 = i2 << 1;
        Object obj = objArr[i4 + 1];
        if (i3 <= 1) {
            clear();
            return obj;
        }
        int i5 = i3 - 1;
        int[] iArr = this.f1385a;
        if (iArr.length <= 8 || i3 >= iArr.length / 3) {
            if (i2 < i5) {
                int i6 = i2 + 1;
                a2.a.n0(i2, i6, i3, iArr, iArr);
                Object[] objArr2 = this.f1386b;
                a2.a.o0(objArr2, objArr2, i4, i6 << 1, i3 << 1);
            }
            Object[] objArr3 = this.f1386b;
            int i7 = i5 << 1;
            objArr3[i7] = null;
            objArr3[i7 + 1] = null;
        } else {
            int i8 = i3 > 8 ? i3 + (i3 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i8);
            d2.c.d(iArrCopyOf, "copyOf(this, newSize)");
            this.f1385a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f1386b, i8 << 1);
            d2.c.d(objArrCopyOf, "copyOf(this, newSize)");
            this.f1386b = objArrCopyOf;
            if (i3 != this.c) {
                throw new ConcurrentModificationException();
            }
            if (i2 > 0) {
                a2.a.n0(0, 0, i2, iArr, this.f1385a);
                a2.a.o0(objArr, this.f1386b, 0, 0, i4);
            }
            if (i2 < i5) {
                int i9 = i2 + 1;
                a2.a.n0(i2, i9, i3, iArr, this.f1385a);
                a2.a.o0(objArr, this.f1386b, i4, i9 << 1, i3 << 1);
            }
        }
        if (i3 != this.c) {
            throw new ConcurrentModificationException();
        }
        this.c = i5;
        return obj;
    }

    public Object get(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return this.f1386b[(iD << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iD = d(obj);
        return iD >= 0 ? this.f1386b[(iD << 1) + 1] : obj2;
    }

    public final Object h(int i2, Object obj) {
        if (i2 < 0 || i2 >= this.c) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i2).toString());
        }
        int i3 = (i2 << 1) + 1;
        Object[] objArr = this.f1386b;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    public final int hashCode() {
        int[] iArr = this.f1385a;
        Object[] objArr = this.f1386b;
        int i2 = this.c;
        int i3 = 1;
        int i4 = 0;
        int iHashCode = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i4];
            i4++;
            i3 += 2;
        }
        return iHashCode;
    }

    public final Object i(int i2) {
        if (i2 >= 0 && i2 < this.c) {
            return this.f1386b[(i2 << 1) + 1];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i2).toString());
    }

    public final boolean isEmpty() {
        return this.c <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i2 = this.c;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iC = obj != null ? c(iHashCode, obj) : e();
        if (iC >= 0) {
            int i3 = (iC << 1) + 1;
            Object[] objArr = this.f1386b;
            Object obj3 = objArr[i3];
            objArr[i3] = obj2;
            return obj3;
        }
        int i4 = ~iC;
        int[] iArr = this.f1385a;
        if (i2 >= iArr.length) {
            int i5 = 8;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i5 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i5);
            d2.c.d(iArrCopyOf, "copyOf(this, newSize)");
            this.f1385a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f1386b, i5 << 1);
            d2.c.d(objArrCopyOf, "copyOf(this, newSize)");
            this.f1386b = objArrCopyOf;
            if (i2 != this.c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i4 < i2) {
            int[] iArr2 = this.f1385a;
            int i6 = i4 + 1;
            a2.a.n0(i6, i4, i2, iArr2, iArr2);
            Object[] objArr2 = this.f1386b;
            a2.a.o0(objArr2, objArr2, i6 << 1, i4 << 1, this.c << 1);
        }
        int i7 = this.c;
        if (i2 == i7) {
            int[] iArr3 = this.f1385a;
            if (i4 < iArr3.length) {
                iArr3[i4] = iHashCode;
                Object[] objArr3 = this.f1386b;
                int i8 = i4 << 1;
                objArr3[i8] = obj;
                objArr3[i8 + 1] = obj2;
                this.c = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return g(iD);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD >= 0) {
            return h(iD, obj2);
        }
        return null;
    }

    public final int size() {
        return this.c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.c * 28);
        sb.append('{');
        int i2 = this.c;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object objF = f(i3);
            if (objF != sb) {
                sb.append(objF);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objI = i(i3);
            if (objI != sb) {
                sb.append(objI);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        d2.c.d(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD < 0 || !d2.c.a(obj2, i(iD))) {
            return false;
        }
        g(iD);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iD = d(obj);
        if (iD < 0 || !d2.c.a(obj2, i(iD))) {
            return false;
        }
        h(iD, obj3);
        return true;
    }
}
