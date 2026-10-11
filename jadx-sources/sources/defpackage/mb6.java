package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class mb6 implements sb2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ v11 y;
    public final /* synthetic */ ub2 z;

    public /* synthetic */ mb6(v11 v11Var, ub2 ub2Var, byte b) {
        this.x = b;
        this.y = v11Var;
        this.z = ub2Var;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        y11 y11Var = y11.A;
        ub2 ub2Var = this.z;
        v11 v11Var = this.y;
        switch (b) {
            case 0:
                tl7.z(v11Var, null, y11Var, new qn2((byte) 1, null, ub2Var), 1);
                return pn6Var;
            default:
                tl7.z(v11Var, null, y11Var, new qn2((byte) 2, null, ub2Var), 1);
                return pn6Var;
        }
    }
}
