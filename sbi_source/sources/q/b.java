package q;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1894a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1895b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f1896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f1897e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1898f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1899g;

    public b(b bVar, Object obj) {
        bVar.getClass();
        this.f1895b = bVar.f1895b;
        b(obj);
    }

    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.f2044d);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        int i2 = 0;
        boolean z = false;
        Object objValueOf = null;
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i3);
            int i4 = 1;
            if (index == 0) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == 10) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z = true;
            } else if (index == 1) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                i2 = 6;
            } else {
                int i5 = 3;
                if (index == 3) {
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else {
                    i5 = 4;
                    if (index == 2) {
                        objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            i5 = 5;
                            if (index == 5) {
                                objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                                i2 = 2;
                            } else {
                                if (index == 6) {
                                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                                } else if (index == 9) {
                                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                                } else {
                                    i4 = 8;
                                    if (index == 8) {
                                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                        if (resourceId == -1) {
                                            resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                                        }
                                        objValueOf = Integer.valueOf(resourceId);
                                    }
                                }
                                i2 = i4;
                            }
                        }
                        i2 = 7;
                    }
                }
                i2 = i5;
            }
        }
        if (string != null && objValueOf != null) {
            b bVar = new b();
            bVar.f1895b = i2;
            bVar.f1894a = z;
            bVar.b(objValueOf);
            map.put(string, bVar);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void b(Object obj) {
        switch (l.f.a(this.f1895b)) {
            case 0:
            case 7:
                this.c = ((Integer) obj).intValue();
                break;
            case 1:
                this.f1896d = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f1899g = ((Integer) obj).intValue();
                break;
            case 4:
                this.f1897e = (String) obj;
                break;
            case 5:
                this.f1898f = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.f1896d = ((Float) obj).floatValue();
                break;
        }
    }
}
