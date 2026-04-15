package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.HashMap;
import n.e;
import n.h;
import o.b;
import q.r;
import q.t;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class Flow extends t {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h f126j;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1900a = new int[32];
        this.f1905g = new HashMap();
        this.c = context;
        super.g(attributeSet);
        h hVar = new h();
        hVar.f1696r0 = 0;
        hVar.f1697s0 = 0;
        hVar.f1698t0 = 0;
        hVar.f1699u0 = 0;
        hVar.f1700v0 = 0;
        hVar.f1701w0 = 0;
        hVar.f1702x0 = false;
        hVar.y0 = 0;
        hVar.f1703z0 = 0;
        hVar.A0 = new b();
        hVar.B0 = null;
        hVar.C0 = -1;
        hVar.D0 = -1;
        hVar.E0 = -1;
        hVar.F0 = -1;
        hVar.G0 = -1;
        hVar.H0 = -1;
        hVar.I0 = 0.5f;
        hVar.J0 = 0.5f;
        hVar.K0 = 0.5f;
        hVar.L0 = 0.5f;
        hVar.M0 = 0.5f;
        hVar.N0 = 0.5f;
        hVar.O0 = 0;
        hVar.P0 = 0;
        hVar.Q0 = 2;
        hVar.R0 = 2;
        hVar.S0 = 0;
        hVar.T0 = -1;
        hVar.U0 = 0;
        hVar.V0 = new ArrayList();
        hVar.W0 = null;
        hVar.X0 = null;
        hVar.Y0 = null;
        hVar.f1695a1 = 0;
        this.f126j = hVar;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f2043b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 0) {
                    this.f126j.U0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    h hVar2 = this.f126j;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    hVar2.f1696r0 = dimensionPixelSize;
                    hVar2.f1697s0 = dimensionPixelSize;
                    hVar2.f1698t0 = dimensionPixelSize;
                    hVar2.f1699u0 = dimensionPixelSize;
                } else if (index == 18) {
                    h hVar3 = this.f126j;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    hVar3.f1698t0 = dimensionPixelSize2;
                    hVar3.f1700v0 = dimensionPixelSize2;
                    hVar3.f1701w0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f126j.f1699u0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f126j.f1700v0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f126j.f1696r0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f126j.f1701w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f126j.f1697s0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f126j.S0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f126j.C0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f126j.D0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f126j.E0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f126j.G0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f126j.F0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f126j.H0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f126j.I0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f126j.K0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f126j.M0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f126j.L0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f126j.N0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f126j.J0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f126j.Q0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f126j.R0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f126j.O0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f126j.P0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f126j.T0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f1902d = this.f126j;
        i();
    }

    @Override // q.c
    public final void h(e eVar, boolean z) {
        h hVar = this.f126j;
        int i2 = hVar.f1698t0;
        if (i2 > 0 || hVar.f1699u0 > 0) {
            if (z) {
                hVar.f1700v0 = hVar.f1699u0;
                hVar.f1701w0 = i2;
            } else {
                hVar.f1700v0 = i2;
                hVar.f1701w0 = hVar.f1699u0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:294:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x00d7 A[EDGE_INSN: B:334:0x00d7->B:60:0x00d7 BREAK  A[LOOP:1: B:54:0x00c0->B:59:0x00d2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0100  */
    @Override // q.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(n.h r37, int r38, int r39) {
        /*
            Method dump skipped, instruction units count: 1404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.Flow.j(n.h, int, int):void");
    }

    @Override // q.c, android.view.View
    public final void onMeasure(int i2, int i3) {
        j(this.f126j, i2, i3);
    }

    public void setFirstHorizontalBias(float f3) {
        this.f126j.K0 = f3;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i2) {
        this.f126j.E0 = i2;
        requestLayout();
    }

    public void setFirstVerticalBias(float f3) {
        this.f126j.L0 = f3;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i2) {
        this.f126j.F0 = i2;
        requestLayout();
    }

    public void setHorizontalAlign(int i2) {
        this.f126j.Q0 = i2;
        requestLayout();
    }

    public void setHorizontalBias(float f3) {
        this.f126j.I0 = f3;
        requestLayout();
    }

    public void setHorizontalGap(int i2) {
        this.f126j.O0 = i2;
        requestLayout();
    }

    public void setHorizontalStyle(int i2) {
        this.f126j.C0 = i2;
        requestLayout();
    }

    public void setMaxElementsWrap(int i2) {
        this.f126j.T0 = i2;
        requestLayout();
    }

    public void setOrientation(int i2) {
        this.f126j.U0 = i2;
        requestLayout();
    }

    public void setPadding(int i2) {
        h hVar = this.f126j;
        hVar.f1696r0 = i2;
        hVar.f1697s0 = i2;
        hVar.f1698t0 = i2;
        hVar.f1699u0 = i2;
        requestLayout();
    }

    public void setPaddingBottom(int i2) {
        this.f126j.f1697s0 = i2;
        requestLayout();
    }

    public void setPaddingLeft(int i2) {
        this.f126j.f1700v0 = i2;
        requestLayout();
    }

    public void setPaddingRight(int i2) {
        this.f126j.f1701w0 = i2;
        requestLayout();
    }

    public void setPaddingTop(int i2) {
        this.f126j.f1696r0 = i2;
        requestLayout();
    }

    public void setVerticalAlign(int i2) {
        this.f126j.R0 = i2;
        requestLayout();
    }

    public void setVerticalBias(float f3) {
        this.f126j.J0 = f3;
        requestLayout();
    }

    public void setVerticalGap(int i2) {
        this.f126j.P0 = i2;
        requestLayout();
    }

    public void setVerticalStyle(int i2) {
        this.f126j.D0 = i2;
        requestLayout();
    }

    public void setWrapMode(int i2) {
        this.f126j.S0 = i2;
        requestLayout();
    }
}
