package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class wt0 implements ic2 {
    public final /* synthetic */ os0 A;
    public final /* synthetic */ byte x = 0;
    public final /* synthetic */ yt0 y;
    public final /* synthetic */ oa z;

    public /* synthetic */ wt0(oa oaVar, yt0 yt0Var, os0 os0Var) {
        this.z = oaVar;
        this.y = yt0Var;
        this.A = os0Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        os0 os0Var = this.A;
        oa oaVar = this.z;
        yt0 yt0Var = this.y;
        kd2 kd2Var = (kd2) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                int intValue = num.intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (kd2Var.V(intValue & 1, z)) {
                    kd2Var.e0(866651995);
                    bv0.a(oaVar, yt0Var.l, os0Var, kd2Var, 0);
                    kd2Var.q(false);
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
            default:
                num.getClass();
                yt0Var.a(oaVar, os0Var, kd2Var, kb0.N(1));
                return pn6Var;
        }
    }

    public /* synthetic */ wt0(yt0 yt0Var, oa oaVar, os0 os0Var, int i) {
        this.y = yt0Var;
        this.z = oaVar;
        this.A = os0Var;
    }
}
