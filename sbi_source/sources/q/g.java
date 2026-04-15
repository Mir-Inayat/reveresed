package q;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f1953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f1954b;
    public final float c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1956e;

    public g(Context context, XmlResourceParser xmlResourceParser) {
        this.f1953a = Float.NaN;
        this.f1954b = Float.NaN;
        this.c = Float.NaN;
        this.f1955d = Float.NaN;
        this.f1956e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.f2050j);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f1956e);
                this.f1956e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new n().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f1955d = typedArrayObtainStyledAttributes.getDimension(index, this.f1955d);
            } else if (index == 2) {
                this.f1954b = typedArrayObtainStyledAttributes.getDimension(index, this.f1954b);
            } else if (index == 3) {
                this.c = typedArrayObtainStyledAttributes.getDimension(index, this.c);
            } else if (index == 4) {
                this.f1953a = typedArrayObtainStyledAttributes.getDimension(index, this.f1953a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
