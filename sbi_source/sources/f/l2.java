package f;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class l2 extends l0.b {
    public static final Parcelable.Creator<l2> CREATOR = new k2(0);
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1076d;

    public l2(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = parcel.readInt();
        this.f1076d = parcel.readInt() != 0;
    }

    @Override // l0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.c);
        parcel.writeInt(this.f1076d ? 1 : 0);
    }
}
