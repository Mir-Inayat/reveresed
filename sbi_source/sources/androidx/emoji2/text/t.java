package androidx.emoji2.text;

import android.content.ClipDescription;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class t implements j0.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f253b;
    public Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f254d;

    public /* synthetic */ t() {
        this.f252a = 3;
    }

    public static boolean g(Editable editable, KeyEvent keyEvent, boolean z) {
        c0[] c0VarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (c0VarArr = (c0[]) editable.getSpans(selectionStart, selectionEnd, c0.class)) != null && c0VarArr.length > 0) {
                for (c0 c0Var : c0VarArr) {
                    int spanStart = editable.getSpanStart(c0Var);
                    int spanEnd = editable.getSpanEnd(c0Var);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static t v(Context context, AttributeSet attributeSet, int[] iArr, int i2) {
        return new t(context, context.obtainStyledAttributes(attributeSet, iArr, i2, 0));
    }

    public void A(View view) {
        if (((ArrayList) this.f254d).remove(view)) {
            RecyclerView.s(view);
        }
    }

    public void B(n.f fVar) {
        ArrayList arrayList = (ArrayList) this.f253b;
        arrayList.clear();
        int size = fVar.f1668p0.size();
        for (int i2 = 0; i2 < size; i2++) {
            n.e eVar = (n.e) fVar.f1668p0.get(i2);
            int[] iArr = eVar.f1657o0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(eVar);
            }
        }
        fVar.f1670r0.f1768b = true;
    }

    @Override // j0.g
    public Uri b() {
        return (Uri) this.f254d;
    }

    @Override // j0.g
    public ClipDescription c() {
        return (ClipDescription) this.c;
    }

    @Override // j0.g
    public Object d() {
        return null;
    }

    @Override // j0.g
    public Uri e() {
        return (Uri) this.f253b;
    }

    public void f(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView recyclerView = ((v0.v) this.f253b).f2448a;
        int childCount = i2 < 0 ? recyclerView.getChildCount() : o(i2);
        ((v0.b) this.c).e(childCount, z);
        if (z) {
            t(view);
        }
        RecyclerView.s(view);
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public void h(int i2) {
        int iO = o(i2);
        ((v0.b) this.c).f(iO);
        RecyclerView recyclerView = ((v0.v) this.f253b).f2448a;
        View childAt = recyclerView.getChildAt(iO);
        if (childAt != null) {
            RecyclerView.s(childAt);
        }
        recyclerView.detachViewFromParent(iO);
    }

    public int i(int i2, int i3) {
        ArrayList arrayList = (ArrayList) this.f254d;
        int size = arrayList.size();
        while (i3 < size) {
            ((v0.a) arrayList.get(i3)).getClass();
            i3++;
        }
        return i2;
    }

    public View j(int i2) {
        return ((v0.v) this.f253b).f2448a.getChildAt(o(i2));
    }

    public int k() {
        return ((v0.v) this.f253b).f2448a.getChildCount() - ((ArrayList) this.f254d).size();
    }

    public ColorStateList l(int i2) {
        int resourceId;
        ColorStateList colorStateListS;
        TypedArray typedArray = (TypedArray) this.c;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (colorStateListS = t1.e.s((Context) this.f253b, resourceId)) == null) ? typedArray.getColorStateList(i2) : colorStateListS;
    }

    public Drawable m(int i2) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.c;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0) ? typedArray.getDrawable(i2) : a0.a.r((Context) this.f253b, resourceId);
    }

    public Typeface n(int i2, int i3, f.d0 d0Var) {
        int resourceId = ((TypedArray) this.c).getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f254d) == null) {
            this.f254d = new TypedValue();
        }
        Context context = (Context) this.f253b;
        TypedValue typedValue = (TypedValue) this.f254d;
        ThreadLocal threadLocal = w.n.f2490a;
        if (context.isRestricted()) {
            return null;
        }
        return w.n.a(context, resourceId, typedValue, i3, d0Var, true, false);
    }

    public int o(int i2) {
        v0.b bVar = (v0.b) this.c;
        if (i2 < 0) {
            return -1;
        }
        int childCount = ((v0.v) this.f253b).f2448a.getChildCount();
        int i3 = i2;
        while (i3 < childCount) {
            int iB = i2 - (i3 - bVar.b(i3));
            if (iB == 0) {
                while (bVar.d(i3)) {
                    i3++;
                }
                return i3;
            }
            i3 += iB;
        }
        return -1;
    }

    public View p(int i2) {
        return ((v0.v) this.f253b).f2448a.getChildAt(i2);
    }

    public int q() {
        return ((v0.v) this.f253b).f2448a.getChildCount();
    }

    public boolean r(CharSequence charSequence, int i2, int i3, b0 b0Var) {
        if ((b0Var.c & 3) == 0) {
            h hVar = (h) this.f254d;
            o0.a aVarB = b0Var.b();
            int iA = aVarB.a(8);
            if (iA != 0) {
                aVarB.f1807b.getShort(iA + aVarB.f1806a);
            }
            e eVar = (e) hVar;
            eVar.getClass();
            ThreadLocal threadLocal = e.f222b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i2 < i3) {
                sb.append(charSequence.charAt(i2));
                i2++;
            }
            TextPaint textPaint = eVar.f223a;
            String string = sb.toString();
            int i4 = x.e.f2619a;
            boolean zA = x.d.a(textPaint, string);
            int i5 = b0Var.c & 4;
            b0Var.c = zA ? i5 | 2 : i5 | 1;
        }
        return (b0Var.c & 3) == 2;
    }

    public boolean s() {
        return ((ArrayList) this.c).size() > 0;
    }

    public void t(View view) {
        ((ArrayList) this.f254d).add(view);
        RecyclerView.s(view);
    }

    public String toString() {
        switch (this.f252a) {
            case 6:
                return ((v0.b) this.c).toString() + ", hidden list:" + ((ArrayList) this.f254d).size();
            default:
                return super.toString();
        }
    }

    public boolean u(int i2, n.e eVar, q.f fVar) {
        o.b bVar = (o.b) this.c;
        int[] iArr = eVar.f1657o0;
        int[] iArr2 = eVar.f1661s;
        bVar.f1756a = iArr[0];
        bVar.f1757b = iArr[1];
        bVar.c = eVar.n();
        bVar.f1758d = eVar.k();
        bVar.f1763i = false;
        bVar.f1764j = i2;
        boolean z = bVar.f1756a == 3;
        boolean z2 = bVar.f1757b == 3;
        boolean z3 = z && eVar.V > 0.0f;
        boolean z4 = z2 && eVar.V > 0.0f;
        if (z3 && iArr2[0] == 4) {
            bVar.f1756a = 1;
        }
        if (z4 && iArr2[1] == 4) {
            bVar.f1757b = 1;
        }
        fVar.b(eVar, bVar);
        eVar.J(bVar.f1759e);
        eVar.G(bVar.f1760f);
        eVar.D = bVar.f1762h;
        eVar.D(bVar.f1761g);
        bVar.f1764j = 0;
        return bVar.f1763i;
    }

    public Object w(CharSequence charSequence, int i2, int i3, int i4, boolean z, r rVar) {
        int i5;
        char c;
        s sVar = new s((x) ((y) this.c).c);
        int iCodePointAt = Character.codePointAt(charSequence, i2);
        int i6 = 0;
        boolean zL = true;
        int iCharCount = i2;
        loop0: while (true) {
            i5 = iCharCount;
            while (iCharCount < i3 && i6 < i4 && zL) {
                SparseArray sparseArray = sVar.c.f267a;
                x xVar = sparseArray == null ? null : (x) sparseArray.get(iCodePointAt);
                if (sVar.f247a == 2) {
                    if (xVar != null) {
                        sVar.c = xVar;
                        sVar.f251f++;
                    } else {
                        if (iCodePointAt == 65038) {
                            sVar.a();
                        } else if (iCodePointAt != 65039) {
                            x xVar2 = sVar.c;
                            if (xVar2.f268b != null) {
                                if (sVar.f251f != 1) {
                                    sVar.f249d = xVar2;
                                    sVar.a();
                                } else if (sVar.b()) {
                                    sVar.f249d = sVar.c;
                                    sVar.a();
                                } else {
                                    sVar.a();
                                }
                                c = 3;
                            } else {
                                sVar.a();
                            }
                        }
                        c = 1;
                    }
                    c = 2;
                } else if (xVar == null) {
                    sVar.a();
                    c = 1;
                } else {
                    sVar.f247a = 2;
                    sVar.c = xVar;
                    sVar.f251f = 1;
                    c = 2;
                }
                sVar.f250e = iCodePointAt;
                if (c == 1) {
                    iCharCount = Character.charCount(Character.codePointAt(charSequence, i5)) + i5;
                    if (iCharCount < i3) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                } else if (c == 2) {
                    int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                    if (iCharCount2 < i3) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                    }
                    iCharCount = iCharCount2;
                } else if (c == 3) {
                    if (z || !r(charSequence, i5, iCharCount, sVar.f249d.f268b)) {
                        zL = rVar.l(charSequence, i5, iCharCount, sVar.f249d.f268b);
                        i6++;
                    }
                }
            }
            break loop0;
        }
        if (sVar.f247a == 2 && sVar.c.f268b != null && ((sVar.f251f > 1 || sVar.b()) && i6 < i4 && zL && (z || !r(charSequence, i5, iCharCount, sVar.c.f268b)))) {
            rVar.l(charSequence, i5, iCharCount, sVar.c.f268b);
        }
        return rVar.b();
    }

    public void x() {
        ((TypedArray) this.c).recycle();
    }

    public void y(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            v0.a aVar = (v0.a) arrayList.get(i2);
            aVar.getClass();
            ((e0.b) this.f253b).c(aVar);
        }
        arrayList.clear();
    }

    public void z(n.f fVar, int i2, int i3, int i4) {
        int i5 = fVar.f1630a0;
        int i6 = fVar.f1632b0;
        fVar.f1630a0 = 0;
        fVar.f1632b0 = 0;
        fVar.J(i3);
        fVar.G(i4);
        if (i5 < 0) {
            fVar.f1630a0 = 0;
        } else {
            fVar.f1630a0 = i5;
        }
        if (i6 < 0) {
            fVar.f1632b0 = 0;
        } else {
            fVar.f1632b0 = i6;
        }
        n.f fVar2 = (n.f) this.f254d;
        fVar2.f1671s0 = i2;
        fVar2.P();
    }

    public t(v0.v vVar) {
        this.f252a = 6;
        this.f253b = vVar;
        this.c = new v0.b();
        this.f254d = new ArrayList();
    }

    public t(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f252a = 2;
        this.f253b = uri;
        this.c = clipDescription;
        this.f254d = uri2;
    }

    public t(Context context, TypedArray typedArray) {
        this.f252a = 1;
        this.f253b = context;
        this.c = typedArray;
    }

    public t(n.f fVar) {
        this.f252a = 4;
        this.f253b = new ArrayList();
        this.c = new o.b();
        this.f254d = fVar;
    }

    public t(t1.g gVar) {
        this.f252a = 5;
        this.f253b = new e0.b(30);
        this.c = new ArrayList();
        this.f254d = new ArrayList();
        new t1.g(21, this);
    }

    public t(y yVar, t1.g gVar, e eVar, Set set) {
        this.f252a = 0;
        this.f253b = gVar;
        this.c = yVar;
        this.f254d = eVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            w(str, 0, str.length(), 1, true, new n(1, str));
        }
    }

    @Override // j0.g
    public void a() {
    }
}
