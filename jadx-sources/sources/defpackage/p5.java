package defpackage;

import java.io.Closeable;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.ClosedSelectorException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.nio.channels.spi.AbstractSelector;
import java.nio.channels.spi.SelectorProvider;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class p5 implements Closeable, v11 {
    public final AtomicLong A;
    public final af2 B;
    public final kk3 C;
    public final l11 D;
    private volatile boolean closed;
    private volatile boolean inSelect;
    private volatile ei1 parentCancellationHandler;
    private volatile Selector selectorRef;
    public final SelectorProvider x;
    public int y;
    public int z;

    public p5(n11 n11Var) {
        ei1 ei1Var;
        SelectorProvider provider = SelectorProvider.provider();
        provider.getClass();
        this.x = provider;
        this.A = new AtomicLong();
        this.B = new af2((byte) 5);
        this.C = new kk3();
        this.D = n11Var.plus(new r11("selector"));
        h43 h43Var = (h43) n11Var.get(h95.F);
        if (h43Var != null) {
            ei1Var = h43Var.t(true, true, new l0(this, (byte) 2));
        } else {
            ei1Var = null;
        }
        this.parentCancellationHandler = ei1Var;
        tl7.z(this, null, null, new l5(this, null), 3);
    }

    public static final /* synthetic */ void a(p5 p5Var) {
        p5Var.closed = true;
    }

    public static final /* synthetic */ void l(p5 p5Var, AbstractSelector abstractSelector) {
        p5Var.selectorRef = abstractSelector;
    }

    public static void q(rg5 rg5Var, Throwable th) {
        rg5Var.getClass();
        w13 w13Var = rg5Var.y;
        pg5.y.getClass();
        for (pg5 pg5Var : pg5.z) {
            pg5Var.getClass();
            pg0 pg0Var = (pg0) w13.a[pg5Var.ordinal()].getAndSet(w13Var, null);
            if (pg0Var != null) {
                pg0Var.resumeWith(new y45(th));
            }
        }
    }

    public static void t(AbstractSelector abstractSelector, Throwable th) {
        rg5 rg5Var;
        abstractSelector.getClass();
        if (th == null) {
            th = new e54("Closed selector", (byte) 1);
        }
        Set<SelectionKey> keys = abstractSelector.keys();
        keys.getClass();
        for (SelectionKey selectionKey : keys) {
            try {
                if (selectionKey.isValid()) {
                    selectionKey.interestOps(0);
                }
            } catch (CancelledKeyException unused) {
            }
            Object attachment = selectionKey.attachment();
            if (attachment instanceof rg5) {
                rg5Var = (rg5) attachment;
            } else {
                rg5Var = null;
            }
            if (rg5Var != null) {
                q(rg5Var, th);
            }
            selectionKey.cancel();
        }
    }

    public final void A(Set set, Set set2) {
        rg5 rg5Var;
        rg5 rg5Var2;
        pg0 pg0Var;
        int size = set.size();
        this.y = set2.size() - size;
        this.z = 0;
        if (size > 0) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                SelectionKey selectionKey = (SelectionKey) it.next();
                selectionKey.getClass();
                try {
                    int readyOps = selectionKey.readyOps();
                    int interestOps = selectionKey.interestOps();
                    Object attachment = selectionKey.attachment();
                    if (attachment instanceof rg5) {
                        rg5Var2 = (rg5) attachment;
                    } else {
                        rg5Var2 = null;
                    }
                    if (rg5Var2 == null) {
                        selectionKey.cancel();
                        this.z++;
                    } else {
                        w13 w13Var = rg5Var2.y;
                        pg5.y.getClass();
                        int[] iArr = pg5.A;
                        int length = iArr.length;
                        for (int i = 0; i < length; i++) {
                            if ((iArr[i] & readyOps) != 0 && (pg0Var = (pg0) w13.a[i].getAndSet(w13Var, null)) != null) {
                                pg0Var.resumeWith(pn6.a);
                            }
                        }
                        int i2 = (~readyOps) & interestOps;
                        if (i2 != interestOps) {
                            selectionKey.interestOps(i2);
                        }
                        if (i2 != 0) {
                            this.y++;
                        }
                    }
                } catch (Throwable th) {
                    selectionKey.cancel();
                    this.z++;
                    Object attachment2 = selectionKey.attachment();
                    if (attachment2 instanceof rg5) {
                        rg5Var = (rg5) attachment2;
                    } else {
                        rg5Var = null;
                    }
                    if (rg5Var != null) {
                        q(rg5Var, th);
                        selectionKey.attach(null);
                    }
                }
                it.remove();
            }
        }
    }

    public final void G(lu5 lu5Var) {
        SelectionKey keyFor;
        q(lu5Var, new ClosedChannelException());
        Selector selector = this.selectorRef;
        if (selector != null && (keyFor = lu5Var.I.keyFor(selector)) != null) {
            keyFor.cancel();
            u0();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d8, code lost:
    
        if (r10 == r1) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00db, code lost:
    
        if (r10 != r1) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006f, code lost:
    
        if (r10 == r1) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a2, code lost:
    
        if (defpackage.fz5.o(r0) == r1) goto L113;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059 A[LOOP:1: B:18:0x0059->B:20:0x00e5, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r7v0, types: [p5] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.nio.channels.Selector] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.nio.channels.Selector] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.nio.channels.Selector] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007a -> B:15:0x0055). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0094 -> B:15:0x0055). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00a2 -> B:15:0x0055). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I(defpackage.kk3 r8, java.nio.channels.spi.AbstractSelector r9, defpackage.xz0 r10) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p5.I(kk3, java.nio.channels.spi.AbstractSelector, xz0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0038 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object T(defpackage.kk3 r7, defpackage.xz0 r8) {
        /*
            r6 = this;
            w11 r0 = defpackage.w11.x
            boolean r1 = r8 instanceof defpackage.n5
            if (r1 == 0) goto L15
            r1 = r8
            n5 r1 = (defpackage.n5) r1
            int r2 = r1.A
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.A = r2
            goto L1a
        L15:
            n5 r1 = new n5
            r1.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r1.y
            int r2 = r1.A
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L2d
            if (r2 != r3) goto L27
            kk3 r7 = r1.x
            goto L2d
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r6)
            return r4
        L2d:
            defpackage.m37.N(r8)
        L30:
            java.lang.Object r8 = r7.d()
            rg5 r8 = (defpackage.rg5) r8
            if (r8 == 0) goto L39
            return r8
        L39:
            boolean r8 = r6.closed
            if (r8 == 0) goto L3e
            return r4
        L3e:
            r1.x = r7
            r1.A = r3
            af2 r8 = r6.B
            boolean r2 = r7.c()
            if (r2 == 0) goto L6e
            boolean r2 = r6.closed
            if (r2 != 0) goto L6e
            java.lang.Object r2 = r8.y
            java.util.concurrent.atomic.AtomicReference r2 = (java.util.concurrent.atomic.AtomicReference) r2
        L52:
            boolean r5 = r2.compareAndSet(r4, r1)
            if (r5 == 0) goto L78
            boolean r2 = r7.c()
            if (r2 == 0) goto L63
            boolean r2 = r6.closed
            if (r2 != 0) goto L63
            goto L76
        L63:
            java.lang.Object r8 = r8.y
            r5 = r8
            java.util.concurrent.atomic.AtomicReference r5 = (java.util.concurrent.atomic.AtomicReference) r5
        L68:
            boolean r8 = r5.compareAndSet(r1, r4)
            if (r8 == 0) goto L70
        L6e:
            r8 = r4
            goto L85
        L70:
            java.lang.Object r8 = r5.get()
            if (r8 == r1) goto L68
        L76:
            r8 = r0
            goto L85
        L78:
            java.lang.Object r5 = r2.get()
            if (r5 != 0) goto L7f
            goto L52
        L7f:
            java.lang.String r6 = "Continuation is already set"
            defpackage.ze0.m(r6)
            return r4
        L85:
            if (r8 != 0) goto L89
            pn6 r8 = defpackage.pn6.a
        L89:
            if (r8 != r0) goto L30
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p5.T(kk3, xz0):java.lang.Object");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ei1 ei1Var = this.parentCancellationHandler;
        if (ei1Var != null) {
            ei1Var.dispose();
        }
        this.parentCancellationHandler = null;
        this.closed = true;
        this.C.b();
        af2 af2Var = this.B;
        pn6 pn6Var = pn6.a;
        vz0 vz0Var = (vz0) ((AtomicReference) af2Var.y).getAndSet(null);
        if (vz0Var == null) {
            u0();
        } else {
            vz0Var.resumeWith(pn6Var);
        }
    }

    @Override // defpackage.v11
    public final l11 getCoroutineContext() {
        return this.D;
    }

    public final Object k0(rg5 rg5Var, pg5 pg5Var, xz0 xz0Var) {
        int t = rg5Var.t();
        byte b = pg5Var.x;
        if (!rg5Var.x.get()) {
            if ((t & b) != 0) {
                qg0 qg0Var = new qg0(1, wc7.z(xz0Var));
                qg0Var.t();
                qg0Var.v(xd.M);
                w13 w13Var = rg5Var.y;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w13.a[pg5Var.ordinal()];
                while (!atomicReferenceFieldUpdater.compareAndSet(w13Var, null, qg0Var)) {
                    if (atomicReferenceFieldUpdater.get(w13Var) != null) {
                        throw new IllegalStateException(("Handler for " + pg5Var.name() + " is already registered").toString());
                    }
                }
                boolean z = qg0Var.s() instanceof tg0;
                pn6 pn6Var = pn6.a;
                if (!z) {
                    try {
                        if (this.C.a(rg5Var)) {
                            vz0 vz0Var = (vz0) ((AtomicReference) this.B.y).getAndSet(null);
                            if (vz0Var != null) {
                                vz0Var.resumeWith(pn6Var);
                            }
                            u0();
                        } else {
                            if (rg5Var.q().isOpen()) {
                                throw new ClosedSelectorException();
                            }
                            throw new ClosedChannelException();
                        }
                    } catch (Throwable th) {
                        q(rg5Var, th);
                    }
                }
                Object r = qg0Var.r();
                if (r == w11.x) {
                    return r;
                }
                return pn6Var;
            }
            throw new IllegalStateException(("Selectable is invalid state: " + t + ", " + ((int) b)).toString());
        }
        qi2.k("Selectable is already closed");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l0(java.nio.channels.Selector r5, defpackage.xz0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.o5
            if (r0 == 0) goto L13
            r0 = r6
            o5 r0 = (defpackage.o5) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            o5 r0 = new o5
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.y
            w11 r1 = defpackage.w11.x
            int r2 = r0.A
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            java.nio.channels.Selector r5 = r0.x
            defpackage.m37.N(r6)
            goto L40
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            r4 = 0
            return r4
        L30:
            defpackage.m37.N(r6)
            r4.inSelect = r3
            r0.x = r5
            r0.A = r3
            java.lang.Object r6 = defpackage.fz5.o(r0)
            if (r6 != r1) goto L40
            return r1
        L40:
            java.util.concurrent.atomic.AtomicLong r6 = r4.A
            long r0 = r6.get()
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r0 = 0
            if (r6 != 0) goto L56
            r1 = 500(0x1f4, double:2.47E-321)
            int r5 = r5.select(r1)
            r4.inSelect = r0
            goto L61
        L56:
            r4.inSelect = r0
            java.util.concurrent.atomic.AtomicLong r4 = r4.A
            r4.set(r2)
            int r5 = r5.selectNow()
        L61:
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p5.l0(java.nio.channels.Selector, xz0):java.lang.Object");
    }

    public final void p(Selector selector, rg5 rg5Var) {
        selector.getClass();
        try {
            SocketChannel q = rg5Var.q();
            SelectionKey keyFor = q.keyFor(selector);
            int t = rg5Var.t();
            if (keyFor == null) {
                if (t != 0) {
                    q.register(selector, t, rg5Var);
                }
            } else if (keyFor.interestOps() != t) {
                keyFor.interestOps(t);
            }
            if (t != 0) {
                this.y++;
            }
        } catch (Throwable th) {
            SelectionKey keyFor2 = rg5Var.q().keyFor(selector);
            if (keyFor2 != null) {
                keyFor2.cancel();
            }
            q(rg5Var, th);
        }
    }

    public final void u0() {
        Selector selector;
        if (this.A.incrementAndGet() == 1 && this.inSelect && (selector = this.selectorRef) != null) {
            selector.wakeup();
        }
    }
}
