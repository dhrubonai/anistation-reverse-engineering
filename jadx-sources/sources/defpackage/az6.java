package defpackage;

import com.anistation.model.download.EpisodeDownload;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class az6 implements jc2 {
    public final /* synthetic */ jc2 A;
    public final /* synthetic */ v11 B;
    public final /* synthetic */ n80 C;
    public final /* synthetic */ ub2 D;
    public final /* synthetic */ ub2 E;
    public final /* synthetic */ ub2 F;
    public final /* synthetic */ qi4 G;
    public final /* synthetic */ w44 H;
    public final /* synthetic */ ym6 x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ boolean z;

    public /* synthetic */ az6(ym6 ym6Var, boolean z, boolean z2, jc2 jc2Var, v11 v11Var, n80 n80Var, ub2 ub2Var, ub2 ub2Var2, ub2 ub2Var3, qi4 qi4Var, w44 w44Var) {
        this.x = ym6Var;
        this.y = z;
        this.z = z2;
        this.A = jc2Var;
        this.B = v11Var;
        this.C = n80Var;
        this.D = ub2Var;
        this.E = ub2Var2;
        this.F = ub2Var3;
        this.G = qi4Var;
        this.H = w44Var;
    }

    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        kd2 kd2Var = (kd2) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((zc3) obj).getClass();
        if ((intValue & 17) != 16) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(intValue & 1, z)) {
            Object Q = kd2Var.Q();
            Object obj4 = au0.a;
            if (Q == obj4) {
                Q = new we1(this.G, (byte) 4);
                kd2Var.n0(Q);
            }
            yz3 D = m37.D(vz3.x, (ub2) Q);
            ym6 ym6Var = this.x;
            boolean z2 = ym6Var.z;
            boolean z3 = ym6Var.D;
            EpisodeDownload d = ym6Var.d();
            boolean h = kd2Var.h(ym6Var);
            Object obj5 = this.A;
            boolean f = h | kd2Var.f(obj5);
            Object Q2 = kd2Var.Q();
            if (f || Q2 == obj4) {
                Q2 = new lb5(ym6Var, obj5, (byte) 20);
                kd2Var.n0(Q2);
            }
            sb2 sb2Var = (sb2) Q2;
            v11 v11Var = this.B;
            boolean h2 = kd2Var.h(v11Var);
            n80 n80Var = this.C;
            boolean f2 = h2 | kd2Var.f(n80Var);
            Object Q3 = kd2Var.Q();
            if (f2 || Q3 == obj4) {
                Q3 = new ry6(v11Var, this.H, n80Var);
                kd2Var.n0(Q3);
            }
            sb2 sb2Var2 = (sb2) Q3;
            ub2 ub2Var = this.D;
            boolean f3 = kd2Var.f(ub2Var);
            Object Q4 = kd2Var.Q();
            if (f3 || Q4 == obj4) {
                Q4 = new o(ub2Var, (byte) 7);
                kd2Var.n0(Q4);
            }
            sb2 sb2Var3 = (sb2) Q4;
            boolean f4 = kd2Var.f(ub2Var);
            Object Q5 = kd2Var.Q();
            if (f4 || Q5 == obj4) {
                Q5 = new o(ub2Var, (byte) 8);
                kd2Var.n0(Q5);
            }
            sb2 sb2Var4 = (sb2) Q5;
            boolean f5 = kd2Var.f(ub2Var);
            Object Q6 = kd2Var.Q();
            if (f5 || Q6 == obj4) {
                Q6 = new o(ub2Var, (byte) 9);
                kd2Var.n0(Q6);
            }
            tx6.b(ym6Var, z2, z3, this.y, this.z, sb2Var, sb2Var2, sb2Var3, sb2Var4, d, (sb2) Q6, this.E, this.F, D, kd2Var, 8, 3072, 0);
        } else {
            kd2Var.Y();
        }
        return pn6.a;
    }
}
