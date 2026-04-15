package t1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class r extends x {
    public final /* synthetic */ ArrayList c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Matrix f2263d;

    public r(ArrayList arrayList, Matrix matrix) {
        this.c = arrayList;
        this.f2263d = matrix;
    }

    @Override // t1.x
    public final void a(Matrix matrix, s1.a aVar, int i2, Canvas canvas) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((x) obj).a(this.f2263d, aVar, i2, canvas);
        }
    }
}
