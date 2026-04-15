package z0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class f extends m {
    public static final String[] A = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final b B = new b(PointF.class, "topLeft", 0);
    public static final b C = new b(PointF.class, "bottomRight", 1);
    public static final b D = new b(PointF.class, "bottomRight", 2);
    public static final b E = new b(PointF.class, "topLeft", 3);
    public static final b F = new b(PointF.class, "position", 4);

    public static void I(u uVar) {
        View view = uVar.f2726b;
        HashMap map = uVar.f2725a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", view.getParent());
    }

    @Override // z0.m
    public final void d(u uVar) {
        I(uVar);
    }

    @Override // z0.m
    public final void g(u uVar) {
        I(uVar);
    }

    @Override // z0.m
    public final Animator k(ViewGroup viewGroup, u uVar, u uVar2) {
        int i2;
        f fVar;
        Animator animatorA;
        if (uVar != null) {
            HashMap map = uVar.f2725a;
            if (uVar2 != null) {
                HashMap map2 = uVar2.f2725a;
                ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
                ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
                if (viewGroup2 != null && viewGroup3 != null) {
                    View view = uVar2.f2726b;
                    Rect rect = (Rect) map.get("android:changeBounds:bounds");
                    Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
                    int i3 = rect.left;
                    int i4 = rect2.left;
                    int i5 = rect.top;
                    int i6 = rect2.top;
                    int i7 = rect.right;
                    int i8 = rect2.right;
                    int i9 = rect.bottom;
                    int i10 = rect2.bottom;
                    int i11 = i7 - i3;
                    int i12 = i9 - i5;
                    int i13 = i8 - i4;
                    int i14 = i10 - i6;
                    Rect rect3 = (Rect) map.get("android:changeBounds:clip");
                    Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
                    if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
                        i2 = 0;
                    } else {
                        i2 = (i3 == i4 && i5 == i6) ? 0 : 1;
                        if (i7 != i8 || i9 != i10) {
                            i2++;
                        }
                    }
                    if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                        i2++;
                    }
                    int i15 = i2;
                    if (i15 > 0) {
                        w.a(view, i3, i5, i7, i9);
                        if (i15 != 2) {
                            fVar = this;
                            if (i3 == i4 && i5 == i6) {
                                fVar.f2715v.getClass();
                                animatorA = i.a(view, D, t1.g.b(i7, i9, i8, i10));
                            } else {
                                fVar.f2715v.getClass();
                                animatorA = i.a(view, E, t1.g.b(i3, i5, i4, i6));
                            }
                        } else if (i11 == i13 && i12 == i14) {
                            fVar = this;
                            fVar.f2715v.getClass();
                            animatorA = i.a(view, F, t1.g.b(i3, i5, i4, i6));
                        } else {
                            fVar = this;
                            e eVar = new e(view);
                            fVar.f2715v.getClass();
                            ObjectAnimator objectAnimatorA = i.a(eVar, B, t1.g.b(i3, i5, i4, i6));
                            fVar.f2715v.getClass();
                            ObjectAnimator objectAnimatorA2 = i.a(eVar, C, t1.g.b(i7, i9, i8, i10));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(objectAnimatorA, objectAnimatorA2);
                            animatorSet.addListener(new c(eVar));
                            animatorA = animatorSet;
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                            t1.e.P(viewGroup4, true);
                            fVar.o().a(new d(viewGroup4));
                        }
                        return animatorA;
                    }
                }
            }
        }
        return null;
    }

    @Override // z0.m
    public final String[] q() {
        return A;
    }
}
