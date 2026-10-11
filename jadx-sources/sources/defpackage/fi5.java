package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public class fi5 {
    public static final /* synthetic */ AtomicLongFieldUpdater A;
    public static final /* synthetic */ AtomicIntegerFieldUpdater B;
    public static final /* synthetic */ long C;
    public static final /* synthetic */ long D;
    public static final /* synthetic */ long E;
    public static final /* synthetic */ AtomicLongFieldUpdater z;
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;
    public final int x;
    public final fr5 y;

    static {
        Unsafe unsafe = qs.a;
        D = unsafe.objectFieldOffset(fi5.class.getDeclaredField("head$volatile"));
        z = AtomicLongFieldUpdater.newUpdater(fi5.class, "deqIdx$volatile");
        E = unsafe.objectFieldOffset(fi5.class.getDeclaredField("tail$volatile"));
        A = AtomicLongFieldUpdater.newUpdater(fi5.class, "enqIdx$volatile");
        B = AtomicIntegerFieldUpdater.newUpdater(fi5.class, "_availablePermits$volatile");
        C = unsafe.objectFieldOffset(fi5.class.getDeclaredField("_availablePermits$volatile"));
    }

    public fi5(int i) {
        this.x = i;
        if (i > 0) {
            if (i >= 0) {
                ii5 ii5Var = new ii5(0L, null, 2);
                this.head$volatile = ii5Var;
                this.tail$volatile = ii5Var;
                this._availablePermits$volatile = i;
                this.y = new fr5((Object) this, (byte) 19);
                return;
            }
            ze0.e(qx1.h(i, "The number of acquired permits should be in 0.."));
            throw null;
        }
        ze0.e(qx1.h(i, "Semaphore should have at least 1 permit, but had "));
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0025, code lost:
    
        r5.h(r3, r4.y);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.xz0 r5) {
        /*
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.fi5.B
            int r1 = r0.getAndDecrement(r4)
            int r2 = r4.x
            if (r1 > r2) goto L0
            pn6 r3 = defpackage.pn6.a
            if (r1 <= 0) goto Lf
            goto L3e
        Lf:
            vz0 r5 = defpackage.wc7.z(r5)
            qg0 r5 = defpackage.te4.E(r5)
            boolean r1 = r4.c(r5)     // Catch: java.lang.Throwable -> L3f
            if (r1 != 0) goto L31
        L1d:
            int r1 = r0.getAndDecrement(r4)     // Catch: java.lang.Throwable -> L3f
            if (r1 > r2) goto L1d
            if (r1 <= 0) goto L2b
            fr5 r4 = r4.y     // Catch: java.lang.Throwable -> L3f
            r5.h(r3, r4)     // Catch: java.lang.Throwable -> L3f
            goto L31
        L2b:
            boolean r1 = r4.c(r5)     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L1d
        L31:
            java.lang.Object r4 = r5.r()
            w11 r5 = defpackage.w11.x
            if (r4 != r5) goto L3a
            goto L3b
        L3a:
            r4 = r3
        L3b:
            if (r4 != r5) goto L3e
            return r4
        L3e:
            return r3
        L3f:
            r4 = move-exception
            r5.A()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fi5.b(xz0):java.lang.Object");
    }

    public final boolean c(dx6 dx6Var) {
        Object a;
        Unsafe unsafe;
        fi5 fi5Var = this;
        Unsafe unsafe2 = qs.a;
        long j = E;
        ii5 ii5Var = (ii5) unsafe2.getObjectVolatile(fi5Var, j);
        long andIncrement = A.getAndIncrement(fi5Var);
        di5 di5Var = di5.x;
        long j2 = andIncrement / hi5.f;
        loop0: while (true) {
            a = iv0.a(ii5Var, j2, di5Var);
            if (iv.F(a)) {
                break;
            }
            ag5 B2 = iv.B(a);
            while (true) {
                ag5 ag5Var = (ag5) qs.a.getObjectVolatile(fi5Var, j);
                if (ag5Var.A >= B2.A) {
                    fi5Var = this;
                    break loop0;
                }
                if (!B2.j()) {
                    break;
                }
                do {
                    unsafe = qs.a;
                    fi5Var = this;
                    if (unsafe.compareAndSwapObject(fi5Var, E, ag5Var, B2)) {
                        if (ag5Var.f()) {
                            ag5Var.e();
                        }
                    }
                } while (unsafe.getObjectVolatile(fi5Var, j) == ag5Var);
                if (B2.f()) {
                    B2.e();
                }
            }
            fi5Var = this;
        }
        ii5 ii5Var2 = (ii5) iv.B(a);
        AtomicReferenceArray atomicReferenceArray = ii5Var2.D;
        int i = (int) (andIncrement % hi5.f);
        while (!atomicReferenceArray.compareAndSet(i, null, dx6Var)) {
            if (atomicReferenceArray.get(i) != null) {
                ni1 ni1Var = hi5.b;
                ni1 ni1Var2 = hi5.c;
                while (!atomicReferenceArray.compareAndSet(i, ni1Var, ni1Var2)) {
                    if (atomicReferenceArray.get(i) != ni1Var) {
                        return false;
                    }
                }
                ((pg0) dx6Var).h(pn6.a, fi5Var.y);
                return true;
            }
        }
        dx6Var.b(ii5Var2, i);
        return true;
    }

    public final void d() {
        Unsafe unsafe;
        long j;
        int intVolatile;
        int i;
        Object a;
        boolean z2;
        Unsafe unsafe2;
        do {
            int andIncrement = B.getAndIncrement(this);
            int i2 = this.x;
            if (andIncrement < i2) {
                if (andIncrement < 0) {
                    Unsafe unsafe3 = qs.a;
                    long j2 = D;
                    ii5 ii5Var = (ii5) unsafe3.getObjectVolatile(this, j2);
                    long andIncrement2 = z.getAndIncrement(this);
                    long j3 = andIncrement2 / hi5.f;
                    ei5 ei5Var = ei5.x;
                    while (true) {
                        a = iv0.a(ii5Var, j3, ei5Var);
                        if (iv.F(a)) {
                            break;
                        }
                        ag5 B2 = iv.B(a);
                        while (true) {
                            ag5 ag5Var = (ag5) qs.a.getObjectVolatile(this, j2);
                            if (ag5Var.A >= B2.A) {
                                break;
                            }
                            if (!B2.j()) {
                                break;
                            }
                            do {
                                unsafe2 = qs.a;
                                if (unsafe2.compareAndSwapObject(this, D, ag5Var, B2)) {
                                    if (ag5Var.f()) {
                                        ag5Var.e();
                                    }
                                }
                            } while (unsafe2.getObjectVolatile(this, j2) == ag5Var);
                            if (B2.f()) {
                                B2.e();
                            }
                        }
                    }
                    ii5 ii5Var2 = (ii5) iv.B(a);
                    AtomicReferenceArray atomicReferenceArray = ii5Var2.D;
                    ii5Var2.b();
                    z2 = false;
                    if (ii5Var2.A <= j3) {
                        int i3 = (int) (andIncrement2 % hi5.f);
                        Object andSet = atomicReferenceArray.getAndSet(i3, hi5.b);
                        if (andSet == null) {
                            int i4 = hi5.a;
                            for (int i5 = 0; i5 < i4; i5++) {
                                if (atomicReferenceArray.get(i3) == hi5.c) {
                                    z2 = true;
                                    break;
                                }
                            }
                            ni1 ni1Var = hi5.b;
                            ni1 ni1Var2 = hi5.d;
                            while (true) {
                                if (atomicReferenceArray.compareAndSet(i3, ni1Var, ni1Var2)) {
                                    z2 = true;
                                    break;
                                } else if (atomicReferenceArray.get(i3) != ni1Var) {
                                    break;
                                }
                            }
                            z2 = !z2;
                        } else if (andSet != hi5.e) {
                            boolean z3 = andSet instanceof pg0;
                            pn6 pn6Var = pn6.a;
                            if (z3) {
                                pg0 pg0Var = (pg0) andSet;
                                ni1 c = pg0Var.c(pn6Var, this.y);
                                if (c != null) {
                                    pg0Var.k(c);
                                    z2 = true;
                                    break;
                                    break;
                                }
                            } else {
                                if (andSet instanceof ng5) {
                                    if (((ng5) andSet).h(this, pn6Var) != 0) {
                                    }
                                    z2 = true;
                                    break;
                                    break;
                                }
                                v71.g(andSet, "unexpected: ");
                                return;
                            }
                        }
                    }
                } else {
                    return;
                }
            } else {
                do {
                    unsafe = qs.a;
                    j = C;
                    intVolatile = unsafe.getIntVolatile(this, j);
                    i = this.x;
                    if (intVolatile <= i) {
                        break;
                    }
                } while (!unsafe.compareAndSwapInt(this, j, intVolatile, i));
                p65.m(i2, "The number of released permits cannot be greater than ");
                return;
            }
        } while (!z2);
    }
}
