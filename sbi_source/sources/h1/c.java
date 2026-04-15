package h1;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import f.k2;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class c extends l0.b {
    public static final Parcelable.Creator<c> CREATOR = new k2(1);
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f1356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f1357f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f1358g;

    public c(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = parcel.readInt();
        this.f1355d = parcel.readInt();
        this.f1356e = parcel.readInt() == 1;
        this.f1357f = parcel.readInt() == 1;
        this.f1358g = parcel.readInt() == 1;
    }

    @Override // l0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.c);
        parcel.writeInt(this.f1355d);
        parcel.writeInt(this.f1356e ? 1 : 0);
        parcel.writeInt(this.f1357f ? 1 : 0);
        parcel.writeInt(this.f1358g ? 1 : 0);
    }

    public c(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.c = bottomSheetBehavior.N;
        this.f1355d = bottomSheetBehavior.f554e;
        this.f1356e = bottomSheetBehavior.f549b;
        this.f1357f = bottomSheetBehavior.I;
        this.f1358g = bottomSheetBehavior.J;
    }
}
