package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class l36 {
    public static final tq1 a = new tq1(new jk5((byte) 11), (byte) 0);

    public static final void a(yz3 yz3Var, om5 om5Var, long j, long j2, float f, float f2, s70 s70Var, ic2 ic2Var, kd2 kd2Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            yz3Var = vz3.x;
        }
        if ((i2 & 2) != 0) {
            om5Var = io3.h;
        }
        if ((i2 & 8) != 0) {
            j2 = op0.a(j, kd2Var);
        }
        if ((i2 & 16) != 0) {
            f = 0.0f;
        }
        if ((i2 & 32) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 64) != 0) {
            s70Var = null;
        }
        tq1 tq1Var = a;
        float f3 = f + ((vm1) kd2Var.j(tq1Var)).x;
        kb0.c(new mw4[]{ey0.a.a(new ep0(j2)), tq1Var.a(new vm1(f3))}, nx7.R(421772006, new k36(yz3Var, om5Var, j, f3, s70Var, f2, ic2Var), kd2Var), kd2Var, 56);
    }

    public static final long b(long j, float f, kd2 kd2Var) {
        mp0 mp0Var = (mp0) kd2Var.j(op0.a);
        boolean booleanValue = ((Boolean) kd2Var.j(op0.b)).booleanValue();
        long j2 = mp0Var.p;
        int i = ep0.j;
        if (cm6.a(j, j2) && booleanValue) {
            if (vm1.c(f, 0.0f)) {
                return j2;
            }
            return w65.t(ep0.b(((((float) Math.log(f + 1.0f)) * 4.5f) + 2.0f) / 100.0f, mp0Var.t), j2);
        }
        return j;
    }
}
