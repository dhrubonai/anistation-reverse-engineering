package defpackage;

import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jd5 extends ho1 implements j83, sh5 {
    public final g84 g0;
    public o0 h0;
    public a3 i0;
    public boolean j0;
    public boolean k0;
    public h14 l0;
    public oh6 m0;
    public final s81 n0;
    public final rd5 o0;
    public final hd5 p0;
    public final h82 q0;
    public final py0 r0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [xz3, ca0, yc1] */
    public jd5(fc fcVar, fa0 fa0Var, i42 i42Var, u34 u34Var, rg4 rg4Var, kd5 kd5Var, boolean z, boolean z2) {
        super(o80.a, z, u34Var, rg4Var);
        i42 i42Var2;
        this.g0 = new g84();
        s81 s81Var = new s81(new f61(new eo3(fd5.c)));
        this.n0 = s81Var;
        if (i42Var == null) {
            i42Var2 = s81Var;
        } else {
            i42Var2 = i42Var;
        }
        rd5 rd5Var = new rd5(kd5Var, fcVar, i42Var2, rg4Var, z2, this.g0, this, new id5(this, (byte) 0));
        this.o0 = rd5Var;
        hd5 hd5Var = new hd5(rd5Var, z);
        this.p0 = hd5Var;
        h82 h82Var = new h82(2, null, 10);
        a1(h82Var);
        this.q0 = h82Var;
        py0 py0Var = new py0(rg4Var, rd5Var, z2, fa0Var, new id5(this, (byte) 1));
        a1(py0Var);
        this.r0 = py0Var;
        a1(new k84(hd5Var, this.g0));
        ?? xz3Var = new xz3();
        xz3Var.L = py0Var;
        a1(xz3Var);
    }

    @Override // defpackage.j83
    public final boolean E(KeyEvent keyEvent) {
        float f;
        long floatToRawIntBits;
        float f2;
        boolean z = false;
        if (!this.P || ((!e83.a(h41.C(keyEvent), e83.D) && !e83.a(q23.c(keyEvent.getKeyCode()), e83.C)) || h41.E(keyEvent) != 2 || keyEvent.isCtrlPressed())) {
            return false;
        }
        if (this.o0.d == rg4.x) {
            z = true;
        }
        py0 py0Var = this.r0;
        if (z) {
            int b1 = (int) (py0Var.b1() & 4294967295L);
            if (e83.a(q23.c(keyEvent.getKeyCode()), e83.C)) {
                f2 = b1;
            } else {
                f2 = -b1;
            }
            floatToRawIntBits = (Float.floatToRawIntBits(0.0f) << 32) | (4294967295L & Float.floatToRawIntBits(f2));
        } else {
            int b12 = (int) (py0Var.b1() >> 32);
            if (e83.a(q23.c(keyEvent.getKeyCode()), e83.C)) {
                f = b12;
            } else {
                f = -b12;
            }
            floatToRawIntBits = (Float.floatToRawIntBits(0.0f) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        }
        tl7.z(O0(), null, null, new a3(this, floatToRawIntBits, null, (byte) 1), 3);
        return true;
    }

    @Override // defpackage.sh5
    public final void I0(bi5 bi5Var) {
        if (this.P && (this.h0 == null || this.i0 == null)) {
            this.h0 = new o0((Object) this, (byte) 1);
            this.i0 = new a3(this, null);
        }
        o0 o0Var = this.h0;
        if (o0Var != null) {
            w73[] w73VarArr = zh5.a;
            bi5Var.b(oh5.d, new o3(null, o0Var));
        }
        a3 a3Var = this.i0;
        if (a3Var != null) {
            w73[] w73VarArr2 = zh5.a;
            bi5Var.b(oh5.e, a3Var);
        }
    }

    @Override // defpackage.xz3
    public final boolean P0() {
        return false;
    }

    @Override // defpackage.xz3
    public final void S0() {
        h14 h14Var = this.l0;
        if (h14Var != null) {
            h14Var.c = wc7.O(this).V;
        }
        oh6 oh6Var = this.m0;
        if (oh6Var != null) {
            oh6Var.c = wc7.O(this).V;
        }
        if (!this.K) {
            return;
        }
        ud1 ud1Var = wc7.O(this).V;
        s81 s81Var = this.n0;
        s81Var.getClass();
        s81Var.a = new f61(new eo3(ud1Var));
    }

    @Override // defpackage.ho1
    public final Object e1(l5 l5Var, j10 j10Var) {
        rd5 rd5Var = this.o0;
        Object g = rd5Var.g(c54.y, new e05((Object) l5Var, (Object) rd5Var, (vz0) null, (byte) 3), j10Var);
        if (g == w11.x) {
            return g;
        }
        return pn6.a;
    }

    @Override // defpackage.yc1, defpackage.xq4
    public final void f() {
        J();
        h14 h14Var = this.l0;
        if (h14Var != null) {
            h14Var.c = wc7.O(this).V;
        }
        oh6 oh6Var = this.m0;
        if (oh6Var != null) {
            oh6Var.c = wc7.O(this).V;
        }
        J();
        if (!this.K) {
            return;
        }
        ud1 ud1Var = wc7.O(this).V;
        s81 s81Var = this.n0;
        s81Var.getClass();
        s81Var.a = new f61(new eo3(ud1Var));
    }

    @Override // defpackage.ho1
    public final void k1(sn1 sn1Var) {
        if (!this.K) {
            return;
        }
        tl7.z(this.g0.c(), null, null, new e52(sn1Var, this, null, (byte) 18), 3);
    }

    @Override // defpackage.j83
    public final boolean m(KeyEvent keyEvent) {
        return false;
    }

    public final void v1(fc fcVar, fa0 fa0Var, i42 i42Var, u34 u34Var, rg4 rg4Var, kd5 kd5Var, boolean z, boolean z2) {
        boolean z3;
        if (this.P != z) {
            this.p0.y = z;
            this.h0 = null;
            this.i0 = null;
            z51.w(this);
        }
        if (i42Var == null) {
            i42Var = this.n0;
        }
        rd5 rd5Var = this.o0;
        boolean z4 = true;
        if (!a34.i(rd5Var.a, kd5Var)) {
            rd5Var.a = kd5Var;
            z3 = true;
        } else {
            z3 = false;
        }
        rd5Var.b = fcVar;
        rg4 rg4Var2 = rd5Var.d;
        if (rg4Var2 != rg4Var) {
            rd5Var.d = rg4Var;
            rg4Var2 = rg4Var;
            z3 = true;
        }
        if (rd5Var.e != z2) {
            rd5Var.e = z2;
        } else {
            z4 = z3;
        }
        rd5Var.c = i42Var;
        rd5Var.f = this.g0;
        py0 py0Var = this.r0;
        py0Var.L = rg4Var;
        py0Var.N = z2;
        py0Var.O = fa0Var;
        b3 b3Var = o80.a;
        rg4 rg4Var3 = rg4.x;
        if (rg4Var2 != rg4Var3) {
            rg4Var3 = rg4.y;
        }
        u1(b3Var, z, u34Var, rg4Var3, z4);
    }

    @Override // defpackage.ho1, defpackage.xq4
    public final void x(nq4 nq4Var, oq4 oq4Var, long j) {
        byte b;
        int i;
        List list = nq4Var.a;
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (((Boolean) this.O.invoke(new cr4(((uq4) list.get(i2)).i))).booleanValue()) {
                super.x(nq4Var, oq4Var, j);
                break;
            }
            i2++;
        }
        if (this.P) {
            if (this.X == null) {
                ee2 ee2Var = new ee2(this);
                a1(ee2Var);
                this.X = ee2Var;
            }
            vz0 vz0Var = null;
            oq4 oq4Var2 = oq4.x;
            if (oq4Var == oq4Var2 && nq4Var.f == 6) {
                if (!this.j0) {
                    this.l0 = new h14(this.o0, new cn7(ViewConfiguration.get(jf7.E(this).getContext())), new ns0(2, this, jd5.class, "onMouseWheelScrollStopped", "onMouseWheelScrollStopped-TH1AsA0(J)V", 4, (byte) 2), wc7.O(this).V);
                    this.j0 = true;
                }
                h14 h14Var = this.l0;
                if (h14Var != null) {
                    v11 O0 = O0();
                    if (h14Var.h == null) {
                        h14Var.h = tl7.z(O0, null, null, new q8(h14Var, vz0Var, (byte) 8), 3);
                    }
                }
            }
            h14 h14Var2 = this.l0;
            oq4 oq4Var3 = oq4.y;
            if (h14Var2 != null && nq4Var.f == 6) {
                List list2 = nq4Var.a;
                int size2 = list2.size();
                int i3 = 0;
                while (true) {
                    if (i3 < size2) {
                        if (((uq4) list2.get(i3)).c()) {
                            break;
                        } else {
                            i3++;
                        }
                    } else {
                        if (oq4Var == oq4Var2 && h14Var2.d) {
                            h14Var2.f(nq4Var);
                            oa4.a(nq4Var);
                        }
                        if (oq4Var == oq4Var3 && !h14Var2.d && h14Var2.f(nq4Var)) {
                            oa4.a(nq4Var);
                        }
                    }
                }
            }
            if (oq4Var == oq4Var2 && ((i = nq4Var.f) == 10 || i == 11 || i == 12)) {
                if (!this.k0) {
                    b = 10;
                    this.m0 = new oh6(this.o0, new ns0(2, this, jd5.class, "onTrackpadScrollStopped", "onTrackpadScrollStopped-TH1AsA0(J)V", 4, (byte) 3), wc7.O(this).V);
                    this.k0 = true;
                } else {
                    b = 10;
                }
                oh6 oh6Var = this.m0;
                if (oh6Var != null) {
                    v11 O02 = O0();
                    if (oh6Var.g == null) {
                        oh6Var.g = tl7.z(O02, null, null, new j10(oh6Var, vz0Var, b), 3);
                    }
                }
            } else {
                b = 10;
            }
            oh6 oh6Var2 = this.m0;
            if (oh6Var2 != null) {
                int i4 = nq4Var.f;
                if (i4 == b || i4 == 11 || i4 == 12) {
                    List list3 = nq4Var.a;
                    int size3 = list3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        if (((uq4) list3.get(i5)).c()) {
                            return;
                        }
                    }
                    if (oq4Var == oq4Var2 && oh6Var2.d) {
                        oh6Var2.d(nq4Var);
                        oa4.a(nq4Var);
                    }
                    if (oq4Var == oq4Var3 && !oh6Var2.d && oh6Var2.d(nq4Var)) {
                        oa4.a(nq4Var);
                    }
                }
            }
        }
    }

    @Override // defpackage.ho1
    public final void j1(long j) {
    }
}
