package v0;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends f0.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RecyclerView f2412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p0 f2413e;

    public q0(RecyclerView recyclerView) {
        this.f2412d = recyclerView;
        p0 p0Var = this.f2413e;
        if (p0Var != null) {
            this.f2413e = p0Var;
        } else {
            this.f2413e = new p0(this);
        }
    }

    @Override // f0.b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f2412d.u()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().M(accessibilityEvent);
        }
    }

    @Override // f0.b
    public final void d(View view, g0.i iVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = iVar.f1336a;
        this.f1226a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        RecyclerView recyclerView = this.f2412d;
        if (recyclerView.u() || recyclerView.getLayoutManager() == null) {
            return;
        }
        c0 layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f2298b;
        i0 i0Var = recyclerView2.f381a;
        l0 l0Var = recyclerView2.W;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.f2298b.canScrollHorizontally(-1)) {
            iVar.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (layoutManager.f2298b.canScrollVertically(1) || layoutManager.f2298b.canScrollHorizontally(1)) {
            iVar.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.C(i0Var, l0Var), layoutManager.s(i0Var, l0Var), false, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0056 A[PHI: r0
      0x0056: PHI (r0v8 int) = (r0v4 int), (r0v12 int) binds: [B:27:0x0073, B:19:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // f0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(android.view.View r4, int r5, android.os.Bundle r6) {
        /*
            r3 = this;
            boolean r4 = super.g(r4, r5, r6)
            r6 = 1
            if (r4 == 0) goto L8
            return r6
        L8:
            androidx.recyclerview.widget.RecyclerView r4 = r3.f2412d
            boolean r0 = r4.u()
            r1 = 0
            if (r0 != 0) goto L8c
            v0.c0 r0 = r4.getLayoutManager()
            if (r0 == 0) goto L8c
            v0.c0 r4 = r4.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r0 = r4.f2298b
            v0.i0 r2 = r0.f381a
            r2 = 4096(0x1000, float:5.74E-42)
            if (r5 == r2) goto L58
            r2 = 8192(0x2000, float:1.148E-41)
            if (r5 == r2) goto L2a
            r5 = r1
            r0 = r5
            goto L81
        L2a:
            r5 = -1
            boolean r0 = r0.canScrollVertically(r5)
            if (r0 == 0) goto L3f
            int r0 = r4.f2305j
            int r2 = r4.z()
            int r0 = r0 - r2
            int r2 = r4.w()
            int r0 = r0 - r2
            int r0 = -r0
            goto L40
        L3f:
            r0 = r1
        L40:
            androidx.recyclerview.widget.RecyclerView r2 = r4.f2298b
            boolean r5 = r2.canScrollHorizontally(r5)
            if (r5 == 0) goto L56
            int r5 = r4.f2304i
            int r2 = r4.x()
            int r5 = r5 - r2
            int r2 = r4.y()
            int r5 = r5 - r2
            int r5 = -r5
            goto L81
        L56:
            r5 = r1
            goto L81
        L58:
            boolean r5 = r0.canScrollVertically(r6)
            if (r5 == 0) goto L6c
            int r5 = r4.f2305j
            int r0 = r4.z()
            int r5 = r5 - r0
            int r0 = r4.w()
            int r5 = r5 - r0
            r0 = r5
            goto L6d
        L6c:
            r0 = r1
        L6d:
            androidx.recyclerview.widget.RecyclerView r5 = r4.f2298b
            boolean r5 = r5.canScrollHorizontally(r6)
            if (r5 == 0) goto L56
            int r5 = r4.f2304i
            int r2 = r4.x()
            int r5 = r5 - r2
            int r2 = r4.y()
            int r5 = r5 - r2
        L81:
            if (r0 != 0) goto L86
            if (r5 != 0) goto L86
            goto L8c
        L86:
            androidx.recyclerview.widget.RecyclerView r4 = r4.f2298b
            r4.E(r5, r0, r6)
            return r6
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.q0.g(android.view.View, int, android.os.Bundle):boolean");
    }
}
