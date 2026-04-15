package d;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import e.j;
import f.u0;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import t1.e;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class d extends MenuInflater {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Class[] f810e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Class[] f811f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f813b;
    public final Context c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f814d;

    static {
        Class[] clsArr = {Context.class};
        f810e = clsArr;
        f811f = clsArr;
    }

    public d(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.f812a = objArr;
        this.f813b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i2;
        XmlPullParser xmlPullParser2;
        ColorStateList colorStateList;
        int resourceId;
        c cVar = new c(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            i2 = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i2) {
                if (eventType != 3) {
                    xmlPullParser2 = xmlPullParser;
                    z = z;
                } else {
                    String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str)) {
                        xmlPullParser2 = xmlPullParser;
                        z2 = false;
                        str = null;
                    } else {
                        if (name2.equals("group")) {
                            cVar.f787b = 0;
                            cVar.c = 0;
                            cVar.f788d = 0;
                            cVar.f789e = 0;
                            cVar.f790f = true;
                            cVar.f791g = true;
                        } else if (name2.equals("item")) {
                            if (!cVar.f792h) {
                                cVar.f792h = true;
                                cVar.b(cVar.f786a.add(cVar.f787b, cVar.f793i, cVar.f794j, cVar.f795k));
                            }
                        } else if (name2.equals("menu")) {
                            xmlPullParser2 = xmlPullParser;
                            z = true;
                        }
                        xmlPullParser2 = xmlPullParser;
                        z = z;
                    }
                }
                eventType = xmlPullParser2.next();
                i2 = 2;
                z = z;
                z2 = z2;
            } else {
                if (!z2) {
                    String name3 = xmlPullParser.getName();
                    boolean zEquals = name3.equals("group");
                    Context context = this.c;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.a.f443m);
                        cVar.f787b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        cVar.c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        cVar.f788d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        cVar.f789e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        cVar.f790f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        cVar.f791g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, b.a.f444n);
                            cVar.f793i = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                            cVar.f794j = (typedArrayObtainStyledAttributes2.getInt(5, cVar.c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, cVar.f788d) & 65535);
                            cVar.f795k = typedArrayObtainStyledAttributes2.getText(7);
                            cVar.f796l = typedArrayObtainStyledAttributes2.getText(8);
                            cVar.f797m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                            String string = typedArrayObtainStyledAttributes2.getString(9);
                            cVar.f798n = string == null ? (char) 0 : string.charAt(0);
                            cVar.f799o = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                            String string2 = typedArrayObtainStyledAttributes2.getString(10);
                            cVar.f800p = string2 == null ? (char) 0 : string2.charAt(0);
                            cVar.f801q = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                            if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                                cVar.f802r = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                cVar.f802r = cVar.f789e;
                            }
                            cVar.f803s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                            cVar.f804t = typedArrayObtainStyledAttributes2.getBoolean(4, cVar.f790f);
                            cVar.f805u = typedArrayObtainStyledAttributes2.getBoolean(1, cVar.f791g);
                            cVar.f806v = typedArrayObtainStyledAttributes2.getInt(21, -1);
                            cVar.f809y = typedArrayObtainStyledAttributes2.getString(12);
                            cVar.f807w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                            cVar.f808x = typedArrayObtainStyledAttributes2.getString(15);
                            String string3 = typedArrayObtainStyledAttributes2.getString(14);
                            boolean z3 = string3 != null;
                            if (z3 && cVar.f807w == 0 && cVar.f808x == null) {
                                if (cVar.a(string3, f811f, this.f813b) != null) {
                                    throw new ClassCastException();
                                }
                            } else if (z3) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            cVar.z = typedArrayObtainStyledAttributes2.getText(17);
                            cVar.A = typedArrayObtainStyledAttributes2.getText(22);
                            if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                                cVar.C = u0.b(typedArrayObtainStyledAttributes2.getInt(19, -1), cVar.C);
                            } else {
                                cVar.C = null;
                            }
                            if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                                if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = e.s(context, resourceId)) == null) {
                                    colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                                }
                                cVar.B = colorStateList;
                            } else {
                                cVar.B = null;
                            }
                            typedArrayObtainStyledAttributes2.recycle();
                            cVar.f792h = false;
                            xmlPullParser2 = xmlPullParser;
                        } else if (name3.equals("menu")) {
                            cVar.f792h = true;
                            SubMenu subMenuAddSubMenu = cVar.f786a.addSubMenu(cVar.f787b, cVar.f793i, cVar.f794j, cVar.f795k);
                            cVar.b(subMenuAddSubMenu.getItem());
                            xmlPullParser2 = xmlPullParser;
                            b(xmlPullParser2, attributeSet, subMenuAddSubMenu);
                        } else {
                            xmlPullParser2 = xmlPullParser;
                            str = name3;
                            z2 = true;
                        }
                        eventType = xmlPullParser2.next();
                        i2 = 2;
                        z = z;
                        z2 = z2;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z = z;
            }
            eventType = xmlPullParser2.next();
            i2 = 2;
            z = z;
            z2 = z2;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i2, Menu menu) {
        if (!(menu instanceof j)) {
            super.inflate(i2, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.c.getResources().getLayout(i2);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof j) {
                    j jVar = (j) menu;
                    if (!jVar.f904m) {
                        jVar.s();
                        z = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((j) menu).r();
                }
                layout.close();
            } catch (IOException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            } catch (XmlPullParserException e4) {
                throw new InflateException("Error inflating menu XML", e4);
            }
        } catch (Throwable th) {
            if (z) {
                ((j) menu).r();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
