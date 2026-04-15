package w1;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.redhand.laugiytr.R;
import f.m0;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class p extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextInputLayout f2549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FrameLayout f2550b;
    public final CheckableImageButton c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ColorStateList f2551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PorterDuff.Mode f2552e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View.OnLongClickListener f2553f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CheckableImageButton f2554g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o f2555h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2556i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedHashSet f2557j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f2558k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f2559l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f2560m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ImageView.ScaleType f2561n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View.OnLongClickListener f2562o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f2563p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m0 f2564q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f2565r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public EditText f2566s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AccessibilityManager f2567t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public AccessibilityManager.TouchExplorationStateChangeListener f2568u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final m f2569v;

    public p(TextInputLayout textInputLayout, androidx.emoji2.text.t tVar) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f2556i = 0;
        this.f2557j = new LinkedHashSet();
        this.f2569v = new m(this);
        n nVar = new n(this);
        this.f2567t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f2549a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f2550b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonA = a(this, layoutInflaterFrom, R.NP_MANAGER8.NP_MANAGER);
        this.c = checkableImageButtonA;
        CheckableImageButton checkableImageButtonA2 = a(frameLayout, layoutInflaterFrom, R.NP_MANAGER8.NP_MANAGER);
        this.f2554g = checkableImageButtonA2;
        this.f2555h = new o(this, tVar);
        m0 m0Var = new m0(getContext(), null);
        this.f2564q = m0Var;
        TypedArray typedArray = (TypedArray) tVar.c;
        if (typedArray.hasValue(38)) {
            this.f2551d = a0.a.p(getContext(), tVar, 38);
        }
        if (typedArray.hasValue(39)) {
            this.f2552e = o1.k.f(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            i(tVar.m(37));
        }
        checkableImageButtonA.setContentDescription(getResources().getText(R.NP_MANAGER14.NP_MANAGER));
        checkableImageButtonA.setImportantForAccessibility(2);
        checkableImageButtonA.setClickable(false);
        checkableImageButtonA.setPressable(false);
        checkableImageButtonA.setCheckable(false);
        checkableImageButtonA.setFocusable(false);
        if (!typedArray.hasValue(54)) {
            if (typedArray.hasValue(32)) {
                this.f2558k = a0.a.p(getContext(), tVar, 32);
            }
            if (typedArray.hasValue(33)) {
                this.f2559l = o1.k.f(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            g(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && checkableImageButtonA2.getContentDescription() != (text = typedArray.getText(27))) {
                checkableImageButtonA2.setContentDescription(text);
            }
            checkableImageButtonA2.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(54)) {
            if (typedArray.hasValue(55)) {
                this.f2558k = a0.a.p(getContext(), tVar, 55);
            }
            if (typedArray.hasValue(56)) {
                this.f2559l = o1.k.f(typedArray.getInt(56, -1), null);
            }
            g(typedArray.getBoolean(54, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(52);
            if (checkableImageButtonA2.getContentDescription() != text2) {
                checkableImageButtonA2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.NP_MANAGER6.NP_MANAGER));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f2560m) {
            this.f2560m = dimensionPixelSize;
            checkableImageButtonA2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonA.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType scaleTypeH = t1.e.h(typedArray.getInt(31, -1));
            this.f2561n = scaleTypeH;
            checkableImageButtonA2.setScaleType(scaleTypeH);
            checkableImageButtonA.setScaleType(scaleTypeH);
        }
        m0Var.setVisibility(8);
        m0Var.setId(R.NP_MANAGER8.NP_MANAGER);
        m0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        m0Var.setAccessibilityLiveRegion(1);
        m0Var.setTextAppearance(typedArray.getResourceId(73, 0));
        if (typedArray.hasValue(74)) {
            m0Var.setTextColor(tVar.l(74));
        }
        CharSequence text3 = typedArray.getText(72);
        this.f2563p = TextUtils.isEmpty(text3) ? null : text3;
        m0Var.setText(text3);
        n();
        frameLayout.addView(checkableImageButtonA2);
        addView(m0Var);
        addView(frameLayout);
        addView(checkableImageButtonA);
        textInputLayout.f686f0.add(nVar);
        if (textInputLayout.f683e != null) {
            nVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new e.d(4, this));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i2) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.NP_MANAGER11.NP_MANAGER, viewGroup, false);
        checkableImageButton.setId(i2);
        if (a0.a.G(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final q b() {
        q fVar;
        int i2 = this.f2556i;
        o oVar = this.f2555h;
        SparseArray sparseArray = oVar.f2546a;
        q qVar = (q) sparseArray.get(i2);
        if (qVar != null) {
            return qVar;
        }
        p pVar = oVar.f2547b;
        if (i2 == -1) {
            fVar = new f(pVar, 0);
        } else if (i2 == 0) {
            fVar = new f(pVar, 1);
        } else if (i2 == 1) {
            fVar = new t(pVar, oVar.f2548d);
        } else if (i2 == 2) {
            fVar = new e(pVar);
        } else {
            if (i2 != 3) {
                throw new IllegalArgumentException("Invalid end icon mode: " + i2);
            }
            fVar = new l(pVar);
        }
        sparseArray.append(i2, fVar);
        return fVar;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.f2554g;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return this.f2564q.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.f2550b.getVisibility() == 0 && this.f2554g.getVisibility() == 0;
    }

    public final boolean e() {
        return this.c.getVisibility() == 0;
    }

    public final void f(boolean z) {
        boolean z2;
        boolean zIsActivated;
        boolean z3;
        q qVarB = b();
        boolean zJ = qVarB.j();
        CheckableImageButton checkableImageButton = this.f2554g;
        boolean z4 = true;
        if (!zJ || (z3 = checkableImageButton.f641d) == qVarB.k()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        }
        if (!(qVarB instanceof l) || (zIsActivated = checkableImageButton.isActivated()) == ((l) qVarB).f2537l) {
            z4 = z2;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z || z4) {
            t1.e.I(this.f2549a, checkableImageButton, this.f2558k);
        }
    }

    public final void g(int i2) {
        if (this.f2556i == i2) {
            return;
        }
        q qVarB = b();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.f2568u;
        AccessibilityManager accessibilityManager = this.f2567t;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        this.f2568u = null;
        qVarB.r();
        this.f2556i = i2;
        Iterator it = this.f2557j.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        h(i2 != 0);
        q qVarB2 = b();
        int iD = this.f2555h.c;
        if (iD == 0) {
            iD = qVarB2.d();
        }
        Drawable drawableR = iD != 0 ? a0.a.r(getContext(), iD) : null;
        CheckableImageButton checkableImageButton = this.f2554g;
        checkableImageButton.setImageDrawable(drawableR);
        TextInputLayout textInputLayout = this.f2549a;
        if (drawableR != null) {
            t1.e.a(textInputLayout, checkableImageButton, this.f2558k, this.f2559l);
            t1.e.I(textInputLayout, checkableImageButton, this.f2558k);
        }
        int iC = qVarB2.c();
        CharSequence text = iC != 0 ? getResources().getText(iC) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(qVarB2.j());
        if (!qVarB2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i2);
        }
        qVarB2.q();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListenerH = qVarB2.h();
        this.f2568u = touchExplorationStateChangeListenerH;
        if (touchExplorationStateChangeListenerH != null && accessibilityManager != null && isAttachedToWindow()) {
            accessibilityManager.addTouchExplorationStateChangeListener(this.f2568u);
        }
        View.OnClickListener onClickListenerF = qVarB2.f();
        View.OnLongClickListener onLongClickListener = this.f2562o;
        checkableImageButton.setOnClickListener(onClickListenerF);
        t1.e.K(checkableImageButton, onLongClickListener);
        EditText editText = this.f2566s;
        if (editText != null) {
            qVarB2.l(editText);
            j(qVarB2);
        }
        t1.e.a(textInputLayout, checkableImageButton, this.f2558k, this.f2559l);
        f(true);
    }

    public final void h(boolean z) {
        if (d() != z) {
            this.f2554g.setVisibility(z ? 0 : 8);
            k();
            m();
            this.f2549a.s();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.c;
        checkableImageButton.setImageDrawable(drawable);
        l();
        t1.e.a(this.f2549a, checkableImageButton, this.f2551d, this.f2552e);
    }

    public final void j(q qVar) {
        if (this.f2566s == null) {
            return;
        }
        if (qVar.e() != null) {
            this.f2566s.setOnFocusChangeListener(qVar.e());
        }
        if (qVar.g() != null) {
            this.f2554g.setOnFocusChangeListener(qVar.g());
        }
    }

    public final void k() {
        this.f2550b.setVisibility((this.f2554g.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || ((this.f2563p == null || this.f2565r) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f2549a;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f695k.f2589q && textInputLayout.o()) ? 0 : 8);
        k();
        m();
        if (this.f2556i != 0) {
            return;
        }
        textInputLayout.s();
    }

    public final void m() {
        TextInputLayout textInputLayout = this.f2549a;
        if (textInputLayout.f683e == null) {
            return;
        }
        this.f2564q.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.NP_MANAGER6.NP_MANAGER), textInputLayout.f683e.getPaddingTop(), (d() || e()) ? 0 : textInputLayout.f683e.getPaddingEnd(), textInputLayout.f683e.getPaddingBottom());
    }

    public final void n() {
        m0 m0Var = this.f2564q;
        int visibility = m0Var.getVisibility();
        int i2 = (this.f2563p == null || this.f2565r) ? 8 : 0;
        if (visibility != i2) {
            b().o(i2 == 0);
        }
        k();
        m0Var.setVisibility(i2);
        this.f2549a.s();
    }
}
