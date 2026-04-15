package com.google.android.material.button;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.emoji2.text.u;
import f.p;
import i1.b;
import i1.c;
import i1.d;
import i1.f;
import i1.g;
import java.util.Iterator;
import java.util.LinkedHashSet;
import n0.e;
import o1.k;
import t1.c0;
import t1.e0;
import t1.n;
import t1.o;
import t1.z;
import x1.a;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class MaterialButton extends p implements Checkable, z {
    public static final int[] F = {R.attr.state_checkable};
    public static final int[] G = {R.attr.state_checked};
    public static final b H = new b();
    public e0 A;
    public int B;
    public float C;
    public float D;
    public e E;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f578e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f579f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f580g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ColorStateList f581h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Drawable f582i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f583j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f584k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f585l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f586m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f587n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f588o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f589p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f590q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f591r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f592s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f593t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f594u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public LinearLayout.LayoutParams f595v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f596w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f597x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f598y;
    public int z;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(a.b(context, attributeSet, com.redhand.laugiytr.R.NP_MANAGER3.NP_MANAGER, com.redhand.laugiytr.R.NP_MANAGER15.NP_MANAGER, new int[]{com.redhand.laugiytr.R.NP_MANAGER3.NP_MANAGER}), attributeSet);
        this.f578e = new LinkedHashSet();
        this.f588o = false;
        this.f589p = false;
        this.f591r = -1;
        this.f592s = -1.0f;
        this.f593t = -1;
        this.f594u = -1;
        this.z = -1;
        Context context2 = getContext();
        TypedArray typedArrayE = k.e(context2, attributeSet, c1.a.f499i, com.redhand.laugiytr.R.NP_MANAGER3.NP_MANAGER, com.redhand.laugiytr.R.NP_MANAGER15.NP_MANAGER, new int[0]);
        this.f587n = typedArrayE.getDimensionPixelSize(13, 0);
        int i2 = typedArrayE.getInt(16, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f580g = k.f(i2, mode);
        this.f581h = a0.a.o(getContext(), typedArrayE, 15);
        this.f582i = a0.a.s(getContext(), typedArrayE, 11);
        this.f590q = typedArrayE.getInteger(12, 1);
        this.f584k = typedArrayE.getDimensionPixelSize(14, 0);
        c0 c0VarB = c0.b(context2, typedArrayE, 19);
        o oVarC = c0VarB != null ? c0VarB.c() : o.b(context2, attributeSet, com.redhand.laugiytr.R.NP_MANAGER3.NP_MANAGER, com.redhand.laugiytr.R.NP_MANAGER15.NP_MANAGER).a();
        boolean z = typedArrayE.getBoolean(17, false);
        g gVar = new g(this, oVarC);
        this.f577d = gVar;
        gVar.f1404f = typedArrayE.getDimensionPixelOffset(2, 0);
        gVar.f1405g = typedArrayE.getDimensionPixelOffset(3, 0);
        gVar.f1406h = typedArrayE.getDimensionPixelOffset(4, 0);
        gVar.f1407i = typedArrayE.getDimensionPixelOffset(5, 0);
        if (typedArrayE.hasValue(9)) {
            int dimensionPixelSize = typedArrayE.getDimensionPixelSize(9, -1);
            gVar.f1408j = dimensionPixelSize;
            float f3 = dimensionPixelSize;
            n nVarF = gVar.f1401b.f();
            nVarF.f2232e = new t1.a(f3);
            nVarF.f2233f = new t1.a(f3);
            nVarF.f2234g = new t1.a(f3);
            nVarF.f2235h = new t1.a(f3);
            gVar.f1401b = nVarF.a();
            gVar.c = null;
            gVar.d();
            gVar.f1417s = true;
        }
        gVar.f1409k = typedArrayE.getDimensionPixelSize(22, 0);
        gVar.f1410l = k.f(typedArrayE.getInt(8, -1), mode);
        gVar.f1411m = a0.a.o(getContext(), typedArrayE, 7);
        gVar.f1412n = a0.a.o(getContext(), typedArrayE, 21);
        gVar.f1413o = a0.a.o(getContext(), typedArrayE, 18);
        gVar.f1418t = typedArrayE.getBoolean(6, false);
        gVar.f1421w = typedArrayE.getDimensionPixelSize(10, 0);
        gVar.f1419u = typedArrayE.getBoolean(23, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayE.hasValue(0)) {
            gVar.f1416r = true;
            setSupportBackgroundTintList(gVar.f1411m);
            setSupportBackgroundTintMode(gVar.f1410l);
        } else {
            gVar.c();
        }
        setPaddingRelative(paddingStart + gVar.f1404f, paddingTop + gVar.f1406h, paddingEnd + gVar.f1405g, paddingBottom + gVar.f1407i);
        setCheckedInternal(typedArrayE.getBoolean(1, false));
        if (c0VarB != null) {
            gVar.f1402d = d();
            if (gVar.c != null) {
                gVar.d();
            }
            gVar.c = c0VarB;
            gVar.d();
        }
        setOpticalCenterEnabled(z);
        typedArrayE.recycle();
        setCompoundDrawablePadding(this.f587n);
        h(this.f582i != null);
    }

    public static /* synthetic */ void a(MaterialButton materialButton) {
        materialButton.f597x = materialButton.getOpticalCenterShift();
        materialButton.j();
        materialButton.invalidate();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayedWidthIncrease() {
        return this.C;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        t1.k kVarA;
        if (this.f596w && this.f598y && (kVarA = this.f577d.a(false)) != null) {
            return (int) (kVarA.h() * 0.11f);
        }
        return 0;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i2 = 0; i2 < lineCount; i2++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i2));
        }
        return (int) Math.ceil(fMax);
    }

    private void setCheckedInternal(boolean z) {
        g gVar = this.f577d;
        if (gVar == null || !gVar.f1418t || this.f588o == z) {
            return;
        }
        this.f588o = z;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z2 = this.f588o;
            if (!materialButtonToggleGroup.f601l) {
                materialButtonToggleGroup.f(getId(), z2);
            }
        }
        if (this.f589p) {
            return;
        }
        this.f589p = true;
        Iterator it = this.f578e.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.f589p = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedWidthIncrease(float f3) {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        if (this.C != f3) {
            this.C = f3;
            j();
            invalidate();
            if (getParent() instanceof f) {
                f fVar = (f) getParent();
                int i2 = (int) this.C;
                int iIndexOfChild = fVar.indexOfChild(this);
                if (iIndexOfChild < 0) {
                    return;
                }
                int i3 = iIndexOfChild - 1;
                while (true) {
                    materialButton = null;
                    if (i3 < 0) {
                        materialButton2 = null;
                        break;
                    } else {
                        if (fVar.c(i3)) {
                            materialButton2 = (MaterialButton) fVar.getChildAt(i3);
                            break;
                        }
                        i3--;
                    }
                }
                int childCount = fVar.getChildCount();
                while (true) {
                    iIndexOfChild++;
                    if (iIndexOfChild >= childCount) {
                        break;
                    } else if (fVar.c(iIndexOfChild)) {
                        materialButton = (MaterialButton) fVar.getChildAt(iIndexOfChild);
                        break;
                    }
                }
                if (materialButton2 == null && materialButton == null) {
                    return;
                }
                if (materialButton2 == null) {
                    materialButton.setDisplayedWidthDecrease(i2);
                }
                if (materialButton == null) {
                    materialButton2.setDisplayedWidthDecrease(i2);
                }
                if (materialButton2 == null || materialButton == null) {
                    return;
                }
                materialButton2.setDisplayedWidthDecrease(i2 / 2);
                materialButton.setDisplayedWidthDecrease((i2 + 1) / 2);
            }
        }
    }

    public final n0.f d() {
        Context context = getContext();
        TypedValue typedValueZ = a0.a.Z(context, com.redhand.laugiytr.R.NP_MANAGER3.NP_MANAGER);
        int[] iArr = c1.a.f504n;
        TypedArray typedArrayObtainStyledAttributes = typedValueZ == null ? context.obtainStyledAttributes(null, iArr, 0, com.redhand.laugiytr.R.NP_MANAGER15.NP_MANAGER) : context.obtainStyledAttributes(typedValueZ.resourceId, iArr);
        n0.f fVar = new n0.f();
        try {
            float f3 = typedArrayObtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f3 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f4 = typedArrayObtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
            if (f4 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            if (f3 <= 0.0f) {
                throw new IllegalArgumentException("Spring stiffness constant must be positive.");
            }
            fVar.f1742a = Math.sqrt(f3);
            fVar.c = false;
            if (f4 < 0.0f) {
                throw new IllegalArgumentException("Damping ratio must be non-negative");
            }
            fVar.f1743b = f4;
            fVar.c = false;
            typedArrayObtainStyledAttributes.recycle();
            return fVar;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final boolean e() {
        g gVar = this.f577d;
        return (gVar == null || gVar.f1416r) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(boolean r9) {
        /*
            r8 = this;
            t1.e0 r0 = r8.A
            if (r0 != 0) goto L6
            goto L85
        L6:
            n0.e r0 = r8.E
            if (r0 != 0) goto L19
            n0.e r0 = new n0.e
            i1.b r1 = com.google.android.material.button.MaterialButton.H
            r0.<init>(r8, r1)
            r8.E = r0
            n0.f r1 = r8.d()
            r0.f1739j = r1
        L19:
            boolean r0 = r8.f598y
            if (r0 == 0) goto L85
            int r0 = r8.B
            t1.e0 r1 = r8.A
            int[] r2 = r8.getDrawableState()
            int[][] r3 = r1.c
            r4 = 0
            r5 = r4
        L29:
            int r6 = r1.f2181a
            r7 = -1
            if (r5 >= r6) goto L3a
            r6 = r3[r5]
            boolean r6 = android.util.StateSet.stateSetMatches(r6, r2)
            if (r6 == 0) goto L37
            goto L3b
        L37:
            int r5 = r5 + 1
            goto L29
        L3a:
            r5 = r7
        L3b:
            if (r5 >= 0) goto L54
            int[] r2 = android.util.StateSet.WILD_CARD
            int[][] r3 = r1.c
            r5 = r4
        L42:
            int r6 = r1.f2181a
            if (r5 >= r6) goto L53
            r6 = r3[r5]
            boolean r6 = android.util.StateSet.stateSetMatches(r6, r2)
            if (r6 == 0) goto L50
            r7 = r5
            goto L53
        L50:
            int r5 = r5 + 1
            goto L42
        L53:
            r5 = r7
        L54:
            if (r5 >= 0) goto L59
            androidx.emoji2.text.n r1 = r1.f2182b
            goto L5d
        L59:
            androidx.emoji2.text.n[] r1 = r1.f2183d
            r1 = r1[r5]
        L5d:
            java.lang.Object r1 = r1.f244b
            t1.d0 r1 = (t1.d0) r1
            int r2 = r8.getWidth()
            float r3 = r1.f2175b
            int r1 = r1.f2174a
            r5 = 1
            if (r1 != r5) goto L70
            float r1 = (float) r2
            float r3 = r3 * r1
        L6e:
            int r4 = (int) r3
            goto L74
        L70:
            r2 = 2
            if (r1 != r2) goto L74
            goto L6e
        L74:
            int r0 = java.lang.Math.min(r0, r4)
            n0.e r1 = r8.E
            float r0 = (float) r0
            r1.a(r0)
            if (r9 == 0) goto L85
            n0.e r9 = r8.E
            r9.d()
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.f(boolean):void");
    }

    public final void g() {
        int i2 = this.f590q;
        if (i2 == 1 || i2 == 2) {
            setCompoundDrawablesRelative(this.f582i, null, null, null);
            return;
        }
        if (i2 == 3 || i2 == 4) {
            setCompoundDrawablesRelative(null, null, this.f582i, null);
        } else if (i2 == 16 || i2 == 32) {
            setCompoundDrawablesRelative(null, this.f582i, null, null);
        }
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.f583j)) {
            return this.f583j;
        }
        g gVar = this.f577d;
        return ((gVar == null || !gVar.f1418t) ? Button.class : CompoundButton.class).getName();
    }

    public int getAllowedWidthDecrease() {
        return this.z;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (e()) {
            return this.f577d.f1408j;
        }
        return 0;
    }

    public n0.f getCornerSpringForce() {
        return this.f577d.f1402d;
    }

    public Drawable getIcon() {
        return this.f582i;
    }

    public int getIconGravity() {
        return this.f590q;
    }

    public int getIconPadding() {
        return this.f587n;
    }

    public int getIconSize() {
        return this.f584k;
    }

    public ColorStateList getIconTint() {
        return this.f581h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f580g;
    }

    public int getInsetBottom() {
        return this.f577d.f1407i;
    }

    public int getInsetTop() {
        return this.f577d.f1406h;
    }

    public ColorStateList getRippleColor() {
        if (e()) {
            return this.f577d.f1413o;
        }
        return null;
    }

    public o getShapeAppearanceModel() {
        if (e()) {
            return this.f577d.f1401b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public c0 getStateListShapeAppearanceModel() {
        if (e()) {
            return this.f577d.c;
        }
        throw new IllegalStateException("Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (e()) {
            return this.f577d.f1412n;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (e()) {
            return this.f577d.f1409k;
        }
        return 0;
    }

    @Override // f.p
    public ColorStateList getSupportBackgroundTintList() {
        return e() ? this.f577d.f1411m : super.getSupportBackgroundTintList();
    }

    @Override // f.p
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return e() ? this.f577d.f1410l : super.getSupportBackgroundTintMode();
    }

    public final void h(boolean z) {
        Drawable drawable = this.f582i;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f582i = drawableMutate;
            drawableMutate.setTintList(this.f581h);
            PorterDuff.Mode mode = this.f580g;
            if (mode != null) {
                this.f582i.setTintMode(mode);
            }
            int intrinsicWidth = this.f584k;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f582i.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f584k;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f582i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f582i;
            int i2 = this.f585l;
            int i3 = this.f586m;
            drawable2.setBounds(i2, i3, intrinsicWidth + i2, intrinsicHeight + i3);
            this.f582i.setVisible(true, z);
        }
        if (z) {
            g();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i4 = this.f590q;
        if (((i4 == 1 || i4 == 2) && drawable3 != this.f582i) || (((i4 == 3 || i4 == 4) && drawable5 != this.f582i) || ((i4 == 16 || i4 == 32) && drawable4 != this.f582i))) {
            g();
        }
    }

    public final void i(int i2, int i3) {
        if (this.f582i == null || getLayout() == null) {
            return;
        }
        int i4 = this.f590q;
        if (i4 != 1 && i4 != 2 && i4 != 3 && i4 != 4) {
            if (i4 == 16 || i4 == 32) {
                this.f585l = 0;
                if (i4 == 16) {
                    this.f586m = 0;
                    h(false);
                    return;
                }
                int intrinsicHeight = this.f584k;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f582i.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i3 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f587n) - getPaddingBottom()) / 2);
                if (this.f586m != iMax) {
                    this.f586m = iMax;
                    h(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f586m = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i5 = this.f590q;
        if (i5 == 1 || i5 == 3 || ((i5 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i5 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f585l = 0;
            h(false);
            return;
        }
        int intrinsicWidth = this.f584k;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f582i.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i2 - getTextLayoutWidth()) - getPaddingEnd()) - intrinsicWidth) - this.f587n) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.f590q == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.f585l != textLayoutWidth) {
            this.f585l = textLayoutWidth;
            h(false);
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f588o;
    }

    public final void j() {
        int i2 = (int) (this.C - this.D);
        int i3 = (i2 / 2) + this.f597x;
        getLayoutParams().width = (int) (this.f592s + i2);
        setPaddingRelative(this.f593t + i3, getPaddingTop(), (this.f594u + i2) - i3, getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (e()) {
            t1.e.L(this, this.f577d.a(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        g gVar = this.f577d;
        if (gVar != null && gVar.f1418t) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, F);
        }
        if (this.f588o) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, G);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // f.p, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f588o);
    }

    @Override // f.p, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        g gVar = this.f577d;
        accessibilityNodeInfo.setCheckable(gVar != null && gVar.f1418t);
        accessibilityNodeInfo.setChecked(this.f588o);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // f.p, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        super.onLayout(z, i2, i3, i4, i5);
        i(getMeasuredWidth(), getMeasuredHeight());
        int i7 = getResources().getConfiguration().orientation;
        if (this.f591r != i7) {
            this.f591r = i7;
            this.f592s = -1.0f;
        }
        if (this.f592s == -1.0f) {
            this.f592s = getMeasuredWidth();
            if (this.f595v == null && (getParent() instanceof f) && ((f) getParent()).getButtonSizeChange() != null) {
                this.f595v = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f595v);
                layoutParams.width = (int) this.f592s;
                setLayoutParams(layoutParams);
            }
        }
        boolean z2 = false;
        if (this.z == -1) {
            if (this.f582i == null) {
                i6 = 0;
            } else {
                int iconPadding = getIconPadding();
                int intrinsicWidth = this.f584k;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = this.f582i.getIntrinsicWidth();
                }
                i6 = iconPadding + intrinsicWidth;
            }
            this.z = (getMeasuredWidth() - getTextLayoutWidth()) - i6;
        }
        if (this.f593t == -1) {
            this.f593t = getPaddingStart();
        }
        if (this.f594u == -1) {
            this.f594u = getPaddingEnd();
        }
        if ((getParent() instanceof f) && ((f) getParent()).getOrientation() == 0) {
            z2 = true;
        }
        this.f598y = z2;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.f1560a);
        setChecked(dVar.c);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.c = this.f588o;
        return dVar;
    }

    @Override // f.p, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (isEnabled() && this.f577d.f1419u) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f582i != null) {
            if (this.f582i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f583j = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        if (!e()) {
            super.setBackgroundColor(i2);
            return;
        }
        g gVar = this.f577d;
        if (gVar.a(false) != null) {
            gVar.a(false).setTint(i2);
        }
    }

    @Override // f.p, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!e()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        g gVar = this.f577d;
        gVar.f1416r = true;
        MaterialButton materialButton = gVar.f1400a;
        materialButton.setSupportBackgroundTintList(gVar.f1411m);
        materialButton.setSupportBackgroundTintMode(gVar.f1410l);
        super.setBackgroundDrawable(drawable);
    }

    @Override // f.p, android.view.View
    public void setBackgroundResource(int i2) {
        setBackgroundDrawable(i2 != 0 ? a0.a.r(getContext(), i2) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (e()) {
            this.f577d.f1418t = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedInternal(z);
    }

    public void setCornerRadius(int i2) {
        if (e()) {
            g gVar = this.f577d;
            if (gVar.f1417s && gVar.f1408j == i2) {
                return;
            }
            gVar.f1408j = i2;
            gVar.f1417s = true;
            float f3 = i2;
            n nVarF = gVar.f1401b.f();
            nVarF.f2232e = new t1.a(f3);
            nVarF.f2233f = new t1.a(f3);
            nVarF.f2234g = new t1.a(f3);
            nVarF.f2235h = new t1.a(f3);
            gVar.f1401b = nVarF.a();
            gVar.c = null;
            gVar.d();
        }
    }

    public void setCornerRadiusResource(int i2) {
        if (e()) {
            setCornerRadius(getResources().getDimensionPixelSize(i2));
        }
    }

    public void setCornerSpringForce(n0.f fVar) {
        g gVar = this.f577d;
        gVar.f1402d = fVar;
        if (gVar.c != null) {
            gVar.d();
        }
    }

    public void setDisplayedWidthDecrease(int i2) {
        this.D = Math.min(i2, this.z);
        j();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        if (e()) {
            this.f577d.a(false).m(f3);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f582i != drawable) {
            this.f582i = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i2) {
        if (this.f590q != i2) {
            this.f590q = i2;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i2) {
        if (this.f587n != i2) {
            this.f587n = i2;
            setCompoundDrawablePadding(i2);
        }
    }

    public void setIconResource(int i2) {
        setIcon(i2 != 0 ? a0.a.r(getContext(), i2) : null);
    }

    public void setIconSize(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f584k != i2) {
            this.f584k = i2;
            h(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f581h != colorStateList) {
            this.f581h = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f580g != mode) {
            this.f580g = mode;
            h(false);
        }
    }

    public void setIconTintResource(int i2) {
        setIconTint(t1.e.s(getContext(), i2));
    }

    public void setInsetBottom(int i2) {
        g gVar = this.f577d;
        gVar.b(gVar.f1406h, i2);
    }

    public void setInsetTop(int i2) {
        g gVar = this.f577d;
        gVar.b(i2, gVar.f1407i);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(c cVar) {
        this.f579f = cVar;
    }

    public void setOpticalCenterEnabled(boolean z) {
        if (this.f596w != z) {
            this.f596w = z;
            g gVar = this.f577d;
            if (z) {
                i1.a aVar = new i1.a(this);
                gVar.f1403e = aVar;
                t1.k kVarA = gVar.a(false);
                if (kVarA != null) {
                    kVarA.D = aVar;
                }
            } else {
                gVar.f1403e = null;
                t1.k kVarA2 = gVar.a(false);
                if (kVarA2 != null) {
                    kVarA2.D = null;
                }
            }
            post(new u(2, this));
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        c cVar = this.f579f;
        if (cVar != null) {
            ((MaterialButtonToggleGroup) ((androidx.emoji2.text.n) cVar).f244b).invalidate();
        }
        super.setPressed(z);
        f(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (e()) {
            g gVar = this.f577d;
            MaterialButton materialButton = gVar.f1400a;
            if (gVar.f1413o != colorStateList) {
                gVar.f1413o = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(r1.a.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i2) {
        if (e()) {
            setRippleColor(t1.e.s(getContext(), i2));
        }
    }

    @Override // t1.z
    public void setShapeAppearanceModel(o oVar) {
        if (!e()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        g gVar = this.f577d;
        gVar.f1401b = oVar;
        gVar.c = null;
        gVar.d();
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (e()) {
            g gVar = this.f577d;
            gVar.f1415q = z;
            gVar.e();
        }
    }

    public void setSizeChange(e0 e0Var) {
        if (this.A != e0Var) {
            this.A = e0Var;
            f(true);
        }
    }

    public void setStateListShapeAppearanceModel(c0 c0Var) {
        if (!e()) {
            throw new IllegalStateException("Attempted to set StateListShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        g gVar = this.f577d;
        if (gVar.f1402d == null && c0Var.d()) {
            gVar.f1402d = d();
            if (gVar.c != null) {
                gVar.d();
            }
        }
        gVar.c = c0Var;
        gVar.d();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (e()) {
            g gVar = this.f577d;
            if (gVar.f1412n != colorStateList) {
                gVar.f1412n = colorStateList;
                gVar.e();
            }
        }
    }

    public void setStrokeColorResource(int i2) {
        if (e()) {
            setStrokeColor(t1.e.s(getContext(), i2));
        }
    }

    public void setStrokeWidth(int i2) {
        if (e()) {
            g gVar = this.f577d;
            if (gVar.f1409k != i2) {
                gVar.f1409k = i2;
                gVar.e();
            }
        }
    }

    public void setStrokeWidthResource(int i2) {
        if (e()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i2));
        }
    }

    @Override // f.p
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!e()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        g gVar = this.f577d;
        if (gVar.f1411m != colorStateList) {
            gVar.f1411m = colorStateList;
            if (gVar.a(false) != null) {
                gVar.a(false).setTintList(gVar.f1411m);
            }
        }
    }

    @Override // f.p
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!e()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        g gVar = this.f577d;
        if (gVar.f1410l != mode) {
            gVar.f1410l = mode;
            if (gVar.a(false) == null || gVar.f1410l == null) {
                return;
            }
            gVar.a(false).setTintMode(gVar.f1410l);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i2) {
        super.setTextAlignment(i2);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.f577d.f1419u = z;
    }

    @Override // android.widget.TextView
    public void setWidth(int i2) {
        this.f592s = -1.0f;
        super.setWidth(i2);
    }

    public void setWidthChangeMax(int i2) {
        if (this.B != i2) {
            this.B = i2;
            f(true);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f588o);
    }
}
