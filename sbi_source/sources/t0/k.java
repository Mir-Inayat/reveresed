package t0;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2147b;
    public final long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f2148d;

    public k(int i2, int i3, long j2, long j3) {
        this.f2146a = i2;
        this.f2147b = i3;
        this.c = j2;
        this.f2148d = j3;
    }

    public static k a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            k kVar = new k(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return kVar;
        } finally {
        }
    }

    public final void b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f2146a);
            dataOutputStream.writeInt(this.f2147b);
            dataOutputStream.writeLong(this.c);
            dataOutputStream.writeLong(this.f2148d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof k)) {
            k kVar = (k) obj;
            if (this.f2147b == kVar.f2147b && this.c == kVar.c && this.f2146a == kVar.f2146a && this.f2148d == kVar.f2148d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f2147b), Long.valueOf(this.c), Integer.valueOf(this.f2146a), Long.valueOf(this.f2148d));
    }
}
