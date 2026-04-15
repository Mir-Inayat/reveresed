package w1;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class v implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditText f2611b;
    public final /* synthetic */ TextInputLayout c;

    public v(TextInputLayout textInputLayout, EditText editText) {
        this.c = textInputLayout;
        this.f2611b = editText;
        this.f2610a = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.c;
        textInputLayout.w(!textInputLayout.B0, false);
        if (textInputLayout.f697l) {
            textInputLayout.p(editable);
        }
        if (textInputLayout.f713t) {
            textInputLayout.x(editable);
        }
        EditText editText = this.f2611b;
        int lineCount = editText.getLineCount();
        int i2 = this.f2610a;
        if (lineCount != i2) {
            if (lineCount < i2) {
                int minimumHeight = editText.getMinimumHeight();
                int i3 = textInputLayout.f716u0;
                if (minimumHeight != i3) {
                    editText.setMinimumHeight(i3);
                }
            }
            this.f2610a = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }
}
