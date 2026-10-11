package g0;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class d2 extends i2 {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f4179h = false;

    /* renamed from: i, reason: collision with root package name */
    public static Method f4180i;

    /* renamed from: j, reason: collision with root package name */
    public static Class f4181j;

    /* renamed from: k, reason: collision with root package name */
    public static Field f4182k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f4183l;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f4184c;

    /* renamed from: d, reason: collision with root package name */
    public z.d[] f4185d;

    /* renamed from: e, reason: collision with root package name */
    public z.d f4186e;

    /* renamed from: f, reason: collision with root package name */
    public k2 f4187f;

    /* renamed from: g, reason: collision with root package name */
    public z.d f4188g;

    public d2(k2 k2Var, WindowInsets windowInsets) {
        super(k2Var);
        this.f4186e = null;
        this.f4184c = windowInsets;
    }

    @SuppressLint({"WrongConstant"})
    private z.d r(int i10, boolean z9) {
        z.d dVar = z.d.f11855e;
        for (int i11 = 1; i11 <= 256; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                dVar = z.d.a(dVar, s(i11, z9));
            }
        }
        return dVar;
    }

    private z.d t() {
        k2 k2Var = this.f4187f;
        if (k2Var != null) {
            return k2Var.f4227a.h();
        }
        return z.d.f11855e;
    }

    private z.d u(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!f4179h) {
                v();
            }
            Method method = f4180i;
            if (method != null && f4181j != null && f4182k != null) {
                try {
                    Object invoke = method.invoke(view, new Object[0]);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f4182k.get(f4183l.get(invoke));
                    if (rect == null) {
                        return null;
                    }
                    return z.d.b(rect.left, rect.top, rect.right, rect.bottom);
                } catch (ReflectiveOperationException e10) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
                }
            }
            return null;
        }
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    @SuppressLint({"PrivateApi"})
    private static void v() {
        try {
            f4180i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f4181j = cls;
            f4182k = cls.getDeclaredField("mVisibleInsets");
            f4183l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f4182k.setAccessible(true);
            f4183l.setAccessible(true);
        } catch (ReflectiveOperationException e10) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
        }
        f4179h = true;
    }

    @Override // g0.i2
    public void d(View view) {
        z.d u9 = u(view);
        if (u9 == null) {
            u9 = z.d.f11855e;
        }
        w(u9);
    }

    @Override // g0.i2
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        return Objects.equals(this.f4188g, ((d2) obj).f4188g);
    }

    @Override // g0.i2
    public z.d f(int i10) {
        return r(i10, false);
    }

    @Override // g0.i2
    public final z.d j() {
        if (this.f4186e == null) {
            WindowInsets windowInsets = this.f4184c;
            this.f4186e = z.d.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f4186e;
    }

    @Override // g0.i2
    public k2 l(int i10, int i11, int i12, int i13) {
        c2 z1Var;
        k2 h10 = k2.h(null, this.f4184c);
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 30) {
            z1Var = new b2(h10);
        } else if (i14 >= 29) {
            z1Var = new a2(h10);
        } else {
            z1Var = new z1(h10);
        }
        z1Var.g(k2.f(j(), i10, i11, i12, i13));
        z1Var.e(k2.f(h(), i10, i11, i12, i13));
        return z1Var.b();
    }

    @Override // g0.i2
    public boolean n() {
        return this.f4184c.isRound();
    }

    @Override // g0.i2
    public void o(z.d[] dVarArr) {
        this.f4185d = dVarArr;
    }

    @Override // g0.i2
    public void p(k2 k2Var) {
        this.f4187f = k2Var;
    }

    public z.d s(int i10, boolean z9) {
        int i11;
        j e10;
        int i12;
        int i13;
        int i14;
        int i15 = 0;
        if (i10 != 1) {
            z.d dVar = null;
            if (i10 != 2) {
                z.d dVar2 = z.d.f11855e;
                if (i10 != 8) {
                    if (i10 != 16) {
                        if (i10 != 32) {
                            if (i10 != 64) {
                                if (i10 != 128) {
                                    return dVar2;
                                }
                                k2 k2Var = this.f4187f;
                                if (k2Var != null) {
                                    e10 = k2Var.f4227a.e();
                                } else {
                                    e10 = e();
                                }
                                if (e10 != null) {
                                    int i16 = Build.VERSION.SDK_INT;
                                    DisplayCutout displayCutout = e10.f4221a;
                                    if (i16 >= 28) {
                                        i12 = i.d(displayCutout);
                                    } else {
                                        i12 = 0;
                                    }
                                    if (i16 >= 28) {
                                        i13 = i.f(displayCutout);
                                    } else {
                                        i13 = 0;
                                    }
                                    if (i16 >= 28) {
                                        i14 = i.e(displayCutout);
                                    } else {
                                        i14 = 0;
                                    }
                                    if (i16 >= 28) {
                                        i15 = i.c(displayCutout);
                                    }
                                    return z.d.b(i12, i13, i14, i15);
                                }
                                return dVar2;
                            }
                            return k();
                        }
                        return g();
                    }
                    return i();
                }
                z.d[] dVarArr = this.f4185d;
                if (dVarArr != null) {
                    dVar = dVarArr[j5.a.D(8)];
                }
                if (dVar != null) {
                    return dVar;
                }
                z.d j4 = j();
                z.d t9 = t();
                int i17 = j4.f11859d;
                if (i17 > t9.f11859d) {
                    return z.d.b(0, 0, 0, i17);
                }
                z.d dVar3 = this.f4188g;
                if (dVar3 != null && !dVar3.equals(dVar2) && (i11 = this.f4188g.f11859d) > t9.f11859d) {
                    return z.d.b(0, 0, 0, i11);
                }
                return dVar2;
            }
            if (z9) {
                z.d t10 = t();
                z.d h10 = h();
                return z.d.b(Math.max(t10.f11856a, h10.f11856a), 0, Math.max(t10.f11858c, h10.f11858c), Math.max(t10.f11859d, h10.f11859d));
            }
            z.d j10 = j();
            k2 k2Var2 = this.f4187f;
            if (k2Var2 != null) {
                dVar = k2Var2.f4227a.h();
            }
            int i18 = j10.f11859d;
            if (dVar != null) {
                i18 = Math.min(i18, dVar.f11859d);
            }
            return z.d.b(j10.f11856a, 0, j10.f11858c, i18);
        }
        if (z9) {
            return z.d.b(0, Math.max(t().f11857b, j().f11857b), 0, 0);
        }
        return z.d.b(0, j().f11857b, 0, 0);
    }

    public void w(z.d dVar) {
        this.f4188g = dVar;
    }
}
