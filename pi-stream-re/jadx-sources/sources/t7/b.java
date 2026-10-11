package t7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class b extends t {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f10051a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus");
    private volatile Object _consensus = a.f10048a;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if (r1 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        r1 = r0.get(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x001b, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r1 != r2) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r0.compareAndSet(r4, r2, r3) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r0.get(r4) == r2) goto L20;
     */
    @Override // t7.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r5) {
        /*
            r4 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = t7.b.f10051a
            java.lang.Object r1 = r0.get(r4)
            w4.o r2 = t7.a.f10048a
            if (r1 != r2) goto L2c
            w4.o r3 = r4.c(r5)
            java.lang.Object r1 = r0.get(r4)
            if (r1 == r2) goto L15
            goto L2c
        L15:
            boolean r1 = r0.compareAndSet(r4, r2, r3)
            if (r1 == 0) goto L1d
            r1 = 1
            goto L24
        L1d:
            java.lang.Object r1 = r0.get(r4)
            if (r1 == r2) goto L15
            r1 = 0
        L24:
            if (r1 == 0) goto L28
            r1 = r3
            goto L2c
        L28:
            java.lang.Object r1 = r0.get(r4)
        L2c:
            r4.b(r5, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.b.a(java.lang.Object):java.lang.Object");
    }

    public abstract void b(Object obj, Object obj2);

    public abstract w4.o c(Object obj);
}
