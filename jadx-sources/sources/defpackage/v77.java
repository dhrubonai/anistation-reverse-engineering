package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class v77 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b;
    public static final /* synthetic */ AtomicIntegerFieldUpdater c;
    public static final /* synthetic */ long d;
    public static final /* synthetic */ long e;
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long g;
    public final AtomicReferenceArray a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    static {
        Unsafe unsafe = qs.a;
        f = unsafe.objectFieldOffset(v77.class.getDeclaredField("lastScheduledTask$volatile"));
        b = AtomicIntegerFieldUpdater.newUpdater(v77.class, "producerIndex$volatile");
        g = unsafe.objectFieldOffset(v77.class.getDeclaredField("producerIndex$volatile"));
        e = unsafe.objectFieldOffset(v77.class.getDeclaredField("consumerIndex$volatile"));
        c = AtomicIntegerFieldUpdater.newUpdater(v77.class, "blockingTasksInBuffer$volatile");
        d = unsafe.objectFieldOffset(v77.class.getDeclaredField("blockingTasksInBuffer$volatile"));
    }

    public final n76 a(n76 n76Var) {
        if (b() == 127) {
            return n76Var;
        }
        if (n76Var.y) {
            c.incrementAndGet(this);
        }
        int intVolatile = qs.a.getIntVolatile(this, g) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.a;
            if (atomicReferenceArray.get(intVolatile) != null) {
                Thread.yield();
            } else {
                atomicReferenceArray.lazySet(intVolatile, n76Var);
                b.incrementAndGet(this);
                return null;
            }
        }
    }

    public final int b() {
        return qs.a.getIntVolatile(this, g) - qs.a.getIntVolatile(this, e);
    }

    public final n76 c() {
        n76 n76Var;
        while (true) {
            Unsafe unsafe = qs.a;
            long j = e;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile - unsafe.getIntVolatile(this, g) == 0) {
                return null;
            }
            int i = intVolatile & 127;
            v77 v77Var = this;
            if (!unsafe.compareAndSwapInt(v77Var, j, intVolatile, intVolatile + 1) || (n76Var = (n76) v77Var.a.getAndSet(i, null)) == null) {
                this = v77Var;
            } else {
                if (n76Var.y) {
                    c.decrementAndGet(v77Var);
                }
                return n76Var;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
    
        if (r6 == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0019, code lost:
    
        defpackage.v77.c.decrementAndGet(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r1.y == r6) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r0.compareAndSet(r5, r1, null) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r0.get(r5) == r1) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.n76 d(int r5, boolean r6) {
        /*
            r4 = this;
            r5 = r5 & 127(0x7f, float:1.78E-43)
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r4.a
            java.lang.Object r1 = r0.get(r5)
            n76 r1 = (defpackage.n76) r1
            r2 = 0
            if (r1 == 0) goto L25
            boolean r3 = r1.y
            if (r3 != r6) goto L25
        L11:
            boolean r3 = r0.compareAndSet(r5, r1, r2)
            if (r3 == 0) goto L1f
            if (r6 == 0) goto L1e
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = defpackage.v77.c
            r5.decrementAndGet(r4)
        L1e:
            return r1
        L1f:
            java.lang.Object r3 = r0.get(r5)
            if (r3 == r1) goto L11
        L25:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v77.d(int, boolean):n76");
    }
}
