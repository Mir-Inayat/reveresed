package f;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.redhand.laugiytr.R;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public abstract class a1 extends ListView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f975b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f977e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f978f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public y0 f979g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f980h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f981i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f982j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public k0.g f983k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public androidx.fragment.app.b f984l;

    public a1(Context context, boolean z) {
        super(context, null, R.NP_MANAGER3.NP_MANAGER);
        this.f974a = new Rect();
        this.f975b = 0;
        this.c = 0;
        this.f976d = 0;
        this.f977e = 0;
        this.f981i = z;
        setCacheColorHint(0);
    }

    public final int a(int i2, int i3) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i4 = 0;
        View view = null;
        for (int i5 = 0; i5 < count; i5++) {
            int itemViewType = adapter.getItemViewType(i5);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            view = adapter.getView(i5, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i6 = layoutParams.height;
            view.measure(i2, i6 > 0 ? View.MeasureSpec.makeMeasureSpec(i6, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i5 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i3) {
                return i3;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(android.view.MotionEvent r18, int r19) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a1.b(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f974a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f984l != null) {
            return;
        }
        super.drawableStateChanged();
        y0 y0Var = this.f979g;
        if (y0Var != null) {
            y0Var.f1213b = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f982j && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f981i || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f981i || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f981i || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f981i && this.f980h) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f984l = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f984l == null) {
            androidx.fragment.app.b bVar = new androidx.fragment.app.b(2, this);
            this.f984l = bVar;
            post(bVar);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i2 < 30 || !w0.f1207d) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        w0.f1205a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        w0.f1206b.invoke(this, Integer.valueOf(iPointToPosition));
                        w0.c.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e3) {
                        e3.printStackTrace();
                    } catch (InvocationTargetException e4) {
                        e4.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f982j && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f978f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        androidx.fragment.app.b bVar = this.f984l;
        if (bVar != null) {
            a1 a1Var = (a1) bVar.f282b;
            a1Var.f984l = null;
            a1Var.removeCallbacks(bVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f980h = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        y0 y0Var = null;
        if (drawable != null) {
            y0 y0Var2 = new y0();
            Drawable drawable2 = y0Var2.f1212a;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            y0Var2.f1212a = drawable;
            drawable.setCallback(y0Var2);
            y0Var2.f1213b = true;
            y0Var = y0Var2;
        }
        this.f979g = y0Var;
        super.setSelector(y0Var);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f975b = rect.left;
        this.c = rect.top;
        this.f976d = rect.right;
        this.f977e = rect.bottom;
    }
}
