package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class uv0 implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ bu3 y;
    public final /* synthetic */ dt3 z;

    public /* synthetic */ uv0(bu3 bu3Var, dt3 dt3Var, byte b) {
        this.x = b;
        this.y = bu3Var;
        this.z = dt3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        dt3 dt3Var = this.z;
        bu3 bu3Var = this.y;
        switch (b) {
            case 0:
                if (!bu3Var.i()) {
                    if (bu3Var.y) {
                        if (!bu3.j(dt3Var)) {
                            if (bu3Var.h(dt3Var)) {
                                bu3Var.y = false;
                            }
                        } else {
                            return;
                        }
                    }
                    bu3Var.e.getClass();
                    return;
                }
                return;
            case 1:
                bu3Var.g.R(dt3Var, Integer.MIN_VALUE, 1, gw3.W(new qi2((byte) 23)));
                return;
            case 2:
                bu3Var.g.P(dt3Var, Integer.MIN_VALUE);
                return;
            case 3:
                bu3Var.g.P(dt3Var, Integer.MIN_VALUE);
                return;
            case 4:
                bu3Var.g.R(dt3Var, Integer.MIN_VALUE, 1, gw3.W(new qi2((byte) 23)));
                return;
            case 5:
                bu3Var.g.R(dt3Var, Integer.MIN_VALUE, 9, gw3.W(new qi2((byte) 16)));
                return;
            case 6:
                bu3Var.g.R(dt3Var, Integer.MIN_VALUE, 7, gw3.W(new ov3((byte) 1)));
                return;
            case 7:
                bu3Var.g.R(dt3Var, Integer.MIN_VALUE, 12, gw3.W(new ov3((byte) 13)));
                return;
            case 8:
                bu3Var.g.R(dt3Var, Integer.MIN_VALUE, 11, gw3.W(new qi2((byte) 29)));
                return;
            default:
                bu3Var.g.R(dt3Var, Integer.MIN_VALUE, 3, gw3.W(new qi2((byte) 17)));
                return;
        }
    }
}
