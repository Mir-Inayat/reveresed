package androidx.emoji2.text;

import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class f extends a0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f226a;

    public f(g gVar) {
        this.f226a = gVar;
    }

    @Override // a0.a
    public final void N(Throwable th) {
        this.f226a.f227a.d(th);
    }

    @Override // a0.a
    public final void Q(y yVar) {
        g gVar = this.f226a;
        gVar.c = yVar;
        y yVar2 = gVar.c;
        l lVar = gVar.f227a;
        gVar.f228b = new t(yVar2, lVar.f238g, lVar.f240i, Build.VERSION.SDK_INT >= 34 ? p.a() : a0.a.t());
        l lVar2 = gVar.f227a;
        lVar2.getClass();
        ArrayList arrayList = new ArrayList();
        lVar2.f233a.writeLock().lock();
        try {
            lVar2.c = 1;
            arrayList.addAll(lVar2.f234b);
            lVar2.f234b.clear();
            lVar2.f233a.writeLock().unlock();
            lVar2.f235d.post(new j(arrayList, lVar2.c, null));
        } catch (Throwable th) {
            lVar2.f233a.writeLock().unlock();
            throw th;
        }
    }
}
