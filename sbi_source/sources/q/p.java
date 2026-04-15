package q;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class p extends View {
    public p(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i2) {
        e eVar = (e) getLayoutParams();
        eVar.f1907a = i2;
        setLayoutParams(eVar);
    }

    public void setGuidelineEnd(int i2) {
        e eVar = (e) getLayoutParams();
        eVar.f1909b = i2;
        setLayoutParams(eVar);
    }

    public void setGuidelinePercent(float f3) {
        e eVar = (e) getLayoutParams();
        eVar.c = f3;
        setLayoutParams(eVar);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
    }
}
