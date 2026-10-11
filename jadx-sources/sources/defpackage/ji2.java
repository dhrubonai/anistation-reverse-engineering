package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.unity3d.ads.adplayer.DisplayRecoverer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ji2 implements tb5, ae4, bx1 {
    public static final String L = xk3.f("GreedyScheduler");
    public boolean A;
    public final pu4 D;
    public final l33 E;
    public final pv0 F;
    public Boolean H;
    public final eo3 I;
    public final q76 J;
    public final zp2 K;
    public final Context x;
    public final xc1 z;
    public final HashMap y = new HashMap();
    public final Object B = new Object();
    public final l33 C = new l33(new rl0((byte) 2));
    public final HashMap G = new HashMap();

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, zp2] */
    public ji2(Context context, pv0 pv0Var, kh6 kh6Var, pu4 pu4Var, l33 l33Var, q76 q76Var) {
        this.x = context;
        af2 af2Var = pv0Var.e;
        this.z = new xc1(this, af2Var, pv0Var.d);
        ?? obj = new Object();
        obj.y = af2Var;
        obj.z = l33Var;
        obj.A = new Object();
        obj.x = new LinkedHashMap();
        this.K = obj;
        this.J = q76Var;
        this.I = new eo3(kh6Var);
        this.F = pv0Var;
        this.D = pu4Var;
        this.E = l33Var;
    }

    @Override // defpackage.ae4
    public final void a(z77 z77Var, xx0 xx0Var) {
        i77 d = fy5.d(z77Var);
        boolean z = xx0Var instanceof vx0;
        l33 l33Var = this.E;
        zp2 zp2Var = this.K;
        String str = L;
        l33 l33Var2 = this.C;
        if (z) {
            if (!l33Var2.d(d)) {
                xk3.d().a(str, "Constraints met: Scheduling work ID " + d);
                ix5 s = l33Var2.s(d);
                zp2Var.I(s);
                l33Var.getClass();
                l33Var.p(s, null);
                return;
            }
            return;
        }
        xk3.d().a(str, "Constraints not met: Cancelling work ID " + d);
        ix5 n = l33Var2.n(d);
        if (n != null) {
            zp2Var.r(n);
            int i = ((wx0) xx0Var).a;
            l33Var.getClass();
            l33Var.r(n, i);
        }
    }

    @Override // defpackage.bx1
    public final void b(i77 i77Var, boolean z) {
        h43 h43Var;
        ix5 n = this.C.n(i77Var);
        if (n != null) {
            this.K.r(n);
        }
        synchronized (this.B) {
            h43Var = (h43) this.y.remove(i77Var);
        }
        if (h43Var != null) {
            xk3.d().a(L, "Stopping tracking for " + i77Var);
            h43Var.l(null);
        }
        if (!z) {
            synchronized (this.B) {
                this.G.remove(i77Var);
            }
        }
    }

    @Override // defpackage.tb5
    public final boolean c() {
        return false;
    }

    @Override // defpackage.tb5
    public final void d(String str) {
        List<ix5> d;
        Runnable runnable;
        String str2 = L;
        Boolean bool = this.H;
        if (bool == null) {
            bool = Boolean.valueOf(ou4.a(this.x, this.F));
            this.H = bool;
        }
        if (!bool.booleanValue()) {
            xk3.d().e(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.A) {
            this.D.a(this);
            this.A = true;
        }
        xk3.d().a(str2, "Cancelling work ID " + str);
        xc1 xc1Var = this.z;
        if (xc1Var != null && (runnable = (Runnable) xc1Var.c.remove(str)) != null) {
            ((Handler) xc1Var.b.y).removeCallbacks(runnable);
        }
        l33 l33Var = this.C;
        l33Var.getClass();
        str.getClass();
        synchronized (l33Var.z) {
            d = ((rl0) l33Var.y).d(str);
        }
        for (ix5 ix5Var : d) {
            this.K.r(ix5Var);
            l33 l33Var2 = this.E;
            l33Var2.getClass();
            l33Var2.r(ix5Var, -512);
        }
    }

    @Override // defpackage.tb5
    public final void e(z77... z77VarArr) {
        long max;
        Boolean bool = this.H;
        if (bool == null) {
            bool = Boolean.valueOf(ou4.a(this.x, this.F));
            this.H = bool;
        }
        if (!bool.booleanValue()) {
            xk3.d().e(L, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.A) {
            this.D.a(this);
            this.A = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (z77 z77Var : z77VarArr) {
            if (!this.C.d(fy5.d(z77Var))) {
                synchronized (this.B) {
                    try {
                        i77 d = fy5.d(z77Var);
                        ii2 ii2Var = (ii2) this.G.get(d);
                        if (ii2Var == null) {
                            int i = z77Var.k;
                            xb5 xb5Var = this.F.d;
                            ii2Var = new ii2(i, System.currentTimeMillis());
                            this.G.put(d, ii2Var);
                        }
                        max = (Math.max((z77Var.k - ii2Var.a) - 5, 0) * DisplayRecoverer.DEFAULT_MAX_BACKGROUND_AGE_MS) + ii2Var.b;
                    } finally {
                    }
                }
                long max2 = Math.max(z77Var.a(), max);
                xb5 xb5Var2 = this.F.d;
                long currentTimeMillis = System.currentTimeMillis();
                if (z77Var.b == j77.x) {
                    if (currentTimeMillis < max2) {
                        xc1 xc1Var = this.z;
                        if (xc1Var != null) {
                            af2 af2Var = xc1Var.b;
                            HashMap hashMap = xc1Var.c;
                            Runnable runnable = (Runnable) hashMap.remove(z77Var.a);
                            if (runnable != null) {
                                ((Handler) af2Var.y).removeCallbacks(runnable);
                            }
                            yc2 yc2Var = new yc2((byte) 2, xc1Var, z77Var, false);
                            hashMap.put(z77Var.a, yc2Var);
                            ((Handler) af2Var.y).postDelayed(yc2Var, max2 - System.currentTimeMillis());
                        }
                    } else if (!a34.i(qx0.j, z77Var.j)) {
                        qx0 qx0Var = z77Var.j;
                        if (qx0Var.d) {
                            xk3.d().a(L, "Ignoring " + z77Var + ". Requires device idle.");
                        } else if (!qx0Var.i.isEmpty()) {
                            xk3.d().a(L, "Ignoring " + z77Var + ". Requires ContentUri triggers.");
                        } else {
                            hashSet.add(z77Var);
                            hashSet2.add(z77Var.a);
                        }
                    } else if (!this.C.d(fy5.d(z77Var))) {
                        xk3.d().a(L, "Starting work for " + z77Var.a);
                        l33 l33Var = this.C;
                        l33Var.getClass();
                        ix5 s = l33Var.s(fy5.d(z77Var));
                        this.K.I(s);
                        l33 l33Var2 = this.E;
                        l33Var2.getClass();
                        l33Var2.p(s, null);
                    }
                }
            }
        }
        synchronized (this.B) {
            try {
                if (!hashSet.isEmpty()) {
                    xk3.d().a(L, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        z77 z77Var2 = (z77) it.next();
                        i77 d2 = fy5.d(z77Var2);
                        if (!this.y.containsKey(d2)) {
                            this.y.put(d2, b77.a(this.I, z77Var2, ((o77) this.J).b, this));
                        }
                    }
                }
            } finally {
            }
        }
    }
}
