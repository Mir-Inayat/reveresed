package q;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class e extends ViewGroup.MarginLayoutParams {
    public int A;
    public int B;
    public int C;
    public float D;
    public float E;
    public String F;
    public float G;
    public float H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public float Q;
    public float R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public String X;
    public int Y;
    public boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1907a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f1908a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1909b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f1910b0;
    public float c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f1911c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1912d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f1913d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1914e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f1915e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1916f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f1917f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1918g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f1919g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1920h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f1921h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1922i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f1923i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1924j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f1925j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1926k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public float f1927k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1928l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f1929l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1930m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f1931m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1932n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public float f1933n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1934o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public n.e f1935o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1936p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f1937q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1938r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1939s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1940t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f1941u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f1942v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f1943w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f1944x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f1945y;
    public int z;

    public final void a() {
        this.f1911c0 = false;
        this.Z = true;
        this.f1908a0 = true;
        int i2 = ((ViewGroup.MarginLayoutParams) this).width;
        if (i2 == -2 && this.V) {
            this.Z = false;
            if (this.K == 0) {
                this.K = 1;
            }
        }
        int i3 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i3 == -2 && this.W) {
            this.f1908a0 = false;
            if (this.L == 0) {
                this.L = 1;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.Z = false;
            if (i2 == 0 && this.K == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.V = true;
            }
        }
        if (i3 == 0 || i3 == -1) {
            this.f1908a0 = false;
            if (i3 == 0 && this.L == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.W = true;
            }
        }
        if (this.c == -1.0f && this.f1907a == -1 && this.f1909b == -1) {
            return;
        }
        this.f1911c0 = true;
        this.Z = true;
        this.f1908a0 = true;
        if (!(this.f1935o0 instanceof n.i)) {
            this.f1935o0 = new n.i();
        }
        ((n.i) this.f1935o0).N(this.U);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void resolveLayoutDirection(int r11) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q.e.resolveLayoutDirection(int):void");
    }
}
