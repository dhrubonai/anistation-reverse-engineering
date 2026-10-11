package defpackage;

import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class rw1 extends mw1 implements vc1 {
    public static final /* synthetic */ long C;
    public static final /* synthetic */ long D;
    public static final /* synthetic */ long E;
    public static final /* synthetic */ int F = 0;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    static {
        Unsafe unsafe = qs.a;
        E = unsafe.objectFieldOffset(rw1.class.getDeclaredField("_queue$volatile"));
        C = unsafe.objectFieldOffset(rw1.class.getDeclaredField("_delayed$volatile"));
        D = unsafe.objectFieldOffset(rw1.class.getDeclaredField("_isCompleted$volatile"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x001b, code lost:
    
        r6 = r3;
        r13 = null;
     */
    @Override // defpackage.mw1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long B0() {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rw1.B0():long");
    }

    public void D0(Runnable runnable) {
        E0();
        if (F0(runnable)) {
            Thread G0 = G0();
            if (Thread.currentThread() != G0) {
                LockSupport.unpark(G0);
                return;
            }
            return;
        }
        m81.G.D0(runnable);
    }

    public final void E0() {
        pw1 pw1Var;
        pw1 pw1Var2;
        boolean z;
        qw1 qw1Var = (qw1) qs.a.getObjectVolatile(this, C);
        if (qw1Var == null || qw1Var.b() == 0) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (qw1Var) {
                try {
                    pw1[] pw1VarArr = qw1Var.a;
                    pw1Var = null;
                    if (pw1VarArr != null) {
                        pw1Var2 = pw1VarArr[0];
                    } else {
                        pw1Var2 = null;
                    }
                    if (pw1Var2 != null) {
                        if (nanoTime - pw1Var2.x >= 0) {
                            z = F0(pw1Var2);
                        } else {
                            z = false;
                        }
                        if (z) {
                            pw1Var = qw1Var.c(0);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (pw1Var != null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean F0(java.lang.Runnable r10) {
        /*
            r9 = this;
        L0:
            sun.misc.Unsafe r0 = defpackage.qs.a
            long r6 = defpackage.rw1.E
            java.lang.Object r4 = r0.getObjectVolatile(r9, r6)
            long r2 = defpackage.rw1.D
            int r0 = r0.getIntVolatile(r9, r2)
            r8 = 1
            if (r0 != r8) goto L12
            goto L57
        L12:
            if (r4 != 0) goto L29
        L14:
            sun.misc.Unsafe r0 = defpackage.qs.a
            long r2 = defpackage.rw1.E
            r4 = 0
            r1 = r9
            r5 = r10
            boolean r2 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r2 == 0) goto L22
            goto L74
        L22:
            java.lang.Object r0 = r0.getObjectVolatile(r9, r6)
            if (r0 == 0) goto L14
            goto L0
        L29:
            boolean r0 = r4 instanceof defpackage.pk3
            if (r0 == 0) goto L53
            r0 = r4
            pk3 r0 = (defpackage.pk3) r0
            int r2 = r0.a(r10)
            if (r2 == 0) goto L74
            if (r2 == r8) goto L3c
            r0 = 2
            if (r2 == r0) goto L57
            goto L0
        L3c:
            pk3 r5 = r0.c()
        L40:
            sun.misc.Unsafe r0 = defpackage.qs.a
            long r2 = defpackage.rw1.E
            r1 = r9
            boolean r2 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r2 == 0) goto L4c
            goto L0
        L4c:
            java.lang.Object r0 = r0.getObjectVolatile(r9, r6)
            if (r0 == r4) goto L40
            goto L0
        L53:
            ni1 r0 = defpackage.sw1.b
            if (r4 != r0) goto L59
        L57:
            r0 = 0
            return r0
        L59:
            pk3 r5 = new pk3
            r0 = 8
            r5.<init>(r0, r8)
            r0 = r4
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r5.a(r0)
            r5.a(r10)
        L69:
            sun.misc.Unsafe r0 = defpackage.qs.a
            long r2 = defpackage.rw1.E
            r1 = r9
            boolean r2 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r2 == 0) goto L75
        L74:
            return r8
        L75:
            java.lang.Object r0 = r0.getObjectVolatile(r9, r6)
            if (r0 == r4) goto L69
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rw1.F0(java.lang.Runnable):boolean");
    }

    public abstract Thread G0();

    public final boolean H0() {
        boolean z;
        bs bsVar = this.A;
        if (bsVar != null) {
            z = bsVar.isEmpty();
        } else {
            z = true;
        }
        if (z) {
            Unsafe unsafe = qs.a;
            qw1 qw1Var = (qw1) unsafe.getObjectVolatile(this, C);
            if (qw1Var != null && qw1Var.b() != 0) {
                return false;
            }
            Object objectVolatile = unsafe.getObjectVolatile(this, E);
            if (objectVolatile != null) {
                if (objectVolatile instanceof pk3) {
                    long longVolatile = unsafe.getLongVolatile((pk3) objectVolatile, pk3.g);
                    if (((int) (1073741823 & longVolatile)) == ((int) ((longVolatile & 1152921503533105152L) >> 30))) {
                        return true;
                    }
                    return false;
                }
                if (objectVolatile == sw1.b) {
                }
            }
            return true;
        }
        return false;
    }

    public void I0(long j, pw1 pw1Var) {
        m81.G.J0(j, pw1Var);
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, qw1] */
    public final void J0(long j, pw1 pw1Var) {
        rw1 rw1Var;
        int a;
        Unsafe unsafe;
        Thread G0;
        long j2 = C;
        Unsafe unsafe2 = qs.a;
        if (unsafe2.getIntVolatile(this, D) == 1) {
            rw1Var = this;
            a = 1;
        } else {
            qw1 qw1Var = (qw1) unsafe2.getObjectVolatile(this, j2);
            if (qw1Var == null) {
                ?? obj = new Object();
                obj.c = j;
                while (true) {
                    unsafe = qs.a;
                    rw1Var = this;
                    if (!unsafe.compareAndSwapObject(rw1Var, C, (Object) null, (Object) obj) && unsafe.getObjectVolatile(rw1Var, j2) == null) {
                        this = rw1Var;
                    }
                }
                Object objectVolatile = unsafe.getObjectVolatile(rw1Var, j2);
                objectVolatile.getClass();
                qw1Var = (qw1) objectVolatile;
                unsafe2 = unsafe;
            } else {
                rw1Var = this;
            }
            a = pw1Var.a(j, qw1Var, rw1Var);
        }
        if (a != 0) {
            if (a != 1) {
                if (a != 2) {
                    ze0.m("unexpected result");
                    return;
                }
                return;
            }
            rw1Var.I0(j, pw1Var);
            return;
        }
        qw1 qw1Var2 = (qw1) unsafe2.getObjectVolatile(rw1Var, j2);
        pw1 pw1Var2 = null;
        if (qw1Var2 != null) {
            synchronized (qw1Var2) {
                pw1[] pw1VarArr = qw1Var2.a;
                if (pw1VarArr != null) {
                    pw1Var2 = pw1VarArr[0];
                }
            }
        }
        if (pw1Var2 == pw1Var && Thread.currentThread() != (G0 = rw1Var.G0())) {
            LockSupport.unpark(G0);
        }
    }

    @Override // defpackage.vc1
    public final void d0(long j, qg0 qg0Var) {
        long j2 = 0;
        if (j > 0) {
            if (j >= 9223372036854L) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = 1000000 * j;
            }
        }
        if (j2 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            nw1 nw1Var = new nw1(this, j2 + nanoTime, qg0Var);
            J0(nanoTime, nw1Var);
            qg0Var.w(new kg0(nw1Var, (byte) 2));
        }
    }

    @Override // defpackage.mw1
    public void shutdown() {
        ni1 ni1Var;
        Unsafe unsafe;
        pw1 pw1Var;
        me6.a.set(null);
        qs.a.putIntVolatile(this, D, 1);
        ni1 ni1Var2 = sw1.b;
        long j = E;
        loop0: while (true) {
            Object objectVolatile = qs.a.getObjectVolatile(this, j);
            if (objectVolatile != null) {
                ni1Var = ni1Var2;
                if (objectVolatile instanceof pk3) {
                    ((pk3) objectVolatile).b();
                    break;
                }
                if (objectVolatile == ni1Var) {
                    break;
                }
                pk3 pk3Var = new pk3(8, true);
                pk3Var.a((Runnable) objectVolatile);
                do {
                    unsafe = qs.a;
                    if (unsafe.compareAndSwapObject(this, E, objectVolatile, pk3Var)) {
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(this, j) == objectVolatile);
                ni1Var2 = ni1Var;
            } else {
                while (true) {
                    Unsafe unsafe2 = qs.a;
                    ni1Var = ni1Var2;
                    if (unsafe2.compareAndSwapObject(this, E, (Object) null, ni1Var2)) {
                        break loop0;
                    } else if (unsafe2.getObjectVolatile(this, j) != null) {
                        break;
                    } else {
                        ni1Var2 = ni1Var;
                    }
                }
                ni1Var2 = ni1Var;
            }
        }
        do {
        } while (B0() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            qw1 qw1Var = (qw1) qs.a.getObjectVolatile(this, C);
            if (qw1Var != null) {
                synchronized (qw1Var) {
                    if (qw1Var.b() > 0) {
                        pw1Var = qw1Var.c(0);
                    } else {
                        pw1Var = null;
                    }
                }
                if (pw1Var != null) {
                    I0(nanoTime, pw1Var);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    @Override // defpackage.n11
    public final void u0(l11 l11Var, Runnable runnable) {
        D0(runnable);
    }
}
