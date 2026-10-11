package i;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import g0.s;
import j.q;
import j.r;
import j.w;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class j {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ k E;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f5205a;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5212h;

    /* renamed from: i, reason: collision with root package name */
    public int f5213i;

    /* renamed from: j, reason: collision with root package name */
    public int f5214j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f5215k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f5216l;

    /* renamed from: m, reason: collision with root package name */
    public int f5217m;

    /* renamed from: n, reason: collision with root package name */
    public char f5218n;
    public int o;

    /* renamed from: p, reason: collision with root package name */
    public char f5219p;

    /* renamed from: q, reason: collision with root package name */
    public int f5220q;

    /* renamed from: r, reason: collision with root package name */
    public int f5221r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f5222s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f5223t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f5224u;

    /* renamed from: v, reason: collision with root package name */
    public int f5225v;

    /* renamed from: w, reason: collision with root package name */
    public int f5226w;

    /* renamed from: x, reason: collision with root package name */
    public String f5227x;

    /* renamed from: y, reason: collision with root package name */
    public String f5228y;

    /* renamed from: z, reason: collision with root package name */
    public r f5229z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;

    /* renamed from: b, reason: collision with root package name */
    public int f5206b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f5207c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f5208d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f5209e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5210f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5211g = true;

    public j(k kVar, Menu menu) {
        this.E = kVar;
        this.f5205a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.f5234c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e10) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z9;
        MenuItem enabled = menuItem.setChecked(this.f5222s).setVisible(this.f5223t).setEnabled(this.f5224u);
        boolean z10 = false;
        if (this.f5221r >= 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        enabled.setCheckable(z9).setTitleCondensed(this.f5216l).setIcon(this.f5217m);
        int i10 = this.f5225v;
        if (i10 >= 0) {
            menuItem.setShowAsAction(i10);
        }
        String str = this.f5228y;
        k kVar = this.E;
        if (str != null) {
            if (!kVar.f5234c.isRestricted()) {
                if (kVar.f5235d == null) {
                    kVar.f5235d = k.a(kVar.f5234c);
                }
                menuItem.setOnMenuItemClickListener(new i(kVar.f5235d, this.f5228y));
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        if (this.f5221r >= 2) {
            if (menuItem instanceof q) {
                q qVar = (q) menuItem;
                qVar.f5594x = (qVar.f5594x & (-5)) | 4;
            } else if (menuItem instanceof w) {
                w wVar = (w) menuItem;
                try {
                    Method method = wVar.f5606d;
                    b0.b bVar = wVar.f5605c;
                    if (method == null) {
                        wVar.f5606d = bVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    wVar.f5606d.invoke(bVar, Boolean.TRUE);
                } catch (Exception e10) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
                }
            }
        }
        String str2 = this.f5227x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, k.f5230e, kVar.f5232a));
            z10 = true;
        }
        int i11 = this.f5226w;
        if (i11 > 0) {
            if (!z10) {
                menuItem.setActionView(i11);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        r rVar = this.f5229z;
        if (rVar != null) {
            if (menuItem instanceof b0.b) {
                ((b0.b) menuItem).b(rVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.A;
        boolean z11 = menuItem instanceof b0.b;
        if (z11) {
            ((b0.b) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            s.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z11) {
            ((b0.b) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            s.m(menuItem, charSequence2);
        }
        char c6 = this.f5218n;
        int i12 = this.o;
        if (z11) {
            ((b0.b) menuItem).setAlphabeticShortcut(c6, i12);
        } else if (Build.VERSION.SDK_INT >= 26) {
            s.g(menuItem, c6, i12);
        }
        char c10 = this.f5219p;
        int i13 = this.f5220q;
        if (z11) {
            ((b0.b) menuItem).setNumericShortcut(c10, i13);
        } else if (Build.VERSION.SDK_INT >= 26) {
            s.k(menuItem, c10, i13);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z11) {
                ((b0.b) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                s.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z11) {
                ((b0.b) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                s.i(menuItem, colorStateList);
            }
        }
    }
}
