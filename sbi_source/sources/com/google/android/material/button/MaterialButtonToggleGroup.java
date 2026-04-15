package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.material.timepicker.i;
import com.redhand.laugiytr.R;
import f0.m0;
import i1.f;
import i1.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import o1.k;
import t1.a0;
import x1.a;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class MaterialButtonToggleGroup extends f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f599q = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashSet f600k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f601l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f602m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f603n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f604o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public HashSet f605p;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.NP_MANAGER3.NP_MANAGER, R.NP_MANAGER15.NP_MANAGER), attributeSet);
        this.f600k = new LinkedHashSet();
        this.f601l = false;
        this.f605p = new HashSet();
        TypedArray typedArrayE = k.e(getContext(), attributeSet, c1.a.f501k, R.NP_MANAGER3.NP_MANAGER, R.NP_MANAGER15.NP_MANAGER, new int[0]);
        setSingleSelection(typedArrayE.getBoolean(7, false));
        this.f604o = typedArrayE.getResourceId(2, -1);
        this.f603n = typedArrayE.getBoolean(4, false);
        if (this.f1395f == null) {
            this.f1395f = a0.b(new t1.a(0.0f));
        }
        setEnabled(typedArrayE.getBoolean(0, true));
        typedArrayE.recycle();
        setImportantForAccessibility(1);
    }

    private String getChildrenA11yClassName() {
        return (this.f602m ? RadioButton.class : ToggleButton.class).getName();
    }

    private int getVisibleButtonCount() {
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if ((getChildAt(i3) instanceof MaterialButton) && getChildAt(i3).getVisibility() != 8) {
                i2++;
            }
        }
        return i2;
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setA11yClassName(getChildrenA11yClassName());
    }

    @Override // i1.f, android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i2, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setupButtonChild(materialButton);
        f(materialButton.getId(), materialButton.f588o);
        m0.j(materialButton, new h(this, 0));
    }

    public final void f(int i2, boolean z) {
        if (i2 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i2);
            return;
        }
        HashSet hashSet = new HashSet(this.f605p);
        if (z && !hashSet.contains(Integer.valueOf(i2))) {
            if (this.f602m && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i2));
        } else {
            if (z || !hashSet.contains(Integer.valueOf(i2))) {
                return;
            }
            if (!this.f603n || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i2));
            }
        }
        g(hashSet);
    }

    public final void g(Set set) {
        HashSet hashSet = this.f605p;
        this.f605p = new HashSet(set);
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            int id = ((MaterialButton) getChildAt(i2)).getId();
            boolean zContains = set.contains(Integer.valueOf(id));
            View viewFindViewById = findViewById(id);
            if (viewFindViewById instanceof MaterialButton) {
                this.f601l = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.f601l = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.f600k.iterator();
                while (it.hasNext()) {
                    ((i) it.next()).a();
                }
            }
        }
        invalidate();
    }

    public int getCheckedButtonId() {
        if (!this.f602m || this.f605p.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f605p.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            int id = ((MaterialButton) getChildAt(i2)).getId();
            if (this.f605p.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i2 = this.f604o;
        if (i2 != -1) {
            g(Collections.singleton(Integer.valueOf(i2)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getVisibleButtonCount(), false, this.f602m ? 1 : 2));
    }

    public void setSelectionRequired(boolean z) {
        this.f603n = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.f602m != z) {
            this.f602m = z;
            g(new HashSet());
        }
        String childrenA11yClassName = getChildrenA11yClassName();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            ((MaterialButton) getChildAt(i2)).setA11yClassName(childrenA11yClassName);
        }
    }

    public void setSingleSelection(int i2) {
        setSingleSelection(getResources().getBoolean(i2));
    }
}
