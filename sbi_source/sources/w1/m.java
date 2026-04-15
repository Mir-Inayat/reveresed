package w1;

import android.text.Editable;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class m extends o1.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f2544a;

    public m(p pVar) {
        this.f2544a = pVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f2544a.b().a();
    }

    @Override // o1.j, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        this.f2544a.b().b();
    }
}
