package f0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class e implements d, f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1239b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f1241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Cloneable f1242f;

    public /* synthetic */ e() {
        this.f1238a = 0;
    }

    public void a(n1 n1Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if ((((a1) it.next()).f1225a.c() & 8) != 0) {
                ((View) this.f1241e).setTranslationY(d1.a.c(this.f1240d, 0, r3.f1225a.b()));
                return;
            }
        }
    }

    @Override // f0.d
    public g build() {
        return new g(new e(this));
    }

    @Override // f0.f
    public ClipData c() {
        return (ClipData) this.f1239b;
    }

    @Override // f0.f
    public int f() {
        return this.f1240d;
    }

    @Override // f0.f
    public ContentInfo h() {
        return null;
    }

    @Override // f0.d
    public void n(Uri uri) {
        this.f1241e = uri;
    }

    @Override // f0.f
    public int o() {
        return this.c;
    }

    @Override // f0.d
    public void setExtras(Bundle bundle) {
        this.f1242f = bundle;
    }

    @Override // f0.d
    public void t(int i2) {
        this.f1240d = i2;
    }

    public String toString() {
        String str;
        switch (this.f1238a) {
            case 1:
                Uri uri = (Uri) this.f1241e;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(((ClipData) this.f1239b).getDescription());
                sb.append(", source=");
                int i2 = this.c;
                sb.append(i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? String.valueOf(i2) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i3 = this.f1240d;
                sb.append((i3 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i3));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                sb.append(((Bundle) this.f1242f) != null ? ", hasExtras" : "");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int[], java.lang.Cloneable] */
    public e(View view) {
        this.f1238a = 2;
        this.f1242f = new int[2];
        this.f1241e = view;
    }

    public e(e eVar) {
        this.f1238a = 1;
        ClipData clipData = (ClipData) eVar.f1239b;
        clipData.getClass();
        this.f1239b = clipData;
        int i2 = eVar.c;
        if (i2 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i2 <= 5) {
            this.c = i2;
            int i3 = eVar.f1240d;
            if ((i3 & 1) == i3) {
                this.f1240d = i3;
                this.f1241e = (Uri) eVar.f1241e;
                this.f1242f = (Bundle) eVar.f1242f;
                return;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i3) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
    }
}
