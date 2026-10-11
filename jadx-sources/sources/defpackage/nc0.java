package defpackage;

import java.io.IOException;
import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class nc0 implements wc0, ae0 {
    public static final /* synthetic */ long g;
    public static final /* synthetic */ long h;
    public static final /* synthetic */ long i;
    public final boolean b;
    private volatile int flushBufferSize;
    public final oa0 c = new Object();
    public final Object d = new Object();
    volatile /* synthetic */ Object suspensionSlot = fc0.b;
    public final oa0 e = new Object();
    public final oa0 f = new Object();
    volatile /* synthetic */ Object _closedCause = null;
    private volatile /* synthetic */ Object closeHandler = null;

    static {
        Unsafe unsafe = qs.a;
        i = unsafe.objectFieldOffset(nc0.class.getDeclaredField("suspensionSlot"));
        g = unsafe.objectFieldOffset(nc0.class.getDeclaredField("_closedCause"));
        h = unsafe.objectFieldOffset(nc0.class.getDeclaredField("closeHandler"));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, oa0] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, oa0] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, oa0] */
    public nc0(boolean z) {
        this.b = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wc0
    public final void a(Throwable th) {
        nc0 nc0Var;
        Throwable co0Var;
        if (this._closedCause != null) {
            return;
        }
        zn0 zn0Var = new zn0(th);
        while (true) {
            Unsafe unsafe = qs.a;
            long j = g;
            nc0Var = this;
            if (!unsafe.compareAndSwapObject(nc0Var, j, (Object) null, zn0Var) && unsafe.getObjectVolatile(nc0Var, j) == null) {
                this = nc0Var;
            }
        }
        Throwable th2 = zn0Var.a;
        if (th2 == 0) {
            co0Var = null;
        } else if (th2 instanceof m01) {
            co0Var = ((m01) th2).a();
        } else if (th2 instanceof CancellationException) {
            co0Var = z51.b(((CancellationException) th2).getMessage(), zn0Var.a);
        } else {
            co0Var = new co0(th2);
        }
        nc0Var.k(co0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wc0
    public final Throwable b() {
        Throwable th;
        zn0 zn0Var = (zn0) this._closedCause;
        if (zn0Var != null && (th = zn0Var.a) != 0) {
            if (th instanceof m01) {
                return ((m01) th).a();
            }
            if (th instanceof CancellationException) {
                return z51.b(((CancellationException) th).getMessage(), zn0Var.a);
            }
            return new co0(th);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x013c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x013d -> B:10:0x013f). Please report as a decompilation issue!!! */
    @Override // defpackage.wc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(int r21, defpackage.xz0 r22) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nc0.c(int, xz0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0113 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0114 -> B:10:0x0116). Please report as a decompilation issue!!! */
    @Override // defpackage.ae0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.vz0 r23) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nc0.d(vz0):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ae0
    public final qq5 e() {
        Throwable co0Var;
        if (m()) {
            zn0 zn0Var = (zn0) this._closedCause;
            if (zn0Var != null) {
                Throwable th = zn0Var.a;
                if (th == 0) {
                    co0Var = null;
                } else if (th instanceof m01) {
                    co0Var = ((m01) th).a();
                } else if (th instanceof CancellationException) {
                    co0Var = z51.b(((CancellationException) th).getMessage(), zn0Var.a);
                } else {
                    co0Var = new co0(th);
                }
                if (co0Var != null) {
                    throw co0Var;
                }
            }
            throw new IOException(null, null);
        }
        return this.f;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:25|26))(4:27|28|29|(1:31))|11|12|(2:13|(3:21|22|23)(2:15|(2:18|19)(1:17)))))|33|6|7|(0)(0)|11|12|(3:13|(0)(0)|17)) */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    @Override // defpackage.ae0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.vz0 r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.mc0
            if (r0 == 0) goto L13
            r0 = r10
            mc0 r0 = (defpackage.mc0) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            mc0 r0 = new mc0
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.x
            int r1 = r0.z
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.m37.N(r10)     // Catch: java.lang.Throwable -> L3a
            goto L3a
        L26:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r9)
            return r2
        L2c:
            defpackage.m37.N(r10)
            r0.z = r3     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r10 = r9.d(r0)     // Catch: java.lang.Throwable -> L3a
            w11 r0 = defpackage.w11.x
            if (r10 != r0) goto L3a
            return r0
        L3a:
            zn0 r8 = defpackage.io3.a
        L3c:
            sun.misc.Unsafe r3 = defpackage.qs.a
            long r5 = defpackage.nc0.g
            r7 = 0
            r4 = r9
            boolean r9 = r3.compareAndSwapObject(r4, r5, r7, r8)
            pn6 r10 = defpackage.pn6.a
            if (r9 == 0) goto L4e
            r4.k(r2)
            return r10
        L4e:
            java.lang.Object r9 = r3.getObjectVolatile(r4, r5)
            if (r9 == 0) goto L55
            return r10
        L55:
            r9 = r4
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nc0.f(vz0):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wc0
    public final oa0 g() {
        Throwable co0Var;
        zn0 zn0Var = (zn0) this._closedCause;
        if (zn0Var != null) {
            Throwable th = zn0Var.a;
            if (th == 0) {
                co0Var = null;
            } else if (th instanceof m01) {
                co0Var = ((m01) th).a();
            } else if (th instanceof CancellationException) {
                co0Var = z51.b(((CancellationException) th).getMessage(), zn0Var.a);
            } else {
                co0Var = new co0(th);
            }
            if (co0Var != null) {
                throw co0Var;
            }
        }
        if (this.e.D()) {
            n();
        }
        return this.e;
    }

    @Override // defpackage.wc0
    public final boolean h() {
        if (b() == null) {
            if (!m() || this.flushBufferSize != 0 || !this.e.D()) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // defpackage.ae0
    public final boolean i() {
        return this.b;
    }

    public final void j() {
        l();
        zn0 zn0Var = io3.a;
        while (true) {
            Unsafe unsafe = qs.a;
            long j = g;
            nc0 nc0Var = this;
            if (unsafe.compareAndSwapObject(nc0Var, j, (Object) null, zn0Var)) {
                nc0Var.k(null);
                return;
            } else if (unsafe.getObjectVolatile(nc0Var, j) != null) {
                return;
            } else {
                this = nc0Var;
            }
        }
    }

    public final void k(Throwable th) {
        ec0 ec0Var;
        if (th != null) {
            ec0Var = new ec0(th);
        } else {
            jc0.a.getClass();
            ec0Var = h95.A;
        }
        jc0 jc0Var = (jc0) qs.a.getAndSetObject(this, i, ec0Var);
        if (jc0Var instanceof hc0) {
            ((hc0) jc0Var).a(th);
        }
        ub2 ub2Var = (ub2) qs.a.getAndSetObject(this, h, (Object) null);
        if (ub2Var != null) {
            ub2Var.invoke(th);
        }
    }

    public final void l() {
        if (!this.f.D()) {
            synchronized (this.d) {
                oa0 oa0Var = this.f;
                int i2 = (int) oa0Var.z;
                this.c.G(oa0Var);
                this.flushBufferSize += i2;
            }
            jc0 jc0Var = (jc0) this.suspensionSlot;
            if (jc0Var instanceof gc0) {
                fc0 fc0Var = fc0.b;
                while (true) {
                    nc0 nc0Var = this;
                    if (qs.a.compareAndSwapObject(nc0Var, i, jc0Var, fc0Var)) {
                        ((hc0) jc0Var).b();
                        return;
                    } else if (qs.a.getObjectVolatile(nc0Var, i) != jc0Var) {
                        return;
                    } else {
                        this = nc0Var;
                    }
                }
            }
        }
    }

    public final boolean m() {
        if (this._closedCause != null) {
            return true;
        }
        return false;
    }

    public final void n() {
        synchronized (this.d) {
            this.c.I(this.e);
            this.flushBufferSize = 0;
        }
        jc0 jc0Var = (jc0) this.suspensionSlot;
        if (jc0Var instanceof ic0) {
            fc0 fc0Var = fc0.b;
            while (true) {
                nc0 nc0Var = this;
                if (qs.a.compareAndSwapObject(nc0Var, i, jc0Var, fc0Var)) {
                    ((hc0) jc0Var).b();
                    return;
                } else if (qs.a.getObjectVolatile(nc0Var, i) != jc0Var) {
                    return;
                } else {
                    this = nc0Var;
                }
            }
        }
    }

    public final String toString() {
        return "ByteChannel[" + hashCode() + ']';
    }
}
