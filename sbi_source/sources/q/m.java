package q;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f2024n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f2025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f2026b;
    public float c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f2027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f2028e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f2029f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f2030g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2031h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f2032i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f2033j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f2034k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f2035l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f2036m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2024n = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f2049i);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            switch (f2024n.get(index)) {
                case 1:
                    this.f2025a = typedArrayObtainStyledAttributes.getFloat(index, this.f2025a);
                    break;
                case 2:
                    this.f2026b = typedArrayObtainStyledAttributes.getFloat(index, this.f2026b);
                    break;
                case 3:
                    this.c = typedArrayObtainStyledAttributes.getFloat(index, this.c);
                    break;
                case 4:
                    this.f2027d = typedArrayObtainStyledAttributes.getFloat(index, this.f2027d);
                    break;
                case 5:
                    this.f2028e = typedArrayObtainStyledAttributes.getFloat(index, this.f2028e);
                    break;
                case 6:
                    this.f2029f = typedArrayObtainStyledAttributes.getDimension(index, this.f2029f);
                    break;
                case 7:
                    this.f2030g = typedArrayObtainStyledAttributes.getDimension(index, this.f2030g);
                    break;
                case 8:
                    this.f2032i = typedArrayObtainStyledAttributes.getDimension(index, this.f2032i);
                    break;
                case 9:
                    this.f2033j = typedArrayObtainStyledAttributes.getDimension(index, this.f2033j);
                    break;
                case 10:
                    this.f2034k = typedArrayObtainStyledAttributes.getDimension(index, this.f2034k);
                    break;
                case 11:
                    this.f2035l = true;
                    this.f2036m = typedArrayObtainStyledAttributes.getDimension(index, this.f2036m);
                    break;
                case 12:
                    this.f2031h = n.f(typedArrayObtainStyledAttributes, index, this.f2031h);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
