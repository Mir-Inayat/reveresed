package f;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public abstract class n extends AutoCompleteTextView {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f1118d = {R.attr.popupBackground};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f1119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f1120b;
    public final androidx.emoji2.text.q c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.redhand.laugiytr.R.NP_MANAGER3.NP_MANAGER);
        z1.a(context);
        y1.a(this, getContext());
        androidx.emoji2.text.t tVarV = androidx.emoji2.text.t.v(getContext(), attributeSet, f1118d, com.redhand.laugiytr.R.NP_MANAGER3.NP_MANAGER);
        if (((TypedArray) tVarV.c).hasValue(0)) {
            setDropDownBackgroundDrawable(tVarV.m(0));
        }
        tVarV.x();
        o oVar = new o(this);
        this.f1119a = oVar;
        oVar.d(attributeSet, com.redhand.laugiytr.R.NP_MANAGER3.NP_MANAGER);
        i0 i0Var = new i0(this);
        this.f1120b = i0Var;
        i0Var.d(attributeSet, com.redhand.laugiytr.R.NP_MANAGER3.NP_MANAGER);
        i0Var.b();
        androidx.emoji2.text.q qVar = new androidx.emoji2.text.q(this, 2);
        this.c = qVar;
        qVar.g(attributeSet, com.redhand.laugiytr.R.NP_MANAGER3.NP_MANAGER);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerF = qVar.f(keyListener);
        if (keyListenerF == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerF);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        o oVar = this.f1119a;
        if (oVar != null) {
            oVar.a();
        }
        i0 i0Var = this.f1120b;
        if (i0Var != null) {
            i0Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return a0.a.l0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        o oVar = this.f1119a;
        if (oVar != null) {
            return oVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o oVar = this.f1119a;
        if (oVar != null) {
            return oVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        a2 a2Var = this.f1120b.f1034h;
        if (a2Var != null) {
            return a2Var.f985a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        a2 a2Var = this.f1120b.f1034h;
        if (a2Var != null) {
            return a2Var.f986b;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        a0.a.M(editorInfo, inputConnectionOnCreateInputConnection, this);
        return this.c.h(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o oVar = this.f1119a;
        if (oVar != null) {
            oVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        o oVar = this.f1119a;
        if (oVar != null) {
            oVar.f(i2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        i0 i0Var = this.f1120b;
        if (i0Var != null) {
            i0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        i0 i0Var = this.f1120b;
        if (i0Var != null) {
            i0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(a0.a.m0(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i2) {
        setDropDownBackgroundDrawable(a0.a.r(getContext(), i2));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.c.m(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.c.f(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        o oVar = this.f1119a;
        if (oVar != null) {
            oVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        o oVar = this.f1119a;
        if (oVar != null) {
            oVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        i0 i0Var = this.f1120b;
        i0Var.j(colorStateList);
        i0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        i0 i0Var = this.f1120b;
        i0Var.k(mode);
        i0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        i0 i0Var = this.f1120b;
        if (i0Var != null) {
            i0Var.e(context, i2);
        }
    }
}
