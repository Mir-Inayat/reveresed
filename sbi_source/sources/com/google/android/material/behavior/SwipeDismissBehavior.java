package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.emoji2.text.n;
import f0.m0;
import f1.c;
import g0.d;
import m0.e;
import s.a;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f542b;
    public boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f543d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f544e = 0.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f545f = 0.5f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f546g = new c(this);

    @Override // s.a
    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zO = this.f542b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zO = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f542b = zO;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f542b = false;
        }
        if (zO) {
            if (this.f541a == null) {
                this.f541a = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f546g);
            }
            if (!this.c && this.f541a.p(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // s.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            m0.g(view, 1048576);
            m0.e(view, 0);
            if (r(view)) {
                m0.h(view, d.f1329j, new n(12, this));
            }
        }
        return false;
    }

    @Override // s.a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (this.f541a == null) {
            return false;
        }
        if (this.c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f541a.j(motionEvent);
        return true;
    }

    public boolean r(View view) {
        return true;
    }
}
