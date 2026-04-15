package w;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f2484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Configuration f2485b;
    public final int c;

    public k(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f2484a = colorStateList;
        this.f2485b = configuration;
        this.c = theme == null ? 0 : theme.hashCode();
    }
}
