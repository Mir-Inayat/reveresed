package v0;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f2376e = new ThreadLocal();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l.d f2377f = new l.d(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f2378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f2379b;
    public long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f2380d;

    public final void a(RecyclerView recyclerView, int i2, int i3) {
        if (recyclerView.f404o && this.f2379b == 0) {
            this.f2379b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        o1.m mVar = recyclerView.V;
        mVar.f1871a = i2;
        mVar.f1872b = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a8, code lost:
    
        r9 = r4.f381a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00aa, code lost:
    
        r4.w();
        r9.i(r8, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b4, code lost:
    
        if (r5.e() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ba, code lost:
    
        if (r5.f() != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bc, code lost:
    
        r9.g(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c0, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c2, code lost:
    
        r9.a(null, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c5, code lost:
    
        r4.x(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d5, code lost:
    
        r4.x(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d8, code lost:
    
        throw r13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(long r13) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.m.b(long):void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f2378a;
        try {
            int i2 = b0.a.f452a;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i3);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.c);
                }
            }
            this.f2379b = 0L;
            Trace.endSection();
        } catch (Throwable th) {
            this.f2379b = 0L;
            int i4 = b0.a.f452a;
            Trace.endSection();
            throw th;
        }
    }
}
