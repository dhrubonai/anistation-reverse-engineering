package defpackage;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gq0 extends k0 {
    public sb2 h0;
    public boolean i0;
    public final x34 j0;
    public final x34 k0;
    public uq4 l0;
    public bx5 m0;
    public bx5 n0;
    public boolean o0;
    public boolean p0;
    public long q0;
    public boolean r0;
    public dy2 s0;
    public bx5 t0;
    public bx5 u0;
    public boolean v0;
    public boolean w0;
    public long x0;
    public boolean y0;

    public gq0(sb2 sb2Var, sb2 sb2Var2, u34 u34Var, m65 m65Var, boolean z, boolean z2) {
        super(u34Var, null, false, z2, null, m65Var, sb2Var);
        this.h0 = sb2Var2;
        this.i0 = z;
        int i = gl3.a;
        this.j0 = new x34(6);
        this.k0 = new x34(6);
        this.q0 = -1L;
        this.x0 = -1L;
    }

    @Override // defpackage.xq4
    public final void J() {
        fo2 fo2Var;
        u34 u34Var = this.N;
        if (u34Var != null && (fo2Var = this.a0) != null) {
            u34Var.b(new go2(fo2Var));
        }
        this.a0 = null;
        r1(false);
    }

    @Override // defpackage.xz3
    public final void U0() {
        u1();
    }

    @Override // defpackage.ly2
    public final void Z(eb2 eb2Var, oq4 oq4Var) {
        boolean z;
        ArrayList arrayList = (ArrayList) eb2Var.z;
        l1();
        if (this.S && this.W == null) {
            ee2 ee2Var = new ee2(this);
            a1(ee2Var);
            this.W = ee2Var;
        }
        byte b = 1;
        int i = 0;
        if (oq4Var == oq4.y) {
            if (this.s0 == null) {
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (q23.h((dy2) arrayList.get(i2))) {
                        dy2 dy2Var = (dy2) arrayList.get(0);
                        dy2Var.i = true;
                        this.s0 = dy2Var;
                        if (this.S) {
                            bx5 bx5Var = this.u0;
                            vz0 vz0Var = null;
                            if (bx5Var != null && bx5Var.isActive()) {
                                ((rv6) t80.C(this, bv0.t)).getClass();
                                if (dy2Var.b - this.x0 < 40) {
                                    this.y0 = true;
                                    return;
                                }
                                this.v0 = true;
                                bx5 bx5Var2 = this.u0;
                                if (bx5Var2 != null) {
                                    bx5Var2.l(null);
                                }
                                this.u0 = null;
                            }
                            this.w0 = false;
                            j1(dy2Var);
                            if (this.h0 != null) {
                                this.t0 = tl7.z(O0(), null, null, new fq0(this, vz0Var, b), 3);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (this.w0) {
                int size2 = arrayList.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    dy2 dy2Var2 = (dy2) arrayList.get(i3);
                    if (!dy2Var2.h || dy2Var2.d) {
                        int size3 = arrayList.size();
                        while (i < size3) {
                            ((dy2) arrayList.get(i)).i = true;
                            i++;
                        }
                        return;
                    }
                }
                dy2 dy2Var3 = (dy2) arrayList.get(0);
                dy2Var3.i = true;
                long j = dy2Var3.b;
                dy2 dy2Var4 = this.s0;
                dy2Var4.getClass();
                s1(j, dy2Var4);
                return;
            }
            int size4 = arrayList.size();
            for (int i4 = 0; i4 < size4; i4++) {
                dy2 dy2Var5 = (dy2) arrayList.get(i4);
                if (dy2Var5.i || !dy2Var5.h || dy2Var5.d) {
                    float f = ((rv6) t80.C(this, bv0.t)).f();
                    int size5 = arrayList.size();
                    for (int i5 = 0; i5 < size5; i5++) {
                        dy2 dy2Var6 = (dy2) arrayList.get(i5);
                        long j2 = dy2Var6.c;
                        dy2 dy2Var7 = this.s0;
                        dy2Var7.getClass();
                        if (Math.abs(xc4.c(xc4.e(j2, dy2Var7.c))) > f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (dy2Var6.i || z) {
                            r1(true);
                            return;
                        }
                    }
                    return;
                }
            }
            dy2 dy2Var8 = (dy2) arrayList.get(0);
            dy2Var8.i = true;
            long j3 = dy2Var8.b;
            dy2 dy2Var9 = this.s0;
            dy2Var9.getClass();
            s1(j3, dy2Var9);
            return;
        }
        if (oq4Var == oq4.z && this.s0 != null && !this.w0) {
            int size6 = arrayList.size();
            while (i < size6) {
                dy2 dy2Var10 = (dy2) arrayList.get(i);
                if (dy2Var10.i && dy2Var10 != this.s0) {
                    r1(true);
                    return;
                }
                i++;
            }
        }
    }

    @Override // defpackage.k0
    public final void d1(bi5 bi5Var) {
        if (this.h0 != null) {
            y7 y7Var = new y7(this, (byte) 26);
            w73[] w73VarArr = zh5.a;
            bi5Var.b(oh5.c, new o3(null, y7Var));
        }
    }

    @Override // defpackage.ly2
    public final void l0() {
        r1(true);
    }

    @Override // defpackage.k0
    public final void m1() {
        u1();
    }

    @Override // defpackage.k0
    public final boolean n1(KeyEvent keyEvent) {
        boolean z;
        long C = h41.C(keyEvent);
        vz0 vz0Var = null;
        if (this.h0 != null) {
            x34 x34Var = this.j0;
            if (x34Var.d(C) == null) {
                x34Var.g(C, tl7.z(O0(), null, null, new fq0(this, vz0Var, (byte) 2), 3));
                z = true;
                return z;
            }
        }
        z = false;
        return z;
    }

    @Override // defpackage.k0
    public final void o1(KeyEvent keyEvent) {
        long C = h41.C(keyEvent);
        x34 x34Var = this.j0;
        boolean z = false;
        if (x34Var.d(C) != null) {
            h43 h43Var = (h43) x34Var.d(C);
            if (h43Var != null) {
                if (h43Var.isActive()) {
                    h43Var.l(null);
                } else {
                    z = true;
                }
            }
            x34Var.f(C);
        }
        if (!z) {
            p1();
        }
    }

    public final void r1(boolean z) {
        if (z) {
            this.s0 = null;
            bx5 bx5Var = this.t0;
            if (bx5Var != null) {
                bx5Var.l(null);
            }
            this.t0 = null;
            bx5 bx5Var2 = this.u0;
            if (bx5Var2 != null) {
                bx5Var2.l(null);
            }
            this.u0 = null;
            this.v0 = false;
            this.w0 = false;
            this.x0 = -1L;
            this.y0 = false;
        } else {
            this.l0 = null;
            bx5 bx5Var3 = this.m0;
            if (bx5Var3 != null) {
                bx5Var3.l(null);
            }
            this.m0 = null;
            bx5 bx5Var4 = this.n0;
            if (bx5Var4 != null) {
                bx5Var4.l(null);
            }
            this.n0 = null;
            this.o0 = false;
            this.p0 = false;
            this.q0 = -1L;
            this.r0 = false;
        }
        h1(z);
    }

    public final void s1(long j, dy2 dy2Var) {
        if (this.S && !this.y0) {
            i1(dy2Var.c, true);
            this.x0 = j;
            if (!this.w0 && !this.v0) {
                p1();
            }
        }
        this.s0 = null;
        this.y0 = false;
        this.v0 = false;
        bx5 bx5Var = this.t0;
        if (bx5Var != null) {
            bx5Var.l(null);
        }
        this.t0 = null;
        this.w0 = false;
    }

    public final void t1(long j, uq4 uq4Var) {
        if (this.S && !this.r0) {
            i1(uq4Var.c, false);
            this.q0 = j;
            if (!this.p0 && !this.o0) {
                p1();
            }
        }
        this.l0 = null;
        this.r0 = false;
        this.o0 = false;
        bx5 bx5Var = this.m0;
        if (bx5Var != null) {
            bx5Var.l(null);
        }
        this.m0 = null;
        this.p0 = false;
    }

    public final void u1() {
        char c;
        long j;
        long j2;
        char c2;
        x34 x34Var = this.j0;
        Object[] objArr = x34Var.c;
        long[] jArr = x34Var.a;
        int length = jArr.length - 2;
        char c3 = 7;
        if (length >= 0) {
            int i = 0;
            j = 128;
            while (true) {
                long j3 = jArr[i];
                j2 = 255;
                if ((((~j3) << c3) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    int i3 = 0;
                    while (i3 < i2) {
                        if ((j3 & 255) < 128) {
                            c2 = c3;
                            ((h43) objArr[(i << 3) + i3]).l(null);
                        } else {
                            c2 = c3;
                        }
                        j3 >>= 8;
                        i3++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i2 != 8) {
                        break;
                    }
                } else {
                    c = c3;
                }
                if (i == length) {
                    break;
                }
                i++;
                c3 = c;
            }
        } else {
            c = 7;
            j = 128;
            j2 = 255;
        }
        x34Var.a();
        x34 x34Var2 = this.k0;
        Object[] objArr2 = x34Var2.c;
        long[] jArr2 = x34Var2.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i4 = 0;
            while (true) {
                long j4 = jArr2[i4];
                if ((((~j4) << c) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length2)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((j4 & j2) >= j) {
                            j4 >>= 8;
                        } else {
                            ((eq0) objArr2[(i4 << 3) + i6]).getClass();
                            throw null;
                        }
                    }
                    if (i5 != 8) {
                        break;
                    }
                }
                if (i4 == length2) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        x34Var2.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.k0, defpackage.xq4
    public final void x(nq4 nq4Var, oq4 oq4Var, long j) {
        Object[] objArr;
        super.x(nq4Var, oq4Var, j);
        Object[] objArr2 = 0;
        if (oq4Var == oq4.y) {
            vz0 vz0Var = null;
            if (this.l0 == null) {
                if (j76.e(nq4Var, true)) {
                    uq4 uq4Var = (uq4) nq4Var.a.get(0);
                    uq4Var.a();
                    this.l0 = uq4Var;
                    if (this.S) {
                        bx5 bx5Var = this.n0;
                        if (bx5Var != null && bx5Var.isActive()) {
                            ((rv6) t80.C(this, bv0.t)).getClass();
                            if (uq4Var.b - this.q0 < 40) {
                                this.r0 = true;
                                return;
                            }
                            this.o0 = true;
                            bx5 bx5Var2 = this.n0;
                            if (bx5Var2 != null) {
                                bx5Var2.l(null);
                            }
                            this.n0 = null;
                        }
                        this.p0 = false;
                        k1(uq4Var);
                        if (this.h0 != null) {
                            this.m0 = tl7.z(O0(), null, null, new fq0(this, vz0Var, objArr2 == true ? 1 : 0), 3);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (nq4Var.c == 2) {
                objArr = true;
            } else {
                objArr = false;
            }
            List list = nq4Var.a;
            if (objArr != false && !this.p0 && this.S && this.h0 != null) {
                bx5 bx5Var3 = this.m0;
                if (bx5Var3 != null) {
                    bx5Var3.l(null);
                }
                this.m0 = null;
                sb2 sb2Var = this.h0;
                if (sb2Var != null) {
                    sb2Var.invoke();
                }
                if (this.i0) {
                    ((mm4) ((sj2) t80.C(this, bv0.l))).a(0);
                }
                this.p0 = true;
            }
            if (this.p0) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (!t80.y((uq4) list.get(i))) {
                        int size2 = list.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            ((uq4) list.get(i2)).a();
                        }
                        return;
                    }
                }
                uq4 uq4Var2 = (uq4) list.get(0);
                uq4Var2.a();
                long j2 = uq4Var2.b;
                uq4 uq4Var3 = this.l0;
                uq4Var3.getClass();
                t1(j2, uq4Var3);
                return;
            }
            int size3 = list.size();
            for (int i3 = 0; i3 < size3; i3++) {
                if (!t80.x((uq4) list.get(i3))) {
                    long g1 = g1(j);
                    int size4 = list.size();
                    for (int i4 = 0; i4 < size4; i4++) {
                        uq4 uq4Var4 = (uq4) list.get(i4);
                        if (uq4Var4.c() || t80.a0(uq4Var4, j, g1)) {
                            r1(false);
                            return;
                        }
                    }
                    return;
                }
            }
            uq4 uq4Var5 = (uq4) list.get(0);
            uq4Var5.a();
            long j3 = uq4Var5.b;
            uq4 uq4Var6 = this.l0;
            uq4Var6.getClass();
            t1(j3, uq4Var6);
            return;
        }
        if (oq4Var == oq4.z && this.l0 != null && !this.p0) {
            List list2 = nq4Var.a;
            int size5 = list2.size();
            for (int i5 = 0; i5 < size5; i5++) {
                uq4 uq4Var7 = (uq4) list2.get(i5);
                if (uq4Var7.c() && uq4Var7 != this.l0) {
                    r1(false);
                    return;
                }
            }
        }
    }
}
