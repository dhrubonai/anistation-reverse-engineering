package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class jm implements sb2 {
    public final /* synthetic */ sb2 A;
    public final /* synthetic */ byte x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ sb2 z;

    public /* synthetic */ jm(boolean z, sb2 sb2Var, sb2 sb2Var2, byte b) {
        this.x = b;
        this.y = z;
        this.z = sb2Var;
        this.A = sb2Var2;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        sb2 sb2Var = this.A;
        sb2 sb2Var2 = this.z;
        boolean z = this.y;
        switch (b) {
            case 0:
                if (z) {
                    sb2Var2.invoke();
                } else {
                    sb2Var.invoke();
                }
                return pn6Var;
            case 1:
                if (z) {
                    sb2Var2.invoke();
                } else {
                    sb2Var.invoke();
                }
                return pn6Var;
            default:
                if (z) {
                    sb2Var2.invoke();
                } else {
                    sb2Var.invoke();
                }
                return pn6Var;
        }
    }
}
