package n1;

import android.content.Context;
import android.util.TypedValue;
import com.redhand.laugiytr.R;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f1751f = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1753b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f1755e;

    public a(Context context) {
        TypedValue typedValueZ = a0.a.Z(context, R.NP_MANAGER3.NP_MANAGER);
        boolean z = (typedValueZ == null || typedValueZ.type != 18 || typedValueZ.data == 0) ? false : true;
        int iM = a0.a.m(context, R.NP_MANAGER3.NP_MANAGER, 0);
        int iM2 = a0.a.m(context, R.NP_MANAGER3.NP_MANAGER, 0);
        int iM3 = a0.a.m(context, R.NP_MANAGER3.NP_MANAGER, 0);
        float f3 = context.getResources().getDisplayMetrics().density;
        this.f1752a = z;
        this.f1753b = iM;
        this.c = iM2;
        this.f1754d = iM3;
        this.f1755e = f3;
    }
}
