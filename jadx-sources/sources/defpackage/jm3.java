package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class jm3 implements sb2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ km3 y;

    public /* synthetic */ jm3(km3 km3Var, byte b) {
        this.x = b;
        this.y = km3Var;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        long j;
        byte b = this.x;
        km3 km3Var = this.y;
        switch (b) {
            case 0:
                km3Var.c1();
                return pn6.a;
            case 1:
                return new xc4(km3Var.Z);
            default:
                ha3 ha3Var = (ha3) km3Var.X.getValue();
                if (ha3Var != null) {
                    j = ha3Var.J(0L);
                } else {
                    j = 9205357640488583168L;
                }
                return new xc4(j);
        }
    }
}
