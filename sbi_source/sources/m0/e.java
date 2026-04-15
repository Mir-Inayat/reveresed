package m0;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import f0.m0;
import java.lang.reflect.Field;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final d f1580v = new d(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1582b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float[] f1583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f1584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float[] f1585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f1586g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f1587h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f1588i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f1589j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1590k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public VelocityTracker f1591l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f1592m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f1593n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f1594o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final OverScroller f1595p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a0.a f1596q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public View f1597r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f1598s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CoordinatorLayout f1599t;
    public int c = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final androidx.fragment.app.b f1600u = new androidx.fragment.app.b(7, this);

    public e(Context context, CoordinatorLayout coordinatorLayout, a0.a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f1599t = coordinatorLayout;
        this.f1596q = aVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1594o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f1582b = viewConfiguration.getScaledTouchSlop();
        this.f1592m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1593n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1595p = new OverScroller(context, f1580v);
    }

    public final void a() {
        this.c = -1;
        float[] fArr = this.f1583d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f1584e, 0.0f);
            Arrays.fill(this.f1585f, 0.0f);
            Arrays.fill(this.f1586g, 0.0f);
            Arrays.fill(this.f1587h, 0);
            Arrays.fill(this.f1588i, 0);
            Arrays.fill(this.f1589j, 0);
            this.f1590k = 0;
        }
        VelocityTracker velocityTracker = this.f1591l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1591l = null;
        }
    }

    public final void b(View view, int i2) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.f1599t;
        if (parent != coordinatorLayout) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + coordinatorLayout + ")");
        }
        this.f1597r = view;
        this.c = i2;
        this.f1596q.S(view, i2);
        n(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(android.view.View r4, float r5, float r6) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            goto L45
        L4:
            a0.a r1 = r3.f1596q
            int r4 = r1.B(r4)
            r2 = 1
            if (r4 <= 0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r0
        L10:
            int r1 = r1.D()
            if (r1 <= 0) goto L18
            r1 = r2
            goto L19
        L18:
            r1 = r0
        L19:
            if (r4 == 0) goto L29
            if (r1 == 0) goto L29
            float r5 = r5 * r5
            float r6 = r6 * r6
            float r6 = r6 + r5
            int r4 = r3.f1582b
            int r4 = r4 * r4
            float r4 = (float) r4
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 <= 0) goto L45
            goto L44
        L29:
            if (r4 == 0) goto L37
            float r4 = java.lang.Math.abs(r5)
            int r5 = r3.f1582b
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L45
            goto L44
        L37:
            if (r1 == 0) goto L45
            float r4 = java.lang.Math.abs(r6)
            int r5 = r3.f1582b
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L45
        L44:
            return r2
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.e.c(android.view.View, float, float):boolean");
    }

    public final void d(int i2) {
        float[] fArr = this.f1583d;
        if (fArr != null) {
            int i3 = this.f1590k;
            int i4 = 1 << i2;
            if ((i3 & i4) != 0) {
                fArr[i2] = 0.0f;
                this.f1584e[i2] = 0.0f;
                this.f1585f[i2] = 0.0f;
                this.f1586g[i2] = 0.0f;
                this.f1587h[i2] = 0;
                this.f1588i[i2] = 0;
                this.f1589j[i2] = 0;
                this.f1590k = (~i4) & i3;
            }
        }
    }

    public final int e(int i2, int i3, int i4) {
        if (i2 == 0) {
            return 0;
        }
        float width = this.f1599t.getWidth() / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i2) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int iAbs = Math.abs(i3);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i2) / i4) + 1.0f) * 256.0f), 600);
    }

    public final boolean f() {
        if (this.f1581a == 2) {
            OverScroller overScroller = this.f1595p;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f1597r.getLeft();
            int top = currY - this.f1597r.getTop();
            if (left != 0) {
                View view = this.f1597r;
                Field field = m0.f1276a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f1597r;
                Field field2 = m0.f1276a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f1596q.U(this.f1597r, currX, currY);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.f1599t.post(this.f1600u);
            }
        }
        return this.f1581a == 2;
    }

    public final View g(int i2, int i3) {
        CoordinatorLayout coordinatorLayout = this.f1599t;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f1596q.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean h(int i2, int i3, int i4, int i5) {
        float f3;
        float f4;
        float f5;
        float f6;
        int left = this.f1597r.getLeft();
        int top = this.f1597r.getTop();
        int i6 = i2 - left;
        int i7 = i3 - top;
        OverScroller overScroller = this.f1595p;
        if (i6 == 0 && i7 == 0) {
            overScroller.abortAnimation();
            n(0);
            return false;
        }
        View view = this.f1597r;
        int i8 = (int) this.f1593n;
        int i9 = (int) this.f1592m;
        int iAbs = Math.abs(i4);
        if (iAbs < i8) {
            i4 = 0;
        } else if (iAbs > i9) {
            i4 = i4 > 0 ? i9 : -i9;
        }
        int iAbs2 = Math.abs(i5);
        if (iAbs2 < i8) {
            i5 = 0;
        } else if (iAbs2 > i9) {
            i5 = i5 > 0 ? i9 : -i9;
        }
        int iAbs3 = Math.abs(i6);
        int iAbs4 = Math.abs(i7);
        int iAbs5 = Math.abs(i4);
        int iAbs6 = Math.abs(i5);
        int i10 = iAbs5 + iAbs6;
        int i11 = iAbs3 + iAbs4;
        if (i4 != 0) {
            f3 = iAbs5;
            f4 = i10;
        } else {
            f3 = iAbs3;
            f4 = i11;
        }
        float f7 = f3 / f4;
        if (i5 != 0) {
            f5 = iAbs6;
            f6 = i10;
        } else {
            f5 = iAbs4;
            f6 = i11;
        }
        float f8 = f5 / f6;
        a0.a aVar = this.f1596q;
        overScroller.startScroll(left, top, i6, i7, (int) ((e(i7, i5, aVar.D()) * f8) + (e(i6, i4, aVar.B(view)) * f7)));
        n(2);
        return true;
    }

    public final boolean i(int i2) {
        if ((this.f1590k & (1 << i2)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i2 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void j(MotionEvent motionEvent) {
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f1591l == null) {
            this.f1591l = VelocityTracker.obtain();
        }
        this.f1591l.addMovement(motionEvent);
        int i3 = 0;
        if (actionMasked == 0) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewG = g((int) x2, (int) y2);
            l(x2, y2, pointerId);
            q(viewG, pointerId);
            int i4 = this.f1587h[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.f1581a == 1) {
                k();
            }
            a();
            return;
        }
        a0.a aVar = this.f1596q;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f1581a == 1) {
                    this.f1598s = true;
                    aVar.V(this.f1597r, 0.0f, 0.0f);
                    this.f1598s = false;
                    if (this.f1581a == 1) {
                        n(0);
                    }
                }
                a();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x3 = motionEvent.getX(actionIndex);
                float y3 = motionEvent.getY(actionIndex);
                l(x3, y3, pointerId2);
                if (this.f1581a == 0) {
                    q(g((int) x3, (int) y3), pointerId2);
                    int i5 = this.f1587h[pointerId2];
                    return;
                }
                int i6 = (int) x3;
                int i7 = (int) y3;
                View view = this.f1597r;
                if (view != null && i6 >= view.getLeft() && i6 < view.getRight() && i7 >= view.getTop() && i7 < view.getBottom()) {
                    i3 = 1;
                }
                if (i3 != 0) {
                    q(this.f1597r, pointerId2);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f1581a == 1 && pointerId3 == this.c) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i3 >= pointerCount) {
                        i2 = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i3);
                    if (pointerId4 != this.c) {
                        View viewG2 = g((int) motionEvent.getX(i3), (int) motionEvent.getY(i3));
                        View view2 = this.f1597r;
                        if (viewG2 == view2 && q(view2, pointerId4)) {
                            i2 = this.c;
                            break;
                        }
                    }
                    i3++;
                }
                if (i2 == -1) {
                    k();
                }
            }
            d(pointerId3);
            return;
        }
        if (this.f1581a == 1) {
            if (i(this.c)) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.c);
                float x4 = motionEvent.getX(iFindPointerIndex);
                float y4 = motionEvent.getY(iFindPointerIndex);
                float[] fArr = this.f1585f;
                int i8 = this.c;
                int i9 = (int) (x4 - fArr[i8]);
                int i10 = (int) (y4 - this.f1586g[i8]);
                int left = this.f1597r.getLeft() + i9;
                int top = this.f1597r.getTop() + i10;
                int left2 = this.f1597r.getLeft();
                int top2 = this.f1597r.getTop();
                if (i9 != 0) {
                    left = aVar.j(this.f1597r, left);
                    Field field = m0.f1276a;
                    this.f1597r.offsetLeftAndRight(left - left2);
                }
                if (i10 != 0) {
                    top = aVar.k(this.f1597r, top);
                    Field field2 = m0.f1276a;
                    this.f1597r.offsetTopAndBottom(top - top2);
                }
                if (i9 != 0 || i10 != 0) {
                    aVar.U(this.f1597r, left, top);
                }
                m(motionEvent);
                return;
            }
            return;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        while (i3 < pointerCount2) {
            int pointerId5 = motionEvent.getPointerId(i3);
            if (i(pointerId5)) {
                float x5 = motionEvent.getX(i3);
                float y5 = motionEvent.getY(i3);
                float f3 = x5 - this.f1583d[pointerId5];
                float f4 = y5 - this.f1584e[pointerId5];
                Math.abs(f3);
                Math.abs(f4);
                int i11 = this.f1587h[pointerId5];
                Math.abs(f4);
                Math.abs(f3);
                int i12 = this.f1587h[pointerId5];
                Math.abs(f3);
                Math.abs(f4);
                int i13 = this.f1587h[pointerId5];
                Math.abs(f4);
                Math.abs(f3);
                int i14 = this.f1587h[pointerId5];
                if (this.f1581a != 1) {
                    View viewG3 = g((int) x5, (int) y5);
                    if (c(viewG3, f3, f4) && q(viewG3, pointerId5)) {
                        break;
                    }
                } else {
                    break;
                }
            }
            i3++;
        }
        m(motionEvent);
    }

    public final void k() {
        VelocityTracker velocityTracker = this.f1591l;
        float f3 = this.f1592m;
        velocityTracker.computeCurrentVelocity(1000, f3);
        float xVelocity = this.f1591l.getXVelocity(this.c);
        float fAbs = Math.abs(xVelocity);
        float f4 = this.f1593n;
        if (fAbs < f4) {
            xVelocity = 0.0f;
        } else if (fAbs > f3) {
            xVelocity = xVelocity > 0.0f ? f3 : -f3;
        }
        float yVelocity = this.f1591l.getYVelocity(this.c);
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 < f4) {
            f3 = 0.0f;
        } else if (fAbs2 <= f3) {
            f3 = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f3 = -f3;
        }
        this.f1598s = true;
        this.f1596q.V(this.f1597r, xVelocity, f3);
        this.f1598s = false;
        if (this.f1581a == 1) {
            n(0);
        }
    }

    public final void l(float f3, float f4, int i2) {
        float[] fArr = this.f1583d;
        if (fArr == null || fArr.length <= i2) {
            int i3 = i2 + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f1584e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f1585f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f1586g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f1587h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f1588i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f1589j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f1583d = fArr2;
            this.f1584e = fArr3;
            this.f1585f = fArr4;
            this.f1586g = fArr5;
            this.f1587h = iArr;
            this.f1588i = iArr2;
            this.f1589j = iArr3;
        }
        float[] fArr9 = this.f1583d;
        this.f1585f[i2] = f3;
        fArr9[i2] = f3;
        float[] fArr10 = this.f1584e;
        this.f1586g[i2] = f4;
        fArr10[i2] = f4;
        int[] iArr7 = this.f1587h;
        int i4 = (int) f3;
        int i5 = (int) f4;
        CoordinatorLayout coordinatorLayout = this.f1599t;
        int left = coordinatorLayout.getLeft();
        int i6 = this.f1594o;
        int i7 = i4 < left + i6 ? 1 : 0;
        if (i5 < coordinatorLayout.getTop() + i6) {
            i7 |= 4;
        }
        if (i4 > coordinatorLayout.getRight() - i6) {
            i7 |= 2;
        }
        if (i5 > coordinatorLayout.getBottom() - i6) {
            i7 |= 8;
        }
        iArr7[i2] = i7;
        this.f1590k |= 1 << i2;
    }

    public final void m(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if (i(pointerId)) {
                float x2 = motionEvent.getX(i2);
                float y2 = motionEvent.getY(i2);
                this.f1585f[pointerId] = x2;
                this.f1586g[pointerId] = y2;
            }
        }
    }

    public final void n(int i2) {
        this.f1599t.removeCallbacks(this.f1600u);
        if (this.f1581a != i2) {
            this.f1581a = i2;
            this.f1596q.T(i2);
            if (this.f1581a == 0) {
                this.f1597r = null;
            }
        }
    }

    public final boolean o(int i2, int i3) {
        if (this.f1598s) {
            return h(i2, i3, (int) this.f1591l.getXVelocity(this.c), (int) this.f1591l.getYVelocity(this.c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.e.p(android.view.MotionEvent):boolean");
    }

    public final boolean q(View view, int i2) {
        if (view == this.f1597r && this.c == i2) {
            return true;
        }
        if (view == null || !this.f1596q.k0(view, i2)) {
            return false;
        }
        this.c = i2;
        b(view, i2);
        return true;
    }
}
