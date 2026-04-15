package f;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class m0 extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f1077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f1078b;
    public final androidx.emoji2.text.q c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w f1079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1080e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.emoji2.text.n f1081f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Future f1082g;

    public m0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private w getEmojiTextViewHelper() {
        if (this.f1079d == null) {
            this.f1079d = new w(this);
        }
        return this.f1079d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        o oVar = this.f1077a;
        if (oVar != null) {
            oVar.a();
        }
        i0 i0Var = this.f1078b;
        if (i0Var != null) {
            i0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (t2.f1187a) {
            return super.getAutoSizeMaxTextSize();
        }
        i0 i0Var = this.f1078b;
        if (i0Var != null) {
            return Math.round(i0Var.f1035i.f1164e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (t2.f1187a) {
            return super.getAutoSizeMinTextSize();
        }
        i0 i0Var = this.f1078b;
        if (i0Var != null) {
            return Math.round(i0Var.f1035i.f1163d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (t2.f1187a) {
            return super.getAutoSizeStepGranularity();
        }
        i0 i0Var = this.f1078b;
        if (i0Var != null) {
            return Math.round(i0Var.f1035i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (t2.f1187a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        i0 i0Var = this.f1078b;
        return i0Var != null ? i0Var.f1035i.f1165f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (t2.f1187a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        i0 i0Var = this.f1078b;
        if (i0Var != null) {
            return i0Var.f1035i.f1161a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return a0.a.l0(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public j0 getSuperCaller() {
        if (this.f1081f == null) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 34) {
                this.f1081f = new l0(this);
            } else if (i2 >= 28) {
                this.f1081f = new k0(this);
            } else if (i2 >= 26) {
                this.f1081f = new androidx.emoji2.text.n(8, this);
            }
        }
        return this.f1081f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        o oVar = this.f1077a;
        if (oVar != null) {
            return oVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o oVar = this.f1077a;
        if (oVar != null) {
            return oVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        a2 a2Var = this.f1078b.f1034h;
        if (a2Var != null) {
            return a2Var.f985a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        a2 a2Var = this.f1078b.f1034h;
        if (a2Var != null) {
            return a2Var.f986b;
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.f1082g;
        if (future != null) {
            try {
                this.f1082g = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                a0.a.y(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        androidx.emoji2.text.q qVar;
        if (Build.VERSION.SDK_INT >= 28 || (qVar = this.c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) qVar.c;
        return textClassifier == null ? c0.a((TextView) qVar.f246b) : textClassifier;
    }

    public d0.d getTextMetricsParamsCompat() {
        return a0.a.y(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1078b.getClass();
        i0.f(editorInfo, inputConnectionOnCreateInputConnection, this);
        a0.a.M(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30 || i2 >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        i0 i0Var = this.f1078b;
        if (i0Var == null || t2.f1187a) {
            return;
        }
        i0Var.f1035i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        Future future = this.f1082g;
        if (future != null) {
            try {
                this.f1082g = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                a0.a.y(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i2, i3);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        i0 i0Var = this.f1078b;
        if (i0Var != null) {
            r0 r0Var = i0Var.f1035i;
            if (t2.f1187a || !r0Var.f()) {
                return;
            }
            r0Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        ((a0.a) getEmojiTextViewHelper().f1204b.f244b).d0(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) {
        if (t2.f1187a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
            return;
        }
        i0 i0Var = this.f1078b;
        if (i0Var != null) {
            i0Var.g(i2, i3, i4, i5);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        if (t2.f1187a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
            return;
        }
        i0 i0Var = this.f1078b;
        if (i0Var != null) {
            i0Var.h(iArr, i2);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (t2.f1187a) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        i0 i0Var = this.f1078b;
        if (i0Var != null) {
            i0Var.i(i2);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o oVar = this.f1077a;
        if (oVar != null) {
            oVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        o oVar = this.f1077a;
        if (oVar != null) {
            oVar.f(i2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        i0 i0Var = this.f1078b;
        if (i0Var != null) {
            i0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        i0 i0Var = this.f1078b;
        if (i0Var != null) {
            i0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        i0 i0Var = this.f1078b;
        if (i0Var != null) {
            i0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        i0 i0Var = this.f1078b;
        if (i0Var != null) {
            i0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(a0.a.m0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        ((a0.a) getEmojiTextViewHelper().f1204b.f244b).e0(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((a0.a) getEmojiTextViewHelper().f1204b.f244b).u(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().m(i2);
        } else {
            a0.a.f0(this, i2);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().j(i2);
        } else {
            a0.a.g0(this, i2);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i2) {
        a0.a.h0(this, i2);
    }

    public void setPrecomputedText(d0.e eVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        a0.a.y(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        o oVar = this.f1077a;
        if (oVar != null) {
            oVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        o oVar = this.f1077a;
        if (oVar != null) {
            oVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        i0 i0Var = this.f1078b;
        i0Var.j(colorStateList);
        i0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        i0 i0Var = this.f1078b;
        i0Var.k(mode);
        i0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        i0 i0Var = this.f1078b;
        if (i0Var != null) {
            i0Var.e(context, i2);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        androidx.emoji2.text.q qVar;
        if (Build.VERSION.SDK_INT >= 28 || (qVar = this.c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            qVar.c = textClassifier;
        }
    }

    public void setTextFuture(Future<d0.e> future) {
        this.f1082g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(d0.d dVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = dVar.f824b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i2 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i2 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i2 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i2 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i2 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i2 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i2 = 7;
            }
        }
        setTextDirection(i2);
        getPaint().set(dVar.f823a);
        k0.l.e(this, dVar.c);
        k0.l.h(this, dVar.f825d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i2, float f3) {
        boolean z = t2.f1187a;
        if (z) {
            super.setTextSize(i2, f3);
            return;
        }
        i0 i0Var = this.f1078b;
        if (i0Var != null) {
            r0 r0Var = i0Var.f1035i;
            if (z || r0Var.f()) {
                return;
            }
            r0Var.g(i2, f3);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i2) {
        Typeface typefaceCreate;
        if (this.f1080e) {
            return;
        }
        if (typeface == null || i2 <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            t1.e eVar = x.g.f2622a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i2);
        }
        this.f1080e = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i2);
        } finally {
            this.f1080e = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        z1.a(context);
        this.f1080e = false;
        this.f1081f = null;
        y1.a(this, getContext());
        o oVar = new o(this);
        this.f1077a = oVar;
        oVar.d(attributeSet, i2);
        i0 i0Var = new i0(this);
        this.f1078b = i0Var;
        i0Var.d(attributeSet, i2);
        i0Var.b();
        androidx.emoji2.text.q qVar = new androidx.emoji2.text.q(3, false);
        qVar.f246b = this;
        this.c = qVar;
        getEmojiTextViewHelper().a(attributeSet, i2);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i2, float f3) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 34) {
            getSuperCaller().s(i2, f3);
        } else if (i3 >= 34) {
            k0.o.a(this, i2, f3);
        } else {
            a0.a.h0(this, Math.round(TypedValue.applyDimension(i2, f3, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i2 != 0 ? a0.a.r(context, i2) : null, i3 != 0 ? a0.a.r(context, i3) : null, i4 != 0 ? a0.a.r(context, i4) : null, i5 != 0 ? a0.a.r(context, i5) : null);
        i0 i0Var = this.f1078b;
        if (i0Var != null) {
            i0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i2 != 0 ? a0.a.r(context, i2) : null, i3 != 0 ? a0.a.r(context, i3) : null, i4 != 0 ? a0.a.r(context, i4) : null, i5 != 0 ? a0.a.r(context, i5) : null);
        i0 i0Var = this.f1078b;
        if (i0Var != null) {
            i0Var.b();
        }
    }
}
