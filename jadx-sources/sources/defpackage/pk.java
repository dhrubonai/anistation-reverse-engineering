package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pk extends m23 {
    public qi6 M;
    public w44 N;
    public qk O;
    public em4 P;
    public em4 Q;
    public long R;
    public long S;
    public final nk T;
    public final nk U;
    public long V;

    public pk(qi6 qi6Var, w44 w44Var, qk qkVar) {
        super((byte) 1);
        this.M = qi6Var;
        this.N = w44Var;
        this.O = qkVar;
        this.R = 0L;
        this.S = 0L;
        this.T = new nk(this, (byte) 1);
        this.U = new nk(this, (byte) 0);
        this.V = -9223372034707292160L;
    }

    @Override // defpackage.xz3
    public final void U0() {
        this.V = -9223372034707292160L;
    }

    @Override // defpackage.m23, defpackage.ra3
    public final wo3 e(xo3 xo3Var, ro3 ro3Var, long j) {
        long j2;
        em4 p = ro3Var.p(j);
        if (xo3Var.d0()) {
            j2 = (p.x << 32) | (p.y & 4294967295L);
        } else {
            qi6 qi6Var = this.M;
            int i = p.x;
            if (qi6Var == null) {
                j2 = (i << 32) | (p.y & 4294967295L);
                this.V = j2;
            } else {
                long j3 = (p.y & 4294967295L) | (i << 32);
                pi6 a = qi6Var.a(new ok(this, j3, (byte) 0), null, null, new ok(this, j3, (byte) 1));
                j2 = ((k13) a.getValue()).a;
                this.V = ((k13) a.getValue()).a;
            }
        }
        boolean d0 = xo3Var.d0();
        ot1 ot1Var = ot1.x;
        if (d0) {
            this.P = p;
            this.R = j2;
            return xo3Var.L((int) (j2 >> 32), (int) (j2 & 4294967295L), ot1Var, this.T);
        }
        this.Q = p;
        this.S = j2;
        return xo3Var.L((int) (j2 >> 32), (int) (j2 & 4294967295L), ot1Var, this.U);
    }
}
