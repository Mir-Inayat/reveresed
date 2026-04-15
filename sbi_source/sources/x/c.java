package x;

import android.graphics.Insets;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f2615e = new c(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2617b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2618d;

    public c(int i2, int i3, int i4, int i5) {
        this.f2616a = i2;
        this.f2617b = i3;
        this.c = i4;
        this.f2618d = i5;
    }

    public static c a(c cVar, c cVar2) {
        return b(Math.max(cVar.f2616a, cVar2.f2616a), Math.max(cVar.f2617b, cVar2.f2617b), Math.max(cVar.c, cVar2.c), Math.max(cVar.f2618d, cVar2.f2618d));
    }

    public static c b(int i2, int i3, int i4, int i5) {
        return (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) ? f2615e : new c(i2, i3, i4, i5);
    }

    public static c c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return b.a(this.f2616a, this.f2617b, this.c, this.f2618d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f2618d == cVar.f2618d && this.f2616a == cVar.f2616a && this.c == cVar.c && this.f2617b == cVar.f2617b;
    }

    public final int hashCode() {
        return (((((this.f2616a * 31) + this.f2617b) * 31) + this.c) * 31) + this.f2618d;
    }

    public final String toString() {
        return "Insets{left=" + this.f2616a + ", top=" + this.f2617b + ", right=" + this.c + ", bottom=" + this.f2618d + '}';
    }
}
