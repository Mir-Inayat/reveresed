package b1;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import k0.j;
import v0.s;
import v0.s0;
import v0.t0;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f453a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f453a) {
            case 0:
                return new ParcelImpl(parcel);
            case 1:
                j jVar = new j(parcel);
                jVar.f1478a = parcel.readInt();
                return jVar;
            case 2:
                s sVar = new s();
                sVar.f2425a = parcel.readInt();
                sVar.f2426b = parcel.readInt();
                sVar.c = parcel.readInt() == 1;
                return sVar;
            case 3:
                s0 s0Var = new s0();
                s0Var.f2427a = parcel.readInt();
                s0Var.f2428b = parcel.readInt();
                s0Var.f2429d = parcel.readInt() == 1;
                int i2 = parcel.readInt();
                if (i2 > 0) {
                    int[] iArr = new int[i2];
                    s0Var.c = iArr;
                    parcel.readIntArray(iArr);
                }
                return s0Var;
            default:
                t0 t0Var = new t0();
                t0Var.f2433a = parcel.readInt();
                t0Var.f2434b = parcel.readInt();
                int i3 = parcel.readInt();
                t0Var.c = i3;
                if (i3 > 0) {
                    int[] iArr2 = new int[i3];
                    t0Var.f2435d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i4 = parcel.readInt();
                t0Var.f2436e = i4;
                if (i4 > 0) {
                    int[] iArr3 = new int[i4];
                    t0Var.f2437f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                t0Var.f2439h = parcel.readInt() == 1;
                t0Var.f2440i = parcel.readInt() == 1;
                t0Var.f2441j = parcel.readInt() == 1;
                t0Var.f2438g = parcel.readArrayList(s0.class.getClassLoader());
                return t0Var;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i2) {
        switch (this.f453a) {
            case 0:
                return new ParcelImpl[i2];
            case 1:
                return new j[i2];
            case 2:
                return new s[i2];
            case 3:
                return new s0[i2];
            default:
                return new t0[i2];
        }
    }
}
