package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class tb6 implements k96 {
    public final lb5 a;
    public int b = -1;
    public long c = 9205357640488583168L;
    public long d = 0;
    public cj2 e = cj2.z;
    public boolean f = true;
    public p65 g = l68.K;
    public final /* synthetic */ cc6 h;

    public tb6(cc6 cc6Var, lb5 lb5Var) {
        this.h = cc6Var;
        this.a = lb5Var;
    }

    @Override // defpackage.k96
    public final void a(long j, p65 p65Var) {
        cc6 cc6Var = this.h;
        boolean z = cc6Var.i;
        gi6 gi6Var = cc6Var.a;
        dd6 dd6Var = cc6Var.b;
        if (z) {
            cc6Var.A(this.e, j);
            cc6Var.w(false);
            cc6Var.q.setValue(rb6.y);
            this.c = j;
            this.d = 0L;
            cc6Var.v = -1;
            this.f = true;
            this.g = p65Var;
            if (dd6Var.c() != null) {
                if (!dd6Var.f(j)) {
                    int d = dd6Var.d(j, true);
                    sj2 sj2Var = cc6Var.j;
                    if (sj2Var != null) {
                        ((mm4) sj2Var).a(0);
                    }
                    gi6Var.getClass();
                    gi6Var.j(fy5.a(d, d));
                    cc6Var.w(true);
                    this.f = false;
                    cc6Var.x(be6.y);
                    return;
                }
                if (gi6Var.d().A.length() == 0) {
                    return;
                }
                int d2 = dd6Var.d(j, true);
                long B = cc6Var.B(new p96(cc6Var.a.d(), nd6.b, null, null, null, null, null, 124), d2, d2, false, this.g, false, false, new tj2(0));
                gi6Var.j(B);
                cc6Var.x(be6.z);
                this.b = (int) (B >> 32);
            }
        }
    }

    @Override // defpackage.k96
    public final void b() {
        f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fd, code lost:
    
        if (((int) (r2 & 4294967295L)) != ((int) (r16 & 4294967295L))) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ff, code lost:
    
        r6 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0113, code lost:
    
        if (((r4 + ((int) (r2 & 4294967295L))) / 2.0f) > ((r5 + ((int) (r16 & 4294967295L))) / 2.0f)) goto L57;
     */
    @Override // defpackage.k96
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(long r19) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tb6.e(long):void");
    }

    public final void f() {
        if ((this.c & 9223372034707292159L) != 9205357640488583168L) {
            cc6 cc6Var = this.h;
            cc6Var.b();
            this.b = -1;
            this.c = 9205357640488583168L;
            this.d = 0L;
            cc6Var.v = -1;
            this.g = l68.K;
            cc6Var.q.setValue(rb6.x);
            this.a.invoke();
            if (this.f) {
                cc6Var.r();
            }
        }
    }

    @Override // defpackage.k96
    public final void onCancel() {
        f();
    }

    @Override // defpackage.k96
    public final void c() {
    }

    @Override // defpackage.k96
    public final void d() {
    }
}
