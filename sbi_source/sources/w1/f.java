package w1;

import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class f extends q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2525e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(p pVar, int i2) {
        super(pVar);
        this.f2525e = i2;
    }

    @Override // w1.q
    public void q() {
        switch (this.f2525e) {
            case 0:
                p pVar = this.f2571b;
                pVar.f2562o = null;
                CheckableImageButton checkableImageButton = pVar.f2554g;
                checkableImageButton.setOnLongClickListener(null);
                t1.e.K(checkableImageButton, null);
                break;
        }
    }
}
