package j1;

/* loaded from: classes.dex */
public abstract class e implements g1 {
    public c1.v[] A;
    public long B;
    public long C;
    public boolean E;
    public boolean F;
    public h1 H;

    /* renamed from: b, reason: collision with root package name */
    public final int f5707b;

    /* renamed from: d, reason: collision with root package name */
    public i1 f5709d;

    /* renamed from: e, reason: collision with root package name */
    public int f5710e;

    /* renamed from: f, reason: collision with root package name */
    public k1.i0 f5711f;

    /* renamed from: x, reason: collision with root package name */
    public f1.a f5712x;

    /* renamed from: y, reason: collision with root package name */
    public int f5713y;

    /* renamed from: z, reason: collision with root package name */
    public v1.v0 f5714z;

    /* renamed from: a, reason: collision with root package name */
    public final Object f5706a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final androidx.appcompat.widget.a0 f5708c = new androidx.appcompat.widget.a0(7, (Object) null);
    public long D = Long.MIN_VALUE;
    public c1.e1 G = c1.e1.f1676a;

    public e(int i10) {
        this.f5707b = i10;
    }

    public final void A() {
        boolean z9;
        if (this.f5713y == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.u(z9);
        this.f5708c.G();
        u();
    }

    public abstract int B(c1.v vVar);

    public int C() {
        return 0;
    }

    @Override // j1.g1
    public boolean b() {
        return o();
    }

    @Override // j1.c1
    public void e(int i10, Object obj) {
    }

    @Override // j1.g1
    public /* synthetic */ void g() {
    }

    @Override // j1.g1
    public o0 i() {
        return null;
    }

    @Override // j1.g1
    public /* synthetic */ void l(float f10, float f11) {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j1.m m(int r13, c1.v r14, java.lang.Exception r15, boolean r16) {
        /*
            r12 = this;
            r1 = r12
            r0 = r14
            r2 = 4
            if (r0 == 0) goto L1d
            boolean r3 = r1.F
            if (r3 != 0) goto L1d
            r3 = 1
            r1.F = r3
            r3 = 0
            int r4 = r12.B(r14)     // Catch: java.lang.Throwable -> L16 j1.m -> L1b
            r4 = r4 & 7
            r1.F = r3
            goto L1e
        L16:
            r0 = move-exception
            r2 = r0
            r1.F = r3
            throw r2
        L1b:
            r1.F = r3
        L1d:
            r4 = r2
        L1e:
            java.lang.String r6 = r12.f()
            int r7 = r1.f5710e
            j1.m r11 = new j1.m
            r3 = 1
            if (r0 != 0) goto L2b
            r9 = r2
            goto L2c
        L2b:
            r9 = r4
        L2c:
            r2 = r11
            r4 = r15
            r5 = r13
            r8 = r14
            r10 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.e.m(int, c1.v, java.lang.Exception, boolean):j1.m");
    }

    public final m n(s1.w wVar, c1.v vVar) {
        return m(4002, vVar, wVar, false);
    }

    public final boolean o() {
        if (this.D == Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public abstract void p();

    public void q(boolean z9, boolean z10) {
    }

    public void r() {
    }

    public abstract void s(long j4, boolean z9);

    public void t() {
    }

    public void u() {
    }

    public void v() {
    }

    public void w() {
    }

    public abstract void x(c1.v[] vVarArr, long j4, long j10);

    public final int y(androidx.appcompat.widget.a0 a0Var, i1.h hVar, int i10) {
        v1.v0 v0Var = this.f5714z;
        v0Var.getClass();
        int g10 = v0Var.g(a0Var, hVar, i10);
        if (g10 == -4) {
            if (hVar.g(4)) {
                this.D = Long.MIN_VALUE;
                if (this.E) {
                    return -4;
                }
                return -3;
            }
            long j4 = hVar.f5264x + this.B;
            hVar.f5264x = j4;
            this.D = Math.max(this.D, j4);
        } else if (g10 == -5) {
            c1.v vVar = (c1.v) a0Var.f404c;
            vVar.getClass();
            if (vVar.f1938q != Long.MAX_VALUE) {
                c1.u a10 = vVar.a();
                a10.f1911p = vVar.f1938q + this.B;
                a0Var.f404c = a10.a();
            }
        }
        return g10;
    }

    public final void z(c1.v[] vVarArr, v1.v0 v0Var, long j4, long j10, v1.w wVar) {
        w7.b.u(!this.E);
        this.f5714z = v0Var;
        if (this.D == Long.MIN_VALUE) {
            this.D = j4;
        }
        this.A = vVarArr;
        this.B = j10;
        x(vVarArr, j4, j10);
    }
}
