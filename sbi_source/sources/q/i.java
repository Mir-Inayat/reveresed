package q;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f1969b;
    public final k c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f1970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f1971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HashMap f1972f;

    public i() {
        l lVar = new l();
        lVar.f2021a = 0;
        lVar.f2022b = 0;
        lVar.c = 1.0f;
        lVar.f2023d = Float.NaN;
        this.f1969b = lVar;
        k kVar = new k();
        kVar.f2013a = -1;
        kVar.f2014b = 0;
        kVar.c = -1;
        kVar.f2015d = Float.NaN;
        kVar.f2016e = Float.NaN;
        kVar.f2017f = Float.NaN;
        kVar.f2018g = -1;
        kVar.f2019h = null;
        kVar.f2020i = -1;
        this.c = kVar;
        j jVar = new j();
        jVar.f1974a = false;
        jVar.f1979d = -1;
        jVar.f1981e = -1;
        jVar.f1983f = -1.0f;
        jVar.f1985g = -1;
        jVar.f1987h = -1;
        jVar.f1989i = -1;
        jVar.f1991j = -1;
        jVar.f1993k = -1;
        jVar.f1995l = -1;
        jVar.f1997m = -1;
        jVar.f1999n = -1;
        jVar.f2001o = -1;
        jVar.f2002p = -1;
        jVar.f2003q = -1;
        jVar.f2004r = -1;
        jVar.f2005s = -1;
        jVar.f2006t = -1;
        jVar.f2007u = -1;
        jVar.f2008v = 0.5f;
        jVar.f2009w = 0.5f;
        jVar.f2010x = null;
        jVar.f2011y = -1;
        jVar.z = 0;
        jVar.A = 0.0f;
        jVar.B = -1;
        jVar.C = -1;
        jVar.D = -1;
        jVar.E = 0;
        jVar.F = 0;
        jVar.G = 0;
        jVar.H = 0;
        jVar.I = 0;
        jVar.J = 0;
        jVar.K = 0;
        jVar.L = Integer.MIN_VALUE;
        jVar.M = Integer.MIN_VALUE;
        jVar.N = Integer.MIN_VALUE;
        jVar.O = Integer.MIN_VALUE;
        jVar.P = Integer.MIN_VALUE;
        jVar.Q = Integer.MIN_VALUE;
        jVar.R = Integer.MIN_VALUE;
        jVar.S = -1.0f;
        jVar.T = -1.0f;
        jVar.U = 0;
        jVar.V = 0;
        jVar.W = 0;
        jVar.X = 0;
        jVar.Y = -1;
        jVar.Z = -1;
        jVar.f1975a0 = -1;
        jVar.f1977b0 = -1;
        jVar.f1978c0 = 1.0f;
        jVar.f1980d0 = 1.0f;
        jVar.f1982e0 = -1;
        jVar.f1984f0 = 0;
        jVar.f1986g0 = -1;
        jVar.f1994k0 = false;
        jVar.f1996l0 = false;
        jVar.f1998m0 = true;
        jVar.f2000n0 = 0;
        this.f1970d = jVar;
        m mVar = new m();
        mVar.f2025a = 0.0f;
        mVar.f2026b = 0.0f;
        mVar.c = 0.0f;
        mVar.f2027d = 1.0f;
        mVar.f2028e = 1.0f;
        mVar.f2029f = Float.NaN;
        mVar.f2030g = Float.NaN;
        mVar.f2031h = -1;
        mVar.f2032i = 0.0f;
        mVar.f2033j = 0.0f;
        mVar.f2034k = 0.0f;
        mVar.f2035l = false;
        mVar.f2036m = 0.0f;
        this.f1971e = mVar;
        this.f1972f = new HashMap();
    }

    public final void a(e eVar) {
        j jVar = this.f1970d;
        eVar.f1912d = jVar.f1985g;
        eVar.f1914e = jVar.f1987h;
        eVar.f1916f = jVar.f1989i;
        eVar.f1918g = jVar.f1991j;
        eVar.f1920h = jVar.f1993k;
        eVar.f1922i = jVar.f1995l;
        eVar.f1924j = jVar.f1997m;
        eVar.f1926k = jVar.f1999n;
        eVar.f1928l = jVar.f2001o;
        eVar.f1930m = jVar.f2002p;
        eVar.f1932n = jVar.f2003q;
        eVar.f1938r = jVar.f2004r;
        eVar.f1939s = jVar.f2005s;
        eVar.f1940t = jVar.f2006t;
        eVar.f1941u = jVar.f2007u;
        ((ViewGroup.MarginLayoutParams) eVar).leftMargin = jVar.E;
        ((ViewGroup.MarginLayoutParams) eVar).rightMargin = jVar.F;
        ((ViewGroup.MarginLayoutParams) eVar).topMargin = jVar.G;
        ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = jVar.H;
        eVar.z = jVar.Q;
        eVar.A = jVar.P;
        eVar.f1943w = jVar.M;
        eVar.f1945y = jVar.O;
        eVar.D = jVar.f2008v;
        eVar.E = jVar.f2009w;
        eVar.f1934o = jVar.f2011y;
        eVar.f1936p = jVar.z;
        eVar.f1937q = jVar.A;
        eVar.F = jVar.f2010x;
        eVar.S = jVar.B;
        eVar.T = jVar.C;
        eVar.H = jVar.S;
        eVar.G = jVar.T;
        eVar.J = jVar.V;
        eVar.I = jVar.U;
        eVar.V = jVar.f1994k0;
        eVar.W = jVar.f1996l0;
        eVar.K = jVar.W;
        eVar.L = jVar.X;
        eVar.O = jVar.Y;
        eVar.P = jVar.Z;
        eVar.M = jVar.f1975a0;
        eVar.N = jVar.f1977b0;
        eVar.Q = jVar.f1978c0;
        eVar.R = jVar.f1980d0;
        eVar.U = jVar.D;
        eVar.c = jVar.f1983f;
        eVar.f1907a = jVar.f1979d;
        eVar.f1909b = jVar.f1981e;
        ((ViewGroup.MarginLayoutParams) eVar).width = jVar.f1976b;
        ((ViewGroup.MarginLayoutParams) eVar).height = jVar.c;
        String str = jVar.f1992j0;
        if (str != null) {
            eVar.X = str;
        }
        eVar.Y = jVar.f2000n0;
        eVar.setMarginStart(jVar.J);
        eVar.setMarginEnd(jVar.I);
        eVar.a();
    }

    public final Object clone() {
        i iVar = new i();
        j jVar = iVar.f1970d;
        jVar.getClass();
        j jVar2 = this.f1970d;
        jVar.f1974a = jVar2.f1974a;
        jVar.f1976b = jVar2.f1976b;
        jVar.c = jVar2.c;
        jVar.f1979d = jVar2.f1979d;
        jVar.f1981e = jVar2.f1981e;
        jVar.f1983f = jVar2.f1983f;
        jVar.f1985g = jVar2.f1985g;
        jVar.f1987h = jVar2.f1987h;
        jVar.f1989i = jVar2.f1989i;
        jVar.f1991j = jVar2.f1991j;
        jVar.f1993k = jVar2.f1993k;
        jVar.f1995l = jVar2.f1995l;
        jVar.f1997m = jVar2.f1997m;
        jVar.f1999n = jVar2.f1999n;
        jVar.f2001o = jVar2.f2001o;
        jVar.f2002p = jVar2.f2002p;
        jVar.f2003q = jVar2.f2003q;
        jVar.f2004r = jVar2.f2004r;
        jVar.f2005s = jVar2.f2005s;
        jVar.f2006t = jVar2.f2006t;
        jVar.f2007u = jVar2.f2007u;
        jVar.f2008v = jVar2.f2008v;
        jVar.f2009w = jVar2.f2009w;
        jVar.f2010x = jVar2.f2010x;
        jVar.f2011y = jVar2.f2011y;
        jVar.z = jVar2.z;
        jVar.A = jVar2.A;
        jVar.B = jVar2.B;
        jVar.C = jVar2.C;
        jVar.D = jVar2.D;
        jVar.E = jVar2.E;
        jVar.F = jVar2.F;
        jVar.G = jVar2.G;
        jVar.H = jVar2.H;
        jVar.I = jVar2.I;
        jVar.J = jVar2.J;
        jVar.K = jVar2.K;
        jVar.L = jVar2.L;
        jVar.M = jVar2.M;
        jVar.N = jVar2.N;
        jVar.O = jVar2.O;
        jVar.P = jVar2.P;
        jVar.Q = jVar2.Q;
        jVar.R = jVar2.R;
        jVar.S = jVar2.S;
        jVar.T = jVar2.T;
        jVar.U = jVar2.U;
        jVar.V = jVar2.V;
        jVar.W = jVar2.W;
        jVar.X = jVar2.X;
        jVar.Y = jVar2.Y;
        jVar.Z = jVar2.Z;
        jVar.f1975a0 = jVar2.f1975a0;
        jVar.f1977b0 = jVar2.f1977b0;
        jVar.f1978c0 = jVar2.f1978c0;
        jVar.f1980d0 = jVar2.f1980d0;
        jVar.f1982e0 = jVar2.f1982e0;
        jVar.f1984f0 = jVar2.f1984f0;
        jVar.f1986g0 = jVar2.f1986g0;
        jVar.f1992j0 = jVar2.f1992j0;
        int[] iArr = jVar2.f1988h0;
        if (iArr != null) {
            jVar.f1988h0 = Arrays.copyOf(iArr, iArr.length);
        } else {
            jVar.f1988h0 = null;
        }
        jVar.f1990i0 = jVar2.f1990i0;
        jVar.f1994k0 = jVar2.f1994k0;
        jVar.f1996l0 = jVar2.f1996l0;
        jVar.f1998m0 = jVar2.f1998m0;
        jVar.f2000n0 = jVar2.f2000n0;
        k kVar = iVar.c;
        kVar.getClass();
        k kVar2 = this.c;
        kVar2.getClass();
        kVar.f2013a = kVar2.f2013a;
        kVar.c = kVar2.c;
        kVar.f2016e = kVar2.f2016e;
        kVar.f2015d = kVar2.f2015d;
        l lVar = this.f1969b;
        int i2 = lVar.f2021a;
        l lVar2 = iVar.f1969b;
        lVar2.f2021a = i2;
        lVar2.c = lVar.c;
        lVar2.f2023d = lVar.f2023d;
        lVar2.f2022b = lVar.f2022b;
        m mVar = iVar.f1971e;
        mVar.getClass();
        m mVar2 = this.f1971e;
        mVar2.getClass();
        mVar.f2025a = mVar2.f2025a;
        mVar.f2026b = mVar2.f2026b;
        mVar.c = mVar2.c;
        mVar.f2027d = mVar2.f2027d;
        mVar.f2028e = mVar2.f2028e;
        mVar.f2029f = mVar2.f2029f;
        mVar.f2030g = mVar2.f2030g;
        mVar.f2031h = mVar2.f2031h;
        mVar.f2032i = mVar2.f2032i;
        mVar.f2033j = mVar2.f2033j;
        mVar.f2034k = mVar2.f2034k;
        mVar.f2035l = mVar2.f2035l;
        mVar.f2036m = mVar2.f2036m;
        iVar.f1968a = this.f1968a;
        return iVar;
    }
}
