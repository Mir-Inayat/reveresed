package w1;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.redhand.laugiytr.R;
import f.m0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class s {
    public ColorStateList A;
    public Typeface B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2575b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f2576d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f2577e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f2578f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f2579g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextInputLayout f2580h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f2581i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2582j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public FrameLayout f2583k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AnimatorSet f2584l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f2585m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f2586n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2587o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f2588p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f2589q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public m0 f2590r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CharSequence f2591s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2592t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f2593u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ColorStateList f2594v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public CharSequence f2595w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f2596x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public m0 f2597y;
    public int z;

    public s(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f2579g = context;
        this.f2580h = textInputLayout;
        this.f2585m = context.getResources().getDimensionPixelSize(R.NP_MANAGER6.NP_MANAGER);
        this.f2574a = a0.a.a0(context, R.NP_MANAGER3.NP_MANAGER, 217);
        this.f2575b = a0.a.a0(context, R.NP_MANAGER3.NP_MANAGER, 167);
        this.c = a0.a.a0(context, R.NP_MANAGER3.NP_MANAGER, 167);
        this.f2576d = a0.a.b0(context, R.NP_MANAGER3.NP_MANAGER, d1.a.f834d);
        LinearInterpolator linearInterpolator = d1.a.f832a;
        this.f2577e = a0.a.b0(context, R.NP_MANAGER3.NP_MANAGER, linearInterpolator);
        this.f2578f = a0.a.b0(context, R.NP_MANAGER3.NP_MANAGER, linearInterpolator);
    }

    public final void a(m0 m0Var, int i2) {
        if (this.f2581i == null && this.f2583k == null) {
            Context context = this.f2579g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f2581i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f2581i;
            TextInputLayout textInputLayout = this.f2580h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f2583k = new FrameLayout(context);
            this.f2581i.addView(this.f2583k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i2 == 0 || i2 == 1) {
            this.f2583k.setVisibility(0);
            this.f2583k.addView(m0Var);
        } else {
            this.f2581i.addView(m0Var, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f2581i.setVisibility(0);
        this.f2582j++;
    }

    public final void b() {
        if (this.f2581i != null) {
            TextInputLayout textInputLayout = this.f2580h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f2579g;
                boolean zG = a0.a.G(context);
                LinearLayout linearLayout = this.f2581i;
                int paddingStart = editText.getPaddingStart();
                if (zG) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.NP_MANAGER6.NP_MANAGER);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.NP_MANAGER6.NP_MANAGER);
                if (zG) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.NP_MANAGER6.NP_MANAGER);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (zG) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.NP_MANAGER6.NP_MANAGER);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f2584l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z, m0 m0Var, int i2, int i3, int i4) {
        if (m0Var == null || !z) {
            return;
        }
        if (i2 == i4 || i2 == i3) {
            boolean z2 = i4 == i2;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(m0Var, (Property<m0, Float>) View.ALPHA, z2 ? 1.0f : 0.0f);
            int i5 = this.c;
            objectAnimatorOfFloat.setDuration(z2 ? this.f2575b : i5);
            objectAnimatorOfFloat.setInterpolator(z2 ? this.f2577e : this.f2578f);
            if (i2 == i4 && i3 != 0) {
                objectAnimatorOfFloat.setStartDelay(i5);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i4 != i2 || i3 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(m0Var, (Property<m0, Float>) View.TRANSLATION_Y, -this.f2585m, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.f2574a);
            objectAnimatorOfFloat2.setInterpolator(this.f2576d);
            objectAnimatorOfFloat2.setStartDelay(i5);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    public final TextView e(int i2) {
        if (i2 == 1) {
            return this.f2590r;
        }
        if (i2 != 2) {
            return null;
        }
        return this.f2597y;
    }

    public final void f() {
        this.f2588p = null;
        c();
        if (this.f2586n == 1) {
            if (!this.f2596x || TextUtils.isEmpty(this.f2595w)) {
                this.f2587o = 0;
            } else {
                this.f2587o = 2;
            }
        }
        i(this.f2586n, this.f2587o, h(this.f2590r, ""));
    }

    public final void g(m0 m0Var, int i2) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f2581i;
        if (linearLayout == null) {
            return;
        }
        if ((i2 == 0 || i2 == 1) && (frameLayout = this.f2583k) != null) {
            frameLayout.removeView(m0Var);
        } else {
            linearLayout.removeView(m0Var);
        }
        int i3 = this.f2582j - 1;
        this.f2582j = i3;
        LinearLayout linearLayout2 = this.f2581i;
        if (i3 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(m0 m0Var, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.f2580h;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.f2587o == this.f2586n && m0Var != null && TextUtils.equals(m0Var.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    public final void i(int i2, int i3, boolean z) {
        TextView textViewE;
        TextView textViewE2;
        s sVar = this;
        if (i2 == i3) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            sVar.f2584l = animatorSet;
            ArrayList arrayList = new ArrayList();
            sVar.d(arrayList, sVar.f2596x, sVar.f2597y, 2, i2, i3);
            sVar.d(arrayList, sVar.f2589q, sVar.f2590r, 1, i2, i3);
            int size = arrayList.size();
            long jMax = 0;
            for (int i4 = 0; i4 < size; i4++) {
                Animator animator = (Animator) arrayList.get(i4);
                jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
            valueAnimatorOfInt.setDuration(jMax);
            arrayList.add(0, valueAnimatorOfInt);
            animatorSet.playTogether(arrayList);
            v0.e eVar = new v0.e(this, i3, e(i2), i2, sVar.e(i3));
            sVar = this;
            animatorSet.addListener(eVar);
            animatorSet.start();
        } else if (i2 != i3) {
            if (i3 != 0 && (textViewE2 = sVar.e(i3)) != null) {
                textViewE2.setVisibility(0);
                textViewE2.setAlpha(1.0f);
            }
            if (i2 != 0 && (textViewE = e(i2)) != null) {
                textViewE.setVisibility(4);
                if (i2 == 1) {
                    textViewE.setText((CharSequence) null);
                }
            }
            sVar.f2586n = i3;
        }
        TextInputLayout textInputLayout = sVar.f2580h;
        textInputLayout.t();
        textInputLayout.w(z, false);
        textInputLayout.z();
    }
}
