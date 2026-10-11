package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class nr1 implements xm0, w80, ib0, es0, x37, nc6 {
    public static final p65 S;
    public static final nr1 b0;
    public final /* synthetic */ byte x;
    public static final nr1 y = new nr1(1);
    public static final nr1 z = new nr1(2);
    public static final kb A = new kb(0);
    public static final kb B = new kb(1);
    public static final kb C = new kb(2);
    public static final nr1 D = new nr1(4);
    public static final nr1 E = new nr1(5);
    public static final ia3 F = ia3.x;
    public static final xd1 G = new xd1(1.0f, 1.0f);
    public static final nr1 H = new nr1(6);
    public static final String[] I = new String[0];
    public static final nr1 J = new nr1(8);
    public static final nr1 K = new nr1(9);
    public static final nr1 L = new nr1(10);
    public static final nr1 M = new nr1(11);
    public static final nr1 N = new nr1(12);
    public static final nr1 O = new nr1(13);
    public static final nr1 P = new nr1(14);
    public static final nr1 Q = new nr1(15);
    public static final nr1 R = new nr1(16);
    public static final nr1 T = new nr1(18);
    public static final nr1 U = new nr1(19);
    public static final nr1 V = new nr1(20);
    public static final nr1 W = new nr1(21);
    public static final nr1 X = new nr1(22);
    public static final nr1 Y = new nr1(23);
    public static final nr1 Z = new nr1(24);
    public static final nr1 a0 = new nr1(25);
    public static final nr1 c0 = new nr1(27);
    public static final nr1 d0 = new nr1(28);
    public static final nr1 e0 = new nr1(29);

    static {
        byte b = 26;
        S = new p65(b);
        b0 = new nr1(b);
    }

    public /* synthetic */ nr1(byte b) {
        this.x = b;
    }

    @Override // defpackage.nc6
    public long a() {
        int i = ep0.j;
        return ep0.i;
    }

    @Override // defpackage.ib0
    public ud1 b() {
        return G;
    }

    @Override // defpackage.w80
    public Rect c(Activity activity) {
        int i;
        v80 v80Var = w80.b;
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        DisplayCutout displayCutout = null;
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (activity.isInMultiWindowMode()) {
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                invoke.getClass();
                rect.set((Rect) invoke);
            } else {
                Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                invoke2.getClass();
                rect.set((Rect) invoke2);
            }
        } catch (Exception e) {
            if (!(e instanceof NoSuchFieldException) && !(e instanceof NoSuchMethodException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                throw e;
            }
            v80Var.getClass();
            Log.w(v80.b, e);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", AndroidStaticDeviceInfoDataSource.PLATFORM_ANDROID);
            if (identifier > 0) {
                i = resources.getDimensionPixelSize(identifier);
            } else {
                i = 0;
            }
            int i2 = rect.bottom + i;
            if (i2 == point.y) {
                rect.bottom = i2;
            } else {
                int i3 = rect.right + i;
                if (i3 == point.x) {
                    rect.right = i3;
                } else if (rect.left == i) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode()) {
            try {
                Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                constructor.setAccessible(true);
                Object newInstance = constructor.newInstance(null);
                Method declaredMethod = defaultDisplay.getClass().getDeclaredMethod("getDisplayInfo", newInstance.getClass());
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(defaultDisplay, newInstance);
                Field declaredField2 = newInstance.getClass().getDeclaredField("displayCutout");
                declaredField2.setAccessible(true);
                Object obj2 = declaredField2.get(newInstance);
                if (obj2 instanceof DisplayCutout) {
                    displayCutout = (DisplayCutout) obj2;
                }
            } catch (Exception e2) {
                if (!(e2 instanceof ClassNotFoundException) && !(e2 instanceof NoSuchMethodException) && !(e2 instanceof NoSuchFieldException) && !(e2 instanceof IllegalAccessException) && !(e2 instanceof InvocationTargetException) && !(e2 instanceof InstantiationException)) {
                    throw e2;
                }
                v80Var.getClass();
                Log.w(v80.b, e2);
            }
            if (displayCutout != null) {
                if (rect.left == displayCutout.getSafeInsetLeft()) {
                    rect.left = 0;
                }
                if (point.x - rect.right == displayCutout.getSafeInsetRight()) {
                    rect.right = displayCutout.getSafeInsetRight() + rect.right;
                }
                if (rect.top == displayCutout.getSafeInsetTop()) {
                    rect.top = 0;
                }
                if (point.y - rect.bottom == displayCutout.getSafeInsetBottom()) {
                    rect.bottom = displayCutout.getSafeInsetBottom() + rect.bottom;
                }
            }
        }
        return rect;
    }

    @Override // defpackage.nc6
    public ka0 d() {
        return null;
    }

    @Override // defpackage.nc6
    public float e() {
        return Float.NaN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, wc7] */
    @Override // defpackage.xm0
    public void f(wp2 wp2Var, t36 t36Var) {
        rl4 rl4Var;
        am4 am4Var;
        byte b = 0;
        vz0 vz0Var = null;
        switch (this.x) {
            case 1:
                jc2 jc2Var = (jc2) t36Var;
                ni1 ni1Var = new ni1("ObservableContent", (byte) 1);
                ir2 ir2Var = wp2Var.A;
                ni1 ni1Var2 = ir2.l;
                ArrayList arrayList = ir2Var.a;
                ni1Var2.getClass();
                if (!ir2Var.e(ni1Var)) {
                    int c = ir2Var.c(ni1Var2);
                    if (c != -1) {
                        int i = c + 1;
                        int size = arrayList.size() - 1;
                        if (i <= size) {
                            while (true) {
                                Object obj = arrayList.get(i);
                                if (obj instanceof rl4) {
                                    rl4Var = (rl4) obj;
                                } else {
                                    rl4Var = null;
                                }
                                if (rl4Var != null) {
                                    wc7 wc7Var = rl4Var.b;
                                    if (wc7Var instanceof am4) {
                                        am4Var = (am4) wc7Var;
                                    } else {
                                        am4Var = null;
                                    }
                                    if (am4Var != null && am4Var.i == ni1Var2) {
                                        c = i;
                                    }
                                    if (i != size) {
                                        i++;
                                    }
                                }
                            }
                        }
                        arrayList.add(c + 1, new rl4(ni1Var, new am4(ni1Var2)));
                    } else {
                        throw new y0("Phase " + ni1Var2 + " was not registered for this pipeline", (byte) 3);
                    }
                }
                ir2Var.f(ni1Var, new b7(jc2Var, vz0Var, b));
                return;
            case 11:
                jc2 jc2Var2 = (jc2) t36Var;
                ni1 ni1Var3 = new ni1("BeforeReceive", (byte) 1);
                ir2 ir2Var2 = wp2Var.B;
                ni1 ni1Var4 = ir2.n;
                ir2Var2.getClass();
                ni1Var4.getClass();
                if (!ir2Var2.e(ni1Var3)) {
                    int c2 = ir2Var2.c(ni1Var4);
                    if (c2 != -1) {
                        ir2Var2.a.add(c2, new rl4(ni1Var3, new Object()));
                    } else {
                        throw new y0("Phase " + ni1Var4 + " was not registered for this pipeline", (byte) 3);
                    }
                }
                ir2Var2.f(ni1Var3, new wz4(jc2Var2, vz0Var, b));
                return;
            default:
                wp2Var.A.f(ir2.i, new b9(t36Var, vz0Var, (byte) 6));
                return;
        }
    }

    @Override // defpackage.ib0
    public long g() {
        return 9205357640488583168L;
    }

    @Override // defpackage.ib0
    public ia3 getLayoutDirection() {
        return F;
    }

    @Override // defpackage.x37
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // defpackage.es0
    public Object h(kz kzVar) {
        Object l = kzVar.l(new px4(z60.class, Executor.class));
        l.getClass();
        return q23.B((Executor) l);
    }

    public wc7 i(ea2 ea2Var) {
        String str = ea2Var.p;
        if (str != null) {
            byte b = 1;
            byte b2 = 0;
            char c = 65535;
            switch (str.hashCode()) {
                case -1354451219:
                    if (str.equals("application/vnd.dvb.ait")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1348231605:
                    if (str.equals("application/x-icy")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1248341703:
                    if (str.equals("application/id3")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1154383568:
                    if (str.equals("application/x-emsg")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1652648887:
                    if (str.equals("application/x-scte35")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return new kq(b2);
                case 1:
                    return new au2();
                case 2:
                    return new fu2(null);
                case 3:
                    return new kq(b);
                case 4:
                    return new kw5();
            }
        }
        ze0.k(zo5.l("Attempted to create decoder for unsupported MIME type: ", str));
        return null;
    }

    public boolean j(ea2 ea2Var) {
        String str = ea2Var.p;
        if (!"application/id3".equals(str) && !"application/x-emsg".equals(str) && !"application/x-scte35".equals(str) && !"application/x-icy".equals(str) && !"application/vnd.dvb.ait".equals(str)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.x37
    public String[] n() {
        return I;
    }
}
