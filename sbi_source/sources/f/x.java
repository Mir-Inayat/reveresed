package f;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class x extends ImageButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f1208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f1209b;
    public boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        z1.a(context);
        this.c = false;
        y1.a(this, getContext());
        o oVar = new o(this);
        this.f1208a = oVar;
        oVar.d(attributeSet, i2);
        y yVar = new y(this);
        this.f1209b = yVar;
        yVar.b(attributeSet, i2);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        o oVar = this.f1208a;
        if (oVar != null) {
            oVar.a();
        }
        y yVar = this.f1209b;
        if (yVar != null) {
            yVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        o oVar = this.f1208a;
        if (oVar != null) {
            return oVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o oVar = this.f1208a;
        if (oVar != null) {
            return oVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        a2 a2Var;
        y yVar = this.f1209b;
        if (yVar == null || (a2Var = yVar.f1211b) == null) {
            return null;
        }
        return a2Var.f985a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        a2 a2Var;
        y yVar = this.f1209b;
        if (yVar == null || (a2Var = yVar.f1211b) == null) {
            return null;
        }
        return a2Var.f986b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(this.f1209b.f1210a.getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o oVar = this.f1208a;
        if (oVar != null) {
            oVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        o oVar = this.f1208a;
        if (oVar != null) {
            oVar.f(i2);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        y yVar = this.f1209b;
        if (yVar != null) {
            yVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        y yVar = this.f1209b;
        if (yVar != null && drawable != null && !this.c) {
            yVar.c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (yVar != null) {
            yVar.a();
            if (this.c) {
                return;
            }
            ImageView imageView = yVar.f1210a;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(yVar.c);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i2) {
        super.setImageLevel(i2);
        this.c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i2) {
        y yVar = this.f1209b;
        ImageView imageView = yVar.f1210a;
        if (i2 != 0) {
            Drawable drawableR = a0.a.r(imageView.getContext(), i2);
            if (drawableR != null) {
                u0.a(drawableR);
            }
            imageView.setImageDrawable(drawableR);
        } else {
            imageView.setImageDrawable(null);
        }
        yVar.a();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        y yVar = this.f1209b;
        if (yVar != null) {
            yVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        o oVar = this.f1208a;
        if (oVar != null) {
            oVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        o oVar = this.f1208a;
        if (oVar != null) {
            oVar.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        y yVar = this.f1209b;
        if (yVar != null) {
            if (yVar.f1211b == null) {
                yVar.f1211b = new a2();
            }
            a2 a2Var = yVar.f1211b;
            a2Var.f985a = colorStateList;
            a2Var.f987d = true;
            yVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        y yVar = this.f1209b;
        if (yVar != null) {
            if (yVar.f1211b == null) {
                yVar.f1211b = new a2();
            }
            a2 a2Var = yVar.f1211b;
            a2Var.f986b = mode;
            a2Var.c = true;
            yVar.a();
        }
    }
}
