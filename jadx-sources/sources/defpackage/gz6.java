package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class gz6 implements sb2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ w44 y;

    public /* synthetic */ gz6(w44 w44Var, byte b) {
        this.x = b;
        this.y = w44Var;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        w44 w44Var = this.y;
        switch (b) {
            case 0:
                w44Var.setValue(Boolean.FALSE);
                return pn6Var;
            case 1:
                w44Var.setValue(n17.x);
                return pn6Var;
            default:
                w44Var.setValue(Boolean.FALSE);
                return pn6Var;
        }
    }
}
