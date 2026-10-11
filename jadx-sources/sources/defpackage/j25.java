package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class j25 implements b55 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p25 b;

    public /* synthetic */ j25(p25 p25Var, byte b) {
        this.a = b;
        this.b = p25Var;
    }

    @Override // defpackage.b55
    public final void a(a55 a55Var) {
        byte b = this.a;
        p25 p25Var = this.b;
        switch (b) {
            case 0:
                if (p25Var.w != null) {
                    p25Var.v1(this);
                    p25Var.n.b();
                    return;
                }
                return;
            case 1:
                if (p25Var.w != null) {
                    p25Var.u1(this);
                    p25Var.n.b();
                    return;
                }
                return;
            case 2:
                if (p25Var.w != null) {
                    p25Var.w1(this);
                    p25Var.n.b();
                    return;
                }
                return;
            case 3:
                if (p25Var.w != null) {
                    p25Var.z1(this);
                    p25Var.n.b();
                    return;
                }
                return;
            case 4:
                if (p25Var.w != null) {
                    p25Var.y1(this);
                    p25Var.n.b();
                    return;
                }
                return;
            default:
                int i = ((hl7) a55Var).b().x;
                if (i != 0 && i != 2103) {
                    StringBuilder s = qx1.s(i, "Seek failed. Error code ", ": ");
                    s.append(tl7.v(i));
                    kb0.s("RemoteCastPlayer", s.toString());
                }
                int i2 = p25Var.E - 1;
                p25Var.E = i2;
                if (i2 == 0) {
                    p25Var.C = p25Var.F;
                    p25Var.F = -1;
                    p25Var.G = -9223372036854775807L;
                    return;
                }
                return;
        }
    }
}
