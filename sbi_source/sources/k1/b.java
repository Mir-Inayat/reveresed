package k1;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import o1.h;
import o1.i;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class b extends a0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1486b;

    public /* synthetic */ b(int i2, Object obj) {
        this.f1485a = i2;
        this.f1486b = obj;
    }

    @Override // a0.a
    public final void O(int i2) {
        switch (this.f1485a) {
            case 0:
                break;
            default:
                i iVar = (i) this.f1486b;
                iVar.f1866d = true;
                h hVar = (h) iVar.f1867e.get();
                if (hVar != null) {
                    f fVar = (f) hVar;
                    fVar.A();
                    fVar.invalidateSelf();
                }
                break;
        }
    }

    @Override // a0.a
    public final void P(Typeface typeface, boolean z) {
        switch (this.f1485a) {
            case 0:
                Chip chip = (Chip) this.f1486b;
                f fVar = chip.f612e;
                chip.setText(fVar.L0 ? fVar.N : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z) {
                    i iVar = (i) this.f1486b;
                    iVar.f1866d = true;
                    h hVar = (h) iVar.f1867e.get();
                    if (hVar != null) {
                        f fVar2 = (f) hVar;
                        fVar2.A();
                        fVar2.invalidateSelf();
                    }
                    break;
                }
                break;
        }
    }

    private final void n0(int i2) {
    }
}
