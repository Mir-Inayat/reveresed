package w1;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import com.redhand.laugiytr.R;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class l extends q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2531f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f2532g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AutoCompleteTextView f2533h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f2534i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f2535j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final k f2536k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f2537l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f2538m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f2539n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f2540o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AccessibilityManager f2541p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ValueAnimator f2542q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ValueAnimator f2543r;

    /* JADX WARN: Type inference failed for: r0v2, types: [w1.k] */
    public l(p pVar) {
        super(pVar);
        this.f2534i = new a(1, this);
        this.f2535j = new b(this, 1);
        this.f2536k = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: w1.k
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                l lVar = this.f2529a;
                AutoCompleteTextView autoCompleteTextView = lVar.f2533h;
                if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
                    return;
                }
                lVar.f2572d.setImportantForAccessibility(z ? 2 : 1);
            }
        };
        this.f2540o = Long.MAX_VALUE;
        this.f2531f = a0.a.a0(pVar.getContext(), R.NP_MANAGER3.NP_MANAGER, 67);
        this.f2530e = a0.a.a0(pVar.getContext(), R.NP_MANAGER3.NP_MANAGER, 50);
        this.f2532g = a0.a.b0(pVar.getContext(), R.NP_MANAGER3.NP_MANAGER, d1.a.f832a);
    }

    @Override // w1.q
    public final void a() {
        if (this.f2541p.isTouchExplorationEnabled() && this.f2533h.getInputType() != 0 && !this.f2572d.hasFocus()) {
            this.f2533h.dismissDropDown();
        }
        this.f2533h.post(new androidx.emoji2.text.u(8, this));
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
        return this.f2535j;
    }

    @Override // w1.q
    public final View.OnClickListener f() {
        return this.f2534i;
    }

    @Override // w1.q
    public final AccessibilityManager.TouchExplorationStateChangeListener h() {
        return this.f2536k;
    }

    @Override // w1.q
    public final boolean i(int i2) {
        return i2 != 0;
    }

    @Override // w1.q
    public final boolean k() {
        return this.f2539n;
    }

    @Override // w1.q
    public final void l(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f2533h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: w1.i
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    l lVar = this.f2527a;
                    long j2 = jUptimeMillis - lVar.f2540o;
                    if (j2 < 0 || j2 > 300) {
                        lVar.f2538m = false;
                    }
                    lVar.t();
                    lVar.f2538m = true;
                    lVar.f2540o = SystemClock.uptimeMillis();
                }
                return false;
            }
        });
        this.f2533h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: w1.j
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                l lVar = this.f2528a;
                lVar.f2538m = true;
                lVar.f2540o = SystemClock.uptimeMillis();
                lVar.s(false);
            }
        });
        this.f2533h.setThreshold(0);
        TextInputLayout textInputLayout = this.f2570a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.f2541p.isTouchExplorationEnabled()) {
            this.f2572d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // w1.q
    public final void m(g0.i iVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = iVar.f1336a;
        if (this.f2533h.getInputType() == 0) {
            iVar.i(Spinner.class.getName());
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26 ? accessibilityNodeInfo.isShowingHintText() : iVar.e(4)) {
            if (i2 >= 26) {
                accessibilityNodeInfo.setHintText(null);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", null);
            }
        }
    }

    @Override // w1.q
    public final void n(AccessibilityEvent accessibilityEvent) {
        if (this.f2541p.isEnabled() && this.f2533h.getInputType() == 0) {
            boolean z = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f2539n && !this.f2533h.isPopupShowing();
            if (accessibilityEvent.getEventType() == 1 || z) {
                t();
                this.f2538m = true;
                this.f2540o = SystemClock.uptimeMillis();
            }
        }
    }

    @Override // w1.q
    public final void q() {
        int i2 = 2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f2532g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f2531f);
        valueAnimatorOfFloat.addUpdateListener(new c(this, i2));
        this.f2543r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.f2530e);
        valueAnimatorOfFloat2.addUpdateListener(new c(this, i2));
        this.f2542q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new f.b(3, this));
        this.f2541p = (AccessibilityManager) this.c.getSystemService("accessibility");
    }

    @Override // w1.q
    public final void r() {
        AutoCompleteTextView autoCompleteTextView = this.f2533h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f2533h.setOnDismissListener(null);
        }
    }

    public final void s(boolean z) {
        if (this.f2539n != z) {
            this.f2539n = z;
            this.f2543r.cancel();
            this.f2542q.start();
        }
    }

    public final void t() {
        if (this.f2533h == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() - this.f2540o;
        if (jUptimeMillis < 0 || jUptimeMillis > 300) {
            this.f2538m = false;
        }
        if (this.f2538m) {
            this.f2538m = false;
            return;
        }
        s(!this.f2539n);
        if (!this.f2539n) {
            this.f2533h.dismissDropDown();
        } else {
            this.f2533h.requestFocus();
            this.f2533h.showDropDown();
        }
    }
}
