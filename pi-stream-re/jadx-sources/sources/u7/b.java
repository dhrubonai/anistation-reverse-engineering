package u7;

import f9.x;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import p7.a0;
import r6.h0;
import t7.v;
import w4.o;

/* loaded from: classes.dex */
public final class b implements Executor, Closeable {
    private volatile int _isTerminated;

    /* renamed from: a, reason: collision with root package name */
    public final int f10306a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10307b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10308c;
    private volatile long controlState;

    /* renamed from: d, reason: collision with root package name */
    public final String f10309d;

    /* renamed from: e, reason: collision with root package name */
    public final e f10310e;

    /* renamed from: f, reason: collision with root package name */
    public final e f10311f;
    private volatile long parkedWorkersStack;

    /* renamed from: x, reason: collision with root package name */
    public final v f10312x;

    /* renamed from: y, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f10304y = AtomicLongFieldUpdater.newUpdater(b.class, "parkedWorkersStack");

    /* renamed from: z, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f10305z = AtomicLongFieldUpdater.newUpdater(b.class, "controlState");
    public static final AtomicIntegerFieldUpdater A = AtomicIntegerFieldUpdater.newUpdater(b.class, "_isTerminated");
    public static final o B = new o("NOT_IN_STACK", 3);

    public b(int i10, int i11, long j4, String str) {
        boolean z9;
        boolean z10;
        boolean z11;
        this.f10306a = i10;
        this.f10307b = i11;
        this.f10308c = j4;
        this.f10309d = str;
        if (i10 >= 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            if (i11 >= i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (i11 <= 2097150) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    if (j4 > 0) {
                        this.f10310e = new e();
                        this.f10311f = new e();
                        this.f10312x = new v((i10 + 1) * 2);
                        this.controlState = i10 << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j4 + " must be positive").toString());
                }
                throw new IllegalArgumentException(a3.g.o("Max pool size ", i11, " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(a3.g.p("Max pool size ", i11, " should be greater than or equals to core pool size ", i10).toString());
        }
        throw new IllegalArgumentException(a3.g.o("Core pool size ", i10, " should be at least 1").toString());
    }

    public final int a() {
        boolean z9;
        boolean z10;
        synchronized (this.f10312x) {
            boolean z11 = false;
            if (A.get(this) != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                return -1;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater = f10305z;
            long j4 = atomicLongFieldUpdater.get(this);
            int i10 = (int) (j4 & 2097151);
            int i11 = i10 - ((int) ((j4 & 4398044413952L) >> 21));
            if (i11 < 0) {
                i11 = 0;
            }
            if (i11 >= this.f10306a) {
                return 0;
            }
            if (i10 >= this.f10307b) {
                return 0;
            }
            int i12 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
            if (i12 > 0 && this.f10312x.b(i12) == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                a aVar = new a(this, i12);
                this.f10312x.c(i12, aVar);
                if (i12 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    z11 = true;
                }
                if (z11) {
                    int i13 = i11 + 1;
                    aVar.start();
                    return i13;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x008a, code lost:
    
        if (r1 == null) goto L40;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = u7.b.A
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r9, r1, r2)
            if (r0 != 0) goto Lc
            goto Lb2
        Lc:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r3 = r0 instanceof u7.a
            r4 = 0
            if (r3 == 0) goto L18
            u7.a r0 = (u7.a) r0
            goto L19
        L18:
            r0 = r4
        L19:
            if (r0 == 0) goto L24
            u7.b r3 = r0.f10303y
            boolean r3 = r6.h0.g(r3, r9)
            if (r3 == 0) goto L24
            goto L25
        L24:
            r0 = r4
        L25:
            t7.v r3 = r9.f10312x
            monitor-enter(r3)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r5 = u7.b.f10305z     // Catch: java.lang.Throwable -> Lc4
            long r5 = r5.get(r9)     // Catch: java.lang.Throwable -> Lc4
            r7 = 2097151(0x1fffff, double:1.0361303E-317)
            long r5 = r5 & r7
            int r5 = (int) r5
            monitor-exit(r3)
            if (r2 > r5) goto L7a
            r3 = r2
        L37:
            t7.v r6 = r9.f10312x
            java.lang.Object r6 = r6.b(r3)
            r6.h0.q(r6)
            u7.a r6 = (u7.a) r6
            if (r6 == r0) goto L75
        L44:
            boolean r7 = r6.isAlive()
            if (r7 == 0) goto L53
            java.util.concurrent.locks.LockSupport.unpark(r6)
            r7 = 10000(0x2710, double:4.9407E-320)
            r6.join(r7)
            goto L44
        L53:
            u7.l r6 = r6.f10296a
            u7.e r7 = r9.f10311f
            r6.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = u7.l.f10330b
            java.lang.Object r8 = r8.getAndSet(r6, r4)
            u7.h r8 = (u7.h) r8
            if (r8 == 0) goto L67
            r7.a(r8)
        L67:
            u7.h r8 = r6.b()
            if (r8 != 0) goto L6f
            r8 = r1
            goto L73
        L6f:
            r7.a(r8)
            r8 = r2
        L73:
            if (r8 != 0) goto L67
        L75:
            if (r3 == r5) goto L7a
            int r3 = r3 + 1
            goto L37
        L7a:
            u7.e r1 = r9.f10311f
            r1.b()
            u7.e r1 = r9.f10310e
            r1.b()
        L84:
            if (r0 == 0) goto L8c
            u7.h r1 = r0.a(r2)
            if (r1 != 0) goto Lb3
        L8c:
            u7.e r1 = r9.f10310e
            java.lang.Object r1 = r1.d()
            u7.h r1 = (u7.h) r1
            if (r1 != 0) goto Lb3
            u7.e r1 = r9.f10311f
            java.lang.Object r1 = r1.d()
            u7.h r1 = (u7.h) r1
            if (r1 != 0) goto Lb3
            if (r0 == 0) goto La6
            r1 = 5
            r0.h(r1)
        La6:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = u7.b.f10304y
            r1 = 0
            r0.set(r9, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = u7.b.f10305z
            r0.set(r9, r1)
        Lb2:
            return
        Lb3:
            r1.run()     // Catch: java.lang.Throwable -> Lb7
            goto L84
        Lb7:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L84
        Lc4:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.b.close():void");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f(runnable, j.f10327g, false);
    }

    public final void f(Runnable runnable, x xVar, boolean z9) {
        h iVar;
        boolean z10;
        long j4;
        a aVar;
        boolean z11;
        boolean a10;
        int i10;
        j.f10326f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof h) {
            iVar = (h) runnable;
            iVar.f10318a = nanoTime;
            iVar.f10319b = xVar;
        } else {
            iVar = new i(runnable, nanoTime, xVar);
        }
        boolean z12 = false;
        if (iVar.f10319b.f4108a == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10305z;
        if (z10) {
            j4 = atomicLongFieldUpdater.addAndGet(this, 2097152L);
        } else {
            j4 = 0;
        }
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof a) {
            aVar = (a) currentThread;
        } else {
            aVar = null;
        }
        if (aVar == null || !h0.g(aVar.f10303y, this)) {
            aVar = null;
        }
        if (aVar != null && (i10 = aVar.f10298c) != 5 && (iVar.f10319b.f4108a != 0 || i10 != 2)) {
            aVar.f10302x = true;
            l lVar = aVar.f10296a;
            if (z9) {
                iVar = lVar.a(iVar);
            } else {
                lVar.getClass();
                h hVar = (h) l.f10330b.getAndSet(lVar, iVar);
                if (hVar == null) {
                    iVar = null;
                } else {
                    iVar = lVar.a(hVar);
                }
            }
        }
        if (iVar != null) {
            if (iVar.f10319b.f4108a == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                a10 = this.f10311f.a(iVar);
            } else {
                a10 = this.f10310e.a(iVar);
            }
            if (!a10) {
                throw new RejectedExecutionException(a3.g.t(new StringBuilder(), this.f10309d, " was terminated"));
            }
        }
        if (z9 && aVar != null) {
            z12 = true;
        }
        if (z10) {
            if (!z12 && !t() && !r(j4)) {
                t();
                return;
            }
            return;
        }
        if (!z12 && !t() && !r(atomicLongFieldUpdater.get(this))) {
            t();
        }
    }

    public final void q(a aVar, int i10, int i11) {
        while (true) {
            long j4 = f10304y.get(this);
            int i12 = (int) (2097151 & j4);
            long j10 = (2097152 + j4) & (-2097152);
            if (i12 == i10) {
                if (i11 == 0) {
                    Object c6 = aVar.c();
                    while (true) {
                        if (c6 == B) {
                            i12 = -1;
                            break;
                        }
                        if (c6 == null) {
                            i12 = 0;
                            break;
                        }
                        a aVar2 = (a) c6;
                        int b10 = aVar2.b();
                        if (b10 != 0) {
                            i12 = b10;
                            break;
                        }
                        c6 = aVar2.c();
                    }
                } else {
                    i12 = i11;
                }
            }
            if (i12 >= 0 && f10304y.compareAndSet(this, j4, i12 | j10)) {
                return;
            }
        }
    }

    public final boolean r(long j4) {
        int i10 = ((int) (2097151 & j4)) - ((int) ((j4 & 4398044413952L) >> 21));
        if (i10 < 0) {
            i10 = 0;
        }
        int i11 = this.f10306a;
        if (i10 < i11) {
            int a10 = a();
            if (a10 == 1 && i11 > 1) {
                a();
            }
            if (a10 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean t() {
        o oVar;
        int i10;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f10304y;
            long j4 = atomicLongFieldUpdater.get(this);
            a aVar = (a) this.f10312x.b((int) (2097151 & j4));
            if (aVar == null) {
                aVar = null;
            } else {
                long j10 = (2097152 + j4) & (-2097152);
                Object c6 = aVar.c();
                while (true) {
                    oVar = B;
                    if (c6 == oVar) {
                        i10 = -1;
                        break;
                    }
                    if (c6 == null) {
                        i10 = 0;
                        break;
                    }
                    a aVar2 = (a) c6;
                    i10 = aVar2.b();
                    if (i10 != 0) {
                        break;
                    }
                    c6 = aVar2.c();
                }
                if (i10 >= 0 && atomicLongFieldUpdater.compareAndSet(this, j4, j10 | i10)) {
                    aVar.g(oVar);
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f10295z.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public final String toString() {
        int i10;
        ArrayList arrayList = new ArrayList();
        v vVar = this.f10312x;
        int a10 = vVar.a();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 1; i16 < a10; i16++) {
            a aVar = (a) vVar.b(i16);
            if (aVar != null) {
                l lVar = aVar.f10296a;
                lVar.getClass();
                if (l.f10330b.get(lVar) != null) {
                    i10 = (l.f10331c.get(lVar) - l.f10332d.get(lVar)) + 1;
                } else {
                    i10 = l.f10331c.get(lVar) - l.f10332d.get(lVar);
                }
                int b10 = p.j.b(aVar.f10298c);
                if (b10 != 0) {
                    if (b10 != 1) {
                        if (b10 != 2) {
                            if (b10 != 3) {
                                if (b10 == 4) {
                                    i15++;
                                }
                            } else {
                                i14++;
                                if (i10 > 0) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(i10);
                                    sb.append('d');
                                    arrayList.add(sb.toString());
                                }
                            }
                        } else {
                            i13++;
                        }
                    } else {
                        i12++;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(i10);
                        sb2.append('b');
                        arrayList.add(sb2.toString());
                    }
                } else {
                    i11++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i10);
                    sb3.append('c');
                    arrayList.add(sb3.toString());
                }
            }
        }
        long j4 = f10305z.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f10309d);
        sb4.append('@');
        sb4.append(a0.z(this));
        sb4.append("[Pool Size {core = ");
        int i17 = this.f10306a;
        sb4.append(i17);
        sb4.append(", max = ");
        sb4.append(this.f10307b);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i11);
        sb4.append(", blocking = ");
        sb4.append(i12);
        sb4.append(", parked = ");
        sb4.append(i13);
        sb4.append(", dormant = ");
        sb4.append(i14);
        sb4.append(", terminated = ");
        sb4.append(i15);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f10310e.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f10311f.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j4));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j4) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i17 - ((int) ((j4 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
