package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class k57 extends s57 {
    public static boolean n = false;
    public static Method o;
    public static Class p;
    public static Field q;
    public static Field r;
    public final WindowInsets c;
    public yz2[] d;
    public yz2 e;
    public v57 f;
    public yz2 g;
    public int h;
    public wh1 i;
    public int j;
    public int k;
    public Rect[][] l;
    public Rect[][] m;

    public k57(v57 v57Var, WindowInsets windowInsets) {
        super(v57Var);
        this.e = null;
        this.l = new Rect[10];
        this.m = new Rect[10];
        this.c = windowInsets;
    }

    private wh1 C(View view) {
        Display display;
        int i;
        int i2;
        int i3;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.a.a.t()) {
            return wh1.a(point.x, point.y, 0, 0, 0, 0, true);
        }
        int i4 = 0;
        n75 x = o80.x(display, 0);
        n75 x2 = o80.x(display, 1);
        n75 x3 = o80.x(display, 2);
        n75 x4 = o80.x(display, 3);
        int i5 = point.x;
        int i6 = point.y;
        if (x != null) {
            i = x.b;
        } else {
            i = 0;
        }
        if (x2 != null) {
            i2 = x2.b;
        } else {
            i2 = 0;
        }
        if (x3 != null) {
            i3 = x3.b;
        } else {
            i3 = 0;
        }
        if (x4 != null) {
            i4 = x4.b;
        }
        return wh1.a(i5, i6, i, i2, i3, i4, false);
    }

    private static List<Rect> D(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[gv5.g(i2)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                    System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                    rectArr3 = rectArr4;
                }
            }
        }
        if (rectArr3 == null) {
            return Collections.EMPTY_LIST;
        }
        return Arrays.asList(rectArr3);
    }

    private Rect[] E(yz2 yz2Var) {
        ArrayList arrayList = new ArrayList();
        int i = yz2Var.a;
        int i2 = yz2Var.d;
        int i3 = yz2Var.c;
        int i4 = yz2Var.b;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, yz2Var.a, this.j));
        }
        if (i4 != 0) {
            arrayList.add(new Rect(0, 0, this.k, i4));
        }
        if (i3 != 0) {
            int i5 = this.k;
            arrayList.add(new Rect(i5 - i3, 0, i5, this.j));
        }
        if (i2 != 0) {
            int i6 = this.j;
            arrayList.add(new Rect(0, i6 - i2, this.k, i6));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    private yz2 F(int i, boolean z) {
        yz2 yz2Var = yz2.e;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                yz2Var = yz2.a(yz2Var, G(i2, z));
            }
        }
        return yz2Var;
    }

    private yz2 H() {
        v57 v57Var = this.f;
        if (v57Var != null) {
            return v57Var.a.l();
        }
        return yz2.e;
    }

    private yz2 I(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!n) {
                K();
            }
            Method method = o;
            if (method != null && p != null && q != null) {
                try {
                    Object invoke = method.invoke(view, null);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) q.get(r.get(invoke));
                    if (rect == null) {
                        return null;
                    }
                    return yz2.b(rect.left, rect.top, rect.right, rect.bottom);
                } catch (ReflectiveOperationException e) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                }
            }
            return null;
        }
        ov3.g("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        return null;
    }

    private static void K() {
        try {
            o = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            p = cls;
            q = cls.getDeclaredField("mVisibleInsets");
            r = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            q.setAccessible(true);
            r.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        n = true;
    }

    public static boolean L(int i, int i2) {
        if ((i & 6) == (i2 & 6)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.s57
    public void A(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.l = (Rect[][]) rectArr.clone();
    }

    @Override // defpackage.s57
    public void B(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.m = (Rect[][]) rectArr.clone();
    }

    public yz2 G(int i, boolean z) {
        int i2;
        th1 h;
        yz2 yz2Var = yz2.e;
        if (i != 1) {
            yz2 yz2Var2 = null;
            if (i != 2) {
                if (i != 8) {
                    if (i != 16) {
                        if (i != 32) {
                            if (i != 64) {
                                if (i == 128) {
                                    v57 v57Var = this.f;
                                    if (v57Var != null) {
                                        h = v57Var.a.h();
                                    } else {
                                        h = h();
                                    }
                                    if (h != null) {
                                        DisplayCutout displayCutout = h.a;
                                        return yz2.b(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom());
                                    }
                                }
                            } else {
                                return o();
                            }
                        } else {
                            return k();
                        }
                    } else {
                        return m();
                    }
                } else {
                    yz2[] yz2VarArr = this.d;
                    if (yz2VarArr != null) {
                        yz2Var2 = yz2VarArr[gv5.g(8)];
                    }
                    if (yz2Var2 != null) {
                        return yz2Var2;
                    }
                    yz2 n2 = n();
                    yz2 H = H();
                    int i3 = n2.d;
                    if (i3 > H.d) {
                        return yz2.b(0, 0, 0, i3);
                    }
                    yz2 yz2Var3 = this.g;
                    if (yz2Var3 != null && !yz2Var3.equals(yz2Var) && (i2 = this.g.d) > H.d) {
                        return yz2.b(0, 0, 0, i2);
                    }
                }
            } else {
                if (z) {
                    yz2 H2 = H();
                    yz2 l = l();
                    return yz2.b(Math.max(H2.a, l.a), 0, Math.max(H2.c, l.c), Math.max(H2.d, l.d));
                }
                if ((this.h & 2) == 0) {
                    yz2 n3 = n();
                    v57 v57Var2 = this.f;
                    if (v57Var2 != null) {
                        yz2Var2 = v57Var2.a.l();
                    }
                    int i4 = n3.d;
                    if (yz2Var2 != null) {
                        i4 = Math.min(i4, yz2Var2.d);
                    }
                    return yz2.b(n3.a, 0, n3.c, i4);
                }
            }
        } else {
            if (z) {
                return yz2.b(0, Math.max(H().b, n().b), 0, 0);
            }
            if ((this.h & 4) == 0) {
                return yz2.b(0, n().b, 0, 0);
            }
        }
        return yz2Var;
    }

    public boolean J(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !G(i, false).equals(yz2.e);
    }

    @Override // defpackage.s57
    public void d(View view) {
        this.k = view.getWidth();
        this.j = view.getHeight();
        yz2 I = I(view);
        if (I == null) {
            I = yz2.e;
        }
        x(I);
    }

    @Override // defpackage.s57
    public void e(v57 v57Var) {
        v57Var.a.y(this.f);
        yz2 yz2Var = this.g;
        s57 s57Var = v57Var.a;
        s57Var.x(yz2Var);
        s57Var.z(this.h);
        s57Var.v(this.i);
        s57Var.A(this.l);
        s57Var.B(this.m);
    }

    @Override // defpackage.s57
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        k57 k57Var = (k57) obj;
        if (!Objects.equals(this.g, k57Var.g) || !L(this.h, k57Var.h)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.s57
    public List<Rect> f(int i) {
        return D(this.l, i);
    }

    @Override // defpackage.s57
    public List<Rect> g(int i) {
        return D(this.m, i);
    }

    @Override // defpackage.s57
    public yz2 i(int i) {
        return F(i, false);
    }

    @Override // defpackage.s57
    public yz2 j(int i) {
        return F(i, true);
    }

    @Override // defpackage.s57
    public final yz2 n() {
        yz2 yz2Var = this.e;
        if (yz2Var == null) {
            WindowInsets windowInsets = this.c;
            yz2 b = yz2.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
            this.e = b;
            return b;
        }
        return yz2Var;
    }

    @Override // defpackage.s57
    public void p(View view) {
        this.i = C(view);
    }

    @Override // defpackage.s57
    public void q() {
        for (int i = 1; i <= 512; i <<= 1) {
            int g = gv5.g(i);
            this.l[g] = E(i(i));
            if (i != 8) {
                this.m[g] = E(j(i));
            }
        }
    }

    @Override // defpackage.s57
    public v57 r(int i, int i2, int i3, int i4) {
        j57 d57Var;
        v57 c = v57.c(this.c, null);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 36) {
            d57Var = new i57(c);
        } else if (i5 >= 35) {
            d57Var = new h57(c);
        } else if (i5 >= 34) {
            d57Var = new g57(c);
        } else if (i5 >= 31) {
            d57Var = new f57(c);
        } else if (i5 >= 30) {
            d57Var = new e57(c);
        } else {
            d57Var = new d57(c);
        }
        d57Var.h(v57.a(n(), i, i2, i3, i4));
        d57Var.f(v57.a(l(), i, i2, i3, i4));
        return d57Var.b();
    }

    @Override // defpackage.s57
    public boolean t() {
        return this.c.isRound();
    }

    @Override // defpackage.s57
    public boolean u(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && !J(i2)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.s57
    public void v(wh1 wh1Var) {
        this.i = wh1Var;
    }

    @Override // defpackage.s57
    public void w(yz2[] yz2VarArr) {
        this.d = yz2VarArr;
    }

    @Override // defpackage.s57
    public void x(yz2 yz2Var) {
        this.g = yz2Var;
    }

    @Override // defpackage.s57
    public void y(v57 v57Var) {
        this.f = v57Var;
    }

    @Override // defpackage.s57
    public void z(int i) {
        this.h = i;
    }

    public k57(v57 v57Var, k57 k57Var) {
        this(v57Var, new WindowInsets(k57Var.c));
    }
}
