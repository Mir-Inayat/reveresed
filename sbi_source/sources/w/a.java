package w;

import android.graphics.Color;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f2466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f2467b;
    public final float c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f2468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f2469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f2470f;

    public a(float f3, float f4, float f5, float f6, float f7, float f8) {
        this.f2466a = f3;
        this.f2467b = f4;
        this.c = f5;
        this.f2468d = f6;
        this.f2469e = f7;
        this.f2470f = f8;
    }

    public static a a(int i2) {
        o oVar = o.f2492k;
        float fC = b.c(Color.red(i2));
        float fC2 = b.c(Color.green(i2));
        float fC3 = b.c(Color.blue(i2));
        float[][] fArr = b.f2473d;
        float[] fArr2 = fArr[0];
        float f3 = (fArr2[2] * fC3) + (fArr2[1] * fC2) + (fArr2[0] * fC);
        float[] fArr3 = fArr[1];
        float f4 = (fArr3[2] * fC3) + (fArr3[1] * fC2) + (fArr3[0] * fC);
        float[] fArr4 = fArr[2];
        float f5 = (fC3 * fArr4[2]) + (fC2 * fArr4[1]) + (fC * fArr4[0]);
        float[][] fArr5 = b.f2471a;
        float[] fArr6 = fArr5[0];
        float f6 = (fArr6[2] * f5) + (fArr6[1] * f4) + (fArr6[0] * f3);
        float[] fArr7 = fArr5[1];
        float f7 = (fArr7[2] * f5) + (fArr7[1] * f4) + (fArr7[0] * f3);
        float[] fArr8 = fArr5[2];
        float f8 = (f5 * fArr8[2]) + (f4 * fArr8[1]) + (f3 * fArr8[0]);
        float[] fArr9 = oVar.f2498g;
        float f9 = oVar.f2500i;
        float f10 = oVar.f2495d;
        float f11 = oVar.f2493a;
        float f12 = fArr9[0] * f6;
        float f13 = fArr9[1] * f7;
        float f14 = fArr9[2] * f8;
        float f15 = oVar.f2499h;
        float fPow = (float) Math.pow(((double) (Math.abs(f12) * f15)) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (Math.abs(f13) * f15)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (Math.abs(f14) * f15)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f12) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f13) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f14) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d3 = fSignum3;
        float f16 = ((float) (((((double) fSignum2) * (-12.0d)) + (((double) fSignum) * 11.0d)) + d3)) / 11.0f;
        float f17 = ((float) (((double) (fSignum + fSignum2)) - (d3 * 2.0d))) / 9.0f;
        float f18 = fSignum2 * 20.0f;
        float f19 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f18)) / 20.0f;
        float f20 = (((fSignum * 40.0f) + f18) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f17, f16)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f21 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f20 * oVar.f2494b) / f11, oVar.f2501j * f10)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f22 = f11 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, oVar.f2497f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * oVar.f2496e) * oVar.c) * ((float) Math.sqrt((f17 * f17) + (f16 * f16)))) / (f19 + 0.305f), 0.9d)) * ((float) Math.sqrt(((double) fPow4) / 100.0d));
        Math.sqrt((r0 * f10) / f22);
        float f23 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f9 * fPow5 * 0.0228f) + 1.0f)) * 43.85965f;
        double d4 = f21;
        return new a(fAtan2, fPow5, fPow4, f23, fLog * ((float) Math.cos(d4)), fLog * ((float) Math.sin(d4)));
    }

    public static a b(float f3, float f4, float f5) {
        o oVar = o.f2492k;
        float f6 = oVar.f2495d;
        Math.sqrt(((double) f3) / 100.0d);
        float f7 = oVar.f2493a + 4.0f;
        float f8 = oVar.f2500i * f4;
        Math.sqrt(((f4 / ((float) Math.sqrt(r1))) * oVar.f2495d) / f7);
        float f9 = (1.7f * f3) / ((0.007f * f3) + 1.0f);
        float fLog = ((float) Math.log((((double) f8) * 0.0228d) + 1.0d)) * 43.85965f;
        double d3 = (3.1415927f * f5) / 180.0f;
        return new a(f5, f4, f3, f9, fLog * ((float) Math.cos(d3)), fLog * ((float) Math.sin(d3)));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(w.o r20) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w.a.c(w.o):int");
    }
}
