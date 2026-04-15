package b1;

import android.os.Parcel;
import android.util.SparseIntArray;
import i.f;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class c extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseIntArray f456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Parcel f457e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f458f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f459g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f460h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f461i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f462j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f463k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new f(0), new f(0), new f(0));
    }

    @Override // b1.b
    public final c a() {
        Parcel parcel = this.f457e;
        int iDataPosition = parcel.dataPosition();
        int i2 = this.f462j;
        if (i2 == this.f458f) {
            i2 = this.f459g;
        }
        return new c(parcel, iDataPosition, i2, this.f460h + "  ", this.f454a, this.f455b, this.c);
    }

    @Override // b1.b
    public final boolean e(int i2) {
        while (this.f462j < this.f459g) {
            int i3 = this.f463k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            int i4 = this.f462j;
            Parcel parcel = this.f457e;
            parcel.setDataPosition(i4);
            int i5 = parcel.readInt();
            this.f463k = parcel.readInt();
            this.f462j += i5;
        }
        return this.f463k == i2;
    }

    @Override // b1.b
    public final void h(int i2) {
        int i3 = this.f461i;
        SparseIntArray sparseIntArray = this.f456d;
        Parcel parcel = this.f457e;
        if (i3 >= 0) {
            int i4 = sparseIntArray.get(i3);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i4);
            parcel.writeInt(iDataPosition - i4);
            parcel.setDataPosition(iDataPosition);
        }
        this.f461i = i2;
        sparseIntArray.put(i2, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i2);
    }

    public c(Parcel parcel, int i2, int i3, String str, f fVar, f fVar2, f fVar3) {
        super(fVar, fVar2, fVar3);
        this.f456d = new SparseIntArray();
        this.f461i = -1;
        this.f463k = -1;
        this.f457e = parcel;
        this.f458f = i2;
        this.f459g = i3;
        this.f462j = i2;
        this.f460h = str;
    }
}
