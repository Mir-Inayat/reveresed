package i1;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.emoji2.text.n;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.redhand.laugiytr.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeMap;
import o1.k;
import org.xmlpull.v1.XmlPullParserException;
import t1.a0;
import t1.b0;
import t1.c0;
import t1.d0;
import t1.e0;
import t1.o;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public abstract class f extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f1391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f1392b;
    public final n c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f1393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Integer[] f1394e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a0 f1395f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c0 f1396g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1397h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e0 f1398i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1399j;

    /* JADX WARN: Type inference failed for: r13v5, types: [i1.e] */
    public f(Context context, AttributeSet attributeSet) {
        a0 a0VarB;
        XmlResourceParser xml;
        int next;
        e0 e0Var;
        int next2;
        super(x1.a.a(context, attributeSet, R.NP_MANAGER3.NP_MANAGER, R.NP_MANAGER15.NP_MANAGER), attributeSet, R.NP_MANAGER3.NP_MANAGER);
        this.f1391a = new ArrayList();
        this.f1392b = new ArrayList();
        final MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this;
        this.c = new n(14, materialButtonToggleGroup);
        this.f1393d = new Comparator() { // from class: i1.e
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int iCompareTo = Boolean.valueOf(materialButton.f588o).compareTo(Boolean.valueOf(materialButton2.f588o));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                if (iCompareTo2 != 0) {
                    return iCompareTo2;
                }
                MaterialButtonToggleGroup materialButtonToggleGroup2 = materialButtonToggleGroup;
                return Integer.compare(materialButtonToggleGroup2.indexOfChild(materialButton), materialButtonToggleGroup2.indexOfChild(materialButton2));
            }
        };
        this.f1399j = true;
        Context context2 = getContext();
        TypedArray typedArrayE = k.e(context2, attributeSet, c1.a.f500j, R.NP_MANAGER3.NP_MANAGER, R.NP_MANAGER15.NP_MANAGER, new int[0]);
        if (typedArrayE.hasValue(2)) {
            int resourceId = typedArrayE.getResourceId(2, 0);
            if (resourceId != 0 && context2.getResources().getResourceTypeName(resourceId).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId);
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                    e0Var = null;
                }
                try {
                    e0Var = new e0();
                    e0Var.c = new int[10][];
                    e0Var.f2183d = new n[10];
                    AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                    do {
                        next2 = xml.next();
                        if (next2 == 2) {
                            break;
                        }
                    } while (next2 != 1);
                    if (next2 != 2) {
                        throw new XmlPullParserException("No start tag found");
                    }
                    if (xml.getName().equals("selector")) {
                        e0Var.a(context2, xml, attributeSetAsAttributeSet, context2.getTheme());
                    }
                    xml.close();
                    this.f1398i = e0Var;
                } finally {
                }
            } else {
                e0Var = null;
                this.f1398i = e0Var;
            }
        }
        if (typedArrayE.hasValue(4)) {
            c0 c0VarB = c0.b(context2, typedArrayE, 4);
            this.f1396g = c0VarB;
            if (c0VarB == null) {
                b0 b0Var = new b0(o.a(context2, typedArrayE.getResourceId(4, 0), typedArrayE.getResourceId(5, 0), new t1.a(0)).a());
                this.f1396g = b0Var.f2159a != 0 ? new c0(b0Var) : null;
            }
        }
        if (typedArrayE.hasValue(3)) {
            t1.a aVar = new t1.a(0.0f);
            int resourceId2 = typedArrayE.getResourceId(3, 0);
            if (resourceId2 != 0 && context2.getResources().getResourceTypeName(resourceId2).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId2);
                    try {
                        a0VarB = new a0();
                        AttributeSet attributeSetAsAttributeSet2 = Xml.asAttributeSet(xml);
                        do {
                            next = xml.next();
                            if (next == 2) {
                                break;
                            }
                        } while (next != 1);
                        if (next != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        if (xml.getName().equals("selector")) {
                            a0VarB.d(context2, xml, attributeSetAsAttributeSet2, context2.getTheme());
                        }
                        xml.close();
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused2) {
                    a0VarB = a0.b(aVar);
                }
            } else {
                a0VarB = a0.b(o.c(typedArrayE, 3, aVar));
            }
            this.f1395f = a0VarB;
        }
        this.f1397h = typedArrayE.getDimensionPixelSize(1, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayE.getBoolean(0, true));
        typedArrayE.recycle();
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (c(i2)) {
                return i2;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    public final void a() {
        int iMin;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i2 = firstVisibleChildIndex + 1; i2 < getChildCount(); i2++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i2);
            MaterialButton materialButton2 = (MaterialButton) getChildAt(i2 - 1);
            if (this.f1397h <= 0) {
                iMin = Math.min(materialButton.getStrokeWidth(), materialButton2.getStrokeWidth());
                materialButton.setShouldDrawSurfaceColorStroke(true);
                materialButton2.setShouldDrawSurfaceColorStroke(true);
            } else {
                materialButton.setShouldDrawSurfaceColorStroke(false);
                materialButton2.setShouldDrawSurfaceColorStroke(false);
                iMin = 0;
            }
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(this.f1397h - iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = this.f1397h - iMin;
                layoutParams2.setMarginStart(0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonGroup", "Child views must be of type MaterialButton.");
            return;
        }
        d();
        this.f1399j = true;
        super.addView(view, i2, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.c);
        this.f1391a.add(materialButton.getShapeAppearanceModel());
        this.f1392b.add(materialButton.getStateListShapeAppearanceModel());
        materialButton.setEnabled(isEnabled());
    }

    public final void b() {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        float fMax;
        if (this.f1398i == null || getChildCount() == 0) {
            return;
        }
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        int iMin = Integer.MAX_VALUE;
        for (int i2 = firstVisibleChildIndex; i2 <= lastVisibleChildIndex; i2++) {
            if (c(i2)) {
                if (c(i2) && this.f1398i != null) {
                    MaterialButton materialButton3 = (MaterialButton) getChildAt(i2);
                    e0 e0Var = this.f1398i;
                    int width = materialButton3.getWidth();
                    int i3 = -width;
                    for (int i4 = 0; i4 < e0Var.f2181a; i4++) {
                        d0 d0Var = (d0) e0Var.f2183d[i4].f244b;
                        int i5 = d0Var.f2174a;
                        float f3 = d0Var.f2175b;
                        if (i5 == 2) {
                            fMax = Math.max(i3, f3);
                        } else if (i5 == 1) {
                            fMax = Math.max(i3, width * f3);
                        }
                        i3 = (int) fMax;
                    }
                    int iMax = Math.max(0, i3);
                    int i6 = i2 - 1;
                    while (true) {
                        materialButton = null;
                        if (i6 < 0) {
                            materialButton2 = null;
                            break;
                        } else {
                            if (c(i6)) {
                                materialButton2 = (MaterialButton) getChildAt(i6);
                                break;
                            }
                            i6--;
                        }
                    }
                    int allowedWidthDecrease = materialButton2 == null ? 0 : materialButton2.getAllowedWidthDecrease();
                    int childCount = getChildCount();
                    int i7 = i2 + 1;
                    while (true) {
                        if (i7 >= childCount) {
                            break;
                        }
                        if (c(i7)) {
                            materialButton = (MaterialButton) getChildAt(i7);
                            break;
                        }
                        i7++;
                    }
                    iMin = Math.min(iMax, allowedWidthDecrease + (materialButton != null ? materialButton.getAllowedWidthDecrease() : 0));
                }
                if (i2 != firstVisibleChildIndex && i2 != lastVisibleChildIndex) {
                    iMin /= 2;
                }
                iMin = Math.min(iMin, iMin);
            }
        }
        int i8 = firstVisibleChildIndex;
        while (i8 <= lastVisibleChildIndex) {
            if (c(i8)) {
                ((MaterialButton) getChildAt(i8)).setSizeChange(this.f1398i);
                ((MaterialButton) getChildAt(i8)).setWidthChangeMax((i8 == firstVisibleChildIndex || i8 == lastVisibleChildIndex) ? iMin : iMin * 2);
            }
            i8++;
        }
    }

    public final boolean c(int i2) {
        return getChildAt(i2).getVisibility() != 8;
    }

    public final void d() {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i2);
            LinearLayout.LayoutParams layoutParams = materialButton.f595v;
            if (layoutParams != null) {
                materialButton.setLayoutParams(layoutParams);
                materialButton.f595v = null;
                materialButton.f592s = -1.0f;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f1393d);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            treeMap.put((MaterialButton) getChildAt(i2), Integer.valueOf(i2));
        }
        this.f1394e = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        b0 b0Var;
        int i2;
        if (!(this.f1395f == null && this.f1396g == null) && this.f1399j) {
            this.f1399j = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i3 = 0;
            while (i3 < childCount) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i3);
                if (materialButton.getVisibility() != 8) {
                    boolean z = i3 == firstVisibleChildIndex;
                    boolean z2 = i3 == lastVisibleChildIndex;
                    c0 c0Var = this.f1396g;
                    if (c0Var == null || (!z && !z2)) {
                        c0Var = (c0) this.f1392b.get(i3);
                    }
                    if (c0Var == null) {
                        b0Var = new b0((o) this.f1391a.get(i3));
                    } else {
                        b0 b0Var2 = new b0();
                        int i4 = c0Var.f2167a;
                        b0Var2.f2159a = i4;
                        b0Var2.f2160b = c0Var.f2168b;
                        int[][] iArr = c0Var.c;
                        int[][] iArr2 = new int[iArr.length][];
                        b0Var2.c = iArr2;
                        o[] oVarArr = c0Var.f2169d;
                        b0Var2.f2161d = new o[oVarArr.length];
                        System.arraycopy(iArr, 0, iArr2, 0, i4);
                        System.arraycopy(oVarArr, 0, b0Var2.f2161d, 0, b0Var2.f2159a);
                        b0Var2.f2162e = c0Var.f2170e;
                        b0Var2.f2163f = c0Var.f2171f;
                        b0Var2.f2164g = c0Var.f2172g;
                        b0Var2.f2165h = c0Var.f2173h;
                        b0Var = b0Var2;
                    }
                    boolean z3 = getOrientation() == 0;
                    boolean z4 = getLayoutDirection() == 1;
                    if (z3) {
                        i2 = z ? 5 : 0;
                        if (z2) {
                            i2 |= 10;
                        }
                        if (z4) {
                            i2 = ((i2 & 10) >> 1) | ((i2 & 5) << 1);
                        }
                    } else {
                        i2 = z ? 3 : 0;
                        if (z2) {
                            i2 |= 12;
                        }
                    }
                    int i5 = ~i2;
                    a0 a0Var = this.f1395f;
                    if ((i5 | 1) == i5) {
                        b0Var.f2162e = a0Var;
                    }
                    if ((i5 | 2) == i5) {
                        b0Var.f2163f = a0Var;
                    }
                    if ((i5 | 4) == i5) {
                        b0Var.f2164g = a0Var;
                    }
                    if ((i5 | 8) == i5) {
                        b0Var.f2165h = a0Var;
                    }
                    c0 c0Var2 = b0Var.f2159a == 0 ? null : new c0(b0Var);
                    if (c0Var2.d()) {
                        materialButton.setStateListShapeAppearanceModel(c0Var2);
                    } else {
                        materialButton.setShapeAppearanceModel(c0Var2.c());
                    }
                }
                i3++;
            }
        }
    }

    public e0 getButtonSizeChange() {
        return this.f1398i;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i2, int i3) {
        Integer[] numArr = this.f1394e;
        if (numArr != null && i3 < numArr.length) {
            return numArr[i3].intValue();
        }
        Log.w("MButtonGroup", "Child order wasn't updated");
        return i3;
    }

    public t1.d getInnerCornerSize() {
        return this.f1395f.f2155b;
    }

    public a0 getInnerCornerSizeStateList() {
        return this.f1395f;
    }

    public o getShapeAppearance() {
        c0 c0Var = this.f1396g;
        if (c0Var == null) {
            return null;
        }
        return c0Var.c();
    }

    public int getSpacing() {
        return this.f1397h;
    }

    public c0 getStateListShapeAppearance() {
        return this.f1396g;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (z) {
            d();
            b();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        e();
        a();
        super.onMeasure(i2, i3);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f1391a.remove(iIndexOfChild);
            this.f1392b.remove(iIndexOfChild);
        }
        this.f1399j = true;
        e();
        d();
        a();
    }

    public void setButtonSizeChange(e0 e0Var) {
        if (this.f1398i != e0Var) {
            this.f1398i = e0Var;
            b();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            ((MaterialButton) getChildAt(i2)).setEnabled(z);
        }
    }

    public void setInnerCornerSize(t1.d dVar) {
        this.f1395f = a0.b(dVar);
        this.f1399j = true;
        e();
        invalidate();
    }

    public void setInnerCornerSizeStateList(a0 a0Var) {
        this.f1395f = a0Var;
        this.f1399j = true;
        e();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i2) {
        if (getOrientation() != i2) {
            this.f1399j = true;
        }
        super.setOrientation(i2);
    }

    public void setShapeAppearance(o oVar) {
        b0 b0Var = new b0(oVar);
        this.f1396g = b0Var.f2159a == 0 ? null : new c0(b0Var);
        this.f1399j = true;
        e();
        invalidate();
    }

    public void setSpacing(int i2) {
        this.f1397h = i2;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(c0 c0Var) {
        this.f1396g = c0Var;
        this.f1399j = true;
        e();
        invalidate();
    }
}
