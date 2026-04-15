package s1;

import android.graphics.Paint;
import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f2105i = new int[3];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float[] f2106j = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f2107k = new int[4];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float[] f2108l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f2109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f2110b;
    public final Paint c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2113f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Path f2114g = new Path();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f2115h;

    public a() {
        Paint paint = new Paint();
        this.f2115h = paint;
        Paint paint2 = new Paint();
        this.f2109a = paint2;
        this.f2111d = x.a.d(-16777216, 68);
        this.f2112e = x.a.d(-16777216, 20);
        this.f2113f = x.a.d(-16777216, 0);
        paint2.setColor(this.f2111d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f2110b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.c = new Paint(paint3);
    }
}
