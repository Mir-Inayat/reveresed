package v0;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class n0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2384b;
    public OverScroller c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Interpolator f2385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2386e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2387f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2388g;

    public n0(RecyclerView recyclerView) {
        this.f2388g = recyclerView;
        m0.d dVar = RecyclerView.f380m0;
        this.f2385d = dVar;
        this.f2386e = false;
        this.f2387f = false;
        this.c = new OverScroller(recyclerView.getContext(), dVar);
    }

    public final void a() {
        if (this.f2386e) {
            this.f2387f = true;
            return;
        }
        RecyclerView recyclerView = this.f2388g;
        recyclerView.removeCallbacks(this);
        Field field = f0.m0.f1276a;
        recyclerView.postOnAnimation(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2;
        int i3;
        RecyclerView recyclerView = this.f2388g;
        int[] iArr = recyclerView.f395h0;
        if (recyclerView.f398j == null) {
            recyclerView.removeCallbacks(this);
            this.c.abortAnimation();
            return;
        }
        this.f2387f = false;
        this.f2386e = true;
        recyclerView.g();
        OverScroller overScroller = this.c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i4 = currX - this.f2383a;
            int i5 = currY - this.f2384b;
            this.f2383a = currX;
            this.f2384b = currY;
            int[] iArr2 = recyclerView.f395h0;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.j(i4, i5, 1, iArr2, null)) {
                i2 = i4 - iArr[0];
                i3 = i5 - iArr[1];
            } else {
                i2 = i4;
                i3 = i5;
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.f(i2, i3);
            }
            if (!recyclerView.f401l.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f395h0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.k(0, 0, i2, i3, null, 1, iArr3);
            int i6 = i2 - iArr[0];
            int i7 = i3 - iArr[1];
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i6 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i7 != 0));
            recyclerView.f398j.getClass();
            if (z) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i8 = i6 < 0 ? -currVelocity : i6 > 0 ? currVelocity : 0;
                    if (i7 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i7 <= 0) {
                        currVelocity = 0;
                    }
                    if (i8 < 0) {
                        recyclerView.m();
                        if (recyclerView.B.isFinished()) {
                            recyclerView.B.onAbsorb(-i8);
                        }
                    } else if (i8 > 0) {
                        recyclerView.n();
                        if (recyclerView.D.isFinished()) {
                            recyclerView.D.onAbsorb(i8);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.o();
                        if (recyclerView.C.isFinished()) {
                            recyclerView.C.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.l();
                        if (recyclerView.E.isFinished()) {
                            recyclerView.E.onAbsorb(currVelocity);
                        }
                    }
                    if (i8 != 0 || currVelocity != 0) {
                        Field field = f0.m0.f1276a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                o1.m mVar = recyclerView.V;
                mVar.getClass();
                mVar.c = 0;
            } else {
                a();
                m mVar2 = recyclerView.U;
                if (mVar2 != null) {
                    mVar2.a(recyclerView, 0, 0);
                }
            }
        }
        recyclerView.f398j.getClass();
        this.f2386e = false;
        if (!this.f2387f) {
            recyclerView.setScrollState(0);
            recyclerView.H(1);
        } else {
            recyclerView.removeCallbacks(this);
            Field field2 = f0.m0.f1276a;
            recyclerView.postOnAnimation(this);
        }
    }
}
