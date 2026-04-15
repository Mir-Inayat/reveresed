package v1;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            message.obj.getClass();
            throw new ClassCastException();
        }
        if (i2 != 1) {
            return false;
        }
        message.obj.getClass();
        throw new ClassCastException();
    }
}
