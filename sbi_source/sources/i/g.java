package i;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Collection, Set {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f1372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f1373b;
    public int c;

    public final void a(int i2) {
        int i3 = this.c;
        Object[] objArr = this.f1373b;
        Object obj = objArr[i2];
        if (i3 <= 1) {
            clear();
            return;
        }
        int i4 = i3 - 1;
        int[] iArr = this.f1372a;
        if (iArr.length <= 8 || i3 >= iArr.length / 3) {
            if (i2 < i4) {
                int i5 = i2 + 1;
                a2.a.n0(i2, i5, i3, iArr, iArr);
                Object[] objArr2 = this.f1373b;
                a2.a.o0(objArr2, objArr2, i2, i5, i3);
            }
            this.f1373b[i4] = null;
        } else {
            int i6 = i3 > 8 ? i3 + (i3 >> 1) : 8;
            int[] iArr2 = new int[i6];
            this.f1372a = iArr2;
            this.f1373b = new Object[i6];
            if (i2 > 0) {
                a2.a.n0(0, 0, i2, iArr, iArr2);
                a2.a.p0(objArr, this.f1373b, 0, i2, 6);
            }
            if (i2 < i4) {
                int i7 = i2 + 1;
                a2.a.n0(i2, i7, i3, iArr, this.f1372a);
                a2.a.o0(objArr, this.f1373b, i2, i7, i3);
            }
        }
        if (i3 != this.c) {
            throw new ConcurrentModificationException();
        }
        this.c = i4;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i2;
        int iA;
        int i3 = this.c;
        if (obj == null) {
            iA = i.a(this, null, 0);
            i2 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i2 = iHashCode;
            iA = i.a(this, obj, iHashCode);
        }
        if (iA >= 0) {
            return false;
        }
        int i4 = ~iA;
        int[] iArr = this.f1372a;
        if (i3 >= iArr.length) {
            int i5 = 8;
            if (i3 >= 8) {
                i5 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i5 = 4;
            }
            Object[] objArr = this.f1373b;
            int[] iArr2 = new int[i5];
            this.f1372a = iArr2;
            this.f1373b = new Object[i5];
            if (i3 != this.c) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                a2.a.n0(0, 0, iArr.length, iArr, iArr2);
                a2.a.p0(objArr, this.f1373b, 0, objArr.length, 6);
            }
        }
        if (i4 < i3) {
            int[] iArr3 = this.f1372a;
            int i6 = i4 + 1;
            a2.a.n0(i6, i4, i3, iArr3, iArr3);
            Object[] objArr2 = this.f1373b;
            a2.a.o0(objArr2, objArr2, i6, i4, i3);
        }
        int i7 = this.c;
        if (i3 == i7) {
            int[] iArr4 = this.f1372a;
            if (i4 < iArr4.length) {
                iArr4[i4] = i2;
                this.f1373b[i4] = obj;
                this.c = i7 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        d2.c.e(collection, "elements");
        int size = collection.size() + this.c;
        int i2 = this.c;
        int[] iArr = this.f1372a;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f1373b;
            int[] iArr2 = new int[size];
            this.f1372a = iArr2;
            this.f1373b = new Object[size];
            if (i2 > 0) {
                a2.a.n0(0, 0, i2, iArr, iArr2);
                a2.a.p0(objArr, this.f1373b, 0, this.c, 6);
            }
        }
        if (this.c != i2) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.c != 0) {
            this.f1372a = j.a.f1424a;
            this.f1373b = j.a.f1425b;
            this.c = 0;
        }
        if (this.c != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? i.a(this, null, 0) : i.a(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        d2.c.e(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.c != ((Set) obj).size()) {
            return false;
        }
        try {
            int i2 = this.c;
            for (int i3 = 0; i3 < i2; i3++) {
                if (!((Set) obj).contains(this.f1373b[i3])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f1372a;
        int i2 = this.c;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new b(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iA = obj == null ? i.a(this, null, 0) : i.a(this, obj, obj.hashCode());
        if (iA < 0) {
            return false;
        }
        a(iA);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        d2.c.e(collection, "elements");
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        d2.c.e(collection, "elements");
        boolean z = false;
        for (int i2 = this.c - 1; -1 < i2; i2--) {
            if (!collection.contains(this.f1373b[i2])) {
                a(i2);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] objArr = this.f1373b;
        int i2 = this.c;
        d2.c.e(objArr, "<this>");
        int length = objArr.length;
        if (i2 <= length) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, 0, i2);
            d2.c.d(objArrCopyOfRange, "copyOfRange(this, fromIndex, toIndex)");
            return objArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is greater than size (" + length + ").");
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.c * 14);
        sb.append('{');
        int i2 = this.c;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = this.f1373b[i3];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        d2.c.d(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        d2.c.e(objArr, "array");
        int i2 = this.c;
        if (objArr.length < i2) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i2);
        } else if (objArr.length > i2) {
            objArr[i2] = null;
        }
        a2.a.o0(this.f1373b, objArr, 0, 0, this.c);
        return objArr;
    }
}
