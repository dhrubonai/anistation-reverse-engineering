package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class nk extends x93 implements ub2 {
    public final /* synthetic */ byte y;
    public final /* synthetic */ pk z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nk(pk pkVar, byte b) {
        super(1);
        this.y = b;
        this.z = pkVar;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.y;
        pn6 pn6Var = pn6.a;
        pk pkVar = this.z;
        switch (b) {
            case 0:
                em4 em4Var = pkVar.Q;
                em4Var.getClass();
                dm4.i((dm4) obj, em4Var, pkVar.O.b.a((em4Var.x << 32) | (4294967295L & em4Var.y), pkVar.S, ia3.x));
                return pn6Var;
            default:
                em4 em4Var2 = pkVar.P;
                em4Var2.getClass();
                dm4.i((dm4) obj, em4Var2, pkVar.O.b.a((em4Var2.x << 32) | (4294967295L & em4Var2.y), pkVar.R, ia3.x));
                return pn6Var;
        }
    }
}
