package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class n53 extends u0 {
    public final m1 a;
    public final uj5 b;

    public n53(m1 m1Var, y43 y43Var) {
        this.a = m1Var;
        this.b = y43Var.b;
    }

    @Override // defpackage.gu0
    public final uj5 b() {
        return this.b;
    }

    @Override // defpackage.gu0
    public final int i(aj5 aj5Var) {
        aj5Var.getClass();
        throw new IllegalStateException("unsupported");
    }

    @Override // defpackage.u0, defpackage.l61
    public final int n() {
        m1 m1Var = this.a;
        String o = m1Var.o();
        try {
            o.getClass();
            xl6 i = hz5.i(o);
            if (i != null) {
                return i.x;
            }
            b06.D(o);
            throw null;
        } catch (IllegalArgumentException unused) {
            m1.u(m1Var, qx1.g('\'', "Failed to parse type 'UInt' for input '", o), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.u0, defpackage.l61
    public final long u() {
        m1 m1Var = this.a;
        String o = m1Var.o();
        try {
            o.getClass();
            cm6 j = hz5.j(o);
            if (j != null) {
                return j.x;
            }
            b06.D(o);
            throw null;
        } catch (IllegalArgumentException unused) {
            m1.u(m1Var, qx1.g('\'', "Failed to parse type 'ULong' for input '", o), 0, null, 6);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025 A[Catch: IllegalArgumentException -> 0x002c, TryCatch #0 {IllegalArgumentException -> 0x002c, blocks: (B:3:0x0007, B:5:0x0010, B:8:0x001b, B:10:0x0025, B:13:0x0028, B:14:0x002b), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0028 A[Catch: IllegalArgumentException -> 0x002c, TryCatch #0 {IllegalArgumentException -> 0x002c, blocks: (B:3:0x0007, B:5:0x0010, B:8:0x001b, B:10:0x0025, B:13:0x0028, B:14:0x002b), top: B:2:0x0007 }] */
    @Override // defpackage.u0, defpackage.l61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte x() {
        /*
            r4 = this;
            m1 r4 = r4.a
            java.lang.String r0 = r4.o()
            r1 = 0
            r0.getClass()     // Catch: java.lang.IllegalArgumentException -> L2c
            xl6 r2 = defpackage.hz5.i(r0)     // Catch: java.lang.IllegalArgumentException -> L2c
            if (r2 == 0) goto L22
            int r2 = r2.x     // Catch: java.lang.IllegalArgumentException -> L2c
            r3 = 255(0xff, float:3.57E-43)
            int r3 = java.lang.Integer.compareUnsigned(r2, r3)     // Catch: java.lang.IllegalArgumentException -> L2c
            if (r3 <= 0) goto L1b
            goto L22
        L1b:
            byte r2 = (byte) r2     // Catch: java.lang.IllegalArgumentException -> L2c
            sl6 r3 = new sl6     // Catch: java.lang.IllegalArgumentException -> L2c
            r3.<init>(r2)     // Catch: java.lang.IllegalArgumentException -> L2c
            goto L23
        L22:
            r3 = r1
        L23:
            if (r3 == 0) goto L28
            byte r4 = r3.x     // Catch: java.lang.IllegalArgumentException -> L2c
            return r4
        L28:
            defpackage.b06.D(r0)     // Catch: java.lang.IllegalArgumentException -> L2c
            throw r1     // Catch: java.lang.IllegalArgumentException -> L2c
        L2c:
            java.lang.String r2 = "Failed to parse type 'UByte' for input '"
            r3 = 39
            java.lang.String r0 = defpackage.qx1.g(r3, r2, r0)
            r2 = 0
            r3 = 6
            defpackage.m1.u(r4, r0, r2, r1, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n53.x():byte");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026 A[Catch: IllegalArgumentException -> 0x002d, TryCatch #0 {IllegalArgumentException -> 0x002d, blocks: (B:3:0x0007, B:5:0x0010, B:8:0x001c, B:10:0x0026, B:13:0x0029, B:14:0x002c), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0029 A[Catch: IllegalArgumentException -> 0x002d, TryCatch #0 {IllegalArgumentException -> 0x002d, blocks: (B:3:0x0007, B:5:0x0010, B:8:0x001c, B:10:0x0026, B:13:0x0029, B:14:0x002c), top: B:2:0x0007 }] */
    @Override // defpackage.u0, defpackage.l61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final short z() {
        /*
            r4 = this;
            m1 r4 = r4.a
            java.lang.String r0 = r4.o()
            r1 = 0
            r0.getClass()     // Catch: java.lang.IllegalArgumentException -> L2d
            xl6 r2 = defpackage.hz5.i(r0)     // Catch: java.lang.IllegalArgumentException -> L2d
            if (r2 == 0) goto L23
            int r2 = r2.x     // Catch: java.lang.IllegalArgumentException -> L2d
            r3 = 65535(0xffff, float:9.1834E-41)
            int r3 = java.lang.Integer.compareUnsigned(r2, r3)     // Catch: java.lang.IllegalArgumentException -> L2d
            if (r3 <= 0) goto L1c
            goto L23
        L1c:
            short r2 = (short) r2     // Catch: java.lang.IllegalArgumentException -> L2d
            km6 r3 = new km6     // Catch: java.lang.IllegalArgumentException -> L2d
            r3.<init>(r2)     // Catch: java.lang.IllegalArgumentException -> L2d
            goto L24
        L23:
            r3 = r1
        L24:
            if (r3 == 0) goto L29
            short r4 = r3.x     // Catch: java.lang.IllegalArgumentException -> L2d
            return r4
        L29:
            defpackage.b06.D(r0)     // Catch: java.lang.IllegalArgumentException -> L2d
            throw r1     // Catch: java.lang.IllegalArgumentException -> L2d
        L2d:
            java.lang.String r2 = "Failed to parse type 'UShort' for input '"
            r3 = 39
            java.lang.String r0 = defpackage.qx1.g(r3, r2, r0)
            r2 = 0
            r3 = 6
            defpackage.m1.u(r4, r0, r2, r1, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n53.z():short");
    }
}
