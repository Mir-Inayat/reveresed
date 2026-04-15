package w1;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextInputLayout f2570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f2571b;
    public final Context c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f2572d;

    public q(p pVar) {
        this.f2570a = pVar.f2549a;
        this.f2571b = pVar;
        this.c = pVar.getContext();
        this.f2572d = pVar.f2554g;
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public AccessibilityManager.TouchExplorationStateChangeListener h() {
        return null;
    }

    public boolean i(int i2) {
        return true;
    }

    public boolean j() {
        return this instanceof l;
    }

    public boolean k() {
        return false;
    }

    public final void p() {
        this.f2571b.f(false);
    }

    public void l(EditText editText) {
    }

    public void m(g0.i iVar) {
    }

    public void n(AccessibilityEvent accessibilityEvent) {
    }

    public void o(boolean z) {
    }

    public void a() {
    }

    public void b() {
    }

    public void q() {
    }

    public void r() {
    }
}
