package defpackage;

import android.view.View;
import android.widget.Magnifier;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class km3 extends xz3 implements hf2, zo1, sh5, mc4 {
    public ub2 L;
    public ub2 M;
    public pk2 T;
    public View U;
    public ud1 V;
    public fq3 W;
    public he1 Y;
    public k13 a0;
    public za0 b0;
    public float N = Float.NaN;
    public boolean O = true;
    public long P = 9205357640488583168L;
    public float Q = Float.NaN;
    public float R = Float.NaN;
    public boolean S = true;
    public final ti4 X = new ti4(null, h95.H);
    public long Z = 9205357640488583168L;

    public km3(ub2 ub2Var, ub2 ub2Var2, pk2 pk2Var) {
        this.L = ub2Var;
        this.M = ub2Var2;
        this.T = pk2Var;
    }

    @Override // defpackage.sh5
    public final void I0(bi5 bi5Var) {
        bi5Var.b(lm3.a, new jm3(this, (byte) 1));
    }

    @Override // defpackage.xz3
    public final void S0() {
        q0();
        this.b0 = iv.d(0, 7, null);
        tl7.z(O0(), null, y11.A, new nf6(this, null, (byte) 3), 1);
    }

    @Override // defpackage.xz3
    public final void T0() {
        fq3 fq3Var = this.W;
        if (fq3Var != null) {
            ((Magnifier) fq3Var.y).dismiss();
        }
        this.W = null;
    }

    public final long a1() {
        he1 he1Var = this.Y;
        if (he1Var == null) {
            he1Var = ut5.b(new jm3(this, (byte) 2));
            this.Y = he1Var;
        }
        return ((xc4) he1Var.getValue()).a;
    }

    public final void b1() {
        fq3 fq3Var;
        fq3 fq3Var2 = this.W;
        if (fq3Var2 != null) {
            ((Magnifier) fq3Var2.y).dismiss();
        }
        View view = this.U;
        if (view == null) {
            view = jf7.E(this);
        }
        this.U = view;
        ud1 ud1Var = this.V;
        if (ud1Var == null) {
            ud1Var = wc7.O(this).V;
        }
        this.V = ud1Var;
        pk2 pk2Var = this.T;
        boolean z = this.O;
        long j = this.P;
        float f = this.Q;
        float f2 = this.R;
        boolean z2 = this.S;
        float f3 = this.N;
        pk2Var.getClass();
        if (z) {
            fq3Var = new fq3(new Magnifier(view), (byte) 4);
        } else {
            long D0 = ud1Var.D0(j);
            float g0 = ud1Var.g0(f);
            float g02 = ud1Var.g0(f2);
            Magnifier.Builder builder = new Magnifier.Builder(view);
            if (D0 != 9205357640488583168L) {
                builder.setSize(io3.h0(Float.intBitsToFloat((int) (D0 >> 32))), io3.h0(Float.intBitsToFloat((int) (D0 & 4294967295L))));
            }
            if (!Float.isNaN(g0)) {
                builder.setCornerRadius(g0);
            }
            if (!Float.isNaN(g02)) {
                builder.setElevation(g02);
            }
            if (!Float.isNaN(f3)) {
                builder.setInitialZoom(f3);
            }
            builder.setClippingEnabled(z2);
            fq3Var = new fq3(builder.build(), (byte) 4);
        }
        this.W = fq3Var;
        d1();
    }

    public final void c1() {
        ud1 ud1Var = this.V;
        if (ud1Var == null) {
            ud1Var = wc7.O(this).V;
            this.V = ud1Var;
        }
        long j = ((xc4) this.L.invoke(ud1Var)).a;
        if ((j & 9223372034707292159L) != 9205357640488583168L && (a1() & 9223372034707292159L) != 9205357640488583168L) {
            this.Z = xc4.f(a1(), j);
            if (this.W == null) {
                b1();
            }
            fq3 fq3Var = this.W;
            if (fq3Var != null) {
                long j2 = this.Z;
                float f = this.N;
                Magnifier magnifier = (Magnifier) fq3Var.y;
                if (!Float.isNaN(f)) {
                    magnifier.setZoom(f);
                }
                if ((9205357640488583168L & 9223372034707292159L) != 9205357640488583168L) {
                    magnifier.show(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (9205357640488583168L >> 32)), Float.intBitsToFloat((int) (4294967295L & 9205357640488583168L)));
                } else {
                    magnifier.show(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (4294967295L & j2)));
                }
            }
            d1();
            return;
        }
        this.Z = 9205357640488583168L;
        fq3 fq3Var2 = this.W;
        if (fq3Var2 != null) {
            ((Magnifier) fq3Var2.y).dismiss();
        }
    }

    public final void d1() {
        ud1 ud1Var;
        fq3 fq3Var = this.W;
        if (fq3Var == null || (ud1Var = this.V) == null) {
            return;
        }
        long j = fq3Var.j();
        k13 k13Var = this.a0;
        if (k13Var == null || j != k13Var.a) {
            ub2 ub2Var = this.M;
            if (ub2Var != null) {
                ub2Var.invoke(new ym1(ud1Var.s(m37.O(fq3Var.j()))));
            }
            this.a0 = new k13(fq3Var.j());
        }
    }

    @Override // defpackage.hf2
    public final void f0(fa4 fa4Var) {
        this.X.setValue(fa4Var);
    }

    @Override // defpackage.mc4
    public final void q0() {
        h98.I(this, new jm3(this, (byte) 0));
    }

    @Override // defpackage.zo1
    public final void u0(bb3 bb3Var) {
        bb3Var.a();
        za0 za0Var = this.b0;
        if (za0Var != null) {
            za0Var.i(pn6.a);
        }
    }
}
