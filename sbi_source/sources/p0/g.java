package p0;

import android.text.InputFilter;
import android.widget.TextView;
import androidx.emoji2.text.l;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class g extends a0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f1886a;

    public g(TextView textView) {
        this.f1886a = new f(textView);
    }

    @Override // a0.a
    public final void d0(boolean z) {
        if (l.f232k != null) {
            this.f1886a.d0(z);
        }
    }

    @Override // a0.a
    public final void e0(boolean z) {
        f fVar = this.f1886a;
        if (l.f232k != null) {
            fVar.e0(z);
        } else {
            fVar.c = z;
        }
    }

    @Override // a0.a
    public final InputFilter[] u(InputFilter[] inputFilterArr) {
        return !(l.f232k != null) ? inputFilterArr : this.f1886a.u(inputFilterArr);
    }
}
