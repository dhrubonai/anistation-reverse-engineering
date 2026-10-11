package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class a32 extends xz3 implements ra3 {
    public tg1 L;
    public float M;

    @Override // defpackage.ra3
    public final wo3 e(xo3 xo3Var, ro3 ro3Var, long j) {
        int j2;
        int h;
        int i;
        int i2;
        if (rx0.d(j) && this.L != tg1.x) {
            int round = Math.round(rx0.h(j) * this.M);
            int j3 = rx0.j(j);
            j2 = rx0.h(j);
            if (round < j3) {
                round = j3;
            }
            if (round <= j2) {
                j2 = round;
            }
            h = j2;
        } else {
            j2 = rx0.j(j);
            h = rx0.h(j);
        }
        if (rx0.c(j) && this.L != tg1.y) {
            int round2 = Math.round(rx0.g(j) * this.M);
            int i3 = rx0.i(j);
            i = rx0.g(j);
            if (round2 < i3) {
                round2 = i3;
            }
            if (round2 <= i) {
                i = round2;
            }
            i2 = i;
        } else {
            int i4 = rx0.i(j);
            int g = rx0.g(j);
            i = i4;
            i2 = g;
        }
        em4 p = ro3Var.p(sx0.a(j2, h, i, i2));
        return xo3Var.L(p.x, p.y, ot1.x, new r0(p, (byte) 7));
    }
}
