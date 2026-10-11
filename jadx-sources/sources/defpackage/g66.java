package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class g66 implements ic2 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ sb2 B;
    public final /* synthetic */ os0 C;
    public final /* synthetic */ yz3 x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ by2 z;

    public g66(yz3 yz3Var, boolean z, l65 l65Var, boolean z2, sb2 sb2Var, os0 os0Var) {
        this.x = yz3Var;
        this.y = z;
        this.z = l65Var;
        this.A = z2;
        this.B = sb2Var;
        this.C = os0Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        kd2 kd2Var = (kd2) obj;
        int intValue = ((Number) obj2).intValue();
        if ((intValue & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(intValue & 1, z)) {
            yz3 c = ar5.c(bx7.L(this.x, this.y, this.z, this.A, new m65(4), this.B), 1.0f);
            xp0 a = vp0.a(x97.A, pk2.L, kd2Var, 54);
            int s = h98.s(kd2Var);
            al4 l = kd2Var.l();
            yz3 E = o80.E(kd2Var, c);
            tt0.d.getClass();
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(za3.p0);
            } else {
                kd2Var.q0();
            }
            ss5.i(p7.F, kd2Var, a);
            ss5.i(p7.E, kd2Var, l);
            st0 st0Var = p7.G;
            if (kd2Var.S || !a34.i(kd2Var.Q(), Integer.valueOf(s))) {
                h11.p(s, kd2Var, s, st0Var);
            }
            ss5.i(p7.D, kd2Var, E);
            this.C.invoke(yp0.a, kd2Var, 6);
            kd2Var.q(true);
        } else {
            kd2Var.Y();
        }
        return pn6.a;
    }
}
