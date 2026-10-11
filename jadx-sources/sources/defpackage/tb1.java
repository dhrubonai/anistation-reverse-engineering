package defpackage;

import android.opengl.GLES30;
import java.util.ArrayDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class tb1 implements ss6 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tb1(Object obj, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
    }

    @Override // defpackage.ss6
    public final void run() {
        boolean z = false;
        switch (this.a) {
            case 0:
                yb1 yb1Var = (yb1) this.c;
                long j = this.b;
                synchronized (yb1Var) {
                    while (yb1Var.h.d() < yb1Var.h.c && yb1Var.i.f() <= j) {
                        try {
                            he6 he6Var = yb1Var.h;
                            ArrayDeque arrayDeque = he6Var.b;
                            io3.B(!arrayDeque.isEmpty());
                            he6Var.a.add((we2) arrayDeque.remove());
                            yb1Var.i.m();
                            long m = yb1Var.j.m();
                            if (m != -1) {
                                GLES30.glDeleteSync(m);
                            }
                            a34.p();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    yb1Var.c();
                }
                return;
            case 1:
                hc1 hc1Var = (hc1) this.c;
                long j2 = this.b;
                h32 h32Var = hc1Var.k;
                oe2 oe2Var = hc1Var.c;
                ConcurrentLinkedQueue concurrentLinkedQueue = h32Var.k;
                h32Var.h.h();
                if (h32Var.o == null) {
                    io3.B(!h32Var.p);
                    if (!concurrentLinkedQueue.isEmpty()) {
                        ef6 ef6Var = (ef6) concurrentLinkedQueue.remove();
                        h32Var.i(oe2Var, ef6Var.a, ef6Var.b, j2);
                        if (concurrentLinkedQueue.isEmpty() && h32Var.t) {
                            zp2 zp2Var = h32Var.w;
                            zp2Var.getClass();
                            zp2Var.D();
                            h32Var.t = false;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                h32 h32Var2 = (h32) this.c;
                long j3 = this.b;
                sr1 sr1Var = h32Var2.m;
                he6 he6Var2 = h32Var2.l;
                if (h32Var2.o != null) {
                    z = true;
                }
                io3.B(z);
                while (he6Var2.d() < he6Var2.c && sr1Var.f() <= j3) {
                    ArrayDeque arrayDeque2 = he6Var2.b;
                    io3.B(!arrayDeque2.isEmpty());
                    he6Var2.a.add((we2) arrayDeque2.remove());
                    sr1Var.m();
                    long m2 = h32Var2.n.m();
                    if (m2 != -1) {
                        GLES30.glDeleteSync(m2);
                    }
                    a34.p();
                    h32Var2.u.h();
                }
                return;
        }
    }
}
