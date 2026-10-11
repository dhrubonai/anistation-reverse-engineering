package v7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import t7.x;
import w4.o;

/* loaded from: classes.dex */
public class i {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f10681c = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "head");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f10682d = AtomicLongFieldUpdater.newUpdater(i.class, "deqIdx");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f10683e = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "tail");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f10684f = AtomicLongFieldUpdater.newUpdater(i.class, "enqIdx");

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f10685g = AtomicIntegerFieldUpdater.newUpdater(i.class, "_availablePermits");
    private volatile int _availablePermits;

    /* renamed from: a, reason: collision with root package name */
    public final int f10686a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final x6.a f10687b;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    public i(int i10) {
        boolean z9;
        if (i10 >= 0 && i10 <= 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            k kVar = new k(0L, null, 2);
            this.head = kVar;
            this.tail = kVar;
            this._availablePermits = 1 - i10;
            this.f10687b = new x6.a(this, 4);
            return;
        }
        throw new IllegalArgumentException("The number of acquired permits should be in 0..1".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0071, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0004 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(v7.c r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
        L4:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = v7.i.f10685g
            int r2 = r2.getAndDecrement(r0)
            int r3 = r0.f10686a
            if (r2 > r3) goto L4
            x6.a r3 = r0.f10687b
            if (r2 <= 0) goto L17
            r1.c(r3)
            goto Lc8
        L17:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = v7.i.f10683e
            java.lang.Object r4 = r2.get(r0)
            v7.k r4 = (v7.k) r4
            java.util.concurrent.atomic.AtomicLongFieldUpdater r5 = v7.i.f10684f
            long r5 = r5.getAndIncrement(r0)
            v7.g r7 = v7.g.f10679z
            int r8 = v7.j.f10693f
            long r8 = (long) r8
            long r8 = r5 / r8
        L2c:
            java.lang.Object r10 = t7.d.a(r4, r8, r7)
            w4.o r11 = t7.d.f10055a
            if (r10 != r11) goto L36
            r11 = 1
            goto L37
        L36:
            r11 = 0
        L37:
            if (r11 != 0) goto L86
            t7.x r11 = com.bumptech.glide.c.z(r10)
        L3d:
            java.lang.Object r14 = r2.get(r0)
            t7.x r14 = (t7.x) r14
            long r12 = r14.f10091c
            r15 = r7
            r16 = r8
            long r7 = r11.f10091c
            int r7 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r7 < 0) goto L4f
            goto L71
        L4f:
            boolean r7 = r11.f()
            if (r7 != 0) goto L57
            r7 = 0
            goto L72
        L57:
            boolean r7 = r2.compareAndSet(r0, r14, r11)
            if (r7 == 0) goto L5f
            r7 = 1
            goto L66
        L5f:
            java.lang.Object r7 = r2.get(r0)
            if (r7 == r14) goto L57
            r7 = 0
        L66:
            if (r7 == 0) goto L79
            boolean r7 = r14.c()
            if (r7 == 0) goto L71
            r14.b()
        L71:
            r7 = 1
        L72:
            if (r7 == 0) goto L75
            goto L86
        L75:
            r7 = r15
            r8 = r16
            goto L2c
        L79:
            boolean r7 = r11.c()
            if (r7 == 0) goto L82
            r11.b()
        L82:
            r7 = r15
            r8 = r16
            goto L3d
        L86:
            t7.x r2 = com.bumptech.glide.c.z(r10)
            v7.k r2 = (v7.k) r2
            int r4 = v7.j.f10693f
            long r7 = (long) r4
            long r5 = r5 % r7
            int r4 = (int) r5
            java.util.concurrent.atomic.AtomicReferenceArray r5 = r2.f10694e
        L93:
            r6 = 0
            boolean r6 = r5.compareAndSet(r4, r6, r1)
            if (r6 == 0) goto L9c
            r5 = 1
            goto La3
        L9c:
            java.lang.Object r6 = r5.get(r4)
            if (r6 == 0) goto L93
            r5 = 0
        La3:
            if (r5 == 0) goto La9
            r1.a(r2, r4)
            goto Lc3
        La9:
            w4.o r6 = v7.j.f10689b
            w4.o r7 = v7.j.f10690c
            java.util.concurrent.atomic.AtomicReferenceArray r8 = r2.f10694e
        Laf:
            boolean r2 = r8.compareAndSet(r4, r6, r7)
            if (r2 == 0) goto Lb7
            r2 = 1
            goto Lbe
        Lb7:
            java.lang.Object r2 = r8.get(r4)
            if (r2 == r6) goto Laf
            r2 = 0
        Lbe:
            if (r2 == 0) goto Lc5
            r1.c(r3)
        Lc3:
            r12 = 1
            goto Lc6
        Lc5:
            r12 = 0
        Lc6:
            if (r12 == 0) goto L4
        Lc8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v7.i.a(v7.c):void");
    }

    public final void b() {
        int i10;
        Object a10;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f10685g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i11 = this.f10686a;
            if (andIncrement < i11) {
                if (andIncrement >= 0) {
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10681c;
                k kVar = (k) atomicReferenceFieldUpdater.get(this);
                long andIncrement2 = f10682d.getAndIncrement(this);
                long j4 = andIncrement2 / j.f10693f;
                h hVar = h.f10680z;
                do {
                    a10 = t7.d.a(kVar, j4, hVar);
                    if (a10 == t7.d.f10055a) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        break;
                    }
                    x z15 = com.bumptech.glide.c.z(a10);
                    while (true) {
                        x xVar = (x) atomicReferenceFieldUpdater.get(this);
                        if (xVar.f10091c >= z15.f10091c) {
                            break;
                        }
                        if (!z15.f()) {
                            z13 = false;
                            break;
                        }
                        while (true) {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, xVar, z15)) {
                                z14 = true;
                                break;
                            } else if (atomicReferenceFieldUpdater.get(this) != xVar) {
                                z14 = false;
                                break;
                            }
                        }
                        if (z14) {
                            if (xVar.c()) {
                                xVar.b();
                            }
                        } else if (z15.c()) {
                            z15.b();
                        }
                    }
                    z13 = true;
                } while (!z13);
                k kVar2 = (k) com.bumptech.glide.c.z(a10);
                t7.e.f10057b.lazySet(kVar2, null);
                if (kVar2.f10091c <= j4) {
                    int i12 = (int) (andIncrement2 % j.f10693f);
                    o oVar = j.f10689b;
                    AtomicReferenceArray atomicReferenceArray = kVar2.f10694e;
                    Object andSet = atomicReferenceArray.getAndSet(i12, oVar);
                    if (andSet == null) {
                        int i13 = j.f10688a;
                        int i14 = 0;
                        while (true) {
                            if (i14 < i13) {
                                if (atomicReferenceArray.get(i12) == j.f10690c) {
                                    z10 = true;
                                    break;
                                }
                                i14++;
                            } else {
                                o oVar2 = j.f10689b;
                                o oVar3 = j.f10691d;
                                while (true) {
                                    if (atomicReferenceArray.compareAndSet(i12, oVar2, oVar3)) {
                                        z11 = true;
                                        z12 = true;
                                        break;
                                    } else if (atomicReferenceArray.get(i12) != oVar2) {
                                        z11 = true;
                                        z12 = false;
                                        break;
                                    }
                                }
                                z10 = z12 ^ z11;
                            }
                        }
                    } else if (andSet != j.f10692e) {
                        if (andSet instanceof p7.i) {
                            p7.i iVar = (p7.i) andSet;
                            o d10 = iVar.d(this.f10687b);
                            if (d10 != null) {
                                iVar.g(d10);
                                z10 = true;
                            }
                        } else {
                            throw new IllegalStateException(("unexpected: " + andSet).toString());
                        }
                    }
                }
                z10 = false;
            } else {
                do {
                    i10 = atomicIntegerFieldUpdater.get(this);
                    if (i10 <= i11) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, i11));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i11).toString());
            }
        } while (!z10);
    }
}
