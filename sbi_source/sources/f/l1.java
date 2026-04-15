package f;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class l1 implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m1 f1075a;

    public l1(m1 m1Var) {
        this.f1075a = m1Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        m1 m1Var = this.f1075a;
        i1 i1Var = m1Var.f1097n;
        Handler handler = m1Var.f1101r;
        a0 a0Var = m1Var.f1105v;
        int action = motionEvent.getAction();
        int x2 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        if (action == 0 && a0Var != null && a0Var.isShowing() && x2 >= 0 && x2 < a0Var.getWidth() && y2 >= 0 && y2 < a0Var.getHeight()) {
            handler.postDelayed(i1Var, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        handler.removeCallbacks(i1Var);
        return false;
    }
}
