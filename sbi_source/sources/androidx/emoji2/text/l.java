package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f231j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile l f232k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i.g f234b;
    public volatile int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k f237f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t1.g f238g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f239h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e f240i;

    public l(w wVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f233a = reentrantReadWriteLock;
        this.c = 3;
        k kVar = wVar.f265a;
        this.f237f = kVar;
        int i2 = wVar.f266b;
        this.f239h = i2;
        this.f240i = wVar.c;
        this.f235d = new Handler(Looper.getMainLooper());
        i.g gVar = new i.g();
        gVar.f1372a = j.a.f1424a;
        gVar.f1373b = j.a.f1425b;
        this.f234b = gVar;
        this.f238g = new t1.g(2);
        g gVar2 = new g(this);
        this.f236e = gVar2;
        reentrantReadWriteLock.writeLock().lock();
        if (i2 == 0) {
            try {
                this.c = 0;
            } catch (Throwable th) {
                this.f233a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                kVar.k(new f(gVar2));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static l a() {
        l lVar;
        synchronized (f231j) {
            try {
                lVar = f232k;
                if (!(lVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return lVar;
    }

    public final int b() {
        this.f233a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.f233a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.f239h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.f233a.writeLock().lock();
        try {
            if (this.c == 0) {
                return;
            }
            this.c = 0;
            this.f233a.writeLock().unlock();
            g gVar = this.f236e;
            l lVar = gVar.f227a;
            try {
                lVar.f237f.k(new f(gVar));
            } catch (Throwable th) {
                lVar.d(th);
            }
        } finally {
            this.f233a.writeLock().unlock();
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f233a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.f234b);
            this.f234b.clear();
            this.f233a.writeLock().unlock();
            this.f235d.post(new j(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.f233a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008f A[Catch: all -> 0x0082, TRY_ENTER, TryCatch #0 {all -> 0x0082, blocks: (B:32:0x005a, B:35:0x005f, B:37:0x0063, B:39:0x0070, B:46:0x008f, B:48:0x0099, B:50:0x009c, B:52:0x009f, B:54:0x00af, B:55:0x00b2), top: B:94:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009f A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:32:0x005a, B:35:0x005f, B:37:0x0063, B:39:0x0070, B:46:0x008f, B:48:0x0099, B:50:0x009c, B:52:0x009f, B:54:0x00af, B:55:0x00b2), top: B:94:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c1 A[Catch: all -> 0x00f7, TRY_ENTER, TryCatch #1 {all -> 0x00f7, blocks: (B:59:0x00c1, B:62:0x00c9, B:65:0x00d0, B:44:0x0085), top: B:96:0x0085 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence e(java.lang.CharSequence r11, int r12, int r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.l.e(java.lang.CharSequence, int, int):java.lang.CharSequence");
    }

    public final void f(i iVar) {
        a0.a.h(iVar, "initCallback cannot be null");
        this.f233a.writeLock().lock();
        try {
            if (this.c == 1 || this.c == 2) {
                this.f235d.post(new j(Arrays.asList(iVar), this.c, null));
            } else {
                this.f234b.add(iVar);
            }
            this.f233a.writeLock().unlock();
        } catch (Throwable th) {
            this.f233a.writeLock().unlock();
            throw th;
        }
    }
}
