package x;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class j extends h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Class f2633l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Constructor f2634m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Method f2635n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Method f2636o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Method f2637p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Method f2638q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Method f2639r;

    public j() throws NoSuchMethodException {
        Method methodX;
        Constructor<?> constructor;
        Method methodW;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodW = W(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodX = X(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e3) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e3.getClass().getName()), e3);
            methodX = null;
            constructor = null;
            methodW = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f2633l = cls;
        this.f2634m = constructor;
        this.f2635n = methodW;
        this.f2636o = method;
        this.f2637p = method2;
        this.f2638q = method3;
        this.f2639r = methodX;
    }

    public static Method W(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public final boolean T(Context context, Object obj, String str, int i2, int i3, int i4, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f2635n.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface U(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f2633l, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f2639r.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean V(Object obj) {
        try {
            return ((Boolean) this.f2637p.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method X(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // x.h, t1.e
    public final Typeface l(Context context, w.f fVar, Resources resources, int i2) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.f2635n;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.l(context, fVar, resources, i2);
        }
        try {
            objNewInstance = this.f2634m.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            w.g[] gVarArr = fVar.f2475a;
            int length = gVarArr.length;
            int i3 = 0;
            while (true) {
                if (i3 < length) {
                    w.g gVar = gVarArr[i3];
                    Context context2 = context;
                    if (T(context2, objNewInstance, gVar.f2476a, gVar.f2479e, gVar.f2477b, gVar.c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(gVar.f2478d))) {
                        i3++;
                        context = context2;
                    } else {
                        try {
                            this.f2638q.invoke(objNewInstance, null);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                } else if (V(objNewInstance)) {
                    return U(objNewInstance);
                }
            }
        }
        return null;
    }

    @Override // x.h, t1.e
    public final Typeface m(Context context, c0.j[] jVarArr, int i2) throws IOException {
        Object objNewInstance;
        Typeface typefaceU;
        boolean zBooleanValue;
        if (jVarArr.length >= 1) {
            Method method = this.f2635n;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap map = new HashMap();
                    for (c0.j jVar : jVarArr) {
                        if (jVar.f487e == 0) {
                            Uri uri = jVar.f484a;
                            if (!map.containsKey(uri)) {
                                map.put(uri, t1.e.G(context, uri));
                            }
                        }
                    }
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                    try {
                        objNewInstance = this.f2634m.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        objNewInstance = null;
                    }
                    if (objNewInstance != null) {
                        int length = jVarArr.length;
                        int i3 = 0;
                        boolean z = false;
                        while (true) {
                            Method method2 = this.f2638q;
                            if (i3 < length) {
                                c0.j jVar2 = jVarArr[i3];
                                ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(jVar2.f484a);
                                if (byteBuffer != null) {
                                    try {
                                        zBooleanValue = ((Boolean) this.f2636o.invoke(objNewInstance, byteBuffer, Integer.valueOf(jVar2.f485b), null, Integer.valueOf(jVar2.c), Integer.valueOf(jVar2.f486d ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        zBooleanValue = false;
                                    }
                                    if (!zBooleanValue) {
                                        method2.invoke(objNewInstance, null);
                                        break;
                                    }
                                    z = true;
                                }
                                i3++;
                                z = z;
                            } else if (!z) {
                                method2.invoke(objNewInstance, null);
                            } else if (V(objNewInstance) && (typefaceU = U(objNewInstance)) != null) {
                                return Typeface.create(typefaceU, i2);
                            }
                        }
                    }
                } else {
                    c0.j jVarR = r(i2, jVarArr);
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(jVarR.f484a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(jVarR.c).setItalic(jVarR.f486d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } finally {
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // t1.e
    public final Typeface o(Context context, Resources resources, int i2, String str, int i3) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.f2635n;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.o(context, resources, i2, str, i3);
        }
        try {
            objNewInstance = this.f2634m.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            if (!T(context, objNewInstance, str, 0, -1, -1, null)) {
                try {
                    this.f2638q.invoke(objNewInstance, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (V(objNewInstance)) {
                return U(objNewInstance);
            }
        }
        return null;
    }
}
