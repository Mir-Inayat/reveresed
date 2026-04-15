package t1;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f2157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f2158b;

    public b(float f3, d dVar) {
        while (dVar instanceof b) {
            dVar = ((b) dVar).f2157a;
            f3 += ((b) dVar).f2158b;
        }
        this.f2157a = dVar;
        this.f2158b = f3;
    }

    @Override // t1.d
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f2157a.a(rectF) + this.f2158b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2157a.equals(bVar.f2157a) && this.f2158b == bVar.f2158b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2157a, Float.valueOf(this.f2158b)});
    }
}
