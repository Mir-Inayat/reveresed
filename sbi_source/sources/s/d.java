package s;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class d extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f2085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2086b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2088e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2089f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f2090g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2091h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2092i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2093j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f2094k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f2095l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f2096m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f2097n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Rect f2098o;

    public d() {
        super(-2, -2);
        this.f2086b = false;
        this.c = 0;
        this.f2087d = 0;
        this.f2088e = -1;
        this.f2089f = -1;
        this.f2090g = 0;
        this.f2091h = 0;
        this.f2098o = new Rect();
    }

    public final boolean a(int i2) {
        if (i2 == 0) {
            return this.f2096m;
        }
        if (i2 != 1) {
            return false;
        }
        return this.f2097n;
    }

    public d(Context context, AttributeSet attributeSet) {
        a aVar;
        super(context, attributeSet);
        this.f2086b = false;
        this.c = 0;
        this.f2087d = 0;
        this.f2088e = -1;
        this.f2089f = -1;
        this.f2090g = 0;
        this.f2091h = 0;
        this.f2098o = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.a.f2077b);
        this.c = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.f2089f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.f2087d = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.f2088e = typedArrayObtainStyledAttributes.getInteger(6, -1);
        this.f2090g = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f2091h = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        this.f2086b = zHasValue;
        if (zHasValue) {
            String string = typedArrayObtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f144t;
            if (TextUtils.isEmpty(string)) {
                aVar = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f144t;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f146v;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f145u);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    aVar = (a) constructor.newInstance(context, attributeSet);
                } catch (Exception e3) {
                    throw new RuntimeException("Could not inflate Behavior subclass " + string, e3);
                }
            }
            this.f2085a = aVar;
        }
        typedArrayObtainStyledAttributes.recycle();
        a aVar2 = this.f2085a;
        if (aVar2 != null) {
            aVar2.c(this);
        }
    }

    public d(d dVar) {
        super((ViewGroup.MarginLayoutParams) dVar);
        this.f2086b = false;
        this.c = 0;
        this.f2087d = 0;
        this.f2088e = -1;
        this.f2089f = -1;
        this.f2090g = 0;
        this.f2091h = 0;
        this.f2098o = new Rect();
    }

    public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f2086b = false;
        this.c = 0;
        this.f2087d = 0;
        this.f2088e = -1;
        this.f2089f = -1;
        this.f2090g = 0;
        this.f2091h = 0;
        this.f2098o = new Rect();
    }

    public d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f2086b = false;
        this.c = 0;
        this.f2087d = 0;
        this.f2088e = -1;
        this.f2089f = -1;
        this.f2090g = 0;
        this.f2091h = 0;
        this.f2098o = new Rect();
    }
}
