package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.redhand.laugiytr.R;
import t1.n;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public abstract class h extends ConstraintLayout {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final g f751s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f752t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final t1.k f753u;

    /* JADX WARN: Type inference failed for: r6v2, types: [com.google.android.material.timepicker.g] */
    public h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.NP_MANAGER3.NP_MANAGER);
        LayoutInflater.from(context).inflate(R.NP_MANAGER11.NP_MANAGER, this);
        t1.k kVar = new t1.k();
        this.f753u = kVar;
        t1.l lVar = new t1.l(0.5f);
        n nVarF = kVar.f2205b.f2187a.f();
        nVarF.f2232e = lVar;
        nVarF.f2233f = lVar;
        nVarF.f2234g = lVar;
        nVarF.f2235h = lVar;
        kVar.setShapeAppearanceModel(nVarF.a());
        this.f753u.n(ColorStateList.valueOf(-1));
        setBackground(this.f753u);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c1.a.f507q, R.NP_MANAGER3.NP_MANAGER, 0);
        this.f752t = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f751s = new Runnable() { // from class: com.google.android.material.timepicker.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f750a.m();
            }
        };
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            g gVar = this.f751s;
            handler.removeCallbacks(gVar);
            handler.post(gVar);
        }
    }

    public abstract void m();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        m();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            g gVar = this.f751s;
            handler.removeCallbacks(gVar);
            handler.post(gVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i2) {
        this.f753u.n(ColorStateList.valueOf(i2));
    }
}
