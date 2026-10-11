package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class yv3 implements dw3 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ dw3 y;

    public /* synthetic */ yv3(dw3 dw3Var, byte b) {
        this.x = b;
        this.y = dw3Var;
    }

    @Override // defpackage.dw3
    public final Object j(bu3 bu3Var, dt3 dt3Var, int i) {
        byte b = this.x;
        dw3 dw3Var = this.y;
        switch (b) {
            case 0:
                if (bu3Var == null) {
                    gw3.M(null, dt3Var, i, dw3Var, new h81(dt3Var, i));
                    throw null;
                }
                throw new ClassCastException();
            default:
                return gw3.M(bu3Var, dt3Var, i, dw3Var, new dv3(i, bu3Var, dt3Var));
        }
    }
}
