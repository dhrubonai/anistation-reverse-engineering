package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ig6 implements ic2 {
    public final /* synthetic */ float x;
    public final /* synthetic */ long y;
    public final /* synthetic */ os0 z;

    public ig6(float f, long j, os0 os0Var) {
        this.x = f;
        this.y = j;
        this.z = os0Var;
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
            vh4 vh4Var = jg6.a;
            yz3 Q = n77.Q(ar5.k(vz3.x, 40.0f, 24.0f, this.x, Float.NaN), jg6.a);
            vo3 c = b90.c(pk2.y, false);
            int s = h98.s(kd2Var);
            al4 l = kd2Var.l();
            yz3 E = o80.E(kd2Var, Q);
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
            kb0.c(new mw4[]{ey0.a.a(new ep0(this.y)), yc6.a.a(pl6.a(wc7.g, kd2Var))}, this.z, kd2Var, 8);
            kd2Var.q(true);
        } else {
            kd2Var.Y();
        }
        return pn6.a;
    }
}
