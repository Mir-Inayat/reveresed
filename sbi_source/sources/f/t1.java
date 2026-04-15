package f;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.redhand.laugiytr.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class t1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static t1 f1181g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakHashMap f1183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f1184b = new WeakHashMap(0);
    public TypedValue c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s f1186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f1180f = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final s1 f1182h = new s1(6);

    public static synchronized t1 b() {
        try {
            if (f1181g == null) {
                f1181g = new t1();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f1181g;
    }

    public static synchronized PorterDuffColorFilter e(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        s1 s1Var = f1182h;
        s1Var.getClass();
        int i3 = (31 + i2) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) s1Var.c(Integer.valueOf(mode.hashCode() + i3));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i2) {
        Drawable drawableNewDrawable;
        WeakReference weakReference;
        if (this.c == null) {
            this.c = new TypedValue();
        }
        TypedValue typedValue = this.c;
        context.getResources().getValue(i2, typedValue, true);
        long j2 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            i.h hVar = (i.h) this.f1184b.get(context);
            drawableNewDrawable = null;
            if (hVar != null && (weakReference = (WeakReference) hVar.b(j2)) != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    int iB = j.a.b(hVar.f1375b, hVar.f1376d, j2);
                    if (iB >= 0) {
                        Object[] objArr = hVar.c;
                        Object obj = objArr[iB];
                        Object obj2 = i.i.f1377a;
                        if (obj != obj2) {
                            objArr[iB] = obj2;
                            hVar.f1374a = true;
                        }
                    }
                }
            }
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        LayerDrawable layerDrawableC = null;
        if (this.f1186e != null) {
            if (i2 == R.NP_MANAGER7.NP_MANAGER) {
                layerDrawableC = new LayerDrawable(new Drawable[]{c(context, R.NP_MANAGER7.NP_MANAGER), c(context, R.NP_MANAGER7.NP_MANAGER)});
            } else if (i2 == R.NP_MANAGER7.NP_MANAGER) {
                layerDrawableC = s.c(this, context, R.NP_MANAGER6.NP_MANAGER);
            } else if (i2 == R.NP_MANAGER7.NP_MANAGER) {
                layerDrawableC = s.c(this, context, R.NP_MANAGER6.NP_MANAGER);
            } else if (i2 == R.NP_MANAGER7.NP_MANAGER) {
                layerDrawableC = s.c(this, context, R.NP_MANAGER6.NP_MANAGER);
            }
        }
        if (layerDrawableC == null) {
            return layerDrawableC;
        }
        layerDrawableC.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableC.getConstantState();
                if (constantState2 != null) {
                    i.h hVar2 = (i.h) this.f1184b.get(context);
                    if (hVar2 == null) {
                        hVar2 = new i.h();
                        this.f1184b.put(context, hVar2);
                    }
                    hVar2.d(j2, new WeakReference(constantState2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return layerDrawableC;
    }

    public final synchronized Drawable c(Context context, int i2) {
        return d(context, i2);
    }

    public final synchronized Drawable d(Context context, int i2) {
        Drawable drawableA;
        try {
            if (!this.f1185d) {
                this.f1185d = true;
                Drawable drawableC = c(context, R.NP_MANAGER7.NP_MANAGER);
                if (drawableC == null || (!(drawableC instanceof a1.a) && !"android.graphics.drawable.VectorDrawable".equals(drawableC.getClass().getName()))) {
                    this.f1185d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableA = a(context, i2);
            if (drawableA == null) {
                drawableA = v.a.b(context, i2);
            }
            if (drawableA != null) {
                drawableA = g(context, i2, drawableA);
            }
            if (drawableA != null) {
                u0.a(drawableA);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableA;
    }

    public final synchronized ColorStateList f(Context context, int i2) {
        ColorStateList colorStateList;
        i.l lVar;
        WeakHashMap weakHashMap = this.f1183a;
        ColorStateList colorStateListD = null;
        colorStateList = (weakHashMap == null || (lVar = (i.l) weakHashMap.get(context)) == null) ? null : (ColorStateList) lVar.b(i2);
        if (colorStateList == null) {
            s sVar = this.f1186e;
            if (sVar != null) {
                colorStateListD = sVar.d(context, i2);
            }
            if (colorStateListD != null) {
                if (this.f1183a == null) {
                    this.f1183a = new WeakHashMap();
                }
                i.l lVar2 = (i.l) this.f1183a.get(context);
                if (lVar2 == null) {
                    lVar2 = new i.l();
                    this.f1183a.put(context, lVar2);
                }
                lVar2.a(i2, colorStateListD);
            }
            colorStateList = colorStateListD;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable g(android.content.Context r9, int r10, android.graphics.drawable.Drawable r11) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f.t1.g(android.content.Context, int, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
