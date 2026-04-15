package p0;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.l;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class d implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f1880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f1881b;

    public d(TextView textView) {
        this.f1880a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
        TextView textView = this.f1880a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iB = l.a().b();
        if (iB != 0) {
            if (iB == 1) {
                if ((i5 == 0 && i4 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i2 != 0 || i3 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i2, i3);
                }
                return l.a().e(charSequence, 0, charSequence.length());
            }
            if (iB != 3) {
                return charSequence;
            }
        }
        l lVarA = l.a();
        if (this.f1881b == null) {
            this.f1881b = new c(textView, this);
        }
        lVarA.f(this.f1881b);
        return charSequence;
    }
}
