package p0;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import androidx.emoji2.text.l;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class b extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditText f1876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t1.g f1877b;

    public b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        t1.g gVar = new t1.g(15);
        super(inputConnection, false);
        this.f1876a = editText;
        this.f1877b = gVar;
        if (l.f232k != null) {
            l lVarA = l.a();
            if (lVarA.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            androidx.emoji2.text.g gVar2 = lVarA.f236e;
            gVar2.getClass();
            Bundle bundle = editorInfo.extras;
            o0.b bVar = (o0.b) gVar2.c.f269a;
            int iA = bVar.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? bVar.f1807b.getInt(iA + bVar.f1806a) : 0);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i2, int i3) {
        Editable editableText = this.f1876a.getEditableText();
        this.f1877b.getClass();
        return t1.g.d(this, editableText, i2, i3, false) || super.deleteSurroundingText(i2, i3);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i2, int i3) {
        Editable editableText = this.f1876a.getEditableText();
        this.f1877b.getClass();
        return t1.g.d(this, editableText, i2, i3, true) || super.deleteSurroundingTextInCodePoints(i2, i3);
    }
}
