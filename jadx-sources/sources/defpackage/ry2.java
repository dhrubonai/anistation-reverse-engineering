package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ry2 {
    public final z44 a = new z44(new py2[16], 0);
    public final ti4 b = xt5.g(Boolean.FALSE);
    public long c = Long.MIN_VALUE;
    public final ti4 d = xt5.g(Boolean.TRUE);

    public final void a(int i, kd2 kd2Var) {
        int i2;
        boolean z;
        kd2Var.f0(-318043801);
        if (kd2Var.h(this)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i3 & 1, z)) {
            Object Q = kd2Var.Q();
            vz0 vz0Var = null;
            q18 q18Var = au0.a;
            if (Q == q18Var) {
                Q = xt5.g(null);
                kd2Var.n0(Q);
            }
            w44 w44Var = (w44) Q;
            if (!((Boolean) this.d.getValue()).booleanValue() && !((Boolean) this.b.getValue()).booleanValue()) {
                kd2Var.e0(-143455237);
                kd2Var.q(false);
            } else {
                kd2Var.e0(-144841960);
                boolean h = kd2Var.h(this);
                Object Q2 = kd2Var.Q();
                if (h || Q2 == q18Var) {
                    Q2 = new j10(w44Var, this, vz0Var, (byte) 3);
                    kd2Var.n0(Q2);
                }
                db.f((ic2) Q2, kd2Var, this);
                kd2Var.q(false);
            }
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new o0(this, i, (byte) 15);
        }
    }
}
