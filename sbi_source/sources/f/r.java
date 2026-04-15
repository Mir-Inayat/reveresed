package f;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f1154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorStateList f1155b = null;
    public PorterDuff.Mode c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1156d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1157e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1158f;

    public r(q qVar) {
        this.f1154a = qVar;
    }

    public final void a() {
        q qVar = this.f1154a;
        Drawable drawableA = k0.c.a(qVar);
        if (drawableA != null) {
            if (this.f1156d || this.f1157e) {
                Drawable drawableMutate = drawableA.mutate();
                if (this.f1156d) {
                    y.a.h(drawableMutate, this.f1155b);
                }
                if (this.f1157e) {
                    y.a.i(drawableMutate, this.c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(qVar.getDrawableState());
                }
                qVar.setButtonDrawable(drawableMutate);
            }
        }
    }
}
