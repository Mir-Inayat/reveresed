package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import b1.b;
import b1.c;
import b1.d;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(b bVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        d dVarG = remoteActionCompat.f167a;
        boolean z = true;
        if (bVar.e(1)) {
            dVarG = bVar.g();
        }
        remoteActionCompat.f167a = (IconCompat) dVarG;
        CharSequence charSequence = remoteActionCompat.f168b;
        if (bVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((c) bVar).f457e);
        }
        remoteActionCompat.f168b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (bVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((c) bVar).f457e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.f169d = (PendingIntent) bVar.f(remoteActionCompat.f169d, 4);
        boolean z2 = remoteActionCompat.f170e;
        if (bVar.e(5)) {
            z2 = ((c) bVar).f457e.readInt() != 0;
        }
        remoteActionCompat.f170e = z2;
        boolean z3 = remoteActionCompat.f171f;
        if (!bVar.e(6)) {
            z = z3;
        } else if (((c) bVar).f457e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f171f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, b bVar) {
        bVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f167a;
        bVar.h(1);
        bVar.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f168b;
        bVar.h(2);
        Parcel parcel = ((c) bVar).f457e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        bVar.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f169d;
        bVar.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.f170e;
        bVar.h(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f171f;
        bVar.h(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
