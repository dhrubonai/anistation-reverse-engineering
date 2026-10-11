package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zn3 extends g97 {
    public final boolean l;
    public final jf6 m;
    public final hf6 n;
    public xn3 o;
    public wn3 p;
    public boolean q;
    public boolean r;
    public boolean s;

    public zn3(lw3 lw3Var, boolean z) {
        super(lw3Var);
        boolean z2;
        if (z && lw3Var.e()) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.l = z2;
        this.m = new jf6();
        this.n = new hf6();
        kf6 f = lw3Var.f();
        if (f != null) {
            this.o = new xn3(f, null, null);
            this.s = true;
        } else {
            this.o = new xn3(new yn3(lw3Var.c()), jf6.q, xn3.h);
        }
    }

    @Override // defpackage.g97
    public final void A() {
        if (!this.l) {
            this.q = true;
            x(null, this.k);
        }
    }

    @Override // defpackage.lw3
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final wn3 b(jw3 jw3Var, l7 l7Var, long j) {
        boolean z;
        wn3 wn3Var = new wn3(jw3Var, l7Var, j);
        if (wn3Var.A == null) {
            z = true;
        } else {
            z = false;
        }
        io3.B(z);
        lw3 lw3Var = this.k;
        wn3Var.A = lw3Var;
        if (this.r) {
            Object obj = jw3Var.a;
            if (this.o.g != null && obj.equals(xn3.h)) {
                obj = this.o.g;
            }
            wn3Var.k(jw3Var.a(obj));
            return wn3Var;
        }
        this.p = wn3Var;
        if (!this.q) {
            this.q = true;
            x(null, lw3Var);
        }
        return wn3Var;
    }

    public final boolean C(long j) {
        wn3 wn3Var = this.p;
        int b = this.o.b(wn3Var.x.a);
        if (b == -1) {
            return false;
        }
        xn3 xn3Var = this.o;
        hf6 hf6Var = this.n;
        xn3Var.f(b, hf6Var, false);
        long j2 = hf6Var.d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        wn3Var.D = j;
        return true;
    }

    @Override // defpackage.lw3
    public final boolean a(ar3 ar3Var) {
        return this.k.a(ar3Var);
    }

    @Override // defpackage.g97, defpackage.lw3
    public final void g(ar3 ar3Var) {
        lf6 lf6Var;
        if (this.s) {
            xn3 xn3Var = this.o;
            kf6 kf6Var = xn3Var.e;
            if (kf6Var instanceof lf6) {
                lf6Var = new lf6(((lf6) kf6Var).e, ar3Var);
            } else {
                lf6Var = new lf6(kf6Var, ar3Var);
            }
            this.o = new xn3(lf6Var, xn3Var.f, xn3Var.g);
        } else {
            this.o = new xn3(new yn3(ar3Var), jf6.q, xn3.h);
        }
        this.k.g(ar3Var);
    }

    @Override // defpackage.lw3
    public final void h(or3 or3Var) {
        wn3 wn3Var = (wn3) or3Var;
        if (wn3Var.B != null) {
            lw3 lw3Var = wn3Var.A;
            lw3Var.getClass();
            lw3Var.h(wn3Var.B);
        }
        if (or3Var == this.p) {
            this.p = null;
        }
    }

    @Override // defpackage.lu0, defpackage.t30
    public final void q() {
        this.r = false;
        this.q = false;
        super.q();
    }

    @Override // defpackage.g97
    public final jw3 y(jw3 jw3Var) {
        Object obj = jw3Var.a;
        Object obj2 = this.o.g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = xn3.h;
        }
        return jw3Var.a(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00c9  */
    @Override // defpackage.g97
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(defpackage.kf6 r13) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zn3.z(kf6):void");
    }
}
