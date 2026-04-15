package q;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f2037d = {0, 4, 8};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f2038e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final SparseIntArray f2039f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f2040a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2041b = true;
    public final HashMap c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2038e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f2039f = sparseIntArray2;
        sparseIntArray.append(81, 25);
        sparseIntArray.append(82, 26);
        sparseIntArray.append(84, 29);
        sparseIntArray.append(85, 30);
        sparseIntArray.append(91, 36);
        sparseIntArray.append(90, 35);
        sparseIntArray.append(62, 4);
        sparseIntArray.append(61, 3);
        sparseIntArray.append(57, 1);
        sparseIntArray.append(59, 91);
        sparseIntArray.append(58, 92);
        sparseIntArray.append(100, 6);
        sparseIntArray.append(101, 7);
        sparseIntArray.append(69, 17);
        sparseIntArray.append(70, 18);
        sparseIntArray.append(71, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(86, 32);
        sparseIntArray.append(87, 33);
        sparseIntArray.append(68, 10);
        sparseIntArray.append(67, 9);
        sparseIntArray.append(105, 13);
        sparseIntArray.append(108, 16);
        sparseIntArray.append(106, 14);
        sparseIntArray.append(103, 11);
        sparseIntArray.append(107, 15);
        sparseIntArray.append(104, 12);
        sparseIntArray.append(94, 40);
        sparseIntArray.append(79, 39);
        sparseIntArray.append(78, 41);
        sparseIntArray.append(93, 42);
        sparseIntArray.append(77, 20);
        sparseIntArray.append(92, 37);
        sparseIntArray.append(66, 5);
        sparseIntArray.append(80, 87);
        sparseIntArray.append(89, 87);
        sparseIntArray.append(83, 87);
        sparseIntArray.append(60, 87);
        sparseIntArray.append(56, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(95, 95);
        sparseIntArray.append(72, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(96, 54);
        sparseIntArray.append(73, 55);
        sparseIntArray.append(97, 56);
        sparseIntArray.append(74, 57);
        sparseIntArray.append(98, 58);
        sparseIntArray.append(75, 59);
        sparseIntArray.append(63, 61);
        sparseIntArray.append(65, 62);
        sparseIntArray.append(64, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(120, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(121, 67);
        sparseIntArray.append(112, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(111, 68);
        sparseIntArray.append(99, 69);
        sparseIntArray.append(76, 70);
        sparseIntArray.append(110, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(113, 76);
        sparseIntArray.append(88, 77);
        sparseIntArray.append(122, 78);
        sparseIntArray.append(55, 80);
        sparseIntArray.append(54, 81);
        sparseIntArray.append(115, 82);
        sparseIntArray.append(119, 83);
        sparseIntArray.append(118, 84);
        sparseIntArray.append(117, 85);
        sparseIntArray.append(116, 86);
        sparseIntArray2.append(84, 6);
        sparseIntArray2.append(84, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(88, 13);
        sparseIntArray2.append(91, 16);
        sparseIntArray2.append(89, 14);
        sparseIntArray2.append(86, 11);
        sparseIntArray2.append(90, 15);
        sparseIntArray2.append(87, 12);
        sparseIntArray2.append(77, 40);
        sparseIntArray2.append(70, 39);
        sparseIntArray2.append(69, 41);
        sparseIntArray2.append(76, 42);
        sparseIntArray2.append(68, 20);
        sparseIntArray2.append(75, 37);
        sparseIntArray2.append(59, 5);
        sparseIntArray2.append(71, 87);
        sparseIntArray2.append(74, 87);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(55, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(78, 95);
        sparseIntArray2.append(63, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(79, 54);
        sparseIntArray2.append(64, 55);
        sparseIntArray2.append(80, 56);
        sparseIntArray2.append(65, 57);
        sparseIntArray2.append(81, 58);
        sparseIntArray2.append(66, 59);
        sparseIntArray2.append(58, 62);
        sparseIntArray2.append(57, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(104, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(105, 67);
        sparseIntArray2.append(95, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(96, 98);
        sparseIntArray2.append(94, 68);
        sparseIntArray2.append(82, 69);
        sparseIntArray2.append(67, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(97, 76);
        sparseIntArray2.append(73, 77);
        sparseIntArray2.append(106, 78);
        sparseIntArray2.append(54, 80);
        sparseIntArray2.append(53, 81);
        sparseIntArray2.append(99, 82);
        sparseIntArray2.append(103, 83);
        sparseIntArray2.append(102, 84);
        sparseIntArray2.append(101, 85);
        sparseIntArray2.append(100, 86);
        sparseIntArray2.append(93, 97);
    }

    public static int[] c(a aVar, String str) {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = aVar.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < strArrSplit.length) {
            String strTrim = strArrSplit[i2].trim();
            Object obj = null;
            try {
                iIntValue = q.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && aVar.isInEditMode() && (aVar.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) aVar.getParent();
                if (strTrim != null) {
                    HashMap map = constraintLayout.f139m;
                    if (map != null && map.containsKey(strTrim)) {
                        obj = constraintLayout.f139m.get(strTrim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i3] = iIntValue;
            i2++;
            i3++;
        }
        return i3 != strArrSplit.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    public static i d(Context context, AttributeSet attributeSet, boolean z) {
        int i2;
        int i3;
        i iVar = new i();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? r.c : r.f2042a);
        l lVar = iVar.f1969b;
        m mVar = iVar.f1971e;
        k kVar = iVar.c;
        j jVar = iVar.f1970d;
        int[] iArr = f2037d;
        String[] strArr = m.a.f1561a;
        SparseIntArray sparseIntArray = f2038e;
        if (z) {
            h hVar = new h();
            hVar.f1957a = new int[10];
            hVar.f1958b = new int[10];
            hVar.c = 0;
            hVar.f1959d = new int[10];
            hVar.f1960e = new float[10];
            hVar.f1961f = 0;
            hVar.f1962g = new int[5];
            hVar.f1963h = new String[5];
            hVar.f1964i = 0;
            hVar.f1965j = new int[4];
            hVar.f1966k = new boolean[4];
            hVar.f1967l = 0;
            kVar.getClass();
            jVar.getClass();
            mVar.getClass();
            int i4 = 0;
            for (int indexCount = typedArrayObtainStyledAttributes.getIndexCount(); i4 < indexCount; indexCount = i3) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                int i5 = i4;
                switch (f2039f.get(index)) {
                    case 2:
                        i3 = indexCount;
                        hVar.b(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.H));
                        continue;
                        i4 = i5 + 1;
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder sb = new StringBuilder("Unknown attribute 0x");
                        i3 = indexCount;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        break;
                    case 5:
                        i3 = indexCount;
                        hVar.d(typedArrayObtainStyledAttributes.getString(index), 5);
                        continue;
                        i4 = i5 + 1;
                        break;
                    case 6:
                        i3 = indexCount;
                        hVar.b(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, jVar.B));
                        break;
                    case 7:
                        i3 = indexCount;
                        hVar.b(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, jVar.C));
                        break;
                    case 8:
                        i3 = indexCount;
                        hVar.b(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.I));
                        break;
                    case 11:
                        i3 = indexCount;
                        hVar.b(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.O));
                        break;
                    case 12:
                        i3 = indexCount;
                        hVar.b(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.P));
                        break;
                    case 13:
                        i3 = indexCount;
                        hVar.b(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.L));
                        break;
                    case 14:
                        i3 = indexCount;
                        hVar.b(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.N));
                        break;
                    case 15:
                        i3 = indexCount;
                        hVar.b(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.Q));
                        break;
                    case 16:
                        i3 = indexCount;
                        hVar.b(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.M));
                        break;
                    case 17:
                        i3 = indexCount;
                        hVar.b(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, jVar.f1979d));
                        break;
                    case 18:
                        i3 = indexCount;
                        hVar.b(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, jVar.f1981e));
                        break;
                    case 19:
                        i3 = indexCount;
                        hVar.a(19, typedArrayObtainStyledAttributes.getFloat(index, jVar.f1983f));
                        break;
                    case 20:
                        i3 = indexCount;
                        hVar.a(20, typedArrayObtainStyledAttributes.getFloat(index, jVar.f2008v));
                        break;
                    case 21:
                        i3 = indexCount;
                        hVar.b(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, jVar.c));
                        break;
                    case 22:
                        i3 = indexCount;
                        hVar.b(22, iArr[typedArrayObtainStyledAttributes.getInt(index, lVar.f2021a)]);
                        break;
                    case 23:
                        i3 = indexCount;
                        hVar.b(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, jVar.f1976b));
                        break;
                    case 24:
                        i3 = indexCount;
                        hVar.b(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.E));
                        break;
                    case 27:
                        i3 = indexCount;
                        hVar.b(27, typedArrayObtainStyledAttributes.getInt(index, jVar.D));
                        break;
                    case 28:
                        i3 = indexCount;
                        hVar.b(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.F));
                        break;
                    case 31:
                        i3 = indexCount;
                        hVar.b(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.J));
                        break;
                    case 34:
                        i3 = indexCount;
                        hVar.b(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.G));
                        break;
                    case 37:
                        i3 = indexCount;
                        hVar.a(37, typedArrayObtainStyledAttributes.getFloat(index, jVar.f2009w));
                        break;
                    case 38:
                        i3 = indexCount;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, iVar.f1968a);
                        iVar.f1968a = resourceId;
                        hVar.b(38, resourceId);
                        break;
                    case 39:
                        i3 = indexCount;
                        hVar.a(39, typedArrayObtainStyledAttributes.getFloat(index, jVar.T));
                        break;
                    case 40:
                        i3 = indexCount;
                        hVar.a(40, typedArrayObtainStyledAttributes.getFloat(index, jVar.S));
                        break;
                    case 41:
                        i3 = indexCount;
                        hVar.b(41, typedArrayObtainStyledAttributes.getInt(index, jVar.U));
                        break;
                    case 42:
                        i3 = indexCount;
                        hVar.b(42, typedArrayObtainStyledAttributes.getInt(index, jVar.V));
                        break;
                    case 43:
                        i3 = indexCount;
                        hVar.a(43, typedArrayObtainStyledAttributes.getFloat(index, lVar.c));
                        break;
                    case 44:
                        i3 = indexCount;
                        hVar.c(44, true);
                        hVar.a(44, typedArrayObtainStyledAttributes.getDimension(index, mVar.f2036m));
                        break;
                    case 45:
                        i3 = indexCount;
                        hVar.a(45, typedArrayObtainStyledAttributes.getFloat(index, mVar.f2026b));
                        break;
                    case 46:
                        i3 = indexCount;
                        hVar.a(46, typedArrayObtainStyledAttributes.getFloat(index, mVar.c));
                        break;
                    case 47:
                        i3 = indexCount;
                        hVar.a(47, typedArrayObtainStyledAttributes.getFloat(index, mVar.f2027d));
                        break;
                    case 48:
                        i3 = indexCount;
                        hVar.a(48, typedArrayObtainStyledAttributes.getFloat(index, mVar.f2028e));
                        break;
                    case 49:
                        i3 = indexCount;
                        hVar.a(49, typedArrayObtainStyledAttributes.getDimension(index, mVar.f2029f));
                        break;
                    case 50:
                        i3 = indexCount;
                        hVar.a(50, typedArrayObtainStyledAttributes.getDimension(index, mVar.f2030g));
                        break;
                    case 51:
                        i3 = indexCount;
                        hVar.a(51, typedArrayObtainStyledAttributes.getDimension(index, mVar.f2032i));
                        break;
                    case 52:
                        i3 = indexCount;
                        hVar.a(52, typedArrayObtainStyledAttributes.getDimension(index, mVar.f2033j));
                        break;
                    case 53:
                        i3 = indexCount;
                        hVar.a(53, typedArrayObtainStyledAttributes.getDimension(index, mVar.f2034k));
                        break;
                    case 54:
                        i3 = indexCount;
                        hVar.b(54, typedArrayObtainStyledAttributes.getInt(index, jVar.W));
                        break;
                    case 55:
                        i3 = indexCount;
                        hVar.b(55, typedArrayObtainStyledAttributes.getInt(index, jVar.X));
                        break;
                    case 56:
                        i3 = indexCount;
                        hVar.b(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.Y));
                        break;
                    case 57:
                        i3 = indexCount;
                        hVar.b(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.Z));
                        break;
                    case 58:
                        i3 = indexCount;
                        hVar.b(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.f1975a0));
                        break;
                    case 59:
                        i3 = indexCount;
                        hVar.b(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.f1977b0));
                        break;
                    case 60:
                        i3 = indexCount;
                        hVar.a(60, typedArrayObtainStyledAttributes.getFloat(index, mVar.f2025a));
                        break;
                    case 62:
                        i3 = indexCount;
                        hVar.b(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.z));
                        break;
                    case 63:
                        i3 = indexCount;
                        hVar.a(63, typedArrayObtainStyledAttributes.getFloat(index, jVar.A));
                        break;
                    case 64:
                        i3 = indexCount;
                        hVar.b(64, f(typedArrayObtainStyledAttributes, index, kVar.f2013a));
                        break;
                    case 65:
                        i3 = indexCount;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            hVar.d(typedArrayObtainStyledAttributes.getString(index), 65);
                        } else {
                            hVar.d(strArr[typedArrayObtainStyledAttributes.getInteger(index, 0)], 65);
                        }
                        break;
                    case 66:
                        i3 = indexCount;
                        hVar.b(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        i3 = indexCount;
                        hVar.a(67, typedArrayObtainStyledAttributes.getFloat(index, kVar.f2016e));
                        break;
                    case 68:
                        i3 = indexCount;
                        hVar.a(68, typedArrayObtainStyledAttributes.getFloat(index, lVar.f2023d));
                        break;
                    case 69:
                        i3 = indexCount;
                        hVar.a(69, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 70:
                        i3 = indexCount;
                        hVar.a(70, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        i3 = indexCount;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i3 = indexCount;
                        hVar.b(72, typedArrayObtainStyledAttributes.getInt(index, jVar.f1982e0));
                        break;
                    case 73:
                        i3 = indexCount;
                        hVar.b(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.f1984f0));
                        break;
                    case 74:
                        i3 = indexCount;
                        hVar.d(typedArrayObtainStyledAttributes.getString(index), 74);
                        break;
                    case 75:
                        i3 = indexCount;
                        hVar.c(75, typedArrayObtainStyledAttributes.getBoolean(index, jVar.f1998m0));
                        break;
                    case 76:
                        i3 = indexCount;
                        hVar.b(76, typedArrayObtainStyledAttributes.getInt(index, kVar.c));
                        break;
                    case 77:
                        i3 = indexCount;
                        hVar.d(typedArrayObtainStyledAttributes.getString(index), 77);
                        break;
                    case 78:
                        i3 = indexCount;
                        hVar.b(78, typedArrayObtainStyledAttributes.getInt(index, lVar.f2022b));
                        break;
                    case 79:
                        i3 = indexCount;
                        hVar.a(79, typedArrayObtainStyledAttributes.getFloat(index, kVar.f2015d));
                        break;
                    case 80:
                        i3 = indexCount;
                        hVar.c(80, typedArrayObtainStyledAttributes.getBoolean(index, jVar.f1994k0));
                        break;
                    case 81:
                        i3 = indexCount;
                        hVar.c(81, typedArrayObtainStyledAttributes.getBoolean(index, jVar.f1996l0));
                        break;
                    case 82:
                        i3 = indexCount;
                        hVar.b(82, typedArrayObtainStyledAttributes.getInteger(index, kVar.f2014b));
                        break;
                    case 83:
                        i3 = indexCount;
                        hVar.b(83, f(typedArrayObtainStyledAttributes, index, mVar.f2031h));
                        break;
                    case 84:
                        i3 = indexCount;
                        hVar.b(84, typedArrayObtainStyledAttributes.getInteger(index, kVar.f2018g));
                        break;
                    case 85:
                        i3 = indexCount;
                        hVar.a(85, typedArrayObtainStyledAttributes.getFloat(index, kVar.f2017f));
                        break;
                    case 86:
                        i3 = indexCount;
                        int i6 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i6 == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            kVar.f2020i = resourceId2;
                            hVar.b(89, resourceId2);
                            if (kVar.f2020i != -1) {
                                hVar.b(88, -2);
                            }
                        } else if (i6 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            kVar.f2019h = string;
                            hVar.d(string, 90);
                            if (kVar.f2019h.indexOf("/") > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                kVar.f2020i = resourceId3;
                                hVar.b(89, resourceId3);
                                hVar.b(88, -2);
                            } else {
                                hVar.b(88, -1);
                            }
                        } else {
                            hVar.b(88, typedArrayObtainStyledAttributes.getInteger(index, kVar.f2020i));
                        }
                        break;
                    case 87:
                        i3 = indexCount;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        i3 = indexCount;
                        hVar.b(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.K));
                        break;
                    case 94:
                        i3 = indexCount;
                        hVar.b(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.R));
                        break;
                    case 95:
                        i3 = indexCount;
                        g(hVar, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i3 = indexCount;
                        g(hVar, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i3 = indexCount;
                        hVar.b(97, typedArrayObtainStyledAttributes.getInt(index, jVar.f2000n0));
                        break;
                    case 98:
                        i3 = indexCount;
                        int i7 = p.a.f1873s;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            iVar.f1968a = typedArrayObtainStyledAttributes.getResourceId(index, iVar.f1968a);
                        }
                        break;
                }
                i4 = i5 + 1;
            }
        } else {
            int i8 = 0;
            for (int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount(); i8 < indexCount2; indexCount2 = i2) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i8);
                if (index2 != 1 && 23 != index2) {
                    if (24 != index2) {
                        kVar.getClass();
                        jVar.getClass();
                        mVar.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i2 = indexCount2;
                        jVar.f2001o = f(typedArrayObtainStyledAttributes, index2, jVar.f2001o);
                        continue;
                        i8++;
                        break;
                    case 2:
                        i2 = indexCount2;
                        jVar.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.H);
                        continue;
                        i8++;
                        break;
                    case 3:
                        i2 = indexCount2;
                        jVar.f1999n = f(typedArrayObtainStyledAttributes, index2, jVar.f1999n);
                        continue;
                        i8++;
                        break;
                    case 4:
                        i2 = indexCount2;
                        jVar.f1997m = f(typedArrayObtainStyledAttributes, index2, jVar.f1997m);
                        continue;
                        i8++;
                        break;
                    case 5:
                        i2 = indexCount2;
                        jVar.f2010x = typedArrayObtainStyledAttributes.getString(index2);
                        continue;
                        i8++;
                        break;
                    case 6:
                        i2 = indexCount2;
                        jVar.B = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, jVar.B);
                        continue;
                        i8++;
                        break;
                    case 7:
                        i2 = indexCount2;
                        jVar.C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, jVar.C);
                        continue;
                        i8++;
                        break;
                    case 8:
                        i2 = indexCount2;
                        jVar.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.I);
                        continue;
                        i8++;
                        break;
                    case 9:
                        i2 = indexCount2;
                        jVar.f2007u = f(typedArrayObtainStyledAttributes, index2, jVar.f2007u);
                        continue;
                        i8++;
                        break;
                    case 10:
                        i2 = indexCount2;
                        jVar.f2006t = f(typedArrayObtainStyledAttributes, index2, jVar.f2006t);
                        continue;
                        i8++;
                        break;
                    case 11:
                        i2 = indexCount2;
                        jVar.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.O);
                        continue;
                        i8++;
                        break;
                    case 12:
                        i2 = indexCount2;
                        jVar.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.P);
                        continue;
                        i8++;
                        break;
                    case 13:
                        i2 = indexCount2;
                        jVar.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.L);
                        continue;
                        i8++;
                        break;
                    case 14:
                        i2 = indexCount2;
                        jVar.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.N);
                        continue;
                        i8++;
                        break;
                    case 15:
                        i2 = indexCount2;
                        jVar.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.Q);
                        continue;
                        i8++;
                        break;
                    case 16:
                        i2 = indexCount2;
                        jVar.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.M);
                        continue;
                        i8++;
                        break;
                    case 17:
                        i2 = indexCount2;
                        jVar.f1979d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, jVar.f1979d);
                        continue;
                        i8++;
                        break;
                    case 18:
                        i2 = indexCount2;
                        jVar.f1981e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, jVar.f1981e);
                        continue;
                        i8++;
                        break;
                    case 19:
                        i2 = indexCount2;
                        jVar.f1983f = typedArrayObtainStyledAttributes.getFloat(index2, jVar.f1983f);
                        continue;
                        i8++;
                        break;
                    case 20:
                        i2 = indexCount2;
                        jVar.f2008v = typedArrayObtainStyledAttributes.getFloat(index2, jVar.f2008v);
                        continue;
                        i8++;
                        break;
                    case 21:
                        i2 = indexCount2;
                        jVar.c = typedArrayObtainStyledAttributes.getLayoutDimension(index2, jVar.c);
                        continue;
                        i8++;
                        break;
                    case 22:
                        i2 = indexCount2;
                        int i9 = typedArrayObtainStyledAttributes.getInt(index2, lVar.f2021a);
                        lVar.f2021a = i9;
                        lVar.f2021a = iArr[i9];
                        continue;
                        i8++;
                        break;
                    case 23:
                        i2 = indexCount2;
                        jVar.f1976b = typedArrayObtainStyledAttributes.getLayoutDimension(index2, jVar.f1976b);
                        continue;
                        i8++;
                        break;
                    case 24:
                        i2 = indexCount2;
                        jVar.E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.E);
                        continue;
                        i8++;
                        break;
                    case 25:
                        i2 = indexCount2;
                        jVar.f1985g = f(typedArrayObtainStyledAttributes, index2, jVar.f1985g);
                        continue;
                        i8++;
                        break;
                    case 26:
                        i2 = indexCount2;
                        jVar.f1987h = f(typedArrayObtainStyledAttributes, index2, jVar.f1987h);
                        continue;
                        i8++;
                        break;
                    case 27:
                        i2 = indexCount2;
                        jVar.D = typedArrayObtainStyledAttributes.getInt(index2, jVar.D);
                        continue;
                        i8++;
                        break;
                    case 28:
                        i2 = indexCount2;
                        jVar.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.F);
                        continue;
                        i8++;
                        break;
                    case 29:
                        i2 = indexCount2;
                        jVar.f1989i = f(typedArrayObtainStyledAttributes, index2, jVar.f1989i);
                        continue;
                        i8++;
                        break;
                    case 30:
                        i2 = indexCount2;
                        jVar.f1991j = f(typedArrayObtainStyledAttributes, index2, jVar.f1991j);
                        continue;
                        i8++;
                        break;
                    case 31:
                        i2 = indexCount2;
                        jVar.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.J);
                        continue;
                        i8++;
                        break;
                    case 32:
                        i2 = indexCount2;
                        jVar.f2004r = f(typedArrayObtainStyledAttributes, index2, jVar.f2004r);
                        continue;
                        i8++;
                        break;
                    case 33:
                        i2 = indexCount2;
                        jVar.f2005s = f(typedArrayObtainStyledAttributes, index2, jVar.f2005s);
                        continue;
                        i8++;
                        break;
                    case 34:
                        i2 = indexCount2;
                        jVar.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.G);
                        continue;
                        i8++;
                        break;
                    case 35:
                        i2 = indexCount2;
                        jVar.f1995l = f(typedArrayObtainStyledAttributes, index2, jVar.f1995l);
                        continue;
                        i8++;
                        break;
                    case 36:
                        i2 = indexCount2;
                        jVar.f1993k = f(typedArrayObtainStyledAttributes, index2, jVar.f1993k);
                        continue;
                        i8++;
                        break;
                    case 37:
                        i2 = indexCount2;
                        jVar.f2009w = typedArrayObtainStyledAttributes.getFloat(index2, jVar.f2009w);
                        continue;
                        i8++;
                        break;
                    case 38:
                        i2 = indexCount2;
                        iVar.f1968a = typedArrayObtainStyledAttributes.getResourceId(index2, iVar.f1968a);
                        continue;
                        i8++;
                        break;
                    case 39:
                        i2 = indexCount2;
                        jVar.T = typedArrayObtainStyledAttributes.getFloat(index2, jVar.T);
                        continue;
                        i8++;
                        break;
                    case 40:
                        i2 = indexCount2;
                        jVar.S = typedArrayObtainStyledAttributes.getFloat(index2, jVar.S);
                        continue;
                        i8++;
                        break;
                    case 41:
                        i2 = indexCount2;
                        jVar.U = typedArrayObtainStyledAttributes.getInt(index2, jVar.U);
                        continue;
                        i8++;
                        break;
                    case 42:
                        i2 = indexCount2;
                        jVar.V = typedArrayObtainStyledAttributes.getInt(index2, jVar.V);
                        continue;
                        i8++;
                        break;
                    case 43:
                        i2 = indexCount2;
                        lVar.c = typedArrayObtainStyledAttributes.getFloat(index2, lVar.c);
                        continue;
                        i8++;
                        break;
                    case 44:
                        i2 = indexCount2;
                        mVar.f2035l = true;
                        mVar.f2036m = typedArrayObtainStyledAttributes.getDimension(index2, mVar.f2036m);
                        continue;
                        i8++;
                        break;
                    case 45:
                        i2 = indexCount2;
                        mVar.f2026b = typedArrayObtainStyledAttributes.getFloat(index2, mVar.f2026b);
                        continue;
                        i8++;
                        break;
                    case 46:
                        i2 = indexCount2;
                        mVar.c = typedArrayObtainStyledAttributes.getFloat(index2, mVar.c);
                        continue;
                        i8++;
                        break;
                    case 47:
                        i2 = indexCount2;
                        mVar.f2027d = typedArrayObtainStyledAttributes.getFloat(index2, mVar.f2027d);
                        continue;
                        i8++;
                        break;
                    case 48:
                        i2 = indexCount2;
                        mVar.f2028e = typedArrayObtainStyledAttributes.getFloat(index2, mVar.f2028e);
                        continue;
                        i8++;
                        break;
                    case 49:
                        i2 = indexCount2;
                        mVar.f2029f = typedArrayObtainStyledAttributes.getDimension(index2, mVar.f2029f);
                        continue;
                        i8++;
                        break;
                    case 50:
                        i2 = indexCount2;
                        mVar.f2030g = typedArrayObtainStyledAttributes.getDimension(index2, mVar.f2030g);
                        continue;
                        i8++;
                        break;
                    case 51:
                        i2 = indexCount2;
                        mVar.f2032i = typedArrayObtainStyledAttributes.getDimension(index2, mVar.f2032i);
                        continue;
                        i8++;
                        break;
                    case 52:
                        i2 = indexCount2;
                        mVar.f2033j = typedArrayObtainStyledAttributes.getDimension(index2, mVar.f2033j);
                        continue;
                        i8++;
                        break;
                    case 53:
                        i2 = indexCount2;
                        mVar.f2034k = typedArrayObtainStyledAttributes.getDimension(index2, mVar.f2034k);
                        continue;
                        i8++;
                        break;
                    case 54:
                        i2 = indexCount2;
                        jVar.W = typedArrayObtainStyledAttributes.getInt(index2, jVar.W);
                        continue;
                        i8++;
                        break;
                    case 55:
                        i2 = indexCount2;
                        jVar.X = typedArrayObtainStyledAttributes.getInt(index2, jVar.X);
                        continue;
                        i8++;
                        break;
                    case 56:
                        i2 = indexCount2;
                        jVar.Y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.Y);
                        continue;
                        i8++;
                        break;
                    case 57:
                        i2 = indexCount2;
                        jVar.Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.Z);
                        continue;
                        i8++;
                        break;
                    case 58:
                        i2 = indexCount2;
                        jVar.f1975a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.f1975a0);
                        continue;
                        i8++;
                        break;
                    case 59:
                        i2 = indexCount2;
                        jVar.f1977b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.f1977b0);
                        continue;
                        i8++;
                        break;
                    case 60:
                        i2 = indexCount2;
                        mVar.f2025a = typedArrayObtainStyledAttributes.getFloat(index2, mVar.f2025a);
                        continue;
                        i8++;
                        break;
                    case 61:
                        i2 = indexCount2;
                        jVar.f2011y = f(typedArrayObtainStyledAttributes, index2, jVar.f2011y);
                        continue;
                        i8++;
                        break;
                    case 62:
                        i2 = indexCount2;
                        jVar.z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.z);
                        continue;
                        i8++;
                        break;
                    case 63:
                        i2 = indexCount2;
                        jVar.A = typedArrayObtainStyledAttributes.getFloat(index2, jVar.A);
                        continue;
                        i8++;
                        break;
                    case 64:
                        i2 = indexCount2;
                        kVar.f2013a = f(typedArrayObtainStyledAttributes, index2, kVar.f2013a);
                        continue;
                        i8++;
                        break;
                    case 65:
                        i2 = indexCount2;
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index2);
                            kVar.getClass();
                        } else {
                            String str = strArr[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                            kVar.getClass();
                            i8++;
                        }
                        break;
                    case 66:
                        i2 = indexCount2;
                        typedArrayObtainStyledAttributes.getInt(index2, 0);
                        kVar.getClass();
                        continue;
                        i8++;
                        break;
                    case 67:
                        i2 = indexCount2;
                        kVar.f2016e = typedArrayObtainStyledAttributes.getFloat(index2, kVar.f2016e);
                        break;
                    case 68:
                        i2 = indexCount2;
                        lVar.f2023d = typedArrayObtainStyledAttributes.getFloat(index2, lVar.f2023d);
                        break;
                    case 69:
                        i2 = indexCount2;
                        jVar.f1978c0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        i2 = indexCount2;
                        jVar.f1980d0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        i2 = indexCount2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i2 = indexCount2;
                        jVar.f1982e0 = typedArrayObtainStyledAttributes.getInt(index2, jVar.f1982e0);
                        break;
                    case 73:
                        i2 = indexCount2;
                        jVar.f1984f0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.f1984f0);
                        break;
                    case 74:
                        i2 = indexCount2;
                        jVar.f1990i0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        i2 = indexCount2;
                        jVar.f1998m0 = typedArrayObtainStyledAttributes.getBoolean(index2, jVar.f1998m0);
                        break;
                    case 76:
                        i2 = indexCount2;
                        kVar.c = typedArrayObtainStyledAttributes.getInt(index2, kVar.c);
                        break;
                    case 77:
                        i2 = indexCount2;
                        jVar.f1992j0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        i2 = indexCount2;
                        lVar.f2022b = typedArrayObtainStyledAttributes.getInt(index2, lVar.f2022b);
                        break;
                    case 79:
                        i2 = indexCount2;
                        kVar.f2015d = typedArrayObtainStyledAttributes.getFloat(index2, kVar.f2015d);
                        break;
                    case 80:
                        i2 = indexCount2;
                        jVar.f1994k0 = typedArrayObtainStyledAttributes.getBoolean(index2, jVar.f1994k0);
                        break;
                    case 81:
                        i2 = indexCount2;
                        jVar.f1996l0 = typedArrayObtainStyledAttributes.getBoolean(index2, jVar.f1996l0);
                        break;
                    case 82:
                        i2 = indexCount2;
                        kVar.f2014b = typedArrayObtainStyledAttributes.getInteger(index2, kVar.f2014b);
                        break;
                    case 83:
                        i2 = indexCount2;
                        mVar.f2031h = f(typedArrayObtainStyledAttributes, index2, mVar.f2031h);
                        break;
                    case 84:
                        i2 = indexCount2;
                        kVar.f2018g = typedArrayObtainStyledAttributes.getInteger(index2, kVar.f2018g);
                        break;
                    case 85:
                        i2 = indexCount2;
                        kVar.f2017f = typedArrayObtainStyledAttributes.getFloat(index2, kVar.f2017f);
                        break;
                    case 86:
                        i2 = indexCount2;
                        int i10 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i10 == 1) {
                            kVar.f2020i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i10 == 3) {
                            String string2 = typedArrayObtainStyledAttributes.getString(index2);
                            kVar.f2019h = string2;
                            if (string2.indexOf("/") > 0) {
                                kVar.f2020i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, kVar.f2020i);
                        }
                        break;
                    case 87:
                        i2 = indexCount2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                        i2 = indexCount2;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index2));
                        Log.w("ConstraintSet", sb2.toString());
                        break;
                    case 91:
                        i2 = indexCount2;
                        jVar.f2002p = f(typedArrayObtainStyledAttributes, index2, jVar.f2002p);
                        break;
                    case 92:
                        i2 = indexCount2;
                        jVar.f2003q = f(typedArrayObtainStyledAttributes, index2, jVar.f2003q);
                        break;
                    case 93:
                        i2 = indexCount2;
                        jVar.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.K);
                        break;
                    case 94:
                        i2 = indexCount2;
                        jVar.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.R);
                        break;
                    case 95:
                        i2 = indexCount2;
                        g(jVar, typedArrayObtainStyledAttributes, index2, 0);
                        continue;
                        i8++;
                        break;
                    case 96:
                        i2 = indexCount2;
                        g(jVar, typedArrayObtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        i2 = indexCount2;
                        jVar.f2000n0 = typedArrayObtainStyledAttributes.getInt(index2, jVar.f2000n0);
                        break;
                }
                i8++;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return iVar;
    }

    public static int f(TypedArray typedArray, int i2, int i3) {
        int resourceId = typedArray.getResourceId(i2, i3);
        return resourceId == -1 ? typedArray.getInt(i2, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void g(java.lang.Object r7, android.content.res.TypedArray r8, int r9, int r10) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q.n.g(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void h(e eVar, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i2 = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                i2 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                i = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f3 = Float.parseFloat(strSubstring3);
                        float f4 = Float.parseFloat(strSubstring4);
                        if (f3 > 0.0f && f4 > 0.0f) {
                            if (i2 == 1) {
                                Math.abs(f4 / f3);
                            } else {
                                Math.abs(f3 / f4);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        eVar.F = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(ConstraintLayout constraintLayout) {
        HashSet hashSet;
        int i2;
        int i3;
        String str;
        HashMap map;
        String resourceEntryName;
        n nVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map2 = nVar.c;
        HashSet<Integer> hashSet2 = new HashSet(map2.keySet());
        int i4 = 0;
        while (i4 < childCount) {
            View childAt = constraintLayout.getChildAt(i4);
            int id = childAt.getId();
            if (!map2.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    resourceEntryName = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    resourceEntryName = "UNKNOWN";
                }
                sb.append(resourceEntryName);
                Log.w("ConstraintSet", sb.toString());
            } else {
                if (nVar.f2041b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (map2.containsKey(Integer.valueOf(id))) {
                        hashSet2.remove(Integer.valueOf(id));
                        i iVar = (i) map2.get(Integer.valueOf(id));
                        if (iVar != null) {
                            l lVar = iVar.f1969b;
                            j jVar = iVar.f1970d;
                            m mVar = iVar.f1971e;
                            if (childAt instanceof a) {
                                jVar.f1986g0 = 1;
                                a aVar = (a) childAt;
                                aVar.setId(id);
                                aVar.setType(jVar.f1982e0);
                                aVar.setMargin(jVar.f1984f0);
                                aVar.setAllowsGoneWidget(jVar.f1998m0);
                                int[] iArr = jVar.f1988h0;
                                if (iArr != null) {
                                    aVar.setReferencedIds(iArr);
                                } else {
                                    String str2 = jVar.f1990i0;
                                    if (str2 != null) {
                                        int[] iArrC = c(aVar, str2);
                                        jVar.f1988h0 = iArrC;
                                        aVar.setReferencedIds(iArrC);
                                    }
                                }
                            }
                            e eVar = (e) childAt.getLayoutParams();
                            eVar.a();
                            iVar.a(eVar);
                            HashMap map3 = iVar.f1972f;
                            Class<?> cls = childAt.getClass();
                            for (String str3 : map3.keySet()) {
                                b bVar = (b) map3.get(str3);
                                HashSet hashSet3 = hashSet2;
                                if (bVar.f1894a) {
                                    i3 = i4;
                                    str = str3;
                                } else {
                                    i3 = i4;
                                    str = "set" + str3;
                                }
                                try {
                                    int iA = l.f.a(bVar.f1895b);
                                    Class cls2 = Float.TYPE;
                                    Class cls3 = Integer.TYPE;
                                    switch (iA) {
                                        case 0:
                                            map = map3;
                                            cls.getMethod(str, cls3).invoke(childAt, Integer.valueOf(bVar.c));
                                            break;
                                        case 1:
                                            map = map3;
                                            cls.getMethod(str, cls2).invoke(childAt, Float.valueOf(bVar.f1896d));
                                            break;
                                        case 2:
                                            map = map3;
                                            cls.getMethod(str, cls3).invoke(childAt, Integer.valueOf(bVar.f1899g));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(str, Drawable.class);
                                            map = map3;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(bVar.f1899g);
                                                method.invoke(childAt, colorDrawable);
                                            } catch (IllegalAccessException e3) {
                                                e = e3;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                                                e.printStackTrace();
                                            } catch (NoSuchMethodException e4) {
                                                e = e4;
                                                Log.e("TransitionLayout", e.getMessage());
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str);
                                            } catch (InvocationTargetException e5) {
                                                e = e5;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                                                e.printStackTrace();
                                            }
                                            break;
                                        case 4:
                                            cls.getMethod(str, CharSequence.class).invoke(childAt, bVar.f1897e);
                                            map = map3;
                                            break;
                                        case 5:
                                            cls.getMethod(str, Boolean.TYPE).invoke(childAt, Boolean.valueOf(bVar.f1898f));
                                            map = map3;
                                            break;
                                        case 6:
                                            cls.getMethod(str, cls2).invoke(childAt, Float.valueOf(bVar.f1896d));
                                            map = map3;
                                            break;
                                        case 7:
                                            cls.getMethod(str, cls3).invoke(childAt, Integer.valueOf(bVar.c));
                                            map = map3;
                                            break;
                                        default:
                                            map = map3;
                                            break;
                                    }
                                } catch (IllegalAccessException e6) {
                                    e = e6;
                                    map = map3;
                                } catch (NoSuchMethodException e7) {
                                    e = e7;
                                    map = map3;
                                } catch (InvocationTargetException e8) {
                                    e = e8;
                                    map = map3;
                                }
                                hashSet2 = hashSet3;
                                i4 = i3;
                                map3 = map;
                            }
                            hashSet = hashSet2;
                            i2 = i4;
                            childAt.setLayoutParams(eVar);
                            if (lVar.f2022b == 0) {
                                childAt.setVisibility(lVar.f2021a);
                            }
                            childAt.setAlpha(lVar.c);
                            childAt.setRotation(mVar.f2025a);
                            childAt.setRotationX(mVar.f2026b);
                            childAt.setRotationY(mVar.c);
                            childAt.setScaleX(mVar.f2027d);
                            childAt.setScaleY(mVar.f2028e);
                            if (mVar.f2031h != -1) {
                                if (((View) childAt.getParent()).findViewById(mVar.f2031h) != null) {
                                    float bottom = (r0.getBottom() + r0.getTop()) / 2.0f;
                                    float right = (r0.getRight() + r0.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(mVar.f2029f)) {
                                    childAt.setPivotX(mVar.f2029f);
                                }
                                if (!Float.isNaN(mVar.f2030g)) {
                                    childAt.setPivotY(mVar.f2030g);
                                }
                            }
                            childAt.setTranslationX(mVar.f2032i);
                            childAt.setTranslationY(mVar.f2033j);
                            childAt.setTranslationZ(mVar.f2034k);
                            if (mVar.f2035l) {
                                childAt.setElevation(mVar.f2036m);
                            }
                        }
                    } else {
                        hashSet = hashSet2;
                        i2 = i4;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
                i4 = i2 + 1;
                nVar = this;
                hashSet2 = hashSet;
            }
            hashSet = hashSet2;
            i2 = i4;
            i4 = i2 + 1;
            nVar = this;
            hashSet2 = hashSet;
        }
        for (Integer num : hashSet2) {
            i iVar2 = (i) map2.get(num);
            if (iVar2 != null) {
                j jVar2 = iVar2.f1970d;
                if (jVar2.f1986g0 == 1) {
                    Context context = constraintLayout.getContext();
                    a aVar2 = new a(context);
                    aVar2.f1900a = new int[32];
                    aVar2.f1905g = new HashMap();
                    aVar2.c = context;
                    n.a aVar3 = new n.a();
                    aVar3.f1601r0 = 0;
                    aVar3.f1602s0 = true;
                    aVar3.f1603t0 = 0;
                    aVar3.f1604u0 = false;
                    aVar2.f1893j = aVar3;
                    aVar2.f1902d = aVar3;
                    aVar2.i();
                    aVar2.setVisibility(8);
                    aVar2.setId(num.intValue());
                    int[] iArr2 = jVar2.f1988h0;
                    if (iArr2 != null) {
                        aVar2.setReferencedIds(iArr2);
                    } else {
                        String str4 = jVar2.f1990i0;
                        if (str4 != null) {
                            int[] iArrC2 = c(aVar2, str4);
                            jVar2.f1988h0 = iArrC2;
                            aVar2.setReferencedIds(iArrC2);
                        }
                    }
                    aVar2.setType(jVar2.f1982e0);
                    aVar2.setMargin(jVar2.f1984f0);
                    e eVarG = ConstraintLayout.g();
                    aVar2.i();
                    iVar2.a(eVarG);
                    constraintLayout.addView(aVar2, eVarG);
                }
                if (jVar2.f1974a) {
                    View pVar = new p(constraintLayout.getContext());
                    pVar.setId(num.intValue());
                    e eVarG2 = ConstraintLayout.g();
                    iVar2.a(eVarG2);
                    constraintLayout.addView(pVar, eVarG2);
                }
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt2 = constraintLayout.getChildAt(i5);
            if (childAt2 instanceof c) {
                ((c) childAt2).e(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i2;
        HashMap map;
        HashMap map2;
        n nVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map3 = nVar.c;
        map3.clear();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = constraintLayout.getChildAt(i3);
            e eVar = (e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (nVar.f2041b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map3.containsKey(Integer.valueOf(id))) {
                map3.put(Integer.valueOf(id), new i());
            }
            i iVar = (i) map3.get(Integer.valueOf(id));
            if (iVar == null) {
                i2 = childCount;
                map = map3;
            } else {
                l lVar = iVar.f1969b;
                j jVar = iVar.f1970d;
                m mVar = iVar.f1971e;
                HashMap map4 = new HashMap();
                Class<?> cls = childAt.getClass();
                HashMap map5 = nVar.f2040a;
                for (String str : map5.keySet()) {
                    b bVar = (b) map5.get(str);
                    int i4 = childCount;
                    try {
                        if (str.equals("BackgroundColor")) {
                            map2 = map3;
                            try {
                                map4.put(str, new b(bVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            } catch (IllegalAccessException e3) {
                                e = e3;
                                e.printStackTrace();
                            } catch (NoSuchMethodException e4) {
                                e = e4;
                                e.printStackTrace();
                            } catch (InvocationTargetException e5) {
                                e = e5;
                                e.printStackTrace();
                            }
                        } else {
                            map2 = map3;
                            map4.put(str, new b(bVar, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e6) {
                        e = e6;
                        map2 = map3;
                    } catch (NoSuchMethodException e7) {
                        e = e7;
                        map2 = map3;
                    } catch (InvocationTargetException e8) {
                        e = e8;
                        map2 = map3;
                    }
                    childCount = i4;
                    map3 = map2;
                }
                i2 = childCount;
                map = map3;
                iVar.f1972f = map4;
                iVar.f1968a = id;
                jVar.f1985g = eVar.f1912d;
                jVar.f1987h = eVar.f1914e;
                jVar.f1989i = eVar.f1916f;
                jVar.f1991j = eVar.f1918g;
                jVar.f1993k = eVar.f1920h;
                jVar.f1995l = eVar.f1922i;
                jVar.f1997m = eVar.f1924j;
                jVar.f1999n = eVar.f1926k;
                jVar.f2001o = eVar.f1928l;
                jVar.f2002p = eVar.f1930m;
                jVar.f2003q = eVar.f1932n;
                jVar.f2004r = eVar.f1938r;
                jVar.f2005s = eVar.f1939s;
                jVar.f2006t = eVar.f1940t;
                jVar.f2007u = eVar.f1941u;
                jVar.f2008v = eVar.D;
                jVar.f2009w = eVar.E;
                jVar.f2010x = eVar.F;
                jVar.f2011y = eVar.f1934o;
                jVar.z = eVar.f1936p;
                jVar.A = eVar.f1937q;
                jVar.B = eVar.S;
                jVar.C = eVar.T;
                jVar.D = eVar.U;
                jVar.f1983f = eVar.c;
                jVar.f1979d = eVar.f1907a;
                jVar.f1981e = eVar.f1909b;
                jVar.f1976b = ((ViewGroup.MarginLayoutParams) eVar).width;
                jVar.c = ((ViewGroup.MarginLayoutParams) eVar).height;
                jVar.E = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                jVar.F = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                jVar.G = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                jVar.H = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                jVar.K = eVar.C;
                jVar.S = eVar.H;
                jVar.T = eVar.G;
                jVar.V = eVar.J;
                jVar.U = eVar.I;
                jVar.f1994k0 = eVar.V;
                jVar.f1996l0 = eVar.W;
                jVar.W = eVar.K;
                jVar.X = eVar.L;
                jVar.Y = eVar.O;
                jVar.Z = eVar.P;
                jVar.f1975a0 = eVar.M;
                jVar.f1977b0 = eVar.N;
                jVar.f1978c0 = eVar.Q;
                jVar.f1980d0 = eVar.R;
                jVar.f1992j0 = eVar.X;
                jVar.M = eVar.f1943w;
                jVar.O = eVar.f1945y;
                jVar.L = eVar.f1942v;
                jVar.N = eVar.f1944x;
                jVar.Q = eVar.z;
                jVar.P = eVar.A;
                jVar.R = eVar.B;
                jVar.f2000n0 = eVar.Y;
                jVar.I = eVar.getMarginEnd();
                jVar.J = eVar.getMarginStart();
                lVar.f2021a = childAt.getVisibility();
                lVar.c = childAt.getAlpha();
                mVar.f2025a = childAt.getRotation();
                mVar.f2026b = childAt.getRotationX();
                mVar.c = childAt.getRotationY();
                mVar.f2027d = childAt.getScaleX();
                mVar.f2028e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    mVar.f2029f = pivotX;
                    mVar.f2030g = pivotY;
                }
                mVar.f2032i = childAt.getTranslationX();
                mVar.f2033j = childAt.getTranslationY();
                mVar.f2034k = childAt.getTranslationZ();
                if (mVar.f2035l) {
                    mVar.f2036m = childAt.getElevation();
                }
                if (childAt instanceof a) {
                    a aVar = (a) childAt;
                    jVar.f1998m0 = aVar.getAllowsGoneWidget();
                    jVar.f1988h0 = aVar.getReferencedIds();
                    jVar.f1982e0 = aVar.getType();
                    jVar.f1984f0 = aVar.getMargin();
                }
            }
            i3++;
            nVar = this;
            childCount = i2;
            map3 = map;
        }
    }

    public final void e(Context context, int i2) {
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    i iVarD = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        iVarD.f1970d.f1974a = true;
                    }
                    this.c.put(Integer.valueOf(iVarD.f1968a), iVarD);
                }
            }
        } catch (IOException e3) {
            e3.printStackTrace();
        } catch (XmlPullParserException e4) {
            e4.printStackTrace();
        }
    }
}
