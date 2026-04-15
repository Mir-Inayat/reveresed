package f0;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements OnReceiveContentListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f1268a;

    public k0(r rVar) {
        this.f1268a = rVar;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        g gVar = new g(new androidx.emoji2.text.n(contentInfo));
        g gVarA = ((k0.q) this.f1268a).a(view, gVar);
        if (gVarA == null) {
            return null;
        }
        if (gVarA == gVar) {
            return contentInfo;
        }
        ContentInfo contentInfoH = gVarA.f1245a.h();
        Objects.requireNonNull(contentInfoH);
        return c.g(contentInfoH);
    }
}
