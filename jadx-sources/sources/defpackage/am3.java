package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class am3 extends yl3 implements ro3 {
    public final fa4 R;
    public LinkedHashMap T;
    public wo3 V;
    public final b44 W;
    public long S = 0;
    public final bm3 U = new bm3(this);

    public am3(fa4 fa4Var) {
        this.R = fa4Var;
        b44 b44Var = dc4.a;
        this.W = new b44();
    }

    @Override // defpackage.yl3
    public final void K0() {
        V(this.S, 0.0f, null);
    }

    public void M0() {
        u0().b();
    }

    public final void O0(long j) {
        if (!c13.b(this.S, j)) {
            this.S = j;
            fa4 fa4Var = this.R;
            em3 em3Var = fa4Var.R.d0.q;
            if (em3Var != null) {
                em3Var.m0();
            }
            yl3.F0(fa4Var);
        }
        if (!this.L) {
            m0(u0());
        }
    }

    public final long P0(am3 am3Var, boolean z) {
        long j = 0;
        while (!this.equals(am3Var)) {
            if (!this.I || !z) {
                j = c13.d(j, this.S);
            }
            fa4 fa4Var = this.R.T;
            fa4Var.getClass();
            this = fa4Var.W0();
            this.getClass();
        }
        return j;
    }

    public final void Q0(wo3 wo3Var) {
        LinkedHashMap linkedHashMap;
        if (wo3Var != null) {
            Z((wo3Var.getHeight() & 4294967295L) | (wo3Var.getWidth() << 32));
        } else {
            Z(0L);
        }
        if (!a34.i(this.V, wo3Var) && wo3Var != null && ((((linkedHashMap = this.T) != null && !linkedHashMap.isEmpty()) || !wo3Var.a().isEmpty()) && !a34.i(wo3Var.a(), this.T))) {
            em3 em3Var = this.R.R.d0.q;
            em3Var.getClass();
            em3Var.P.f();
            LinkedHashMap linkedHashMap2 = this.T;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                this.T = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(wo3Var.a());
        }
        this.V = wo3Var;
    }

    @Override // defpackage.em4
    public final void V(long j, float f, ub2 ub2Var) {
        O0(j);
        if (this.K) {
            return;
        }
        M0();
    }

    @Override // defpackage.ud1
    public final float b() {
        return this.R.b();
    }

    @Override // defpackage.yl3, defpackage.j23
    public final boolean d0() {
        return true;
    }

    @Override // defpackage.ud1
    public final float getFontScale() {
        return this.R.getFontScale();
    }

    @Override // defpackage.j23
    public final ia3 getLayoutDirection() {
        return this.R.R.W;
    }

    @Override // defpackage.yl3
    public final yl3 o0() {
        fa4 fa4Var = this.R.S;
        if (fa4Var != null) {
            return fa4Var.W0();
        }
        return null;
    }

    @Override // defpackage.yl3
    public final ha3 q0() {
        return this.U;
    }

    @Override // defpackage.yl3
    public final boolean r0() {
        if (this.V != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.yl3
    public final za3 t0() {
        return this.R.R;
    }

    @Override // defpackage.yl3
    public final wo3 u0() {
        wo3 wo3Var = this.V;
        if (wo3Var != null) {
            return wo3Var;
        }
        throw h11.e("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // defpackage.em4, defpackage.ro3
    public final Object w() {
        return this.R.w();
    }

    @Override // defpackage.yl3
    public final yl3 y0() {
        fa4 fa4Var = this.R.T;
        if (fa4Var != null) {
            return fa4Var.W0();
        }
        return null;
    }

    @Override // defpackage.yl3
    public final long z0() {
        return this.S;
    }
}
