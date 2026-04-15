package androidx.emoji2.text;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.google.android.material.behavior.SwipeDismissBehavior;
import f.c2;
import f.j0;
import f.n1;
import f0.l1;
import f0.m0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class n implements k, r, n1, e.o, j0, f0.d, f0.f, g0.s, i1.c, f0.q, t0.e {
    public static n c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f244b;

    public /* synthetic */ n(int i2, Object obj) {
        this.f243a = i2;
        this.f244b = obj;
    }

    public static int x(int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            i4++;
            if (i4 == i3) {
                i5++;
                i4 = 0;
            } else if (i4 > i3) {
                i5++;
                i4 = 1;
            }
        }
        return i4 + 1 > i3 ? i5 + 1 : i5;
    }

    @Override // e.o
    public void a(e.j jVar, boolean z) {
        if (jVar instanceof e.t) {
            ((e.t) jVar).f966v.j().c(false);
        }
        e.o oVar = ((f.j) this.f244b).f1047e;
        if (oVar != null) {
            oVar.a(jVar, z);
        }
    }

    @Override // f0.d
    public f0.g build() {
        return new f0.g(new n(((ContentInfo.Builder) this.f244b).build()));
    }

    @Override // f0.f
    public ClipData c() {
        return ((ContentInfo) this.f244b).getClip();
    }

    @Override // g0.s
    public boolean d(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f244b;
        if (!swipeDismissBehavior.r(view)) {
            return false;
        }
        boolean z = view.getLayoutDirection() == 1;
        int i2 = swipeDismissBehavior.f543d;
        int width = (!(i2 == 0 && z) && (i2 != 1 || z)) ? view.getWidth() : -view.getWidth();
        Field field = m0.f1276a;
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        return true;
    }

    @Override // f0.q
    public f0.n1 e(View view, f0.n1 n1Var) {
        l1 l1Var = n1Var.f1281a;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f244b;
        if (!Objects.equals(coordinatorLayout.f161n, n1Var)) {
            coordinatorLayout.f161n = n1Var;
            boolean z = n1Var.a() > 0;
            coordinatorLayout.f162o = z;
            coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
            if (!l1Var.m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = coordinatorLayout.getChildAt(i2);
                    Field field = m0.f1276a;
                    if (childAt.getFitsSystemWindows() && ((s.d) childAt.getLayoutParams()).f2085a != null && l1Var.m()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return n1Var;
    }

    @Override // f0.f
    public int f() {
        return ((ContentInfo) this.f244b).getFlags();
    }

    @Override // t0.e
    public void g() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // f0.f
    public ContentInfo h() {
        return (ContentInfo) this.f244b;
    }

    @Override // t0.e
    public void i(int i2, Object obj) {
        String str;
        switch (i2) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i2 == 6 || i2 == 7 || i2 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f244b).setResultCode(i2);
    }

    @Override // androidx.emoji2.text.k
    public void k(a0.a aVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new y1.a(this, aVar, threadPoolExecutor, 3));
    }

    @Override // androidx.emoji2.text.r
    public boolean l(CharSequence charSequence, int i2, int i3, b0 b0Var) {
        if (!TextUtils.equals(charSequence.subSequence(i2, i3), (String) this.f244b)) {
            return true;
        }
        b0Var.c = (b0Var.c & 3) | 4;
        return false;
    }

    @Override // f0.d
    public void n(Uri uri) {
        ((ContentInfo.Builder) this.f244b).setLinkUri(uri);
    }

    @Override // f0.f
    public int o() {
        return ((ContentInfo) this.f244b).getSource();
    }

    @Override // f.n1
    public void p(e.j jVar, MenuItem menuItem) {
        ((e.g) this.f244b).f867f.removeCallbacksAndMessages(jVar);
    }

    @Override // f.n1
    public void q(e.j jVar, e.k kVar) {
        e.g gVar = (e.g) this.f244b;
        Handler handler = gVar.f867f;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = gVar.f869h;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (jVar == ((e.f) arrayList.get(i2)).f863b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            return;
        }
        int i3 = i2 + 1;
        handler.postAtTime(new e.e(this, i3 < arrayList.size() ? (e.f) arrayList.get(i3) : null, kVar, jVar), jVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // e.o
    public boolean r(e.j jVar) {
        f.j jVar2 = (f.j) this.f244b;
        if (jVar == jVar2.c) {
            return false;
        }
        ((e.t) jVar).f967w.getClass();
        jVar2.getClass();
        e.o oVar = jVar2.f1047e;
        if (oVar != null) {
            return oVar.r(jVar);
        }
        return false;
    }

    @Override // f0.d
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f244b).setExtras(bundle);
    }

    @Override // f0.d
    public void t(int i2) {
        ((ContentInfo.Builder) this.f244b).setFlags(i2);
    }

    public String toString() {
        switch (this.f243a) {
            case 10:
                return "ContentInfoCompat{" + ((ContentInfo) this.f244b) + "}";
            default:
                return super.toString();
        }
    }

    public g0.i u(int i2) {
        return null;
    }

    public g0.i v(int i2) {
        return null;
    }

    public List w() {
        ArrayList arrayList;
        if (((ArrayList) this.f244b).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f244b)) {
            arrayList = new ArrayList((ArrayList) this.f244b);
        }
        return arrayList;
    }

    public boolean y(int i2, int i3, Bundle bundle) {
        return false;
    }

    public /* synthetic */ n(int i2, boolean z) {
        this.f243a = i2;
    }

    public n(int i2) {
        this.f243a = i2;
        switch (i2) {
            case 13:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f244b = new g0.k(this);
                } else {
                    this.f244b = new g0.j(this);
                }
                break;
            case 15:
                this.f244b = new LinkedHashMap(0, 0.75f, true);
                break;
            case 25:
                this.f244b = new SparseIntArray();
                new SparseIntArray();
                break;
            case 26:
                this.f244b = new Object();
                new Handler(Looper.getMainLooper(), new v1.e(this));
                break;
            default:
                this.f244b = new ArrayList();
                new HashMap();
                new HashMap();
                break;
        }
    }

    public n(c2 c2Var) {
        this.f243a = 11;
        this.f244b = new CopyOnWriteArrayList();
        new HashMap();
    }

    public n(TextView textView) {
        this.f243a = 21;
        this.f244b = new p0.g(textView);
    }

    public n(EditText editText) {
        this.f243a = 20;
        this.f244b = new q(editText, 9);
    }

    public n(Context context) {
        this.f243a = 0;
        this.f244b = context.getApplicationContext();
    }

    public n(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f243a = 16;
        if (Build.VERSION.SDK_INT >= 25) {
            this.f244b = new j0.f(uri, clipDescription, uri2);
        } else {
            this.f244b = new t(uri, clipDescription, uri2);
        }
    }

    public n(ContentInfo contentInfo) {
        this.f243a = 10;
        contentInfo.getClass();
        this.f244b = f0.c.g(contentInfo);
    }

    public n(ClipData clipData, int i2) {
        this.f243a = 9;
        this.f244b = f0.c.e(clipData, i2);
    }

    @Override // f.j0
    public void j(int i2) {
    }

    @Override // f.j0
    public void m(int i2) {
    }

    @Override // androidx.emoji2.text.r
    public Object b() {
        return this;
    }

    @Override // f.j0
    public void s(int i2, float f3) {
    }
}
