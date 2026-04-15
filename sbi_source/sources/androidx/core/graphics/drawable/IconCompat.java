package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;
import y.c;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f177k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f179b;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f186j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f178a = -1;
    public byte[] c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Parcelable f180d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f181e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f182f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f183g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f184h = f177k;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f185i = null;

    public final String toString() {
        String str;
        int iIntValue;
        if (this.f178a == -1) {
            return String.valueOf(this.f179b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f178a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f178a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f179b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f179b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f186j);
                sb.append(" id=");
                int i2 = this.f178a;
                if (i2 == -1) {
                    int i3 = Build.VERSION.SDK_INT;
                    Object obj = this.f179b;
                    if (i3 >= 28) {
                        iIntValue = c.a(obj);
                    } else {
                        try {
                            iIntValue = ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
                        } catch (IllegalAccessException e3) {
                            Log.e("IconCompat", "Unable to get icon resource", e3);
                            iIntValue = 0;
                        } catch (NoSuchMethodException e4) {
                            Log.e("IconCompat", "Unable to get icon resource", e4);
                            iIntValue = 0;
                        } catch (InvocationTargetException e5) {
                            Log.e("IconCompat", "Unable to get icon resource", e5);
                            iIntValue = 0;
                        }
                    }
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("called getResId() on " + this);
                    }
                    iIntValue = this.f181e;
                }
                sb.append(String.format("0x%08x", Integer.valueOf(iIntValue)));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f181e);
                if (this.f182f != 0) {
                    sb.append(" off=");
                    sb.append(this.f182f);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f179b);
                break;
        }
        if (this.f183g != null) {
            sb.append(" tint=");
            sb.append(this.f183g);
        }
        if (this.f184h != f177k) {
            sb.append(" mode=");
            sb.append(this.f184h);
        }
        sb.append(")");
        return sb.toString();
    }
}
