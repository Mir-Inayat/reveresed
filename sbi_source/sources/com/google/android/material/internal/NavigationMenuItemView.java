package com.google.android.material.internal;

import a0.a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import e.k;
import e.q;
import f.d1;
import f0.m0;
import i1.h;
import o1.d;
import w.i;
import w.n;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuItemView extends d implements q {
    public static final int[] G = {R.attr.state_checked};
    public FrameLayout A;
    public k B;
    public ColorStateList C;
    public boolean D;
    public Drawable E;
    public final h F;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f645v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f646w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f647x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f648y;
    public final CheckedTextView z;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f648y = true;
        h hVar = new h(this, 2);
        this.F = hVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.redhand.laugiytr.R.NP_MANAGER11.NP_MANAGER, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.redhand.laugiytr.R.NP_MANAGER6.NP_MANAGER));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.redhand.laugiytr.R.NP_MANAGER8.NP_MANAGER);
        this.z = checkedTextView;
        m0.j(checkedTextView, hVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.A == null) {
                this.A = (FrameLayout) ((ViewStub) findViewById(com.redhand.laugiytr.R.NP_MANAGER8.NP_MANAGER)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.A.removeAllViews();
            this.A.addView(view);
        }
    }

    @Override // e.q
    public final void b(k kVar) {
        StateListDrawable stateListDrawable;
        this.B = kVar;
        int i2 = kVar.f912a;
        if (i2 > 0) {
            setId(i2);
        }
        setVisibility(kVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.redhand.laugiytr.R.NP_MANAGER3.NP_MANAGER, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(G, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        setCheckable(kVar.isCheckable());
        setChecked(kVar.isChecked());
        setEnabled(kVar.isEnabled());
        setTitle(kVar.f915e);
        setIcon(kVar.getIcon());
        View view = kVar.z;
        if (view == null) {
            view = null;
        }
        setActionView(view);
        setContentDescription(kVar.f927q);
        a.i0(this, kVar.f928r);
        k kVar2 = this.B;
        CharSequence charSequence = kVar2.f915e;
        CheckedTextView checkedTextView = this.z;
        if (charSequence == null && kVar2.getIcon() == null) {
            View view2 = this.B.z;
            if ((view2 != null ? view2 : null) != null) {
                checkedTextView.setVisibility(8);
                FrameLayout frameLayout = this.A;
                if (frameLayout != null) {
                    d1 d1Var = (d1) frameLayout.getLayoutParams();
                    ((LinearLayout.LayoutParams) d1Var).width = -1;
                    this.A.setLayoutParams(d1Var);
                    return;
                }
                return;
            }
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.A;
        if (frameLayout2 != null) {
            d1 d1Var2 = (d1) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) d1Var2).width = -2;
            this.A.setLayoutParams(d1Var2);
        }
    }

    @Override // e.q
    public k getItemData() {
        return this.B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        k kVar = this.B;
        if (kVar != null && kVar.isCheckable() && this.B.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, G);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f647x != z) {
            this.f647x = z;
            this.F.h(this.z, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.z;
        checkedTextView.setChecked(z);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z && this.f648y) ? 1 : 0);
    }

    public void setHorizontalPadding(int i2) {
        setPadding(i2, getPaddingTop(), i2, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.C);
            }
            int i2 = this.f645v;
            drawable.setBounds(0, 0, i2, i2);
        } else if (this.f646w) {
            if (this.E == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = n.f2490a;
                Drawable drawableA = i.a(resources, com.redhand.laugiytr.R.NP_MANAGER7.NP_MANAGER, theme);
                this.E = drawableA;
                if (drawableA != null) {
                    int i3 = this.f645v;
                    drawableA.setBounds(0, 0, i3, i3);
                }
            }
            drawable = this.E;
        }
        this.z.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i2) {
        this.z.setCompoundDrawablePadding(i2);
    }

    public void setIconSize(int i2) {
        this.f645v = i2;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.C = colorStateList;
        this.D = colorStateList != null;
        k kVar = this.B;
        if (kVar != null) {
            setIcon(kVar.getIcon());
        }
    }

    public void setMaxLines(int i2) {
        this.z.setMaxLines(i2);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f646w = z;
    }

    public void setTextAppearance(int i2) {
        this.z.setTextAppearance(i2);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.z.setText(charSequence);
    }
}
