package defpackage;

import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qy5 implements Runnable {
    public final int A;
    public final pu4 x;
    public final ix5 y;
    public final boolean z;

    public qy5(pu4 pu4Var, ix5 ix5Var, boolean z, int i) {
        pu4Var.getClass();
        ix5Var.getClass();
        this.x = pu4Var;
        this.y = ix5Var;
        this.z = z;
        this.A = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean d;
        v87 b;
        boolean z = this.z;
        pu4 pu4Var = this.x;
        ix5 ix5Var = this.y;
        if (z) {
            int i = this.A;
            pu4Var.getClass();
            String str = ix5Var.a.a;
            synchronized (pu4Var.k) {
                b = pu4Var.b(str);
            }
            d = pu4.d(str, b, i);
        } else {
            int i2 = this.A;
            pu4Var.getClass();
            String str2 = ix5Var.a.a;
            synchronized (pu4Var.k) {
                try {
                    if (pu4Var.f.get(str2) != null) {
                        xk3.d().a(pu4.l, "Ignored stopWork. WorkerWrapper " + str2 + " is in foreground");
                    } else {
                        Set set = (Set) pu4Var.h.get(str2);
                        if (set != null && set.contains(ix5Var)) {
                            d = pu4.d(str2, pu4Var.b(str2), i2);
                        }
                    }
                    d = false;
                } finally {
                }
            }
        }
        xk3.d().a(xk3.f("StopWorkRunnable"), "StopWorkRunnable for " + this.y.a.a + "; Processor.stopWork = " + d + ", reason: " + this.A);
    }
}
