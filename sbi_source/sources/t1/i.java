package t1;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class i extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f2187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c0 f2188b;
    public n1.a c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ColorStateList f2189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ColorStateList f2190e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ColorStateList f2191f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f2192g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Rect f2193h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f2194i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f2195j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f2196k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2197l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f2198m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f2199n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2200o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f2201p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Paint.Style f2202q;

    public i(o oVar) {
        this.f2189d = null;
        this.f2190e = null;
        this.f2191f = null;
        this.f2192g = PorterDuff.Mode.SRC_IN;
        this.f2193h = null;
        this.f2194i = 1.0f;
        this.f2195j = 1.0f;
        this.f2197l = 255;
        this.f2198m = 0.0f;
        this.f2199n = 0.0f;
        this.f2200o = 0;
        this.f2201p = 0;
        this.f2202q = Paint.Style.FILL_AND_STROKE;
        this.f2187a = oVar;
        this.c = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        k kVar = new k(this);
        kVar.f2208f = true;
        kVar.f2209g = true;
        return kVar;
    }

    public i(i iVar) {
        this.f2189d = null;
        this.f2190e = null;
        this.f2191f = null;
        this.f2192g = PorterDuff.Mode.SRC_IN;
        this.f2193h = null;
        this.f2194i = 1.0f;
        this.f2195j = 1.0f;
        this.f2197l = 255;
        this.f2198m = 0.0f;
        this.f2199n = 0.0f;
        this.f2200o = 0;
        this.f2201p = 0;
        this.f2202q = Paint.Style.FILL_AND_STROKE;
        this.f2187a = iVar.f2187a;
        this.f2188b = iVar.f2188b;
        this.c = iVar.c;
        this.f2196k = iVar.f2196k;
        this.f2189d = iVar.f2189d;
        this.f2190e = iVar.f2190e;
        this.f2192g = iVar.f2192g;
        this.f2191f = iVar.f2191f;
        this.f2197l = iVar.f2197l;
        this.f2194i = iVar.f2194i;
        this.f2201p = iVar.f2201p;
        this.f2195j = iVar.f2195j;
        this.f2198m = iVar.f2198m;
        this.f2199n = iVar.f2199n;
        this.f2200o = iVar.f2200o;
        this.f2202q = iVar.f2202q;
        if (iVar.f2193h != null) {
            this.f2193h = new Rect(iVar.f2193h);
        }
    }
}
