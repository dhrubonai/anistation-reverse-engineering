package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class ie6 {
    public static final mp0 a;
    public static final mp0 b;
    public static final tq1 c;
    public static final tq1 d;
    public static final tq1 e;
    public static final tq1 f;
    public static final tq1 g;
    public static final tq1 h;
    public static final tq1 i;
    public static final tq1 j;
    public static final tq1 k;

    static {
        long j2 = ip0.a;
        long j3 = ip0.b;
        a = op0.b(j2, 0L, 0L, 0L, 0L, j3, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ip0.d, ip0.f, ip0.g, 0L, ip0.i, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -188450, 65535);
        b = op0.e(j2, 0L, 0L, 0L, 0L, j3, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ip0.c, ip0.e, ip0.h, 0L, ip0.j, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -188450, 65535);
        c = new tq1(new jk5((byte) 19), (byte) 1);
        d = new tq1(new jk5((byte) 20), (byte) 1);
        e = new tq1(new jk5((byte) 20), (byte) 1);
        f = new tq1(new jk5((byte) 19), (byte) 1);
        g = new tq1(new jk5((byte) 19), (byte) 1);
        h = new tq1(new jk5((byte) 19), (byte) 1);
        i = new tq1(new jk5((byte) 21), (byte) 1);
        j = new tq1(new jk5((byte) 19), (byte) 1);
        k = new tq1(new jk5((byte) 19), (byte) 1);
    }

    public static final void a(boolean z, os0 os0Var, kd2 kd2Var, int i2) {
        int i3;
        boolean z2;
        mp0 mp0Var;
        kd2Var.f0(-519644665);
        if (kd2Var.g(z)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i4 = i3 | i2 | 48;
        if ((i4 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var.V(i4 & 1, z2)) {
            kd2Var.a0();
            if ((i2 & 1) != 0 && !kd2Var.C()) {
                kd2Var.Y();
            }
            kd2Var.r();
            if (z) {
                kd2Var.e0(-1162301546);
                kd2Var.q(false);
                mp0Var = a;
            } else {
                kd2Var.e0(-1162300521);
                kd2Var.q(false);
                mp0Var = b;
            }
            kb0.b(e.a(Boolean.valueOf(z)), nx7.R(775331143, new vl5(mp0Var, os0Var, (byte) 7), kd2Var), kd2Var, 56);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new q01(z, os0Var, i2);
        }
    }
}
