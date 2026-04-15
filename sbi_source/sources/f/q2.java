package f;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.redhand.laugiytr.R;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f1149b;
    public final TextView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WindowManager.LayoutParams f1150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f1151e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f1152f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f1153g;

    public q2(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1150d = layoutParams;
        this.f1151e = new Rect();
        this.f1152f = new int[2];
        this.f1153g = new int[2];
        this.f1148a = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.NP_MANAGER11.NP_MANAGER, (ViewGroup) null);
        this.f1149b = viewInflate;
        this.c = (TextView) viewInflate.findViewById(R.NP_MANAGER8.NP_MANAGER);
        layoutParams.setTitle(q2.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.NP_MANAGER15.NP_MANAGER;
        layoutParams.flags = 24;
    }
}
