package c0;

import android.util.Base64;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f468b;
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f470e;

    public d(String str, String str2, String str3, List list) {
        str.getClass();
        this.f467a = str;
        str2.getClass();
        this.f468b = str2;
        this.c = str3;
        list.getClass();
        this.f469d = list;
        this.f470e = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f467a + ", mProviderPackage: " + this.f468b + ", mQuery: " + this.c + ", mCertificates:");
        int i2 = 0;
        while (true) {
            List list = this.f469d;
            if (i2 >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i2);
            for (int i3 = 0; i3 < list2.size(); i3++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i3), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i2++;
        }
    }
}
