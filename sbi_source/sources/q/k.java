package q;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final SparseIntArray f2012j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2014b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f2015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f2016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f2017f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2018g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f2019h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2020i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2012j = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f2046f);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            switch (f2012j.get(index)) {
                case 1:
                    this.f2016e = typedArrayObtainStyledAttributes.getFloat(index, this.f2016e);
                    break;
                case 2:
                    this.c = typedArrayObtainStyledAttributes.getInt(index, this.c);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        String str = m.a.f1561a[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f2013a = n.f(typedArrayObtainStyledAttributes, index, this.f2013a);
                    break;
                case 6:
                    this.f2014b = typedArrayObtainStyledAttributes.getInteger(index, this.f2014b);
                    break;
                case 7:
                    this.f2015d = typedArrayObtainStyledAttributes.getFloat(index, this.f2015d);
                    break;
                case 8:
                    this.f2018g = typedArrayObtainStyledAttributes.getInteger(index, this.f2018g);
                    break;
                case 9:
                    this.f2017f = typedArrayObtainStyledAttributes.getFloat(index, this.f2017f);
                    break;
                case 10:
                    int i3 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    if (i3 == 1) {
                        this.f2020i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    } else if (i3 == 3) {
                        String string = typedArrayObtainStyledAttributes.getString(index);
                        this.f2019h = string;
                        if (string.indexOf("/") > 0) {
                            this.f2020i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        }
                    } else {
                        typedArrayObtainStyledAttributes.getInteger(index, this.f2020i);
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
