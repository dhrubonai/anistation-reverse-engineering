package p7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public abstract class r0 extends s0 implements f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8731f = AtomicReferenceFieldUpdater.newUpdater(r0.class, Object.class, "_queue");

    /* renamed from: x, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8732x = AtomicReferenceFieldUpdater.newUpdater(r0.class, Object.class, "_delayed");

    /* renamed from: y, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f8733y = AtomicIntegerFieldUpdater.newUpdater(r0.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    public static final boolean N(r0 r0Var) {
        r0Var.getClass();
        if (f8733y.get(r0Var) != 0) {
            return true;
        }
        return false;
    }

    @Override // p7.w
    public final void G(z6.i iVar, Runnable runnable) {
        O(runnable);
    }

    public void O(Runnable runnable) {
        if (P(runnable)) {
            Thread J = J();
            if (Thread.currentThread() != J) {
                LockSupport.unpark(J);
                return;
            }
            return;
        }
        b0.f8663z.O(runnable);
    }

    public final boolean P(Runnable runnable) {
        boolean z9;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8731f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z10 = false;
            if (f8733y.get(this) != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                return false;
            }
            if (obj == null) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                        z10 = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                if (z10) {
                    return true;
                }
            } else if (obj instanceof t7.q) {
                t7.q qVar = (t7.q) obj;
                int a10 = qVar.a(runnable);
                if (a10 == 0) {
                    return true;
                }
                if (a10 != 1) {
                    if (a10 == 2) {
                        return false;
                    }
                } else {
                    t7.q c6 = qVar.c();
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c6) && atomicReferenceFieldUpdater.get(this) == obj) {
                    }
                }
            } else {
                if (obj == t0.f8745b) {
                    return false;
                }
                t7.q qVar2 = new t7.q(8, true);
                qVar2.a((Runnable) obj);
                qVar2.a(runnable);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, qVar2)) {
                        z10 = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                if (z10) {
                    return true;
                }
            }
        }
    }

    public final boolean Q() {
        boolean z9;
        boolean z10;
        x6.h hVar = this.f8741e;
        if (hVar != null) {
            z9 = hVar.isEmpty();
        } else {
            z9 = true;
        }
        if (!z9) {
            return false;
        }
        q0 q0Var = (q0) f8732x.get(this);
        if (q0Var != null) {
            if (q0Var.b() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return false;
            }
        }
        Object obj = f8731f.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof t7.q) {
            long j4 = t7.q.f10081f.get((t7.q) obj);
            if (((int) ((1073741823 & j4) >> 0)) == ((int) ((j4 & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == t0.f8745b) {
            return true;
        }
        return false;
    }

    public final long R() {
        long j4;
        p0 c6;
        boolean z9;
        boolean z10;
        p0 p0Var;
        boolean z11;
        boolean z12;
        p0 p0Var2;
        if (L()) {
            return 0L;
        }
        q0 q0Var = (q0) f8732x.get(this);
        Runnable runnable = null;
        boolean z13 = true;
        if (q0Var != null) {
            if (q0Var.b() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                long nanoTime = System.nanoTime();
                do {
                    synchronized (q0Var) {
                        p0[] p0VarArr = q0Var.f10050a;
                        if (p0VarArr != null) {
                            p0Var = p0VarArr[0];
                        } else {
                            p0Var = null;
                        }
                        if (p0Var == null) {
                            p0Var2 = null;
                        } else {
                            if (nanoTime - p0Var.f8728a >= 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                z12 = P(p0Var);
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                p0Var2 = q0Var.e(0);
                            } else {
                                p0Var2 = null;
                            }
                        }
                    }
                } while (p0Var2 != null);
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8731f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                break;
            }
            if (obj instanceof t7.q) {
                t7.q qVar = (t7.q) obj;
                Object d10 = qVar.d();
                if (d10 != t7.q.f10082g) {
                    runnable = (Runnable) d10;
                    break;
                }
                t7.q c10 = qVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c10) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else {
                if (obj == t0.f8745b) {
                    break;
                }
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                        z9 = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        z9 = false;
                        break;
                    }
                }
                if (z9) {
                    runnable = (Runnable) obj;
                    break;
                }
            }
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        x6.h hVar = this.f8741e;
        if (hVar == null || hVar.isEmpty()) {
            j4 = Long.MAX_VALUE;
        } else {
            j4 = 0;
        }
        if (j4 == 0) {
            return 0L;
        }
        Object obj2 = f8731f.get(this);
        if (obj2 != null) {
            if (obj2 instanceof t7.q) {
                long j10 = t7.q.f10081f.get((t7.q) obj2);
                if (((int) ((1073741823 & j10) >> 0)) != ((int) ((j10 & 1152921503533105152L) >> 30))) {
                    z13 = false;
                }
                if (!z13) {
                    return 0L;
                }
            } else {
                if (obj2 != t0.f8745b) {
                    return 0L;
                }
                return Long.MAX_VALUE;
            }
        }
        q0 q0Var2 = (q0) f8732x.get(this);
        if (q0Var2 != null && (c6 = q0Var2.c()) != null) {
            long nanoTime2 = c6.f8728a - System.nanoTime();
            if (nanoTime2 < 0) {
                return 0L;
            }
            return nanoTime2;
        }
        return Long.MAX_VALUE;
    }

    public final void S(long j4, p0 p0Var) {
        boolean z9;
        int d10;
        Thread J;
        boolean z10 = true;
        if (f8733y.get(this) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        p0 p0Var2 = null;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8732x;
        if (z9) {
            d10 = 1;
        } else {
            q0 q0Var = (q0) atomicReferenceFieldUpdater.get(this);
            if (q0Var == null) {
                q0 q0Var2 = new q0(j4);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, q0Var2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                r6.h0.q(obj);
                q0Var = (q0) obj;
            }
            d10 = p0Var.d(j4, q0Var, this);
        }
        if (d10 != 0) {
            if (d10 != 1) {
                if (d10 != 2) {
                    throw new IllegalStateException("unexpected result".toString());
                }
                return;
            } else {
                M(j4, p0Var);
                return;
            }
        }
        q0 q0Var3 = (q0) atomicReferenceFieldUpdater.get(this);
        if (q0Var3 != null) {
            p0Var2 = q0Var3.c();
        }
        if (p0Var2 != p0Var) {
            z10 = false;
        }
        if (z10 && Thread.currentThread() != (J = J())) {
            LockSupport.unpark(J);
        }
    }

    public k0 q(long j4, x1 x1Var, z6.i iVar) {
        return c0.f8669a.q(j4, x1Var, iVar);
    }

    @Override // p7.s0
    public void shutdown() {
        boolean z9;
        p0 p0Var;
        boolean z10;
        ThreadLocal threadLocal = u1.f8748a;
        u1.f8748a.set(null);
        f8733y.set(this, 1);
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8731f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                w4.o oVar = t0.f8745b;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, oVar)) {
                        z9 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != null) {
                        z9 = false;
                        break;
                    }
                }
                if (z9) {
                    break;
                }
            } else {
                if (obj instanceof t7.q) {
                    ((t7.q) obj).b();
                    break;
                }
                if (obj == t0.f8745b) {
                    break;
                }
                t7.q qVar = new t7.q(8, true);
                qVar.a((Runnable) obj);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, qVar)) {
                        z10 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    break;
                }
            }
        }
        do {
        } while (R() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            q0 q0Var = (q0) f8732x.get(this);
            if (q0Var != null) {
                synchronized (q0Var) {
                    if (q0Var.b() > 0) {
                        p0Var = q0Var.e(0);
                    } else {
                        p0Var = null;
                    }
                }
                if (p0Var != null) {
                    M(nanoTime, p0Var);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
