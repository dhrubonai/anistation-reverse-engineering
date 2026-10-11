package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class s11 extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater F = AtomicIntegerFieldUpdater.newUpdater(s11.class, "workerCtl$volatile");
    public static final /* synthetic */ long G = qs.a.objectFieldOffset(s11.class.getDeclaredField("workerCtl$volatile"));
    public long A;
    public long B;
    public int C;
    public boolean D;
    public final /* synthetic */ u11 E;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;
    public final v77 x;
    public final w05 y;
    public t11 z;

    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, w05] */
    public s11(u11 u11Var, int i) {
        this.E = u11Var;
        setDaemon(true);
        setContextClassLoader(u11.class.getClassLoader());
        this.x = new v77();
        this.y = new Object();
        this.z = t11.A;
        this.nextParkedWorker = u11.H;
        int nanoTime = (int) System.nanoTime();
        this.C = nanoTime == 0 ? 42 : nanoTime;
        f(i);
    }

    public final n76 a(boolean z) {
        n76 e;
        n76 e2;
        long j;
        Unsafe unsafe;
        Unsafe unsafe2;
        t11 t11Var = this.z;
        u11 u11Var = this.E;
        n76 n76Var = null;
        boolean z2 = true;
        v77 v77Var = this.x;
        t11 t11Var2 = t11.x;
        if (t11Var != t11Var2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = u11.F;
            do {
                j = atomicLongFieldUpdater.get(u11Var);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    v77Var.getClass();
                    long j2 = v77.f;
                    loop1: while (true) {
                        unsafe = qs.a;
                        n76 n76Var2 = (n76) unsafe.getObjectVolatile(v77Var, j2);
                        if (n76Var2 == null || !n76Var2.y) {
                            break;
                        }
                        do {
                            unsafe2 = qs.a;
                            if (unsafe2.compareAndSwapObject(v77Var, v77.f, n76Var2, (Object) null)) {
                                n76Var = n76Var2;
                                break loop1;
                            }
                        } while (unsafe2.getObjectVolatile(v77Var, j2) == n76Var2);
                    }
                    int intVolatile = unsafe.getIntVolatile(v77Var, v77.e);
                    int intVolatile2 = unsafe.getIntVolatile(v77Var, v77.g);
                    while (true) {
                        if (intVolatile == intVolatile2 || qs.a.getIntVolatile(v77Var, v77.d) == 0) {
                            break;
                        }
                        intVolatile2--;
                        n76 d = v77Var.d(intVolatile2, true);
                        if (d != null) {
                            n76Var = d;
                            break;
                        }
                    }
                    if (n76Var == null) {
                        n76 n76Var3 = (n76) u11Var.C.d();
                        if (n76Var3 == null) {
                            return i(1);
                        }
                        return n76Var3;
                    }
                    return n76Var;
                }
            } while (!u11.F.compareAndSet(u11Var, j, j - 4398046511104L));
            this.z = t11Var2;
        }
        if (z) {
            if (d(u11Var.x * 2) != 0) {
                z2 = false;
            }
            if (z2 && (e2 = e()) != null) {
                return e2;
            }
            v77Var.getClass();
            n76 n76Var4 = (n76) qs.a.getAndSetObject(v77Var, v77.f, (Object) null);
            if (n76Var4 == null) {
                n76Var4 = v77Var.c();
            }
            if (n76Var4 != null) {
                return n76Var4;
            }
            if (!z2 && (e = e()) != null) {
                return e;
            }
        } else {
            n76 e3 = e();
            if (e3 != null) {
                return e3;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i) {
        int i2 = this.C;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.C = i5;
        int i6 = i - 1;
        if ((i6 & i) == 0) {
            return i6 & i5;
        }
        return (Integer.MAX_VALUE & i5) % i;
    }

    public final n76 e() {
        int d = d(2);
        u11 u11Var = this.E;
        if2 if2Var = u11Var.C;
        if2 if2Var2 = u11Var.B;
        if (d == 0) {
            n76 n76Var = (n76) if2Var2.d();
            if (n76Var != null) {
                return n76Var;
            }
            return (n76) if2Var.d();
        }
        n76 n76Var2 = (n76) if2Var.d();
        if (n76Var2 != null) {
            return n76Var2;
        }
        return (n76) if2Var2.d();
    }

    public final void f(int i) {
        String valueOf;
        StringBuilder sb = new StringBuilder();
        sb.append(this.E.A);
        sb.append("-worker-");
        if (i == 0) {
            valueOf = "TERMINATED";
        } else {
            valueOf = String.valueOf(i);
        }
        sb.append(valueOf);
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(t11 t11Var) {
        boolean z;
        t11 t11Var2 = this.z;
        if (t11Var2 == t11.x) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            u11.F.addAndGet(this.E, 4398046511104L);
        }
        if (t11Var2 != t11Var) {
            this.z = t11Var;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0072, code lost:
    
        r7 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.n76 i(int r29) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s11.i(int):n76");
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s11.run():void");
    }
}
