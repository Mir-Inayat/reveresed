package f;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final RectF f1159l = new RectF();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ConcurrentHashMap f1160m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1161a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1162b = false;
    public float c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f1163d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f1164e = -1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f1165f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1166g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextPaint f1167h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f1168i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Context f1169j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final o0 f1170k;

    public r0(TextView textView) {
        this.f1168i = textView;
        this.f1169j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f1170k = new p0();
        } else {
            this.f1170k = new o0();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i2 : iArr) {
                if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                    arrayList.add(Integer.valueOf(i2));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i3 = 0; i3 < size; i3++) {
                    iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f1160m;
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod != null || (declaredMethod = TextView.class.getDeclaredMethod(str, null)) == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            concurrentHashMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e3) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e3);
            return null;
        }
    }

    public static Object e(TextView textView, String str, Object obj) {
        try {
            return d(str).invoke(textView, null);
        } catch (Exception e3) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e3);
            return obj;
        }
    }

    public final void a() {
        if (f()) {
            if (this.f1162b) {
                if (this.f1168i.getMeasuredHeight() <= 0 || this.f1168i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f1170k.b(this.f1168i) ? 1048576 : (this.f1168i.getMeasuredWidth() - this.f1168i.getTotalPaddingLeft()) - this.f1168i.getTotalPaddingRight();
                int height = (this.f1168i.getHeight() - this.f1168i.getCompoundPaddingBottom()) - this.f1168i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f1159l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fC = c(rectF);
                        if (fC != this.f1168i.getTextSize()) {
                            g(0, fC);
                        }
                    } finally {
                    }
                }
            }
            this.f1162b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f1165f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i2 = length - 1;
        int i3 = 0;
        int i4 = 1;
        while (i4 <= i2) {
            int i5 = (i4 + i2) / 2;
            int i6 = this.f1165f[i5];
            TextView textView = this.f1168i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                text = transformation;
            }
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f1167h;
            if (textPaint == null) {
                this.f1167h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f1167h.set(textView.getPaint());
            this.f1167h.setTextSize(i6);
            StaticLayout staticLayoutA = n0.a(text, (Layout.Alignment) e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines, textView, this.f1167h, this.f1170k);
            if ((maxLines == -1 || (staticLayoutA.getLineCount() <= maxLines && staticLayoutA.getLineEnd(staticLayoutA.getLineCount() - 1) == text.length())) && staticLayoutA.getHeight() <= rectF.bottom) {
                int i7 = i5 + 1;
                i3 = i4;
                i4 = i7;
            } else {
                i3 = i5 - 1;
                i2 = i3;
            }
        }
        return this.f1165f[i3];
    }

    public final boolean f() {
        return j() && this.f1161a != 0;
    }

    public final void g(int i2, float f3) {
        Context context = this.f1169j;
        float fApplyDimension = TypedValue.applyDimension(i2, f3, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f1168i;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f1162b = false;
                try {
                    Method methodD = d("nullLayouts");
                    if (methodD != null) {
                        methodD.invoke(textView, null);
                    }
                } catch (Exception e3) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e3);
                }
                if (zIsInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean h() {
        if (j() && this.f1161a == 1) {
            if (!this.f1166g || this.f1165f.length == 0) {
                int iFloor = ((int) Math.floor((this.f1164e - this.f1163d) / this.c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i2 = 0; i2 < iFloor; i2++) {
                    iArr[i2] = Math.round((i2 * this.c) + this.f1163d);
                }
                this.f1165f = b(iArr);
            }
            this.f1162b = true;
        } else {
            this.f1162b = false;
        }
        return this.f1162b;
    }

    public final boolean i() {
        boolean z = this.f1165f.length > 0;
        this.f1166g = z;
        if (z) {
            this.f1161a = 1;
            this.f1163d = r0[0];
            this.f1164e = r0[r1 - 1];
            this.c = -1.0f;
        }
        return z;
    }

    public final boolean j() {
        return !(this.f1168i instanceof v);
    }

    public final void k(float f3, float f4, float f5) {
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f3 + "px) is less or equal to (0px)");
        }
        if (f4 <= f3) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f4 + "px) is less or equal to minimum auto-size text size (" + f3 + "px)");
        }
        if (f5 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f5 + "px) is less or equal to (0px)");
        }
        this.f1161a = 1;
        this.f1163d = f3;
        this.f1164e = f4;
        this.c = f5;
        this.f1166g = false;
    }
}
