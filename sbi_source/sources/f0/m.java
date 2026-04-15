package f0;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewParent f1272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewParent f1273b;
    public final ViewGroup c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f1275e;

    public m(ViewGroup viewGroup) {
        this.c = viewGroup;
    }

    public final boolean a(float f3, float f4, boolean z) {
        ViewParent viewParentE;
        if (this.f1274d && (viewParentE = e(0)) != null) {
            try {
                return r0.a(viewParentE, this.c, f3, f4, z);
            } catch (AbstractMethodError e3) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedFling", e3);
            }
        }
        return false;
    }

    public final boolean b(float f3, float f4) {
        ViewParent viewParentE;
        if (this.f1274d && (viewParentE = e(0)) != null) {
            try {
                return r0.b(viewParentE, this.c, f3, f4);
            } catch (AbstractMethodError e3) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreFling", e3);
            }
        }
        return false;
    }

    public final boolean c(int i2, int i3, int i4, int[] iArr, int[] iArr2) {
        ViewParent viewParentE;
        int i5;
        int i6;
        int[] iArr3;
        if (!this.f1274d || (viewParentE = e(i4)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i5 = iArr2[0];
            i6 = iArr2[1];
        } else {
            i5 = 0;
            i6 = 0;
        }
        if (iArr == null) {
            if (this.f1275e == null) {
                this.f1275e = new int[2];
            }
            iArr3 = this.f1275e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (viewParentE instanceof n) {
            ((n) viewParentE).c(viewGroup, i2, i3, iArr3, i4);
        } else if (i4 == 0) {
            try {
                r0.c(viewParentE, viewGroup, i2, i3, iArr3);
            } catch (AbstractMethodError e3) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreScroll", e3);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i5;
            iArr2[1] = iArr2[1] - i6;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final boolean d(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        ViewParent viewParentE;
        int i7;
        int i8;
        int[] iArr3;
        if (this.f1274d && (viewParentE = e(i6)) != null) {
            if (i2 != 0 || i3 != 0 || i4 != 0 || i5 != 0) {
                ViewGroup viewGroup = this.c;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i7 = iArr[0];
                    i8 = iArr[1];
                } else {
                    i7 = 0;
                    i8 = 0;
                }
                if (iArr2 == null) {
                    if (this.f1275e == null) {
                        this.f1275e = new int[2];
                    }
                    int[] iArr4 = this.f1275e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (viewParentE instanceof o) {
                    ((o) viewParentE).d(viewGroup, i2, i3, i4, i5, i6, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i4;
                    iArr3[1] = iArr3[1] + i5;
                    if (viewParentE instanceof n) {
                        ((n) viewParentE).e(viewGroup, i2, i3, i4, i5, i6);
                    } else if (i6 == 0) {
                        try {
                            r0.d(viewParentE, viewGroup, i2, i3, i4, i5);
                        } catch (AbstractMethodError e3) {
                            Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedScroll", e3);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i7;
                    iArr[1] = iArr[1] - i8;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public final ViewParent e(int i2) {
        if (i2 == 0) {
            return this.f1272a;
        }
        if (i2 != 1) {
            return null;
        }
        return this.f1273b;
    }

    public final boolean f(int i2) {
        return e(i2) != null;
    }

    public final boolean g(int i2, int i3) {
        boolean zF;
        if (!f(i3)) {
            if (this.f1274d) {
                ViewGroup viewGroup = this.c;
                View view = viewGroup;
                for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z = parent instanceof n;
                    if (z) {
                        zF = ((n) parent).f(view, viewGroup, i2, i3);
                    } else if (i3 == 0) {
                        try {
                            zF = r0.f(parent, view, viewGroup, i2);
                        } catch (AbstractMethodError e3) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e3);
                            zF = false;
                        }
                    } else {
                        zF = false;
                    }
                    if (zF) {
                        if (i3 == 0) {
                            this.f1272a = parent;
                        } else if (i3 == 1) {
                            this.f1273b = parent;
                        }
                        if (z) {
                            ((n) parent).a(view, viewGroup, i2, i3);
                        } else if (i3 == 0) {
                            try {
                                r0.e(parent, view, viewGroup, i2);
                            } catch (AbstractMethodError e4) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e4);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view = (View) parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void h(int i2) {
        ViewParent viewParentE = e(i2);
        if (viewParentE != null) {
            boolean z = viewParentE instanceof n;
            ViewGroup viewGroup = this.c;
            if (z) {
                ((n) viewParentE).b(viewGroup, i2);
            } else if (i2 == 0) {
                try {
                    r0.g(viewParentE, viewGroup);
                } catch (AbstractMethodError e3) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onStopNestedScroll", e3);
                }
            }
            if (i2 == 0) {
                this.f1272a = null;
            } else {
                if (i2 != 1) {
                    return;
                }
                this.f1273b = null;
            }
        }
    }
}
