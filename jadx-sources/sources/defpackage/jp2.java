package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class jp2 implements bv5 {
    public boolean B;
    public final /* synthetic */ lp2 C;
    public final long x;
    public boolean y;
    public final pa0 z = new Object();
    public final pa0 A = new Object();

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, pa0] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, pa0] */
    public jp2(lp2 lp2Var, long j, boolean z) {
        this.C = lp2Var;
        this.x = j;
        this.y = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        lp2 lp2Var = this.C;
        synchronized (lp2Var) {
            this.B = true;
            pa0 pa0Var = this.A;
            j = pa0Var.y;
            pa0Var.skip(j);
            lp2Var.notifyAll();
        }
        if (j > 0) {
            lp2 lp2Var2 = this.C;
            byte[] bArr = dq6.a;
            lp2Var2.b.t(j);
        }
        this.C.a();
    }

    @Override // defpackage.bv5
    public final of6 d() {
        return this.C.k;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x009d A[LOOP:0: B:3:0x000d->B:45:0x009d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a1 A[SYNTHETIC] */
    @Override // defpackage.bv5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long j0(long r19, defpackage.pa0 r21) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jp2.j0(long, pa0):long");
    }
}
