package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements Spannable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f224a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Spannable f225b;

    public e0(Spannable spannable) {
        this.f225b = spannable;
    }

    public final void a() {
        Spannable spannable = this.f225b;
        if (!this.f224a) {
            if ((Build.VERSION.SDK_INT < 28 ? new t1.g(4) : new d0(4)).e(spannable)) {
                this.f225b = new SpannableString(spannable);
            }
        }
        this.f224a = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i2) {
        return this.f225b.charAt(i2);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f225b.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f225b.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f225b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f225b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f225b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i2, int i3, Class cls) {
        return this.f225b.getSpans(i2, i3, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f225b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i2, int i3, Class cls) {
        return this.f225b.nextSpanTransition(i2, i3, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f225b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i2, int i3, int i4) {
        a();
        this.f225b.setSpan(obj, i2, i3, i4);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i2, int i3) {
        return this.f225b.subSequence(i2, i3);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f225b.toString();
    }
}
