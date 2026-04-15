package f0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends WindowInsetsAnimation$Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f1303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f1304b;
    public ArrayList c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f1305d;

    public x0(e eVar) {
        super(0);
        this.f1305d = new HashMap();
        this.f1303a = eVar;
    }

    public final a1 a(WindowInsetsAnimation windowInsetsAnimation) {
        a1 a1Var = (a1) this.f1305d.get(windowInsetsAnimation);
        if (a1Var == null) {
            a1Var = new a1(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                a1Var.f1225a = new y0(windowInsetsAnimation);
            }
            this.f1305d.put(windowInsetsAnimation, a1Var);
        }
        return a1Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        ((View) this.f1303a.f1241e).setTranslationY(0.0f);
        this.f1305d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        e eVar = this.f1303a;
        View view = (View) eVar.f1241e;
        int[] iArr = (int[]) eVar.f1242f;
        view.getLocationOnScreen(iArr);
        eVar.c = iArr[1];
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.f1304b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationJ = w0.j(list.get(size));
            a1 a1VarA = a(windowInsetsAnimationJ);
            a1VarA.f1225a.d(windowInsetsAnimationJ.getFraction());
            this.c.add(a1VarA);
        }
        n1 n1VarD = n1.d(null, windowInsets);
        this.f1303a.a(n1VarD, this.f1304b);
        return n1VarD.c();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        a(windowInsetsAnimation);
        x.c cVarC = x.c.c(bounds.getLowerBound());
        x.c cVarC2 = x.c.c(bounds.getUpperBound());
        e eVar = this.f1303a;
        View view = (View) eVar.f1241e;
        int[] iArr = (int[]) eVar.f1242f;
        view.getLocationOnScreen(iArr);
        int i2 = eVar.c - iArr[1];
        eVar.f1240d = i2;
        view.setTranslationY(i2);
        w0.l();
        return w0.h(cVarC.d(), cVarC2.d());
    }
}
