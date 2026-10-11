package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class m54 extends fi5 implements k54 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater F = AtomicReferenceFieldUpdater.newUpdater(m54.class, Object.class, "owner$volatile");
    public static final /* synthetic */ long G = qs.a.objectFieldOffset(m54.class.getDeclaredField("owner$volatile"));
    private volatile /* synthetic */ Object owner$volatile;

    public m54() {
        super(1);
        this.owner$volatile = n54.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0022, code lost:
    
        r0.h(r1, r4.y);
     */
    @Override // defpackage.k54
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.vz0 r5) {
        /*
            r4 = this;
            boolean r0 = r4.f()
            pn6 r1 = defpackage.pn6.a
            if (r0 == 0) goto L9
            goto L3b
        L9:
            vz0 r5 = defpackage.wc7.z(r5)
            qg0 r5 = defpackage.te4.E(r5)
            l54 r0 = new l54     // Catch: java.lang.Throwable -> L3c
            r0.<init>(r4, r5)     // Catch: java.lang.Throwable -> L3c
        L16:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = defpackage.fi5.B     // Catch: java.lang.Throwable -> L3c
            int r2 = r2.getAndDecrement(r4)     // Catch: java.lang.Throwable -> L3c
            int r3 = r4.x     // Catch: java.lang.Throwable -> L3c
            if (r2 > r3) goto L16
            if (r2 <= 0) goto L28
            fr5 r4 = r4.y     // Catch: java.lang.Throwable -> L3c
            r0.h(r1, r4)     // Catch: java.lang.Throwable -> L3c
            goto L2e
        L28:
            boolean r2 = r4.c(r0)     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L16
        L2e:
            java.lang.Object r4 = r5.r()
            w11 r5 = defpackage.w11.x
            if (r4 != r5) goto L37
            goto L38
        L37:
            r4 = r1
        L38:
            if (r4 != r5) goto L3b
            return r4
        L3b:
            return r1
        L3c:
            r4 = move-exception
            r5.A()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m54.a(vz0):java.lang.Object");
    }

    public final boolean e() {
        if (Math.max(qs.a.getIntVolatile(this, fi5.C), 0) != 0) {
            return false;
        }
        return true;
    }

    public final boolean f() {
        m54 m54Var;
        while (true) {
            Unsafe unsafe = qs.a;
            long j = fi5.C;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile > this.x) {
                while (true) {
                    Unsafe unsafe2 = qs.a;
                    long j2 = fi5.C;
                    int intVolatile2 = unsafe2.getIntVolatile(this, j2);
                    int i = this.x;
                    if (intVolatile2 > i) {
                        m54 m54Var2 = this;
                        m54Var = m54Var2;
                        if (unsafe2.compareAndSwapInt(m54Var2, j2, intVolatile2, i)) {
                            break;
                        }
                        this = m54Var;
                    } else {
                        m54Var = this;
                        break;
                    }
                }
            } else {
                m54Var = this;
                if (intVolatile <= 0) {
                    return false;
                }
                if (unsafe.compareAndSwapInt(m54Var, j, intVolatile, intVolatile - 1)) {
                    unsafe.putObjectVolatile(m54Var, G, (Object) null);
                    return true;
                }
            }
            this = m54Var;
        }
    }

    @Override // defpackage.k54
    public final void l(Object obj) {
        while (this.e()) {
            Unsafe unsafe = qs.a;
            long j = G;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            ni1 ni1Var = n54.a;
            if (objectVolatile != ni1Var) {
                if (objectVolatile != obj && obj != null) {
                    ov3.i("This mutex is locked by ", objectVolatile, ", but ", obj, " is expected");
                    return;
                }
                while (true) {
                    m54 m54Var = this;
                    if (qs.a.compareAndSwapObject(m54Var, G, objectVolatile, ni1Var)) {
                        m54Var.d();
                        return;
                    } else {
                        if (qs.a.getObjectVolatile(m54Var, j) != objectVolatile) {
                            this = m54Var;
                            break;
                        }
                        this = m54Var;
                    }
                }
            }
        }
        ze0.m("This mutex is not locked");
    }

    public final String toString() {
        return "Mutex@" + z51.t(this) + "[isLocked=" + e() + ",owner=" + qs.a.getObjectVolatile(this, G) + ']';
    }
}
