package o1;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f1852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextPaint f1853b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1854d;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f1861k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public i1.a f1863m;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Layout.Alignment f1855e = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1856f = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f1857g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f1858h = 1.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1859i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1860j = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextUtils.TruncateAt f1862l = null;

    public g(CharSequence charSequence, TextPaint textPaint, int i2) {
        this.f1852a = charSequence;
        this.f1853b = textPaint;
        this.c = i2;
        this.f1854d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f1852a == null) {
            this.f1852a = "";
        }
        int iMax = Math.max(0, this.c);
        CharSequence charSequenceEllipsize = this.f1852a;
        int i2 = this.f1856f;
        TextPaint textPaint = this.f1853b;
        if (i2 == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.f1862l);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f1854d);
        this.f1854d = iMin;
        if (this.f1861k && this.f1856f == 1) {
            this.f1855e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.f1855e);
        builderObtain.setIncludePad(this.f1860j);
        builderObtain.setTextDirection(this.f1861k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f1862l;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f1856f);
        float f3 = this.f1857g;
        if (f3 != 0.0f || this.f1858h != 1.0f) {
            builderObtain.setLineSpacing(f3, this.f1858h);
        }
        if (this.f1856f > 1) {
            builderObtain.setHyphenationFrequency(this.f1859i);
        }
        i1.a aVar = this.f1863m;
        if (aVar != null) {
            builderObtain.setBreakStrategy(((TextInputLayout) aVar.f1389a).f715u.getBreakStrategy());
        }
        return builderObtain.build();
    }
}
