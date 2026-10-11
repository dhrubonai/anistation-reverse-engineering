package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bc3 extends db {
    public static final st0 x = new st0((byte) 24);
    public final tc3 u = new tc3(this);
    public final eb2 v = new eb2();
    public boolean w;

    public bc3(ub2 ub2Var) {
        ub2Var.invoke(this);
    }

    public static void z0(bc3 bc3Var, String str, ub2 ub2Var, os0 os0Var, int i) {
        ic2 ic2Var;
        zb3 zb3Var = null;
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            ub2Var = null;
        }
        eb2 eb2Var = bc3Var.v;
        byte b = 0;
        if (str != null) {
            zb3Var = new zb3(str, (byte) 0);
        }
        if (ub2Var != null) {
            ic2Var = new o0((Object) ub2Var, (byte) 16);
        } else {
            ic2Var = x;
        }
        eb2Var.d(1, new yb3(zb3Var, ic2Var, new p03((byte) 8), new os0(-291643851, true, new ac3(os0Var, b))));
        if (ub2Var != null) {
            bc3Var.w = true;
        }
    }

    public final void A0(int i, ub2 ub2Var, ub2 ub2Var2, os0 os0Var) {
        this.v.d(i, new yb3(ub2Var, x, ub2Var2, os0Var));
    }

    @Override // defpackage.db
    public final eb2 T() {
        return this.v;
    }
}
