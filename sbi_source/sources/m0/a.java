package m0;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.emoji2.text.n;
import com.google.android.material.chip.Chip;
import f0.m0;
import g0.i;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class a extends n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f1562d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(13);
        this.f1562d = bVar;
    }

    @Override // androidx.emoji2.text.n
    public final i u(int i2) {
        return new i(AccessibilityNodeInfo.obtain(this.f1562d.n(i2).f1336a));
    }

    @Override // androidx.emoji2.text.n
    public final i v(int i2) {
        b bVar = this.f1562d;
        int i3 = i2 == 2 ? bVar.f1573k : bVar.f1574l;
        if (i3 == Integer.MIN_VALUE) {
            return null;
        }
        return u(i3);
    }

    @Override // androidx.emoji2.text.n
    public final boolean y(int i2, int i3, Bundle bundle) {
        int i4;
        b bVar = this.f1562d;
        Chip chip = bVar.f1571i;
        if (i2 == -1) {
            Field field = m0.f1276a;
            return chip.performAccessibilityAction(i3, bundle);
        }
        if (i3 == 1) {
            return bVar.q(i2);
        }
        if (i3 == 2) {
            return bVar.j(i2);
        }
        boolean z = false;
        if (i3 == 64) {
            AccessibilityManager accessibilityManager = bVar.f1570h;
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i4 = bVar.f1573k) == i2) {
                return false;
            }
            if (i4 != Integer.MIN_VALUE) {
                bVar.f1573k = Integer.MIN_VALUE;
                chip.invalidate();
                bVar.r(i4, 65536);
            }
            bVar.f1573k = i2;
            chip.invalidate();
            bVar.r(i2, 32768);
            return true;
        }
        if (i3 == 128) {
            if (bVar.f1573k != i2) {
                return false;
            }
            bVar.f1573k = Integer.MIN_VALUE;
            chip.invalidate();
            bVar.r(i2, 65536);
            return true;
        }
        Chip chip2 = ((k1.d) bVar).f1488q;
        if (i3 == 16) {
            if (i2 == 0) {
                return chip2.performClick();
            }
            if (i2 == 1) {
                chip2.playSoundEffect(0);
                View.OnClickListener onClickListener = chip2.f615h;
                if (onClickListener != null) {
                    onClickListener.onClick(chip2);
                    z = true;
                }
                if (chip2.f626s) {
                    chip2.f625r.r(1, 1);
                }
            }
        }
        return z;
    }
}
