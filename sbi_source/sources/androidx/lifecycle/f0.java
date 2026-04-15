package androidx.lifecycle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j0 f328a;

    public f0(j0 j0Var) {
        this.f328a = j0Var;
    }

    public final Object a() {
        ArrayList arrayList = new ArrayList();
        d2.d.f844a.getClass();
        Class clsA = new d2.b(h0.class).a();
        d2.c.c(clsA, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        arrayList.add(new s0.c(clsA));
        s0.c[] cVarArr = (s0.c[]) arrayList.toArray(new s0.c[0]);
        d2.c.e((s0.c[]) Arrays.copyOf(cVarArr, cVarArr.length), "initializers");
        j0 j0Var = this.f328a;
        e0 e0VarC = j0Var.c();
        if (j0Var instanceof h) {
            ((h) j0Var).a();
            throw null;
        }
        s0.a aVar = s0.a.f2102b;
        d2.c.e(e0VarC, "store");
        e0VarC.getClass();
        d2.c.e(aVar, "defaultCreationExtras");
        throw null;
    }

    public final String toString() {
        d2.d.f844a.getClass();
        String string = getClass().getGenericInterfaces()[0].toString();
        if (string.startsWith("kotlin.jvm.functions.")) {
            string = string.substring(21);
        }
        d2.c.d(string, "renderLambdaToString(this)");
        return string;
    }
}
