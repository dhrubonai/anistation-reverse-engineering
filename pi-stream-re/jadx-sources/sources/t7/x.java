package t7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p7.p1;

/* loaded from: classes.dex */
public abstract class x extends e implements p1 {

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f10090d = AtomicIntegerFieldUpdater.newUpdater(x.class, "cleanedAndPointers");

    /* renamed from: c, reason: collision with root package name */
    public final long f10091c;
    private volatile int cleanedAndPointers;

    public x(long j4, x xVar, int i10) {
        super(xVar);
        this.f10091c = j4;
        this.cleanedAndPointers = i10 << 16;
    }

    @Override // t7.e
    public final boolean a() {
        e eVar;
        boolean z9;
        if (f10090d.get(this) != d()) {
            return false;
        }
        Object obj = e.f10056a.get(this);
        if (obj == d.f10055a) {
            eVar = null;
        } else {
            eVar = (e) obj;
        }
        if (eVar == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        e eVar;
        boolean z9;
        if (f10090d.addAndGet(this, -65536) != d()) {
            return false;
        }
        Object obj = e.f10056a.get(this);
        if (obj == d.f10055a) {
            eVar = null;
        } else {
            eVar = (e) obj;
        }
        if (eVar == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            return false;
        }
        return true;
    }

    public abstract int d();

    public abstract void e(int i10);

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0029 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f() {
        /*
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = t7.x.f10090d
            int r1 = r0.get(r6)
            int r2 = r6.d()
            r3 = 1
            r4 = 0
            if (r1 != r2) goto L26
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = t7.e.f10056a
            java.lang.Object r2 = r2.get(r6)
            w4.o r5 = t7.d.f10055a
            if (r2 != r5) goto L1a
            r2 = 0
            goto L1c
        L1a:
            t7.e r2 = (t7.e) r2
        L1c:
            if (r2 != 0) goto L20
            r2 = r3
            goto L21
        L20:
            r2 = r4
        L21:
            if (r2 == 0) goto L24
            goto L26
        L24:
            r2 = r4
            goto L27
        L26:
            r2 = r3
        L27:
            if (r2 != 0) goto L2b
            r3 = r4
            goto L34
        L2b:
            r2 = 65536(0x10000, float:9.1835E-41)
            int r2 = r2 + r1
            boolean r0 = r0.compareAndSet(r6, r1, r2)
            if (r0 == 0) goto L0
        L34:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.x.f():boolean");
    }
}
