package d;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import e.k;
import f0.l;
import java.lang.reflect.Constructor;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public CharSequence A;
    public final /* synthetic */ d D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Menu f786a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f792h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f793i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f794j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f795k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f796l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f797m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public char f798n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f799o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public char f800p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f801q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f802r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f803s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f804t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f805u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f806v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f807w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f808x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f809y;
    public CharSequence z;
    public ColorStateList B = null;
    public PorterDuff.Mode C = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f787b = 0;
    public int c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f788d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f789e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f790f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f791g = true;

    public c(d dVar, Menu menu) {
        this.D = dVar;
        this.f786a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.D.c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e3) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e3);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        d dVar = this.D;
        Context context = dVar.c;
        boolean z = false;
        menuItem.setChecked(this.f803s).setVisible(this.f804t).setEnabled(this.f805u).setCheckable(this.f802r >= 1).setTitleCondensed(this.f796l).setIcon(this.f797m);
        int i2 = this.f806v;
        if (i2 >= 0) {
            menuItem.setShowAsAction(i2);
        }
        if (this.f809y != null) {
            if (context.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (dVar.f814d == null) {
                dVar.f814d = d.a(context);
            }
            Object obj = dVar.f814d;
            String str = this.f809y;
            b bVar = new b();
            bVar.f784a = obj;
            Class<?> cls = obj.getClass();
            try {
                bVar.f785b = cls.getMethod(str, b.c);
                menuItem.setOnMenuItemClickListener(bVar);
            } catch (Exception e3) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e3);
                throw inflateException;
            }
        }
        if (this.f802r >= 2 && (menuItem instanceof k)) {
            k kVar = (k) menuItem;
            kVar.f934x = (kVar.f934x & (-5)) | 4;
        }
        String str2 = this.f808x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, d.f810e, dVar.f812a));
            z = true;
        }
        int i3 = this.f807w;
        if (i3 > 0) {
            if (z) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i3);
            }
        }
        CharSequence charSequence = this.z;
        boolean z2 = menuItem instanceof k;
        if (z2) {
            ((k) menuItem).c(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            l.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.A;
        if (z2) {
            ((k) menuItem).e(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            l.m(menuItem, charSequence2);
        }
        char c = this.f798n;
        int i4 = this.f799o;
        if (z2) {
            ((k) menuItem).setAlphabeticShortcut(c, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            l.g(menuItem, c, i4);
        }
        char c3 = this.f800p;
        int i5 = this.f801q;
        if (z2) {
            ((k) menuItem).setNumericShortcut(c3, i5);
        } else if (Build.VERSION.SDK_INT >= 26) {
            l.k(menuItem, c3, i5);
        }
        PorterDuff.Mode mode = this.C;
        if (mode != null) {
            if (z2) {
                ((k) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                l.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.B;
        if (colorStateList != null) {
            if (z2) {
                ((k) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                l.i(menuItem, colorStateList);
            }
        }
    }
}
