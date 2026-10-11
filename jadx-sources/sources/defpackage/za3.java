package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class za3 implements it0, lh4, tt0 {
    public static final h75 o0 = new h75("Undefined intrinsics block and it is required", 1);
    public static final t53 p0 = new t53(9);
    public static final ua3 q0 = new Object();
    public static final be r0 = new be(16);
    public long A;
    public boolean B;
    public boolean C;
    public int D;
    public za3 E;
    public int F;
    public final l33 G;
    public z44 H;
    public boolean I;
    public za3 J;
    public kh4 K;
    public sv6 L;
    public int M;
    public boolean N;
    public boolean O;
    public ph5 P;
    public boolean Q;
    public final z44 R;
    public boolean S;
    public vo3 T;
    public y23 U;
    public ud1 V;
    public ia3 W;
    public rv6 X;
    public yu0 Y;
    public xa3 Z;
    public xa3 a0;
    public boolean b0;
    public final kf c0;
    public final db3 d0;
    public mb3 e0;
    public fa4 f0;
    public boolean g0;
    public yz3 h0;
    public yz3 i0;
    public cg j0;
    public dg k0;
    public boolean l0;
    public int m0;
    public boolean n0;
    public final boolean x;
    public int y;
    public boolean z;

    public za3(boolean z, int i) {
        this.x = z;
        this.y = i;
        this.A = 9223372034707292159L;
        this.B = true;
        this.C = true;
        this.D = -4;
        this.G = new l33((Object) new z44(new za3[16], 0), (Object) new vt0(this, (byte) 17), (byte) 6);
        this.R = new z44(new za3[16], 0);
        this.S = true;
        this.T = o0;
        this.V = cb3.a;
        this.W = ia3.x;
        this.X = q0;
        yu0.e.getClass();
        this.Y = xu0.b;
        xa3 xa3Var = xa3.z;
        this.Z = xa3Var;
        this.a0 = xa3Var;
        this.c0 = new kf(this);
        this.d0 = new db3(this);
        this.g0 = true;
        this.h0 = vz3.x;
    }

    public static void U(za3 za3Var, boolean z, int i) {
        boolean z2;
        za3 v;
        boolean z3 = false;
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = true;
        }
        if (za3Var.E == null) {
            ez2.b("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        kh4 kh4Var = za3Var.K;
        if (kh4Var != null && !za3Var.N && !za3Var.x) {
            ((oa) kh4Var).v(za3Var, true, z, z2);
            if (z3) {
                em3 em3Var = za3Var.d0.q;
                em3Var.getClass();
                db3 db3Var = em3Var.C;
                za3 v2 = db3Var.a.v();
                xa3 xa3Var = db3Var.a.Z;
                if (v2 != null && xa3Var != xa3.z) {
                    while (v2.Z == xa3Var && (v = v2.v()) != null) {
                        v2 = v;
                    }
                    int ordinal = xa3Var.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            if (v2.E != null) {
                                v2.T(z);
                                return;
                            } else {
                                v2.V(z);
                                return;
                            }
                        }
                        ze0.m("Intrinsics isn't used by the parent");
                        return;
                    }
                    if (v2.E != null) {
                        U(v2, z, 6);
                    } else {
                        W(v2, z, 6);
                    }
                }
            }
        }
    }

    public static void W(za3 za3Var, boolean z, int i) {
        boolean z2;
        boolean z3;
        kh4 kh4Var;
        za3 v;
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!za3Var.N && !za3Var.x && (kh4Var = za3Var.K) != null) {
            ((oa) kh4Var).v(za3Var, false, z, z2);
            if (z3) {
                db3 db3Var = za3Var.d0.p.C;
                za3 v2 = db3Var.a.v();
                xa3 xa3Var = db3Var.a.Z;
                if (v2 != null && xa3Var != xa3.z) {
                    while (v2.Z == xa3Var && (v = v2.v()) != null) {
                        v2 = v;
                    }
                    int ordinal = xa3Var.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            v2.V(z);
                            return;
                        } else {
                            ze0.m("Intrinsics isn't used by the parent");
                            return;
                        }
                    }
                    W(v2, z, 6);
                }
            }
        }
    }

    public static void X(za3 za3Var) {
        int i = ya3.a[za3Var.d0.d.ordinal()];
        db3 db3Var = za3Var.d0;
        if (i == 1) {
            if (db3Var.e) {
                U(za3Var, true, 6);
                return;
            }
            if (db3Var.f) {
                za3Var.T(true);
            }
            if (za3Var.q()) {
                W(za3Var, true, 6);
                return;
            } else {
                if (za3Var.p()) {
                    za3Var.V(true);
                    return;
                }
                return;
            }
        }
        ze0.f(db3Var.d, "Unexpected state ");
    }

    private final String j(za3 za3Var) {
        String str;
        String g = g(0);
        za3 za3Var2 = za3Var.J;
        if (za3Var2 != null) {
            str = za3Var2.g(0);
        } else {
            str = null;
        }
        return "Cannot insert " + za3Var + " because it already has a parent or an owner. This tree: " + g + " Other tree: " + str;
    }

    public final z44 A() {
        g0();
        if (this.F == 0) {
            return (z44) this.G.y;
        }
        z44 z44Var = this.H;
        z44Var.getClass();
        return z44Var;
    }

    public final void B(long j, il2 il2Var, int i, boolean z) {
        kf kfVar = this.c0;
        fa4 fa4Var = (fa4) kfVar.B;
        c94 c94Var = fa4.s0;
        ((fa4) kfVar.B).e1(fa4.x0, fa4Var.V0(j), il2Var, i, z);
    }

    public final void C(int i, za3 za3Var) {
        if (za3Var.J != null && za3Var.K != null) {
            ez2.b(j(za3Var));
        }
        za3Var.J = this;
        l33 l33Var = this.G;
        ((z44) l33Var.y).a(i, za3Var);
        ((vt0) l33Var.z).invoke();
        P();
        if (za3Var.x) {
            this.F++;
        }
        H();
        kh4 kh4Var = this.K;
        if (kh4Var != null) {
            za3Var.d(kh4Var);
        }
        if (za3Var.d0.l > 0) {
            db3 db3Var = this.d0;
            db3Var.d(db3Var.l + 1);
        }
        if (za3Var.m0 > 0) {
            b0(this.m0 + 1);
        }
    }

    public final void D() {
        ih4 ih4Var;
        if (this.g0) {
            kf kfVar = this.c0;
            fa4 fa4Var = (kz2) kfVar.A;
            fa4 fa4Var2 = ((fa4) kfVar.B).T;
            this.f0 = null;
            while (true) {
                if (a34.i(fa4Var, fa4Var2)) {
                    break;
                }
                if (fa4Var != null) {
                    ih4Var = fa4Var.q0;
                } else {
                    ih4Var = null;
                }
                if (ih4Var != null) {
                    this.f0 = fa4Var;
                    break;
                } else if (fa4Var != null) {
                    fa4Var = fa4Var.T;
                } else {
                    fa4Var = null;
                }
            }
            this.g0 = false;
        }
        fa4 fa4Var3 = this.f0;
        if (fa4Var3 != null && fa4Var3.q0 == null) {
            throw h11.e("layer was not set. This error is usually caused by operating off of the UI thread. Did you call invalidate() instead of postInvalidate()?");
        }
        if (fa4Var3 != null) {
            fa4Var3.g1();
            return;
        }
        za3 v = v();
        if (v != null) {
            v.D();
            return;
        }
        kh4 kh4Var = this.K;
        if (kh4Var != null) {
            ((oa) kh4Var).invalidate();
        }
    }

    public final void E() {
        kf kfVar = this.c0;
        fa4 fa4Var = (fa4) kfVar.B;
        kz2 kz2Var = (kz2) kfVar.A;
        while (fa4Var != kz2Var) {
            fa4Var.getClass();
            ta3 ta3Var = (ta3) fa4Var;
            ih4 ih4Var = ta3Var.q0;
            if (ih4Var != null) {
                ((fi2) ih4Var).c();
            }
            fa4Var = ta3Var.S;
        }
        ih4 ih4Var2 = kz2Var.q0;
        if (ih4Var2 != null) {
            ((fi2) ih4Var2).c();
        }
    }

    public final void F() {
        if (this.x) {
            za3 v = v();
            if (v != null) {
                v.F();
                return;
            }
            return;
        }
        if (this.E != null) {
            U(this, false, 7);
        } else {
            W(this, false, 7);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, w05] */
    public final void G() {
        if (this.Q) {
            return;
        }
        if (((ba4) this.c0.z).C != null || this.i0 != null) {
            this.O = true;
            return;
        }
        ph5 ph5Var = this.P;
        this.Q = true;
        ?? obj = new Object();
        obj.x = new ph5();
        mh4 snapshotObserver = ((oa) cb3.a(this)).getSnapshotObserver();
        va1 va1Var = new va1(this, obj, (byte) 14);
        snapshotObserver.a.d(this, snapshotObserver.d, va1Var);
        this.Q = false;
        this.P = (ph5) obj.x;
        this.O = false;
        oa oaVar = (oa) cb3.a(this);
        oaVar.getSemanticsOwner().b(this, ph5Var);
        oaVar.x();
    }

    public final void H() {
        za3 za3Var;
        if (this.F > 0) {
            this.I = true;
        }
        if (this.x && (za3Var = this.J) != null) {
            za3Var.H();
        }
    }

    public final boolean I() {
        if (this.K != null) {
            return true;
        }
        return false;
    }

    public final boolean J() {
        return this.d0.p.Q;
    }

    public final Boolean K() {
        boolean z;
        em3 em3Var = this.d0.q;
        if (em3Var != null) {
            if (em3Var.O != dm3.z) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        return null;
    }

    public final void L() {
        za3 v;
        if (this.Z == xa3.z) {
            f();
        }
        em3 em3Var = this.d0.q;
        em3Var.getClass();
        boolean z = true;
        try {
            em3Var.D = true;
            if (!em3Var.I) {
                ez2.b("replace() called on item that was not placed");
            }
            em3Var.Z = false;
            if (em3Var.O == dm3.z) {
                z = false;
            }
            em3Var.r0(em3Var.L, em3Var.M, em3Var.N);
            if (z && !em3Var.Z && (v = em3Var.C.a.v()) != null) {
                v.T(false);
            }
            em3Var.D = false;
        } catch (Throwable th) {
            em3Var.D = false;
            throw th;
        }
    }

    public final void M(int i, int i2, int i3) {
        int i4;
        if (i == i2) {
            return;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            if (i > i2) {
                i4 = i + i5;
            } else {
                i4 = i;
            }
            int i6 = i > i2 ? i2 + i5 : (i2 + i3) - 2;
            l33 l33Var = this.G;
            z44 z44Var = (z44) l33Var.y;
            vt0 vt0Var = (vt0) l33Var.z;
            Object m = z44Var.m(i4);
            vt0Var.invoke();
            ((z44) l33Var.y).a(i6, (za3) m);
            vt0Var.invoke();
        }
        P();
        H();
        F();
    }

    public final void N(za3 za3Var) {
        if (za3Var.d0.l > 0) {
            this.d0.d(r0.l - 1);
        }
        if (this.K != null) {
            za3Var.h();
        }
        za3Var.J = null;
        if (za3Var.m0 > 0) {
            b0(this.m0 - 1);
        }
        ((fa4) za3Var.c0.B).T = null;
        if (za3Var.x) {
            this.F--;
            z44 z44Var = (z44) za3Var.G.y;
            Object[] objArr = z44Var.x;
            int i = z44Var.z;
            for (int i2 = 0; i2 < i; i2++) {
                ((fa4) ((za3) objArr[i2]).c0.B).T = null;
            }
        }
        H();
        P();
    }

    public final void O(fa4 fa4Var) {
        p05 p05Var;
        boolean z;
        kh4 kh4Var = this.K;
        if (kh4Var != null) {
            p05Var = ((oa) kh4Var).getRectManager();
        } else {
            p05Var = null;
        }
        db3 db3Var = this.d0;
        if (db3Var.d == va3.B && !q() && !p()) {
            z = false;
        } else {
            z = true;
        }
        if (this.D != -4 && p05Var != null) {
            if (fa4Var == ((fa4) this.c0.B)) {
                this.C = true;
                if (!z) {
                    p05Var.g(this);
                }
            } else {
                this.B = true;
                z44 A = A();
                Object[] objArr = A.x;
                int i = A.z;
                for (int i2 = 0; i2 < i; i2++) {
                    za3 za3Var = (za3) objArr[i2];
                    za3Var.C = true;
                    if (!z) {
                        p05Var.g(za3Var);
                    }
                }
                if (this.D != -4) {
                    p05Var.f = true;
                    int d = p05Var.d(this);
                    long[] jArr = (long[]) p05Var.c.z;
                    int i3 = d + 2;
                    long j = jArr[i3];
                    jArr[i3] = j | (((j >> 63) & 1) << 60);
                }
                p05Var.j();
            }
        }
        db3Var.p.u0();
    }

    public final void P() {
        if (this.x) {
            za3 v = v();
            if (v != null) {
                v.P();
                return;
            }
            return;
        }
        this.S = true;
    }

    public final void Q() {
        l33 l33Var = this.G;
        int i = ((z44) l33Var.y).z;
        while (true) {
            i--;
            z44 z44Var = (z44) l33Var.y;
            if (-1 < i) {
                N((za3) z44Var.x[i]);
            } else {
                z44Var.h();
                ((vt0) l33Var.z).invoke();
                return;
            }
        }
    }

    public final void R(int i, int i2) {
        if (i2 < 0) {
            ez2.a("count (" + i2 + ") must be greater than 0");
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            l33 l33Var = this.G;
            N((za3) ((z44) l33Var.y).x[i3]);
            Object m = ((z44) l33Var.y).m(i3);
            ((vt0) l33Var.z).invoke();
            if (i3 != i) {
                i3--;
            } else {
                return;
            }
        }
    }

    public final void S() {
        za3 v;
        if (this.Z == xa3.z) {
            f();
        }
        uo3 uo3Var = this.d0.p;
        db3 db3Var = uo3Var.C;
        try {
            uo3Var.D = true;
            if (!uo3Var.H) {
                ez2.b("replace called on unplaced item");
            }
            boolean z = uo3Var.Q;
            uo3Var.q0(uo3Var.K, uo3Var.N, uo3Var.L, uo3Var.M);
            if (z && !uo3Var.d0 && (v = db3Var.a.v()) != null) {
                v.V(false);
            }
        } finally {
        }
    }

    public final void T(boolean z) {
        kh4 kh4Var;
        if (!this.x && (kh4Var = this.K) != null) {
            ((oa) kh4Var).w(this, true, z);
        }
    }

    public final void V(boolean z) {
        kh4 kh4Var;
        if (!this.x && (kh4Var = this.K) != null) {
            ((oa) kh4Var).w(this, false, z);
        }
    }

    public final void Y() {
        z44 A = A();
        Object[] objArr = A.x;
        int i = A.z;
        for (int i2 = 0; i2 < i; i2++) {
            za3 za3Var = (za3) objArr[i2];
            xa3 xa3Var = za3Var.a0;
            za3Var.Z = xa3Var;
            if (xa3Var != xa3.z) {
                za3Var.Y();
            }
        }
    }

    public final void Z(Throwable th) {
        yu0 yu0Var = this.Y;
        tq1 tq1Var = uu0.a;
        al4 al4Var = (al4) yu0Var;
        al4Var.getClass();
        tu0 tu0Var = (tu0) sw0.E(al4Var, tq1Var);
        if (tu0Var != null) {
            iv.Q(th, new n(tu0Var, this, (byte) 28));
            throw th;
        }
        throw th;
    }

    @Override // defpackage.it0
    public final void a() {
        sv6 sv6Var = this.L;
        if (sv6Var != null) {
            sv6Var.a();
        }
        mb3 mb3Var = this.e0;
        if (mb3Var != null) {
            mb3Var.a();
        }
        kf kfVar = this.c0;
        fa4 fa4Var = ((kz2) kfVar.A).S;
        for (fa4 fa4Var2 = (fa4) kfVar.B; !a34.i(fa4Var2, fa4Var) && fa4Var2 != null; fa4Var2 = fa4Var2.S) {
            fa4Var2.l1();
        }
    }

    public final void a0(ud1 ud1Var) {
        if (!a34.i(this.V, ud1Var)) {
            this.V = ud1Var;
            F();
            za3 v = v();
            if (v != null) {
                v.D();
            } else {
                kh4 kh4Var = this.K;
                if (kh4Var != null) {
                    ((oa) kh4Var).invalidate();
                }
            }
            E();
            for (xz3 xz3Var = (xz3) this.c0.D; xz3Var != null; xz3Var = xz3Var.C) {
                xz3Var.f();
            }
        }
    }

    public final void b(yz3 yz3Var) {
        f44 f44Var;
        int i;
        kf kfVar;
        boolean z;
        int i2;
        kf kfVar2;
        f44 f44Var2;
        ba4 ba4Var;
        f44 f44Var3;
        kz2 kz2Var;
        f44 f44Var4;
        f44 f44Var5;
        boolean z2;
        boolean z3;
        kf kfVar3;
        kf kfVar4 = this.c0;
        boolean g = kfVar4.g(16);
        xz3 xz3Var = (z66) kfVar4.C;
        boolean g2 = kfVar4.g(1024);
        this.h0 = yz3Var;
        kz2 kz2Var2 = (kz2) kfVar4.A;
        za3 za3Var = (za3) kfVar4.y;
        xz3 xz3Var2 = (xz3) kfVar4.D;
        ba4 ba4Var2 = (ba4) kfVar4.z;
        if (xz3Var2 == ba4Var2) {
            ez2.b("padChain called on already padded chain");
        }
        xz3 xz3Var3 = (xz3) kfVar4.D;
        xz3Var3.B = ba4Var2;
        ba4Var2.C = xz3Var3;
        f44 f44Var6 = (f44) kfVar4.E;
        int i3 = f44Var6.b;
        za3 za3Var2 = za3Var;
        for (za3 v = za3Var.v(); v != null; v = v.v()) {
            za3Var2 = v;
        }
        kf kfVar5 = za3Var2.c0;
        f44 f44Var7 = (f44) kfVar5.F;
        if (f44Var7 == null) {
            f44Var7 = new f44();
            kfVar5.F = f44Var7;
        }
        int i4 = f44Var7.b - 1;
        if (i4 >= 0) {
            f44Var = (f44) f44Var7.l(i4);
        } else {
            f44Var = new f44();
        }
        f44 f44Var8 = (f44) kfVar5.G;
        if (f44Var8 == null) {
            f44Var8 = new f44();
        }
        boolean z4 = true;
        kfVar5.G = null;
        f44Var8.a(yz3Var);
        pz3 pz3Var = null;
        while (f44Var8.j()) {
            yz3 yz3Var2 = (yz3) f44Var8.l(f44Var8.b - 1);
            pz3 pz3Var2 = pz3Var;
            if (yz3Var2 instanceof iq0) {
                iq0 iq0Var = (iq0) yz3Var2;
                f44Var8.a(iq0Var.y);
                f44Var8.a(iq0Var.x);
            } else if (yz3Var2 instanceof wz3) {
                f44Var.a(yz3Var2);
            } else {
                if (pz3Var2 == null) {
                    kfVar3 = kfVar4;
                    pz3Var = new pz3((Object) f44Var, (byte) 5);
                } else {
                    kfVar3 = kfVar4;
                    pz3Var = pz3Var2;
                }
                yz3Var2.d(pz3Var);
                kfVar4 = kfVar3;
            }
            pz3Var = pz3Var2;
            kfVar3 = kfVar4;
            kfVar4 = kfVar3;
        }
        kf kfVar6 = kfVar4;
        int i5 = f44Var.b;
        int i6 = 0;
        if (i5 == i3) {
            xz3 xz3Var4 = ba4Var2.C;
            i = 0;
            while (xz3Var4 != null && i6 < i3) {
                wz3 wz3Var = (wz3) f44Var6.g(i6);
                wz3 wz3Var2 = (wz3) f44Var.g(i6);
                if (a34.i(wz3Var, wz3Var2)) {
                    f44Var4 = f44Var6;
                    f44Var5 = f44Var;
                    z3 = 2;
                } else {
                    f44Var4 = f44Var6;
                    f44Var5 = f44Var;
                    if (wz3Var.getClass() == wz3Var2.getClass()) {
                        z3 = z4;
                    } else {
                        z3 = false;
                    }
                }
                if (z3) {
                    if (z3 == z4) {
                        kf.l(wz3Var, wz3Var2, xz3Var4);
                    }
                    xz3Var4 = xz3Var4.C;
                    i6++;
                    f44Var6 = f44Var4;
                    f44Var = f44Var5;
                    z4 = true;
                } else {
                    xz3Var4 = xz3Var4.B;
                    break;
                }
            }
            f44Var4 = f44Var6;
            f44Var5 = f44Var;
            xz3 xz3Var5 = xz3Var4;
            if (i6 < i3) {
                if (xz3Var5 != null) {
                    if (za3Var.i0 != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    kfVar2 = kfVar6;
                    f44Var2 = f44Var4;
                    f44Var3 = f44Var5;
                    kfVar2.j(i6, f44Var2, f44Var3, xz3Var5, !z2);
                    ba4Var = ba4Var2;
                    i2 = 1;
                } else {
                    throw h11.e("structuralUpdate requires a non-null tail");
                }
            } else {
                kfVar = kfVar6;
                f44Var6 = f44Var4;
                f44Var = f44Var5;
                kfVar2 = kfVar;
                f44Var2 = f44Var6;
                ba4Var = ba4Var2;
                f44Var3 = f44Var;
                i2 = i;
            }
        } else {
            i = 0;
            kfVar = kfVar6;
            yz3 yz3Var3 = za3Var.i0;
            if (yz3Var3 != null && i3 == 0) {
                xz3 xz3Var6 = ba4Var2;
                for (int i7 = 0; i7 < f44Var.b; i7++) {
                    xz3Var6 = kf.d((wz3) f44Var.g(i7), xz3Var6);
                }
                xz3 xz3Var7 = xz3Var.B;
                while (xz3Var7 != null && xz3Var7 != ba4Var2) {
                    int i8 = i | xz3Var7.z;
                    xz3Var7.A = i8;
                    xz3Var7 = xz3Var7.B;
                    i = i8;
                }
                kfVar2 = kfVar;
                f44Var2 = f44Var6;
                ba4Var = ba4Var2;
                f44Var3 = f44Var;
                i2 = 1;
            } else if (i5 == 0) {
                xz3 xz3Var8 = ba4Var2.C;
                for (int i9 = 0; xz3Var8 != null && i9 < f44Var6.b; i9++) {
                    xz3Var8 = kf.e(xz3Var8).C;
                }
                za3 v2 = za3Var.v();
                if (v2 != null) {
                    kz2Var = (kz2) v2.c0.A;
                } else {
                    kz2Var = null;
                }
                kz2Var2.T = kz2Var;
                kfVar.B = kz2Var2;
                kfVar2 = kfVar;
                f44Var2 = f44Var6;
                ba4Var = ba4Var2;
                f44Var3 = f44Var;
                i2 = i;
            } else {
                if (yz3Var3 != null) {
                    z = true;
                } else {
                    z = false;
                }
                i2 = 1;
                kfVar2 = kfVar;
                f44Var2 = f44Var6;
                ba4Var = ba4Var2;
                f44Var3 = f44Var;
                kfVar2.j(0, f44Var2, f44Var3, ba4Var, !z);
            }
        }
        kfVar2.E = f44Var3;
        f44Var2.d();
        f44Var7.a(f44Var2);
        f44Var8.d();
        kfVar5.G = f44Var8;
        xz3 xz3Var9 = ba4Var.C;
        if (xz3Var9 != null) {
            xz3Var = xz3Var9;
        }
        xz3Var.B = null;
        ba4Var.C = null;
        ba4Var.A = -1;
        ba4Var.E = null;
        if (xz3Var == ba4Var) {
            ez2.b("trimChain did not update the head");
        }
        kfVar2.D = xz3Var;
        if (i2 != 0) {
            kfVar2.k();
        }
        boolean g3 = kfVar2.g(16);
        boolean g4 = kfVar2.g(1024);
        this.d0.j();
        if (this.E == null && kfVar2.g(512)) {
            c0(this);
        }
        if (g != g3 || g2 != g4) {
            p05 rectManager = ((oa) cb3.a(this)).getRectManager();
            rectManager.getClass();
            if (I() && this.D != -4) {
                eb2 eb2Var = rectManager.c;
                int d = rectManager.d(this);
                long[] jArr = (long[]) eb2Var.z;
                int i10 = d + 2;
                jArr[i10] = (jArr[i10] & (-6917529027641081857L)) | ((g4 ? 1L : 0L) * 2305843009213693952L) | ((g3 ? 1L : 0L) * 4611686018427387904L);
            }
        }
    }

    public final void b0(int i) {
        za3 v;
        za3 v2;
        int i2 = this.m0;
        if (i2 != i) {
            if (i > 0 && i2 == 0 && (v2 = v()) != null) {
                v2.b0(v2.m0 + 1);
            }
            if (i == 0 && this.m0 > 0 && (v = v()) != null) {
                v.b0(v.m0 - 1);
            }
            this.m0 = i;
        }
    }

    @Override // defpackage.it0
    public final void c() {
        r9 m158getAutofillManager;
        sv6 sv6Var = this.L;
        if (sv6Var != null) {
            sv6Var.c();
        }
        mb3 mb3Var = this.e0;
        if (mb3Var != null) {
            mb3Var.i(true);
        }
        this.n0 = true;
        xz3 xz3Var = (z66) this.c0.C;
        for (xz3 xz3Var2 = xz3Var; xz3Var2 != null; xz3Var2 = xz3Var2.B) {
            if (xz3Var2.K) {
                xz3Var2.V0();
            }
        }
        for (xz3 xz3Var3 = xz3Var; xz3Var3 != null; xz3Var3 = xz3Var3.B) {
            if (xz3Var3.K) {
                xz3Var3.X0();
            }
        }
        while (xz3Var != null) {
            if (xz3Var.K) {
                xz3Var.R0();
            }
            xz3Var = xz3Var.B;
        }
        if (I()) {
            this.P = null;
            this.O = false;
        }
        kh4 kh4Var = this.K;
        if (kh4Var != null && (m158getAutofillManager = ((oa) kh4Var).m158getAutofillManager()) != null && m158getAutofillManager.E.e(this.y)) {
            m158getAutofillManager.x.Z(m158getAutofillManager.z, this.y, false);
        }
    }

    public final void c0(za3 za3Var) {
        if (!a34.i(za3Var, this.E)) {
            this.E = za3Var;
            db3 db3Var = this.d0;
            if (za3Var != null) {
                if (db3Var.q == null) {
                    db3Var.q = new em3(db3Var);
                }
                kf kfVar = this.c0;
                fa4 fa4Var = ((kz2) kfVar.A).S;
                for (fa4 fa4Var2 = (fa4) kfVar.B; !a34.i(fa4Var2, fa4Var) && fa4Var2 != null; fa4Var2 = fa4Var2.S) {
                    fa4Var2.T0();
                }
            } else {
                db3Var.q = null;
                db3Var.f = false;
                db3Var.e = false;
            }
            F();
        }
    }

    public final void d(kh4 kh4Var) {
        kz2 kz2Var;
        int i;
        za3 za3Var;
        ph5 x;
        kh4 kh4Var2;
        String str;
        if (this.K != null) {
            ez2.b("Cannot attach " + this + " as it already is attached.  Tree: " + g(0));
        }
        za3 za3Var2 = this.J;
        if (za3Var2 != null && !a34.i(za3Var2.K, kh4Var)) {
            za3 v = v();
            if (v != null) {
                kh4Var2 = v.K;
            } else {
                kh4Var2 = null;
            }
            String g = g(0);
            za3 za3Var3 = this.J;
            if (za3Var3 != null) {
                str = za3Var3.g(0);
            } else {
                str = null;
            }
            ez2.b("Attaching to a different owner(" + kh4Var + ") than the parent's owner(" + kh4Var2 + "). This tree: " + g + " Parent tree: " + str);
        }
        za3 v2 = v();
        db3 db3Var = this.d0;
        if (v2 == null) {
            db3Var.p.Q = true;
            ((oa) kh4Var).getRectManager().g(this);
            em3 em3Var = db3Var.q;
            if (em3Var != null) {
                em3Var.O = dm3.x;
            }
        }
        kf kfVar = this.c0;
        fa4 fa4Var = (fa4) kfVar.B;
        if (v2 != null) {
            kz2Var = (kz2) v2.c0.A;
        } else {
            kz2Var = null;
        }
        fa4Var.T = kz2Var;
        this.K = kh4Var;
        if (v2 != null) {
            i = v2.M;
        } else {
            i = -1;
        }
        this.M = i + 1;
        yz3 yz3Var = this.i0;
        if (yz3Var != null) {
            b(yz3Var);
        }
        this.i0 = null;
        ((oa) kh4Var).getLayoutNodes().h(this.y, this);
        za3 za3Var4 = this.J;
        if (za3Var4 == null || (za3Var = za3Var4.E) == null) {
            za3Var = this.E;
        }
        c0(za3Var);
        if (this.E == null && kfVar.g(512)) {
            c0(this);
        }
        if (!this.n0) {
            for (xz3 xz3Var = (xz3) kfVar.D; xz3Var != null; xz3Var = xz3Var.C) {
                xz3Var.Q0();
            }
        }
        z44 z44Var = (z44) this.G.y;
        Object[] objArr = z44Var.x;
        int i2 = z44Var.z;
        for (int i3 = 0; i3 < i2; i3++) {
            ((za3) objArr[i3]).d(kh4Var);
        }
        if (!this.n0) {
            kfVar.i();
        }
        F();
        if (v2 != null) {
            v2.F();
        }
        cg cgVar = this.j0;
        if (cgVar != null) {
            cgVar.invoke(kh4Var);
        }
        db3Var.j();
        if (!this.n0 && kfVar.g(8)) {
            G();
        }
        r9 m158getAutofillManager = ((oa) kh4Var).m158getAutofillManager();
        if (m158getAutofillManager != null && (x = x()) != null && x.x.b(yh5.r)) {
            m158getAutofillManager.E.a(this.y);
            m158getAutofillManager.x.Z(m158getAutofillManager.z, this.y, true);
        }
    }

    public final void d0(vo3 vo3Var) {
        if (!a34.i(this.T, vo3Var)) {
            this.T = vo3Var;
            y23 y23Var = this.U;
            if (y23Var != null) {
                ((ti4) y23Var.z).setValue(vo3Var);
            }
            F();
        }
    }

    public final void e() {
        this.a0 = this.Z;
        xa3 xa3Var = xa3.z;
        this.Z = xa3Var;
        z44 A = A();
        Object[] objArr = A.x;
        int i = A.z;
        for (int i2 = 0; i2 < i; i2++) {
            za3 za3Var = (za3) objArr[i2];
            if (za3Var.Z != xa3Var) {
                za3Var.e();
            }
        }
    }

    public final void e0(yz3 yz3Var) {
        if (this.x && this.h0 != vz3.x) {
            ez2.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.n0) {
            ez2.a("modifier is updated when deactivated");
        }
        if (I()) {
            b(yz3Var);
            if (this.O) {
                G();
                return;
            }
            return;
        }
        this.i0 = yz3Var;
    }

    public final void f() {
        this.a0 = this.Z;
        this.Z = xa3.z;
        z44 A = A();
        Object[] objArr = A.x;
        int i = A.z;
        for (int i2 = 0; i2 < i; i2++) {
            za3 za3Var = (za3) objArr[i2];
            if (za3Var.Z == xa3.y) {
                za3Var.f();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [xz3] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [xz3] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [z44] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [z44] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final void f0(rv6 rv6Var) {
        if (!a34.i(this.X, rv6Var)) {
            this.X = rv6Var;
            xz3 xz3Var = (xz3) this.c0.D;
            if ((xz3Var.A & 16) != 0) {
                while (xz3Var != null) {
                    if ((xz3Var.z & 16) != 0) {
                        zc1 zc1Var = xz3Var;
                        ?? r2 = 0;
                        while (zc1Var != 0) {
                            if (zc1Var instanceof xq4) {
                                ((xq4) zc1Var).F0();
                            } else if ((zc1Var.z & 16) != 0 && (zc1Var instanceof zc1)) {
                                xz3 xz3Var2 = zc1Var.M;
                                int i = 0;
                                zc1Var = zc1Var;
                                r2 = r2;
                                while (xz3Var2 != null) {
                                    if ((xz3Var2.z & 16) != 0) {
                                        i++;
                                        r2 = r2;
                                        if (i == 1) {
                                            zc1Var = xz3Var2;
                                        } else {
                                            if (r2 == 0) {
                                                r2 = new z44(new xz3[16], 0);
                                            }
                                            if (zc1Var != 0) {
                                                r2.b(zc1Var);
                                                zc1Var = 0;
                                            }
                                            r2.b(xz3Var2);
                                        }
                                    }
                                    xz3Var2 = xz3Var2.C;
                                    zc1Var = zc1Var;
                                    r2 = r2;
                                }
                                if (i == 1) {
                                }
                            }
                            zc1Var = wc7.J(r2);
                        }
                    }
                    if ((xz3Var.A & 16) != 0) {
                        xz3Var = xz3Var.C;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final String g(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        z44 A = A();
        Object[] objArr = A.x;
        int i3 = A.z;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(((za3) objArr[i4]).g(i + 1));
        }
        String sb2 = sb.toString();
        if (i == 0) {
            return sb2.substring(0, sb2.length() - 1);
        }
        return sb2;
    }

    public final void g0() {
        if (this.F > 0 && this.I) {
            this.I = false;
            z44 z44Var = this.H;
            if (z44Var == null) {
                z44Var = new z44(new za3[16], 0);
                this.H = z44Var;
            }
            z44Var.h();
            z44 z44Var2 = (z44) this.G.y;
            Object[] objArr = z44Var2.x;
            int i = z44Var2.z;
            for (int i2 = 0; i2 < i; i2++) {
                za3 za3Var = (za3) objArr[i2];
                if (za3Var.x) {
                    z44Var.c(z44Var.z, za3Var.A());
                } else {
                    z44Var.b(za3Var);
                }
            }
            db3 db3Var = this.d0;
            db3Var.p.X = true;
            em3 em3Var = db3Var.q;
            if (em3Var != null) {
                em3Var.R = true;
            }
        }
    }

    public final void h() {
        ab3 ab3Var;
        kh4 kh4Var = this.K;
        String str = null;
        if (kh4Var == null) {
            za3 v = v();
            if (v != null) {
                str = v.g(0);
            }
            ez2.c("Cannot detach node that is already detached!  Tree: " + str);
            v71.e();
            return;
        }
        za3 v2 = v();
        db3 db3Var = this.d0;
        if (v2 != null) {
            v2.D();
            v2.F();
            uo3 uo3Var = db3Var.p;
            xa3 xa3Var = xa3.z;
            uo3Var.I = xa3Var;
            em3 em3Var = db3Var.q;
            if (em3Var != null) {
                em3Var.G = xa3Var;
            }
        }
        ab3 ab3Var2 = db3Var.p.V;
        ab3Var2.b = true;
        ab3Var2.c = false;
        ab3Var2.e = false;
        ab3Var2.d = false;
        ab3Var2.f = false;
        ab3Var2.g = false;
        ab3Var2.h = null;
        em3 em3Var2 = db3Var.q;
        if (em3Var2 != null && (ab3Var = em3Var2.P) != null) {
            ab3Var.b = true;
            ab3Var.c = false;
            ab3Var.e = false;
            ab3Var.d = false;
            ab3Var.f = false;
            ab3Var.g = false;
            ab3Var.h = null;
        }
        kf kfVar = this.c0;
        xz3 xz3Var = (z66) kfVar.C;
        fa4 fa4Var = ((kz2) kfVar.A).S;
        for (fa4 fa4Var2 = (fa4) kfVar.B; !a34.i(fa4Var2, fa4Var) && fa4Var2 != null; fa4Var2 = fa4Var2.S) {
            fa4Var2.r1();
            if (fa4Var2.R.J()) {
                fa4Var2.m1();
            }
        }
        dg dgVar = this.k0;
        if (dgVar != null) {
            dgVar.invoke(kh4Var);
        }
        for (xz3 xz3Var2 = xz3Var; xz3Var2 != null; xz3Var2 = xz3Var2.B) {
            if (xz3Var2.K) {
                xz3Var2.X0();
            }
        }
        this.N = true;
        z44 z44Var = (z44) this.G.y;
        Object[] objArr = z44Var.x;
        int i = z44Var.z;
        for (int i2 = 0; i2 < i; i2++) {
            ((za3) objArr[i2]).h();
        }
        this.N = false;
        while (xz3Var != null) {
            if (xz3Var.K) {
                xz3Var.R0();
            }
            xz3Var = xz3Var.B;
        }
        oa oaVar = (oa) kh4Var;
        oaVar.getLayoutNodes().g(this.y);
        e22 e22Var = oaVar.q0;
        st3 st3Var = (st3) e22Var.e;
        ((af2) st3Var.x).p(this);
        ((af2) st3Var.y).p(this);
        ((af2) st3Var.z).p(this);
        ((z44) ((y23) e22Var.f).y).k(this);
        oaVar.k0 = true;
        r9 m158getAutofillManager = oaVar.m158getAutofillManager();
        if (m158getAutofillManager != null && m158getAutofillManager.E.e(this.y)) {
            m158getAutofillManager.x.Z(m158getAutofillManager.z, this.y, false);
        }
        oaVar.getRectManager().h(this);
        this.K = null;
        c0(null);
        this.M = 0;
        uo3 uo3Var2 = db3Var.p;
        uo3Var2.F = Integer.MAX_VALUE;
        uo3Var2.E = Integer.MAX_VALUE;
        uo3Var2.Q = false;
        em3 em3Var3 = db3Var.q;
        if (em3Var3 != null) {
            em3Var3.F = Integer.MAX_VALUE;
            em3Var3.E = Integer.MAX_VALUE;
            em3Var3.O = dm3.z;
        }
        if (kfVar.g(8)) {
            ph5 ph5Var = this.P;
            this.P = null;
            this.O = false;
            oaVar.getSemanticsOwner().b(this, ph5Var);
            oaVar.x();
        }
    }

    public final void i(vg0 vg0Var, di2 di2Var) {
        try {
            ((fa4) this.c0.B).R0(vg0Var, di2Var);
        } catch (Throwable th) {
            Z(th);
            throw null;
        }
    }

    public final void k() {
        rx0 rx0Var;
        if (this.E != null) {
            U(this, false, 5);
        } else {
            W(this, false, 5);
        }
        uo3 uo3Var = this.d0.p;
        if (uo3Var.G) {
            rx0Var = new rx0(uo3Var.A);
        } else {
            rx0Var = null;
        }
        kh4 kh4Var = this.K;
        if (rx0Var != null) {
            if (kh4Var != null) {
                ((oa) kh4Var).r(this, rx0Var.a);
                return;
            }
            return;
        }
        if (kh4Var != null) {
            ((oa) kh4Var).q(true);
        }
    }

    public final List l() {
        em3 em3Var = this.d0.q;
        em3Var.getClass();
        z44 z44Var = em3Var.Q;
        db3 db3Var = em3Var.C;
        db3Var.a.n();
        if (!em3Var.R) {
            return z44Var.g();
        }
        za3 za3Var = db3Var.a;
        z44 A = za3Var.A();
        Object[] objArr = A.x;
        int i = A.z;
        for (int i2 = 0; i2 < i; i2++) {
            za3 za3Var2 = (za3) objArr[i2];
            if (z44Var.z <= i2) {
                em3 em3Var2 = za3Var2.d0.q;
                em3Var2.getClass();
                z44Var.b(em3Var2);
            } else {
                em3 em3Var3 = za3Var2.d0.q;
                em3Var3.getClass();
                Object[] objArr2 = z44Var.x;
                Object obj = objArr2[i2];
                objArr2[i2] = em3Var3;
            }
        }
        z44Var.n(((z44) ((d44) za3Var.n()).y).z, z44Var.z);
        em3Var.R = false;
        return z44Var.g();
    }

    public final List m() {
        return this.d0.p.f0();
    }

    public final List n() {
        return A().g();
    }

    public final List o() {
        return ((z44) this.G.y).g();
    }

    public final boolean p() {
        return this.d0.p.T;
    }

    public final boolean q() {
        return this.d0.p.S;
    }

    public final xa3 r() {
        return this.d0.p.I;
    }

    public final xa3 s() {
        xa3 xa3Var;
        em3 em3Var = this.d0.q;
        if (em3Var != null && (xa3Var = em3Var.G) != null) {
            return xa3Var;
        }
        return xa3.z;
    }

    public final y23 t() {
        y23 y23Var = this.U;
        if (y23Var == null) {
            y23 y23Var2 = new y23(this, this.T);
            this.U = y23Var2;
            return y23Var2;
        }
        return y23Var;
    }

    public final String toString() {
        return o80.K(this) + " children: " + ((z44) ((d44) n()).y).z + " measurePolicy: " + this.T + " deactivated: " + this.n0 + " isVirtual: " + this.x + " isPlaced: " + J();
    }

    @Override // defpackage.lh4
    public final boolean u() {
        return I();
    }

    public final za3 v() {
        za3 za3Var = this.J;
        while (za3Var != null && za3Var.x) {
            za3Var = za3Var.J;
        }
        return za3Var;
    }

    public final int w() {
        return this.d0.p.F;
    }

    public final ph5 x() {
        if (I() && !this.n0 && this.c0.g(8)) {
            return this.P;
        }
        return null;
    }

    public final float y() {
        return this.d0.p.c0;
    }

    public final z44 z() {
        boolean z = this.S;
        z44 z44Var = this.R;
        if (z) {
            z44Var.h();
            z44Var.c(z44Var.z, A());
            Arrays.sort(z44Var.x, 0, z44Var.z, r0);
            this.S = false;
        }
        return z44Var;
    }

    public za3(int i) {
        this((i & 1) == 0, rh5.a.addAndGet(1));
    }
}
