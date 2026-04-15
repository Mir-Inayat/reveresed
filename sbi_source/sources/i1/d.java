package i1;

import android.os.Parcel;
import android.os.Parcelable;
import f.k2;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class d extends l0.b {
    public static final Parcelable.Creator<d> CREATOR = new k2(2);
    public boolean c;

    public d(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            d.class.getClassLoader();
        }
        this.c = parcel.readInt() == 1;
    }

    @Override // l0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
