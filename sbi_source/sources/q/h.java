package q;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f1957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f1958b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f1959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f1960e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1961f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int[] f1962g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String[] f1963h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1964i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f1965j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean[] f1966k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1967l;

    public final void a(int i2, float f3) {
        int i3 = this.f1961f;
        int[] iArr = this.f1959d;
        if (i3 >= iArr.length) {
            this.f1959d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f1960e;
            this.f1960e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f1959d;
        int i4 = this.f1961f;
        iArr2[i4] = i2;
        float[] fArr2 = this.f1960e;
        this.f1961f = i4 + 1;
        fArr2[i4] = f3;
    }

    public final void b(int i2, int i3) {
        int i4 = this.c;
        int[] iArr = this.f1957a;
        if (i4 >= iArr.length) {
            this.f1957a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f1958b;
            this.f1958b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f1957a;
        int i5 = this.c;
        iArr3[i5] = i2;
        int[] iArr4 = this.f1958b;
        this.c = i5 + 1;
        iArr4[i5] = i3;
    }

    public final void c(int i2, boolean z) {
        int i3 = this.f1967l;
        int[] iArr = this.f1965j;
        if (i3 >= iArr.length) {
            this.f1965j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f1966k;
            this.f1966k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f1965j;
        int i4 = this.f1967l;
        iArr2[i4] = i2;
        boolean[] zArr2 = this.f1966k;
        this.f1967l = i4 + 1;
        zArr2[i4] = z;
    }

    public final void d(String str, int i2) {
        int i3 = this.f1964i;
        int[] iArr = this.f1962g;
        if (i3 >= iArr.length) {
            this.f1962g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f1963h;
            this.f1963h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f1962g;
        int i4 = this.f1964i;
        iArr2[i4] = i2;
        String[] strArr2 = this.f1963h;
        this.f1964i = i4 + 1;
        strArr2[i4] = str;
    }
}
