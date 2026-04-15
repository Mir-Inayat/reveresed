package g0;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f1324e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f1325f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f1326g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f1327h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d f1328i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final d f1329j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final d f1330k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final d f1331l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1333b;
    public final Class c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f1334d;

    static {
        new d(1);
        new d(2);
        new d(4);
        new d(8);
        f1324e = new d(16);
        new d(32);
        new d(64);
        new d(128);
        new d(256, l.class);
        new d(512, l.class);
        new d(1024, m.class);
        new d(2048, m.class);
        f1325f = new d(4096);
        f1326g = new d(8192);
        new d(16384);
        new d(32768);
        new d(65536);
        new d(131072, q.class);
        f1327h = new d(262144);
        f1328i = new d(524288);
        f1329j = new d(1048576);
        new d(2097152, r.class);
        int i2 = Build.VERSION.SDK_INT;
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, o.class);
        f1330k = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        f1331l = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        new d(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        new d(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
        new d(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        new d(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, p.class);
        new d(i2 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, n.class);
        new d(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
        new d(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
        new d(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        new d(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        new d(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        new d(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
        new d(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
        new d(i2 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        new d(i2 >= 34 ? g.a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
    }

    public d(int i2) {
        this(null, i2, null, null, null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f1332a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        Object obj2 = ((d) obj).f1332a;
        Object obj3 = this.f1332a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f1332a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String strD = i.d(this.f1333b);
        if (strD.equals("ACTION_UNKNOWN")) {
            Object obj = this.f1332a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strD = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(strD);
        return sb.toString();
    }

    public d(int i2, Class cls) {
        this(null, i2, null, null, cls);
    }

    public d(Object obj, int i2, String str, s sVar, Class cls) {
        this.f1333b = i2;
        this.f1334d = sVar;
        if (obj == null) {
            this.f1332a = new AccessibilityNodeInfo.AccessibilityAction(i2, str);
        } else {
            this.f1332a = obj;
        }
        this.c = cls;
    }
}
