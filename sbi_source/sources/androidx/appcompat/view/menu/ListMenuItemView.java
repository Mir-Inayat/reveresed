package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.emoji2.text.t;
import b.a;
import com.redhand.laugiytr.R;
import e.j;
import e.k;
import e.q;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements q, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f18a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f19b;
    public RadioButton c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f20d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CheckBox f21e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f22f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageView f23g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageView f24h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f25i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Drawable f26j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f27k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f28l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f29m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Drawable f30n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f31o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LayoutInflater f32p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f33q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        t tVarV = t.v(getContext(), attributeSet, a.f445o, R.NP_MANAGER3.NP_MANAGER);
        this.f26j = tVarV.m(5);
        TypedArray typedArray = (TypedArray) tVarV.c;
        this.f27k = typedArray.getResourceId(1, -1);
        this.f29m = typedArray.getBoolean(7, false);
        this.f28l = context;
        this.f30n = tVarV.m(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.NP_MANAGER3.NP_MANAGER, 0);
        this.f31o = typedArrayObtainStyledAttributes.hasValue(0);
        tVarV.x();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f32p == null) {
            this.f32p = LayoutInflater.from(getContext());
        }
        return this.f32p;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f23g;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f24h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f24h.getLayoutParams();
        rect.top = this.f24h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    @Override // e.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(e.k r11) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.b(e.k):void");
    }

    @Override // e.q
    public k getItemData() {
        return this.f18a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f26j);
        TextView textView = (TextView) findViewById(R.NP_MANAGER8.NP_MANAGER);
        this.f20d = textView;
        int i2 = this.f27k;
        if (i2 != -1) {
            textView.setTextAppearance(this.f28l, i2);
        }
        this.f22f = (TextView) findViewById(R.NP_MANAGER8.NP_MANAGER);
        ImageView imageView = (ImageView) findViewById(R.NP_MANAGER8.NP_MANAGER);
        this.f23g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f30n);
        }
        this.f24h = (ImageView) findViewById(R.NP_MANAGER8.NP_MANAGER);
        this.f25i = (LinearLayout) findViewById(R.NP_MANAGER8.NP_MANAGER);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        if (this.f19b != null && this.f29m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f19b.getLayoutParams();
            int i4 = layoutParams.height;
            if (i4 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i4;
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        View view;
        if (!z && this.c == null && this.f21e == null) {
            return;
        }
        if ((this.f18a.f934x & 4) != 0) {
            if (this.c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.NP_MANAGER11.NP_MANAGER, (ViewGroup) this, false);
                this.c = radioButton;
                LinearLayout linearLayout = this.f25i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.c;
            view = this.f21e;
        } else {
            if (this.f21e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.NP_MANAGER11.NP_MANAGER, (ViewGroup) this, false);
                this.f21e = checkBox;
                LinearLayout linearLayout2 = this.f25i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f21e;
            view = this.c;
        }
        if (z) {
            compoundButton.setChecked(this.f18a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f21e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.f18a.f934x & 4) != 0) {
            if (this.c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.NP_MANAGER11.NP_MANAGER, (ViewGroup) this, false);
                this.c = radioButton;
                LinearLayout linearLayout = this.f25i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.c;
        } else {
            if (this.f21e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.NP_MANAGER11.NP_MANAGER, (ViewGroup) this, false);
                this.f21e = checkBox;
                LinearLayout linearLayout2 = this.f25i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f21e;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f33q = z;
        this.f29m = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f24h;
        if (imageView != null) {
            imageView.setVisibility((this.f31o || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        j jVar = this.f18a.f924n;
        boolean z = this.f33q;
        if (z || this.f29m) {
            ImageView imageView = this.f19b;
            if (imageView == null && drawable == null && !this.f29m) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.NP_MANAGER11.NP_MANAGER, (ViewGroup) this, false);
                this.f19b = imageView2;
                LinearLayout linearLayout = this.f25i;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f29m) {
                this.f19b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f19b;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f19b.getVisibility() != 0) {
                this.f19b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f20d.getVisibility() != 8) {
                this.f20d.setVisibility(8);
            }
        } else {
            this.f20d.setText(charSequence);
            if (this.f20d.getVisibility() != 0) {
                this.f20d.setVisibility(0);
            }
        }
    }
}
