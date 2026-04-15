package t1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import v0.l0;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f2176a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f2177b = null;
    public static boolean c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f2178d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Field f2179e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f2180f;

    public e() {
        new ConcurrentHashMap();
    }

    public static File B(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i2 = 0; i2 < 100; i2++) {
            File file = new File(cacheDir, str + i2);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static MappedByteBuffer G(Context context, Uri uri) {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        try {
            parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (parcelFileDescriptorOpenFileDescriptor == null) {
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                parcelFileDescriptorOpenFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                parcelFileDescriptorOpenFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String H(android.content.Context r8) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r8.getPackageName()
            r0.append(r1)
            java.lang.String r1 = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            int r1 = android.os.Process.myPid()
            int r2 = android.os.Process.myUid()
            java.lang.String r3 = r8.getPackageName()
            int r1 = r8.checkPermission(r0, r1, r2)
            r4 = -1
            if (r1 != r4) goto L29
            goto L8d
        L29:
            java.lang.String r1 = u.a.d(r0)
            r5 = 0
            if (r1 != 0) goto L31
            goto L8a
        L31:
            if (r3 != 0) goto L43
            android.content.pm.PackageManager r3 = r8.getPackageManager()
            java.lang.String[] r3 = r3.getPackagesForUid(r2)
            if (r3 == 0) goto L8d
            int r6 = r3.length
            if (r6 > 0) goto L41
            goto L8d
        L41:
            r3 = r3[r5]
        L43:
            int r4 = android.os.Process.myUid()
            java.lang.String r6 = r8.getPackageName()
            java.lang.Class<android.app.AppOpsManager> r7 = android.app.AppOpsManager.class
            if (r4 != r2) goto L7e
            boolean r4 = java.util.Objects.equals(r6, r3)
            if (r4 == 0) goto L7e
            int r4 = android.os.Build.VERSION.SDK_INT
            r6 = 29
            if (r4 < r6) goto L73
            android.app.AppOpsManager r4 = u.b.c(r8)
            int r6 = android.os.Binder.getCallingUid()
            int r3 = u.b.a(r4, r1, r6, r3)
            if (r3 == 0) goto L6a
            goto L88
        L6a:
            java.lang.String r8 = u.b.b(r8)
            int r3 = u.b.a(r4, r1, r2, r8)
            goto L88
        L73:
            java.lang.Object r8 = u.a.a(r8, r7)
            android.app.AppOpsManager r8 = (android.app.AppOpsManager) r8
            int r3 = u.a.c(r8, r1, r3)
            goto L88
        L7e:
            java.lang.Object r8 = u.a.a(r8, r7)
            android.app.AppOpsManager r8 = (android.app.AppOpsManager) r8
            int r3 = u.a.c(r8, r1, r3)
        L88:
            if (r3 != 0) goto L8c
        L8a:
            r4 = r5
            goto L8d
        L8c:
            r4 = -2
        L8d:
            if (r4 != 0) goto L90
            return r0
        L90:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Permission "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = " is required by your application to receive broadcasts, please add it to your manifest"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.e.H(android.content.Context):java.lang.String");
    }

    public static void I(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    public static void K(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z = onLongClickListener != null;
        boolean z2 = zHasOnClickListeners || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        checkableImageButton.setLongClickable(z);
        checkableImageButton.setImportantForAccessibility(z2 ? 1 : 2);
    }

    public static void L(View view, k kVar) {
        n1.a aVar = kVar.f2205b.c;
        if (aVar == null || !aVar.f1752a) {
            return;
        }
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ((View) parent).getElevation();
        }
        i iVar = kVar.f2205b;
        if (iVar.f2198m != elevation) {
            iVar.f2198m = elevation;
            kVar.s();
        }
    }

    public static void P(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            z0.v.b(viewGroup, z);
        } else if (c) {
            try {
                z0.v.b(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                c = false;
            }
        }
    }

    public static void a(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static void d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int e(l0 l0Var, v0.u uVar, View view, View view2, v0.c0 c0Var, boolean z) {
        if (c0Var.q() == 0 || l0Var.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(v0.c0.A(view) - v0.c0.A(view2)) + 1;
        }
        return Math.min(uVar.j(), uVar.b(view2) - uVar.e(view));
    }

    public static int f(l0 l0Var, v0.u uVar, View view, View view2, v0.c0 c0Var, boolean z, boolean z2) {
        if (c0Var.q() == 0 || l0Var.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (l0Var.a() - Math.max(v0.c0.A(view), v0.c0.A(view2))) - 1) : Math.max(0, Math.min(v0.c0.A(view), v0.c0.A(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(uVar.b(view2) - uVar.e(view)) / (Math.abs(v0.c0.A(view) - v0.c0.A(view2)) + 1))) + (uVar.i() - uVar.e(view)));
        }
        return iMax;
    }

    public static int g(l0 l0Var, v0.u uVar, View view, View view2, v0.c0 c0Var, boolean z) {
        if (c0Var.q() == 0 || l0Var.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return l0Var.a();
        }
        return (int) (((uVar.b(view2) - uVar.e(view)) / (Math.abs(v0.c0.A(view) - v0.c0.A(view2)) + 1)) * l0Var.a());
    }

    public static ImageView.ScaleType h(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 5 ? i2 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static boolean i(File file, Resources resources, int i2) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i2);
            try {
                boolean zJ = j(file, inputStreamOpenRawResource);
                d(inputStreamOpenRawResource);
                return zJ;
            } catch (Throwable th) {
                th = th;
                d(inputStreamOpenRawResource);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    public static boolean j(File file, InputStream inputStream) throws Throwable {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e3) {
                e = e3;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i2 = inputStream.read(bArr);
                if (i2 == -1) {
                    d(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, i2);
            }
        } catch (IOException e4) {
            e = e4;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            d(fileOutputStream2);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            d(fileOutputStream2);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            throw th;
        }
    }

    public static e k(int i2) {
        return i2 != 0 ? i2 != 1 ? new m() : new f() : new m();
    }

    public static byte[] p(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArr3[i2] = (byte) (bArr[i2] ^ bArr2[i2 % bArr2.length]);
        }
        return bArr3;
    }

    public static byte[] q(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArr2[i2] = (byte) ("com.android.mrobot".charAt(i2 % 18) ^ bArr[i2]);
        }
        return bArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        if (r5.c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.res.ColorStateList s(android.content.Context r8, int r9) {
        /*
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Resources$Theme r8 = r8.getTheme()
            w.l r1 = new w.l
            r1.<init>(r0, r8)
            java.lang.Object r2 = w.n.c
            monitor-enter(r2)
            java.util.WeakHashMap r3 = w.n.f2491b     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L3c
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L3c
            r4 = 0
            if (r3 == 0) goto L50
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L3c
            if (r5 <= 0) goto L50
            java.lang.Object r5 = r3.get(r9)     // Catch: java.lang.Throwable -> L3c
            w.k r5 = (w.k) r5     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L50
            android.content.res.Configuration r6 = r5.f2485b     // Catch: java.lang.Throwable -> L3c
            android.content.res.Configuration r7 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L3c
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L4d
            if (r8 != 0) goto L3f
            int r6 = r5.c     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L49
            goto L3f
        L3c:
            r8 = move-exception
            goto Lb8
        L3f:
            if (r8 == 0) goto L4d
            int r6 = r5.c     // Catch: java.lang.Throwable -> L3c
            int r7 = r8.hashCode()     // Catch: java.lang.Throwable -> L3c
            if (r6 != r7) goto L4d
        L49:
            android.content.res.ColorStateList r3 = r5.f2484a     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            goto L52
        L4d:
            r3.remove(r9)     // Catch: java.lang.Throwable -> L3c
        L50:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            r3 = r4
        L52:
            if (r3 == 0) goto L55
            return r3
        L55:
            java.lang.ThreadLocal r2 = w.n.f2490a
            java.lang.Object r3 = r2.get()
            android.util.TypedValue r3 = (android.util.TypedValue) r3
            if (r3 != 0) goto L67
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r2.set(r3)
        L67:
            r2 = 1
            r0.getValue(r9, r3, r2)
            int r2 = r3.type
            r3 = 28
            if (r2 < r3) goto L76
            r3 = 31
            if (r2 > r3) goto L76
            goto L87
        L76:
            android.content.res.XmlResourceParser r2 = r0.getXml(r9)
            android.content.res.ColorStateList r4 = w.c.a(r0, r2, r8)     // Catch: java.lang.Exception -> L7f
            goto L87
        L7f:
            r2 = move-exception
            java.lang.String r3 = "ResourcesCompat"
            java.lang.String r5 = "Failed to inflate ColorStateList, leaving it to the framework"
            android.util.Log.w(r3, r5, r2)
        L87:
            if (r4 == 0) goto Lb3
            java.lang.Object r2 = w.n.c
            monitor-enter(r2)
            java.util.WeakHashMap r0 = w.n.f2491b     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L9f
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L9f
            if (r3 != 0) goto La1
            android.util.SparseArray r3 = new android.util.SparseArray     // Catch: java.lang.Throwable -> L9f
            r3.<init>()     // Catch: java.lang.Throwable -> L9f
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L9f
            goto La1
        L9f:
            r8 = move-exception
            goto Lb1
        La1:
            w.k r0 = new w.k     // Catch: java.lang.Throwable -> L9f
            android.content.res.Resources r1 = r1.f2486a     // Catch: java.lang.Throwable -> L9f
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch: java.lang.Throwable -> L9f
            r0.<init>(r4, r1, r8)     // Catch: java.lang.Throwable -> L9f
            r3.append(r9, r0)     // Catch: java.lang.Throwable -> L9f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9f
            goto Lb7
        Lb1:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9f
            throw r8
        Lb3:
            android.content.res.ColorStateList r4 = w.j.b(r0, r9, r8)
        Lb7:
            return r4
        Lb8:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.e.s(android.content.Context, int):android.content.res.ColorStateList");
    }

    public abstract int A();

    public float C(View view) {
        if (f2178d) {
            try {
                return z0.y.a(view);
            } catch (NoSuchMethodError unused) {
                f2178d = false;
            }
        }
        return view.getAlpha();
    }

    public abstract boolean D(float f3);

    public abstract boolean E(View view);

    public abstract boolean F(float f3, float f4);

    public abstract void J(RecyclerView recyclerView);

    public void M(View view, float f3) {
        if (f2178d) {
            try {
                z0.y.b(view, f3);
                return;
            } catch (NoSuchMethodError unused) {
                f2178d = false;
            }
        }
        view.setAlpha(f3);
    }

    public void N(View view, int i2) {
        if (!f2180f) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f2179e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f2180f = true;
        }
        Field field = f2179e;
        if (field != null) {
            try {
                f2179e.setInt(view, i2 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public abstract boolean O(View view, float f3);

    public abstract void Q(ViewGroup.MarginLayoutParams marginLayoutParams, int i2, int i3);

    public abstract int b(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float c(int i2);

    public abstract Typeface l(Context context, w.f fVar, Resources resources, int i2);

    public abstract Typeface m(Context context, c0.j[] jVarArr, int i2);

    public Typeface n(Context context, InputStream inputStream) {
        File fileB = B(context);
        if (fileB == null) {
            return null;
        }
        try {
            if (j(fileB, inputStream)) {
                return Typeface.createFromFile(fileB.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileB.delete();
        }
    }

    public Typeface o(Context context, Resources resources, int i2, String str, int i3) {
        File fileB = B(context);
        if (fileB == null) {
            return null;
        }
        try {
            if (i(fileB, resources, i2)) {
                return Typeface.createFromFile(fileB.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileB.delete();
        }
    }

    public c0.j r(int i2, c0.j[] jVarArr) {
        new g(28);
        int i3 = (i2 & 1) == 0 ? 400 : 700;
        boolean z = (i2 & 2) != 0;
        c0.j jVar = null;
        int i4 = Integer.MAX_VALUE;
        for (c0.j jVar2 : jVarArr) {
            int iAbs = (Math.abs(jVar2.c - i3) * 2) + (jVar2.f486d == z ? 0 : 1);
            if (jVar == null || i4 > iAbs) {
                jVar = jVar2;
                i4 = iAbs;
            }
        }
        return jVar;
    }

    public abstract void t(y yVar, float f3, float f4);

    public abstract int u();

    public abstract int v();

    public abstract int w();

    public abstract int x();

    public abstract int y(View view);

    public abstract int z(CoordinatorLayout coordinatorLayout);
}
