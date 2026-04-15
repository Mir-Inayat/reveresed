package androidx.emoji2.text;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class o implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i2 = b0.a.f452a;
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (l.f232k != null) {
                l.a().c();
            }
            Trace.endSection();
        } catch (Throwable th) {
            int i3 = b0.a.f452a;
            Trace.endSection();
            throw th;
        }
    }
}
