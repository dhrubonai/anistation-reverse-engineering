package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class h74 implements sb2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ xi6 y;

    public /* synthetic */ h74(xi6 xi6Var, byte b) {
        this.x = b;
        this.y = xi6Var;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        boolean z;
        byte b = this.x;
        xi6 xi6Var = this.y;
        switch (b) {
            case 0:
                return Boolean.valueOf(xi6Var.g());
            case 1:
                if (a34.i(xi6Var.d.getValue(), xi6Var.a.v()) && !xi6Var.g() && !((Boolean) xi6Var.i.getValue()).booleanValue()) {
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                return Long.valueOf(xi6Var.b());
        }
    }
}
