package j1;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.redhand.laugiytr.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import v0.a0;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class b extends a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f1431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f1432b;

    public b() {
        Paint paint = new Paint();
        this.f1431a = paint;
        this.f1432b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // v0.a0
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        int iY;
        int iW;
        float dimension = recyclerView.getResources().getDimension(R.NP_MANAGER6.NP_MANAGER);
        Paint paint = this.f1431a;
        paint.setStrokeWidth(dimension);
        Iterator it = this.f1432b.iterator();
        while (it.hasNext()) {
            ((d) it.next()).getClass();
            int i2 = x.a.f2614a;
            float f3 = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f3)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f3)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f3)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f3))));
            int iX = 0;
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).c0()) {
                c cVar = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f607l;
                switch (cVar.f1434b) {
                    case 0:
                        break;
                    default:
                        iX = cVar.c.z();
                        break;
                }
                float f4 = iX;
                c cVar2 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f607l;
                switch (cVar2.f1434b) {
                    case 0:
                        iW = cVar2.c.f2305j;
                        break;
                    default:
                        CarouselLayoutManager carouselLayoutManager = cVar2.c;
                        iW = carouselLayoutManager.f2305j - carouselLayoutManager.w();
                        break;
                }
                canvas2 = canvas;
                canvas2.drawLine(0.0f, f4, 0.0f, iW, paint);
            } else {
                canvas2 = canvas;
                c cVar3 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f607l;
                switch (cVar3.f1434b) {
                    case 0:
                        iX = cVar3.c.x();
                        break;
                }
                float f5 = iX;
                c cVar4 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f607l;
                switch (cVar4.f1434b) {
                    case 0:
                        CarouselLayoutManager carouselLayoutManager2 = cVar4.c;
                        iY = carouselLayoutManager2.f2304i - carouselLayoutManager2.y();
                        break;
                    default:
                        iY = cVar4.c.f2304i;
                        break;
                }
                canvas2.drawLine(f5, 0.0f, iY, 0.0f, paint);
            }
            canvas = canvas2;
        }
    }
}
