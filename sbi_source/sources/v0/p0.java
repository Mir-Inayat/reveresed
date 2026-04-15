package v0;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends f0.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q0 f2407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakHashMap f2408e = new WeakHashMap();

    public p0(q0 q0Var) {
        this.f2407d = q0Var;
    }

    @Override // f0.b
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        f0.b bVar = (f0.b) this.f2408e.get(view);
        return bVar != null ? bVar.a(view, accessibilityEvent) : this.f1226a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // f0.b
    public final androidx.emoji2.text.n b(View view) {
        f0.b bVar = (f0.b) this.f2408e.get(view);
        return bVar != null ? bVar.b(view) : super.b(view);
    }

    @Override // f0.b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        f0.b bVar = (f0.b) this.f2408e.get(view);
        if (bVar != null) {
            bVar.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // f0.b
    public final void d(View view, g0.i iVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = iVar.f1336a;
        q0 q0Var = this.f2407d;
        RecyclerView recyclerView = q0Var.f2412d;
        RecyclerView recyclerView2 = q0Var.f2412d;
        boolean zU = recyclerView.u();
        View.AccessibilityDelegate accessibilityDelegate = this.f1226a;
        if (zU || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().N(view, iVar);
        f0.b bVar = (f0.b) this.f2408e.get(view);
        if (bVar != null) {
            bVar.d(view, iVar);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    @Override // f0.b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        f0.b bVar = (f0.b) this.f2408e.get(view);
        if (bVar != null) {
            bVar.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // f0.b
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        f0.b bVar = (f0.b) this.f2408e.get(viewGroup);
        return bVar != null ? bVar.f(viewGroup, view, accessibilityEvent) : this.f1226a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // f0.b
    public final boolean g(View view, int i2, Bundle bundle) {
        q0 q0Var = this.f2407d;
        RecyclerView recyclerView = q0Var.f2412d;
        RecyclerView recyclerView2 = q0Var.f2412d;
        if (recyclerView.u() || recyclerView2.getLayoutManager() == null) {
            return super.g(view, i2, bundle);
        }
        f0.b bVar = (f0.b) this.f2408e.get(view);
        if (bVar != null) {
            if (bVar.g(view, i2, bundle)) {
                return true;
            }
        } else if (super.g(view, i2, bundle)) {
            return true;
        }
        i0 i0Var = recyclerView2.getLayoutManager().f2298b.f381a;
        return false;
    }

    @Override // f0.b
    public final void h(View view, int i2) {
        f0.b bVar = (f0.b) this.f2408e.get(view);
        if (bVar != null) {
            bVar.h(view, i2);
        } else {
            super.h(view, i2);
        }
    }

    @Override // f0.b
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        f0.b bVar = (f0.b) this.f2408e.get(view);
        if (bVar != null) {
            bVar.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
