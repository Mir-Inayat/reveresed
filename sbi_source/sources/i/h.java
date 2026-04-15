package i;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f1374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ long[] f1375b;
    public /* synthetic */ Object[] c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f1376d;

    public h() {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 80;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (80 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 8;
        this.f1375b = new long[i5];
        this.c = new Object[i5];
    }

    public final void a() {
        int i2 = this.f1376d;
        Object[] objArr = this.c;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.f1376d = 0;
        this.f1374a = false;
    }

    public final Object b(long j2) {
        Object obj;
        int iB = j.a.b(this.f1375b, this.f1376d, j2);
        if (iB < 0 || (obj = this.c[iB]) == i.f1377a) {
            return null;
        }
        return obj;
    }

    public final long c(int i2) {
        int i3;
        if (i2 < 0 || i2 >= (i3 = this.f1376d)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i2).toString());
        }
        if (this.f1374a) {
            long[] jArr = this.f1375b;
            Object[] objArr = this.c;
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                Object obj = objArr[i5];
                if (obj != i.f1377a) {
                    if (i5 != i4) {
                        jArr[i4] = jArr[i5];
                        objArr[i4] = obj;
                        objArr[i5] = null;
                    }
                    i4++;
                }
            }
            this.f1374a = false;
            this.f1376d = i4;
        }
        return this.f1375b[i2];
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        d2.c.c(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        h hVar = (h) objClone;
        hVar.f1375b = (long[]) this.f1375b.clone();
        hVar.c = (Object[]) this.c.clone();
        return hVar;
    }

    public final void d(long j2, Object obj) {
        Object obj2 = i.f1377a;
        int iB = j.a.b(this.f1375b, this.f1376d, j2);
        if (iB >= 0) {
            this.c[iB] = obj;
            return;
        }
        int i2 = ~iB;
        int i3 = this.f1376d;
        if (i2 < i3) {
            Object[] objArr = this.c;
            if (objArr[i2] == obj2) {
                this.f1375b[i2] = j2;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.f1374a) {
            long[] jArr = this.f1375b;
            if (i3 >= jArr.length) {
                Object[] objArr2 = this.c;
                int i4 = 0;
                for (int i5 = 0; i5 < i3; i5++) {
                    Object obj3 = objArr2[i5];
                    if (obj3 != obj2) {
                        if (i5 != i4) {
                            jArr[i4] = jArr[i5];
                            objArr2[i4] = obj3;
                            objArr2[i5] = null;
                        }
                        i4++;
                    }
                }
                this.f1374a = false;
                this.f1376d = i4;
                i2 = ~j.a.b(this.f1375b, i4, j2);
            }
        }
        int i6 = this.f1376d;
        if (i6 >= this.f1375b.length) {
            int i7 = (i6 + 1) * 8;
            int i8 = 4;
            while (true) {
                if (i8 >= 32) {
                    break;
                }
                int i9 = (1 << i8) - 12;
                if (i7 <= i9) {
                    i7 = i9;
                    break;
                }
                i8++;
            }
            int i10 = i7 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.f1375b, i10);
            d2.c.d(jArrCopyOf, "copyOf(this, newSize)");
            this.f1375b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.c, i10);
            d2.c.d(objArrCopyOf, "copyOf(this, newSize)");
            this.c = objArrCopyOf;
        }
        int i11 = this.f1376d - i2;
        if (i11 != 0) {
            long[] jArr2 = this.f1375b;
            int i12 = i2 + 1;
            d2.c.e(jArr2, "<this>");
            System.arraycopy(jArr2, i2, jArr2, i12, i11);
            Object[] objArr3 = this.c;
            a2.a.o0(objArr3, objArr3, i12, i2, this.f1376d);
        }
        this.f1375b[i2] = j2;
        this.c[i2] = obj;
        this.f1376d++;
    }

    public final int e() {
        if (this.f1374a) {
            int i2 = this.f1376d;
            long[] jArr = this.f1375b;
            Object[] objArr = this.c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != i.f1377a) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f1374a = false;
            this.f1376d = i3;
        }
        return this.f1376d;
    }

    public final Object f(int i2) {
        int i3;
        if (i2 < 0 || i2 >= (i3 = this.f1376d)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i2).toString());
        }
        if (this.f1374a) {
            long[] jArr = this.f1375b;
            Object[] objArr = this.c;
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                Object obj = objArr[i5];
                if (obj != i.f1377a) {
                    if (i5 != i4) {
                        jArr[i4] = jArr[i5];
                        objArr[i4] = obj;
                        objArr[i5] = null;
                    }
                    i4++;
                }
            }
            this.f1374a = false;
            this.f1376d = i4;
        }
        return this.c[i2];
    }

    public final String toString() {
        if (e() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1376d * 28);
        sb.append('{');
        int i2 = this.f1376d;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(c(i3));
            sb.append('=');
            Object objF = f(i3);
            if (objF != sb) {
                sb.append(objF);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        d2.c.d(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }
}
