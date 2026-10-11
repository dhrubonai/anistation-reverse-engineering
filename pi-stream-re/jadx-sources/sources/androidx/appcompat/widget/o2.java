package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class o2 implements j.g0 {
    public static final Method R;
    public static final Method S;
    public static final Method T;
    public boolean A;
    public boolean B;
    public l2 E;
    public View F;
    public AdapterView.OnItemClickListener G;
    public AdapterView.OnItemSelectedListener H;
    public final Handler M;
    public Rect O;
    public boolean P;
    public final g0 Q;

    /* renamed from: a, reason: collision with root package name */
    public final Context f588a;

    /* renamed from: b, reason: collision with root package name */
    public ListAdapter f589b;

    /* renamed from: c, reason: collision with root package name */
    public b2 f590c;

    /* renamed from: f, reason: collision with root package name */
    public int f593f;

    /* renamed from: x, reason: collision with root package name */
    public int f594x;

    /* renamed from: z, reason: collision with root package name */
    public boolean f596z;

    /* renamed from: d, reason: collision with root package name */
    public final int f591d = -2;

    /* renamed from: e, reason: collision with root package name */
    public int f592e = -2;

    /* renamed from: y, reason: collision with root package name */
    public final int f595y = 1002;
    public int C = 0;
    public final int D = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    public final h2 I = new h2(this, 2);
    public final n2 J = new n2(this);
    public final m2 K = new m2(this);
    public final h2 L = new h2(this, 1);
    public final Rect N = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                R = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                T = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                S = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public o2(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f588a = context;
        this.M = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.a.o, i10, i11);
        this.f593f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f594x = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f596z = true;
        }
        obtainStyledAttributes.recycle();
        g0 g0Var = new g0(context, attributeSet, i10, i11);
        this.Q = g0Var;
        g0Var.setInputMethodMode(1);
    }

    public b2 a(Context context, boolean z9) {
        return new b2(context, z9);
    }

    @Override // j.g0
    public final boolean b() {
        return this.Q.isShowing();
    }

    public final int c() {
        return this.f593f;
    }

    @Override // j.g0
    public final void d() {
        int i10;
        boolean z9;
        int a10;
        int makeMeasureSpec;
        int i11;
        int i12;
        boolean z10;
        b2 b2Var;
        int i13;
        int i14;
        b2 b2Var2 = this.f590c;
        g0 g0Var = this.Q;
        int i15 = 0;
        Context context = this.f588a;
        if (b2Var2 == null) {
            b2 a11 = a(context, !this.P);
            this.f590c = a11;
            a11.setAdapter(this.f589b);
            this.f590c.setOnItemClickListener(this.G);
            this.f590c.setFocusable(true);
            this.f590c.setFocusableInTouchMode(true);
            this.f590c.setOnItemSelectedListener(new i2(this, 0));
            this.f590c.setOnScrollListener(this.K);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.H;
            if (onItemSelectedListener != null) {
                this.f590c.setOnItemSelectedListener(onItemSelectedListener);
            }
            g0Var.setContentView(this.f590c);
        }
        Drawable background = g0Var.getBackground();
        Rect rect = this.N;
        if (background != null) {
            background.getPadding(rect);
            int i16 = rect.top;
            i10 = rect.bottom + i16;
            if (!this.f596z) {
                this.f594x = -i16;
            }
        } else {
            rect.setEmpty();
            i10 = 0;
        }
        if (g0Var.getInputMethodMode() == 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        View view = this.F;
        int i17 = this.f594x;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = S;
            if (method != null) {
                try {
                    a10 = ((Integer) method.invoke(g0Var, view, Integer.valueOf(i17), Boolean.valueOf(z9))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            a10 = g0Var.getMaxAvailableHeight(view, i17);
        } else {
            a10 = j2.a(g0Var, view, i17, z9);
        }
        int i18 = this.f591d;
        if (i18 == -1) {
            i12 = a10 + i10;
        } else {
            int i19 = this.f592e;
            if (i19 != -2) {
                if (i19 != -1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i19, 1073741824);
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int a12 = this.f590c.a(makeMeasureSpec, a10 + 0);
            if (a12 > 0) {
                i11 = this.f590c.getPaddingBottom() + this.f590c.getPaddingTop() + i10 + 0;
            } else {
                i11 = 0;
            }
            i12 = a12 + i11;
        }
        if (g0Var.getInputMethodMode() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        k0.n.d(g0Var, this.f595y);
        if (g0Var.isShowing()) {
            View view2 = this.F;
            WeakHashMap weakHashMap = g0.y0.f4277a;
            if (!g0.k0.b(view2)) {
                return;
            }
            int i20 = this.f592e;
            if (i20 == -1) {
                i20 = -1;
            } else if (i20 == -2) {
                i20 = this.F.getWidth();
            }
            if (i18 == -1) {
                if (z10) {
                    i18 = i12;
                } else {
                    i18 = -1;
                }
                if (z10) {
                    if (this.f592e == -1) {
                        i14 = -1;
                    } else {
                        i14 = 0;
                    }
                    g0Var.setWidth(i14);
                    g0Var.setHeight(0);
                } else {
                    if (this.f592e == -1) {
                        i15 = -1;
                    }
                    g0Var.setWidth(i15);
                    g0Var.setHeight(-1);
                }
            } else if (i18 == -2) {
                i18 = i12;
            }
            g0Var.setOutsideTouchable(true);
            View view3 = this.F;
            int i21 = this.f593f;
            int i22 = this.f594x;
            if (i20 < 0) {
                i20 = -1;
            }
            if (i18 < 0) {
                i13 = -1;
            } else {
                i13 = i18;
            }
            g0Var.update(view3, i21, i22, i20, i13);
            return;
        }
        int i23 = this.f592e;
        if (i23 == -1) {
            i23 = -1;
        } else if (i23 == -2) {
            i23 = this.F.getWidth();
        }
        if (i18 == -1) {
            i18 = -1;
        } else if (i18 == -2) {
            i18 = i12;
        }
        g0Var.setWidth(i23);
        g0Var.setHeight(i18);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = R;
            if (method2 != null) {
                try {
                    method2.invoke(g0Var, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            k2.b(g0Var, true);
        }
        g0Var.setOutsideTouchable(true);
        g0Var.setTouchInterceptor(this.J);
        if (this.B) {
            k0.n.c(g0Var, this.A);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = T;
            if (method3 != null) {
                try {
                    method3.invoke(g0Var, this.O);
                } catch (Exception e10) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            k2.a(g0Var, this.O);
        }
        k0.m.a(g0Var, this.F, this.f593f, this.f594x, this.C);
        this.f590c.setSelection(-1);
        if ((!this.P || this.f590c.isInTouchMode()) && (b2Var = this.f590c) != null) {
            b2Var.setListSelectionHidden(true);
            b2Var.requestLayout();
        }
        if (!this.P) {
            this.M.post(this.L);
        }
    }

    @Override // j.g0
    public final void dismiss() {
        g0 g0Var = this.Q;
        g0Var.dismiss();
        g0Var.setContentView(null);
        this.f590c = null;
        this.M.removeCallbacks(this.I);
    }

    public final Drawable e() {
        return this.Q.getBackground();
    }

    @Override // j.g0
    public final ListView f() {
        return this.f590c;
    }

    public final void i(Drawable drawable) {
        this.Q.setBackgroundDrawable(drawable);
    }

    public final void j(int i10) {
        this.f594x = i10;
        this.f596z = true;
    }

    public final void l(int i10) {
        this.f593f = i10;
    }

    public final int o() {
        if (!this.f596z) {
            return 0;
        }
        return this.f594x;
    }

    public void q(ListAdapter listAdapter) {
        l2 l2Var = this.E;
        if (l2Var == null) {
            this.E = new l2(this, 0);
        } else {
            ListAdapter listAdapter2 = this.f589b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(l2Var);
            }
        }
        this.f589b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.E);
        }
        b2 b2Var = this.f590c;
        if (b2Var != null) {
            b2Var.setAdapter(this.f589b);
        }
    }

    public final void r(int i10) {
        Drawable background = this.Q.getBackground();
        if (background != null) {
            Rect rect = this.N;
            background.getPadding(rect);
            this.f592e = rect.left + rect.right + i10;
            return;
        }
        this.f592e = i10;
    }
}
