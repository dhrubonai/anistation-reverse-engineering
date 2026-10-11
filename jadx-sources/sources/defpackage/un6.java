package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class un6 implements sb2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ zn6 y;

    public /* synthetic */ un6(zn6 zn6Var, byte b) {
        this.x = b;
        this.y = zn6Var;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        zn6 zn6Var = this.y;
        switch (b) {
            case 0:
                zn6Var.b();
                return pn6Var;
            case 1:
                if (zn6Var.f && !zn6Var.g) {
                    zn6Var.g = true;
                    yn6 yn6Var = zn6Var.j;
                    if (yn6Var != null) {
                        yn6Var.b.invoke();
                    }
                }
                return pn6Var;
            default:
                if (zn6Var.f) {
                    zn6Var.h = true;
                }
                return pn6Var;
        }
    }
}
