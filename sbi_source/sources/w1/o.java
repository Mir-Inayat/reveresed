package w1;

import android.content.res.TypedArray;
import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f2546a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f2547b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2548d;

    public o(p pVar, androidx.emoji2.text.t tVar) {
        this.f2547b = pVar;
        TypedArray typedArray = (TypedArray) tVar.c;
        this.c = typedArray.getResourceId(28, 0);
        this.f2548d = typedArray.getResourceId(53, 0);
    }
}
