package q1;

import android.graphics.Typeface;
import androidx.emoji2.text.n;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class a extends a0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Typeface f2054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f2055b;
    public boolean c;

    public a(n nVar, Typeface typeface) {
        this.f2054a = typeface;
        this.f2055b = nVar;
    }

    @Override // a0.a
    public final void O(int i2) {
        if (this.c) {
            return;
        }
        o1.b bVar = (o1.b) this.f2055b.f244b;
        if (bVar.l(this.f2054a)) {
            bVar.j(false);
        }
    }

    @Override // a0.a
    public final void P(Typeface typeface, boolean z) {
        if (this.c) {
            return;
        }
        o1.b bVar = (o1.b) this.f2055b.f244b;
        if (bVar.l(typeface)) {
            bVar.j(false);
        }
    }
}
