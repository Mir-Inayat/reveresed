package v0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements Parcelable {
    public static final Parcelable.Creator<s0> CREATOR = new b1.a(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2428b;
    public int[] c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2429d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f2427a + ", mGapDir=" + this.f2428b + ", mHasUnwantedGapAfter=" + this.f2429d + ", mGapPerSpan=" + Arrays.toString(this.c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f2427a);
        parcel.writeInt(this.f2428b);
        parcel.writeInt(this.f2429d ? 1 : 0);
        int[] iArr = this.c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.c);
        }
    }
}
