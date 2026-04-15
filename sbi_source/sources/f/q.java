package f;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.redhand.laugiytr.R;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public abstract class q extends CheckBox {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f1141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f1142b;
    public final i0 c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w f1143d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.NP_MANAGER3.NP_MANAGER);
        z1.a(context);
        y1.a(this, getContext());
        this.f1141a = new r(this);
        Context context2 = getContext();
        int[] iArr = b.a.f440j;
        androidx.emoji2.text.t tVarV = androidx.emoji2.text.t.v(context2, attributeSet, iArr, R.NP_MANAGER3.NP_MANAGER);
        TypedArray typedArray = (TypedArray) tVarV.c;
        f0.m0.i(this, getContext(), iArr, attributeSet, (TypedArray) tVarV.c, R.NP_MANAGER3.NP_MANAGER);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setButtonDrawable(a0.a.r(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setButtonDrawable(a0.a.r(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setButtonDrawable(a0.a.r(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                k0.b.c(this, tVarV.l(2));
            }
            if (typedArray.hasValue(3)) {
                k0.b.d(this, u0.b(typedArray.getInt(3, -1), null));
            }
            tVarV.x();
            o oVar = new o(this);
            this.f1142b = oVar;
            oVar.d(attributeSet, R.NP_MANAGER3.NP_MANAGER);
            i0 i0Var = new i0(this);
            this.c = i0Var;
            i0Var.d(attributeSet, R.NP_MANAGER3.NP_MANAGER);
            getEmojiTextViewHelper().a(attributeSet, R.NP_MANAGER3.NP_MANAGER);
        } catch (Throwable th) {
            tVarV.x();
            throw th;
        }
    }

    private w getEmojiTextViewHelper() {
        if (this.f1143d == null) {
            this.f1143d = new w(this);
        }
        return this.f1143d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        o oVar = this.f1142b;
        if (oVar != null) {
            oVar.a();
        }
        i0 i0Var = this.c;
        if (i0Var != null) {
            i0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        o oVar = this.f1142b;
        if (oVar != null) {
            return oVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o oVar = this.f1142b;
        if (oVar != null) {
            return oVar.c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        r rVar = this.f1141a;
        if (rVar != null) {
            return rVar.f1155b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        r rVar = this.f1141a;
        if (rVar != null) {
            return rVar.c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        a2 a2Var = this.c.f1034h;
        if (a2Var != null) {
            return a2Var.f985a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        a2 a2Var = this.c.f1034h;
        if (a2Var != null) {
            return a2Var.f986b;
        }
        return null;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        ((a0.a) getEmojiTextViewHelper().f1204b.f244b).d0(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o oVar = this.f1142b;
        if (oVar != null) {
            oVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        o oVar = this.f1142b;
        if (oVar != null) {
            oVar.f(i2);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        r rVar = this.f1141a;
        if (rVar != null) {
            if (rVar.f1158f) {
                rVar.f1158f = false;
            } else {
                rVar.f1158f = true;
                rVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        i0 i0Var = this.c;
        if (i0Var != null) {
            i0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        i0 i0Var = this.c;
        if (i0Var != null) {
            i0Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        ((a0.a) getEmojiTextViewHelper().f1204b.f244b).e0(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((a0.a) getEmojiTextViewHelper().f1204b.f244b).u(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        o oVar = this.f1142b;
        if (oVar != null) {
            oVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        o oVar = this.f1142b;
        if (oVar != null) {
            oVar.i(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        r rVar = this.f1141a;
        if (rVar != null) {
            rVar.f1155b = colorStateList;
            rVar.f1156d = true;
            rVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        r rVar = this.f1141a;
        if (rVar != null) {
            rVar.c = mode;
            rVar.f1157e = true;
            rVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        i0 i0Var = this.c;
        i0Var.j(colorStateList);
        i0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        i0 i0Var = this.c;
        i0Var.k(mode);
        i0Var.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i2) {
        setButtonDrawable(a0.a.r(getContext(), i2));
    }
}
