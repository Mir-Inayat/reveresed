package z0;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import f0.m0;
import f0.t0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public abstract class m implements Cloneable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Animator[] f2692w = new Animator[0];

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int[] f2693x = {2, 1, 3, 4};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final t1.g f2694y = new t1.g(29);
    public static final ThreadLocal z = new ThreadLocal();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f2704k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList f2705l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public k[] f2706m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2695a = getClass().getName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f2696b = -1;
    public long c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TimeInterpolator f2697d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f2698e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f2699f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public androidx.emoji2.text.y f2700g = new androidx.emoji2.text.y(2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public androidx.emoji2.text.y f2701h = new androidx.emoji2.text.y(2);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f2702i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f2703j = f2693x;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f2707n = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Animator[] f2708o = f2692w;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f2709p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f2710q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f2711r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public m f2712s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ArrayList f2713t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList f2714u = new ArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public t1.g f2715v = f2694y;

    public static void b(androidx.emoji2.text.y yVar, View view, u uVar) {
        i.f fVar = (i.f) yVar.f269a;
        i.f fVar2 = (i.f) yVar.f271d;
        SparseArray sparseArray = (SparseArray) yVar.f270b;
        i.h hVar = (i.h) yVar.c;
        fVar.put(view, uVar);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        Field field = m0.f1276a;
        String strK = f0.c0.k(view);
        if (strK != null) {
            if (fVar2.containsKey(strK)) {
                fVar2.put(strK, null);
            } else {
                fVar2.put(strK, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (hVar.f1374a) {
                    int i2 = hVar.f1376d;
                    long[] jArr = hVar.f1375b;
                    Object[] objArr = hVar.c;
                    int i3 = 0;
                    for (int i4 = 0; i4 < i2; i4++) {
                        Object obj = objArr[i4];
                        if (obj != i.i.f1377a) {
                            if (i4 != i3) {
                                jArr[i3] = jArr[i4];
                                objArr[i3] = obj;
                                objArr[i4] = null;
                            }
                            i3++;
                        }
                    }
                    hVar.f1374a = false;
                    hVar.f1376d = i3;
                }
                if (j.a.b(hVar.f1375b, hVar.f1376d, itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    hVar.d(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) hVar.b(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    hVar.d(itemIdAtPosition, null);
                }
            }
        }
    }

    public static i.f p() {
        ThreadLocal threadLocal = z;
        i.f fVar = (i.f) threadLocal.get();
        if (fVar != null) {
            return fVar;
        }
        i.f fVar2 = new i.f(0);
        threadLocal.set(fVar2);
        return fVar2;
    }

    public static boolean u(u uVar, u uVar2, String str) {
        Object obj = uVar.f2725a.get(str);
        Object obj2 = uVar2.f2725a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(long j2) {
        this.c = j2;
    }

    public void C(TimeInterpolator timeInterpolator) {
        this.f2697d = timeInterpolator;
    }

    public void D(t1.g gVar) {
        if (gVar == null) {
            this.f2715v = f2694y;
        } else {
            this.f2715v = gVar;
        }
    }

    public void F(long j2) {
        this.f2696b = j2;
    }

    public final void G() {
        if (this.f2709p == 0) {
            v(this, l.f2688a);
            this.f2711r = false;
        }
        this.f2709p++;
    }

    public String H(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.c != -1) {
            sb.append("dur(");
            sb.append(this.c);
            sb.append(") ");
        }
        if (this.f2696b != -1) {
            sb.append("dly(");
            sb.append(this.f2696b);
            sb.append(") ");
        }
        if (this.f2697d != null) {
            sb.append("interp(");
            sb.append(this.f2697d);
            sb.append(") ");
        }
        ArrayList arrayList = this.f2698e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f2699f;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i2));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    if (i3 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i3));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void a(k kVar) {
        if (this.f2713t == null) {
            this.f2713t = new ArrayList();
        }
        this.f2713t.add(kVar);
    }

    public void c() {
        ArrayList arrayList = this.f2707n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f2708o);
        this.f2708o = f2692w;
        for (int i2 = size - 1; i2 >= 0; i2--) {
            Animator animator = animatorArr[i2];
            animatorArr[i2] = null;
            animator.cancel();
        }
        this.f2708o = animatorArr;
        v(this, l.c);
    }

    public abstract void d(u uVar);

    public final void e(View view, boolean z2) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            u uVar = new u(view);
            if (z2) {
                g(uVar);
            } else {
                d(uVar);
            }
            uVar.c.add(this);
            f(uVar);
            if (z2) {
                b(this.f2700g, view, uVar);
            } else {
                b(this.f2701h, view, uVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                e(viewGroup.getChildAt(i2), z2);
            }
        }
    }

    public abstract void g(u uVar);

    public final void h(ViewGroup viewGroup, boolean z2) {
        i(z2);
        ArrayList arrayList = this.f2698e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f2699f;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(viewGroup, z2);
            return;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i2)).intValue());
            if (viewFindViewById != null) {
                u uVar = new u(viewFindViewById);
                if (z2) {
                    g(uVar);
                } else {
                    d(uVar);
                }
                uVar.c.add(this);
                f(uVar);
                if (z2) {
                    b(this.f2700g, viewFindViewById, uVar);
                } else {
                    b(this.f2701h, viewFindViewById, uVar);
                }
            }
        }
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            View view = (View) arrayList2.get(i3);
            u uVar2 = new u(view);
            if (z2) {
                g(uVar2);
            } else {
                d(uVar2);
            }
            uVar2.c.add(this);
            f(uVar2);
            if (z2) {
                b(this.f2700g, view, uVar2);
            } else {
                b(this.f2701h, view, uVar2);
            }
        }
    }

    public final void i(boolean z2) {
        if (z2) {
            ((i.f) this.f2700g.f269a).clear();
            ((SparseArray) this.f2700g.f270b).clear();
            ((i.h) this.f2700g.c).a();
        } else {
            ((i.f) this.f2701h.f269a).clear();
            ((SparseArray) this.f2701h.f270b).clear();
            ((i.h) this.f2701h.c).a();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: j */
    public m clone() {
        try {
            m mVar = (m) super.clone();
            mVar.f2714u = new ArrayList();
            mVar.f2700g = new androidx.emoji2.text.y(2);
            mVar.f2701h = new androidx.emoji2.text.y(2);
            mVar.f2704k = null;
            mVar.f2705l = null;
            mVar.f2712s = this;
            mVar.f2713t = null;
            return mVar;
        } catch (CloneNotSupportedException e3) {
            throw new RuntimeException(e3);
        }
    }

    public Animator k(ViewGroup viewGroup, u uVar, u uVar2) {
        return null;
    }

    public void l(ViewGroup viewGroup, androidx.emoji2.text.y yVar, androidx.emoji2.text.y yVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i2;
        int i3;
        View view;
        u uVar;
        Animator animator;
        u uVar2;
        i.f fVarP = p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        o().getClass();
        int i4 = 0;
        while (i4 < size) {
            u uVar3 = (u) arrayList.get(i4);
            u uVar4 = (u) arrayList2.get(i4);
            if (uVar3 != null && !uVar3.c.contains(this)) {
                uVar3 = null;
            }
            if (uVar4 != null && !uVar4.c.contains(this)) {
                uVar4 = null;
            }
            if ((uVar3 != null || uVar4 != null) && (uVar3 == null || uVar4 == null || s(uVar3, uVar4))) {
                Animator animatorK = k(viewGroup, uVar3, uVar4);
                if (animatorK != null) {
                    String str = this.f2695a;
                    if (uVar4 != null) {
                        view = uVar4.f2726b;
                        String[] strArrQ = q();
                        if (strArrQ != null && strArrQ.length > 0) {
                            uVar2 = new u(view);
                            u uVar5 = (u) ((i.f) yVar2.f269a).get(view);
                            i2 = size;
                            if (uVar5 != null) {
                                int i5 = 0;
                                while (i5 < strArrQ.length) {
                                    String str2 = strArrQ[i5];
                                    int i6 = i4;
                                    uVar2.f2725a.put(str2, uVar5.f2725a.get(str2));
                                    i5++;
                                    i4 = i6;
                                    uVar5 = uVar5;
                                }
                            }
                            i3 = i4;
                            int i7 = fVarP.c;
                            int i8 = 0;
                            while (true) {
                                if (i8 >= i7) {
                                    animator = animatorK;
                                    break;
                                }
                                j jVar = (j) fVarP.get((Animator) fVarP.f(i8));
                                if (jVar.c != null && jVar.f2683a == view && jVar.f2684b.equals(str) && jVar.c.equals(uVar2)) {
                                    animator = null;
                                    break;
                                }
                                i8++;
                            }
                        } else {
                            i2 = size;
                            i3 = i4;
                            animator = animatorK;
                            uVar2 = null;
                        }
                        animatorK = animator;
                        uVar = uVar2;
                    } else {
                        i2 = size;
                        i3 = i4;
                        view = uVar3.f2726b;
                        uVar = null;
                    }
                    if (animatorK != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        j jVar2 = new j();
                        jVar2.f2683a = view;
                        jVar2.f2684b = str;
                        jVar2.c = uVar;
                        jVar2.f2685d = windowId;
                        jVar2.f2686e = this;
                        jVar2.f2687f = animatorK;
                        fVarP.put(animatorK, jVar2);
                        this.f2714u.add(animatorK);
                    }
                }
                i4 = i3 + 1;
                size = i2;
            }
            i2 = size;
            i3 = i4;
            i4 = i3 + 1;
            size = i2;
        }
        if (sparseIntArray.size() != 0) {
            for (int i9 = 0; i9 < sparseIntArray.size(); i9++) {
                j jVar3 = (j) fVarP.get((Animator) this.f2714u.get(sparseIntArray.keyAt(i9)));
                jVar3.f2687f.setStartDelay(jVar3.f2687f.getStartDelay() + (((long) sparseIntArray.valueAt(i9)) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i2 = this.f2709p - 1;
        this.f2709p = i2;
        if (i2 == 0) {
            v(this, l.f2689b);
            for (int i3 = 0; i3 < ((i.h) this.f2700g.c).e(); i3++) {
                View view = (View) ((i.h) this.f2700g.c).f(i3);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i4 = 0; i4 < ((i.h) this.f2701h.c).e(); i4++) {
                View view2 = (View) ((i.h) this.f2701h.c).f(i4);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f2711r = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
    
        if (r2 < 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002e, code lost:
    
        if (r6 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0030, code lost:
    
        r5 = r4.f2705l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0033, code lost:
    
        r5 = r4.f2704k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
    
        return (z0.u) r5.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final z0.u n(android.view.View r5, boolean r6) {
        /*
            r4 = this;
            z0.a r0 = r4.f2702i
            if (r0 == 0) goto L9
            z0.u r5 = r0.n(r5, r6)
            return r5
        L9:
            if (r6 == 0) goto Le
            java.util.ArrayList r0 = r4.f2704k
            goto L10
        Le:
            java.util.ArrayList r0 = r4.f2705l
        L10:
            if (r0 != 0) goto L13
            goto L3c
        L13:
            int r1 = r0.size()
            r2 = 0
        L18:
            if (r2 >= r1) goto L2b
            java.lang.Object r3 = r0.get(r2)
            z0.u r3 = (z0.u) r3
            if (r3 != 0) goto L23
            goto L3c
        L23:
            android.view.View r3 = r3.f2726b
            if (r3 != r5) goto L28
            goto L2c
        L28:
            int r2 = r2 + 1
            goto L18
        L2b:
            r2 = -1
        L2c:
            if (r2 < 0) goto L3c
            if (r6 == 0) goto L33
            java.util.ArrayList r5 = r4.f2705l
            goto L35
        L33:
            java.util.ArrayList r5 = r4.f2704k
        L35:
            java.lang.Object r5 = r5.get(r2)
            z0.u r5 = (z0.u) r5
            return r5
        L3c:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.m.n(android.view.View, boolean):z0.u");
    }

    public final m o() {
        a aVar = this.f2702i;
        return aVar != null ? aVar.o() : this;
    }

    public String[] q() {
        return null;
    }

    public final u r(View view, boolean z2) {
        a aVar = this.f2702i;
        if (aVar != null) {
            return aVar.r(view, z2);
        }
        return (u) ((i.f) (z2 ? this.f2700g : this.f2701h).f269a).get(view);
    }

    public boolean s(u uVar, u uVar2) {
        if (uVar != null && uVar2 != null) {
            String[] strArrQ = q();
            if (strArrQ != null) {
                for (String str : strArrQ) {
                    if (u(uVar, uVar2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = uVar.f2725a.keySet().iterator();
                while (it.hasNext()) {
                    if (u(uVar, uVar2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean t(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f2698e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f2699f;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final String toString() {
        return H("");
    }

    public final void v(m mVar, l lVar) {
        m mVar2 = this.f2712s;
        if (mVar2 != null) {
            mVar2.v(mVar, lVar);
        }
        ArrayList arrayList = this.f2713t;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f2713t.size();
        k[] kVarArr = this.f2706m;
        if (kVarArr == null) {
            kVarArr = new k[size];
        }
        this.f2706m = null;
        k[] kVarArr2 = (k[]) this.f2713t.toArray(kVarArr);
        for (int i2 = 0; i2 < size; i2++) {
            lVar.a(kVarArr2[i2], mVar);
            kVarArr2[i2] = null;
        }
        this.f2706m = kVarArr2;
    }

    public void w(View view) {
        if (this.f2711r) {
            return;
        }
        ArrayList arrayList = this.f2707n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f2708o);
        this.f2708o = f2692w;
        for (int i2 = size - 1; i2 >= 0; i2--) {
            Animator animator = animatorArr[i2];
            animatorArr[i2] = null;
            animator.pause();
        }
        this.f2708o = animatorArr;
        v(this, l.f2690d);
        this.f2710q = true;
    }

    public m x(k kVar) {
        m mVar;
        ArrayList arrayList = this.f2713t;
        if (arrayList != null) {
            if (!arrayList.remove(kVar) && (mVar = this.f2712s) != null) {
                mVar.x(kVar);
            }
            if (this.f2713t.size() == 0) {
                this.f2713t = null;
            }
        }
        return this;
    }

    public void y(View view) {
        if (this.f2710q) {
            if (!this.f2711r) {
                ArrayList arrayList = this.f2707n;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f2708o);
                this.f2708o = f2692w;
                for (int i2 = size - 1; i2 >= 0; i2--) {
                    Animator animator = animatorArr[i2];
                    animatorArr[i2] = null;
                    animator.resume();
                }
                this.f2708o = animatorArr;
                v(this, l.f2691e);
            }
            this.f2710q = false;
        }
    }

    public void z() {
        G();
        i.f fVarP = p();
        ArrayList arrayList = this.f2714u;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            Animator animator = (Animator) obj;
            if (fVarP.containsKey(animator)) {
                G();
                if (animator != null) {
                    animator.addListener(new t0(this, fVarP));
                    long j2 = this.c;
                    if (j2 >= 0) {
                        animator.setDuration(j2);
                    }
                    long j3 = this.f2696b;
                    if (j3 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j3);
                    }
                    TimeInterpolator timeInterpolator = this.f2697d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new f.b(4, this));
                    animator.start();
                }
            }
        }
        this.f2714u.clear();
        m();
    }

    public void B(t1.e eVar) {
    }

    public void f(u uVar) {
    }

    public void E() {
    }
}
