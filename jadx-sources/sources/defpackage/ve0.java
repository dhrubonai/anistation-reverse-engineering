package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ve0 extends xz3 implements mc4, ib0, zo1 {
    public final we0 L;
    public boolean M;
    public ub2 N;

    public ve0(we0 we0Var, ub2 ub2Var) {
        this.L = we0Var;
        this.N = ub2Var;
        we0Var.x = this;
    }

    @Override // defpackage.zo1
    public final void P() {
        a1();
    }

    @Override // defpackage.xz3
    public final void U0() {
        a1();
    }

    @Override // defpackage.yc1
    public final void V() {
        a1();
    }

    public final void a1() {
        this.M = false;
        this.L.y = null;
        v94.y(this);
    }

    @Override // defpackage.ib0
    public final ud1 b() {
        return wc7.O(this).V;
    }

    @Override // defpackage.yc1, defpackage.xq4
    public final void f() {
        a1();
    }

    @Override // defpackage.ib0
    public final long g() {
        return m37.O(wc7.M(this, 4).z);
    }

    @Override // defpackage.ib0
    public final ia3 getLayoutDirection() {
        return wc7.O(this).W;
    }

    @Override // defpackage.mc4
    public final void q0() {
        a1();
    }

    @Override // defpackage.zo1
    public final void u0(bb3 bb3Var) {
        boolean z = this.M;
        we0 we0Var = this.L;
        if (!z) {
            we0Var.y = null;
            h98.I(this, new n(this, we0Var, (byte) 22));
            if (we0Var.y != null) {
                this.M = true;
            } else {
                throw h11.e("DrawResult not defined, did you forget to call onDraw?");
            }
        }
        ap1 ap1Var = we0Var.y;
        ap1Var.getClass();
        ap1Var.x.invoke(bb3Var);
    }

    @Override // defpackage.xz3
    public final void T0() {
    }
}
