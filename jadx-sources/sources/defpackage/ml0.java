package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class ml0 extends k43 {
    public final qg0 B;

    public ml0(qg0 qg0Var) {
        this.B = qg0Var;
    }

    @Override // defpackage.k43
    public final boolean j() {
        return true;
    }

    @Override // defpackage.k43
    public final void k(Throwable th) {
        Unsafe unsafe;
        Unsafe unsafe2;
        t43 i = i();
        qg0 qg0Var = this.B;
        Throwable q = qg0Var.q(i);
        if (qg0Var.x()) {
            jh1 jh1Var = (jh1) qg0Var.A;
            long j = jh1.E;
            loop0: while (true) {
                Object objectVolatile = qs.a.getObjectVolatile(jh1Var, j);
                ni1 ni1Var = kh1.b;
                if (a34.i(objectVolatile, ni1Var)) {
                    do {
                        unsafe = qs.a;
                        if (unsafe.compareAndSwapObject(jh1Var, jh1.E, ni1Var, q)) {
                            return;
                        }
                    } while (unsafe.getObjectVolatile(jh1Var, j) == ni1Var);
                } else {
                    if (objectVolatile instanceof Throwable) {
                        return;
                    }
                    do {
                        unsafe2 = qs.a;
                        if (unsafe2.compareAndSwapObject(jh1Var, jh1.E, objectVolatile, (Object) null)) {
                            break loop0;
                        }
                    } while (unsafe2.getObjectVolatile(jh1Var, j) == objectVolatile);
                }
            }
        }
        qg0Var.a(q);
        if (!qg0Var.x()) {
            qg0Var.o();
        }
    }
}
