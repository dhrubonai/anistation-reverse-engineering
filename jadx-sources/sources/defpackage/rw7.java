package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rw7 implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ long y;
    public final /* synthetic */ qx7 z;

    public rw7(qx7 qx7Var, long j, byte b) {
        this.x = b;
        switch (b) {
            case 1:
                this.y = j;
                this.z = qx7Var;
                return;
            default:
                this.y = j;
                Objects.requireNonNull(qx7Var);
                this.z = qx7Var;
                return;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        long j = this.y;
        qx7 qx7Var = this.z;
        switch (b) {
            case 0:
                gu7 gu7Var = (gu7) qx7Var.x;
                bt7 bt7Var = gu7Var.B;
                gu7.j(bt7Var);
                bt7Var.H.h(j);
                es7 es7Var = gu7Var.C;
                gu7.l(es7Var);
                es7Var.J.b(Long.valueOf(j), "Session timeout duration set");
                return;
            default:
                qx7Var.L();
                qx7Var.M();
                gu7 gu7Var2 = (gu7) qx7Var.x;
                es7 es7Var2 = gu7Var2.C;
                gu7.l(es7Var2);
                es7Var2.J.a("Resetting analytics data (FE)");
                r08 r08Var = gu7Var2.E;
                gu7.k(r08Var);
                r08Var.L();
                g90 g90Var = r08Var.C;
                ((l08) g90Var.z).c();
                ((gu7) ((r08) g90Var.A).x).H.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                g90Var.x = elapsedRealtime;
                g90Var.y = elapsedRealtime;
                gu7Var2.p().Q();
                boolean z = !gu7Var2.a();
                bt7 bt7Var2 = gu7Var2.B;
                gu7.j(bt7Var2);
                bt7Var2.C.h(j);
                gu7 gu7Var3 = (gu7) bt7Var2.x;
                bt7 bt7Var3 = gu7Var3.B;
                gu7.j(bt7Var3);
                if (!TextUtils.isEmpty(bt7Var3.S.g())) {
                    bt7Var2.S.h(null);
                }
                bt7Var2.M.h(0L);
                bt7Var2.N.h(0L);
                if (!gu7Var3.A.Z()) {
                    bt7Var2.T(z);
                }
                bt7Var2.T.h(null);
                bt7Var2.U.h(0L);
                bt7Var2.V.d(null);
                zz7 n = gu7Var2.n();
                n.L();
                n.M();
                b48 b0 = n.b0(false);
                n.X();
                ((gu7) n.x).m().P();
                n.Z(new az7(n, b0, (byte) 0));
                gu7.k(r08Var);
                r08Var.B.c();
                qx7Var.O = z;
                gu7Var2.n().P(new AtomicReference());
                return;
        }
    }
}
