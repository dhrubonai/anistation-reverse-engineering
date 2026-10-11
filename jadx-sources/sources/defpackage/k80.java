package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class k80 implements ic2 {
    public final /* synthetic */ String A;
    public final /* synthetic */ String B;
    public final /* synthetic */ String C;
    public final /* synthetic */ os0 D;
    public final /* synthetic */ do5 x;
    public final /* synthetic */ v11 y;
    public final /* synthetic */ boolean z;

    public k80(do5 do5Var, v11 v11Var, boolean z, String str, String str2, String str3, os0 os0Var) {
        this.x = do5Var;
        this.y = v11Var;
        this.z = z;
        this.A = str;
        this.B = str2;
        this.C = str3;
        this.D = os0Var;
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
            do5 do5Var = this.x;
            boolean f = kd2Var.f(do5Var);
            v11 v11Var = this.y;
            boolean h = f | kd2Var.h(v11Var);
            Object Q = kd2Var.Q();
            q18 q18Var = au0.a;
            if (h || Q == q18Var) {
                Q = new h80(do5Var, v11Var, (byte) 0);
                kd2Var.n0(Q);
            }
            yz3 m = q23.m((sb2) Q);
            boolean f2 = kd2Var.f(do5Var) | kd2Var.g(this.z) | kd2Var.f(this.A) | kd2Var.h(v11Var) | kd2Var.f(this.B) | kd2Var.f(this.C);
            Object Q2 = kd2Var.Q();
            if (f2 || Q2 == q18Var) {
                i80 i80Var = new i80((byte) 0, this.x, this.A, this.B, this.C, this.y, this.z);
                kd2Var.n0(i80Var);
                Q2 = i80Var;
            }
            yz3 a = rh5.a(m, true, (ub2) Q2);
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
            this.D.invoke(kd2Var, 0);
            kd2Var.q(true);
        } else {
            kd2Var.Y();
        }
        return pn6.a;
    }
}
