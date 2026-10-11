package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class uo3 extends em4 implements ro3, j7, x04 {
    public final db3 C;
    public boolean D;
    public boolean G;
    public boolean H;
    public boolean J;
    public ub2 L;
    public di2 M;
    public float N;
    public Object P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean Y;
    public final to3 a0;
    public final to3 b0;
    public float c0;
    public boolean d0;
    public ub2 e0;
    public di2 f0;
    public float h0;
    public final to3 i0;
    public boolean j0;
    public int E = Integer.MAX_VALUE;
    public int F = Integer.MAX_VALUE;
    public xa3 I = xa3.z;
    public long K = 0;
    public boolean O = true;
    public final ab3 V = new ab3(this, (byte) 0);
    public final z44 W = new z44(new uo3[16], 0);
    public boolean X = true;
    public long Z = sx0.b(0, 0, 0, 0, 15);
    public long g0 = 0;

    /* JADX WARN: Type inference failed for: r2v3, types: [to3] */
    /* JADX WARN: Type inference failed for: r2v4, types: [to3] */
    /* JADX WARN: Type inference failed for: r7v4, types: [to3] */
    public uo3(db3 db3Var) {
        this.C = db3Var;
        final byte b = 1;
        final byte b2 = 0;
        this.a0 = new sb2(this) { // from class: to3
            public final /* synthetic */ uo3 y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                boolean z;
                dm4 placementScope;
                byte b3 = b2;
                f44 f44Var = null;
                pn6 pn6Var = pn6.a;
                uo3 uo3Var = this.y;
                switch (b3) {
                    case 0:
                        uo3Var.C.a().p(uo3Var.Z);
                        return pn6Var;
                    case 1:
                        db3 db3Var2 = uo3Var.C;
                        db3Var2.i = 0;
                        za3 za3Var = db3Var2.a;
                        z44 A = za3Var.A();
                        Object[] objArr = A.x;
                        int i = A.z;
                        for (int i2 = 0; i2 < i; i2++) {
                            uo3 uo3Var2 = ((za3) objArr[i2]).d0.p;
                            uo3Var2.E = uo3Var2.F;
                            uo3Var2.F = Integer.MAX_VALUE;
                            uo3Var2.R = false;
                            if (uo3Var2.I == xa3.y) {
                                uo3Var2.I = xa3.z;
                            }
                        }
                        z44 A2 = za3Var.A();
                        Object[] objArr2 = A2.x;
                        int i3 = A2.z;
                        for (int i4 = 0; i4 < i3; i4++) {
                            ((za3) objArr2[i4]).d0.p.V.d = false;
                        }
                        d44 d44Var = (d44) za3Var.n();
                        int i5 = ((z44) d44Var.y).z;
                        for (int i6 = 0; i6 < i5; i6++) {
                            za3 za3Var2 = (za3) d44Var.get(i6);
                            if (((fa4) za3Var2.c0.B).L) {
                                if (f44Var == null) {
                                    f44Var = new f44();
                                }
                                f44Var.a(za3Var2);
                            }
                            ((fa4) za3Var2.c0.B).L = uo3Var.e().L;
                        }
                        uo3Var.e().u0().b();
                        d44 d44Var2 = (d44) za3Var.n();
                        int i7 = ((z44) d44Var2.y).z;
                        for (int i8 = 0; i8 < i7; i8++) {
                            za3 za3Var3 = (za3) d44Var2.get(i8);
                            if (f44Var != null) {
                                z = true;
                                if (f44Var.e(za3Var3)) {
                                    ((fa4) za3Var3.c0.B).L = z;
                                }
                            }
                            z = false;
                            ((fa4) za3Var3.c0.B).L = z;
                        }
                        z44 A3 = za3Var.A();
                        Object[] objArr3 = A3.x;
                        int i9 = A3.z;
                        for (int i10 = 0; i10 < i9; i10++) {
                            za3 za3Var4 = (za3) objArr3[i10];
                            db3 db3Var3 = za3Var4.d0;
                            if (db3Var3.p.E != za3Var4.w()) {
                                za3Var.P();
                                za3Var.D();
                                if (za3Var4.w() == Integer.MAX_VALUE) {
                                    if (db3Var3.c || wk6.w(za3Var4)) {
                                        em3 em3Var = db3Var3.q;
                                        em3Var.getClass();
                                        em3Var.j0(false);
                                    }
                                    db3Var3.p.l0();
                                }
                            }
                        }
                        z44 A4 = za3Var.A();
                        Object[] objArr4 = A4.x;
                        int i11 = A4.z;
                        for (int i12 = 0; i12 < i11; i12++) {
                            ab3 ab3Var = ((za3) objArr4[i12]).d0.p.V;
                            ab3Var.e = ab3Var.d;
                        }
                        return pn6Var;
                    default:
                        db3 db3Var4 = uo3Var.C;
                        fa4 fa4Var = db3Var4.a().T;
                        if (fa4Var != null) {
                            placementScope = fa4Var.M;
                        } else {
                            placementScope = ((oa) cb3.a(db3Var4.a)).getPlacementScope();
                        }
                        ub2 ub2Var = uo3Var.e0;
                        di2 di2Var = uo3Var.f0;
                        if (di2Var != null) {
                            fa4 a = db3Var4.a();
                            long j = uo3Var.g0;
                            float f = uo3Var.h0;
                            placementScope.e(a);
                            a.Y(c13.d(j, a.B), f, di2Var);
                        } else if (ub2Var == null) {
                            fa4 a2 = db3Var4.a();
                            long j2 = uo3Var.g0;
                            float f2 = uo3Var.h0;
                            placementScope.e(a2);
                            a2.V(c13.d(j2, a2.B), f2, null);
                        } else {
                            fa4 a3 = db3Var4.a();
                            long j3 = uo3Var.g0;
                            float f3 = uo3Var.h0;
                            placementScope.e(a3);
                            a3.V(c13.d(j3, a3.B), f3, ub2Var);
                        }
                        return pn6Var;
                }
            }
        };
        this.b0 = new sb2(this) { // from class: to3
            public final /* synthetic */ uo3 y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                boolean z;
                dm4 placementScope;
                byte b3 = b;
                f44 f44Var = null;
                pn6 pn6Var = pn6.a;
                uo3 uo3Var = this.y;
                switch (b3) {
                    case 0:
                        uo3Var.C.a().p(uo3Var.Z);
                        return pn6Var;
                    case 1:
                        db3 db3Var2 = uo3Var.C;
                        db3Var2.i = 0;
                        za3 za3Var = db3Var2.a;
                        z44 A = za3Var.A();
                        Object[] objArr = A.x;
                        int i = A.z;
                        for (int i2 = 0; i2 < i; i2++) {
                            uo3 uo3Var2 = ((za3) objArr[i2]).d0.p;
                            uo3Var2.E = uo3Var2.F;
                            uo3Var2.F = Integer.MAX_VALUE;
                            uo3Var2.R = false;
                            if (uo3Var2.I == xa3.y) {
                                uo3Var2.I = xa3.z;
                            }
                        }
                        z44 A2 = za3Var.A();
                        Object[] objArr2 = A2.x;
                        int i3 = A2.z;
                        for (int i4 = 0; i4 < i3; i4++) {
                            ((za3) objArr2[i4]).d0.p.V.d = false;
                        }
                        d44 d44Var = (d44) za3Var.n();
                        int i5 = ((z44) d44Var.y).z;
                        for (int i6 = 0; i6 < i5; i6++) {
                            za3 za3Var2 = (za3) d44Var.get(i6);
                            if (((fa4) za3Var2.c0.B).L) {
                                if (f44Var == null) {
                                    f44Var = new f44();
                                }
                                f44Var.a(za3Var2);
                            }
                            ((fa4) za3Var2.c0.B).L = uo3Var.e().L;
                        }
                        uo3Var.e().u0().b();
                        d44 d44Var2 = (d44) za3Var.n();
                        int i7 = ((z44) d44Var2.y).z;
                        for (int i8 = 0; i8 < i7; i8++) {
                            za3 za3Var3 = (za3) d44Var2.get(i8);
                            if (f44Var != null) {
                                z = true;
                                if (f44Var.e(za3Var3)) {
                                    ((fa4) za3Var3.c0.B).L = z;
                                }
                            }
                            z = false;
                            ((fa4) za3Var3.c0.B).L = z;
                        }
                        z44 A3 = za3Var.A();
                        Object[] objArr3 = A3.x;
                        int i9 = A3.z;
                        for (int i10 = 0; i10 < i9; i10++) {
                            za3 za3Var4 = (za3) objArr3[i10];
                            db3 db3Var3 = za3Var4.d0;
                            if (db3Var3.p.E != za3Var4.w()) {
                                za3Var.P();
                                za3Var.D();
                                if (za3Var4.w() == Integer.MAX_VALUE) {
                                    if (db3Var3.c || wk6.w(za3Var4)) {
                                        em3 em3Var = db3Var3.q;
                                        em3Var.getClass();
                                        em3Var.j0(false);
                                    }
                                    db3Var3.p.l0();
                                }
                            }
                        }
                        z44 A4 = za3Var.A();
                        Object[] objArr4 = A4.x;
                        int i11 = A4.z;
                        for (int i12 = 0; i12 < i11; i12++) {
                            ab3 ab3Var = ((za3) objArr4[i12]).d0.p.V;
                            ab3Var.e = ab3Var.d;
                        }
                        return pn6Var;
                    default:
                        db3 db3Var4 = uo3Var.C;
                        fa4 fa4Var = db3Var4.a().T;
                        if (fa4Var != null) {
                            placementScope = fa4Var.M;
                        } else {
                            placementScope = ((oa) cb3.a(db3Var4.a)).getPlacementScope();
                        }
                        ub2 ub2Var = uo3Var.e0;
                        di2 di2Var = uo3Var.f0;
                        if (di2Var != null) {
                            fa4 a = db3Var4.a();
                            long j = uo3Var.g0;
                            float f = uo3Var.h0;
                            placementScope.e(a);
                            a.Y(c13.d(j, a.B), f, di2Var);
                        } else if (ub2Var == null) {
                            fa4 a2 = db3Var4.a();
                            long j2 = uo3Var.g0;
                            float f2 = uo3Var.h0;
                            placementScope.e(a2);
                            a2.V(c13.d(j2, a2.B), f2, null);
                        } else {
                            fa4 a3 = db3Var4.a();
                            long j3 = uo3Var.g0;
                            float f3 = uo3Var.h0;
                            placementScope.e(a3);
                            a3.V(c13.d(j3, a3.B), f3, ub2Var);
                        }
                        return pn6Var;
                }
            }
        };
        final byte b3 = 2;
        this.i0 = new sb2(this) { // from class: to3
            public final /* synthetic */ uo3 y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                boolean z;
                dm4 placementScope;
                byte b32 = b3;
                f44 f44Var = null;
                pn6 pn6Var = pn6.a;
                uo3 uo3Var = this.y;
                switch (b32) {
                    case 0:
                        uo3Var.C.a().p(uo3Var.Z);
                        return pn6Var;
                    case 1:
                        db3 db3Var2 = uo3Var.C;
                        db3Var2.i = 0;
                        za3 za3Var = db3Var2.a;
                        z44 A = za3Var.A();
                        Object[] objArr = A.x;
                        int i = A.z;
                        for (int i2 = 0; i2 < i; i2++) {
                            uo3 uo3Var2 = ((za3) objArr[i2]).d0.p;
                            uo3Var2.E = uo3Var2.F;
                            uo3Var2.F = Integer.MAX_VALUE;
                            uo3Var2.R = false;
                            if (uo3Var2.I == xa3.y) {
                                uo3Var2.I = xa3.z;
                            }
                        }
                        z44 A2 = za3Var.A();
                        Object[] objArr2 = A2.x;
                        int i3 = A2.z;
                        for (int i4 = 0; i4 < i3; i4++) {
                            ((za3) objArr2[i4]).d0.p.V.d = false;
                        }
                        d44 d44Var = (d44) za3Var.n();
                        int i5 = ((z44) d44Var.y).z;
                        for (int i6 = 0; i6 < i5; i6++) {
                            za3 za3Var2 = (za3) d44Var.get(i6);
                            if (((fa4) za3Var2.c0.B).L) {
                                if (f44Var == null) {
                                    f44Var = new f44();
                                }
                                f44Var.a(za3Var2);
                            }
                            ((fa4) za3Var2.c0.B).L = uo3Var.e().L;
                        }
                        uo3Var.e().u0().b();
                        d44 d44Var2 = (d44) za3Var.n();
                        int i7 = ((z44) d44Var2.y).z;
                        for (int i8 = 0; i8 < i7; i8++) {
                            za3 za3Var3 = (za3) d44Var2.get(i8);
                            if (f44Var != null) {
                                z = true;
                                if (f44Var.e(za3Var3)) {
                                    ((fa4) za3Var3.c0.B).L = z;
                                }
                            }
                            z = false;
                            ((fa4) za3Var3.c0.B).L = z;
                        }
                        z44 A3 = za3Var.A();
                        Object[] objArr3 = A3.x;
                        int i9 = A3.z;
                        for (int i10 = 0; i10 < i9; i10++) {
                            za3 za3Var4 = (za3) objArr3[i10];
                            db3 db3Var3 = za3Var4.d0;
                            if (db3Var3.p.E != za3Var4.w()) {
                                za3Var.P();
                                za3Var.D();
                                if (za3Var4.w() == Integer.MAX_VALUE) {
                                    if (db3Var3.c || wk6.w(za3Var4)) {
                                        em3 em3Var = db3Var3.q;
                                        em3Var.getClass();
                                        em3Var.j0(false);
                                    }
                                    db3Var3.p.l0();
                                }
                            }
                        }
                        z44 A4 = za3Var.A();
                        Object[] objArr4 = A4.x;
                        int i11 = A4.z;
                        for (int i12 = 0; i12 < i11; i12++) {
                            ab3 ab3Var = ((za3) objArr4[i12]).d0.p.V;
                            ab3Var.e = ab3Var.d;
                        }
                        return pn6Var;
                    default:
                        db3 db3Var4 = uo3Var.C;
                        fa4 fa4Var = db3Var4.a().T;
                        if (fa4Var != null) {
                            placementScope = fa4Var.M;
                        } else {
                            placementScope = ((oa) cb3.a(db3Var4.a)).getPlacementScope();
                        }
                        ub2 ub2Var = uo3Var.e0;
                        di2 di2Var = uo3Var.f0;
                        if (di2Var != null) {
                            fa4 a = db3Var4.a();
                            long j = uo3Var.g0;
                            float f = uo3Var.h0;
                            placementScope.e(a);
                            a.Y(c13.d(j, a.B), f, di2Var);
                        } else if (ub2Var == null) {
                            fa4 a2 = db3Var4.a();
                            long j2 = uo3Var.g0;
                            float f2 = uo3Var.h0;
                            placementScope.e(a2);
                            a2.V(c13.d(j2, a2.B), f2, null);
                        } else {
                            fa4 a3 = db3Var4.a();
                            long j3 = uo3Var.g0;
                            float f3 = uo3Var.h0;
                            placementScope.e(a3);
                            a3.V(c13.d(j3, a3.B), f3, ub2Var);
                        }
                        return pn6Var;
                }
            }
        };
    }

    @Override // defpackage.j7
    public final void A() {
        rx0 rx0Var;
        boolean z;
        this.Y = true;
        ab3 ab3Var = this.V;
        ab3Var.h();
        boolean z2 = this.T;
        db3 db3Var = this.C;
        if (z2) {
            z44 A = db3Var.a.A();
            Object[] objArr = A.x;
            int i = A.z;
            for (int i2 = 0; i2 < i; i2++) {
                za3 za3Var = (za3) objArr[i2];
                boolean q = za3Var.q();
                db3 db3Var2 = za3Var.d0;
                if (q && za3Var.r() == xa3.x) {
                    uo3 uo3Var = db3Var2.p;
                    if (uo3Var.G) {
                        rx0Var = new rx0(uo3Var.A);
                    } else {
                        rx0Var = null;
                    }
                    if (rx0Var != null) {
                        if (za3Var.Z == xa3.z) {
                            za3Var.e();
                        }
                        z = db3Var2.p.t0(rx0Var.a);
                    } else {
                        z = false;
                    }
                    if (z) {
                        za3.W(db3Var.a, false, 7);
                    }
                }
            }
        }
        if (this.U || (!this.J && !e().L && this.T)) {
            this.T = false;
            va3 va3Var = db3Var.d;
            db3Var.d = va3.z;
            db3Var.g(false);
            za3 za3Var2 = db3Var.a;
            mh4 snapshotObserver = ((oa) cb3.a(za3Var2)).getSnapshotObserver();
            snapshotObserver.a.d(za3Var2, snapshotObserver.e, this.b0);
            db3Var.d = va3Var;
            this.U = false;
        }
        if (ab3Var.d) {
            ab3Var.e = true;
        }
        if (ab3Var.b && ab3Var.e()) {
            ab3Var.g();
        }
        this.Y = false;
    }

    @Override // defpackage.j7
    public final void K() {
        za3.W(this.C.a, false, 7);
    }

    @Override // defpackage.ro3
    public final int O(int i) {
        db3 db3Var = this.C;
        if (wk6.w(db3Var.a)) {
            em3 em3Var = db3Var.q;
            em3Var.getClass();
            return em3Var.O(i);
        }
        m0();
        return db3Var.a().O(i);
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
        va3 va3Var3 = va3.x;
        ab3 ab3Var = this.V;
        if (va3Var == va3Var3) {
            ab3Var.c = true;
        } else {
            za3 v2 = db3Var.a.v();
            if (v2 != null) {
                va3Var2 = v2.d0.d;
            }
            if (va3Var2 == va3.z) {
                ab3Var.d = true;
            }
        }
        this.J = true;
        int P = db3Var.a().P(f7Var);
        this.J = false;
        return P;
    }

    @Override // defpackage.em4
    public final int R() {
        return this.C.a().R();
    }

    @Override // defpackage.em4
    public final int S() {
        return this.C.a().S();
    }

    @Override // defpackage.em4
    public final void V(long j, float f, ub2 ub2Var) {
        r0(j, f, ub2Var, null);
    }

    @Override // defpackage.em4
    public final void Y(long j, float f, di2 di2Var) {
        r0(j, f, null, di2Var);
    }

    @Override // defpackage.j7
    public final ab3 a() {
        return this.V;
    }

    @Override // defpackage.ro3
    public final int c(int i) {
        db3 db3Var = this.C;
        if (wk6.w(db3Var.a)) {
            em3 em3Var = db3Var.q;
            em3Var.getClass();
            return em3Var.c(i);
        }
        m0();
        return db3Var.a().c(i);
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
            return db3Var.p;
        }
        return null;
    }

    public final List f0() {
        db3 db3Var = this.C;
        db3Var.a.g0();
        boolean z = this.X;
        z44 z44Var = this.W;
        if (!z) {
            return z44Var.g();
        }
        za3 za3Var = db3Var.a;
        z44 A = za3Var.A();
        Object[] objArr = A.x;
        int i = A.z;
        for (int i2 = 0; i2 < i; i2++) {
            za3 za3Var2 = (za3) objArr[i2];
            if (z44Var.z <= i2) {
                z44Var.b(za3Var2.d0.p);
            } else {
                uo3 uo3Var = za3Var2.d0.p;
                Object[] objArr2 = z44Var.x;
                Object obj = objArr2[i2];
                objArr2[i2] = uo3Var;
            }
        }
        z44Var.n(((z44) ((d44) za3Var.n()).y).z, z44Var.z);
        this.X = false;
        return z44Var.g();
    }

    public final void j0() {
        boolean z = this.Q;
        this.Q = true;
        db3 db3Var = this.C;
        za3 za3Var = db3Var.a;
        kf kfVar = za3Var.c0;
        if (!z) {
            ((kz2) kfVar.A).k1();
            ((oa) cb3.a(za3Var)).getRectManager().g(db3Var.a);
            if (za3Var.q()) {
                za3.W(za3Var, true, 6);
            } else if (za3Var.d0.e) {
                za3.U(za3Var, true, 6);
            }
        }
        fa4 fa4Var = ((kz2) kfVar.A).S;
        for (fa4 fa4Var2 = (fa4) kfVar.B; !a34.i(fa4Var2, fa4Var) && fa4Var2 != null; fa4Var2 = fa4Var2.S) {
            if (fa4Var2.p0) {
                fa4Var2.g1();
            }
        }
        z44 A = za3Var.A();
        Object[] objArr = A.x;
        int i = A.z;
        for (int i2 = 0; i2 < i; i2++) {
            za3 za3Var2 = (za3) objArr[i2];
            if (za3Var2.w() != Integer.MAX_VALUE) {
                za3Var2.d0.p.j0();
                za3.X(za3Var2);
            }
        }
    }

    @Override // defpackage.ro3
    public final int k(int i) {
        db3 db3Var = this.C;
        if (wk6.w(db3Var.a)) {
            em3 em3Var = db3Var.q;
            em3Var.getClass();
            return em3Var.k(i);
        }
        m0();
        return db3Var.a().k(i);
    }

    @Override // defpackage.j7
    public final int l() {
        return this.F;
    }

    public final void l0() {
        if (this.Q) {
            this.Q = false;
            db3 db3Var = this.C;
            za3 za3Var = db3Var.a;
            za3 za3Var2 = db3Var.a;
            ((oa) cb3.a(za3Var)).getRectManager().h(za3Var2);
            kf kfVar = za3Var2.c0;
            fa4 fa4Var = ((kz2) kfVar.A).S;
            for (fa4 fa4Var2 = (fa4) kfVar.B; !a34.i(fa4Var2, fa4Var) && fa4Var2 != null; fa4Var2 = fa4Var2.S) {
                fa4Var2.m1();
                fa4Var2.r1();
            }
            z44 A = za3Var2.A();
            Object[] objArr = A.x;
            int i = A.z;
            for (int i2 = 0; i2 < i; i2++) {
                ((za3) objArr[i2]).d0.p.l0();
            }
        }
    }

    public final void m0() {
        xa3 xa3Var;
        db3 db3Var = this.C;
        za3.W(db3Var.a, false, 7);
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

    @Override // defpackage.ro3
    public final int n(int i) {
        db3 db3Var = this.C;
        if (wk6.w(db3Var.a)) {
            em3 em3Var = db3Var.q;
            em3Var.getClass();
            return em3Var.n(i);
        }
        m0();
        return db3Var.a().n(i);
    }

    public final void o0() {
        this.d0 = true;
        db3 db3Var = this.C;
        za3 v = db3Var.a.v();
        float f = e().d0;
        za3 za3Var = db3Var.a;
        kf kfVar = za3Var.c0;
        fa4 fa4Var = (fa4) kfVar.B;
        kz2 kz2Var = (kz2) kfVar.A;
        while (fa4Var != kz2Var) {
            fa4Var.getClass();
            ta3 ta3Var = (ta3) fa4Var;
            f += ta3Var.d0;
            fa4Var = ta3Var.S;
        }
        if (f != this.c0) {
            this.c0 = f;
            if (v != null) {
                v.P();
            }
            if (v != null) {
                v.D();
            }
        }
        if (!e().L) {
            boolean z = this.Q;
            if (!z || this.V.d()) {
                j0();
            }
            if (!z) {
                if (v != null) {
                    v.D();
                }
                if (this.D && v != null) {
                    v.V(false);
                }
            } else {
                ((kz2) za3Var.c0.A).k1();
            }
        }
        if (v != null) {
            db3 db3Var2 = v.d0;
            if (!this.D && db3Var2.d == va3.z) {
                if (this.F != Integer.MAX_VALUE) {
                    ez2.b("Place was called on a node which was placed already");
                }
                int i = db3Var2.i;
                this.F = i;
                db3Var2.i = i + 1;
            }
        } else {
            this.F = 0;
        }
        A();
    }

    @Override // defpackage.ro3
    public final em4 p(long j) {
        xa3 xa3Var;
        db3 db3Var = this.C;
        za3 za3Var = db3Var.a;
        za3 za3Var2 = db3Var.a;
        xa3 xa3Var2 = za3Var.Z;
        xa3 xa3Var3 = xa3.z;
        if (xa3Var2 == xa3Var3) {
            za3Var.e();
        }
        if (wk6.w(za3Var2)) {
            em3 em3Var = db3Var.q;
            em3Var.getClass();
            em3Var.G = xa3Var3;
            em3Var.p(j);
        }
        za3 v = za3Var2.v();
        if (v != null) {
            db3 db3Var2 = v.d0;
            if (this.I != xa3Var3 && !za3Var2.b0) {
                ez2.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int ordinal = db3Var2.d.ordinal();
            if (ordinal != 0) {
                if (ordinal == 2) {
                    xa3Var = xa3.y;
                } else {
                    ze0.f(db3Var2.d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
            } else {
                xa3Var = xa3.x;
            }
            this.I = xa3Var;
        } else {
            this.I = xa3Var3;
        }
        t0(j);
        return this;
    }

    public final void q0(long j, float f, ub2 ub2Var, di2 di2Var) {
        db3 db3Var = this.C;
        za3 za3Var = db3Var.a;
        za3 za3Var2 = db3Var.a;
        if (za3Var.n0) {
            ez2.a("place is called on a deactivated node");
        }
        db3Var.d = va3.z;
        this.K = j;
        this.N = f;
        this.L = ub2Var;
        this.M = di2Var;
        this.d0 = false;
        kh4 a = cb3.a(za3Var2);
        if (!this.T && this.Q) {
            fa4 a2 = db3Var.a();
            a2.p1(c13.d(j, a2.B), f, ub2Var, di2Var);
            o0();
        } else {
            this.V.g = false;
            db3Var.f(false);
            this.e0 = ub2Var;
            this.g0 = j;
            this.h0 = f;
            this.f0 = di2Var;
            mh4 snapshotObserver = ((oa) a).getSnapshotObserver();
            snapshotObserver.a.d(za3Var2, snapshotObserver.f, this.i0);
        }
        db3Var.d = va3.B;
        if (db3Var.a().L && (db3Var.k || db3Var.j)) {
            requestLayout();
        }
        this.H = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x0016, B:10:0x002f, B:12:0x0033, B:14:0x003b, B:17:0x0044, B:18:0x0046, B:20:0x004a, B:22:0x0050, B:24:0x0058, B:25:0x0065, B:27:0x0070, B:28:0x0074, B:29:0x005b, B:30:0x0088, B:32:0x008c, B:34:0x0090, B:35:0x0095, B:39:0x001f, B:41:0x0023, B:43:0x0027, B:45:0x002b), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x0016, B:10:0x002f, B:12:0x0033, B:14:0x003b, B:17:0x0044, B:18:0x0046, B:20:0x004a, B:22:0x0050, B:24:0x0058, B:25:0x0065, B:27:0x0070, B:28:0x0074, B:29:0x005b, B:30:0x0088, B:32:0x008c, B:34:0x0090, B:35:0x0095, B:39:0x001f, B:41:0x0023, B:43:0x0027, B:45:0x002b), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x0016, B:10:0x002f, B:12:0x0033, B:14:0x003b, B:17:0x0044, B:18:0x0046, B:20:0x004a, B:22:0x0050, B:24:0x0058, B:25:0x0065, B:27:0x0070, B:28:0x0074, B:29:0x005b, B:30:0x0088, B:32:0x008c, B:34:0x0090, B:35:0x0095, B:39:0x001f, B:41:0x0023, B:43:0x0027, B:45:0x002b), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005b A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x0016, B:10:0x002f, B:12:0x0033, B:14:0x003b, B:17:0x0044, B:18:0x0046, B:20:0x004a, B:22:0x0050, B:24:0x0058, B:25:0x0065, B:27:0x0070, B:28:0x0074, B:29:0x005b, B:30:0x0088, B:32:0x008c, B:34:0x0090, B:35:0x0095, B:39:0x001f, B:41:0x0023, B:43:0x0027, B:45:0x002b), top: B:2:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r0(long r9, float r11, defpackage.ub2 r12, defpackage.di2 r13) {
        /*
            r8 = this;
            db3 r0 = r8.C
            za3 r1 = r0.a
            za3 r2 = r0.a
            r3 = 1
            r8.R = r3     // Catch: java.lang.Throwable -> L1b
            long r4 = r8.K     // Catch: java.lang.Throwable -> L1b
            boolean r4 = defpackage.c13.b(r9, r4)     // Catch: java.lang.Throwable -> L1b
            r5 = 0
            if (r4 == 0) goto L1f
            ub2 r4 = r8.L     // Catch: java.lang.Throwable -> L1b
            if (r12 != r4) goto L1f
            boolean r4 = r8.j0     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L2f
            goto L1f
        L1b:
            r0 = move-exception
            r8 = r0
            goto L9e
        L1f:
            boolean r4 = r0.k     // Catch: java.lang.Throwable -> L1b
            if (r4 != 0) goto L2b
            boolean r4 = r0.j     // Catch: java.lang.Throwable -> L1b
            if (r4 != 0) goto L2b
            boolean r4 = r8.j0     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L2f
        L2b:
            r8.T = r3     // Catch: java.lang.Throwable -> L1b
            r8.j0 = r5     // Catch: java.lang.Throwable -> L1b
        L2f:
            em3 r4 = r0.q     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L46
            db3 r6 = r4.C     // Catch: java.lang.Throwable -> L1b
            dm3 r4 = r4.O     // Catch: java.lang.Throwable -> L1b
            dm3 r7 = defpackage.dm3.z     // Catch: java.lang.Throwable -> L1b
            if (r4 != r7) goto L46
            za3 r4 = r6.a     // Catch: java.lang.Throwable -> L1b
            boolean r4 = defpackage.wk6.w(r4)     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L44
            goto L46
        L44:
            r6.c = r3     // Catch: java.lang.Throwable -> L1b
        L46:
            em3 r4 = r0.q     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L88
            boolean r4 = r4.f0()     // Catch: java.lang.Throwable -> L1b
            if (r4 != r3) goto L88
            fa4 r3 = r0.a()     // Catch: java.lang.Throwable -> L1b
            fa4 r3 = r3.T     // Catch: java.lang.Throwable -> L1b
            if (r3 == 0) goto L5b
            zl3 r3 = r3.M     // Catch: java.lang.Throwable -> L1b
            goto L65
        L5b:
            kh4 r3 = defpackage.cb3.a(r2)     // Catch: java.lang.Throwable -> L1b
            oa r3 = (defpackage.oa) r3     // Catch: java.lang.Throwable -> L1b
            dm4 r3 = r3.getPlacementScope()     // Catch: java.lang.Throwable -> L1b
        L65:
            em3 r4 = r0.q     // Catch: java.lang.Throwable -> L1b
            r4.getClass()     // Catch: java.lang.Throwable -> L1b
            za3 r2 = r2.v()     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L74
            db3 r2 = r2.d0     // Catch: java.lang.Throwable -> L1b
            r2.h = r5     // Catch: java.lang.Throwable -> L1b
        L74:
            r2 = 2147483647(0x7fffffff, float:NaN)
            r4.F = r2     // Catch: java.lang.Throwable -> L1b
            r2 = 32
            long r5 = r9 >> r2
            int r2 = (int) r5     // Catch: java.lang.Throwable -> L1b
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r9
            int r5 = (int) r5     // Catch: java.lang.Throwable -> L1b
            defpackage.dm4.h(r3, r4, r2, r5)     // Catch: java.lang.Throwable -> L1b
        L88:
            em3 r0 = r0.q     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L95
            boolean r0 = r0.I     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L95
            java.lang.String r0 = "Error: Placement happened before lookahead."
            defpackage.ez2.b(r0)     // Catch: java.lang.Throwable -> L1b
        L95:
            r2 = r8
            r3 = r9
            r5 = r11
            r6 = r12
            r7 = r13
            r2.q0(r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L1b
            return
        L9e:
            r1.Z(r8)
            r8 = 0
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uo3.r0(long, float, ub2, di2):void");
    }

    @Override // defpackage.j7
    public final void requestLayout() {
        this.C.a.V(false);
    }

    @Override // defpackage.j7
    public final void t(l0 l0Var) {
        z44 A = this.C.a.A();
        Object[] objArr = A.x;
        int i = A.z;
        for (int i2 = 0; i2 < i; i2++) {
            l0Var.invoke(((za3) objArr[i2]).d0.p);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0054 A[Catch: all -> 0x0010, LOOP:0: B:22:0x0052->B:23:0x0054, LOOP_END, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x0023, B:13:0x002b, B:15:0x0033, B:18:0x003c, B:21:0x0045, B:23:0x0054, B:25:0x0063, B:28:0x007a, B:30:0x0099, B:31:0x009f, B:33:0x00ab, B:35:0x00b5, B:39:0x00c1, B:41:0x0075), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x0023, B:13:0x002b, B:15:0x0033, B:18:0x003c, B:21:0x0045, B:23:0x0054, B:25:0x0063, B:28:0x007a, B:30:0x0099, B:31:0x009f, B:33:0x00ab, B:35:0x00b5, B:39:0x00c1, B:41:0x0075), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x0023, B:13:0x002b, B:15:0x0033, B:18:0x003c, B:21:0x0045, B:23:0x0054, B:25:0x0063, B:28:0x007a, B:30:0x0099, B:31:0x009f, B:33:0x00ab, B:35:0x00b5, B:39:0x00c1, B:41:0x0075), top: B:2:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean t0(long r11) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uo3.t0(long):boolean");
    }

    public final void u0() {
        db3 db3Var = this.C;
        za3 za3Var = db3Var.a;
        za3 za3Var2 = db3Var.a;
        if (za3Var.J() && db3Var.l > 0) {
            db3 db3Var2 = za3Var2.d0;
            if ((db3Var2.j || db3Var2.k) && !db3Var2.p.T) {
                za3Var2.V(false);
            }
            z44 A = za3Var2.A();
            Object[] objArr = A.x;
            int i = A.z;
            for (int i2 = 0; i2 < i; i2++) {
                ((za3) objArr[i2]).d0.p.u0();
            }
        }
    }

    @Override // defpackage.em4, defpackage.ro3
    public final Object w() {
        return this.P;
    }

    @Override // defpackage.x04
    public final void z(boolean z) {
        db3 db3Var = this.C;
        if (z != db3Var.a().I) {
            db3Var.a().I = z;
            this.j0 = true;
        }
    }
}
