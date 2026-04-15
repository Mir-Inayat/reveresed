package androidx.emoji2.text;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f215d = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f217b;
    public volatile int c = 0;

    public b0(y yVar, int i2) {
        this.f217b = yVar;
        this.f216a = i2;
    }

    public final int a(int i2) {
        o0.a aVarB = b();
        int iA = aVarB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = aVarB.f1807b;
        int i3 = iA + aVarB.f1806a;
        return byteBuffer.getInt((i2 * 4) + byteBuffer.getInt(i3) + i3 + 4);
    }

    public final o0.a b() {
        ThreadLocal threadLocal = f215d;
        o0.a aVar = (o0.a) threadLocal.get();
        if (aVar == null) {
            aVar = new o0.a();
            threadLocal.set(aVar);
        }
        o0.b bVar = (o0.b) this.f217b.f269a;
        int iA = bVar.a(6);
        if (iA != 0) {
            int i2 = iA + bVar.f1806a;
            int i3 = (this.f216a * 4) + bVar.f1807b.getInt(i2) + i2 + 4;
            int i4 = bVar.f1807b.getInt(i3) + i3;
            ByteBuffer byteBuffer = bVar.f1807b;
            aVar.f1807b = byteBuffer;
            if (byteBuffer != null) {
                aVar.f1806a = i4;
                int i5 = i4 - byteBuffer.getInt(i4);
                aVar.c = i5;
                aVar.f1808d = aVar.f1807b.getShort(i5);
                return aVar;
            }
            aVar.f1806a = 0;
            aVar.c = 0;
            aVar.f1808d = 0;
        }
        return aVar;
    }

    public final String toString() {
        int i2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        o0.a aVarB = b();
        int iA = aVarB.a(4);
        sb.append(Integer.toHexString(iA != 0 ? aVarB.f1807b.getInt(iA + aVarB.f1806a) : 0));
        sb.append(", codepoints:");
        o0.a aVarB2 = b();
        int iA2 = aVarB2.a(16);
        if (iA2 != 0) {
            int i3 = iA2 + aVarB2.f1806a;
            i2 = aVarB2.f1807b.getInt(aVarB2.f1807b.getInt(i3) + i3);
        } else {
            i2 = 0;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            sb.append(Integer.toHexString(a(i4)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
