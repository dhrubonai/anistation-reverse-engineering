package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pk2 implements w80, es0, k11, tt5, s80, xm0, i67 {
    public static final pk2 f0;
    public static final p65 g0;
    public final /* synthetic */ byte x;
    public static final y50 y = new y50(-1.0f, -1.0f);
    public static final y50 z = new y50(0.0f, -1.0f);
    public static final y50 A = new y50(1.0f, -1.0f);
    public static final y50 B = new y50(-1.0f, 0.0f);
    public static final y50 C = new y50(0.0f, 0.0f);
    public static final y50 D = new y50(1.0f, 0.0f);
    public static final y50 E = new y50(-1.0f, 1.0f);
    public static final y50 F = new y50(0.0f, 1.0f);
    public static final y50 G = new y50(1.0f, 1.0f);
    public static final x50 H = new x50(-1.0f);
    public static final x50 I = new x50(0.0f);
    public static final x50 J = new x50(1.0f);
    public static final w50 K = new w50(-1.0f);
    public static final w50 L = new w50(0.0f);
    public static final w50 M = new w50(1.0f);
    public static final pk2 N = new pk2(2);
    public static final cz0 O = new cz0(0);
    public static final cz0 P = new cz0(4);
    public static final cz0 Q = new cz0(2);
    public static final cz0 R = new cz0(3);
    public static final cz0 S = new cz0(5);
    public static final x32 T = new Object();
    public static final cz0 U = new cz0(1);
    public static final pk2 V = new pk2(4);
    public static final pk2 W = new pk2(5);
    public static final pk2 X = new pk2(6);
    public static final /* synthetic */ pk2 Y = new pk2(7);
    public static final /* synthetic */ pk2 Z = new pk2(8);
    public static final pk2 a0 = new pk2(9);
    public static final pk2 b0 = new pk2(10);
    public static final pk2 c0 = new pk2(11);
    public static final pk2 d0 = new pk2(12);
    public static final pk2 e0 = new pk2(13);
    public static final p65 h0 = new p65(15);
    public static final pk2 i0 = new pk2(16);
    public static final pk2 j0 = new pk2(17);
    public static final pk2 k0 = new pk2(18);
    public static final pk2 l0 = new pk2(19);
    public static final pk2 m0 = new pk2(20);
    public static final pk2 n0 = new pk2(21);
    public static final pk2 o0 = new pk2(22);
    public static final pk2 p0 = new pk2(23);
    public static final pk2 q0 = new pk2(24);
    public static final pk2 r0 = new pk2(25);
    public static final pk2 s0 = new pk2(26);
    public static final pk2 t0 = new pk2(27);
    public static final pk2 u0 = new pk2(28);
    public static final pk2 v0 = new pk2(29);

    /* JADX WARN: Type inference failed for: r0v21, types: [x32, java.lang.Object] */
    static {
        byte b = 14;
        f0 = new pk2(b);
        g0 = new p65(b);
    }

    public /* synthetic */ pk2(byte b) {
        this.x = b;
    }

    @Override // defpackage.i67
    public e67 a(Context context, vd1 vd1Var) {
        w80 w80Var;
        Context context2 = context;
        while (true) {
            if (context2 instanceof ContextWrapper) {
                if ((context2 instanceof Activity) || (context2 instanceof InputMethodService)) {
                    break;
                }
                ContextWrapper contextWrapper = (ContextWrapper) context2;
                if (contextWrapper.getBaseContext() == null) {
                    break;
                }
                context2 = contextWrapper.getBaseContext();
                context2.getClass();
            } else {
                context2 = context;
                break;
            }
        }
        if (context2 instanceof Activity) {
            Activity activity = (Activity) context2;
            w80.b.getClass();
            if (Build.VERSION.SDK_INT >= 30) {
                w80Var = x80.x;
            } else {
                w80Var = N;
            }
            return new e67(new u80(w80Var.c(activity)), vd1Var.c(activity));
        }
        if (!(context2 instanceof InputMethodService) && !(context2 instanceof Application)) {
            ze0.k("Must provide a UiContext or Application Context");
            return null;
        }
        Object systemService = context.getSystemService("window");
        systemService.getClass();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        defaultDisplay.getClass();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new e67(new Rect(0, 0, point.x, point.y), vd1Var.c(context));
    }

    @Override // defpackage.s80
    public long b(fm0 fm0Var, int i) {
        String str = ((bd6) fm0Var.B).a.a.y;
        return fy5.a(ez5.c(str, i), ez5.b(str, i));
    }

    @Override // defpackage.w80
    public Rect c(Activity activity) {
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
            invoke.getClass();
            return new Rect((Rect) invoke);
        } catch (Exception e) {
            if (!(e instanceof NoSuchFieldException) && !(e instanceof NoSuchMethodException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                throw e;
            }
            w80.b.getClass();
            Log.w(v80.b, e);
            return nr1.z.c(activity);
        }
    }

    public void d(final yz3 yz3Var, float f, long j, kd2 kd2Var, final int i, final int i2) {
        int i3;
        int i4;
        boolean z2;
        final float f2;
        final long j2;
        float f3;
        long d;
        kd2Var.f0(-1498258020);
        if (kd2Var.f(yz3Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i3 | i | 48;
        if ((i2 & 4) == 0 && kd2Var.e(j)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i6 = i5 | i4;
        if ((i6 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var.V(i6 & 1, z2)) {
            kd2Var.a0();
            if ((i & 1) != 0 && !kd2Var.C()) {
                kd2Var.Y();
                f3 = f;
            } else {
                f3 = tt4.b;
                if ((i2 & 4) != 0) {
                    d = op0.d(tt4.a, kd2Var);
                    kd2Var.r();
                    b90.a(bx7.h(ar5.e(ar5.c(yz3Var, 1.0f), f3), d, io3.h), kd2Var, 0);
                    j2 = d;
                    f2 = f3;
                }
            }
            d = j;
            kd2Var.r();
            b90.a(bx7.h(ar5.e(ar5.c(yz3Var, 1.0f), f3), d, io3.h), kd2Var, 0);
            j2 = d;
            f2 = f3;
        } else {
            kd2Var.Y();
            f2 = f;
            j2 = j;
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new ic2(yz3Var, f2, j2, i, i2) { // from class: l66
                public final /* synthetic */ long A;
                public final /* synthetic */ byte B;
                public final /* synthetic */ yz3 y;
                public final /* synthetic */ float z;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.B = i2;
                }

                @Override // defpackage.ic2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int N2 = kb0.N(3073);
                    pk2.this.d(this.y, this.z, this.A, (kd2) obj, N2, this.B);
                    return pn6.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.xm0
    public void f(wp2 wp2Var, t36 t36Var) {
        wp2Var.A.f(ir2.i, new b9(t36Var, (vz0) null, (byte) 7));
    }

    @Override // defpackage.tt5
    public boolean g(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        return false;
    }

    @Override // defpackage.es0
    public Object h(kz kzVar) {
        Object l = kzVar.l(new px4(bn6.class, Executor.class));
        l.getClass();
        return q23.B((Executor) l);
    }

    public String toString() {
        switch (this.x) {
            case 11:
                return "ReferentialEqualityPolicy";
            default:
                return super.toString();
        }
    }
}
