package d;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.redhand.laugiytr.R;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class a extends ContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Resources.Theme f782b;
    public LayoutInflater c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Resources f783d;

    public final void a() {
        if (this.f782b == null) {
            this.f782b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f782b.setTo(theme);
            }
        }
        this.f782b.applyStyle(this.f781a, true);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f783d == null) {
            this.f783d = super.getResources();
        }
        return this.f783d;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.c == null) {
            this.c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f782b;
        if (theme != null) {
            return theme;
        }
        if (this.f781a == 0) {
            this.f781a = R.NP_MANAGER15.NP_MANAGER;
        }
        a();
        return this.f782b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i2) {
        if (this.f781a != i2) {
            this.f781a = i2;
            a();
        }
    }
}
