package f2;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public abstract class g extends f {
    public static String n0(String str) {
        d2.c.e(str, "<this>");
        d2.c.e(str, "missingDelimiterValue");
        int iLastIndexOf = str.lastIndexOf(46, str.length() - 1);
        if (iLastIndexOf == -1) {
            return str;
        }
        String strSubstring = str.substring(iLastIndexOf + 1, str.length());
        d2.c.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }
}
