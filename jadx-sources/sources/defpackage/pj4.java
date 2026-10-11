package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pj4 implements cw0 {
    public final d46 A = new d46(new nj4(this, (byte) 0));
    public final h85 x;
    public final String y;
    public final ic2 z;

    public pj4(h85 h85Var, String str, ic2 ic2Var) {
        this.x = h85Var;
        this.y = str;
        this.z = ic2Var;
    }

    @Override // defpackage.cw0
    public final Object Y(boolean z, ic2 ic2Var, vz0 vz0Var) {
        mj4 mj4Var;
        oj4 oj4Var = (oj4) vz0Var.getContext().get(oj4.y);
        vz0 vz0Var2 = null;
        if (oj4Var != null) {
            mj4Var = oj4Var.x;
        } else {
            mj4Var = null;
        }
        if (mj4Var != null) {
            return ic2Var.invoke(mj4Var, vz0Var);
        }
        mj4 mj4Var2 = new mj4(this.z, (g85) this.A.getValue());
        return tl7.V(new oj4(mj4Var2), new e52(ic2Var, mj4Var2, vz0Var2, (byte) 13), vz0Var);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        d46 d46Var = this.A;
        if (d46Var.isInitialized()) {
            ((g85) d46Var.getValue()).close();
        }
    }
}
