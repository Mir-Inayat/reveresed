package f1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class b extends a0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1316a;

    @Override // a0.a
    public final int A() {
        switch (this.f1316a) {
            case 0:
                return 1;
            case 1:
                return 2;
            default:
                return 0;
        }
    }

    @Override // a0.a
    public final ViewPropertyAnimator C(View view, int i2) {
        switch (this.f1316a) {
            case 0:
                return view.animate().translationY(i2);
            case 1:
                return view.animate().translationX(-i2);
            default:
                return view.animate().translationX(i2);
        }
    }

    @Override // a0.a
    public final int x(View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        int measuredHeight;
        int i2;
        switch (this.f1316a) {
            case 0:
                measuredHeight = view.getMeasuredHeight();
                i2 = marginLayoutParams.bottomMargin;
                break;
            case 1:
                measuredHeight = view.getMeasuredWidth();
                i2 = marginLayoutParams.leftMargin;
                break;
            default:
                measuredHeight = view.getMeasuredWidth();
                i2 = marginLayoutParams.rightMargin;
                break;
        }
        return measuredHeight + i2;
    }
}
