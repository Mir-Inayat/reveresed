package f0;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public abstract class j0 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static g b(View view, g gVar) {
        ContentInfo contentInfoH = gVar.f1245a.h();
        Objects.requireNonNull(contentInfoH);
        ContentInfo contentInfoG = c.g(contentInfoH);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoG);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoG ? gVar : new g(new androidx.emoji2.text.n(contentInfoPerformReceiveContent));
    }

    public static void c(View view, String[] strArr, r rVar) {
        if (rVar == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new k0(rVar));
        }
    }
}
