package i;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1361b;
    public boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1363e;

    public b(int i2) {
        this.f1360a = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1361b < this.f1360a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objF;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f1361b;
        switch (this.f1362d) {
            case 0:
                objF = ((f) this.f1363e).f(i2);
                break;
            case 1:
                objF = ((f) this.f1363e).i(i2);
                break;
            default:
                objF = ((g) this.f1363e).f1373b[i2];
                break;
        }
        this.f1361b++;
        this.c = true;
        return objF;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.c) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i2 = this.f1361b - 1;
        this.f1361b = i2;
        switch (this.f1362d) {
            case 0:
                ((f) this.f1363e).g(i2);
                break;
            case 1:
                ((f) this.f1363e).g(i2);
                break;
            default:
                ((g) this.f1363e).a(i2);
                break;
        }
        this.f1360a--;
        this.c = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(g gVar) {
        this(gVar.c);
        this.f1362d = 2;
        this.f1363e = gVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(f fVar, int i2) {
        this(fVar.c);
        this.f1362d = i2;
        switch (i2) {
            case 1:
                this.f1363e = fVar;
                this(fVar.c);
                break;
            default:
                this.f1363e = fVar;
                break;
        }
    }
}
