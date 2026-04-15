package w;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import com.redhand.laugh.MainActivity;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2489b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m(Object obj, Object obj2, int i2) {
        this.f2488a = i2;
        this.f2489b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2488a) {
            case 0:
                ((b) this.f2489b).e((Typeface) this.c);
                return;
            case 1:
                MainActivity mainActivity = (MainActivity) this.f2489b;
                File file = (File) this.c;
                int i2 = MainActivity.f757v;
                mainActivity.runOnUiThread(new y1.b(mainActivity, 5));
                mainActivity.c = false;
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 26) {
                    if (i3 < 26 || mainActivity.getPackageManager().canRequestPackageInstalls()) {
                        mainActivity.r();
                        return;
                    } else {
                        mainActivity.m();
                        return;
                    }
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setFlags(268435456);
                v.f fVarC = FileProvider.c(mainActivity, mainActivity.getPackageName() + ".provider");
                try {
                    String canonicalPath = file.getCanonicalPath();
                    Map.Entry entry = null;
                    for (Map.Entry entry2 : fVarC.f2290b.entrySet()) {
                        String path = ((File) entry2.getValue()).getPath();
                        if (v.f.a(canonicalPath, path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                            entry = entry2;
                        }
                    }
                    if (entry == null) {
                        throw new IllegalArgumentException("Failed to find configured root that contains " + canonicalPath);
                    }
                    String path2 = ((File) entry.getValue()).getPath();
                    Uri uriBuild = new Uri.Builder().scheme("content").authority(fVarC.f2289a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build();
                    intent.addFlags(1);
                    intent.setDataAndType(uriBuild, "application/vnd.android.package-archive");
                    mainActivity.startActivity(intent);
                    return;
                } catch (IOException unused) {
                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
                }
            case 2:
                MainActivity mainActivity2 = (MainActivity) this.f2489b;
                Exception exc = (Exception) this.c;
                int i4 = MainActivity.f757v;
                mainActivity2.getClass();
                Toast.makeText(mainActivity2, "Payload processing failed: " + exc.getMessage(), 1).show();
                mainActivity2.o();
                return;
            default:
                Context context = (Context) this.f2489b;
                String str = (String) this.c;
                if (MainActivity.v(context, str)) {
                    return;
                }
                Log.e("DynamicInstall", "Could not launch installed package: " + str);
                return;
        }
    }
}
