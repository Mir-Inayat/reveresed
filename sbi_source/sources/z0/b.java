package z0;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class b extends Property {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2654a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Class cls, String str, int i2) {
        super(cls, str);
        this.f2654a = i2;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f2654a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(w.f2727a.C((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f2654a) {
            case 0:
                e eVar = (e) obj;
                PointF pointF = (PointF) obj2;
                eVar.getClass();
                eVar.f2661a = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                eVar.f2662b = iRound;
                int i2 = eVar.f2665f + 1;
                eVar.f2665f = i2;
                if (i2 == eVar.f2666g) {
                    w.a(eVar.f2664e, eVar.f2661a, iRound, eVar.c, eVar.f2663d);
                    eVar.f2665f = 0;
                    eVar.f2666g = 0;
                }
                break;
            case 1:
                e eVar2 = (e) obj;
                PointF pointF2 = (PointF) obj2;
                eVar2.getClass();
                eVar2.c = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                eVar2.f2663d = iRound2;
                int i3 = eVar2.f2666g + 1;
                eVar2.f2666g = i3;
                if (eVar2.f2665f == i3) {
                    w.a(eVar2.f2664e, eVar2.f2661a, eVar2.f2662b, eVar2.c, iRound2);
                    eVar2.f2665f = 0;
                    eVar2.f2666g = 0;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                w.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                w.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound3 = Math.round(pointF5.x);
                int iRound4 = Math.round(pointF5.y);
                w.a(view3, iRound3, iRound4, view3.getWidth() + iRound3, view3.getHeight() + iRound4);
                break;
            case 5:
                float fFloatValue = ((Float) obj2).floatValue();
                w.f2727a.M((View) obj, fFloatValue);
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
