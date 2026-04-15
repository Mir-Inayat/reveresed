package q1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import w.n;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f2061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2062b;
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2063d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2064e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f2065f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f2066g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f2067h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f2068i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f2069j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ColorStateList f2070k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f2071l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f2072m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f2073n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f2074o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Typeface f2075p;

    public d(Context context, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i2, b.a.f448r);
        this.f2071l = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.f2070k = a0.a.o(context, typedArrayObtainStyledAttributes, 3);
        a0.a.o(context, typedArrayObtainStyledAttributes, 4);
        a0.a.o(context, typedArrayObtainStyledAttributes, 5);
        this.f2063d = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f2064e = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i3 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f2072m = typedArrayObtainStyledAttributes.getResourceId(i3, 0);
        this.f2062b = typedArrayObtainStyledAttributes.getString(i3);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f2061a = a0.a.o(context, typedArrayObtainStyledAttributes, 6);
        this.f2065f = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f2066g = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.f2067h = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i2, c1.a.f505o);
        this.f2068i = typedArrayObtainStyledAttributes2.hasValue(0);
        this.f2069j = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        if (Build.VERSION.SDK_INT >= 26) {
            this.c = typedArrayObtainStyledAttributes2.getString(typedArrayObtainStyledAttributes2.hasValue(3) ? 3 : 1);
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f2075p;
        int i2 = this.f2063d;
        if (typeface == null && (str = this.f2062b) != null) {
            this.f2075p = Typeface.create(str, i2);
        }
        if (this.f2075p == null) {
            int i3 = this.f2064e;
            if (i3 == 1) {
                this.f2075p = Typeface.SANS_SERIF;
            } else if (i3 == 2) {
                this.f2075p = Typeface.SERIF;
            } else if (i3 != 3) {
                this.f2075p = Typeface.DEFAULT;
            } else {
                this.f2075p = Typeface.MONOSPACE;
            }
            this.f2075p = Typeface.create(this.f2075p, i2);
        }
    }

    public final void b(Context context, a0.a aVar) {
        if (!c(context)) {
            a();
        }
        int i2 = this.f2072m;
        if (i2 == 0) {
            this.f2073n = true;
        }
        if (this.f2073n) {
            aVar.P(this.f2075p, true);
            return;
        }
        try {
            b bVar = new b(this, aVar);
            ThreadLocal threadLocal = n.f2490a;
            if (context.isRestricted()) {
                bVar.a(-4);
            } else {
                n.a(context, i2, new TypedValue(), 0, bVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f2073n = true;
            aVar.O(1);
        } catch (Exception e3) {
            Log.d("TextAppearance", "Error loading font " + this.f2062b, e3);
            this.f2073n = true;
            aVar.O(-3);
        }
    }

    public final boolean c(Context context) {
        Context context2;
        Typeface typefaceA;
        String string;
        Typeface typefaceCreate;
        XmlResourceParser xml;
        if (this.f2073n) {
            return true;
        }
        int i2 = this.f2072m;
        if (i2 != 0) {
            ThreadLocal threadLocal = n.f2490a;
            Typeface typefaceCreate2 = null;
            if (context.isRestricted()) {
                context2 = context;
                typefaceA = null;
            } else {
                context2 = context;
                typefaceA = n.a(context2, i2, new TypedValue(), 0, null, false, true);
            }
            if (typefaceA != null) {
                this.f2075p = typefaceA;
                this.f2073n = true;
                return true;
            }
            if (!this.f2074o) {
                this.f2074o = true;
                Resources resources = context2.getResources();
                int i3 = this.f2072m;
                if (i3 == 0 || !resources.getResourceTypeName(i3).equals("font")) {
                    string = null;
                    if (string != null && (typefaceCreate = Typeface.create(string, 0)) != Typeface.DEFAULT) {
                        typefaceCreate2 = Typeface.create(typefaceCreate, this.f2063d);
                    }
                } else {
                    try {
                        xml = resources.getXml(i3);
                    } catch (Throwable unused) {
                    }
                    while (xml.getEventType() != 1) {
                        if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                            TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), t.a.f2117b);
                            string = typedArrayObtainAttributes.getString(6);
                            typedArrayObtainAttributes.recycle();
                            break;
                        }
                        xml.next();
                        string = null;
                    }
                    string = null;
                    if (string != null) {
                        typefaceCreate2 = Typeface.create(typefaceCreate, this.f2063d);
                    }
                }
            }
            if (typefaceCreate2 != null) {
                this.f2075p = typefaceCreate2;
                this.f2073n = true;
                return true;
            }
        }
        return false;
    }

    public final void d(Context context, TextPaint textPaint, a0.a aVar) {
        e(context, textPaint, aVar);
        ColorStateList colorStateList = this.f2070k;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f2061a;
        textPaint.setShadowLayer(this.f2067h, this.f2065f, this.f2066g, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void e(Context context, TextPaint textPaint, a0.a aVar) {
        Typeface typeface;
        if (c(context) && this.f2073n && (typeface = this.f2075p) != null) {
            f(context, textPaint, typeface);
            return;
        }
        a();
        f(context, textPaint, this.f2075p);
        b(context, new c(this, context, textPaint, aVar));
    }

    public final void f(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceK = a0.a.K(context.getResources().getConfiguration(), typeface);
        if (typefaceK != null) {
            typeface = typefaceK;
        }
        textPaint.setTypeface(typeface);
        int i2 = (~typeface.getStyle()) & this.f2063d;
        textPaint.setFakeBoldText((i2 & 1) != 0);
        textPaint.setTextSkewX((i2 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f2071l);
        if (Build.VERSION.SDK_INT >= 26) {
            textPaint.setFontVariationSettings(this.c);
        }
        if (this.f2068i) {
            textPaint.setLetterSpacing(this.f2069j);
        }
    }
}
