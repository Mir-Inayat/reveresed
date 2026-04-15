package f0;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.redhand.laugiytr.R;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public abstract class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Field f1276a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f1277b = false;
    public static final int[] c = {R.NP_MANAGER8.NP_MANAGER, R.NP_MANAGER8.NP_MANAGER, R.NP_MANAGER8.NP_MANAGER, R.NP_MANAGER8.NP_MANAGER, R.NP_MANAGER8.NP_MANAGER, R.NP_MANAGER8.NP_MANAGER, R.NP_MANAGER8.NP_MANAGER, R.NP_MANAGER8.NP_MANAGER, R.NP_MANAGER8.NP_MANAGER, R.NP_MANAGER8.NP_MANAGER, R.NP_MANAGER8.NP_MANAGER, R.NP_MANAGER8.NP_MANAGER, R.NP_MANAGER8.NP_MANAGER, R.NP_MANAGER8.NP_MANAGER, R.NP_MANAGER8.NP_MANAGER, R.NP_MANAGER8.NP_MANAGER, R.NP_MANAGER8.NP_MANAGER, R.NP_MANAGER8.NP_MANAGER, R.NP_MANAGER8.NP_MANAGER, R.NP_MANAGER8.NP_MANAGER, R.NP_MANAGER8.NP_MANAGER, R.NP_MANAGER8.NP_MANAGER, R.NP_MANAGER8.NP_MANAGER, R.NP_MANAGER8.NP_MANAGER, R.NP_MANAGER8.NP_MANAGER, R.NP_MANAGER8.NP_MANAGER, R.NP_MANAGER8.NP_MANAGER, R.NP_MANAGER8.NP_MANAGER, R.NP_MANAGER8.NP_MANAGER, R.NP_MANAGER8.NP_MANAGER, R.NP_MANAGER8.NP_MANAGER, R.NP_MANAGER8.NP_MANAGER};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x f1278d = new x();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final z f1279e = new z();

    public static View.AccessibilityDelegate a(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return h0.a(view);
        }
        if (f1277b) {
            return null;
        }
        if (f1276a == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f1276a = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f1277b = true;
                return null;
            }
        }
        try {
            Object obj = f1276a.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f1277b = true;
            return null;
        }
    }

    public static CharSequence b(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = g0.b(view);
        } else {
            tag = view.getTag(R.NP_MANAGER8.NP_MANAGER);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList c(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.NP_MANAGER8.NP_MANAGER);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.NP_MANAGER8.NP_MANAGER, arrayList2);
        return arrayList2;
    }

    public static String[] d(f.v vVar) {
        return Build.VERSION.SDK_INT >= 31 ? j0.a(vVar) : (String[]) vVar.getTag(R.NP_MANAGER8.NP_MANAGER);
    }

    public static void e(View view, int i2) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = b(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i2);
                if (z) {
                    accessibilityEventObtain.getText().add(b(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i2 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i2);
                        return;
                    } catch (AbstractMethodError e3) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e3);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i2);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(b(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static g f(View view, g gVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + gVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return j0.b(view, gVar);
        }
        r rVar = (r) view.getTag(R.NP_MANAGER8.NP_MANAGER);
        s sVar = f1278d;
        if (rVar == null) {
            if (view instanceof s) {
                sVar = (s) view;
            }
            return sVar.a(gVar);
        }
        g gVarA = ((k0.q) rVar).a(view, gVar);
        if (gVarA == null) {
            return null;
        }
        if (view instanceof s) {
            sVar = (s) view;
        }
        return sVar.a(gVarA);
    }

    public static void g(View view, int i2) {
        ArrayList arrayListC = c(view);
        for (int i3 = 0; i3 < arrayListC.size(); i3++) {
            if (((g0.d) arrayListC.get(i3)).a() == i2) {
                arrayListC.remove(i3);
                return;
            }
        }
    }

    public static void h(View view, g0.d dVar, g0.s sVar) {
        g0.d dVar2 = new g0.d(null, dVar.f1333b, null, sVar, dVar.c);
        View.AccessibilityDelegate accessibilityDelegateA = a(view);
        b bVar = accessibilityDelegateA == null ? null : accessibilityDelegateA instanceof a ? ((a) accessibilityDelegateA).f1224a : new b(accessibilityDelegateA);
        if (bVar == null) {
            bVar = new b();
        }
        j(view, bVar);
        g(view, dVar2.a());
        c(view).add(dVar2);
        e(view, 0);
    }

    public static void i(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            h0.d(view, context, iArr, attributeSet, typedArray, i2, 0);
        }
    }

    public static void j(View view, b bVar) {
        if (bVar == null && (a(view) instanceof a)) {
            bVar = new b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(bVar == null ? null : bVar.f1227b);
    }

    public static void k(View view, CharSequence charSequence) {
        Object tag;
        y yVar = new y(R.NP_MANAGER8.NP_MANAGER, CharSequence.class, 8, 28);
        if (Build.VERSION.SDK_INT >= yVar.c) {
            g0.h(view, charSequence);
        } else {
            if (Build.VERSION.SDK_INT >= yVar.c) {
                tag = g0.b(view);
            } else {
                tag = view.getTag(yVar.f1306a);
                if (!yVar.f1307b.isInstance(tag)) {
                    tag = null;
                }
            }
            if (!TextUtils.equals((CharSequence) tag, charSequence)) {
                View.AccessibilityDelegate accessibilityDelegateA = a(view);
                b bVar = accessibilityDelegateA == null ? null : accessibilityDelegateA instanceof a ? ((a) accessibilityDelegateA).f1224a : new b(accessibilityDelegateA);
                if (bVar == null) {
                    bVar = new b();
                }
                j(view, bVar);
                view.setTag(yVar.f1306a, charSequence);
                e(view, yVar.f1308d);
            }
        }
        z zVar = f1279e;
        if (charSequence == null) {
            zVar.f1310a.remove(view);
            view.removeOnAttachStateChangeListener(zVar);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(zVar);
        } else {
            zVar.f1310a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(zVar);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(zVar);
            }
        }
    }
}
