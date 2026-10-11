package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lh1 extends ec5 {
    public static final /* synthetic */ long C = qs.a.objectFieldOffset(lh1.class.getDeclaredField("_decision$volatile"));
    private volatile /* synthetic */ int _decision$volatile;

    @Override // defpackage.ec5, defpackage.t43
    public final void m(Object obj) {
        n(obj);
    }

    @Override // defpackage.ec5, defpackage.t43
    public final void n(Object obj) {
        while (true) {
            Unsafe unsafe = qs.a;
            long j = C;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile != 0) {
                if (intVolatile == 1) {
                    kh1.a(wc7.z(this.B), bx7.J(obj));
                    return;
                } else {
                    ze0.m("Already resumed");
                    return;
                }
            }
            lh1 lh1Var = this;
            if (unsafe.compareAndSwapInt(lh1Var, j, 0, 2)) {
                return;
            } else {
                this = lh1Var;
            }
        }
    }
}
