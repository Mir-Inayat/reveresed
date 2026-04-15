package o;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f1788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f1789b;

    public static long a(f fVar, long j2) {
        o oVar = fVar.f1776d;
        ArrayList arrayList = fVar.f1783k;
        if (oVar instanceof j) {
            return j2;
        }
        int size = arrayList.size();
        long jMin = j2;
        for (int i2 = 0; i2 < size; i2++) {
            d dVar = (d) arrayList.get(i2);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f1776d != oVar) {
                    jMin = Math.min(jMin, a(fVar2, ((long) fVar2.f1778f) + j2));
                }
            }
        }
        f fVar3 = oVar.f1804i;
        f fVar4 = oVar.f1803h;
        if (fVar != fVar3) {
            return jMin;
        }
        long j3 = j2 - oVar.j();
        return Math.min(Math.min(jMin, a(fVar4, j3)), j3 - ((long) fVar4.f1778f));
    }

    public static long b(f fVar, long j2) {
        o oVar = fVar.f1776d;
        ArrayList arrayList = fVar.f1783k;
        if (oVar instanceof j) {
            return j2;
        }
        int size = arrayList.size();
        long jMax = j2;
        for (int i2 = 0; i2 < size; i2++) {
            d dVar = (d) arrayList.get(i2);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f1776d != oVar) {
                    jMax = Math.max(jMax, b(fVar2, ((long) fVar2.f1778f) + j2));
                }
            }
        }
        f fVar3 = oVar.f1803h;
        f fVar4 = oVar.f1804i;
        if (fVar != fVar3) {
            return jMax;
        }
        long j3 = oVar.j() + j2;
        return Math.max(Math.max(jMax, b(fVar4, j3)), j3 - ((long) fVar4.f1778f));
    }
}
