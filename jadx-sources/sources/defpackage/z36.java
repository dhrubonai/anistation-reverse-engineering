package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class z36 implements ud1, vz0 {
    public oq4 A = oq4.y;
    public final /* synthetic */ a46 B;
    public final /* synthetic */ a46 x;
    public final qg0 y;
    public qg0 z;

    public z36(a46 a46Var, qg0 qg0Var) {
        this.B = a46Var;
        this.x = a46Var;
        this.y = qg0Var;
    }

    @Override // defpackage.ud1
    public final long D0(long j) {
        return this.x.D0(j);
    }

    @Override // defpackage.ud1
    public final float H0(long j) {
        return this.x.H0(j);
    }

    @Override // defpackage.ud1
    public final long N(float f) {
        return this.x.N(f);
    }

    @Override // defpackage.ud1
    public final float T(int i) {
        return this.x.T(i);
    }

    @Override // defpackage.ud1
    public final float W(float f) {
        return f / this.x.b();
    }

    @Override // defpackage.ud1
    public final float b() {
        return this.x.b();
    }

    public final Object d(oq4 oq4Var, vz0 vz0Var) {
        qg0 qg0Var = new qg0(1, wc7.z(vz0Var));
        qg0Var.t();
        this.A = oq4Var;
        this.z = qg0Var;
        return qg0Var.r();
    }

    public final long e() {
        a46 a46Var = this.B;
        long D0 = a46Var.D0(wc7.O(a46Var).X.d());
        long j = a46Var.V;
        float max = Math.max(0.0f, Float.intBitsToFloat((int) (D0 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float max2 = Math.max(0.0f, Float.intBitsToFloat((int) (D0 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        return (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L);
    }

    public final rv6 f() {
        return wc7.O(this.B).X;
    }

    @Override // defpackage.ud1
    public final float g0(float f) {
        return this.x.b() * f;
    }

    @Override // defpackage.vz0
    public final l11 getContext() {
        return it1.x;
    }

    @Override // defpackage.ud1
    public final float getFontScale() {
        return this.x.getFontScale();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(long r8, defpackage.ic2 r10, defpackage.h30 r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.w36
            if (r0 == 0) goto L13
            r0 = r11
            w36 r0 = (defpackage.w36) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            w36 r0 = new w36
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.y
            int r1 = r0.A
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            bx5 r7 = r0.x
            defpackage.m37.N(r11)     // Catch: java.lang.Throwable -> L28
            goto L68
        L28:
            r8 = move-exception
            goto L72
        L2a:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r7)
            return r2
        L30:
            defpackage.m37.N(r11)
            r4 = 0
            int r11 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r11 > 0) goto L4a
            qg0 r11 = r7.z
            if (r11 == 0) goto L4a
            pq4 r1 = new pq4
            r1.<init>(r8)
            y45 r4 = new y45
            r4.<init>(r1)
            r11.resumeWith(r4)
        L4a:
            a46 r11 = r7.B
            v11 r11 = r11.O0()
            x36 r1 = new x36
            r1.<init>(r8, r7, r2)
            r8 = 3
            bx5 r8 = defpackage.tl7.z(r11, r2, r2, r1, r8)
            r0.x = r8     // Catch: java.lang.Throwable -> L6e
            r0.A = r3     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r11 = r10.invoke(r7, r0)     // Catch: java.lang.Throwable -> L6e
            w11 r7 = defpackage.w11.x
            if (r11 != r7) goto L67
            return r7
        L67:
            r7 = r8
        L68:
            ng0 r8 = defpackage.ng0.y
            r7.l(r8)
            return r11
        L6e:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L72:
            ng0 r9 = defpackage.ng0.y
            r7.l(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z36.i(long, ic2, h30):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(long r5, defpackage.ic2 r7, defpackage.xz0 r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.y36
            if (r0 == 0) goto L13
            r0 = r8
            y36 r0 = (defpackage.y36) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            y36 r0 = new y36
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.x
            int r1 = r0.z
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.m37.N(r8)     // Catch: defpackage.pq4 -> L3b
            return r8
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            return r2
        L2c:
            defpackage.m37.N(r8)
            r0.z = r3     // Catch: defpackage.pq4 -> L3b
            java.lang.Object r4 = r4.i(r5, r7, r0)     // Catch: defpackage.pq4 -> L3b
            w11 r5 = defpackage.w11.x
            if (r4 != r5) goto L3a
            return r5
        L3a:
            return r4
        L3b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z36.j(long, ic2, xz0):java.lang.Object");
    }

    @Override // defpackage.ud1
    public final int p0(long j) {
        return this.x.p0(j);
    }

    @Override // defpackage.ud1
    public final long r(float f) {
        return this.x.r(f);
    }

    @Override // defpackage.vz0
    public final void resumeWith(Object obj) {
        a46 a46Var = this.B;
        synchronized (a46Var.S) {
            a46Var.R.k(this);
        }
        this.y.resumeWith(obj);
    }

    @Override // defpackage.ud1
    public final long s(long j) {
        return this.x.s(j);
    }

    @Override // defpackage.ud1
    public final int x0(float f) {
        return this.x.x0(f);
    }

    @Override // defpackage.ud1
    public final float y(long j) {
        return this.x.y(j);
    }
}
