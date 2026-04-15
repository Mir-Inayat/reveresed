package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import f.x;
import f0.m0;
import i1.h;
import o1.a;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class CheckableImageButton extends x implements Checkable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f640g = {R.attr.state_checked};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f642e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f643f;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.redhand.laugiytr.R.NP_MANAGER3.NP_MANAGER);
        this.f642e = true;
        this.f643f = true;
        m0.j(this, new h(this, 1));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f641d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        return this.f641d ? View.mergeDrawableStates(super.onCreateDrawableState(i2 + 1), f640g) : super.onCreateDrawableState(i2);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f1560a);
        setChecked(aVar.c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.c = this.f641d;
        return aVar;
    }

    public void setCheckable(boolean z) {
        if (this.f642e != z) {
            this.f642e = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.f642e || this.f641d == z) {
            return;
        }
        this.f641d = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.f643f = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.f643f) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f641d);
    }
}
