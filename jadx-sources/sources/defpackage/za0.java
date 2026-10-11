package defpackage;

import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public class za0 implements lj0 {
    public static final /* synthetic */ AtomicLongFieldUpdater A = AtomicLongFieldUpdater.newUpdater(za0.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater B;
    public static final /* synthetic */ AtomicLongFieldUpdater C;
    public static final /* synthetic */ AtomicLongFieldUpdater D;
    public static final /* synthetic */ AtomicReferenceFieldUpdater E;
    public static final /* synthetic */ AtomicReferenceFieldUpdater F;
    public static final /* synthetic */ long G;
    public static final /* synthetic */ long H;
    public static final /* synthetic */ long I;
    public static final /* synthetic */ long J;
    public static final /* synthetic */ long K;
    public static final /* synthetic */ long L;
    public static final /* synthetic */ long M;
    public static final /* synthetic */ long N;
    public static final /* synthetic */ long O;
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;
    public final int x;
    public final ub2 y;
    public final fr5 z;

    static {
        Unsafe unsafe = qs.a;
        O = unsafe.objectFieldOffset(za0.class.getDeclaredField("sendersAndCloseStatus$volatile"));
        B = AtomicLongFieldUpdater.newUpdater(za0.class, "receivers$volatile");
        M = unsafe.objectFieldOffset(za0.class.getDeclaredField("receivers$volatile"));
        C = AtomicLongFieldUpdater.newUpdater(za0.class, "bufferEnd$volatile");
        H = unsafe.objectFieldOffset(za0.class.getDeclaredField("bufferEnd$volatile"));
        D = AtomicLongFieldUpdater.newUpdater(za0.class, "completedExpandBuffersAndPauseFlag$volatile");
        K = unsafe.objectFieldOffset(za0.class.getDeclaredField("completedExpandBuffersAndPauseFlag$volatile"));
        E = AtomicReferenceFieldUpdater.newUpdater(za0.class, Object.class, "sendSegment$volatile");
        N = unsafe.objectFieldOffset(za0.class.getDeclaredField("sendSegment$volatile"));
        F = AtomicReferenceFieldUpdater.newUpdater(za0.class, Object.class, "receiveSegment$volatile");
        L = unsafe.objectFieldOffset(za0.class.getDeclaredField("receiveSegment$volatile"));
        I = unsafe.objectFieldOffset(za0.class.getDeclaredField("bufferEndSegment$volatile"));
        G = unsafe.objectFieldOffset(za0.class.getDeclaredField("_closeCause$volatile"));
        J = unsafe.objectFieldOffset(za0.class.getDeclaredField("closeHandler$volatile"));
    }

    public za0(int i, ub2 ub2Var) {
        long j;
        this.x = i;
        this.y = ub2Var;
        if (i >= 0) {
            ek0 ek0Var = bb0.a;
            if (i != 0) {
                if (i != Integer.MAX_VALUE) {
                    j = i;
                } else {
                    j = Long.MAX_VALUE;
                }
            } else {
                j = 0;
            }
            this.bufferEnd$volatile = j;
            this.completedExpandBuffersAndPauseFlag$volatile = p();
            ek0 ek0Var2 = new ek0(0L, null, this, 3);
            this.sendSegment$volatile = ek0Var2;
            this.receiveSegment$volatile = ek0Var2;
            if (B()) {
                ek0Var2 = bb0.a;
                ek0Var2.getClass();
            }
            this.bufferEndSegment$volatile = ek0Var2;
            this.z = ub2Var != null ? new fr5((Object) this, (byte) 5) : null;
            this._closeCause$volatile = bb0.s;
            return;
        }
        ze0.e(qx1.i(i, "Invalid channel capacity: ", ", should be >=0"));
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object F(defpackage.za0 r13, defpackage.xz0 r14) {
        /*
            boolean r0 = r14 instanceof defpackage.xa0
            if (r0 == 0) goto L14
            r0 = r14
            xa0 r0 = (defpackage.xa0) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.z = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            xa0 r0 = new xa0
            r0.<init>(r13, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.x
            int r0 = r6.z
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L32
            if (r0 != r2) goto L2c
            defpackage.m37.N(r14)
            dk0 r14 = (defpackage.dk0) r14
            java.lang.Object r13 = r14.a
            return r13
        L2c:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r13)
            return r1
        L32:
            defpackage.m37.N(r14)
            sun.misc.Unsafe r14 = defpackage.qs.a
            long r3 = defpackage.za0.L
            java.lang.Object r14 = r14.getObjectVolatile(r13, r3)
            ek0 r14 = (defpackage.ek0) r14
        L3f:
            boolean r0 = r13.y()
            if (r0 == 0) goto L4f
            java.lang.Throwable r13 = r13.q()
            bk0 r14 = new bk0
            r14.<init>(r13)
            return r14
        L4f:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.za0.B
            long r4 = r0.getAndIncrement(r13)
            int r0 = defpackage.bb0.b
            long r7 = (long) r0
            long r9 = r4 / r7
            long r7 = r4 % r7
            int r3 = (int) r7
            long r7 = r14.A
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 == 0) goto L6c
            ek0 r0 = r13.n(r9, r14)
            if (r0 != 0) goto L6a
            goto L3f
        L6a:
            r8 = r0
            goto L6d
        L6c:
            r8 = r14
        L6d:
            r12 = 0
            r7 = r13
            r9 = r3
            r10 = r4
            java.lang.Object r13 = r7.K(r8, r9, r10, r12)
            ni1 r14 = defpackage.bb0.m
            if (r13 == r14) goto La1
            ni1 r14 = defpackage.bb0.o
            if (r13 != r14) goto L8b
            long r13 = r7.u()
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 >= 0) goto L88
            r8.b()
        L88:
            r13 = r7
            r14 = r8
            goto L3f
        L8b:
            ni1 r14 = defpackage.bb0.n
            if (r13 != r14) goto L9d
            r6.z = r2
            r1 = r7
            r2 = r8
            java.lang.Object r13 = r1.G(r2, r3, r4, r6)
            w11 r14 = defpackage.w11.x
            if (r13 != r14) goto L9c
            return r14
        L9c:
            return r13
        L9d:
            r8.b()
            return r13
        La1:
            java.lang.String r13 = "unexpected"
            defpackage.ze0.m(r13)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.za0.F(za0, xz0):java.lang.Object");
    }

    public boolean A() {
        return false;
    }

    public final boolean B() {
        long p = p();
        if (p != 0 && p != Long.MAX_VALUE) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005e, code lost:
    
        if (r5.f() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        r5.e();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(long r7, defpackage.ek0 r9) {
        /*
            r6 = this;
        L0:
            long r0 = r9.A
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 >= 0) goto L11
            jv0 r0 = r9.c()
            ek0 r0 = (defpackage.ek0) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r9 = r0
            goto L0
        L11:
            r5 = r9
        L12:
            boolean r7 = r5.d()
            if (r7 == 0) goto L23
            jv0 r7 = r5.c()
            ek0 r7 = (defpackage.ek0) r7
            if (r7 != 0) goto L21
            goto L23
        L21:
            r5 = r7
            goto L12
        L23:
            sun.misc.Unsafe r7 = defpackage.qs.a
            long r8 = defpackage.za0.I
            java.lang.Object r7 = r7.getObjectVolatile(r6, r8)
            r4 = r7
            ag5 r4 = (defpackage.ag5) r4
            long r0 = r4.A
            long r2 = r5.A
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 < 0) goto L37
            goto L53
        L37:
            boolean r7 = r5.j()
            if (r7 != 0) goto L3f
            r9 = r5
            goto L11
        L3f:
            sun.misc.Unsafe r0 = defpackage.qs.a
            long r2 = defpackage.za0.I
            r1 = r6
            boolean r6 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r6 == 0) goto L54
            boolean r6 = r4.f()
            if (r6 == 0) goto L53
            r4.e()
        L53:
            return
        L54:
            java.lang.Object r6 = r0.getObjectVolatile(r1, r8)
            if (r6 == r4) goto L65
            boolean r6 = r5.f()
            if (r6 == 0) goto L63
            r5.e()
        L63:
            r6 = r1
            goto L23
        L65:
            r6 = r1
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.za0.C(long, ek0):void");
    }

    public final Object D(vz0 vz0Var, Object obj) {
        er0 o;
        qg0 qg0Var = new qg0(1, wc7.z(vz0Var));
        qg0Var.t();
        ub2 ub2Var = this.y;
        if (ub2Var != null && (o = o80.o(ub2Var, obj, null)) != null) {
            n03.i(o, t());
            qg0Var.resumeWith(new y45(o));
        } else {
            qg0Var.resumeWith(new y45(t()));
        }
        Object r = qg0Var.r();
        if (r == w11.x) {
            return r;
        }
        return pn6.a;
    }

    public final void E(Object obj, qg0 qg0Var) {
        ub2 ub2Var = this.y;
        if (ub2Var != null) {
            o80.n(ub2Var, obj, qg0Var.B);
        }
        qg0Var.resumeWith(new y45(t()));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G(defpackage.ek0 r15, int r16, long r17, defpackage.xz0 r19) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.za0.G(ek0, int, long, xz0):java.lang.Object");
    }

    public final void H(dx6 dx6Var, boolean z) {
        Throwable t;
        if (dx6Var instanceof pg0) {
            vz0 vz0Var = (vz0) dx6Var;
            if (z) {
                t = r();
            } else {
                t = t();
            }
            vz0Var.resumeWith(new y45(t));
            return;
        }
        if (dx6Var instanceof uz4) {
            ((uz4) dx6Var).x.resumeWith(new dk0(new bk0(q())));
            return;
        }
        if (dx6Var instanceof ua0) {
            ua0 ua0Var = (ua0) dx6Var;
            qg0 qg0Var = ua0Var.y;
            qg0Var.getClass();
            ua0Var.y = null;
            ua0Var.x = bb0.l;
            Throwable q = ua0Var.z.q();
            if (q == null) {
                qg0Var.resumeWith(Boolean.FALSE);
                return;
            } else {
                qg0Var.resumeWith(new y45(q));
                return;
            }
        }
        if (dx6Var instanceof ng5) {
            ((ng5) dx6Var).h(this, bb0.l);
        } else {
            v71.g(dx6Var, "Unexpected waiter: ");
        }
    }

    public final boolean I(Object obj, Object obj2) {
        if (obj instanceof ng5) {
            if (((ng5) obj).h(this, obj2) != 0) {
                return false;
            }
            return true;
        }
        boolean z = obj instanceof uz4;
        ub2 ub2Var = this.y;
        jc2 jc2Var = null;
        if (z) {
            qg0 qg0Var = ((uz4) obj).x;
            dk0 dk0Var = new dk0(obj2);
            if (ub2Var != null) {
                jc2Var = new ja(3, this, za0.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, (byte) 2);
            }
            ek0 ek0Var = bb0.a;
            ni1 c = qg0Var.c(dk0Var, jc2Var);
            if (c == null) {
                return false;
            }
            qg0Var.k(c);
            return true;
        }
        if (obj instanceof ua0) {
            ua0 ua0Var = (ua0) obj;
            qg0 qg0Var2 = ua0Var.y;
            qg0Var2.getClass();
            ua0Var.y = null;
            ua0Var.x = obj2;
            Boolean bool = Boolean.TRUE;
            ub2 ub2Var2 = ua0Var.z.y;
            if (ub2Var2 != null) {
                jc2Var = new h(ub2Var2, obj2, (byte) 2);
            }
            ek0 ek0Var2 = bb0.a;
            ni1 c2 = qg0Var2.c(bool, jc2Var);
            if (c2 == null) {
                return false;
            }
            qg0Var2.k(c2);
            return true;
        }
        if (obj instanceof pg0) {
            pg0 pg0Var = (pg0) obj;
            if (ub2Var != null) {
                jc2Var = new ja(3, this, za0.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, (byte) 1);
            }
            ek0 ek0Var3 = bb0.a;
            ni1 c3 = pg0Var.c(obj2, jc2Var);
            if (c3 == null) {
                return false;
            }
            pg0Var.k(c3);
            return true;
        }
        v71.g(obj, "Unexpected receiver type: ");
        return false;
    }

    public final boolean J(Object obj, ek0 ek0Var, int i) {
        ik6 ik6Var;
        boolean z = obj instanceof pg0;
        pn6 pn6Var = pn6.a;
        if (z) {
            pg0 pg0Var = (pg0) obj;
            ek0 ek0Var2 = bb0.a;
            ni1 c = pg0Var.c(pn6Var, null);
            if (c == null) {
                return false;
            }
            pg0Var.k(c);
            return true;
        }
        if (obj instanceof ng5) {
            int h = ((ng5) obj).h(this, pn6Var);
            ik6 ik6Var2 = ik6.x;
            ik6 ik6Var3 = ik6.y;
            if (h != 0) {
                if (h != 1) {
                    if (h != 2) {
                        if (h == 3) {
                            ik6Var = ik6.A;
                        } else {
                            p65.m(h, "Unexpected internal result: ");
                            return false;
                        }
                    } else {
                        ik6Var = ik6.z;
                    }
                } else {
                    ik6Var = ik6Var3;
                }
            } else {
                ik6Var = ik6Var2;
            }
            if (ik6Var == ik6Var3) {
                ek0Var.n(i, null);
            }
            if (ik6Var != ik6Var2) {
                return false;
            }
            return true;
        }
        v71.g(obj, "Unexpected waiter: ");
        return false;
    }

    public final Object K(ek0 ek0Var, int i, long j, Object obj) {
        Object l = ek0Var.l(i);
        AtomicReferenceArray atomicReferenceArray = ek0Var.E;
        long j2 = O;
        if (l == null) {
            if (j >= (qs.a.getLongVolatile(this, j2) & 1152921504606846975L)) {
                if (obj == null) {
                    return bb0.n;
                }
                if (ek0Var.k(i, l, obj)) {
                    m();
                    return bb0.m;
                }
            }
        } else if (l == bb0.d && ek0Var.k(i, l, bb0.i)) {
            m();
            Object obj2 = atomicReferenceArray.get(i * 2);
            ek0Var.n(i, null);
            return obj2;
        }
        while (true) {
            Object l2 = ek0Var.l(i);
            if (l2 != null && l2 != bb0.e) {
                if (l2 == bb0.d) {
                    if (ek0Var.k(i, l2, bb0.i)) {
                        m();
                        Object obj3 = atomicReferenceArray.get(i * 2);
                        ek0Var.n(i, null);
                        return obj3;
                    }
                } else {
                    ni1 ni1Var = bb0.j;
                    if (l2 == ni1Var) {
                        return bb0.o;
                    }
                    if (l2 == bb0.h) {
                        return bb0.o;
                    }
                    if (l2 == bb0.l) {
                        m();
                        return bb0.o;
                    }
                    if (l2 != bb0.g && ek0Var.k(i, l2, bb0.f)) {
                        boolean z = l2 instanceof ex6;
                        if (z) {
                            l2 = ((ex6) l2).a;
                        }
                        if (J(l2, ek0Var, i)) {
                            ek0Var.o(i, bb0.i);
                            m();
                            Object obj4 = atomicReferenceArray.get(i * 2);
                            ek0Var.n(i, null);
                            return obj4;
                        }
                        ek0Var.o(i, ni1Var);
                        ek0Var.i();
                        if (z) {
                            m();
                        }
                        return bb0.o;
                    }
                }
            } else if (j < (qs.a.getLongVolatile(this, j2) & 1152921504606846975L)) {
                if (ek0Var.k(i, l2, bb0.h)) {
                    m();
                    return bb0.o;
                }
            } else {
                if (obj == null) {
                    return bb0.n;
                }
                if (ek0Var.k(i, l2, obj)) {
                    m();
                    return bb0.m;
                }
            }
        }
    }

    public final int L(ek0 ek0Var, int i, Object obj, long j, Object obj2, boolean z) {
        ek0Var.n(i, obj);
        if (z) {
            return M(ek0Var, i, obj, j, obj2, z);
        }
        Object l = ek0Var.l(i);
        if (l == null) {
            if (a(j)) {
                if (ek0Var.k(i, null, bb0.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (ek0Var.k(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (l instanceof dx6) {
            ek0Var.n(i, null);
            if (I(l, obj)) {
                ek0Var.o(i, bb0.i);
                return 0;
            }
            ni1 ni1Var = bb0.k;
            if (ek0Var.E.getAndSet((i * 2) + 1, ni1Var) != ni1Var) {
                ek0Var.m(i, true);
                return 5;
            }
            return 5;
        }
        return M(ek0Var, i, obj, j, obj2, z);
    }

    public final int M(ek0 ek0Var, int i, Object obj, long j, Object obj2, boolean z) {
        while (true) {
            Object l = ek0Var.l(i);
            if (l == null) {
                if (a(j) && !z) {
                    if (ek0Var.k(i, null, bb0.d)) {
                        break;
                    }
                } else if (z) {
                    if (ek0Var.k(i, null, bb0.j)) {
                        ek0Var.i();
                        return 4;
                    }
                } else {
                    if (obj2 == null) {
                        return 3;
                    }
                    if (ek0Var.k(i, null, obj2)) {
                        return 2;
                    }
                }
            } else if (l == bb0.e) {
                if (ek0Var.k(i, l, bb0.d)) {
                    break;
                }
            } else {
                ni1 ni1Var = bb0.k;
                if (l == ni1Var) {
                    ek0Var.n(i, null);
                    return 5;
                }
                if (l == bb0.h) {
                    ek0Var.n(i, null);
                    return 5;
                }
                if (l == bb0.l) {
                    ek0Var.n(i, null);
                    z();
                    return 4;
                }
                ek0Var.n(i, null);
                if (l instanceof ex6) {
                    l = ((ex6) l).a;
                }
                if (I(l, obj)) {
                    ek0Var.o(i, bb0.i);
                    return 0;
                }
                if (ek0Var.E.getAndSet((i * 2) + 1, ni1Var) != ni1Var) {
                    ek0Var.m(i, true);
                }
                return 5;
            }
        }
        return 1;
    }

    public final void N(long j) {
        boolean z;
        za0 za0Var = this;
        if (!za0Var.B()) {
            while (za0Var.p() <= j) {
                za0Var = this;
            }
            int i = bb0.c;
            int i2 = 0;
            while (true) {
                long j2 = K;
                if (i2 < i) {
                    long p = za0Var.p();
                    if (p != (qs.a.getLongVolatile(za0Var, j2) & 4611686018427387903L) || p != za0Var.p()) {
                        i2++;
                    } else {
                        return;
                    }
                } else {
                    while (true) {
                        Unsafe unsafe = qs.a;
                        long longVolatile = unsafe.getLongVolatile(za0Var, j2);
                        if (unsafe.compareAndSwapLong(za0Var, K, longVolatile, 4611686018427387904L + (longVolatile & 4611686018427387903L))) {
                            break;
                        } else {
                            za0Var = this;
                        }
                    }
                    while (true) {
                        long p2 = za0Var.p();
                        Unsafe unsafe2 = qs.a;
                        long longVolatile2 = unsafe2.getLongVolatile(za0Var, j2);
                        long j3 = longVolatile2 & 4611686018427387903L;
                        if ((longVolatile2 & 4611686018427387904L) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (p2 == j3 && p2 == za0Var.p()) {
                            break;
                        }
                        if (!z) {
                            za0Var = this;
                            unsafe2.compareAndSwapLong(za0Var, K, longVolatile2, j3 + 4611686018427387904L);
                        } else {
                            za0Var = this;
                        }
                    }
                    while (true) {
                        Unsafe unsafe3 = qs.a;
                        long longVolatile3 = unsafe3.getLongVolatile(za0Var, j2);
                        if (unsafe3.compareAndSwapLong(za0Var, K, longVolatile3, longVolatile3 & 4611686018427387903L)) {
                            return;
                        } else {
                            za0Var = this;
                        }
                    }
                }
            }
        }
    }

    public final boolean a(long j) {
        if (j >= p() && j >= s() + this.x) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0165 A[RETURN] */
    @Override // defpackage.ki5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(defpackage.vz0 r27, java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.za0.b(vz0, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
    
        if (r19 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        r0 = defpackage.qs.a;
        r2 = defpackage.za0.O;
        r4 = r0.getLongVolatile(r17, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (r0.compareAndSwapLong(r17, r2, r4, (r4 & 1152921504606846975L) + 3458764513820540928L) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0079, code lost:
    
        z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
    
        if (r12 == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007e, code lost:
    
        r0 = defpackage.qs.a;
        r6 = defpackage.za0.J;
        r4 = r0.getObjectVolatile(r17, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0086, code lost:
    
        if (r4 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0088, code lost:
    
        r0 = defpackage.bb0.q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
    
        r5 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008f, code lost:
    
        r0 = defpackage.qs.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0097, code lost:
    
        if (r0.compareAndSwapObject(r17, defpackage.za0.J, r4, r5) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ad, code lost:
    
        if (r0.getObjectVolatile(r17, r6) == r4) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0099, code lost:
    
        if (r4 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009c, code lost:
    
        defpackage.wk6.j(1, r4);
        ((defpackage.ub2) r4).invoke(q());
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a8, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008c, code lost:
    
        r0 = defpackage.bb0.r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b0, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x005a, code lost:
    
        r0 = defpackage.qs.a;
        r2 = defpackage.za0.O;
        r4 = r0.getLongVolatile(r17, r2);
        r6 = (int) (r4 >> 60);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0065, code lost:
    
        if (r6 == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0067, code lost:
    
        if (r6 == 1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006a, code lost:
    
        r6 = (r4 & 1152921504606846975L) + 3458764513820540928L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0077, code lost:
    
        if (r0.compareAndSwapLong(r17, r2, r4, r6) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x006e, code lost:
    
        r6 = (r4 & 1152921504606846975L) + 2305843009213693952L;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(java.lang.Throwable r18, boolean r19) {
        /*
            r17 = this;
            r1 = r17
            r8 = 60
            r9 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            if (r19 == 0) goto L29
        Lb:
            sun.misc.Unsafe r0 = defpackage.qs.a
            long r2 = defpackage.za0.O
            long r4 = r0.getLongVolatile(r1, r2)
            long r6 = r4 >> r8
            int r6 = (int) r6
            if (r6 != 0) goto L29
            long r6 = r4 & r9
            ek0 r11 = defpackage.bb0.a
            r11 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r6 = r6 + r11
            boolean r0 = r0.compareAndSwapLong(r1, r2, r4, r6)
            if (r0 == 0) goto L26
            goto L29
        L26:
            r1 = r17
            goto Lb
        L29:
            ni1 r4 = defpackage.bb0.s
        L2b:
            sun.misc.Unsafe r0 = defpackage.qs.a
            long r2 = defpackage.za0.G
            r1 = r17
            r5 = r18
            boolean r6 = r0.compareAndSwapObject(r1, r2, r4, r5)
            r11 = 1
            if (r6 == 0) goto L3c
            r12 = r11
            goto L44
        L3c:
            java.lang.Object r0 = r0.getObjectVolatile(r1, r2)
            if (r0 == r4) goto L2b
            r0 = 0
            r12 = r0
        L44:
            r13 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            if (r19 == 0) goto L5a
        L48:
            sun.misc.Unsafe r0 = defpackage.qs.a
            long r2 = defpackage.za0.O
            long r4 = r0.getLongVolatile(r1, r2)
            long r6 = r4 & r9
            long r6 = r6 + r13
            boolean r0 = r0.compareAndSwapLong(r1, r2, r4, r6)
            if (r0 == 0) goto L48
            goto L79
        L5a:
            sun.misc.Unsafe r0 = defpackage.qs.a
            long r2 = defpackage.za0.O
            long r4 = r0.getLongVolatile(r1, r2)
            long r6 = r4 >> r8
            int r6 = (int) r6
            if (r6 == 0) goto L6e
            if (r6 == r11) goto L6a
            goto L79
        L6a:
            long r6 = r4 & r9
            long r6 = r6 + r13
            goto L73
        L6e:
            long r6 = r4 & r9
            r15 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r6 = r6 + r15
        L73:
            boolean r0 = r0.compareAndSwapLong(r1, r2, r4, r6)
            if (r0 == 0) goto L5a
        L79:
            r1.z()
            if (r12 == 0) goto Lb0
        L7e:
            sun.misc.Unsafe r0 = defpackage.qs.a
            long r6 = defpackage.za0.J
            java.lang.Object r4 = r0.getObjectVolatile(r1, r6)
            if (r4 != 0) goto L8c
            ni1 r0 = defpackage.bb0.q
        L8a:
            r5 = r0
            goto L8f
        L8c:
            ni1 r0 = defpackage.bb0.r
            goto L8a
        L8f:
            sun.misc.Unsafe r0 = defpackage.qs.a
            long r2 = defpackage.za0.J
            boolean r2 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r2 == 0) goto La9
            if (r4 != 0) goto L9c
            goto Lb0
        L9c:
            defpackage.wk6.j(r11, r4)
            ub2 r4 = (defpackage.ub2) r4
            java.lang.Throwable r0 = r1.q()
            r4.invoke(r0)
            return r12
        La9:
            java.lang.Object r0 = r0.getObjectVolatile(r1, r6)
            if (r0 == r4) goto L8f
            goto L7e
        Lb0:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.za0.c(java.lang.Throwable, boolean):boolean");
    }

    @Override // defpackage.vz4
    public final zp2 d() {
        va0 va0Var = va0.x;
        wk6.j(3, va0Var);
        wa0 wa0Var = wa0.x;
        wk6.j(3, wa0Var);
        return new zp2(this, va0Var, wa0Var, this.z);
    }

    @Override // defpackage.vz4
    public final Object e() {
        ek0 ek0Var;
        Unsafe unsafe = qs.a;
        long longVolatile = unsafe.getLongVolatile(this, M);
        long longVolatile2 = unsafe.getLongVolatile(this, O);
        if (x(longVolatile2, true)) {
            return new bk0(q());
        }
        long j = longVolatile2 & 1152921504606846975L;
        ck0 ck0Var = dk0.b;
        if (longVolatile >= j) {
            return ck0Var;
        }
        Object obj = bb0.k;
        ek0 ek0Var2 = (ek0) unsafe.getObjectVolatile(this, L);
        while (!this.y()) {
            long andIncrement = B.getAndIncrement(this);
            long j2 = bb0.b;
            long j3 = andIncrement / j2;
            int i = (int) (andIncrement % j2);
            if (ek0Var2.A != j3) {
                ek0 n = this.n(j3, ek0Var2);
                if (n == null) {
                    continue;
                } else {
                    ek0Var = n;
                }
            } else {
                ek0Var = ek0Var2;
            }
            za0 za0Var = this;
            Object K2 = za0Var.K(ek0Var, i, andIncrement, obj);
            ek0Var2 = ek0Var;
            dx6 dx6Var = null;
            if (K2 == bb0.m) {
                if (obj instanceof dx6) {
                    dx6Var = (dx6) obj;
                }
                if (dx6Var != null) {
                    dx6Var.b(ek0Var2, i);
                }
                za0Var.N(andIncrement);
                ek0Var2.i();
                return ck0Var;
            }
            if (K2 == bb0.o) {
                if (andIncrement < za0Var.u()) {
                    ek0Var2.b();
                }
                this = za0Var;
            } else {
                if (K2 != bb0.n) {
                    ek0Var2.b();
                    return K2;
                }
                ze0.m("unexpected");
                return null;
            }
        }
        return new bk0(this.q());
    }

    @Override // defpackage.ki5
    public final boolean f(Throwable th) {
        return c(th, false);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [long] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // defpackage.vz4
    public final Object g(vz0 vz0Var) {
        ek0 ek0Var;
        Throwable th;
        qg0 qg0Var;
        qg0 qg0Var2;
        ja jaVar;
        ek0 ek0Var2;
        Unsafe unsafe = qs.a;
        ?? r1 = L;
        ek0 ek0Var3 = (ek0) unsafe.getObjectVolatile(this, (long) r1);
        while (!this.y()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = B;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j = bb0.b;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (ek0Var3.A != j2) {
                ek0 n = this.n(j2, ek0Var3);
                if (n == null) {
                    continue;
                } else {
                    ek0Var = n;
                }
            } else {
                ek0Var = ek0Var3;
            }
            za0 za0Var = this;
            Object K2 = za0Var.K(ek0Var, i, andIncrement, null);
            ni1 ni1Var = bb0.m;
            ja jaVar2 = null;
            if (K2 != ni1Var) {
                ni1 ni1Var2 = bb0.o;
                if (K2 == ni1Var2) {
                    if (andIncrement < za0Var.u()) {
                        ek0Var.b();
                    }
                    this = za0Var;
                    ek0Var3 = ek0Var;
                } else if (K2 == bb0.n) {
                    qg0 E2 = te4.E(wc7.z(vz0Var));
                    try {
                        Object K3 = za0Var.K(ek0Var, i, andIncrement, E2);
                        try {
                            if (K3 == ni1Var) {
                                E2.b(ek0Var, i);
                            } else {
                                ub2 ub2Var = za0Var.y;
                                try {
                                    if (K3 == ni1Var2) {
                                        if (andIncrement < za0Var.u()) {
                                            ek0Var.b();
                                        }
                                        ek0 ek0Var4 = (ek0) qs.a.getObjectVolatile(za0Var, (long) r1);
                                        while (!za0Var.y()) {
                                            qg0 qg0Var3 = E2;
                                            try {
                                                long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(za0Var);
                                                long j3 = bb0.b;
                                                long j4 = andIncrement2 / j3;
                                                int i2 = (int) (andIncrement2 % j3);
                                                if (ek0Var4.A != j4) {
                                                    try {
                                                        ek0 n2 = za0Var.n(j4, ek0Var4);
                                                        if (n2 == null) {
                                                            E2 = qg0Var3;
                                                        } else {
                                                            ek0Var2 = n2;
                                                        }
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        qg0Var = qg0Var3;
                                                        qg0Var.A();
                                                        throw th;
                                                    }
                                                } else {
                                                    ek0Var2 = ek0Var4;
                                                }
                                                za0 za0Var2 = za0Var;
                                                K3 = za0Var2.K(ek0Var2, i2, andIncrement2, qg0Var3);
                                                za0Var = za0Var2;
                                                ek0 ek0Var5 = ek0Var2;
                                                qg0Var2 = qg0Var3;
                                                if (K3 == bb0.m) {
                                                    qg0Var2.b(ek0Var5, i2);
                                                    break;
                                                }
                                                if (K3 == bb0.o) {
                                                    if (andIncrement2 < za0Var.u()) {
                                                        ek0Var5.b();
                                                    }
                                                    ek0Var4 = ek0Var5;
                                                    E2 = qg0Var2;
                                                } else if (K3 != bb0.n) {
                                                    ek0Var5.b();
                                                    if (ub2Var != null) {
                                                        jaVar = new ja(3, za0Var, za0.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, (byte) 1);
                                                        jaVar2 = jaVar;
                                                    }
                                                    qg0Var2.h(K3, jaVar2);
                                                } else {
                                                    throw new IllegalStateException("unexpected");
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                r1 = qg0Var3;
                                                th = th;
                                                qg0Var = r1;
                                                qg0Var.A();
                                                throw th;
                                            }
                                        }
                                        E2.resumeWith(new y45(za0Var.r()));
                                    } else {
                                        qg0Var2 = E2;
                                        ek0Var.b();
                                        if (ub2Var != null) {
                                            jaVar = new ja(3, za0Var, za0.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, (byte) 1);
                                            jaVar2 = jaVar;
                                        }
                                        qg0Var2.h(K3, jaVar2);
                                    }
                                    return qg0Var2.r();
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            }
                            qg0Var2 = E2;
                            return qg0Var2.r();
                        } catch (Throwable th5) {
                            th = th5;
                            qg0Var = E2;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        r1 = E2;
                    }
                } else {
                    ek0Var.b();
                    return K2;
                }
            } else {
                ze0.m("unexpected");
                return null;
            }
        }
        Throwable r = this.r();
        int i3 = zw5.a;
        throw r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0097, code lost:
    
        r0 = (defpackage.ek0) ((defpackage.jv0) defpackage.qs.a.getObjectVolatile(r0, defpackage.jv0.y));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ek0 h(long r12) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.za0.h(long):ek0");
    }

    @Override // defpackage.ki5
    public Object i(Object obj) {
        boolean z;
        za0 za0Var = this;
        Unsafe unsafe = qs.a;
        long longVolatile = unsafe.getLongVolatile(za0Var, O);
        long j = 1152921504606846975L;
        if (za0Var.x(longVolatile, false)) {
            z = false;
        } else {
            z = !za0Var.a(longVolatile & 1152921504606846975L);
        }
        ck0 ck0Var = dk0.b;
        if (z) {
            return ck0Var;
        }
        Object obj2 = bb0.j;
        ek0 ek0Var = (ek0) unsafe.getObjectVolatile(za0Var, N);
        while (true) {
            long andIncrement = A.getAndIncrement(za0Var);
            long j2 = andIncrement & j;
            boolean x = za0Var.x(andIncrement, false);
            int i = bb0.b;
            long j3 = i;
            long j4 = j2 / j3;
            int i2 = (int) (j2 % j3);
            if (ek0Var.A != j4) {
                ek0 o = za0Var.o(j4, ek0Var);
                if (o == null) {
                    if (x) {
                        return new bk0(za0Var.t());
                    }
                    j = 1152921504606846975L;
                } else {
                    ek0Var = o;
                }
            }
            int L2 = za0Var.L(ek0Var, i2, obj, j2, obj2, x);
            pn6 pn6Var = pn6.a;
            if (L2 != 0) {
                if (L2 != 1) {
                    dx6 dx6Var = null;
                    if (L2 != 2) {
                        if (L2 != 3) {
                            if (L2 != 4) {
                                if (L2 == 5) {
                                    ek0Var.b();
                                }
                                j = 1152921504606846975L;
                                za0Var = this;
                            } else {
                                if (j2 < s()) {
                                    ek0Var.b();
                                }
                                return new bk0(t());
                            }
                        } else {
                            ze0.m("unexpected");
                            return null;
                        }
                    } else {
                        if (x) {
                            ek0Var.i();
                            return new bk0(t());
                        }
                        if (obj2 instanceof dx6) {
                            dx6Var = (dx6) obj2;
                        }
                        if (dx6Var != null) {
                            dx6Var.b(ek0Var, i2 + i);
                        }
                        ek0Var.i();
                        return ck0Var;
                    }
                } else {
                    return pn6Var;
                }
            } else {
                ek0Var.b();
                return pn6Var;
            }
        }
    }

    @Override // defpackage.vz4
    public final ua0 iterator() {
        return new ua0(this);
    }

    @Override // defpackage.vz4
    public final Object j(cq0 cq0Var) {
        return F(this, cq0Var);
    }

    public final void k(long j) {
        er0 o;
        ek0 ek0Var = (ek0) qs.a.getObjectVolatile(this, L);
        while (true) {
            Unsafe unsafe = qs.a;
            long j2 = M;
            long longVolatile = unsafe.getLongVolatile(this, j2);
            if (j < Math.max(this.x + longVolatile, this.p())) {
                return;
            }
            za0 za0Var = this;
            if (unsafe.compareAndSwapLong(za0Var, j2, longVolatile, 1 + longVolatile)) {
                long j3 = bb0.b;
                long j4 = longVolatile / j3;
                int i = (int) (longVolatile % j3);
                if (ek0Var.A != j4) {
                    ek0 n = za0Var.n(j4, ek0Var);
                    if (n != null) {
                        ek0Var = n;
                    }
                }
                ek0 ek0Var2 = ek0Var;
                Object K2 = za0Var.K(ek0Var2, i, longVolatile, null);
                if (K2 == bb0.o) {
                    if (longVolatile < za0Var.u()) {
                        ek0Var2.b();
                    }
                } else {
                    ek0Var2.b();
                    ub2 ub2Var = za0Var.y;
                    if (ub2Var != null && (o = o80.o(ub2Var, K2, null)) != null) {
                        throw o;
                    }
                }
                this = za0Var;
                ek0Var = ek0Var2;
            }
            this = za0Var;
        }
    }

    @Override // defpackage.vz4
    public final void l(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        c(cancellationException, true);
    }

    public final void m() {
        Object a;
        Unsafe unsafe;
        if (B()) {
            return;
        }
        Unsafe unsafe2 = qs.a;
        long j = I;
        ek0 ek0Var = (ek0) unsafe2.getObjectVolatile(this, j);
        loop0: while (true) {
            long andIncrement = C.getAndIncrement(this);
            long j2 = andIncrement / bb0.b;
            if (u() <= andIncrement) {
                if (ek0Var.A < j2 && ek0Var.c() != null) {
                    C(j2, ek0Var);
                }
                v(1L);
                return;
            }
            if (ek0Var.A != j2) {
                ab0 ab0Var = ab0.x;
                while (true) {
                    a = iv0.a(ek0Var, j2, ab0Var);
                    if (!iv.F(a)) {
                        ag5 B2 = iv.B(a);
                        while (true) {
                            ag5 ag5Var = (ag5) qs.a.getObjectVolatile(this, j);
                            if (ag5Var.A >= B2.A) {
                                break;
                            }
                            if (!B2.j()) {
                                break;
                            }
                            do {
                                unsafe = qs.a;
                                if (unsafe.compareAndSwapObject(this, I, ag5Var, B2)) {
                                    if (ag5Var.f()) {
                                        ag5Var.e();
                                    }
                                }
                            } while (unsafe.getObjectVolatile(this, j) == ag5Var);
                            if (B2.f()) {
                                B2.e();
                            }
                        }
                    } else {
                        break;
                    }
                }
                ek0 ek0Var2 = null;
                if (iv.F(a)) {
                    z();
                    C(j2, ek0Var);
                    v(1L);
                } else {
                    ek0 ek0Var3 = (ek0) iv.B(a);
                    long j3 = ek0Var3.A;
                    if (j3 > j2) {
                        long j4 = bb0.b * j3;
                        if (!qs.a.compareAndSwapLong(this, H, 1 + andIncrement, j4)) {
                            v(1L);
                        } else {
                            v(j4 - andIncrement);
                        }
                    } else {
                        ek0Var2 = ek0Var3;
                    }
                }
                if (ek0Var2 == null) {
                    continue;
                } else {
                    ek0Var = ek0Var2;
                }
            }
            int i = (int) (andIncrement % bb0.b);
            Object l = ek0Var.l(i);
            boolean z = l instanceof dx6;
            long j5 = M;
            if (!z || andIncrement < qs.a.getLongVolatile(this, j5) || !ek0Var.k(i, l, bb0.g)) {
                while (true) {
                    Object l2 = ek0Var.l(i);
                    if (l2 instanceof dx6) {
                        if (andIncrement < qs.a.getLongVolatile(this, j5)) {
                            if (ek0Var.k(i, l2, new ex6((dx6) l2))) {
                                break loop0;
                            }
                        } else if (ek0Var.k(i, l2, bb0.g)) {
                            if (J(l2, ek0Var, i)) {
                                ek0Var.o(i, bb0.d);
                                break;
                            } else {
                                ek0Var.o(i, bb0.j);
                                ek0Var.i();
                            }
                        }
                    } else if (l2 != bb0.j) {
                        if (l2 == null) {
                            if (ek0Var.k(i, l2, bb0.e)) {
                                break loop0;
                            }
                        } else if (l2 == bb0.d || l2 == bb0.h || l2 == bb0.i || l2 == bb0.k || l2 == bb0.l) {
                            break loop0;
                        } else if (l2 != bb0.f) {
                            v71.g(l2, "Unexpected cell state: ");
                            return;
                        }
                    } else {
                        break;
                    }
                }
            } else if (J(l, ek0Var, i)) {
                ek0Var.o(i, bb0.d);
                break;
            } else {
                ek0Var.o(i, bb0.j);
                ek0Var.i();
                v(1L);
            }
        }
        v(1L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c4, code lost:
    
        if (r8.f() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c6, code lost:
    
        r8.e();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ek0 n(long r16, defpackage.ek0 r18) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.za0.n(long, ek0):ek0");
    }

    public final ek0 o(long j, ek0 ek0Var) {
        Object a;
        ek0 ek0Var2;
        long j2;
        Unsafe unsafe;
        za0 za0Var = this;
        ek0 ek0Var3 = bb0.a;
        ab0 ab0Var = ab0.x;
        loop0: while (true) {
            a = iv0.a(ek0Var, j, ab0Var);
            if (!iv.F(a)) {
                ag5 B2 = iv.B(a);
                while (true) {
                    Unsafe unsafe2 = qs.a;
                    long j3 = N;
                    ag5 ag5Var = (ag5) unsafe2.getObjectVolatile(za0Var, j3);
                    if (ag5Var.A >= B2.A) {
                        break loop0;
                    }
                    if (!B2.j()) {
                        break;
                    }
                    do {
                        unsafe = qs.a;
                        if (unsafe.compareAndSwapObject(za0Var, N, ag5Var, B2)) {
                            if (ag5Var.f()) {
                                ag5Var.e();
                            }
                        }
                    } while (unsafe.getObjectVolatile(za0Var, j3) == ag5Var);
                    if (B2.f()) {
                        B2.e();
                    }
                }
            } else {
                break;
            }
        }
        ek0 ek0Var4 = null;
        if (iv.F(a)) {
            za0Var.z();
            if (ek0Var.A * bb0.b >= za0Var.s()) {
                return null;
            }
            ek0Var.b();
            return null;
        }
        ek0 ek0Var5 = (ek0) iv.B(a);
        long j4 = ek0Var5.A;
        if (j4 > j) {
            long j5 = j4 * bb0.b;
            while (true) {
                Unsafe unsafe3 = qs.a;
                long j6 = O;
                long longVolatile = unsafe3.getLongVolatile(za0Var, j6);
                long j7 = 1152921504606846975L & longVolatile;
                if (j7 >= j5) {
                    ek0Var2 = ek0Var4;
                    j2 = j4;
                    break;
                }
                ek0Var2 = ek0Var4;
                j2 = j4;
                if (unsafe3.compareAndSwapLong(za0Var, j6, longVolatile, j7 + (((int) (longVolatile >> 60)) << 60))) {
                    break;
                }
                za0Var = this;
                ek0Var4 = ek0Var2;
                j4 = j2;
            }
            if (j2 * bb0.b < s()) {
                ek0Var5.b();
                return ek0Var2;
            }
            return ek0Var2;
        }
        return ek0Var5;
    }

    public final long p() {
        return qs.a.getLongVolatile(this, H);
    }

    public final Throwable q() {
        return (Throwable) qs.a.getObjectVolatile(this, G);
    }

    public final Throwable r() {
        Throwable q = q();
        if (q == null) {
            return new NoSuchElementException("Channel was closed");
        }
        return q;
    }

    public final long s() {
        return qs.a.getLongVolatile(this, M);
    }

    public final Throwable t() {
        Throwable q = q();
        if (q == null) {
            return new IllegalStateException("Channel was closed");
        }
        return q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01b6, code lost:
    
        r3 = (defpackage.ek0) r3.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01bd, code lost:
    
        if (r3 != null) goto L94;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.za0.toString():java.lang.String");
    }

    public final long u() {
        return qs.a.getLongVolatile(this, O) & 1152921504606846975L;
    }

    public final void v(long j) {
        if ((D.addAndGet(this, j) & 4611686018427387904L) == 0) {
            return;
        }
        do {
        } while ((qs.a.getLongVolatile(this, K) & 4611686018427387904L) != 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x0185, code lost:
    
        defpackage.qs.a.compareAndSwapLong(r1, defpackage.za0.M, r5, 1 + r5);
        r1 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00c1, code lost:
    
        r0 = (defpackage.ek0) ((defpackage.jv0) defpackage.qs.a.getObjectVolatile(r0, defpackage.jv0.y));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean x(long r18, boolean r20) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.za0.x(long, boolean):boolean");
    }

    public final boolean y() {
        return x(qs.a.getLongVolatile(this, O), true);
    }

    public final boolean z() {
        return x(qs.a.getLongVolatile(this, O), false);
    }
}
