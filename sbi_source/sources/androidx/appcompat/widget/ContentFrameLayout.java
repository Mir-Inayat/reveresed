package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import f.s0;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TypedValue f90a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TypedValue f91b;
    public TypedValue c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TypedValue f92d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TypedValue f93e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TypedValue f94f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Rect f95g;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f95g = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f93e == null) {
            this.f93e = new TypedValue();
        }
        return this.f93e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f94f == null) {
            this.f94f = new TypedValue();
        }
        return this.f94f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.c == null) {
            this.c = new TypedValue();
        }
        return this.c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f92d == null) {
            this.f92d = new TypedValue();
        }
        return this.f92d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f90a == null) {
            this.f90a = new TypedValue();
        }
        return this.f90a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f91b == null) {
            this.f91b = new TypedValue();
        }
        return this.f91b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(s0 s0Var) {
    }
}
