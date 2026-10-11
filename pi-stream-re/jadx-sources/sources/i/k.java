package i;

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
import androidx.appcompat.widget.o3;
import androidx.appcompat.widget.v1;
import j.r;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class k extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f5230e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f5231f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f5232a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f5233b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f5234c;

    /* renamed from: d, reason: collision with root package name */
    public Object f5235d;

    static {
        Class[] clsArr = {Context.class};
        f5230e = clsArr;
        f5231f = clsArr;
    }

    public k(Context context) {
        super(context);
        this.f5234c = context;
        Object[] objArr = {context};
        this.f5232a = objArr;
        this.f5233b = objArr;
    }

    public static Object a(Context context) {
        if (context instanceof Activity) {
            return context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return context;
    }

    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        int i10;
        char charAt;
        char charAt2;
        boolean z9;
        ColorStateList colorStateList;
        j jVar = new j(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            i10 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlResourceParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z10 = false;
        boolean z11 = false;
        String str = null;
        while (!z10) {
            if (eventType != 1) {
                Menu menu2 = jVar.f5205a;
                z10 = z10;
                z10 = z10;
                if (eventType != i10) {
                    if (eventType == 3) {
                        String name2 = xmlResourceParser.getName();
                        if (z11 && name2.equals(str)) {
                            z11 = false;
                            str = null;
                        } else if (name2.equals("group")) {
                            jVar.f5206b = 0;
                            jVar.f5207c = 0;
                            jVar.f5208d = 0;
                            jVar.f5209e = 0;
                            jVar.f5210f = true;
                            jVar.f5211g = true;
                            z10 = z10;
                        } else if (name2.equals("item")) {
                            z10 = z10;
                            if (!jVar.f5212h) {
                                r rVar = jVar.f5229z;
                                if (rVar != null && rVar.f5597a.hasSubMenu()) {
                                    jVar.f5212h = true;
                                    jVar.b(menu2.addSubMenu(jVar.f5206b, jVar.f5213i, jVar.f5214j, jVar.f5215k).getItem());
                                    z10 = z10;
                                } else {
                                    jVar.f5212h = true;
                                    jVar.b(menu2.add(jVar.f5206b, jVar.f5213i, jVar.f5214j, jVar.f5215k));
                                    z10 = z10;
                                }
                            }
                        } else {
                            z10 = z10;
                            if (name2.equals("menu")) {
                                z10 = true;
                            }
                        }
                    }
                } else if (!z11) {
                    String name3 = xmlResourceParser.getName();
                    boolean equals = name3.equals("group");
                    k kVar = jVar.E;
                    if (equals) {
                        TypedArray obtainStyledAttributes = kVar.f5234c.obtainStyledAttributes(attributeSet, e.a.f3284p);
                        jVar.f5206b = obtainStyledAttributes.getResourceId(1, 0);
                        jVar.f5207c = obtainStyledAttributes.getInt(3, 0);
                        jVar.f5208d = obtainStyledAttributes.getInt(4, 0);
                        jVar.f5209e = obtainStyledAttributes.getInt(5, 0);
                        jVar.f5210f = obtainStyledAttributes.getBoolean(2, true);
                        jVar.f5211g = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                        z10 = z10;
                    } else if (name3.equals("item")) {
                        Context context = kVar.f5234c;
                        o3 o3Var = new o3(context, context.obtainStyledAttributes(attributeSet, e.a.f3285q));
                        jVar.f5213i = o3Var.i(2, 0);
                        jVar.f5214j = (o3Var.h(5, jVar.f5207c) & (-65536)) | (o3Var.h(6, jVar.f5208d) & 65535);
                        jVar.f5215k = o3Var.k(7);
                        jVar.f5216l = o3Var.k(8);
                        jVar.f5217m = o3Var.i(0, 0);
                        String j4 = o3Var.j(9);
                        if (j4 == null) {
                            charAt = 0;
                        } else {
                            charAt = j4.charAt(0);
                        }
                        jVar.f5218n = charAt;
                        jVar.o = o3Var.h(16, 4096);
                        String j10 = o3Var.j(10);
                        if (j10 == null) {
                            charAt2 = 0;
                        } else {
                            charAt2 = j10.charAt(0);
                        }
                        jVar.f5219p = charAt2;
                        jVar.f5220q = o3Var.h(20, 4096);
                        if (o3Var.l(11)) {
                            jVar.f5221r = o3Var.a(11, false) ? 1 : 0;
                        } else {
                            jVar.f5221r = jVar.f5209e;
                        }
                        jVar.f5222s = o3Var.a(3, false);
                        jVar.f5223t = o3Var.a(4, jVar.f5210f);
                        jVar.f5224u = o3Var.a(1, jVar.f5211g);
                        jVar.f5225v = o3Var.h(21, -1);
                        jVar.f5228y = o3Var.j(12);
                        jVar.f5226w = o3Var.i(13, 0);
                        jVar.f5227x = o3Var.j(15);
                        String j11 = o3Var.j(14);
                        if (j11 != null) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (z9 && jVar.f5226w == 0 && jVar.f5227x == null) {
                            jVar.f5229z = (r) jVar.a(j11, f5231f, kVar.f5233b);
                        } else {
                            if (z9) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            jVar.f5229z = null;
                        }
                        jVar.A = o3Var.k(17);
                        jVar.B = o3Var.k(22);
                        if (o3Var.l(19)) {
                            jVar.D = v1.b(o3Var.h(19, -1), jVar.D);
                            colorStateList = null;
                        } else {
                            colorStateList = null;
                            jVar.D = null;
                        }
                        if (o3Var.l(18)) {
                            jVar.C = o3Var.b(18);
                        } else {
                            jVar.C = colorStateList;
                        }
                        o3Var.p();
                        jVar.f5212h = false;
                    } else if (name3.equals("menu")) {
                        jVar.f5212h = true;
                        SubMenu addSubMenu = menu2.addSubMenu(jVar.f5206b, jVar.f5213i, jVar.f5214j, jVar.f5215k);
                        jVar.b(addSubMenu.getItem());
                        b(xmlResourceParser, attributeSet, addSubMenu);
                    } else {
                        str = name3;
                        z11 = true;
                    }
                }
                eventType = xmlResourceParser.next();
                i10 = 2;
                z10 = z10;
                z11 = z11;
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i10, Menu menu) {
        if (!(menu instanceof b0.a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f5234c.getResources().getLayout(i10);
                    b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (XmlPullParserException e10) {
                    throw new InflateException("Error inflating menu XML", e10);
                }
            } catch (IOException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
