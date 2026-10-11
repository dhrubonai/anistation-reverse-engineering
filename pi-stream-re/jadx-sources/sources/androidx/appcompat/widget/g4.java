package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public final class g4 implements u1 {

    /* renamed from: a, reason: collision with root package name */
    public final Toolbar f496a;

    /* renamed from: b, reason: collision with root package name */
    public int f497b;

    /* renamed from: c, reason: collision with root package name */
    public View f498c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f499d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f500e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f501f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f502g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f503h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f504i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f505j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f506k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f507l;

    /* renamed from: m, reason: collision with root package name */
    public m f508m;

    /* renamed from: n, reason: collision with root package name */
    public int f509n;
    public Drawable o;

    public g4(Toolbar toolbar) {
        boolean z9;
        Drawable drawable;
        this.f509n = 0;
        this.f496a = toolbar;
        this.f503h = toolbar.getTitle();
        this.f504i = toolbar.getSubtitle();
        if (this.f503h != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f502g = z9;
        this.f501f = toolbar.getNavigationIcon();
        o3 m5 = o3.m(toolbar.getContext(), null, e.a.f3270a, R.attr.actionBarStyle);
        this.o = m5.e(15);
        CharSequence k10 = m5.k(27);
        if (!TextUtils.isEmpty(k10)) {
            this.f502g = true;
            this.f503h = k10;
            if ((this.f497b & 8) != 0) {
                toolbar.setTitle(k10);
                if (this.f502g) {
                    g0.y0.m(toolbar.getRootView(), k10);
                }
            }
        }
        CharSequence k11 = m5.k(25);
        if (!TextUtils.isEmpty(k11)) {
            this.f504i = k11;
            if ((this.f497b & 8) != 0) {
                toolbar.setSubtitle(k11);
            }
        }
        Drawable e10 = m5.e(20);
        if (e10 != null) {
            this.f500e = e10;
            b();
        }
        Drawable e11 = m5.e(17);
        if (e11 != null) {
            this.f499d = e11;
            b();
        }
        if (this.f501f == null && (drawable = this.o) != null) {
            this.f501f = drawable;
            if ((this.f497b & 4) != 0) {
                toolbar.setNavigationIcon(drawable);
            } else {
                toolbar.setNavigationIcon((Drawable) null);
            }
        }
        a(m5.h(10, 0));
        int i10 = m5.i(9, 0);
        if (i10 != 0) {
            View inflate = LayoutInflater.from(toolbar.getContext()).inflate(i10, (ViewGroup) toolbar, false);
            View view = this.f498c;
            if (view != null && (this.f497b & 16) != 0) {
                toolbar.removeView(view);
            }
            this.f498c = inflate;
            if (inflate != null && (this.f497b & 16) != 0) {
                toolbar.addView(inflate);
            }
            a(this.f497b | 16);
        }
        int layoutDimension = ((TypedArray) m5.f598b).getLayoutDimension(13, 0);
        if (layoutDimension > 0) {
            ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
            layoutParams.height = layoutDimension;
            toolbar.setLayoutParams(layoutParams);
        }
        int c6 = m5.c(7, -1);
        int c10 = m5.c(3, -1);
        if (c6 >= 0 || c10 >= 0) {
            int max = Math.max(c6, 0);
            int max2 = Math.max(c10, 0);
            if (toolbar.K == null) {
                toolbar.K = new a3();
            }
            toolbar.K.a(max, max2);
        }
        int i11 = m5.i(28, 0);
        if (i11 != 0) {
            Context context = toolbar.getContext();
            toolbar.C = i11;
            i1 i1Var = toolbar.f377b;
            if (i1Var != null) {
                i1Var.setTextAppearance(context, i11);
            }
        }
        int i12 = m5.i(26, 0);
        if (i12 != 0) {
            Context context2 = toolbar.getContext();
            toolbar.D = i12;
            i1 i1Var2 = toolbar.f379c;
            if (i1Var2 != null) {
                i1Var2.setTextAppearance(context2, i12);
            }
        }
        int i13 = m5.i(22, 0);
        if (i13 != 0) {
            toolbar.setPopupTheme(i13);
        }
        m5.p();
        if (R.string.abc_action_bar_up_description != this.f509n) {
            this.f509n = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i14 = this.f509n;
                String string = i14 != 0 ? toolbar.getContext().getString(i14) : null;
                this.f505j = string;
                if ((this.f497b & 4) != 0) {
                    if (TextUtils.isEmpty(string)) {
                        toolbar.setNavigationContentDescription(this.f509n);
                    } else {
                        toolbar.setNavigationContentDescription(this.f505j);
                    }
                }
            }
        }
        this.f505j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new c(this));
    }

    public final void a(int i10) {
        View view;
        int i11 = this.f497b ^ i10;
        this.f497b = i10;
        if (i11 != 0) {
            int i12 = i11 & 4;
            Toolbar toolbar = this.f496a;
            if (i12 != 0) {
                if ((i10 & 4) != 0 && (i10 & 4) != 0) {
                    if (TextUtils.isEmpty(this.f505j)) {
                        toolbar.setNavigationContentDescription(this.f509n);
                    } else {
                        toolbar.setNavigationContentDescription(this.f505j);
                    }
                }
                if ((this.f497b & 4) != 0) {
                    Drawable drawable = this.f501f;
                    if (drawable == null) {
                        drawable = this.o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i11 & 3) != 0) {
                b();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    toolbar.setTitle(this.f503h);
                    toolbar.setSubtitle(this.f504i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f498c) != null) {
                if ((i10 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Drawable drawable;
        int i10 = this.f497b;
        if ((i10 & 2) != 0) {
            if ((i10 & 1) != 0) {
                drawable = this.f500e;
                if (drawable == null) {
                    drawable = this.f499d;
                }
            } else {
                drawable = this.f499d;
            }
        } else {
            drawable = null;
        }
        this.f496a.setLogo(drawable);
    }
}
