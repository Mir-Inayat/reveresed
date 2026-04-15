package f;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f1203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.emoji2.text.n f1204b;

    public w(TextView textView) {
        this.f1203a = textView;
        this.f1204b = new androidx.emoji2.text.n(textView);
    }

    public final void a(AttributeSet attributeSet, int i2) {
        TypedArray typedArrayObtainStyledAttributes = this.f1203a.getContext().obtainStyledAttributes(attributeSet, b.a.f437g, i2, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            ((a0.a) this.f1204b.f244b).e0(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
