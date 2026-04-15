package y1;

import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.redhand.laugh.MainActivity;
import java.io.File;
import w.m;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f2650b;

    public /* synthetic */ b(MainActivity mainActivity, int i2) {
        this.f2649a = i2;
        this.f2650b = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Drawable drawable;
        int i2 = 1;
        switch (this.f2649a) {
            case 0:
                MainActivity mainActivity = this.f2650b;
                int i3 = MainActivity.f757v;
                try {
                    File fileC = mainActivity.c();
                    String strN = mainActivity.n(fileC);
                    mainActivity.f758a = strN;
                    if (strN == null || strN.trim().isEmpty()) {
                        throw new Exception("Could not detect package name from decrypted APK");
                    }
                    mainActivity.p(mainActivity.f758a);
                    mainActivity.d(fileC);
                    mainActivity.runOnUiThread(new m(mainActivity, fileC, i2));
                    return;
                } catch (Exception e3) {
                    Log.e("DynamicInstall", "Payload processing failed", e3);
                    mainActivity.runOnUiThread(new m(mainActivity, e3, 2));
                    return;
                }
            case 1:
                MainActivity mainActivity2 = this.f2650b;
                ProgressBar progressBar = mainActivity2.f768l;
                if (progressBar != null) {
                    progressBar.setProgress(mainActivity2.f775s);
                }
                TextView textView = mainActivity2.f769m;
                if (textView != null) {
                    textView.setText(mainActivity2.f775s + "%");
                    return;
                }
                return;
            case 2:
                MainActivity mainActivity3 = this.f2650b;
                int i4 = MainActivity.f757v;
                mainActivity3.q();
                return;
            case 3:
                MainActivity mainActivity4 = this.f2650b;
                int i5 = MainActivity.f757v;
                mainActivity4.j();
                return;
            case 4:
                MainActivity mainActivity5 = this.f2650b;
                LinearLayout linearLayout = mainActivity5.f767k;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                ProgressBar progressBar2 = mainActivity5.f768l;
                if (progressBar2 != null) {
                    progressBar2.setProgress(mainActivity5.f775s);
                    mainActivity5.f768l.setVisibility(0);
                }
                TextView textView2 = mainActivity5.f769m;
                if (textView2 != null) {
                    textView2.setText(mainActivity5.f775s + "%");
                    mainActivity5.f769m.setVisibility(0);
                }
                TextView textView3 = mainActivity5.f770n;
                if (textView3 != null) {
                    textView3.setText("Installing...");
                }
                TextView textView4 = mainActivity5.f766j;
                if (textView4 != null) {
                    textView4.setText("Updating...");
                    mainActivity5.f766j.setEnabled(false);
                    return;
                }
                return;
            case 5:
                MainActivity mainActivity6 = this.f2650b;
                ImageView imageView = mainActivity6.f771o;
                if (imageView == null || (drawable = mainActivity6.f765i) == null) {
                    return;
                }
                imageView.setImageDrawable(drawable);
                return;
            case 6:
                MainActivity mainActivity7 = this.f2650b;
                LinearLayout linearLayout2 = mainActivity7.f767k;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(8);
                }
                TextView textView5 = mainActivity7.f766j;
                if (textView5 != null) {
                    textView5.setText("Update");
                    mainActivity7.f766j.setEnabled(true);
                    mainActivity7.f766j.setVisibility(0);
                }
                TextView textView6 = mainActivity7.f770n;
                if (textView6 != null) {
                    textView6.setText("Preparing Update");
                }
                ProgressBar progressBar3 = mainActivity7.f768l;
                if (progressBar3 != null) {
                    progressBar3.setProgress(0);
                }
                TextView textView7 = mainActivity7.f769m;
                if (textView7 != null) {
                    textView7.setText("0%");
                }
                mainActivity7.f759b = false;
                mainActivity7.c = false;
                mainActivity7.f760d = false;
                mainActivity7.f761e = false;
                mainActivity7.f762f = false;
                mainActivity7.f763g = false;
                mainActivity7.f764h = false;
                return;
            case 7:
                MainActivity mainActivity8 = this.f2650b;
                LinearLayout linearLayout3 = mainActivity8.f767k;
                if (linearLayout3 != null) {
                    linearLayout3.setVisibility(0);
                }
                ProgressBar progressBar4 = mainActivity8.f768l;
                if (progressBar4 != null) {
                    progressBar4.setProgress(0);
                    mainActivity8.f768l.setVisibility(0);
                }
                TextView textView8 = mainActivity8.f769m;
                if (textView8 != null) {
                    textView8.setText("0%");
                    mainActivity8.f769m.setVisibility(0);
                }
                TextView textView9 = mainActivity8.f770n;
                if (textView9 != null) {
                    textView9.setText("Waiting for confirmation...");
                }
                TextView textView10 = mainActivity8.f766j;
                if (textView10 != null) {
                    textView10.setText("Waiting...");
                    mainActivity8.f766j.setEnabled(false);
                    return;
                }
                return;
            case 8:
                MainActivity mainActivity9 = this.f2650b;
                LinearLayout linearLayout4 = mainActivity9.f767k;
                if (linearLayout4 != null) {
                    linearLayout4.setVisibility(0);
                }
                ProgressBar progressBar5 = mainActivity9.f768l;
                if (progressBar5 != null) {
                    if (progressBar5.getProgress() < 95) {
                        mainActivity9.f768l.setProgress(95);
                    }
                    mainActivity9.f768l.setProgress(100);
                }
                TextView textView11 = mainActivity9.f769m;
                if (textView11 != null) {
                    textView11.setText("100%");
                }
                TextView textView12 = mainActivity9.f770n;
                if (textView12 != null) {
                    textView12.setText("Complete!");
                }
                mainActivity9.f774r.postDelayed(new b(mainActivity9, 3), 500L);
                return;
            case 9:
                MainActivity mainActivity10 = this.f2650b;
                int i6 = MainActivity.f757v;
                mainActivity10.getClass();
                Toast.makeText(mainActivity10, "Decrypted file not found. Please try again.", 1).show();
                mainActivity10.o();
                return;
            default:
                MainActivity mainActivity11 = this.f2650b;
                int i7 = MainActivity.f757v;
                mainActivity11.getClass();
                Toast.makeText(mainActivity11, "Installation failed", 1).show();
                mainActivity11.o();
                return;
        }
    }
}
