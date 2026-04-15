package z0;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f2726b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f2725a = new HashMap();
    public final ArrayList c = new ArrayList();

    public u(View view) {
        this.f2726b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f2726b == uVar.f2726b && this.f2725a.equals(uVar.f2725a);
    }

    public final int hashCode() {
        return this.f2725a.hashCode() + (this.f2726b.hashCode() * 31);
    }

    public final String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f2726b + "\n") + "    values:";
        HashMap map = this.f2725a;
        for (String str2 : map.keySet()) {
            str = str + "    " + str2 + ": " + map.get(str2) + "\n";
        }
        return str;
    }
}
