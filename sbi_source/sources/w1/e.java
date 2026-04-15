package w1;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.redhand.laugiytr.R;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class e extends q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2516e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2517f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f2518g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TimeInterpolator f2519h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public EditText f2520i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f2521j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f2522k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AnimatorSet f2523l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ValueAnimator f2524m;

    public e(p pVar) {
        super(pVar);
        this.f2521j = new a(0, this);
        this.f2522k = new b(this, 0);
        this.f2516e = a0.a.a0(pVar.getContext(), R.NP_MANAGER3.NP_MANAGER, 100);
        this.f2517f = a0.a.a0(pVar.getContext(), R.NP_MANAGER3.NP_MANAGER, 150);
        this.f2518g = a0.a.b0(pVar.getContext(), R.NP_MANAGER3.NP_MANAGER, d1.a.f832a);
        this.f2519h = a0.a.b0(pVar.getContext(), R.NP_MANAGER3.NP_MANAGER, d1.a.f834d);
    }

    @Override // w1.q
    public final void a() {
        if (this.f2571b.f2563p != null) {
            return;
        }
        s(t());
    }

    @Override // w1.q
    public final int c() {
        return R.NP_MANAGER14.NP_MANAGER;
    }

    @Override // w1.q
    public final int d() {
        return R.NP_MANAGER7.NP_MANAGER;
    }

    @Override // w1.q
    public final View.OnFocusChangeListener e() {
        return this.f2522k;
    }

    @Override // w1.q
    public final View.OnClickListener f() {
        return this.f2521j;
    }

    @Override // w1.q
    public final View.OnFocusChangeListener g() {
        return this.f2522k;
    }

    @Override // w1.q
    public final void l(EditText editText) {
        this.f2520i = editText;
        this.f2570a.setEndIconVisible(t());
    }

    @Override // w1.q
    public final void o(boolean z) {
        if (this.f2571b.f2563p == null) {
            return;
        }
        s(z);
    }

    @Override // w1.q
    public final void q() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f2519h);
        valueAnimatorOfFloat.setDuration(this.f2517f);
        valueAnimatorOfFloat.addUpdateListener(new c(this, 1));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f2518g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i2 = this.f2516e;
        valueAnimatorOfFloat2.setDuration(i2);
        valueAnimatorOfFloat2.addUpdateListener(new c(this, 0));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f2523l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f2523l.addListener(new d(this, 0));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i2);
        valueAnimatorOfFloat3.addUpdateListener(new c(this, 0));
        this.f2524m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new d(this, 1));
    }

    @Override // w1.q
    public final void r() {
        EditText editText = this.f2520i;
        if (editText != null) {
            editText.post(new androidx.emoji2.text.u(7, this));
        }
    }

    public final void s(boolean z) {
        boolean z2 = this.f2571b.d() == z;
        if (z && !this.f2523l.isRunning()) {
            this.f2524m.cancel();
            this.f2523l.start();
            if (z2) {
                this.f2523l.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.f2523l.cancel();
        this.f2524m.start();
        if (z2) {
            this.f2524m.end();
        }
    }

    public final boolean t() {
        EditText editText = this.f2520i;
        if (editText != null) {
            return (editText.hasFocus() || this.f2572d.hasFocus()) && this.f2520i.getText().length() > 0;
        }
        return false;
    }
}
