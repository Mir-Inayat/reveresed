package x;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class i extends t1.e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Class f2629g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Constructor f2630h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Method f2631i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Method f2632j;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e3) {
            Log.e("TypefaceCompatApi24Impl", e3.getClass().getName(), e3);
            cls = null;
            method = null;
            method2 = null;
        }
        f2630h = constructor;
        f2629g = cls;
        f2631i = method2;
        f2632j = method;
    }

    public static boolean R(Object obj, ByteBuffer byteBuffer, int i2, int i3, boolean z) {
        try {
            return ((Boolean) f2631i.invoke(obj, byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i3), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface S(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f2629g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f2632j.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // t1.e
    public final Typeface l(Context context, w.f fVar, Resources resources, int i2) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        MappedByteBuffer map;
        FileInputStream fileInputStream;
        try {
            objNewInstance = f2630h.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            for (w.g gVar : fVar.f2475a) {
                int i3 = gVar.f2480f;
                File fileB = t1.e.B(context);
                if (fileB != null) {
                    try {
                        if (t1.e.i(fileB, resources, i3)) {
                            try {
                                fileInputStream = new FileInputStream(fileB);
                            } catch (IOException unused2) {
                                map = null;
                            }
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                if (map != null && R(objNewInstance, map, gVar.f2479e, gVar.f2477b, gVar.c)) {
                                }
                            } finally {
                            }
                        }
                    } finally {
                        fileB.delete();
                    }
                }
                map = null;
                if (map != null) {
                }
            }
            return S(objNewInstance);
        }
        return null;
    }

    @Override // t1.e
    public final Typeface m(Context context, c0.j[] jVarArr, int i2) {
        Object objNewInstance;
        try {
            objNewInstance = f2630h.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            int i3 = 0;
            i.k kVar = new i.k(0);
            int length = jVarArr.length;
            while (true) {
                if (i3 < length) {
                    c0.j jVar = jVarArr[i3];
                    Uri uri = jVar.f484a;
                    ByteBuffer byteBufferG = (ByteBuffer) kVar.get(uri);
                    if (byteBufferG == null) {
                        byteBufferG = t1.e.G(context, uri);
                        kVar.put(uri, byteBufferG);
                    }
                    if (byteBufferG == null || !R(objNewInstance, byteBufferG, jVar.f485b, jVar.c, jVar.f486d)) {
                        break;
                    }
                    i3++;
                } else {
                    Typeface typefaceS = S(objNewInstance);
                    if (typefaceS != null) {
                        return Typeface.create(typefaceS, i2);
                    }
                }
            }
        }
        return null;
    }
}
