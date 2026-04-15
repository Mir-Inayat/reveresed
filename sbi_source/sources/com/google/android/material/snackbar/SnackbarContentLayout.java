package com.google.android.material.snackbar;

import a0.a;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.redhand.laugiytr.R;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Button f673b;
    public int c;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a.b0(context, R.NP_MANAGER3.NP_MANAGER, d1.a.f833b);
    }

    public final boolean a(int i2, int i3, int i4) {
        boolean z;
        if (i2 != getOrientation()) {
            setOrientation(i2);
            z = true;
        } else {
            z = false;
        }
        if (this.f672a.getPaddingTop() == i3 && this.f672a.getPaddingBottom() == i4) {
            return z;
        }
        TextView textView = this.f672a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i3, textView.getPaddingEnd(), i4);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i3, textView.getPaddingRight(), i4);
        return true;
    }

    public Button getActionView() {
        return this.f673b;
    }

    public TextView getMessageView() {
        return this.f672a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f672a = (TextView) findViewById(R.NP_MANAGER8.NP_MANAGER);
        this.f673b = (Button) findViewById(R.NP_MANAGER8.NP_MANAGER);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.NP_MANAGER6.NP_MANAGER);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.NP_MANAGER6.NP_MANAGER);
        Layout layout = this.f672a.getLayout();
        boolean z = layout != null && layout.getLineCount() > 1;
        if (!z || this.c <= 0 || this.f673b.getMeasuredWidth() <= this.c) {
            if (!z) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i2, i3);
    }

    public void setMaxInlineActionWidth(int i2) {
        this.c = i2;
    }
}
