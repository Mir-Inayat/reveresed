package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.emoji2.text.q;
import e1.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import n.f;
import n.i;
import org.xmlpull.v1.XmlPullParserException;
import q.c;
import q.d;
import q.e;
import q.g;
import q.n;
import q.o;
import q.p;
import q.r;
import q.s;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static s f127r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f129b;
    public final f c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f131e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f132f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f133g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f134h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f135i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public n f136j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public q f137k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f138l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public HashMap f139m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final SparseArray f140n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final q.f f141o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f142p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f143q;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f128a = new SparseArray();
        this.f129b = new ArrayList(4);
        this.c = new f();
        this.f130d = 0;
        this.f131e = 0;
        this.f132f = Integer.MAX_VALUE;
        this.f133g = Integer.MAX_VALUE;
        this.f134h = true;
        this.f135i = 257;
        this.f136j = null;
        this.f137k = null;
        this.f138l = -1;
        this.f139m = new HashMap();
        this.f140n = new SparseArray();
        this.f141o = new q.f(this, this);
        this.f142p = 0;
        this.f143q = 0;
        i(attributeSet, 0);
    }

    public static e g() {
        e eVar = new e(-2, -2);
        eVar.f1907a = -1;
        eVar.f1909b = -1;
        eVar.c = -1.0f;
        eVar.f1912d = -1;
        eVar.f1914e = -1;
        eVar.f1916f = -1;
        eVar.f1918g = -1;
        eVar.f1920h = -1;
        eVar.f1922i = -1;
        eVar.f1924j = -1;
        eVar.f1926k = -1;
        eVar.f1928l = -1;
        eVar.f1930m = -1;
        eVar.f1932n = -1;
        eVar.f1934o = -1;
        eVar.f1936p = 0;
        eVar.f1937q = 0.0f;
        eVar.f1938r = -1;
        eVar.f1939s = -1;
        eVar.f1940t = -1;
        eVar.f1941u = -1;
        eVar.f1942v = Integer.MIN_VALUE;
        eVar.f1943w = Integer.MIN_VALUE;
        eVar.f1944x = Integer.MIN_VALUE;
        eVar.f1945y = Integer.MIN_VALUE;
        eVar.z = Integer.MIN_VALUE;
        eVar.A = Integer.MIN_VALUE;
        eVar.B = Integer.MIN_VALUE;
        eVar.C = 0;
        eVar.D = 0.5f;
        eVar.E = 0.5f;
        eVar.F = null;
        eVar.G = -1.0f;
        eVar.H = -1.0f;
        eVar.I = 0;
        eVar.J = 0;
        eVar.K = 0;
        eVar.L = 0;
        eVar.M = 0;
        eVar.N = 0;
        eVar.O = 0;
        eVar.P = 0;
        eVar.Q = 1.0f;
        eVar.R = 1.0f;
        eVar.S = -1;
        eVar.T = -1;
        eVar.U = -1;
        eVar.V = false;
        eVar.W = false;
        eVar.X = null;
        eVar.Y = 0;
        eVar.Z = true;
        eVar.f1908a0 = true;
        eVar.f1910b0 = false;
        eVar.f1911c0 = false;
        eVar.f1913d0 = false;
        eVar.f1915e0 = -1;
        eVar.f1917f0 = -1;
        eVar.f1919g0 = -1;
        eVar.f1921h0 = -1;
        eVar.f1923i0 = Integer.MIN_VALUE;
        eVar.f1925j0 = Integer.MIN_VALUE;
        eVar.f1927k0 = 0.5f;
        eVar.f1935o0 = new n.e();
        return eVar;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static s getSharedValues() {
        if (f127r == null) {
            s sVar = new s();
            new SparseIntArray();
            new HashMap();
            f127r = sVar;
        }
        return f127r;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f129b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                ((c) arrayList.get(i2)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i4 = Integer.parseInt(strArrSplit[0]);
                        int i5 = Integer.parseInt(strArrSplit[1]);
                        int i6 = Integer.parseInt(strArrSplit[2]);
                        int i7 = (int) ((i4 / 1080.0f) * width);
                        int i8 = (int) ((i5 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f3 = i7;
                        float f4 = i8;
                        float f5 = i7 + ((int) ((i6 / 1080.0f) * width));
                        canvas.drawLine(f3, f4, f5, f4, paint);
                        float f6 = i8 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f5, f4, f5, f6, paint);
                        canvas.drawLine(f5, f6, f3, f6, paint);
                        canvas.drawLine(f3, f6, f3, f4, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f3, f4, f5, f6, paint);
                        canvas.drawLine(f3, f6, f5, f4, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f134h = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        e eVar = new e(context, attributeSet);
        eVar.f1907a = -1;
        eVar.f1909b = -1;
        eVar.c = -1.0f;
        eVar.f1912d = -1;
        eVar.f1914e = -1;
        eVar.f1916f = -1;
        eVar.f1918g = -1;
        eVar.f1920h = -1;
        eVar.f1922i = -1;
        eVar.f1924j = -1;
        eVar.f1926k = -1;
        eVar.f1928l = -1;
        eVar.f1930m = -1;
        eVar.f1932n = -1;
        eVar.f1934o = -1;
        eVar.f1936p = 0;
        eVar.f1937q = 0.0f;
        eVar.f1938r = -1;
        eVar.f1939s = -1;
        eVar.f1940t = -1;
        eVar.f1941u = -1;
        eVar.f1942v = Integer.MIN_VALUE;
        eVar.f1943w = Integer.MIN_VALUE;
        eVar.f1944x = Integer.MIN_VALUE;
        eVar.f1945y = Integer.MIN_VALUE;
        eVar.z = Integer.MIN_VALUE;
        eVar.A = Integer.MIN_VALUE;
        eVar.B = Integer.MIN_VALUE;
        eVar.C = 0;
        eVar.D = 0.5f;
        eVar.E = 0.5f;
        eVar.F = null;
        eVar.G = -1.0f;
        eVar.H = -1.0f;
        eVar.I = 0;
        eVar.J = 0;
        eVar.K = 0;
        eVar.L = 0;
        eVar.M = 0;
        eVar.N = 0;
        eVar.O = 0;
        eVar.P = 0;
        eVar.Q = 1.0f;
        eVar.R = 1.0f;
        eVar.S = -1;
        eVar.T = -1;
        eVar.U = -1;
        eVar.V = false;
        eVar.W = false;
        eVar.X = null;
        eVar.Y = 0;
        eVar.Z = true;
        eVar.f1908a0 = true;
        eVar.f1910b0 = false;
        eVar.f1911c0 = false;
        eVar.f1913d0 = false;
        eVar.f1915e0 = -1;
        eVar.f1917f0 = -1;
        eVar.f1919g0 = -1;
        eVar.f1921h0 = -1;
        eVar.f1923i0 = Integer.MIN_VALUE;
        eVar.f1925j0 = Integer.MIN_VALUE;
        eVar.f1927k0 = 0.5f;
        eVar.f1935o0 = new n.e();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f2043b);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            int i3 = d.f1906a.get(index);
            switch (i3) {
                case 1:
                    eVar.U = typedArrayObtainStyledAttributes.getInt(index, eVar.U);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f1934o);
                    eVar.f1934o = resourceId;
                    if (resourceId == -1) {
                        eVar.f1934o = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 3:
                    eVar.f1936p = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f1936p);
                    break;
                case 4:
                    float f3 = typedArrayObtainStyledAttributes.getFloat(index, eVar.f1937q) % 360.0f;
                    eVar.f1937q = f3;
                    if (f3 < 0.0f) {
                        eVar.f1937q = (360.0f - f3) % 360.0f;
                    }
                    break;
                case 5:
                    eVar.f1907a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, eVar.f1907a);
                    break;
                case 6:
                    eVar.f1909b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, eVar.f1909b);
                    break;
                case 7:
                    eVar.c = typedArrayObtainStyledAttributes.getFloat(index, eVar.c);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f1912d);
                    eVar.f1912d = resourceId2;
                    if (resourceId2 == -1) {
                        eVar.f1912d = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f1914e);
                    eVar.f1914e = resourceId3;
                    if (resourceId3 == -1) {
                        eVar.f1914e = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f1916f);
                    eVar.f1916f = resourceId4;
                    if (resourceId4 == -1) {
                        eVar.f1916f = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f1918g);
                    eVar.f1918g = resourceId5;
                    if (resourceId5 == -1) {
                        eVar.f1918g = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f1920h);
                    eVar.f1920h = resourceId6;
                    if (resourceId6 == -1) {
                        eVar.f1920h = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f1922i);
                    eVar.f1922i = resourceId7;
                    if (resourceId7 == -1) {
                        eVar.f1922i = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f1924j);
                    eVar.f1924j = resourceId8;
                    if (resourceId8 == -1) {
                        eVar.f1924j = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f1926k);
                    eVar.f1926k = resourceId9;
                    if (resourceId9 == -1) {
                        eVar.f1926k = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f1928l);
                    eVar.f1928l = resourceId10;
                    if (resourceId10 == -1) {
                        eVar.f1928l = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f1938r);
                    eVar.f1938r = resourceId11;
                    if (resourceId11 == -1) {
                        eVar.f1938r = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f1939s);
                    eVar.f1939s = resourceId12;
                    if (resourceId12 == -1) {
                        eVar.f1939s = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f1940t);
                    eVar.f1940t = resourceId13;
                    if (resourceId13 == -1) {
                        eVar.f1940t = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f1941u);
                    eVar.f1941u = resourceId14;
                    if (resourceId14 == -1) {
                        eVar.f1941u = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 21:
                    eVar.f1942v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f1942v);
                    break;
                case 22:
                    eVar.f1943w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f1943w);
                    break;
                case 23:
                    eVar.f1944x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f1944x);
                    break;
                case 24:
                    eVar.f1945y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f1945y);
                    break;
                case 25:
                    eVar.z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.z);
                    break;
                case 26:
                    eVar.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.A);
                    break;
                case 27:
                    eVar.V = typedArrayObtainStyledAttributes.getBoolean(index, eVar.V);
                    break;
                case 28:
                    eVar.W = typedArrayObtainStyledAttributes.getBoolean(index, eVar.W);
                    break;
                case 29:
                    eVar.D = typedArrayObtainStyledAttributes.getFloat(index, eVar.D);
                    break;
                case 30:
                    eVar.E = typedArrayObtainStyledAttributes.getFloat(index, eVar.E);
                    break;
                case 31:
                    int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    eVar.K = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                    }
                    break;
                case 32:
                    int i5 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    eVar.L = i5;
                    if (i5 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                    }
                    break;
                case 33:
                    try {
                        eVar.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.M);
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, eVar.M) == -2) {
                            eVar.M = -2;
                        }
                    }
                    break;
                case 34:
                    try {
                        eVar.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.O);
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, eVar.O) == -2) {
                            eVar.O = -2;
                        }
                    }
                    break;
                case 35:
                    eVar.Q = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, eVar.Q));
                    eVar.K = 2;
                    break;
                case 36:
                    try {
                        eVar.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.N);
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, eVar.N) == -2) {
                            eVar.N = -2;
                        }
                    }
                    break;
                case 37:
                    try {
                        eVar.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.P);
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, eVar.P) == -2) {
                            eVar.P = -2;
                        }
                    }
                    break;
                case 38:
                    eVar.R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, eVar.R));
                    eVar.L = 2;
                    break;
                default:
                    switch (i3) {
                        case 44:
                            n.h(eVar, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            eVar.G = typedArrayObtainStyledAttributes.getFloat(index, eVar.G);
                            break;
                        case 46:
                            eVar.H = typedArrayObtainStyledAttributes.getFloat(index, eVar.H);
                            break;
                        case 47:
                            eVar.I = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            eVar.J = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            eVar.S = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, eVar.S);
                            break;
                        case 50:
                            eVar.T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, eVar.T);
                            break;
                        case 51:
                            eVar.X = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f1930m);
                            eVar.f1930m = resourceId15;
                            if (resourceId15 == -1) {
                                eVar.f1930m = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 53:
                            int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f1932n);
                            eVar.f1932n = resourceId16;
                            if (resourceId16 == -1) {
                                eVar.f1932n = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 54:
                            eVar.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.C);
                            break;
                        case 55:
                            eVar.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.B);
                            break;
                        default:
                            switch (i3) {
                                case 64:
                                    n.g(eVar, typedArrayObtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    n.g(eVar, typedArrayObtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    eVar.Y = typedArrayObtainStyledAttributes.getInt(index, eVar.Y);
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        eVar.a();
        return eVar;
    }

    public int getMaxHeight() {
        return this.f133g;
    }

    public int getMaxWidth() {
        return this.f132f;
    }

    public int getMinHeight() {
        return this.f131e;
    }

    public int getMinWidth() {
        return this.f130d;
    }

    public int getOptimizationLevel() {
        return this.c.C0;
    }

    public final n.e h(View view) {
        if (view == this) {
            return this.c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof e) {
            return ((e) view.getLayoutParams()).f1935o0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof e) {
            return ((e) view.getLayoutParams()).f1935o0;
        }
        return null;
    }

    public final void i(AttributeSet attributeSet, int i2) {
        f fVar = this.c;
        fVar.f1637e0 = this;
        q.f fVar2 = this.f141o;
        fVar.f1672t0 = fVar2;
        fVar.f1670r0.f1771f = fVar2;
        this.f128a.put(getId(), this);
        this.f136j = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f2043b, i2, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == 16) {
                    this.f130d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f130d);
                } else if (index == 17) {
                    this.f131e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f131e);
                } else if (index == 14) {
                    this.f132f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f132f);
                } else if (index == 15) {
                    this.f133g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f133g);
                } else if (index == 112) {
                    this.f135i = typedArrayObtainStyledAttributes.getInt(index, this.f135i);
                } else if (index == 55) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f137k = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        n nVar = new n();
                        this.f136j = nVar;
                        nVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f136j = null;
                    }
                    this.f138l = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        fVar.C0 = this.f135i;
        l.c.f1527p = fVar.R(512);
    }

    public final void j(int i2) {
        String str;
        Context context = getContext();
        q qVar = new q(10, false);
        qVar.f246b = new SparseArray();
        qVar.c = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            b bVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                qVar.j(context, xml);
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                bVar = new b(context, xml);
                                ((SparseArray) qVar.f246b).put(bVar.f971a, bVar);
                            }
                            break;
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                g gVar = new g(context, xml);
                                if (bVar != null) {
                                    ((ArrayList) bVar.c).add(gVar);
                                }
                            }
                            break;
                    }
                }
            }
        } catch (IOException e3) {
            e3.printStackTrace();
        } catch (XmlPullParserException e4) {
            e4.printStackTrace();
        }
        this.f137k = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0368  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(n.f r29, int r30, int r31, int r32) {
        /*
            Method dump skipped, instruction units count: 1762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.k(n.f, int, int, int):void");
    }

    public final void l(n.e eVar, e eVar2, SparseArray sparseArray, int i2, int i3) {
        View view = (View) this.f128a.get(i2);
        n.e eVar3 = (n.e) sparseArray.get(i2);
        if (eVar3 == null || view == null || !(view.getLayoutParams() instanceof e)) {
            return;
        }
        eVar2.f1910b0 = true;
        if (i3 == 6) {
            e eVar4 = (e) view.getLayoutParams();
            eVar4.f1910b0 = true;
            eVar4.f1935o0.D = true;
        }
        eVar.i(6).b(eVar3.i(i3), eVar2.C, eVar2.B, true);
        eVar.D = true;
        eVar.i(3).j();
        eVar.i(5).j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            e eVar = (e) childAt.getLayoutParams();
            n.e eVar2 = eVar.f1935o0;
            if (childAt.getVisibility() != 8 || eVar.f1911c0 || eVar.f1913d0 || zIsInEditMode) {
                int iO = eVar2.o();
                int iP = eVar2.p();
                childAt.layout(iO, iP, eVar2.n() + iO, eVar2.k() + iP);
            }
        }
        ArrayList arrayList = this.f129b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                ((c) arrayList.get(i7)).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x055a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r35, int r36) {
        /*
            Method dump skipped, instruction units count: 1562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        n.e eVarH = h(view);
        if ((view instanceof p) && !(eVarH instanceof i)) {
            e eVar = (e) view.getLayoutParams();
            i iVar = new i();
            eVar.f1935o0 = iVar;
            eVar.f1911c0 = true;
            iVar.N(eVar.U);
        }
        if (view instanceof c) {
            c cVar = (c) view;
            cVar.i();
            ((e) view.getLayoutParams()).f1913d0 = true;
            ArrayList arrayList = this.f129b;
            if (!arrayList.contains(cVar)) {
                arrayList.add(cVar);
            }
        }
        this.f128a.put(view.getId(), view);
        this.f134h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f128a.remove(view.getId());
        n.e eVarH = h(view);
        this.c.f1668p0.remove(eVarH);
        eVarH.z();
        this.f129b.remove(view);
        this.f134h = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f134h = true;
        super.requestLayout();
    }

    public void setConstraintSet(n nVar) {
        this.f136j = nVar;
    }

    @Override // android.view.View
    public void setId(int i2) {
        int id = getId();
        SparseArray sparseArray = this.f128a;
        sparseArray.remove(id);
        super.setId(i2);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i2) {
        if (i2 == this.f133g) {
            return;
        }
        this.f133g = i2;
        requestLayout();
    }

    public void setMaxWidth(int i2) {
        if (i2 == this.f132f) {
            return;
        }
        this.f132f = i2;
        requestLayout();
    }

    public void setMinHeight(int i2) {
        if (i2 == this.f131e) {
            return;
        }
        this.f131e = i2;
        requestLayout();
    }

    public void setMinWidth(int i2) {
        if (i2 == this.f130d) {
            return;
        }
        this.f130d = i2;
        requestLayout();
    }

    public void setOnConstraintsChanged(o oVar) {
        q qVar = this.f137k;
        if (qVar != null) {
            qVar.getClass();
        }
    }

    public void setOptimizationLevel(int i2) {
        this.f135i = i2;
        f fVar = this.c;
        fVar.C0 = i2;
        l.c.f1527p = fVar.R(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f128a = new SparseArray();
        this.f129b = new ArrayList(4);
        this.c = new f();
        this.f130d = 0;
        this.f131e = 0;
        this.f132f = Integer.MAX_VALUE;
        this.f133g = Integer.MAX_VALUE;
        this.f134h = true;
        this.f135i = 257;
        this.f136j = null;
        this.f137k = null;
        this.f138l = -1;
        this.f139m = new HashMap();
        this.f140n = new SparseArray();
        this.f141o = new q.f(this, this);
        this.f142p = 0;
        this.f143q = 0;
        i(attributeSet, i2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        e eVar = new e(layoutParams);
        eVar.f1907a = -1;
        eVar.f1909b = -1;
        eVar.c = -1.0f;
        eVar.f1912d = -1;
        eVar.f1914e = -1;
        eVar.f1916f = -1;
        eVar.f1918g = -1;
        eVar.f1920h = -1;
        eVar.f1922i = -1;
        eVar.f1924j = -1;
        eVar.f1926k = -1;
        eVar.f1928l = -1;
        eVar.f1930m = -1;
        eVar.f1932n = -1;
        eVar.f1934o = -1;
        eVar.f1936p = 0;
        eVar.f1937q = 0.0f;
        eVar.f1938r = -1;
        eVar.f1939s = -1;
        eVar.f1940t = -1;
        eVar.f1941u = -1;
        eVar.f1942v = Integer.MIN_VALUE;
        eVar.f1943w = Integer.MIN_VALUE;
        eVar.f1944x = Integer.MIN_VALUE;
        eVar.f1945y = Integer.MIN_VALUE;
        eVar.z = Integer.MIN_VALUE;
        eVar.A = Integer.MIN_VALUE;
        eVar.B = Integer.MIN_VALUE;
        eVar.C = 0;
        eVar.D = 0.5f;
        eVar.E = 0.5f;
        eVar.F = null;
        eVar.G = -1.0f;
        eVar.H = -1.0f;
        eVar.I = 0;
        eVar.J = 0;
        eVar.K = 0;
        eVar.L = 0;
        eVar.M = 0;
        eVar.N = 0;
        eVar.O = 0;
        eVar.P = 0;
        eVar.Q = 1.0f;
        eVar.R = 1.0f;
        eVar.S = -1;
        eVar.T = -1;
        eVar.U = -1;
        eVar.V = false;
        eVar.W = false;
        eVar.X = null;
        eVar.Y = 0;
        eVar.Z = true;
        eVar.f1908a0 = true;
        eVar.f1910b0 = false;
        eVar.f1911c0 = false;
        eVar.f1913d0 = false;
        eVar.f1915e0 = -1;
        eVar.f1917f0 = -1;
        eVar.f1919g0 = -1;
        eVar.f1921h0 = -1;
        eVar.f1923i0 = Integer.MIN_VALUE;
        eVar.f1925j0 = Integer.MIN_VALUE;
        eVar.f1927k0 = 0.5f;
        eVar.f1935o0 = new n.e();
        return eVar;
    }
}
