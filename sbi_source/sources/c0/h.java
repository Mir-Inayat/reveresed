package c0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i.j f479a = new i.j(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f480b;
    public static final Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i.k f481d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new l());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f480b = threadPoolExecutor;
        c = new Object();
        f481d = new i.k(0);
    }

    public static g a(String str, Context context, d dVar, int i2) {
        i.j jVar = f479a;
        Typeface typeface = (Typeface) jVar.c(str);
        if (typeface != null) {
            return new g(typeface);
        }
        try {
            i iVarA = c.a(context, dVar);
            j[] jVarArr = (j[]) iVarA.f483b;
            int i3 = iVarA.f482a;
            int i4 = 1;
            if (i3 != 0) {
                i4 = i3 != 1 ? -3 : -2;
            } else if (jVarArr != null && jVarArr.length != 0) {
                int length = jVarArr.length;
                i4 = 0;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        break;
                    }
                    int i6 = jVarArr[i5].f487e;
                    if (i6 == 0) {
                        i5++;
                    } else if (i6 >= 0) {
                        i4 = i6;
                    }
                }
            }
            if (i4 != 0) {
                return new g(i4);
            }
            Typeface typefaceM = x.g.f2622a.m(context, jVarArr, i2);
            if (typefaceM == null) {
                return new g(-3);
            }
            jVar.f(str, typefaceM);
            return new g(typefaceM);
        } catch (PackageManager.NameNotFoundException unused) {
            return new g(-1);
        }
    }
}
