package n0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import androidx.emoji2.text.q;
import java.util.ArrayList;
import t1.z;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final d f1725m = new d(1);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final d f1726n = new d(2);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final d f1727o = new d(3);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final d f1728p = new d(4);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final d f1729q = new d(5);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final d f1730r = new d(0);
    public final z c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a0.a f1733d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f1736g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f f1739j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f1740k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1741l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f1731a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f1732b = Float.MAX_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1734e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f1735f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f1737h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f1738i = new ArrayList();

    public e(z zVar, a0.a aVar) {
        this.c = zVar;
        this.f1733d = aVar;
        if (aVar == f1727o || aVar == f1728p || aVar == f1729q) {
            this.f1736g = 0.1f;
        } else if (aVar == f1730r) {
            this.f1736g = 0.00390625f;
        } else if (aVar == f1725m || aVar == f1726n) {
            this.f1736g = 0.002f;
        } else {
            this.f1736g = 1.0f;
        }
        this.f1739j = null;
        this.f1740k = Float.MAX_VALUE;
        this.f1741l = false;
    }

    public static c b() {
        ThreadLocal threadLocal = c.f1716i;
        if (threadLocal.get() == null) {
            threadLocal.set(new c(new q(7)));
        }
        return (c) threadLocal.get();
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, n0.a] */
    public final void a(float f3) {
        if (this.f1734e) {
            this.f1740k = f3;
            return;
        }
        if (this.f1739j == null) {
            this.f1739j = new f(f3);
        }
        f fVar = this.f1739j;
        double d3 = f3;
        fVar.f1749i = d3;
        double d4 = (float) d3;
        if (d4 > Float.MAX_VALUE) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d4 < -3.4028235E38f) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double dAbs = Math.abs(this.f1736g * 0.75f);
        fVar.f1744d = dAbs;
        fVar.f1745e = dAbs * 62.5d;
        q qVar = b().f1720e;
        qVar.getClass();
        if (Thread.currentThread() != ((Looper) qVar.c).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z = this.f1734e;
        if (z || z) {
            return;
        }
        this.f1734e = true;
        float fZ = this.f1733d.z(this.c);
        this.f1732b = fZ;
        if (fZ > Float.MAX_VALUE || fZ < -3.4028235E38f) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        c cVarB = b();
        ArrayList arrayList = cVarB.f1718b;
        if (arrayList.size() == 0) {
            ((Choreographer) cVarB.f1720e.f246b).postFrameCallback(new b(cVarB.f1719d, 0));
            if (Build.VERSION.SDK_INT >= 33) {
                cVarB.f1722g = ValueAnimator.getDurationScale();
                if (cVarB.f1723h == null) {
                    cVarB.f1723h = new q(6, cVarB);
                }
                final q qVar2 = cVarB.f1723h;
                if (((a) qVar2.f246b) == null) {
                    ?? r12 = new ValueAnimator.DurationScaleChangeListener() { // from class: n0.a
                        @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                        public final void onChanged(float f4) {
                            ((c) qVar2.c).f1722g = f4;
                        }
                    };
                    qVar2.f246b = r12;
                    ValueAnimator.registerDurationScaleChangeListener(r12);
                }
            }
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public final void c(float f3) {
        this.f1733d.j0(this.c, f3);
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f1738i;
            if (i2 >= arrayList.size()) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                return;
            }
            if (arrayList.get(i2) != null) {
                arrayList.get(i2).getClass();
                throw new ClassCastException();
            }
            i2++;
        }
    }

    public final void d() {
        if (this.f1739j.f1743b <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        q qVar = b().f1720e;
        qVar.getClass();
        if (Thread.currentThread() != ((Looper) qVar.c).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f1734e) {
            this.f1741l = true;
        }
    }
}
