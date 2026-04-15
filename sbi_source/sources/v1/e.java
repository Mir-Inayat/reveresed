package v1;

import android.os.Handler;
import android.os.Message;
import androidx.emoji2.text.n;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f2465a;

    public e(n nVar) {
        this.f2465a = nVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        n nVar = this.f2465a;
        if (message.obj != null) {
            throw new ClassCastException();
        }
        synchronized (nVar.f244b) {
            throw null;
        }
    }
}
