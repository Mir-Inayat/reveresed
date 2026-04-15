package e0;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f969b;

    public b(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f968a = new Object[i2];
    }

    public Object a() {
        int i2 = this.f969b;
        if (i2 <= 0) {
            return null;
        }
        int i3 = i2 - 1;
        Object[] objArr = this.f968a;
        Object obj = objArr[i3];
        d2.c.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i3] = null;
        this.f969b--;
        return obj;
    }

    public void b(l.b bVar) {
        int i2 = this.f969b;
        Object[] objArr = this.f968a;
        if (i2 < objArr.length) {
            objArr[i2] = bVar;
            this.f969b = i2 + 1;
        }
    }

    public boolean c(Object obj) {
        Object[] objArr;
        boolean z;
        d2.c.e(obj, "instance");
        int i2 = this.f969b;
        int i3 = 0;
        while (true) {
            objArr = this.f968a;
            if (i3 >= i2) {
                z = false;
                break;
            }
            if (objArr[i3] == obj) {
                z = true;
                break;
            }
            i3++;
        }
        if (z) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i4 = this.f969b;
        if (i4 >= objArr.length) {
            return false;
        }
        objArr[i4] = obj;
        this.f969b = i4 + 1;
        return true;
    }

    public b() {
        this.f968a = new Object[256];
    }
}
