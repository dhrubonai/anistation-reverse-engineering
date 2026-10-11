package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class ho3 {
    public static final tq1 a;

    static {
        new d46(new t53((byte) 20));
        a = new tq1(new t53((byte) 21), (byte) 1);
    }

    public static final void a(mp0 mp0Var, y04 y04Var, cn5 cn5Var, nl6 nl6Var, os0 os0Var, kd2 kd2Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        kd2Var.f0(904511636);
        byte b = 2;
        if ((i & 6) == 0) {
            if (kd2Var.f(mp0Var)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (kd2Var.f(y04Var)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            if (kd2Var.f(cn5Var)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            if (kd2Var.f(nl6Var)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i2 |= i4;
        }
        if ((i & 24576) == 0) {
            if (kd2Var.h(os0Var)) {
                i3 = 16384;
            } else {
                i3 = 8192;
            }
            i2 |= i3;
        }
        if ((i2 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i2 & 1, z)) {
            kd2Var.a0();
            if ((i & 1) != 0 && !kd2Var.C()) {
                kd2Var.Y();
            }
            kd2Var.r();
            l65 a2 = j65.a(7, 0L);
            long j = mp0Var.a;
            boolean e = kd2Var.e(j);
            Object Q = kd2Var.Q();
            if (e || Q == au0.a) {
                Q = new qd6(j, ep0.b(0.4f, j));
                kd2Var.n0(Q);
            }
            kb0.c(new mw4[]{op0.a.a(mp0Var), a.a(y04Var), yx2.a.a(a2), dn5.a.a(cn5Var), rd6.a.a((qd6) Q), pl6.a.a(nl6Var)}, nx7.R(-1750539308, new d50(nl6Var, os0Var, b), kd2Var), kd2Var, 56);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new ms0(mp0Var, y04Var, cn5Var, nl6Var, os0Var, i);
        }
    }

    public static final void b(mp0 mp0Var, cn5 cn5Var, nl6 nl6Var, os0 os0Var, kd2 kd2Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        kd2Var.f0(-449719819);
        if (kd2Var.f(mp0Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i2 | i;
        if (kd2Var.f(cn5Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (kd2Var.f(nl6Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i8 = i7 | i4;
        if (kd2Var.h(os0Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i9 = i8 | i5;
        if ((i9 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i9 & 1, z)) {
            kd2Var.a0();
            if ((i & 1) != 0 && !kd2Var.C()) {
                kd2Var.Y();
            }
            kd2Var.r();
            int i10 = i9 & 14;
            int i11 = i9 << 3;
            a(mp0Var, (y04) kd2Var.j(a), cn5Var, nl6Var, os0Var, kd2Var, (i11 & 57344) | i10 | (i11 & 896) | (i11 & 7168));
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new fj(mp0Var, cn5Var, nl6Var, os0Var, i, (byte) 8);
        }
    }
}
