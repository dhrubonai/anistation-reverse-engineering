package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class gc3 implements sb2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ wc3 y;

    public /* synthetic */ gc3(wc3 wc3Var, byte b) {
        this.x = b;
        this.y = wc3Var;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        int i;
        byte b = this.x;
        wc3 wc3Var = this.y;
        switch (b) {
            case 0:
                return Integer.valueOf(((mc3) wc3Var.e.getValue()).m);
            default:
                int i2 = wc3Var.g().q;
                nc3 nc3Var = (nc3) yo0.s0(wc3Var.g().n);
                boolean z = false;
                if (nc3Var != null) {
                    i = nc3Var.a;
                } else {
                    i = 0;
                }
                if (i2 > 0 && i >= i2 - 4) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
