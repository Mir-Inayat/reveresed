package v0;

import android.os.Parcel;
import android.os.Parcelable;
import f.k2;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends l0.b {
    public static final Parcelable.Creator<k0> CREATOR = new k2(7);
    public Parcelable c;

    public k0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = parcel.readParcelable(classLoader == null ? c0.class.getClassLoader() : classLoader);
    }

    @Override // l0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeParcelable(this.c, 0);
    }
}
