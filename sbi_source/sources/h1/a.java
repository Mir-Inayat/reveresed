package h1;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import t1.i;
import t1.k;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1352b;

    public /* synthetic */ a(int i2, Object obj) {
        this.f1351a = i2;
        this.f1352b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f1351a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k kVar = ((BottomSheetBehavior) this.f1352b).f560i;
                if (kVar != null) {
                    i iVar = kVar.f2205b;
                    if (iVar.f2195j != fFloatValue) {
                        iVar.f2195j = fFloatValue;
                        kVar.f2208f = true;
                        kVar.f2209g = true;
                        kVar.invalidateSelf();
                    }
                }
                break;
            case 1:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                v0.k kVar2 = (v0.k) this.f1352b;
                kVar2.f2343b.setAlpha(iFloatValue);
                kVar2.c.setAlpha(iFloatValue);
                kVar2.f2354n.invalidate();
                break;
            default:
                ((TextInputLayout) this.f1352b).f720w0.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
