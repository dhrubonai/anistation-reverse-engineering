package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class iv0 {
    public static final ni1 a = new ni1("CLOSED", (byte) 2);

    public static final Object a(ag5 ag5Var, long j, ic2 ic2Var) {
        while (true) {
            ag5 ag5Var2 = ag5Var;
            while (true) {
                if (ag5Var2.A >= j && !ag5Var2.d()) {
                    return ag5Var2;
                }
                Object objectVolatile = qs.a.getObjectVolatile(ag5Var2, jv0.x);
                ni1 ni1Var = a;
                if (objectVolatile == ni1Var) {
                    return ni1Var;
                }
                ag5Var = (ag5) ((jv0) objectVolatile);
                if (ag5Var != null) {
                    break;
                }
                ag5 ag5Var3 = (ag5) ic2Var.invoke(Long.valueOf(ag5Var2.A + 1), ag5Var2);
                while (true) {
                    Unsafe unsafe = qs.a;
                    long j2 = jv0.x;
                    if (unsafe.compareAndSwapObject(ag5Var2, j2, (Object) null, ag5Var3)) {
                        if (ag5Var2.d()) {
                            ag5Var2.e();
                        }
                        ag5Var2 = ag5Var3;
                    } else if (unsafe.getObjectVolatile(ag5Var2, j2) != null) {
                        break;
                    }
                }
            }
        }
    }
}
