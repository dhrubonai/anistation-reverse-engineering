package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ob implements ic2 {
    public final /* synthetic */ byte x = 0;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ yz3 z;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ob(yz3 yz3Var, int i, int i2) {
        this.z = yz3Var;
        this.y = i2;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        yz3 yz3Var = this.z;
        boolean z = this.y;
        kd2 kd2Var = (kd2) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                rb.b(yz3Var, kd2Var, kb0.N(1), z ? 1 : 0);
                return pn6Var;
            default:
                t80.k(z, yz3Var, kd2Var, kb0.N(1));
                return pn6Var;
        }
    }

    public /* synthetic */ ob(boolean z, yz3 yz3Var, int i) {
        this.y = z;
        this.z = yz3Var;
    }
}
