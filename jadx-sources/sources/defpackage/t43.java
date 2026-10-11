package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class t43 implements h43 {
    public static final /* synthetic */ long x;
    public static final /* synthetic */ long y;
    public static final /* synthetic */ int z = 0;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Unsafe unsafe = qs.a;
        y = unsafe.objectFieldOffset(t43.class.getDeclaredField("_state$volatile"));
        x = unsafe.objectFieldOffset(t43.class.getDeclaredField("_parentHandle$volatile"));
    }

    public t43(boolean z2) {
        et1 et1Var;
        if (z2) {
            et1Var = u43.g;
        } else {
            et1Var = u43.f;
        }
        this._state$volatile = et1Var;
    }

    public static ol0 U(jk3 jk3Var) {
        while (jk3Var.h()) {
            jk3Var = jk3Var.g();
        }
        while (true) {
            jk3Var = jk3Var.f();
            if (!jk3Var.h()) {
                if (jk3Var instanceof ol0) {
                    return (ol0) jk3Var;
                }
                if (jk3Var instanceof ha4) {
                    return null;
                }
            }
        }
    }

    public static String c0(Object obj) {
        if (obj instanceof o43) {
            o43 o43Var = (o43) obj;
            if (o43Var.d()) {
                return "Cancelling";
            }
            if (o43Var.e()) {
                return "Completing";
            }
            return "Active";
        }
        if (obj instanceof ox2) {
            if (((ox2) obj).isActive()) {
                return "Active";
            }
            return "New";
        }
        if (obj instanceof dr0) {
            return "Cancelled";
        }
        return "Completed";
    }

    @Override // defpackage.h43
    public final nl0 A(t43 t43Var) {
        t43 t43Var2;
        dr0 dr0Var;
        dr0 dr0Var2;
        ol0 ol0Var = new ol0(t43Var);
        ol0Var.A = this;
        loop0: while (true) {
            Object K = this.K();
            if (K instanceof et1) {
                et1 et1Var = (et1) K;
                if (et1Var.x) {
                    while (true) {
                        Unsafe unsafe = qs.a;
                        long j = y;
                        t43Var2 = this;
                        if (unsafe.compareAndSwapObject(t43Var2, j, K, ol0Var)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(t43Var2, j) != K) {
                            break;
                        }
                        this = t43Var2;
                    }
                } else {
                    t43Var2 = this;
                    t43Var2.Z(et1Var);
                }
                this = t43Var2;
            } else {
                t43Var2 = this;
                boolean z2 = K instanceof ox2;
                ma4 ma4Var = ma4.x;
                Throwable th = null;
                if (z2) {
                    ha4 a = ((ox2) K).a();
                    if (a == null) {
                        t43Var2.a0((k43) K);
                        this = t43Var2;
                    } else if (!a.b(ol0Var, 7)) {
                        boolean b = a.b(ol0Var, 3);
                        Object K2 = t43Var2.K();
                        if (K2 instanceof o43) {
                            th = ((o43) K2).c();
                        } else {
                            if (K2 instanceof dr0) {
                                dr0Var2 = (dr0) K2;
                            } else {
                                dr0Var2 = null;
                            }
                            if (dr0Var2 != null) {
                                th = dr0Var2.a;
                            }
                        }
                        ol0Var.k(th);
                        if (b) {
                            break loop0;
                        }
                        return ma4Var;
                    }
                } else {
                    Object K3 = t43Var2.K();
                    if (K3 instanceof dr0) {
                        dr0Var = (dr0) K3;
                    } else {
                        dr0Var = null;
                    }
                    if (dr0Var != null) {
                        th = dr0Var.a;
                    }
                    ol0Var.k(th);
                    return ma4Var;
                }
            }
        }
        return ol0Var;
    }

    public final ni5 B() {
        return new os(new q43(null, this), (byte) 3);
    }

    public final Object C() {
        Object K = K();
        if (!(K instanceof ox2)) {
            if (!(K instanceof dr0)) {
                return u43.a(K);
            }
            throw ((dr0) K).a;
        }
        ze0.m("This job has not completed yet");
        return null;
    }

    public final Throwable D(o43 o43Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (!o43Var.d()) {
                return null;
            }
            return new i43(v(), null, this);
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                obj = arrayList.get(i2);
                i2++;
                if (!(((Throwable) obj) instanceof CancellationException)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof qf6) {
            int size2 = arrayList.size();
            while (true) {
                if (i >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i);
                i++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof qf6)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean E() {
        return true;
    }

    public final zp2 F() {
        r43 r43Var = r43.x;
        wk6.j(3, r43Var);
        s43 s43Var = s43.x;
        wk6.j(3, s43Var);
        return new zp2(this, r43Var, s43Var, (Object) null);
    }

    @Override // defpackage.h43
    public final Object G(vz0 vz0Var) {
        Object K;
        pn6 pn6Var;
        do {
            K = K();
            boolean z2 = K instanceof ox2;
            pn6Var = pn6.a;
            if (!z2) {
                h98.o(vz0Var.getContext());
                return pn6Var;
            }
        } while (b0(K) < 0);
        qg0 qg0Var = new qg0(1, wc7.z(vz0Var));
        qg0Var.t();
        qg0Var.w(new kg0(h98.A(this, true, new g55(qg0Var)), (byte) 2));
        Object r = qg0Var.r();
        w11 w11Var = w11.x;
        if (r != w11Var) {
            r = pn6Var;
        }
        if (r == w11Var) {
            return r;
        }
        return pn6Var;
    }

    public boolean H() {
        return this instanceof zq0;
    }

    @Override // defpackage.h43
    public final CancellationException I() {
        Object K = K();
        CancellationException cancellationException = null;
        if (K instanceof o43) {
            Throwable c = ((o43) K).c();
            if (c != null) {
                String concat = getClass().getSimpleName().concat(" is cancelling");
                if (c instanceof CancellationException) {
                    cancellationException = (CancellationException) c;
                }
                if (cancellationException == null) {
                    return new i43(concat, c, this);
                }
                return cancellationException;
            }
            v71.g(this, "Job is still new or active: ");
            return null;
        }
        if (!(K instanceof ox2)) {
            if (K instanceof dr0) {
                Throwable th = ((dr0) K).a;
                if (th instanceof CancellationException) {
                    cancellationException = (CancellationException) th;
                }
                if (cancellationException == null) {
                    return new i43(v(), th, this);
                }
                return cancellationException;
            }
            return new i43(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        v71.g(this, "Job is still new or active: ");
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [jk3, ha4] */
    public final ha4 J(ox2 ox2Var) {
        ha4 a = ox2Var.a();
        if (a == null) {
            if (ox2Var instanceof et1) {
                return new jk3();
            }
            if (ox2Var instanceof k43) {
                a0((k43) ox2Var);
                return null;
            }
            v71.g(ox2Var, "State should have list: ");
            return null;
        }
        return a;
    }

    public final Object K() {
        return qs.a.getObjectVolatile(this, y);
    }

    public boolean L(Throwable th) {
        return false;
    }

    public final void N(h43 h43Var) {
        long j = x;
        ma4 ma4Var = ma4.x;
        if (h43Var == null) {
            qs.a.putObjectVolatile(this, j, ma4Var);
            return;
        }
        h43Var.start();
        nl0 A = h43Var.A(this);
        Unsafe unsafe = qs.a;
        unsafe.putObjectVolatile(this, j, A);
        if (k0()) {
            A.dispose();
            unsafe.putObjectVolatile(this, j, ma4Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006f, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ei1 O(boolean r7, defpackage.k43 r8) {
        /*
            r6 = this;
            r8.A = r6
        L2:
            java.lang.Object r4 = r6.K()
            boolean r0 = r4 instanceof defpackage.et1
            if (r0 == 0) goto L2e
            r0 = r4
            et1 r0 = (defpackage.et1) r0
            boolean r1 = r0.x
            if (r1 == 0) goto L28
        L11:
            sun.misc.Unsafe r0 = defpackage.qs.a
            long r2 = defpackage.t43.y
            r1 = r6
            r5 = r8
            boolean r6 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r6 == 0) goto L1e
            goto L6f
        L1e:
            java.lang.Object r6 = r0.getObjectVolatile(r1, r2)
            if (r6 == r4) goto L25
            goto L70
        L25:
            r6 = r1
            r8 = r5
            goto L11
        L28:
            r1 = r6
            r5 = r8
            r1.Z(r0)
            goto L70
        L2e:
            r1 = r6
            r5 = r8
            boolean r6 = r4 instanceof defpackage.ox2
            ma4 r8 = defpackage.ma4.x
            r0 = 0
            if (r6 == 0) goto L73
            r6 = r4
            ox2 r6 = (defpackage.ox2) r6
            ha4 r2 = r6.a()
            if (r2 != 0) goto L46
            k43 r4 = (defpackage.k43) r4
            r1.a0(r4)
            goto L70
        L46:
            boolean r3 = r5.j()
            if (r3 == 0) goto L68
            boolean r3 = r6 instanceof defpackage.o43
            if (r3 == 0) goto L53
            o43 r6 = (defpackage.o43) r6
            goto L54
        L53:
            r6 = r0
        L54:
            if (r6 == 0) goto L5a
            java.lang.Throwable r0 = r6.c()
        L5a:
            if (r0 != 0) goto L62
            r6 = 5
            boolean r6 = r2.b(r5, r6)
            goto L6d
        L62:
            if (r7 == 0) goto L88
            r5.k(r0)
            return r8
        L68:
            r6 = 1
            boolean r6 = r2.b(r5, r6)
        L6d:
            if (r6 == 0) goto L70
        L6f:
            return r5
        L70:
            r6 = r1
            r8 = r5
            goto L2
        L73:
            if (r7 == 0) goto L88
            java.lang.Object r6 = r1.K()
            boolean r7 = r6 instanceof defpackage.dr0
            if (r7 == 0) goto L80
            dr0 r6 = (defpackage.dr0) r6
            goto L81
        L80:
            r6 = r0
        L81:
            if (r6 == 0) goto L85
            java.lang.Throwable r0 = r6.a
        L85:
            r5.k(r0)
        L88:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t43.O(boolean, k43):ei1");
    }

    public boolean P() {
        return this instanceof a70;
    }

    public final boolean Q(Object obj) {
        Object e0;
        do {
            e0 = e0(K(), obj);
            if (e0 == u43.a) {
                return false;
            }
            if (e0 == u43.b) {
                return true;
            }
        } while (e0 == u43.c);
        m(e0);
        return true;
    }

    public final Object R(Object obj) {
        Object e0;
        dr0 dr0Var;
        do {
            e0 = e0(K(), obj);
            if (e0 == u43.a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th = null;
                if (obj instanceof dr0) {
                    dr0Var = (dr0) obj;
                } else {
                    dr0Var = null;
                }
                if (dr0Var != null) {
                    th = dr0Var.a;
                }
                throw new IllegalStateException(str, th);
            }
        } while (e0 == u43.c);
        return e0;
    }

    public String S() {
        return getClass().getSimpleName();
    }

    public final void V(ha4 ha4Var, Throwable th) {
        W(th);
        ha4Var.b(new ci3(4), 4);
        Object e = ha4Var.e();
        e.getClass();
        er0 er0Var = null;
        for (jk3 jk3Var = (jk3) e; !jk3Var.equals(ha4Var); jk3Var = jk3Var.f()) {
            if ((jk3Var instanceof k43) && ((k43) jk3Var).j()) {
                try {
                    ((k43) jk3Var).k(th);
                } catch (Throwable th2) {
                    if (er0Var != null) {
                        n03.i(er0Var, th2);
                    } else {
                        er0Var = new er0("Exception in completion handler " + jk3Var + " for " + this, th2, (byte) 0);
                    }
                }
            }
        }
        if (er0Var != null) {
            M(er0Var);
        }
        u(th);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [jk3, ha4] */
    public final void Z(et1 et1Var) {
        nx2 nx2Var;
        ?? jk3Var = new jk3();
        if (et1Var.x) {
            nx2Var = jk3Var;
        } else {
            nx2Var = new nx2(jk3Var);
        }
        while (true) {
            Unsafe unsafe = qs.a;
            long j = y;
            t43 t43Var = this;
            et1 et1Var2 = et1Var;
            if (unsafe.compareAndSwapObject(t43Var, j, et1Var2, nx2Var) || unsafe.getObjectVolatile(t43Var, j) != et1Var2) {
                return;
            }
            this = t43Var;
            et1Var = et1Var2;
        }
    }

    public final void a0(k43 k43Var) {
        k43 k43Var2;
        t43 t43Var;
        jk3 jk3Var = new jk3();
        Unsafe unsafe = qs.a;
        unsafe.putObjectVolatile(jk3Var, jk3.y, k43Var);
        long j = jk3.x;
        unsafe.putObjectVolatile(jk3Var, j, k43Var);
        loop0: while (true) {
            if (k43Var.e() != k43Var) {
                k43Var2 = k43Var;
                break;
            }
            while (true) {
                Unsafe unsafe2 = qs.a;
                k43Var2 = k43Var;
                if (unsafe2.compareAndSwapObject(k43Var2, jk3.x, k43Var, jk3Var)) {
                    jk3Var.d(k43Var2);
                    break loop0;
                }
                t43Var = this;
                k43Var = k43Var2;
                if (unsafe2.getObjectVolatile(k43Var2, j) != k43Var2) {
                    break;
                } else {
                    this = t43Var;
                }
            }
            this = t43Var;
        }
        jk3 f = k43Var2.f();
        while (true) {
            Unsafe unsafe3 = qs.a;
            long j2 = y;
            t43 t43Var2 = this;
            if (unsafe3.compareAndSwapObject(t43Var2, j2, k43Var2, f) || unsafe3.getObjectVolatile(t43Var2, j2) != k43Var2) {
                return;
            } else {
                this = t43Var2;
            }
        }
    }

    public final int b0(Object obj) {
        Unsafe unsafe;
        boolean z2 = obj instanceof et1;
        long j = y;
        if (z2) {
            if (((et1) obj).x) {
                return 0;
            }
            while (true) {
                Unsafe unsafe2 = qs.a;
                t43 t43Var = this;
                Object obj2 = obj;
                if (unsafe2.compareAndSwapObject(t43Var, y, obj2, u43.g)) {
                    t43Var.Y();
                    return 1;
                }
                if (unsafe2.getObjectVolatile(t43Var, j) == obj2) {
                    this = t43Var;
                    obj = obj2;
                } else {
                    return -1;
                }
            }
        } else {
            t43 t43Var2 = this;
            Object obj3 = obj;
            if (obj3 instanceof nx2) {
                ha4 ha4Var = ((nx2) obj3).x;
                do {
                    t43 t43Var3 = t43Var2;
                    unsafe = qs.a;
                    Object obj4 = obj3;
                    boolean compareAndSwapObject = unsafe.compareAndSwapObject(t43Var3, y, obj4, ha4Var);
                    t43Var2 = t43Var3;
                    obj3 = obj4;
                    if (compareAndSwapObject) {
                        t43Var2.Y();
                        return 1;
                    }
                } while (unsafe.getObjectVolatile(t43Var2, j) == obj3);
                return -1;
            }
            return 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
    
        if (r5 != r4) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
    
        r0 = defpackage.qs.a;
        r2 = defpackage.t43.y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0086, code lost:
    
        if (r0.compareAndSwapObject(r9, r2, r4, r5) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008d, code lost:
    
        if (r0.getObjectVolatile(r9, r2) == r4) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008f, code lost:
    
        r0 = defpackage.u43.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0092, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0093, code lost:
    
        r0 = r5.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0099, code lost:
    
        if ((r11 instanceof defpackage.dr0) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009b, code lost:
    
        r2 = (defpackage.dr0) r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a0, code lost:
    
        if (r2 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a2, code lost:
    
        r5.b(r2.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a7, code lost:
    
        r2 = r5.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ab, code lost:
    
        if (r0 != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ad, code lost:
    
        r6 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00af, code lost:
    
        if (r6 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b1, code lost:
    
        V(r7, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b4, code lost:
    
        r0 = U(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b8, code lost:
    
        if (r0 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00be, code lost:
    
        if (f0(r5, r0, r11) == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c2, code lost:
    
        return defpackage.u43.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c3, code lost:
    
        r7.b(new defpackage.ci3(2), 2);
        r0 = U(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d0, code lost:
    
        if (r0 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d6, code lost:
    
        if (f0(r5, r0, r11) == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00da, code lost:
    
        return defpackage.u43.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00df, code lost:
    
        return z(r5, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x009f, code lost:
    
        r2 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e0(java.lang.Object r10, java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t43.e0(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final boolean f0(o43 o43Var, ol0 ol0Var, Object obj) {
        while (h98.A(ol0Var.B, false, new n43(this, o43Var, ol0Var, obj)) == ma4.x) {
            ol0Var = U(ol0Var);
            if (ol0Var == null) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.l11
    public final Object fold(Object obj, ic2 ic2Var) {
        return ic2Var.invoke(obj, this);
    }

    @Override // defpackage.l11
    public final j11 get(k11 k11Var) {
        return tl7.u(this, k11Var);
    }

    @Override // defpackage.j11
    public final k11 getKey() {
        return h95.F;
    }

    @Override // defpackage.h43
    public boolean isActive() {
        Object K = K();
        if ((K instanceof ox2) && ((ox2) K).isActive()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.h43
    public final boolean isCancelled() {
        Object K = K();
        if (!(K instanceof dr0)) {
            if (!(K instanceof o43) || !((o43) K).d()) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // defpackage.h43
    public final boolean k0() {
        return !(K() instanceof ox2);
    }

    @Override // defpackage.h43
    public void l(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new i43(v(), null, this);
        }
        s(cancellationException);
    }

    @Override // defpackage.h43
    public final ei1 l0(ub2 ub2Var) {
        return O(true, new k33(ub2Var));
    }

    @Override // defpackage.l11
    public final l11 minusKey(k11 k11Var) {
        return tl7.B(this, k11Var);
    }

    public void n(Object obj) {
        m(obj);
    }

    public final Object o(vz0 vz0Var) {
        Object K;
        do {
            K = K();
            if (!(K instanceof ox2)) {
                if (!(K instanceof dr0)) {
                    return u43.a(K);
                }
                throw ((dr0) K).a;
            }
        } while (b0(K) < 0);
        m43 m43Var = new m43(wc7.z(vz0Var), this);
        m43Var.t();
        m43Var.w(new kg0(h98.A(this, true, new f55(m43Var)), (byte) 2));
        return m43Var.r();
    }

    public Object p(xz0 xz0Var) {
        return o(xz0Var);
    }

    @Override // defpackage.l11
    public final l11 plus(l11 l11Var) {
        return tl7.L(this, l11Var);
    }

    public Object q() {
        return C();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        r0 = defpackage.u43.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r0 != defpackage.u43.b) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00f7, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        r0 = e0(r0, new defpackage.dr0(y(r13), false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r0 == defpackage.u43.c) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        if (r0 != defpackage.u43.a) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:
    
        r0 = null;
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
    
        r4 = r12.K();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        if ((r4 instanceof defpackage.o43) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0094, code lost:
    
        if ((r4 instanceof defpackage.ox2) == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
    
        if (r1 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0098, code lost:
    
        r1 = r12.y(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009c, code lost:
    
        r9 = (defpackage.ox2) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0008, code lost:
    
        if (H() != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a3, code lost:
    
        if (r9.isActive() == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a5, code lost:
    
        r11 = r12.J(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a9, code lost:
    
        if (r11 != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ab, code lost:
    
        r6 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e0, code lost:
    
        r12 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ad, code lost:
    
        r10 = new defpackage.o43(r11, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b2, code lost:
    
        r5 = defpackage.qs.a;
        r7 = defpackage.t43.y;
        r6 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bb, code lost:
    
        if (r5.compareAndSwapObject(r6, r7, r9, r10) == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        r0 = K();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c8, code lost:
    
        if (r5.getObjectVolatile(r6, r7) == r9) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cb, code lost:
    
        r12 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bd, code lost:
    
        r6.V(r11, r1);
        r12 = defpackage.u43.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c2, code lost:
    
        r0 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f0, code lost:
    
        if (r0 != defpackage.u43.a) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f5, code lost:
    
        if (r0 != defpackage.u43.b) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if ((r0 instanceof defpackage.ox2) == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00fa, code lost:
    
        if (r0 != defpackage.u43.d) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00fc, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fd, code lost:
    
        r6.m(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0100, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00cd, code lost:
    
        r6 = r12;
        r12 = r6.e0(r4, new defpackage.dr0(r1, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d9, code lost:
    
        if (r12 == defpackage.u43.a) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00dd, code lost:
    
        if (r12 == defpackage.u43.c) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e3, code lost:
    
        defpackage.v71.g(r4, "Cannot happen in ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e8, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00e9, code lost:
    
        r6 = r12;
        r12 = defpackage.u43.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0048, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if ((r0 instanceof defpackage.o43) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0056, code lost:
    
        if (defpackage.qs.a.getObjectVolatile((defpackage.o43) r4, defpackage.o43.y) != defpackage.u43.e) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0058, code lost:
    
        r13 = defpackage.u43.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x005a, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x005b, code lost:
    
        r6 = r12;
        r0 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0062, code lost:
    
        r5 = ((defpackage.o43) r4).d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0069, code lost:
    
        if (r13 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x006b, code lost:
    
        if (r5 != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0079, code lost:
    
        r13 = ((defpackage.o43) r4).c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0080, code lost:
    
        if (r5 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0082, code lost:
    
        r0 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0083, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0084, code lost:
    
        if (r0 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0086, code lost:
    
        r12.V(((defpackage.o43) r4).x, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x008d, code lost:
    
        r13 = defpackage.u43.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x006d, code lost:
    
        if (r1 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x006f, code lost:
    
        r1 = r12.y(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0073, code lost:
    
        ((defpackage.o43) r4).b(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (((defpackage.o43) r0).e() == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00ed, code lost:
    
        r6 = r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean r(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t43.r(java.lang.Object):boolean");
    }

    public void s(Throwable th) {
        r(th);
    }

    @Override // defpackage.h43
    public final boolean start() {
        int b0;
        do {
            b0 = b0(K());
            if (b0 == 0) {
                return false;
            }
        } while (b0 != 1);
        return true;
    }

    @Override // defpackage.h43
    public final ei1 t(boolean z2, boolean z3, ub2 ub2Var) {
        k43 k33Var;
        if (z2) {
            k33Var = new j33(ub2Var);
        } else {
            k33Var = new k33(ub2Var);
        }
        return O(z3, k33Var);
    }

    public final String toString() {
        return (S() + '{' + c0(K()) + '}') + '@' + z51.t(this);
    }

    public final boolean u(Throwable th) {
        if (!P()) {
            boolean z2 = th instanceof CancellationException;
            nl0 nl0Var = (nl0) qs.a.getObjectVolatile(this, x);
            if (nl0Var != null && nl0Var != ma4.x) {
                if (!nl0Var.l(th) && !z2) {
                    return false;
                }
                return true;
            }
            return z2;
        }
        return true;
    }

    public String v() {
        return "Job was cancelled";
    }

    public boolean w(Throwable th) {
        if (!(th instanceof CancellationException)) {
            if (r(th) && E()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void x(ox2 ox2Var, Object obj) {
        dr0 dr0Var;
        Throwable th;
        Unsafe unsafe = qs.a;
        long j = x;
        nl0 nl0Var = (nl0) unsafe.getObjectVolatile(this, j);
        if (nl0Var != null) {
            nl0Var.dispose();
            unsafe.putObjectVolatile(this, j, ma4.x);
        }
        er0 er0Var = null;
        if (obj instanceof dr0) {
            dr0Var = (dr0) obj;
        } else {
            dr0Var = null;
        }
        if (dr0Var != null) {
            th = dr0Var.a;
        } else {
            th = null;
        }
        if (ox2Var instanceof k43) {
            try {
                ((k43) ox2Var).k(th);
                return;
            } catch (Throwable th2) {
                M(new er0("Exception in completion handler " + ox2Var + " for " + this, th2, (byte) 0));
                return;
            }
        }
        ha4 a = ox2Var.a();
        if (a != null) {
            a.b(new ci3(1), 1);
            Object e = a.e();
            e.getClass();
            for (jk3 jk3Var = (jk3) e; !jk3Var.equals(a); jk3Var = jk3Var.f()) {
                if (jk3Var instanceof k43) {
                    try {
                        ((k43) jk3Var).k(th);
                    } catch (Throwable th3) {
                        if (er0Var != null) {
                            n03.i(er0Var, th3);
                        } else {
                            er0Var = new er0("Exception in completion handler " + jk3Var + " for " + this, th3, (byte) 0);
                        }
                    }
                }
            }
            if (er0Var != null) {
                M(er0Var);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Throwable] */
    public final Throwable y(Object obj) {
        boolean z2;
        CancellationException cancellationException;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = obj instanceof Throwable;
        }
        CancellationException cancellationException2 = null;
        if (z2) {
            Throwable th = (Throwable) obj;
            if (th == null) {
                return new i43(v(), null, this);
            }
            return th;
        }
        obj.getClass();
        t43 t43Var = (t43) obj;
        Object K = t43Var.K();
        if (K instanceof o43) {
            cancellationException = ((o43) K).c();
        } else if (K instanceof dr0) {
            cancellationException = ((dr0) K).a;
        } else if (!(K instanceof ox2)) {
            cancellationException = null;
        } else {
            v71.g(K, "Cannot be cancelling child in this state: ");
            return null;
        }
        if (cancellationException instanceof CancellationException) {
            cancellationException2 = cancellationException;
        }
        if (cancellationException2 == null) {
            return new i43("Parent job is ".concat(c0(K)), cancellationException, t43Var);
        }
        return cancellationException2;
    }

    public final Object z(o43 o43Var, Object obj) {
        dr0 dr0Var;
        o43 o43Var2;
        Throwable th;
        boolean d;
        Throwable D;
        Object obj2;
        t43 t43Var;
        o43 o43Var3;
        Throwable th2 = null;
        if (obj instanceof dr0) {
            dr0Var = (dr0) obj;
        } else {
            dr0Var = null;
        }
        if (dr0Var != null) {
            th2 = dr0Var.a;
        }
        synchronized (o43Var) {
            try {
                d = o43Var.d();
                ArrayList f = o43Var.f(th2);
                D = D(o43Var, f);
                if (D != null) {
                    try {
                        if (f.size() > 1) {
                            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(f.size()));
                            int size = f.size();
                            int i = 0;
                            while (i < size) {
                                Object obj3 = f.get(i);
                                i++;
                                Throwable th3 = (Throwable) obj3;
                                if (th3 != D && th3 != D && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                                    n03.i(D, th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        o43Var2 = o43Var;
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                o43Var2 = o43Var;
                th = th5;
            }
        }
        if (D != null && D != th2) {
            obj = new dr0(D, false);
        }
        if (D != null && (u(D) || L(D))) {
            obj.getClass();
            qs.a.compareAndSwapInt((dr0) obj, dr0.b, 0, 1);
        }
        if (!d) {
            W(D);
        }
        X(obj);
        if (obj instanceof ox2) {
            obj2 = new px2((ox2) obj);
        } else {
            obj2 = obj;
        }
        while (true) {
            Unsafe unsafe = qs.a;
            long j = y;
            t43Var = this;
            o43Var3 = o43Var;
            if (!unsafe.compareAndSwapObject(t43Var, j, o43Var3, obj2) && unsafe.getObjectVolatile(t43Var, j) == o43Var3) {
                this = t43Var;
                o43Var = o43Var3;
            }
        }
        t43Var.x(o43Var3, obj);
        return obj;
    }

    public void Y() {
    }

    public void M(er0 er0Var) {
        throw er0Var;
    }

    public void W(Throwable th) {
    }

    public void X(Object obj) {
    }

    public void m(Object obj) {
    }
}
