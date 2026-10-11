package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import com.anistation.android.R;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class h45 {
    public static h45 g;
    public WeakHashMap a;
    public final WeakHashMap b = new WeakHashMap(0);
    public TypedValue c;
    public boolean d;
    public tp e;
    public static final PorterDuff.Mode f = PorterDuff.Mode.SRC_IN;
    public static final g45 h = new hm3(6);

    public static synchronized h45 c() {
        h45 h45Var;
        synchronized (h45.class) {
            h45Var = g;
            if (h45Var == null) {
                h45Var = new h45();
                g = h45Var;
            }
        }
        return h45Var;
    }

    public static synchronized PorterDuffColorFilter f(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (h45.class) {
            g45 g45Var = h;
            g45Var.getClass();
            int i2 = (31 + i) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) g45Var.c(Integer.valueOf(mode.hashCode() + i2));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public static void i(Drawable drawable, pn0 pn0Var, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z = pn0Var.z;
            if (!z && !pn0Var.y) {
                drawable.clearColorFilter();
                return;
            }
            PorterDuffColorFilter porterDuffColorFilter = null;
            if (z) {
                colorStateList = (ColorStateList) pn0Var.A;
            } else {
                colorStateList = null;
            }
            if (pn0Var.y) {
                mode = (PorterDuff.Mode) pn0Var.B;
            } else {
                mode = f;
            }
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = f(colorStateList.getColorForState(iArr, 0), mode);
            }
            drawable.setColorFilter(porterDuffColorFilter);
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    public final void a(Context context, int i, ColorStateList colorStateList) {
        WeakHashMap weakHashMap = this.a;
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            this.a = weakHashMap;
        }
        zv5 zv5Var = (zv5) weakHashMap.get(context);
        if (zv5Var == null) {
            zv5Var = new zv5(0);
            this.a.put(context, zv5Var);
        }
        int i2 = zv5Var.z;
        if (i2 != 0 && i <= zv5Var.x[i2 - 1]) {
            zv5Var.b(i, colorStateList);
            return;
        }
        if (i2 >= zv5Var.x.length) {
            int i3 = (i2 + 1) * 4;
            int i4 = 4;
            while (true) {
                if (i4 >= 32) {
                    break;
                }
                int i5 = (1 << i4) - 12;
                if (i3 <= i5) {
                    i3 = i5;
                    break;
                }
                i4++;
            }
            int i6 = i3 / 4;
            zv5Var.x = Arrays.copyOf(zv5Var.x, i6);
            zv5Var.y = Arrays.copyOf(zv5Var.y, i6);
        }
        zv5Var.x[i2] = i;
        zv5Var.y[i2] = colorStateList;
        zv5Var.z = i2 + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cd A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable b(android.content.Context r7, int r8) {
        /*
            r6 = this;
            android.util.TypedValue r0 = r6.c
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r6.c = r0
        Lb:
            android.content.res.Resources r1 = r7.getResources()
            r2 = 1
            r1.getValue(r8, r0, r2)
            int r1 = r0.assetCookie
            long r1 = (long) r1
            r3 = 32
            long r1 = r1 << r3
            int r3 = r0.data
            long r3 = (long) r3
            long r1 = r1 | r3
            monitor-enter(r6)
            java.util.WeakHashMap r3 = r6.b     // Catch: java.lang.Throwable -> L46
            java.lang.Object r3 = r3.get(r7)     // Catch: java.lang.Throwable -> L46
            sl3 r3 = (defpackage.sl3) r3     // Catch: java.lang.Throwable -> L46
            r4 = 0
            if (r3 != 0) goto L2c
            monitor-exit(r6)
        L2a:
            r3 = r4
            goto L4e
        L2c:
            java.lang.Object r5 = r3.b(r1)     // Catch: java.lang.Throwable -> L46
            java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5     // Catch: java.lang.Throwable -> L46
            if (r5 == 0) goto L4c
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L46
            android.graphics.drawable.Drawable$ConstantState r5 = (android.graphics.drawable.Drawable.ConstantState) r5     // Catch: java.lang.Throwable -> L46
            if (r5 == 0) goto L49
            android.content.res.Resources r3 = r7.getResources()     // Catch: java.lang.Throwable -> L46
            android.graphics.drawable.Drawable r3 = r5.newDrawable(r3)     // Catch: java.lang.Throwable -> L46
            monitor-exit(r6)
            goto L4e
        L46:
            r7 = move-exception
            goto Lce
        L49:
            r3.e(r1)     // Catch: java.lang.Throwable -> L46
        L4c:
            monitor-exit(r6)
            goto L2a
        L4e:
            if (r3 == 0) goto L51
            return r3
        L51:
            tp r3 = r6.e
            if (r3 != 0) goto L57
        L55:
            r8 = r4
            goto L9a
        L57:
            r3 = 2131230776(0x7f080038, float:1.8077614E38)
            if (r8 != r3) goto L74
            android.graphics.drawable.LayerDrawable r8 = new android.graphics.drawable.LayerDrawable
            r3 = 2131230775(0x7f080037, float:1.8077612E38)
            android.graphics.drawable.Drawable r3 = r6.d(r7, r3)
            r5 = 2131230777(0x7f080039, float:1.8077616E38)
            android.graphics.drawable.Drawable r5 = r6.d(r7, r5)
            android.graphics.drawable.Drawable[] r3 = new android.graphics.drawable.Drawable[]{r3, r5}
            r8.<init>(r3)
            goto L9a
        L74:
            r3 = 2131230811(0x7f08005b, float:1.8077685E38)
            if (r8 != r3) goto L81
            r8 = 2131165243(0x7f07003b, float:1.7944698E38)
            android.graphics.drawable.LayerDrawable r8 = defpackage.tp.l(r6, r7, r8)
            goto L9a
        L81:
            r3 = 2131230810(0x7f08005a, float:1.8077683E38)
            if (r8 != r3) goto L8e
            r8 = 2131165244(0x7f07003c, float:1.79447E38)
            android.graphics.drawable.LayerDrawable r8 = defpackage.tp.l(r6, r7, r8)
            goto L9a
        L8e:
            r3 = 2131230812(0x7f08005c, float:1.8077687E38)
            if (r8 != r3) goto L55
            r8 = 2131165245(0x7f07003d, float:1.7944702E38)
            android.graphics.drawable.LayerDrawable r8 = defpackage.tp.l(r6, r7, r8)
        L9a:
            if (r8 == 0) goto Lcd
            int r0 = r0.changingConfigurations
            r8.setChangingConfigurations(r0)
            monitor-enter(r6)
            android.graphics.drawable.Drawable$ConstantState r0 = r8.getConstantState()     // Catch: java.lang.Throwable -> Lbd
            if (r0 == 0) goto Lc9
            java.util.WeakHashMap r3 = r6.b     // Catch: java.lang.Throwable -> Lbd
            java.lang.Object r3 = r3.get(r7)     // Catch: java.lang.Throwable -> Lbd
            sl3 r3 = (defpackage.sl3) r3     // Catch: java.lang.Throwable -> Lbd
            if (r3 != 0) goto Lbf
            sl3 r3 = new sl3     // Catch: java.lang.Throwable -> Lbd
            r3.<init>(r4)     // Catch: java.lang.Throwable -> Lbd
            java.util.WeakHashMap r4 = r6.b     // Catch: java.lang.Throwable -> Lbd
            r4.put(r7, r3)     // Catch: java.lang.Throwable -> Lbd
            goto Lbf
        Lbd:
            r7 = move-exception
            goto Lcb
        Lbf:
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> Lbd
            r7.<init>(r0)     // Catch: java.lang.Throwable -> Lbd
            r3.d(r1, r7)     // Catch: java.lang.Throwable -> Lbd
            monitor-exit(r6)
            return r8
        Lc9:
            monitor-exit(r6)
            return r8
        Lcb:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lbd
            throw r7
        Lcd:
            return r8
        Lce:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L46
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h45.b(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    public final synchronized Drawable d(Context context, int i) {
        return e(context, i);
    }

    public final synchronized Drawable e(Context context, int i) {
        Drawable b;
        try {
            if (!this.d) {
                this.d = true;
                Drawable d = d(context, R.drawable.abc_vector_test);
                if (d == null || !"android.graphics.drawable.VectorDrawable".equals(d.getClass().getName())) {
                    this.d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            b = b(context, i);
            if (b == null) {
                b = context.getDrawable(i);
            }
            if (b != null) {
                b = h(context, i, b);
            }
            if (b != null) {
                int[] iArr = mp1.a;
                String name = b.getClass().getName();
                if (Build.VERSION.SDK_INT < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
                    int[] state = b.getState();
                    if (state != null && state.length != 0) {
                        b.setState(mp1.b);
                        b.setState(state);
                    }
                    b.setState(mp1.a);
                    b.setState(state);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return b;
    }

    public final synchronized ColorStateList g(Context context, int i) {
        ColorStateList colorStateList;
        zv5 zv5Var;
        WeakHashMap weakHashMap = this.a;
        ColorStateList colorStateList2 = null;
        if (weakHashMap != null && (zv5Var = (zv5) weakHashMap.get(context)) != null) {
            colorStateList = (ColorStateList) v94.m(zv5Var, i);
        } else {
            colorStateList = null;
        }
        if (colorStateList == null) {
            tp tpVar = this.e;
            if (tpVar != null) {
                colorStateList2 = tpVar.m(context, i);
            }
            if (colorStateList2 != null) {
                a(context, i, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable h(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h45.h(android.content.Context, int, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
