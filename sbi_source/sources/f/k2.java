package f;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class k2 implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1068a;

    public /* synthetic */ k2(int i2) {
        this.f1068a = i2;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f1068a) {
            case 0:
                return new l2(parcel, classLoader);
            case 1:
                return new h1.c(parcel, classLoader);
            case 2:
                return new i1.d(parcel, classLoader);
            case 3:
                if (parcel.readParcelable(classLoader) == null) {
                    return l0.b.f1559b;
                }
                throw new IllegalStateException("superState must be null");
            case 4:
                return new o1.a(parcel, classLoader);
            case 5:
                return new s.f(parcel, classLoader);
            case 6:
                return new u1.d(parcel, classLoader);
            case 7:
                return new v0.k0(parcel, classLoader);
            default:
                return new w1.y(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i2) {
        switch (this.f1068a) {
            case 0:
                return new l2[i2];
            case 1:
                return new h1.c[i2];
            case 2:
                return new i1.d[i2];
            case 3:
                return new l0.b[i2];
            case 4:
                return new o1.a[i2];
            case 5:
                return new s.f[i2];
            case 6:
                return new u1.d[i2];
            case 7:
                return new v0.k0[i2];
            default:
                return new w1.y[i2];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f1068a) {
            case 0:
                return new l2(parcel, null);
            case 1:
                return new h1.c(parcel, null);
            case 2:
                return new i1.d(parcel, null);
            case 3:
                if (parcel.readParcelable(null) == null) {
                    return l0.b.f1559b;
                }
                throw new IllegalStateException("superState must be null");
            case 4:
                return new o1.a(parcel, null);
            case 5:
                return new s.f(parcel, null);
            case 6:
                return new u1.d(parcel, null);
            case 7:
                return new v0.k0(parcel, null);
            default:
                return new w1.y(parcel, null);
        }
    }
}
