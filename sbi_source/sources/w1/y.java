package w1;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import f.k2;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class y extends l0.b {
    public static final Parcelable.Creator<y> CREATOR = new k2(8);
    public CharSequence c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2613d;

    public y(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2613d = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.c) + "}";
    }

    @Override // l0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        TextUtils.writeToParcel(this.c, parcel, i2);
        parcel.writeInt(this.f2613d ? 1 : 0);
    }
}
