package f0;

import android.view.DisplayCutout;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisplayCutout f1267a;

    public k(DisplayCutout displayCutout) {
        this.f1267a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f1267a, ((k) obj).f1267a);
    }

    public final int hashCode() {
        return this.f1267a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f1267a + "}";
    }
}
