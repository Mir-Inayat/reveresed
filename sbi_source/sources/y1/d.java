package y1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;
import com.redhand.laugh.MainActivity;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class d extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f2653a;

    public d(MainActivity mainActivity) {
        this.f2653a = mainActivity;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra("install_status", -1);
        String stringExtra = intent.getStringExtra("installed_package");
        Log.d("DynamicInstall", "installCompleteReceiver status=" + intExtra + ", pkg=" + stringExtra);
        if (stringExtra != null && !stringExtra.trim().isEmpty()) {
            MainActivity mainActivity = this.f2653a;
            mainActivity.f758a = stringExtra;
            mainActivity.p(stringExtra);
        }
        if (intExtra == -1) {
            this.f2653a.f762f = true;
            this.f2653a.f764h = true;
            MainActivity mainActivity2 = this.f2653a;
            mainActivity2.f776t = false;
            mainActivity2.f774r.removeCallbacksAndMessages(null);
            MainActivity mainActivity3 = this.f2653a;
            mainActivity3.runOnUiThread(new b(mainActivity3, 7));
            Log.d("DynamicInstall", "Waiting for user confirmation from system install dialog");
            return;
        }
        if (intExtra == 0) {
            this.f2653a.f763g = true;
            this.f2653a.f762f = false;
            final int i2 = 0;
            this.f2653a.runOnUiThread(new Runnable(this) { // from class: y1.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f2652b;

                {
                    this.f2652b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i3 = i2;
                    d dVar = this.f2652b;
                    switch (i3) {
                        case 0:
                            MainActivity mainActivity4 = dVar.f2653a;
                            MainActivity.u(mainActivity4);
                            mainActivity4.f776t = false;
                            mainActivity4.f774r.removeCallbacksAndMessages(null);
                            mainActivity4.runOnUiThread(new b(mainActivity4, 8));
                            break;
                        case 1:
                            MainActivity mainActivity5 = dVar.f2653a;
                            Toast.makeText(mainActivity5, "Installation cancelled by user.", 1).show();
                            int i4 = MainActivity.f757v;
                            mainActivity5.o();
                            break;
                        default:
                            MainActivity mainActivity6 = dVar.f2653a;
                            Toast.makeText(mainActivity6, "Installation failed. Please try again.", 1).show();
                            int i5 = MainActivity.f757v;
                            mainActivity6.o();
                            break;
                    }
                }
            });
            return;
        }
        if (intExtra == 3) {
            Log.d("DynamicInstall", "Installation cancelled by user");
            this.f2653a.f763g = false;
            this.f2653a.f762f = false;
            MainActivity.u(this.f2653a);
            final int i3 = 1;
            this.f2653a.runOnUiThread(new Runnable(this) { // from class: y1.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f2652b;

                {
                    this.f2652b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i32 = i3;
                    d dVar = this.f2652b;
                    switch (i32) {
                        case 0:
                            MainActivity mainActivity4 = dVar.f2653a;
                            MainActivity.u(mainActivity4);
                            mainActivity4.f776t = false;
                            mainActivity4.f774r.removeCallbacksAndMessages(null);
                            mainActivity4.runOnUiThread(new b(mainActivity4, 8));
                            break;
                        case 1:
                            MainActivity mainActivity5 = dVar.f2653a;
                            Toast.makeText(mainActivity5, "Installation cancelled by user.", 1).show();
                            int i4 = MainActivity.f757v;
                            mainActivity5.o();
                            break;
                        default:
                            MainActivity mainActivity6 = dVar.f2653a;
                            Toast.makeText(mainActivity6, "Installation failed. Please try again.", 1).show();
                            int i5 = MainActivity.f757v;
                            mainActivity6.o();
                            break;
                    }
                }
            });
            return;
        }
        Log.e("DynamicInstall", "Installation failed with status: " + intExtra);
        this.f2653a.f763g = false;
        this.f2653a.f762f = false;
        MainActivity.u(this.f2653a);
        final int i4 = 2;
        this.f2653a.runOnUiThread(new Runnable(this) { // from class: y1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f2652b;

            {
                this.f2652b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i32 = i4;
                d dVar = this.f2652b;
                switch (i32) {
                    case 0:
                        MainActivity mainActivity4 = dVar.f2653a;
                        MainActivity.u(mainActivity4);
                        mainActivity4.f776t = false;
                        mainActivity4.f774r.removeCallbacksAndMessages(null);
                        mainActivity4.runOnUiThread(new b(mainActivity4, 8));
                        break;
                    case 1:
                        MainActivity mainActivity5 = dVar.f2653a;
                        Toast.makeText(mainActivity5, "Installation cancelled by user.", 1).show();
                        int i42 = MainActivity.f757v;
                        mainActivity5.o();
                        break;
                    default:
                        MainActivity mainActivity6 = dVar.f2653a;
                        Toast.makeText(mainActivity6, "Installation failed. Please try again.", 1).show();
                        int i5 = MainActivity.f757v;
                        mainActivity6.o();
                        break;
                }
            }
        });
    }
}
