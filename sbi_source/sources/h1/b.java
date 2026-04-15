package h1;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class b extends a0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s.a f1354b;

    public /* synthetic */ b(s.a aVar, int i2) {
        this.f1353a = i2;
        this.f1354b = aVar;
    }

    @Override // a0.a
    public int B(View view) {
        switch (this.f1353a) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1354b;
                return sideSheetBehavior.f660l + sideSheetBehavior.f663o;
            default:
                return super.B(view);
        }
    }

    @Override // a0.a
    public int D() {
        switch (this.f1353a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f1354b;
                return bottomSheetBehavior.I ? bottomSheetBehavior.V : bottomSheetBehavior.G;
            default:
                return super.D();
        }
    }

    @Override // a0.a
    public final void T(int i2) {
        switch (this.f1353a) {
            case 0:
                if (i2 == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f1354b;
                    if (bottomSheetBehavior.K) {
                        bottomSheetBehavior.C(1);
                    }
                }
                break;
            default:
                if (i2 == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1354b;
                    if (sideSheetBehavior.f655g) {
                        sideSheetBehavior.r(1);
                    }
                }
                break;
        }
    }

    @Override // a0.a
    public final void U(View view, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f1353a) {
            case 0:
                ((BottomSheetBehavior) this.f1354b).u(i3);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1354b;
                WeakReference weakReference = sideSheetBehavior.f665q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f650a.Q(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f669u;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f650a.c(i2);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9  */
    @Override // a0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V(android.view.View r6, float r7, float r8) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.b.V(android.view.View, float, float):void");
    }

    @Override // a0.a
    public final int j(View view, int i2) {
        switch (this.f1353a) {
            case 0:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1354b;
                return a0.a.i(i2, sideSheetBehavior.f650a.x(), sideSheetBehavior.f650a.w());
        }
    }

    @Override // a0.a
    public final int k(View view, int i2) {
        switch (this.f1353a) {
            case 0:
                return a0.a.i(i2, ((BottomSheetBehavior) this.f1354b).x(), D());
            default:
                return view.getTop();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0048  */
    @Override // a0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k0(android.view.View r5, int r6) {
        /*
            r4 = this;
            int r0 = r4.f1353a
            switch(r0) {
                case 0: goto L1c;
                default: goto L5;
            }
        L5:
            s.a r6 = r4.f1354b
            com.google.android.material.sidesheet.SideSheetBehavior r6 = (com.google.android.material.sidesheet.SideSheetBehavior) r6
            int r0 = r6.f656h
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L10
            goto L1b
        L10:
            java.lang.ref.WeakReference r6 = r6.f664p
            if (r6 == 0) goto L1b
            java.lang.Object r6 = r6.get()
            if (r6 != r5) goto L1b
            r1 = r2
        L1b:
            return r1
        L1c:
            s.a r0 = r4.f1354b
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r0
            int r1 = r0.N
            r2 = 1
            if (r1 != r2) goto L26
            goto L56
        L26:
            boolean r3 = r0.f551c0
            if (r3 == 0) goto L2b
            goto L56
        L2b:
            r3 = 3
            if (r1 != r3) goto L48
            int r1 = r0.f548a0
            if (r1 != r6) goto L48
            java.lang.ref.WeakReference r6 = r0.X
            if (r6 == 0) goto L3d
            java.lang.Object r6 = r6.get()
            android.view.View r6 = (android.view.View) r6
            goto L3e
        L3d:
            r6 = 0
        L3e:
            if (r6 == 0) goto L48
            r1 = -1
            boolean r6 = r6.canScrollVertically(r1)
            if (r6 == 0) goto L48
            goto L56
        L48:
            android.os.SystemClock.uptimeMillis()
            java.lang.ref.WeakReference r6 = r0.W
            if (r6 == 0) goto L56
            java.lang.Object r6 = r6.get()
            if (r6 != r5) goto L56
            goto L57
        L56:
            r2 = 0
        L57:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.b.k0(android.view.View, int):boolean");
    }
}
