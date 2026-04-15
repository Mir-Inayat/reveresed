package e;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.ActionMenuView;
import f.d2;
import f0.o0;
import f0.q0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class j implements Menu {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int[] f892u = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f894b;
    public boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.emoji2.text.n f896e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f897f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f898g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f899h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f900i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f901j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f902k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f903l;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public k f910s;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f904m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f905n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f906o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f907p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f908q = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final CopyOnWriteArrayList f909r = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f911t = false;

    public j(Context context) {
        boolean zB;
        boolean z = false;
        this.f893a = context;
        Resources resources = context.getResources();
        this.f894b = resources;
        this.f897f = new ArrayList();
        this.f898g = new ArrayList();
        this.f899h = true;
        this.f900i = new ArrayList();
        this.f901j = new ArrayList();
        this.f902k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = q0.f1284a;
            if (Build.VERSION.SDK_INT >= 28) {
                zB = o0.b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zB = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zB) {
                z = true;
            }
        }
        this.f895d = z;
    }

    public final k a(int i2, int i3, int i4, CharSequence charSequence) {
        int i5;
        int i6 = ((-65536) & i4) >> 16;
        if (i6 < 0 || i6 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i7 = (f892u[i6] << 16) | (65535 & i4);
        k kVar = new k(this, i2, i3, i4, i7, charSequence);
        ArrayList arrayList = this.f897f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i5 = 0;
                break;
            }
            if (((k) arrayList.get(size)).f914d <= i7) {
                i5 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i5, kVar);
        o(true);
        return kVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        int i6;
        PackageManager packageManager = this.f893a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i5 & 1) == 0) {
            removeGroup(i2);
        }
        for (int i7 = 0; i7 < size; i7++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i7);
            int i8 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i8 < 0 ? intent : intentArr[i8]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            k kVarA = a(i2, i3, i4, resolveInfo.loadLabel(packageManager));
            kVarA.setIcon(resolveInfo.loadIcon(packageManager));
            kVarA.f917g = intent2;
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = kVarA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(p pVar, Context context) {
        this.f909r.add(new WeakReference(pVar));
        pVar.i(context, this);
        this.f902k = true;
    }

    public final void c(boolean z) {
        if (this.f907p) {
            return;
        }
        this.f907p = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f909r;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            p pVar = (p) weakReference.get();
            if (pVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                pVar.a(this, z);
            }
        }
        this.f907p = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        k kVar = this.f910s;
        if (kVar != null) {
            d(kVar);
        }
        this.f897f.clear();
        o(true);
    }

    public final void clearHeader() {
        this.f903l = null;
        o(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(k kVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f909r;
        boolean zB = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f910s == kVar) {
            s();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                p pVar = (p) weakReference.get();
                if (pVar != null) {
                    zB = pVar.b(kVar);
                    if (zB) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            r();
            if (zB) {
                this.f910s = null;
            }
        }
        return zB;
    }

    public boolean e(j jVar, MenuItem menuItem) {
        f.m mVar;
        androidx.emoji2.text.n nVar = this.f896e;
        if (nVar == null || (mVar = ((ActionMenuView) nVar.f244b).f86y) == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((d2) mVar).f1000a.G.f244b).iterator();
        if (!it.hasNext()) {
            return false;
        }
        ((androidx.fragment.app.i) it.next()).getClass();
        throw null;
    }

    public boolean f(k kVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f909r;
        boolean zK = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        s();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            p pVar = (p) weakReference.get();
            if (pVar != null) {
                zK = pVar.k(kVar);
                if (zK) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        r();
        if (zK) {
            this.f910s = kVar;
        }
        return zK;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i2) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f897f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            k kVar = (k) arrayList.get(i3);
            if (kVar.f912a == i2) {
                return kVar;
            }
            if (kVar.hasSubMenu() && (menuItemFindItem = kVar.f925o.findItem(i2)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final k g(int i2, KeyEvent keyEvent) {
        ArrayList arrayList = this.f908q;
        arrayList.clear();
        h(arrayList, i2, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (k) arrayList.get(0);
        }
        boolean zM = m();
        for (int i3 = 0; i3 < size; i3++) {
            k kVar = (k) arrayList.get(i3);
            char c = zM ? kVar.f920j : kVar.f918h;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (zM && c == '\b' && i2 == 67))) {
                return kVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i2) {
        return (MenuItem) this.f897f.get(i2);
    }

    public final void h(List list, int i2, KeyEvent keyEvent) {
        boolean zM = m();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i2 == 67) {
            ArrayList arrayList = this.f897f;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                k kVar = (k) arrayList.get(i3);
                if (kVar.hasSubMenu()) {
                    kVar.f925o.h(list, i2, keyEvent);
                }
                char c = zM ? kVar.f920j : kVar.f918h;
                if ((modifiers & 69647) == ((zM ? kVar.f921k : kVar.f919i) & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (zM && c == '\b' && i2 == 67)) && kVar.isEnabled()) {
                        list.add(kVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        ArrayList arrayList = this.f897f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((k) arrayList.get(i2)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList arrayListK = k();
        if (this.f902k) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f909r;
            boolean zD = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                p pVar = (p) weakReference.get();
                if (pVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zD |= pVar.d();
                }
            }
            ArrayList arrayList = this.f900i;
            ArrayList arrayList2 = this.f901j;
            if (zD) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListK.size();
                for (int i2 = 0; i2 < size; i2++) {
                    k kVar = (k) arrayListK.get(i2);
                    if ((kVar.f934x & 32) == 32) {
                        arrayList.add(kVar);
                    } else {
                        arrayList2.add(kVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(k());
            }
            this.f902k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return g(i2, keyEvent) != null;
    }

    public final ArrayList k() {
        boolean z = this.f899h;
        ArrayList arrayList = this.f898g;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f897f;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            k kVar = (k) arrayList2.get(i2);
            if (kVar.isVisible()) {
                arrayList.add(kVar);
            }
        }
        this.f899h = false;
        this.f902k = true;
        return arrayList;
    }

    public boolean l() {
        return this.f911t;
    }

    public boolean m() {
        return this.c;
    }

    public boolean n() {
        return this.f895d;
    }

    public final void o(boolean z) {
        if (this.f904m) {
            this.f905n = true;
            if (z) {
                this.f906o = true;
                return;
            }
            return;
        }
        if (z) {
            this.f899h = true;
            this.f902k = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f909r;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        s();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            p pVar = (p) weakReference.get();
            if (pVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                pVar.e();
            }
        }
        r();
    }

    public final boolean p(MenuItem menuItem, l lVar, int i2) {
        boolean zExpandActionView;
        k kVar = (k) menuItem;
        if (kVar == null || !kVar.isEnabled()) {
            return false;
        }
        j jVar = kVar.f924n;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = kVar.f926p;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(kVar)) && !jVar.e(jVar, kVar)) {
            Intent intent = kVar.f917g;
            if (intent != null) {
                try {
                    jVar.f893a.startActivity(intent);
                    zExpandActionView = true;
                } catch (ActivityNotFoundException e3) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e3);
                    zExpandActionView = false;
                }
            }
            zExpandActionView = false;
        } else {
            zExpandActionView = true;
        }
        if ((kVar.f935y & 8) != 0 && kVar.z != null) {
            zExpandActionView |= kVar.expandActionView();
            if (zExpandActionView) {
                c(true);
            }
        } else if (kVar.hasSubMenu()) {
            if ((i2 & 4) == 0) {
                c(false);
            }
            if (!kVar.hasSubMenu()) {
                t tVar = new t(this.f893a, this, kVar);
                kVar.f925o = tVar;
                tVar.setHeaderTitle(kVar.f915e);
            }
            t tVar2 = kVar.f925o;
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f909r;
            if (!copyOnWriteArrayList.isEmpty()) {
                zJ = lVar != null ? lVar.j(tVar2) : false;
                for (WeakReference weakReference : copyOnWriteArrayList) {
                    p pVar = (p) weakReference.get();
                    if (pVar == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zJ) {
                        zJ = pVar.j(tVar2);
                    }
                }
            }
            zExpandActionView |= zJ;
            if (!zExpandActionView) {
                c(true);
            }
        } else if ((i2 & 1) == 0) {
            c(true);
        }
        return zExpandActionView;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i2, int i3) {
        return p(findItem(i2), null, i3);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        k kVarG = g(i2, keyEvent);
        boolean zP = kVarG != null ? p(kVarG, null, i3) : false;
        if ((i3 & 2) != 0) {
            c(true);
        }
        return zP;
    }

    public final void q(int i2, CharSequence charSequence, int i3, View view) {
        if (view != null) {
            this.f903l = null;
        } else {
            if (i2 > 0) {
                this.f903l = this.f894b.getText(i2);
            } else if (charSequence != null) {
                this.f903l = charSequence;
            }
            if (i3 > 0) {
                v.a.b(this.f893a, i3);
            }
        }
        o(false);
    }

    public final void r() {
        this.f904m = false;
        if (this.f905n) {
            this.f905n = false;
            o(this.f906o);
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i2) {
        ArrayList arrayList = this.f897f;
        int size = arrayList.size();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i4 = -1;
                break;
            } else if (((k) arrayList.get(i4)).f913b == i2) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 >= 0) {
            int size2 = arrayList.size() - i4;
            while (true) {
                int i5 = i3 + 1;
                if (i3 >= size2 || ((k) arrayList.get(i4)).f913b != i2) {
                    break;
                }
                if (i4 >= 0 && i4 < arrayList.size()) {
                    arrayList.remove(i4);
                }
                i3 = i5;
            }
            o(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i2) {
        ArrayList arrayList = this.f897f;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((k) arrayList.get(i3)).f912a == i2) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 < 0 || i3 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i3);
        o(true);
    }

    public final void s() {
        if (this.f904m) {
            return;
        }
        this.f904m = true;
        this.f905n = false;
        this.f906o = false;
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i2, boolean z, boolean z2) {
        ArrayList arrayList = this.f897f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            k kVar = (k) arrayList.get(i3);
            if (kVar.f913b == i2) {
                kVar.f934x = (kVar.f934x & (-5)) | (z2 ? 4 : 0);
                kVar.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f911t = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i2, boolean z) {
        ArrayList arrayList = this.f897f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            k kVar = (k) arrayList.get(i3);
            if (kVar.f913b == i2) {
                kVar.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i2, boolean z) {
        ArrayList arrayList = this.f897f;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            k kVar = (k) arrayList.get(i3);
            if (kVar.f913b == i2) {
                int i4 = kVar.f934x;
                int i5 = (i4 & (-9)) | (z ? 0 : 8);
                kVar.f934x = i5;
                if (i4 != i5) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            o(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.c = z;
        o(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f897f.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2) {
        return a(0, 0, 0, this.f894b.getString(i2));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, this.f894b.getString(i2));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return a(i2, i3, i4, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        k kVarA = a(i2, i3, i4, charSequence);
        t tVar = new t(this.f893a, this, kVarA);
        kVarA.f925o = tVar;
        tVar.setHeaderTitle(kVarA.f915e);
        return tVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i3, int i4, int i5) {
        return a(i2, i3, i4, this.f894b.getString(i5));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return addSubMenu(i2, i3, i4, this.f894b.getString(i5));
    }

    public j j() {
        return this;
    }
}
