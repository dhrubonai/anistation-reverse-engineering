package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class ua0 implements dx6 {
    public Object x = bb0.p;
    public qg0 y;
    public final /* synthetic */ za0 z;

    public ua0(za0 za0Var) {
        this.z = za0Var;
    }

    public final Object a(xz0 xz0Var) {
        ek0 ek0Var;
        Boolean bool;
        Object obj = this.x;
        boolean z = true;
        if (obj == bb0.p || obj == bb0.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = za0.F;
            za0 za0Var = this.z;
            ek0 ek0Var2 = (ek0) atomicReferenceFieldUpdater.get(za0Var);
            while (true) {
                if (za0Var.y()) {
                    this.x = bb0.l;
                    Throwable q = za0Var.q();
                    if (q == null) {
                        z = false;
                    } else {
                        int i = zw5.a;
                        throw q;
                    }
                } else {
                    long andIncrement = za0.B.getAndIncrement(za0Var);
                    long j = bb0.b;
                    long j2 = andIncrement / j;
                    int i2 = (int) (andIncrement % j);
                    if (ek0Var2.A != j2) {
                        ek0Var = za0Var.n(j2, ek0Var2);
                        if (ek0Var == null) {
                            continue;
                        }
                    } else {
                        ek0Var = ek0Var2;
                    }
                    Object K = za0Var.K(ek0Var, i2, andIncrement, null);
                    ni1 ni1Var = bb0.m;
                    h hVar = null;
                    if (K != ni1Var) {
                        ni1 ni1Var2 = bb0.o;
                        if (K == ni1Var2) {
                            if (andIncrement < za0Var.u()) {
                                ek0Var.b();
                            }
                            ek0Var2 = ek0Var;
                        } else {
                            if (K == bb0.n) {
                                za0 za0Var2 = this.z;
                                qg0 E = te4.E(wc7.z(xz0Var));
                                try {
                                    this.y = E;
                                    Object K2 = za0Var2.K(ek0Var, i2, andIncrement, this);
                                    ub2 ub2Var = za0Var2.y;
                                    if (K2 == ni1Var) {
                                        b(ek0Var, i2);
                                    } else {
                                        if (K2 == ni1Var2) {
                                            if (andIncrement < za0Var2.u()) {
                                                ek0Var.b();
                                            }
                                            ek0 ek0Var3 = (ek0) za0.F.get(za0Var2);
                                            while (true) {
                                                if (za0Var2.y()) {
                                                    qg0 qg0Var = this.y;
                                                    qg0Var.getClass();
                                                    this.y = null;
                                                    this.x = bb0.l;
                                                    Throwable q2 = za0Var.q();
                                                    if (q2 == null) {
                                                        qg0Var.resumeWith(Boolean.FALSE);
                                                    } else {
                                                        qg0Var.resumeWith(new y45(q2));
                                                    }
                                                } else {
                                                    long andIncrement2 = za0.B.getAndIncrement(za0Var2);
                                                    long j3 = bb0.b;
                                                    long j4 = andIncrement2 / j3;
                                                    int i3 = (int) (andIncrement2 % j3);
                                                    if (ek0Var3.A != j4) {
                                                        ek0 n = za0Var2.n(j4, ek0Var3);
                                                        if (n != null) {
                                                            ek0Var3 = n;
                                                        }
                                                    }
                                                    Object K3 = za0Var2.K(ek0Var3, i3, andIncrement2, this);
                                                    if (K3 == bb0.m) {
                                                        b(ek0Var3, i3);
                                                        break;
                                                    }
                                                    if (K3 == bb0.o) {
                                                        if (andIncrement2 < za0Var2.u()) {
                                                            ek0Var3.b();
                                                        }
                                                    } else if (K3 != bb0.n) {
                                                        ek0Var3.b();
                                                        this.x = K3;
                                                        this.y = null;
                                                        bool = Boolean.TRUE;
                                                        if (ub2Var != null) {
                                                            hVar = new h(ub2Var, K3, (byte) 2);
                                                        }
                                                    } else {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                }
                                            }
                                        } else {
                                            ek0Var.b();
                                            this.x = K2;
                                            this.y = null;
                                            bool = Boolean.TRUE;
                                            if (ub2Var != null) {
                                                hVar = new h(ub2Var, K2, (byte) 2);
                                            }
                                        }
                                        E.h(bool, hVar);
                                    }
                                    return E.r();
                                } catch (Throwable th) {
                                    E.A();
                                    throw th;
                                }
                            }
                            ek0Var.b();
                            this.x = K;
                        }
                    } else {
                        ze0.m("unreachable");
                        return null;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.dx6
    public final void b(ag5 ag5Var, int i) {
        qg0 qg0Var = this.y;
        if (qg0Var != null) {
            qg0Var.b(ag5Var, i);
        }
    }

    public final Object c() {
        Object obj = this.x;
        ni1 ni1Var = bb0.p;
        if (obj != ni1Var) {
            this.x = ni1Var;
            if (obj != bb0.l) {
                return obj;
            }
            Throwable r = this.z.r();
            int i = zw5.a;
            throw r;
        }
        ze0.m("`hasNext()` has not been invoked");
        return null;
    }
}
