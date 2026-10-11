package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class cr6 extends sq6 {
    public final ni2 b;
    public String c;
    public boolean d;
    public final xo1 e;
    public sb2 f;
    public final ti4 g;
    public w60 h;
    public final ti4 i;
    public long j;
    public float k;
    public float l;
    public final br6 m;

    public cr6(ni2 ni2Var) {
        this.b = ni2Var;
        ni2Var.i = new br6(this, (byte) 0);
        this.c = "";
        this.d = true;
        this.e = new xo1();
        this.f = new jk5((byte) 28);
        this.g = xt5.g(null);
        this.i = xt5.g(new uq5(0L));
        this.j = 9205357640488583168L;
        this.k = 1.0f;
        this.l = 1.0f;
        this.m = new br6(this, (byte) 1);
    }

    @Override // defpackage.sq6
    public final void a(bp1 bp1Var) {
        e(bp1Var, 1.0f, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        if (r3 != r8) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0108, code lost:
    
        if (r9.d == r3) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.bp1 r33, float r34, defpackage.w60 r35) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cr6.e(bp1, float, w60):void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.c);
        sb.append("\n\tviewportWidth: ");
        ti4 ti4Var = this.i;
        sb.append(Float.intBitsToFloat((int) (((uq5) ti4Var.getValue()).a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((uq5) ti4Var.getValue()).a & 4294967295L)));
        sb.append("\n");
        return sb.toString();
    }
}
