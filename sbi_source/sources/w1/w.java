package w1;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import f.m0;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class w extends f0.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextInputLayout f2612d;

    public w(TextInputLayout textInputLayout) {
        this.f2612d = textInputLayout;
    }

    @Override // f0.b
    public final void d(View view, g0.i iVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = iVar.f1336a;
        this.f1226a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f2612d;
        EditText editText = textInputLayout.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean zIsEmpty2 = TextUtils.isEmpty(hint);
        boolean z = textInputLayout.f718v0;
        boolean zIsEmpty3 = TextUtils.isEmpty(error);
        boolean z2 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String string = !zIsEmpty2 ? hint.toString() : "";
        u uVar = textInputLayout.f678b;
        m0 m0Var = uVar.f2602b;
        if (m0Var.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(m0Var);
            accessibilityNodeInfo.setTraversalAfter(m0Var);
        } else {
            accessibilityNodeInfo.setTraversalAfter(uVar.f2603d);
        }
        if (!zIsEmpty) {
            iVar.j(text);
        } else if (!TextUtils.isEmpty(string)) {
            iVar.j(string);
            if (!z && placeholderText != null) {
                iVar.j(string + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            iVar.j(placeholderText);
        }
        if (!TextUtils.isEmpty(string)) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 < 26) {
                if (!zIsEmpty) {
                    string = ((Object) text) + ", " + string;
                }
                iVar.j(string);
            } else if (i2 >= 26) {
                accessibilityNodeInfo.setHintText(string);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", string);
            }
            if (i2 >= 26) {
                accessibilityNodeInfo.setShowingHintText(zIsEmpty);
            } else {
                iVar.h(4, zIsEmpty);
            }
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z2) {
            if (zIsEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        m0 m0Var2 = textInputLayout.f695k.f2597y;
        if (m0Var2 != null) {
            accessibilityNodeInfo.setLabelFor(m0Var2);
        }
        textInputLayout.c.b().m(iVar);
    }

    @Override // f0.b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.f2612d.c.b().n(accessibilityEvent);
    }
}
