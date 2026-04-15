package e;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class h extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f888b = -1;
    public boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LayoutInflater f890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f891f;

    public h(j jVar, LayoutInflater layoutInflater, boolean z, int i2) {
        this.f889d = z;
        this.f890e = layoutInflater;
        this.f887a = jVar;
        this.f891f = i2;
        a();
    }

    public final void a() {
        j jVar = this.f887a;
        k kVar = jVar.f910s;
        if (kVar != null) {
            jVar.i();
            ArrayList arrayList = jVar.f901j;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((k) arrayList.get(i2)) == kVar) {
                    this.f888b = i2;
                    return;
                }
            }
        }
        this.f888b = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final k getItem(int i2) {
        ArrayList arrayListK;
        boolean z = this.f889d;
        j jVar = this.f887a;
        if (z) {
            jVar.i();
            arrayListK = jVar.f901j;
        } else {
            arrayListK = jVar.k();
        }
        int i3 = this.f888b;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return (k) arrayListK.get(i2);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListK;
        boolean z = this.f889d;
        j jVar = this.f887a;
        if (z) {
            jVar.i();
            arrayListK = jVar.f901j;
        } else {
            arrayListK = jVar.k();
        }
        return this.f888b < 0 ? arrayListK.size() : arrayListK.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.f890e.inflate(this.f891f, viewGroup, false);
        }
        int i3 = getItem(i2).f913b;
        int i4 = i2 - 1;
        int i5 = i4 >= 0 ? getItem(i4).f913b : i3;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f887a.l() && i3 != i5) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        q qVar = (q) view;
        if (this.c) {
            listMenuItemView.setForceShowIcon(true);
        }
        qVar.b(getItem(i2));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
