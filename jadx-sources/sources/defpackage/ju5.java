package defpackage;

import java.io.IOException;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class ju5 extends rg5 implements d, e, v11 {
    public static final /* synthetic */ long C;
    public static final /* synthetic */ long D;
    public static final /* synthetic */ long E;
    public static final /* synthetic */ long F;
    private volatile /* synthetic */ int closeFlag = 0;
    private volatile /* synthetic */ int actualCloseFlag = 0;
    volatile /* synthetic */ Object readerJob = null;
    volatile /* synthetic */ Object writerJob = null;
    public final pp5 A = new pp5((Object) this, (byte) 4);
    public final j43 B = new j43(null);

    static {
        Unsafe unsafe = qs.a;
        D = unsafe.objectFieldOffset(ju5.class.getDeclaredField("closeFlag"));
        C = unsafe.objectFieldOffset(ju5.class.getDeclaredField("actualCloseFlag"));
        E = unsafe.objectFieldOffset(ju5.class.getDeclaredField("readerJob"));
        F = unsafe.objectFieldOffset(ju5.class.getDeclaredField("writerJob"));
    }

    public abstract Throwable G();

    public abstract k97 I(nc0 nc0Var);

    public abstract py4 T(nc0 nc0Var);

    @Override // defpackage.e
    public final py4 a(nc0 nc0Var) {
        if (this.closeFlag == 0) {
            py4 T = T(nc0Var);
            while (true) {
                Unsafe unsafe = qs.a;
                long j = E;
                ju5 ju5Var = this;
                if (unsafe.compareAndSwapObject(ju5Var, j, (Object) null, T)) {
                    if (ju5Var.closeFlag == 0) {
                        ((t43) T.c()).t(true, true, new tc0(nc0Var, (byte) 0));
                        pp5 pp5Var = ju5Var.A;
                        pp5Var.getClass();
                        ((t43) T.c()).l0(pp5Var);
                        return T;
                    }
                    IOException iOException = new IOException("Socket closed");
                    h41.f(T);
                    nc0Var.a(iOException);
                    throw iOException;
                }
                if (unsafe.getObjectVolatile(ju5Var, j) == null) {
                    this = ju5Var;
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("writing channel has already been set");
                    h41.f(T);
                    throw illegalStateException;
                }
            }
        } else {
            IOException iOException2 = new IOException("Socket closed");
            nc0Var.a(iOException2);
            throw iOException2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!qs.a.compareAndSwapInt(this, D, 0, 1)) {
            return;
        }
        tl7.z(this, new r11("socket-close"), null, new hu1(this, null, (byte) 1), 2);
    }

    @Override // defpackage.v11
    public final l11 getCoroutineContext() {
        return this.B;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k0() {
        /*
            r7 = this;
            int r0 = r7.closeFlag
            if (r0 == 0) goto Lad
            java.lang.Object r0 = r7.readerJob
            xj0 r0 = (defpackage.xj0) r0
            if (r0 == 0) goto L14
            h43 r0 = r0.c()
            boolean r0 = r0.k0()
            if (r0 == 0) goto Lad
        L14:
            java.lang.Object r0 = r7.writerJob
            xj0 r0 = (defpackage.xj0) r0
            if (r0 == 0) goto L24
            h43 r0 = r0.c()
            boolean r0 = r0.k0()
            if (r0 == 0) goto Lad
        L24:
            sun.misc.Unsafe r1 = defpackage.qs.a
            long r3 = defpackage.ju5.C
            r5 = 0
            r6 = 1
            r2 = r7
            boolean r7 = r1.compareAndSwapInt(r2, r3, r5, r6)
            if (r7 != 0) goto L33
            goto Lad
        L33:
            java.lang.Object r7 = r2.readerJob
            xj0 r7 = (defpackage.xj0) r7
            r0 = 0
            if (r7 == 0) goto L57
            h43 r1 = r7.c()
            boolean r1 = r1.isCancelled()
            if (r1 == 0) goto L45
            goto L46
        L45:
            r7 = r0
        L46:
            if (r7 == 0) goto L57
            h43 r7 = r7.c()
            java.util.concurrent.CancellationException r7 = r7.I()
            if (r7 == 0) goto L57
            java.lang.Throwable r7 = r7.getCause()
            goto L58
        L57:
            r7 = r0
        L58:
            java.lang.Object r1 = r2.writerJob
            xj0 r1 = (defpackage.xj0) r1
            if (r1 == 0) goto L7a
            h43 r3 = r1.c()
            boolean r3 = r3.isCancelled()
            if (r3 == 0) goto L69
            goto L6a
        L69:
            r1 = r0
        L6a:
            if (r1 == 0) goto L7a
            h43 r1 = r1.c()
            java.util.concurrent.CancellationException r1 = r1.I()
            if (r1 == 0) goto L7a
            java.lang.Throwable r0 = r1.getCause()
        L7a:
            java.lang.Throwable r1 = r2.G()
            if (r7 != 0) goto L82
            r7 = r0
            goto L8b
        L82:
            if (r0 != 0) goto L85
            goto L8b
        L85:
            if (r7 != r0) goto L88
            goto L8b
        L88:
            defpackage.n03.i(r7, r0)
        L8b:
            if (r7 != 0) goto L8e
            goto L99
        L8e:
            if (r1 != 0) goto L91
            goto L93
        L91:
            if (r7 != r1) goto L95
        L93:
            r1 = r7
            goto L99
        L95:
            defpackage.n03.i(r7, r1)
            goto L93
        L99:
            j43 r7 = r2.B
            if (r1 != 0) goto La1
            r7.g0()
            return
        La1:
            r7.getClass()
            dr0 r0 = new dr0
            r2 = 0
            r0.<init>(r1, r2)
            r7.Q(r0)
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ju5.k0():void");
    }

    @Override // defpackage.d
    public final k97 p(nc0 nc0Var) {
        if (this.closeFlag == 0) {
            k97 I = I(nc0Var);
            while (true) {
                Unsafe unsafe = qs.a;
                long j = F;
                ju5 ju5Var = this;
                if (unsafe.compareAndSwapObject(ju5Var, j, (Object) null, I)) {
                    if (ju5Var.closeFlag == 0) {
                        ((t43) I.c()).t(true, true, new tc0(nc0Var, (byte) 0));
                        pp5 pp5Var = ju5Var.A;
                        pp5Var.getClass();
                        ((t43) I.c()).l0(pp5Var);
                        return I;
                    }
                    IOException iOException = new IOException("Socket closed");
                    h41.f(I);
                    nc0Var.a(iOException);
                    throw iOException;
                }
                if (unsafe.getObjectVolatile(ju5Var, j) == null) {
                    this = ju5Var;
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("reading channel has already been set");
                    h41.f(I);
                    throw illegalStateException;
                }
            }
        } else {
            IOException iOException2 = new IOException("Socket closed");
            nc0Var.a(iOException2);
            throw iOException2;
        }
    }
}
