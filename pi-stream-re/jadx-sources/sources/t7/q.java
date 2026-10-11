package t7;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f10080e = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_next");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f10081f = AtomicLongFieldUpdater.newUpdater(q.class, "_state");

    /* renamed from: g, reason: collision with root package name */
    public static final w4.o f10082g = new w4.o("REMOVE_FROZEN", 3);
    private volatile Object _next;
    private volatile long _state;

    /* renamed from: a, reason: collision with root package name */
    public final int f10083a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10084b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10085c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceArray f10086d;

    public q(int i10, boolean z9) {
        boolean z10;
        this.f10083a = i10;
        this.f10084b = z9;
        int i11 = i10 - 1;
        this.f10085c = i11;
        this.f10086d = new AtomicReferenceArray(i10);
        if (i11 <= 1073741823) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if ((i10 & i11) == 0) {
                return;
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0056, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(java.lang.Object r17) {
        /*
            r16 = this;
            r6 = r16
            r7 = r17
        L4:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = t7.q.f10081f
            long r2 = r8.get(r6)
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r9 = 0
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L1d
            r4 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r2 = r2 & r4
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 == 0) goto L1c
            r1 = 2
        L1c:
            return r1
        L1d:
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r2
            r11 = 0
            long r4 = r4 >> r11
            int r0 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r12 = 30
            long r4 = r4 >> r12
            int r13 = (int) r4
            int r4 = r13 + 2
            int r14 = r6.f10085c
            r4 = r4 & r14
            r5 = r0 & r14
            if (r4 != r5) goto L38
            return r1
        L38:
            boolean r4 = r6.f10084b
            java.util.concurrent.atomic.AtomicReferenceArray r15 = r6.f10086d
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r4 != 0) goto L57
            r4 = r13 & r14
            java.lang.Object r4 = r15.get(r4)
            if (r4 == 0) goto L57
            r2 = 1024(0x400, float:1.435E-42)
            int r3 = r6.f10083a
            if (r3 < r2) goto L56
            int r13 = r13 - r0
            r0 = r13 & r5
            int r2 = r3 >> 1
            if (r0 <= r2) goto L4
        L56:
            return r1
        L57:
            int r0 = r13 + 1
            r0 = r0 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = t7.q.f10081f
            r4 = -1152921503533105153(0xf00000003fffffff, double:-3.1050369248997324E231)
            long r4 = r4 & r2
            long r9 = (long) r0
            long r9 = r9 << r12
            long r4 = r4 | r9
            r0 = r1
            r1 = r16
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L4
            r0 = r13 & r14
            r15.set(r0, r7)
            r0 = r6
        L74:
            long r1 = r8.get(r0)
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L9f
            t7.q r0 = r0.c()
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r0.f10086d
            int r2 = r0.f10085c
            r2 = r2 & r13
            java.lang.Object r5 = r1.get(r2)
            boolean r9 = r5 instanceof t7.p
            if (r9 == 0) goto L9c
            t7.p r5 = (t7.p) r5
            int r5 = r5.f10079a
            if (r5 != r13) goto L9c
            r1.set(r2, r7)
            goto L9d
        L9c:
            r0 = 0
        L9d:
            if (r0 != 0) goto L74
        L9f:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.q.a(java.lang.Object):int");
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j4;
        do {
            atomicLongFieldUpdater = f10081f;
            j4 = atomicLongFieldUpdater.get(this);
            if ((j4 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j4) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j4, 2305843009213693952L | j4));
        return true;
    }

    public final q c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j4;
        while (true) {
            atomicLongFieldUpdater = f10081f;
            j4 = atomicLongFieldUpdater.get(this);
            if ((j4 & 1152921504606846976L) != 0) {
                break;
            }
            long j10 = j4 | 1152921504606846976L;
            if (atomicLongFieldUpdater.compareAndSet(this, j4, j10)) {
                j4 = j10;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10080e;
            q qVar = (q) atomicReferenceFieldUpdater.get(this);
            if (qVar != null) {
                return qVar;
            }
            q qVar2 = new q(this.f10083a * 2, this.f10084b);
            int i10 = (int) ((1073741823 & j4) >> 0);
            int i11 = (int) ((1152921503533105152L & j4) >> 30);
            while (true) {
                int i12 = this.f10085c;
                int i13 = i10 & i12;
                if (i13 == (i12 & i11)) {
                    break;
                }
                Object obj = this.f10086d.get(i13);
                if (obj == null) {
                    obj = new p(i10);
                }
                qVar2.f10086d.set(qVar2.f10085c & i10, obj);
                i10++;
            }
            atomicLongFieldUpdater.set(qVar2, (-1152921504606846977L) & j4);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, qVar2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f10081f;
            long j4 = atomicLongFieldUpdater.get(this);
            if ((j4 & 1152921504606846976L) != 0) {
                return f10082g;
            }
            int i10 = this.f10085c;
            int i11 = ((int) ((j4 & 1073741823) >> 0)) & i10;
            if ((((int) ((1152921503533105152L & j4) >> 30)) & i10) == i11) {
                return null;
            }
            AtomicReferenceArray atomicReferenceArray = this.f10086d;
            Object obj = atomicReferenceArray.get(i11);
            boolean z9 = this.f10084b;
            if (obj == null) {
                if (z9) {
                    return null;
                }
            } else {
                if (obj instanceof p) {
                    return null;
                }
                long j10 = ((r1 + 1) & 1073741823) << 0;
                if (atomicLongFieldUpdater.compareAndSet(this, j4, (j4 & (-1073741824)) | j10)) {
                    atomicReferenceArray.set(i11, null);
                    return obj;
                }
                if (z9) {
                    q qVar = this;
                    while (true) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f10081f;
                        long j11 = atomicLongFieldUpdater2.get(qVar);
                        int i12 = (int) ((j11 & 1073741823) >> 0);
                        if ((j11 & 1152921504606846976L) != 0) {
                            qVar = qVar.c();
                        } else {
                            if (atomicLongFieldUpdater2.compareAndSet(qVar, j11, (j11 & (-1073741824)) | j10)) {
                                qVar.f10086d.set(qVar.f10085c & i12, null);
                                qVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (qVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
