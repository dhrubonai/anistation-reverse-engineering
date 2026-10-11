package defpackage;

import java.nio.ByteOrder;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class a42 implements f60 {
    public final f42 x;
    public final int y;
    public final d42 z = new Object();

    /* JADX WARN: Type inference failed for: r1v1, types: [d42, java.lang.Object] */
    public a42(f42 f42Var, int i) {
        this.x = f42Var;
        this.y = i;
    }

    @Override // defpackage.f60
    public final e60 a(c12 c12Var, long j) {
        long position = c12Var.getPosition();
        long c = c(c12Var);
        long k = c12Var.k();
        c12Var.l(Math.max(6, this.x.c));
        long c2 = c(c12Var);
        long k2 = c12Var.k();
        if (c <= j && c2 > j) {
            return new e60(-9223372036854775807L, 0, k);
        }
        if (c2 <= j) {
            return new e60(c2, -2, k2);
        }
        return new e60(c, -1, position);
    }

    public final long c(c12 c12Var) {
        d42 d42Var;
        f42 f42Var;
        int r;
        while (true) {
            long k = c12Var.k();
            long p = c12Var.p() - 6;
            d42Var = this.z;
            f42Var = this.x;
            if (k >= p) {
                break;
            }
            long k2 = c12Var.k();
            zi4 zi4Var = new zi4(17);
            int i = 0;
            boolean n = false;
            c12Var.A(zi4Var.a, 0, 2);
            char g = zi4Var.g(0, ByteOrder.BIG_ENDIAN);
            int i2 = this.y;
            if (g != i2) {
                c12Var.u();
                c12Var.l((int) (k2 - c12Var.getPosition()));
            } else {
                byte[] bArr = zi4Var.a;
                while (i < 15 && (r = c12Var.r(bArr, 2 + i, 15 - i)) != -1) {
                    i += r;
                }
                zi4Var.M(i + 2);
                c12Var.u();
                c12Var.l((int) (k2 - c12Var.getPosition()));
                n = bx7.n(zi4Var, f42Var, i2, d42Var);
            }
            if (n) {
                break;
            }
            c12Var.l(1);
        }
        if (c12Var.k() >= c12Var.p() - 6) {
            c12Var.l((int) (c12Var.p() - c12Var.k()));
            return f42Var.j;
        }
        return d42Var.a;
    }
}
