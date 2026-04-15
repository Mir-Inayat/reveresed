package a0;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EdgeEffect;
import android.widget.TextView;
import androidx.emoji2.text.t;
import androidx.emoji2.text.v;
import androidx.emoji2.text.w;
import androidx.emoji2.text.y;
import d2.c;
import f.m0;
import f.n2;
import f.p2;
import f.t1;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import k.f;
import k0.d;
import k0.e;
import k0.l;
import k0.m;
import k0.n;
import k0.p;
import o0.b;
import t1.g;
import t1.z;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static int E(int i2) {
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 4) {
            return 2;
        }
        if (i2 == 8) {
            return 3;
        }
        if (i2 == 16) {
            return 4;
        }
        if (i2 == 32) {
            return 5;
        }
        if (i2 == 64) {
            return 6;
        }
        if (i2 == 128) {
            return 7;
        }
        if (i2 == 256) {
            return 8;
        }
        throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i2);
    }

    public static boolean F(int i2, Rect rect, Rect rect2) {
        if (i2 == 17) {
            int i3 = rect.right;
            int i4 = rect2.right;
            return (i3 > i4 || rect.left >= i4) && rect.left > rect2.left;
        }
        if (i2 == 33) {
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            return (i5 > i6 || rect.top >= i6) && rect.top > rect2.top;
        }
        if (i2 == 66) {
            int i7 = rect.left;
            int i8 = rect2.left;
            return (i7 < i8 || rect.right <= i8) && rect.right < rect2.right;
        }
        if (i2 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i9 = rect.top;
        int i10 = rect2.top;
        return (i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom;
    }

    public static boolean G(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean H(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static int I(int i2, int i3, float f3) {
        return x.a.b(x.a.d(i3, Math.round(Color.alpha(i3) * f3)), i2);
    }

    public static int J(int i2, Rect rect, Rect rect2) {
        int i3;
        int i4;
        if (i2 == 17) {
            i3 = rect.left;
            i4 = rect2.right;
        } else if (i2 == 33) {
            i3 = rect.top;
            i4 = rect2.bottom;
        } else if (i2 == 66) {
            i3 = rect2.left;
            i4 = rect.right;
        } else {
            if (i2 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i3 = rect2.top;
            i4 = rect.bottom;
        }
        return Math.max(0, i3 - i4);
    }

    public static Typeface K(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, i(configuration.fontWeightAdjustment + typeface.getWeight(), 1, 1000), typeface.isItalic());
    }

    public static int L(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static void M(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static float R(EdgeEffect edgeEffect, float f3, float f4) {
        if (Build.VERSION.SDK_INT >= 31) {
            return e.c(edgeEffect, f3, f4);
        }
        d.a(edgeEffect, f3, f4);
        return f3;
    }

    public static b Y(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j2;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i2 = byteBufferDuplicate.getShort() & 65535;
        if (i2 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                j2 = -1;
                break;
            }
            int i4 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j2 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i4) {
                break;
            }
            i3++;
        }
        if (j2 != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j2 - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j3 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i5 = 0; i5 < j3; i5++) {
                int i6 = byteBufferDuplicate.getInt();
                long j4 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i6 || 1701669481 == i6) {
                    byteBufferDuplicate.position((int) (j4 + j2));
                    b bVar = new b();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    bVar.f1807b = byteBufferDuplicate;
                    bVar.f1806a = iPosition;
                    int i7 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    bVar.c = i7;
                    bVar.f1808d = bVar.f1807b.getShort(i7);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static TypedValue Z(Context context, int i2) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(int r8, android.graphics.Rect r9, android.graphics.Rect r10, android.graphics.Rect r11) {
        /*
            boolean r0 = b(r8, r9, r10)
            boolean r1 = b(r8, r9, r11)
            if (r1 != 0) goto L75
            if (r0 != 0) goto Le
            goto L75
        Le:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r2 = 33
            r3 = 66
            r4 = 17
            r5 = 1
            if (r8 == r4) goto L3c
            if (r8 == r2) goto L35
            if (r8 == r3) goto L2e
            if (r8 != r1) goto L28
            int r6 = r9.bottom
            int r7 = r11.top
            if (r6 > r7) goto L74
            goto L42
        L28:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r0)
            throw r8
        L2e:
            int r6 = r9.right
            int r7 = r11.left
            if (r6 > r7) goto L74
            goto L42
        L35:
            int r6 = r9.top
            int r7 = r11.bottom
            if (r6 < r7) goto L74
            goto L42
        L3c:
            int r6 = r9.left
            int r7 = r11.right
            if (r6 < r7) goto L74
        L42:
            if (r8 == r4) goto L74
            if (r8 != r3) goto L47
            goto L74
        L47:
            int r10 = J(r8, r9, r10)
            if (r8 == r4) goto L69
            if (r8 == r2) goto L64
            if (r8 == r3) goto L5f
            if (r8 != r1) goto L59
            int r8 = r11.bottom
            int r9 = r9.bottom
        L57:
            int r8 = r8 - r9
            goto L6e
        L59:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r0)
            throw r8
        L5f:
            int r8 = r11.right
            int r9 = r9.right
            goto L57
        L64:
            int r8 = r9.top
            int r9 = r11.top
            goto L57
        L69:
            int r8 = r9.left
            int r9 = r11.left
            goto L57
        L6e:
            int r8 = java.lang.Math.max(r5, r8)
            if (r10 >= r8) goto L75
        L74:
            return r5
        L75:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.a.a(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static int a0(Context context, int i2, int i3) {
        TypedValue typedValueZ = Z(context, i2);
        return (typedValueZ == null || typedValueZ.type != 16) ? i3 : typedValueZ.data;
    }

    public static boolean b(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0192 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x012f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0130 A[Catch: NumberFormatException -> 0x0144, LOOP:3: B:47:0x00ff->B:66:0x0130, LOOP_END, TryCatch #1 {NumberFormatException -> 0x0144, blocks: (B:44:0x00e9, B:47:0x00ff, B:49:0x0105, B:53:0x0111, B:66:0x0130, B:68:0x0136, B:74:0x014b, B:76:0x0150, B:78:0x0153, B:79:0x015f, B:80:0x0164, B:81:0x0165, B:82:0x016a), top: B:107:0x00e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0136 A[Catch: NumberFormatException -> 0x0144, TryCatch #1 {NumberFormatException -> 0x0144, blocks: (B:44:0x00e9, B:47:0x00ff, B:49:0x0105, B:53:0x0111, B:66:0x0130, B:68:0x0136, B:74:0x014b, B:76:0x0150, B:78:0x0153, B:79:0x015f, B:80:0x0164, B:81:0x0165, B:82:0x016a), top: B:107:0x00e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014b A[Catch: NumberFormatException -> 0x0144, TryCatch #1 {NumberFormatException -> 0x0144, blocks: (B:44:0x00e9, B:47:0x00ff, B:49:0x0105, B:53:0x0111, B:66:0x0130, B:68:0x0136, B:74:0x014b, B:76:0x0150, B:78:0x0153, B:79:0x015f, B:80:0x0164, B:81:0x0165, B:82:0x016a), top: B:107:0x00e9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.animation.TimeInterpolator b0(android.content.Context r19, int r20, android.animation.TimeInterpolator r21) {
        /*
            Method dump skipped, instruction units count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.a.b0(android.content.Context, int, android.animation.TimeInterpolator):android.animation.TimeInterpolator");
    }

    public static TypedValue c0(Context context, int i2, String str) {
        TypedValue typedValueZ = Z(context, i2);
        if (typedValueZ != null) {
            return typedValueZ;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i2)));
    }

    public static void f(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void f0(TextView textView, int i2) {
        g(i2);
        if (Build.VERSION.SDK_INT >= 28) {
            n.d(textView, i2);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), i2 + i3, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void g(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void g0(TextView textView, int i2) {
        g(i2);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i2 - i3);
        }
    }

    public static void h(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void h0(TextView textView, int i2) {
        g(i2);
        if (i2 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i2 - r0, 1.0f);
        }
    }

    public static int i(int i2, int i3, int i4) {
        return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
    }

    public static void i0(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            n2.a(view, charSequence);
            return;
        }
        p2 p2Var = p2.f1130k;
        if (p2Var != null && p2Var.f1132a == view) {
            p2.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new p2(view, charSequence);
            return;
        }
        p2 p2Var2 = p2.f1131l;
        if (p2Var2 != null && p2Var2.f1132a == view) {
            p2Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static w l(Context context) {
        ProviderInfo providerInfo;
        c0.d dVar;
        ApplicationInfo applicationInfo;
        g dVar2 = Build.VERSION.SDK_INT >= 28 ? new androidx.emoji2.text.d(1) : new g(1);
        PackageManager packageManager = context.getPackageManager();
        h(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            dVar = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrC = dVar2.c(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrC) {
                    arrayList.add(signature.toByteArray());
                }
                dVar = new c0.d(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e3) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e3);
                dVar = null;
            }
        }
        if (dVar == null) {
            return null;
        }
        return new w(new v(context, dVar));
    }

    public static ActionMode.Callback l0(ActionMode.Callback callback) {
        return (!(callback instanceof p) || Build.VERSION.SDK_INT < 26) ? callback : ((p) callback).f1479a;
    }

    public static int m(Context context, int i2, int i3) {
        Integer numValueOf;
        TypedValue typedValueZ = Z(context, i2);
        if (typedValueZ != null) {
            int i4 = typedValueZ.resourceId;
            numValueOf = Integer.valueOf(i4 != 0 ? v.b.a(context, i4) : typedValueZ.data);
        } else {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i3;
    }

    public static ActionMode.Callback m0(ActionMode.Callback callback, TextView textView) {
        int i2 = Build.VERSION.SDK_INT;
        return (i2 < 26 || i2 > 27 || (callback instanceof p) || callback == null) ? callback : new p(callback, textView);
    }

    public static int n(View view, int i2) {
        Context context = view.getContext();
        TypedValue typedValueC0 = c0(view.getContext(), i2, view.getClass().getCanonicalName());
        int i3 = typedValueC0.resourceId;
        return i3 != 0 ? v.b.a(context, i3) : typedValueC0.data;
    }

    public static ColorStateList o(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        ColorStateList colorStateListS;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (colorStateListS = t1.e.s(context, resourceId)) == null) ? typedArray.getColorStateList(i2) : colorStateListS;
    }

    public static ColorStateList p(Context context, t tVar, int i2) {
        int resourceId;
        ColorStateList colorStateListS;
        TypedArray typedArray = (TypedArray) tVar.c;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (colorStateListS = t1.e.s(context, resourceId)) == null) ? tVar.l(i2) : colorStateListS;
    }

    public static float q(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return e.b(edgeEffect);
        }
        return 0.0f;
    }

    public static Drawable r(Context context, int i2) {
        return t1.b().c(context, i2);
    }

    public static Drawable s(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        Drawable drawableR;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (drawableR = r(context, resourceId)) == null) ? typedArray.getDrawable(i2) : drawableR;
    }

    public static Set t() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class v(e2.a aVar) {
        c.e(aVar, "<this>");
        Class clsA = ((d2.a) aVar).a();
        if (clsA.isPrimitive()) {
            String name = clsA.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsA;
    }

    public static float w(String[] strArr, int i2) {
        float f3 = Float.parseFloat(strArr[i2]);
        if (f3 >= 0.0f && f3 <= 1.0f) {
            return f3;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f3);
    }

    public static d0.d y(m0 m0Var) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            return new d0.d(n.c(m0Var));
        }
        TextPaint textPaint = new TextPaint(m0Var.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int iA = l.a(m0Var);
        int iD = l.d(m0Var);
        if (m0Var.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i2 < 28 || (m0Var.getInputType() & 15) != 3) {
            boolean z = m0Var.getLayoutDirection() == 1;
            switch (m0Var.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(n.b(m.a(m0Var.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new d0.d(textPaint, textDirectionHeuristic, iA, iD);
    }

    public abstract int A();

    public int B(View view) {
        return 0;
    }

    public abstract ViewPropertyAnimator C(View view, int i2);

    public int D() {
        return 0;
    }

    public abstract void N(Throwable th);

    public abstract void O(int i2);

    public abstract void P(Typeface typeface, boolean z);

    public abstract void Q(y yVar);

    public abstract void T(int i2);

    public abstract void U(View view, int i2, int i3);

    public abstract void V(View view, float f3, float f4);

    public abstract void W(f fVar, f fVar2);

    public abstract void X(f fVar, Thread thread);

    public abstract boolean c(k.g gVar, k.c cVar);

    public abstract boolean d(k.g gVar, Object obj, Object obj2);

    public abstract void d0(boolean z);

    public abstract boolean e(k.g gVar, f fVar, f fVar2);

    public abstract void e0(boolean z);

    public abstract int j(View view, int i2);

    public abstract void j0(z zVar, float f3);

    public abstract int k(View view, int i2);

    public abstract boolean k0(View view, int i2);

    public abstract InputFilter[] u(InputFilter[] inputFilterArr);

    public abstract int x(View view, ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float z(z zVar);

    public void S(View view, int i2) {
    }
}
