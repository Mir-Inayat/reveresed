package i1;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import com.redhand.laugiytr.R;
import t1.c0;
import t1.i;
import t1.k;
import t1.o;
import t1.z;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MaterialButton f1400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o f1401b;
    public c0 c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n0.f f1402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f1403e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1404f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1405g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1406h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1407i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1408j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1409k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f1410l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ColorStateList f1411m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ColorStateList f1412n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ColorStateList f1413o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public k f1414p;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f1418t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public RippleDrawable f1420v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f1421w;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f1415q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f1416r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f1417s = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f1419u = true;

    public g(MaterialButton materialButton, o oVar) {
        this.f1400a = materialButton;
        this.f1401b = oVar;
    }

    public final k a(boolean z) {
        RippleDrawable rippleDrawable = this.f1420v;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (k) ((LayerDrawable) ((InsetDrawable) this.f1420v.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final void b(int i2, int i3) {
        MaterialButton materialButton = this.f1400a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i4 = this.f1406h;
        int i5 = this.f1407i;
        this.f1407i = i3;
        this.f1406h = i2;
        if (!this.f1416r) {
            c();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i2) - i4, paddingEnd, (paddingBottom + i3) - i5);
    }

    public final void c() {
        k kVar = new k(this.f1401b);
        c0 c0Var = this.c;
        if (c0Var != null) {
            kVar.o(c0Var);
        }
        n0.f fVar = this.f1402d;
        if (fVar != null) {
            kVar.l(fVar);
        }
        a aVar = this.f1403e;
        if (aVar != null) {
            kVar.D = aVar;
        }
        MaterialButton materialButton = this.f1400a;
        kVar.k(materialButton.getContext());
        kVar.setTintList(this.f1411m);
        PorterDuff.Mode mode = this.f1410l;
        if (mode != null) {
            kVar.setTintMode(mode);
        }
        float f3 = this.f1409k;
        ColorStateList colorStateList = this.f1412n;
        kVar.f2205b.f2196k = f3;
        kVar.invalidateSelf();
        i iVar = kVar.f2205b;
        if (iVar.f2190e != colorStateList) {
            iVar.f2190e = colorStateList;
            kVar.onStateChange(kVar.getState());
        }
        k kVar2 = new k(this.f1401b);
        c0 c0Var2 = this.c;
        if (c0Var2 != null) {
            kVar2.o(c0Var2);
        }
        n0.f fVar2 = this.f1402d;
        if (fVar2 != null) {
            kVar2.l(fVar2);
        }
        kVar2.setTint(0);
        float f4 = this.f1409k;
        int iN = this.f1415q ? a0.a.n(materialButton, R.NP_MANAGER3.NP_MANAGER) : 0;
        kVar2.f2205b.f2196k = f4;
        kVar2.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iN);
        i iVar2 = kVar2.f2205b;
        if (iVar2.f2190e != colorStateListValueOf) {
            iVar2.f2190e = colorStateListValueOf;
            kVar2.onStateChange(kVar2.getState());
        }
        k kVar3 = new k(this.f1401b);
        this.f1414p = kVar3;
        c0 c0Var3 = this.c;
        if (c0Var3 != null) {
            kVar3.o(c0Var3);
        }
        n0.f fVar3 = this.f1402d;
        if (fVar3 != null) {
            this.f1414p.l(fVar3);
        }
        this.f1414p.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(r1.a.a(this.f1413o), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{kVar2, kVar}), this.f1404f, this.f1406h, this.f1405g, this.f1407i), this.f1414p);
        this.f1420v = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        k kVarA = a(false);
        if (kVarA != null) {
            kVarA.m(this.f1421w);
            kVarA.setState(materialButton.getDrawableState());
        }
    }

    public final void d() {
        k kVarA = a(false);
        if (kVarA != null) {
            c0 c0Var = this.c;
            if (c0Var != null) {
                kVarA.o(c0Var);
            } else {
                kVarA.setShapeAppearanceModel(this.f1401b);
            }
            n0.f fVar = this.f1402d;
            if (fVar != null) {
                kVarA.l(fVar);
            }
        }
        k kVarA2 = a(true);
        if (kVarA2 != null) {
            c0 c0Var2 = this.c;
            if (c0Var2 != null) {
                kVarA2.o(c0Var2);
            } else {
                kVarA2.setShapeAppearanceModel(this.f1401b);
            }
            n0.f fVar2 = this.f1402d;
            if (fVar2 != null) {
                kVarA2.l(fVar2);
            }
        }
        RippleDrawable rippleDrawable = this.f1420v;
        z zVar = (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) ? null : this.f1420v.getNumberOfLayers() > 2 ? (z) this.f1420v.getDrawable(2) : (z) this.f1420v.getDrawable(1);
        if (zVar != null) {
            zVar.setShapeAppearanceModel(this.f1401b);
            if (zVar instanceof k) {
                k kVar = (k) zVar;
                c0 c0Var3 = this.c;
                if (c0Var3 != null) {
                    kVar.o(c0Var3);
                }
                n0.f fVar3 = this.f1402d;
                if (fVar3 != null) {
                    kVar.l(fVar3);
                }
            }
        }
    }

    public final void e() {
        k kVarA = a(false);
        k kVarA2 = a(true);
        if (kVarA != null) {
            float f3 = this.f1409k;
            ColorStateList colorStateList = this.f1412n;
            kVarA.f2205b.f2196k = f3;
            kVarA.invalidateSelf();
            i iVar = kVarA.f2205b;
            if (iVar.f2190e != colorStateList) {
                iVar.f2190e = colorStateList;
                kVarA.onStateChange(kVarA.getState());
            }
            if (kVarA2 != null) {
                float f4 = this.f1409k;
                int iN = this.f1415q ? a0.a.n(this.f1400a, R.NP_MANAGER3.NP_MANAGER) : 0;
                kVarA2.f2205b.f2196k = f4;
                kVarA2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iN);
                i iVar2 = kVarA2.f2205b;
                if (iVar2.f2190e != colorStateListValueOf) {
                    iVar2.f2190e = colorStateListValueOf;
                    kVarA2.onStateChange(kVarA2.getState());
                }
            }
        }
    }
}
