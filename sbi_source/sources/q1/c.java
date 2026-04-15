package q1;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class c extends a0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f2058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextPaint f2059b;
    public final /* synthetic */ a0.a c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f2060d;

    public c(d dVar, Context context, TextPaint textPaint, a0.a aVar) {
        this.f2060d = dVar;
        this.f2058a = context;
        this.f2059b = textPaint;
        this.c = aVar;
    }

    @Override // a0.a
    public final void O(int i2) {
        this.c.O(i2);
    }

    @Override // a0.a
    public final void P(Typeface typeface, boolean z) {
        this.f2060d.f(this.f2058a, this.f2059b, typeface);
        this.c.P(typeface, z);
    }
}
