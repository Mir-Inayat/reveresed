package i1;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import androidx.emoji2.text.n;
import f.v;
import f0.m0;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f1389a;

    public /* synthetic */ a(View view) {
        this.f1389a = view;
    }

    public boolean a(n nVar, int i2, Bundle bundle) {
        f0.d nVar2;
        v vVar = (v) this.f1389a;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 25 && (i2 & 1) != 0) {
            try {
                ((j0.g) nVar.f244b).a();
                Parcelable parcelable = (Parcelable) ((j0.g) nVar.f244b).d();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e3) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e3);
                return false;
            }
        }
        j0.g gVar = (j0.g) nVar.f244b;
        ClipData clipData = new ClipData(gVar.c(), new ClipData.Item(gVar.e()));
        if (i3 >= 31) {
            nVar2 = new n(clipData, 2);
        } else {
            f0.e eVar = new f0.e();
            eVar.f1239b = clipData;
            eVar.c = 2;
            nVar2 = eVar;
        }
        nVar2.n(gVar.b());
        nVar2.setExtras(bundle);
        return m0.f(vVar, nVar2.build()) == null;
    }
}
