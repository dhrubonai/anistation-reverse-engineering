package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class z52 implements x42 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ w05 y;

    public /* synthetic */ z52(w05 w05Var, byte b) {
        this.x = b;
        this.y = w05Var;
    }

    @Override // defpackage.x42
    public final Object emit(Object obj, vz0 vz0Var) {
        byte b = this.x;
        w05 w05Var = this.y;
        switch (b) {
            case 0:
                w05Var.x = obj;
                throw new f(this);
            case 1:
                w05Var.x = obj;
                throw new f(this);
            default:
                if (w05Var.x == tb4.a) {
                    w05Var.x = obj;
                    return pn6.a;
                }
                ze0.k("Flow has more than one element");
                return null;
        }
    }
}
