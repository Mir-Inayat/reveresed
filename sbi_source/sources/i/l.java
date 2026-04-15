package i;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ int[] f1387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object[] f1388b;
    public /* synthetic */ int c;

    public l() {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.f1387a = new int[i5];
        this.f1388b = new Object[i5];
    }

    public final void a(int i2, Object obj) {
        int i3 = this.c;
        if (i3 != 0 && i2 <= this.f1387a[i3 - 1]) {
            c(i2, obj);
            return;
        }
        if (i3 >= this.f1387a.length) {
            int i4 = (i3 + 1) * 4;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f1387a, i7);
            d2.c.d(iArrCopyOf, "copyOf(this, newSize)");
            this.f1387a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f1388b, i7);
            d2.c.d(objArrCopyOf, "copyOf(this, newSize)");
            this.f1388b = objArrCopyOf;
        }
        this.f1387a[i3] = i2;
        this.f1388b[i3] = obj;
        this.c = i3 + 1;
    }

    public final Object b(int i2) {
        Object obj;
        int iA = j.a.a(this.c, i2, this.f1387a);
        if (iA < 0 || (obj = this.f1388b[iA]) == i.f1378b) {
            return null;
        }
        return obj;
    }

    public final void c(int i2, Object obj) {
        int iA = j.a.a(this.c, i2, this.f1387a);
        if (iA >= 0) {
            this.f1388b[iA] = obj;
            return;
        }
        int i3 = ~iA;
        int i4 = this.c;
        if (i3 < i4) {
            Object[] objArr = this.f1388b;
            if (objArr[i3] == i.f1378b) {
                this.f1387a[i3] = i2;
                objArr[i3] = obj;
                return;
            }
        }
        if (i4 >= this.f1387a.length) {
            int i5 = (i4 + 1) * 4;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f1387a, i8);
            d2.c.d(iArrCopyOf, "copyOf(this, newSize)");
            this.f1387a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f1388b, i8);
            d2.c.d(objArrCopyOf, "copyOf(this, newSize)");
            this.f1388b = objArrCopyOf;
        }
        int i9 = this.c;
        if (i9 - i3 != 0) {
            int[] iArr = this.f1387a;
            int i10 = i3 + 1;
            a2.a.n0(i10, i3, i9, iArr, iArr);
            Object[] objArr2 = this.f1388b;
            a2.a.o0(objArr2, objArr2, i10, i3, this.c);
        }
        this.f1387a[i3] = i2;
        this.f1388b[i3] = obj;
        this.c++;
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        d2.c.c(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        l lVar = (l) objClone;
        lVar.f1387a = (int[]) this.f1387a.clone();
        lVar.f1388b = (Object[]) this.f1388b.clone();
        return lVar;
    }

    public final String toString() {
        int i2 = this.c;
        if (i2 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i2 * 28);
        sb.append('{');
        int i3 = this.c;
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            sb.append(this.f1387a[i4]);
            sb.append('=');
            Object obj = this.f1388b[i4];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        d2.c.d(string, "buffer.toString()");
        return string;
    }
}
