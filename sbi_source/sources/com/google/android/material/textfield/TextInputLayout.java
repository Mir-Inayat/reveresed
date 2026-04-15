package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.emoji2.text.t;
import com.google.android.material.internal.CheckableImageButton;
import f.m0;
import f.u0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import o1.b;
import o1.c;
import t1.d;
import t1.e;
import t1.g;
import t1.i;
import t1.k;
import t1.m;
import t1.n;
import t1.o;
import w1.l;
import w1.p;
import w1.r;
import w1.s;
import w1.u;
import w1.v;
import w1.w;
import w1.x;
import w1.y;
import x1.a;
import z0.h;
import z0.q;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] D0 = {new int[]{R.attr.state_pressed}, new int[0]};
    public ColorStateList A;
    public boolean A0;
    public ColorStateList B;
    public boolean B0;
    public ColorStateList C;
    public boolean C0;
    public boolean D;
    public CharSequence E;
    public boolean F;
    public k G;
    public k H;
    public StateListDrawable I;
    public boolean J;
    public k K;
    public k L;
    public o M;
    public boolean N;
    public final int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public final Rect W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f676a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Rect f677a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f678b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final RectF f679b0;
    public final p c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public Typeface f680c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f681d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public ColorDrawable f682d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EditText f683e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f684e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f685f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final LinkedHashSet f686f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f687g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public ColorDrawable f688g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f689h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f690h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f691i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public Drawable f692i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f693j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public ColorStateList f694j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final s f695k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public ColorStateList f696k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f697l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f698l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f699m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f700m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f701n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f702n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public x f703o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public ColorStateList f704o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public m0 f705p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f706p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f707q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f708q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f709r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f710r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CharSequence f711s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f712s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f713t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f714t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public m0 f715u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f716u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ColorStateList f717v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f718v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f719w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final b f720w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public h f721x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f722x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public h f723y;
    public boolean y0;
    public ColorStateList z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public ValueAnimator f724z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.redhand.laugiytr.R.NP_MANAGER3.NP_MANAGER, com.redhand.laugiytr.R.NP_MANAGER15.NP_MANAGER), attributeSet, com.redhand.laugiytr.R.NP_MANAGER3.NP_MANAGER);
        this.f687g = -1;
        this.f689h = -1;
        this.f691i = -1;
        this.f693j = -1;
        this.f695k = new s(this);
        this.f703o = new f0.h(2);
        this.W = new Rect();
        this.f677a0 = new Rect();
        this.f679b0 = new RectF();
        this.f686f0 = new LinkedHashSet();
        b bVar = new b(this);
        this.f720w0 = bVar;
        this.C0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f676a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = d1.a.f832a;
        bVar.R = linearInterpolator;
        bVar.j(false);
        bVar.Q = linearInterpolator;
        bVar.j(false);
        if (bVar.f1820g != 8388659) {
            bVar.f1820g = 8388659;
            bVar.j(false);
        }
        o1.k.a(context2, attributeSet, com.redhand.laugiytr.R.NP_MANAGER3.NP_MANAGER, com.redhand.laugiytr.R.NP_MANAGER15.NP_MANAGER);
        int[] iArr = c1.a.f514x;
        o1.k.b(context2, attributeSet, iArr, com.redhand.laugiytr.R.NP_MANAGER3.NP_MANAGER, com.redhand.laugiytr.R.NP_MANAGER15.NP_MANAGER, 22, 20, 40, 45, 50);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.redhand.laugiytr.R.NP_MANAGER3.NP_MANAGER, com.redhand.laugiytr.R.NP_MANAGER15.NP_MANAGER);
        t tVar = new t(context2, typedArrayObtainStyledAttributes);
        u uVar = new u(this, tVar);
        this.f678b = uVar;
        this.D = typedArrayObtainStyledAttributes.getBoolean(48, true);
        setHint(typedArrayObtainStyledAttributes.getText(4));
        this.y0 = typedArrayObtainStyledAttributes.getBoolean(47, true);
        this.f722x0 = typedArrayObtainStyledAttributes.getBoolean(42, true);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setMinEms(typedArrayObtainStyledAttributes.getInt(6, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(3)) {
            setMinWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            setMaxEms(typedArrayObtainStyledAttributes.getInt(5, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(2)) {
            setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.M = o.b(context2, attributeSet, com.redhand.laugiytr.R.NP_MANAGER3.NP_MANAGER, com.redhand.laugiytr.R.NP_MANAGER15.NP_MANAGER).a();
        this.O = context2.getResources().getDimensionPixelOffset(com.redhand.laugiytr.R.NP_MANAGER6.NP_MANAGER);
        this.Q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f681d = getResources().getDimensionPixelSize(com.redhand.laugiytr.R.NP_MANAGER6.NP_MANAGER);
        this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.redhand.laugiytr.R.NP_MANAGER6.NP_MANAGER));
        this.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.redhand.laugiytr.R.NP_MANAGER6.NP_MANAGER));
        this.R = this.S;
        float dimension = typedArrayObtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(11, -1.0f);
        n nVarF = this.M.f();
        if (dimension >= 0.0f) {
            nVarF.f2232e = new t1.a(dimension);
        }
        if (dimension2 >= 0.0f) {
            nVarF.f2233f = new t1.a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            nVarF.f2234g = new t1.a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            nVarF.f2235h = new t1.a(dimension4);
        }
        this.M = nVarF.a();
        ColorStateList colorStateListP = a0.a.p(context2, tVar, 7);
        if (colorStateListP != null) {
            int defaultColor = colorStateListP.getDefaultColor();
            this.f706p0 = defaultColor;
            this.V = defaultColor;
            if (colorStateListP.isStateful()) {
                this.f708q0 = colorStateListP.getColorForState(new int[]{-16842910}, -1);
                this.f710r0 = colorStateListP.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f712s0 = colorStateListP.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f710r0 = this.f706p0;
                ColorStateList colorStateListS = e.s(context2, com.redhand.laugiytr.R.NP_MANAGER5.NP_MANAGER);
                this.f708q0 = colorStateListS.getColorForState(new int[]{-16842910}, -1);
                this.f712s0 = colorStateListS.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.V = 0;
            this.f706p0 = 0;
            this.f708q0 = 0;
            this.f710r0 = 0;
            this.f712s0 = 0;
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            ColorStateList colorStateListL = tVar.l(1);
            this.f696k0 = colorStateListL;
            this.f694j0 = colorStateListL;
        }
        ColorStateList colorStateListP2 = a0.a.p(context2, tVar, 14);
        this.f702n0 = typedArrayObtainStyledAttributes.getColor(14, 0);
        this.f698l0 = v.b.a(context2, com.redhand.laugiytr.R.NP_MANAGER5.NP_MANAGER);
        this.f714t0 = v.b.a(context2, com.redhand.laugiytr.R.NP_MANAGER5.NP_MANAGER);
        this.f700m0 = v.b.a(context2, com.redhand.laugiytr.R.NP_MANAGER5.NP_MANAGER);
        if (colorStateListP2 != null) {
            setBoxStrokeColorStateList(colorStateListP2);
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(a0.a.p(context2, tVar, 15));
        }
        if (typedArrayObtainStyledAttributes.getResourceId(50, -1) != -1) {
            setHintTextAppearance(typedArrayObtainStyledAttributes.getResourceId(50, 0));
        }
        this.B = tVar.l(24);
        this.C = tVar.l(25);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = typedArrayObtainStyledAttributes.getText(35);
        int i2 = typedArrayObtainStyledAttributes.getInt(34, 1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(45, 0);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(43);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(58, 0);
        CharSequence text3 = typedArrayObtainStyledAttributes.getText(57);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(typedArrayObtainStyledAttributes.getInt(19, -1));
        this.f709r = typedArrayObtainStyledAttributes.getResourceId(22, 0);
        this.f707q = typedArrayObtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(typedArrayObtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i2);
        setCounterOverflowTextAppearance(this.f707q);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f709r);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArrayObtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(tVar.l(41));
        }
        if (typedArrayObtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(tVar.l(46));
        }
        if (typedArrayObtainStyledAttributes.hasValue(51)) {
            setHintTextColor(tVar.l(51));
        }
        if (typedArrayObtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(tVar.l(23));
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(tVar.l(21));
        }
        if (typedArrayObtainStyledAttributes.hasValue(59)) {
            setPlaceholderTextColor(tVar.l(59));
        }
        p pVar = new p(this, tVar);
        this.c = pVar;
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        setHintMaxLines(typedArrayObtainStyledAttributes.getInt(49, 1));
        tVar.x();
        setImportantForAccessibility(2);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
        frameLayout.addView(uVar);
        frameLayout.addView(pVar);
        addView(frameLayout);
        setEnabled(z4);
        setHelperTextEnabled(z2);
        setErrorEnabled(z);
        setCounterEnabled(z3);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f683e;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.G;
        }
        int iN = a0.a.n(this.f683e, com.redhand.laugiytr.R.NP_MANAGER3.NP_MANAGER);
        int i2 = this.P;
        int[][] iArr = D0;
        if (i2 != 2) {
            if (i2 != 1) {
                return null;
            }
            k kVar = this.G;
            int i3 = this.V;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{a0.a.I(iN, i3, 0.1f), i3}), kVar, kVar);
        }
        Context context = getContext();
        k kVar2 = this.G;
        TypedValue typedValueC0 = a0.a.c0(context, com.redhand.laugiytr.R.NP_MANAGER3.NP_MANAGER, "TextInputLayout");
        int i4 = typedValueC0.resourceId;
        int iA = i4 != 0 ? v.b.a(context, i4) : typedValueC0.data;
        k kVar3 = new k(kVar2.f2205b.f2187a);
        int I = a0.a.I(iN, iA, 0.1f);
        kVar3.n(new ColorStateList(iArr, new int[]{I, 0}));
        kVar3.setTint(iA);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{I, iA});
        k kVar4 = new k(kVar2.f2205b.f2187a);
        kVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, kVar3, kVar4), kVar2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.I == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.I = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.I.addState(new int[0], h(false));
        }
        return this.I;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.H == null) {
            this.H = h(true);
        }
        return this.H;
    }

    public static void m(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m((ViewGroup) childAt, z);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f683e != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f683e = editText;
        int i2 = this.f687g;
        if (i2 != -1) {
            setMinEms(i2);
        } else {
            setMinWidth(this.f691i);
        }
        int i3 = this.f689h;
        if (i3 != -1) {
            setMaxEms(i3);
        } else {
            setMaxWidth(this.f693j);
        }
        this.J = false;
        k();
        setTextInputAccessibilityDelegate(new w(this));
        Typeface typeface = this.f683e.getTypeface();
        b bVar = this.f720w0;
        bVar.n(typeface);
        float textSize = this.f683e.getTextSize();
        if (bVar.f1822h != textSize) {
            bVar.f1822h = textSize;
            bVar.j(false);
        }
        float letterSpacing = this.f683e.getLetterSpacing();
        if (bVar.X != letterSpacing) {
            bVar.X = letterSpacing;
            bVar.j(false);
        }
        int gravity = this.f683e.getGravity();
        int i4 = (gravity & (-113)) | 48;
        if (bVar.f1820g != i4) {
            bVar.f1820g = i4;
            bVar.j(false);
        }
        if (bVar.f1818f != gravity) {
            bVar.f1818f = gravity;
            bVar.j(false);
        }
        this.f716u0 = editText.getMinimumHeight();
        this.f683e.addTextChangedListener(new v(this, editText));
        if (this.f694j0 == null) {
            this.f694j0 = this.f683e.getHintTextColors();
        }
        if (this.D) {
            if (TextUtils.isEmpty(this.E)) {
                CharSequence hint = this.f683e.getHint();
                this.f685f = hint;
                setHint(hint);
                this.f683e.setHint((CharSequence) null);
            }
            this.F = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        if (this.f705p != null) {
            p(this.f683e.getText());
        }
        t();
        this.f695k.b();
        this.f678b.bringToFront();
        p pVar = this.c;
        pVar.bringToFront();
        Iterator it = this.f686f0.iterator();
        while (it.hasNext()) {
            ((w1.n) it.next()).a(this);
        }
        pVar.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        w(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.E)) {
            return;
        }
        this.E = charSequence;
        b bVar = this.f720w0;
        if (charSequence == null || !TextUtils.equals(bVar.B, charSequence)) {
            bVar.B = charSequence;
            bVar.C = null;
            bVar.j(false);
        }
        if (this.f718v0) {
            return;
        }
        l();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f713t == z) {
            return;
        }
        if (z) {
            m0 m0Var = this.f715u;
            if (m0Var != null) {
                this.f676a.addView(m0Var);
                this.f715u.setVisibility(0);
            }
        } else {
            m0 m0Var2 = this.f715u;
            if (m0Var2 != null) {
                m0Var2.setVisibility(8);
            }
            this.f715u = null;
        }
        this.f713t = z;
    }

    public final void a() {
        if (this.f683e == null || this.P != 1) {
            return;
        }
        if (getHintMaxLines() != 1) {
            EditText editText = this.f683e;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.f720w0.f() + this.f681d), this.f683e.getPaddingEnd(), getResources().getDimensionPixelSize(com.redhand.laugiytr.R.NP_MANAGER6.NP_MANAGER));
        } else if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
            EditText editText2 = this.f683e;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.redhand.laugiytr.R.NP_MANAGER6.NP_MANAGER), this.f683e.getPaddingEnd(), getResources().getDimensionPixelSize(com.redhand.laugiytr.R.NP_MANAGER6.NP_MANAGER));
        } else if (a0.a.G(getContext())) {
            EditText editText3 = this.f683e;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(com.redhand.laugiytr.R.NP_MANAGER6.NP_MANAGER), this.f683e.getPaddingEnd(), getResources().getDimensionPixelSize(com.redhand.laugiytr.R.NP_MANAGER6.NP_MANAGER));
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i2, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f676a;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        v();
        setEditText((EditText) view);
    }

    public final void b(float f3) {
        b bVar = this.f720w0;
        if (bVar.f1811b == f3) {
            return;
        }
        int i2 = 2;
        if (this.f724z0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f724z0 = valueAnimator;
            valueAnimator.setInterpolator(a0.a.b0(getContext(), com.redhand.laugiytr.R.NP_MANAGER3.NP_MANAGER, d1.a.f833b));
            this.f724z0.setDuration(a0.a.a0(getContext(), com.redhand.laugiytr.R.NP_MANAGER3.NP_MANAGER, 167));
            this.f724z0.addUpdateListener(new h1.a(i2, this));
        }
        this.f724z0.setFloatValues(bVar.f1811b, f3);
        this.f724z0.start();
    }

    public final void c() {
        int i2;
        int i3;
        k kVar = this.G;
        if (kVar == null) {
            return;
        }
        o oVar = kVar.f2205b.f2187a;
        o oVar2 = this.M;
        if (oVar != oVar2) {
            kVar.setShapeAppearanceModel(oVar2);
        }
        if (this.P == 2 && (i2 = this.R) > -1 && (i3 = this.U) != 0) {
            k kVar2 = this.G;
            kVar2.f2205b.f2196k = i2;
            kVar2.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i3);
            i iVar = kVar2.f2205b;
            if (iVar.f2190e != colorStateListValueOf) {
                iVar.f2190e = colorStateListValueOf;
                kVar2.onStateChange(kVar2.getState());
            }
        }
        int iB = this.V;
        if (this.P == 1) {
            iB = x.a.b(this.V, a0.a.m(getContext(), com.redhand.laugiytr.R.NP_MANAGER3.NP_MANAGER, 0));
        }
        this.V = iB;
        this.G.n(ColorStateList.valueOf(iB));
        k kVar3 = this.K;
        if (kVar3 != null && this.L != null) {
            if (this.R > -1 && this.U != 0) {
                kVar3.n(this.f683e.isFocused() ? ColorStateList.valueOf(this.f698l0) : ColorStateList.valueOf(this.U));
                this.L.n(ColorStateList.valueOf(this.U));
            }
            invalidate();
        }
        u();
    }

    public final Rect d(Rect rect) {
        if (this.f683e == null) {
            throw new IllegalStateException();
        }
        boolean z = getLayoutDirection() == 1;
        int i2 = rect.bottom;
        Rect rect2 = this.f677a0;
        rect2.bottom = i2;
        int i3 = this.P;
        if (i3 == 1) {
            rect2.left = i(rect.left, z);
            rect2.top = rect.top + this.Q;
            rect2.right = j(rect.right, z);
            return rect2;
        }
        if (i3 != 2) {
            rect2.left = i(rect.left, z);
            rect2.top = getPaddingTop();
            rect2.right = j(rect.right, z);
            return rect2;
        }
        rect2.left = this.f683e.getPaddingLeft() + rect.left;
        rect2.top = rect.top - e();
        rect2.right = rect.right - this.f683e.getPaddingRight();
        return rect2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i2) {
        EditText editText = this.f683e;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i2);
            return;
        }
        if (this.f685f != null) {
            boolean z = this.F;
            this.F = false;
            CharSequence hint = editText.getHint();
            this.f683e.setHint(this.f685f);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i2);
                return;
            } finally {
                this.f683e.setHint(hint);
                this.F = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i2);
        onProvideAutofillVirtualStructure(viewStructure, i2);
        FrameLayout frameLayout = this.f676a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i3 = 0; i3 < frameLayout.getChildCount(); i3++) {
            View childAt = frameLayout.getChildAt(i3);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i3);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i2);
            if (childAt == this.f683e) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.B0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.B0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        k kVar;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        boolean z = this.D;
        b bVar = this.f720w0;
        if (z) {
            TextPaint textPaint = bVar.O;
            RectF rectF = bVar.f1816e;
            int iSave = canvas2.save();
            if (bVar.C != null && rectF.width() > 0.0f && rectF.height() > 0.0f) {
                textPaint.setTextSize(bVar.G);
                float f3 = bVar.f1835q;
                float f4 = bVar.f1836r;
                float f5 = bVar.F;
                if (f5 != 1.0f) {
                    canvas2.scale(f5, f5, f3, f4);
                }
                if ((bVar.f1817e0 > 1 || bVar.f1819f0 > 1) && !bVar.D && bVar.o()) {
                    float lineStart = bVar.f1835q - bVar.Z.getLineStart(0);
                    int alpha = textPaint.getAlpha();
                    canvas2.translate(lineStart, f4);
                    float f6 = alpha;
                    textPaint.setAlpha((int) (bVar.f1813c0 * f6));
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 31) {
                        float f7 = bVar.H;
                        float f8 = bVar.I;
                        float f9 = bVar.J;
                        int i3 = bVar.K;
                        textPaint.setShadowLayer(f7, f8, f9, x.a.d(i3, (textPaint.getAlpha() * Color.alpha(i3)) / 255));
                    }
                    bVar.Z.draw(canvas2);
                    textPaint.setAlpha((int) (bVar.f1812b0 * f6));
                    if (i2 >= 31) {
                        float f10 = bVar.H;
                        float f11 = bVar.I;
                        float f12 = bVar.J;
                        int i4 = bVar.K;
                        textPaint.setShadowLayer(f10, f11, f12, x.a.d(i4, (Color.alpha(i4) * textPaint.getAlpha()) / 255));
                    }
                    int lineBaseline = bVar.Z.getLineBaseline(0);
                    CharSequence charSequence = bVar.f1815d0;
                    float f13 = lineBaseline;
                    canvas2.drawText(charSequence, 0, charSequence.length(), 0.0f, f13, textPaint);
                    if (i2 >= 31) {
                        textPaint.setShadowLayer(bVar.H, bVar.I, bVar.J, bVar.K);
                    }
                    String strTrim = bVar.f1815d0.toString().trim();
                    if (strTrim.endsWith("…")) {
                        strTrim = strTrim.substring(0, strTrim.length() - 1);
                    }
                    String str = strTrim;
                    textPaint.setAlpha(alpha);
                    canvas2 = canvas;
                    canvas2.drawText(str, 0, Math.min(bVar.Z.getLineEnd(0), str.length()), 0.0f, f13, (Paint) textPaint);
                } else {
                    canvas2.translate(f3, f4);
                    bVar.Z.draw(canvas2);
                }
                canvas2.restoreToCount(iSave);
            }
        }
        if (this.L == null || (kVar = this.K) == null) {
            return;
        }
        kVar.draw(canvas2);
        if (this.f683e.isFocused()) {
            Rect bounds = this.L.getBounds();
            Rect bounds2 = this.K.getBounds();
            float f14 = bVar.f1811b;
            int iCenterX = bounds2.centerX();
            bounds.left = d1.a.c(iCenterX, bounds2.left, f14);
            bounds.right = d1.a.c(iCenterX, bounds2.right, f14);
            this.L.draw(canvas2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.A0
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.A0 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            o1.b r3 = r4.f720w0
            if (r3 == 0) goto L2f
            r3.M = r1
            android.content.res.ColorStateList r1 = r3.f1828k
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r3.f1826j
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L2f
        L2a:
            r3.j(r2)
            r1 = r0
            goto L30
        L2f:
            r1 = r2
        L30:
            android.widget.EditText r3 = r4.f683e
            if (r3 == 0) goto L45
            boolean r3 = r4.isLaidOut()
            if (r3 == 0) goto L41
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L41
            goto L42
        L41:
            r0 = r2
        L42:
            r4.w(r0, r2)
        L45:
            r4.t()
            r4.z()
            if (r1 == 0) goto L50
            r4.invalidate()
        L50:
            r4.A0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public final int e() {
        if (this.D) {
            int i2 = this.P;
            b bVar = this.f720w0;
            if (i2 == 0) {
                return (int) bVar.f();
            }
            if (i2 == 2) {
                if (getHintMaxLines() == 1) {
                    return (int) (bVar.f() / 2.0f);
                }
                float f3 = bVar.f();
                TextPaint textPaint = bVar.P;
                textPaint.setTextSize(bVar.f1824i);
                textPaint.setTypeface(bVar.f1837s);
                textPaint.setLetterSpacing(bVar.W);
                return Math.max(0, (int) (f3 - ((-textPaint.ascent()) / 2.0f)));
            }
        }
        return 0;
    }

    public final h f() {
        h hVar = new h();
        hVar.c = a0.a.a0(getContext(), com.redhand.laugiytr.R.NP_MANAGER3.NP_MANAGER, 87);
        hVar.f2697d = a0.a.b0(getContext(), com.redhand.laugiytr.R.NP_MANAGER3.NP_MANAGER, d1.a.f832a);
        return hVar;
    }

    public final boolean g() {
        return this.D && !TextUtils.isEmpty(this.E) && (this.G instanceof w1.h);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f683e;
        if (editText == null) {
            return super.getBaseline();
        }
        return e() + getPaddingTop() + editText.getBaseline();
    }

    public k getBoxBackground() {
        int i2 = this.P;
        if (i2 == 1 || i2 == 2) {
            return this.G;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.V;
    }

    public int getBoxBackgroundMode() {
        return this.P;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.Q;
    }

    public float getBoxCornerRadiusBottomEnd() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f679b0;
        return layoutDirection == 1 ? this.M.f2246h.a(rectF) : this.M.f2245g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f679b0;
        return layoutDirection == 1 ? this.M.f2245g.a(rectF) : this.M.f2246h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f679b0;
        return layoutDirection == 1 ? this.M.f2243e.a(rectF) : this.M.f2244f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f679b0;
        return layoutDirection == 1 ? this.M.f2244f.a(rectF) : this.M.f2243e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f702n0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f704o0;
    }

    public int getBoxStrokeWidth() {
        return this.S;
    }

    public int getBoxStrokeWidthFocused() {
        return this.T;
    }

    public int getCounterMaxLength() {
        return this.f699m;
    }

    public CharSequence getCounterOverflowDescription() {
        m0 m0Var;
        if (this.f697l && this.f701n && (m0Var = this.f705p) != null) {
            return m0Var.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.A;
    }

    public ColorStateList getCounterTextColor() {
        return this.z;
    }

    public ColorStateList getCursorColor() {
        return this.B;
    }

    public ColorStateList getCursorErrorColor() {
        return this.C;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f694j0;
    }

    public EditText getEditText() {
        return this.f683e;
    }

    public CharSequence getEndIconContentDescription() {
        return this.c.f2554g.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.c.f2554g.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.c.f2560m;
    }

    public int getEndIconMode() {
        return this.c.f2556i;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.c.f2561n;
    }

    public CheckableImageButton getEndIconView() {
        return this.c.f2554g;
    }

    public CharSequence getError() {
        s sVar = this.f695k;
        if (sVar.f2589q) {
            return sVar.f2588p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f695k.f2592t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f695k.f2591s;
    }

    public int getErrorCurrentTextColors() {
        m0 m0Var = this.f695k.f2590r;
        if (m0Var != null) {
            return m0Var.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.c.c.getDrawable();
    }

    public CharSequence getHelperText() {
        s sVar = this.f695k;
        if (sVar.f2596x) {
            return sVar.f2595w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        m0 m0Var = this.f695k.f2597y;
        if (m0Var != null) {
            return m0Var.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.D) {
            return this.E;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f720w0.f();
    }

    public final int getHintCurrentCollapsedTextColor() {
        b bVar = this.f720w0;
        return bVar.g(bVar.f1828k);
    }

    public int getHintMaxLines() {
        return this.f720w0.f1817e0;
    }

    public ColorStateList getHintTextColor() {
        return this.f696k0;
    }

    public x getLengthCounter() {
        return this.f703o;
    }

    public int getMaxEms() {
        return this.f689h;
    }

    public int getMaxWidth() {
        return this.f693j;
    }

    public int getMinEms() {
        return this.f687g;
    }

    public int getMinWidth() {
        return this.f691i;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.c.f2554g.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.c.f2554g.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f713t) {
            return this.f711s;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f719w;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f717v;
    }

    public CharSequence getPrefixText() {
        return this.f678b.c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f678b.f2602b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f678b.f2602b;
    }

    public o getShapeAppearanceModel() {
        return this.M;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f678b.f2603d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f678b.f2603d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f678b.f2606g;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f678b.f2607h;
    }

    public CharSequence getSuffixText() {
        return this.c.f2563p;
    }

    public ColorStateList getSuffixTextColor() {
        return this.c.f2564q.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.c.f2564q;
    }

    public Typeface getTypeface() {
        return this.f680c0;
    }

    public final k h(boolean z) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.redhand.laugiytr.R.NP_MANAGER6.NP_MANAGER);
        float f3 = z ? dimensionPixelOffset : 0.0f;
        float dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.redhand.laugiytr.R.NP_MANAGER6.NP_MANAGER);
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(com.redhand.laugiytr.R.NP_MANAGER6.NP_MANAGER);
        m mVar = new m();
        m mVar2 = new m();
        m mVar3 = new m();
        m mVar4 = new m();
        int i2 = 0;
        g gVar = new g(i2);
        g gVar2 = new g(i2);
        g gVar3 = new g(i2);
        g gVar4 = new g(i2);
        t1.a aVar = new t1.a(f3);
        t1.a aVar2 = new t1.a(f3);
        t1.a aVar3 = new t1.a(dimensionPixelOffset);
        t1.a aVar4 = new t1.a(dimensionPixelOffset);
        o oVar = new o();
        oVar.f2240a = mVar;
        oVar.f2241b = mVar2;
        oVar.c = mVar3;
        oVar.f2242d = mVar4;
        oVar.f2243e = aVar;
        oVar.f2244f = aVar2;
        oVar.f2245g = aVar4;
        oVar.f2246h = aVar3;
        oVar.f2247i = gVar;
        oVar.f2248j = gVar2;
        oVar.f2249k = gVar3;
        oVar.f2250l = gVar4;
        Context context = getContext();
        Paint paint = k.E;
        TypedValue typedValueC0 = a0.a.c0(context, com.redhand.laugiytr.R.NP_MANAGER3.NP_MANAGER, k.class.getSimpleName());
        int i3 = typedValueC0.resourceId;
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i3 != 0 ? v.b.a(context, i3) : typedValueC0.data);
        k kVar = new k();
        kVar.k(context);
        kVar.n(colorStateListValueOf);
        kVar.m(dimensionPixelOffset2);
        kVar.setShapeAppearanceModel(oVar);
        i iVar = kVar.f2205b;
        if (iVar.f2193h == null) {
            iVar.f2193h = new Rect();
        }
        kVar.f2205b.f2193h.set(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        kVar.invalidateSelf();
        return kVar;
    }

    public final int i(int i2, boolean z) {
        return ((z || getPrefixText() == null) ? (!z || getSuffixText() == null) ? this.f683e.getCompoundPaddingLeft() : this.c.c() : this.f678b.a()) + i2;
    }

    public final int j(int i2, boolean z) {
        return i2 - ((z || getSuffixText() == null) ? (!z || getPrefixText() == null) ? this.f683e.getCompoundPaddingRight() : this.f678b.a() : this.c.c());
    }

    public final void k() {
        int i2 = this.P;
        if (i2 == 0) {
            this.G = null;
            this.K = null;
            this.L = null;
        } else if (i2 == 1) {
            this.G = new k(this.M);
            this.K = new k();
            this.L = new k();
        } else {
            if (i2 != 2) {
                throw new IllegalArgumentException(this.P + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.D || (this.G instanceof w1.h)) {
                this.G = new k(this.M);
            } else {
                o oVar = this.M;
                int i3 = w1.h.H;
                if (oVar == null) {
                    oVar = new o();
                }
                w1.g gVar = new w1.g(oVar, new RectF());
                w1.h hVar = new w1.h(gVar);
                hVar.G = gVar;
                this.G = hVar;
            }
            this.K = null;
            this.L = null;
        }
        u();
        z();
        if (this.P == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.Q = getResources().getDimensionPixelSize(com.redhand.laugiytr.R.NP_MANAGER6.NP_MANAGER);
            } else if (a0.a.G(getContext())) {
                this.Q = getResources().getDimensionPixelSize(com.redhand.laugiytr.R.NP_MANAGER6.NP_MANAGER);
            }
        }
        a();
        if (this.P != 0) {
            v();
        }
        EditText editText = this.f683e;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i4 = this.P;
                if (i4 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i4 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l() {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.l():void");
    }

    public final void n(m0 m0Var, int i2) {
        try {
            m0Var.setTextAppearance(i2);
            if (m0Var.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        m0Var.setTextAppearance(com.redhand.laugiytr.R.NP_MANAGER15.NP_MANAGER);
        m0Var.setTextColor(v.b.a(getContext(), com.redhand.laugiytr.R.NP_MANAGER5.NP_MANAGER));
    }

    public final boolean o() {
        s sVar = this.f695k;
        return (sVar.f2587o != 1 || sVar.f2590r == null || TextUtils.isEmpty(sVar.f2588p)) ? false : true;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f720w0.i(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        p pVar = this.c;
        pVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.C0 = false;
        if (this.f683e != null && this.f683e.getMeasuredHeight() < (iMax = Math.max(pVar.getMeasuredHeight(), this.f678b.getMeasuredHeight()))) {
            this.f683e.setMinimumHeight(iMax);
            z = true;
        }
        boolean zS = s();
        if (z || zS) {
            this.f683e.post(new androidx.emoji2.text.u(9, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        float fDescent;
        int i6;
        int compoundPaddingTop;
        super.onLayout(z, i2, i3, i4, i5);
        EditText editText = this.f683e;
        if (editText != null) {
            Rect rect = this.W;
            c.a(this, editText, rect);
            k kVar = this.K;
            if (kVar != null) {
                int i7 = rect.bottom;
                kVar.setBounds(rect.left, i7 - this.S, rect.right, i7);
            }
            k kVar2 = this.L;
            if (kVar2 != null) {
                int i8 = rect.bottom;
                kVar2.setBounds(rect.left, i8 - this.T, rect.right, i8);
            }
            if (this.D) {
                float textSize = this.f683e.getTextSize();
                b bVar = this.f720w0;
                float f3 = bVar.f1822h;
                TextPaint textPaint = bVar.P;
                if (f3 != textSize) {
                    bVar.f1822h = textSize;
                    bVar.j(false);
                }
                int gravity = this.f683e.getGravity();
                int i9 = (gravity & (-113)) | 48;
                if (bVar.f1820g != i9) {
                    bVar.f1820g = i9;
                    bVar.j(false);
                }
                if (bVar.f1818f != gravity) {
                    bVar.f1818f = gravity;
                    bVar.j(false);
                }
                Rect rectD = d(rect);
                int i10 = rectD.left;
                int i11 = rectD.top;
                int i12 = rectD.right;
                int i13 = rectD.bottom;
                Rect rect2 = bVar.f1814d;
                if (rect2.left != i10 || rect2.top != i11 || rect2.right != i12 || rect2.bottom != i13) {
                    rect2.set(i10, i11, i12, i13);
                    bVar.N = true;
                }
                if (this.f683e == null) {
                    throw new IllegalStateException();
                }
                if (getHintMaxLines() == 1) {
                    textPaint.setTextSize(bVar.f1822h);
                    textPaint.setTypeface(bVar.f1840v);
                    textPaint.setLetterSpacing(bVar.X);
                    fDescent = -textPaint.ascent();
                } else {
                    textPaint.setTextSize(bVar.f1822h);
                    textPaint.setTypeface(bVar.f1840v);
                    textPaint.setLetterSpacing(bVar.X);
                    fDescent = bVar.f1830l * (textPaint.descent() + (-textPaint.ascent()));
                }
                int compoundPaddingLeft = this.f683e.getCompoundPaddingLeft() + rect.left;
                Rect rect3 = this.f677a0;
                rect3.left = compoundPaddingLeft;
                if (this.P != 1 || this.f683e.getMinLines() > 1) {
                    if (this.P != 0 || getHintMaxLines() == 1) {
                        i6 = 0;
                    } else {
                        textPaint.setTextSize(bVar.f1822h);
                        textPaint.setTypeface(bVar.f1840v);
                        textPaint.setLetterSpacing(bVar.X);
                        i6 = (int) ((-textPaint.ascent()) / 2.0f);
                    }
                    compoundPaddingTop = (this.f683e.getCompoundPaddingTop() + rect.top) - i6;
                } else {
                    compoundPaddingTop = (int) (rect.centerY() - (fDescent / 2.0f));
                }
                rect3.top = compoundPaddingTop;
                rect3.right = rect.right - this.f683e.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.P != 1 || this.f683e.getMinLines() > 1) ? rect.bottom - this.f683e.getCompoundPaddingBottom() : (int) (rect3.top + fDescent);
                rect3.bottom = compoundPaddingBottom;
                int i14 = rect3.left;
                int i15 = rect3.top;
                int i16 = rect3.right;
                Rect rect4 = bVar.c;
                if (rect4.left != i14 || rect4.top != i15 || rect4.right != i16 || rect4.bottom != compoundPaddingBottom || true != bVar.f1829k0) {
                    rect4.set(i14, i15, i16, compoundPaddingBottom);
                    bVar.N = true;
                    bVar.f1829k0 = true;
                }
                bVar.j(false);
                if (!g() || this.f718v0) {
                    return;
                }
                l();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        float f3;
        EditText editText;
        super.onMeasure(i2, i3);
        boolean z = this.C0;
        p pVar = this.c;
        if (!z) {
            pVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.C0 = true;
        }
        if (this.f715u != null && (editText = this.f683e) != null) {
            this.f715u.setGravity(editText.getGravity());
            this.f715u.setPadding(this.f683e.getCompoundPaddingLeft(), this.f683e.getCompoundPaddingTop(), this.f683e.getCompoundPaddingRight(), this.f683e.getCompoundPaddingBottom());
        }
        pVar.m();
        if (getHintMaxLines() == 1) {
            return;
        }
        int measuredWidth = (this.f683e.getMeasuredWidth() - this.f683e.getCompoundPaddingLeft()) - this.f683e.getCompoundPaddingRight();
        b bVar = this.f720w0;
        TextPaint textPaint = bVar.P;
        textPaint.setTextSize(bVar.f1824i);
        textPaint.setTypeface(bVar.f1837s);
        textPaint.setLetterSpacing(bVar.W);
        float f4 = measuredWidth;
        bVar.f1825i0 = bVar.e(bVar.f1819f0, textPaint, bVar.B, (bVar.f1824i / bVar.f1822h) * f4, bVar.D).getHeight();
        textPaint.setTextSize(bVar.f1822h);
        textPaint.setTypeface(bVar.f1840v);
        textPaint.setLetterSpacing(bVar.X);
        bVar.f1827j0 = bVar.e(bVar.f1817e0, textPaint, bVar.B, f4, bVar.D).getHeight();
        EditText editText2 = this.f683e;
        Rect rect = this.W;
        c.a(this, editText2, rect);
        Rect rectD = d(rect);
        int i4 = rectD.left;
        int i5 = rectD.top;
        int i6 = rectD.right;
        int i7 = rectD.bottom;
        Rect rect2 = bVar.f1814d;
        if (rect2.left != i4 || rect2.top != i5 || rect2.right != i6 || rect2.bottom != i7) {
            rect2.set(i4, i5, i6, i7);
            bVar.N = true;
        }
        v();
        a();
        if (this.f683e == null) {
            return;
        }
        int i8 = bVar.f1827j0;
        if (i8 != -1) {
            f3 = i8;
        } else {
            TextPaint textPaint2 = bVar.P;
            textPaint2.setTextSize(bVar.f1822h);
            textPaint2.setTypeface(bVar.f1840v);
            textPaint2.setLetterSpacing(bVar.X);
            f3 = -textPaint2.ascent();
        }
        if (this.f711s != null) {
            TextPaint textPaint3 = new TextPaint(129);
            textPaint3.set(this.f715u.getPaint());
            textPaint3.setTextSize(this.f715u.getTextSize());
            textPaint3.setTypeface(this.f715u.getTypeface());
            textPaint3.setLetterSpacing(this.f715u.getLetterSpacing());
            o1.g gVar = new o1.g(this.f711s, textPaint3, measuredWidth);
            gVar.f1861k = getLayoutDirection() == 1;
            gVar.f1860j = true;
            float lineSpacingExtra = this.f715u.getLineSpacingExtra();
            float lineSpacingMultiplier = this.f715u.getLineSpacingMultiplier();
            gVar.f1857g = lineSpacingExtra;
            gVar.f1858h = lineSpacingMultiplier;
            gVar.f1863m = new i1.a(this);
            f = (this.P == 1 ? bVar.f() + this.Q + this.f681d : 0.0f) + gVar.a().getHeight();
        }
        float fMax = Math.max(f3, f);
        if (this.f683e.getMeasuredHeight() < fMax) {
            this.f683e.setMinimumHeight(Math.round(fMax));
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof y)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        y yVar = (y) parcelable;
        super.onRestoreInstanceState(yVar.f1560a);
        setError(yVar.c);
        if (yVar.f2613d) {
            post(new androidx.fragment.app.b(11, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        boolean z = i2 == 1;
        if (z != this.N) {
            d dVar = this.M.f2243e;
            RectF rectF = this.f679b0;
            float fA = dVar.a(rectF);
            float fA2 = this.M.f2244f.a(rectF);
            float fA3 = this.M.f2246h.a(rectF);
            float fA4 = this.M.f2245g.a(rectF);
            o oVar = this.M;
            e eVar = oVar.f2240a;
            e eVar2 = oVar.f2241b;
            e eVar3 = oVar.f2242d;
            e eVar4 = oVar.c;
            g gVar = new g(0);
            g gVar2 = new g(0);
            g gVar3 = new g(0);
            g gVar4 = new g(0);
            t1.a aVar = new t1.a(fA2);
            t1.a aVar2 = new t1.a(fA);
            t1.a aVar3 = new t1.a(fA4);
            t1.a aVar4 = new t1.a(fA3);
            o oVar2 = new o();
            oVar2.f2240a = eVar2;
            oVar2.f2241b = eVar;
            oVar2.c = eVar3;
            oVar2.f2242d = eVar4;
            oVar2.f2243e = aVar;
            oVar2.f2244f = aVar2;
            oVar2.f2245g = aVar4;
            oVar2.f2246h = aVar3;
            oVar2.f2247i = gVar;
            oVar2.f2248j = gVar2;
            oVar2.f2249k = gVar3;
            oVar2.f2250l = gVar4;
            this.N = z;
            setShapeAppearanceModel(oVar2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        y yVar = new y(super.onSaveInstanceState());
        if (o()) {
            yVar.c = getError();
        }
        p pVar = this.c;
        yVar.f2613d = pVar.f2556i != 0 && pVar.f2554g.f641d;
        return yVar;
    }

    public final void p(Editable editable) {
        ((f0.h) this.f703o).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z = this.f701n;
        int i2 = this.f699m;
        if (i2 == -1) {
            this.f705p.setText(String.valueOf(length));
            this.f705p.setContentDescription(null);
            this.f701n = false;
        } else {
            this.f701n = length > i2;
            Context context = getContext();
            this.f705p.setContentDescription(context.getString(this.f701n ? com.redhand.laugiytr.R.NP_MANAGER14.NP_MANAGER : com.redhand.laugiytr.R.NP_MANAGER14.NP_MANAGER, Integer.valueOf(length), Integer.valueOf(this.f699m)));
            if (z != this.f701n) {
                q();
            }
            String str = d0.b.f819b;
            d0.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? d0.b.f821e : d0.b.f820d;
            m0 m0Var = this.f705p;
            String string = getContext().getString(com.redhand.laugiytr.R.NP_MANAGER14.NP_MANAGER, Integer.valueOf(length), Integer.valueOf(this.f699m));
            bVar.getClass();
            d0.g gVar = d0.h.f829a;
            m0Var.setText(string != null ? bVar.c(string).toString() : null);
        }
        if (this.f683e == null || z == this.f701n) {
            return;
        }
        w(false, false);
        z();
        t();
    }

    public final void q() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        m0 m0Var = this.f705p;
        if (m0Var != null) {
            n(m0Var, this.f701n ? this.f707q : this.f709r);
            if (!this.f701n && (colorStateList2 = this.z) != null) {
                this.f705p.setTextColor(colorStateList2);
            }
            if (!this.f701n || (colorStateList = this.A) == null) {
                return;
            }
            this.f705p.setTextColor(colorStateList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r() {
        /*
            r4 = this;
            android.content.res.ColorStateList r0 = r4.B
            if (r0 == 0) goto L5
            goto L26
        L5:
            android.content.Context r0 = r4.getContext()
            r1 = 2130903298(0x7f030102, float:1.741341E38)
            android.util.TypedValue r1 = a0.a.Z(r0, r1)
            r2 = 0
            if (r1 != 0) goto L15
        L13:
            r0 = r2
            goto L26
        L15:
            int r3 = r1.resourceId
            if (r3 == 0) goto L1e
            android.content.res.ColorStateList r0 = t1.e.s(r0, r3)
            goto L26
        L1e:
            int r0 = r1.data
            if (r0 == 0) goto L13
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
        L26:
            android.widget.EditText r1 = r4.f683e
            if (r1 == 0) goto L51
            android.graphics.drawable.Drawable r1 = androidx.lifecycle.b0.e(r1)
            if (r1 != 0) goto L31
            goto L51
        L31:
            android.widget.EditText r1 = r4.f683e
            android.graphics.drawable.Drawable r1 = androidx.lifecycle.b0.e(r1)
            android.graphics.drawable.Drawable r1 = r1.mutate()
            boolean r2 = r4.o()
            if (r2 != 0) goto L49
            f.m0 r2 = r4.f705p
            if (r2 == 0) goto L4e
            boolean r2 = r4.f701n
            if (r2 == 0) goto L4e
        L49:
            android.content.res.ColorStateList r2 = r4.C
            if (r2 == 0) goto L4e
            r0 = r2
        L4e:
            r1.setTintList(r0)
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.r():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean s() {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.s():boolean");
    }

    public void setBoxBackgroundColor(int i2) {
        if (this.V != i2) {
            this.V = i2;
            this.f706p0 = i2;
            this.f710r0 = i2;
            this.f712s0 = i2;
            c();
        }
    }

    public void setBoxBackgroundColorResource(int i2) {
        setBoxBackgroundColor(v.b.a(getContext(), i2));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f706p0 = defaultColor;
        this.V = defaultColor;
        this.f708q0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f710r0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f712s0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        c();
    }

    public void setBoxBackgroundMode(int i2) {
        if (i2 == this.P) {
            return;
        }
        this.P = i2;
        if (this.f683e != null) {
            k();
        }
    }

    public void setBoxCollapsedPaddingTop(int i2) {
        this.Q = i2;
    }

    public void setBoxCornerFamily(int i2) {
        n nVarF = this.M.f();
        d dVar = this.M.f2243e;
        nVarF.f2229a = e.k(i2);
        nVarF.f2232e = dVar;
        d dVar2 = this.M.f2244f;
        nVarF.f2230b = e.k(i2);
        nVarF.f2233f = dVar2;
        d dVar3 = this.M.f2246h;
        nVarF.f2231d = e.k(i2);
        nVarF.f2235h = dVar3;
        d dVar4 = this.M.f2245g;
        nVarF.c = e.k(i2);
        nVarF.f2234g = dVar4;
        this.M = nVarF.a();
        c();
    }

    public void setBoxStrokeColor(int i2) {
        if (this.f702n0 != i2) {
            this.f702n0 = i2;
            z();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f698l0 = colorStateList.getDefaultColor();
            this.f714t0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f700m0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f702n0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f702n0 != colorStateList.getDefaultColor()) {
            this.f702n0 = colorStateList.getDefaultColor();
        }
        z();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f704o0 != colorStateList) {
            this.f704o0 = colorStateList;
            z();
        }
    }

    public void setBoxStrokeWidth(int i2) {
        this.S = i2;
        z();
    }

    public void setBoxStrokeWidthFocused(int i2) {
        this.T = i2;
        z();
    }

    public void setBoxStrokeWidthFocusedResource(int i2) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i2));
    }

    public void setBoxStrokeWidthResource(int i2) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i2));
    }

    public void setCounterEnabled(boolean z) {
        if (this.f697l != z) {
            s sVar = this.f695k;
            if (z) {
                m0 m0Var = new m0(getContext(), null);
                this.f705p = m0Var;
                m0Var.setId(com.redhand.laugiytr.R.NP_MANAGER8.NP_MANAGER);
                Typeface typeface = this.f680c0;
                if (typeface != null) {
                    this.f705p.setTypeface(typeface);
                }
                this.f705p.setMaxLines(1);
                sVar.a(this.f705p, 2);
                ((ViewGroup.MarginLayoutParams) this.f705p.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.redhand.laugiytr.R.NP_MANAGER6.NP_MANAGER));
                q();
                if (this.f705p != null) {
                    EditText editText = this.f683e;
                    p(editText != null ? editText.getText() : null);
                }
            } else {
                sVar.g(this.f705p, 2);
                this.f705p = null;
            }
            this.f697l = z;
        }
    }

    public void setCounterMaxLength(int i2) {
        if (this.f699m != i2) {
            if (i2 > 0) {
                this.f699m = i2;
            } else {
                this.f699m = -1;
            }
            if (!this.f697l || this.f705p == null) {
                return;
            }
            EditText editText = this.f683e;
            p(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i2) {
        if (this.f707q != i2) {
            this.f707q = i2;
            q();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            q();
        }
    }

    public void setCounterTextAppearance(int i2) {
        if (this.f709r != i2) {
            this.f709r = i2;
            q();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.z != colorStateList) {
            this.z = colorStateList;
            q();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.B != colorStateList) {
            this.B = colorStateList;
            r();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.C != colorStateList) {
            this.C = colorStateList;
            if (o() || (this.f705p != null && this.f701n)) {
                r();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f694j0 = colorStateList;
        this.f696k0 = colorStateList;
        if (this.f683e != null) {
            w(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        m(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.c.f2554g.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.c.f2554g.setCheckable(z);
    }

    public void setEndIconContentDescription(int i2) {
        p pVar = this.c;
        CharSequence text = i2 != 0 ? pVar.getResources().getText(i2) : null;
        CheckableImageButton checkableImageButton = pVar.f2554g;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i2) {
        p pVar = this.c;
        Drawable drawableR = i2 != 0 ? a0.a.r(pVar.getContext(), i2) : null;
        TextInputLayout textInputLayout = pVar.f2549a;
        CheckableImageButton checkableImageButton = pVar.f2554g;
        checkableImageButton.setImageDrawable(drawableR);
        if (drawableR != null) {
            e.a(textInputLayout, checkableImageButton, pVar.f2558k, pVar.f2559l);
            e.I(textInputLayout, checkableImageButton, pVar.f2558k);
        }
    }

    public void setEndIconMinSize(int i2) {
        p pVar = this.c;
        if (i2 < 0) {
            pVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i2 != pVar.f2560m) {
            pVar.f2560m = i2;
            CheckableImageButton checkableImageButton = pVar.f2554g;
            checkableImageButton.setMinimumWidth(i2);
            checkableImageButton.setMinimumHeight(i2);
            CheckableImageButton checkableImageButton2 = pVar.c;
            checkableImageButton2.setMinimumWidth(i2);
            checkableImageButton2.setMinimumHeight(i2);
        }
    }

    public void setEndIconMode(int i2) {
        this.c.g(i2);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        p pVar = this.c;
        CheckableImageButton checkableImageButton = pVar.f2554g;
        View.OnLongClickListener onLongClickListener = pVar.f2562o;
        checkableImageButton.setOnClickListener(onClickListener);
        e.K(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        p pVar = this.c;
        pVar.f2562o = onLongClickListener;
        CheckableImageButton checkableImageButton = pVar.f2554g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        e.K(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        p pVar = this.c;
        pVar.f2561n = scaleType;
        pVar.f2554g.setScaleType(scaleType);
        pVar.c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        p pVar = this.c;
        if (pVar.f2558k != colorStateList) {
            pVar.f2558k = colorStateList;
            e.a(pVar.f2549a, pVar.f2554g, colorStateList, pVar.f2559l);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        p pVar = this.c;
        if (pVar.f2559l != mode) {
            pVar.f2559l = mode;
            e.a(pVar.f2549a, pVar.f2554g, pVar.f2558k, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.c.h(z);
    }

    public void setError(CharSequence charSequence) {
        s sVar = this.f695k;
        if (!sVar.f2589q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            sVar.f();
            return;
        }
        sVar.c();
        sVar.f2588p = charSequence;
        sVar.f2590r.setText(charSequence);
        int i2 = sVar.f2586n;
        if (i2 != 1) {
            sVar.f2587o = 1;
        }
        sVar.i(i2, sVar.f2587o, sVar.h(sVar.f2590r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i2) {
        s sVar = this.f695k;
        sVar.f2592t = i2;
        m0 m0Var = sVar.f2590r;
        if (m0Var != null) {
            m0Var.setAccessibilityLiveRegion(i2);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        s sVar = this.f695k;
        sVar.f2591s = charSequence;
        m0 m0Var = sVar.f2590r;
        if (m0Var != null) {
            m0Var.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        s sVar = this.f695k;
        TextInputLayout textInputLayout = sVar.f2580h;
        if (sVar.f2589q == z) {
            return;
        }
        sVar.c();
        if (z) {
            m0 m0Var = new m0(sVar.f2579g, null);
            sVar.f2590r = m0Var;
            m0Var.setId(com.redhand.laugiytr.R.NP_MANAGER8.NP_MANAGER);
            sVar.f2590r.setTextAlignment(5);
            Typeface typeface = sVar.B;
            if (typeface != null) {
                sVar.f2590r.setTypeface(typeface);
            }
            int i2 = sVar.f2593u;
            sVar.f2593u = i2;
            m0 m0Var2 = sVar.f2590r;
            if (m0Var2 != null) {
                sVar.f2580h.n(m0Var2, i2);
            }
            ColorStateList colorStateList = sVar.f2594v;
            sVar.f2594v = colorStateList;
            m0 m0Var3 = sVar.f2590r;
            if (m0Var3 != null && colorStateList != null) {
                m0Var3.setTextColor(colorStateList);
            }
            CharSequence charSequence = sVar.f2591s;
            sVar.f2591s = charSequence;
            m0 m0Var4 = sVar.f2590r;
            if (m0Var4 != null) {
                m0Var4.setContentDescription(charSequence);
            }
            int i3 = sVar.f2592t;
            sVar.f2592t = i3;
            m0 m0Var5 = sVar.f2590r;
            if (m0Var5 != null) {
                m0Var5.setAccessibilityLiveRegion(i3);
            }
            sVar.f2590r.setVisibility(4);
            sVar.a(sVar.f2590r, 0);
        } else {
            sVar.f();
            sVar.g(sVar.f2590r, 0);
            sVar.f2590r = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        sVar.f2589q = z;
    }

    public void setErrorIconDrawable(int i2) {
        p pVar = this.c;
        pVar.i(i2 != 0 ? a0.a.r(pVar.getContext(), i2) : null);
        e.I(pVar.f2549a, pVar.c, pVar.f2551d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        p pVar = this.c;
        CheckableImageButton checkableImageButton = pVar.c;
        View.OnLongClickListener onLongClickListener = pVar.f2553f;
        checkableImageButton.setOnClickListener(onClickListener);
        e.K(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        p pVar = this.c;
        pVar.f2553f = onLongClickListener;
        CheckableImageButton checkableImageButton = pVar.c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        e.K(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        p pVar = this.c;
        if (pVar.f2551d != colorStateList) {
            pVar.f2551d = colorStateList;
            e.a(pVar.f2549a, pVar.c, colorStateList, pVar.f2552e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        p pVar = this.c;
        if (pVar.f2552e != mode) {
            pVar.f2552e = mode;
            e.a(pVar.f2549a, pVar.c, pVar.f2551d, mode);
        }
    }

    public void setErrorTextAppearance(int i2) {
        s sVar = this.f695k;
        sVar.f2593u = i2;
        m0 m0Var = sVar.f2590r;
        if (m0Var != null) {
            sVar.f2580h.n(m0Var, i2);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        s sVar = this.f695k;
        sVar.f2594v = colorStateList;
        m0 m0Var = sVar.f2590r;
        if (m0Var == null || colorStateList == null) {
            return;
        }
        m0Var.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.f722x0 != z) {
            this.f722x0 = z;
            w(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        s sVar = this.f695k;
        if (zIsEmpty) {
            if (sVar.f2596x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!sVar.f2596x) {
            setHelperTextEnabled(true);
        }
        sVar.c();
        sVar.f2595w = charSequence;
        sVar.f2597y.setText(charSequence);
        int i2 = sVar.f2586n;
        if (i2 != 2) {
            sVar.f2587o = 2;
        }
        sVar.i(i2, sVar.f2587o, sVar.h(sVar.f2597y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        s sVar = this.f695k;
        sVar.A = colorStateList;
        m0 m0Var = sVar.f2597y;
        if (m0Var == null || colorStateList == null) {
            return;
        }
        m0Var.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        s sVar = this.f695k;
        TextInputLayout textInputLayout = sVar.f2580h;
        if (sVar.f2596x == z) {
            return;
        }
        sVar.c();
        if (z) {
            m0 m0Var = new m0(sVar.f2579g, null);
            sVar.f2597y = m0Var;
            m0Var.setId(com.redhand.laugiytr.R.NP_MANAGER8.NP_MANAGER);
            sVar.f2597y.setTextAlignment(5);
            Typeface typeface = sVar.B;
            if (typeface != null) {
                sVar.f2597y.setTypeface(typeface);
            }
            sVar.f2597y.setVisibility(4);
            sVar.f2597y.setAccessibilityLiveRegion(1);
            int i2 = sVar.z;
            sVar.z = i2;
            m0 m0Var2 = sVar.f2597y;
            if (m0Var2 != null) {
                m0Var2.setTextAppearance(i2);
            }
            ColorStateList colorStateList = sVar.A;
            sVar.A = colorStateList;
            m0 m0Var3 = sVar.f2597y;
            if (m0Var3 != null && colorStateList != null) {
                m0Var3.setTextColor(colorStateList);
            }
            sVar.a(sVar.f2597y, 1);
            sVar.f2597y.setAccessibilityDelegate(new r(sVar));
        } else {
            sVar.c();
            int i3 = sVar.f2586n;
            if (i3 == 2) {
                sVar.f2587o = 0;
            }
            sVar.i(i3, sVar.f2587o, sVar.h(sVar.f2597y, ""));
            sVar.g(sVar.f2597y, 1);
            sVar.f2597y = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        sVar.f2596x = z;
    }

    public void setHelperTextTextAppearance(int i2) {
        s sVar = this.f695k;
        sVar.z = i2;
        m0 m0Var = sVar.f2597y;
        if (m0Var != null) {
            m0Var.setTextAppearance(i2);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.D) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.y0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.D) {
            this.D = z;
            if (z) {
                CharSequence hint = this.f683e.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.E)) {
                        setHint(hint);
                    }
                    this.f683e.setHint((CharSequence) null);
                }
                this.F = true;
            } else {
                this.F = false;
                if (!TextUtils.isEmpty(this.E) && TextUtils.isEmpty(this.f683e.getHint())) {
                    this.f683e.setHint(this.E);
                }
                setHintInternal(null);
            }
            if (this.f683e != null) {
                v();
            }
        }
    }

    public void setHintMaxLines(int i2) {
        b bVar = this.f720w0;
        if (i2 != bVar.f1819f0) {
            bVar.f1819f0 = i2;
            bVar.j(false);
        }
        if (i2 != bVar.f1817e0) {
            bVar.f1817e0 = i2;
            bVar.j(false);
        }
        requestLayout();
    }

    public void setHintTextAppearance(int i2) {
        b bVar = this.f720w0;
        TextInputLayout textInputLayout = bVar.f1809a;
        q1.d dVar = new q1.d(textInputLayout.getContext(), i2);
        ColorStateList colorStateList = dVar.f2070k;
        if (colorStateList != null) {
            bVar.f1828k = colorStateList;
        }
        float f3 = dVar.f2071l;
        if (f3 != 0.0f) {
            bVar.f1824i = f3;
        }
        ColorStateList colorStateList2 = dVar.f2061a;
        if (colorStateList2 != null) {
            bVar.V = colorStateList2;
        }
        bVar.T = dVar.f2065f;
        bVar.U = dVar.f2066g;
        bVar.S = dVar.f2067h;
        bVar.W = dVar.f2069j;
        q1.a aVar = bVar.z;
        if (aVar != null) {
            aVar.c = true;
        }
        androidx.emoji2.text.n nVar = new androidx.emoji2.text.n(19, bVar);
        dVar.a();
        bVar.z = new q1.a(nVar, dVar.f2075p);
        dVar.b(textInputLayout.getContext(), bVar.z);
        bVar.j(false);
        this.f696k0 = bVar.f1828k;
        if (this.f683e != null) {
            w(false, false);
            v();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f696k0 != colorStateList) {
            if (this.f694j0 == null) {
                b bVar = this.f720w0;
                if (bVar.f1828k != colorStateList) {
                    bVar.f1828k = colorStateList;
                    bVar.j(false);
                }
            }
            this.f696k0 = colorStateList;
            if (this.f683e != null) {
                w(false, false);
            }
        }
    }

    public void setLengthCounter(x xVar) {
        this.f703o = xVar;
    }

    public void setMaxEms(int i2) {
        this.f689h = i2;
        EditText editText = this.f683e;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMaxEms(i2);
    }

    public void setMaxWidth(int i2) {
        this.f693j = i2;
        EditText editText = this.f683e;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMaxWidth(i2);
    }

    public void setMaxWidthResource(int i2) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i2));
    }

    public void setMinEms(int i2) {
        this.f687g = i2;
        EditText editText = this.f683e;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMinEms(i2);
    }

    public void setMinWidth(int i2) {
        this.f691i = i2;
        EditText editText = this.f683e;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMinWidth(i2);
    }

    public void setMinWidthResource(int i2) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i2));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i2) {
        p pVar = this.c;
        pVar.f2554g.setContentDescription(i2 != 0 ? pVar.getResources().getText(i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i2) {
        p pVar = this.c;
        pVar.f2554g.setImageDrawable(i2 != 0 ? a0.a.r(pVar.getContext(), i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        p pVar = this.c;
        if (z && pVar.f2556i != 1) {
            pVar.g(1);
        } else if (z) {
            pVar.getClass();
        } else {
            pVar.g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        p pVar = this.c;
        pVar.f2558k = colorStateList;
        e.a(pVar.f2549a, pVar.f2554g, colorStateList, pVar.f2559l);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        p pVar = this.c;
        pVar.f2559l = mode;
        e.a(pVar.f2549a, pVar.f2554g, pVar.f2558k, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f715u == null) {
            m0 m0Var = new m0(getContext(), null);
            this.f715u = m0Var;
            m0Var.setId(com.redhand.laugiytr.R.NP_MANAGER8.NP_MANAGER);
            this.f715u.setImportantForAccessibility(1);
            this.f715u.setAccessibilityLiveRegion(1);
            h hVarF = f();
            this.f721x = hVarF;
            hVarF.f2696b = 67L;
            this.f723y = f();
            setPlaceholderTextAppearance(this.f719w);
            setPlaceholderTextColor(this.f717v);
            f0.m0.j(this.f715u, new com.google.android.material.datepicker.b(2));
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f713t) {
                setPlaceholderTextEnabled(true);
            }
            this.f711s = charSequence;
        }
        EditText editText = this.f683e;
        x(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i2) {
        this.f719w = i2;
        m0 m0Var = this.f715u;
        if (m0Var != null) {
            m0Var.setTextAppearance(i2);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f717v != colorStateList) {
            this.f717v = colorStateList;
            m0 m0Var = this.f715u;
            if (m0Var == null || colorStateList == null) {
                return;
            }
            m0Var.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        u uVar = this.f678b;
        uVar.getClass();
        uVar.c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        uVar.f2602b.setText(charSequence);
        uVar.e();
    }

    public void setPrefixTextAppearance(int i2) {
        this.f678b.f2602b.setTextAppearance(i2);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f678b.f2602b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(o oVar) {
        k kVar = this.G;
        if (kVar == null || kVar.f2205b.f2187a == oVar) {
            return;
        }
        this.M = oVar;
        c();
    }

    public void setStartIconCheckable(boolean z) {
        this.f678b.f2603d.setCheckable(z);
    }

    public void setStartIconContentDescription(int i2) {
        setStartIconContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setStartIconDrawable(int i2) {
        setStartIconDrawable(i2 != 0 ? a0.a.r(getContext(), i2) : null);
    }

    public void setStartIconMinSize(int i2) {
        u uVar = this.f678b;
        if (i2 < 0) {
            uVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i2 != uVar.f2606g) {
            uVar.f2606g = i2;
            CheckableImageButton checkableImageButton = uVar.f2603d;
            checkableImageButton.setMinimumWidth(i2);
            checkableImageButton.setMinimumHeight(i2);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        u uVar = this.f678b;
        CheckableImageButton checkableImageButton = uVar.f2603d;
        View.OnLongClickListener onLongClickListener = uVar.f2608i;
        checkableImageButton.setOnClickListener(onClickListener);
        e.K(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        u uVar = this.f678b;
        uVar.f2608i = onLongClickListener;
        CheckableImageButton checkableImageButton = uVar.f2603d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        e.K(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        u uVar = this.f678b;
        uVar.f2607h = scaleType;
        uVar.f2603d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        u uVar = this.f678b;
        if (uVar.f2604e != colorStateList) {
            uVar.f2604e = colorStateList;
            e.a(uVar.f2601a, uVar.f2603d, colorStateList, uVar.f2605f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        u uVar = this.f678b;
        if (uVar.f2605f != mode) {
            uVar.f2605f = mode;
            e.a(uVar.f2601a, uVar.f2603d, uVar.f2604e, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.f678b.c(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        p pVar = this.c;
        pVar.getClass();
        pVar.f2563p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        pVar.f2564q.setText(charSequence);
        pVar.n();
    }

    public void setSuffixTextAppearance(int i2) {
        this.c.f2564q.setTextAppearance(i2);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.c.f2564q.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(w wVar) {
        EditText editText = this.f683e;
        if (editText != null) {
            f0.m0.j(editText, wVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f680c0) {
            this.f680c0 = typeface;
            this.f720w0.n(typeface);
            s sVar = this.f695k;
            if (typeface != sVar.B) {
                sVar.B = typeface;
                m0 m0Var = sVar.f2590r;
                if (m0Var != null) {
                    m0Var.setTypeface(typeface);
                }
                m0 m0Var2 = sVar.f2597y;
                if (m0Var2 != null) {
                    m0Var2.setTypeface(typeface);
                }
            }
            m0 m0Var3 = this.f705p;
            if (m0Var3 != null) {
                m0Var3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        Drawable background;
        m0 m0Var;
        EditText editText = this.f683e;
        if (editText == null || this.P != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = u0.f1189a;
        Drawable drawableMutate = background.mutate();
        if (o()) {
            drawableMutate.setColorFilter(f.t.b(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f701n && (m0Var = this.f705p) != null) {
            drawableMutate.setColorFilter(f.t.b(m0Var.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.f683e.refreshDrawableState();
        }
    }

    public final void u() {
        EditText editText = this.f683e;
        if (editText == null || this.G == null) {
            return;
        }
        if ((this.J || editText.getBackground() == null) && this.P != 0) {
            this.f683e.setBackground(getEditTextBoxBackground());
            this.J = true;
        }
    }

    public final void v() {
        if (this.P != 1) {
            FrameLayout frameLayout = this.f676a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iE = e();
            if (iE != layoutParams.topMargin) {
                layoutParams.topMargin = iE;
                frameLayout.requestLayout();
            }
        }
    }

    public final void w(boolean z, boolean z2) {
        ColorStateList colorStateList;
        m0 m0Var;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f683e;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f683e;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f694j0;
        b bVar = this.f720w0;
        if (colorStateList2 != null) {
            bVar.k(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f694j0;
            bVar.k(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f714t0) : this.f714t0));
        } else if (o()) {
            m0 m0Var2 = this.f695k.f2590r;
            bVar.k(m0Var2 != null ? m0Var2.getTextColors() : null);
        } else if (this.f701n && (m0Var = this.f705p) != null) {
            bVar.k(m0Var.getTextColors());
        } else if (z4 && (colorStateList = this.f696k0) != null && bVar.f1828k != colorStateList) {
            bVar.f1828k = colorStateList;
            bVar.j(false);
        }
        p pVar = this.c;
        u uVar = this.f678b;
        if (z3 || !this.f722x0 || (isEnabled() && z4)) {
            if (z2 || this.f718v0) {
                ValueAnimator valueAnimator = this.f724z0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f724z0.cancel();
                }
                if (z && this.y0) {
                    b(1.0f);
                } else {
                    bVar.m(1.0f);
                }
                this.f718v0 = false;
                if (g()) {
                    l();
                }
                EditText editText3 = this.f683e;
                x(editText3 != null ? editText3.getText() : null);
                uVar.f2609j = false;
                uVar.e();
                pVar.f2565r = false;
                pVar.n();
                return;
            }
            return;
        }
        if (z2 || !this.f718v0) {
            ValueAnimator valueAnimator2 = this.f724z0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f724z0.cancel();
            }
            if (z && this.y0) {
                b(0.0f);
            } else {
                bVar.m(0.0f);
            }
            if (g() && !((w1.h) this.G).G.f2526r.isEmpty() && g()) {
                ((w1.h) this.G).t(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f718v0 = true;
            m0 m0Var3 = this.f715u;
            if (m0Var3 != null && this.f713t) {
                m0Var3.setText((CharSequence) null);
                q.a(this.f676a, this.f723y);
                this.f715u.setVisibility(4);
            }
            uVar.f2609j = true;
            uVar.e();
            pVar.f2565r = true;
            pVar.n();
        }
    }

    public final void x(Editable editable) {
        ((f0.h) this.f703o).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f676a;
        if (length != 0 || this.f718v0) {
            m0 m0Var = this.f715u;
            if (m0Var == null || !this.f713t) {
                return;
            }
            m0Var.setText((CharSequence) null);
            q.a(frameLayout, this.f723y);
            this.f715u.setVisibility(4);
            return;
        }
        if (this.f715u == null || !this.f713t || TextUtils.isEmpty(this.f711s)) {
            return;
        }
        this.f715u.setText(this.f711s);
        q.a(frameLayout, this.f721x);
        this.f715u.setVisibility(0);
        this.f715u.bringToFront();
    }

    public final void y(boolean z, boolean z2) {
        int defaultColor = this.f704o0.getDefaultColor();
        int colorForState = this.f704o0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f704o0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.U = colorForState2;
        } else if (z2) {
            this.U = colorForState;
        } else {
            this.U = defaultColor;
        }
    }

    public final void z() {
        m0 m0Var;
        EditText editText;
        EditText editText2;
        if (this.G == null || this.P == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.f683e) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f683e) != null && editText.isHovered())) {
            z = true;
        }
        if (!isEnabled()) {
            this.U = this.f714t0;
        } else if (o()) {
            if (this.f704o0 != null) {
                y(z2, z);
            } else {
                this.U = getErrorCurrentTextColors();
            }
        } else if (!this.f701n || (m0Var = this.f705p) == null) {
            if (z2) {
                this.U = this.f702n0;
            } else if (z) {
                this.U = this.f700m0;
            } else {
                this.U = this.f698l0;
            }
        } else if (this.f704o0 != null) {
            y(z2, z);
        } else {
            this.U = m0Var.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        p pVar = this.c;
        TextInputLayout textInputLayout = pVar.f2549a;
        CheckableImageButton checkableImageButton = pVar.f2554g;
        TextInputLayout textInputLayout2 = pVar.f2549a;
        pVar.l();
        e.I(textInputLayout2, pVar.c, pVar.f2551d);
        e.I(textInputLayout2, checkableImageButton, pVar.f2558k);
        if (pVar.b() instanceof l) {
            if (!textInputLayout.o() || checkableImageButton.getDrawable() == null) {
                e.a(textInputLayout, checkableImageButton, pVar.f2558k, pVar.f2559l);
            } else {
                Drawable drawableMutate = checkableImageButton.getDrawable().mutate();
                drawableMutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(drawableMutate);
            }
        }
        u uVar = this.f678b;
        e.I(uVar.f2601a, uVar.f2603d, uVar.f2604e);
        if (this.P == 2) {
            int i2 = this.R;
            if (z2 && isEnabled()) {
                this.R = this.T;
            } else {
                this.R = this.S;
            }
            if (this.R != i2 && g() && !this.f718v0) {
                if (g()) {
                    ((w1.h) this.G).t(0.0f, 0.0f, 0.0f, 0.0f);
                }
                l();
            }
        }
        if (this.P == 1) {
            if (!isEnabled()) {
                this.V = this.f708q0;
            } else if (z && !z2) {
                this.V = this.f712s0;
            } else if (z2) {
                this.V = this.f710r0;
            } else {
                this.V = this.f706p0;
            }
        }
        c();
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f678b.f2603d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f678b.b(drawable);
    }

    public void setHint(int i2) {
        setHint(i2 != 0 ? getResources().getText(i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.c.f2554g.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.c.f2554g.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.c.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.c.f2554g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        p pVar = this.c;
        TextInputLayout textInputLayout = pVar.f2549a;
        CheckableImageButton checkableImageButton = pVar.f2554g;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            e.a(textInputLayout, checkableImageButton, pVar.f2558k, pVar.f2559l);
            e.I(textInputLayout, checkableImageButton, pVar.f2558k);
        }
    }
}
