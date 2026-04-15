package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.e0;
import androidx.lifecycle.j0;
import androidx.lifecycle.l;
import androidx.lifecycle.p;
import androidx.lifecycle.r;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import w0.c;
import w0.f;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class Recreator implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f430a;

    public Recreator(f fVar) {
        this.f430a = fVar;
    }

    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, w0.f] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, w0.f] */
    @Override // androidx.lifecycle.p
    public final void b(r rVar, l lVar) {
        if (lVar != l.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        rVar.d().e(this);
        Bundle bundleA = this.f430a.b().a("androidx.savedstate.Restarter");
        if (bundleA == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleA.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        if (stringArrayList.size() <= 0) {
            return;
        }
        String str = stringArrayList.get(0);
        try {
            Class<? extends U> clsAsSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(c.class);
            d2.c.d(clsAsSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                try {
                    Object objNewInstance = declaredConstructor.newInstance(null);
                    d2.c.d(objNewInstance, "{\n                constr…wInstance()\n            }");
                    ?? r4 = this.f430a;
                    e0 e0VarC = ((j0) r4).c();
                    r4.b();
                    e0VarC.getClass();
                    throw null;
                } catch (Exception e3) {
                    throw new RuntimeException("Failed to instantiate " + str, e3);
                }
            } catch (NoSuchMethodException e4) {
                throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e4);
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException("Class " + str + " wasn't found", e5);
        }
    }
}
