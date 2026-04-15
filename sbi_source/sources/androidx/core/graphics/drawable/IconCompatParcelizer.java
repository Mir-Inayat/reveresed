package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import b1.b;
import b1.c;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(b bVar) {
        IconCompat iconCompat = new IconCompat();
        int i2 = iconCompat.f178a;
        if (bVar.e(1)) {
            i2 = ((c) bVar).f457e.readInt();
        }
        iconCompat.f178a = i2;
        byte[] bArr = iconCompat.c;
        if (bVar.e(2)) {
            Parcel parcel = ((c) bVar).f457e;
            int i3 = parcel.readInt();
            if (i3 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i3];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.c = bArr;
        iconCompat.f180d = bVar.f(iconCompat.f180d, 3);
        int i4 = iconCompat.f181e;
        if (bVar.e(4)) {
            i4 = ((c) bVar).f457e.readInt();
        }
        iconCompat.f181e = i4;
        int i5 = iconCompat.f182f;
        if (bVar.e(5)) {
            i5 = ((c) bVar).f457e.readInt();
        }
        iconCompat.f182f = i5;
        iconCompat.f183g = (ColorStateList) bVar.f(iconCompat.f183g, 6);
        String string = iconCompat.f185i;
        if (bVar.e(7)) {
            string = ((c) bVar).f457e.readString();
        }
        iconCompat.f185i = string;
        String string2 = iconCompat.f186j;
        if (bVar.e(8)) {
            string2 = ((c) bVar).f457e.readString();
        }
        iconCompat.f186j = string2;
        iconCompat.f184h = PorterDuff.Mode.valueOf(iconCompat.f185i);
        switch (iconCompat.f178a) {
            case -1:
                Parcelable parcelable = iconCompat.f180d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f179b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f180d;
                if (parcelable2 != null) {
                    iconCompat.f179b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.c;
                iconCompat.f179b = bArr3;
                iconCompat.f178a = 3;
                iconCompat.f181e = 0;
                iconCompat.f182f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.c, Charset.forName("UTF-16"));
                iconCompat.f179b = str;
                if (iconCompat.f178a == 2 && iconCompat.f186j == null) {
                    iconCompat.f186j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f179b = iconCompat.c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, b bVar) {
        bVar.getClass();
        iconCompat.f185i = iconCompat.f184h.name();
        switch (iconCompat.f178a) {
            case -1:
                iconCompat.f180d = (Parcelable) iconCompat.f179b;
                break;
            case 1:
            case 5:
                iconCompat.f180d = (Parcelable) iconCompat.f179b;
                break;
            case 2:
                iconCompat.c = ((String) iconCompat.f179b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.c = (byte[]) iconCompat.f179b;
                break;
            case 4:
            case 6:
                iconCompat.c = iconCompat.f179b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i2 = iconCompat.f178a;
        if (-1 != i2) {
            bVar.h(1);
            ((c) bVar).f457e.writeInt(i2);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            bVar.h(2);
            Parcel parcel = ((c) bVar).f457e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f180d;
        if (parcelable != null) {
            bVar.h(3);
            ((c) bVar).f457e.writeParcelable(parcelable, 0);
        }
        int i3 = iconCompat.f181e;
        if (i3 != 0) {
            bVar.h(4);
            ((c) bVar).f457e.writeInt(i3);
        }
        int i4 = iconCompat.f182f;
        if (i4 != 0) {
            bVar.h(5);
            ((c) bVar).f457e.writeInt(i4);
        }
        ColorStateList colorStateList = iconCompat.f183g;
        if (colorStateList != null) {
            bVar.h(6);
            ((c) bVar).f457e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f185i;
        if (str != null) {
            bVar.h(7);
            ((c) bVar).f457e.writeString(str);
        }
        String str2 = iconCompat.f186j;
        if (str2 != null) {
            bVar.h(8);
            ((c) bVar).f457e.writeString(str2);
        }
    }
}
