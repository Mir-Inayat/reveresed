package n0;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f1742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f1743b;
    public boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f1744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f1745e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f1746f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f1747g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double f1748h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public double f1749i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j1.e f1750j;

    public f() {
        this.f1742a = Math.sqrt(1500.0d);
        this.f1743b = 0.5d;
        this.c = false;
        this.f1749i = Double.MAX_VALUE;
        this.f1750j = new j1.e();
    }

    public final j1.e a(double d3, double d4, long j2) {
        double dSin;
        double dCos;
        if (!this.c) {
            if (this.f1749i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d5 = this.f1743b;
            if (d5 > 1.0d) {
                double d6 = this.f1742a;
                this.f1746f = (Math.sqrt((d5 * d5) - 1.0d) * d6) + ((-d5) * d6);
                double d7 = this.f1743b;
                double d8 = this.f1742a;
                this.f1747g = ((-d7) * d8) - (Math.sqrt((d7 * d7) - 1.0d) * d8);
            } else if (d5 >= 0.0d && d5 < 1.0d) {
                this.f1748h = Math.sqrt(1.0d - (d5 * d5)) * this.f1742a;
            }
            this.c = true;
        }
        double d9 = j2 / 1000.0d;
        double d10 = d3 - this.f1749i;
        double d11 = this.f1743b;
        if (d11 > 1.0d) {
            double d12 = this.f1747g;
            double d13 = ((d12 * d10) - d4) / (d12 - this.f1746f);
            double d14 = d10 - d13;
            dSin = (Math.pow(2.718281828459045d, this.f1746f * d9) * d13) + (Math.pow(2.718281828459045d, d12 * d9) * d14);
            double d15 = this.f1747g;
            double dPow = Math.pow(2.718281828459045d, d15 * d9) * d14 * d15;
            double d16 = this.f1746f;
            dCos = (Math.pow(2.718281828459045d, d16 * d9) * d13 * d16) + dPow;
        } else if (d11 == 1.0d) {
            double d17 = this.f1742a;
            double d18 = (d17 * d10) + d4;
            double d19 = (d18 * d9) + d10;
            double dPow2 = Math.pow(2.718281828459045d, (-d17) * d9) * d19;
            double dPow3 = Math.pow(2.718281828459045d, (-this.f1742a) * d9) * d19;
            double d20 = -this.f1742a;
            dCos = (Math.pow(2.718281828459045d, d20 * d9) * d18) + (dPow3 * d20);
            dSin = dPow2;
        } else {
            double d21 = 1.0d / this.f1748h;
            double d22 = this.f1742a;
            double d23 = ((d11 * d22 * d10) + d4) * d21;
            dSin = ((Math.sin(this.f1748h * d9) * d23) + (Math.cos(this.f1748h * d9) * d10)) * Math.pow(2.718281828459045d, (-d11) * d22 * d9);
            double d24 = this.f1742a;
            double d25 = this.f1743b;
            double d26 = (-d24) * dSin * d25;
            double dPow4 = Math.pow(2.718281828459045d, (-d25) * d24 * d9);
            double d27 = this.f1748h;
            double dSin2 = Math.sin(d27 * d9) * (-d27) * d10;
            double d28 = this.f1748h;
            dCos = (((Math.cos(d28 * d9) * d23 * d28) + dSin2) * dPow4) + d26;
        }
        float f3 = (float) (dSin + this.f1749i);
        j1.e eVar = this.f1750j;
        eVar.f1435a = f3;
        eVar.f1436b = (float) dCos;
        return eVar;
    }

    public f(float f3) {
        this.f1742a = Math.sqrt(1500.0d);
        this.f1743b = 0.5d;
        this.c = false;
        this.f1750j = new j1.e();
        this.f1749i = f3;
    }
}
