package f;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import com.redhand.laugiytr.R;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public abstract class v extends EditText implements f0.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f1191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f1192b;
    public final androidx.emoji2.text.q c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k0.q f1193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.emoji2.text.q f1194e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public u f1195f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.NP_MANAGER3.NP_MANAGER);
        z1.a(context);
        y1.a(this, getContext());
        o oVar = new o(this);
        this.f1191a = oVar;
        oVar.d(attributeSet, R.NP_MANAGER3.NP_MANAGER);
        i0 i0Var = new i0(this);
        this.f1192b = i0Var;
        i0Var.d(attributeSet, R.NP_MANAGER3.NP_MANAGER);
        i0Var.b();
        androidx.emoji2.text.q qVar = new androidx.emoji2.text.q(3, false);
        qVar.f246b = this;
        this.c = qVar;
        this.f1193d = new k0.q();
        androidx.emoji2.text.q qVar2 = new androidx.emoji2.text.q(this, 2);
        this.f1194e = qVar2;
        qVar2.g(attributeSet, R.NP_MANAGER3.NP_MANAGER);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerF = qVar2.f(keyListener);
        if (keyListenerF == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerF);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    private u getSuperCaller() {
        if (this.f1195f == null) {
            this.f1195f = new u(this);
        }
        return this.f1195f;
    }

    @Override // f0.s
    public final f0.g a(f0.g gVar) {
        return this.f1193d.a(this, gVar);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        o oVar = this.f1191a;
        if (oVar != null) {
            oVar.a();
        }
        i0 i0Var = this.f1192b;
        if (i0Var != null) {
            i0Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return a0.a.l0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        o oVar = this.f1191a;
        if (oVar != null) {
            return oVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o oVar = this.f1191a;
        if (oVar != null) {
            return oVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        a2 a2Var = this.f1192b.f1034h;
        if (a2Var != null) {
            return a2Var.f985a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        a2 a2Var = this.f1192b.f1034h;
        if (a2Var != null) {
            return a2Var.f986b;
        }
        return null;
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

    /* JADX WARN: Removed duplicated region for block: B:23:0x0056 A[PHI: r1
      0x0056: PHI (r1v10 java.lang.String[]) = (r1v5 java.lang.String[]), (r1v11 java.lang.String[]) binds: [B:30:0x0069, B:22:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0070  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r8) {
        /*
            r7 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r8)
            f.i0 r1 = r7.f1192b
            r1.getClass()
            f.i0.f(r8, r0, r7)
            a0.a.M(r8, r0, r7)
            if (r0 == 0) goto L76
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 > r2) goto L76
            java.lang.String[] r2 = f0.m0.d(r7)
            if (r2 == 0) goto L76
            java.lang.String r3 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            java.lang.String r4 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            r5 = 25
            if (r1 < r5) goto L29
            j0.a.a(r8, r2)
            goto L3e
        L29:
            android.os.Bundle r6 = r8.extras
            if (r6 != 0) goto L34
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r8.extras = r6
        L34:
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r4, r2)
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r3, r2)
        L3e:
            i1.a r2 = new i1.a
            r2.<init>(r7)
            if (r1 < r5) goto L4c
            j0.d r1 = new j0.d
            r1.<init>(r0, r2)
        L4a:
            r0 = r1
            goto L76
        L4c:
            java.lang.String[] r6 = j0.c.f1426a
            if (r1 < r5) goto L58
            java.lang.String[] r1 = j0.a.b(r8)
            if (r1 == 0) goto L6c
        L56:
            r6 = r1
            goto L6c
        L58:
            android.os.Bundle r1 = r8.extras
            if (r1 != 0) goto L5d
            goto L6c
        L5d:
            java.lang.String[] r1 = r1.getStringArray(r4)
            if (r1 != 0) goto L69
            android.os.Bundle r1 = r8.extras
            java.lang.String[] r1 = r1.getStringArray(r3)
        L69:
            if (r1 == 0) goto L6c
            goto L56
        L6c:
            int r1 = r6.length
            if (r1 != 0) goto L70
            goto L76
        L70:
            j0.e r1 = new j0.e
            r1.<init>(r0, r2)
            goto L4a
        L76:
            androidx.emoji2.text.q r1 = r7.f1194e
            p0.b r8 = r1.h(r0, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: f.v.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30 || i2 >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean zA = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && f0.m0.d(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zA = b0.a(dragEvent, this, activity);
            }
        }
        if (zA) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i2) {
        f0.d nVar;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31 || f0.m0.d(this) == null || !(i2 == 16908322 || i2 == 16908337)) {
            return super.onTextContextMenuItem(i2);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i3 >= 31) {
                nVar = new androidx.emoji2.text.n(primaryClip, 1);
            } else {
                f0.e eVar = new f0.e();
                eVar.f1239b = primaryClip;
                eVar.c = 1;
                nVar = eVar;
            }
            nVar.t(i2 == 16908322 ? 0 : 1);
            f0.m0.f(this, nVar.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o oVar = this.f1191a;
        if (oVar != null) {
            oVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        o oVar = this.f1191a;
        if (oVar != null) {
            oVar.f(i2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        i0 i0Var = this.f1192b;
        if (i0Var != null) {
            i0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        i0 i0Var = this.f1192b;
        if (i0Var != null) {
            i0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(a0.a.m0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f1194e.m(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f1194e.f(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        o oVar = this.f1191a;
        if (oVar != null) {
            oVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        o oVar = this.f1191a;
        if (oVar != null) {
            oVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        i0 i0Var = this.f1192b;
        i0Var.j(colorStateList);
        i0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        i0 i0Var = this.f1192b;
        i0Var.k(mode);
        i0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        i0 i0Var = this.f1192b;
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

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
