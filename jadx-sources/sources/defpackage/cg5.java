package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class cg5 implements ff0 {
    public long A;
    public int B;
    public final hk1 x;
    public final long y;
    public final int z;

    public cg5(hk1 hk1Var, long j, int i, long j2, int i2) {
        this.x = hk1Var;
        this.y = j;
        this.z = i;
        this.A = j2;
        this.B = i2;
    }

    @Override // defpackage.ff0
    public final void a(long j, long j2, long j3) {
        long j4 = this.A + j3;
        this.A = j4;
        long j5 = this.y;
        this.x.b(b(), j5, j4);
    }

    public final float b() {
        long j = this.y;
        if (j != -1 && j != 0) {
            return eq6.Y(this.A, j);
        }
        int i = this.z;
        if (i != 0) {
            return eq6.Y(this.B, i);
        }
        return -1.0f;
    }
}
