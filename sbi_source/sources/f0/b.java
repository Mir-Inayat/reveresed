package f0;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.redhand.laugiytr.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class b {
    public static final View.AccessibilityDelegate c = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f1226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f1227b;

    public b() {
        this(c);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f1226a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public androidx.emoji2.text.n b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f1226a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new androidx.emoji2.text.n(13, accessibilityNodeProvider);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f1226a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, g0.i iVar) {
        this.f1226a.onInitializeAccessibilityNodeInfo(view, iVar.f1336a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f1226a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f1226a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i2, Bundle bundle) {
        boolean zPerformAccessibilityAction;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.NP_MANAGER8.NP_MANAGER);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z = false;
        int i3 = 0;
        while (true) {
            if (i3 >= list.size()) {
                break;
            }
            g0.d dVar = (g0.d) list.get(i3);
            if (dVar.a() == i2) {
                Class cls = dVar.c;
                g0.s sVar = dVar.f1334d;
                if (sVar != null) {
                    if (cls != null) {
                        try {
                            if (cls.getDeclaredConstructor(null).newInstance(null) == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        } catch (Exception e3) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e3);
                        }
                    }
                    zPerformAccessibilityAction = sVar.d(view);
                }
            } else {
                i3++;
            }
        }
        zPerformAccessibilityAction = false;
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f1226a.performAccessibilityAction(view, i2, bundle);
        }
        if (zPerformAccessibilityAction || i2 != R.NP_MANAGER8.NP_MANAGER || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i4 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.NP_MANAGER8.NP_MANAGER);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i4)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i5 = 0;
            while (true) {
                if (clickableSpanArr == null || i5 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i5])) {
                    clickableSpan.onClick(view);
                    z = true;
                    break;
                }
                i5++;
            }
        }
        return z;
    }

    public void h(View view, int i2) {
        this.f1226a.sendAccessibilityEvent(view, i2);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f1226a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f1226a = accessibilityDelegate;
        this.f1227b = new a(this);
    }
}
