package z0;

import android.widget.FrameLayout;
import com.redhand.laugiytr.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f2720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f2721b;
    public static final ArrayList c;

    static {
        a aVar = new a();
        aVar.A = new ArrayList();
        aVar.D = false;
        aVar.E = 0;
        aVar.B = false;
        aVar.I(new h(2));
        aVar.I(new f());
        aVar.I(new h(1));
        f2720a = aVar;
        f2721b = new ThreadLocal();
        c = new ArrayList();
    }

    public static void a(FrameLayout frameLayout, m mVar) {
        ArrayList arrayList = c;
        if (arrayList.contains(frameLayout) || !frameLayout.isLaidOut()) {
            return;
        }
        arrayList.add(frameLayout);
        if (mVar == null) {
            mVar = f2720a;
        }
        m mVarClone = mVar.clone();
        ArrayList arrayList2 = (ArrayList) b().get(frameLayout);
        if (arrayList2 != null && arrayList2.size() > 0) {
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                ((m) obj).w(frameLayout);
            }
        }
        mVarClone.h(frameLayout, true);
        if (frameLayout.getTag(R.NP_MANAGER8.NP_MANAGER) != null) {
            throw new ClassCastException();
        }
        frameLayout.setTag(R.NP_MANAGER8.NP_MANAGER, null);
        p pVar = new p();
        pVar.f2718a = mVarClone;
        pVar.f2719b = frameLayout;
        frameLayout.addOnAttachStateChangeListener(pVar);
        frameLayout.getViewTreeObserver().addOnPreDrawListener(pVar);
    }

    public static i.f b() {
        i.f fVar;
        ThreadLocal threadLocal = f2721b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (fVar = (i.f) weakReference.get()) != null) {
            return fVar;
        }
        i.f fVar2 = new i.f(0);
        threadLocal.set(new WeakReference(fVar2));
        return fVar2;
    }
}
