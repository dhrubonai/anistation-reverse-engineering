package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lx4 extends zc1 implements d84 {
    public boolean N;
    public sb2 O;
    public mx4 Q;
    public float R;
    public boolean P = true;
    public final k84 S = new k84(this, null);
    public final pi4 T = new pi4(0.0f);
    public final pi4 U = new pi4(0.0f);

    public lx4(boolean z, sb2 sb2Var, mx4 mx4Var, float f) {
        this.N = z;
        this.O = sb2Var;
        this.Q = mx4Var;
        this.R = f;
    }

    @Override // defpackage.d84
    public final long O(int i, long j) {
        if (!this.Q.a.e() && this.P && i == 1 && Float.intBitsToFloat((int) (4294967295L & j)) < 0.0f) {
            return f1(j);
        }
        return 0L;
    }

    @Override // defpackage.xz3
    public final boolean P0() {
        return false;
    }

    @Override // defpackage.xz3
    public final void S0() {
        float f;
        a1(this.S);
        tl7.z(O0(), null, null, new ix4(this, null, (byte) 0), 3);
        if (this.N) {
            f = g1();
        } else {
            f = 0.0f;
        }
        j1(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d1(defpackage.xz0 r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.gx4
            if (r0 == 0) goto L14
            r0 = r10
            gx4 r0 = (defpackage.gx4) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.z = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            gx4 r0 = new gx4
            r0.<init>(r9, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r5.x
            int r0 = r5.z
            pn6 r7 = defpackage.pn6.a
            r1 = 1
            r8 = 0
            if (r0 == 0) goto L34
            if (r0 != r1) goto L2d
            defpackage.m37.N(r10)     // Catch: java.lang.Throwable -> L2a
            goto L53
        L2a:
            r0 = move-exception
            r10 = r0
            goto L5a
        L2d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r9)
            r9 = 0
            return r9
        L34:
            defpackage.m37.N(r10)
            mx4 r10 = r9.Q     // Catch: java.lang.Throwable -> L2a
            r5.z = r1     // Catch: java.lang.Throwable -> L2a
            wj r1 = r10.a     // Catch: java.lang.Throwable -> L2a
            java.lang.Float r2 = new java.lang.Float     // Catch: java.lang.Throwable -> L2a
            r2.<init>(r8)     // Catch: java.lang.Throwable -> L2a
            r4 = 0
            r6 = 14
            r3 = 0
            java.lang.Object r10 = defpackage.wj.a(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L2a
            w11 r0 = defpackage.w11.x
            if (r10 != r0) goto L4f
            goto L50
        L4f:
            r10 = r7
        L50:
            if (r10 != r0) goto L53
            return r0
        L53:
            r9.i1(r8)
            r9.j1(r8)
            return r7
        L5a:
            r9.i1(r8)
            r9.j1(r8)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lx4.d1(xz0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e1(defpackage.xz0 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.hx4
            if (r0 == 0) goto L14
            r0 = r9
            hx4 r0 = (defpackage.hx4) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.z = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            hx4 r0 = new hx4
            r0.<init>(r8, r9)
            goto L12
        L1a:
            java.lang.Object r9 = r5.x
            int r0 = r5.z
            pn6 r7 = defpackage.pn6.a
            r1 = 1
            if (r0 == 0) goto L33
            if (r0 != r1) goto L2c
            defpackage.m37.N(r9)     // Catch: java.lang.Throwable -> L29
            goto L54
        L29:
            r0 = move-exception
            r9 = r0
            goto L69
        L2c:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r8)
            r8 = 0
            return r8
        L33:
            defpackage.m37.N(r9)
            mx4 r9 = r8.Q     // Catch: java.lang.Throwable -> L29
            r5.z = r1     // Catch: java.lang.Throwable -> L29
            wj r1 = r9.a     // Catch: java.lang.Throwable -> L29
            java.lang.Float r2 = new java.lang.Float     // Catch: java.lang.Throwable -> L29
            r9 = 1065353216(0x3f800000, float:1.0)
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L29
            r4 = 0
            r6 = 14
            r3 = 0
            java.lang.Object r9 = defpackage.wj.a(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L29
            w11 r0 = defpackage.w11.x
            if (r9 != r0) goto L50
            goto L51
        L50:
            r9 = r7
        L51:
            if (r9 != r0) goto L54
            return r0
        L54:
            boolean r9 = r8.K
            if (r9 == 0) goto L68
            int r9 = r8.g1()
            float r9 = (float) r9
            r8.i1(r9)
            int r9 = r8.g1()
            float r9 = (float) r9
            r8.j1(r9)
        L68:
            return r7
        L69:
            boolean r0 = r8.K
            if (r0 == 0) goto L7d
            int r0 = r8.g1()
            float r0 = (float) r0
            r8.i1(r0)
            int r0 = r8.g1()
            float r0 = (float) r0
            r8.j1(r0)
        L7d:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lx4.e1(xz0):java.lang.Object");
    }

    public final long f1(long j) {
        float h;
        float g1;
        if (this.N) {
            h = 0.0f;
        } else {
            pi4 pi4Var = this.U;
            float intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L)) + pi4Var.h();
            if (intBitsToFloat < 0.0f) {
                intBitsToFloat = 0.0f;
            }
            h = intBitsToFloat - pi4Var.h();
            i1(intBitsToFloat);
            if (pi4Var.h() * 0.5f <= g1()) {
                g1 = pi4Var.h() * 0.5f;
            } else {
                float B = db.B(Math.abs((pi4Var.h() * 0.5f) / g1()) - 1.0f, 0.0f, 2.0f);
                g1 = g1() + (g1() * (B - (((float) Math.pow(B, 2.0d)) / 4.0f)));
            }
            j1(g1);
        }
        return (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(h) & 4294967295L);
    }

    public final int g1() {
        return wc7.O(this).V.x0(this.R);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h1(float r6, defpackage.xz0 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.kx4
            if (r0 == 0) goto L13
            r0 = r7
            kx4 r0 = (defpackage.kx4) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            kx4 r0 = new kx4
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.y
            int r1 = r0.A
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L28
            float r6 = r0.x
            defpackage.m37.N(r7)
            goto L6f
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r5)
            r5 = 0
            return r5
        L2f:
            defpackage.m37.N(r7)
            boolean r7 = r5.N
            if (r7 == 0) goto L3c
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r3)
            return r5
        L3c:
            pi4 r7 = r5.U
            float r1 = r7.h()
            r4 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r4
            int r4 = r5.g1()
            float r4 = (float) r4
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 <= 0) goto L53
            sb2 r1 = r5.O
            r1.invoke()
        L53:
            float r7 = r7.h()
            int r7 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r7 != 0) goto L5d
        L5b:
            r6 = r3
            goto L62
        L5d:
            int r7 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r7 >= 0) goto L62
            goto L5b
        L62:
            r0.x = r6
            r0.A = r2
            java.lang.Object r7 = r5.d1(r0)
            w11 r0 = defpackage.w11.x
            if (r7 != r0) goto L6f
            return r0
        L6f:
            r5.i1(r3)
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lx4.h1(float, xz0):java.lang.Object");
    }

    public final void i1(float f) {
        this.U.i(f);
    }

    public final void j1(float f) {
        this.T.i(f);
    }

    @Override // defpackage.d84
    public final long z(long j, int i, long j2) {
        if (!this.Q.a.e() && this.P) {
            byte b = 1;
            if (i == 1) {
                long f1 = f1(j2);
                tl7.z(O0(), null, null, new ix4(this, null, b), 3);
                return f1;
            }
            return 0L;
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.d84
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z0(long r5, defpackage.vz0 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.jx4
            if (r0 == 0) goto L13
            r0 = r7
            jx4 r0 = (defpackage.jx4) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L1a
        L13:
            jx4 r0 = new jx4
            xz0 r7 = (defpackage.xz0) r7
            r0.<init>(r4, r7)
        L1a:
            java.lang.Object r7 = r0.x
            int r1 = r0.z
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            defpackage.m37.N(r7)
            goto L40
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.m37.N(r7)
            float r5 = defpackage.ur6.c(r5)
            r0.z = r2
            java.lang.Object r7 = r4.h1(r5, r0)
            w11 r4 = defpackage.w11.x
            if (r7 != r4) goto L40
            return r4
        L40:
            java.lang.Number r7 = (java.lang.Number) r7
            float r4 = r7.floatValue()
            r5 = 0
            long r4 = defpackage.ez5.a(r5, r4)
            ur6 r6 = new ur6
            r6.<init>(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lx4.z0(long, vz0):java.lang.Object");
    }
}
