package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class dq5 implements g95 {
    public byte x;
    public boolean y;
    public final /* synthetic */ fq5 z;

    public dq5(fq5 fq5Var) {
        this.z = fq5Var;
    }

    @Override // defpackage.g95
    public final int I(pz2 pz2Var, q61 q61Var, int i) {
        a();
        fq5 fq5Var = this.z;
        boolean z = fq5Var.F;
        if (z && fq5Var.G == null) {
            this.x = (byte) 2;
        }
        byte b = this.x;
        if (b == 2) {
            q61Var.b(4);
            return -4;
        }
        if ((i & 2) == 0 && b != 0) {
            if (!z) {
                return -3;
            }
            fq5Var.G.getClass();
            q61Var.b(1);
            q61Var.D = 0L;
            if ((i & 4) == 0) {
                q61Var.j(fq5Var.H);
                q61Var.B.put(fq5Var.G, 0, fq5Var.H);
            }
            if ((i & 1) == 0) {
                this.x = (byte) 2;
            }
            return -4;
        }
        pz2Var.z = fq5Var.E;
        this.x = (byte) 1;
        return -5;
    }

    public final void a() {
        fq5 fq5Var = this.z;
        ea2 ea2Var = fq5Var.E;
        if (!this.y) {
            eb2 eb2Var = fq5Var.A;
            eb2Var.h(new fs0(eb2Var, new fr3(1, qy3.h(ea2Var.p), ea2Var, 0, null, eq6.l0(0L), -9223372036854775807L), (byte) 11));
            this.y = true;
        }
    }

    @Override // defpackage.g95
    public final boolean isReady() {
        return this.z.F;
    }

    @Override // defpackage.g95
    public final int t(long j) {
        a();
        if (j > 0 && this.x != 2) {
            this.x = (byte) 2;
            return 1;
        }
        return 0;
    }

    @Override // defpackage.g95
    public final void s() {
    }
}
