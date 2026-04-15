package p0;

import android.text.Editable;
import androidx.emoji2.text.a0;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Editable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f1874a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile a f1875b;
    public static Class c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        return cls != null ? new a0(cls, charSequence) : super.newEditable(charSequence);
    }
}
