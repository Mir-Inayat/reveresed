package z0;

import android.animation.ObjectAnimator;
import android.view.View;
import com.redhand.laugiytr.R;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class h extends m {
    public static final String[] B = {"android:visibility:visibility", "android:visibility:parent"};
    public final int A;

    public h(int i2) {
        this();
        this.A = i2;
    }

    public static void I(u uVar) {
        View view = uVar.f2726b;
        int visibility = view.getVisibility();
        HashMap map = uVar.f2725a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    public static float K(u uVar, float f3) {
        Float f4;
        return (uVar == null || (f4 = (Float) uVar.f2725a.get("android:fade:transitionAlpha")) == null) ? f3 : f4.floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static z0.g0 L(z0.u r8, z0.u r9) {
        /*
            z0.g0 r0 = new z0.g0
            r0.<init>()
            r1 = 0
            r0.f2678a = r1
            r0.f2679b = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.f2725a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.c = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f2681e = r6
            goto L33
        L2f:
            r0.c = r3
            r0.f2681e = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.f2725a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.f2680d = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f2682f = r2
            goto L56
        L52:
            r0.f2680d = r3
            r0.f2682f = r2
        L56:
            r2 = 1
            if (r8 == 0) goto L8a
            if (r9 == 0) goto L8a
            int r8 = r0.c
            int r9 = r0.f2680d
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.f2681e
            android.view.ViewGroup r4 = r0.f2682f
            if (r3 != r4) goto L68
            goto L9f
        L68:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L71
            r0.f2679b = r1
            r0.f2678a = r2
            return r0
        L71:
            if (r9 != 0) goto L9f
            r0.f2679b = r2
            r0.f2678a = r2
            return r0
        L78:
            android.view.ViewGroup r8 = r0.f2682f
            if (r8 != 0) goto L81
            r0.f2679b = r1
            r0.f2678a = r2
            return r0
        L81:
            android.view.ViewGroup r8 = r0.f2681e
            if (r8 != 0) goto L9f
            r0.f2679b = r2
            r0.f2678a = r2
            return r0
        L8a:
            if (r8 != 0) goto L95
            int r8 = r0.f2680d
            if (r8 != 0) goto L95
            r0.f2679b = r2
            r0.f2678a = r2
            return r0
        L95:
            if (r9 != 0) goto L9f
            int r8 = r0.c
            if (r8 != 0) goto L9f
            r0.f2679b = r1
            r0.f2678a = r2
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.h.L(z0.u, z0.u):z0.g0");
    }

    public final ObjectAnimator J(View view, float f3, float f4) {
        if (f3 == f4) {
            return null;
        }
        w.f2727a.M(view, f3);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, w.f2728b, f4);
        g gVar = new g(view);
        objectAnimatorOfFloat.addListener(gVar);
        o().a(gVar);
        return objectAnimatorOfFloat;
    }

    @Override // z0.m
    public final void d(u uVar) {
        I(uVar);
    }

    @Override // z0.m
    public final void g(u uVar) {
        I(uVar);
        View view = uVar.f2726b;
        Float fValueOf = (Float) view.getTag(R.NP_MANAGER8.NP_MANAGER);
        if (fValueOf == null) {
            fValueOf = view.getVisibility() == 0 ? Float.valueOf(w.f2727a.C(view)) : Float.valueOf(0.0f);
        }
        uVar.f2725a.put("android:fade:transitionAlpha", fValueOf);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (L(n(r3, false), r(r3, false)).f2678a != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0214  */
    @Override // z0.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator k(android.view.ViewGroup r24, z0.u r25, z0.u r26) {
        /*
            Method dump skipped, instruction units count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.h.k(android.view.ViewGroup, z0.u, z0.u):android.animation.Animator");
    }

    @Override // z0.m
    public final String[] q() {
        return B;
    }

    @Override // z0.m
    public final boolean s(u uVar, u uVar2) {
        if (uVar == null && uVar2 == null) {
            return false;
        }
        if (uVar != null && uVar2 != null && uVar2.f2725a.containsKey("android:visibility:visibility") != uVar.f2725a.containsKey("android:visibility:visibility")) {
            return false;
        }
        g0 g0VarL = L(uVar, uVar2);
        if (g0VarL.f2678a) {
            return g0VarL.c == 0 || g0VarL.f2680d == 0;
        }
        return false;
    }

    public h() {
        this.A = 3;
    }
}
