package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ej6 extends u44 {
    public final u44 o;
    public final boolean p;
    public final boolean q;
    public ub2 r;
    public ub2 s;
    public final long t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ej6(defpackage.u44 r8, defpackage.ub2 r9, defpackage.ub2 r10, boolean r11, boolean r12) {
        /*
            r7 = this;
            tg5 r0 = defpackage.mt5.a
            if (r8 == 0) goto La
            ub2 r0 = r8.e()
            if (r0 != 0) goto Le
        La:
            jh2 r0 = defpackage.mt5.j
            ub2 r0 = r0.e
        Le:
            ub2 r5 = defpackage.mt5.i(r9, r0, r11)
            if (r8 == 0) goto L1a
            ub2 r9 = r8.i()
            if (r9 != 0) goto L1e
        L1a:
            jh2 r9 = defpackage.mt5.j
            ub2 r9 = r9.f
        L1e:
            ub2 r6 = defpackage.mt5.j(r10, r9)
            r2 = 0
            kt5 r4 = defpackage.kt5.B
            r1 = r7
            r1.<init>(r2, r4, r5, r6)
            r1.o = r8
            r1.p = r11
            r1.q = r12
            ub2 r7 = r1.e
            r1.r = r7
            ub2 r7 = r1.f
            r1.s = r7
            long r7 = defpackage.nz5.c()
            r1.t = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ej6.<init>(u44, ub2, ub2, boolean, boolean):void");
    }

    @Override // defpackage.u44
    public final void B(q44 q44Var) {
        q23.W();
        throw null;
    }

    @Override // defpackage.u44
    public final u44 C(ub2 ub2Var, ub2 ub2Var2) {
        ub2 i = mt5.i(ub2Var, this.r, true);
        ub2 j = mt5.j(ub2Var2, this.s);
        if (!this.p) {
            return new ej6(D().C(null, j), i, j, false, true);
        }
        return D().C(i, j);
    }

    public final u44 D() {
        u44 u44Var = this.o;
        if (u44Var == null) {
            return mt5.j;
        }
        return u44Var;
    }

    @Override // defpackage.u44, defpackage.ft5
    public final void c() {
        u44 u44Var;
        this.c = true;
        if (this.q && (u44Var = this.o) != null) {
            u44Var.c();
        }
    }

    @Override // defpackage.ft5
    public final kt5 d() {
        return D().d();
    }

    @Override // defpackage.u44, defpackage.ft5
    public final ub2 e() {
        return this.r;
    }

    @Override // defpackage.ft5
    public final boolean f() {
        return D().f();
    }

    @Override // defpackage.ft5
    public final long g() {
        return D().g();
    }

    @Override // defpackage.u44, defpackage.ft5
    public final int h() {
        return D().h();
    }

    @Override // defpackage.u44, defpackage.ft5
    public final ub2 i() {
        return this.s;
    }

    @Override // defpackage.u44, defpackage.ft5
    public final void k() {
        q23.W();
        throw null;
    }

    @Override // defpackage.u44, defpackage.ft5
    public final void l() {
        q23.W();
        throw null;
    }

    @Override // defpackage.u44, defpackage.ft5
    public final void m() {
        D().m();
    }

    @Override // defpackage.u44, defpackage.ft5
    public final void n(xx5 xx5Var) {
        D().n(xx5Var);
    }

    @Override // defpackage.ft5
    public final void r(kt5 kt5Var) {
        q23.W();
        throw null;
    }

    @Override // defpackage.ft5
    public final void s(long j) {
        q23.W();
        throw null;
    }

    @Override // defpackage.u44, defpackage.ft5
    public final void t(int i) {
        D().t(i);
    }

    @Override // defpackage.u44, defpackage.ft5
    public final ft5 u(ub2 ub2Var) {
        ub2 i = mt5.i(ub2Var, this.r, true);
        if (!this.p) {
            return mt5.e(D().u(null), i, true);
        }
        return D().u(i);
    }

    @Override // defpackage.u44
    public final it5 w() {
        return D().w();
    }

    @Override // defpackage.u44
    public final q44 x() {
        return D().x();
    }

    @Override // defpackage.u44
    /* renamed from: y */
    public final ub2 e() {
        return this.r;
    }
}
