package w1;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.redhand.laugiytr.R;
import f.m0;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class u extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextInputLayout f2601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0 f2602b;
    public CharSequence c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f2603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ColorStateList f2604e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f2605f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2606g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageView.ScaleType f2607h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View.OnLongClickListener f2608i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f2609j;

    public u(TextInputLayout textInputLayout, androidx.emoji2.text.t tVar) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f2601a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.NP_MANAGER11.NP_MANAGER, (ViewGroup) this, false);
        this.f2603d = checkableImageButton;
        m0 m0Var = new m0(getContext(), null);
        this.f2602b = m0Var;
        if (a0.a.G(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f2608i;
        checkableImageButton.setOnClickListener(null);
        t1.e.K(checkableImageButton, onLongClickListener);
        this.f2608i = null;
        checkableImageButton.setOnLongClickListener(null);
        t1.e.K(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) tVar.c;
        if (typedArray.hasValue(70)) {
            this.f2604e = a0.a.p(getContext(), tVar, 70);
        }
        if (typedArray.hasValue(71)) {
            this.f2605f = o1.k.f(typedArray.getInt(71, -1), null);
        }
        if (typedArray.hasValue(67)) {
            b(tVar.m(67));
            if (typedArray.hasValue(66) && checkableImageButton.getContentDescription() != (text = typedArray.getText(66))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(65, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(68, getResources().getDimensionPixelSize(R.NP_MANAGER6.NP_MANAGER));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f2606g) {
            this.f2606g = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(69)) {
            ImageView.ScaleType scaleTypeH = t1.e.h(typedArray.getInt(69, -1));
            this.f2607h = scaleTypeH;
            checkableImageButton.setScaleType(scaleTypeH);
        }
        m0Var.setVisibility(8);
        m0Var.setId(R.NP_MANAGER8.NP_MANAGER);
        m0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        m0Var.setAccessibilityLiveRegion(1);
        m0Var.setTextAppearance(typedArray.getResourceId(61, 0));
        if (typedArray.hasValue(62)) {
            m0Var.setTextColor(tVar.l(62));
        }
        CharSequence text2 = typedArray.getText(60);
        this.c = TextUtils.isEmpty(text2) ? null : text2;
        m0Var.setText(text2);
        e();
        addView(checkableImageButton);
        addView(m0Var);
    }

    public final int a() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.f2603d;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        return this.f2602b.getPaddingStart() + getPaddingStart() + marginEnd;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f2603d;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f2604e;
            PorterDuff.Mode mode = this.f2605f;
            TextInputLayout textInputLayout = this.f2601a;
            t1.e.a(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            t1.e.I(textInputLayout, checkableImageButton, this.f2604e);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.f2608i;
        checkableImageButton.setOnClickListener(null);
        t1.e.K(checkableImageButton, onLongClickListener);
        this.f2608i = null;
        checkableImageButton.setOnLongClickListener(null);
        t1.e.K(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z) {
        CheckableImageButton checkableImageButton = this.f2603d;
        if ((checkableImageButton.getVisibility() == 0) != z) {
            checkableImageButton.setVisibility(z ? 0 : 8);
            d();
            e();
        }
    }

    public final void d() {
        EditText editText = this.f2601a.f683e;
        if (editText == null) {
            return;
        }
        this.f2602b.setPaddingRelative(this.f2603d.getVisibility() == 0 ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.NP_MANAGER6.NP_MANAGER), editText.getCompoundPaddingBottom());
    }

    public final void e() {
        int i2 = (this.c == null || this.f2609j) ? 8 : 0;
        setVisibility((this.f2603d.getVisibility() == 0 || i2 == 0) ? 0 : 8);
        this.f2602b.setVisibility(i2);
        this.f2601a.s();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        d();
    }
}
