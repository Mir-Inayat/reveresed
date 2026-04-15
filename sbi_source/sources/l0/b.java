package l0;

import android.os.Parcel;
import android.os.Parcelable;
import f.k2;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Parcelable f1560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f1559b = new a();
    public static final Parcelable.Creator<b> CREATOR = new k2(3);

    public b() {
        this.f1560a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f1560a, i2);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f1560a = parcelable == f1559b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f1560a = parcelable == null ? f1559b : parcelable;
    }
}
