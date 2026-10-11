package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class vp0 {
    public static final xp0 a = new xp0(x97.z, pk2.K);

    public static final xp0 a(wr wrVar, w50 w50Var, kd2 kd2Var, int i) {
        boolean z;
        if (wrVar.equals(x97.z) && w50Var.equals(pk2.K)) {
            kd2Var.e0(-1446604504);
            kd2Var.q(false);
            return a;
        }
        kd2Var.e0(-1446550657);
        boolean z2 = true;
        if ((((i & 14) ^ 6) > 4 && kd2Var.f(wrVar)) || (i & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        if ((((i & 112) ^ 48) <= 32 || !kd2Var.f(w50Var)) && (i & 48) != 32) {
            z2 = false;
        }
        boolean z3 = z | z2;
        Object Q = kd2Var.Q();
        if (z3 || Q == au0.a) {
            Q = new xp0(wrVar, w50Var);
            kd2Var.n0(Q);
        }
        xp0 xp0Var = (xp0) Q;
        kd2Var.q(false);
        return xp0Var;
    }
}
