package defpackage;

import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class kp2 extends yt {
    public final /* synthetic */ lp2 n;

    public kp2(lp2 lp2Var) {
        this.n = lp2Var;
    }

    @Override // defpackage.yt
    public final void j() {
        this.n.e(9);
        ep2 ep2Var = this.n.b;
        synchronized (ep2Var) {
            long j = ep2Var.K;
            long j2 = ep2Var.J;
            if (j < j2) {
                return;
            }
            ep2Var.J = j2 + 1;
            ep2Var.L = System.nanoTime() + 1000000000;
            ep2Var.E.c(new cp2(h11.k(new StringBuilder(), ep2Var.z, " ping"), ep2Var, (byte) 0), 0L);
        }
    }

    public final void k() {
        if (!i()) {
        } else {
            throw new SocketTimeoutException("timeout");
        }
    }
}
