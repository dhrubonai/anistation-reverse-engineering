package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class nq0 implements ic2 {
    public final /* synthetic */ os0 A;
    public final /* synthetic */ int B;
    public final /* synthetic */ byte x;
    public final /* synthetic */ cc6 y;
    public final /* synthetic */ boolean z;

    public /* synthetic */ nq0(cc6 cc6Var, boolean z, os0 os0Var, int i, byte b) {
        this.x = b;
        this.y = cc6Var;
        this.z = z;
        this.A = os0Var;
        this.B = i;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        int i = this.B;
        os0 os0Var = this.A;
        boolean z = this.z;
        cc6 cc6Var = this.y;
        kd2 kd2Var = (kd2) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                x97.d(cc6Var, z, os0Var, kd2Var, kb0.N(i | 1));
                return pn6Var;
            default:
                te4.g(cc6Var, z, os0Var, kd2Var, kb0.N(i | 1));
                return pn6Var;
        }
    }
}
