package e;

import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.view.menu.ActionMenuItemView;
import f.c1;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class a implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f846b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c1 f848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c1 f849f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f850g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f851h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f852i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f853j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ View f854k;

    public a(View view) {
        this.f852i = new int[2];
        this.f847d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f845a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f846b = tapTimeout;
        this.c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        c1 c1Var = this.f849f;
        View view = this.f847d;
        if (c1Var != null) {
            view.removeCallbacks(c1Var);
        }
        c1 c1Var2 = this.f848e;
        if (c1Var2 != null) {
            view.removeCallbacks(c1Var2);
        }
    }

    public final l b() {
        f.g gVar;
        switch (this.f853j) {
            case 0:
                b bVar = ((ActionMenuItemView) this.f854k).f11m;
                if (bVar == null || (gVar = ((f.h) bVar).f1024a.f1061s) == null) {
                    return null;
                }
                return gVar.a();
            default:
                f.g gVar2 = ((f.i) this.f854k).f1027d.f1060r;
                if (gVar2 == null) {
                    return null;
                }
                return gVar2.a();
        }
    }

    public final boolean c() {
        l lVarB;
        switch (this.f853j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f854k;
                i iVar = actionMenuItemView.f9k;
                return iVar != null && iVar.a(actionMenuItemView.f6h) && (lVarB = b()) != null && lVarB.g();
            default:
                ((f.i) this.f854k).f1027d.h();
                return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0124  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f850g = false;
        this.f851h = -1;
        c1 c1Var = this.f848e;
        if (c1Var != null) {
            this.f847d.removeCallbacks(c1Var);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(ActionMenuItemView actionMenuItemView) {
        this((View) actionMenuItemView);
        this.f853j = 0;
        this.f854k = actionMenuItemView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(f.i iVar, f.i iVar2) {
        this(iVar2);
        this.f853j = 1;
        this.f854k = iVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
