package x;

import android.graphics.Path;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f2620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f2621b;

    public f(char c, float[] fArr) {
        this.f2620a = c;
        this.f2621b = fArr;
    }

    public static void a(Path path, float f3, float f4, float f5, float f6, float f7, float f8, float f9, boolean z, boolean z2) {
        double d3;
        double d4;
        double radians = Math.toRadians(f9);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d5 = f3;
        double d6 = f4;
        double d7 = f7;
        double d8 = ((d6 * dSin) + (d5 * dCos)) / d7;
        double d9 = f8;
        double d10 = ((d6 * dCos) + (((double) (-f3)) * dSin)) / d9;
        double d11 = f6;
        double d12 = ((d11 * dSin) + (((double) f5) * dCos)) / d7;
        double d13 = ((d11 * dCos) + (((double) (-f5)) * dSin)) / d9;
        double d14 = d8 - d12;
        double d15 = d10 - d13;
        double d16 = (d8 + d12) / 2.0d;
        double d17 = (d10 + d13) / 2.0d;
        double d18 = (d15 * d15) + (d14 * d14);
        if (d18 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d19 = (1.0d / d18) - 0.25d;
        if (d19 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d18);
            float fSqrt = (float) (Math.sqrt(d18) / 1.99999d);
            a(path, f3, f4, f5, f6, f7 * fSqrt, fSqrt * f8, f9, z, z2);
            return;
        }
        double dSqrt = Math.sqrt(d19);
        double d20 = dSqrt * d14;
        double d21 = dSqrt * d15;
        if (z == z2) {
            d3 = d16 - d21;
            d4 = d17 + d20;
        } else {
            d3 = d16 + d21;
            d4 = d17 - d20;
        }
        double dAtan2 = Math.atan2(d10 - d4, d8 - d3);
        double dAtan22 = Math.atan2(d13 - d4, d12 - d3) - dAtan2;
        if (z2 != (dAtan22 >= 0.0d)) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d22 = d3 * d7;
        double d23 = d4 * d9;
        double d24 = (d22 * dCos) - (d23 * dSin);
        double d25 = (d23 * dCos) + (d22 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan22 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(radians);
        double dSin2 = Math.sin(radians);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d26 = -d7;
        double d27 = d26 * dCos2;
        double d28 = d9 * dSin2;
        double d29 = (d27 * dSin3) - (d28 * dCos3);
        double d30 = d26 * dSin2;
        double d31 = d9 * dCos2;
        double d32 = dAtan22 / ((double) iCeil);
        double d33 = (dCos3 * d31) + (dSin3 * d30);
        double d34 = d5;
        double d35 = d6;
        int i2 = 0;
        double d36 = dAtan2;
        while (i2 < iCeil) {
            double d37 = d36 + d32;
            double dSin4 = Math.sin(d37);
            double dCos4 = Math.cos(d37);
            int i3 = iCeil;
            double d38 = (((d7 * dCos2) * dCos4) + d24) - (d28 * dSin4);
            double d39 = (d31 * dSin4) + (d7 * dSin2 * dCos4) + d25;
            double d40 = (d27 * dSin4) - (d28 * dCos4);
            double d41 = (dCos4 * d31) + (dSin4 * d30);
            double d42 = d37 - d36;
            double dTan = Math.tan(d42 / 2.0d);
            double dSqrt2 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d42)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d29 * dSqrt2) + d34), (float) ((d33 * dSqrt2) + d35), (float) (d38 - (dSqrt2 * d40)), (float) (d39 - (dSqrt2 * d41)), (float) d38, (float) d39);
            i2++;
            d35 = d39;
            dCos2 = dCos2;
            d30 = d30;
            d36 = d37;
            d33 = d41;
            d34 = d38;
            iCeil = i3;
            d29 = d40;
            d32 = d32;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(f[] fVarArr, Path path) {
        int i2;
        float[] fArr;
        int i3;
        f fVar;
        int i4;
        char c;
        float f3;
        float f4;
        f fVar2;
        boolean z;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        f[] fVarArr2 = fVarArr;
        Path path2 = path;
        float[] fArr2 = new float[6];
        int length = fVarArr2.length;
        int i5 = 0;
        int i6 = 0;
        char c3 = 'm';
        while (i6 < length) {
            f fVar3 = fVarArr2[i6];
            char c4 = fVar3.f2620a;
            float[] fArr3 = fVar3.f2621b;
            float f13 = fArr2[i5];
            float f14 = fArr2[1];
            float f15 = fArr2[2];
            float f16 = fArr2[3];
            float f17 = fArr2[4];
            int i7 = i5;
            float f18 = fArr2[5];
            switch (c4) {
                case 'A':
                case 'a':
                    i2 = 7;
                    break;
                case 'C':
                case 'c':
                    i2 = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i2 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i2 = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    path2.moveTo(f17, f18);
                    f13 = f17;
                    f15 = f13;
                    f14 = f18;
                    f16 = f14;
                default:
                    i2 = 2;
                    break;
            }
            float f19 = f17;
            float f20 = f18;
            float f21 = f13;
            float f22 = f14;
            int i8 = i7;
            while (i8 < fArr3.length) {
                if (c4 == 'A') {
                    fArr = fArr3;
                    i3 = i8;
                    fVar = fVar3;
                    float f23 = f21;
                    float f24 = f22;
                    i4 = i6;
                    c = c4;
                    int i9 = i3 + 5;
                    int i10 = i3 + 6;
                    a(path, f23, f24, fArr[i9], fArr[i10], fArr[i3], fArr[i3 + 1], fArr[i3 + 2], fArr[i3 + 3] != 0.0f ? 1 : i7, fArr[i3 + 4] != 0.0f ? 1 : i7);
                    f15 = fArr[i9];
                    f3 = fArr[i10];
                    f16 = f3;
                    f4 = f15;
                } else if (c4 == 'C') {
                    fArr = fArr3;
                    i3 = i8;
                    i4 = i6;
                    fVar = fVar3;
                    c = c4;
                    int i11 = i3 + 2;
                    int i12 = i3 + 3;
                    int i13 = i3 + 4;
                    int i14 = i3 + 5;
                    path2.cubicTo(fArr[i3], fArr[i3 + 1], fArr[i11], fArr[i12], fArr[i13], fArr[i14]);
                    float f25 = fArr[i13];
                    float f26 = fArr[i14];
                    f15 = fArr[i11];
                    f16 = fArr[i12];
                    f3 = f26;
                    f4 = f25;
                } else if (c4 == 'H') {
                    fArr = fArr3;
                    i3 = i8;
                    fVar = fVar3;
                    c = c4;
                    f3 = f22;
                    i4 = i6;
                    path2.lineTo(fArr[i3], f3);
                    f4 = fArr[i3];
                } else if (c4 == 'Q') {
                    fArr = fArr3;
                    i3 = i8;
                    i4 = i6;
                    fVar = fVar3;
                    c = c4;
                    int i15 = i3 + 1;
                    int i16 = i3 + 2;
                    int i17 = i3 + 3;
                    path2.quadTo(fArr[i3], fArr[i15], fArr[i16], fArr[i17]);
                    float f27 = fArr[i3];
                    float f28 = fArr[i15];
                    float f29 = fArr[i16];
                    float f30 = fArr[i17];
                    f15 = f27;
                    f16 = f28;
                    f4 = f29;
                    f3 = f30;
                } else if (c4 == 'V') {
                    fArr = fArr3;
                    i3 = i8;
                    i4 = i6;
                    fVar = fVar3;
                    f4 = f21;
                    c = c4;
                    path2.lineTo(f4, fArr[i3]);
                    f3 = fArr[i3];
                } else if (c4 != 'a') {
                    if (c4 == 'c') {
                        fArr = fArr3;
                        i3 = i8;
                        int i18 = i3 + 2;
                        int i19 = i3 + 3;
                        int i20 = i3 + 4;
                        int i21 = i3 + 5;
                        path2.rCubicTo(fArr[i3], fArr[i3 + 1], fArr[i18], fArr[i19], fArr[i20], fArr[i21]);
                        float f31 = fArr[i18] + f21;
                        float f32 = fArr[i19] + f22;
                        f21 += fArr[i20];
                        f22 += fArr[i21];
                        f15 = f31;
                        f16 = f32;
                    } else if (c4 != 'h') {
                        if (c4 != 'q') {
                            if (c4 != 'v') {
                                if (c4 == 'L') {
                                    fArr = fArr3;
                                    i3 = i8;
                                    int i22 = i3 + 1;
                                    path2.lineTo(fArr[i3], fArr[i22]);
                                    f4 = fArr[i3];
                                    f3 = fArr[i22];
                                } else if (c4 == 'M') {
                                    fArr = fArr3;
                                    i3 = i8;
                                    f4 = fArr[i3];
                                    f3 = fArr[i3 + 1];
                                    if (i3 > 0) {
                                        path2.lineTo(f4, f3);
                                    } else {
                                        path2.moveTo(f4, f3);
                                        f19 = f4;
                                        f20 = f3;
                                    }
                                } else if (c4 != 'S') {
                                    if (c4 == 'T') {
                                        fArr = fArr3;
                                        i3 = i8;
                                        if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                                            f21 = (f21 * 2.0f) - f15;
                                            f22 = (f22 * 2.0f) - f16;
                                        }
                                        int i23 = i3 + 1;
                                        path2.quadTo(f21, f22, fArr[i3], fArr[i23]);
                                        f4 = fArr[i3];
                                        f3 = fArr[i23];
                                        fVar = fVar3;
                                        f15 = f21;
                                        f16 = f22;
                                    } else if (c4 == 'l') {
                                        fArr = fArr3;
                                        i3 = i8;
                                        int i24 = i3 + 1;
                                        path2.rLineTo(fArr[i3], fArr[i24]);
                                        f21 += fArr[i3];
                                        f8 = fArr[i24];
                                    } else if (c4 == 'm') {
                                        fArr = fArr3;
                                        i3 = i8;
                                        float f33 = fArr[i3];
                                        f21 += f33;
                                        float f34 = fArr[i3 + 1];
                                        f22 += f34;
                                        if (i3 > 0) {
                                            path2.rLineTo(f33, f34);
                                        } else {
                                            path2.rMoveTo(f33, f34);
                                            fVar = fVar3;
                                            f4 = f21;
                                            f19 = f4;
                                            f3 = f22;
                                            f20 = f3;
                                        }
                                    } else if (c4 != 's') {
                                        if (c4 != 't') {
                                            fArr = fArr3;
                                            i3 = i8;
                                            fVar = fVar3;
                                            f4 = f21;
                                        } else {
                                            if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                                                f11 = f21 - f15;
                                                f12 = f22 - f16;
                                            } else {
                                                f12 = 0.0f;
                                                f11 = 0.0f;
                                            }
                                            int i25 = i8 + 1;
                                            path2.rQuadTo(f11, f12, fArr3[i8], fArr3[i25]);
                                            float f35 = f11 + f21;
                                            float f36 = f12 + f22;
                                            float f37 = f21 + fArr3[i8];
                                            f22 += fArr3[i25];
                                            f16 = f36;
                                            fArr = fArr3;
                                            i3 = i8;
                                            fVar = fVar3;
                                            f4 = f37;
                                            f15 = f35;
                                        }
                                        f3 = f22;
                                    } else {
                                        if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                                            f9 = f22 - f16;
                                            f10 = f21 - f15;
                                        } else {
                                            f10 = 0.0f;
                                            f9 = 0.0f;
                                        }
                                        int i26 = i8;
                                        int i27 = i26 + 1;
                                        int i28 = i26 + 2;
                                        int i29 = i26 + 3;
                                        fArr = fArr3;
                                        i3 = i26;
                                        path2.rCubicTo(f10, f9, fArr3[i26], fArr3[i27], fArr3[i28], fArr3[i29]);
                                        f5 = fArr[i3] + f21;
                                        f6 = fArr[i27] + f22;
                                        f21 += fArr[i28];
                                        f7 = fArr[i29];
                                    }
                                    i4 = i6;
                                    c = c4;
                                } else {
                                    fArr = fArr3;
                                    i3 = i8;
                                    if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                                        f21 = (f21 * 2.0f) - f15;
                                        f22 = (f22 * 2.0f) - f16;
                                    }
                                    float f38 = f21;
                                    float f39 = f22;
                                    int i30 = i3 + 1;
                                    int i31 = i3 + 2;
                                    int i32 = i3 + 3;
                                    path2.cubicTo(f38, f39, fArr[i3], fArr[i30], fArr[i31], fArr[i32]);
                                    f15 = fArr[i3];
                                    f16 = fArr[i30];
                                    f4 = fArr[i31];
                                    f3 = fArr[i32];
                                }
                                i4 = i6;
                                fVar = fVar3;
                                c = c4;
                            } else {
                                fArr = fArr3;
                                i3 = i8;
                                path2.rLineTo(0.0f, fArr[i3]);
                                f8 = fArr[i3];
                            }
                            f22 += f8;
                        } else {
                            fArr = fArr3;
                            i3 = i8;
                            int i33 = i3 + 1;
                            int i34 = i3 + 2;
                            int i35 = i3 + 3;
                            path2.rQuadTo(fArr[i3], fArr[i33], fArr[i34], fArr[i35]);
                            f5 = fArr[i3] + f21;
                            f6 = fArr[i33] + f22;
                            f21 += fArr[i34];
                            f7 = fArr[i35];
                        }
                        f22 += f7;
                        f15 = f5;
                        f16 = f6;
                    } else {
                        fArr = fArr3;
                        i3 = i8;
                        path2.rLineTo(fArr[i3], 0.0f);
                        f21 += fArr[i3];
                    }
                    fVar = fVar3;
                    f4 = f21;
                    f3 = f22;
                    i4 = i6;
                    c = c4;
                } else {
                    fArr = fArr3;
                    i3 = i8;
                    int i36 = i3 + 5;
                    float f40 = fArr[i36] + f21;
                    int i37 = i3 + 6;
                    float f41 = fArr[i37] + f22;
                    float f42 = fArr[i3];
                    float f43 = fArr[i3 + 1];
                    float f44 = fArr[i3 + 2];
                    if (fArr[i3 + 3] != 0.0f) {
                        fVar2 = fVar3;
                        z = 1;
                    } else {
                        fVar2 = fVar3;
                        z = i7;
                    }
                    fVar = fVar2;
                    float f45 = f21;
                    c = c4;
                    float f46 = f22;
                    i4 = i6;
                    a(path, f45, f46, f40, f41, f42, f43, f44, z, fArr[i3 + 4] != 0.0f ? 1 : i7);
                    f4 = f45 + fArr[i36];
                    f3 = f46 + fArr[i37];
                    f15 = f4;
                    f16 = f3;
                }
                i8 = i3 + i2;
                path2 = path;
                fVar3 = fVar;
                c4 = c;
                i6 = i4;
                f21 = f4;
                f22 = f3;
                c3 = c4;
                fArr3 = fArr;
            }
            fArr2[i7] = f21;
            fArr2[1] = f22;
            fArr2[2] = f15;
            fArr2[3] = f16;
            fArr2[4] = f19;
            fArr2[5] = f20;
            c3 = fVar3.f2620a;
            i6++;
            fVarArr2 = fVarArr;
            path2 = path;
            i5 = i7;
        }
    }
}
