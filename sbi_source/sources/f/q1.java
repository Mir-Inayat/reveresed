package f;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class q1 extends a1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f1144m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f1145n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public n1 f1146o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public e.k f1147p;

    public q1(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f1144m = 21;
            this.f1145n = 22;
        } else {
            this.f1144m = 22;
            this.f1145n = 21;
        }
    }

    @Override // f.a1, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        e.h hVar;
        int headersCount;
        int iPointToPosition;
        int i2;
        if (this.f1146o != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                hVar = (e.h) headerViewListAdapter.getWrappedAdapter();
            } else {
                hVar = (e.h) adapter;
                headersCount = 0;
            }
            e.k item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = iPointToPosition - headersCount) < 0 || i2 >= hVar.getCount()) ? null : hVar.getItem(i2);
            e.k kVar = this.f1147p;
            if (kVar != item) {
                e.j jVar = hVar.f887a;
                if (kVar != null) {
                    this.f1146o.p(jVar, kVar);
                }
                this.f1147p = item;
                if (item != null) {
                    this.f1146o.q(jVar, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i2 == this.f1144m) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i2 != this.f1145n) {
            return super.onKeyDown(i2, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (e.h) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (e.h) adapter).f887a.c(false);
        return true;
    }

    public void setHoverListener(n1 n1Var) {
        this.f1146o = n1Var;
    }

    @Override // f.a1, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
