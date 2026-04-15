package o1;

import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    public float c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakReference f1867e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q1.d f1868f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f1864a = new TextPaint(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k1.b f1865b = new k1.b(1, this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1866d = true;

    public i(k1.f fVar) {
        this.f1867e = new WeakReference(null);
        this.f1867e = new WeakReference(fVar);
    }

    public final float a(String str) {
        if (!this.f1866d) {
            return this.c;
        }
        TextPaint textPaint = this.f1864a;
        this.c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.f1866d = false;
        return this.c;
    }
}
