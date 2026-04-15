package n;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import o.n;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1622b;
    public boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f1623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1624e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f1625f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public l.g f1628i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashSet f1621a = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1626g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1627h = Integer.MIN_VALUE;

    public d(e eVar, int i2) {
        this.f1623d = eVar;
        this.f1624e = i2;
    }

    public final void a(d dVar, int i2) {
        b(dVar, i2, Integer.MIN_VALUE, false);
    }

    public final boolean b(d dVar, int i2, int i3, boolean z) {
        if (dVar == null) {
            j();
            return true;
        }
        if (!z && !i(dVar)) {
            return false;
        }
        this.f1625f = dVar;
        if (dVar.f1621a == null) {
            dVar.f1621a = new HashSet();
        }
        HashSet hashSet = this.f1625f.f1621a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f1626g = i2;
        this.f1627h = i3;
        return true;
    }

    public final void c(int i2, ArrayList arrayList, n nVar) {
        HashSet hashSet = this.f1621a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                o.h.b(((d) it.next()).f1623d, i2, arrayList, nVar);
            }
        }
    }

    public final int d() {
        if (this.c) {
            return this.f1622b;
        }
        return 0;
    }

    public final int e() {
        d dVar;
        if (this.f1623d.f1639f0 == 8) {
            return 0;
        }
        int i2 = this.f1627h;
        return (i2 == Integer.MIN_VALUE || (dVar = this.f1625f) == null || dVar.f1623d.f1639f0 != 8) ? this.f1626g : i2;
    }

    public final d f() {
        int i2 = this.f1624e;
        int iA = l.f.a(i2);
        e eVar = this.f1623d;
        switch (iA) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return eVar.J;
            case 2:
                return eVar.K;
            case 3:
                return eVar.H;
            case 4:
                return eVar.I;
            default:
                throw new AssertionError(c.a(i2));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f1621a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((d) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f1625f != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0063 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(n.d r11) {
        /*
            r10 = this;
            r0 = 0
            if (r11 != 0) goto L5
            goto L65
        L5:
            n.e r1 = r11.f1623d
            int r11 = r11.f1624e
            r2 = 6
            int r3 = r10.f1624e
            r4 = 1
            if (r11 != r3) goto L1c
            if (r3 != r2) goto L63
            boolean r11 = r1.D
            if (r11 == 0) goto L65
            n.e r11 = r10.f1623d
            boolean r11 = r11.D
            if (r11 != 0) goto L63
            goto L65
        L1c:
            int r5 = l.f.a(r3)
            r6 = 8
            r7 = 9
            r8 = 4
            r9 = 2
            switch(r5) {
                case 0: goto L65;
                case 1: goto L53;
                case 2: goto L3f;
                case 3: goto L53;
                case 4: goto L3f;
                case 5: goto L3a;
                case 6: goto L33;
                case 7: goto L65;
                case 8: goto L65;
                default: goto L29;
            }
        L29:
            java.lang.AssertionError r11 = new java.lang.AssertionError
            java.lang.String r0 = n.c.a(r3)
            r11.<init>(r0)
            throw r11
        L33:
            if (r11 == r2) goto L65
            if (r11 == r6) goto L65
            if (r11 == r7) goto L65
            goto L63
        L3a:
            if (r11 == r9) goto L65
            if (r11 != r8) goto L63
            goto L65
        L3f:
            r2 = 3
            if (r11 == r2) goto L48
            r2 = 5
            if (r11 != r2) goto L46
            goto L48
        L46:
            r2 = r0
            goto L49
        L48:
            r2 = r4
        L49:
            boolean r1 = r1 instanceof n.i
            if (r1 == 0) goto L52
            if (r2 != 0) goto L63
            if (r11 != r7) goto L65
            goto L63
        L52:
            return r2
        L53:
            if (r11 == r9) goto L5a
            if (r11 != r8) goto L58
            goto L5a
        L58:
            r2 = r0
            goto L5b
        L5a:
            r2 = r4
        L5b:
            boolean r1 = r1 instanceof n.i
            if (r1 == 0) goto L64
            if (r2 != 0) goto L63
            if (r11 != r6) goto L65
        L63:
            return r4
        L64:
            return r2
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n.d.i(n.d):boolean");
    }

    public final void j() {
        HashSet hashSet;
        d dVar = this.f1625f;
        if (dVar != null && (hashSet = dVar.f1621a) != null) {
            hashSet.remove(this);
            if (this.f1625f.f1621a.size() == 0) {
                this.f1625f.f1621a = null;
            }
        }
        this.f1621a = null;
        this.f1625f = null;
        this.f1626g = 0;
        this.f1627h = Integer.MIN_VALUE;
        this.c = false;
        this.f1622b = 0;
    }

    public final void k() {
        l.g gVar = this.f1628i;
        if (gVar == null) {
            this.f1628i = new l.g(1);
        } else {
            gVar.c();
        }
    }

    public final void l(int i2) {
        this.f1622b = i2;
        this.c = true;
    }

    public final String toString() {
        return this.f1623d.f1641g0 + ":" + c.a(this.f1624e);
    }
}
