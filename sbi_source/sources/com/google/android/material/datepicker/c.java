package com.google.android.material.datepicker;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import com.redhand.laugiytr.R;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class c<S> extends androidx.fragment.app.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final LinkedHashSet f632o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final LinkedHashSet f633p;

    public c() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f632o = new LinkedHashSet();
        this.f633p = new LinkedHashSet();
    }

    public static boolean f(Context context, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(a0.a.c0(context, R.NP_MANAGER3.NP_MANAGER, a.class.getCanonicalName()).data, new int[]{i2});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f632o.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f633p.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }
}
