package k1;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.google.android.material.chip.Chip;
import com.redhand.laugiytr.R;
import g0.i;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class d extends m0.b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Chip f1488q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Chip chip, Chip chip2) {
        super(chip2);
        this.f1488q = chip;
    }

    @Override // m0.b
    public final void l(ArrayList arrayList) {
        f fVar;
        arrayList.add(0);
        Rect rect = Chip.f609w;
        Chip chip = this.f1488q;
        if (!chip.c() || (fVar = chip.f612e) == null || !fVar.T || chip.f615h == null) {
            return;
        }
        arrayList.add(1);
    }

    @Override // m0.b
    public final void o(int i2, i iVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = iVar.f1336a;
        if (i2 != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.f609w);
            return;
        }
        Chip chip = this.f1488q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(R.NP_MANAGER14.NP_MANAGER, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
        iVar.b(g0.d.f1324e);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
        iVar.i(Button.class.getName());
    }

    @Override // m0.b
    public final void p(int i2, boolean z) {
        Chip chip = this.f1488q;
        if (i2 == 1) {
            chip.f620m = z;
        }
        f fVar = chip.f612e;
        boolean z2 = chip.f620m;
        boolean zR = false;
        if (fVar.U != null) {
            zR = fVar.R(z2 ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : f.O0);
        }
        if (zR) {
            chip.refreshDrawableState();
        }
    }
}
