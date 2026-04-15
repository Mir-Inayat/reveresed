package androidx.emoji2.text;

import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import v0.o0;
import v0.u0;
import v0.v0;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class q implements r, f0.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f246b;
    public Object c;

    public /* synthetic */ q(int i2, Object obj) {
        this.f245a = i2;
        this.c = obj;
    }

    public void a() {
        int[] iArr = (int[]) this.f246b;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.c = null;
    }

    @Override // androidx.emoji2.text.r
    public Object b() {
        return (e0) this.f246b;
    }

    public void c(int i2) {
        int[] iArr = (int[]) this.f246b;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i2, 10) + 1];
            this.f246b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i2 >= iArr.length) {
            int length = iArr.length;
            while (length <= i2) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f246b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f246b;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public View d(int i2, int i3, int i4, int i5) {
        int iX;
        int i6;
        int iY;
        View viewP;
        int left;
        int i7;
        int right;
        int i8;
        u0 u0Var = (u0) this.c;
        v0.b0 b0Var = (v0.b0) this.f246b;
        switch (b0Var.f2293a) {
            case 0:
                iX = b0Var.f2294b.x();
                break;
            default:
                iX = b0Var.f2294b.z();
                break;
        }
        switch (b0Var.f2293a) {
            case 0:
                v0.c0 c0Var = b0Var.f2294b;
                i6 = c0Var.f2304i;
                iY = c0Var.y();
                break;
            default:
                v0.c0 c0Var2 = b0Var.f2294b;
                i6 = c0Var2.f2305j;
                iY = c0Var2.w();
                break;
        }
        int i9 = i6 - iY;
        int i10 = i3 > i2 ? 1 : -1;
        View view = null;
        while (i2 != i3) {
            switch (b0Var.f2293a) {
                case 0:
                    viewP = b0Var.f2294b.p(i2);
                    break;
                default:
                    viewP = b0Var.f2294b.p(i2);
                    break;
            }
            switch (b0Var.f2293a) {
                case 0:
                    v0.d0 d0Var = (v0.d0) viewP.getLayoutParams();
                    left = viewP.getLeft() - ((v0.d0) viewP.getLayoutParams()).f2309a.left;
                    i7 = ((ViewGroup.MarginLayoutParams) d0Var).leftMargin;
                    break;
                default:
                    v0.d0 d0Var2 = (v0.d0) viewP.getLayoutParams();
                    left = viewP.getTop() - ((v0.d0) viewP.getLayoutParams()).f2309a.top;
                    i7 = ((ViewGroup.MarginLayoutParams) d0Var2).topMargin;
                    break;
            }
            int i11 = left - i7;
            switch (b0Var.f2293a) {
                case 0:
                    v0.d0 d0Var3 = (v0.d0) viewP.getLayoutParams();
                    right = viewP.getRight() + ((v0.d0) viewP.getLayoutParams()).f2309a.right;
                    i8 = ((ViewGroup.MarginLayoutParams) d0Var3).rightMargin;
                    break;
                default:
                    v0.d0 d0Var4 = (v0.d0) viewP.getLayoutParams();
                    right = viewP.getBottom() + ((v0.d0) viewP.getLayoutParams()).f2309a.bottom;
                    i8 = ((ViewGroup.MarginLayoutParams) d0Var4).bottomMargin;
                    break;
            }
            int i12 = right + i8;
            u0Var.f2445b = iX;
            u0Var.c = i9;
            u0Var.f2446d = i11;
            u0Var.f2447e = i12;
            if (i4 != 0) {
                u0Var.f2444a = i4;
                if (u0Var.a()) {
                    return viewP;
                }
            }
            if (i5 != 0) {
                u0Var.f2444a = i5;
                if (u0Var.a()) {
                    view = viewP;
                }
            }
            i2 += i10;
        }
        return view;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009b  */
    @Override // f0.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f0.n1 e(android.view.View r21, f0.n1 r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            java.lang.Object r3 = r0.f246b
            d0.g r3 = (d0.g) r3
            java.lang.Object r4 = r0.c
            o1.m r4 = (o1.m) r4
            int r5 = r4.f1871a
            int r6 = r4.f1872b
            int r4 = r4.c
            f0.l1 r7 = r2.f1281a
            r8 = 7
            x.c r8 = r7.f(r8)
            r9 = 32
            x.c r9 = r7.f(r9)
            java.lang.Object r10 = r3.f828b
            com.google.android.material.bottomsheet.BottomSheetBehavior r10 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r10
            int r11 = r8.f2617b
            int r12 = r8.c
            int r13 = r8.f2616a
            r10.f574w = r11
            int r11 = r1.getLayoutDirection()
            r15 = 1
            if (r11 != r15) goto L36
            r11 = r15
            goto L37
        L36:
            r11 = 0
        L37:
            int r16 = r1.getPaddingBottom()
            int r17 = r1.getPaddingLeft()
            int r18 = r1.getPaddingRight()
            boolean r14 = r10.f566o
            if (r14 == 0) goto L51
            x.c r7 = r7.j()
            int r7 = r7.f2618d
            r10.f573v = r7
            int r16 = r4 + r7
        L51:
            r4 = r16
            boolean r7 = r10.f567p
            if (r7 == 0) goto L5e
            if (r11 == 0) goto L5b
            r7 = r6
            goto L5c
        L5b:
            r7 = r5
        L5c:
            int r17 = r7 + r13
        L5e:
            r7 = r17
            boolean r15 = r10.f568q
            if (r15 == 0) goto L6a
            if (r11 == 0) goto L67
            goto L68
        L67:
            r5 = r6
        L68:
            int r18 = r5 + r12
        L6a:
            r5 = r18
            android.view.ViewGroup$LayoutParams r6 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            boolean r11 = r10.f570s
            if (r11 == 0) goto L7f
            int r11 = r6.leftMargin
            if (r11 == r13) goto L7f
            r6.leftMargin = r13
            r19 = 1
            goto L81
        L7f:
            r19 = 0
        L81:
            boolean r11 = r10.f571t
            if (r11 == 0) goto L8d
            int r11 = r6.rightMargin
            if (r11 == r12) goto L8d
            r6.rightMargin = r12
            r19 = 1
        L8d:
            boolean r11 = r10.f572u
            if (r11 == 0) goto L9b
            int r11 = r6.topMargin
            int r8 = r8.f2617b
            if (r11 == r8) goto L9b
            r6.topMargin = r8
            r15 = 1
            goto L9d
        L9b:
            r15 = r19
        L9d:
            if (r15 == 0) goto La2
            r1.setLayoutParams(r6)
        La2:
            int r6 = r1.getPaddingTop()
            r1.setPadding(r7, r6, r5, r4)
            boolean r1 = r3.f827a
            if (r1 == 0) goto Lb1
            int r3 = r9.f2618d
            r10.f564m = r3
        Lb1:
            if (r14 != 0) goto Lb7
            if (r1 == 0) goto Lb6
            goto Lb7
        Lb6:
            return r2
        Lb7:
            r10.I()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.q.e(android.view.View, f0.n1):f0.n1");
    }

    public KeyListener f(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((q) ((n) this.c).f244b).getClass();
        if (keyListener instanceof p0.e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new p0.e(keyListener);
    }

    public void g(AttributeSet attributeSet, int i2) {
        TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f246b).getContext().obtainStyledAttributes(attributeSet, b.a.f437g, i2, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            m(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public p0.b h(InputConnection inputConnection, EditorInfo editorInfo) {
        n nVar = (n) this.c;
        if (inputConnection == null) {
            nVar.getClass();
            inputConnection = null;
        } else {
            q qVar = (q) nVar.f244b;
            qVar.getClass();
            if (!(inputConnection instanceof p0.b)) {
                inputConnection = new p0.b((EditText) qVar.f246b, inputConnection, editorInfo);
            }
        }
        return (p0.b) inputConnection;
    }

    public void i(c0.g gVar) {
        Handler handler = (Handler) this.c;
        n nVar = (n) this.f246b;
        int i2 = gVar.f478b;
        if (i2 == 0) {
            handler.post(new c0.a(nVar, gVar.f477a, 0));
        } else {
            handler.post(new j(nVar, i2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x0205, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:112:0x010c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0105 A[Catch: IOException -> 0x008d, XmlPullParserException -> 0x0090, TryCatch #2 {IOException -> 0x008d, XmlPullParserException -> 0x0090, blocks: (B:19:0x005e, B:96:0x0205, B:27:0x0070, B:28:0x007e, B:30:0x0083, B:37:0x0093, B:45:0x00ad, B:40:0x009c, B:43:0x00a5, B:46:0x00bb, B:50:0x00ca, B:52:0x00d2, B:53:0x00dc, B:62:0x0105, B:63:0x010c, B:64:0x0124, B:56:0x00e5, B:58:0x00ed, B:59:0x00fb, B:65:0x0125, B:67:0x012d, B:68:0x013b, B:71:0x0145, B:72:0x0150, B:73:0x0168, B:74:0x0169, B:77:0x0173, B:78:0x017e, B:79:0x0196, B:80:0x0197, B:82:0x019f, B:83:0x01a8, B:86:0x01b2, B:87:0x01bc, B:88:0x01d4, B:89:0x01d5, B:92:0x01df, B:93:0x01e9, B:94:0x0201, B:95:0x0202), top: B:104:0x005e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(android.content.Context r10, android.content.res.XmlResourceParser r11) {
        /*
            Method dump skipped, instruction units count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.q.j(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    public void k(o0 o0Var) {
        v0 v0Var = (v0) ((i.k) this.f246b).get(o0Var);
        if (v0Var == null) {
            return;
        }
        v0Var.f2450a &= -2;
    }

    @Override // androidx.emoji2.text.r
    public boolean l(CharSequence charSequence, int i2, int i3, b0 b0Var) {
        if ((b0Var.c & 4) > 0) {
            return true;
        }
        if (((e0) this.f246b) == null) {
            this.f246b = new e0(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((t1.g) this.c).getClass();
        ((e0) this.f246b).setSpan(new c0(b0Var), i2, i3, 33);
        return true;
    }

    public void m(boolean z) {
        p0.i iVar = (p0.i) ((q) ((n) this.c).f244b).c;
        if (iVar.c != z) {
            if (iVar.f1889b != null) {
                l lVarA = l.a();
                p0.h hVar = iVar.f1889b;
                lVarA.getClass();
                a0.a.h(hVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = lVarA.f233a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    lVarA.f234b.remove(hVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            iVar.c = z;
            if (z) {
                p0.i.a(iVar.f1888a, l.a().b());
            }
        }
    }

    public String toString() {
        switch (this.f245a) {
            case 4:
                return "Bounds{lower=" + ((x.c) this.f246b) + " upper=" + ((x.c) this.c) + "}";
            case 5:
                String str = "[ ";
                if (((l.g) this.f246b) != null) {
                    for (int i2 = 0; i2 < 9; i2++) {
                        str = str + ((l.g) this.f246b).f1554h[i2] + " ";
                    }
                }
                return str + "] " + ((l.g) this.f246b);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ q(int i2, boolean z) {
        this.f245a = i2;
    }

    public /* synthetic */ q(Object obj, Object obj2, int i2) {
        this.f245a = i2;
        this.f246b = obj;
        this.c = obj2;
    }

    public q(w0.f fVar) {
        this.f245a = 14;
        this.f246b = fVar;
        this.c = new w0.e();
    }

    public q(EditText editText, int i2) {
        this.f245a = i2;
        switch (i2) {
            case 9:
                this.f246b = editText;
                p0.i iVar = new p0.i(editText);
                this.c = iVar;
                editText.addTextChangedListener(iVar);
                if (p0.a.f1875b == null) {
                    synchronized (p0.a.f1874a) {
                        try {
                            if (p0.a.f1875b == null) {
                                p0.a aVar = new p0.a();
                                try {
                                    p0.a.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, p0.a.class.getClassLoader());
                                    break;
                                } catch (Throwable unused) {
                                }
                                p0.a.f1875b = aVar;
                            }
                        } finally {
                        }
                        break;
                    }
                }
                editText.setEditableFactory(p0.a.f1875b);
                return;
            default:
                this.f246b = editText;
                this.c = new n(editText);
                return;
        }
    }

    public q(v0.b0 b0Var) {
        this.f245a = 12;
        this.f246b = b0Var;
        u0 u0Var = new u0();
        u0Var.f2444a = 0;
        this.c = u0Var;
    }

    public q(int i2) {
        this.f245a = i2;
        switch (i2) {
            case 13:
                this.f246b = new i.k(0);
                this.c = new i.h();
                break;
            default:
                this.f246b = Choreographer.getInstance();
                this.c = Looper.myLooper();
                break;
        }
    }
}
