package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import e.a;
import e.b;
import e.i;
import e.j;
import e.q;
import f.k;
import f.m0;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends m0 implements q, View.OnClickListener, k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e.k f6h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f7i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Drawable f8j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public i f9k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f10l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f11m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f12n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f13o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f14p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f15q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f16r;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f12n = g();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.a.c, 0, 0);
        this.f14p = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f16r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f15q = -1;
        setSaveEnabled(false);
    }

    @Override // f.k
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // e.q
    public final void b(e.k kVar) {
        this.f6h = kVar;
        setIcon(kVar.getIcon());
        setTitle(kVar.getTitleCondensed());
        setId(kVar.f912a);
        setVisibility(kVar.isVisible() ? 0 : 8);
        setEnabled(kVar.isEnabled());
        if (kVar.hasSubMenu() && this.f10l == null) {
            this.f10l = new a(this);
        }
    }

    @Override // f.k
    public final boolean c() {
        return !TextUtils.isEmpty(getText()) && this.f6h.getIcon() == null;
    }

    public final boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (i2 < 480) {
            return (i2 >= 640 && i3 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // e.q
    public e.k getItemData() {
        return this.f6h;
    }

    public final void h() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f7i);
        if (this.f8j != null && ((this.f6h.f935y & 4) != 4 || (!this.f12n && !this.f13o))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f7i : null);
        CharSequence charSequence = this.f6h.f927q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.f6h.f915e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f6h.f928r;
        if (TextUtils.isEmpty(charSequence2)) {
            a0.a.i0(this, z3 ? null : this.f6h.f915e);
        } else {
            a0.a.i0(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        i iVar = this.f9k;
        if (iVar != null) {
            iVar.a(this.f6h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f12n = g();
        h();
    }

    @Override // f.m0, android.widget.TextView, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i4 = this.f15q) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int i5 = this.f14p;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i5) : i5;
        if (mode != 1073741824 && i5 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i3);
        }
        if (!zIsEmpty || this.f8j == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f8j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (this.f6h.hasSubMenu() && (aVar = this.f10l) != null && aVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z) {
        if (this.f13o != z) {
            this.f13o = z;
            e.k kVar = this.f6h;
            if (kVar != null) {
                j jVar = kVar.f924n;
                jVar.f902k = true;
                jVar.o(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f8j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i2 = this.f16r;
            if (intrinsicWidth > i2) {
                intrinsicHeight = (int) (intrinsicHeight * (i2 / intrinsicWidth));
                intrinsicWidth = i2;
            }
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (intrinsicWidth * (i2 / intrinsicHeight));
            } else {
                i2 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i2);
        }
        setCompoundDrawables(drawable, null, null, null);
        h();
    }

    public void setItemInvoker(i iVar) {
        this.f9k = iVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i2, int i3, int i4, int i5) {
        this.f15q = i2;
        super.setPadding(i2, i3, i4, i5);
    }

    public void setPopupCallback(b bVar) {
        this.f11m = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f7i = charSequence;
        h();
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }
}
