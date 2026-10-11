package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ly1 implements ri3 {
    public final /* synthetic */ jo4 A;
    public final /* synthetic */ byte x;
    public final /* synthetic */ int y;
    public final /* synthetic */ jo4 z;

    public /* synthetic */ ly1(int i, jo4 jo4Var, jo4 jo4Var2, byte b) {
        this.x = b;
        this.y = i;
        this.z = jo4Var;
        this.A = jo4Var2;
    }

    @Override // defpackage.ri3
    public final void invoke(Object obj) {
        byte b = this.x;
        jo4 jo4Var = this.A;
        jo4 jo4Var2 = this.z;
        int i = this.y;
        io4 io4Var = (io4) obj;
        switch (b) {
            case 0:
                io4Var.i(i);
                io4Var.j(jo4Var2, jo4Var, i);
                return;
            default:
                io4Var.i(i);
                io4Var.j(jo4Var2, jo4Var, i);
                return;
        }
    }
}
