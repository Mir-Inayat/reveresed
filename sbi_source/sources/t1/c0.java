package t1;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import com.redhand.laugiytr.R;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f2168b;
    public final int[][] c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o[] f2169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a0 f2170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a0 f2171f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a0 f2172g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a0 f2173h;

    public c0(b0 b0Var) {
        this.f2167a = b0Var.f2159a;
        this.f2168b = b0Var.f2160b;
        this.c = b0Var.c;
        this.f2169d = b0Var.f2161d;
        this.f2170e = b0Var.f2162e;
        this.f2171f = b0Var.f2163f;
        this.f2172g = b0Var.f2164g;
        this.f2173h = b0Var.f2165h;
    }

    public static void a(b0 b0Var, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
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
                int[] iArr = c1.a.f503m;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                o oVarA = o.a(context, typedArrayObtainAttributes.getResourceId(0, 0), typedArrayObtainAttributes.getResourceId(1, 0), new a(0)).a();
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i2 = 0;
                for (int i3 = 0; i3 < attributeCount; i3++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i3);
                    if (attributeNameResource != R.NP_MANAGER3.NP_MANAGER && attributeNameResource != R.NP_MANAGER3.NP_MANAGER) {
                        int i4 = i2 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i3, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i2] = attributeNameResource;
                        i2 = i4;
                    }
                }
                b0Var.a(StateSet.trimStateSet(iArr2, i2), oVarA);
            }
        }
    }

    public static c0 b(Context context, TypedArray typedArray, int i2) {
        XmlResourceParser xml;
        int next;
        int resourceId = typedArray.getResourceId(i2, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        b0 b0Var = new b0();
        b0Var.b();
        try {
            xml = context.getResources().getXml(resourceId);
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            b0Var.b();
        }
        try {
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (xml.getName().equals("selector")) {
                a(b0Var, context, xml, attributeSetAsAttributeSet, context.getTheme());
            }
            xml.close();
            if (b0Var.f2159a == 0) {
                return null;
            }
            return new c0(b0Var);
        } catch (Throwable th) {
            if (xml != null) {
                try {
                    xml.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final o c() {
        o oVar = this.f2168b;
        a0 a0Var = this.f2173h;
        a0 a0Var2 = this.f2172g;
        a0 a0Var3 = this.f2171f;
        a0 a0Var4 = this.f2170e;
        if (a0Var4 == null && a0Var3 == null && a0Var2 == null && a0Var == null) {
            return oVar;
        }
        n nVarF = oVar.f();
        if (a0Var4 != null) {
            nVarF.f2232e = a0Var4.f2155b;
        }
        if (a0Var3 != null) {
            nVarF.f2233f = a0Var3.f2155b;
        }
        if (a0Var2 != null) {
            nVarF.f2235h = a0Var2.f2155b;
        }
        if (a0Var != null) {
            nVarF.f2234g = a0Var.f2155b;
        }
        return nVarF.a();
    }

    public final boolean d() {
        a0 a0Var;
        a0 a0Var2;
        a0 a0Var3;
        a0 a0Var4;
        return this.f2167a > 1 || ((a0Var = this.f2170e) != null && a0Var.f2154a > 1) || (((a0Var2 = this.f2171f) != null && a0Var2.f2154a > 1) || (((a0Var3 = this.f2172g) != null && a0Var3.f2154a > 1) || ((a0Var4 = this.f2173h) != null && a0Var4.f2154a > 1)));
    }
}
