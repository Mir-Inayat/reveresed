package f;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.redhand.laugiytr.R;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public abstract class p extends Button {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f1128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f1129b;
    public w c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.NP_MANAGER3.NP_MANAGER);
        z1.a(context);
        y1.a(this, getContext());
        o oVar = new o(this);
        this.f1128a = oVar;
        oVar.d(attributeSet, R.NP_MANAGER3.NP_MANAGER);
        i0 i0Var = new i0(this);
        this.f1129b = i0Var;
        i0Var.d(attributeSet, R.NP_MANAGER3.NP_MANAGER);
        i0Var.b();
        getEmojiTextViewHelper().a(attributeSet, R.NP_MANAGER3.NP_MANAGER);
    }

    private w getEmojiTextViewHelper() {
        if (this.c == null) {
            this.c = new w(this);
        }
        return this.c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        o oVar = this.f1128a;
        if (oVar != null) {
            oVar.a();
        }
        i0 i0Var = this.f1129b;
        if (i0Var != null) {
            i0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (t2.f1187a) {
            return super.getAutoSizeMaxTextSize();
        }
        i0 i0Var = this.f1129b;
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
        i0 i0Var = this.f1129b;
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
        i0 i0Var = this.f1129b;
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
        i0 i0Var = this.f1129b;
        return i0Var != null ? i0Var.f1035i.f1165f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (t2.f1187a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        i0 i0Var = this.f1129b;
        if (i0Var != null) {
            return i0Var.f1035i.f1161a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return a0.a.l0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        o oVar = this.f1128a;
        if (oVar != null) {
            return oVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o oVar = this.f1128a;
        if (oVar != null) {
            return oVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        a2 a2Var = this.f1129b.f1034h;
        if (a2Var != null) {
            return a2Var.f985a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        a2 a2Var = this.f1129b.f1034h;
        if (a2Var != null) {
            return a2Var.f986b;
        }
        return null;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        i0 i0Var = this.f1129b;
        if (i0Var == null || t2.f1187a) {
            return;
        }
        i0Var.f1035i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        i0 i0Var = this.f1129b;
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
        i0 i0Var = this.f1129b;
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
        i0 i0Var = this.f1129b;
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
        i0 i0Var = this.f1129b;
        if (i0Var != null) {
            i0Var.i(i2);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o oVar = this.f1128a;
        if (oVar != null) {
            oVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        o oVar = this.f1128a;
        if (oVar != null) {
            oVar.f(i2);
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

    public void setSupportAllCaps(boolean z) {
        i0 i0Var = this.f1129b;
        if (i0Var != null) {
            i0Var.f1028a.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        o oVar = this.f1128a;
        if (oVar != null) {
            oVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        o oVar = this.f1128a;
        if (oVar != null) {
            oVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        i0 i0Var = this.f1129b;
        i0Var.j(colorStateList);
        i0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        i0 i0Var = this.f1129b;
        i0Var.k(mode);
        i0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        i0 i0Var = this.f1129b;
        if (i0Var != null) {
            i0Var.e(context, i2);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i2, float f3) {
        boolean z = t2.f1187a;
        if (z) {
            super.setTextSize(i2, f3);
            return;
        }
        i0 i0Var = this.f1129b;
        if (i0Var != null) {
            r0 r0Var = i0Var.f1035i;
            if (z || r0Var.f()) {
                return;
            }
            r0Var.g(i2, f3);
        }
    }
}
