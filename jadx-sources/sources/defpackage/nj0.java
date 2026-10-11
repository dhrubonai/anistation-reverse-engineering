package defpackage;

import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class nj0 extends s0 implements lj0 {
    public final za0 B;

    public nj0(l11 l11Var, za0 za0Var, boolean z, boolean z2) {
        super(l11Var, z, z2);
        this.B = za0Var;
    }

    @Override // defpackage.ki5
    public Object b(vz0 vz0Var, Object obj) {
        return this.B.b(vz0Var, obj);
    }

    @Override // defpackage.vz4
    public final zp2 d() {
        return this.B.d();
    }

    @Override // defpackage.vz4
    public final Object e() {
        return this.B.e();
    }

    @Override // defpackage.ki5
    public boolean f(Throwable th) {
        return this.B.c(th, false);
    }

    @Override // defpackage.vz4
    public final Object g(vz0 vz0Var) {
        return this.B.g(vz0Var);
    }

    @Override // defpackage.ki5
    public Object i(Object obj) {
        return this.B.i(obj);
    }

    @Override // defpackage.vz4
    public final ua0 iterator() {
        za0 za0Var = this.B;
        za0Var.getClass();
        return new ua0(za0Var);
    }

    @Override // defpackage.vz4
    public final Object j(cq0 cq0Var) {
        za0 za0Var = this.B;
        za0Var.getClass();
        return za0.F(za0Var, cq0Var);
    }

    public final void j0(ub2 ub2Var) {
        Unsafe unsafe;
        Unsafe unsafe2;
        za0 za0Var = this.B;
        za0Var.getClass();
        long j = za0.J;
        do {
            unsafe = qs.a;
            if (unsafe.compareAndSwapObject(za0Var, za0.J, (Object) null, ub2Var)) {
                return;
            }
        } while (unsafe.getObjectVolatile(za0Var, j) == null);
        while (true) {
            Object objectVolatile = qs.a.getObjectVolatile(za0Var, j);
            ni1 ni1Var = bb0.q;
            if (objectVolatile == ni1Var) {
                ni1 ni1Var2 = bb0.r;
                do {
                    unsafe2 = qs.a;
                    if (unsafe2.compareAndSwapObject(za0Var, za0.J, ni1Var, ni1Var2)) {
                        ub2Var.invoke(za0Var.q());
                        return;
                    }
                } while (unsafe2.getObjectVolatile(za0Var, j) == ni1Var);
            } else if (objectVolatile == bb0.r) {
                ze0.m("Another handler was already registered and successfully invoked");
                return;
            } else {
                v71.g(objectVolatile, "Another handler is already registered: ");
                return;
            }
        }
    }

    @Override // defpackage.t43, defpackage.h43
    public final void l(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new i43(v(), null, this);
        }
        s(cancellationException);
    }

    @Override // defpackage.t43
    public final void s(Throwable th) {
        CancellationException cancellationException;
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        } else {
            cancellationException = null;
        }
        if (cancellationException == null) {
            cancellationException = new i43(v(), th, this);
        }
        this.B.c(cancellationException, true);
        r(cancellationException);
    }
}
