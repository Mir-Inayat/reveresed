package j0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputContentInfo f1429a;

    public f(Object obj) {
        this.f1429a = (InputContentInfo) obj;
    }

    @Override // j0.g
    public final void a() {
        this.f1429a.requestPermission();
    }

    @Override // j0.g
    public final Uri b() {
        return this.f1429a.getLinkUri();
    }

    @Override // j0.g
    public final ClipDescription c() {
        return this.f1429a.getDescription();
    }

    @Override // j0.g
    public final Object d() {
        return this.f1429a;
    }

    @Override // j0.g
    public final Uri e() {
        return this.f1429a.getContentUri();
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f1429a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
