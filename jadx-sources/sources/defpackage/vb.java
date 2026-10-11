package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class vb implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ hg1 y;

    public /* synthetic */ vb(hg1 hg1Var, byte b) {
        this.x = b;
        this.y = hg1Var;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        hg1 hg1Var = this.y;
        switch (b) {
            case 0:
                hg1Var.show();
                return new i5(hg1Var, (byte) 1);
            default:
                if (hg1Var.C.a) {
                    hg1Var.B.invoke();
                }
                return pn6.a;
        }
    }
}
