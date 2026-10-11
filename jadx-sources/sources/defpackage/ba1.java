package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ba1 implements gd4 {
    public final xy5 A;
    public byte B;
    public long C;
    public long D;
    public long E;
    public long F;
    public long G;
    public long H;
    public long I;
    public final fd4 x;
    public final long y;
    public final long z;

    public ba1(xy5 xy5Var, long j, long j2, long j3, long j4, boolean z) {
        boolean z2;
        if (j >= 0 && j2 > j) {
            z2 = true;
        } else {
            z2 = false;
        }
        io3.n(z2);
        this.A = xy5Var;
        this.y = j;
        this.z = j2;
        if (j3 != j2 - j && !z) {
            this.B = (byte) 0;
        } else {
            this.C = j4;
            this.B = (byte) 4;
        }
        this.x = new fd4();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c2  */
    @Override // defpackage.gd4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(defpackage.c12 r28) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ba1.b(c12):long");
    }

    @Override // defpackage.gd4
    public final hf5 c() {
        if (this.C != 0) {
            return new aa1(this);
        }
        return null;
    }

    @Override // defpackage.gd4
    public final void d(long j) {
        this.E = eq6.k(j, 0L, this.C - 1);
        this.B = (byte) 2;
        this.F = this.y;
        this.G = this.z;
        this.H = 0L;
        this.I = this.C;
    }
}
