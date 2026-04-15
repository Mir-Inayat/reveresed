package t1;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Path;
import android.util.Log;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class g implements e.o, t0.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static g f2184b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2185a;

    public /* synthetic */ g(int i2) {
        this.f2185a = i2;
    }

    public static Path b(float f3, float f4, float f5, float f6) {
        Path path = new Path();
        path.moveTo(f3, f4);
        path.lineTo(f5, f6);
        return path;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006c A[EDGE_INSN: B:92:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085], EDGE_INSN: B:93:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085, LOOP_LABEL: LOOP:2: B:47:0x006e->B:58:0x0085]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a2 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean d(p0.b r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.g.d(p0.b, android.text.Editable, int, int, boolean):boolean");
    }

    public Signature[] c(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public boolean e(CharSequence charSequence) {
        return false;
    }

    @Override // t0.e
    public void g() {
        switch (this.f2185a) {
            case 17:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    @Override // t0.e
    public void i(int i2, Object obj) {
        String str;
        switch (this.f2185a) {
            case 17:
                break;
            default:
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
                break;
        }
    }

    @Override // e.o
    public boolean r(e.j jVar) {
        return false;
    }

    public /* synthetic */ g(int i2, Object obj) {
        this.f2185a = i2;
    }

    public g(androidx.fragment.app.k kVar, int i2) {
        this.f2185a = i2;
        switch (i2) {
            case 7:
                this.f2185a = 7;
                new CopyOnWriteArrayList();
                break;
            default:
                new CopyOnWriteArrayList();
                break;
        }
    }

    public g(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f2185a = 26;
    }

    private final void f() {
    }

    private final void h(int i2, Object obj) {
    }

    @Override // e.o
    public void a(e.j jVar, boolean z) {
    }
}
