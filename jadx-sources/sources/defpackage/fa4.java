package defpackage;

import android.graphics.BlendModeColorFilter;
import android.graphics.Paint;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.os.Build;
import android.view.ViewParent;
import com.google.protobuf.CodedOutputStream;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class fa4 extends yl3 implements ro3, ha3 {
    public static final c94 s0 = new c94((byte) 7);
    public static final c94 t0 = new c94((byte) 8);
    public static final p55 u0 = new p55();
    public static final da3 v0 = new da3();
    public static final float[] w0 = jo3.a();
    public static final da4 x0 = new Object();
    public static final m18 y0 = new m18((byte) 26);
    public final za3 R;
    public fa4 S;
    public fa4 T;
    public boolean U;
    public boolean V;
    public ub2 W;
    public ud1 X;
    public ia3 Y;
    public wo3 a0;
    public b44 b0;
    public float d0;
    public o44 e0;
    public da3 f0;
    public n05 h0;
    public n05 i0;
    public boolean j0;
    public boolean k0;
    public di2 l0;
    public vg0 m0;
    public q n0;
    public final ca4 o0;
    public boolean p0;
    public ih4 q0;
    public di2 r0;
    public float Z = 0.8f;
    public long c0 = 0;
    public om5 g0 = io3.h;

    public fa4(za3 za3Var) {
        this.R = za3Var;
        this.X = za3Var.V;
        this.Y = za3Var.W;
        n05 n05Var = n05.e;
        this.h0 = n05Var;
        this.i0 = n05Var;
        this.o0 = new ca4(this, (byte) 1);
    }

    public static fa4 u1(ha3 ha3Var) {
        bm3 bm3Var;
        fa4 fa4Var;
        if (ha3Var instanceof bm3) {
            bm3Var = (bm3) ha3Var;
        } else {
            bm3Var = null;
        }
        if (bm3Var != null && (fa4Var = bm3Var.x.R) != null) {
            return fa4Var;
        }
        ha3Var.getClass();
        return (fa4) ha3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A1(long r24) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fa4.A1(long):boolean");
    }

    @Override // defpackage.ha3
    public final long B(ha3 ha3Var, long j) {
        return E(ha3Var, j);
    }

    @Override // defpackage.ha3
    public final long D(long j) {
        if (!Y0().K) {
            ez2.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return E(te4.B(this), ((oa) cb3.a(this.R)).E(j));
    }

    @Override // defpackage.ha3
    public final long E(ha3 ha3Var, long j) {
        if (ha3Var instanceof bm3) {
            bm3 bm3Var = (bm3) ha3Var;
            bm3Var.x.R.i1();
            return bm3Var.E(this, j ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        fa4 u1 = u1(ha3Var);
        u1.i1();
        fa4 U0 = U0(u1);
        while (u1 != U0) {
            ih4 ih4Var = u1.q0;
            if (ih4Var != null) {
                fi2 fi2Var = (fi2) ih4Var;
                float[] b = fi2Var.b();
                if (!fi2Var.P) {
                    j = jo3.b(j, b);
                }
            }
            j = w65.N(j, u1.c0);
            u1 = u1.T;
            u1.getClass();
        }
        return O0(U0, j);
    }

    @Override // defpackage.ha3
    public final n05 G(ha3 ha3Var, boolean z) {
        if (!Y0().K) {
            ez2.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!ha3Var.m()) {
            ez2.b("LayoutCoordinates " + ha3Var + " is not attached!");
        }
        fa4 u1 = u1(ha3Var);
        u1.i1();
        fa4 U0 = U0(u1);
        o44 o44Var = this.e0;
        if (o44Var == null) {
            o44Var = new o44();
            this.e0 = o44Var;
        }
        o44Var.a = 0.0f;
        o44Var.b = 0.0f;
        o44Var.c = (int) (ha3Var.j() >> 32);
        o44Var.d = (int) (ha3Var.j() & 4294967295L);
        while (u1 != U0) {
            u1.q1(o44Var, z, false);
            if (o44Var.b()) {
                return n05.e;
            }
            u1 = u1.T;
            u1.getClass();
        }
        M0(U0, o44Var, z);
        return new n05(o44Var.a, o44Var.b, o44Var.c, o44Var.d);
    }

    @Override // defpackage.ha3
    public final long J(long j) {
        if (!Y0().K) {
            ez2.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        i1();
        while (this != null) {
            za3 za3Var = this.R;
            if (this == ((fa4) za3Var.c0.B) && !za3Var.z) {
                long b = ((oa) cb3.a(za3Var)).getRectManager().b(za3Var);
                if (!c13.b(b, 9223372034707292159L)) {
                    return w65.N(j, b);
                }
            }
            ih4 ih4Var = this.q0;
            if (ih4Var != null) {
                fi2 fi2Var = (fi2) ih4Var;
                float[] b2 = fi2Var.b();
                if (!fi2Var.P) {
                    j = jo3.b(j, b2);
                }
            }
            j = w65.N(j, this.c0);
            this = this.T;
        }
        return j;
    }

    @Override // defpackage.yl3
    public final void K0() {
        di2 di2Var = this.r0;
        long j = this.c0;
        if (di2Var != null) {
            Y(j, this.d0, di2Var);
        } else {
            V(j, this.d0, this.W);
        }
    }

    public final void M0(fa4 fa4Var, o44 o44Var, boolean z) {
        if (fa4Var != this) {
            fa4 fa4Var2 = this.T;
            if (fa4Var2 != null) {
                fa4Var2.M0(fa4Var, o44Var, z);
            }
            long j = this.c0;
            float f = (int) (j >> 32);
            o44Var.a -= f;
            o44Var.c -= f;
            float f2 = (int) (j & 4294967295L);
            o44Var.b -= f2;
            o44Var.d -= f2;
            ih4 ih4Var = this.q0;
            if (ih4Var != null) {
                fi2 fi2Var = (fi2) ih4Var;
                float[] a = fi2Var.a();
                if (!fi2Var.P) {
                    if (a == null) {
                        o44Var.a = 0.0f;
                        o44Var.b = 0.0f;
                        o44Var.c = 0.0f;
                        o44Var.d = 0.0f;
                    } else {
                        jo3.c(a, o44Var);
                    }
                }
                if (this.V && z) {
                    long j2 = this.z;
                    o44Var.a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
                }
            }
        }
    }

    public final long O0(fa4 fa4Var, long j) {
        if (fa4Var == this) {
            return j;
        }
        fa4 fa4Var2 = this.T;
        if (fa4Var2 != null && !a34.i(fa4Var, fa4Var2)) {
            return V0(fa4Var2.O0(fa4Var, j));
        }
        return V0(j);
    }

    public final long P0(long j) {
        float S;
        float R;
        if (Z0()) {
            n05 n05Var = this.h0;
            S = n05Var.c - n05Var.a;
        } else {
            S = S();
        }
        if (Z0()) {
            n05 n05Var2 = this.h0;
            R = n05Var2.d - n05Var2.b;
        } else {
            R = R();
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - S;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - R;
        float max = Math.max(0.0f, intBitsToFloat / 2.0f);
        float max2 = Math.max(0.0f, intBitsToFloat2 / 2.0f);
        return (Float.floatToRawIntBits(max2) & 4294967295L) | (Float.floatToRawIntBits(max) << 32);
    }

    public final float Q0(long j, long j2) {
        float S;
        float R;
        if (S() < Float.intBitsToFloat((int) (j2 >> 32)) || R() < Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            long P0 = P0(j2);
            float intBitsToFloat = Float.intBitsToFloat((int) (P0 >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (P0 & 4294967295L));
            float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
            if (intBitsToFloat3 < 0.0f) {
                S = -intBitsToFloat3;
            } else {
                S = intBitsToFloat3 - S();
            }
            float max = Math.max(0.0f, S);
            float intBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
            if (intBitsToFloat4 < 0.0f) {
                R = -intBitsToFloat4;
            } else {
                R = intBitsToFloat4 - R();
            }
            float max2 = Math.max(0.0f, R);
            long floatToRawIntBits = (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L);
            if ((intBitsToFloat > 0.0f || intBitsToFloat2 > 0.0f) && Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) <= intBitsToFloat && Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) <= intBitsToFloat2) {
                return xc4.d(floatToRawIntBits);
            }
            return Float.POSITIVE_INFINITY;
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void R0(vg0 vg0Var, di2 di2Var) {
        boolean z;
        ih4 ih4Var = this.q0;
        if (ih4Var != null) {
            fi2 fi2Var = (fi2) ih4Var;
            xg0 xg0Var = fi2Var.J;
            fi2Var.g();
            if (fi2Var.x.a.p > 0.0f) {
                z = true;
            } else {
                z = false;
            }
            fi2Var.Q = z;
            dn0 dn0Var = xg0Var.y;
            dn0Var.P(vg0Var);
            dn0Var.z = di2Var;
            db.O(xg0Var, fi2Var.x);
            return;
        }
        long j = this.c0;
        float f = (int) (j >> 32);
        float f2 = (int) (j & 4294967295L);
        vg0Var.o(f, f2);
        S0(vg0Var, di2Var);
        vg0Var.o(-f, -f2);
    }

    public final void S0(vg0 vg0Var, di2 di2Var) {
        fa4 fa4Var;
        vg0 vg0Var2;
        di2 di2Var2;
        xz3 a1 = a1(4);
        if (a1 == null) {
            o1(vg0Var, di2Var);
            return;
        }
        za3 za3Var = this.R;
        za3Var.getClass();
        bb3 sharedDrawScope = ((oa) cb3.a(za3Var)).getSharedDrawScope();
        long O = m37.O(this.z);
        sharedDrawScope.getClass();
        z44 z44Var = null;
        while (a1 != null) {
            if (a1 instanceof zo1) {
                fa4Var = this;
                vg0Var2 = vg0Var;
                di2Var2 = di2Var;
                sharedDrawScope.c(vg0Var2, O, fa4Var, (zo1) a1, di2Var2);
            } else {
                fa4Var = this;
                vg0Var2 = vg0Var;
                di2Var2 = di2Var;
                if ((a1.z & 4) != 0 && (a1 instanceof zc1)) {
                    int i = 0;
                    for (xz3 xz3Var = ((zc1) a1).M; xz3Var != null; xz3Var = xz3Var.C) {
                        if ((xz3Var.z & 4) != 0) {
                            i++;
                            if (i == 1) {
                                a1 = xz3Var;
                            } else {
                                if (z44Var == null) {
                                    z44Var = new z44(new xz3[16], 0);
                                }
                                if (a1 != null) {
                                    z44Var.b(a1);
                                    a1 = null;
                                }
                                z44Var.b(xz3Var);
                            }
                        }
                    }
                    if (i == 1) {
                        vg0Var = vg0Var2;
                        this = fa4Var;
                        di2Var = di2Var2;
                    }
                }
            }
            a1 = wc7.J(z44Var);
            vg0Var = vg0Var2;
            this = fa4Var;
            di2Var = di2Var2;
        }
    }

    public abstract void T0();

    public final fa4 U0(fa4 fa4Var) {
        za3 za3Var = fa4Var.R;
        za3 za3Var2 = this.R;
        if (za3Var == za3Var2) {
            xz3 Y0 = fa4Var.Y0();
            xz3 Y02 = Y0();
            if (!Y02.x.K) {
                ez2.b("visitLocalAncestors called on an unattached node");
            }
            for (xz3 xz3Var = Y02.x.B; xz3Var != null; xz3Var = xz3Var.B) {
                if ((xz3Var.z & 2) != 0 && xz3Var == Y0) {
                    return fa4Var;
                }
            }
            return this;
        }
        while (za3Var.M > za3Var2.M) {
            za3Var = za3Var.v();
            za3Var.getClass();
        }
        za3 za3Var3 = za3Var2;
        while (za3Var3.M > za3Var.M) {
            za3Var3 = za3Var3.v();
            za3Var3.getClass();
        }
        while (za3Var != za3Var3) {
            za3Var = za3Var.v();
            za3Var3 = za3Var3.v();
            if (za3Var == null || za3Var3 == null) {
                ze0.k("layouts are not part of the same hierarchy");
                return null;
            }
        }
        if (za3Var3 != za3Var2) {
            if (za3Var != fa4Var.R) {
                return (kz2) za3Var.c0.A;
            }
            return fa4Var;
        }
        return this;
    }

    public final long V0(long j) {
        long j2 = this.c0;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        ih4 ih4Var = this.q0;
        if (ih4Var != null) {
            fi2 fi2Var = (fi2) ih4Var;
            float[] a = fi2Var.a();
            if (a == null) {
                return 9187343241974906880L;
            }
            if (!fi2Var.P) {
                return jo3.b(floatToRawIntBits, a);
            }
        }
        return floatToRawIntBits;
    }

    public abstract am3 W0();

    public final long X0() {
        return this.X.D0(this.R.X.d());
    }

    @Override // defpackage.em4
    public void Y(long j, float f, di2 di2Var) {
        p1(j, f, null, di2Var);
        if (this.K) {
            return;
        }
        this.R.d0.p.o0();
    }

    public abstract xz3 Y0();

    public final boolean Z0() {
        if (this.j0 && !this.h0.h()) {
            return true;
        }
        return false;
    }

    public final xz3 a1(int i) {
        boolean g = ga4.g(i);
        xz3 Y0 = Y0();
        if (g || (Y0 = Y0.B) != null) {
            for (xz3 b1 = b1(g); b1 != null && (b1.A & i) != 0; b1 = b1.C) {
                if ((b1.z & i) != 0) {
                    return b1;
                }
                if (b1 == Y0) {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    @Override // defpackage.ud1
    public final float b() {
        return this.R.V.b();
    }

    public final xz3 b1(boolean z) {
        xz3 Y0;
        kf kfVar = this.R.c0;
        if (((fa4) kfVar.B) == this) {
            return (xz3) kfVar.D;
        }
        fa4 fa4Var = this.T;
        if (z) {
            if (fa4Var != null && (Y0 = fa4Var.Y0()) != null) {
                return Y0.C;
            }
            return null;
        }
        if (fa4Var != null) {
            return fa4Var.Y0();
        }
        return null;
    }

    public final void c1(xz3 xz3Var, ea4 ea4Var, long j, il2 il2Var, int i, boolean z) {
        if (xz3Var == null) {
            f1(ea4Var, j, il2Var, i, z);
            return;
        }
        if (!ea4Var.i(xz3Var)) {
            c1(wc7.F(xz3Var, ea4Var.h()), ea4Var, j, il2Var, i, z);
            return;
        }
        int i2 = il2Var.z;
        f44 f44Var = il2Var.x;
        il2Var.c(i2 + 1, f44Var.b);
        il2Var.z++;
        f44Var.a(xz3Var);
        il2Var.y.a(v94.e(-1.0f, z, false));
        c1(wc7.F(xz3Var, ea4Var.h()), ea4Var, j, il2Var, i, z);
        il2Var.z = i2;
    }

    @Override // defpackage.ha3
    public final long d(long j) {
        long J = J(j);
        oa oaVar = (oa) cb3.a(this.R);
        oaVar.z();
        return jo3.b(J, oaVar.v0);
    }

    public final void d1(xz3 xz3Var, ea4 ea4Var, long j, il2 il2Var, int i, boolean z, float f) {
        if (xz3Var == null) {
            f1(ea4Var, j, il2Var, i, z);
            return;
        }
        if (!ea4Var.i(xz3Var)) {
            d1(wc7.F(xz3Var, ea4Var.h()), ea4Var, j, il2Var, i, z, f);
            return;
        }
        int i2 = il2Var.z;
        f44 f44Var = il2Var.x;
        il2Var.c(i2 + 1, f44Var.b);
        il2Var.z++;
        f44Var.a(xz3Var);
        il2Var.y.a(v94.e(f, z, false));
        n1(wc7.F(xz3Var, ea4Var.h()), ea4Var, j, il2Var, i, z, f, true);
        il2Var.z = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c4, code lost:
    
        if (defpackage.t80.B(r19.b(), defpackage.v94.e(r2, r7, false)) > 0) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e1(defpackage.ea4 r16, long r17, defpackage.il2 r19, int r20, boolean r21) {
        /*
            r15 = this;
            r3 = r17
            r5 = r19
            r6 = r20
            f44 r8 = r5.x
            int r0 = r16.h()
            xz3 r1 = r15.a1(r0)
            boolean r0 = r15.A1(r3)
            r9 = 0
            r10 = 2139095040(0x7f800000, float:Infinity)
            r11 = 2147483647(0x7fffffff, float:NaN)
            r12 = 1
            if (r0 != 0) goto L4d
            if (r6 != r12) goto L4c
            long r13 = r15.X0()
            float r0 = r15.Q0(r3, r13)
            int r2 = java.lang.Float.floatToRawIntBits(r0)
            r2 = r2 & r11
            if (r2 >= r10) goto L4c
            int r2 = r5.z
            int r7 = r8.b
            int r7 = r7 - r12
            if (r2 != r7) goto L36
            goto L44
        L36:
            long r7 = defpackage.v94.e(r0, r9, r9)
            long r9 = r5.b()
            int r2 = defpackage.t80.B(r9, r7)
            if (r2 <= 0) goto L4c
        L44:
            r7 = 0
            r2 = r16
            r8 = r0
            r0 = r15
            r0.d1(r1, r2, r3, r5, r6, r7, r8)
        L4c:
            return
        L4d:
            if (r1 != 0) goto L53
            r15.f1(r16, r17, r19, r20, r21)
            return
        L53:
            r0 = 32
            long r2 = r17 >> r0
            int r0 = (int) r2
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r17 & r2
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            r3 = 0
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 < 0) goto L92
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 < 0) goto L92
            int r3 = r15.S()
            float r3 = (float) r3
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L92
            int r0 = r15.R()
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L92
            r0 = r15
            r2 = r16
            r3 = r17
            r5 = r19
            r6 = r20
            r7 = r21
            r0.c1(r1, r2, r3, r5, r6, r7)
            return
        L92:
            r3 = r17
            r5 = r19
            r6 = r20
            if (r6 != r12) goto La3
            long r13 = r15.X0()
            float r2 = r15.Q0(r3, r13)
            goto La5
        La3:
            r2 = 2139095040(0x7f800000, float:Infinity)
        La5:
            int r7 = java.lang.Float.floatToRawIntBits(r2)
            r7 = r7 & r11
            if (r7 >= r10) goto Lcc
            int r7 = r5.z
            int r8 = r8.b
            int r8 = r8 - r12
            if (r7 != r8) goto Lb6
            r7 = r21
            goto Lc6
        Lb6:
            r7 = r21
            long r10 = defpackage.v94.e(r2, r7, r9)
            long r13 = r5.b()
            int r8 = defpackage.t80.B(r13, r10)
            if (r8 <= 0) goto Lc7
        Lc6:
            r9 = r12
        Lc7:
            r0 = r15
            r8 = r2
            r2 = r16
            goto Lcf
        Lcc:
            r7 = r21
            goto Lc7
        Lcf:
            r0.n1(r1, r2, r3, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fa4.e1(ea4, long, il2, int, boolean):void");
    }

    public void f1(ea4 ea4Var, long j, il2 il2Var, int i, boolean z) {
        fa4 fa4Var = this.S;
        if (fa4Var != null) {
            fa4Var.e1(ea4Var, fa4Var.V0(j), il2Var, i, z);
        }
    }

    public final void g1() {
        ih4 ih4Var = this.q0;
        if (ih4Var != null) {
            ((fi2) ih4Var).c();
            return;
        }
        fa4 fa4Var = this.T;
        if (fa4Var != null) {
            fa4Var.g1();
        }
    }

    @Override // defpackage.ud1
    public final float getFontScale() {
        return this.R.V.getFontScale();
    }

    @Override // defpackage.j23
    public final ia3 getLayoutDirection() {
        return this.R.W;
    }

    @Override // defpackage.ha3
    public final void h(float[] fArr) {
        kh4 a = cb3.a(this.R);
        fa4 u1 = u1(te4.B(this));
        x1(u1, fArr);
        if (a instanceof oa) {
            ((oa) a).o(fArr);
            return;
        }
        long o = u1.o(0L);
        if ((9223372034707292159L & o) != 9205357640488583168L) {
            jo3.f(fArr, Float.intBitsToFloat((int) (o >> 32)), Float.intBitsToFloat((int) (o & 4294967295L)));
        }
    }

    public final boolean h1() {
        if (this.q0 != null && this.Z <= 0.0f) {
            return true;
        }
        fa4 fa4Var = this.T;
        if (fa4Var != null) {
            return fa4Var.h1();
        }
        return false;
    }

    @Override // defpackage.ha3
    public final void i(ha3 ha3Var, float[] fArr) {
        fa4 u1 = u1(ha3Var);
        u1.i1();
        fa4 U0 = U0(u1);
        jo3.d(fArr);
        u1.x1(U0, fArr);
        w1(U0, fArr);
    }

    public final void i1() {
        this.R.d0.b();
    }

    @Override // defpackage.ha3
    public final long j() {
        return this.z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [xz3] */
    /* JADX WARN: Type inference failed for: r7v7, types: [xz3] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [z44] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [z44] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void j1() {
        ub2 ub2Var;
        xz3 xz3Var;
        boolean g = ga4.g(128);
        xz3 b1 = b1(g);
        if (b1 != null && (b1.x.A & 128) != 0) {
            ft5 b = et5.b();
            if (b != null) {
                ub2Var = b.e();
            } else {
                ub2Var = null;
            }
            ft5 e = et5.e(b);
            try {
                if (g) {
                    xz3Var = Y0();
                } else {
                    xz3Var = Y0().B;
                    if (xz3Var == null) {
                    }
                }
                for (xz3 b12 = b1(g); b12 != null; b12 = b12.C) {
                    if ((b12.A & 128) == 0) {
                        break;
                    }
                    if ((b12.z & 128) != 0) {
                        zc1 zc1Var = b12;
                        ?? r8 = 0;
                        while (zc1Var != 0) {
                            if (zc1Var instanceof yo3) {
                                ((yo3) zc1Var).a(this.z);
                            } else if ((zc1Var.z & 128) != 0 && (zc1Var instanceof zc1)) {
                                xz3 xz3Var2 = zc1Var.M;
                                int i = 0;
                                zc1Var = zc1Var;
                                r8 = r8;
                                while (xz3Var2 != null) {
                                    if ((xz3Var2.z & 128) != 0) {
                                        i++;
                                        r8 = r8;
                                        if (i == 1) {
                                            zc1Var = xz3Var2;
                                        } else {
                                            if (r8 == 0) {
                                                r8 = new z44(new xz3[16], 0);
                                            }
                                            if (zc1Var != 0) {
                                                r8.b(zc1Var);
                                                zc1Var = 0;
                                            }
                                            r8.b(xz3Var2);
                                        }
                                    }
                                    xz3Var2 = xz3Var2.C;
                                    zc1Var = zc1Var;
                                    r8 = r8;
                                }
                                if (i == 1) {
                                }
                            }
                            zc1Var = wc7.J(r8);
                        }
                    }
                    if (b12 == xz3Var) {
                        break;
                    }
                }
            } finally {
                et5.k(b, e, ub2Var);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [xz3] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [xz3] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [z44] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [z44] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void k1() {
        boolean g = ga4.g(4194304);
        xz3 Y0 = Y0();
        if (g || (Y0 = Y0.B) != null) {
            for (xz3 b1 = b1(g); b1 != null && (b1.A & 4194304) != 0; b1 = b1.C) {
                if ((b1.z & 4194304) != 0) {
                    zc1 zc1Var = b1;
                    ?? r5 = 0;
                    while (zc1Var != 0) {
                        if (zc1Var instanceof fa3) {
                            ((fa3) zc1Var).o(this);
                        } else if ((zc1Var.z & 4194304) != 0 && (zc1Var instanceof zc1)) {
                            xz3 xz3Var = zc1Var.M;
                            int i = 0;
                            zc1Var = zc1Var;
                            r5 = r5;
                            while (xz3Var != null) {
                                if ((xz3Var.z & 4194304) != 0) {
                                    i++;
                                    r5 = r5;
                                    if (i == 1) {
                                        zc1Var = xz3Var;
                                    } else {
                                        if (r5 == 0) {
                                            r5 = new z44(new xz3[16], 0);
                                        }
                                        if (zc1Var != 0) {
                                            r5.b(zc1Var);
                                            zc1Var = 0;
                                        }
                                        r5.b(xz3Var);
                                    }
                                }
                                xz3Var = xz3Var.C;
                                zc1Var = zc1Var;
                                r5 = r5;
                            }
                            if (i == 1) {
                            }
                        }
                        zc1Var = wc7.J(r5);
                    }
                }
                if (b1 == Y0) {
                    return;
                }
            }
        }
    }

    public final void l1() {
        this.U = true;
        this.o0.invoke();
        r1();
        if (!c13.b(this.c0, 0L)) {
            this.R.O(this);
        }
    }

    @Override // defpackage.ha3
    public final boolean m() {
        return Y0().K;
    }

    public final void m1() {
        boolean g = ga4.g(1048576);
        xz3 b1 = b1(g);
        if (b1 != null && (b1.x.A & 1048576) != 0) {
            xz3 Y0 = Y0();
            if (g || (Y0 = Y0.B) != null) {
                for (xz3 b12 = b1(g); b12 != null && (b12.A & 1048576) != 0; b12 = b12.C) {
                    if ((b12.z & 1048576) != 0) {
                        xz3 xz3Var = b12;
                        z44 z44Var = null;
                        while (xz3Var != null) {
                            if (xz3Var instanceof h82) {
                            } else if ((xz3Var.z & 1048576) != 0 && (xz3Var instanceof zc1)) {
                                int i = 0;
                                for (xz3 xz3Var2 = ((zc1) xz3Var).M; xz3Var2 != null; xz3Var2 = xz3Var2.C) {
                                    if ((xz3Var2.z & 1048576) != 0) {
                                        i++;
                                        if (i == 1) {
                                            xz3Var = xz3Var2;
                                        } else {
                                            if (z44Var == null) {
                                                z44Var = new z44(new xz3[16], 0);
                                            }
                                            if (xz3Var != null) {
                                                z44Var.b(xz3Var);
                                                xz3Var = null;
                                            }
                                            z44Var.b(xz3Var2);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            xz3Var = wc7.J(z44Var);
                        }
                    }
                    if (b12 == Y0) {
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [xz3] */
    /* JADX WARN: Type inference failed for: r2v29 */
    public final void n1(xz3 xz3Var, ea4 ea4Var, long j, il2 il2Var, int i, boolean z, float f, boolean z2) {
        ia3 ia3Var;
        char c;
        int i2;
        int i3;
        xz3 J;
        f44 f44Var = il2Var.x;
        if (xz3Var == null) {
            f1(ea4Var, j, il2Var, i, z);
            return;
        }
        if (!ea4Var.i(xz3Var)) {
            n1(wc7.F(xz3Var, ea4Var.h()), ea4Var, j, il2Var, i, z, f, z2);
            return;
        }
        int i4 = i;
        boolean z3 = z;
        if (i4 == 3 || i4 == 4) {
            zc1 zc1Var = xz3Var;
            z44 z44Var = null;
            while (true) {
                if (zc1Var == 0) {
                    break;
                }
                if (zc1Var instanceof xq4) {
                    long q = ((xq4) zc1Var).q();
                    int i5 = (int) (j >> 32);
                    float intBitsToFloat = Float.intBitsToFloat(i5);
                    za3 za3Var = this.R;
                    ia3 ia3Var2 = za3Var.W;
                    int i6 = og6.b;
                    long j2 = Long.MIN_VALUE & q;
                    ia3 ia3Var3 = ia3.x;
                    if (j2 == 0 || ia3Var2 == ia3Var3) {
                        ia3Var = ia3Var3;
                        c = 30;
                        i2 = (int) q;
                    } else {
                        ia3Var = ia3Var3;
                        c = 30;
                        i2 = (int) (q >> 30);
                    }
                    if (intBitsToFloat >= (-(i2 & 32767))) {
                        float intBitsToFloat2 = Float.intBitsToFloat(i5);
                        int S = S();
                        ia3 ia3Var4 = za3Var.W;
                        if (j2 != 0 && ia3Var4 != ia3Var) {
                            i3 = (int) q;
                        } else {
                            i3 = (int) (q >> c);
                        }
                        if (intBitsToFloat2 < S + (i3 & 32767)) {
                            int i7 = (int) (j & 4294967295L);
                            if (Float.intBitsToFloat(i7) >= (-(((int) (q >> 15)) & 32767))) {
                                if (Float.intBitsToFloat(i7) < (((int) (q >> 45)) & 32767) + R()) {
                                    w34 w34Var = il2Var.y;
                                    int i8 = il2Var.z;
                                    int i9 = f44Var.b;
                                    if (i8 == i9 - 1) {
                                        il2Var.c(i8 + 1, i9);
                                        il2Var.z++;
                                        f44Var.a(xz3Var);
                                        w34Var.a(v94.e(0.0f, z3, true));
                                        n1(wc7.F(xz3Var, ea4Var.h()), ea4Var, j, il2Var, i4, z3, f, z2);
                                        il2Var.z = i8;
                                        return;
                                    }
                                    long b = il2Var.b();
                                    int i10 = il2Var.z;
                                    if (t80.Y(b)) {
                                        int i11 = f44Var.b;
                                        int i12 = i11 - 1;
                                        il2Var.z = i12;
                                        il2Var.c(i11, f44Var.b);
                                        il2Var.z++;
                                        f44Var.a(xz3Var);
                                        w34Var.a(v94.e(0.0f, z3, true));
                                        n1(wc7.F(xz3Var, ea4Var.h()), ea4Var, j, il2Var, i, z3, f, z2);
                                        il2Var.z = i12;
                                        if (t80.L(il2Var.b()) < 0.0f) {
                                            il2Var.c(i10 + 1, il2Var.z + 1);
                                        }
                                        il2Var.z = i10;
                                        return;
                                    }
                                    if (t80.L(b) > 0.0f) {
                                        int i13 = il2Var.z;
                                        il2Var.c(i13 + 1, f44Var.b);
                                        il2Var.z++;
                                        f44Var.a(xz3Var);
                                        w34Var.a(v94.e(0.0f, z3, true));
                                        n1(wc7.F(xz3Var, ea4Var.h()), ea4Var, j, il2Var, i, z3, f, z2);
                                        il2Var.z = i13;
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    if ((zc1Var.z & 16) != 0 && (zc1Var instanceof zc1)) {
                        xz3 xz3Var2 = zc1Var.M;
                        int i14 = 0;
                        J = zc1Var;
                        z44Var = z44Var;
                        while (xz3Var2 != null) {
                            if ((xz3Var2.z & 16) != 0) {
                                i14++;
                                z44Var = z44Var;
                                if (i14 == 1) {
                                    J = xz3Var2;
                                } else {
                                    if (z44Var == null) {
                                        z44Var = new z44(new xz3[16], 0);
                                    }
                                    if (J != null) {
                                        z44Var.b(J);
                                        J = null;
                                    }
                                    z44Var.b(xz3Var2);
                                }
                            }
                            xz3Var2 = xz3Var2.C;
                            J = J;
                            z44Var = z44Var;
                        }
                        if (i14 == 1) {
                            i4 = i;
                            z3 = z;
                            zc1Var = J;
                            z44Var = z44Var;
                        }
                    }
                    J = wc7.J(z44Var);
                    i4 = i;
                    z3 = z;
                    zc1Var = J;
                    z44Var = z44Var;
                }
            }
        }
        if (z2) {
            d1(xz3Var, ea4Var, j, il2Var, i, z, f);
        } else {
            t1(xz3Var, ea4Var, j, il2Var, i, z, f);
        }
    }

    @Override // defpackage.ha3
    public final long o(long j) {
        if (!Y0().K) {
            ez2.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((oa) cb3.a(this.R)).p(J(j));
    }

    @Override // defpackage.yl3
    public final yl3 o0() {
        return this.S;
    }

    public void o1(vg0 vg0Var, di2 di2Var) {
        za3 za3Var = this.R;
        kh4 a = cb3.a(za3Var);
        z44 z = za3Var.z();
        Object[] objArr = z.x;
        int i = z.z;
        for (int i2 = 0; i2 < i; i2++) {
            za3 za3Var2 = (za3) objArr[i2];
            if (za3Var2.J()) {
                za3Var2.i(vg0Var, di2Var);
            }
        }
        if (((oa) a).getShowLayoutBounds()) {
            ad adVar = kz2.B0;
            long j = this.z;
            vg0Var.k(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, adVar);
        }
    }

    public final void p1(long j, float f, ub2 ub2Var, di2 di2Var) {
        byte b = 0;
        za3 za3Var = this.R;
        if (di2Var != null) {
            if (ub2Var != null) {
                ez2.a("both ways to create layers shouldn't be used together");
            }
            if (this.r0 != di2Var) {
                this.r0 = null;
                y1(null, false);
                this.r0 = di2Var;
            }
            if (this.q0 == null) {
                kh4 a = cb3.a(za3Var);
                q qVar = this.n0;
                if (qVar == null) {
                    q qVar2 = new q(this, new ca4(this, b), (byte) 27);
                    this.n0 = qVar2;
                    qVar = qVar2;
                }
                ca4 ca4Var = this.o0;
                ih4 e = ((oa) a).e(qVar, ca4Var, di2Var);
                fi2 fi2Var = (fi2) e;
                fi2Var.e(this.z);
                fi2Var.d(j);
                this.q0 = e;
                za3Var.g0 = true;
                ca4Var.invoke();
            }
        } else {
            if (this.r0 != null) {
                this.r0 = null;
                y1(null, false);
            }
            y1(ub2Var, false);
        }
        if (!c13.b(this.c0, j)) {
            ((oa) cb3.a(za3Var)).K(-4.0f);
            this.c0 = j;
            ih4 ih4Var = this.q0;
            if (ih4Var != null) {
                ((fi2) ih4Var).d(j);
            } else {
                fa4 fa4Var = this.T;
                if (fa4Var != null) {
                    fa4Var.g1();
                }
            }
            za3Var.O(this);
            yl3.F0(this);
            kh4 kh4Var = za3Var.K;
            if (kh4Var != null) {
                ((oa) kh4Var).u(za3Var);
            }
        }
        this.d0 = f;
        if (this == ((fa4) za3Var.c0.B) && !this.L) {
            ((oa) cb3.a(za3Var)).getRectManager().g(za3Var);
        }
        if (!this.L) {
            m0(u0());
        }
    }

    @Override // defpackage.ha3
    public final long q(long j) {
        if (!Y0().K) {
            ez2.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        ha3 B = te4.B(this);
        oa oaVar = (oa) cb3.a(this.R);
        oaVar.z();
        return E(B, xc4.e(jo3.b(j, oaVar.w0), B.J(0L)));
    }

    public final void q1(o44 o44Var, boolean z, boolean z2) {
        long j;
        ih4 ih4Var = this.q0;
        if (ih4Var != null) {
            if (this.V) {
                if (z2) {
                    long X0 = X0();
                    float f = o44Var.a;
                    float f2 = o44Var.b;
                    if (o44Var.c >= 0.0f) {
                        long j2 = this.z;
                        if (f <= ((int) (j2 >> 32)) && o44Var.d >= 0.0f && f2 <= ((int) (j2 & 4294967295L))) {
                            float intBitsToFloat = Float.intBitsToFloat((int) (X0 >> 32));
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (X0 & 4294967295L));
                            float f3 = (intBitsToFloat - (o44Var.c - o44Var.a)) / 2.0f;
                            if (f3 > 0.0f) {
                                f -= f3;
                            } else {
                                float f4 = (-intBitsToFloat) / 2.0f;
                                if (f < f4) {
                                    f = f4;
                                }
                            }
                            float f5 = (intBitsToFloat2 - (o44Var.d - o44Var.b)) / 2.0f;
                            if (f5 > 0.0f) {
                                f2 -= f5;
                            } else {
                                float f6 = (-intBitsToFloat2) / 2.0f;
                                if (f2 < f6) {
                                    f2 = f6;
                                }
                            }
                            j = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
                            float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
                            float intBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
                            long j3 = this.z;
                            float f7 = (int) (j3 >> 32);
                            int i = (int) (X0 >> 32);
                            float f8 = (int) (j3 & 4294967295L);
                            int i2 = (int) (X0 & 4294967295L);
                            o44Var.a(intBitsToFloat3, intBitsToFloat4, Math.min(Float.intBitsToFloat(i) + f7, Math.max(f7, Float.intBitsToFloat(i) + intBitsToFloat3)), Math.min(Float.intBitsToFloat(i2) + f8, Math.max(f8, Float.intBitsToFloat(i2) + intBitsToFloat4)));
                        }
                    }
                    j = 0;
                    float intBitsToFloat32 = Float.intBitsToFloat((int) (j >> 32));
                    float intBitsToFloat42 = Float.intBitsToFloat((int) (j & 4294967295L));
                    long j32 = this.z;
                    float f72 = (int) (j32 >> 32);
                    int i3 = (int) (X0 >> 32);
                    float f82 = (int) (j32 & 4294967295L);
                    int i22 = (int) (X0 & 4294967295L);
                    o44Var.a(intBitsToFloat32, intBitsToFloat42, Math.min(Float.intBitsToFloat(i3) + f72, Math.max(f72, Float.intBitsToFloat(i3) + intBitsToFloat32)), Math.min(Float.intBitsToFloat(i22) + f82, Math.max(f82, Float.intBitsToFloat(i22) + intBitsToFloat42)));
                } else if (z) {
                    long j4 = this.z;
                    o44Var.a(0.0f, 0.0f, (int) (j4 >> 32), (int) (j4 & 4294967295L));
                }
                if (o44Var.b()) {
                    return;
                }
            }
            fi2 fi2Var = (fi2) ih4Var;
            float[] b = fi2Var.b();
            if (!fi2Var.P) {
                if (b == null) {
                    o44Var.a = 0.0f;
                    o44Var.b = 0.0f;
                    o44Var.c = 0.0f;
                    o44Var.d = 0.0f;
                } else {
                    jo3.c(b, o44Var);
                }
            }
        }
        long j5 = this.c0;
        float f9 = (int) (j5 >> 32);
        o44Var.a += f9;
        o44Var.c += f9;
        float f10 = (int) (j5 & 4294967295L);
        o44Var.b += f10;
        o44Var.d += f10;
    }

    @Override // defpackage.yl3
    public final boolean r0() {
        if (this.a0 != null) {
            return true;
        }
        return false;
    }

    public final void r1() {
        if (this.q0 != null) {
            if (this.r0 != null) {
                this.r0 = null;
            }
            y1(null, false);
            this.R.V(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [xz3] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [xz3] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [z44] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [z44] */
    public final void s1(wo3 wo3Var) {
        fa4 fa4Var;
        wo3 wo3Var2 = this.a0;
        if (wo3Var != wo3Var2) {
            this.a0 = wo3Var;
            za3 za3Var = this.R;
            int i = 0;
            if (wo3Var2 == null || wo3Var.getWidth() != wo3Var2.getWidth() || wo3Var.getHeight() != wo3Var2.getHeight()) {
                int width = wo3Var.getWidth();
                int height = wo3Var.getHeight();
                ih4 ih4Var = this.q0;
                if (ih4Var != null) {
                    ((fi2) ih4Var).e((width << 32) | (height & 4294967295L));
                } else if (za3Var.J() && (fa4Var = this.T) != null) {
                    fa4Var.g1();
                }
                Z((height & 4294967295L) | (width << 32));
                if (this.W != null) {
                    z1(false);
                }
                boolean g = ga4.g(4);
                xz3 Y0 = Y0();
                if (g || (Y0 = Y0.B) != null) {
                    for (xz3 b1 = b1(g); b1 != null && (b1.A & 4) != 0; b1 = b1.C) {
                        if ((b1.z & 4) != 0) {
                            zc1 zc1Var = b1;
                            ?? r9 = 0;
                            while (zc1Var != 0) {
                                if (zc1Var instanceof zo1) {
                                    ((zo1) zc1Var).P();
                                } else if ((zc1Var.z & 4) != 0 && (zc1Var instanceof zc1)) {
                                    xz3 xz3Var = zc1Var.M;
                                    int i2 = 0;
                                    zc1Var = zc1Var;
                                    r9 = r9;
                                    while (xz3Var != null) {
                                        if ((xz3Var.z & 4) != 0) {
                                            i2++;
                                            r9 = r9;
                                            if (i2 == 1) {
                                                zc1Var = xz3Var;
                                            } else {
                                                if (r9 == 0) {
                                                    r9 = new z44(new xz3[16], 0);
                                                }
                                                if (zc1Var != 0) {
                                                    r9.b(zc1Var);
                                                    zc1Var = 0;
                                                }
                                                r9.b(xz3Var);
                                            }
                                        }
                                        xz3Var = xz3Var.C;
                                        zc1Var = zc1Var;
                                        r9 = r9;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                zc1Var = wc7.J(r9);
                            }
                        }
                        if (b1 == Y0) {
                            break;
                        }
                    }
                }
                kh4 kh4Var = za3Var.K;
                if (kh4Var != null) {
                    ((oa) kh4Var).u(za3Var);
                }
                za3Var.O(this);
            }
            b44 b44Var = this.b0;
            if ((b44Var != null && b44Var.e != 0) || !wo3Var.a().isEmpty()) {
                b44 b44Var2 = this.b0;
                Map a = wo3Var.a();
                if (b44Var2 != null && b44Var2.e == a.size()) {
                    Object[] objArr = b44Var2.b;
                    int[] iArr = b44Var2.c;
                    long[] jArr = b44Var2.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i3 = 0;
                        loop0: while (true) {
                            long j = jArr[i3];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i4 = 8 - ((~(i3 - length)) >>> 31);
                                for (int i5 = i; i5 < i4; i5++) {
                                    if ((255 & j) < 128) {
                                        int i6 = (i3 << 3) + i5;
                                        Object obj = objArr[i6];
                                        int i7 = iArr[i6];
                                        Integer num = (Integer) a.get((f7) obj);
                                        if (num == null || num.intValue() != i7) {
                                            break loop0;
                                        }
                                    }
                                    j >>= 8;
                                }
                                if (i4 != 8) {
                                    return;
                                }
                            }
                            if (i3 != length) {
                                i3++;
                                i = 0;
                            } else {
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
                za3Var.d0.p.V.f();
                b44 b44Var3 = this.b0;
                if (b44Var3 == null) {
                    b44 b44Var4 = dc4.a;
                    b44Var3 = new b44();
                    this.b0 = b44Var3;
                }
                b44Var3.a();
                for (Map.Entry entry : wo3Var.a().entrySet()) {
                    b44Var3.g(((Number) entry.getValue()).intValue(), entry.getKey());
                }
            }
        }
    }

    @Override // defpackage.yl3
    public final za3 t0() {
        return this.R;
    }

    public final void t1(xz3 xz3Var, ea4 ea4Var, long j, il2 il2Var, int i, boolean z, float f) {
        int i2;
        int i3;
        f44 f44Var = il2Var.x;
        if (xz3Var == null) {
            f1(ea4Var, j, il2Var, i, z);
            return;
        }
        if (!ea4Var.i(xz3Var)) {
            t1(wc7.F(xz3Var, ea4Var.h()), ea4Var, j, il2Var, i, z, f);
            return;
        }
        if (ea4Var.d(xz3Var)) {
            w34 w34Var = il2Var.y;
            int i4 = il2Var.z;
            int i5 = f44Var.b;
            if (i4 == i5 - 1) {
                int i6 = i4 + 1;
                il2Var.c(i6, i5);
                il2Var.z++;
                f44Var.a(xz3Var);
                w34Var.a(v94.e(f, z, false));
                n1(wc7.F(xz3Var, ea4Var.h()), ea4Var, j, il2Var, i, z, f, false);
                il2Var.z = i4;
                if (i6 != f44Var.b - 1 && !t80.Y(il2Var.b())) {
                    return;
                }
                int i7 = il2Var.z;
                int i8 = i7 + 1;
                f44Var.l(i8);
                if (i8 >= 0 && i8 < (i3 = w34Var.b)) {
                    long[] jArr = w34Var.a;
                    long j2 = jArr[i8];
                    if (i8 != i3 - 1) {
                        ms.z0(jArr, jArr, i8, i7 + 2, i3);
                    }
                    w34Var.b--;
                    return;
                }
                ze0.g("Index must be between 0 and size");
                return;
            }
            long b = il2Var.b();
            int i9 = il2Var.z;
            int i10 = f44Var.b;
            int i11 = i10 - 1;
            il2Var.z = i11;
            il2Var.c(i10, f44Var.b);
            il2Var.z++;
            f44Var.a(xz3Var);
            w34Var.a(v94.e(f, z, false));
            n1(wc7.F(xz3Var, ea4Var.h()), ea4Var, j, il2Var, i, z, f, false);
            il2Var.z = i11;
            long b2 = il2Var.b();
            if (il2Var.z + 1 < f44Var.b - 1 && t80.B(b, b2) > 0) {
                int i12 = i9 + 1;
                boolean Y = t80.Y(b2);
                int i13 = il2Var.z;
                if (Y) {
                    i2 = i13 + 2;
                } else {
                    i2 = i13 + 1;
                }
                il2Var.c(i12, i2);
            } else {
                il2Var.c(il2Var.z + 1, f44Var.b);
            }
            il2Var.z = i9;
            return;
        }
        n1(wc7.F(xz3Var, ea4Var.h()), ea4Var, j, il2Var, i, z, f, false);
    }

    @Override // defpackage.yl3, defpackage.lh4
    public final boolean u() {
        if (this.q0 != null && !this.U && this.R.I()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.yl3
    public final wo3 u0() {
        wo3 wo3Var = this.a0;
        if (wo3Var != null) {
            return wo3Var;
        }
        ze0.m("Asking for measurement result of unmeasured layout modifier");
        return null;
    }

    public final n05 v1() {
        float f;
        float S;
        float R;
        if (Y0().K) {
            ha3 B = te4.B(this);
            o44 o44Var = this.e0;
            if (o44Var == null) {
                o44Var = new o44();
                this.e0 = o44Var;
            }
            long P0 = P0(X0());
            float f2 = 0.0f;
            if (Z0()) {
                f = this.h0.a;
            } else {
                f = 0.0f;
            }
            if (Z0()) {
                f2 = this.h0.b;
            }
            if (Z0()) {
                S = this.h0.c;
            } else {
                S = S();
            }
            if (Z0()) {
                R = this.h0.d;
            } else {
                R = R();
            }
            int i = (int) (P0 >> 32);
            o44Var.a = f - Float.intBitsToFloat(i);
            int i2 = (int) (P0 & 4294967295L);
            o44Var.b = f2 - Float.intBitsToFloat(i2);
            o44Var.c = Float.intBitsToFloat(i) + S;
            o44Var.d = Float.intBitsToFloat(i2) + R;
            while (this != B) {
                this.q1(o44Var, false, true);
                if (!o44Var.b()) {
                    this = this.T;
                    this.getClass();
                }
            }
            return new n05(o44Var.a, o44Var.b, o44Var.c, o44Var.d);
        }
        return n05.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [xz3] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [xz3] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [z44] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [z44] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // defpackage.em4, defpackage.ro3
    public final Object w() {
        za3 za3Var = this.R;
        if (!za3Var.c0.g(64)) {
            return null;
        }
        Y0();
        Object obj = null;
        for (xz3 xz3Var = (z66) za3Var.c0.C; xz3Var != null; xz3Var = xz3Var.B) {
            if ((xz3Var.z & 64) != 0) {
                zc1 zc1Var = xz3Var;
                ?? r5 = 0;
                while (zc1Var != 0) {
                    if (zc1Var instanceof vi4) {
                        obj = ((vi4) zc1Var).c(za3Var.V, obj);
                    } else if ((zc1Var.z & 64) != 0 && (zc1Var instanceof zc1)) {
                        xz3 xz3Var2 = zc1Var.M;
                        int i = 0;
                        zc1Var = zc1Var;
                        r5 = r5;
                        while (xz3Var2 != null) {
                            if ((xz3Var2.z & 64) != 0) {
                                i++;
                                r5 = r5;
                                if (i == 1) {
                                    zc1Var = xz3Var2;
                                } else {
                                    if (r5 == 0) {
                                        r5 = new z44(new xz3[16], 0);
                                    }
                                    if (zc1Var != 0) {
                                        r5.b(zc1Var);
                                        zc1Var = 0;
                                    }
                                    r5.b(xz3Var2);
                                }
                            }
                            xz3Var2 = xz3Var2.C;
                            zc1Var = zc1Var;
                            r5 = r5;
                        }
                        if (i == 1) {
                        }
                    }
                    zc1Var = wc7.J(r5);
                }
            }
        }
        return obj;
    }

    public final void w1(fa4 fa4Var, float[] fArr) {
        float[] a;
        if (!a34.i(fa4Var, this)) {
            fa4 fa4Var2 = this.T;
            fa4Var2.getClass();
            fa4Var2.w1(fa4Var, fArr);
            if (!c13.b(this.c0, 0L)) {
                float[] fArr2 = w0;
                jo3.d(fArr2);
                long j = this.c0;
                jo3.f(fArr2, -((int) (j >> 32)), -((int) (j & 4294967295L)));
                jo3.e(fArr, fArr2);
            }
            ih4 ih4Var = this.q0;
            if (ih4Var != null && (a = ((fi2) ih4Var).a()) != null) {
                jo3.e(fArr, a);
            }
        }
    }

    @Override // defpackage.ha3
    public final ha3 x() {
        boolean z = Y0().K;
        za3 za3Var = this.R;
        if (!z) {
            StringBuilder sb = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (za3 za3Var2 = za3Var; za3Var2 != null; za3Var2 = za3Var2.v()) {
                sb.append("\n|");
                sb.append(za3Var2);
                sb.append(" isAttached=");
                sb.append(za3Var2.I());
                sb.append(" modifier=");
                sb.append(za3Var2.h0);
                sb.append(" tail=");
                sb.append(Y0());
            }
            ez2.b(sb.toString());
        }
        i1();
        return ((fa4) za3Var.c0.B).T;
    }

    public final void x1(fa4 fa4Var, float[] fArr) {
        while (!this.equals(fa4Var)) {
            ih4 ih4Var = this.q0;
            if (ih4Var != null) {
                jo3.e(fArr, ((fi2) ih4Var).b());
            }
            if (!c13.b(this.c0, 0L)) {
                float[] fArr2 = w0;
                jo3.d(fArr2);
                jo3.f(fArr2, (int) (r0 >> 32), (int) (r0 & 4294967295L));
                jo3.e(fArr, fArr2);
            }
            this = this.T;
            this.getClass();
        }
    }

    @Override // defpackage.yl3
    public final yl3 y0() {
        return this.T;
    }

    public final void y1(ub2 ub2Var, boolean z) {
        boolean z2;
        kh4 kh4Var;
        z44 z44Var;
        Reference poll;
        if (ub2Var != null && this.r0 != null) {
            ez2.a("layerBlock can't be provided when explicitLayer is provided");
        }
        byte b = 0;
        za3 za3Var = this.R;
        if (!z && this.W == ub2Var && a34.i(this.X, za3Var.V) && this.Y == za3Var.W) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.X = za3Var.V;
        this.Y = za3Var.W;
        boolean I = za3Var.I();
        ca4 ca4Var = this.o0;
        if (I && ub2Var != null) {
            this.W = ub2Var;
            if (this.q0 == null) {
                kh4 a = cb3.a(za3Var);
                q qVar = this.n0;
                if (qVar == null) {
                    q qVar2 = new q(this, new ca4(this, b), (byte) 27);
                    this.n0 = qVar2;
                    qVar = qVar2;
                }
                ih4 e = ((oa) a).e(qVar, ca4Var, null);
                fi2 fi2Var = (fi2) e;
                fi2Var.e(this.z);
                fi2Var.d(this.c0);
                this.q0 = e;
                z1(true);
                za3Var.g0 = true;
                ca4Var.invoke();
                return;
            }
            if (z2) {
                z1(true);
                return;
            }
            return;
        }
        this.W = null;
        ih4 ih4Var = this.q0;
        if (ih4Var != null) {
            fi2 fi2Var2 = (fi2) ih4Var;
            if (!v94.z(fi2Var2.b())) {
                za3Var.O(this);
            }
            fi2Var2.A = null;
            fi2Var2.B = null;
            fi2Var2.D = true;
            fi2Var2.f(false);
            ci2 ci2Var = fi2Var2.y;
            if (ci2Var != null) {
                ci2Var.a(fi2Var2.x);
                oa oaVar = fi2Var2.z;
                l33 l33Var = oaVar.M0;
                do {
                    ReferenceQueue referenceQueue = (ReferenceQueue) l33Var.z;
                    z44Var = (z44) l33Var.y;
                    poll = referenceQueue.poll();
                    if (poll != null) {
                        z44Var.k(poll);
                    }
                } while (poll != null);
                z44Var.b(new WeakReference(fi2Var2, (ReferenceQueue) l33Var.z));
                oaVar.a0.k(fi2Var2);
            }
            this.q0 = null;
            za3Var.g0 = true;
            ca4Var.invoke();
            if (Y0().K && za3Var.J() && (kh4Var = za3Var.K) != null) {
                ((oa) kh4Var).u(za3Var);
            }
        }
        this.p0 = false;
    }

    @Override // defpackage.yl3
    public final long z0() {
        return this.c0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z1(boolean z) {
        za3 za3Var;
        float f;
        r05 r05Var;
        long j;
        char c;
        int i;
        boolean z2;
        boolean z3;
        za3 za3Var2;
        sb2 sb2Var;
        int i2;
        BlendModeColorFilter blendModeColorFilter;
        RenderEffect renderEffect;
        sb2 sb2Var2;
        boolean z4;
        if (this.r0 == null) {
            ih4 ih4Var = this.q0;
            ub2 ub2Var = this.W;
            if (ih4Var != null) {
                if (ub2Var != null) {
                    p55 p55Var = u0;
                    p55Var.a();
                    za3 za3Var3 = this.R;
                    p55Var.Q = za3Var3.V;
                    p55Var.R = za3Var3.W;
                    p55Var.O = m37.O(this.z);
                    Object obj = new Object();
                    ((oa) cb3.a(za3Var3)).getSnapshotObserver().a.d(this, s0, new mi((Object) ub2Var, (Object) this, obj, (byte) 12));
                    da3 da3Var = this.f0;
                    if (da3Var == null) {
                        da3Var = new da3();
                        this.f0 = da3Var;
                    }
                    da3 da3Var2 = v0;
                    da3Var2.getClass();
                    da3Var2.a = da3Var.a;
                    da3Var2.b = da3Var.b;
                    da3Var2.c = da3Var.c;
                    da3Var2.d = da3Var.d;
                    da3Var2.e = da3Var.e;
                    da3Var2.f = da3Var.f;
                    da3Var2.g = da3Var.g;
                    da3Var2.h = da3Var.h;
                    da3Var2.i = da3Var.i;
                    da3Var.a = p55Var.y;
                    da3Var.b = p55Var.z;
                    da3Var.c = p55Var.B;
                    da3Var.d = p55Var.C;
                    da3Var.e = p55Var.G;
                    da3Var.f = p55Var.H;
                    da3Var.g = p55Var.I;
                    da3Var.h = p55Var.J;
                    da3Var.i = p55Var.K;
                    fi2 fi2Var = (fi2) ih4Var;
                    oa oaVar = fi2Var.z;
                    int i3 = p55Var.x | fi2Var.K;
                    fi2Var.I = p55Var.R;
                    ud1 ud1Var = p55Var.Q;
                    fi2Var.H = ud1Var;
                    if ((1048576 & i3) != 0) {
                        di2 di2Var = fi2Var.x;
                        p55Var.P.getClass();
                        int x02 = ud1Var.x0(0.0f);
                        p55Var.P.getClass();
                        int x03 = ud1Var.x0(0.0f);
                        p55Var.P.getClass();
                        int x04 = ud1Var.x0(0.0f);
                        p55Var.P.getClass();
                        int x05 = ud1Var.x0(0.0f);
                        di2Var.v = x02;
                        di2Var.w = x03;
                        di2Var.x = x04;
                        di2Var.y = x05;
                        hi2 hi2Var = di2Var.a;
                        if (x02 >= 0 && x03 >= 0 && x04 >= 0 && x05 >= 0) {
                            za3Var = za3Var3;
                            f = 0.0f;
                        } else {
                            f = 0.0f;
                            za3Var = za3Var3;
                            StringBuilder u = qx1.u("Outsets cannot be negative! Left: ", x02, ", Top: ", x03, ", Right: ");
                            u.append(x04);
                            u.append(", Bottom: ");
                            u.append(x05);
                            dz2.a(u.toString());
                        }
                        int i4 = hi2Var.x;
                        if (x02 != i4 || x03 != hi2Var.y || x04 != hi2Var.z || x05 != hi2Var.A) {
                            if (x02 == i4 && x03 == hi2Var.y) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            hi2Var.x = x02;
                            hi2Var.y = x03;
                            hi2Var.z = x04;
                            hi2Var.A = x05;
                            hi2Var.e();
                            if (z4) {
                                hi2Var.d();
                            }
                        }
                        fi2Var.c();
                    } else {
                        za3Var = za3Var3;
                        f = 0.0f;
                    }
                    int i5 = i3 & CodedOutputStream.DEFAULT_BUFFER_SIZE;
                    if (i5 != 0) {
                        fi2Var.L = p55Var.K;
                    }
                    if ((i3 & 1) != 0) {
                        di2 di2Var2 = fi2Var.x;
                        float f2 = p55Var.y;
                        hi2 hi2Var2 = di2Var2.a;
                        if (hi2Var2.l != f2) {
                            hi2Var2.l = f2;
                            hi2Var2.c.setScaleX(f2);
                        }
                    }
                    if ((i3 & 2) != 0) {
                        di2 di2Var3 = fi2Var.x;
                        float f3 = p55Var.z;
                        hi2 hi2Var3 = di2Var3.a;
                        if (hi2Var3.m != f3) {
                            hi2Var3.m = f3;
                            hi2Var3.c.setScaleY(f3);
                        }
                    }
                    if ((i3 & 4) != 0) {
                        fi2Var.x.f(p55Var.A);
                    }
                    if ((i3 & 8) != 0) {
                        di2 di2Var4 = fi2Var.x;
                        float f4 = p55Var.B;
                        hi2 hi2Var4 = di2Var4.a;
                        if (hi2Var4.n != f4) {
                            hi2Var4.n = f4;
                            hi2Var4.c.setTranslationX(f4);
                        }
                    }
                    if ((i3 & 16) != 0) {
                        di2 di2Var5 = fi2Var.x;
                        float f5 = p55Var.C;
                        hi2 hi2Var5 = di2Var5.a;
                        if (hi2Var5.o != f5) {
                            hi2Var5.o = f5;
                            hi2Var5.c.setTranslationY(f5);
                        }
                    }
                    if ((i3 & 32) != 0) {
                        di2 di2Var6 = fi2Var.x;
                        float f6 = p55Var.D;
                        hi2 hi2Var6 = di2Var6.a;
                        if (hi2Var6.p != f6) {
                            hi2Var6.p = f6;
                            hi2Var6.c.setElevation(f6);
                            di2Var6.g = true;
                            di2Var6.a();
                        }
                        if (p55Var.D > f && !fi2Var.Q && (sb2Var2 = fi2Var.B) != null) {
                            sb2Var2.invoke();
                        }
                    }
                    if ((i3 & 64) != 0) {
                        di2 di2Var7 = fi2Var.x;
                        long j2 = p55Var.E;
                        hi2 hi2Var7 = di2Var7.a;
                        long j3 = hi2Var7.q;
                        int i6 = ep0.j;
                        if (!cm6.a(j2, j3)) {
                            hi2Var7.q = j2;
                            hi2Var7.c.setAmbientShadowColor(w65.U(j2));
                        }
                    }
                    if ((i3 & 128) != 0) {
                        di2 di2Var8 = fi2Var.x;
                        long j4 = p55Var.F;
                        hi2 hi2Var8 = di2Var8.a;
                        long j5 = hi2Var8.r;
                        int i7 = ep0.j;
                        if (!cm6.a(j4, j5)) {
                            hi2Var8.r = j4;
                            hi2Var8.c.setSpotShadowColor(w65.U(j4));
                        }
                    }
                    if ((i3 & 1024) != 0) {
                        di2 di2Var9 = fi2Var.x;
                        float f7 = p55Var.I;
                        hi2 hi2Var9 = di2Var9.a;
                        if (hi2Var9.u != f7) {
                            hi2Var9.u = f7;
                            hi2Var9.c.setRotationZ(f7);
                        }
                    }
                    if ((i3 & 256) != 0) {
                        di2 di2Var10 = fi2Var.x;
                        float f8 = p55Var.G;
                        hi2 hi2Var10 = di2Var10.a;
                        if (hi2Var10.s != f8) {
                            hi2Var10.s = f8;
                            hi2Var10.c.setRotationX(f8);
                        }
                    }
                    if ((i3 & 512) != 0) {
                        di2 di2Var11 = fi2Var.x;
                        float f9 = p55Var.H;
                        hi2 hi2Var11 = di2Var11.a;
                        if (hi2Var11.t != f9) {
                            hi2Var11.t = f9;
                            hi2Var11.c.setRotationY(f9);
                        }
                    }
                    if ((i3 & 2048) != 0) {
                        di2 di2Var12 = fi2Var.x;
                        float f10 = p55Var.J;
                        hi2 hi2Var12 = di2Var12.a;
                        if (hi2Var12.v != f10) {
                            hi2Var12.v = f10;
                            hi2Var12.c.setCameraDistance(f10);
                        }
                    }
                    if (i5 != 0) {
                        j = 4294967295L;
                        boolean a = xh6.a(fi2Var.L, xh6.b);
                        di2 di2Var13 = fi2Var.x;
                        if (a) {
                            di2Var13.g(9205357640488583168L);
                            c = ' ';
                            r05Var = obj;
                        } else {
                            float intBitsToFloat = Float.intBitsToFloat((int) (fi2Var.L >> 32)) * ((int) (fi2Var.C >> 32));
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (fi2Var.L & 4294967295L)) * ((int) (fi2Var.C & 4294967295L));
                            long floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat);
                            int floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat2);
                            c = ' ';
                            r05Var = obj;
                            di2Var13.g((floatToRawIntBits2 & 4294967295L) | (floatToRawIntBits << 32));
                        }
                    } else {
                        r05Var = obj;
                        j = 4294967295L;
                        c = ' ';
                    }
                    if ((i3 & 16384) != 0) {
                        di2 di2Var14 = fi2Var.x;
                        boolean z5 = p55Var.M;
                        if (di2Var14.A != z5) {
                            di2Var14.A = z5;
                            di2Var14.g = true;
                            di2Var14.a();
                        }
                    }
                    if ((131072 & i3) != 0) {
                        di2 di2Var15 = fi2Var.x;
                        d70 d70Var = p55Var.S;
                        hi2 hi2Var13 = di2Var15.a;
                        if (!a34.i(hi2Var13.F, d70Var)) {
                            hi2Var13.F = d70Var;
                            if (Build.VERSION.SDK_INT >= 31) {
                                RenderNode renderNode = hi2Var13.c;
                                if (d70Var != null) {
                                    renderEffect = d70Var.a;
                                    if (renderEffect == null) {
                                        float f11 = d70Var.b;
                                        float f12 = d70Var.c;
                                        int i8 = d70Var.d;
                                        if (f11 != f || f12 != f) {
                                            renderEffect = RenderEffect.createBlurEffect(f11, f12, bx7.O(i8));
                                        } else {
                                            renderEffect = RenderEffect.createOffsetEffect(0.0f, 0.0f);
                                        }
                                        d70Var.a = renderEffect;
                                    }
                                } else {
                                    renderEffect = null;
                                }
                                renderNode.setRenderEffect(renderEffect);
                            }
                        }
                    }
                    if ((262144 & i3) != 0) {
                        di2 di2Var16 = fi2Var.x;
                        w60 w60Var = p55Var.T;
                        hi2 hi2Var14 = di2Var16.a;
                        if (!a34.i(hi2Var14.j, w60Var)) {
                            hi2Var14.j = w60Var;
                            Paint paint = hi2Var14.e;
                            if (paint == null) {
                                paint = new Paint();
                                hi2Var14.e = paint;
                            }
                            if (w60Var != null) {
                                blendModeColorFilter = w60Var.a;
                            } else {
                                blendModeColorFilter = null;
                            }
                            paint.setColorFilter(blendModeColorFilter);
                            hi2Var14.c();
                        }
                    }
                    if ((524288 & i3) != 0) {
                        di2 di2Var17 = fi2Var.x;
                        int i9 = p55Var.U;
                        hi2 hi2Var15 = di2Var17.a;
                        if (hi2Var15.i != i9) {
                            hi2Var15.i = i9;
                            Paint paint2 = hi2Var15.e;
                            if (paint2 == null) {
                                paint2 = new Paint();
                                hi2Var15.e = paint2;
                            }
                            paint2.setBlendMode(z51.P(i9));
                            hi2Var15.c();
                        }
                    }
                    if ((32768 & i3) != 0) {
                        di2 di2Var18 = fi2Var.x;
                        int i10 = p55Var.N;
                        if (i10 == 0) {
                            i2 = 0;
                        } else if (i10 == 1) {
                            i2 = 1;
                        } else {
                            i2 = 2;
                            if (i10 != 2) {
                                ze0.m("Not supported composition strategy");
                                return;
                            }
                        }
                        hi2 hi2Var16 = di2Var18.a;
                        if (hi2Var16.G != i2) {
                            hi2Var16.G = i2;
                            hi2Var16.c();
                        }
                    }
                    if ((i3 & 7963) != 0) {
                        fi2Var.N = true;
                        fi2Var.O = true;
                    }
                    if (!a34.i(fi2Var.M, p55Var.V)) {
                        bb4 bb4Var = p55Var.V;
                        fi2Var.M = bb4Var;
                        if (bb4Var == null) {
                            i = i3;
                        } else {
                            di2 di2Var19 = fi2Var.x;
                            if (bb4Var instanceof ah4) {
                                n05 n05Var = ((ah4) bb4Var).O;
                                float f13 = n05Var.a;
                                float f14 = n05Var.b;
                                i = i3;
                                di2Var19.i(0.0f, (Float.floatToRawIntBits(f13) << c) | (Float.floatToRawIntBits(f14) & j), (Float.floatToRawIntBits(n05Var.c - f13) << c) | (Float.floatToRawIntBits(n05Var.d - f14) & j));
                            } else {
                                i = i3;
                                if (bb4Var instanceof zg4) {
                                    id idVar = ((zg4) bb4Var).O;
                                    di2Var19.k = null;
                                    di2Var19.i = 9205357640488583168L;
                                    di2Var19.h = 0L;
                                    di2Var19.j = f;
                                    di2Var19.g = true;
                                    di2Var19.n = false;
                                    di2Var19.l = idVar;
                                    di2Var19.a();
                                } else if (bb4Var instanceof bh4) {
                                    bh4 bh4Var = (bh4) bb4Var;
                                    id idVar2 = bh4Var.P;
                                    if (idVar2 != null) {
                                        di2Var19.k = null;
                                        di2Var19.i = 9205357640488583168L;
                                        di2Var19.h = 0L;
                                        di2Var19.j = 0.0f;
                                        di2Var19.g = true;
                                        di2Var19.n = false;
                                        di2Var19.l = idVar2;
                                        di2Var19.a();
                                    } else {
                                        m75 m75Var = bh4Var.O;
                                        float f15 = m75Var.b;
                                        float f16 = m75Var.a;
                                        di2Var19.i(Float.intBitsToFloat((int) (m75Var.h >> c)), (Float.floatToRawIntBits(f16) << c) | (Float.floatToRawIntBits(f15) & j), (Float.floatToRawIntBits(m75Var.c - f16) << c) | (Float.floatToRawIntBits(m75Var.d - f15) & j));
                                    }
                                } else {
                                    ze0.l();
                                    return;
                                }
                            }
                            if (Build.VERSION.SDK_INT < 33 && (((bb4Var instanceof zg4) || ((bb4Var instanceof bh4) && !bx7.A(((bh4) bb4Var).O))) && (sb2Var = fi2Var.B) != null)) {
                                sb2Var.invoke();
                            }
                        }
                        z2 = true;
                    } else {
                        i = i3;
                        z2 = false;
                    }
                    fi2Var.K = p55Var.x;
                    if (i != 0 || z2) {
                        ViewParent parent = oaVar.getParent();
                        if (parent != null) {
                            parent.onDescendantInvalidated(oaVar, oaVar);
                        }
                        if (oa.k()) {
                            oaVar.K(0.0f);
                        }
                    }
                    boolean z6 = this.V;
                    this.V = p55Var.M;
                    this.Z = p55Var.A;
                    if (da3Var2.a == da3Var.a && da3Var2.b == da3Var.b && da3Var2.c == da3Var.c && da3Var2.d == da3Var.d && da3Var2.e == da3Var.e && da3Var2.f == da3Var.f && da3Var2.g == da3Var.g && da3Var2.h == da3Var.h && xh6.a(da3Var2.i, da3Var.i)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z && (!z3 || z6 != this.V || r05Var.x)) {
                        za3Var2 = za3Var;
                        kh4 kh4Var = za3Var2.K;
                        if (kh4Var != null) {
                            ((oa) kh4Var).u(za3Var2);
                        }
                    } else {
                        za3Var2 = za3Var;
                    }
                    if (!z3) {
                        za3Var2.O(this);
                        if (za3Var2.m0 > 0) {
                            oa oaVar2 = (oa) cb3.a(za3Var2);
                            y23 y23Var = (y23) oaVar2.q0.f;
                            if (za3Var2.m0 > 0) {
                                ((z44) y23Var.y).b(za3Var2);
                                za3Var2.l0 = true;
                            }
                            oaVar2.D(null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw h11.e("updateLayerParameters requires a non-null layerBlock");
            }
            if (ub2Var == null) {
                return;
            }
            ez2.b("null layer with a non-null layerBlock");
        }
    }

    @Override // defpackage.yl3
    public final ha3 q0() {
        return this;
    }
}
