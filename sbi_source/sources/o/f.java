package o;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class f implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f1776d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1778f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1779g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f1774a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1775b = false;
    public boolean c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1777e = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1780h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g f1781i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1782j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f1783k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f1784l = new ArrayList();

    public f(o oVar) {
        this.f1776d = oVar;
    }

    @Override // o.d
    public final void a(d dVar) {
        ArrayList arrayList = this.f1784l;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            if (!((f) obj).f1782j) {
                return;
            }
        }
        this.c = true;
        o oVar = this.f1774a;
        if (oVar != null) {
            oVar.a(this);
        }
        if (this.f1775b) {
            this.f1776d.a(this);
            return;
        }
        int size2 = arrayList.size();
        f fVar = null;
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList.get(i4);
            i4++;
            f fVar2 = (f) obj2;
            if (!(fVar2 instanceof g)) {
                i2++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i2 == 1 && fVar.f1782j) {
            g gVar = this.f1781i;
            if (gVar != null) {
                if (!gVar.f1782j) {
                    return;
                } else {
                    this.f1778f = this.f1780h * gVar.f1779g;
                }
            }
            d(fVar.f1779g + this.f1778f);
        }
        o oVar2 = this.f1774a;
        if (oVar2 != null) {
            oVar2.a(this);
        }
    }

    public final void b(o oVar) {
        this.f1783k.add(oVar);
        if (this.f1782j) {
            oVar.a(oVar);
        }
    }

    public final void c() {
        this.f1784l.clear();
        this.f1783k.clear();
        this.f1782j = false;
        this.f1779g = 0;
        this.c = false;
        this.f1775b = false;
    }

    public void d(int i2) {
        if (this.f1782j) {
            return;
        }
        this.f1782j = true;
        this.f1779g = i2;
        ArrayList arrayList = this.f1783k;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            d dVar = (d) obj;
            dVar.a(dVar);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1776d.f1798b.f1641g0);
        sb.append(":");
        switch (this.f1777e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.f1782j ? Integer.valueOf(this.f1779g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f1784l.size());
        sb.append(":d=");
        sb.append(this.f1783k.size());
        sb.append(">");
        return sb.toString();
    }
}
