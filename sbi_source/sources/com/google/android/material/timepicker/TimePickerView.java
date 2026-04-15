package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.redhand.laugiytr.R;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
class TimePickerView extends ConstraintLayout {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f744t = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Chip f745s;

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j jVar = new j(this);
        LayoutInflater.from(context).inflate(R.NP_MANAGER11.NP_MANAGER, this);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.NP_MANAGER8.NP_MANAGER);
        materialButtonToggleGroup.f600k.add(new i());
        Chip chip = (Chip) findViewById(R.NP_MANAGER8.NP_MANAGER);
        Chip chip2 = (Chip) findViewById(R.NP_MANAGER8.NP_MANAGER);
        this.f745s = chip2;
        l lVar = new l(new GestureDetector(getContext(), new k(this)));
        chip.setOnTouchListener(lVar);
        chip2.setOnTouchListener(lVar);
        chip.setTag(R.NP_MANAGER8.NP_MANAGER, 12);
        chip2.setTag(R.NP_MANAGER8.NP_MANAGER, 10);
        chip.setOnClickListener(jVar);
        chip2.setOnClickListener(jVar);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        if (view == this && i2 == 0) {
            this.f745s.sendAccessibilityEvent(8);
        }
    }
}
