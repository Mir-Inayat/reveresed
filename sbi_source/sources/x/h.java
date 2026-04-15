package x;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class h extends t1.e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Class f2624g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Constructor f2625h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Method f2626i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Method f2627j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static boolean f2628k = false;

    public static boolean R(Object obj, String str, int i2, boolean z) throws NoSuchMethodException {
        S();
        try {
            return ((Boolean) f2626i.invoke(obj, str, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static void S() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f2628k) {
            return;
        }
        f2628k = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e3) {
            Log.e("TypefaceCompatApi21Impl", e3.getClass().getName(), e3);
            method = null;
            cls = null;
            method2 = null;
        }
        f2625h = constructor;
        f2624g = cls;
        f2626i = method2;
        f2627j = method;
    }

    @Override // t1.e
    public Typeface l(Context context, w.f fVar, Resources resources, int i2) throws NoSuchMethodException {
        S();
        try {
            Object objNewInstance = f2625h.newInstance(null);
            for (w.g gVar : fVar.f2475a) {
                File fileB = t1.e.B(context);
                if (fileB == null) {
                    return null;
                }
                try {
                    if (!t1.e.i(fileB, resources, gVar.f2480f)) {
                        return null;
                    }
                    if (!R(objNewInstance, fileB.getPath(), gVar.f2477b, gVar.c)) {
                        return null;
                    }
                    fileB.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileB.delete();
                }
            }
            S();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) f2624g, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f2627j.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e3) {
                throw new RuntimeException(e3);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // t1.e
    public Typeface m(Context context, c0.j[] jVarArr, int i2) {
        String str;
        if (jVarArr.length >= 1) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(r(i2, jVarArr).f484a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        try {
                            str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                        } finally {
                        }
                    } catch (ErrnoException unused) {
                    }
                    File file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                    if (file != null && file.canRead()) {
                        Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceCreateFromFile;
                    }
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        Typeface typefaceN = n(context, fileInputStream);
                        fileInputStream.close();
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceN;
                    } finally {
                    }
                }
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused2) {
            }
        }
        return null;
    }
}
