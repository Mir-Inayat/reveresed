package d0;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f828b;

    public g(f fVar, boolean z) {
        this.f828b = fVar;
        this.f827a = z;
    }

    public boolean a() {
        return this.f827a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(int r7, java.lang.CharSequence r8) {
        /*
            r6 = this;
            if (r8 == 0) goto L48
            if (r7 < 0) goto L48
            int r0 = r8.length()
            int r0 = r0 - r7
            if (r0 < 0) goto L48
            java.lang.Object r0 = r6.f828b
            d0.f r0 = (d0.f) r0
            if (r0 != 0) goto L16
            boolean r7 = r6.a()
            return r7
        L16:
            r0.getClass()
            r0 = 0
            r1 = 2
            r2 = r0
            r3 = r1
        L1d:
            r4 = 1
            if (r2 >= r7) goto L3d
            if (r3 != r1) goto L3d
            char r3 = r8.charAt(r2)
            byte r3 = java.lang.Character.getDirectionality(r3)
            d0.g r5 = d0.h.f829a
            if (r3 == 0) goto L39
            if (r3 == r4) goto L37
            if (r3 == r1) goto L37
            switch(r3) {
                case 14: goto L39;
                case 15: goto L39;
                case 16: goto L37;
                case 17: goto L37;
                default: goto L35;
            }
        L35:
            r3 = r1
            goto L3a
        L37:
            r3 = r0
            goto L3a
        L39:
            r3 = r4
        L3a:
            int r2 = r2 + 1
            goto L1d
        L3d:
            if (r3 == 0) goto L47
            if (r3 == r4) goto L46
            boolean r7 = r6.a()
            return r7
        L46:
            return r0
        L47:
            return r4
        L48:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.g.b(int, java.lang.CharSequence):boolean");
    }

    public g(BottomSheetBehavior bottomSheetBehavior, boolean z) {
        this.f828b = bottomSheetBehavior;
        this.f827a = z;
    }
}
