package v0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class s implements Parcelable {
    public static final Parcelable.Creator<s> CREATOR = new b1.a(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2426b;
    public boolean c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f2425a);
        parcel.writeInt(this.f2426b);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
