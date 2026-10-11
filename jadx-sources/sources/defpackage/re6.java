package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class re6 extends k43 {
    public static final /* synthetic */ long D = qs.a.objectFieldOffset(re6.class.getDeclaredField("_state$volatile"));
    public final Thread B = Thread.currentThread();
    public ei1 C;
    private volatile /* synthetic */ int _state$volatile;

    public static void n(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    @Override // defpackage.k43
    public final boolean j() {
        return true;
    }

    @Override // defpackage.k43
    public final void k(Throwable th) {
        while (true) {
            Unsafe unsafe = qs.a;
            long j = D;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile != 0) {
                if (intVolatile != 1 && intVolatile != 2 && intVolatile != 3) {
                    n(intVolatile);
                    throw null;
                }
                return;
            }
            re6 re6Var = this;
            if (unsafe.compareAndSwapInt(re6Var, D, intVolatile, 2)) {
                re6Var.B.interrupt();
                unsafe.putIntVolatile(re6Var, j, 3);
                return;
            }
            this = re6Var;
        }
    }

    public final void m() {
        re6 re6Var;
        while (true) {
            Unsafe unsafe = qs.a;
            long j = D;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile != 0) {
                if (intVolatile != 2) {
                    if (intVolatile == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        n(intVolatile);
                        throw null;
                    }
                }
                re6Var = this;
            } else {
                re6Var = this;
                if (unsafe.compareAndSwapInt(re6Var, j, intVolatile, 1)) {
                    ei1 ei1Var = re6Var.C;
                    if (ei1Var != null) {
                        ei1Var.dispose();
                        return;
                    }
                    return;
                }
            }
            this = re6Var;
        }
    }
}
