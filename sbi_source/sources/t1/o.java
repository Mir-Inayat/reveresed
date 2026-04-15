package t1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f2240a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f2241b = new m();
    public e c = new m();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f2242d = new m();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f2243e = new a(0.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f2244f = new a(0.0f);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d f2245g = new a(0.0f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d f2246h = new a(0.0f);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g f2247i = new g(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public g f2248j = new g(0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public g f2249k = new g(0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public g f2250l = new g(0);

    public static n a(Context context, int i2, int i3, a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i2);
        if (i3 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i3, true);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(c1.a.f509s);
        try {
            int i4 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i5 = typedArrayObtainStyledAttributes.getInt(3, i4);
            int i6 = typedArrayObtainStyledAttributes.getInt(4, i4);
            int i7 = typedArrayObtainStyledAttributes.getInt(2, i4);
            int i8 = typedArrayObtainStyledAttributes.getInt(1, i4);
            d dVarC = c(typedArrayObtainStyledAttributes, 5, aVar);
            d dVarC2 = c(typedArrayObtainStyledAttributes, 8, dVarC);
            d dVarC3 = c(typedArrayObtainStyledAttributes, 9, dVarC);
            d dVarC4 = c(typedArrayObtainStyledAttributes, 7, dVarC);
            d dVarC5 = c(typedArrayObtainStyledAttributes, 6, dVarC);
            n nVar = new n();
            nVar.f2229a = e.k(i5);
            nVar.f2232e = dVarC2;
            nVar.f2230b = e.k(i6);
            nVar.f2233f = dVarC3;
            nVar.c = e.k(i7);
            nVar.f2234g = dVarC4;
            nVar.f2231d = e.k(i8);
            nVar.f2235h = dVarC5;
            return nVar;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static n b(Context context, AttributeSet attributeSet, int i2, int i3) {
        a aVar = new a(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c1.a.f503m, i2, i3);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public static d c(TypedArray typedArray, int i2, d dVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i2);
        if (typedValuePeekValue != null) {
            int i3 = typedValuePeekValue.type;
            if (i3 == 5) {
                return new a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i3 == 6) {
                return new l(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return dVar;
    }

    public final boolean d() {
        return (this.f2241b instanceof m) && (this.f2240a instanceof m) && (this.c instanceof m) && (this.f2242d instanceof m);
    }

    public final boolean e(RectF rectF) {
        boolean z = this.f2250l.getClass().equals(g.class) && this.f2248j.getClass().equals(g.class) && this.f2247i.getClass().equals(g.class) && this.f2249k.getClass().equals(g.class);
        float fA = this.f2243e.a(rectF);
        return z && ((this.f2244f.a(rectF) > fA ? 1 : (this.f2244f.a(rectF) == fA ? 0 : -1)) == 0 && (this.f2246h.a(rectF) > fA ? 1 : (this.f2246h.a(rectF) == fA ? 0 : -1)) == 0 && (this.f2245g.a(rectF) > fA ? 1 : (this.f2245g.a(rectF) == fA ? 0 : -1)) == 0) && d();
    }

    public final n f() {
        n nVar = new n();
        nVar.f2229a = this.f2240a;
        nVar.f2230b = this.f2241b;
        nVar.c = this.c;
        nVar.f2231d = this.f2242d;
        nVar.f2232e = this.f2243e;
        nVar.f2233f = this.f2244f;
        nVar.f2234g = this.f2245g;
        nVar.f2235h = this.f2246h;
        nVar.f2236i = this.f2247i;
        nVar.f2237j = this.f2248j;
        nVar.f2238k = this.f2249k;
        nVar.f2239l = this.f2250l;
        return nVar;
    }

    public final String toString() {
        return "[" + this.f2243e + ", " + this.f2244f + ", " + this.f2245g + ", " + this.f2246h + "]";
    }
}
