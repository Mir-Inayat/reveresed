package androidx.fragment.app;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.redhand.laugh.MainActivity;
import f.a1;
import f0.m0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import v0.o0;
import v0.z;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f282b;

    public /* synthetic */ b(int i2, Object obj) {
        this.f281a = i2;
        this.f282b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f.j jVar;
        long j2;
        int i2 = this.f281a;
        int i3 = 1;
        int i4 = 2;
        int i5 = 0;
        Object obj = this.f282b;
        switch (i2) {
            case 0:
                ((e) obj).f285k.onDismiss(null);
                return;
            case 1:
                ((k) obj).getClass();
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            case 2:
                a1 a1Var = (a1) obj;
                a1Var.f984l = null;
                a1Var.drawableStateChanged();
                return;
            case 3:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) obj;
                if (searchView$SearchAutoComplete.f97f) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f97f = false;
                    return;
                }
                return;
            case 4:
                ActionMenuView actionMenuView = ((Toolbar) obj).f99a;
                if (actionMenuView == null || (jVar = actionMenuView.f80s) == null) {
                    return;
                }
                jVar.h();
                return;
            case 5:
                a aVar = (a) obj;
                aVar.c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) aVar.f280e;
                m0.e eVar = bottomSheetBehavior.O;
                if (eVar != null && eVar.f()) {
                    aVar.a(aVar.f278b);
                    return;
                } else {
                    if (bottomSheetBehavior.N == 2) {
                        bottomSheetBehavior.C(aVar.f278b);
                        return;
                    }
                    return;
                }
            case 6:
                k0.g gVar = (k0.g) obj;
                a1 a1Var2 = gVar.c;
                k0.a aVar2 = gVar.f1462a;
                if (gVar.f1475o) {
                    if (gVar.f1473m) {
                        gVar.f1473m = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar2.f1456e = jCurrentAnimationTimeMillis;
                        aVar2.f1458g = -1L;
                        aVar2.f1457f = jCurrentAnimationTimeMillis;
                        aVar2.f1459h = 0.5f;
                    }
                    if ((aVar2.f1458g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar2.f1458g + ((long) aVar2.f1460i)) || !gVar.e()) {
                        gVar.f1475o = false;
                        return;
                    }
                    if (gVar.f1474n) {
                        gVar.f1474n = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        a1Var2.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (aVar2.f1457f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = aVar2.a(jCurrentAnimationTimeMillis2);
                    long j3 = jCurrentAnimationTimeMillis2 - aVar2.f1457f;
                    aVar2.f1457f = jCurrentAnimationTimeMillis2;
                    gVar.f1477q.scrollListBy((int) (j3 * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * aVar2.f1455d));
                    Field field = m0.f1276a;
                    a1Var2.postOnAnimation(this);
                    return;
                }
                return;
            case 7:
                ((m0.e) obj).n(0);
                return;
            case 8:
                v0.k kVar = (v0.k) obj;
                ValueAnimator valueAnimator = kVar.f2361u;
                int i6 = kVar.f2362v;
                if (i6 == 1) {
                    valueAnimator.cancel();
                } else if (i6 != 2) {
                    return;
                }
                kVar.f2362v = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 9:
                z zVar = ((RecyclerView) obj).F;
                if (zVar != null) {
                    v0.h hVar = (v0.h) zVar;
                    ArrayList arrayList = hVar.f2319h;
                    boolean zIsEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = hVar.f2321j;
                    boolean zIsEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = hVar.f2322k;
                    boolean zIsEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = hVar.f2320i;
                    boolean zIsEmpty4 = arrayList4.isEmpty();
                    if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
                        return;
                    }
                    if (arrayList.size() > 0) {
                        ((o0) arrayList.get(0)).getClass();
                        throw null;
                    }
                    arrayList.clear();
                    if (zIsEmpty2) {
                        j2 = 0;
                    } else {
                        ArrayList arrayList5 = new ArrayList();
                        arrayList5.addAll(arrayList2);
                        j2 = 0;
                        hVar.f2324m.add(arrayList5);
                        arrayList2.clear();
                        v0.c cVar = new v0.c(hVar, arrayList5, i5);
                        if (!zIsEmpty) {
                            ((v0.g) arrayList5.get(0)).getClass();
                            throw null;
                        }
                        cVar.run();
                    }
                    if (!zIsEmpty3) {
                        ArrayList arrayList6 = new ArrayList();
                        arrayList6.addAll(arrayList3);
                        hVar.f2325n.add(arrayList6);
                        arrayList3.clear();
                        v0.c cVar2 = new v0.c(hVar, arrayList6, i3);
                        if (!zIsEmpty) {
                            ((v0.f) arrayList6.get(0)).getClass();
                            throw null;
                        }
                        cVar2.run();
                    }
                    if (zIsEmpty4) {
                        return;
                    }
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.addAll(arrayList4);
                    hVar.f2323l.add(arrayList7);
                    arrayList4.clear();
                    v0.c cVar3 = new v0.c(hVar, arrayList7, i4);
                    if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
                        cVar3.run();
                        return;
                    }
                    Math.max(!zIsEmpty2 ? hVar.f2454e : j2, !zIsEmpty3 ? hVar.f2455f : j2);
                    ((o0) arrayList7.get(0)).getClass();
                    Field field2 = m0.f1276a;
                    throw null;
                }
                return;
            case 10:
                ((StaggeredGridLayoutManager) obj).c0();
                return;
            case 11:
                CheckableImageButton checkableImageButton = ((TextInputLayout) obj).c.f2554g;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            default:
                MainActivity mainActivity = (MainActivity) obj;
                Handler handler = mainActivity.f772p;
                if (!mainActivity.getPackageManager().canRequestPackageInstalls()) {
                    handler.postDelayed(this, 150L);
                    return;
                } else {
                    handler.removeCallbacks(this);
                    mainActivity.b();
                    return;
                }
        }
    }
}
