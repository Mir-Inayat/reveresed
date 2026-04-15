package t1;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import com.redhand.laugiytr.R;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f2155b;
    public int[][] c = new int[10][];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d[] f2156d = new d[10];

    public static a0 b(d dVar) {
        a0 a0Var = new a0();
        a0Var.a(StateSet.WILD_CARD, dVar);
        return a0Var;
    }

    public final void a(int[] iArr, d dVar) {
        int i2 = this.f2154a;
        if (i2 == 0 || iArr.length == 0) {
            this.f2155b = dVar;
        }
        int[][] iArr2 = this.c;
        if (i2 >= iArr2.length) {
            int i3 = i2 + 10;
            int[][] iArr3 = new int[i3][];
            System.arraycopy(iArr2, 0, iArr3, 0, i2);
            this.c = iArr3;
            d[] dVarArr = new d[i3];
            System.arraycopy(this.f2156d, 0, dVarArr, 0, i2);
            this.f2156d = dVarArr;
        }
        int[][] iArr4 = this.c;
        int i4 = this.f2154a;
        iArr4[i4] = iArr;
        this.f2156d[i4] = dVar;
        this.f2154a = i4 + 1;
    }

    public final d c(int[] iArr) {
        int i2;
        int[][] iArr2 = this.c;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i2 = -1;
            if (i4 >= this.f2154a) {
                i4 = -1;
                break;
            }
            if (StateSet.stateSetMatches(iArr2[i4], iArr)) {
                break;
            }
            i4++;
        }
        if (i4 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int[][] iArr4 = this.c;
            while (true) {
                if (i3 >= this.f2154a) {
                    break;
                }
                if (StateSet.stateSetMatches(iArr4[i3], iArr3)) {
                    i2 = i3;
                    break;
                }
                i3++;
            }
            i4 = i2;
        }
        return i4 < 0 ? this.f2155b : this.f2156d[i4];
    }

    public final void d(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlResourceParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                Resources resources = context.getResources();
                int[] iArr = c1.a.f509s;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                d dVarC = o.c(typedArrayObtainAttributes, 5, new a(0.0f));
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i2 = 0;
                for (int i3 = 0; i3 < attributeCount; i3++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i3);
                    if (attributeNameResource != R.NP_MANAGER3.NP_MANAGER) {
                        int i4 = i2 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i3, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i2] = attributeNameResource;
                        i2 = i4;
                    }
                }
                a(StateSet.trimStateSet(iArr2, i2), dVarC);
            }
        }
    }
}
