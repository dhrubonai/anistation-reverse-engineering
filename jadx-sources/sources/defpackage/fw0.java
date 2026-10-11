package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fw0 implements cw0 {
    public final ThreadLocal A;
    public volatile boolean B;
    public final long C;
    public final jr4 x;
    public final jr4 y;
    public final p18 z;

    public fw0(final pz2 pz2Var, final String str, int i) {
        str.getClass();
        this.z = new p18((byte) 11);
        this.A = new ThreadLocal();
        m18 m18Var = fq1.y;
        this.C = w65.V(30, jq1.SECONDS);
        if (i > 0) {
            final byte b = 0;
            this.x = new jr4(i, new sb2() { // from class: dw0
                @Override // defpackage.sb2
                public final Object invoke() {
                    byte b2 = b;
                    String str2 = str;
                    pz2 pz2Var2 = pz2Var;
                    switch (b2) {
                        case 0:
                            g85 e = pz2Var2.e(str2);
                            zz.y("PRAGMA query_only = 1", e);
                            return e;
                        default:
                            return pz2Var2.e(str2);
                    }
                }
            });
            final byte b2 = 1;
            this.y = new jr4(1, new sb2() { // from class: dw0
                @Override // defpackage.sb2
                public final Object invoke() {
                    byte b22 = b2;
                    String str2 = str;
                    pz2 pz2Var2 = pz2Var;
                    switch (b22) {
                        case 0:
                            g85 e = pz2Var2.e(str2);
                            zz.y("PRAGMA query_only = 1", e);
                            return e;
                        default:
                            return pz2Var2.e(str2);
                    }
                }
            });
            return;
        }
        ze0.k("Maximum number of readers must be greater than 0");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0145 A[Catch: all -> 0x019d, TRY_LEAVE, TryCatch #3 {all -> 0x019d, blocks: (B:55:0x011e, B:59:0x013a, B:61:0x0145, B:65:0x01a1, B:66:0x01a8), top: B:54:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a1 A[Catch: all -> 0x019d, TRY_ENTER, TryCatch #3 {all -> 0x019d, blocks: (B:55:0x011e, B:59:0x013a, B:61:0x0145, B:65:0x01a1, B:66:0x01a8), top: B:54:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, w05] */
    @Override // defpackage.cw0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Y(boolean r18, defpackage.ic2 r19, defpackage.vz0 r20) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fw0.Y(boolean, ic2, vz0):java.lang.Object");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.B) {
            this.B = true;
            this.x.c();
            this.y.c();
        }
    }

    public fw0(pz2 pz2Var) {
        this.z = new p18((byte) 11);
        this.A = new ThreadLocal();
        m18 m18Var = fq1.y;
        this.C = w65.V(30, jq1.SECONDS);
        jr4 jr4Var = new jr4(1, new vt0(pz2Var, (byte) 1));
        this.x = jr4Var;
        this.y = jr4Var;
    }
}
