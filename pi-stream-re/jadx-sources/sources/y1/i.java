package y1;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import c1.f1;
import c1.g1;
import c1.j1;
import f1.b0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import r6.h0;
import r6.m0;
import r6.o0;

/* loaded from: classes.dex */
public final class i extends j1 {
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public final SparseArray R;
    public final SparseBooleanArray S;

    public i(Context context) {
        h(context);
        l(context);
        this.R = new SparseArray();
        this.S = new SparseBooleanArray();
        e();
    }

    @Override // c1.j1
    public final void a(int i10) {
        super.a(i10);
    }

    @Override // c1.j1
    public final j1 c(int i10, int i11) {
        super.c(i10, i11);
        return this;
    }

    public final j d() {
        return new j(this);
    }

    public final void e() {
        this.C = true;
        this.D = false;
        this.E = true;
        this.F = false;
        this.G = true;
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = true;
        this.M = true;
        this.N = true;
        this.O = false;
        this.P = true;
        this.Q = false;
    }

    public final void f(g1 g1Var) {
        f1 f1Var = g1Var.f1706a;
        a(f1Var.f1692c);
        this.A.put(f1Var, g1Var);
    }

    public final void g(g1 g1Var) {
        f1 f1Var = g1Var.f1706a;
        a(f1Var.f1692c);
        this.A.put(f1Var, g1Var);
    }

    public final void h(Context context) {
        CaptioningManager captioningManager;
        String locale;
        int i10 = b0.f3799a;
        if (i10 >= 19) {
            if ((i10 >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.f1754u = 1088;
                Locale locale2 = captioningManager.getLocale();
                if (locale2 != null) {
                    if (i10 >= 21) {
                        locale = locale2.toLanguageTag();
                    } else {
                        locale = locale2.toString();
                    }
                    this.f1753t = o0.o(locale);
                }
            }
        }
    }

    public final j1 i(String[] strArr) {
        m0 m0Var = o0.f9505b;
        h0.p(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int length = strArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            String str = strArr[i10];
            str.getClass();
            String P = b0.P(str);
            P.getClass();
            int i12 = i11 + 1;
            if (objArr.length < i12) {
                objArr = Arrays.copyOf(objArr, q6.g.y(objArr.length, i12));
            }
            objArr[i11] = P;
            i10++;
            i11 = i12;
        }
        this.f1753t = o0.h(i11, objArr);
        return this;
    }

    public final void j(boolean z9) {
        SparseBooleanArray sparseBooleanArray = this.S;
        if (sparseBooleanArray.get(3) == z9) {
            return;
        }
        if (z9) {
            sparseBooleanArray.put(3, true);
        } else {
            sparseBooleanArray.delete(3);
        }
    }

    public final void k(int i10) {
        this.B.remove(Integer.valueOf(i10));
    }

    public final void l(Context context) {
        Display display;
        Point point;
        String E;
        String[] split;
        DisplayManager displayManager;
        int i10 = b0.f3799a;
        if (i10 >= 17 && (displayManager = (DisplayManager) context.getSystemService("display")) != null) {
            display = displayManager.getDisplay(0);
        } else {
            display = null;
        }
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && b0.N(context)) {
            if (i10 < 28) {
                E = b0.E("sys.display-size");
            } else {
                E = b0.E("vendor.display-size");
            }
            if (!TextUtils.isEmpty(E)) {
                try {
                    split = E.trim().split("x", -1);
                } catch (NumberFormatException unused) {
                }
                if (split.length == 2) {
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    if (parseInt > 0 && parseInt2 > 0) {
                        point = new Point(parseInt, parseInt2);
                        c(point.x, point.y);
                    }
                }
                f1.o.c("Util", "Invalid display size: " + E);
            }
            if ("Sony".equals(b0.f3801c) && b0.f3802d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                point = new Point(3840, 2160);
                c(point.x, point.y);
            }
        }
        point = new Point();
        if (i10 >= 23) {
            Display.Mode mode = display.getMode();
            point.x = mode.getPhysicalWidth();
            point.y = mode.getPhysicalHeight();
        } else if (i10 >= 17) {
            display.getRealSize(point);
        } else {
            display.getSize(point);
        }
        c(point.x, point.y);
    }

    public i() {
        this.R = new SparseArray();
        this.S = new SparseBooleanArray();
        e();
    }

    public i(j jVar) {
        super(jVar);
        this.C = jVar.C;
        this.D = jVar.D;
        this.E = jVar.E;
        this.F = jVar.F;
        this.G = jVar.G;
        this.H = jVar.H;
        this.I = jVar.I;
        this.J = jVar.J;
        this.K = jVar.K;
        this.L = jVar.L;
        this.M = jVar.M;
        this.N = jVar.N;
        this.O = jVar.O;
        this.P = jVar.P;
        this.Q = jVar.Q;
        SparseArray sparseArray = new SparseArray();
        int i10 = 0;
        while (true) {
            SparseArray sparseArray2 = jVar.R;
            if (i10 < sparseArray2.size()) {
                sparseArray.put(sparseArray2.keyAt(i10), new HashMap((Map) sparseArray2.valueAt(i10)));
                i10++;
            } else {
                this.R = sparseArray;
                this.S = jVar.S.clone();
                return;
            }
        }
    }
}
