package v0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class t0 implements Parcelable {
    public static final Parcelable.Creator<t0> CREATOR = new b1.a(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2434b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f2435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f2437f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f2438g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2439h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2440i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f2441j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f2433a);
        parcel.writeInt(this.f2434b);
        parcel.writeInt(this.c);
        if (this.c > 0) {
            parcel.writeIntArray(this.f2435d);
        }
        parcel.writeInt(this.f2436e);
        if (this.f2436e > 0) {
            parcel.writeIntArray(this.f2437f);
        }
        parcel.writeInt(this.f2439h ? 1 : 0);
        parcel.writeInt(this.f2440i ? 1 : 0);
        parcel.writeInt(this.f2441j ? 1 : 0);
        parcel.writeList(this.f2438g);
    }
}
