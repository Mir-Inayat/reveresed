package d0;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f815e = new byte[1792];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f817b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public char f818d;

    static {
        for (int i2 = 0; i2 < 1792; i2++) {
            f815e[i2] = Character.getDirectionality(i2);
        }
    }

    public a(CharSequence charSequence) {
        this.f816a = charSequence;
        this.f817b = charSequence.length();
    }

    public final byte a() {
        int i2 = this.c - 1;
        CharSequence charSequence = this.f816a;
        char cCharAt = charSequence.charAt(i2);
        this.f818d = cCharAt;
        if (Character.isLowSurrogate(cCharAt)) {
            int iCodePointBefore = Character.codePointBefore(charSequence, this.c);
            this.c -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.c--;
        char c = this.f818d;
        return c < 1792 ? f815e[c] : Character.getDirectionality(c);
    }
}
