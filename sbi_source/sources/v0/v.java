package v0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2448a;

    public /* synthetic */ v(RecyclerView recyclerView) {
        this.f2448a = recyclerView;
    }

    public void a(int i2) {
        RecyclerView recyclerView = this.f2448a;
        View childAt = recyclerView.getChildAt(i2);
        if (childAt != null) {
            RecyclerView.s(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i2);
    }
}
