package p0;

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class h extends androidx.emoji2.text.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f1887a;

    public h(EditText editText) {
        this.f1887a = new WeakReference(editText);
    }

    @Override // androidx.emoji2.text.i
    public final void a() {
        i.a((EditText) this.f1887a.get(), 1);
    }
}
