package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class dh implements ic2 {
    public final /* synthetic */ yz3 A;
    public final /* synthetic */ byte x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ ub2 z;

    public /* synthetic */ dh(boolean z, ub2 ub2Var, yz3 yz3Var, int i, byte b) {
        this.x = b;
        this.y = z;
        this.z = ub2Var;
        this.A = yz3Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        yz3 yz3Var = this.A;
        ub2 ub2Var = this.z;
        boolean z = this.y;
        kd2 kd2Var = (kd2) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                h98.a(z, ub2Var, yz3Var, kd2Var, kb0.N(1));
                return pn6Var;
            default:
                iv.b(z, ub2Var, yz3Var, kd2Var, kb0.N(1));
                return pn6Var;
        }
    }
}
