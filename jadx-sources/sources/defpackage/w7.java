package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class w7 {
    public static final sk6 a = z51.V(0, 7, null);
    public static final b3 b = new b3(3);

    static {
        Math.abs(0.1f);
    }

    public static ys5 a(e9 e9Var, ub2 ub2Var, ll llVar, kd2 kd2Var) {
        ud1 ud1Var = (ud1) kd2Var.j(bv0.h);
        boolean f = kd2Var.f(ud1Var) | kd2Var.f(e9Var) | kd2Var.f(llVar);
        Object Q = kd2Var.Q();
        if (f || Q == au0.a) {
            Q = new ys5(new dn0((Object) e9Var, (Object) ub2Var, (Object) new y7(ud1Var, (byte) 0), (byte) 3), llVar);
            kd2Var.n0(Q);
        }
        return (ys5) Q;
    }
}
