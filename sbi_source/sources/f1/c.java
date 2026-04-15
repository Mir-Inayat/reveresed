package f1;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class c extends a0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1318b = -1;
    public final /* synthetic */ SwipeDismissBehavior c;

    public c(SwipeDismissBehavior swipeDismissBehavior) {
        this.c = swipeDismissBehavior;
    }

    @Override // a0.a
    public final int B(View view) {
        return view.getWidth();
    }

    @Override // a0.a
    public final void S(View view, int i2) {
        this.f1318b = i2;
        this.f1317a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.c;
            swipeDismissBehavior.c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.c = false;
        }
    }

    @Override // a0.a
    public final void U(View view, int i2, int i3) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.c;
        float f3 = width * swipeDismissBehavior.f544e;
        float width2 = view.getWidth() * swipeDismissBehavior.f545f;
        float fAbs = Math.abs(i2 - this.f1317a);
        if (fAbs <= f3) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f3) / (width2 - f3))), 1.0f));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    @Override // a0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.f1318b = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r2 = 0
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r8.c
            r4 = 1
            if (r1 == 0) goto L37
            int r5 = r9.getLayoutDirection()
            if (r5 != r4) goto L18
            r5 = r4
            goto L19
        L18:
            r5 = r2
        L19:
            int r6 = r3.f543d
            r7 = 2
            if (r6 != r7) goto L1f
            goto L50
        L1f:
            if (r6 != 0) goto L2b
            if (r5 == 0) goto L28
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L65
            goto L50
        L28:
            if (r1 <= 0) goto L65
            goto L50
        L2b:
            if (r6 != r4) goto L65
            if (r5 == 0) goto L32
            if (r1 <= 0) goto L65
            goto L50
        L32:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L65
            goto L50
        L37:
            int r1 = r9.getLeft()
            int r5 = r8.f1317a
            int r1 = r1 - r5
            int r5 = r9.getWidth()
            float r5 = (float) r5
            r6 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r1 = java.lang.Math.abs(r1)
            if (r1 < r5) goto L65
        L50:
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L5f
            int r10 = r9.getLeft()
            int r0 = r8.f1317a
            if (r10 >= r0) goto L5d
            goto L5f
        L5d:
            int r0 = r0 + r11
            goto L63
        L5f:
            int r10 = r8.f1317a
            int r0 = r10 - r11
        L63:
            r2 = r4
            goto L67
        L65:
            int r0 = r8.f1317a
        L67:
            m0.e r10 = r3.f541a
            int r11 = r9.getTop()
            boolean r10 = r10.o(r0, r11)
            if (r10 == 0) goto L7b
            c0.a r10 = new c0.a
            r10.<init>(r3, r9, r2)
            r9.postOnAnimation(r10)
        L7b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.c.V(android.view.View, float, float):void");
    }

    @Override // a0.a
    public final int j(View view, int i2) {
        int width;
        int width2;
        int width3;
        boolean z = view.getLayoutDirection() == 1;
        int i3 = this.c.f543d;
        if (i3 == 0) {
            if (z) {
                width = this.f1317a - view.getWidth();
                width2 = this.f1317a;
            } else {
                width = this.f1317a;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i3 != 1) {
            width = this.f1317a - view.getWidth();
            width2 = view.getWidth() + this.f1317a;
        } else if (z) {
            width = this.f1317a;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f1317a - view.getWidth();
            width2 = this.f1317a;
        }
        return Math.min(Math.max(width, i2), width2);
    }

    @Override // a0.a
    public final int k(View view, int i2) {
        return view.getTop();
    }

    @Override // a0.a
    public final boolean k0(View view, int i2) {
        int i3 = this.f1318b;
        return (i3 == -1 || i3 == i2) && this.c.r(view);
    }

    @Override // a0.a
    public final void T(int i2) {
    }
}
