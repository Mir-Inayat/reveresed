package l;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import f0.c0;
import f0.m0;
import java.lang.reflect.Field;
import java.util.Comparator;
import v0.l;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1543a;

    public /* synthetic */ d(int i2) {
        this.f1543a = i2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int top;
        int top2;
        switch (this.f1543a) {
            case 0:
                top = ((g) obj).f1549b;
                top2 = ((g) obj2).f1549b;
                break;
            case 1:
                top = ((View) obj).getTop();
                top2 = ((View) obj2).getTop();
                break;
            case 2:
                Field field = m0.f1276a;
                float fM = c0.m((View) obj);
                float fM2 = c0.m((View) obj2);
                if (fM > fM2) {
                    return -1;
                }
                return fM < fM2 ? 1 : 0;
            default:
                l lVar = (l) obj;
                l lVar2 = (l) obj2;
                RecyclerView recyclerView = lVar.f2366d;
                if ((recyclerView == null) == (lVar2.f2366d == null)) {
                    boolean z = lVar.f2364a;
                    if (z == lVar2.f2364a) {
                        int i2 = lVar2.f2365b - lVar.f2365b;
                        if (i2 != 0) {
                            return i2;
                        }
                        int i3 = lVar.c - lVar2.c;
                        if (i3 != 0) {
                            return i3;
                        }
                        return 0;
                    }
                    if (!z) {
                        return 1;
                    }
                } else if (recyclerView == null) {
                    return 1;
                }
                return -1;
        }
        return top - top2;
    }
}
