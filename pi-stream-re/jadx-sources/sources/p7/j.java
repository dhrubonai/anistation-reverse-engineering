package p7;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class j extends h0 implements i, b7.d, b2 {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f8697f = AtomicIntegerFieldUpdater.newUpdater(j.class, "_decisionAndIndex");

    /* renamed from: x, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8698x = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_state");

    /* renamed from: y, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8699y = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* renamed from: d, reason: collision with root package name */
    public final z6.e f8700d;

    /* renamed from: e, reason: collision with root package name */
    public final z6.i f8701e;

    public j(int i10, z6.e eVar) {
        super(i10);
        this.f8700d = eVar;
        this.f8701e = eVar.getContext();
        this._decisionAndIndex = 536870911;
        this._state = b.f8662a;
    }

    public static Object C(p1 p1Var, Object obj, int i10, h7.l lVar) {
        h hVar;
        if (!(obj instanceof t)) {
            boolean z9 = true;
            if (i10 != 1 && i10 != 2) {
                z9 = false;
            }
            if (z9) {
                if (lVar != null || (p1Var instanceof h)) {
                    if (p1Var instanceof h) {
                        hVar = (h) p1Var;
                    } else {
                        hVar = null;
                    }
                    return new s(obj, hVar, lVar, (CancellationException) null, 16);
                }
                return obj;
            }
            return obj;
        }
        return obj;
    }

    public static void y(p1 p1Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + p1Var + ", already has " + obj).toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        if (r2 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        p();
        o(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A() {
        /*
            r7 = this;
            z6.e r0 = r7.f8700d
            boolean r1 = r0 instanceof t7.i
            r2 = 0
            if (r1 == 0) goto La
            t7.i r0 = (t7.i) r0
            goto Lb
        La:
            r0 = r2
        Lb:
            if (r0 == 0) goto L6f
        Ld:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = t7.i.f10061y
            java.lang.Object r3 = r1.get(r0)
            w4.o r4 = t7.j.f10067b
            r5 = 0
            r6 = 1
            if (r3 != r4) goto L2a
        L19:
            boolean r3 = r1.compareAndSet(r0, r4, r7)
            if (r3 == 0) goto L21
            r5 = r6
            goto L27
        L21:
            java.lang.Object r3 = r1.get(r0)
            if (r3 == r4) goto L19
        L27:
            if (r5 == 0) goto Ld
            goto L41
        L2a:
            boolean r4 = r3 instanceof java.lang.Throwable
            if (r4 == 0) goto L57
        L2e:
            boolean r4 = r1.compareAndSet(r0, r3, r2)
            if (r4 == 0) goto L36
            r5 = r6
            goto L3c
        L36:
            java.lang.Object r4 = r1.get(r0)
            if (r4 == r3) goto L2e
        L3c:
            if (r5 == 0) goto L4b
            r2 = r3
            java.lang.Throwable r2 = (java.lang.Throwable) r2
        L41:
            if (r2 != 0) goto L44
            goto L6f
        L44:
            r7.p()
            r7.o(r2)
            return
        L4b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed requirement."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L57:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Inconsistent state "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.j.A():void");
    }

    public final void B(Object obj, int i10, h7.l lVar) {
        boolean z9;
        do {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8698x;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            z9 = false;
            if (obj2 instanceof p1) {
                Object C = C((p1) obj2, obj, i10, lVar);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, C)) {
                        z9 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
            } else {
                if (obj2 instanceof l) {
                    l lVar2 = (l) obj2;
                    lVar2.getClass();
                    if (l.f8711c.compareAndSet(lVar2, 0, 1)) {
                        if (lVar != null) {
                            m(lVar, lVar2.f8743a);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
        } while (!z9);
        if (!x()) {
            p();
        }
        q(i10);
    }

    public final w4.o D(Object obj, h7.l lVar) {
        boolean z9;
        do {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8698x;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof p1) {
                Object C = C((p1) obj2, obj, this.f8686c, lVar);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, C)) {
                        z9 = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        z9 = false;
                        break;
                    }
                }
            } else {
                boolean z10 = obj2 instanceof s;
                return null;
            }
        } while (!z9);
        if (!x()) {
            p();
        }
        return k.f8708a;
    }

    @Override // p7.b2
    public final void a(v7.k kVar, int i10) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        boolean z9;
        do {
            atomicIntegerFieldUpdater = f8697f;
            i11 = atomicIntegerFieldUpdater.get(this);
            if ((i11 & 536870911) == 536870911) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z9) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        w(kVar);
    }

    @Override // p7.h0
    public final void b(Object obj, CancellationException cancellationException) {
        boolean z9;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8698x;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof p1)) {
                if (obj2 instanceof t) {
                    return;
                }
                boolean z10 = true;
                if (obj2 instanceof s) {
                    s sVar = (s) obj2;
                    if (sVar.f8738e != null) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (!z9) {
                        s a10 = s.a(sVar, null, cancellationException, 15);
                        while (true) {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, a10)) {
                                break;
                            } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                z10 = false;
                                break;
                            }
                        }
                        if (z10) {
                            h hVar = sVar.f8735b;
                            if (hVar != null) {
                                l(hVar, cancellationException);
                            }
                            h7.l lVar = sVar.f8736c;
                            if (lVar != null) {
                                m(lVar, cancellationException);
                                return;
                            }
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else {
                    s sVar2 = new s(obj2, (h) null, (h7.l) null, cancellationException, 14);
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, sVar2)) {
                            break;
                        } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            z10 = false;
                            break;
                        }
                    }
                    if (z10) {
                        return;
                    }
                }
            } else {
                throw new IllegalStateException("Not completed".toString());
            }
        }
    }

    @Override // p7.i
    public final void c(h7.l lVar) {
        B(w6.f.f11019a, this.f8686c, lVar);
    }

    @Override // p7.i
    public final w4.o d(x6.a aVar) {
        return D(w6.f.f11019a, aVar);
    }

    @Override // p7.i
    public final w4.o e(Throwable th) {
        return D(new t(th, false), null);
    }

    @Override // p7.h0
    public final z6.e f() {
        return this.f8700d;
    }

    @Override // p7.i
    public final void g(Object obj) {
        q(this.f8686c);
    }

    @Override // b7.d
    public final b7.d getCallerFrame() {
        z6.e eVar = this.f8700d;
        if (eVar instanceof b7.d) {
            return (b7.d) eVar;
        }
        return null;
    }

    @Override // z6.e
    public final z6.i getContext() {
        return this.f8701e;
    }

    @Override // p7.h0
    public final Throwable h(Object obj) {
        Throwable h10 = super.h(obj);
        if (h10 == null) {
            return null;
        }
        return h10;
    }

    @Override // p7.h0
    public final Object i(Object obj) {
        if (obj instanceof s) {
            return ((s) obj).f8734a;
        }
        return obj;
    }

    @Override // p7.h0
    public final Object k() {
        return f8698x.get(this);
    }

    public final void l(h hVar, Throwable th) {
        try {
            hVar.a(th);
        } catch (Throwable th2) {
            q6.g.C(this.f8701e, new androidx.fragment.app.w("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void m(h7.l lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            q6.g.C(this.f8701e, new androidx.fragment.app.w("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void n(t7.x xVar, Throwable th) {
        boolean z9;
        int i10 = f8697f.get(this) & 536870911;
        if (i10 != 536870911) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            try {
                xVar.e(i10);
                return;
            } catch (Throwable th2) {
                q6.g.C(this.f8701e, new androidx.fragment.app.w("Exception in invokeOnCancellation handler for " + this, th2));
                return;
            }
        }
        throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
    }

    public final void o(Throwable th) {
        Object obj;
        boolean z9;
        boolean z10;
        do {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8698x;
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof p1)) {
                return;
            }
            z9 = false;
            if (!(obj instanceof h) && !(obj instanceof t7.x)) {
                z10 = false;
            } else {
                z10 = true;
            }
            l lVar = new l(this, th, z10);
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, lVar)) {
                    z9 = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
        } while (!z9);
        p1 p1Var = (p1) obj;
        if (p1Var instanceof h) {
            l((h) obj, th);
        } else if (p1Var instanceof t7.x) {
            n((t7.x) obj, th);
        }
        if (!x()) {
            p();
        }
        q(this.f8686c);
    }

    public final void p() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8699y;
        k0 k0Var = (k0) atomicReferenceFieldUpdater.get(this);
        if (k0Var == null) {
            return;
        }
        k0Var.b();
        atomicReferenceFieldUpdater.set(this, o1.f8727a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if (r10 != 4) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        r1 = r9.f8700d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        if (r0 != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        if ((r1 instanceof t7.i) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        if (r10 == 1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
    
        if (r10 != 2) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        r5 = r9.f8686c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        if (r5 == 1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        if (r5 != 2) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (r10 != r2) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        r10 = ((t7.i) r1).f10062d;
        r0 = r1.getContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r10.H() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        r10.G(r0, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0063, code lost:
    
        r10 = p7.u1.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
    
        if (r10.f8739c < 4294967296L) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0072, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0073, code lost:
    
        if (r4 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0075, code lost:
    
        r0 = r10.f8741e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0077, code lost:
    
        if (r0 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0079, code lost:
    
        r0 = new x6.h();
        r10.f8741e = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:
    
        r0.b(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0084, code lost:
    
        r10.K(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0087, code lost:
    
        r6.h0.y0(r9, r1, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008e, code lost:
    
        if (r10.L() != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0091, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009e, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x004d, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0043, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x009f, code lost:
    
        r6.h0.y0(r9, r1, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a2, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0032, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002a, code lost:
    
        if (r0 == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(int r10) {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = p7.j.f8697f
            int r1 = r0.get(r9)
            int r2 = r1 >> 29
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L1c
            if (r2 != r3) goto L10
            r0 = r4
            goto L2a
        L10:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already resumed"
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L1c:
            r2 = 536870911(0x1fffffff, float:1.0842021E-19)
            r2 = r2 & r1
            r5 = 1073741824(0x40000000, float:2.0)
            int r2 = r2 + r5
            boolean r0 = r0.compareAndSet(r9, r1, r2)
            if (r0 == 0) goto L0
            r0 = r3
        L2a:
            if (r0 == 0) goto L2d
            return
        L2d:
            r0 = 4
            if (r10 != r0) goto L32
            r0 = r3
            goto L33
        L32:
            r0 = r4
        L33:
            z6.e r1 = r9.f8700d
            if (r0 != 0) goto L9f
            boolean r2 = r1 instanceof t7.i
            if (r2 == 0) goto L9f
            r2 = 2
            if (r10 == r3) goto L43
            if (r10 != r2) goto L41
            goto L43
        L41:
            r10 = r4
            goto L44
        L43:
            r10 = r3
        L44:
            int r5 = r9.f8686c
            if (r5 == r3) goto L4d
            if (r5 != r2) goto L4b
            goto L4d
        L4b:
            r2 = r4
            goto L4e
        L4d:
            r2 = r3
        L4e:
            if (r10 != r2) goto L9f
            r10 = r1
            t7.i r10 = (t7.i) r10
            p7.w r10 = r10.f10062d
            z6.i r0 = r1.getContext()
            boolean r2 = r10.H()
            if (r2 == 0) goto L63
            r10.G(r0, r9)
            goto La2
        L63:
            p7.s0 r10 = p7.u1.a()
            long r5 = r10.f8739c
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 < 0) goto L73
            r4 = r3
        L73:
            if (r4 == 0) goto L84
            x6.h r0 = r10.f8741e
            if (r0 != 0) goto L80
            x6.h r0 = new x6.h
            r0.<init>()
            r10.f8741e = r0
        L80:
            r0.b(r9)
            goto La2
        L84:
            r10.K(r3)
            r6.h0.y0(r9, r1, r3)     // Catch: java.lang.Throwable -> L91
        L8a:
            boolean r0 = r10.L()     // Catch: java.lang.Throwable -> L91
            if (r0 != 0) goto L8a
            goto L96
        L91:
            r0 = move-exception
            r1 = 0
            r9.j(r0, r1)     // Catch: java.lang.Throwable -> L9a
        L96:
            r10.I()
            goto La2
        L9a:
            r0 = move-exception
            r10.I()
            throw r0
        L9f:
            r6.h0.y0(r9, r1, r0)
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.j.q(int):void");
    }

    public Throwable r(k1 k1Var) {
        return k1Var.s();
    }

    @Override // z6.e
    public final void resumeWith(Object obj) {
        Throwable a10 = w6.d.a(obj);
        if (a10 != null) {
            obj = new t(a10, false);
        }
        B(obj, this.f8686c, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (((p7.k0) p7.j.f8699y.get(r8)) != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        u();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        if (r0 == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        A();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        return a7.a.f156a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        if (r0 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        A();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        r0 = p7.j.f8698x.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if ((r0 instanceof p7.t) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        r1 = r8.f8686c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (r1 == 1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if (r1 != 2) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        if (r4 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        r1 = (p7.a1) r8.f8701e.r(androidx.lifecycle.q0.f1134x);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
    
        if (r1 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
    
        if (r1.a() == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        r1 = ((p7.k1) r1).s();
        b(r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007f, code lost:
    
        return i(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005b, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0084, code lost:
    
        throw ((p7.t) r0).f8743a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
    
        if (r1 == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s() {
        /*
            r8 = this;
            boolean r0 = r8.x()
        L4:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = p7.j.f8697f
            int r2 = r1.get(r8)
            int r3 = r2 >> 29
            r4 = 0
            r5 = 1
            r6 = 2
            if (r3 == 0) goto L21
            if (r3 != r6) goto L15
            r1 = r4
            goto L2f
        L15:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already suspended"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L21:
            r3 = 536870911(0x1fffffff, float:1.0842021E-19)
            r3 = r3 & r2
            r7 = 536870912(0x20000000, float:1.0842022E-19)
            int r3 = r3 + r7
            boolean r1 = r1.compareAndSet(r8, r2, r3)
            if (r1 == 0) goto L4
            r1 = r5
        L2f:
            if (r1 == 0) goto L46
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = p7.j.f8699y
            java.lang.Object r1 = r1.get(r8)
            p7.k0 r1 = (p7.k0) r1
            if (r1 != 0) goto L3e
            r8.u()
        L3e:
            if (r0 == 0) goto L43
            r8.A()
        L43:
            a7.a r0 = a7.a.f156a
            return r0
        L46:
            if (r0 == 0) goto L4b
            r8.A()
        L4b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p7.j.f8698x
            java.lang.Object r0 = r0.get(r8)
            boolean r1 = r0 instanceof p7.t
            if (r1 != 0) goto L80
            int r1 = r8.f8686c
            if (r1 == r5) goto L5b
            if (r1 != r6) goto L5c
        L5b:
            r4 = r5
        L5c:
            if (r4 == 0) goto L7b
            androidx.lifecycle.q0 r1 = androidx.lifecycle.q0.f1134x
            z6.i r2 = r8.f8701e
            z6.g r1 = r2.r(r1)
            p7.a1 r1 = (p7.a1) r1
            if (r1 == 0) goto L7b
            boolean r2 = r1.a()
            if (r2 == 0) goto L71
            goto L7b
        L71:
            p7.k1 r1 = (p7.k1) r1
            java.util.concurrent.CancellationException r1 = r1.s()
            r8.b(r0, r1)
            throw r1
        L7b:
            java.lang.Object r0 = r8.i(r0)
            return r0
        L80:
            p7.t r0 = (p7.t) r0
            java.lang.Throwable r0 = r0.f8743a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.j.s():java.lang.Object");
    }

    public final void t() {
        k0 u9 = u();
        if (u9 != null && (!(f8698x.get(this) instanceof p1))) {
            u9.b();
            f8699y.set(this, o1.f8727a);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(z());
        sb.append('(');
        sb.append(a0.c0(this.f8700d));
        sb.append("){");
        Object obj = f8698x.get(this);
        if (obj instanceof p1) {
            str = "Active";
        } else if (obj instanceof l) {
            str = "Cancelled";
        } else {
            str = "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(a0.z(this));
        return sb.toString();
    }

    public final k0 u() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        a1 a1Var = (a1) this.f8701e.r(androidx.lifecycle.q0.f1134x);
        if (a1Var == null) {
            return null;
        }
        k0 C = com.bumptech.glide.c.C(a1Var, true, new m(this), 2);
        do {
            atomicReferenceFieldUpdater = f8699y;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, C)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return C;
    }

    public final void v(h7.l lVar) {
        w((h) lVar);
    }

    public final void w(p1 p1Var) {
        boolean z9;
        boolean z10;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8698x;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z11 = true;
            if (obj instanceof b) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, p1Var)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                        z11 = false;
                        break;
                    }
                }
                if (z11) {
                    return;
                }
            } else {
                if (obj instanceof h) {
                    z9 = true;
                } else {
                    z9 = obj instanceof t7.x;
                }
                Throwable th = null;
                if (!z9) {
                    boolean z12 = obj instanceof t;
                    if (z12) {
                        t tVar = (t) obj;
                        tVar.getClass();
                        if (t.f8742b.compareAndSet(tVar, 0, 1)) {
                            if (obj instanceof l) {
                                if (!z12) {
                                    tVar = null;
                                }
                                if (tVar != null) {
                                    th = tVar.f8743a;
                                }
                                if (p1Var instanceof h) {
                                    l((h) p1Var, th);
                                    return;
                                } else {
                                    r6.h0.r(p1Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                                    n((t7.x) p1Var, th);
                                    return;
                                }
                            }
                            return;
                        }
                        y(p1Var, obj);
                        throw null;
                    }
                    if (obj instanceof s) {
                        s sVar = (s) obj;
                        if (sVar.f8735b == null) {
                            if (p1Var instanceof t7.x) {
                                return;
                            }
                            r6.h0.r(p1Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                            h hVar = (h) p1Var;
                            Throwable th2 = sVar.f8738e;
                            if (th2 != null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                l(hVar, th2);
                                return;
                            }
                            s a10 = s.a(sVar, hVar, null, 29);
                            while (true) {
                                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, a10)) {
                                    break;
                                } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                                    z11 = false;
                                    break;
                                }
                            }
                            if (z11) {
                                return;
                            }
                        } else {
                            y(p1Var, obj);
                            throw null;
                        }
                    } else {
                        if (p1Var instanceof t7.x) {
                            return;
                        }
                        r6.h0.r(p1Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        s sVar2 = new s(obj, (h) p1Var, (h7.l) null, (CancellationException) null, 28);
                        while (true) {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, obj, sVar2)) {
                                break;
                            } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                                z11 = false;
                                break;
                            }
                        }
                        if (z11) {
                            return;
                        }
                    }
                } else {
                    y(p1Var, obj);
                    throw null;
                }
            }
        }
    }

    public final boolean x() {
        boolean z9;
        boolean z10;
        if (this.f8686c == 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            z6.e eVar = this.f8700d;
            r6.h0.r(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (t7.i.f10061y.get((t7.i) eVar) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public String z() {
        return "CancellableContinuation";
    }
}
