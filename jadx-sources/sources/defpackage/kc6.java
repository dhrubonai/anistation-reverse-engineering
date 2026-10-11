package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class kc6 extends zc1 implements ra3, hf2, wu0 {
    public dd6 N;
    public boolean O;
    public final z90 P;
    public Map Q;

    public kc6(dd6 dd6Var, gi6 gi6Var, xd6 xd6Var, boolean z, o83 o83Var) {
        boolean z2;
        this.N = dd6Var;
        this.O = z;
        z90 z90Var = new z90(dd6Var.g);
        a1(z90Var);
        this.P = z90Var;
        dd6 dd6Var2 = this.N;
        dd6Var2.getClass();
        boolean z3 = this.O;
        boolean z4 = !z3;
        qa6 qa6Var = dd6Var2.a;
        if (o83Var.c == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        qa6Var.x.setValue(new pa6(gi6Var, xd6Var, z3, z4, z2));
    }

    @Override // defpackage.ra3
    public final wo3 e(xo3 xo3Var, ro3 ro3Var, long j) {
        float f;
        dd6 dd6Var = this.N;
        ia3 layoutDirection = xo3Var.getLayoutDirection();
        p82 p82Var = (p82) t80.C(this, bv0.k);
        qa6 qa6Var = dd6Var.a;
        oa6 oa6Var = new oa6(xo3Var, layoutDirection, p82Var, j);
        qa6Var.y.setValue(oa6Var);
        pa6 pa6Var = (pa6) qa6Var.x.getValue();
        if (pa6Var != null) {
            bd6 e = qa6Var.e(pa6Var, oa6Var);
            long j2 = e.c;
            int i = (int) (j2 >> 32);
            int i2 = (int) (j2 & 4294967295L);
            em4 p = ro3Var.p(n03.p(i, i, i2, i2));
            dd6 dd6Var2 = this.N;
            if (this.O) {
                f = xo3Var.T(rz5.a(e.b.b(0)));
            } else {
                f = 0.0f;
            }
            dd6Var2.f.setValue(new vm1(f));
            Map map = this.Q;
            if (map == null) {
                map = new LinkedHashMap(2);
            }
            map.put(i7.a, Integer.valueOf(Math.round(e.d)));
            map.put(i7.b, Integer.valueOf(Math.round(e.e)));
            this.Q = map;
            return xo3Var.L(i, i2, map, new r0(p, (byte) 17));
        }
        hz2.d("Called layoutWithNewMeasureInputs before updateNonMeasureInputs");
        v71.e();
        return null;
    }

    @Override // defpackage.hf2
    public final void f0(fa4 fa4Var) {
        this.N.c.setValue(fa4Var);
    }
}
