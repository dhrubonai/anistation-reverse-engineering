package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class kk3 {
    public static final /* synthetic */ long a = qs.a.objectFieldOffset(kk3.class.getDeclaredField("curRef"));
    private volatile /* synthetic */ Object curRef = new mk3(8);

    public final boolean a(rg5 rg5Var) {
        kk3 kk3Var;
        while (true) {
            mk3 mk3Var = (mk3) this.curRef;
            int a2 = mk3Var.a(rg5Var);
            if (a2 == 0) {
                return true;
            }
            if (a2 != 1) {
                if (a2 != 2) {
                    kk3Var = this;
                } else {
                    return false;
                }
            } else {
                mk3 d = mk3Var.d();
                while (true) {
                    Unsafe unsafe = qs.a;
                    long j = a;
                    kk3Var = this;
                    if (!unsafe.compareAndSwapObject(kk3Var, j, mk3Var, d) && unsafe.getObjectVolatile(kk3Var, j) == mk3Var) {
                        this = kk3Var;
                    }
                }
            }
            this = kk3Var;
        }
    }

    public final void b() {
        kk3 kk3Var;
        while (true) {
            mk3 mk3Var = (mk3) this.curRef;
            if (mk3Var.b()) {
                return;
            }
            mk3 d = mk3Var.d();
            while (true) {
                Unsafe unsafe = qs.a;
                long j = a;
                kk3Var = this;
                if (!unsafe.compareAndSwapObject(kk3Var, j, mk3Var, d) && unsafe.getObjectVolatile(kk3Var, j) == mk3Var) {
                    this = kk3Var;
                }
            }
            this = kk3Var;
        }
    }

    public final boolean c() {
        return ((mk3) this.curRef).c();
    }

    public final Object d() {
        kk3 kk3Var;
        while (true) {
            mk3 mk3Var = (mk3) this.curRef;
            Object e = mk3Var.e();
            if (e != mk3.d) {
                return e;
            }
            mk3 d = mk3Var.d();
            while (true) {
                Unsafe unsafe = qs.a;
                long j = a;
                kk3Var = this;
                if (!unsafe.compareAndSwapObject(kk3Var, j, mk3Var, d) && unsafe.getObjectVolatile(kk3Var, j) == mk3Var) {
                    this = kk3Var;
                }
            }
            this = kk3Var;
        }
    }
}
