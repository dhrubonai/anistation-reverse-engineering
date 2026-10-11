package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class y75 {
    public static final z75 a = new z75(x97.y, pk2.H);

    public static final z75 a(ur urVar, x50 x50Var, kd2 kd2Var, int i) {
        boolean z;
        if (urVar.equals(x97.y) && a34.i(x50Var, pk2.H)) {
            kd2Var.e0(-1073830487);
            kd2Var.q(false);
            return a;
        }
        kd2Var.e0(-1073779616);
        boolean z2 = true;
        if ((((i & 14) ^ 6) > 4 && kd2Var.f(urVar)) || (i & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        if ((((i & 112) ^ 48) <= 32 || !kd2Var.f(x50Var)) && (i & 48) != 32) {
            z2 = false;
        }
        boolean z3 = z | z2;
        Object Q = kd2Var.Q();
        if (z3 || Q == au0.a) {
            Q = new z75(urVar, x50Var);
            kd2Var.n0(Q);
        }
        z75 z75Var = (z75) Q;
        kd2Var.q(false);
        return z75Var;
    }
}
