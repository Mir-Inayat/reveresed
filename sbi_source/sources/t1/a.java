package t1;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f2153a;

    public a(float f3) {
        this.f2153a = f3;
    }

    @Override // t1.d
    public final float a(RectF rectF) {
        return this.f2153a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f2153a == ((a) obj).f2153a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f2153a)});
    }

    public final String toString() {
        return this.f2153a + "px";
    }
}
