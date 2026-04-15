package w1;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f2545a;

    public n(p pVar) {
        this.f2545a = pVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        p pVar = this.f2545a;
        m mVar = pVar.f2569v;
        if (pVar.f2566s == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = pVar.f2566s;
        if (editText != null) {
            editText.removeTextChangedListener(mVar);
            if (pVar.f2566s.getOnFocusChangeListener() == pVar.b().e()) {
                pVar.f2566s.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        pVar.f2566s = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(mVar);
        }
        pVar.b().l(pVar.f2566s);
        pVar.j(pVar.b());
    }
}
