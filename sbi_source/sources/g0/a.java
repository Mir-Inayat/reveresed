package g0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f1323b;
    public final int c;

    public a(int i2, i iVar, int i3) {
        this.f1322a = i2;
        this.f1323b = iVar;
        this.c = i3;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f1322a);
        this.f1323b.f1336a.performAction(this.c, bundle);
    }
}
