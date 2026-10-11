package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class nz3 implements ic2 {
    public final /* synthetic */ sz3 A;
    public final /* synthetic */ wj B;
    public final /* synthetic */ v11 C;
    public final /* synthetic */ ub2 D;
    public final /* synthetic */ yz3 E;
    public final /* synthetic */ float F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ om5 H;
    public final /* synthetic */ long I;
    public final /* synthetic */ long J;
    public final /* synthetic */ ic2 K;
    public final /* synthetic */ ic2 L;
    public final /* synthetic */ os0 M;
    public final /* synthetic */ long x;
    public final /* synthetic */ sb2 y;
    public final /* synthetic */ do5 z;

    public nz3(long j, sb2 sb2Var, do5 do5Var, sz3 sz3Var, wj wjVar, v11 v11Var, ub2 ub2Var, yz3 yz3Var, float f, boolean z, om5 om5Var, long j2, long j3, ic2 ic2Var, ic2 ic2Var2, os0 os0Var) {
        this.x = j;
        this.y = sb2Var;
        this.z = do5Var;
        this.A = sz3Var;
        this.B = wjVar;
        this.C = v11Var;
        this.D = ub2Var;
        this.E = yz3Var;
        this.F = f;
        this.G = z;
        this.H = om5Var;
        this.I = j2;
        this.J = j3;
        this.K = ic2Var;
        this.L = ic2Var2;
        this.M = os0Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        kd2 kd2Var = (kd2) obj;
        int intValue = ((Number) obj2).intValue();
        boolean z2 = false;
        if ((intValue & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(intValue & 1, z)) {
            yz3 X = z51.X(ar5.c, z51.q);
            Object Q = kd2Var.Q();
            if (Q == au0.a) {
                Q = new p03((byte) 20);
                kd2Var.n0(Q);
            }
            yz3 a = rh5.a(X, false, (ub2) Q);
            vo3 c = b90.c(pk2.y, false);
            int s = h98.s(kd2Var);
            al4 l = kd2Var.l();
            yz3 E = o80.E(kd2Var, a);
            tt0.d.getClass();
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(za3.p0);
            } else {
                kd2Var.q0();
            }
            ss5.i(p7.F, kd2Var, c);
            ss5.i(p7.E, kd2Var, l);
            st0 st0Var = p7.G;
            if (kd2Var.S || !a34.i(kd2Var.Q(), Integer.valueOf(s))) {
                h11.p(s, kd2Var, s, st0Var);
            }
            ss5.i(p7.D, kd2Var, E);
            do5 do5Var = this.z;
            if (((eo5) do5Var.e.h.getValue()) != eo5.x) {
                z2 = true;
            }
            boolean z3 = this.A.b;
            long j = this.x;
            sb2 sb2Var = this.y;
            rz3.c(j, sb2Var, z2, z3, kd2Var, 0);
            rz3.b(this.B, this.C, sb2Var, this.D, this.E, do5Var, this.F, this.G, this.H, this.I, this.J, 0.0f, this.K, this.L, this.M, kd2Var, 70);
            kd2Var.q(true);
        } else {
            kd2Var.Y();
        }
        return pn6.a;
    }
}
