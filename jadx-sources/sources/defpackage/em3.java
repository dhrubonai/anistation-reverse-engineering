package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class em3 extends em4 implements ro3, j7, x04 {
    public final db3 C;
    public boolean D;
    public boolean H;
    public boolean I;
    public boolean J;
    public rx0 K;
    public ub2 M;
    public di2 N;
    public boolean S;
    public final cm3 T;
    public Object V;
    public final cm3 X;
    public final cm3 Y;
    public boolean Z;
    public int E = Integer.MAX_VALUE;
    public int F = Integer.MAX_VALUE;
    public xa3 G = xa3.z;
    public long L = 0;
    public dm3 O = dm3.z;
    public final ab3 P = new ab3(this, (byte) 1);
    public final z44 Q = new z44(new em3[16], 0);
    public boolean R = true;
    public boolean U = true;
    public long W = sx0.b(0, 0, 0, 0, 15);

    /* JADX WARN: Type inference failed for: r0v6, types: [cm3] */
    /* JADX WARN: Type inference failed for: r5v4, types: [cm3] */
    /* JADX WARN: Type inference failed for: r5v5, types: [cm3] */
    public em3(db3 db3Var) {
        this.C = db3Var;
        final byte b = 1;
        final byte b2 = 0;
        this.T = new sb2(this) { // from class: cm3
            public final /* synthetic */ em3 y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                am3 W0;
                byte b3 = b2;
                pn6 pn6Var = pn6.a;
                f44 f44Var = null;
                r2 = null;
                r2 = null;
                dm4 dm4Var = null;
                em3 em3Var = this.y;
                switch (b3) {
                    case 0:
                        db3 db3Var2 = em3Var.C;
                        db3Var2.h = 0;
                        za3 za3Var = db3Var2.a;
                        z44 A = za3Var.A();
                        Object[] objArr = A.x;
                        int i = A.z;
                        for (int i2 = 0; i2 < i; i2++) {
                            em3 em3Var2 = ((za3) objArr[i2]).d0.q;
                            em3Var2.getClass();
                            em3Var2.E = em3Var2.F;
                            em3Var2.F = Integer.MAX_VALUE;
                            if (em3Var2.G == xa3.y) {
                                em3Var2.G = xa3.z;
                            }
                        }
                        z44 A2 = za3Var.A();
                        Object[] objArr2 = A2.x;
                        int i3 = A2.z;
                        for (int i4 = 0; i4 < i3; i4++) {
                            em3 em3Var3 = ((za3) objArr2[i4]).d0.q;
                            em3Var3.getClass();
                            em3Var3.P.d = false;
                        }
                        jz2 jz2Var = em3Var.e().A0;
                        if (jz2Var != null) {
                            d44 d44Var = (d44) za3Var.n();
                            int i5 = ((z44) d44Var.y).z;
                            for (int i6 = 0; i6 < i5; i6++) {
                                za3 za3Var2 = (za3) d44Var.get(i6);
                                am3 W02 = ((fa4) za3Var2.c0.B).W0();
                                if (W02 != null) {
                                    if (W02.L) {
                                        if (f44Var == null) {
                                            f44Var = new f44();
                                        }
                                        f44Var.a(za3Var2);
                                    }
                                    W02.L = jz2Var.L;
                                }
                            }
                            jz2Var.u0().b();
                            d44 d44Var2 = (d44) za3Var.n();
                            int i7 = ((z44) d44Var2.y).z;
                            int i8 = 0;
                            while (true) {
                                boolean z = true;
                                if (i8 < i7) {
                                    za3 za3Var3 = (za3) d44Var2.get(i8);
                                    if (f44Var == null || !f44Var.e(za3Var3)) {
                                        z = false;
                                    }
                                    am3 W03 = ((fa4) za3Var3.c0.B).W0();
                                    if (W03 != null) {
                                        W03.L = z;
                                    }
                                    i8++;
                                } else {
                                    z44 A3 = za3Var.A();
                                    Object[] objArr3 = A3.x;
                                    int i9 = A3.z;
                                    for (int i10 = 0; i10 < i9; i10++) {
                                        em3 em3Var4 = ((za3) objArr3[i10]).d0.q;
                                        em3Var4.getClass();
                                        int i11 = em3Var4.E;
                                        int i12 = em3Var4.F;
                                        if (i11 != i12 && i12 == Integer.MAX_VALUE) {
                                            em3Var4.j0(true);
                                        }
                                    }
                                    z44 A4 = za3Var.A();
                                    Object[] objArr4 = A4.x;
                                    int i13 = A4.z;
                                    for (int i14 = 0; i14 < i13; i14++) {
                                        em3 em3Var5 = ((za3) objArr4[i14]).d0.q;
                                        em3Var5.getClass();
                                        ab3 ab3Var = em3Var5.P;
                                        ab3Var.e = ab3Var.d;
                                    }
                                    return pn6Var;
                                }
                            }
                        } else {
                            ze0.m("Expected lookahead delegate");
                            return null;
                        }
                        break;
                    case 1:
                        am3 W04 = em3Var.C.a().W0();
                        W04.getClass();
                        W04.p(em3Var.W);
                        return pn6Var;
                    default:
                        db3 db3Var3 = em3Var.C;
                        if (!wk6.w(db3Var3.a) && !db3Var3.c) {
                            fa4 fa4Var = db3Var3.a().T;
                            if (fa4Var != null && (W0 = fa4Var.W0()) != null) {
                                dm4Var = W0.M;
                            }
                        } else {
                            fa4 fa4Var2 = db3Var3.a().T;
                            if (fa4Var2 != null) {
                                dm4Var = fa4Var2.M;
                            }
                        }
                        if (dm4Var == null) {
                            dm4Var = ((oa) cb3.a(db3Var3.a)).getPlacementScope();
                        }
                        am3 W05 = db3Var3.a().W0();
                        W05.getClass();
                        dm4.i(dm4Var, W05, em3Var.L);
                        return pn6Var;
                }
            }
        };
        this.V = db3Var.p.P;
        this.X = new sb2(this) { // from class: cm3
            public final /* synthetic */ em3 y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                am3 W0;
                byte b3 = b;
                pn6 pn6Var = pn6.a;
                f44 f44Var = null;
                dm4Var = null;
                dm4Var = null;
                dm4 dm4Var = null;
                em3 em3Var = this.y;
                switch (b3) {
                    case 0:
                        db3 db3Var2 = em3Var.C;
                        db3Var2.h = 0;
                        za3 za3Var = db3Var2.a;
                        z44 A = za3Var.A();
                        Object[] objArr = A.x;
                        int i = A.z;
                        for (int i2 = 0; i2 < i; i2++) {
                            em3 em3Var2 = ((za3) objArr[i2]).d0.q;
                            em3Var2.getClass();
                            em3Var2.E = em3Var2.F;
                            em3Var2.F = Integer.MAX_VALUE;
                            if (em3Var2.G == xa3.y) {
                                em3Var2.G = xa3.z;
                            }
                        }
                        z44 A2 = za3Var.A();
                        Object[] objArr2 = A2.x;
                        int i3 = A2.z;
                        for (int i4 = 0; i4 < i3; i4++) {
                            em3 em3Var3 = ((za3) objArr2[i4]).d0.q;
                            em3Var3.getClass();
                            em3Var3.P.d = false;
                        }
                        jz2 jz2Var = em3Var.e().A0;
                        if (jz2Var != null) {
                            d44 d44Var = (d44) za3Var.n();
                            int i5 = ((z44) d44Var.y).z;
                            for (int i6 = 0; i6 < i5; i6++) {
                                za3 za3Var2 = (za3) d44Var.get(i6);
                                am3 W02 = ((fa4) za3Var2.c0.B).W0();
                                if (W02 != null) {
                                    if (W02.L) {
                                        if (f44Var == null) {
                                            f44Var = new f44();
                                        }
                                        f44Var.a(za3Var2);
                                    }
                                    W02.L = jz2Var.L;
                                }
                            }
                            jz2Var.u0().b();
                            d44 d44Var2 = (d44) za3Var.n();
                            int i7 = ((z44) d44Var2.y).z;
                            int i8 = 0;
                            while (true) {
                                boolean z = true;
                                if (i8 < i7) {
                                    za3 za3Var3 = (za3) d44Var2.get(i8);
                                    if (f44Var == null || !f44Var.e(za3Var3)) {
                                        z = false;
                                    }
                                    am3 W03 = ((fa4) za3Var3.c0.B).W0();
                                    if (W03 != null) {
                                        W03.L = z;
                                    }
                                    i8++;
                                } else {
                                    z44 A3 = za3Var.A();
                                    Object[] objArr3 = A3.x;
                                    int i9 = A3.z;
                                    for (int i10 = 0; i10 < i9; i10++) {
                                        em3 em3Var4 = ((za3) objArr3[i10]).d0.q;
                                        em3Var4.getClass();
                                        int i11 = em3Var4.E;
                                        int i12 = em3Var4.F;
                                        if (i11 != i12 && i12 == Integer.MAX_VALUE) {
                                            em3Var4.j0(true);
                                        }
                                    }
                                    z44 A4 = za3Var.A();
                                    Object[] objArr4 = A4.x;
                                    int i13 = A4.z;
                                    for (int i14 = 0; i14 < i13; i14++) {
                                        em3 em3Var5 = ((za3) objArr4[i14]).d0.q;
                                        em3Var5.getClass();
                                        ab3 ab3Var = em3Var5.P;
                                        ab3Var.e = ab3Var.d;
                                    }
                                    return pn6Var;
                                }
                            }
                        } else {
                            ze0.m("Expected lookahead delegate");
                            return null;
                        }
                        break;
                    case 1:
                        am3 W04 = em3Var.C.a().W0();
                        W04.getClass();
                        W04.p(em3Var.W);
                        return pn6Var;
                    default:
                        db3 db3Var3 = em3Var.C;
                        if (!wk6.w(db3Var3.a) && !db3Var3.c) {
                            fa4 fa4Var = db3Var3.a().T;
                            if (fa4Var != null && (W0 = fa4Var.W0()) != null) {
                                dm4Var = W0.M;
                            }
                        } else {
                            fa4 fa4Var2 = db3Var3.a().T;
                            if (fa4Var2 != null) {
                                dm4Var = fa4Var2.M;
                            }
                        }
                        if (dm4Var == null) {
                            dm4Var = ((oa) cb3.a(db3Var3.a)).getPlacementScope();
                        }
                        am3 W05 = db3Var3.a().W0();
                        W05.getClass();
                        dm4.i(dm4Var, W05, em3Var.L);
                        return pn6Var;
                }
            }
        };
        final byte b3 = 2;
        this.Y = new sb2(this) { // from class: cm3
            public final /* synthetic */ em3 y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                am3 W0;
                byte b32 = b3;
                pn6 pn6Var = pn6.a;
                f44 f44Var = null;
                dm4Var = null;
                dm4Var = null;
                dm4 dm4Var = null;
                em3 em3Var = this.y;
                switch (b32) {
                    case 0:
                        db3 db3Var2 = em3Var.C;
                        db3Var2.h = 0;
                        za3 za3Var = db3Var2.a;
                        z44 A = za3Var.A();
                        Object[] objArr = A.x;
                        int i = A.z;
                        for (int i2 = 0; i2 < i; i2++) {
                            em3 em3Var2 = ((za3) objArr[i2]).d0.q;
                            em3Var2.getClass();
                            em3Var2.E = em3Var2.F;
                            em3Var2.F = Integer.MAX_VALUE;
                            if (em3Var2.G == xa3.y) {
                                em3Var2.G = xa3.z;
                            }
                        }
                        z44 A2 = za3Var.A();
                        Object[] objArr2 = A2.x;
                        int i3 = A2.z;
                        for (int i4 = 0; i4 < i3; i4++) {
                            em3 em3Var3 = ((za3) objArr2[i4]).d0.q;
                            em3Var3.getClass();
                            em3Var3.P.d = false;
                        }
                        jz2 jz2Var = em3Var.e().A0;
                        if (jz2Var != null) {
                            d44 d44Var = (d44) za3Var.n();
                            int i5 = ((z44) d44Var.y).z;
                            for (int i6 = 0; i6 < i5; i6++) {
                                za3 za3Var2 = (za3) d44Var.get(i6);
                                am3 W02 = ((fa4) za3Var2.c0.B).W0();
                                if (W02 != null) {
                                    if (W02.L) {
                                        if (f44Var == null) {
                                            f44Var = new f44();
                                        }
                                        f44Var.a(za3Var2);
                                    }
                                    W02.L = jz2Var.L;
                                }
                            }
                            jz2Var.u0().b();
                            d44 d44Var2 = (d44) za3Var.n();
                            int i7 = ((z44) d44Var2.y).z;
                            int i8 = 0;
                            while (true) {
                                boolean z = true;
                                if (i8 < i7) {
                                    za3 za3Var3 = (za3) d44Var2.get(i8);
                                    if (f44Var == null || !f44Var.e(za3Var3)) {
                                        z = false;
                                    }
                                    am3 W03 = ((fa4) za3Var3.c0.B).W0();
                                    if (W03 != null) {
                                        W03.L = z;
                                    }
                                    i8++;
                                } else {
                                    z44 A3 = za3Var.A();
                                    Object[] objArr3 = A3.x;
                                    int i9 = A3.z;
                                    for (int i10 = 0; i10 < i9; i10++) {
                                        em3 em3Var4 = ((za3) objArr3[i10]).d0.q;
                                        em3Var4.getClass();
                                        int i11 = em3Var4.E;
                                        int i12 = em3Var4.F;
                                        if (i11 != i12 && i12 == Integer.MAX_VALUE) {
                                            em3Var4.j0(true);
                                        }
                                    }
                                    z44 A4 = za3Var.A();
                                    Object[] objArr4 = A4.x;
                                    int i13 = A4.z;
                                    for (int i14 = 0; i14 < i13; i14++) {
                                        em3 em3Var5 = ((za3) objArr4[i14]).d0.q;
                                        em3Var5.getClass();
                                        ab3 ab3Var = em3Var5.P;
                                        ab3Var.e = ab3Var.d;
                                    }
                                    return pn6Var;
                                }
                            }
                        } else {
                            ze0.m("Expected lookahead delegate");
                            return null;
                        }
                        break;
                    case 1:
                        am3 W04 = em3Var.C.a().W0();
                        W04.getClass();
                        W04.p(em3Var.W);
                        return pn6Var;
                    default:
                        db3 db3Var3 = em3Var.C;
                        if (!wk6.w(db3Var3.a) && !db3Var3.c) {
                            fa4 fa4Var = db3Var3.a().T;
                            if (fa4Var != null && (W0 = fa4Var.W0()) != null) {
                                dm4Var = W0.M;
                            }
                        } else {
                            fa4 fa4Var2 = db3Var3.a().T;
                            if (fa4Var2 != null) {
                                dm4Var = fa4Var2.M;
                            }
                        }
                        if (dm4Var == null) {
                            dm4Var = ((oa) cb3.a(db3Var3.a)).getPlacementScope();
                        }
                        am3 W05 = db3Var3.a().W0();
                        W05.getClass();
                        dm4.i(dm4Var, W05, em3Var.L);
                        return pn6Var;
                }
            }
        };
    }

    @Override // defpackage.j7
    public final void A() {
        rx0 rx0Var;
        this.S = true;
        ab3 ab3Var = this.P;
        ab3Var.h();
        db3 db3Var = this.C;
        boolean z = db3Var.f;
        za3 za3Var = db3Var.a;
        if (z) {
            z44 A = za3Var.A();
            Object[] objArr = A.x;
            int i = A.z;
            for (int i2 = 0; i2 < i; i2++) {
                za3 za3Var2 = (za3) objArr[i2];
                db3 db3Var2 = za3Var2.d0;
                if (db3Var2.e && za3Var2.s() == xa3.x) {
                    em3 em3Var = db3Var2.q;
                    em3Var.getClass();
                    em3 em3Var2 = db3Var2.q;
                    if (em3Var2 != null) {
                        rx0Var = em3Var2.K;
                    } else {
                        rx0Var = null;
                    }
                    rx0Var.getClass();
                    if (em3Var.t0(rx0Var.a)) {
                        za3.U(za3Var, false, 7);
                    }
                }
            }
        }
        jz2 jz2Var = e().A0;
        jz2Var.getClass();
        if (db3Var.g || (!this.H && !jz2Var.L && db3Var.f)) {
            db3Var.f = false;
            va3 va3Var = db3Var.d;
            db3Var.d = va3.A;
            db3Var.i(false);
            mh4 snapshotObserver = ((oa) cb3.a(za3Var)).getSnapshotObserver();
            snapshotObserver.a.d(za3Var, snapshotObserver.h, this.T);
            db3Var.d = va3Var;
            if (db3Var.m && jz2Var.L) {
                requestLayout();
            }
            db3Var.g = false;
        }
        if (ab3Var.d) {
            ab3Var.e = true;
        }
        if (ab3Var.b && ab3Var.e()) {
            ab3Var.g();
        }
        this.S = false;
    }

    @Override // defpackage.j7
    public final void K() {
        za3.U(this.C.a, false, 7);
    }

    @Override // defpackage.ro3
    public final int O(int i) {
        o0();
        am3 W0 = this.C.a().W0();
        W0.getClass();
        return W0.O(i);
    }

    @Override // defpackage.em4
    public final int P(f7 f7Var) {
        va3 va3Var;
        db3 db3Var = this.C;
        za3 v = db3Var.a.v();
        va3 va3Var2 = null;
        if (v != null) {
            va3Var = v.d0.d;
        } else {
            va3Var = null;
        }
        va3 va3Var3 = va3.y;
        ab3 ab3Var = this.P;
        if (va3Var == va3Var3) {
            ab3Var.c = true;
        } else {
            za3 v2 = db3Var.a.v();
            if (v2 != null) {
                va3Var2 = v2.d0.d;
            }
            if (va3Var2 == va3.A) {
                ab3Var.d = true;
            }
        }
        this.H = true;
        am3 W0 = db3Var.a().W0();
        W0.getClass();
        int P = W0.P(f7Var);
        this.H = false;
        return P;
    }

    @Override // defpackage.em4
    public final int R() {
        am3 W0 = this.C.a().W0();
        W0.getClass();
        return W0.R();
    }

    @Override // defpackage.em4
    public final int S() {
        am3 W0 = this.C.a().W0();
        W0.getClass();
        return W0.S();
    }

    @Override // defpackage.em4
    public final void V(long j, float f, ub2 ub2Var) {
        r0(j, ub2Var, null);
    }

    @Override // defpackage.em4
    public final void Y(long j, float f, di2 di2Var) {
        r0(j, null, di2Var);
    }

    @Override // defpackage.j7
    public final ab3 a() {
        return this.P;
    }

    @Override // defpackage.ro3
    public final int c(int i) {
        o0();
        am3 W0 = this.C.a().W0();
        W0.getClass();
        return W0.c(i);
    }

    @Override // defpackage.j7
    public final kz2 e() {
        return (kz2) this.C.a.c0.A;
    }

    @Override // defpackage.j7
    public final j7 f() {
        db3 db3Var;
        za3 v = this.C.a.v();
        if (v != null && (db3Var = v.d0) != null) {
            return db3Var.q;
        }
        return null;
    }

    public final boolean f0() {
        db3 db3Var = this.C;
        if (!wk6.w(db3Var.a) && !db3Var.c) {
            return false;
        }
        return true;
    }

    public final void j0(boolean z) {
        if (!z || !f0()) {
            if (z || f0()) {
                this.O = dm3.z;
                z44 A = this.C.a.A();
                Object[] objArr = A.x;
                int i = A.z;
                for (int i2 = 0; i2 < i; i2++) {
                    em3 em3Var = ((za3) objArr[i2]).d0.q;
                    em3Var.getClass();
                    em3Var.j0(true);
                }
            }
        }
    }

    @Override // defpackage.ro3
    public final int k(int i) {
        o0();
        am3 W0 = this.C.a().W0();
        W0.getClass();
        return W0.k(i);
    }

    @Override // defpackage.j7
    public final int l() {
        return this.F;
    }

    public final void l0() {
        dm3 dm3Var = this.O;
        db3 db3Var = this.C;
        boolean z = db3Var.c;
        za3 za3Var = db3Var.a;
        dm3 dm3Var2 = dm3.x;
        if (z) {
            this.O = dm3.y;
        } else {
            this.O = dm3Var2;
        }
        if (dm3Var != dm3Var2 && db3Var.e) {
            za3.U(za3Var, true, 6);
        }
        z44 A = za3Var.A();
        Object[] objArr = A.x;
        int i = A.z;
        for (int i2 = 0; i2 < i; i2++) {
            za3 za3Var2 = (za3) objArr[i2];
            em3 em3Var = za3Var2.d0.q;
            if (em3Var != null) {
                if (em3Var.F != Integer.MAX_VALUE) {
                    em3Var.l0();
                    za3.X(za3Var2);
                }
            } else {
                ze0.k("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
        }
    }

    public final void m0() {
        db3 db3Var = this.C;
        if (db3Var.o > 0) {
            z44 A = db3Var.a.A();
            Object[] objArr = A.x;
            int i = A.z;
            for (int i2 = 0; i2 < i; i2++) {
                za3 za3Var = (za3) objArr[i2];
                db3 db3Var2 = za3Var.d0;
                if ((db3Var2.m || db3Var2.n) && !db3Var2.f) {
                    za3Var.T(false);
                }
                em3 em3Var = db3Var2.q;
                if (em3Var != null) {
                    em3Var.m0();
                }
            }
        }
    }

    @Override // defpackage.ro3
    public final int n(int i) {
        o0();
        am3 W0 = this.C.a().W0();
        W0.getClass();
        return W0.n(i);
    }

    public final void o0() {
        xa3 xa3Var;
        db3 db3Var = this.C;
        za3.U(db3Var.a, false, 7);
        za3 za3Var = db3Var.a;
        za3 v = za3Var.v();
        if (v != null && za3Var.Z == xa3.z) {
            int ordinal = v.d0.d.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    xa3Var = v.Z;
                } else {
                    xa3Var = xa3.y;
                }
            } else {
                xa3Var = xa3.x;
            }
            za3Var.Z = xa3Var;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if (r1 == defpackage.va3.A) goto L14;
     */
    @Override // defpackage.ro3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.em4 p(long r7) {
        /*
            r6 = this;
            db3 r0 = r6.C
            za3 r1 = r0.a
            za3 r2 = r0.a
            za3 r1 = r1.v()
            r3 = 0
            if (r1 == 0) goto L12
            db3 r1 = r1.d0
            va3 r1 = r1.d
            goto L13
        L12:
            r1 = r3
        L13:
            va3 r4 = defpackage.va3.y
            if (r1 == r4) goto L27
            za3 r1 = r2.v()
            if (r1 == 0) goto L22
            db3 r1 = r1.d0
            va3 r1 = r1.d
            goto L23
        L22:
            r1 = r3
        L23:
            va3 r4 = defpackage.va3.A
            if (r1 != r4) goto L2a
        L27:
            r1 = 0
            r0.b = r1
        L2a:
            za3 r0 = r2.v()
            xa3 r1 = defpackage.xa3.z
            if (r0 == 0) goto L64
            db3 r0 = r0.d0
            xa3 r4 = r6.G
            if (r4 == r1) goto L42
            boolean r4 = r2.b0
            if (r4 == 0) goto L3d
            goto L42
        L3d:
            java.lang.String r4 = "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"
            defpackage.ez2.b(r4)
        L42:
            va3 r4 = r0.d
            int r4 = r4.ordinal()
            if (r4 == 0) goto L5f
            r5 = 1
            if (r4 == r5) goto L5f
            r5 = 2
            if (r4 == r5) goto L5c
            r5 = 3
            if (r4 != r5) goto L54
            goto L5c
        L54:
            va3 r6 = r0.d
            java.lang.String r7 = "Measurable could be only measured from the parent's measure or layout block. Parents state is "
            defpackage.ze0.f(r6, r7)
            return r3
        L5c:
            xa3 r0 = defpackage.xa3.y
            goto L61
        L5f:
            xa3 r0 = defpackage.xa3.x
        L61:
            r6.G = r0
            goto L66
        L64:
            r6.G = r1
        L66:
            xa3 r0 = r2.Z
            if (r0 != r1) goto L6d
            r2.e()
        L6d:
            r6.t0(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.em3.p(long):em4");
    }

    public final void q0() {
        va3 va3Var;
        this.Z = true;
        db3 db3Var = this.C;
        za3 v = db3Var.a.v();
        dm3 dm3Var = this.O;
        if ((dm3Var != dm3.x && !db3Var.c) || (dm3Var != dm3.y && db3Var.c)) {
            l0();
            if (this.D && v != null) {
                v.T(false);
            }
        }
        if (v != null) {
            db3 db3Var2 = v.d0;
            if (!this.D && ((va3Var = db3Var2.d) == va3.z || va3Var == va3.A)) {
                if (this.F != Integer.MAX_VALUE) {
                    ez2.b("Place was called on a node which was placed already");
                }
                int i = db3Var2.h;
                this.F = i;
                db3Var2.h = i + 1;
            }
        } else {
            this.F = 0;
        }
        A();
    }

    public final void r0(long j, ub2 ub2Var, di2 di2Var) {
        va3 va3Var;
        db3 db3Var = this.C;
        za3 za3Var = db3Var.a;
        za3 za3Var2 = db3Var.a;
        try {
            za3 v = za3Var.v();
            if (v != null) {
                va3Var = v.d0.d;
            } else {
                va3Var = null;
            }
            va3 va3Var2 = va3.A;
            if (va3Var == va3Var2) {
                db3Var.c = false;
            }
            if (za3Var2.n0) {
                ez2.a("place is called on a deactivated node");
            }
            db3Var.d = va3Var2;
            boolean z = true;
            this.I = true;
            this.Z = false;
            if (!c13.b(j, this.L)) {
                if (db3Var.n || db3Var.m) {
                    db3Var.f = true;
                }
                m0();
            }
            kh4 a = cb3.a(za3Var2);
            this.L = j;
            if (!db3Var.f) {
                if (this.O == dm3.z) {
                    z = false;
                }
                if (z) {
                    am3 W0 = db3Var.a().W0();
                    W0.getClass();
                    W0.O0(c13.d(j, W0.B));
                    q0();
                    this.M = ub2Var;
                    this.N = di2Var;
                    db3Var.d = va3.B;
                }
            }
            db3Var.h(false);
            this.P.g = false;
            mh4 snapshotObserver = ((oa) a).getSnapshotObserver();
            snapshotObserver.a.d(za3Var2, snapshotObserver.g, this.Y);
            this.M = ub2Var;
            this.N = di2Var;
            db3Var.d = va3.B;
        } catch (Throwable th) {
            za3Var.Z(th);
            throw null;
        }
    }

    @Override // defpackage.j7
    public final void requestLayout() {
        this.C.a.T(false);
    }

    @Override // defpackage.j7
    public final void t(l0 l0Var) {
        z44 A = this.C.a.A();
        Object[] objArr = A.x;
        int i = A.z;
        for (int i2 = 0; i2 < i; i2++) {
            em3 em3Var = ((za3) objArr[i2]).d0.q;
            em3Var.getClass();
            l0Var.invoke(em3Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0076, B:33:0x007a, B:34:0x0082, B:37:0x0094, B:39:0x00b1, B:43:0x008f), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064 A[Catch: all -> 0x0010, LOOP:0: B:28:0x0062->B:29:0x0064, LOOP_END, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0076, B:33:0x007a, B:34:0x0082, B:37:0x0094, B:39:0x00b1, B:43:0x008f), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0076, B:33:0x007a, B:34:0x0082, B:37:0x0094, B:39:0x00b1, B:43:0x008f), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008f A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0076, B:33:0x007a, B:34:0x0082, B:37:0x0094, B:39:0x00b1, B:43:0x008f), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean t0(long r14) {
        /*
            r13 = this;
            db3 r0 = r13.C
            za3 r1 = r0.a
            za3 r2 = r0.a
            boolean r3 = r1.n0     // Catch: java.lang.Throwable -> L10
            if (r3 == 0) goto L13
            java.lang.String r3 = "measure is called on a deactivated node"
            defpackage.ez2.a(r3)     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r13 = move-exception
            goto Lbb
        L13:
            za3 r3 = r2.v()     // Catch: java.lang.Throwable -> L10
            boolean r4 = r2.b0     // Catch: java.lang.Throwable -> L10
            r5 = 1
            r6 = 0
            if (r4 != 0) goto L26
            if (r3 == 0) goto L24
            boolean r3 = r3.b0     // Catch: java.lang.Throwable -> L10
            if (r3 == 0) goto L24
            goto L26
        L24:
            r3 = r6
            goto L27
        L26:
            r3 = r5
        L27:
            r2.b0 = r3     // Catch: java.lang.Throwable -> L10
            db3 r3 = r2.d0     // Catch: java.lang.Throwable -> L10
            boolean r3 = r3.e     // Catch: java.lang.Throwable -> L10
            if (r3 != 0) goto L4b
            rx0 r3 = r13.K     // Catch: java.lang.Throwable -> L10
            if (r3 != 0) goto L35
            r3 = r6
            goto L3b
        L35:
            long r3 = r3.a     // Catch: java.lang.Throwable -> L10
            boolean r3 = defpackage.rx0.b(r3, r14)     // Catch: java.lang.Throwable -> L10
        L3b:
            if (r3 != 0) goto L3e
            goto L4b
        L3e:
            kh4 r13 = r2.K     // Catch: java.lang.Throwable -> L10
            if (r13 == 0) goto L47
            oa r13 = (defpackage.oa) r13     // Catch: java.lang.Throwable -> L10
            r13.g(r2, r5)     // Catch: java.lang.Throwable -> L10
        L47:
            r2.Y()     // Catch: java.lang.Throwable -> L10
            return r6
        L4b:
            rx0 r3 = new rx0     // Catch: java.lang.Throwable -> L10
            r3.<init>(r14)     // Catch: java.lang.Throwable -> L10
            r13.K = r3     // Catch: java.lang.Throwable -> L10
            r13.b0(r14)     // Catch: java.lang.Throwable -> L10
            ab3 r3 = r13.P     // Catch: java.lang.Throwable -> L10
            r3.f = r6     // Catch: java.lang.Throwable -> L10
            z44 r2 = r2.A()     // Catch: java.lang.Throwable -> L10
            java.lang.Object[] r3 = r2.x     // Catch: java.lang.Throwable -> L10
            int r2 = r2.z     // Catch: java.lang.Throwable -> L10
            r4 = r6
        L62:
            if (r4 >= r2) goto L76
            r7 = r3[r4]     // Catch: java.lang.Throwable -> L10
            za3 r7 = (defpackage.za3) r7     // Catch: java.lang.Throwable -> L10
            db3 r7 = r7.d0     // Catch: java.lang.Throwable -> L10
            em3 r7 = r7.q     // Catch: java.lang.Throwable -> L10
            r7.getClass()     // Catch: java.lang.Throwable -> L10
            ab3 r7 = r7.P     // Catch: java.lang.Throwable -> L10
            r7.c = r6     // Catch: java.lang.Throwable -> L10
            int r4 = r4 + 1
            goto L62
        L76:
            boolean r2 = r13.J     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto L7d
            long r2 = r13.z     // Catch: java.lang.Throwable -> L10
            goto L82
        L7d:
            r2 = -9223372034707292160(0x8000000080000000, double:-1.0609978955E-314)
        L82:
            r13.J = r5     // Catch: java.lang.Throwable -> L10
            fa4 r4 = r0.a()     // Catch: java.lang.Throwable -> L10
            am3 r4 = r4.W0()     // Catch: java.lang.Throwable -> L10
            if (r4 == 0) goto L8f
            goto L94
        L8f:
            java.lang.String r7 = "Lookahead result from lookaheadRemeasure cannot be null"
            defpackage.ez2.b(r7)     // Catch: java.lang.Throwable -> L10
        L94:
            r0.c(r14)     // Catch: java.lang.Throwable -> L10
            int r14 = r4.x     // Catch: java.lang.Throwable -> L10
            int r15 = r4.y     // Catch: java.lang.Throwable -> L10
            long r7 = (long) r14     // Catch: java.lang.Throwable -> L10
            r14 = 32
            long r7 = r7 << r14
            long r9 = (long) r15     // Catch: java.lang.Throwable -> L10
            r11 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r9 = r9 & r11
            long r7 = r7 | r9
            r13.Z(r7)     // Catch: java.lang.Throwable -> L10
            long r13 = r2 >> r14
            int r13 = (int) r13     // Catch: java.lang.Throwable -> L10
            int r14 = r4.x     // Catch: java.lang.Throwable -> L10
            if (r13 != r14) goto Lba
            long r13 = r2 & r11
            int r13 = (int) r13     // Catch: java.lang.Throwable -> L10
            int r14 = r4.y     // Catch: java.lang.Throwable -> L10
            if (r13 == r14) goto Lb9
            goto Lba
        Lb9:
            return r6
        Lba:
            return r5
        Lbb:
            r1.Z(r13)
            r13 = 0
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.em3.t0(long):boolean");
    }

    @Override // defpackage.em4, defpackage.ro3
    public final Object w() {
        return this.V;
    }

    @Override // defpackage.x04
    public final void z(boolean z) {
        Boolean bool;
        am3 W0;
        db3 db3Var = this.C;
        am3 W02 = db3Var.a().W0();
        if (W02 != null) {
            bool = Boolean.valueOf(W02.I);
        } else {
            bool = null;
        }
        if (!Boolean.valueOf(z).equals(bool) && (W0 = db3Var.a().W0()) != null) {
            W0.I = z;
        }
    }
}
