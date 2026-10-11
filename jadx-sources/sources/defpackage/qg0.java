package defpackage;

import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public class qg0 extends mh1 implements pg0, x11, dx6 {
    public static final /* synthetic */ long C;
    public static final /* synthetic */ long D;
    public static final /* synthetic */ long E;
    public final vz0 A;
    public final l11 B;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Unsafe unsafe = qs.a;
        C = unsafe.objectFieldOffset(qg0.class.getDeclaredField("_decisionAndIndex$volatile"));
        E = unsafe.objectFieldOffset(qg0.class.getDeclaredField("_state$volatile"));
        D = unsafe.objectFieldOffset(qg0.class.getDeclaredField("_parentHandle$volatile"));
    }

    public qg0(int i, vz0 vz0Var) {
        super(i);
        this.A = vz0Var;
        this.B = vz0Var.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = t4.x;
    }

    public static Object D(wa4 wa4Var, Object obj, int i, jc2 jc2Var) {
        lg0 lg0Var;
        if (obj instanceof dr0) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (jc2Var == null && !(wa4Var instanceof lg0)) {
            return obj;
        }
        if (wa4Var instanceof lg0) {
            lg0Var = (lg0) wa4Var;
        } else {
            lg0Var = null;
        }
        return new br0(obj, lg0Var, jc2Var, (Throwable) null, 16);
    }

    public static void y(wa4 wa4Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + wa4Var + ", already has " + obj).toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if (r2 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        r9.o();
        r9.a(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A() {
        /*
            r10 = this;
            vz0 r0 = r10.A
            boolean r1 = r0 instanceof defpackage.jh1
            r2 = 0
            if (r1 == 0) goto Lb
            jh1 r0 = (defpackage.jh1) r0
            r4 = r0
            goto Lc
        Lb:
            r4 = r2
        Lc:
            if (r4 == 0) goto L63
            long r0 = defpackage.jh1.E
        L10:
            sun.misc.Unsafe r3 = defpackage.qs.a
            java.lang.Object r7 = r3.getObjectVolatile(r4, r0)
            r3 = r7
            ni1 r7 = defpackage.kh1.b
            if (r3 != r7) goto L32
        L1b:
            sun.misc.Unsafe r3 = defpackage.qs.a
            long r5 = defpackage.jh1.E
            r8 = r10
            boolean r10 = r3.compareAndSwapObject(r4, r5, r7, r8)
            r9 = r8
            if (r10 == 0) goto L28
            goto L46
        L28:
            java.lang.Object r10 = r3.getObjectVolatile(r4, r0)
            if (r10 == r7) goto L30
            r10 = r9
            goto L10
        L30:
            r10 = r9
            goto L1b
        L32:
            r9 = r10
            boolean r10 = r3 instanceof java.lang.Throwable
            if (r10 == 0) goto L5d
            r7 = r3
        L38:
            sun.misc.Unsafe r3 = defpackage.qs.a
            long r5 = defpackage.jh1.E
            r8 = 0
            boolean r10 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r10 == 0) goto L50
            r2 = r7
            java.lang.Throwable r2 = (java.lang.Throwable) r2
        L46:
            if (r2 != 0) goto L49
            goto L63
        L49:
            r9.o()
            r9.a(r2)
            return
        L50:
            java.lang.Object r10 = r3.getObjectVolatile(r4, r0)
            if (r10 != r7) goto L57
            goto L38
        L57:
            java.lang.String r10 = "Failed requirement."
            defpackage.ze0.k(r10)
            return
        L5d:
            r7 = r3
            java.lang.String r10 = "Inconsistent state "
            defpackage.v71.g(r7, r10)
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qg0.A():void");
    }

    public final void B(Object obj, int i, jc2 jc2Var) {
        qg0 qg0Var;
        while (true) {
            Unsafe unsafe = qs.a;
            long j = E;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof wa4) {
                Object D2 = D((wa4) objectVolatile, obj, i, jc2Var);
                while (true) {
                    Unsafe unsafe2 = qs.a;
                    qg0Var = this;
                    if (unsafe2.compareAndSwapObject(qg0Var, E, objectVolatile, D2)) {
                        if (!qg0Var.x()) {
                            qg0Var.o();
                        }
                        qg0Var.p(i);
                        return;
                    } else if (unsafe2.getObjectVolatile(qg0Var, j) != objectVolatile) {
                        break;
                    } else {
                        this = qg0Var;
                    }
                }
            } else {
                qg0 qg0Var2 = this;
                if (objectVolatile instanceof tg0) {
                    tg0 tg0Var = (tg0) objectVolatile;
                    if (unsafe.compareAndSwapInt(tg0Var, tg0.c, 0, 1)) {
                        if (jc2Var != null) {
                            qg0Var2.m(jc2Var, tg0Var.a, obj);
                            return;
                        }
                        return;
                    }
                }
                v71.g(obj, "Already resumed, but proposed with update ");
                return;
            }
            this = qg0Var;
        }
    }

    public final void C(n11 n11Var) {
        jh1 jh1Var;
        n11 n11Var2;
        int i;
        vz0 vz0Var = this.A;
        if (vz0Var instanceof jh1) {
            jh1Var = (jh1) vz0Var;
        } else {
            jh1Var = null;
        }
        if (jh1Var != null) {
            n11Var2 = jh1Var.A;
        } else {
            n11Var2 = null;
        }
        if (n11Var2 == n11Var) {
            i = 4;
        } else {
            i = this.z;
        }
        B(pn6.a, i, null);
    }

    public final ni1 E(Object obj, jc2 jc2Var) {
        qg0 qg0Var;
        while (true) {
            Unsafe unsafe = qs.a;
            long j = E;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof wa4) {
                Object D2 = D((wa4) objectVolatile, obj, this.z, jc2Var);
                while (true) {
                    Unsafe unsafe2 = qs.a;
                    qg0Var = this;
                    if (unsafe2.compareAndSwapObject(qg0Var, E, objectVolatile, D2)) {
                        boolean x = qg0Var.x();
                        ni1 ni1Var = rg0.a;
                        if (!x) {
                            qg0Var.o();
                        }
                        return ni1Var;
                    }
                    if (unsafe2.getObjectVolatile(qg0Var, j) != objectVolatile) {
                        break;
                    }
                    this = qg0Var;
                }
            } else {
                return null;
            }
            this = qg0Var;
        }
    }

    @Override // defpackage.pg0
    public final boolean a(Throwable th) {
        Throwable th2;
        qg0 qg0Var;
        while (true) {
            Unsafe unsafe = qs.a;
            long j = E;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            boolean z = false;
            if (!(objectVolatile instanceof wa4)) {
                return false;
            }
            if ((objectVolatile instanceof lg0) || (objectVolatile instanceof ag5)) {
                z = true;
            }
            if (th == null) {
                th2 = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                th2 = th;
            }
            dr0 dr0Var = new dr0(th2, z);
            while (true) {
                Unsafe unsafe2 = qs.a;
                qg0Var = this;
                if (unsafe2.compareAndSwapObject(qg0Var, E, objectVolatile, dr0Var)) {
                    wa4 wa4Var = (wa4) objectVolatile;
                    if (wa4Var instanceof lg0) {
                        qg0Var.l((lg0) objectVolatile, th);
                    } else if (wa4Var instanceof ag5) {
                        qg0Var.n((ag5) objectVolatile, th);
                    }
                    if (!qg0Var.x()) {
                        qg0Var.o();
                    }
                    qg0Var.p(qg0Var.z);
                    return true;
                }
                if (unsafe2.getObjectVolatile(qg0Var, j) != objectVolatile) {
                    break;
                }
                this = qg0Var;
            }
            this = qg0Var;
        }
    }

    @Override // defpackage.dx6
    public final void b(ag5 ag5Var, int i) {
        while (true) {
            Unsafe unsafe = qs.a;
            long j = C;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if ((intVolatile & 536870911) == 536870911) {
                qg0 qg0Var = this;
                if (unsafe.compareAndSwapInt(qg0Var, j, intVolatile, ((intVolatile >> 29) << 29) + i)) {
                    qg0Var.w(ag5Var);
                    return;
                }
                this = qg0Var;
            } else {
                ze0.m("invokeOnCancellation should be called at most once");
                return;
            }
        }
    }

    @Override // defpackage.pg0
    public final ni1 c(Object obj, jc2 jc2Var) {
        return E(obj, jc2Var);
    }

    @Override // defpackage.mh1
    public final void d(CancellationException cancellationException) {
        CancellationException cancellationException2;
        qg0 qg0Var;
        while (true) {
            Unsafe unsafe = qs.a;
            long j = E;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof wa4)) {
                if (!(objectVolatile instanceof dr0)) {
                    if (objectVolatile instanceof br0) {
                        br0 br0Var = (br0) objectVolatile;
                        if (br0Var.e == null) {
                            br0 a = br0.a(br0Var, null, cancellationException, 15);
                            while (true) {
                                Unsafe unsafe2 = qs.a;
                                qg0 qg0Var2 = this;
                                if (unsafe2.compareAndSwapObject(qg0Var2, E, objectVolatile, a)) {
                                    lg0 lg0Var = br0Var.b;
                                    if (lg0Var != null) {
                                        qg0Var2.l(lg0Var, cancellationException);
                                    }
                                    jc2 jc2Var = br0Var.c;
                                    if (jc2Var != null) {
                                        qg0Var2.m(jc2Var, cancellationException, br0Var.a);
                                        return;
                                    }
                                    return;
                                }
                                if (unsafe2.getObjectVolatile(qg0Var2, j) != objectVolatile) {
                                    cancellationException2 = cancellationException;
                                    qg0Var = qg0Var2;
                                    break;
                                }
                                this = qg0Var2;
                            }
                        } else {
                            ze0.m("Must be called at most once");
                            return;
                        }
                    } else {
                        qg0 qg0Var3 = this;
                        CancellationException cancellationException3 = cancellationException;
                        br0 br0Var2 = new br0(objectVolatile, (lg0) null, (jc2) null, cancellationException3, 14);
                        cancellationException2 = cancellationException3;
                        while (true) {
                            br0 br0Var3 = br0Var2;
                            Unsafe unsafe3 = qs.a;
                            qg0Var = qg0Var3;
                            boolean compareAndSwapObject = unsafe3.compareAndSwapObject(qg0Var, E, objectVolatile, br0Var3);
                            br0Var2 = br0Var3;
                            if (compareAndSwapObject) {
                                return;
                            }
                            if (unsafe3.getObjectVolatile(qg0Var, j) != objectVolatile) {
                                break;
                            } else {
                                qg0Var3 = qg0Var;
                            }
                        }
                    }
                    cancellationException = cancellationException2;
                    this = qg0Var;
                } else {
                    return;
                }
            } else {
                ze0.m("Not completed");
                return;
            }
        }
    }

    @Override // defpackage.mh1
    public final vz0 e() {
        return this.A;
    }

    @Override // defpackage.mh1
    public final Throwable f(Object obj) {
        Throwable f = super.f(obj);
        if (f != null) {
            return f;
        }
        return null;
    }

    @Override // defpackage.mh1
    public final Object g(Object obj) {
        if (obj instanceof br0) {
            return ((br0) obj).a;
        }
        return obj;
    }

    @Override // defpackage.x11
    public final x11 getCallerFrame() {
        vz0 vz0Var = this.A;
        if (vz0Var instanceof x11) {
            return (x11) vz0Var;
        }
        return null;
    }

    @Override // defpackage.vz0
    public final l11 getContext() {
        return this.B;
    }

    @Override // defpackage.pg0
    public final void h(Object obj, jc2 jc2Var) {
        B(obj, this.z, jc2Var);
    }

    @Override // defpackage.pg0
    public final boolean isActive() {
        return s() instanceof wa4;
    }

    @Override // defpackage.mh1
    public final Object j() {
        return s();
    }

    @Override // defpackage.pg0
    public final void k(Object obj) {
        p(this.z);
    }

    public final void l(lg0 lg0Var, Throwable th) {
        try {
            lg0Var.a(th);
        } catch (Throwable th2) {
            h98.z(this.B, new er0("Exception in invokeOnCancellation handler for " + this, th2, (byte) 0));
        }
    }

    public final void m(jc2 jc2Var, Throwable th, Object obj) {
        l11 l11Var = this.B;
        try {
            jc2Var.invoke(th, obj, l11Var);
        } catch (Throwable th2) {
            h98.z(l11Var, new er0("Exception in resume onCancellation handler for " + this, th2, (byte) 0));
        }
    }

    public final void n(ag5 ag5Var, Throwable th) {
        l11 l11Var = this.B;
        int intVolatile = qs.a.getIntVolatile(this, C) & 536870911;
        if (intVolatile != 536870911) {
            try {
                ag5Var.h(intVolatile, l11Var);
                return;
            } catch (Throwable th2) {
                h98.z(l11Var, new er0("Exception in invokeOnCancellation handler for " + this, th2, (byte) 0));
                return;
            }
        }
        ze0.m("The index for Segment.onCancellation(..) is broken");
    }

    public final void o() {
        Unsafe unsafe = qs.a;
        long j = D;
        ei1 ei1Var = (ei1) unsafe.getObjectVolatile(this, j);
        if (ei1Var == null) {
            return;
        }
        ei1Var.dispose();
        unsafe.putObjectVolatile(this, j, ma4.x);
    }

    public final void p(int i) {
        boolean z;
        boolean z2;
        while (true) {
            Unsafe unsafe = qs.a;
            long j = C;
            int intVolatile = unsafe.getIntVolatile(this, j);
            int i2 = intVolatile >> 29;
            if (i2 != 0) {
                if (i2 == 1) {
                    boolean z3 = false;
                    if (i == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    vz0 vz0Var = this.A;
                    if (!z && (vz0Var instanceof jh1)) {
                        if (i != 1 && i != 2) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        int i3 = this.z;
                        if (i3 == 1 || i3 == 2) {
                            z3 = true;
                        }
                        if (z2 == z3) {
                            jh1 jh1Var = (jh1) vz0Var;
                            n11 n11Var = jh1Var.A;
                            l11 context = jh1Var.B.getContext();
                            if (kh1.c(n11Var, context)) {
                                kh1.b(n11Var, context, this);
                                return;
                            }
                            mw1 a = me6.a();
                            if (a.y >= 4294967296L) {
                                a.z0(this);
                                return;
                            }
                            a.A0(true);
                            try {
                                zz.a0(this, vz0Var, true);
                                do {
                                } while (a.C0());
                            } finally {
                                try {
                                    return;
                                } finally {
                                }
                            }
                            return;
                        }
                    }
                    zz.a0(this, vz0Var, z);
                    return;
                }
                ze0.m("Already resumed");
                return;
            }
            qg0 qg0Var = this;
            if (unsafe.compareAndSwapInt(qg0Var, j, intVolatile, 1073741824 + (536870911 & intVolatile))) {
                return;
            } else {
                this = qg0Var;
            }
        }
    }

    public Throwable q(t43 t43Var) {
        return t43Var.I();
    }

    public final Object r() {
        h43 h43Var;
        boolean x = x();
        while (true) {
            Unsafe unsafe = qs.a;
            long j = C;
            int intVolatile = unsafe.getIntVolatile(this, j);
            int i = intVolatile >> 29;
            if (i != 0) {
                if (i == 2) {
                    if (x) {
                        this.A();
                    }
                    Object s = this.s();
                    if (!(s instanceof dr0)) {
                        int i2 = this.z;
                        if ((i2 == 1 || i2 == 2) && (h43Var = (h43) this.B.get(h95.F)) != null && !h43Var.isActive()) {
                            CancellationException I = h43Var.I();
                            this.d(I);
                            throw I;
                        }
                        return this.g(s);
                    }
                    throw ((dr0) s).a;
                }
                ze0.m("Already suspended");
                return null;
            }
            qg0 qg0Var = this;
            if (unsafe.compareAndSwapInt(qg0Var, j, intVolatile, 536870912 + (536870911 & intVolatile))) {
                if (((ei1) unsafe.getObjectVolatile(qg0Var, D)) == null) {
                    qg0Var.u();
                }
                if (x) {
                    qg0Var.A();
                }
                return w11.x;
            }
            this = qg0Var;
        }
    }

    @Override // defpackage.vz0
    public final void resumeWith(Object obj) {
        Throwable b = z45.b(obj);
        if (b != null) {
            obj = new dr0(b, false);
        }
        B(obj, this.z, null);
    }

    public final Object s() {
        return qs.a.getObjectVolatile(this, E);
    }

    public final void t() {
        ei1 u = u();
        if (u != null && !(s() instanceof wa4)) {
            u.dispose();
            qs.a.putObjectVolatile(this, D, ma4.x);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder(z());
        sb.append('(');
        sb.append(z51.T(this.A));
        sb.append("){");
        Object s = s();
        if (s instanceof wa4) {
            str = "Active";
        } else if (s instanceof tg0) {
            str = "Cancelled";
        } else {
            str = "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(z51.t(this));
        return sb.toString();
    }

    public final ei1 u() {
        h43 h43Var = (h43) this.B.get(h95.F);
        if (h43Var == null) {
            return null;
        }
        ei1 A = h98.A(h43Var, true, new ml0(this));
        while (true) {
            Unsafe unsafe = qs.a;
            long j = D;
            qg0 qg0Var = this;
            if (!unsafe.compareAndSwapObject(qg0Var, j, (Object) null, A) && unsafe.getObjectVolatile(qg0Var, j) == null) {
                this = qg0Var;
            }
        }
        return A;
    }

    public final void v(ub2 ub2Var) {
        w(new kg0(ub2Var, (byte) 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c6, code lost:
    
        y(r9, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c9, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(defpackage.wa4 r11) {
        /*
            Method dump skipped, instructions count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qg0.w(wa4):void");
    }

    public final boolean x() {
        if (this.z == 2) {
            if (qs.a.getObjectVolatile((jh1) this.A, jh1.E) != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public String z() {
        return "CancellableContinuation";
    }
}
