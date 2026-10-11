package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class fz3 implements ub2 {
    public final /* synthetic */ sb2 A;
    public final /* synthetic */ byte x;
    public final /* synthetic */ v11 y;
    public final /* synthetic */ do5 z;

    public /* synthetic */ fz3(v11 v11Var, do5 do5Var, sb2 sb2Var, byte b) {
        this.x = b;
        this.y = v11Var;
        this.z = do5Var;
        this.A = sb2Var;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        v11 v11Var = this.y;
        switch (b) {
            case 0:
                float floatValue = ((Float) obj).floatValue();
                do5 do5Var = this.z;
                tl7.z(v11Var, null, null, new m80(do5Var, floatValue, null, (byte) 1), 3).l0(new hz3(do5Var, this.A, (byte) 1));
                return pn6Var;
            default:
                sb2 sb2Var = (sb2) obj;
                sb2Var.getClass();
                tl7.z(v11Var, null, null, new e05(this.z, sb2Var, this.A, null, (byte) 15), 3);
                return pn6Var;
        }
    }
}
