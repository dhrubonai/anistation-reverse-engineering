package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rz0 {
    public final zt5 a = new zt5();

    public static void b(rz0 rz0Var, ic2 ic2Var, os0 os0Var, sb2 sb2Var, int i) {
        if ((i & 8) != 0) {
            os0Var = null;
        }
        rz0Var.a.add(new os0(-1789283891, true, new sd3(ic2Var, rz0Var, os0Var, sb2Var)));
    }

    public final void a(qz0 qz0Var, kd2 kd2Var, int i) {
        int i2;
        int i3;
        boolean z;
        kd2Var.f0(-798501095);
        if (kd2Var.f(qz0Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (kd2Var.f(this)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i5 & 1, z)) {
            zt5 zt5Var = this.a;
            int size = zt5Var.size();
            for (int i6 = 0; i6 < size; i6++) {
                ((jc2) zt5Var.get(i6)).invoke(qz0Var, kd2Var, Integer.valueOf(i5 & 14));
            }
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new q((byte) 14, i, this, qz0Var);
        }
    }
}
