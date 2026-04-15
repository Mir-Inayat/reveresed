package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.emoji2.text.n;
import com.google.android.material.behavior.SwipeDismissBehavior;
import t1.g;
import v1.c;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f671h;

    public BaseTransientBottomBar$Behavior() {
        g gVar = new g(27);
        this.f544e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f545f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f543d = 0;
        this.f671h = gVar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, s.a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f671h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (n.c == null) {
                    n.c = new n(26);
                }
                synchronized (n.c.f244b) {
                }
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (n.c == null) {
                n.c = new n(26);
            }
            synchronized (n.c.f244b) {
            }
        }
        return super.f(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean r(View view) {
        this.f671h.getClass();
        return view instanceof c;
    }
}
