package i1;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import g0.i;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class h extends f0.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f1423e;

    public /* synthetic */ h(View view, int i2) {
        this.f1422d = i2;
        this.f1423e = view;
    }

    @Override // f0.b
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f1422d) {
            case 1:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f1423e).f641d);
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // f0.b
    public final void d(View view, i iVar) {
        int i2;
        int i3 = this.f1422d;
        View view2 = this.f1423e;
        View.AccessibilityDelegate accessibilityDelegate = this.f1226a;
        switch (i3) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = iVar.f1336a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) view2;
                int i4 = MaterialButtonToggleGroup.f599q;
                if (view instanceof MaterialButton) {
                    int i5 = 0;
                    for (int i6 = 0; i6 < materialButtonToggleGroup.getChildCount(); i6++) {
                        if (materialButtonToggleGroup.getChildAt(i6) == view) {
                            i2 = i5;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i6) instanceof MaterialButton) && materialButtonToggleGroup.getChildAt(i6).getVisibility() != 8) {
                                i5++;
                            }
                        }
                    }
                    i2 = -1;
                } else {
                    i2 = -1;
                }
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i2, 1, false, ((MaterialButton) view).f588o));
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = iVar.f1336a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                CheckableImageButton checkableImageButton = (CheckableImageButton) view2;
                accessibilityNodeInfo2.setCheckable(checkableImageButton.f642e);
                accessibilityNodeInfo2.setChecked(checkableImageButton.f641d);
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo3 = iVar.f1336a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                accessibilityNodeInfo3.setCheckable(((NavigationMenuItemView) view2).f647x);
                break;
        }
    }
}
