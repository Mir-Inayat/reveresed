package e;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.redhand.laugiytr.R;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f939b;
    public final boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f941e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f943g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public o f944h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public l f945i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public PopupWindow.OnDismissListener f946j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f942f = 8388611;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final m f947k = new m(this);

    public n(Context context, j jVar, View view, boolean z, int i2, int i3) {
        this.f938a = context;
        this.f939b = jVar;
        this.f941e = view;
        this.c = z;
        this.f940d = i2;
    }

    public final l a() {
        l sVar;
        if (this.f945i == null) {
            Context context = this.f938a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.NP_MANAGER6.NP_MANAGER)) {
                sVar = new g(context, this.f941e, this.f940d, this.c);
            } else {
                sVar = new s(this.f938a, this.f939b, this.f941e, this.f940d, this.c);
            }
            sVar.l(this.f939b);
            sVar.r(this.f947k);
            sVar.n(this.f941e);
            sVar.f(this.f944h);
            sVar.o(this.f943g);
            sVar.p(this.f942f);
            this.f945i = sVar;
        }
        return this.f945i;
    }

    public final boolean b() {
        l lVar = this.f945i;
        return lVar != null && lVar.g();
    }

    public void c() {
        this.f945i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f946j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i2, int i3, boolean z, boolean z2) {
        l lVarA = a();
        lVarA.s(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f942f, this.f941e.getLayoutDirection()) & 7) == 5) {
                i2 -= this.f941e.getWidth();
            }
            lVarA.q(i2);
            lVarA.t(i3);
            int i4 = (int) ((this.f938a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            lVarA.f936a = new Rect(i2 - i4, i3 - i4, i2 + i4, i3 + i4);
        }
        lVarA.c();
    }
}
