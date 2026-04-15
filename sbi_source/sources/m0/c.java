package m0;

import android.graphics.Rect;
import g0.i;
import java.util.Comparator;
import t1.g;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f1576a = new Rect();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f1577b = new Rect();
    public final boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f1578d;

    public c(boolean z, g gVar) {
        this.c = z;
        this.f1578d = gVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f1578d.getClass();
        Rect rect = this.f1576a;
        ((i) obj).f(rect);
        Rect rect2 = this.f1577b;
        ((i) obj2).f(rect2);
        int i2 = rect.top;
        int i3 = rect2.top;
        if (i2 < i3) {
            return -1;
        }
        if (i2 > i3) {
            return 1;
        }
        int i4 = rect.left;
        int i5 = rect2.left;
        boolean z = this.c;
        if (i4 < i5) {
            return z ? 1 : -1;
        }
        if (i4 > i5) {
            return z ? -1 : 1;
        }
        int i6 = rect.bottom;
        int i7 = rect2.bottom;
        if (i6 < i7) {
            return -1;
        }
        if (i6 > i7) {
            return 1;
        }
        int i8 = rect.right;
        int i9 = rect2.right;
        if (i8 < i9) {
            return z ? 1 : -1;
        }
        if (i8 > i9) {
            return z ? -1 : 1;
        }
        return 0;
    }
}
