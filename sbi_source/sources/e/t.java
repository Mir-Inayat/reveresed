package e;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class t extends j implements SubMenu {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final j f966v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final k f967w;

    public t(Context context, j jVar, k kVar) {
        super(context);
        this.f966v = jVar;
        this.f967w = kVar;
    }

    @Override // e.j
    public final boolean d(k kVar) {
        return this.f966v.d(kVar);
    }

    @Override // e.j
    public final boolean e(j jVar, MenuItem menuItem) {
        return super.e(jVar, menuItem) || this.f966v.e(jVar, menuItem);
    }

    @Override // e.j
    public final boolean f(k kVar) {
        return this.f966v.f(kVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f967w;
    }

    @Override // e.j
    public final j j() {
        return this.f966v.j();
    }

    @Override // e.j
    public final boolean l() {
        return this.f966v.l();
    }

    @Override // e.j
    public final boolean m() {
        return this.f966v.m();
    }

    @Override // e.j
    public final boolean n() {
        return this.f966v.n();
    }

    @Override // e.j, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.f966v.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        q(0, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        q(0, charSequence, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        q(0, null, 0, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f967w.setIcon(drawable);
        return this;
    }

    @Override // e.j, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f966v.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i2) {
        q(0, null, i2, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i2) {
        q(i2, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i2) {
        this.f967w.setIcon(i2);
        return this;
    }
}
