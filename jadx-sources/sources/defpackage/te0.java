package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class te0 implements o41 {
    public l33 A;
    public lp5 x;
    public final q18 y = new q18((byte) 18);
    public boolean z;

    @Override // defpackage.o41
    public final q41 H() {
        q41 q41Var;
        l33 l33Var = this.A;
        if (l33Var != null) {
            q41Var = l33Var.H();
        } else {
            q41Var = null;
        }
        return a(q41Var, 0);
    }

    public final ue0 a(q41 q41Var, int i) {
        se0 se0Var;
        lp5 lp5Var = this.x;
        lp5Var.getClass();
        if (!this.z && q41Var != null) {
            se0Var = new se0(lp5Var);
        } else {
            se0Var = null;
        }
        return new ue0(lp5Var, q41Var, this.y.H(), se0Var, i);
    }
}
