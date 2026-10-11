package p7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class k1 implements a1, p, q1 {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8709a = AtomicReferenceFieldUpdater.newUpdater(k1.class, Object.class, "_state");

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8710b = AtomicReferenceFieldUpdater.newUpdater(k1.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    public k1(boolean z9) {
        n0 n0Var;
        if (z9) {
            n0Var = l1.f8720g;
        } else {
            n0Var = l1.f8719f;
        }
        this._state = n0Var;
    }

    public static o K(t7.n nVar) {
        while (nVar.j()) {
            nVar = nVar.i();
        }
        while (true) {
            nVar = nVar.h();
            if (!nVar.j()) {
                if (nVar instanceof o) {
                    return (o) nVar;
                }
                if (nVar instanceof n1) {
                    return null;
                }
            }
        }
    }

    public static String Q(Object obj) {
        if (obj instanceof h1) {
            h1 h1Var = (h1) obj;
            if (h1Var.e()) {
                return "Cancelling";
            }
            if (h1Var.f()) {
                return "Completing";
            }
        } else if (obj instanceof x0) {
            if (!((x0) obj).a()) {
                return "New";
            }
        } else {
            if (obj instanceof t) {
                return "Cancelled";
            }
            return "Completed";
        }
        return "Active";
    }

    public final n1 A(x0 x0Var) {
        n1 d10 = x0Var.d();
        if (d10 == null) {
            if (x0Var instanceof n0) {
                return new n1();
            }
            if (x0Var instanceof e1) {
                O((e1) x0Var);
                return null;
            }
            throw new IllegalStateException(("State should have list: " + x0Var).toString());
        }
        return d10;
    }

    public final Object B() {
        while (true) {
            Object obj = f8709a.get(this);
            if (!(obj instanceof t7.t)) {
                return obj;
            }
            ((t7.t) obj).a(this);
        }
    }

    public boolean C(Throwable th) {
        return false;
    }

    public final void E(a1 a1Var) {
        int P;
        o1 o1Var = o1.f8727a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8710b;
        if (a1Var == null) {
            atomicReferenceFieldUpdater.set(this, o1Var);
            return;
        }
        k1 k1Var = (k1) a1Var;
        do {
            P = k1Var.P(k1Var.B());
            if (P == 0) {
                break;
            }
        } while (P != 1);
        n nVar = (n) com.bumptech.glide.c.C(k1Var, true, new o(this), 2);
        atomicReferenceFieldUpdater.set(this, nVar);
        if (!(B() instanceof x0)) {
            nVar.b();
            atomicReferenceFieldUpdater.set(this, o1Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [p7.w0] */
    public final k0 F(boolean z9, boolean z10, h7.l lVar) {
        e1 e1Var;
        boolean z11;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        t tVar;
        Throwable th;
        int i10 = 1;
        Throwable th2 = null;
        if (z9) {
            if (lVar instanceof c1) {
                e1Var = (c1) lVar;
            } else {
                e1Var = null;
            }
            if (e1Var == null) {
                e1Var = new z0(lVar);
            }
        } else {
            if (lVar instanceof e1) {
                e1Var = (e1) lVar;
            } else {
                e1Var = null;
            }
            if (e1Var == null) {
                e1Var = new m0(lVar, i10);
            }
        }
        e1Var.f8675d = this;
        while (true) {
            Object B = B();
            if (B instanceof n0) {
                n0 n0Var = (n0) B;
                if (n0Var.f8724a) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f8709a;
                    while (true) {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, B, e1Var)) {
                            z11 = true;
                            break;
                        }
                        if (atomicReferenceFieldUpdater2.get(this) != B) {
                            z11 = false;
                            break;
                        }
                    }
                    if (z11) {
                        return e1Var;
                    }
                } else {
                    n1 n1Var = new n1();
                    if (!n0Var.f8724a) {
                        n1Var = new w0(n1Var);
                    }
                    do {
                        atomicReferenceFieldUpdater = f8709a;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, n0Var, n1Var)) {
                            break;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == n0Var);
                }
            } else if (B instanceof x0) {
                n1 d10 = ((x0) B).d();
                if (d10 == null) {
                    r6.h0.r(B, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    O((e1) B);
                } else {
                    k0 k0Var = o1.f8727a;
                    if (z9 && (B instanceof h1)) {
                        synchronized (B) {
                            th = ((h1) B).c();
                            if (th == null || ((lVar instanceof o) && !((h1) B).f())) {
                                if (h(B, d10, e1Var)) {
                                    if (th == null) {
                                        return e1Var;
                                    }
                                    k0Var = e1Var;
                                }
                            }
                        }
                    } else {
                        th = null;
                    }
                    if (th != null) {
                        if (z10) {
                            lVar.invoke(th);
                        }
                        return k0Var;
                    }
                    if (h(B, d10, e1Var)) {
                        return e1Var;
                    }
                }
            } else {
                if (z10) {
                    if (B instanceof t) {
                        tVar = (t) B;
                    } else {
                        tVar = null;
                    }
                    if (tVar != null) {
                        th2 = tVar.f8743a;
                    }
                    lVar.invoke(th2);
                }
                return o1.f8727a;
            }
        }
    }

    public boolean G() {
        return false;
    }

    public final boolean H(Object obj) {
        Object R;
        do {
            R = R(B(), obj);
            if (R == l1.f8714a) {
                return false;
            }
            if (R == l1.f8715b) {
                return true;
            }
        } while (R == l1.f8716c);
        i(R);
        return true;
    }

    public final Object I(Object obj) {
        Object R;
        t tVar;
        do {
            R = R(B(), obj);
            if (R == l1.f8714a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th = null;
                if (obj instanceof t) {
                    tVar = (t) obj;
                } else {
                    tVar = null;
                }
                if (tVar != null) {
                    th = tVar.f8743a;
                }
                throw new IllegalStateException(str, th);
            }
        } while (R == l1.f8716c);
        return R;
    }

    public String J() {
        return getClass().getSimpleName();
    }

    public final void L(n1 n1Var, Throwable th) {
        Object g10 = n1Var.g();
        r6.h0.r(g10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        androidx.fragment.app.w wVar = null;
        for (t7.n nVar = (t7.n) g10; !r6.h0.g(nVar, n1Var); nVar = nVar.h()) {
            if (nVar instanceof c1) {
                e1 e1Var = (e1) nVar;
                try {
                    e1Var.l(th);
                } catch (Throwable th2) {
                    if (wVar != null) {
                        com.bumptech.glide.d.a(wVar, th2);
                    } else {
                        wVar = new androidx.fragment.app.w("Exception in completion handler " + e1Var + " for " + this, th2);
                    }
                }
            }
        }
        if (wVar != null) {
            D(wVar);
        }
        l(th);
    }

    public void M(Object obj) {
    }

    public void N() {
    }

    public final void O(e1 e1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z9;
        n1 n1Var = new n1();
        e1Var.getClass();
        t7.n.f10076b.lazySet(n1Var, e1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = t7.n.f10075a;
        atomicReferenceFieldUpdater2.lazySet(n1Var, e1Var);
        while (true) {
            if (e1Var.g() != e1Var) {
                break;
            }
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(e1Var, e1Var, n1Var)) {
                    z9 = true;
                    break;
                } else if (atomicReferenceFieldUpdater2.get(e1Var) != e1Var) {
                    z9 = false;
                    break;
                }
            }
            if (z9) {
                n1Var.f(e1Var);
                break;
            }
        }
        t7.n h10 = e1Var.h();
        do {
            atomicReferenceFieldUpdater = f8709a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, e1Var, h10)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == e1Var);
    }

    public final int P(Object obj) {
        boolean z9 = obj instanceof n0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8709a;
        boolean z10 = false;
        if (z9) {
            if (((n0) obj).f8724a) {
                return 0;
            }
            n0 n0Var = l1.f8720g;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, n0Var)) {
                    z10 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            if (!z10) {
                return -1;
            }
            N();
            return 1;
        }
        if (!(obj instanceof w0)) {
            return 0;
        }
        n1 n1Var = ((w0) obj).f8754a;
        while (true) {
            if (atomicReferenceFieldUpdater.compareAndSet(this, obj, n1Var)) {
                z10 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                break;
            }
        }
        if (!z10) {
            return -1;
        }
        N();
        return 1;
    }

    public final Object R(Object obj, Object obj2) {
        Object obj3;
        boolean z9;
        h1 h1Var;
        t tVar;
        o oVar;
        if (!(obj instanceof x0)) {
            return l1.f8714a;
        }
        boolean z10 = true;
        boolean z11 = false;
        if (((obj instanceof n0) || (obj instanceof e1)) && !(obj instanceof o) && !(obj2 instanceof t)) {
            x0 x0Var = (x0) obj;
            w4.o oVar2 = l1.f8714a;
            if (obj2 instanceof x0) {
                obj3 = new y0((x0) obj2);
            } else {
                obj3 = obj2;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8709a;
                if (atomicReferenceFieldUpdater.compareAndSet(this, x0Var, obj3)) {
                    z9 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != x0Var) {
                    z9 = false;
                    break;
                }
            }
            if (!z9) {
                z10 = false;
            } else {
                M(obj2);
                o(x0Var, obj2);
            }
            if (z10) {
                return obj2;
            }
            return l1.f8716c;
        }
        x0 x0Var2 = (x0) obj;
        n1 A = A(x0Var2);
        if (A == null) {
            return l1.f8716c;
        }
        o oVar3 = null;
        if (x0Var2 instanceof h1) {
            h1Var = (h1) x0Var2;
        } else {
            h1Var = null;
        }
        if (h1Var == null) {
            h1Var = new h1(A, null);
        }
        synchronized (h1Var) {
            if (h1Var.f()) {
                return l1.f8714a;
            }
            h1.f8687b.set(h1Var, 1);
            if (h1Var != x0Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f8709a;
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, x0Var2, h1Var)) {
                        z11 = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater2.get(this) != x0Var2) {
                        break;
                    }
                }
                if (!z11) {
                    return l1.f8716c;
                }
            }
            boolean e10 = h1Var.e();
            if (obj2 instanceof t) {
                tVar = (t) obj2;
            } else {
                tVar = null;
            }
            if (tVar != null) {
                h1Var.b(tVar.f8743a);
            }
            Throwable c6 = h1Var.c();
            if (!Boolean.valueOf(true ^ e10).booleanValue()) {
                c6 = null;
            }
            if (c6 != null) {
                L(A, c6);
            }
            if (x0Var2 instanceof o) {
                oVar = (o) x0Var2;
            } else {
                oVar = null;
            }
            if (oVar == null) {
                n1 d10 = x0Var2.d();
                if (d10 != null) {
                    oVar3 = K(d10);
                }
            } else {
                oVar3 = oVar;
            }
            if (oVar3 != null && S(h1Var, oVar3, obj2)) {
                return l1.f8715b;
            }
            return q(h1Var, obj2);
        }
    }

    public final boolean S(h1 h1Var, o oVar, Object obj) {
        while (com.bumptech.glide.c.C(oVar.f8725e, false, new g1(this, h1Var, oVar, obj), 1) == o1.f8727a) {
            oVar = K(oVar);
            if (oVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // p7.a1
    public boolean a() {
        Object B = B();
        if ((B instanceof x0) && ((x0) B).a()) {
            return true;
        }
        return false;
    }

    public Object f() {
        return u();
    }

    @Override // z6.g
    public final z6.h getKey() {
        return androidx.lifecycle.q0.f1134x;
    }

    public final boolean h(Object obj, n1 n1Var, e1 e1Var) {
        boolean z9;
        char c6;
        i1 i1Var = new i1(e1Var, this, obj);
        do {
            t7.n i10 = n1Var.i();
            t7.n.f10076b.lazySet(e1Var, i10);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = t7.n.f10075a;
            atomicReferenceFieldUpdater.lazySet(e1Var, n1Var);
            i1Var.f8694c = n1Var;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(i10, n1Var, i1Var)) {
                    z9 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(i10) != n1Var) {
                    z9 = false;
                    break;
                }
            }
            if (!z9) {
                c6 = 0;
            } else if (i1Var.a(i10) == null) {
                c6 = 1;
            } else {
                c6 = 2;
            }
            if (c6 == 1) {
                return true;
            }
        } while (c6 != 2);
        return false;
    }

    public void i(Object obj) {
    }

    public void j(Object obj) {
        i(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        r0 = p7.l1.f8714a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r0 != p7.l1.f8715b) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        r0 = R(r0, new p7.t(p(r10), false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r0 == p7.l1.f8716c) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        if (r0 != p7.l1.f8714a) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        r0 = null;
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:
    
        r4 = B();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
    
        if ((r4 instanceof p7.h1) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0091, code lost:
    
        if ((r4 instanceof p7.x0) == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0093, code lost:
    
        if (r1 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
    
        r1 = p(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0099, code lost:
    
        r5 = (p7.x0) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0008, code lost:
    
        if (z() != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a0, code lost:
    
        if (r5.a() == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cc, code lost:
    
        r5 = R(r4, new p7.t(r1, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d7, code lost:
    
        if (r5 == p7.l1.f8714a) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00db, code lost:
    
        if (r5 == p7.l1.f8716c) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00dd, code lost:
    
        r0 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        r0 = B();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f6, code lost:
    
        throw new java.lang.IllegalStateException(("Cannot happen in " + r4).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a2, code lost:
    
        r6 = A(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a6, code lost:
    
        if (r6 != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a9, code lost:
    
        r7 = new p7.h1(r6, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ae, code lost:
    
        r4 = p7.k1.f8709a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b4, code lost:
    
        if (r4.compareAndSet(r9, r5, r7) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if ((r0 instanceof p7.x0) == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bc, code lost:
    
        if (r4.get(r9) == r5) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00be, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00bf, code lost:
    
        if (r4 != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c3, code lost:
    
        L(r6, r1);
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c7, code lost:
    
        if (r4 == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c9, code lost:
    
        r10 = p7.l1.f8714a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f9, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b6, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00c1, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00f7, code lost:
    
        r10 = p7.l1.f8717d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0047, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if ((r0 instanceof p7.h1) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0053, code lost:
    
        if (p7.h1.f8689d.get((p7.h1) r4) != p7.l1.f8718e) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0055, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0058, code lost:
    
        if (r5 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x005a, code lost:
    
        r10 = p7.l1.f8717d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x005c, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x005f, code lost:
    
        r5 = ((p7.h1) r4).e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0066, code lost:
    
        if (r1 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0068, code lost:
    
        r1 = p(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x006c, code lost:
    
        ((p7.h1) r4).b(r1);
        r10 = ((p7.h1) r4).c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x007b, code lost:
    
        if ((!r5) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x007d, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x007e, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x007f, code lost:
    
        if (r0 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0081, code lost:
    
        L(((p7.h1) r4).f8690a, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0088, code lost:
    
        r10 = p7.l1.f8714a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0057, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (((p7.h1) r0).f() == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00fc, code lost:
    
        if (r0 != p7.l1.f8714a) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0101, code lost:
    
        if (r0 != p7.l1.f8715b) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0106, code lost:
    
        if (r0 != p7.l1.f8717d) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0109, code lost:
    
        i(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x010d, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.k1.k(java.lang.Object):boolean");
    }

    public final boolean l(Throwable th) {
        if (G()) {
            return true;
        }
        boolean z9 = th instanceof CancellationException;
        n nVar = (n) f8710b.get(this);
        if (nVar != null && nVar != o1.f8727a) {
            if (nVar.c(th) || z9) {
                return true;
            }
            return false;
        }
        return z9;
    }

    public String m() {
        return "Job was cancelled";
    }

    public boolean n(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        if (k(th) && y()) {
            return true;
        }
        return false;
    }

    public final void o(x0 x0Var, Object obj) {
        t tVar;
        Throwable th;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8710b;
        n nVar = (n) atomicReferenceFieldUpdater.get(this);
        if (nVar != null) {
            nVar.b();
            atomicReferenceFieldUpdater.set(this, o1.f8727a);
        }
        androidx.fragment.app.w wVar = null;
        if (obj instanceof t) {
            tVar = (t) obj;
        } else {
            tVar = null;
        }
        if (tVar != null) {
            th = tVar.f8743a;
        } else {
            th = null;
        }
        if (x0Var instanceof e1) {
            try {
                ((e1) x0Var).l(th);
                return;
            } catch (Throwable th2) {
                D(new androidx.fragment.app.w("Exception in completion handler " + x0Var + " for " + this, th2));
                return;
            }
        }
        n1 d10 = x0Var.d();
        if (d10 != null) {
            Object g10 = d10.g();
            r6.h0.r(g10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (t7.n nVar2 = (t7.n) g10; !r6.h0.g(nVar2, d10); nVar2 = nVar2.h()) {
                if (nVar2 instanceof e1) {
                    e1 e1Var = (e1) nVar2;
                    try {
                        e1Var.l(th);
                    } catch (Throwable th3) {
                        if (wVar != null) {
                            com.bumptech.glide.d.a(wVar, th3);
                        } else {
                            wVar = new androidx.fragment.app.w("Exception in completion handler " + e1Var + " for " + this, th3);
                        }
                    }
                }
            }
            if (wVar != null) {
                D(wVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable p(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        k1 k1Var = (k1) ((q1) obj);
        Object B = k1Var.B();
        CancellationException cancellationException2 = null;
        if (B instanceof h1) {
            cancellationException = ((h1) B).c();
        } else if (B instanceof t) {
            cancellationException = ((t) B).f8743a;
        } else if (!(B instanceof x0)) {
            cancellationException = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + B).toString());
        }
        if (cancellationException instanceof CancellationException) {
            cancellationException2 = cancellationException;
        }
        if (cancellationException2 == null) {
            cancellationException2 = new b1("Parent job is ".concat(Q(B)), cancellationException, k1Var);
        }
        return cancellationException2;
    }

    public final Object q(h1 h1Var, Object obj) {
        t tVar;
        Throwable w9;
        Object obj2;
        boolean z9;
        Throwable th = null;
        if (obj instanceof t) {
            tVar = (t) obj;
        } else {
            tVar = null;
        }
        if (tVar != null) {
            th = tVar.f8743a;
        }
        synchronized (h1Var) {
            h1Var.e();
            ArrayList<Throwable> g10 = h1Var.g(th);
            w9 = w(h1Var, g10);
            if (w9 != null && g10.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(g10.size()));
                for (Throwable th2 : g10) {
                    if (th2 != w9 && th2 != w9 && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                        com.bumptech.glide.d.a(w9, th2);
                    }
                }
            }
        }
        if (w9 != null && w9 != th) {
            obj = new t(w9, false);
        }
        if (w9 != null) {
            if (!l(w9) && !C(w9)) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (z9) {
                r6.h0.r(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                t.f8742b.compareAndSet((t) obj, 0, 1);
            }
        }
        M(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8709a;
        if (obj instanceof x0) {
            obj2 = new y0((x0) obj);
        } else {
            obj2 = obj;
        }
        while (!atomicReferenceFieldUpdater.compareAndSet(this, h1Var, obj2) && atomicReferenceFieldUpdater.get(this) == h1Var) {
        }
        o(h1Var, obj);
        return obj;
    }

    @Override // z6.i
    public final z6.g r(z6.h hVar) {
        return r6.h0.U(this, hVar);
    }

    public final CancellationException s() {
        Object B = B();
        CancellationException cancellationException = null;
        if (B instanceof h1) {
            Throwable c6 = ((h1) B).c();
            if (c6 != null) {
                String concat = getClass().getSimpleName().concat(" is cancelling");
                if (c6 instanceof CancellationException) {
                    cancellationException = (CancellationException) c6;
                }
                if (cancellationException == null) {
                    if (concat == null) {
                        concat = m();
                    }
                    return new b1(concat, c6, this);
                }
                return cancellationException;
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (!(B instanceof x0)) {
            if (B instanceof t) {
                Throwable th = ((t) B).f8743a;
                if (th instanceof CancellationException) {
                    cancellationException = (CancellationException) th;
                }
                if (cancellationException == null) {
                    return new b1(m(), th, this);
                }
                return cancellationException;
            }
            return new b1(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    @Override // z6.i
    public final z6.i t(z6.i iVar) {
        r6.h0.u(iVar, "context");
        return q6.g.L(this, iVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(J() + '{' + Q(B()) + '}');
        sb.append('@');
        sb.append(a0.z(this));
        return sb.toString();
    }

    public final Object u() {
        Object B = B();
        if (!(B instanceof x0)) {
            if (!(B instanceof t)) {
                return l1.a(B);
            }
            throw ((t) B).f8743a;
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    @Override // z6.i
    public final z6.i v(z6.h hVar) {
        return r6.h0.n0(this, hVar);
    }

    public final Throwable w(h1 h1Var, ArrayList arrayList) {
        Object obj;
        boolean z9;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (!h1Var.e()) {
                return null;
            }
            return new b1(m(), null, this);
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
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
        if (th2 instanceof w1) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 != th2 && (th3 instanceof w1)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    obj2 = next;
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

    @Override // z6.i
    public final Object x(Object obj, h7.p pVar) {
        r6.h0.u(pVar, "operation");
        return pVar.invoke(obj, this);
    }

    public boolean y() {
        return true;
    }

    public boolean z() {
        return this instanceof r;
    }

    public void D(androidx.fragment.app.w wVar) {
        throw wVar;
    }
}
