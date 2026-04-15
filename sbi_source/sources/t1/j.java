package t1;

import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class j extends a0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2203a;

    public j(int i2) {
        this.f2203a = i2;
    }

    @Override // a0.a
    public final void j0(z zVar, float f3) {
        k kVar = (k) zVar;
        float[] fArr = kVar.B;
        if (fArr != null) {
            int i2 = this.f2203a;
            if (fArr[i2] != f3) {
                fArr[i2] = f3;
                i1.a aVar = kVar.D;
                if (aVar != null) {
                    float fH = kVar.h();
                    MaterialButton materialButton = (MaterialButton) aVar.f1389a;
                    int i3 = (int) (fH * 0.11f);
                    if (materialButton.f597x != i3) {
                        materialButton.f597x = i3;
                        materialButton.j();
                        materialButton.invalidate();
                    }
                }
                kVar.invalidateSelf();
            }
        }
    }

    @Override // a0.a
    public final float z(z zVar) {
        float[] fArr = ((k) zVar).B;
        if (fArr != null) {
            return fArr[this.f2203a];
        }
        return 0.0f;
    }
}
