package e;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class k implements MenuItem {
    public MenuItem.OnActionExpandListener A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f913b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f916f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Intent f917g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public char f918h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public char f920j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f922l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j f924n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public t f925o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f926p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f927q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f928r;
    public View z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f919i = 4096;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f921k = 4096;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f923m = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ColorStateList f929s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f930t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f931u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f932v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f933w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f934x = 16;
    public boolean B = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f935y = 0;

    public k(j jVar, int i2, int i3, int i4, int i5, CharSequence charSequence) {
        this.f924n = jVar;
        this.f912a = i3;
        this.f913b = i2;
        this.c = i4;
        this.f914d = i5;
        this.f915e = charSequence;
    }

    public static void a(StringBuilder sb, int i2, int i3, String str) {
        if ((i2 & i3) == i3) {
            sb.append(str);
        }
    }

    public final Drawable b(Drawable drawable) {
        if (drawable != null && this.f933w && (this.f931u || this.f932v)) {
            drawable = drawable.mutate();
            if (this.f931u) {
                y.a.h(drawable, this.f929s);
            }
            if (this.f932v) {
                y.a.i(drawable, this.f930t);
            }
            this.f933w = false;
        }
        return drawable;
    }

    public final k c(CharSequence charSequence) {
        this.f927q = charSequence;
        this.f924n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f935y & 8) == 0) {
            return false;
        }
        if (this.z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f924n.d(this);
        }
        return false;
    }

    public final void d(boolean z) {
        if (z) {
            this.f934x |= 32;
        } else {
            this.f934x &= -33;
        }
    }

    public final k e(CharSequence charSequence) {
        this.f928r = charSequence;
        this.f924n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if ((this.f935y & 8) == 0 || this.z == null) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f924n.f(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.z;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f921k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f920j;
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f927q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f913b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f922l;
        if (drawable != null) {
            return b(drawable);
        }
        int i2 = this.f923m;
        if (i2 == 0) {
            return null;
        }
        Drawable drawableR = a0.a.r(this.f924n.f893a, i2);
        this.f923m = 0;
        this.f922l = drawableR;
        return b(drawableR);
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f929s;
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f930t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f917g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f912a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f919i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f918h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f925o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f915e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f916f;
        return charSequence != null ? charSequence : this.f915e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f928r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f925o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.B;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f934x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f934x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f934x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f934x & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i2;
        this.z = view;
        if (view != null && view.getId() == -1 && (i2 = this.f912a) > 0) {
            view.setId(i2);
        }
        j jVar = this.f924n;
        jVar.f902k = true;
        jVar.o(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f920j == c) {
            return this;
        }
        this.f920j = Character.toLowerCase(c);
        this.f924n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i2 = this.f934x;
        int i3 = (z ? 1 : 0) | (i2 & (-2));
        this.f934x = i3;
        if (i2 != i3) {
            this.f924n.o(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        int i2 = this.f934x;
        int i3 = i2 & 4;
        j jVar = this.f924n;
        if (i3 == 0) {
            int i4 = (i2 & (-3)) | (z ? 2 : 0);
            this.f934x = i4;
            if (i2 != i4) {
                jVar.o(false);
            }
            return this;
        }
        ArrayList arrayList = jVar.f897f;
        int size = arrayList.size();
        jVar.s();
        for (int i5 = 0; i5 < size; i5++) {
            k kVar = (k) arrayList.get(i5);
            if (kVar.f913b == this.f913b && (kVar.f934x & 4) != 0 && kVar.isCheckable()) {
                boolean z2 = kVar == this;
                int i6 = kVar.f934x;
                int i7 = (z2 ? 2 : 0) | (i6 & (-3));
                kVar.f934x = i7;
                if (i6 != i7) {
                    kVar.f924n.o(false);
                }
            }
        }
        jVar.r();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        c(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.f934x |= 16;
        } else {
            this.f934x &= -17;
        }
        this.f924n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f923m = 0;
        this.f922l = drawable;
        this.f933w = true;
        this.f924n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f929s = colorStateList;
        this.f931u = true;
        this.f933w = true;
        this.f924n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f930t = mode;
        this.f932v = true;
        this.f933w = true;
        this.f924n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f917g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.f918h == c) {
            return this;
        }
        this.f918h = c;
        this.f924n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.A = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f926p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c3) {
        this.f918h = c;
        this.f920j = Character.toLowerCase(c3);
        this.f924n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i2) {
        int i3 = i2 & 3;
        if (i3 != 0 && i3 != 1 && i3 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f935y = i2;
        j jVar = this.f924n;
        jVar.f902k = true;
        jVar.o(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f915e = charSequence;
        this.f924n.o(false);
        t tVar = this.f925o;
        if (tVar != null) {
            tVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f916f = charSequence;
        this.f924n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        e(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        int i2 = this.f934x;
        int i3 = (z ? 0 : 8) | (i2 & (-9));
        this.f934x = i3;
        if (i2 != i3) {
            j jVar = this.f924n;
            jVar.f899h = true;
            jVar.o(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f915e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i2) {
        if (this.f920j == c && this.f921k == i2) {
            return this;
        }
        this.f920j = Character.toLowerCase(c);
        this.f921k = KeyEvent.normalizeMetaState(i2);
        this.f924n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i2) {
        if (this.f918h == c && this.f919i == i2) {
            return this;
        }
        this.f918h = c;
        this.f919i = KeyEvent.normalizeMetaState(i2);
        this.f924n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c3, int i2, int i3) {
        this.f918h = c;
        this.f919i = KeyEvent.normalizeMetaState(i2);
        this.f920j = Character.toLowerCase(c3);
        this.f921k = KeyEvent.normalizeMetaState(i3);
        this.f924n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i2) {
        this.f922l = null;
        this.f923m = i2;
        this.f933w = true;
        this.f924n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i2) {
        setTitle(this.f924n.f893a.getString(i2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i2) {
        int i3;
        j jVar = this.f924n;
        Context context = jVar.f893a;
        View viewInflate = LayoutInflater.from(context).inflate(i2, (ViewGroup) new LinearLayout(context), false);
        this.z = viewInflate;
        if (viewInflate != null && viewInflate.getId() == -1 && (i3 = this.f912a) > 0) {
            viewInflate.setId(i3);
        }
        jVar.f902k = true;
        jVar.o(true);
        return this;
    }
}
