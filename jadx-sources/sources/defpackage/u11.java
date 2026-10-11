package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class u11 implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater E = AtomicLongFieldUpdater.newUpdater(u11.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater F = AtomicLongFieldUpdater.newUpdater(u11.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater G = AtomicIntegerFieldUpdater.newUpdater(u11.class, "_isTerminated$volatile");
    public static final ni1 H = new ni1("NOT_IN_STACK", (byte) 2);
    public final String A;
    public final if2 B;
    public final if2 C;
    public final z35 D;
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;
    public final int x;
    public final int y;
    public final long z;

    /* JADX WARN: Type inference failed for: r3v2, types: [if2, nk3] */
    /* JADX WARN: Type inference failed for: r3v3, types: [if2, nk3] */
    public u11(long j, String str, int i, int i2) {
        this.x = i;
        this.y = i2;
        this.z = j;
        this.A = str;
        if (i >= 1) {
            if (i2 >= i) {
                if (i2 <= 2097150) {
                    if (j > 0) {
                        this.B = new nk3();
                        this.C = new nk3();
                        this.D = new z35((i + 1) * 2);
                        this.controlState$volatile = i << 42;
                        return;
                    }
                    ze0.e(qx1.j(j, "Idle worker keep alive time ", " must be positive"));
                    throw null;
                }
                ze0.e(qx1.i(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
                throw null;
            }
            ze0.e(zo5.m("Max pool size ", " should be greater than or equals to core pool size ", i2, i));
            throw null;
        }
        ze0.e(qx1.i(i, "Core pool size ", " should be at least 1"));
        throw null;
    }

    public static /* synthetic */ void p(u11 u11Var, Runnable runnable, int i) {
        boolean z;
        if ((i & 4) != 0) {
            z = false;
        } else {
            z = true;
        }
        u11Var.l(runnable, false, z);
    }

    public final boolean A() {
        u11 u11Var;
        ni1 ni1Var;
        int i;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = E;
            long j = atomicLongFieldUpdater.get(this);
            s11 s11Var = (s11) this.D.b((int) (2097151 & j));
            if (s11Var == null) {
                s11Var = null;
                u11Var = this;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object c = s11Var.c();
                while (true) {
                    ni1Var = H;
                    if (c == ni1Var) {
                        i = -1;
                        break;
                    }
                    if (c == null) {
                        i = 0;
                        break;
                    }
                    s11 s11Var2 = (s11) c;
                    i = s11Var2.b();
                    if (i != 0) {
                        break;
                    }
                    c = s11Var2.c();
                    atomicLongFieldUpdater = atomicLongFieldUpdater;
                    this = this;
                }
                if (i >= 0) {
                    u11 u11Var2 = this;
                    boolean compareAndSet = atomicLongFieldUpdater.compareAndSet(u11Var2, j, j2 | i);
                    u11Var = u11Var2;
                    if (compareAndSet) {
                        s11Var.g(ni1Var);
                    }
                    this = u11Var;
                } else {
                    continue;
                }
            }
            if (s11Var == null) {
                return false;
            }
            if (s11.F.compareAndSet(s11Var, -1, 0)) {
                LockSupport.unpark(s11Var);
                return true;
            }
            this = u11Var;
        }
    }

    public final int a() {
        boolean z;
        synchronized (this.D) {
            try {
                if (G.get(this) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = F;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.x) {
                    return 0;
                }
                if (i >= this.y) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 > 0 && this.D.b(i3) == null) {
                    s11 s11Var = new s11(this, i3);
                    this.D.c(i3, s11Var);
                    if (i3 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                        int i4 = i2 + 1;
                        s11Var.start();
                        return i4;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalArgumentException("Failed requirement.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0085, code lost:
    
        if (r1 == null) goto L103;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r10 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.u11.G
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r10, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof defpackage.s11
            r3 = 0
            if (r1 == 0) goto L17
            s11 r0 = (defpackage.s11) r0
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L1e
            u11 r1 = r0.E
            if (r1 == r10) goto L1f
        L1e:
            r0 = r3
        L1f:
            z35 r1 = r10.D
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = defpackage.u11.F     // Catch: java.lang.Throwable -> Lc0
            long r4 = r4.get(r10)     // Catch: java.lang.Throwable -> Lc0
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L75
            r1 = r2
        L31:
            z35 r5 = r10.D
            java.lang.Object r5 = r5.b(r1)
            r5.getClass()
            s11 r5 = (defpackage.s11) r5
            if (r5 == r0) goto L70
        L3e:
            java.lang.Thread$State r6 = r5.getState()
            java.lang.Thread$State r7 = java.lang.Thread.State.TERMINATED
            if (r6 == r7) goto L4f
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L3e
        L4f:
            v77 r5 = r5.x
            if2 r6 = r10.C
            r5.getClass()
            sun.misc.Unsafe r7 = defpackage.qs.a
            long r8 = defpackage.v77.f
            java.lang.Object r7 = r7.getAndSetObject(r5, r8, r3)
            n76 r7 = (defpackage.n76) r7
            if (r7 == 0) goto L65
            r6.a(r7)
        L65:
            n76 r7 = r5.c()
            if (r7 != 0) goto L6c
            goto L70
        L6c:
            r6.a(r7)
            goto L65
        L70:
            if (r1 == r4) goto L75
            int r1 = r1 + 1
            goto L31
        L75:
            if2 r1 = r10.C
            r1.b()
            if2 r1 = r10.B
            r1.b()
        L7f:
            if (r0 == 0) goto L87
            n76 r1 = r0.a(r2)
            if (r1 != 0) goto Laf
        L87:
            if2 r1 = r10.B
            java.lang.Object r1 = r1.d()
            n76 r1 = (defpackage.n76) r1
            if (r1 != 0) goto Laf
            if2 r1 = r10.C
            java.lang.Object r1 = r1.d()
            n76 r1 = (defpackage.n76) r1
            if (r1 != 0) goto Laf
            if (r0 == 0) goto La2
            t11 r1 = defpackage.t11.B
            r0.h(r1)
        La2:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.u11.E
            r1 = 0
            r0.set(r10, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.u11.F
            r0.set(r10, r1)
            return
        Laf:
            r1.run()     // Catch: java.lang.Throwable -> Lb3
            goto L7f
        Lb3:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L7f
        Lc0:
            r10 = move-exception
            monitor-exit(r1)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u11.close():void");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        p(this, runnable, 6);
    }

    public final void l(Runnable runnable, boolean z, boolean z2) {
        n76 s76Var;
        long j;
        s11 s11Var;
        boolean a;
        t11 t11Var;
        v76.f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof n76) {
            s76Var = (n76) runnable;
            s76Var.x = nanoTime;
            s76Var.y = z;
        } else {
            s76Var = new s76(runnable, nanoTime, z);
        }
        boolean z3 = s76Var.y;
        AtomicLongFieldUpdater atomicLongFieldUpdater = F;
        if (z3) {
            j = atomicLongFieldUpdater.addAndGet(this, 2097152L);
        } else {
            j = 0;
        }
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof s11) {
            s11Var = (s11) currentThread;
        } else {
            s11Var = null;
        }
        if (s11Var == null || s11Var.E != this) {
            s11Var = null;
        }
        if (s11Var != null && (t11Var = s11Var.z) != t11.B && (s76Var.y || t11Var != t11.y)) {
            s11Var.D = true;
            v77 v77Var = s11Var.x;
            if (z2) {
                s76Var = v77Var.a(s76Var);
            } else {
                v77Var.getClass();
                n76 n76Var = (n76) qs.a.getAndSetObject(v77Var, v77.f, s76Var);
                if (n76Var == null) {
                    s76Var = null;
                } else {
                    s76Var = v77Var.a(n76Var);
                }
            }
        }
        if (s76Var != null) {
            if (s76Var.y) {
                a = this.C.a(s76Var);
            } else {
                a = this.B.a(s76Var);
            }
            if (!a) {
                throw new RejectedExecutionException(h11.k(new StringBuilder(), this.A, " was terminated"));
            }
        }
        if (z3) {
            if (!A() && !t(j)) {
                A();
                return;
            }
            return;
        }
        if (A() || t(atomicLongFieldUpdater.get(this))) {
            return;
        }
        A();
    }

    public final void q(s11 s11Var, int i, int i2) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = E;
            long j = atomicLongFieldUpdater.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object c = s11Var.c();
                    while (true) {
                        if (c == H) {
                            i3 = -1;
                            break;
                        }
                        if (c == null) {
                            i3 = 0;
                            break;
                        }
                        s11 s11Var2 = (s11) c;
                        int b = s11Var2.b();
                        if (b != 0) {
                            i3 = b;
                            break;
                        }
                        c = s11Var2.c();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                long j3 = j2 | i3;
                u11 u11Var = this;
                if (atomicLongFieldUpdater.compareAndSet(u11Var, j, j3)) {
                    return;
                } else {
                    this = u11Var;
                }
            }
        }
    }

    public final boolean t(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.x;
        if (i < i2) {
            int a = a();
            if (a == 1 && i2 > 1) {
                a();
            }
            if (a > 0) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        z35 z35Var = this.D;
        int a = z35Var.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < a; i6++) {
            s11 s11Var = (s11) z35Var.b(i6);
            if (s11Var != null) {
                v77 v77Var = s11Var.x;
                v77Var.getClass();
                Object objectVolatile = qs.a.getObjectVolatile(v77Var, v77.f);
                int b = v77Var.b();
                if (objectVolatile != null) {
                    b++;
                }
                int ordinal = s11Var.z.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal == 4) {
                                    i5++;
                                } else {
                                    ze0.l();
                                    return null;
                                }
                            } else {
                                i4++;
                                if (b > 0) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(b);
                                    sb.append('d');
                                    arrayList.add(sb.toString());
                                }
                            }
                        } else {
                            i3++;
                        }
                    } else {
                        i2++;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(b);
                        sb2.append('b');
                        arrayList.add(sb2.toString());
                    }
                } else {
                    i++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(b);
                    sb3.append('c');
                    arrayList.add(sb3.toString());
                }
            }
        }
        long j = F.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.A);
        sb4.append('@');
        sb4.append(z51.t(this));
        sb4.append("[Pool Size {core = ");
        int i7 = this.x;
        sb4.append(i7);
        sb4.append(", max = ");
        h11.y(sb4, this.y, "}, Worker States {CPU = ", i, ", blocking = ");
        h11.y(sb4, i2, ", parked = ", i3, ", dormant = ");
        h11.y(sb4, i4, ", terminated = ", i5, "}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.B.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.C.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i7 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
