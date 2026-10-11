package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public class nk3 {
    public static final /* synthetic */ long a = qs.a.objectFieldOffset(nk3.class.getDeclaredField("_cur$volatile"));
    private volatile /* synthetic */ Object _cur$volatile = new pk3(8, false);

    public final boolean a(Runnable runnable) {
        nk3 nk3Var;
        while (true) {
            Unsafe unsafe = qs.a;
            long j = a;
            pk3 pk3Var = (pk3) unsafe.getObjectVolatile(this, j);
            int a2 = pk3Var.a(runnable);
            if (a2 == 0) {
                return true;
            }
            if (a2 != 1) {
                if (a2 != 2) {
                    nk3Var = this;
                } else {
                    return false;
                }
            } else {
                pk3 c = pk3Var.c();
                while (true) {
                    Unsafe unsafe2 = qs.a;
                    nk3Var = this;
                    if (!unsafe2.compareAndSwapObject(nk3Var, a, pk3Var, c) && unsafe2.getObjectVolatile(nk3Var, j) == pk3Var) {
                        this = nk3Var;
                    }
                }
            }
            this = nk3Var;
        }
    }

    public final void b() {
        nk3 nk3Var;
        while (true) {
            Unsafe unsafe = qs.a;
            long j = a;
            pk3 pk3Var = (pk3) unsafe.getObjectVolatile(this, j);
            if (pk3Var.b()) {
                return;
            }
            pk3 c = pk3Var.c();
            while (true) {
                nk3Var = this;
                if (!qs.a.compareAndSwapObject(nk3Var, a, pk3Var, c) && qs.a.getObjectVolatile(nk3Var, j) == pk3Var) {
                    this = nk3Var;
                }
            }
            this = nk3Var;
        }
    }

    public final int c() {
        pk3 pk3Var = (pk3) qs.a.getObjectVolatile(this, a);
        pk3Var.getClass();
        long longVolatile = qs.a.getLongVolatile(pk3Var, pk3.g);
        return 1073741823 & (((int) ((longVolatile & 1152921503533105152L) >> 30)) - ((int) (1073741823 & longVolatile)));
    }

    public final Object d() {
        nk3 nk3Var;
        while (true) {
            Unsafe unsafe = qs.a;
            long j = a;
            pk3 pk3Var = (pk3) unsafe.getObjectVolatile(this, j);
            Object d = pk3Var.d();
            if (d != pk3.e) {
                return d;
            }
            pk3 c = pk3Var.c();
            while (true) {
                nk3Var = this;
                if (!qs.a.compareAndSwapObject(nk3Var, a, pk3Var, c) && qs.a.getObjectVolatile(nk3Var, j) == pk3Var) {
                    this = nk3Var;
                }
            }
            this = nk3Var;
        }
    }
}
