package w1;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.redhand.laugiytr.R;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class t extends q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EditText f2599f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f2600g;

    public t(p pVar, int i2) {
        super(pVar);
        this.f2598e = R.NP_MANAGER7.NP_MANAGER;
        this.f2600g = new a(2, this);
        if (i2 != 0) {
            this.f2598e = i2;
        }
    }

    @Override // w1.q
    public final void b() {
        p();
    }

    @Override // w1.q
    public final int c() {
        return R.NP_MANAGER14.NP_MANAGER;
    }

    @Override // w1.q
    public final int d() {
        return this.f2598e;
    }

    @Override // w1.q
    public final View.OnClickListener f() {
        return this.f2600g;
    }

    @Override // w1.q
    public final boolean j() {
        return true;
    }

    @Override // w1.q
    public final boolean k() {
        EditText editText = this.f2599f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // w1.q
    public final void l(EditText editText) {
        this.f2599f = editText;
        p();
    }

    @Override // w1.q
    public final void q() {
        EditText editText = this.f2599f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f2599f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // w1.q
    public final void r() {
        EditText editText = this.f2599f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
