package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.emoji2.text.u;
import androidx.recyclerview.widget.RecyclerView;
import c1.a;
import com.redhand.laugiytr.R;
import j1.b;
import j1.c;
import j1.e;
import v0.c0;
import v0.d0;
import v0.i0;
import v0.l0;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class CarouselLayoutManager extends c0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e f606k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f607l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final View.OnLayoutChangeListener f608m;

    public CarouselLayoutManager() {
        e eVar = new e();
        new b();
        this.f608m = new View.OnLayoutChangeListener() { // from class: j1.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                if (i4 - i2 == i8 - i6 && i5 - i3 == i9 - i7) {
                    return;
                }
                view.post(new u(3, this.f1430a));
            }
        };
        this.f606k = eVar;
        W();
        d0(0);
    }

    @Override // v0.c0
    public final boolean E() {
        return true;
    }

    @Override // v0.c0
    public final void K(RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        e eVar = this.f606k;
        float dimension = eVar.f1435a;
        if (dimension <= 0.0f) {
            dimension = context.getResources().getDimension(R.NP_MANAGER6.NP_MANAGER);
        }
        eVar.f1435a = dimension;
        float dimension2 = eVar.f1436b;
        if (dimension2 <= 0.0f) {
            dimension2 = context.getResources().getDimension(R.NP_MANAGER6.NP_MANAGER);
        }
        eVar.f1436b = dimension2;
        W();
        recyclerView.addOnLayoutChangeListener(this.f608m);
    }

    @Override // v0.c0
    public final void L(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f608m);
    }

    @Override // v0.c0
    public final void M(AccessibilityEvent accessibilityEvent) {
        super.M(accessibilityEvent);
        if (q() > 0) {
            accessibilityEvent.setFromIndex(c0.A(p(0)));
            accessibilityEvent.setToIndex(c0.A(p(q() - 1)));
        }
    }

    @Override // v0.c0
    public final boolean V(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // v0.c0
    public final int X(int i2, i0 i0Var, l0 l0Var) {
        if (!c0() || q() == 0 || i2 == 0) {
            return 0;
        }
        i0Var.d(0);
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // v0.c0
    public final int Y(int i2, i0 i0Var, l0 l0Var) {
        if (!d() || q() == 0 || i2 == 0) {
            return 0;
        }
        i0Var.d(0);
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // v0.c0
    public final boolean c() {
        return c0();
    }

    public final boolean c0() {
        return this.f607l.f1433a == 0;
    }

    @Override // v0.c0
    public final boolean d() {
        return !c0();
    }

    public final void d0(int i2) {
        c cVar;
        if (i2 != 0 && i2 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i2);
        }
        b(null);
        c cVar2 = this.f607l;
        if (cVar2 == null || i2 != cVar2.f1433a) {
            if (i2 == 0) {
                cVar = new c(this, 1);
            } else {
                if (i2 != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                cVar = new c(this, 0);
            }
            this.f607l = cVar;
            W();
        }
    }

    @Override // v0.c0
    public final int g(l0 l0Var) {
        q();
        return 0;
    }

    @Override // v0.c0
    public final int h(l0 l0Var) {
        return 0;
    }

    @Override // v0.c0
    public final int i(l0 l0Var) {
        return 0;
    }

    @Override // v0.c0
    public final int j(l0 l0Var) {
        q();
        return 0;
    }

    @Override // v0.c0
    public final int k(l0 l0Var) {
        return 0;
    }

    @Override // v0.c0
    public final int l(l0 l0Var) {
        return 0;
    }

    @Override // v0.c0
    public final d0 m() {
        return new d0(-2, -2);
    }

    @Override // v0.c0
    public final void t(View view, Rect rect) {
        super.t(view, rect);
        rect.centerY();
        if (c0()) {
            rect.centerX();
        }
        throw null;
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        new b();
        this.f608m = new View.OnLayoutChangeListener() { // from class: j1.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i22, int i32, int i4, int i5, int i6, int i7, int i8, int i9) {
                if (i4 - i22 == i8 - i6 && i5 - i32 == i9 - i7) {
                    return;
                }
                view.post(new u(3, this.f1430a));
            }
        };
        this.f606k = new e();
        W();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f493b);
            typedArrayObtainStyledAttributes.getInt(0, 0);
            W();
            d0(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
