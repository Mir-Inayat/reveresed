package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.redhand.laugiytr.R;
import f0.m0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import q.n;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
class ClockFaceView extends h implements f {
    public final c A;
    public final int[] B;
    public final float[] C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final String[] H;
    public float I;
    public final ColorStateList J;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ClockHandView f727v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Rect f728w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final RectF f729x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Rect f730y;
    public final SparseArray z;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f728w = new Rect();
        this.f729x = new RectF();
        this.f730y = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.z = sparseArray;
        this.C = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c1.a.f494d, R.NP_MANAGER3.NP_MANAGER, R.NP_MANAGER15.NP_MANAGER);
        Resources resources = getResources();
        ColorStateList colorStateListO = a0.a.o(context, typedArrayObtainStyledAttributes, 1);
        this.J = colorStateListO;
        LayoutInflater.from(context).inflate(R.NP_MANAGER11.NP_MANAGER, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.NP_MANAGER8.NP_MANAGER);
        this.f727v = clockHandView;
        this.D = resources.getDimensionPixelSize(R.NP_MANAGER6.NP_MANAGER);
        int colorForState = colorStateListO.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListO.getDefaultColor());
        this.B = new int[]{colorForState, colorForState, colorStateListO.getDefaultColor()};
        clockHandView.c.add(this);
        int defaultColor = t1.e.s(context, R.NP_MANAGER5.NP_MANAGER).getDefaultColor();
        ColorStateList colorStateListO2 = a0.a.o(context, typedArrayObtainStyledAttributes, 0);
        setBackgroundColor(colorStateListO2 != null ? colorStateListO2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(false);
        typedArrayObtainStyledAttributes.recycle();
        this.A = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.H = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z = false;
        for (int i2 = 0; i2 < Math.max(this.H.length, size); i2++) {
            TextView textView = (TextView) sparseArray.get(i2);
            if (i2 >= this.H.length) {
                removeView(textView);
                sparseArray.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.NP_MANAGER11.NP_MANAGER, (ViewGroup) this, false);
                    sparseArray.put(i2, textView);
                    addView(textView);
                }
                textView.setText(this.H[i2]);
                textView.setTag(R.NP_MANAGER8.NP_MANAGER, Integer.valueOf(i2));
                int i3 = (i2 / 12) + 1;
                textView.setTag(R.NP_MANAGER8.NP_MANAGER, Integer.valueOf(i3));
                z = i3 > 1 ? true : z;
                m0.j(textView, this.A);
                textView.setTextColor(this.J);
            }
        }
        ClockHandView clockHandView2 = this.f727v;
        if (clockHandView2.f733b && !z) {
            clockHandView2.f743m = 1;
        }
        clockHandView2.f733b = z;
        clockHandView2.invalidate();
        this.E = resources.getDimensionPixelSize(R.NP_MANAGER6.NP_MANAGER);
        this.F = resources.getDimensionPixelSize(R.NP_MANAGER6.NP_MANAGER);
        this.G = resources.getDimensionPixelSize(R.NP_MANAGER6.NP_MANAGER);
    }

    @Override // com.google.android.material.timepicker.h
    public final void m() {
        n nVar = new n();
        nVar.b(this);
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getId() != R.NP_MANAGER8.NP_MANAGER && !"skip".equals(childAt.getTag())) {
                int i3 = (Integer) childAt.getTag(R.NP_MANAGER8.NP_MANAGER);
                if (i3 == null) {
                    i3 = 1;
                }
                if (!map.containsKey(i3)) {
                    map.put(i3, new ArrayList());
                }
                ((List) map.get(i3)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iRound = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f752t * 0.66f) : this.f752t;
            Iterator it = list.iterator();
            float size = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                Integer numValueOf = Integer.valueOf(id);
                HashMap map2 = nVar.c;
                if (!map2.containsKey(numValueOf)) {
                    map2.put(Integer.valueOf(id), new q.i());
                }
                q.j jVar = ((q.i) map2.get(Integer.valueOf(id))).f1970d;
                jVar.f2011y = R.NP_MANAGER8.NP_MANAGER;
                jVar.z = iRound;
                jVar.A = size;
                size += 360.0f / list.size();
            }
        }
        nVar.a(this);
        setConstraintSet(null);
        requestLayout();
        int i4 = 0;
        while (true) {
            SparseArray sparseArray = this.z;
            if (i4 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i4)).setVisibility(0);
            i4++;
        }
    }

    public final void n() {
        SparseArray sparseArray;
        Rect rect;
        RectF rectF;
        RectF rectF2 = this.f727v.f737g;
        float f3 = Float.MAX_VALUE;
        TextView textView = null;
        int i2 = 0;
        while (true) {
            sparseArray = this.z;
            int size = sparseArray.size();
            rect = this.f728w;
            rectF = this.f729x;
            if (i2 >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i2);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float fHeight = rectF.height() * rectF.width();
                if (fHeight < f3) {
                    textView = textView2;
                    f3 = fHeight;
                }
            }
            i2++;
        }
        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
            TextView textView3 = (TextView) sparseArray.get(i3);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.f730y);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.B, this.C, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.H.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        n();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.G / Math.max(Math.max(this.E / displayMetrics.heightPixels, this.F / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }
}
