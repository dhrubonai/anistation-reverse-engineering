package v1;

import j1.j1;

/* loaded from: classes.dex */
public final class d implements u, t {

    /* renamed from: a, reason: collision with root package name */
    public final u f10384a;

    /* renamed from: b, reason: collision with root package name */
    public t f10385b;

    /* renamed from: c, reason: collision with root package name */
    public c[] f10386c = new c[0];

    /* renamed from: d, reason: collision with root package name */
    public long f10387d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f10388e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f10389f;

    public d(u uVar, long j4) {
        this.f10384a = uVar;
        this.f10389f = j4;
    }

    public final boolean a() {
        if (this.f10387d != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override // v1.x0
    public final boolean c() {
        return this.f10384a.c();
    }

    @Override // v1.u
    public final long d(long j4, j1 j1Var) {
        long j10;
        long j11 = this.f10388e;
        if (j4 == j11) {
            return j11;
        }
        long i10 = f1.b0.i(j1Var.f5809a, 0L, j4 - j11);
        long j12 = j1Var.f5810b;
        long j13 = this.f10389f;
        if (j13 == Long.MIN_VALUE) {
            j10 = Long.MAX_VALUE;
        } else {
            j10 = j13 - j4;
        }
        long i11 = f1.b0.i(j12, 0L, j10);
        if (i10 != j1Var.f5809a || i11 != j1Var.f5810b) {
            j1Var = new j1(i10, i11);
        }
        return this.f10384a.d(j4, j1Var);
    }

    @Override // v1.x0
    public final long h() {
        long h10 = this.f10384a.h();
        if (h10 != Long.MIN_VALUE) {
            long j4 = this.f10389f;
            if (j4 == Long.MIN_VALUE || h10 < j4) {
                return h10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // v1.t
    public final void i(u uVar) {
        t tVar = this.f10385b;
        tVar.getClass();
        tVar.i(this);
    }

    @Override // v1.u
    public final long j() {
        boolean z9;
        if (a()) {
            long j4 = this.f10387d;
            this.f10387d = -9223372036854775807L;
            long j10 = j();
            if (j10 != -9223372036854775807L) {
                return j10;
            }
            return j4;
        }
        long j11 = this.f10384a.j();
        if (j11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z10 = true;
        if (j11 >= this.f10388e) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.u(z9);
        long j12 = this.f10389f;
        if (j12 != Long.MIN_VALUE && j11 > j12) {
            z10 = false;
        }
        w7.b.u(z10);
        return j11;
    }

    @Override // v1.u
    public final void k(t tVar, long j4) {
        this.f10385b = tVar;
        this.f10384a.k(this, j4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0081, code lost:
    
        if (r1 > r5) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008b  */
    @Override // v1.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long l(y1.s[] r16, boolean[] r17, v1.v0[] r18, boolean[] r19, long r20) {
        /*
            r15 = this;
            r0 = r15
            r8 = r16
            r9 = r18
            int r1 = r9.length
            v1.c[] r1 = new v1.c[r1]
            r0.f10386c = r1
            int r1 = r9.length
            v1.v0[] r10 = new v1.v0[r1]
            r11 = 0
            r1 = r11
        Lf:
            int r2 = r9.length
            r12 = 0
            if (r1 >= r2) goto L24
            v1.c[] r2 = r0.f10386c
            r3 = r9[r1]
            v1.c r3 = (v1.c) r3
            r2[r1] = r3
            if (r3 == 0) goto L1f
            v1.v0 r12 = r3.f10372a
        L1f:
            r10[r1] = r12
            int r1 = r1 + 1
            goto Lf
        L24:
            v1.u r1 = r0.f10384a
            r2 = r16
            r3 = r17
            r4 = r10
            r5 = r19
            r6 = r20
            long r1 = r1.l(r2, r3, r4, r5, r6)
            boolean r3 = r15.a()
            r4 = 1
            if (r3 == 0) goto L66
            long r5 = r0.f10388e
            int r3 = (r20 > r5 ? 1 : (r20 == r5 ? 0 : -1))
            if (r3 != 0) goto L66
            r13 = 0
            int r3 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r3 == 0) goto L61
            int r3 = r8.length
            r5 = r11
        L48:
            if (r5 >= r3) goto L61
            r6 = r8[r5]
            if (r6 == 0) goto L5e
            c1.v r6 = r6.l()
            java.lang.String r7 = r6.f1935m
            java.lang.String r6 = r6.f1932j
            boolean r6 = c1.q0.a(r7, r6)
            if (r6 != 0) goto L5e
            r3 = r4
            goto L62
        L5e:
            int r5 = r5 + 1
            goto L48
        L61:
            r3 = r11
        L62:
            if (r3 == 0) goto L66
            r5 = r1
            goto L6b
        L66:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L6b:
            r0.f10387d = r5
            int r3 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r3 == 0) goto L85
            long r5 = r0.f10388e
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 < 0) goto L84
            long r5 = r0.f10389f
            r7 = -9223372036854775808
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L85
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 > 0) goto L84
            goto L85
        L84:
            r4 = r11
        L85:
            w7.b.u(r4)
        L88:
            int r3 = r9.length
            if (r11 >= r3) goto Lae
            r3 = r10[r11]
            if (r3 != 0) goto L94
            v1.c[] r3 = r0.f10386c
            r3[r11] = r12
            goto La5
        L94:
            v1.c[] r4 = r0.f10386c
            r5 = r4[r11]
            if (r5 == 0) goto L9e
            v1.v0 r5 = r5.f10372a
            if (r5 == r3) goto La5
        L9e:
            v1.c r5 = new v1.c
            r5.<init>(r15, r3)
            r4[r11] = r5
        La5:
            v1.c[] r3 = r0.f10386c
            r3 = r3[r11]
            r9[r11] = r3
            int r11 = r11 + 1
            goto L88
        Lae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.d.l(y1.s[], boolean[], v1.v0[], boolean[], long):long");
    }

    @Override // v1.u
    public final g1 m() {
        return this.f10384a.m();
    }

    @Override // v1.x0
    public final boolean n(j1.n0 n0Var) {
        return this.f10384a.n(n0Var);
    }

    @Override // v1.x0
    public final long o() {
        long o = this.f10384a.o();
        if (o != Long.MIN_VALUE) {
            long j4 = this.f10389f;
            if (j4 == Long.MIN_VALUE || o < j4) {
                return o;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // v1.u
    public final void p() {
        this.f10384a.p();
    }

    @Override // v1.w0
    public final void s(x0 x0Var) {
        t tVar = this.f10385b;
        tVar.getClass();
        tVar.s(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (r0 > r6) goto L17;
     */
    @Override // v1.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long t(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f10387d = r0
            v1.c[] r0 = r5.f10386c
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L17
            r4 = r0[r3]
            if (r4 == 0) goto L14
            r4.f10373b = r2
        L14:
            int r3 = r3 + 1
            goto Lc
        L17:
            v1.u r0 = r5.f10384a
            long r0 = r0.t(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L33
            long r6 = r5.f10388e
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L34
            long r6 = r5.f10389f
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L33
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L34
        L33:
            r2 = 1
        L34:
            w7.b.u(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.d.t(long):long");
    }

    @Override // v1.u
    public final void u(long j4) {
        this.f10384a.u(j4);
    }

    @Override // v1.x0
    public final void v(long j4) {
        this.f10384a.v(j4);
    }
}
