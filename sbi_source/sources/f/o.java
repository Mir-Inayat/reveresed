package f;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f1121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f1122b;
    public int c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a2 f1123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a2 f1124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a2 f1125f;

    public o(View view) {
        t tVar;
        this.f1121a = view;
        PorterDuff.Mode mode = t.f1178b;
        synchronized (t.class) {
            try {
                if (t.c == null) {
                    t.c();
                }
                tVar = t.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f1122b = tVar;
    }

    public final void a() {
        View view = this.f1121a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.f1123d != null) {
                if (this.f1125f == null) {
                    this.f1125f = new a2();
                }
                a2 a2Var = this.f1125f;
                a2Var.f985a = null;
                a2Var.f987d = false;
                a2Var.f986b = null;
                a2Var.c = false;
                Field field = f0.m0.f1276a;
                ColorStateList colorStateListG = f0.c0.g(view);
                if (colorStateListG != null) {
                    a2Var.f987d = true;
                    a2Var.f985a = colorStateListG;
                }
                PorterDuff.Mode modeH = f0.c0.h(view);
                if (modeH != null) {
                    a2Var.c = true;
                    a2Var.f986b = modeH;
                }
                if (a2Var.f987d || a2Var.c) {
                    t.d(background, a2Var, view.getDrawableState());
                    return;
                }
            }
            a2 a2Var2 = this.f1124e;
            if (a2Var2 != null) {
                t.d(background, a2Var2, view.getDrawableState());
                return;
            }
            a2 a2Var3 = this.f1123d;
            if (a2Var3 != null) {
                t.d(background, a2Var3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        a2 a2Var = this.f1124e;
        if (a2Var != null) {
            return a2Var.f985a;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        a2 a2Var = this.f1124e;
        if (a2Var != null) {
            return a2Var.f986b;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i2) {
        ColorStateList colorStateListF;
        View view = this.f1121a;
        Context context = view.getContext();
        int[] iArr = b.a.f450t;
        androidx.emoji2.text.t tVarV = androidx.emoji2.text.t.v(context, attributeSet, iArr, i2);
        TypedArray typedArray = (TypedArray) tVarV.c;
        View view2 = this.f1121a;
        f0.m0.i(view2, view2.getContext(), iArr, attributeSet, (TypedArray) tVarV.c, i2);
        try {
            if (typedArray.hasValue(0)) {
                this.c = typedArray.getResourceId(0, -1);
                t tVar = this.f1122b;
                Context context2 = view.getContext();
                int i3 = this.c;
                synchronized (tVar) {
                    colorStateListF = tVar.f1179a.f(context2, i3);
                }
                if (colorStateListF != null) {
                    g(colorStateListF);
                }
            }
            if (typedArray.hasValue(1)) {
                f0.c0.q(view, tVarV.l(1));
            }
            if (typedArray.hasValue(2)) {
                f0.c0.r(view, u0.b(typedArray.getInt(2, -1), null));
            }
            tVarV.x();
        } catch (Throwable th) {
            tVarV.x();
            throw th;
        }
    }

    public final void e() {
        this.c = -1;
        g(null);
        a();
    }

    public final void f(int i2) {
        ColorStateList colorStateListF;
        this.c = i2;
        t tVar = this.f1122b;
        if (tVar != null) {
            Context context = this.f1121a.getContext();
            synchronized (tVar) {
                colorStateListF = tVar.f1179a.f(context, i2);
            }
        } else {
            colorStateListF = null;
        }
        g(colorStateListF);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1123d == null) {
                this.f1123d = new a2();
            }
            a2 a2Var = this.f1123d;
            a2Var.f985a = colorStateList;
            a2Var.f987d = true;
        } else {
            this.f1123d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f1124e == null) {
            this.f1124e = new a2();
        }
        a2 a2Var = this.f1124e;
        a2Var.f985a = colorStateList;
        a2Var.f987d = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f1124e == null) {
            this.f1124e = new a2();
        }
        a2 a2Var = this.f1124e;
        a2Var.f986b = mode;
        a2Var.c = true;
        a();
    }
}
