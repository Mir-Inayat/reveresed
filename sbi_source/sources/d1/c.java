package d1;

import android.animation.TimeInterpolator;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f838b;
    public TimeInterpolator c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f840e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.c;
        return timeInterpolator != null ? timeInterpolator : a.f833b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f837a == cVar.f837a && this.f838b == cVar.f838b && this.f839d == cVar.f839d && this.f840e == cVar.f840e) {
            return a().getClass().equals(cVar.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f837a;
        long j3 = this.f838b;
        return ((((a().getClass().hashCode() + (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31)) * 31) + this.f839d) * 31) + this.f840e;
    }

    public final String toString() {
        return "\n" + c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f837a + " duration: " + this.f838b + " interpolator: " + a().getClass() + " repeatCount: " + this.f839d + " repeatMode: " + this.f840e + "}\n";
    }
}
