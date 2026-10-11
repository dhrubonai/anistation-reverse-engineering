package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class rk4 implements iy4 {
    public int A;
    public boolean B;
    public long C;
    public final cv5 x;
    public final oa0 y;
    public yf5 z;

    public rk4(cv5 cv5Var) {
        int i;
        this.x = cv5Var;
        oa0 c = cv5Var.c();
        this.y = c;
        yf5 yf5Var = c.x;
        this.z = yf5Var;
        if (yf5Var != null) {
            i = yf5Var.b;
        } else {
            i = -1;
        }
        this.A = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if (r3 == r5.b) goto L15;
     */
    @Override // defpackage.iy4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long C(defpackage.oa0 r12, long r13) {
        /*
            Method dump skipped, instructions count: 198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rk4.C(oa0, long):long");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.B = true;
    }
}
