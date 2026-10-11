package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class kz2 extends fa4 {
    public static final ad B0;
    public jz2 A0;
    public final z66 z0;

    static {
        ad l = n77.l();
        int i = ep0.j;
        l.r(ep0.f);
        l.x(1.0f);
        l.y(1);
        B0 = l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [xz3, z66] */
    /* JADX WARN: Type inference failed for: r3v4, types: [am3] */
    public kz2(za3 za3Var) {
        super(za3Var);
        jz2 jz2Var;
        ?? xz3Var = new xz3();
        xz3Var.A = 0;
        this.z0 = xz3Var;
        xz3Var.E = this;
        if (za3Var.E != null) {
            jz2Var = new am3(this);
        } else {
            jz2Var = null;
        }
        this.A0 = jz2Var;
    }

    @Override // defpackage.ro3
    public final int O(int i) {
        y23 t = this.R.t();
        vo3 V = t.V();
        za3 za3Var = (za3) t.y;
        return V.e((fa4) za3Var.c0.B, za3Var.m(), i);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [jz2, am3] */
    @Override // defpackage.fa4
    public final void T0() {
        if (this.A0 == null) {
            this.A0 = new am3(this);
        }
    }

    @Override // defpackage.em4
    public final void V(long j, float f, ub2 ub2Var) {
        p1(j, f, ub2Var, null);
        if (this.K) {
            return;
        }
        this.R.d0.p.o0();
    }

    @Override // defpackage.fa4
    public final am3 W0() {
        return this.A0;
    }

    @Override // defpackage.fa4
    public final xz3 Y0() {
        return this.z0;
    }

    @Override // defpackage.ro3
    public final int c(int i) {
        y23 t = this.R.t();
        vo3 V = t.V();
        za3 za3Var = (za3) t.y;
        return V.d((fa4) za3Var.c0.B, za3Var.m(), i);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    @Override // defpackage.fa4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f1(defpackage.ea4 r12, long r13, defpackage.il2 r15, int r16, boolean r17) {
        /*
            r11 = this;
            za3 r0 = r11.R
            boolean r1 = r12.u(r0)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L30
            boolean r1 = r11.A1(r13)
            if (r1 == 0) goto L16
            r9 = r16
            r10 = r17
        L14:
            r3 = r2
            goto L34
        L16:
            r9 = r16
            if (r9 != r2) goto L32
            long r4 = r11.X0()
            float r11 = r11.Q0(r13, r4)
            int r11 = java.lang.Float.floatToRawIntBits(r11)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r11 = r11 & r1
            r1 = 2139095040(0x7f800000, float:Infinity)
            if (r11 >= r1) goto L32
            r10 = r3
            goto L14
        L30:
            r9 = r16
        L32:
            r10 = r17
        L34:
            if (r3 == 0) goto L7a
            int r11 = r15.z
            z44 r0 = r0.z()
            java.lang.Object[] r1 = r0.x
            int r0 = r0.z
            int r0 = r0 - r2
        L41:
            if (r0 < 0) goto L78
            r2 = r1[r0]
            r5 = r2
            za3 r5 = (defpackage.za3) r5
            boolean r2 = r5.J()
            if (r2 == 0) goto L73
            r4 = r12
            r6 = r13
            r8 = r15
            r4.l(r5, r6, r8, r9, r10)
            long r2 = r15.b()
            float r6 = defpackage.t80.L(r2)
            r7 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L73
            boolean r6 = defpackage.t80.Z(r2)
            if (r6 == 0) goto L73
            boolean r2 = defpackage.t80.Y(r2)
            if (r2 != 0) goto L73
            boolean r2 = r12.q(r15, r5)
            if (r2 == 0) goto L78
        L73:
            int r0 = r0 + (-1)
            r9 = r16
            goto L41
        L78:
            r15.z = r11
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kz2.f1(ea4, long, il2, int, boolean):void");
    }

    @Override // defpackage.yl3
    public final int j0(f7 f7Var) {
        jz2 jz2Var = this.A0;
        if (jz2Var != null) {
            return jz2Var.j0(f7Var);
        }
        uo3 uo3Var = this.R.d0.p;
        ab3 ab3Var = uo3Var.V;
        if (!uo3Var.J) {
            if (uo3Var.C.d == va3.x) {
                ab3Var.f = true;
                if (ab3Var.b) {
                    uo3Var.T = true;
                    uo3Var.U = true;
                }
            } else {
                ab3Var.g = true;
            }
        }
        kz2 e = uo3Var.e();
        boolean z = e.L;
        e.L = true;
        uo3Var.A();
        e.L = z;
        Integer num = (Integer) ab3Var.i.get(f7Var);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.ro3
    public final int k(int i) {
        y23 t = this.R.t();
        vo3 V = t.V();
        za3 za3Var = (za3) t.y;
        return V.c((fa4) za3Var.c0.B, za3Var.m(), i);
    }

    @Override // defpackage.ro3
    public final int n(int i) {
        y23 t = this.R.t();
        vo3 V = t.V();
        za3 za3Var = (za3) t.y;
        return V.a((fa4) za3Var.c0.B, za3Var.m(), i);
    }

    @Override // defpackage.ro3
    public final em4 p(long j) {
        b0(j);
        za3 za3Var = this.R;
        z44 A = za3Var.A();
        Object[] objArr = A.x;
        int i = A.z;
        for (int i2 = 0; i2 < i; i2++) {
            ((za3) objArr[i2]).d0.p.I = xa3.z;
        }
        s1(za3Var.T.b(this, za3Var.m(), j));
        j1();
        return this;
    }
}
