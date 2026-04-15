package s;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import f.k2;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class f extends l0.b {
    public static final Parcelable.Creator<f> CREATOR = new k2(5);
    public SparseArray c;

    public f(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i2 = parcel.readInt();
        int[] iArr = new int[i2];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        this.c = new SparseArray(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            this.c.append(iArr[i3], parcelableArray[i3]);
        }
    }

    @Override // l0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        SparseArray sparseArray = this.c;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr[i3] = this.c.keyAt(i3);
            parcelableArr[i3] = (Parcelable) this.c.valueAt(i3);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i2);
    }
}
