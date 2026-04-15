package f0;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class i1 extends h1 {
    public i1(n1 n1Var, WindowInsets windowInsets) {
        super(n1Var, windowInsets);
    }

    @Override // f0.l1
    public n1 a() {
        return n1.d(null, this.c.consumeDisplayCutout());
    }

    @Override // f0.l1
    public k e() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new k(displayCutout);
    }

    @Override // f0.g1, f0.l1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return Objects.equals(this.c, i1Var.c) && Objects.equals(this.f1254g, i1Var.f1254g);
    }

    @Override // f0.l1
    public int hashCode() {
        return this.c.hashCode();
    }
}
