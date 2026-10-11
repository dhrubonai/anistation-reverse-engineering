package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class c66 extends xz3 implements ra3 {
    public ti4 L;
    public int M;
    public tw5 N;
    public wj O;
    public wj P;
    public vm1 Q;
    public vm1 R;

    @Override // defpackage.ra3
    public final wo3 e(xo3 xo3Var, ro3 ro3Var, long j) {
        float f;
        tk6 tk6Var = db.n;
        boolean isEmpty = ((List) this.L.getValue()).isEmpty();
        ot1 ot1Var = ot1.x;
        if (isEmpty) {
            return xo3Var.L(0, 0, ot1Var, new tg5((byte) 23));
        }
        float f2 = ((j66) ((List) this.L.getValue()).get(this.M)).b;
        vm1 vm1Var = this.R;
        vz0 vz0Var = null;
        if (vm1Var != null) {
            wj wjVar = this.P;
            if (wjVar == null) {
                wjVar = new wj(vm1Var, tk6Var, null, 12);
                this.P = wjVar;
            }
            if (!vm1.c(f2, ((vm1) wjVar.e.getValue()).x)) {
                f = f2;
                tl7.z(O0(), null, null, new b66(wjVar, f2, this, vz0Var, (byte) 0), 3);
            } else {
                f = f2;
            }
        } else {
            f = f2;
            this.R = new vm1(f);
        }
        float f3 = ((j66) ((List) this.L.getValue()).get(this.M)).a;
        vm1 vm1Var2 = this.Q;
        if (vm1Var2 != null) {
            wj wjVar2 = this.O;
            if (wjVar2 == null) {
                wjVar2 = new wj(vm1Var2, tk6Var, null, 12);
                this.O = wjVar2;
            }
            if (!vm1.c(f3, ((vm1) wjVar2.e.getValue()).x)) {
                tl7.z(O0(), null, null, new b66(wjVar2, f3, this, vz0Var, (byte) 1), 3);
            }
        } else {
            this.Q = new vm1(f3);
        }
        ia3 layoutDirection = xo3Var.getLayoutDirection();
        wj wjVar3 = this.O;
        if (layoutDirection == ia3.x) {
            if (wjVar3 != null) {
                f3 = ((vm1) wjVar3.d()).x;
            }
        } else {
            if (wjVar3 != null) {
                f3 = ((vm1) wjVar3.d()).x;
            }
            f3 = -f3;
        }
        wj wjVar4 = this.P;
        if (wjVar4 != null) {
            f = ((vm1) wjVar4.d()).x;
        }
        em4 p = ro3Var.p(rx0.a(j, xo3Var.x0(f), xo3Var.x0(f), 0, 0, 12));
        return xo3Var.L(p.x, p.y, ot1Var, new qb(p, xo3Var, f3));
    }
}
