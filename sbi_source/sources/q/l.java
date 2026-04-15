package q;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2022b;
    public float c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f2023d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f2047g);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == 1) {
                this.c = typedArrayObtainStyledAttributes.getFloat(index, this.c);
            } else if (index == 0) {
                int i3 = typedArrayObtainStyledAttributes.getInt(index, this.f2021a);
                this.f2021a = i3;
                this.f2021a = n.f2037d[i3];
            } else if (index == 4) {
                this.f2022b = typedArrayObtainStyledAttributes.getInt(index, this.f2022b);
            } else if (index == 3) {
                this.f2023d = typedArrayObtainStyledAttributes.getFloat(index, this.f2023d);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
