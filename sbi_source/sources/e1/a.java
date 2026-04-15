package e1;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import f0.m0;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends s.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f970a;

    @Override // s.a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        r(coordinatorLayout, view, i2);
        if (this.f970a == null) {
            this.f970a = new b(view);
        }
        b bVar = this.f970a;
        View view2 = (View) bVar.c;
        bVar.f971a = view2.getTop();
        bVar.f972b = view2.getLeft();
        b bVar2 = this.f970a;
        View view3 = (View) bVar2.c;
        int top = 0 - (view3.getTop() - bVar2.f971a);
        Field field = m0.f1276a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - bVar2.f972b));
        return true;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i2) {
        coordinatorLayout.q(view, i2);
    }
}
