package m0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.emoji2.text.n;
import com.google.android.material.chip.Chip;
import f0.m0;
import g0.i;
import java.lang.reflect.Field;
import java.util.ArrayList;
import k1.f;
import t1.g;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public abstract class b extends f0.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Rect f1563n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final g f1564o = new g(11);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final g f1565p = new g(12);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AccessibilityManager f1570h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Chip f1571i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f1572j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f1566d = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f1567e = new Rect();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Rect f1568f = new Rect();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f1569g = new int[2];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1573k = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1574l = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1575m = Integer.MIN_VALUE;

    public b(Chip chip) {
        this.f1571i = chip;
        this.f1570h = (AccessibilityManager) chip.getContext().getSystemService("accessibility");
        chip.setFocusable(true);
        Field field = m0.f1276a;
        if (chip.getImportantForAccessibility() == 0) {
            chip.setImportantForAccessibility(1);
        }
    }

    @Override // f0.b
    public final n b(View view) {
        if (this.f1572j == null) {
            this.f1572j = new a(this);
        }
        return this.f1572j;
    }

    @Override // f0.b
    public final void d(View view, i iVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = iVar.f1336a;
        this.f1226a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((k1.d) this).f1488q;
        f fVar = chip.f612e;
        accessibilityNodeInfo.setCheckable(fVar != null && fVar.Z);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        iVar.i(chip.getAccessibilityClassName());
        iVar.j(chip.getText());
    }

    public final boolean j(int i2) {
        if (this.f1574l != i2) {
            return false;
        }
        this.f1574l = Integer.MIN_VALUE;
        p(i2, false);
        r(i2, 8);
        return true;
    }

    public final i k(int i2) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        i iVar = new i(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        iVar.i("android.view.View");
        Rect rect = f1563n;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        Chip chip = this.f1571i;
        accessibilityNodeInfoObtain.setParent(chip);
        o(i2, iVar);
        if (iVar.g() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f1567e;
        iVar.f(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoObtain.setPackageName(chip.getContext().getPackageName());
        iVar.f1337b = i2;
        accessibilityNodeInfoObtain.setSource(chip, i2);
        if (this.f1573k == i2) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            iVar.a(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            iVar.a(64);
        }
        boolean z = this.f1574l == i2;
        if (z) {
            iVar.a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            iVar.a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z);
        int[] iArr = this.f1569g;
        chip.getLocationOnScreen(iArr);
        Rect rect3 = this.f1566d;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            iVar.f(rect3);
            rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
        }
        Rect rect4 = this.f1568f;
        if (chip.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            if (rect3.intersect(rect4)) {
                accessibilityNodeInfoObtain.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                    Object parent = chip.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view = (View) parent;
                            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                                break;
                            }
                            parent = view.getParent();
                        } else if (parent != null) {
                            iVar.f1336a.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return iVar;
    }

    public abstract void l(ArrayList arrayList);

    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(int r19, android.graphics.Rect r20) {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.b.m(int, android.graphics.Rect):boolean");
    }

    public final i n(int i2) {
        if (i2 != -1) {
            return k(i2);
        }
        Chip chip = this.f1571i;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(chip);
        i iVar = new i(accessibilityNodeInfoObtain);
        Field field = m0.f1276a;
        chip.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            iVar.f1336a.addChild(chip, ((Integer) arrayList.get(i3)).intValue());
        }
        return iVar;
    }

    public abstract void o(int i2, i iVar);

    public abstract void p(int i2, boolean z);

    public final boolean q(int i2) {
        int i3;
        Chip chip = this.f1571i;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i3 = this.f1574l) == i2) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            j(i3);
        }
        if (i2 == Integer.MIN_VALUE) {
            return false;
        }
        this.f1574l = i2;
        p(i2, true);
        r(i2, 8);
        return true;
    }

    public final void r(int i2, int i3) {
        View view;
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i2 == Integer.MIN_VALUE || !this.f1570h.isEnabled() || (parent = (view = this.f1571i).getParent()) == null) {
            return;
        }
        if (i2 != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i3);
            i iVarN = n(i2);
            accessibilityEventObtain.getText().add(iVarN.g());
            AccessibilityNodeInfo accessibilityNodeInfo = iVarN.f1336a;
            accessibilityEventObtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            accessibilityEventObtain.setScrollable(accessibilityNodeInfo.isScrollable());
            accessibilityEventObtain.setPassword(accessibilityNodeInfo.isPassword());
            accessibilityEventObtain.setEnabled(accessibilityNodeInfo.isEnabled());
            accessibilityEventObtain.setChecked(accessibilityNodeInfo.isChecked());
            if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            accessibilityEventObtain.setClassName(accessibilityNodeInfo.getClassName());
            accessibilityEventObtain.setSource(view, i2);
            accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
        } else {
            accessibilityEventObtain = AccessibilityEvent.obtain(i3);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
        }
        parent.requestSendAccessibilityEvent(view, accessibilityEventObtain);
    }
}
