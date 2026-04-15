package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f747a;

    public b(ClockFaceView clockFaceView) {
        this.f747a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f747a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f727v.f734d) - clockFaceView.D;
        if (height != clockFaceView.f752t) {
            clockFaceView.f752t = height;
            clockFaceView.m();
            ClockHandView clockHandView = clockFaceView.f727v;
            clockHandView.f742l = clockFaceView.f752t;
            clockHandView.invalidate();
        }
        return true;
    }
}
