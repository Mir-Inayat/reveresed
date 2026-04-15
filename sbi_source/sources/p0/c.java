package p0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import androidx.emoji2.text.l;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class c extends androidx.emoji2.text.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f1878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f1879b;

    public c(TextView textView, d dVar) {
        this.f1878a = new WeakReference(textView);
        this.f1879b = new WeakReference(dVar);
    }

    @Override // androidx.emoji2.text.i
    public final void a() throws Throwable {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f1878a.get();
        InputFilter inputFilter = (InputFilter) this.f1879b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    l lVarA = l.a();
                    if (text == null) {
                        length = 0;
                    } else {
                        lVarA.getClass();
                        length = text.length();
                    }
                    CharSequence charSequenceE = lVarA.e(text, 0, length);
                    if (text == charSequenceE) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(charSequenceE);
                    int selectionEnd = Selection.getSelectionEnd(charSequenceE);
                    textView.setText(charSequenceE);
                    if (charSequenceE instanceof Spannable) {
                        Spannable spannable = (Spannable) charSequenceE;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                            return;
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                            return;
                        } else {
                            if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }
}
