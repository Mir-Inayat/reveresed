package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import d0.g;
import d0.h;
import f.q;
import f0.m0;
import java.lang.ref.WeakReference;
import java.util.Locale;
import k1.b;
import k1.c;
import k1.d;
import k1.e;
import k1.f;
import o1.i;
import o1.k;
import t1.o;
import t1.z;
import x1.a;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class Chip extends q implements e, z, Checkable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Rect f609w = new Rect();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int[] f610x = {R.attr.state_selected};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f611y = {R.attr.state_checkable};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f f612e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InsetDrawable f613f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RippleDrawable f614g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View.OnClickListener f615h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f616i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f617j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f618k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f619l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f620m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f621n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f622o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f623p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f624q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f625r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f626s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Rect f627t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final RectF f628u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final b f629v;

    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        int resourceId3;
        super(a.a(context, attributeSet, com.redhand.laugiytr.R.NP_MANAGER3.NP_MANAGER, com.redhand.laugiytr.R.NP_MANAGER15.NP_MANAGER), attributeSet);
        this.f627t = new Rect();
        this.f628u = new RectF();
        this.f629v = new b(0, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        f fVar = new f(context2, attributeSet);
        Context context3 = fVar.f1502n0;
        int[] iArr = c1.a.c;
        TypedArray typedArrayE = k.e(context3, attributeSet, iArr, com.redhand.laugiytr.R.NP_MANAGER3.NP_MANAGER, com.redhand.laugiytr.R.NP_MANAGER15.NP_MANAGER, new int[0]);
        fVar.N0 = typedArrayE.hasValue(37);
        Context context4 = fVar.f1502n0;
        ColorStateList colorStateListO = a0.a.o(context4, typedArrayE, 24);
        if (fVar.G != colorStateListO) {
            fVar.G = colorStateListO;
            fVar.onStateChange(fVar.getState());
        }
        ColorStateList colorStateListO2 = a0.a.o(context4, typedArrayE, 11);
        if (fVar.H != colorStateListO2) {
            fVar.H = colorStateListO2;
            fVar.onStateChange(fVar.getState());
        }
        float dimension = typedArrayE.getDimension(19, 0.0f);
        if (fVar.I != dimension) {
            fVar.I = dimension;
            fVar.invalidateSelf();
            fVar.A();
        }
        if (typedArrayE.hasValue(12)) {
            fVar.G(typedArrayE.getDimension(12, 0.0f));
        }
        fVar.L(a0.a.o(context4, typedArrayE, 22));
        fVar.M(typedArrayE.getDimension(23, 0.0f));
        fVar.W(a0.a.o(context4, typedArrayE, 36));
        String text = typedArrayE.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(fVar.N, text)) {
            fVar.N = text;
            fVar.f1508t0.f1866d = true;
            fVar.invalidateSelf();
            fVar.A();
        }
        q1.d dVar = (!typedArrayE.hasValue(0) || (resourceId3 = typedArrayE.getResourceId(0, 0)) == 0) ? null : new q1.d(context4, resourceId3);
        dVar.f2071l = typedArrayE.getDimension(1, dVar.f2071l);
        fVar.X(dVar);
        int i2 = typedArrayE.getInt(3, 0);
        if (i2 == 1) {
            fVar.K0 = TextUtils.TruncateAt.START;
        } else if (i2 == 2) {
            fVar.K0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i2 == 3) {
            fVar.K0 = TextUtils.TruncateAt.END;
        }
        fVar.K(typedArrayE.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            fVar.K(typedArrayE.getBoolean(15, false));
        }
        fVar.H(a0.a.s(context4, typedArrayE, 14));
        if (typedArrayE.hasValue(17)) {
            fVar.J(a0.a.o(context4, typedArrayE, 17));
        }
        fVar.I(typedArrayE.getDimension(16, -1.0f));
        fVar.T(typedArrayE.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            fVar.T(typedArrayE.getBoolean(26, false));
        }
        fVar.N(a0.a.s(context4, typedArrayE, 25));
        fVar.S(a0.a.o(context4, typedArrayE, 30));
        fVar.P(typedArrayE.getDimension(28, 0.0f));
        fVar.C(typedArrayE.getBoolean(6, false));
        fVar.F(typedArrayE.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            fVar.F(typedArrayE.getBoolean(8, false));
        }
        fVar.D(a0.a.s(context4, typedArrayE, 7));
        if (typedArrayE.hasValue(9)) {
            fVar.E(a0.a.o(context4, typedArrayE, 9));
        }
        fVar.f1492d0 = (!typedArrayE.hasValue(39) || (resourceId2 = typedArrayE.getResourceId(39, 0)) == 0) ? null : d1.b.a(context4, resourceId2);
        fVar.f1493e0 = (!typedArrayE.hasValue(33) || (resourceId = typedArrayE.getResourceId(33, 0)) == 0) ? null : d1.b.a(context4, resourceId);
        float dimension2 = typedArrayE.getDimension(21, 0.0f);
        if (fVar.f1494f0 != dimension2) {
            fVar.f1494f0 = dimension2;
            fVar.invalidateSelf();
            fVar.A();
        }
        fVar.V(typedArrayE.getDimension(35, 0.0f));
        fVar.U(typedArrayE.getDimension(34, 0.0f));
        float dimension3 = typedArrayE.getDimension(41, 0.0f);
        if (fVar.f1497i0 != dimension3) {
            fVar.f1497i0 = dimension3;
            fVar.invalidateSelf();
            fVar.A();
        }
        float dimension4 = typedArrayE.getDimension(40, 0.0f);
        if (fVar.f1498j0 != dimension4) {
            fVar.f1498j0 = dimension4;
            fVar.invalidateSelf();
            fVar.A();
        }
        fVar.Q(typedArrayE.getDimension(29, 0.0f));
        fVar.O(typedArrayE.getDimension(27, 0.0f));
        float dimension5 = typedArrayE.getDimension(13, 0.0f);
        if (fVar.f1501m0 != dimension5) {
            fVar.f1501m0 = dimension5;
            fVar.invalidateSelf();
            fVar.A();
        }
        fVar.M0 = typedArrayE.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayE.recycle();
        k.a(context2, attributeSet, com.redhand.laugiytr.R.NP_MANAGER3.NP_MANAGER, com.redhand.laugiytr.R.NP_MANAGER15.NP_MANAGER);
        k.b(context2, attributeSet, iArr, com.redhand.laugiytr.R.NP_MANAGER3.NP_MANAGER, com.redhand.laugiytr.R.NP_MANAGER15.NP_MANAGER, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.redhand.laugiytr.R.NP_MANAGER3.NP_MANAGER, com.redhand.laugiytr.R.NP_MANAGER15.NP_MANAGER);
        this.f621n = typedArrayObtainStyledAttributes.getBoolean(32, false);
        TypedValue typedValueZ = a0.a.Z(context2, com.redhand.laugiytr.R.NP_MANAGER3.NP_MANAGER);
        this.f623p = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, (int) ((typedValueZ == null || typedValueZ.type != 5) ? context2.getResources().getDimension(com.redhand.laugiytr.R.NP_MANAGER6.NP_MANAGER) : typedValueZ.getDimension(context2.getResources().getDisplayMetrics()))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(fVar);
        fVar.m(getElevation());
        k.a(context2, attributeSet, com.redhand.laugiytr.R.NP_MANAGER3.NP_MANAGER, com.redhand.laugiytr.R.NP_MANAGER15.NP_MANAGER);
        k.b(context2, attributeSet, iArr, com.redhand.laugiytr.R.NP_MANAGER3.NP_MANAGER, com.redhand.laugiytr.R.NP_MANAGER15.NP_MANAGER, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.redhand.laugiytr.R.NP_MANAGER3.NP_MANAGER, com.redhand.laugiytr.R.NP_MANAGER15.NP_MANAGER);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.f625r = new d(this, this);
        d();
        if (!zHasValue) {
            setOutlineProvider(new c(this));
        }
        setChecked(this.f617j);
        setText(fVar.N);
        setEllipsize(fVar.K0);
        g();
        if (!this.f612e.L0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        f();
        if (this.f621n) {
            setMinHeight(this.f623p);
        }
        this.f622o = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: k1.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f1484a.f616i;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                }
            }
        });
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f628u;
        rectF.setEmpty();
        if (c() && this.f615h != null) {
            f fVar = this.f612e;
            Rect bounds = fVar.getBounds();
            rectF.setEmpty();
            if (fVar.a0()) {
                float f3 = fVar.f1501m0 + fVar.f1500l0 + fVar.X + fVar.f1499k0 + fVar.f1498j0;
                if (y.b.a(fVar) == 0) {
                    float f4 = bounds.right;
                    rectF.right = f4;
                    rectF.left = f4 - f3;
                } else {
                    float f5 = bounds.left;
                    rectF.left = f5;
                    rectF.right = f5 + f3;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i2 = (int) closeIconTouchBounds.left;
        int i3 = (int) closeIconTouchBounds.top;
        int i4 = (int) closeIconTouchBounds.right;
        int i5 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f627t;
        rect.set(i2, i3, i4, i5);
        return rect;
    }

    private q1.d getTextAppearance() {
        f fVar = this.f612e;
        if (fVar != null) {
            return fVar.f1508t0.f1868f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f619l != z) {
            this.f619l = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f618k != z) {
            this.f618k = z;
            refreshDrawableState();
        }
    }

    public final void b(int i2) {
        this.f623p = i2;
        if (!this.f621n) {
            InsetDrawable insetDrawable = this.f613f;
            if (insetDrawable == null) {
                e();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f613f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    e();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i2 - ((int) this.f612e.I));
        int iMax2 = Math.max(0, i2 - this.f612e.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f613f;
            if (insetDrawable2 == null) {
                e();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f613f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    e();
                    return;
                }
                return;
            }
        }
        int i3 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i4 = iMax > 0 ? iMax / 2 : 0;
        if (this.f613f != null) {
            Rect rect = new Rect();
            this.f613f.getPadding(rect);
            if (rect.top == i4 && rect.bottom == i4 && rect.left == i3 && rect.right == i3) {
                e();
                return;
            }
        }
        if (getMinHeight() != i2) {
            setMinHeight(i2);
        }
        if (getMinWidth() != i2) {
            setMinWidth(i2);
        }
        this.f613f = new InsetDrawable((Drawable) this.f612e, i3, i4, i3, i4);
        e();
    }

    public final boolean c() {
        f fVar = this.f612e;
        if (fVar == null) {
            return false;
        }
        Object obj = fVar.U;
        if (obj == null) {
            obj = null;
        } else if (obj instanceof y.d) {
            obj = null;
        }
        return obj != null;
    }

    public final void d() {
        f fVar;
        if (!c() || (fVar = this.f612e) == null || !fVar.T || this.f615h == null) {
            m0.j(this, null);
            this.f626s = false;
        } else {
            m0.j(this, this.f625r);
            this.f626s = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            boolean r0 = r8.f626s
            if (r0 != 0) goto L9
            boolean r9 = super.dispatchHoverEvent(r9)
            return r9
        L9:
            k1.d r0 = r8.f625r
            android.view.accessibility.AccessibilityManager r1 = r0.f1570h
            boolean r2 = r1.isEnabled()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L6b
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 != 0) goto L1c
            goto L6b
        L1c:
            int r1 = r9.getAction()
            r2 = 7
            r5 = 256(0x100, float:3.59E-43)
            r6 = 128(0x80, float:1.8E-43)
            if (r1 == r2) goto L42
            r2 = 9
            if (r1 == r2) goto L42
            r2 = 10
            if (r1 == r2) goto L30
            goto L6b
        L30:
            int r1 = r0.f1575m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto L6b
            if (r1 != r2) goto L39
            goto L71
        L39:
            r0.f1575m = r2
            r0.r(r2, r6)
            r0.r(r1, r5)
            return r4
        L42:
            float r1 = r9.getX()
            float r9 = r9.getY()
            com.google.android.material.chip.Chip r2 = r0.f1488q
            boolean r7 = r2.c()
            if (r7 == 0) goto L5d
            android.graphics.RectF r2 = r2.getCloseIconTouchBounds()
            boolean r9 = r2.contains(r1, r9)
            if (r9 == 0) goto L5d
            r3 = r4
        L5d:
            int r9 = r0.f1575m
            if (r9 != r3) goto L62
            goto L71
        L62:
            r0.f1575m = r3
            r0.r(r3, r6)
            r0.r(r9, r5)
            return r4
        L6b:
            boolean r9 = super.dispatchHoverEvent(r9)
            if (r9 == 0) goto L72
        L71:
            return r4
        L72:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.f626s
            if (r0 != 0) goto L9
            boolean r10 = super.dispatchKeyEvent(r10)
            return r10
        L9:
            k1.d r0 = r9.f625r
            r0.getClass()
            int r1 = r10.getAction()
            r2 = 0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1
            if (r1 == r4) goto L9d
            int r1 = r10.getKeyCode()
            r5 = 61
            r6 = 0
            if (r1 == r5) goto L87
            r5 = 66
            if (r1 == r5) goto L58
            switch(r1) {
                case 19: goto L2a;
                case 20: goto L2a;
                case 21: goto L2a;
                case 22: goto L2a;
                case 23: goto L58;
                default: goto L28;
            }
        L28:
            goto L9d
        L2a:
            boolean r7 = r10.hasNoModifiers()
            if (r7 == 0) goto L9d
            r7 = 19
            if (r1 == r7) goto L42
            r7 = 21
            if (r1 == r7) goto L3f
            r7 = 22
            if (r1 == r7) goto L44
            r5 = 130(0x82, float:1.82E-43)
            goto L44
        L3f:
            r5 = 17
            goto L44
        L42:
            r5 = 33
        L44:
            int r1 = r10.getRepeatCount()
            int r1 = r1 + r4
            r7 = r2
        L4a:
            if (r2 >= r1) goto L56
            boolean r8 = r0.m(r5, r6)
            if (r8 == 0) goto L56
            int r2 = r2 + 1
            r7 = r4
            goto L4a
        L56:
            r2 = r7
            goto L9d
        L58:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L9d
            int r1 = r10.getRepeatCount()
            if (r1 != 0) goto L9d
            int r1 = r0.f1574l
            if (r1 == r3) goto L85
            com.google.android.material.chip.Chip r5 = r0.f1488q
            if (r1 != 0) goto L70
            r5.performClick()
            goto L85
        L70:
            if (r1 != r4) goto L85
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r1 = r5.f615h
            if (r1 == 0) goto L7c
            r1.onClick(r5)
        L7c:
            boolean r1 = r5.f626s
            if (r1 == 0) goto L85
            k1.d r1 = r5.f625r
            r1.r(r4, r4)
        L85:
            r2 = r4
            goto L9d
        L87:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L93
            r1 = 2
            boolean r2 = r0.m(r1, r6)
            goto L9d
        L93:
            boolean r1 = r10.hasModifiers(r4)
            if (r1 == 0) goto L9d
            boolean r2 = r0.m(r4, r6)
        L9d:
            if (r2 == 0) goto La4
            int r0 = r0.f1574l
            if (r0 == r3) goto La4
            return r4
        La4:
            boolean r10 = super.dispatchKeyEvent(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // f.q, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.f612e;
        boolean zR = false;
        int i2 = 0;
        zR = false;
        if (fVar != null && f.z(fVar.U)) {
            f fVar2 = this.f612e;
            ?? IsEnabled = isEnabled();
            int i3 = IsEnabled;
            if (this.f620m) {
                i3 = IsEnabled + 1;
            }
            int i4 = i3;
            if (this.f619l) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (this.f618k) {
                i5 = i4 + 1;
            }
            int i6 = i5;
            if (isChecked()) {
                i6 = i5 + 1;
            }
            int[] iArr = new int[i6];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i2 = 1;
            }
            if (this.f620m) {
                iArr[i2] = 16842908;
                i2++;
            }
            if (this.f619l) {
                iArr[i2] = 16843623;
                i2++;
            }
            if (this.f618k) {
                iArr[i2] = 16842919;
                i2++;
            }
            if (isChecked()) {
                iArr[i2] = 16842913;
            }
            zR = fVar2.R(iArr);
        }
        if (zR) {
            invalidate();
        }
    }

    public final void e() {
        this.f614g = new RippleDrawable(r1.a.a(this.f612e.M), getBackgroundDrawable(), null);
        this.f612e.getClass();
        setBackground(this.f614g);
        f();
    }

    public final void f() {
        f fVar;
        if (TextUtils.isEmpty(getText()) || (fVar = this.f612e) == null) {
            return;
        }
        int iW = (int) (fVar.w() + fVar.f1501m0 + fVar.f1498j0);
        f fVar2 = this.f612e;
        int iV = (int) (fVar2.v() + fVar2.f1494f0 + fVar2.f1497i0);
        if (this.f613f != null) {
            Rect rect = new Rect();
            this.f613f.getPadding(rect);
            iV += rect.left;
            iW += rect.right;
        }
        setPaddingRelative(iV, getPaddingTop(), iW, getPaddingBottom());
    }

    public final void g() {
        TextPaint paint = getPaint();
        f fVar = this.f612e;
        if (fVar != null) {
            paint.drawableState = fVar.getState();
        }
        q1.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.d(getContext(), paint, this.f629v);
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f624q)) {
            return this.f624q;
        }
        f fVar = this.f612e;
        if (fVar == null || !fVar.Z) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f613f;
        return insetDrawable == null ? this.f612e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        f fVar = this.f612e;
        if (fVar != null) {
            return fVar.f1490b0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        f fVar = this.f612e;
        if (fVar != null) {
            return fVar.f1491c0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        f fVar = this.f612e;
        if (fVar != null) {
            return fVar.H;
        }
        return null;
    }

    public float getChipCornerRadius() {
        f fVar = this.f612e;
        if (fVar != null) {
            return Math.max(0.0f, fVar.x());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f612e;
    }

    public float getChipEndPadding() {
        f fVar = this.f612e;
        if (fVar != null) {
            return fVar.f1501m0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        f fVar = this.f612e;
        if (fVar == null || (drawable = fVar.P) == 0) {
            return null;
        }
        if (!(drawable instanceof y.d)) {
            return drawable;
        }
        return null;
    }

    public float getChipIconSize() {
        f fVar = this.f612e;
        if (fVar != null) {
            return fVar.R;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        f fVar = this.f612e;
        if (fVar != null) {
            return fVar.Q;
        }
        return null;
    }

    public float getChipMinHeight() {
        f fVar = this.f612e;
        if (fVar != null) {
            return fVar.I;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        f fVar = this.f612e;
        if (fVar != null) {
            return fVar.f1494f0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        f fVar = this.f612e;
        if (fVar != null) {
            return fVar.K;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        f fVar = this.f612e;
        if (fVar != null) {
            return fVar.L;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        f fVar = this.f612e;
        if (fVar == null || (drawable = fVar.U) == 0) {
            return null;
        }
        if (!(drawable instanceof y.d)) {
            return drawable;
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        f fVar = this.f612e;
        if (fVar != null) {
            return fVar.Y;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        f fVar = this.f612e;
        if (fVar != null) {
            return fVar.f1500l0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        f fVar = this.f612e;
        if (fVar != null) {
            return fVar.X;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        f fVar = this.f612e;
        if (fVar != null) {
            return fVar.f1499k0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        f fVar = this.f612e;
        if (fVar != null) {
            return fVar.W;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        f fVar = this.f612e;
        if (fVar != null) {
            return fVar.K0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f626s) {
            d dVar = this.f625r;
            if (dVar.f1574l == 1 || dVar.f1573k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public d1.b getHideMotionSpec() {
        f fVar = this.f612e;
        if (fVar != null) {
            return fVar.f1493e0;
        }
        return null;
    }

    public float getIconEndPadding() {
        f fVar = this.f612e;
        if (fVar != null) {
            return fVar.f1496h0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        f fVar = this.f612e;
        if (fVar != null) {
            return fVar.f1495g0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        f fVar = this.f612e;
        if (fVar != null) {
            return fVar.M;
        }
        return null;
    }

    public o getShapeAppearanceModel() {
        return this.f612e.f2205b.f2187a;
    }

    public d1.b getShowMotionSpec() {
        f fVar = this.f612e;
        if (fVar != null) {
            return fVar.f1492d0;
        }
        return null;
    }

    public float getTextEndPadding() {
        f fVar = this.f612e;
        if (fVar != null) {
            return fVar.f1498j0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        f fVar = this.f612e;
        if (fVar != null) {
            return fVar.f1497i0;
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t1.e.L(this, this.f612e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f610x);
        }
        f fVar = this.f612e;
        if (fVar != null && fVar.Z) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f611y);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i2, Rect rect) {
        super.onFocusChanged(z, i2, rect);
        if (this.f626s) {
            d dVar = this.f625r;
            int i3 = dVar.f1574l;
            if (i3 != Integer.MIN_VALUE) {
                dVar.j(i3);
            }
            if (z) {
                dVar.m(i2, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        f fVar = this.f612e;
        accessibilityNodeInfo.setCheckable(fVar != null && fVar.Z);
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i2) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i2);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        if (this.f622o != i2) {
            this.f622o = i2;
            f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L4a
            if (r0 == r2) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L45
            goto L50
        L21:
            boolean r0 = r5.f618k
            if (r0 == 0) goto L50
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r3)
        L2a:
            r0 = r2
            goto L51
        L2c:
            boolean r0 = r5.f618k
            if (r0 == 0) goto L45
            r5.playSoundEffect(r3)
            android.view.View$OnClickListener r0 = r5.f615h
            if (r0 == 0) goto L3a
            r0.onClick(r5)
        L3a:
            boolean r0 = r5.f626s
            if (r0 == 0) goto L43
            k1.d r0 = r5.f625r
            r0.r(r2, r2)
        L43:
            r0 = r2
            goto L46
        L45:
            r0 = r3
        L46:
            r5.setCloseIconPressed(r3)
            goto L51
        L4a:
            if (r1 == 0) goto L50
            r5.setCloseIconPressed(r2)
            goto L2a
        L50:
            r0 = r3
        L51:
            if (r0 != 0) goto L5b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L5a
            goto L5b
        L5a:
            return r3
        L5b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f624q = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f614g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // f.q, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f614g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // f.q, android.view.View
    public void setBackgroundResource(int i2) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        f fVar = this.f612e;
        if (fVar != null) {
            fVar.C(z);
        }
    }

    public void setCheckableResource(int i2) {
        f fVar = this.f612e;
        if (fVar != null) {
            fVar.C(fVar.f1502n0.getResources().getBoolean(i2));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        f fVar = this.f612e;
        if (fVar == null) {
            this.f617j = z;
        } else if (fVar.Z) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        f fVar = this.f612e;
        if (fVar != null) {
            fVar.D(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i2) {
        setCheckedIconVisible(i2);
    }

    public void setCheckedIconResource(int i2) {
        f fVar = this.f612e;
        if (fVar != null) {
            fVar.D(a0.a.r(fVar.f1502n0, i2));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        f fVar = this.f612e;
        if (fVar != null) {
            fVar.E(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i2) {
        f fVar = this.f612e;
        if (fVar != null) {
            fVar.E(t1.e.s(fVar.f1502n0, i2));
        }
    }

    public void setCheckedIconVisible(int i2) {
        f fVar = this.f612e;
        if (fVar != null) {
            fVar.F(fVar.f1502n0.getResources().getBoolean(i2));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        f fVar = this.f612e;
        if (fVar == null || fVar.H == colorStateList) {
            return;
        }
        fVar.H = colorStateList;
        fVar.onStateChange(fVar.getState());
    }

    public void setChipBackgroundColorResource(int i2) {
        ColorStateList colorStateListS;
        f fVar = this.f612e;
        if (fVar == null || fVar.H == (colorStateListS = t1.e.s(fVar.f1502n0, i2))) {
            return;
        }
        fVar.H = colorStateListS;
        fVar.onStateChange(fVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f3) {
        f fVar = this.f612e;
        if (fVar != null) {
            fVar.G(f3);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i2) {
        f fVar = this.f612e;
        if (fVar != null) {
            fVar.G(fVar.f1502n0.getResources().getDimension(i2));
        }
    }

    public void setChipDrawable(f fVar) {
        f fVar2 = this.f612e;
        if (fVar2 != fVar) {
            if (fVar2 != null) {
                fVar2.J0 = new WeakReference(null);
            }
            this.f612e = fVar;
            fVar.L0 = false;
            fVar.J0 = new WeakReference(this);
            b(this.f623p);
        }
    }

    public void setChipEndPadding(float f3) {
        f fVar = this.f612e;
        if (fVar == null || fVar.f1501m0 == f3) {
            return;
        }
        fVar.f1501m0 = f3;
        fVar.invalidateSelf();
        fVar.A();
    }

    public void setChipEndPaddingResource(int i2) {
        f fVar = this.f612e;
        if (fVar != null) {
            float dimension = fVar.f1502n0.getResources().getDimension(i2);
            if (fVar.f1501m0 != dimension) {
                fVar.f1501m0 = dimension;
                fVar.invalidateSelf();
                fVar.A();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        f fVar = this.f612e;
        if (fVar != null) {
            fVar.H(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i2) {
        setChipIconVisible(i2);
    }

    public void setChipIconResource(int i2) {
        f fVar = this.f612e;
        if (fVar != null) {
            fVar.H(a0.a.r(fVar.f1502n0, i2));
        }
    }

    public void setChipIconSize(float f3) {
        f fVar = this.f612e;
        if (fVar != null) {
            fVar.I(f3);
        }
    }

    public void setChipIconSizeResource(int i2) {
        f fVar = this.f612e;
        if (fVar != null) {
            fVar.I(fVar.f1502n0.getResources().getDimension(i2));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        f fVar = this.f612e;
        if (fVar != null) {
            fVar.J(colorStateList);
        }
    }

    public void setChipIconTintResource(int i2) {
        f fVar = this.f612e;
        if (fVar != null) {
            fVar.J(t1.e.s(fVar.f1502n0, i2));
        }
    }

    public void setChipIconVisible(int i2) {
        f fVar = this.f612e;
        if (fVar != null) {
            fVar.K(fVar.f1502n0.getResources().getBoolean(i2));
        }
    }

    public void setChipMinHeight(float f3) {
        f fVar = this.f612e;
        if (fVar == null || fVar.I == f3) {
            return;
        }
        fVar.I = f3;
        fVar.invalidateSelf();
        fVar.A();
    }

    public void setChipMinHeightResource(int i2) {
        f fVar = this.f612e;
        if (fVar != null) {
            float dimension = fVar.f1502n0.getResources().getDimension(i2);
            if (fVar.I != dimension) {
                fVar.I = dimension;
                fVar.invalidateSelf();
                fVar.A();
            }
        }
    }

    public void setChipStartPadding(float f3) {
        f fVar = this.f612e;
        if (fVar == null || fVar.f1494f0 == f3) {
            return;
        }
        fVar.f1494f0 = f3;
        fVar.invalidateSelf();
        fVar.A();
    }

    public void setChipStartPaddingResource(int i2) {
        f fVar = this.f612e;
        if (fVar != null) {
            float dimension = fVar.f1502n0.getResources().getDimension(i2);
            if (fVar.f1494f0 != dimension) {
                fVar.f1494f0 = dimension;
                fVar.invalidateSelf();
                fVar.A();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        f fVar = this.f612e;
        if (fVar != null) {
            fVar.L(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i2) {
        f fVar = this.f612e;
        if (fVar != null) {
            fVar.L(t1.e.s(fVar.f1502n0, i2));
        }
    }

    public void setChipStrokeWidth(float f3) {
        f fVar = this.f612e;
        if (fVar != null) {
            fVar.M(f3);
        }
    }

    public void setChipStrokeWidthResource(int i2) {
        f fVar = this.f612e;
        if (fVar != null) {
            fVar.M(fVar.f1502n0.getResources().getDimension(i2));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i2) {
        setText(getResources().getString(i2));
    }

    public void setCloseIcon(Drawable drawable) {
        f fVar = this.f612e;
        if (fVar != null) {
            fVar.N(drawable);
        }
        d();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        f fVar = this.f612e;
        if (fVar == null || fVar.Y == charSequence) {
            return;
        }
        String str = d0.b.f819b;
        d0.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? d0.b.f821e : d0.b.f820d;
        bVar.getClass();
        g gVar = h.f829a;
        fVar.Y = bVar.c(charSequence);
        fVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i2) {
        setCloseIconVisible(i2);
    }

    public void setCloseIconEndPadding(float f3) {
        f fVar = this.f612e;
        if (fVar != null) {
            fVar.O(f3);
        }
    }

    public void setCloseIconEndPaddingResource(int i2) {
        f fVar = this.f612e;
        if (fVar != null) {
            fVar.O(fVar.f1502n0.getResources().getDimension(i2));
        }
    }

    public void setCloseIconResource(int i2) {
        f fVar = this.f612e;
        if (fVar != null) {
            fVar.N(a0.a.r(fVar.f1502n0, i2));
        }
        d();
    }

    public void setCloseIconSize(float f3) {
        f fVar = this.f612e;
        if (fVar != null) {
            fVar.P(f3);
        }
    }

    public void setCloseIconSizeResource(int i2) {
        f fVar = this.f612e;
        if (fVar != null) {
            fVar.P(fVar.f1502n0.getResources().getDimension(i2));
        }
    }

    public void setCloseIconStartPadding(float f3) {
        f fVar = this.f612e;
        if (fVar != null) {
            fVar.Q(f3);
        }
    }

    public void setCloseIconStartPaddingResource(int i2) {
        f fVar = this.f612e;
        if (fVar != null) {
            fVar.Q(fVar.f1502n0.getResources().getDimension(i2));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        f fVar = this.f612e;
        if (fVar != null) {
            fVar.S(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i2) {
        f fVar = this.f612e;
        if (fVar != null) {
            fVar.S(t1.e.s(fVar.f1502n0, i2));
        }
    }

    public void setCloseIconVisible(int i2) {
        setCloseIconVisible(getResources().getBoolean(i2));
    }

    @Override // f.q, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // f.q, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i4 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i2, i3, i4, i5);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i4 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i2, i3, i4, i5);
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        f fVar = this.f612e;
        if (fVar != null) {
            fVar.m(f3);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f612e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        f fVar = this.f612e;
        if (fVar != null) {
            fVar.K0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f621n = z;
        b(this.f623p);
    }

    @Override // android.widget.TextView
    public void setGravity(int i2) {
        if (i2 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i2);
        }
    }

    public void setHideMotionSpec(d1.b bVar) {
        f fVar = this.f612e;
        if (fVar != null) {
            fVar.f1493e0 = bVar;
        }
    }

    public void setHideMotionSpecResource(int i2) {
        f fVar = this.f612e;
        if (fVar != null) {
            fVar.f1493e0 = d1.b.a(fVar.f1502n0, i2);
        }
    }

    public void setIconEndPadding(float f3) {
        f fVar = this.f612e;
        if (fVar != null) {
            fVar.U(f3);
        }
    }

    public void setIconEndPaddingResource(int i2) {
        f fVar = this.f612e;
        if (fVar != null) {
            fVar.U(fVar.f1502n0.getResources().getDimension(i2));
        }
    }

    public void setIconStartPadding(float f3) {
        f fVar = this.f612e;
        if (fVar != null) {
            fVar.V(f3);
        }
    }

    public void setIconStartPaddingResource(int i2) {
        f fVar = this.f612e;
        if (fVar != null) {
            fVar.V(fVar.f1502n0.getResources().getDimension(i2));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i2) {
        if (this.f612e == null) {
            return;
        }
        super.setLayoutDirection(i2);
    }

    @Override // android.widget.TextView
    public void setLines(int i2) {
        if (i2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i2);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i2) {
        if (i2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i2);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i2) {
        super.setMaxWidth(i2);
        f fVar = this.f612e;
        if (fVar != null) {
            fVar.M0 = i2;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i2) {
        if (i2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i2);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f616i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f615h = onClickListener;
        d();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        f fVar = this.f612e;
        if (fVar != null) {
            fVar.W(colorStateList);
        }
        this.f612e.getClass();
        e();
    }

    public void setRippleColorResource(int i2) {
        f fVar = this.f612e;
        if (fVar != null) {
            fVar.W(t1.e.s(fVar.f1502n0, i2));
            this.f612e.getClass();
            e();
        }
    }

    @Override // t1.z
    public void setShapeAppearanceModel(o oVar) {
        this.f612e.setShapeAppearanceModel(oVar);
    }

    public void setShowMotionSpec(d1.b bVar) {
        f fVar = this.f612e;
        if (fVar != null) {
            fVar.f1492d0 = bVar;
        }
    }

    public void setShowMotionSpecResource(int i2) {
        f fVar = this.f612e;
        if (fVar != null) {
            fVar.f1492d0 = d1.b.a(fVar.f1502n0, i2);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        f fVar = this.f612e;
        if (fVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(fVar.L0 ? null : charSequence, bufferType);
        f fVar2 = this.f612e;
        if (fVar2 == null || TextUtils.equals(fVar2.N, charSequence)) {
            return;
        }
        fVar2.N = charSequence;
        fVar2.f1508t0.f1866d = true;
        fVar2.invalidateSelf();
        fVar2.A();
    }

    public void setTextAppearance(q1.d dVar) {
        f fVar = this.f612e;
        if (fVar != null) {
            fVar.X(dVar);
        }
        g();
    }

    public void setTextAppearanceResource(int i2) {
        setTextAppearance(getContext(), i2);
    }

    public void setTextEndPadding(float f3) {
        f fVar = this.f612e;
        if (fVar == null || fVar.f1498j0 == f3) {
            return;
        }
        fVar.f1498j0 = f3;
        fVar.invalidateSelf();
        fVar.A();
    }

    public void setTextEndPaddingResource(int i2) {
        f fVar = this.f612e;
        if (fVar != null) {
            float dimension = fVar.f1502n0.getResources().getDimension(i2);
            if (fVar.f1498j0 != dimension) {
                fVar.f1498j0 = dimension;
                fVar.invalidateSelf();
                fVar.A();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i2, float f3) {
        super.setTextSize(i2, f3);
        f fVar = this.f612e;
        if (fVar != null) {
            float fApplyDimension = TypedValue.applyDimension(i2, f3, getResources().getDisplayMetrics());
            i iVar = fVar.f1508t0;
            q1.d dVar = iVar.f1868f;
            if (dVar != null) {
                dVar.f2071l = fApplyDimension;
                iVar.f1864a.setTextSize(fApplyDimension);
                fVar.A();
                fVar.invalidateSelf();
            }
        }
        g();
    }

    public void setTextStartPadding(float f3) {
        f fVar = this.f612e;
        if (fVar == null || fVar.f1497i0 == f3) {
            return;
        }
        fVar.f1497i0 = f3;
        fVar.invalidateSelf();
        fVar.A();
    }

    public void setTextStartPaddingResource(int i2) {
        f fVar = this.f612e;
        if (fVar != null) {
            float dimension = fVar.f1502n0.getResources().getDimension(i2);
            if (fVar.f1497i0 != dimension) {
                fVar.f1497i0 = dimension;
                fVar.invalidateSelf();
                fVar.A();
            }
        }
    }

    public void setCloseIconVisible(boolean z) {
        f fVar = this.f612e;
        if (fVar != null) {
            fVar.T(z);
        }
        d();
    }

    public void setCheckedIconVisible(boolean z) {
        f fVar = this.f612e;
        if (fVar != null) {
            fVar.F(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        f fVar = this.f612e;
        if (fVar != null) {
            fVar.K(z);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        f fVar = this.f612e;
        if (fVar != null) {
            fVar.X(new q1.d(fVar.f1502n0, i2));
        }
        g();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i2) {
        super.setTextAppearance(i2);
        f fVar = this.f612e;
        if (fVar != null) {
            fVar.X(new q1.d(fVar.f1502n0, i2));
        }
        g();
    }

    public void setInternalOnCheckedChangeListener(o1.e eVar) {
    }
}
