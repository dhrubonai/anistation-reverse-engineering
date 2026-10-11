package u7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f10330b = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "lastScheduledTask");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f10331c = AtomicIntegerFieldUpdater.newUpdater(l.class, "producerIndex");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f10332d = AtomicIntegerFieldUpdater.newUpdater(l.class, "consumerIndex");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f10333e = AtomicIntegerFieldUpdater.newUpdater(l.class, "blockingTasksInBuffer");

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray f10334a = new AtomicReferenceArray(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    public final h a(h hVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f10331c;
        if (atomicIntegerFieldUpdater.get(this) - f10332d.get(this) == 127) {
            return hVar;
        }
        boolean z9 = true;
        if (hVar.f10319b.f4108a != 1) {
            z9 = false;
        }
        if (z9) {
            f10333e.incrementAndGet(this);
        }
        int i10 = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f10334a;
            if (atomicReferenceArray.get(i10) != null) {
                Thread.yield();
            } else {
                atomicReferenceArray.lazySet(i10, hVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
        }
    }

    public final h b() {
        h hVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f10332d;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 - f10331c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 + 1) && (hVar = (h) this.f10334a.getAndSet(i11, null)) != null) {
                boolean z9 = true;
                if (hVar.f10319b.f4108a != 1) {
                    z9 = false;
                }
                if (z9) {
                    f10333e.decrementAndGet(this);
                }
                return hVar;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r0.get(r7) == r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if (r4 == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        if (r8 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        u7.l.f10333e.decrementAndGet(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0020, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r3 == r8) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0.compareAndSet(r7, r1, null) == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final u7.h c(int r7, boolean r8) {
        /*
            r6 = this;
            r7 = r7 & 127(0x7f, float:1.78E-43)
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r6.f10334a
            java.lang.Object r1 = r0.get(r7)
            u7.h r1 = (u7.h) r1
            r2 = 0
            if (r1 == 0) goto L32
            f9.x r3 = r1.f10319b
            int r3 = r3.f4108a
            r4 = 0
            r5 = 1
            if (r3 != r5) goto L17
            r3 = r5
            goto L18
        L17:
            r3 = r4
        L18:
            if (r3 != r8) goto L32
        L1a:
            boolean r3 = r0.compareAndSet(r7, r1, r2)
            if (r3 == 0) goto L22
            r4 = r5
            goto L28
        L22:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r1) goto L1a
        L28:
            if (r4 == 0) goto L32
            if (r8 == 0) goto L31
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r7 = u7.l.f10333e
            r7.decrementAndGet(r6)
        L31:
            return r1
        L32:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.l.c(int, boolean):u7.h");
    }
}
