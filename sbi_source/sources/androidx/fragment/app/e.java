package androidx.fragment.app;

import android.content.DialogInterface;
import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class e extends f implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d f285k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f286l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f287m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f288n;

    public e() {
        new b(0, this);
        new c(this);
        this.f285k = new d(this);
        this.f286l = -1;
        new t1.g(5, this);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        String str;
        if (this.f287m) {
            return;
        }
        if (k.f(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f288n) {
            return;
        }
        this.f288n = true;
        this.f287m = true;
        if (this.f286l >= 0) {
            k kVarE = e();
            int i2 = this.f286l;
            if (i2 < 0) {
                throw new IllegalArgumentException("Bad id: " + i2);
            }
            synchronized (kVarE.f301a) {
            }
            this.f286l = -1;
            return;
        }
        a aVar = new a(e());
        l lVar = new l();
        lVar.f305a = 3;
        lVar.f306b = this;
        ((ArrayList) aVar.f279d).add(lVar);
        lVar.c = 0;
        lVar.f307d = 0;
        lVar.f308e = 0;
        lVar.f309f = 0;
        k kVar = (k) aVar.f280e;
        if (aVar.c) {
            throw new IllegalStateException("commit already called");
        }
        if (k.f(2)) {
            Log.v("FragmentManager", "Commit: " + aVar);
            PrintWriter printWriter = new PrintWriter(new m());
            ArrayList arrayList = (ArrayList) aVar.f279d;
            printWriter.print("  ");
            printWriter.print("mName=");
            printWriter.print((String) null);
            printWriter.print(" mIndex=");
            printWriter.print(aVar.f278b);
            printWriter.print(" mCommitted=");
            printWriter.println(aVar.c);
            if (!arrayList.isEmpty()) {
                printWriter.print("  ");
                printWriter.println("Operations:");
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    l lVar2 = (l) arrayList.get(i3);
                    switch (lVar2.f305a) {
                        case 0:
                            str = "NULL";
                            break;
                        case 1:
                            str = "ADD";
                            break;
                        case 2:
                            str = "REPLACE";
                            break;
                        case 3:
                            str = "REMOVE";
                            break;
                        case 4:
                            str = "HIDE";
                            break;
                        case 5:
                            str = "SHOW";
                            break;
                        case 6:
                            str = "DETACH";
                            break;
                        case 7:
                            str = "ATTACH";
                            break;
                        case 8:
                            str = "SET_PRIMARY_NAV";
                            break;
                        case 9:
                            str = "UNSET_PRIMARY_NAV";
                            break;
                        case 10:
                            str = "OP_SET_MAX_LIFECYCLE";
                            break;
                        default:
                            str = "cmd=" + lVar2.f305a;
                            break;
                    }
                    printWriter.print("  ");
                    printWriter.print("  Op #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.print(str);
                    printWriter.print(" ");
                    printWriter.println(lVar2.f306b);
                    if (lVar2.c != 0 || lVar2.f307d != 0) {
                        printWriter.print("  ");
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(lVar2.c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(lVar2.f307d));
                    }
                    if (lVar2.f308e != 0 || lVar2.f309f != 0) {
                        printWriter.print("  ");
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(lVar2.f308e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(lVar2.f309f));
                    }
                }
            }
            printWriter.close();
        }
        aVar.c = true;
        aVar.f278b = -1;
        synchronized (kVar.f301a) {
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }
}
