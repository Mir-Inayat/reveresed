package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f270b;
    public final Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f271d;

    public y(int i2) {
        switch (i2) {
            case 2:
                this.f269a = new i.f(0);
                this.f270b = new SparseArray();
                this.c = new i.h();
                this.f271d = new i.f(0);
                break;
            default:
                this.f269a = new e0.b(10);
                this.f270b = new i.k(0);
                this.c = new ArrayList();
                this.f271d = new HashSet();
                break;
        }
    }

    public void a(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((i.k) this.f270b).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                a(arrayList2.get(i2), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public y(Typeface typeface, o0.b bVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        this.f271d = typeface;
        this.f269a = bVar;
        this.c = new x(1024);
        int iA = bVar.a(6);
        if (iA != 0) {
            int i6 = iA + bVar.f1806a;
            i2 = bVar.f1807b.getInt(bVar.f1807b.getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        this.f270b = new char[i2 * 2];
        int iA2 = bVar.a(6);
        if (iA2 != 0) {
            int i7 = iA2 + bVar.f1806a;
            i3 = bVar.f1807b.getInt(bVar.f1807b.getInt(i7) + i7);
        } else {
            i3 = 0;
        }
        for (int i8 = 0; i8 < i3; i8++) {
            b0 b0Var = new b0(this, i8);
            o0.a aVarB = b0Var.b();
            int iA3 = aVarB.a(4);
            Character.toChars(iA3 != 0 ? aVarB.f1807b.getInt(iA3 + aVarB.f1806a) : 0, (char[]) this.f270b, i8 * 2);
            o0.a aVarB2 = b0Var.b();
            int iA4 = aVarB2.a(16);
            if (iA4 != 0) {
                int i9 = iA4 + aVarB2.f1806a;
                i4 = aVarB2.f1807b.getInt(aVarB2.f1807b.getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            a0.a.f(i4 > 0, "invalid metadata codepoint length");
            x xVar = (x) this.c;
            o0.a aVarB3 = b0Var.b();
            int iA5 = aVarB3.a(16);
            if (iA5 != 0) {
                int i10 = iA5 + aVarB3.f1806a;
                i5 = aVarB3.f1807b.getInt(aVarB3.f1807b.getInt(i10) + i10);
            } else {
                i5 = 0;
            }
            xVar.a(b0Var, 0, i5 - 1);
        }
    }
}
