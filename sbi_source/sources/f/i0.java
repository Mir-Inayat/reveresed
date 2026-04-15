package f;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f1028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a2 f1029b;
    public a2 c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a2 f1030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a2 f1031e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a2 f1032f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a2 f1033g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a2 f1034h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final r0 f1035i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1036j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1037k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Typeface f1038l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f1039m;

    public i0(TextView textView) {
        this.f1028a = textView;
        this.f1035i = new r0(textView);
    }

    public static a2 c(Context context, t tVar, int i2) {
        ColorStateList colorStateListF;
        synchronized (tVar) {
            colorStateListF = tVar.f1179a.f(context, i2);
        }
        if (colorStateListF == null) {
            return null;
        }
        a2 a2Var = new a2();
        a2Var.f987d = true;
        a2Var.f985a = colorStateListF;
        return a2Var;
    }

    public static void f(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i2 >= 30) {
            j0.b.a(editorInfo, text);
            return;
        }
        text.getClass();
        if (i2 >= 30) {
            j0.b.a(editorInfo, text);
            return;
        }
        int i3 = editorInfo.initialSelStart;
        int i4 = editorInfo.initialSelEnd;
        int i5 = i3 > i4 ? i4 : i3;
        if (i3 <= i4) {
            i3 = i4;
        }
        int length = text.length();
        if (i5 < 0 || i3 > length) {
            j0.c.a(editorInfo, null, 0, 0);
            return;
        }
        int i6 = editorInfo.inputType & 4095;
        if (i6 == 129 || i6 == 225 || i6 == 18) {
            j0.c.a(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            j0.c.a(editorInfo, text, i5, i3);
            return;
        }
        int i7 = i3 - i5;
        int i8 = i7 > 1024 ? 0 : i7;
        int i9 = 2048 - i8;
        int iMin = Math.min(text.length() - i3, i9 - Math.min(i5, (int) (((double) i9) * 0.8d)));
        int iMin2 = Math.min(i5, i9 - iMin);
        int i10 = i5 - iMin2;
        if (Character.isLowSurrogate(text.charAt(i10))) {
            i10++;
            iMin2--;
        }
        if (Character.isHighSurrogate(text.charAt((i3 + iMin) - 1))) {
            iMin--;
        }
        int i11 = iMin2 + i8;
        j0.c.a(editorInfo, i8 != i7 ? TextUtils.concat(text.subSequence(i10, i10 + iMin2), text.subSequence(i3, iMin + i3)) : text.subSequence(i10, i11 + iMin + i10), iMin2, i11);
    }

    public final void a(Drawable drawable, a2 a2Var) {
        if (drawable == null || a2Var == null) {
            return;
        }
        t.d(drawable, a2Var, this.f1028a.getDrawableState());
    }

    public final void b() {
        a2 a2Var = this.f1029b;
        TextView textView = this.f1028a;
        if (a2Var != null || this.c != null || this.f1030d != null || this.f1031e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f1029b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.f1030d);
            a(compoundDrawables[3], this.f1031e);
        }
        if (this.f1032f == null && this.f1033g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f1032f);
        a(compoundDrawablesRelative[2], this.f1033g);
    }

    /* JADX WARN: Removed duplicated region for block: B:240:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:259:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.util.AttributeSet r29, int r30) {
        /*
            Method dump skipped, instruction units count: 1006
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f.i0.d(android.util.AttributeSet, int):void");
    }

    public final void e(Context context, int i2) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i2, b.a.f448r);
        androidx.emoji2.text.t tVar = new androidx.emoji2.text.t(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f1028a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        l(context, tVar);
        if (i3 >= 26 && typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            g0.d(textView, string);
        }
        tVar.x();
        Typeface typeface = this.f1038l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f1036j);
        }
    }

    public final void g(int i2, int i3, int i4, int i5) {
        r0 r0Var = this.f1035i;
        if (r0Var.j()) {
            DisplayMetrics displayMetrics = r0Var.f1169j.getResources().getDisplayMetrics();
            r0Var.k(TypedValue.applyDimension(i5, i2, displayMetrics), TypedValue.applyDimension(i5, i3, displayMetrics), TypedValue.applyDimension(i5, i4, displayMetrics));
            if (r0Var.h()) {
                r0Var.a();
            }
        }
    }

    public final void h(int[] iArr, int i2) {
        r0 r0Var = this.f1035i;
        if (r0Var.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i2 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = r0Var.f1169j.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArrCopyOf[i3] = Math.round(TypedValue.applyDimension(i2, iArr[i3], displayMetrics));
                    }
                }
                r0Var.f1165f = r0.b(iArrCopyOf);
                if (!r0Var.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                r0Var.f1166g = false;
            }
            if (r0Var.h()) {
                r0Var.a();
            }
        }
    }

    public final void i(int i2) {
        r0 r0Var = this.f1035i;
        if (r0Var.j()) {
            if (i2 == 0) {
                r0Var.f1161a = 0;
                r0Var.f1163d = -1.0f;
                r0Var.f1164e = -1.0f;
                r0Var.c = -1.0f;
                r0Var.f1165f = new int[0];
                r0Var.f1162b = false;
                return;
            }
            if (i2 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i2);
            }
            DisplayMetrics displayMetrics = r0Var.f1169j.getResources().getDisplayMetrics();
            r0Var.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (r0Var.h()) {
                r0Var.a();
            }
        }
    }

    public final void j(ColorStateList colorStateList) {
        if (this.f1034h == null) {
            this.f1034h = new a2();
        }
        a2 a2Var = this.f1034h;
        a2Var.f985a = colorStateList;
        a2Var.f987d = colorStateList != null;
        this.f1029b = a2Var;
        this.c = a2Var;
        this.f1030d = a2Var;
        this.f1031e = a2Var;
        this.f1032f = a2Var;
        this.f1033g = a2Var;
    }

    public final void k(PorterDuff.Mode mode) {
        if (this.f1034h == null) {
            this.f1034h = new a2();
        }
        a2 a2Var = this.f1034h;
        a2Var.f986b = mode;
        a2Var.c = mode != null;
        this.f1029b = a2Var;
        this.c = a2Var;
        this.f1030d = a2Var;
        this.f1031e = a2Var;
        this.f1032f = a2Var;
        this.f1033g = a2Var;
    }

    public final void l(Context context, androidx.emoji2.text.t tVar) {
        String string;
        int i2 = this.f1036j;
        TypedArray typedArray = (TypedArray) tVar.c;
        this.f1036j = typedArray.getInt(2, i2);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            int i4 = typedArray.getInt(11, -1);
            this.f1037k = i4;
            if (i4 != -1) {
                this.f1036j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f1039m = false;
                int i5 = typedArray.getInt(1, 1);
                if (i5 == 1) {
                    this.f1038l = Typeface.SANS_SERIF;
                    return;
                } else if (i5 == 2) {
                    this.f1038l = Typeface.SERIF;
                    return;
                } else {
                    if (i5 != 3) {
                        return;
                    }
                    this.f1038l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f1038l = null;
        int i6 = typedArray.hasValue(12) ? 12 : 10;
        int i7 = this.f1037k;
        int i8 = this.f1036j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceN = tVar.n(i6, this.f1036j, new d0(this, i7, i8, new WeakReference(this.f1028a)));
                if (typefaceN != null) {
                    if (i3 < 28 || this.f1037k == -1) {
                        this.f1038l = typefaceN;
                    } else {
                        this.f1038l = h0.a(Typeface.create(typefaceN, 0), this.f1037k, (this.f1036j & 2) != 0);
                    }
                }
                this.f1039m = this.f1038l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f1038l != null || (string = typedArray.getString(i6)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f1037k == -1) {
            this.f1038l = Typeface.create(string, this.f1036j);
        } else {
            this.f1038l = h0.a(Typeface.create(string, 0), this.f1037k, (this.f1036j & 2) != 0);
        }
    }
}
