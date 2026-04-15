package v0;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f2291a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f2292b;

    public final void a(int i2) {
        if (i2 < 64) {
            this.f2291a &= ~(1 << i2);
            return;
        }
        b bVar = this.f2292b;
        if (bVar != null) {
            bVar.a(i2 - 64);
        }
    }

    public final int b(int i2) {
        b bVar = this.f2292b;
        if (bVar == null) {
            return i2 >= 64 ? Long.bitCount(this.f2291a) : Long.bitCount(this.f2291a & ((1 << i2) - 1));
        }
        if (i2 < 64) {
            return Long.bitCount(this.f2291a & ((1 << i2) - 1));
        }
        return Long.bitCount(this.f2291a) + bVar.b(i2 - 64);
    }

    public final void c() {
        if (this.f2292b == null) {
            this.f2292b = new b();
        }
    }

    public final boolean d(int i2) {
        if (i2 < 64) {
            return (this.f2291a & (1 << i2)) != 0;
        }
        c();
        return this.f2292b.d(i2 - 64);
    }

    public final void e(int i2, boolean z) {
        if (i2 >= 64) {
            c();
            this.f2292b.e(i2 - 64, z);
            return;
        }
        long j2 = this.f2291a;
        boolean z2 = (Long.MIN_VALUE & j2) != 0;
        long j3 = (1 << i2) - 1;
        this.f2291a = ((j2 & (~j3)) << 1) | (j2 & j3);
        if (z) {
            h(i2);
        } else {
            a(i2);
        }
        if (z2 || this.f2292b != null) {
            c();
            this.f2292b.e(0, z2);
        }
    }

    public final boolean f(int i2) {
        if (i2 >= 64) {
            c();
            return this.f2292b.f(i2 - 64);
        }
        long j2 = 1 << i2;
        long j3 = this.f2291a;
        boolean z = (j3 & j2) != 0;
        long j4 = j3 & (~j2);
        this.f2291a = j4;
        long j5 = j2 - 1;
        this.f2291a = (j4 & j5) | Long.rotateRight((~j5) & j4, 1);
        b bVar = this.f2292b;
        if (bVar != null) {
            if (bVar.d(0)) {
                h(63);
            }
            this.f2292b.f(0);
        }
        return z;
    }

    public final void g() {
        this.f2291a = 0L;
        b bVar = this.f2292b;
        if (bVar != null) {
            bVar.g();
        }
    }

    public final void h(int i2) {
        if (i2 < 64) {
            this.f2291a |= 1 << i2;
        } else {
            c();
            this.f2292b.h(i2 - 64);
        }
    }

    public final String toString() {
        if (this.f2292b == null) {
            return Long.toBinaryString(this.f2291a);
        }
        return this.f2292b.toString() + "xx" + Long.toBinaryString(this.f2291a);
    }
}
