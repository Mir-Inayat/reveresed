package v0;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class k extends a0 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int[] f2340x = {R.attr.state_pressed};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f2341y = new int[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StateListDrawable f2343b;
    public final Drawable c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final StateListDrawable f2346f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Drawable f2347g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f2348h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f2349i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f2350j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f2351k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final RecyclerView f2354n;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ValueAnimator f2361u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f2362v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final androidx.fragment.app.b f2363w;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2352l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f2353m = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f2355o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f2356p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f2357q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f2358r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int[] f2359s = new int[2];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int[] f2360t = new int[2];

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public k(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i2, int i3, int i4) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f2361u = valueAnimatorOfFloat;
        this.f2362v = 0;
        androidx.fragment.app.b bVar = new androidx.fragment.app.b(8, this);
        this.f2363w = bVar;
        i iVar = new i();
        this.f2343b = stateListDrawable;
        this.c = drawable;
        this.f2346f = stateListDrawable2;
        this.f2347g = drawable2;
        this.f2344d = Math.max(i2, stateListDrawable.getIntrinsicWidth());
        this.f2345e = Math.max(i2, drawable.getIntrinsicWidth());
        this.f2348h = Math.max(i2, stateListDrawable2.getIntrinsicWidth());
        this.f2349i = Math.max(i2, drawable2.getIntrinsicWidth());
        this.f2342a = i4;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new j(this));
        valueAnimatorOfFloat.addUpdateListener(new h1.a(1 == true ? 1 : 0, this));
        RecyclerView recyclerView2 = this.f2354n;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.f401l;
            c0 c0Var = recyclerView2.f398j;
            if (c0Var != null) {
                c0Var.b("Cannot remove item decoration during a scroll  or layout");
            }
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.v();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f2354n;
            recyclerView3.f402m.remove(this);
            if (recyclerView3.f403n == this) {
                recyclerView3.f403n = null;
            }
            ArrayList arrayList2 = this.f2354n.f384b0;
            if (arrayList2 != null) {
                arrayList2.remove(iVar);
            }
            this.f2354n.removeCallbacks(bVar);
        }
        this.f2354n = recyclerView;
        ArrayList arrayList3 = recyclerView.f401l;
        c0 c0Var2 = recyclerView.f398j;
        if (c0Var2 != null) {
            c0Var2.b("Cannot add item decoration during a scroll  or layout");
        }
        if (arrayList3.isEmpty()) {
            recyclerView.setWillNotDraw(false);
        }
        arrayList3.add(this);
        recyclerView.v();
        recyclerView.requestLayout();
        this.f2354n.f402m.add(this);
        RecyclerView recyclerView4 = this.f2354n;
        if (recyclerView4.f384b0 == null) {
            recyclerView4.f384b0 = new ArrayList();
        }
        recyclerView4.f384b0.add(iVar);
    }

    public static int e(float f3, float f4, int[] iArr, int i2, int i3, int i4) {
        int i5 = iArr[1] - iArr[0];
        if (i5 != 0) {
            int i6 = i2 - i4;
            int i7 = (int) (((f4 - f3) / i5) * i6);
            int i8 = i3 + i7;
            if (i8 < i6 && i8 >= 0) {
                return i7;
            }
        }
        return 0;
    }

    @Override // v0.a0
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int i2 = this.f2352l;
        RecyclerView recyclerView2 = this.f2354n;
        if (i2 != recyclerView2.getWidth() || this.f2353m != recyclerView2.getHeight()) {
            this.f2352l = recyclerView2.getWidth();
            this.f2353m = recyclerView2.getHeight();
            f(0);
            return;
        }
        if (this.f2362v != 0) {
            if (this.f2355o) {
                int i3 = this.f2352l;
                int i4 = this.f2344d;
                int i5 = i3 - i4;
                int i6 = 0 - (0 / 2);
                StateListDrawable stateListDrawable = this.f2343b;
                stateListDrawable.setBounds(0, 0, i4, 0);
                int i7 = this.f2345e;
                int i8 = this.f2353m;
                Drawable drawable = this.c;
                drawable.setBounds(0, 0, i7, i8);
                Field field = f0.m0.f1276a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i4, i6);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i4, -i6);
                } else {
                    canvas.translate(i5, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i6);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i5, -i6);
                }
            }
            if (this.f2356p) {
                int i9 = this.f2353m;
                int i10 = this.f2348h;
                int i11 = i9 - i10;
                StateListDrawable stateListDrawable2 = this.f2346f;
                stateListDrawable2.setBounds(0, 0, 0, i10);
                int i12 = this.f2352l;
                int i13 = this.f2349i;
                Drawable drawable2 = this.f2347g;
                drawable2.setBounds(0, 0, i12, i13);
                canvas.translate(0.0f, i11);
                drawable2.draw(canvas);
                canvas.translate(0 - (0 / 2), 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-r3, -i11);
            }
        }
    }

    public final boolean c(float f3, float f4) {
        return f4 >= ((float) (this.f2353m - this.f2348h)) && f3 >= ((float) (0 - (0 / 2))) && f3 <= ((float) ((0 / 2) + 0));
    }

    public final boolean d(float f3, float f4) {
        Field field = f0.m0.f1276a;
        int layoutDirection = this.f2354n.getLayoutDirection();
        int i2 = this.f2344d;
        if (layoutDirection != 1 ? f3 >= this.f2352l - i2 : f3 <= i2) {
            int i3 = 0 / 2;
            if (f4 >= 0 - i3 && f4 <= i3 + 0) {
                return true;
            }
        }
        return false;
    }

    public final void f(int i2) {
        androidx.fragment.app.b bVar = this.f2363w;
        StateListDrawable stateListDrawable = this.f2343b;
        if (i2 == 2 && this.f2357q != 2) {
            stateListDrawable.setState(f2340x);
            this.f2354n.removeCallbacks(bVar);
        }
        if (i2 == 0) {
            this.f2354n.invalidate();
        } else {
            g();
        }
        if (this.f2357q == 2 && i2 != 2) {
            stateListDrawable.setState(f2341y);
            this.f2354n.removeCallbacks(bVar);
            this.f2354n.postDelayed(bVar, 1200);
        } else if (i2 == 1) {
            this.f2354n.removeCallbacks(bVar);
            this.f2354n.postDelayed(bVar, 1500);
        }
        this.f2357q = i2;
    }

    public final void g() {
        int i2 = this.f2362v;
        ValueAnimator valueAnimator = this.f2361u;
        if (i2 != 0) {
            if (i2 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f2362v = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
