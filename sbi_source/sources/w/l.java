package w;

import android.content.res.Resources;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f2486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources.Theme f2487b;

    public l(Resources resources, Resources.Theme theme) {
        this.f2486a = resources;
        this.f2487b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f2486a.equals(lVar.f2486a) && Objects.equals(this.f2487b, lVar.f2487b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f2486a, this.f2487b);
    }
}
