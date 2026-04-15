package z0;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class a extends m {
    public ArrayList A;
    public boolean B;
    public int C;
    public boolean D;
    public int E;

    @Override // z0.m
    public final void A(long j2) {
        ArrayList arrayList;
        this.c = j2;
        if (j2 < 0 || (arrayList = this.A) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((m) this.A.get(i2)).A(j2);
        }
    }

    @Override // z0.m
    public final void B(t1.e eVar) {
        this.E |= 8;
        int size = this.A.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((m) this.A.get(i2)).B(eVar);
        }
    }

    @Override // z0.m
    public final void C(TimeInterpolator timeInterpolator) {
        this.E |= 1;
        ArrayList arrayList = this.A;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((m) this.A.get(i2)).C(timeInterpolator);
            }
        }
        this.f2697d = timeInterpolator;
    }

    @Override // z0.m
    public final void D(t1.g gVar) {
        super.D(gVar);
        this.E |= 4;
        if (this.A != null) {
            for (int i2 = 0; i2 < this.A.size(); i2++) {
                ((m) this.A.get(i2)).D(gVar);
            }
        }
    }

    @Override // z0.m
    public final void E() {
        this.E |= 2;
        int size = this.A.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((m) this.A.get(i2)).E();
        }
    }

    @Override // z0.m
    public final void F(long j2) {
        this.f2696b = j2;
    }

    @Override // z0.m
    public final String H(String str) {
        String strH = super.H(str);
        for (int i2 = 0; i2 < this.A.size(); i2++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strH);
            sb.append("\n");
            sb.append(((m) this.A.get(i2)).H(str + "  "));
            strH = sb.toString();
        }
        return strH;
    }

    public final void I(m mVar) {
        this.A.add(mVar);
        mVar.f2702i = this;
        long j2 = this.c;
        if (j2 >= 0) {
            mVar.A(j2);
        }
        if ((this.E & 1) != 0) {
            mVar.C(this.f2697d);
        }
        if ((this.E & 2) != 0) {
            mVar.E();
        }
        if ((this.E & 4) != 0) {
            mVar.D(this.f2715v);
        }
        if ((this.E & 8) != 0) {
            mVar.B(null);
        }
    }

    @Override // z0.m
    public final void c() {
        super.c();
        int size = this.A.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((m) this.A.get(i2)).c();
        }
    }

    @Override // z0.m
    public final void d(u uVar) {
        View view = uVar.f2726b;
        if (t(view)) {
            ArrayList arrayList = this.A;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                m mVar = (m) obj;
                if (mVar.t(view)) {
                    mVar.d(uVar);
                    uVar.c.add(mVar);
                }
            }
        }
    }

    @Override // z0.m
    public final void f(u uVar) {
        int size = this.A.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((m) this.A.get(i2)).f(uVar);
        }
    }

    @Override // z0.m
    public final void g(u uVar) {
        View view = uVar.f2726b;
        if (t(view)) {
            ArrayList arrayList = this.A;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                m mVar = (m) obj;
                if (mVar.t(view)) {
                    mVar.g(uVar);
                    uVar.c.add(mVar);
                }
            }
        }
    }

    @Override // z0.m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final m clone() {
        a aVar = (a) super.clone();
        aVar.A = new ArrayList();
        int size = this.A.size();
        for (int i2 = 0; i2 < size; i2++) {
            m mVarClone = ((m) this.A.get(i2)).clone();
            aVar.A.add(mVarClone);
            mVarClone.f2702i = aVar;
        }
        return aVar;
    }

    @Override // z0.m
    public final void l(ViewGroup viewGroup, androidx.emoji2.text.y yVar, androidx.emoji2.text.y yVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j2 = this.f2696b;
        int size = this.A.size();
        for (int i2 = 0; i2 < size; i2++) {
            m mVar = (m) this.A.get(i2);
            if (j2 > 0 && (this.B || i2 == 0)) {
                long j3 = mVar.f2696b;
                if (j3 > 0) {
                    mVar.F(j3 + j2);
                } else {
                    mVar.F(j2);
                }
            }
            mVar.l(viewGroup, yVar, yVar2, arrayList, arrayList2);
        }
    }

    @Override // z0.m
    public final void w(View view) {
        super.w(view);
        int size = this.A.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((m) this.A.get(i2)).w(view);
        }
    }

    @Override // z0.m
    public final m x(k kVar) {
        super.x(kVar);
        return this;
    }

    @Override // z0.m
    public final void y(View view) {
        super.y(view);
        int size = this.A.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((m) this.A.get(i2)).y(view);
        }
    }

    @Override // z0.m
    public final void z() {
        if (this.A.isEmpty()) {
            G();
            m();
            return;
        }
        r rVar = new r();
        rVar.f2723b = this;
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((m) obj).a(rVar);
        }
        this.C = this.A.size();
        if (this.B) {
            ArrayList arrayList2 = this.A;
            int size2 = arrayList2.size();
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                ((m) obj2).z();
            }
            return;
        }
        for (int i4 = 1; i4 < this.A.size(); i4++) {
            ((m) this.A.get(i4 - 1)).a(new r((m) this.A.get(i4)));
        }
        m mVar = (m) this.A.get(0);
        if (mVar != null) {
            mVar.z();
        }
    }
}
