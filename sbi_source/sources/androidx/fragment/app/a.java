package androidx.fragment.app;

import android.view.View;
import androidx.emoji2.text.u;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f278b;
    public boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f280e;

    public a(k kVar) {
        this.f277a = 0;
        kVar.getClass();
        this.f279d = new ArrayList();
        this.f278b = -1;
        this.f280e = kVar;
    }

    public void a(int i2) {
        switch (this.f277a) {
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f280e;
                WeakReference weakReference = bottomSheetBehavior.W;
                if (weakReference != null && weakReference.get() != null) {
                    this.f278b = i2;
                    if (!this.c) {
                        ((View) bottomSheetBehavior.W.get()).postOnAnimation((b) this.f279d);
                        this.c = true;
                    }
                    break;
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f280e;
                WeakReference weakReference2 = sideSheetBehavior.f664p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f278b = i2;
                    if (!this.c) {
                        ((View) sideSheetBehavior.f664p.get()).postOnAnimation((u) this.f279d);
                        this.c = true;
                    }
                    break;
                }
                break;
        }
    }

    public String toString() {
        switch (this.f277a) {
            case 0:
                StringBuilder sb = new StringBuilder(128);
                sb.append("BackStackEntry{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                if (this.f278b >= 0) {
                    sb.append(" #");
                    sb.append(this.f278b);
                }
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public a(SideSheetBehavior sideSheetBehavior) {
        this.f277a = 2;
        this.f280e = sideSheetBehavior;
        this.f279d = new u(6, this);
    }

    public a(BottomSheetBehavior bottomSheetBehavior) {
        this.f277a = 1;
        this.f280e = bottomSheetBehavior;
        this.f279d = new b(5, this);
    }
}
